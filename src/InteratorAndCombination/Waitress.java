package InteratorAndCombination;
import com.sun.deploy.panel.ITreeNode;

import java.util.ArrayList;
import java.util.Iterator;
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    ArrayList menus;
    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu,Menu cafeMenu){
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public Waitress(ArrayList menus){
        this.menus = menus;
    }

    public void printMMenu(){
        Iterator iterator = menus.iterator();
        while (iterator.hasNext()){
            Menu menu =(Menu) iterator.next();
            printMMenu(menu.createIterator());
        }
    }

    public void printMMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName()+", ");
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescribtion());
        }
    }
    public void printMenu(){
        Iterator pancakeInterator = pancakeHouseMenu.createIterator();
        Iterator dinerInterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeInterator);
        System.out.println("\nLUNCH");
        printMenu(dinerInterator);
        System.out.println("\nDINEER");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator interator){
        while (interator.hasNext()){
            MenuItem menuItem = (MenuItem) interator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescribtion());
        }
    }
}
