package com.company;

public class ShoppingCart {

    private static final int MAX_ARTICLES_COUNT = 6;
    private int articlesCount;
    private String[] articles = new String[MAX_ARTICLES_COUNT];
    private int[] prices = new int[MAX_ARTICLES_COUNT];
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
                System.out.println(articles[i]+ " " + prices[i]);
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
            this.articles[articlesCount] = itemName;
            this.prices[articlesCount] = price;
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
                if(articles[i].equals(itemName))
                {
                    totalSum -= prices[i];
                    for(int j = i; j < articlesCount - 1; j++)
                    {
                        articles[j] = articles[j + 1];
                        prices[j] = prices[j + 1];
                    }
                    System.out.println("Item pulverized ;)");
                    prices[--articlesCount] = 0;
                    articles[articlesCount] = null;
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
            prices[i] = 0;
            articles[i] = null;
        }
        totalSum = 0;
        articlesCount = 0;
    }
}
