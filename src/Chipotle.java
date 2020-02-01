import java.util.Random;

public class Chipotle {
    public static String[] rice = new String[3];


    public static String[] meat = new String[7];


    public static String[] beans = new String[3];


    public static String[] salsa = new String[4];


    public static String[] cheese = new String[2];


    public static String[] guac = new String[2];


    public static String[] queso = new String[2];


    public static String[] cream = new String[2];


    Integer[] cost = new Integer[9];

    public static void main(String[] args) {
        //rice
        rice[0] = "white";
        rice[1] = "brown";
        rice[2] = "none";
        //meat
        meat[0] = "chicken";
        meat[1] = "steak";
        meat[2] = "carnidas";
        meat[3] = "chorizo";
        meat[4] = "sofritas";
        meat[5] = "tofurkey";
        meat[6] = "none";
        //beans
        beans[0] = "pinto";
        beans[1] = "black";
        beans[2] = "none";
        //salsa
        salsa[0] = "mild";
        salsa[1] = "medium";
        salsa[2] = "hot";
        salsa[3] = "none";
        //cheese
        cheese[0] = "cheese";
        cheese[1] = "no cheese";
        //guac
        guac[0] = "guac";
        guac[1] = "no guac";
        //queso
        queso[0] = "queso";
        queso[1] = "no queso";
        //sour cream
        cream[0] = "sour cream";
        cream[1] = "no sour cream";


        String[][] burritos = new String[25][9];
        for (int i = 0; i < burritos.length; ++i) {
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
    public static void rice_add(String[] burrito) {

        Random r = new Random();


        int randomNumber = r.nextInt(rice.length);
        String rice_add = rice[randomNumber];
    }


    //meat
    public static void meat_add(String[] burrito) {
        Random s = new Random();
        int randomNumber1 = s.nextInt(meat.length);
        String meat_add = meat[randomNumber1];
    }

    //beans
    public static void beans_add(String[] burrito) {
        Random t = new Random();
        int randomNumber2 = t.nextInt(beans.length);
        String beans_add = beans[randomNumber2];
    }

    //salsa
    public static void salsa_add(String[] burrito) {
        Random u = new Random();
        int randomNumber3 = u.nextInt(salsa.length);
        String salsa_add = salsa[randomNumber3];
    }
    //cheese

    public static void cheese_add(String[] burrito) {
        Random v = new Random();
        int randomNumber4 = v.nextInt(cheese.length);
        String cheese_add = cheese[randomNumber4];
    }
    //guac

    public static void guac_add(String[] burrito) {
        Random w = new Random();
        int randomNumber5 = w.nextInt(guac.length);
        String guac_add = guac[randomNumber5];
    }

    //queso
    public static void queso_add(String[] burrito) {
        Random x = new Random();
        int randomNumber6 = x.nextInt(queso.length);
        String queso_add = queso[randomNumber6];
    }

    //cream cheese
    public static void  cream_add(String[] burrito) {
        Random y = new Random();
        int randomNumber7 = y.nextInt(cheese.length);
        String cream_add = cheese[randomNumber7];
    }


}