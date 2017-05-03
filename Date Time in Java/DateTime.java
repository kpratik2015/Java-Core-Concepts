import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
	public static void main( String[] args ){

		Date date = new Date();
		System.out.println(date);

		GregorianCalendar gc = new GregorianCalendar(2010, 5, 15);
		gc.add(GregorianCalendar.DATE, 1);

		Date date1 = gc.getTime();
		System.out.println(date1);

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(date1));

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate ld = LocalDate.of(2010, 5, 15);
		System.out.println(ld);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf.format(ld));

	}
}