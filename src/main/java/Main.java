public class Main {
    public static void main (String[] args) {
        Pizza sam;
        sam = new Pizza();
        sam.setToppings("grEeN PEpPers");
        sam.setPrice(9.37);
        System.out.printf("Sam's pizza has %s and costs $%s\n", sam.getToppings(), sam.getPrice());

        Pizza betty = new Pizza();
        betty.setToppings("Pepperoni");
        betty.setPrice(9.30);
        System.out.printf("Betty's pizza has %s and costs $%s\n", betty.getToppings(), betty.getPrice());

        System.out.println(sam);
        System.out.println(betty);

        Pizza spencer = new Pizza("pepperOni", 2.00);
        System.out.println(spencer);

        System.out.println("Done");
        /* difference between a class and an object
            Classes specifies what is in the object, it works like a template: in this case, pizza is the class
                Contains methods to perform actions.
            Objects are one instance of a class: in this case, sam is an instance of pizza
            In line 4, we instantiate an instance of pizza

         */
    }
}
