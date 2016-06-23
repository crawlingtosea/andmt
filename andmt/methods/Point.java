package andmt.methods;


import java.util.ArrayList;


/**
 * Created by Administrator on 2016/6/23.
 */
public class Point {

private float[] f;
    public float[] getPoints() {
       f=new float[points.size()];

        for(int i=0;i<points.size();i++){
            f[i]=points.get(i);
        }
        return f;
    }

    private  ArrayList<Float> points=new ArrayList<Float>();

    public  void add(float xpos,float ypos) {
        points.add(xpos);
        points.add(ypos);

    }

    public void destroy() {

        for(int i=0;i<points.size();i++){
            points.remove(i);
        }

    }

    public float[] getBarPoints() {

        float[] ps=new float[points.size()*2];
        ArrayList<Float> result=new ArrayList<Float>();

        for (int i = 0; i < points.size(); i++) {
            result.add(points.get(i));
            result.add(points.get(i+1));
            result.add(points.get(i));
            result.add(points.get(i+1));
        }


        for (int i = 0; i < points.size()/2; i++) {
            result.add(i+4,points.get(i));
            result.add(i+5,points.get(i+1));
        }








        return ps;

    }

}
