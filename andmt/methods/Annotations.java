package andmt.methods;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Annotations  {

    private Points _p;
    public Annotations(Points p) {

        _p=p;
    }

    public int length() {
        return _p.length();
    }

    public String[] txt() {
        return " ".split(" ");
    }

    public float[] xset() {
        return _p.xsets();
    }

    public float[] yset() {
        return _p.ysets();
    }

}
