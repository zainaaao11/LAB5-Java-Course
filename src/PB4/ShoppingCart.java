package PB4;

import java.util.Arrays;

public class ShoppingCart {
    private Item[] cart;
    private int size;
    private int capacity=0;
    private double totalPrice=0;
    public ShoppingCart(int size){
        this.size=size;
        this.cart= new Item[size];
    }
    public void increaseSize(){
        this.cart=Arrays.copyOf(this.cart, this.size+(this.size)/2);
        this.size+=(this.size)/2;
    }
    public void addToCart(Item item){
        if (this.size<=this.capacity){
            increaseSize();
            for (int i=this.capacity; i<this.cart.length; i++){
                if (this.cart[i]==null){
                    this.cart[i]=item;
                    this.capacity++;
                    this.totalPrice+=item.getQuantity()*item.getPrice();
                    break;
                }
            }
        }
        else {
            for (int j=0; j<this.size; j++){
                if (this.cart[j]==null){
                    this.cart[j]=item;
                    this.capacity++;
                    this.totalPrice+=item.getQuantity()*item.getPrice();
                    break;
                }
            }
        }
    }
    public Item[] getCart(){
        return this.cart;
    }
    public double getTotalPrice(){
        return this.totalPrice;
    }
}
