package codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter the number of subjects");
        int n =sc.nextInt();
        float totalMarks=0;
        for (int i = 1; i <=n ; i++) {
            System.out.println("Enter marks in subject "+i);
            float marks= sc.nextInt();
            totalMarks+=marks;
        }
        System.out.println("Total Marks Scored = "+totalMarks+" out off "+(n*100));
        float avgP=totalMarks/n;
        System.out.println("Average Percentage = "+avgP);
        if (avgP==100){
            System.out.println("Grade = A++");
        }else if (avgP>94){
            System.out.println("Grade = A1");
        }else if (avgP>89) {
            System.out.println("Grade = A2");
        }else if (avgP>84) {
            System.out.println("Grade = B1");
        }else if (avgP>79) {
            System.out.println("Grade = B2");
        }else if (avgP>74) {
            System.out.println("Grade = C1");
        }else if (avgP>69) {
            System.out.println("Grade = C2");
        }else if (avgP>64) {
            System.out.println("Grade = D1");
        }else if (avgP>59) {
            System.out.println("Grade = D2");
        }else if (avgP>54) {
            System.out.println("Grade = E1");
        }else if (avgP>49) {
            System.out.println("Grade = E2");
        }else if (avgP>33) {
            System.out.println("Grade = F");
        }else if (avgP<=33) {
            System.out.println("FAILED");
        }
    }
}
