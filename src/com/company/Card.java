package com.company;

public class Card {
    private String number;
    private int deposit;

    public Card()
    {
        this.number = "XXXX XXXX XXXX XXXX";
        this.deposit = 0;
    }

    public Card(String number)
    {
        this.number = number;
        this.deposit = 0;
    }

    public Card(String number, int deposit)
    {
        this.number = number;
        this.deposit = deposit;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setDeposit(int deposit)
    {
        this.deposit = deposit;
    }

    public int getDeposit()
    {
        return deposit;
    }

    public void topUp(int sum)
    {
        this.deposit += sum;
    }

    public void spend(int sum)
    {
        this.deposit -= sum;
    }

    public boolean verify(int sum)
    {
        if(deposit < sum)
            return false;
        else
            return true;
    }
}
