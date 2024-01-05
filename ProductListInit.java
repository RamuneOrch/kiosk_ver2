package sparta.java_project.keyoskVer2;

import sparta.java_project.keyoskVer2.category.Coffee;
import sparta.java_project.keyoskVer2.category.Dessert;
import sparta.java_project.keyoskVer2.category.Drink;
import sparta.java_project.keyoskVer2.category.Item;

import java.util.ArrayList;
import java.util.List;

public class ProductListInit {
    // 바꿀요지가 있으니 final선언은 하지않기
    private Coffee coffeeList = new Coffee();
    private Drink drinkList = new Drink();
    private Dessert dessertList = new Dessert();
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
