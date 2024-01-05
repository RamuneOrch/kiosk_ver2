package sparta.java_project.keyoskVer2.category;

import java.util.ArrayList;
import java.util.List;

public class Bascket {
    List<Item> bascket = new ArrayList<>();

    int totalPrice;

    public void addBascket(Item product){
        bascket.add(product);
        totalPrice += product.getPrice();
    }

    public List<Item> getBascket(){
        return bascket;
    }
    public int getTotalPrice(){
        return totalPrice;
    }

}
