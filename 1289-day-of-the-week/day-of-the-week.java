import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dow = date.getDayOfWeek(); // MONDAY=1 ... SUNDAY=7
        
        return days[dow.getValue() % 7]; // shift so Sunday is index 0
    }
}
