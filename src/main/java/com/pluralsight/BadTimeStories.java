package com.pluralsight;
import java.io.*;

import java.util.Scanner;

public class BadTimeStories {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----BadTimeStories-----");
        System.out.print("""
                Please choose the story :\
                
                1. Goldilocks\
                
                2. Hansel and gretel \
                
                3. Mary had a little lamb\
                
                4. Finish the program ( enter 0 )\
                
                 Enter the number(1-3) :\s""");
        int storyNumber = scanner.nextInt();
        scanner.nextLine();

        String goldiLocks = "src/main/resources/goldilocks.txt";
        String hansel = "src/main/resources/hansel_and_gretel.txt";
        String mary = "src/main/resources/mary_had_a_little_lamb.txt";

        boolean run = true;



        while (run) {
            if (storyNumber == 1) {
                FileReader fileReader = new FileReader(goldiLocks);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String input;
                System.out.println("----Goldilocks----");
                while ((input = bufferedReader.readLine()) != null) {
                    System.out.println(input);
                }
            }else if (storyNumber == 2) {
                FileReader fileReader = new FileReader(hansel);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String input;
                System.out.println("----Hansel and Gretel----");
                while ((input = bufferedReader.readLine()) != null) {
                    System.out.println(input);
                }
            }else if (storyNumber == 3) {
                FileReader fileReader = new FileReader(mary);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String input;
                System.out.println("----Mary had a little lamb----");
                while ((input = bufferedReader.readLine()) != null) {
                    System.out.println(input);
                }
            }else if (storyNumber == 0) {
                run = false;
            }


        }

    }
}
