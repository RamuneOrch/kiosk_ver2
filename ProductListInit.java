package sparta.java_project.keyoskVer2;

import sparta.java_project.keyoskVer2.category.Coffee;
import sparta.java_project.keyoskVer2.category.Dessert;
import sparta.java_project.keyoskVer2.category.Drink;
import sparta.java_project.keyoskVer2.category.Item;

import java.util.ArrayList;
import java.util.List;

public class ProductListInit {
    private final Coffee coffeeList = new Coffee();
    private final Drink drinkList = new Drink();
    private final Dessert dessertList = new Dessert();
    public List<List<Item>> productList = new ArrayList<>();
    public ProductListInit(){
        coffeeList.initProductList();
        drinkList.initProductList();
        dessertList.initProductList();
    }

    void ProductListAdd(){
        productList.add(coffeeList.getProductList());
        productList.add(drinkList.getProductList());
        productList.add(dessertList.getProductList());
    }

    public List<List<Item>> getProductList(){
        ProductListAdd();
        return productList;
    }

}
