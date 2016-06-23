package andmt.draw;

import andmt.methods.Point;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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

    public float get_padding() {
        return _padding;
    }

    public void set_padding(float _padding) {
        this._padding = _padding;
        invalidate();
    }

    private float _padding=0;
   // private static final int AcLBar_left=0;
   // private static final int AcLBar_right=1;

    private Point p=new Point();

    public  enum enumaclbar {enlsmall, enlbig, enlorigin};

    public  enumaclbar getStatus() {
        return status;
    }

    public void setStatus(enumaclbar value) {
        this.status = value;
    }

    private  enumaclbar status = enumaclbar.enlorigin;

    public AcLBar(Context context) {
        super(context);
        this.set_color(Color.GREEN);

        invalidate();



    }

    @Override
    public void offset(acenum value) {
        super.offset(value);

        switch (value) {
            case acenum_samll:
               setStatus(enumaclbar.enlsmall);
                break;
            case acenum_big:
               setStatus(enumaclbar.enlbig);
                break;

        }
        invalidate();

    }
    private void drawSmall(){
            float lp=(get_padding()+get_d());



}

    private void drawBig() {
        float lp=(get_padding()+get_d());


    }

    private void drawOrigin() {
        if(get_n1()>0&&get_n2()>0) {
            p.add(0,0);

            p.add(0,get_n1()+get_d());

            p.add(get_d()+get_n2(),get_n1()+get_d());

            p.add(get_d()+get_n2(),get_n1());

            p.add(get_d(),get_n1());

            p.add(get_d(),0);

//
//            p.add(0,get_n1()+get_d());
//            p.add(0,get_n1()+get_d());
//            p.add(get_d()+get_n2(),get_n1()+get_d());
//            p.add(get_d()+get_n2(),get_n1()+get_d());
//            p.add(get_d()+get_n2(),get_n1());
//            p.add(get_d()+get_n2(),get_n1());
//            p.add(get_d(),get_n1());
//            p.add(get_d(),get_n1());
//            p.add(get_d(),0);
//            p.add(get_d(),0);
//            p.add(0,0);
        }else{
            Toast.makeText(getContext(),"cannot empty values n1 ,n2 !",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (getStatus()) {
            case enlsmall:
                drawBig();
                break;
            case enlorigin:
                drawOrigin();
                break;
            case enlbig:
                drawSmall();
                break;
        }


        canvas.drawLines(p.getBarPoints(), paint);



    }
}
