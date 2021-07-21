
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import classes.*;

public class output {
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

        Quiz quiz = new Quiz("Exame final de programação"); 
        quiz.defineMark(20);
        quiz.setAutoCorrective(true);
        String password = "porto";
        String titulo = "true/false são classificados como _ em java";

        multichoiceoptions_string = new ArrayList<>(Arrays.asList("b1","Integer","b2","Double","b3","Boolean","b4","String"));
        MultiChoice Pa1 = new MultiChoice("Pa1",titulo);
        for (int i = 0; i < 8; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            Pa1.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(Pa1);      
        quiz.createReport();
        quiz.finishQuiz();

    }
} 