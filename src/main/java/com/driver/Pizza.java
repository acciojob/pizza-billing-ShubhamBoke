package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extra_cheese;
    private Boolean extra_toppings;
    private Boolean take_away;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extra_cheese = false;
        this.extra_toppings = false;
        this.take_away = false;
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.extra_cheese){
            this.price += 80;
            this.extra_cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extra_toppings){
            if(this.isVeg)
                this.price += 70;
            else
                this.price += 120;
            this.extra_toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.take_away)
            this.price += 20;
        this.take_away = true;
    }

    public String getBill(){
        // your code goes here
        //       "Base Price Of The Pizza: 300\n" +
        //       "Extra Cheese Added: 80\n" +
        //        "Extra Toppings Added: 70\n" +
        //        "Paperbag Added: 20\n" +
        //        "Total Price: 470";

        StringBuilder sb = new StringBuilder();

        if(this.isVeg) {
            sb.append("Base Price Of The Pizza: 300\n");
        } else {
            sb.append("Base Price Of The Pizza: 400\n");
        }

        if(this.extra_cheese)
            sb.append("Extra Cheese Added: 80\n");

        if(this.extra_toppings && this.isVeg)
            sb.append("Extra Toppings Added: 70\n");
        if(this.extra_toppings && !this.isVeg)
            sb.append("Extra Toppings Added: 120\n");

        if(take_away)
            sb.append("Paperbag Added: 20\n");

        sb.append("Total Price: "+this.price+"\n");
        this.bill = sb.toString();
        return this.bill;
    }
}
