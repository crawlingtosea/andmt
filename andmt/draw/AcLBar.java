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
<<<<<<< HEAD
    private Point p=new Point();

    public AcLBar(Context context) {
        super(context);
       // this.set_color(Color.GREEN);
       // setStatus(offset_normal);



    }

    @Override
    public void offset(int value) {
        super.offset(value);

        switch (value) {
            case offset_small:
               setStatus(offset_small);
                break;
            case offset_big:
               setStatus(offset_big);
                break;

        }
        invalidate();

    }
=======


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

    private void drawSmall(){
        if(get_n1()>0&&get_n2()>0) {
            pen.reset();
            pen.moveTo(0,0);
            pen.lineTo(0,get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1());
            pen.lineTo(get_d(),get_n1());
            pen.lineTo(get_d(),0);
            pen.close();
>>>>>>> 67403f1acd174796ece5483ec4a5dfb0b49e19a3

    @Override
    public void drawSmall() {
        super.drawSmall();
        if (get_n1() > 0 && get_n2() > 0) {
            if(p.length()!=0){
                p.destroy();
            }

<<<<<<< HEAD
            p.add(0,0);
            p.add(0,get_n1()+get_d());
            p.add(get_d()+get_n2(),get_n1()+get_d());
            p.add(get_d()+get_n2(),get_n1());
            p.add(get_d(),get_n1());
            p.add(get_d(), 0);
=======
        }else{
            Toast.makeText(getContext(),"cannot empty values n1 ,n2 !",Toast.LENGTH_LONG).show();
        }
>>>>>>> 67403f1acd174796ece5483ec4a5dfb0b49e19a3




        }
    }

    @Override
    public void drawNormal() {
        super.drawNormal();
        if(get_n1()>0&&get_n2()>0) {
<<<<<<< HEAD
            if(p.length()!=0){
                p.destroy();
            }
            p.add(0,0);
            p.add(0,get_n1()+get_d());
            p.add(get_d()+get_n2(),get_n1()+get_d());
            p.add(get_d()+get_n2(),get_n1());
            p.add(get_d(),get_n1());
            p.add(get_d(),0);
=======
            pen.reset();
            pen.moveTo(0,0);
            pen.lineTo(0,get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1()+get_d());
            pen.lineTo(get_d()+get_n2(),get_n1());
            pen.lineTo(get_d(),get_n1());
            pen.lineTo(get_d(),0);
            pen.close();
>>>>>>> 67403f1acd174796ece5483ec4a5dfb0b49e19a3

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


<<<<<<< HEAD
        canvas.drawLines(p.getShapePoints(), paint);
        System.out.println(p.length()+"////////////");
=======
        canvas.drawPath(pen,paint);

>>>>>>> 67403f1acd174796ece5483ec4a5dfb0b49e19a3

    }
}
