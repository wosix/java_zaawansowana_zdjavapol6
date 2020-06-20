package strings;

public class TextDuplicate implements StringOperation {
    @Override
    public String modify(String text) {
        String newText = String.format("%s %s", text, text);
        return newText;
    }
}
