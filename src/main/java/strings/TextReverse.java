package strings;

public class TextReverse implements StringOperation {
    @Override
    public String modify(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;
    }
}
