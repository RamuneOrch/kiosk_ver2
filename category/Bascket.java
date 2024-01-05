package sparta.java_project.keyoskVer2.category;

import sparta.java_project.keyoskVer2.view.Console;

import java.util.ArrayList;
import java.util.List;

public class Bascket {
    List<Item> bascket = new ArrayList<>();

    int totalPrice;

    public void addBascket(Item product){
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

    public void clearBascketCheck(){
        System.out.println("주문을 취소하시겠습니까?");
        System.out.println("1. 확인         |         2. 취소");
        if(Console.getNumber() == 1){
            clearBascket();
        }
    }
}
