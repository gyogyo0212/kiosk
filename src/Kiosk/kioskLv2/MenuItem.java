package Kiosk.kioskLv2;

public class MenuItem {
    //속성
    private String name;
    private String price;
    private String menuInfo;
    //생성자
    public MenuItem(String name, String price, String menuInfo){
        this.name = name;
        this.price = price;
        this.menuInfo = menuInfo;
    }
    //기능


    public String getName(){
        return name;

    }
    public String getPrice(){
        return price;

    }
    public String getMenuInfo(){
        return menuInfo;
    }




}
