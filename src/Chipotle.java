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

        Random random = new Random();
        int random_ingredient = random.nextInt(rice.length);


    }


}





