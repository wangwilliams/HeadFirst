package Component;

import com.sun.corba.se.impl.oa.NullServantImpl;

import java.util.Iterator;

/**
 * 这个是每个组合设计模式中使用的基础存储单元
 * 不继承add(),remove(),getChild()方法
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public  boolean isVegetarian(){
        return vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public Iterator createIterator(){
        return new NullIterator();
    }
    @Override
    public void print() {
        System.out.print(" "+getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("    -- "+getDescription());
    }
}
