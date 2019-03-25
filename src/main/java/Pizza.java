public class Pizza {
    private String toppings;
    private double price;

    //Constructor
    //constructors always share name of class
    public Pizza(String toppings, double price) {
        setToppings(toppings);
        setPrice(price);
    }
    //default constructor for no args
    public Pizza(){
        this("Cheese",0.0);
    }

    //setters
    //return type is void. Usually takes an argument corresponding to the data type
    //we are setting. methods do not have static tag because they are not shared
    //accessing individual instances of 'Pizza'
    public void setToppings(String toppings) {
        String top = toppings.toLowerCase();
        top = top.substring(0,1).toUpperCase() + top.substring(1);
        //THIS refers to the class variable toppings
        //THIS means THAT
        this.toppings = top;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //Getters
    public String getToppings() {
        return toppings;
    }
    public double getPrice() {
        return price;
    }

    public String toString(){
        String result = String.format("Toppings: %s Price: %1.2f", toppings, price);
        return result;
    }
}
