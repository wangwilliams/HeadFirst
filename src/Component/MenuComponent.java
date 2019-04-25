package Component;

import InteratorAndCombination.Menu;

import java.util.Iterator;

/**
 * 所有组件都必须实现MenuCmponent接口
 * 但是叶几点和组合节点的角色不同,所以有些方法
 * 不适合某种节点,最好抛出异常,如果子项重写
 * 则不会流出,如果没有被重写,则会抛出异常
 */


public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
