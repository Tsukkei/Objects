public class App{
    public static void main(String[] args) {

        //item class
        items strengthpotion = new items ();

        strengthpotion.price = 50;
        strengthpotion.weight = 8.8f;
        strengthpotion.quantity = 10;
        strengthpotion.description = "This is strength potion, it will gave you 10 strength ";
        strengthpotion.sayMyItems();
        strengthpotion.canbetraded = true;

        items staminapotion = new items ();

        staminapotion.price = 50;
        staminapotion.weight = 8.8f;
        staminapotion.quantity = 10;
        staminapotion.description = "this is stamina potion, it will give you 10 stamina";
        staminapotion.sayMyItems();
        staminapotion.canbetraded = true;

        items Healingpotion = new items ();

        Healingpotion.price = 50;
        Healingpotion.weight = 8.8f;
        Healingpotion.quantity = 10;
        Healingpotion.description = "this is healing potion, and will heal 10 HP";
        Healingpotion.sayMyItems();
        Healingpotion.canbetraded = true;
