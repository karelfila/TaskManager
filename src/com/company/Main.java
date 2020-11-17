package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[10];
        System.out.println("  _______        _                                                    \n" +
                " |__   __|      | |                                                   \n" +
                "    | | __ _ ___| | __    _ __ ___   __ _ _ __   __ _  __ _  ___ _ __ \n" +
                "    | |/ _` / __| |/ /   | '_ ` _ \\ / _` | '_ \\ / _` |/ _` |/ _ | '__|\n" +
                "    | | (_| \\__ |   <    | | | | | | (_| | | | | (_| | (_| |  __| |   \n" +
                "    |_|\\__,_|___|_|\\_\\   |_| |_| |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_|   \n" +
                "                                                       __/ |          \n" +
                "                                                      |___/    ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("You can save up to 10 tasks!");
        System.out.println("You have 0/10");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("1) Manage Tasks");
        System.out.println("2) Exit");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Task managment");
        System.out.println("--------------------------------------------------------------------");

        int option = Integer.parseInt(sc.nextLine());
        if(option == 2) {
            return;
        }
        while(option == 1) {
            System.out.println("1) Create a new task");
            System.out.println("2) Update a task");
            System.out.println("3) Delete a task");
            System.out.println("4) Back to main menu");

            int option2 = Integer.parseInt(sc.nextLine());

            if (option2 == 1) {
                System.out.println("Enter the name of the task:");
                String task = sc.nextLine();
                System.out.println("--------------------------------------------------------------------");
                System.out.println("You can ad up to 10 tasks");
                System.out.println("You have  " + tasks + "/10");
            }
            if (option2 == 2) {
                System.out.println(tasks);
                System.out.println("What task do you want to update?");
                int update = sc.nextInt();
                }

            if (option2 == 3) {
                System.out.println("What task do you want to delete?");
                int delete = sc.nextInt();
            }
            if (option2 == 4);

            System.out.println("  _______        _                                                    \n" +
                    " |__   __|      | |                                                   \n" +
                    "    | | __ _ ___| | __    _ __ ___   __ _ _ __   __ _  __ _  ___ _ __ \n" +
                    "    | |/ _` / __| |/ /   | '_ ` _ \\ / _` | '_ \\ / _` |/ _` |/ _ | '__|\n" +
                    "    | | (_| \\__ |   <    | | | | | | (_| | | | | (_| | (_| |  __| |   \n" +
                    "    |_|\\__,_|___|_|\\_\\   |_| |_| |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_|   \n" +
                    "                                                       __/ |          \n" +
                    "                                                      |___/    ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("You can save up to 10 tasks!");
            System.out.println("You have 0/10");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1) Manage Tasks");
            System.out.println("2) Exit");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Task managment");
            System.out.println("--------------------------------------------------------------------");


        }
    }
}
