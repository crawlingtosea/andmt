package andmt.debug;

import andmt.draw.AcLBar;
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
        acLBar.setStatus(AcLBar.offset_normal);
        acLBar.move(100, 400);
        setContentView(acLBar);


    }
}
