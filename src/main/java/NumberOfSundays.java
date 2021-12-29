import java.time.LocalDate;
import java.util.Calendar;

public class NumberOfSundays {
    static void countSundays() {
        int count = 0;
        LocalDate now = LocalDate.now();
        Calendar startDate = Calendar.getInstance();
        int year = now.getYear();
        int month = now.getMonth().getValue();
        startDate.set(year, month, 1);
        System.out.println(startDate);
        for (int day = 1; day <= startDate.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
            startDate.set(year, month, day);
//            System.out.println(startDate.get(Calendar.DAY_OF_WEEK));
            System.out.println(startDate.getTime());

            if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
            }
        }
        System.out.println(count);;
    }
}
