package sparta.java_project.keyoskVer2.category;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements ProductList{
    // List를 사용한 이유 : 저장 순서를 유지하기 위해서 사용.
    // 근본적인 목적은 커피 메뉴의 리스트의 데이터를 저장하는데에 있다.
    private List<Item> productList = new ArrayList<>();
    // List안에 ArrayList를 넣은이유
    // ㄴ 코드에 유연성을 제공하기 위함
    // ㄴ 유지보수성 측면에서 뛰어남
    // ㄴㄴ 나중에 LinkedList로의 교체도 용이

    @Override
    public void initProductList(){
        productList.add(new Item("아메리카노",3500,"물이랑 커피 섞은거",1));
        productList.add(new Item("카푸치노",4000,"에스프레소랑 커피 섞은거",1));
        productList.add(new Item("초코라떼",3800,"초코랑 커피 섞은거",1));
        productList.add(new Item("딸기라떼",3500,"딸기랑 커피 섞은거",1));
        productList.add(new Item("바닐라라떼",4500,"바나나랑 커피 섞은거",1));
    };

    @Override
    public List<Item> getProductList(){
        return productList;
    }

    @Override
    public int getProductListSize() {
        getProductList();
        return productList.size();
    }

}
