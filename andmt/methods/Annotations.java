package andmt.methods;

import andmt.draw.Andmt;
import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.*;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Annotations   {

    private Points ps;
    private ArrayList<String> txtset = new ArrayList<String>();
    private int couter=0;
    private Canvas canvas;
    private Paint pt;
    public Annotations(Paint paint, Points p, Canvas can) {
        this.pt = paint;
        this.ps =p;
        this.canvas=can;
    }

    public int length() {
        return ps.length();
    }
    public int size(){return ps.xsets().length;};

    public String[] txtset() {
        return Utils.al2Strings(txtset);
    }

    public float[] xset() {
        return ps.xsets();
    }

    public float[] yset() {
        return ps.ysets();
    }

   public void addtext(String str) {
       txtset.add("@"+(couter++)+": "+str);
   }

    public void autoAddText() {
        for (int i = 0; i <xset().length ; i++) {
            txtset.add("@P"+(couter++)+", "+xset()[i]+" , "+yset()[i]);
        }

    }

    public String getTextById(int id) {
        return txtset.get(id);
    }

    public void drawAnnotationById(int id) {
        canvas.drawText(getTextById(id),xset()[id],yset()[id], pt);

    }

}
