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

        setContentView(acLBar);


    }
}
