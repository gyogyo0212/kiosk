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
    }
    public Menu(ArrayList<MenuItem>menuItem){
        this.menuItem= menuItem;
    }
    public Menu(Kiosk kiosk){
        this.kiosk = kiosk;
    }

    //기능
    public String getName(){
        return this.name;
    }
    public void menu(){}

    }



