public class items {
    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;
    String type;
   

    public void sayMyItems() {
        System.out.println(" " + description + " it costs " + price +  ", it weighs " +  weight +  ", the amount is " + quantity + "." );

    }

 }
