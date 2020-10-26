package com.company;

public class Client {

    //comment
    private String firstName;
    private String lastName;
    private ShoppingCart cart;
    private Card card;

    public  Client()
    {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.cart = new ShoppingCart();
        this.card = new Card();
    }

    public Client(String firstName, String lastName, Card card)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
        this.cart = new ShoppingCart();
    }

    public Client(String firstName, String lastName, ShoppingCart cart, Card card)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
        this.cart = cart;
    }

    public boolean Checkout()
    {
        if(card.verify(cart.getTotalSum()))
        {
            System.out.println("Transaction complete!");
            card.spend(cart.getTotalSum());
            cart.emptyCart();
            return false;
        }
        else
        {
            System.out.println("Insufficient funds!");
            return true;
        }
    }

    public void addItem(String itemName, int price)
    {
        cart.addItem(itemName, price);
    }

    public void deleteItem(String itemName)
    {
        cart.deleteItem(itemName);
    }

    public int getDeposit()
    {
        return card.getDeposit();
    }

    public void topUp(int sum)
    {
        card.topUp(sum);
    }

    public void list()
    {
        cart.showList();
    }
}
