package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList internalList = new SortedIntList();
    private int totalAdded = 0;

    public DelegationSortedIntList() {
    }
 
    public boolean add(int num) {
       int beforeSize = internalList.size();

       boolean added = internalList.add(num);
       int afterSize = internalList.size();

       totalAdded += (afterSize - beforeSize);
       return added;
    }
 
    public boolean addAll(IntegerList list) {
       int beforeSize = internalList.size();

       boolean added = internalList.addAll(list);
       int afterSize = internalList.size();

       totalAdded += (afterSize - beforeSize);
       return added;
    }
 
    public int get(int index) {
       return internalList.get(index);
    }
 
    public boolean remove(int num) {
       return internalList.remove(num);
    }
 
    public boolean removeAll(IntegerList list) {
       return internalList.removeAll(list);
    }
 
    public int size() {
       return internalList.size();
    }
 
    public int getTotalAdded() {
       return totalAdded;
    }

}