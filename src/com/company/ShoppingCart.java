package com.company;

public class ShoppingCart {

    private final int maxArticleCount = 6;
    private int articleCount;
    private String[] article = new String[maxArticleCount];
    private int[] price = new int[maxArticleCount];
    private int totalSum;

    public ShoppingCart()
    {
        this.articleCount = 0;
        this.totalSum = 0;
    }

    public int getTotalSum()
    {
        return totalSum;
    }

    public void showList() {
        if (articleCount == 0)
            System.out.println("The shopping cart is empty ;-;");
        else {
            for (int i = 0; i < articleCount; i++)
            {
                System.out.println(article[i]+ " " + price[i]);
            }
            System.out.println("Total price: " + totalSum);
        }
    }

    public void addItem(String itemName, int price)
    {
        if(articleCount == maxArticleCount)
        {
            System.out.println("The cart is already full (* ^ ω ^)");
        }
        else {
            this.article[articleCount] = itemName;
            this.price[articleCount] = price;
            totalSum += price;
            ++articleCount;
        }
    }

    public void deleteItem(String itemName)
    {
        if(articleCount == 0)
        {
            System.out.println("The cart is already empty enough >.<");
        }
        else
        {
            boolean ok = false;
            for(int i = 0; i < articleCount && ok == false; i++)
            {
                if(article[i].equals(itemName))
                {
                    totalSum -= price[i];
                    for(int j = i; j < articleCount - 1; j++)
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
        totalSum = 0;
        articleCount = 0;
    }
}
