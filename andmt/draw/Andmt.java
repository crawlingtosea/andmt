package andmt.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/6/22 0022.
 */
public class Andmt extends View {
    protected Paint paint;
    protected Canvas canvas;

    public int get_color() {
        return _color;
    }

    public void set_color(int _color) {
        this._color = _color;
        invalidate();
    }

    private int _color=Color.RED;

    public int get_StrokeWidth() {
        return _strokeWidth;

    }

    public void set_StrokeWidth(int strokeWidth) {
        this._strokeWidth = strokeWidth;
       invalidate();
    }

    private int _strokeWidth=3;



    public Andmt(Context context) {
        super(context);
        paint = new Paint();
        canvas = new Canvas();
        init();

    }

    private void init() {
        paint.setColor(get_color());
        paint.setStrokeWidth(get_StrokeWidth());
        paint.setAntiAlias(true);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
    }
}
