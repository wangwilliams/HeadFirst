package Component;

import InteratorAndCombination.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marrinara Sauce, and a slice " +
                "of sourdough bread",true,3.89));
        dessertMenu.add(new MenuItem("Apple pie",
                "Apple pie with flakey crust, topped with vanilla ice cream",
                true,1.59));
        dinerMenu.add(dessertMenu);
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
