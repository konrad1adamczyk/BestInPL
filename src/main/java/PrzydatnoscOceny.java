/**
 * Created by Konrad on 06.02.2016.
 */
public class PrzydatnoscOceny {
    public static void main (String[] args){



        for (int idOceny=1;idOceny<=664;idOceny++) {
            if(idOceny%90==0){
                System.out.println("");
                System.out.println("INSERT INTO Przydatnosc_oceny (Id_oceny, Id_urzytkownika)\n" + "VALUES ");
            }
            int iloscOceniajacychUrzytkownikow = randBetween(0, 10);
            for(int idUrzytkownika =1; idUrzytkownika<=iloscOceniajacychUrzytkownikow; idUrzytkownika++) {
                System.out.print("("+idOceny + "," + idUrzytkownika +"),");
            }
            System.out.println("");

        }
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
