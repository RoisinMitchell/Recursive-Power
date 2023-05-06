/*
 ============================================================================
 Name        : power.java
 Author      : Roisin Mitchell (21193762)
 Description : Method to calculate (x^y) recursively
 ============================================================================
 */
public class power {
    public static int pow(int x, int y){
        if(y != 0){
            return x * pow(x, (y-1));
        }else{
            return 1;
        }
    }
}
