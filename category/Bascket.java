package sparta.java_project.keyoskVer2.category;

import java.util.ArrayList;
import java.util.List;

public class Bascket {
    List<Item> bascket = new ArrayList<>();

    public void addBascket(Item product){
        bascket.add(product);
        System.out.println(bascket);
    }

    public List<Item> getBascket(){
        return bascket;
    }

}
