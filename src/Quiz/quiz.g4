grammar quiz;

@header {
    package Quiz;
}

program :
    stat* EOF       
    ;

stat:
    expr* NEWLINE    
    ;

expr:
    quiz                |
    add                 |
    multichoice         |
    matching            |
    evaluation          |
    remove              |
    defineAnswer        |
    showGroup           |
    import_expr         |
    showOpt             |
    load                |
    shortQuestion       | 
    numeric             |
    essay               |
    createReport        |  
    option              |
    finishQuiz          |
    variable            
    ;

quiz:
    'create quiz' 'title' '=' STRING ('pass' '=' STRING)?                                #CreateQuiz             |
    'create quiz' 'title' '=' STRING 'auto-corrective' NUMBER ('pass' '=' STRING)?       #CreateQuizCorrection   
    ;

createReport:
    'create' 'report'
    ;

add: 
    'add group' NAME  NEWLINE                                       #CreateGroup |
    'add group' NAME(','NAME)*  NEWLINE                             #CreateMultiGroup |
    'add' NAME 'to' sub_question  NEWLINE                           #AddOption |
    'add' NAME 'to' 'all'        NEWLINE                            #AddAll|
    'add' sub_question 'to' 'group' sub_groups  NEWLINE             #AddQuestion2Group
    ;

sub_question:
        NAME(','NAME)*
    ;

sub_groups:
        NAME(','NAME)*
    ;

load :
    'load' STRING 'as' NAME                                         #LoadBanco
    ;

remove:
    'remove' NAME 'from' NAME                                       #Eliminar
    ;

defineAnswer:
    'define-answer' NAME 'to' sub_question                          #DefinirResposta
    ;

defineMark:
    'define-mark' mark 'to' NAME NEWLINE                                                                        #DefinirCotacaoSemDesconto   |
    'define-mark' mark 'to' NAME 'if' 'wrong' 'show' NAME  NEWLINE                                              #DefinirCotacaoMudaPergunta  |
    'define-mark' mark 'to' NAME  'if' 'wrong' 'repeat' NUMBER 'times' 'discount' '='  mark      NEWLINE        #DefinirCotacaoDescontar
    ;
mark:
    FLOAT | NUMBER
    ;
showGroup:
        'show' 'group' NAME '{'(NEWLINE)? showOpt* (NEWLINE)?'}' 
        ;

showOpt:
    show                |
    shuffle             |
    getAnswer           |
    getChoice           |
    getAnswerToChoice   
    ;

evaluation:
    'evaluation' 'group' NAME '{' NEWLINE   defineMark*  '}'                 #Avaliar 
    ;

multichoice:
    'multi-choice' 'id' '=' NAME 'text' '=' (title | NAME) '{' NEWLINE
        multichoiceoption+               
    '}'                                 
    ; 
multichoiceoption: 
       'option' 'id' '='NAME 'text' '=' STRING NEWLINE
    ;


matching:
    'matching' 'id' '=' NAME 'text' '=' (title | NAME) '{' NEWLINE 
        matchingoption+                  
    '}'                                 
    ; 

matchingoption:
    'option' 'id' '='  NAME 'text' '=' title 'side' '=' CORRECT ('match' '=' match)? NEWLINE                       
    ;

match:
    NAME;

import_expr: 
    'from' NAME 'import' plist; 

plist:
    p (',' p)*;
    
p:
    NAME
    | NAME 'as' NAME;


show:
    'show' NAME      NEWLINE                                  #ShowQuestionBasic
    |'show' NAME ques_opt    NEWLINE                          #ShowQuestionMultiOpt
    |'show' question ('and' question)*  NEWLINE               #ShowQuestionMultiOptandQuestion
    ;

question:
    NAME ques_opt?
    ;

ques_opt:
    ('with' NAME(',' NAME)*)
    ;

shuffle: 
    'shuffle' NAME  NEWLINE            #ShuffleQuestion
    ;

getAnswer:
    'get' 'answer' 'to' NAME NEWLINE           #GetAnswerNum
    ;

getChoice:
    'get' 'choice' question 'and' question NEWLINE
    ;

getAnswerToChoice:
    'get' 'answer' 'to' 'choice'    NEWLINE           
    ;

shortQuestion:
    'short-question' 'id' '=' NAME 'text' '=' (title | NAME) ('answer' '=' STRING (',' 'answer' '=' STRING)*)? NEWLINE         #respostaCurta
    ;   

numeric:
    'numeric-question' 'id' '=' NAME 'text' '=' (title | NAME) ('answer' '=' mark)?     #NumericQuestion 
    ;   

essay:
    'essay-question' 'id' '='  NAME 'text' '=' (title | NAME)         #EssayQuestion
    ;

option:
    optionMult
    ;

optionMult:
    'option-multi' 'id' '=' NAME 'text' '=' STRING  NEWLINE
    ;

finishQuiz:
    'finish quiz'
    ;

variable:
    NAME '=' mark                               #numberVariable
    | NAME '=' STRING                           #textVariable
    ;

title: 
    STRING
    ;

CORRECT: '"0"' | '"1"';

NUMBER:
    [0-9]+ ;

FLOAT:
    [0-9]+('.'[0-9]+)?;

NAME:
    [A-Za-z0-9_-]+; 

STRING:
    '"' .*? '"';
COMMENT: '#' .*? '#' -> skip;
NEWLINE: '\r'? '\n';
MULTICOMM: '##' .*? '##' '\n'* -> skip;
WS: [ \t]+ -> skip;