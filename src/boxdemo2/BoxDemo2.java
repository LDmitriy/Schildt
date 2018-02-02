
package boxdemo2;

/**
 *
 * @author Noga
 */

public class BoxDemo2 {
    
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        mybox1.width = 10;
        mybox1.height = 10;
        mybox1.depth = 10;
        
        mybox2.width = 11;
        mybox2.height = 13;
        mybox2.depth = 15;
        
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println(vol);
        
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println(vol);
    }
    
}
