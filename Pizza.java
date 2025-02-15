import java.util.Scanner;
public class Pizza {
    public int price;
    public Boolean veg;
    public int extraCheesePrice=100;
    public int extraToppingsPrice=150;
    public int backPackPrice=20;
    public int basePizzaPrice;
    public boolean isExtraCheeseAdded=false;
    public boolean isExtraToppingsAdded=false;
    public boolean isOptedForTakeaway=false;
    Scanner sc=new Scanner(System.in);
    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void ExtraCheese(){
        System.out.println("Extra cheese (y/n)? =>");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'y':
                isExtraCheeseAdded=true;
                this.price+=extraCheesePrice;
                break;
            case 'n':
                isExtraCheeseAdded=false;
                break;
            }
        }
        public void ExtraToppings(){
            System.out.println("Want Extra Toppings (y/n)? =>");
            char ch=sc.next().charAt(0);
        switch(ch){
            case 'y':
                isExtraToppingsAdded=true;
                this.price+=extraToppingsPrice;
                break;
            case 'n':
                isExtraToppingsAdded=false;
                break;
        }        
    }
    public void takeAway(){
        System.out.println("Want TakeAway (y/n)? =>");
        char ch=Character.toLowerCase(sc.next().charAt(0));
        switch(ch){
            case 'y':
                isOptedForTakeaway=true;
                this.price+=backPackPrice;
                break;
            case 'n':
                isOptedForTakeaway=false;
                break;
        }
    }
    public void getBill(){
        String bill=" ";
        System.out.println("Pizza : "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese : "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings : "+extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeaway){
            bill+="Take away : "+backPackPrice+ "\n";
        }
        bill+="\nTotal Amount : "+this.price+ "\n";
        System.out.println(bill);
        System.out.println("\n\nThank You!!! Visit Again...");
        System.out.println("================================================");
    }
    public static void main(String args[]){

    }
}

