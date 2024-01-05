package sparta.java_project.keyoskVer2.view;

import sparta.java_project.keyoskVer2.category.Item;

import java.util.List;

public class OrderPrint {


    public void bascketPrint(List<Item> bascket){
        System.out.println("                 [ 상품 목록 ]");
        String format = "|  %s  |  가격 : %d  |  개수 : %d  |  %s  |%n";
        for(Item product : bascket){
            System.out.printf(format,product.getName(),product.getPrice(),product.getCount(),product.getDetail());
        };
    }

    public void totalPricePrint(int totalPrice){
        System.out.println();
        System.out.println("            [ 총 금액 ]");
        System.out.println("|      총 금액 : " + totalPrice + "      |");
        System.out.println();

        System.out.println("     1. 주문      |      2. 메뉴판   ");
        System.out.println();

        Console.getNumber();
    }

    public void orderComplete(){
        System.out.println("ㅁ-----------------------ㅁ");
        System.out.println("|  주문이 완료 되었습니다!   |");
        System.out.println("ㅁ-----------------------ㅁ");

        System.out.println("대기번호는 [ " + /*waitingNumber*/  " ] 번 입니다.");
        System.out.println("3초후 메뉴판으로 돌아갑니다.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
