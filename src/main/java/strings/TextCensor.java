package strings;

public class TextCensor implements StringOperation{
    String[] forbiddenWords;

    TextCensor(String[] forbiddenWords) {
        this.forbiddenWords = forbiddenWords;
    }

    @Override
    public String modify(String text) {
        if (text.matches(String.valueOf(forbiddenWords))){
            text.replaceAll(String.valueOf(forbiddenWords),"");
        }
        return text;
    }
}
