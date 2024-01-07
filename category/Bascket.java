package sparta.java_project.keyoskVer2.category;

import sparta.java_project.keyoskVer2.view.Console;

import java.util.ArrayList;
import java.util.List;

public class Bascket {
    private final List<Item> bascket = new ArrayList<>();

    int totalPrice;

    public void addProduct(Item product){
        bascket.add(product);
    }

    public void addPrice(Item product){
        totalPrice = product.getPrice();
    }

    public List<Item> getBascket(){
        return bascket;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public void clearBascket(){
        bascket.clear();
        totalPrice = 0;
    }


}
