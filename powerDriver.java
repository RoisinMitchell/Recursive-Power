/*
 ============================================================================
 Name        : powerDriver.java
 Author      : Roisin Mitchell (21193762)
 Description : Power driver
 ============================================================================
 */
public class powerDriver {
    public static void main(String[] args){

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        power myPower = new power();
        int result = myPower.pow(x, y);
        System.out.println(x + "^" + y + " =" + result);
    }

    public static int pow(int x, int y){
        if(y != 0){
            return x * pow(x, (y-1));
        }else{
            return 1;
        }
    }
}
