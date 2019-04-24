package InteratorAndCombination;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenuInterator implements Iterator{
    ArrayList list;
    int position = 0;
    public PancakeHouseMenuInterator(ArrayList list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size()||list.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object menuItem = list.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
