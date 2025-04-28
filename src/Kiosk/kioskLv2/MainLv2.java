package Kiosk.kioskLv2;


import java.util.ArrayList;
import java.util.Scanner;

public class MainLv2 {
    public static void main(String[] args) {
        //List 선언
        ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();
        Scanner scanner = new Scanner(System.in);

    MenuItem menuItem1 = new MenuItem("1.ShackBuger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    MenuItem menuItem2 = new MenuItem("2.SmokeBuger", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    MenuItem menuItem3 = new MenuItem("3.ShackBuger", "W 6.9", "포테이토 번과 비프페티, 치즈가 토핑된 치즈버거");
    MenuItem menuItem4 = new MenuItem("4.ShackBuger", "W 6.9", "비프패티를 기반으로 야채가 들어간 버거");


        menuItem.add(menuItem1);
        menuItem.add(menuItem2);
        menuItem.add(menuItem3);
        menuItem.add(menuItem4);



    for(int i = 0; i < menuItem.size(); i++){
        MenuItem list = menuItem.get(i);
        System.out.println(list.getName() + "|" + list.getPrice() + "|" + list.getMenuInfo());


    }




    }
}
