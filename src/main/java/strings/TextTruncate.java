package strings;

public class TextTruncate implements StringOperation {
    int length;

    TextTruncate(int length) {
        this.length = length;
    }

    @Override
    public String modify(String text) {
        if (text.isEmpty()){
            return "Empty text!";
        }
        if (text.length() < length){
            return "Text is too short!";
        }
        return text.substring(0, length);
    }
}
