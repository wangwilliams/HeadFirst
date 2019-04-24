package InteratorAndCombination;
import java.util.Iterator;
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu){
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        Iterator pancakeInterator = pancakeHouseMenu.createIterator();
        Iterator dinerInterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeInterator);
        System.out.println("\nLUNCH");
        printMenu(dinerInterator);
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
