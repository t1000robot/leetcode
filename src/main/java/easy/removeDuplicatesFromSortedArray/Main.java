package main.java.easy.removeDuplicatesFromSortedArray;

class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] inputNums = {0,0,1,1,1,2,2,3,3,4};
    int expectedResult = 5;

    System.out.println(solution.removeDuplicates(inputNums) == expectedResult);
  }
}
