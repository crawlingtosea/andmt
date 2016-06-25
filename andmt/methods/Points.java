package andmt.methods;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Points {

    private ArrayList<Float> xpset = new ArrayList<Float>();
    private ArrayList<Float> ypset = new ArrayList<Float>();
    private ArrayList<Float> pset = new ArrayList<Float>();


    public void add(float xpos, float ypos) {
        xpset.add(xpos);
        ypset.add(ypos);
        pset.add(xpos);
        pset.add(ypos);
    }

    public float[] xsets() {


    return Utils.al2floats(xpset);

    }

    public float[] ysets() {
        return Utils.al2floats(ypset);
    }

    public int length() {
        return pset.size();
    }



    public void clear() {
        if (length() > 0) {
            for (int i = 0; i <length() ; i++) {
                pset.remove(i);
            }
        }

        for (int i = 0; i <xpset.size() ; i++) {
            xpset.remove(i);
        }

        for (int j = 0; j <ypset.size() ; j++) {
            ypset.remove(j);
        }

    }

}
