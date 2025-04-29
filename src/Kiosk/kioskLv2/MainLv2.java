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
        MenuItem menuItem3 = new MenuItem("3.CheeseBuger", "W 6.9", "포테이토 번과 비프페티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("4.HamBuger", "W 6.9", "비프패티를 기반으로 야채가 들어간 버거");


        menuItem.add(menuItem1);
        menuItem.add(menuItem2);
        menuItem.add(menuItem3);
        menuItem.add(menuItem4);


        for (int i = 0; i < menuItem.size(); i++) {
            MenuItem list = menuItem.get(i);
            System.out.println(list.getName() + "|" + list.getPrice() + "|" + list.getMenuInfo());
        }
        while (true) {
            try {
                System.out.println("////////// 원하시는 메뉴의 번호를 입력해주세요. //////////");
                int menuNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("원하시는 메뉴가 " + menuNumber + "(이)가 맞나요?");
                if(menuNumber < 1 || menuNumber > menuItem.size()){
                    System.out.println("메뉴에 없는 번호입니다. 다시 입력해주세요.");
                    continue;
                }
                System.out.println("맞으시면 숫자 1 을 입력 해주세요.");
                System.out.println("다시 선택 하시려면 2 를 입력해 주세요.");
                int confirm = scanner.nextInt();

                if (confirm == 1) {
                    System.out.println("주문을 완료하였습니다.");
                    break;
                } else if (confirm == 2) {
                    System.out.println("다시 선택해주세요.");
                    System.out.println("------------------------");
                    continue;
                } else {
                    System.out.println("1,2만 입력해 주세요");
                }
            } catch (RuntimeException e) {
                System.out.println("올바르지 않은 입력입니다.");
                scanner.nextLine();


            }


        }
    }
}
