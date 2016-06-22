package andmt.draw;

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
    private float[] f=new float[]{};

    protected static enum enum_AcLBar{enl_left,enl_right,enl_origin};

    public enum_AcLBar get_enum_aclbar() {
        return _enum_aclbar;
    }

    public void set_enum_aclbar(enum_AcLBar _enum_aclbar) {
        this._enum_aclbar = _enum_aclbar;
    }

    private enum_AcLBar _enum_aclbar=enum_AcLBar.enl_origin;

    public AcLBar(Context context) {
        super(context);
        this.set_color(Color.GREEN);

        invalidate();



    }

    @Override
    public void clone2Shape(ACENUM value) {
        super.clone2Shape(value);

        switch (value) {
            case acenum_left:
               set_enum_aclbar(enum_AcLBar.enl_left);
                break;
            case acenum_right:
               set_enum_aclbar(enum_AcLBar.enl_right);
                break;

        }
        invalidate();

    }
    private void drawRight(){
            float lp=(get_padding()+get_d());
            f=new float[]{0,0,0,get_n1(),
            0,get_n1(),0,get_n1()+get_d(),
            0,get_n1()+get_d(),get_d()+get_n2(),get_n1()+get_d(),
            get_d()+get_n2(),get_n1()+get_d(),get_d()+get_n2(),get_n1(),
            get_d()+get_n2(),get_n1(),get_d(),get_n1(),
            get_d(),get_n1(),get_d(),0,
            get_d(),0,0,0,
            0+lp,0,0+lp,get_n1()-lp,
            0+lp,get_n1()-lp,0+lp,get_n1()+get_d()-lp,
            0+lp,get_n1()+get_d()-lp,get_d()+get_n2(),get_n1()+get_d()-lp,
            get_d()+get_n2(),get_n1()+get_d()-lp,get_d()+get_n2(),get_n1()-lp,
            get_d()+get_n2(),get_n1()-lp,get_d()+lp,get_n1()-lp,
            get_d()+lp,get_n1()-lp,get_d()+lp,0,
            get_d()+lp, 0 ,0+lp,0};
}

    private void drawLeft() {
        float lp=(get_padding()+get_d());
       f=new float[]{0,0,0,get_n1(),
                0,get_n1(),0,get_n1()+get_d(),
                0,get_n1()+get_d(),get_d()+get_n2(),get_n1()+get_d(),
                get_d()+get_n2(),get_n1()+get_d(),get_d()+get_n2(),get_n1(),
                get_d()+get_n2(),get_n1(),get_d(),get_n1(),
                get_d(),get_n1(),get_d(),0,
                get_d(),0,0,0,
                0-lp,0,0-lp,get_n1()+lp,
                0-lp,get_n1()+lp,0-lp,get_n1()+get_d()+lp,
                0-lp,get_n1()+get_d()+lp,get_d()+get_n2()+lp,get_n1()+get_d()+lp,
                get_d()+get_n2()+lp,get_n1()+get_d()+lp,get_d()+get_n2()-lp,get_n1()+lp,
                get_d()+get_n2()-lp,get_n1()+lp,get_d()-lp,get_n1()+lp,
                get_d()-lp,get_n1()+lp,get_d()-lp,0+lp,
                get_d()-lp,0+lp,0-lp,0};

    }

    private void drawOrigin() {
        if(get_n1()>0&&get_n2()>0) {
            f=new float[]{
                    0,0,0,get_n1(),
                    0,get_n1(),0,get_n1()+get_d(),
                    0,get_n1()+get_d(),get_d()+get_n2(),get_n1()+get_d(),
                    get_d()+get_n2(),get_n1()+get_d(),get_d()+get_n2(),get_n1(),
                    get_d()+get_n2(),get_n1(),get_d(),get_n1(),
                    get_d(),get_n1(),get_d(),0,
                    get_d(),0,0,0

            };

        }else{
            Toast.makeText(getContext(),"cannot empty values n1 ,n2 !",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (get_enum_aclbar()) {
            case enl_left:
                drawLeft();
                break;
            case enl_origin:
                drawOrigin();
                break;
            case enl_right:
                drawRight();
                break;
        }
        canvas.drawLines(f, paint);

    }
}
