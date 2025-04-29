package Kiosk.kioskLv3;


import Kiosk.kioskLv2.MenuItem;
import java.util.Scanner;
import java.util.ArrayList;

public class Kiosk {

    //속성
  private ArrayList<MenuItem> menuItem;

    //생성자
    public Kiosk(ArrayList<MenuItem> menuItem ){
        this.menuItem = menuItem;
    }


    Scanner scanner = new Scanner(System.in);
    // 기능
    public void start() {
        for (int i = 0; i < menuItem.size(); i++) {
            MenuItem list = menuItem.get(i);
            System.out.println(list.getName() + "|" + list.getPrice() + "|" + list.getMenuInfo());
        }
        while (true) {
            try {
                System.out.println("////////// 원하시는 메뉴의 번호를 입력해주세요. //////////");
                System.out.println("0. 종료");
                int menuNumber = scanner.nextInt();
                scanner.nextLine();

                if(menuNumber == 0){
                    System.out.println("주문을 종료합니다.");
                    break;
                }
                if(menuNumber < 0 || menuNumber > menuItem.size()) {
                    System.out.println("메뉴에 없는 번호입니다. 다시 입력해주세요.");
                    continue;
                }
                System.out.println("원하시는 메뉴가 " + menuNumber + "(이)가 맞나요?");
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
