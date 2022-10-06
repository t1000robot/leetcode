package main.java.easy.searchInsertPosition;

class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] inputArray = {1, 3};
    int target = 3;
    int expectedResult = 1;
    System.out.println(solution.searchInsert(inputArray, target) == expectedResult);
  }
}
