package Kiosk.kioskLv4;

import Kiosk.kioskLv2.MenuItem;
import Kiosk.kioskLv3.Kiosk;

import java.util.ArrayList;

public class Menu {

    //속성
    private String name;
    private ArrayList<MenuItem> menuItem;
    private Kiosk kiosk;

    //생성자


    public Menu(String name){
        this.name = name;
        this.menuItem = new ArrayList<>();
        // 메뉴
        menuItem.add(new MenuItem("1.ShackBuger ", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("2.SmokeBuger ", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("3.CheeseBuger", "W 6.9", "포테이토 번과 비프페티, 치즈가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("4.HamBuger   ", "W 6.9", "비프패티를 기반으로 야채가 들어간 버거"));

    }


    public Menu(Kiosk kiosk){
        this.kiosk = kiosk;
    }

    //기능
    public String getName(){
        return this.name;
    }
    public ArrayList<MenuItem>getMenuItem(){
        return this.menuItem;
    }

    }



