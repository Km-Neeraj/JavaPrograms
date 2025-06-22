import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class LocalDateTimeEx {

	public static void main(String[] args) {
		//since Java 1
		Date date=new Date();
		System.out.println(date);
		
		//since Java 8
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate ld;
		ld = LocalDate.ofYearDay(2005, 86); 
		System.out.println(ld);
		
		ld = LocalDate.of(2013, Month.AUGUST, 10); 
		System.out.println(ld);
		
		LocalTime lt;
		lt=  LocalTime.of(22, 33,55,287653); 
		System.out.println(lt);
		
		lt=LocalTime.ofSecondOfDay(4503); 
		System.out.println(lt);
		
		lt=LocalTime.now();
		lt=lt.plus(5, ChronoUnit.HOURS);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		// Jump to 25 hours and 3 minutes into the future
		LocalDateTime inTheFuture = ldt.plusHours(25).plusMinutes(3);
		System.out.println(inTheFuture);
		
		// We could do the same on localTime or localDate
		LocalDate lld=ldt.toLocalDate().plusMonths(2);
		System.out.println(lld);
		System.out.println(lld.getDayOfWeek());
		
	}

}
