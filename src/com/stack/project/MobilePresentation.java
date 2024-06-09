package com.stack.project;

import java.util.Scanner;

public class MobilePresentation {

    private static int top;

    static {
        top = -1;
    }

    private MobileEntity[] mobile;

    public void setSize(Scanner sc) {

        System.out.println("Enter Size of your Stack :");
        mobile = new MobileEntity[sc.nextInt()];
    }

    public void printAllMobiles() {
        for (MobileEntity mobileEntity : mobile) {
            System.out.println(mobileEntity);
        }
    }

    public int printMenu(Scanner sc) {
        System.out.println("1: Mobile Entry.");
        System.out.println("2: Update Mobile Entry.");
        System.out.println("3: Delete Mobile Entry.");
        System.out.println("4: Display Mobile Entry.");
        System.out.println("5: Display All Mobile Entry.");
        System.out.println("0: Exit.");
        return sc.nextInt();
    }

    public void addMobileEntry(Scanner sc) {

        if (top < mobile.length-1) {
            top++;
            mobile[top] = new MobileEntity();
            System.out.println("Enter Serial Number of Mobile.");
            mobile[top].setSerialNumber(sc.nextInt());
            System.out.println("Enter Mobile Brand Name[Apple|Samsung|Xiomi]");
            System.out.println();
            mobile[top].setBrandName(sc.next());
            System.out.println("Enter Operating System of Mobiel[ios|android]");
            mobile[top].setOs(sc.next());
        } else {
            System.out.println("Stack is full.");
        }

    }

    public void deleteMobileEntry() {
        if (top >= 0) {
            mobile[top--] = null;
        } else {
            System.out.println(" Stack is Empty");
        }
    }

    public void updateMobileEntry(Scanner sc) {

        printAllMobiles();
        System.out.println("Enter Serial Number to Update Entry.");
        int serialNumber = sc.nextInt();

        for (int i = 0; i < mobile.length; i++) {
            if (mobile[i].getSerialNumber() == serialNumber) {
                System.out.println("Enter New Brand Name.");
                mobile[i].setBrandName(sc.next());
                System.out.println("Enter New Oparating System.");
                mobile[i].setOs(sc.next());
                break;
            } else {
                System.out.println("Record Not Found.");
            }
        }
    }

    public void printIndEntry(Scanner sc) {
        System.out.println("Enter Serial Number to Update Entry.");
        int serialNumber = sc.nextInt();
        for (int i = 0; i < mobile.length; i++) {
            if (mobile[i].getSerialNumber() == serialNumber) {
                System.out.println(mobile[i].toString());
                break;
            } else {
                System.out.println("Record Not Found.");
            }
        }

    }

}
