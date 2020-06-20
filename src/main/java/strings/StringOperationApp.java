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
    }


    public static void printModification(String text, StringOperation operation){
        String modified = operation.modify(text);
        String message = String.format("Before: %s; after: %s",text, modified);

        System.out.println(message);
    }
}
