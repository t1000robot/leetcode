package main.java.easy.firstBadVersion;

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    long leftVersion = 1;
    long rightVersion = n;
    long versionToCheck;
    Solution solution = new Solution();
    while (leftVersion <= rightVersion) {
      versionToCheck = (leftVersion + rightVersion) / 2;
      if (solution.isBadVersion((int) versionToCheck)) {
        rightVersion = versionToCheck - 1;
      } else {
        leftVersion = versionToCheck + 1;
      }
    }
    return (int) leftVersion;
  }
}