package com.prash;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> resortsInMaldives = new LinkedList<String>();


        addResortInOrder(resortsInMaldives, "Olhuveli");
        addResortInOrder(resortsInMaldives, "Kuramathi");
        addResortInOrder(resortsInMaldives, "SunAqua");
        addResortInOrder(resortsInMaldives, "DusitThani");
        addResortInOrder(resortsInMaldives, "Velassura");
        addResortInOrder(resortsInMaldives, "Lux");
        addResortInOrder(resortsInMaldives, "Angsana");
        addResortInOrder(resortsInMaldives, "Cinnamon");
        addResortInOrder(resortsInMaldives, "Cocoon");
        addResortInOrder(resortsInMaldives, "Baros");
        addResortInOrder(resortsInMaldives, "Centara");
        printList(resortsInMaldives);
        //addResortInOrder(resortsInMaldives, "Centara");
        visit(resortsInMaldives);
    }

    public static void printList(LinkedList linkedList) {
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println("I am in " + itr.next() + " resort now.");
        }
        System.out.println("---------------------------------------");
    }

    private static boolean addResortInOrder(LinkedList<String> linkedList, String city) {
        ListIterator<String> listItr = linkedList.listIterator();
        while (listItr.hasNext()) {
            int comparison = listItr.next().compareTo(city);

            if (comparison == 0) {
                System.out.println(city +" already included as a destination resort");
                return false;
            } else if (comparison > 0) {
                listItr.previous();
                listItr.add(city);
                return true;
            } else if (comparison < 0){
                //Do nothing
            }
        }
        listItr.add(city);
        return true;
    }




    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = false;
        ListIterator<String> itr = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No Cities in the Itenerary");
        } else {
            System.out.println("Now Visiting "+ itr.next());
            printMenu();
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (itr.hasNext()) {
                            itr.next();
                        }
                    } goingForward = true;
                    if (itr.hasNext()) {
                        System.out.println("Now Visiting " + itr.next());
                    } else {
                        System.out.println("No more City to visit");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (itr.hasPrevious()) {
                            itr.previous();
                        }
                    }
                    goingForward = false;
                    if (itr.hasPrevious()) {
                        System.out.println("Now Visiting " + itr.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Below are the available options\n" +
                "0 - to Quit\n" +
                "1 - Go to Next City\n" +
                "2 - Go to previous City\n" +
                "3 - To see the Menu options ");
    }
}
