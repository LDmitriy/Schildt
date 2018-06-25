
package foreach;

public class ForEach {

    public static void main(String[] args) {
        int mas[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mas[i][j] = (i+3)*(j+2);
                System.out.print(mas[i][j]+ " ");
            }
            System.out.println("");
        }
        
        for (int x[]: mas){
            for(int y : x){
                System.out.print(y+ " ");
            }
            System.out.println("");
        }
        
//        int mas1[] = new int[10];  
//        int j =0;
//        for(int i : mas1){           
//            mas1[i]= j++;
//            System.out.print(mas1[i]+" ");
//        }
//        System.out.println(" ");
//        for(int i=0;i<10;i++){
//            System.out.print(mas1[i]+ " ");
//        }
    }  
}
