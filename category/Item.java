package sparta.java_project.keyoskVer2.category;

public class Item {
    private final String name, detail;
    private final int price;
    private int count;
    Item(String name, int price, String detail, int count){
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.count = count;
    }
    public void increaseCount(){
        this.count++;
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
