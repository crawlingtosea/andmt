package andmt.draw;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/6/22.
 */
public class AcLBar extends Andmt {
    public float get_n1() {
        return _n1;
    }
    public void set_n1(float _n1) {
        this._n1 = _n1;
    }
    public float get_n2() {
        return _n2;
    }
    public void set_n2(float _n2) {
        this._n2 = _n2;
    }
    private float _n1=0;
    private float _n2=0;






    public static final int offset_small=0;
    public static final int offset_big=1;
    public static final int offset_normal=2;




    public int getStatus() {
        return status;
    }

    public void setStatus(int value) {
        this.status = value;
        invalidate();
    }

    private  int status ;

    public AcLBar(Context context) {
        super(context);
         pen=new Path();
    }



    @Override
    public void drawNormal() {
        super.drawNormal();
        if(get_n1()>0&&get_n2()>0) {


            pen.reset();
            pen.moveTo(0,0);
            pen.lineTo(0,get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1());
            pen.lineTo(get_d(),get_n1());
            pen.lineTo(get_d(),0);
            pen.close();


        }else{
            Toast.makeText(getContext(),"cannot empty values n1 ,n2 !",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void drawBig() {
        super.drawBig();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (getStatus()) {
            case offset_big:
                drawBig();
                break;
            case offset_normal:
                drawNormal();
                break;
            case offset_small:
                drawSmall();
                break;
        }


        canvas.drawPath(pen,paint);


    }
}
