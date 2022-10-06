package main.java.easy.removeElement;

class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] inputArray = {0,1,2,2,3,0,4,2};

    System.out.println(solution.removeElement(inputArray, 2) == 5);
  }
}
