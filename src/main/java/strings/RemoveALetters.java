package strings;

public class RemoveALetters implements StringOperation {
    @Override
    public String modify(String text) {

        return text.replace("a","").replace("A","");
    }
}
