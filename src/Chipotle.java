import java.util.ArrayList;
import java.util.Random;

public class Chipotle {

    public static void main(String[] args) {

        String[] rice = new String[3];
        rice[0] = "white";
        rice[1] = "brown";
        rice[2] = "none";
        String[] meat = new String[7];
        meat[0] = "chicken";
        meat[1] = "steak";
        meat[2] = "carnidas";
        meat[3] = "chorizo";
        meat[4] = "sofritas";
        meat[5] = "tofurkey";
        meat[6] = "none";
        String[] beans = new String[3];
        beans[0] = "pinto";
        beans[1] = "black";
        beans[2] = "none";
        String[] salsa = new String[4];
        salsa[0] = "mild";
        salsa[1] = "medium";
        salsa[2] = "hot";
        salsa[3] = "none";

        String[] cheese = new String[2];
        cheese[0] = "cheese";
        cheese[1] = "no cheese";

        String[] guac = new String[2];
        guac[0] = "guac";
        guac[1] = "no guac";

        String[] queso = new String[2];
        queso[0] = "queso";
        queso[1] = "no queso";

        String[] cream = new String[2];
        cream[0] = "sour cream";
        cream[1] = "no sour cream";

        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito2 = new ArrayList<>();
        ArrayList<String> burrito3 = new ArrayList<>();
       /* ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();
        ArrayList<String> burrito1 = new ArrayList<>();*/


        //burrito 1
        //rice
        for (int i = 0; i < rice.length; i++) {

            Random r = new Random();
            int randomNumber = r.nextInt(rice.length);
            String rice_add = rice[randomNumber];
            burrito1.add(rice_add);
        }
        //meat
        for (int j = 0; j < meat.length; j++) {
            Random s = new Random();
            int randomNumber1 = s.nextInt(meat.length);
            String meat_add = meat[randomNumber1];
            burrito1.add(meat_add);
        }

        //beans
        for (int k = 0; k < meat.length; k++) {
            Random t = new Random();
            int randomNumber2 = t.nextInt(beans.length);
            String  bean_add = beans[randomNumber2];
            burrito1.add(bean_add);
        }
        //salsa
        for (int l = 0; l < meat.length; l++) {
            Random u = new Random();
            int randomNumber3 = u.nextInt(salsa.length);
            String salsa_add = salsa[randomNumber3];
            burrito1.add(salsa_add);
        }
        //cheese
        for (int m = 0; m < meat.length; m++) {
            Random v = new Random();
            int randomNumber4 = v.nextInt(cheese.length);
            String cheese_add = cheese[randomNumber4];
            burrito1.add(cheese_add);
        }
        //guac
        for (int n = 0; n < meat.length; n++) {
            Random w = new Random();
            int randomNumber5 = w.nextInt(guac.length);
            String guac_add = guac[randomNumber5];
            burrito1.add(guac_add);
        }
        //queso
        for (int o = 0; o < meat.length; o++) {
            Random x = new Random();
            int randomNumber6 = x.nextInt(queso.length);
            String queso_add = queso[randomNumber6];
            burrito1.add(queso_add);
        }
        //cream cheese
        for (int p = 0; p < meat.length; p++) {
            Random y = new Random();
            int randomNumber7 = y.nextInt(cheese.length);
            String cream_add = cheese[randomNumber7];
            burrito1.add(cream_add);
        }

        System.out.println(burrito1);
    }
}
















