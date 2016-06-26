package andmt.debug;

import andmt.draw.AcLBar;
import andmt.draw.AcLeftElephantBar;
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

        AcLeftElephantBar acLBar=new AcLeftElephantBar(this,100,800,100,200,300,true);
        acLBar.startDraw();
        setContentView(acLBar);
        acLBar.move(100, 400);


    }


}
