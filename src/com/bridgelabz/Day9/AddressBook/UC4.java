package com.bridgelabz.Day9.AddressBook;

import java.util.Scanner;

public class UC4 {

    public static String[][] addressbook;

    UC4(){
        addressbook = new String[10][8];
        addressbook[0][0]="First Name";
        addressbook[0][1]="Last Name";
        addressbook[0][2]="Address";
        addressbook[0][3]="City";
        addressbook[0][4]="State";
        addressbook[0][5]="Zip";
        addressbook[0][6]="Phone Number";
        addressbook[0][7]="Email";
    }

    public static void addContact(int num, Scanner scr){

        System.out.println("Enter First Name");
        addressbook[num][0] = scr.next();
        System.out.println("Enter Last Name");
        addressbook[num][1] = scr.next();
        System.out.println("Enter Address");
        addressbook[num][2] = scr.next();
        System.out.println("Enter City");
        addressbook[num][3] = scr.next();
        System.out.println("Enter State");
        addressbook[num][4] = scr.next();
        System.out.println("Enter Zip");
        addressbook[num][5] = scr.next();
        System.out.println("Enter phone Number");
        addressbook[num][6] = scr.next();
        System.out.println("Enter Email");
        addressbook[num][7] = scr.next();
    }

    public static void deleteContact(int pos){
        for (int i = 0;i<8;i++) {

            addressbook[pos][i] =null;
        }
    }

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        addContact(1,scr);
        System.out.println("Please enter name to delete");
        for (int i = 1;i<10;i++){
            if(addressbook[i][0].equalsIgnoreCase(scr.next())){
                deleteContact(i);
            }
        }



    }
}
