package sparta.java_project.keyoskVer2.view;

import sparta.java_project.keyoskVer2.category.Bascket;
import sparta.java_project.keyoskVer2.category.Item;
import sparta.java_project.keyoskVer2.data.CategoryName;

import java.util.List;
import java.util.Map;

public class MainMenuOutput {
    CategoryName categoryName = new CategoryName();
    CategoryPrint categoryPrint = new CategoryPrint();
    OrderMenuOutput orderMenuOutput = new OrderMenuOutput();
    Bascket bascket = new Bascket();
    OrderPrint orderPrint = new OrderPrint();

    boolean loopCheck;

    public void greet() {
        System.out.println("-------------------------------");
        System.out.println("song의 카페에 오신것을 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 번호를 입력해주세요.");
        System.out.println("           [ Songs Cafe ]");
    }

    public void mainMenuPrint() {
        System.out.println("-------------------------------------");
        int num = 1;
        String format = "%d. %-5s      |      %3s %n";
        for (Map.Entry<String, String> categoryName1 : categoryName.getCategory().entrySet()) {
            System.out.printf(format,num,categoryName1.getKey(),categoryName1.getValue());
            num++;
        }
        System.out.println("-------------------------------------");
    }

    public void detailCategoryPrint(int num) {
        Item product = categoryPrint.getCategory(num);
        int checkNum = Console.getNumber();
        if(checkNum == 1){
            checkBascketSame(product);
        }
    }

    public void addProductBascket(Item product) {
        bascket.addProduct(product);
    }

    public void addProductPrice(Item product){
        bascket.addPrice(product);
    }

    public void checkBascketSame(Item product){
        List<Item> checkBascket = bascket.getBascket();
        if(checkBascket.isEmpty() | checkBascket.stream().noneMatch(e->e == product)){
            addProductBascket(product);
            addProductPrice(product);
            System.out.println("ㅁ------------------------ㅁ");
            System.out.println("|   상품이 추가 되었습니다!   |");
            System.out.println("ㅁ------------------------ㅁ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(checkBascket.stream().anyMatch(e->e == product)){
            product.increaseCount();
            addProductPrice(product);
        }
    }

    public void bascketAllPrint(List<Item> product){
        orderPrint.bascketPrint(product);
    }

    public void orderMenuCheck(){
        orderMenuOutput.orderMenuPrint();
    }

    public void checkBascketList(){
        if(bascket.getBascket().isEmpty()){
            orderPrint.checkBascketEmpty();
        } else{
            orderTotalPrint();
        }
    }

    public void clearBascketCheck(){
        System.out.println("주문을 취소하시겠습니까?");
        System.out.println("1. 확인         |         2. 취소");
        if(Console.getNumber() == 1){
            bascket.clearBascket();
        }
    }

    public void orderTotalPrint(){
        bascketAllPrint(bascket.getBascket());
        if(orderPrint.totalPricePrint(bascket.getTotalPrice()) == 1){
            orderPrint.orderComplete(bascket);
        };
    }

    public void start(){
        this.loopCheck = true;
        while(this.loopCheck){
            greet();
            mainMenuPrint();
            orderMenuCheck();
            System.out.println();
            int checkNumber = Console.getNumber();
            switch (checkNumber){
                case 1,2,3:
                    detailCategoryPrint(checkNumber);
                    break;
                case 4:
                    checkBascketList();
                    break;
                case 5:
                    clearBascketCheck();
                    break;
                case 9:
                    this.loopCheck = false;
                    break;
                default:
                    break;
            }
        }
    }
}