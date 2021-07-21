package Quiz;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import org.stringtemplate.v4.*;

public class quizMain {
   public static void main(String[] args) {
      String outFileName = "output";
      String exampleFile = "";

      if (args.length < 1 && args.length > 2) {
         System.err.println("Erro! Número de argumentos inválido.");
         System.out.println("java Quiz.quizMain <caminho para o ficheiro com o código a compilar> <nome do ficheiro de output (opcional)>");
         System.exit(1);
      }
      else if (args.length == 1) {
         exampleFile = args[0];
      }
      else if (args.length == 2) {
         exampleFile = args[0];
         outFileName = args[1];
      }

      

      try {
         System.out.println("Entrei");
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(exampleFile);
         // create a lexer that feeds off of input CharStream:
         quizLexer lexer = new quizLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         quizParser parser = new quizParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            System.out.println("Vai começar a semantica");
            QuizSemantic visitor0 = new QuizSemantic();
            Boolean ret = visitor0.visit(tree);
            //System.out.println(ret);
            if (!ret){
               System.err.println("ERRO NÃO PASSA NA SEMANTICA");
               System.exit(1);
            }
            System.out.println("Passou, vou compilar");
            Compiler visitor2 = new Compiler();
            
            
         
            System.out.println("Acabei de  compilar");
            String outputLang = "java";
            if (!visitor2.validTarget(outputLang)) {
               System.out.println("errroooo");
               System.exit(1);
            }
            visitor2.setTarget(outputLang);
            ST code = visitor2.visit(tree);

            
           

            String outputFileExtension =  "." + outputLang;

            String outputFile = outFileName + outputFileExtension;
            
            
            try {
               code.add("name", outFileName);
               PrintWriter pw = new PrintWriter(new File(outputFile));
               pw.print(code.render());
               pw.close();

            } catch (FileNotFoundException e) {
               System.err.println("Could not write code to the file");
               System.exit(1);
            }
         
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}