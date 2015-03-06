//----------------------------------------------------------------------------
// SortedList.java by Dale/Joyce/Weems Chapter 3
//
// Completes the definition of the List class under the assumption
// that the list is kept sorted
//----------------------------------------------------------------------------
package Classes.RealEstate;

import javax.swing.JOptionPane;

public class SortedList extends List {

    public SortedList(int maxItems) // Instantiates and returns a reference to an empty list object
    // with room for maxItems elements
    {
        super(maxItems);
    }

    public SortedList() // Instantiates and returns a reference to an empty list object
    // with room for 100 elements
    {
        super(100);
    }

    public boolean isThere(Listable item) // Returns true if an element with the same key as item is on this list;
    // otherwise, returns false
    {
        int compareResult;
        int midPoint;
        int first = 0;
        int last = numItems - 1;
        boolean moreToSearch = (first <= last);
        boolean found = false;
        while (moreToSearch && !found) {
            midPoint = (first + last) / 2;
            compareResult = item.compareTo(list[midPoint]);
            if (compareResult == 0) {
                found = true;
            } else if (compareResult < 0) // item is less than element at location
            {
                last = midPoint - 1;
                moreToSearch = (first <= last);
            } else // item is greater than element at location
            {
                first = midPoint + 1;
                moreToSearch = (first <= last);
            }
        }
        return found;
    }

    public Listable retrieve(Listable item) // Returns a copy of the list element with the same key as item
    {
        int compareResult;
        int first = 0;
        int last = numItems - 1;
        int midPoint = (first + last) / 2;
        boolean found = false;
        while (!found) {
            midPoint = (first + last) / 2;
            compareResult = item.compareTo(list[midPoint]);
            if (compareResult == 0) {
                found = true;
            } else if (compareResult < 0) // item is less than element at location
            {
                last = midPoint - 1;
            } else // item is greater than element at location
            {
                first = midPoint + 1;
            }
        }
        return list[midPoint].copy();
    }

    public void insert(Listable item) // Adds a copy of item to this list
    {
        int location = 0;
        numItems = 2;
        boolean moreToSearch = (location < numItems);
        JOptionPane.showMessageDialog(null, moreToSearch);
        while (moreToSearch) {
            if (item.compareTo(list[location]) < 0) // item is less
            {
                moreToSearch = false;
                JOptionPane.showMessageDialog(null, "1111111");
            } else // item is more
            {
                location++;
                moreToSearch = (location < numItems);
                JOptionPane.showMessageDialog(null, "222222222");
            }
        }
        for (int index = numItems; index > location; index--) {
            JOptionPane.showMessageDialog(null, "for");
            list[index] = list[index - 1];
        }
        JOptionPane.showMessageDialog(null, "after for");
        list[location] = item.copy();
        numItems++;
    }

    public void delete(Listable item) // Deletes the element that matches item from this list
    {
        int location = 0;
        while (item.compareTo(list[location]) != 0) {
            location++;
        }
        for (int index = location + 1; index < numItems; index++) {
            list[index - 1] = list[index];
        }
        numItems--;
    }
}
