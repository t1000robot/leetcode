package main.java.easy.searchInsertPosition;

class Solution {

  public int searchInsert(int[] nums, int target) {
    int arrayLength = nums.length;
    int indexToCheck = arrayLength / 2;
    int indexGap = indexToCheck / 2;
    int resultIndex = indexToCheck;
    if (target == 0) {
      return 0;
    }
    if (resultIndex == 0) {
      if (target <= nums[0]) return 0;
      else return 1;
    }
    while (indexGap >= 1) {
      resultIndex = indexToCheck;
      if (resultIndex > arrayLength - 1) return resultIndex;
      if (nums[resultIndex] > target) {
        indexGap = indexToCheck / 2;
        indexToCheck -= indexGap;
      } else if (nums[resultIndex] < target) {
        indexGap = indexToCheck / 2;
        indexToCheck += indexGap;
        if (indexToCheck < 1 && indexGap < 1) {
          return 0;
        }
      } else if (nums[resultIndex] == target) {
        return resultIndex ;
      }
    }
    if (nums[resultIndex] > target && nums[resultIndex - 1] == target) {
      return --resultIndex;
    } else if (nums[resultIndex] > target) {
      return resultIndex;
    } else if (arrayLength > resultIndex + 1 && nums[resultIndex] < target && nums[resultIndex + 1] < target) {
      return resultIndex + 2;
    } else if (nums[resultIndex] < target) {
      return ++resultIndex;
    } else if (nums[resultIndex] == target) {
      return resultIndex;
    }
    return resultIndex;
  }
}
