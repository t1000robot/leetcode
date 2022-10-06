package main.java.easy.removeElement;

class Solution {

  public int removeElement(int[] nums, int val) {

    int indexInMemory = 0;
    for (int currentValue : nums) {
      if (currentValue != val) {
        nums[indexInMemory] = currentValue;
        indexInMemory++;
      }
    }

    return indexInMemory;
  }
}