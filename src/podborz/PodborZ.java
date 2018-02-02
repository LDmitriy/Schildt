
package podborz;


public class PodborZ {

    public static void main(String[] args) {
        int rezult = 0;
        int j = 0;
        int nums [] = {2,3,5,7,9,11,13,15};
        for (int x : nums){
            for (int y : nums){
                for (int z : nums){
                    rezult = x+y+z;
                    if (rezult==30){
                        j++;
                        System.out.println("Вариант " + j);
                        System.out.print(x + " " );
                        System.out.print(y + " ");
                        System.out.println(z);
                    }
                }
            }
        }
        System.out.println("test");
              
    }
    
}
