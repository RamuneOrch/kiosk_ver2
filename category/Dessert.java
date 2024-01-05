package sparta.java_project.keyoskVer2.category;

import java.util.ArrayList;
import java.util.List;

public class Dessert implements ProductList {
    List<Item> dessertList = new ArrayList<>();


    @Override
    public void initProductList() {
        dessertList.add(new Item("딸기케이크", 3500, "딸기가 들어감", 1));
        dessertList.add(new Item("티라미수", 7500, "티라미수임", 1));
        dessertList.add(new Item("초코파운드", 6500, "초코가 들어감", 1));
        dessertList.add(new Item("마카롱", 3500, "마카롱임", 1));
        dessertList.add(new Item("버터와플", 8500, "버터랑 와플", 1));
    }

    @Override
    public int getProductListSize() {
        getProductList();
        return dessertList.size();
    }
    @Override
    public List<Item> getProductList() {
        return dessertList;
    }
}
