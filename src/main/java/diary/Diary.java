package diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Diary { //TODO | ENTRY VALIDATOR
    private List<Entry> entries = new ArrayList<>();
    LocalDate data;

    private class Entry {
        LocalDate date;
        String text;
    }

    public void writeEntry(String text){
        Entry entry = new Entry();


        //entries.add();
    }

//    public List<String> getEntriesFrom(LocalDate date) {
//
//    }
}
