package andmt.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/6/22 0022.
 */
public abstract class Andmt extends View {
    protected Paint paint;
    protected Canvas canvas;
    protected final int scale=10;
    public int get_color() {
        return _color;
    }

    public void set_color(int _color) {
        this._color = _color;

    }

    private int _color=Color.RED;

    public int get_StrokeWidth() {
        return _strokeWidth;

    }

    public void set_StrokeWidth(int strokeWidth) {
        this._strokeWidth = strokeWidth;

    }

    private int _strokeWidth=3;

    public int get_d() {
        return _d*scale;
    }

    public void set_d(int _d) {
        this._d = _d;
    }

    //paiµÄºñ¶È
    private int _d=1;

    public int getStatus() {
        return status;
    }

    public void setStatus(int value) {
        this.status = value;

    }

    private  int status ;
    public static final int offset_small=0;
    public static final int offset_big=1;
    public static final int offset_normal=2;





    public static  enum acenum{acenum_samll,acenum_big;}

    public Andmt(Context context) {
        super(context);
        paint = new Paint();
        canvas = new Canvas();
        init();

    }

    public void startDraw() {
        invalidate();
    }

    private void init() {
        paint.setColor(get_color());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(get_StrokeWidth());
        paint.setAntiAlias(true);


    }

    public void move(int xpos,int ypos) {
        this.setX(xpos);
        this.setY(ypos);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
    }

    public void offset(int value) {

    }

    public void drawNormal() {

    }

    public void drawSmall() {


    }

    public void drawBig() {

    }
}
