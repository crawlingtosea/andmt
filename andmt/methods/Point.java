package andmt.methods;


import java.util.ArrayList;
import java.util.Iterator;


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


    private static ArrayList<Float> getIndex01012323(int tot) {
        int count=0;
        ArrayList<Float> value=new ArrayList<>();

        for (int ind = 0; ind <tot ; ind++) {

            if (ind == 0) {
                value .add((float)0);

            } else if (ind == 1) {
                value.add((float)1);


            } else if (ind % 4 == 0 && ind != 0) {
                for (int j = 0; j < 4; j++) {
                    value.add((float)j + count);

                }
                count = count + 2;
            } else if (ind ==( tot - 2)) {
                value .add((float)(ind - (tot / 4 + 1) * 2 + 2));

            } else if (ind == (tot - 1)) {
                value.add((float)(ind - (tot / 4 + 1) * 2 + 2));

            }
        }

        return value;
    }

    private int arraylist2int(int i,ArrayList<Float> al) {
        float [] arr=new float[al.size()];

        for (int j = 0; j <al.size() ; j++) {
            arr[j]=al.get(j);
        }

        return (int)arr[i];



    }
    public void output() {
        ArrayList<Float> al=new ArrayList<>();
        for (int i = 0; i <getBarPoints().length ; i++) {
            al.add(getBarPoints()[i]);
        }

        Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public float[] getBarPoints() {
         int total=points.size()*2;
        float[] ps=new float[total];
        ArrayList<Float> result=new ArrayList<Float>();
        ArrayList<Float> indexs=getIndex01012323(total);

        for (int i = 0; i < total; i++) {
           result.add(points.get(arraylist2int(i,indexs)));
        }

        result.remove(0);
        result.remove(0);
        result.add(points.get(0));
        result.add(points.get(1));

        for (int n = 0; n <result.size() ; n++) {
            ps[n] = result.get(n);
        }


        return ps;

    }

}
