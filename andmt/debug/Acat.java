package andmt.debug;

import andmt.draw.AcLBar;
import andmt.draw.Andmt;
import android.app.Activity;
import android.os.Bundle;


public class Acat extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AcLBar acLBar=new AcLBar(this);
        acLBar.set_n1(500);
        acLBar.set_n2(100);

        acLBar.setStatus(Andmt.offset_normal);
        acLBar.startDraw();

        acLBar.setStatus(AcLBar.offset_normal);

        acLBar.move(100, 400);
        setContentView(acLBar);


    }


    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
