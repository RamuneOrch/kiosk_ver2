package sparta.java_project.keyoskVer2.category;

public class Item {
    String name, detail;
    int price,count;
    Item(String name, int price, String detail, int count){
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.count = count;
    }
    public void increaseCount(){
        this.count++;
    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getPrice() {
        return price*count;
    }

    public int getCount() {
        return count;
    }
}
