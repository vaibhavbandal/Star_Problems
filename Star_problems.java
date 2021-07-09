package com.data_structure;

import java.util.Scanner;

public class Star_problems {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        firstPattern();
        secondPattern();
        thirdPattern();
        fourthPattern();
        fifthPattern();
        sixthPattern();
    }

    public static void sixthPattern(){
        System.out.println("Enter number of columns:");
        int star= sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = 0,k=star-i-1; j < star; j++,k--) {
                if(k>0){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
    }

    public static void fifthPattern(){
        System.out.println("Enter number of columns:");
        int star=sc.nextInt();
        for(int i=0;i<star;i++){
            for(int j=0,k=0;j<star;j++,k++){
                if(k<i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void fourthPattern(){
        System.out.println("Enter number of columns:");
        int star=sc.nextInt();
        int k=star-1;

        for(int i=0;i<star;i++){
            for(int j=0;j<((star*2)-1);j++){
                if(k>j){
                    System.out.print(" ");
                }else{
                    for(int m=0;m<=i;m++)
                        System.out.print("* ");break;
                }
            } k--;
            System.out.println();
        }
    }

    public static void thirdPattern(){
        System.out.println("Enter number of columns:");
        int col=sc.nextInt();
        for(int i=col;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void secondPattern(){
        System.out.println("Enter number of rows:");
        int row=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void firstPattern(){
        System.out.println("Enter number of rows:");
        int row= sc.nextInt();

        System.out.println("Enter number of columns:");
        int col= sc.nextInt();


        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
