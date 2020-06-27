package strings;

public class TextCensor implements StringOperation {
    String[] forbiddenWords;

    TextCensor(String[] forbiddenWords) {
        this.forbiddenWords = forbiddenWords;
    }

    @Override
    public String modify(String text) {
        int a = 0;
        String rText = "";

        while (a != forbiddenWords.length) {
            //text = text.replaceAll(" " + forbiddenWords[a], "");
            text = text.toLowerCase().replaceAll(forbiddenWords[a], censor(forbiddenWords[a].length()));
            a++;
        }

        String starts = "" + text.charAt(0);
        text = text.replaceAll(starts, starts.toUpperCase());
        return text;
    }

    private String censor(int x) {
        String censor = "";
        for (int i = 0; i < x; i++) {
            censor += "*";
        }
        return censor;
    }
}
