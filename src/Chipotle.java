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

    public static void main(String[] args) {

        //ingredient arrays
        //rice
        rice[0] = "white";
        rice[1] = "brown";
        rice[2] = "none";
        Random r = new Random();
        int index_rice =  r.nextInt(rice.length);
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

//putting ingredients in

        String[] burritos = new String[25];

        for(int i = 0; i < burritos.length; i++)
        {//adds random ingredient to final ingredient product
            double burrito_cost = 3.00;
            String rice_product = rice_add(rice);
            if(rice_product.equals("none")){

            }
                else{
                    burrito_cost += 0.5;
            }
            String meat_product = meat_add(meat);
            if(meat_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String beans_product = beans_add(beans);
            if(beans_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String salsa_product = salsa_add(salsa);
            if(salsa_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String cheese_product = cheese_add(cheese);
            if(cheese_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String guac_product = guac_add(guac);
            if(guac_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String queso_product = queso_add(queso);
            if(queso_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            String cream_product = cream_add(cream);
            if(cream_product.equals("none")){

            }
            else{
                burrito_cost += 0.5;
            }
            // concatenate products together for making burrito
            String burrito = rice_product + "," + meat_product +"," + beans_product + "," + salsa_product + "," + cheese_product+ ","
                    + guac_product + "," +  queso_product +"," + cream_product +',' + burrito_cost;

            burritos[i] = burrito;

        }

//printing out ingredients for each burrito
        // j+1 added numbering to each burrito

        for (int j = 0; j < burritos.length; j++) {
            System.out.println("burrito " + (j+1)+ " "+ burritos[j]);
        }

    }

    //methods for randomly picking each ingredients
    //rice -
    public static String rice_add(String[]rice) {

        Random r = new Random();
        int randomNumber = r.nextInt(rice.length);
        String rice_add = rice[randomNumber];
        return rice_add;
    }


    //meat
    public static String meat_add(String[] meat) {
        Random s = new Random();
        int randomNumber1 = s.nextInt(meat.length);
        String meat_add = meat[randomNumber1];
        return meat_add;
    }

    //beans
    public static String beans_add(String[] beans) {
        Random t = new Random();
        int randomNumber2 = t.nextInt(beans.length);
        String beans_add = beans[randomNumber2];
        return beans_add;
    }

    //salsa
    public static String salsa_add(String[] salsa) {
        Random u = new Random();
        int randomNumber3 = u.nextInt(salsa.length);
        String salsa_add = salsa[randomNumber3];
        return salsa_add;
    }
    //cheese

    public static String cheese_add(String[] cheese) {
        Random v = new Random();
        int randomNumber4 = v.nextInt(cheese.length);
        String cheese_add = cheese[randomNumber4];
        return cheese_add;
    }
    //guac

    public static String guac_add(String[] guac) {
        Random w = new Random();
        int randomNumber5 = w.nextInt(guac.length);
        String guac_add = guac[randomNumber5];
        return guac_add;
    }

    //queso
    public static String queso_add(String[] queso) {
        Random x = new Random();
        int randomNumber6 = x.nextInt(queso.length);
        String queso_add = queso[randomNumber6];
        return queso_add;
    }

    //cream cheese
    public static String cream_add(String[] cheese) {
        Random y = new Random();
        int randomNumber7 = y.nextInt(cheese.length);
        String cream_add = cheese[randomNumber7];
        return cream_add;
    }


}

