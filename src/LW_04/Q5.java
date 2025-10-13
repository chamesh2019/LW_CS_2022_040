package LW_04;

import java.util.ArrayList;
import java.util.Scanner;

class Entry{
    private String name;
    private float price;

    public Entry(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}

public class Q5 {
    static ArrayList<Entry> getEntries(){
        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry("Tofu Burger", 3.49F));
        entries.add(new Entry("Cajun Chicken ", 4.59F));
        entries.add(new Entry("Buffalo Wings ", 3.99F));
        entries.add(new Entry("Rainbow Fillet ", 2.99F));

        return entries;
    }

    static ArrayList<Entry> getSideDishes(){
        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry("Rice Cracker", 0.79F));
        entries.add(new Entry("No-Salt Fries", 0.69F));
        entries.add(new Entry("Zucchini ", 1.09F));
        entries.add(new Entry("Brown Rice ", 0.59F));

        return entries;
    }

    static ArrayList<Entry> getDrinks(){
        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry("Cafe Mocha", 1.99F));
        entries.add(new Entry("Cafe Latte", 1.90F));
        entries.add(new Entry("Espresso  ", 2.49F));
        entries.add(new Entry("Oolong Tea", 0.99F));

        return entries;
    }

    public static void main(String[] args) {
        ArrayList<Entry> entries = getEntries();
        ArrayList<Entry> sideDishes = getSideDishes();
        ArrayList<Entry> drinks = getDrinks();

        Scanner sc = new Scanner(System.in);
        float checkout = 0F;

        for (int i = 0; i < entries.size(); i++) {
            System.out.printf("%d | %-15s | $%.2f |\n", i+1, entries.get(i).getName(), entries.get(i).getPrice());
        }
        System.out.print("Select an item from the entries available (enter the number) : ");
        checkout = getCheckout(entries, sideDishes, sc, checkout);
        System.out.print("Select an item from the side dishes available (enter the number) : ");
        checkout = getCheckout(entries, drinks, sc, checkout);
        System.out.print("Select an item from the drinks available (enter the number) : ");
        try {
            int index = sc.nextInt()-1;
            checkout += entries.get(index).getPrice();
            System.out.println("Selected " + entries.get(index).getName() + "\n");
        } catch (Exception e){
            System.out.println("No item with that index. Skipping...");
        }

        System.out.printf("Your Final Checkout is $%.2f", checkout);

    }

    private static float getCheckout(ArrayList<Entry> entries, ArrayList<Entry> sideDishes, Scanner sc, float checkout) {
        try {
            int index = sc.nextInt()-1;
            checkout += entries.get(index).getPrice();
            System.out.println("Selected " + entries.get(index).getName() + "\n");
        } catch (Exception e){
            System.out.println("No item with that index. Skipping...");
        }

        for (int i = 0; i < sideDishes.size(); i++) {
            System.out.printf("%d | %-15s | $%.2f |\n", i+1, sideDishes.get(i).getName(), sideDishes.get(i).getPrice());
        }
        return checkout;
    }
}
