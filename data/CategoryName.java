package sparta.java_project.keyoskVer2.data;

import java.util.*;

public class CategoryName {
    Map<String,String> category = new LinkedHashMap<>();
    // put으로 입력되는 값들이 순서대로 저장.
    public Map<String,String> getCategory(){
        category.put("커피","Coffee");
        category.put("드링크","Drink");
        category.put("디저트","Dessert");
        return category;
    }

    public int getCategorySize(){
        getCategory();
        return category.size();
    }

}
