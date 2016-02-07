/**
 * Created by Konrad on 06.02.2016.
 */
public class Sledzenie {
    public static void main (String[] args){
        System.out.println("");
        System.out.println("INSERT INTO Sledzenie_urzytkownikow (Id_urzytkownika, Id_sledzonego_urzytkownika)\n" + "VALUES ");

        for (int idUrzytkownika=1;idUrzytkownika<=10;idUrzytkownika++) {

            int iloscSledzonychUrzytkownikow = randBetween(0, 10);
            for(int idSledzonegoUrzytkownika =1; idSledzonegoUrzytkownika<=iloscSledzonychUrzytkownikow; idSledzonegoUrzytkownika++) {
//                ArrayList sledzeniUslugodawcy = new ArrayList();
//                int[] theArray = new int[iloscSledzonychUslugodawcow];
//
//                    for(int i = 0; i < iloscSledzonychUslugodawcow; i++){
//
//                        // Random number 10 through 19
//
//                        theArray[i] = (int)(Math.random()*10)+1;
//
//                        System.out.println();
//                    }
                System.out.print("("+idUrzytkownika + "," + idSledzonegoUrzytkownika +"),");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("INSERT INTO Sledzenie_uslugodawcow (Id_urzytkownika, Id_sledzonego_uslugodawcy)\n" + "VALUES ");

        for (int idUrzytkownika=1;idUrzytkownika<=10;idUrzytkownika++) {

            int iloscSledzonychUslugodawcow = randBetween(0, 66);
            for(int idSledzonegoUslugodawcy =1; idSledzonegoUslugodawcy<=iloscSledzonychUslugodawcow; idSledzonegoUslugodawcy++) {

                System.out.print("("+idUrzytkownika + "," + idSledzonegoUslugodawcy +"),");
            }
            System.out.println("");
        }
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
