package sparta.java_project.keyoskVer2.view;

import java.util.Scanner;

public class Console {
    private static Scanner sc;

    private Console(){}

    public static int getNumber(){
        return getInstance().nextInt();
    }

    private static Scanner getInstance(){
        if(sc == null){
            return new Scanner(System.in);
        }
        System.out.println();
        System.out.print("번호를 입력해주세요  =>  ");
        return sc;
    }
}
