
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import classes.*;

public class exemplo1 {
    public static void main(String[] args) {
        Group g;
        String[] groups;
        ArrayList<Question> questions_string;
        ArrayList<Group> groups_string;
        ArrayList<String> matchingoptions_string;
        MatchingOption matchingoption_object;
        ArrayList<String> multichoiceoptions_string;
        MultiChoiceOption multichoiceoption_object;
        ArrayList<String> shortquestion_answers;
        String [] question_names;
        String[] options;
        int contador =0;
        //adicionar aqui variáveis

        Quiz quiz = new Quiz("Teste de C"); 
        Group Tema1 = new Group("Tema1");
        quiz.addGroup(Tema1);
        Group Tema2 = new Group("Tema2");
        quiz.addGroup(Tema2);
        Group Tema3 = new Group("Tema3");
        quiz.addGroup(Tema3);
        Essay P1 = new Essay("P1","Defina Compilador");
        quiz.addQuestion(P1);
        questions_string = new ArrayList<Question>(Arrays.asList(P1));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema1));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        Numeric P2 = new Numeric("P2","Qual a raiz quadrada de 4",2.0);
        quiz.addQuestion(P2);
        questions_string = new ArrayList<Question>(Arrays.asList(P2));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema1));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("o1","Anfiteatro IV","o2","Anfiteatro V","o3","Anfiteatro I","o4","Anfiteatro III"));
        MultiChoice P3 = new MultiChoice("P3","Qual o número do anfiteatro onde tem a aula prática de C");
        for (int i = 0; i < 8; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            P3.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(P3);      
        P1.show(null);
        quiz.getAnswer("P1");
        P2.show(null);
        quiz.getAnswer("P2");
        P3.removeOption("o3");
        P3.shuffle();
        P3.show(null);
        quiz.getAnswer("P3");
        questions_string = new ArrayList<Question>(Arrays.asList(P3));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema2));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        questions_string = new ArrayList<Question>(Arrays.asList(P3));
        for (Question question : questions_string) {
            question.defineAnswer("o1");
        }
        shortquestion_answers = new ArrayList (Arrays.asList("antlr4"));
        ShortQ P4 = new ShortQ("P4","Qual a linguagem utilizada para criar gramaticas?",shortquestion_answers);
        quiz.addQuestion(P4);
        questions_string = new ArrayList<Question>(Arrays.asList(P4));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema2));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        P4.show(null);
        quiz.getAnswer("P4");
        matchingoptions_string = new ArrayList<String>(Arrays.asList("p1","2+2=","0","p3","p2","2-3=","0","p4","p3","4","1","p1","p4","-1","1","p2"));
        Matching P5 = new Matching("P5","Faça a correspondencia correta das expressoes ");
        for (int i = 0; i < 16; i += 4){
            matchingoption_object = new MatchingOption(matchingoptions_string.get(i),matchingoptions_string.get(i+1),Integer.parseInt(matchingoptions_string.get(i+2)),matchingoptions_string.get(i+3));
            P5.addOption(matchingoption_object);
        }
        quiz.addQuestion(P5);
        questions_string = new ArrayList<Question>(Arrays.asList(P5));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema2));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        P5.shuffle();
        P5.show(null);
        quiz.getAnswer("P5");
        matchingoptions_string = new ArrayList<String>(Arrays.asList("p1","Portugal","0","p4","p2","França","0","p3","p3","Paris","1","p2","p4","Lisboa","1","p1"));
        Matching P6 = new Matching("P6","Faça a correspondencia correta das expressoes ");
        for (int i = 0; i < 16; i += 4){
            matchingoption_object = new MatchingOption(matchingoptions_string.get(i),matchingoptions_string.get(i+1),Integer.parseInt(matchingoptions_string.get(i+2)),matchingoptions_string.get(i+3));
            P6.addOption(matchingoption_object);
        }
        quiz.addQuestion(P6);
        questions_string = new ArrayList<Question>(Arrays.asList(P6));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema2));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        P6.show(null);
        quiz.getAnswer("P6");
        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("aa1","Leão","aa2","Girafa","aa3","Elefante","aa4","Peixe","aa5","Gato"));
        MultiChoice P7 = new MultiChoice("P7","Qual destes animais vive na água");
        for (int i = 0; i < 10; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            P7.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(P7);      
        questions_string = new ArrayList<Question>(Arrays.asList(P7));
        groups_string = new ArrayList<Group>(Arrays.asList(Tema3));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        options = new String[] {"aa1","aa2","aa3","aa4"};
        P7.show(options);
        quiz.getAnswer("P7");
        questions_string = new ArrayList<Question>(Arrays.asList(P7));
        for (Question question : questions_string) {
            question.defineAnswer("aa4");
        }
        quiz.createReport();
        quiz.finishQuiz();


    }
}       