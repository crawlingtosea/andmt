package andmt.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Administrator on 2016/6/22.
 */
public class AcLBar extends Andmt {
    public AcLBar(Context context) {
        super(context);
        this.set_color(Color.GREEN);
        invalidate();



    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0,0,500,500,paint);


    }
}
