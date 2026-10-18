package PB4;

import java.util.Scanner;

public class ShoppingSimulator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //we will start with an arbitrary non null index
        ShoppingCart cart=new ShoppingCart(2);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("0: Finish the shopping");
            System.out.println("1: Add items to the shopping cart");
            System.out.print("Enter your choice: ");
            choice =scan.nextInt();
            scan.nextLine(); //because nextInt puts a line break in the buffer so we must first consume it
            switch (choice){
                case 0:
                    System.out.printf("Please pay $%.2f\n", cart.getTotalPrice());
                    break;
                case 1:
                    System.out.println("Enter the name,price,quantity (in this format) for the item you want to add:");
                    String line=scan.nextLine();
                    String[] itemInfos=line.split(", ");
                    Item item=new Item(itemInfos[0], Double.parseDouble(itemInfos[1]), Integer.parseInt(itemInfos[2]));
                    cart.addToCart(item);
                    System.out.println("The items currently available in your cart: ");
                    for (Item i:cart.getCart()){
                        if (i!=null){
                            System.out.printf("The item's name: %s, the price: %.2f, the quantity: %d\n", i.getName(), i.getPrice(), i.getQuantity());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice!=0);
    }
}
