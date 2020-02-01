import java.util.Random;

public class Chipotle {
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

    Integer[] cost = new Integer[9];

    public static void main(String[] args) {


        String[][] burritos = new String[25][10];
        for (int i = 0; i < burritos.length; i++) {
            rice_add(burritos[i]);
            meat_add(burritos[i]);
            beans_add(burritos[i]);
            salsa_add(burritos[i]);
            cheese_add(burritos[i]);
            guac_add(burritos[i]);
            queso_add(burritos[i]);
            cream_add(burritos[i]);

            System.out.println(burritos);


        }
    }

        //rice
        public static String rice_add ()
        {
            Random r = new Random();
            int randomNumber = r.nextInt(rice.length);
                rice_add = rice[randomNumber]
        }


        //meat
        public static String meat_add () {
            Random s = new Random();
            int randomNumber1 = s.nextInt(meat.length);
            meat_add = meat[randomNumber1]
        }

        //beans
        public static String beans_add ()
        {
            Random t = new Random();
            int randomNumber2 = t.nextInt(beans.length);
            beans_add = beans[randomNumber2];
        }

        //salsa
        public static String salsa_add () {
            Random u = new Random();
            int randomNumber3 = u.nextInt(salsa.length);
            salsa_add = salsa[randomNumber3];
        }
        //cheese

        public static String cheese_add () {
            Random v = new Random();
            int randomNumber4 = v.nextInt(cheese.length);
            cheese_add = cheese[randomNumber4];
        }
        //guac

        public static String guac_add () {
            Random w = new Random();
            int randomNumber5 = w.nextInt(guac.length);
            guac_add = guac[randomNumber5];
        }

        //queso
        public static String queso_add () {
            Random x = new Random();
            int randomNumber6 = x.nextInt(queso.length);
            queso_add = queso[randomNumber6];
        }

        //cream cheese
        public static String cream_add () {
            Random y = new Random();
            int randomNumber7 = y.nextInt(cheese.length);
            cream_add = cheese[randomNumber7];
        }

}
