package advjava.quizapp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selected[] = new String[5];

    /*
     * public void displayQuestion() {
     * // System.out.println(questions[0].getQuestion()); Nullpointer Exc in case of
     * // non-initializn of questins[0]
     * 
     * //Creating Questions.
     * questions[0] = new Question(1, "Size of int", "1 byte", "2 byte", "3 byte",
     * "4 byte", "4 byte");
     * questions[1] = new Question(2,
     * "Which keyword is used to inherit a class in Java?", "implements", "extends",
     * "inherits", "super", "extends");
     * questions[2] = new Question(3,
     * "Which method is the entry point of a Java program?", "start()", "run()",
     * "main()", "init()", "main()");
     * questions[3] = new Question(4,
     * "Which of these is not a primitive data type in Java?", "int", "char",
     * "String",
     * "boolean", "String");
     * questions[4] = new Question(5,
     * "Which operator is used for comparison in Java?", "=", "==", ":=", "=>",
     * "==");
     * 
     * //System.out.println(questions[0].getQuestion());
     * 
     * for(Question q : questions)
     * {
     * System.out.println(q);
     * }
     * }
     */

    public void playQuiz() {
        
        questions[0] = new Question(1, "Size of int", "1 byte", "2 byte", "3 byte", "4 byte", "4 byte");
        questions[1] = new Question(2, "Size of char", "1 byte", "2 byte", "4 byte", "8 byte", "2 byte");

        questions[2] = new Question(3, "Which symbol is used to end a statement in Java?", ".", ";", ":", ",", ";");

        questions[3] = new Question(4, "Which data type is used to store true or false?", "int", "char", "boolean",
                "float", "boolean");

        questions[4] = new Question(5, "Which keyword is used to create an object?", "new", "class", "this", "static",
                "new");

        int i=0;

        for (Question q : questions) {
            System.out.println("Question no." + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner scn = new Scanner(System.in);
            selected[i++] = scn.nextLine();
            scn.close();
        }

        System.out.println("The selected options are..");
        for(int j=0;j<selected.length;j++)
        {
            System.out.println(selected[j]);
        }

    }

    public void printScore()
    {
        //Calculating the score
        int score=0;
        for(int k=0;k<5;k++)
        {
            if(selected[k].equals(questions[k].getAnswer()))
            {
                score++;
            }
        }

        System.out.println("The score is: "+score);
    }
}
