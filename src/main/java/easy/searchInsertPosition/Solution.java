package main.java.easy.searchInsertPosition;

class Solution {
  public int searchInsert(int[] nums, int target) {
    int leftIndex = 0;
    int rightIndex = nums.length - 1;
    int indexToCheck;
    while (leftIndex <= rightIndex) {
      indexToCheck = (leftIndex + rightIndex) / 2;
      if(nums[indexToCheck] == target)
        return indexToCheck;
      else if(nums[indexToCheck] > target)
        rightIndex = indexToCheck - 1;
      else
        leftIndex = indexToCheck + 1;
    }
    return leftIndex;
  }
}