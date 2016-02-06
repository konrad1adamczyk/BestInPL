import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by Konrad on 31.01.2016.
 */
public class BestInPLtest1 {
    public static void main (String[] args){

        for (int i =1;i<=10;i++){
            for(int k=1;k<=66;k++){
                int j =(int) ((Math.random() * 5)+1);
//                System.out.println(j);
                long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
                long end = Timestamp.valueOf("2016-01-01 00:00:00").getTime();
                long diff = end - offset + 1;
                Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));

                System.out.println("("+k + "," + i + "," + j +",'Lorem ipsum dolor sit amet, consectetur adipiscing elit. In pulvinar ipsum mauris, ac elementum felis convallis non.','"+rand+"'),");
            }
        }
    }
}
