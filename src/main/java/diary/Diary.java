package diary;

import strings.StringOperation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.time.LocalTime.now;

public class Diary { //TODO | ENTRY VALIDATOR
    private List<Entry> entries = new ArrayList<>();
    private String text;
    private LocalDate data;

    public Diary() {
    }

    private class Entry {
        LocalDate data;
        String text;

        public Entry(String text, LocalDate data) {
            this.text = text;
            this.data = data;
        }
    }

    public void writeEntry(String text){
        entries.add(new Entry(text, LocalDate.now()));
    }

    public List<String> getEntriesFrom(LocalDate date) {
        List<String> returnList = new ArrayList<>();
        for (int i = 0 ; i < entries.size(); i++){
            if (date.equals(entries.get(i).data)){
                returnList.add(entries.get(i).text);
            }
        }
        return returnList;
    }

    public boolean exists(int i) {
        return true;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "entries=" + entries.get(0).text +
                '}';
    }
}
