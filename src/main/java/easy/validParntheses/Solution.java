package main.java.easy.validParntheses;

import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    int arrayLength = s.length();
    if (arrayLength <= 1 || arrayLength % 2 != 0) return false;
    String[] inputArray = s.split("");
    Stack<String> stack = new Stack<>();
    if (inputArray[0].matches("\\)|\\}|\\]")) {
      return false;
    } else {
      for (int index = 0; index < arrayLength; index++) {
        if (stack.size() == 0) {
          stack.addElement(inputArray[index]);
          continue;
        }
        String currentArrayLetter = inputArray[index];
        switch (stack.peek()) {
          case "{" : {
            if (currentArrayLetter.equals("}")) {
              stack.pop();
              continue;
            } else if (currentArrayLetter.matches("\\(|\\{|\\[")) {
              stack.addElement(currentArrayLetter);
              continue;
            } else return false;
          }
          case "(" : {
            if (currentArrayLetter.equals(")")) {
              stack.pop();
              continue;
            } else if (currentArrayLetter.matches("\\(|\\{|\\[")) {
              stack.addElement(currentArrayLetter);
              continue;
            } else return false;
          }
          case "[" : {
            if (currentArrayLetter.equals("]")) {
              stack.pop();
            } else if (currentArrayLetter.matches("\\(|\\{|\\[")) {
              stack.addElement(currentArrayLetter);
            } else return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }
}