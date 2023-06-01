
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GenericManager <T extends Comparable >/* my code */{
    private ArrayList<T> cList;

    public GenericManager() {
        cList = new ArrayList<T>();
        /* my code */
    }

    public void add(T a) {
        cList.add(a);

        /* your code */
    }

    public void sort() { Collections.sort(cList);
    }

    public String find(T a) {
        String toReturn = "";
        for (Iterator<T> myIterator = cList.iterator(); myIterator.hasNext();) {
            T listContact = myIterator.next();
            if (listContact.equals(a)) {
                toReturn += listContact+ "\n";
            }
        } return toReturn;
        /* my code */
    }

    public String toString() {
        String toReturn = "";
        for (Iterator<T> myIterator = cList.iterator(); myIterator.hasNext();) {
            T listContact = myIterator.next();
            toReturn += listContact;
        } return toReturn;


        /* my code */
    }
}
