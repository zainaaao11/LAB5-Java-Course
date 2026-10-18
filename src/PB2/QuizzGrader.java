package PB2;

import java.util.Scanner;

public class QuizzGrader {
    public static void main(String[] args){
        /*
        Scanner scan=new Scanner(System.in);
        System.out.print("How many questions are in the quiz? : ");
        int qstsNum=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the key for each of the "+qstsNum+ " questions, and split them by a whitespace: ");
        String[] keys=scan.nextLine().split(" ");
        System.out.printf("Enter the %d answers for the quiz to be graded one by one: ", qstsNum);
        System.out.println();
        int correctAnswers=0;
        for (String k : keys){
            String answer=scan.next();
            if (k.equals(answer)) correctAnswers++;
        }
        double percent= (double) (correctAnswers*100)/10;
        System.out.printf("The correct number of answers is %d \nThe percent of correct answers is %.2f", correctAnswers, percent);
         */
        String userChoice;
        do {
            Scanner scan=new Scanner(System.in);
            System.out.print("How many questions are in the quiz? : ");
            int qstsNum=scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the key for each of the "+qstsNum+ " questions, and split them by a whitespace: ");
            String[] keys=scan.nextLine().split(" ");
            System.out.printf("Enter the %d answers for the quiz to be graded one by one: ", qstsNum);
            System.out.println();
            int correctAnswers=0;
            for (String k : keys){
                String answer=scan.next();
                if (k.equals(answer)) correctAnswers++;
            }
            double percent= (double) (correctAnswers*100)/qstsNum;
            System.out.printf("The correct number of answers is %d \nThe percent of correct answers is %.2f \n", correctAnswers, percent);
            System.out.println("Grade another quiz? (y/n)");
            userChoice=scan.next();
        }
        while (userChoice.equalsIgnoreCase("y"));
    }
}
