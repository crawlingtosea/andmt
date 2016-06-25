package andmt.draw;


import andmt.methods.Annotations;
import andmt.methods.Points;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
    private int m=100;
    Paint pt;
    Annotations an;

    public int getStatus() {
        return status;
    }

    public void setStatus(int value) {
        this.status = value;
        invalidate();
    }

    private  int status ;

    private Points p;
    public AcLBar(Context context) {
        super(context);
         pen=new Path();
        p=new Points();
    }

    @Override
    public void annotate() {
        super.annotate();

     invalidate();




    }

    @Override
    public void drawNormal() {
        super.drawNormal();
        if(get_n1()>0&&get_n2()>0) {
            pen.reset();
            pen.moveTo(0+m,0+m);
            pen.lineTo(0+m,get_n1()+get_d()+m);
            pen.lineTo(get_d()+get_n2()+m,get_n1()+get_d()+m);
            pen.lineTo(get_d()+get_n2()+m,get_n1()+m);
            pen.lineTo(get_d()+m,get_n1()+m);
            pen.lineTo(get_d()+m,0+m);
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

        p.add(0+m,0+m);
        p.add(0+m,get_n1()+get_d()+m);
        p.add(get_d()+get_n2()+m,get_n1()+get_d()+m);
        p.add(get_d()+get_n2()+m,get_n1()+m);
        p.add(get_d()+m,get_n1()+m);
        p.add(get_d()+m,0+m);
        pt=new Paint();
        pt.setColor(Color.RED);
        pt.setStrokeWidth(2);
        pt.setAntiAlias(true);
        pt.setTextSize(40);

        an=new Annotations(pt,p,canvas);

       an.autoAddText();



            an.drawAnnotationById(2);




    }
}
