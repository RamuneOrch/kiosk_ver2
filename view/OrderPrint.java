package sparta.java_project.keyoskVer2.view;

import sparta.java_project.keyoskVer2.category.Item;

import java.util.List;

public class OrderPrint {


    public void bascketPrint(List<Item> bascket){
        System.out.println("                 [ 상품 목록 ]");
        for(Item product : bascket){
            System.out.println(product.getName() + "    | 가격 :   " + product.getPrice() + "     |   " + product.getDetail());
        };
    }

    public void totalPricePrint(){
        System.out.println();
        System.out.println("            [ 총 금액 ]");
        System.out.println("여기에 가격이 들어가면 됩니다.");
        System.out.println();

        System.out.println("     1. 주문      |      2. 메뉴판   ");
        System.out.println();

        Console.getNumber();
    }
}
