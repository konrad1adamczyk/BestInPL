/**
 * Created by Konrad on 31.01.2016.
 */
import java.sql.Timestamp;
import java.util.GregorianCalendar;

public class RandomDateOfBirth {

    public static void main(String[] args) {

        String nowaData = getRandomBirthdate();
        System.out.println(nowaData);

        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
        long diff = end - offset + 1;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));

        System.out.println(rand);
    }

    public static String getRandomBirthdate(){
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1995, 2016);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

//        System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));

        String data = gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);

        return data;
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}