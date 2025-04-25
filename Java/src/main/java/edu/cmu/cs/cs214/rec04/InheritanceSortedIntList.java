package edu.cmu.cs.cs214.rec04;

import java.util.Comparator;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import java.util.ArrayList;

public class InheritanceSortedIntList extends SortedIntList {

   private int totalAdded = 0;

   public InheritanceSortedIntList() {
      super();
   }

    


    @Override
    public boolean add(int num) {
      boolean added = super.add(num);

      if (added) {
         totalAdded++;
      }
      return added;
   }

   @Override
   public boolean addAll(IntegerList list) {
      int beforeSize = this.size();

      // System.out.println(beforeSize);
      boolean added = super.addAll(list);
      int afterSize = this.size();

      // System.out.println(afterSize);
      System.out.println(totalAdded);

      totalAdded += (afterSize - beforeSize);
      return added;
   }

   public int getTotalAdded() {
      return totalAdded;
   }

   
}