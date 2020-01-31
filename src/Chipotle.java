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
        cheese[0] = "yes";
        cheese[1] = "no";

        String[] guac = new String[2];
        guac[0] = "yes";
        guac[1] = "no";

        String[] queso = new String[2];
        queso[0] = "yes";
        queso[1] = "no";

        String[] cream = new String[2];
        cream[0] = "yes";
        cream[1] = "no";

    /*String[] burrito1 = new String[9];
    String[] burrito2 = new String[9];
    String[] burrito3 = new String[9];
    /*ArrayList<String> burrito1 = new ArrayList<>();
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
        String[][] burritos = new String[25][25];
        for (int i = 0; i < burritos.length; i++) {
            Random r = new Random();
            int randomNumber = r.nextInt(rice.length);
            String rice_add = rice[randomNumber];


    }
            public static String rice_add(){
                rice_add = rice[randomNumber];

    }


}

//burrito 1
//rice
        /*for(int i=0; i<rice.length; i++){
            Random r = new Random();
            int randomNumber = r.nextInt(rice.length);
            String rice_add = rice[randomNumber];
        }

        //meat
        for(int j=0; j<meat.length; j++){
        Random s=new Random();
        int randomNumber1=s.nextInt(meat.length);
        System.out.print(meat[randomNumber1]);}
        //beans
        for(int k=0; k<rice.length; k++){
        Random t=new Random();
        int randomNumber2=t.nextInt(beans.length);
        System.out.print(beans[randomNumber2]);}
        //salsa
        for(int l=0; l<rice.length; l++)
        Random u=new Random();
        int randomNumber3=u.nextInt(salsa.length);
        System.out.print(salsa[randomNumber3]);
        //cheese
        for(int i=0; i<rice.length; i++)
        Random v=new Random();
        int randomNumber4=v.nextInt(cheese.length);
        System.out.print(cheese[randomNumber3]);
        //guac
        for(int i=0; i<rice.length; i++)
        Random w=new Random();
        int randomNumber5=w.nextInt(guac.length);
        System.out.print(guac[randomNumber5]);
        for(int i=0; i<rice.length; i++)
        //queso
            for(int i=0; i<rice.length; i++)
        Random x=new Random();
        int randomNumber6=x.nextInt(queso.length);
        System.out.print(queso[randomNumber6]);
        //cream cheese
        for(int i=0; i<rice.length; i++)
        Random y=new Random();
        int randomNumber7=y.nextInt(cheese.length);
        System.out.print(cheese[randomNumber7]);*?
















