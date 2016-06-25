package andmt.methods;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Utils  {


    public static float[] al2floats(ArrayList al) {
        int s=al.size();
        float[] f = new float[s];
        for (int i = 0; i <s ; i++) {
            f[i]=(float)al.get(i);
        }

        return f;


    }
}
