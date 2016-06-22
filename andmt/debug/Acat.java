package andmt.debug;

import andmt.draw.AcLBar;
import andmt.draw.Andmt;
import andmt.draw.R;
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
       acLBar.set_padding(40);

        acLBar.clone2Shape(Andmt.ACENUM.acenum_right);
        acLBar.move(200,400);
        setContentView(acLBar);


    }
}
