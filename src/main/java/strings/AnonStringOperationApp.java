package strings;

public class AnonStringOperationApp {
    public static void main(String[] args) {
        StringOperation truncateText = new StringOperation() {
            @Override
            public String modify(String text) {
                String modified = "Truncated: ";
                if (text.length() < 5){
                    return text;
                }
                return modified + text.substring(0,4);
            }
        };

        StringOperation modifyText = new StringOperation(){
            private static final String TEXT = "Modified: ";
            @Override
            public String modify(String text){
                return TEXT + text;
            }
        };


        System.out.println(truncateText.modify("alan"));
        System.out.println(truncateText.modify("alan ROBERT"));
        System.out.println(modifyText.modify("alan"));
    }
}
