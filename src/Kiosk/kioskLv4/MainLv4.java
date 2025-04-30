package Kiosk.kioskLv4;

import Kiosk.kioskLv2.MenuItem;
import Kiosk.kioskLv3.Kiosk;

import java.util.ArrayList;

public class MainLv4 {
    public static void main(String[] args) {

        Menu menu1 = new Menu("1. Burger");
        Menu menu2 = new Menu("2. drinks");
        Menu menu3 = new Menu("3, desserts");

        System.out.println("[ MAIN MANU ]");
        String menu1Name = menu1.getName();
        System.out.println(menu1Name);
        String menu2Name = menu2.getName();
        System.out.println(menu2Name);
        String menu3Name = menu3.getName();
        System.out.println(menu3Name);


        ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();

        Kiosk kiosk = new Kiosk(menuItem);
        kiosk.start();
    }

}
