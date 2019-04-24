package InteratorAndCombination;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        Interator pancakeInterator = pancakeHouseMenu.createInterator();
        Interator dinerInterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeInterator);
        System.out.println("\nLUNCH");
        printMenu(dinerInterator);
    }

    public void printMenu(Interator interator){
        while (interator.hasNext()){
            MenuItem menuItem = (MenuItem) interator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescribtion());
        }
    }
}
