package diary;

import java.time.LocalDate;
import java.util.List;

public class DiaryApp {
    public static void main(String[] args) {
        Diary myDiary = new Diary();

        myDiary.writeEntry("halo");
        myDiary.writeEntry("co tam");

        System.out.println(myDiary);

        System.out.println(myDiary.getEntriesFrom(LocalDate.now()));

    }
}
