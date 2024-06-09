package com.stack.project;

import java.util.Scanner;

public class Mobile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobilePresentation presentation = new MobilePresentation();
        presentation.setSize(sc);
        presentation.printAllMobiles();

        int choice = 0;

        do {
            choice = presentation.printMenu(sc);
            switch (choice) {
                case 1:
                    presentation.addMobileEntry(sc);
                    break;
                case 2:
                    presentation.updateMobileEntry(sc);
                    break;
                case 3:
                    presentation.deleteMobileEntry();
                    break;
                case 4:
                    presentation.printIndEntry(sc);
                    break;
                case 5:
                    presentation.printAllMobiles();
                    break;
                case 0:
                    System.out.println("Terminated Succesfully.");
                    break;
            
                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        } while (choice != 0);
    }

}
