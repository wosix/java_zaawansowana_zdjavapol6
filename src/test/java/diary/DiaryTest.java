package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary testDiary;
    private List<Entry>entries = new ArrayList<>();

    private class Entry {
        LocalDate data;
        String text;

        public Entry(String text, LocalDate data) {
            this.text = text;
            this.data = data;
        }
    }

    @BeforeEach
    public void setUp() {
        testDiary = new Diary();
    }

    @Test
    public void writeEntry() {
        entries.add(new Entry("to jest test", LocalDate.now()));
        //assertTrue();
    }

}