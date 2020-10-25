package com.company;

public class ShoppingCart {

    private static final int MAX_ARTICLES_COUNT = 6;
    private int articlesCount;
    private String[] article = new String[MAX_ARTICLES_COUNT];
    private int[] price = new int[MAX_ARTICLES_COUNT];
    private int totalSum;

    public ShoppingCart()
    {
        this.articlesCount = 0;
        this.totalSum = 0;
    }

    public int getTotalSum()
    {
        return totalSum;
    }

    public void showList() {
        if (articlesCount == 0)
            System.out.println("The shopping cart is empty ;-;");
        else {
            for (int i = 0; i < articlesCount; i++)
            {
                System.out.println(article[i]+ " " + price[i]);
            }
            System.out.println("Total price: " + totalSum);
        }
    }

    public void addItem(String itemName, int price)
    {
        if(articlesCount == MAX_ARTICLES_COUNT)
        {
            System.out.println("The cart is already full (* ^ ω ^)");
        }
        else {
            this.article[articlesCount] = itemName;
            this.price[articlesCount] = price;
            totalSum += price;
            ++articlesCount;
        }
    }

    public void deleteItem(String itemName)
    {
        if(articlesCount == 0)
        {
            System.out.println("The cart is already empty enough >.<");
        }
        else
        {
            boolean ok = false;
            for(int i = 0; i < articlesCount && ok == false; i++)
            {
                if(article[i].equals(itemName))
                {
                    totalSum -= price[i];
                    for(int j = i; j < articlesCount - 1; j++)
                    {
                        article[j] = article[j + 1];
                        price[j] = price[j + 1];
                    }
                    System.out.println("Item pulverized ;)");
                    ok = true;
                }
            }
            if(ok == false)
            {
                System.out.println("Item not found!");
            }
        }
    }

    public void emptyCart()
    {
        for(int i = articlesCount - 1; i >= 0; i--)
        {
            price[i] = 0;
            article[i] = "None";
        }
        totalSum = 0;
        articlesCount = 0;
    }
}
