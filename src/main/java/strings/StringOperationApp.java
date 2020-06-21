package strings;

public class StringOperationApp {
    public static void main(String[] args) {
        TextUpperCase textUpperCase = new TextUpperCase();
        String before = "adam";
        String after = textUpperCase.modify(before);
        System.out.println(String.format("Before: %s; after: %s", before, after));


        StringOperation stringOperation = new TextUpperCase();
        System.out.println(stringOperation.modify("karol"));

        stringOperation = new TextDuplicate();
        System.out.println(stringOperation.modify("jan"));

        stringOperation = new RemoveALetters();
        System.out.println(stringOperation.modify("janek i karolek  AAA"));

        stringOperation = new TextTruncate(5);
        System.out.println(stringOperation.modify("hej boli mnie glowa"));
        System.out.println(stringOperation.modify(""));
        System.out.println(stringOperation.modify("hej"));

        stringOperation = new TextReverse();
        System.out.println(stringOperation.modify("Pomocy"));

        stringOperation = new TextCensor(new String[]{"mnie", "działa"});
        System.out.println(stringOperation.modify("U mnie to działa."));
    }


    public static void printModification(String text, StringOperation operation){
        String modified = operation.modify(text);
        String message = String.format("Before: %s; after: %s",text, modified);

        System.out.println(message);
    }
}
