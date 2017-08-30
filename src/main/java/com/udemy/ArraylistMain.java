package com.udemy;
import com.udemy.MobilePhone;
import java.util.Arrays;
import java.util.Scanner;


public class ArraylistMain {

    private static void startPhone()
    {
        System.out.println("Starting Phone ");
    }


    private static void printActions()
    {
        System.out.println("Available actions  ");
        System.out.println( "0 - to shutdown \n"+
                            "1 - to print All the  Contacts \n"+
                            "2 -  to add new contact \n"+
                            "3 - to update existing contact \n"+
                            "4 - to remove a contact \n"+
                            "5 - to print  the main menu ");
        System.out.println("Choose your action");

    }



    public static void main(String[] args) {

        startPhone();
        printActions();

        MobilePhone mbp =new MobilePhone();

        boolean quit=false;




        while (!quit)

        {   printActions();
            Scanner keyboard = new Scanner(System.in);

            int input=keyboard.nextInt();


        switch (input) {
            case 0:
                quit = true;
                System.out.println("Shutting down phone");
                break;
            case 1:
                mbp.printAllContacts();
                break;
            case 2:
                System.out.println("Please enter a name ");
                String name = keyboard.next();
                System.out.println("Please enter a phone ");
                String phone_number = keyboard.next();
                Contacts ct_new = new Contacts(name, phone_number);
                mbp.addContact(ct_new);
                break;

            case 3:

                System.out.println("Please enter a name ");
                String old_name = keyboard.next();
                Contacts ct_old = mbp.queryContact(old_name);
                System.out.println("Please enter a name ");
                String new_name = keyboard.next();
                System.out.println("Please enter a phone ");
                String new_phonenumber = keyboard.next();
                ct_new = new Contacts(new_name, new_phonenumber);

                mbp.updateContact(ct_old, ct_new);
                break;


            case 4:
                System.out.println("Please enter a name ");
                old_name = keyboard.next();
                Contacts ct_remove = mbp.queryContact(old_name);
                mbp.removeContact(ct_remove);
                break;


            case 5:

                System.out.println("Please enter a name ");
                old_name = keyboard.next();
                Contacts ct_print = mbp.queryContact(old_name);
                break;


        }





        }




    }
}
