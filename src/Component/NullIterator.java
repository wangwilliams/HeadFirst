package Component;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class NullIterator implements Iterator {
    @Override
    public void remove() {
        throw new IllegalStateException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
