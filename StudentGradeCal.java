package com.java;
import java.util.Scanner;

public class StudentGradeCal{
    public static float percent(float total){
        return (total/500) * 100;
    }
    public static float total(float maths, float eng, float phy, float chem, float cs){
        return maths + eng + phy + chem + cs;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS FOR EACH SUBJECT");

        System.out.println("Maths: ");
        float maths = sc.nextFloat();

        System.out.println("English: ");
        float eng = sc.nextFloat();

        System.out.println("Physics: ");
        float phy = sc.nextFloat();

        System.out.println("Chemistry: ");
        float chem = sc.nextFloat();

        System.out.println("Computer Science: ");
        float cs = sc.nextFloat();

        float total = total(maths, eng, phy, chem, cs);
        float percent = percent(total);

        String grade;
        if(percent<100 && percent>90){
            grade = "A+";
        }
        else if(percent<90 && percent>80){
            grade = "A";
        }
        else if(percent<80 && percent>70){
            grade = "B+";
        }
        else if(percent<70 && percent>60){
            grade = "B";
        }
        else if(percent<60 && percent>40){
            grade = "C";
        }
        else
            grade = "D";

        System.out.println("Result:-");
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percent + "%");
        System.out.println("Grade: " + grade);
    }
}