
package zadacha1;

public class Zadacha1 {

    public static void main(String[] args) {
        int a=1,b=2,c=3;
        if (a<b){
            System.out.println("а меньше б");
            if (a<c){
                System.out.println("а меньше c");
            }
            else {
               System.out.println("а больше c"); 
            }
        }
        else{
            System.out.println("а больше б");
        }
    }    
}
