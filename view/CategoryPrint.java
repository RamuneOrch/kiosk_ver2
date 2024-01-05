package sparta.java_project.keyoskVer2.view;

import sparta.java_project.keyoskVer2.ProductListInit;
import sparta.java_project.keyoskVer2.category.Item;

import java.util.List;
import java.util.Scanner;

public class CategoryPrint {
    Scanner sc = new Scanner(System.in);
    ProductListInit productListInit = new ProductListInit();
    // 번호를 입력받으면 그 번호에 해당하는 카테고리들을 출력한다.
    public Item getCategory(int num){
        num--;
        System.out.println();
        Item product = categoryPrint(productListInit.getProductList().get(num));
        return productCheck(product);
    }

    public Item categoryPrint(List<Item> category){
        int sequence = 1;
        for(Item category1 : category){
            System.out.println(sequence + ". " + category1.getName() + "    |  가격 :   " + category1.getPrice() + "  |  " + category1.getDetail());
            sequence++;
        };
        System.out.println("-------------------------------------");
        System.out.println("어떤 메뉴를 고르시겠습니까 ?");
        return category.get(sc.nextInt() - 1);
    }

    public Item productCheck(Item product){
        System.out.println("|   " + product.getName() + "    |  가격 : " + product.getPrice() + "  |   " + product.getDetail() + "    |");
        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       |       2. 취소");
        return product;
    }
}
