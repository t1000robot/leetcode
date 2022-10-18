package main.java.easy.searchInsertPosition;

class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] inputArray = {1,3,5,6,8,12,13,16};
    int target = 8;
    int expectedResult = 4;
    System.out.println(solution.searchInsert(inputArray, target) == expectedResult);
  }
}
