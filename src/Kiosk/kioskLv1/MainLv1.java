package Kiosk.kioskLv1;


import java.util.Scanner;

public class MainLv1 {
    public static void main(String[] args) {
        //스캐너
        Scanner scanner = new Scanner(System.in);

             int a = 1;
             int b = 2;

//        System.out.println("좋아하는 문장을 만드세요.");
//        String sentence = scanner.nextLine();// 데이터 전달
//        System.out.println("좋아하는 문장 :" + sentence);

        while(true) {
            try {
                System.out.println("[ SHAKESHAKE MENU ]");
                System.out.println("1. ShackBuger       | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("2. SmokeShack       | W 6.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("3. CheeseBuger      | W 6.9 | 포토이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("4. HamBuger         | W 6.9 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("////////// 원하시는 메뉴의 번호를 입력해주세요. //////////");
                int menuNumber = scanner.nextInt();
                scanner.nextLine();

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
                }else{
                    System.out.println("1,2만 입력해 주세요");
                }


            }catch(RuntimeException e){
                System.out.println("올바르지 않은 입력입니다.");
                scanner.nextLine();
            }
        }

        }

    }

