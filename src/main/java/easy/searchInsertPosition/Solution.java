package main.java.easy.searchInsertPosition;

class Solution {

  public int searchInsert(int[] nums, int target) {
    float indexToCheck = ((float) nums.length) / 2;
    float indexGap = indexToCheck / 2;
    int resultIndex = Math.round(indexToCheck);
    if (target == 0) {
      return 0;
    }
    if (indexGap < 0.5) {
      if (target <= nums[0]) return 0;
      else return 1;
    }
    if (indexGap >= 0.5 && indexGap < 1.0) {
      if (target <= nums[0]) return 0;
      else if (nums[1] > target) return 1;
      else return 2;
    }
    while (indexGap >= 1.0) {
      resultIndex = Math.round(indexToCheck);
      if (resultIndex > nums.length - 1) return resultIndex - 1;
      if (nums[resultIndex] > target) {
        indexGap = indexToCheck / 2;
        indexToCheck -= indexGap;
      } else if (nums[resultIndex] < target) {
        indexGap = indexToCheck / 2;
        indexToCheck += indexGap;
        if (indexToCheck < 1.0 && indexGap < 1.0) {
          return 0;
        }
      } else if (nums[resultIndex] == target) {
        return resultIndex ;
      }
    }
    return resultIndex;
  }
}
