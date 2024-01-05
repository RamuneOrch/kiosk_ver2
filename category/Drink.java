package sparta.java_project.keyoskVer2.category;

import java.util.ArrayList;
import java.util.List;

public class Drink implements ProductList {
    List<Item> drinkList = new ArrayList<>();
    @Override
    public void initProductList() {
        drinkList.add(new Item("레몬에이드", 3800, "레몬이 들어감", 1));
        drinkList.add(new Item("자몽에이드", 4300, "자몽이 들어감", 1));
        drinkList.add(new Item("블루레몬에이드", 4000, "블루 레몬이 들어감", 1));
        drinkList.add(new Item("유자에이드", 4200, "유자가 들어감", 1));
        drinkList.add(new Item("딸기에이드", 4000, "딸기가 들어감", 1));
    }

    @Override
    public int getProductListSize() {
        return drinkList.size();
    }

    @Override
    public List<Item> getProductList() {
        return drinkList;
    }
}
