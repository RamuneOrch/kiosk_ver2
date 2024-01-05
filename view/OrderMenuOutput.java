package sparta.java_project.keyoskVer2.view;

import java_class._calc;
import sparta.java_project.keyoskVer2.data.CategoryName;
import sparta.java_project.keyoskVer2.data.OrderName;

public class OrderMenuOutput {
    OrderName orderName = new OrderName();
    CategoryName categoryName = new CategoryName();
    public void orderGuide(){
        System.out.println("       |      메뉴   주 문     |");
    }

    public void order(){
        int num = categoryName.getCategorySize() + 1;
        orderCheckPrint(num);
    }

    public void orderCheckPrint(int num){
        for(String order : orderName.getOrder()){
            System.out.print("|    " + num + ". " + order + "     |   ");
            num++;
        }
    }

    public void orderMenuPrint(){
        orderGuide();
        order();
    }

}
