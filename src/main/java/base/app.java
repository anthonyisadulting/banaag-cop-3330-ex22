package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the first number:");
    String input0 = in.nextLine();
    int i0 = Integer.parseInt(input0);

    System.out.println("Enter the second number:");
        String input1 = in.nextLine();
        int i1 = Integer.parseInt(input1);

        System.out.println("Enter the third number:");
        String input2 = in.nextLine();
        int i2 = Integer.parseInt(input2);



        if( i0 >= i1 && i0 >= i2)
            System.out.println("The largest number is " + i0);

        else if (i1 >= i0 && i1 >= i2)
            System.out.println("The largest number is " + i1);

        else
            System.out.println("The largest number is " + i2);




}}
