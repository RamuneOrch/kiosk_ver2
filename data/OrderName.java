package sparta.java_project.keyoskVer2.data;

import java.util.ArrayList;
import java.util.List;

public class OrderName {
    private final static List<String> order = new ArrayList<>();
    // static을 선언하지 않으면 전역변수로 선언되지 않아서 계속 로딩되는 현상이 일어난다.
    // 방법 1. set을써서 무한이 리스트에 add가 된다고 하더라도 중복이 안되기때문에 해결되지만 근본적인 무한으로 중첩되는 이유를 찾을수가 없었다.
    // 방법 2. static으로 선언 함으로써 전역적으로 사용하게끔 만들어 문제를 해결{} 하지만 메모리를 잡아먹는 문제가 생기기때문에 이것또한 최선의 방법은 아닌것 같다.

    // 방법 3. enum 사용
    // 방법 4. 생성자 사용 <- 이게 정답
//    static {
//        order.add("주문");
//        order.add("취소");
//    }

    public OrderName(){
        order.add("주문");
        order.add("취소");
    }

    public List<String> getOrder(){
        return order;
    }
}
