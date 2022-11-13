package main.java.otherProblems.findPrefix;

public class FindPrefix {

    public static void main(String[] args) {

        String[] input = new String[]{"прe", "предлог", "предложение", "прелюдия", "предмет"};

        System.out.println(findPrefix(input));

    }

    private static String findPrefix(String[] input) {

        StringBuilder resultBuilder = new StringBuilder();

        for (int currentPrefixLetter = 0; currentPrefixLetter < 30; currentPrefixLetter++) {
            String letterToCheck = "";
            try {
                letterToCheck = input[0].substring(currentPrefixLetter, currentPrefixLetter + 1);
            } catch (StringIndexOutOfBoundsException e) {
                e.printStackTrace();
                return resultBuilder.toString();
            }
            for (String element : input) {
                String currentWordLetter = element.substring(currentPrefixLetter, currentPrefixLetter + 1);
                if (!currentWordLetter.equals(letterToCheck)) {
                    return resultBuilder.toString();
                }
            }
            resultBuilder.append(letterToCheck);
        }
        return resultBuilder.toString();
    }
}
