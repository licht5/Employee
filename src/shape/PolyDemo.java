package shape;

import sun.security.provider.SHA;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class PolyDemo {
    public static void main(String[] args){
        Poly demo=new Poly();
        Shape [] shapes=new Shape[9];
        for (int i=0;i<shapes.length;i++){
            shapes[i]=demo.createshape();
            shapes[i].draw();
        }
    }
}
