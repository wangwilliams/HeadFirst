package InteratorAndCombination;

import java.util.ArrayList;

public class PancakeHouseMenuInterator implements Interator{
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
}
