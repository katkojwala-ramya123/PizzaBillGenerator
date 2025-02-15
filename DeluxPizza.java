public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean veg){
        super(veg);
    }
    public void ExtraCheese(){
        this.price+=extraCheesePrice;
    }
    public void ExtraToppings(){
        this.price+=extraToppingsPrice;
    }
}
