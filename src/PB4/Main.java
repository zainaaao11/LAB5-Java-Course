package PB4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to buy: ");
        int size=scan.nextInt();
        ShoppingCart cart = new ShoppingCart(size);
        Item item1 = new Item("Milk", 12.5, 2);
        Item item2 = new Item("Bread", 5.0, 1);
        Item item3 = new Item("Apples", 3.0, 4);
        Item item4=new Item("Honey", 20, 1);
        System.out.println("the items list before adding any items: ");
        for (Item i : cart.getCart()){
            if (i!=null){
                System.out.println(i.getName());
            }
            else System.out.println(i);
        }
        cart.addToCart(item1);
        cart.addToCart(item2);
        System.out.println("the items list after adding two items: ");
        for (Item i : cart.getCart()){
            if (i!=null){
                System.out.println(i.getName());
            }
        }
        cart.addToCart(item3);
        System.out.println("the items list before the third item: ");
        for (Item i : cart.getCart()){
            if (i!=null){
                System.out.println(i.getName());
            }
        }
        System.out.println("the total price currently: ");
        System.out.println(cart.getTotalPrice());
        cart.addToCart(item4);
        System.out.println("the total price after adding the 4th item: ");
        System.out.println(cart.getTotalPrice());
        System.out.println("the items list after adding the 4th item: ");
        for (Item i : cart.getCart()){
            if (i!=null){
                System.out.println(i.getName());
            }
        }
    }
}
