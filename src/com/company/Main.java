package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Client client;

        System.out.println("Hello Costumer!");
        System.out.println("Please introduce your: ");
        //System.out.print("First name: ");
        String firstName = "Andrei";
        //String firstName = s.nextLine();
        //System.out.print("Last name: ");
        String lastName = "Moldovan";
        //String lastName = s.nextLine();
        //System.out.print("Card Number: ");
        String number = "2233 5594 1111 6674";
        //String number = s.nextLine();

        client = new Client(firstName, lastName, new Card(number));

        System.out.println("You can choose to:");
        System.out.println("1. To see the amount of cash do you have $-$");
        System.out.println("2. To add more money to your card *-*");
        System.out.println("3. Show current shopping list!");
        System.out.println("4. Add an item to your shopping cart");
        System.out.println("5. To delete an item from your list");
        System.out.println("6. Checkout :)");

        while(true)
        {
            System.out.println("Please enter the number of your action: ");
            int x = s.nextInt();
            if(x == 1)
            {
                System.out.println("You have $" + client.getDeposit() + " left!");
            }
            else if(x == 2)
            {
                System.out.print("How much money do you want to add? ");
                int sum = s.nextInt();
                client.topUp(sum);
                System.out.println("Now you have $" + client.getDeposit() + " left in your account");
            }
            else if(x == 3)
            {
                client.list();
            }
            else if(x == 4)
            {
                System.out.print("Introduce the item name: ");
                String itemName = s.next();
                System.out.print("Introduce the item price: ");
                int price = s.nextInt();
                client.addItem(itemName, price);
            }
            else if(x == 5)
            {
                System.out.println("What item do you wish to delete?");
                String itemName = s.next();
                client.deleteItem(itemName);
            }
            else if(x == 6)
            {
                if(client.Checkout())
                {
                    System.out.println("Transaction incomplete, please add more funds!");
                }
                else
                    break;
            }
            else
            {
                System.out.println("Impossible action :( \nType again, please");
            }
        }
    }
}
