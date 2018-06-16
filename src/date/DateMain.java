package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) throws ParseException {
        Date dateToday = new Date();
        System.out.println(dateToday);

        Date date = new Date(0);
        System.out.println(date);

        // класс Date работает в секундах, если это не удобно,
        // то берем класс Calendar

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateToday);
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        // форматирование
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        // Задаем свой формат вывода
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        // parsing date
        Date newDate = simpleDateFormat.parse("05/12/1985");
        System.out.println(newDate);
    }
}
