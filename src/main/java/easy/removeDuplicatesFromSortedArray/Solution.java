package main.java.easy.removeDuplicatesFromSortedArray;

class Solution {

  public int removeDuplicates(int[] nums) {

    int indexInMemory = 0;
    for (int index = 1; index < nums.length; index++) {
      if (nums[index] > nums[indexInMemory]) {
        indexInMemory++;
        nums[indexInMemory] = nums[index];
      }
    }
    return indexInMemory + 1;
  }
}