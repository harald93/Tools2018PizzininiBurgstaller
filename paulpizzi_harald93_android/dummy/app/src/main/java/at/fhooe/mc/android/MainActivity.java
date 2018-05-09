package at.fhooe.mc.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity implements View.OnClickListener{

    public static final String TAG = "ViewTest";


    // internal CLass for OnClickListener
    class MyV3OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View _view) {
            Log.i(TAG, "Button C pressed");

        }
    }

    public void thisIsANewMethod() {
<<<<<<< HEAD
		Log.i(TAG, "Änderung von Member1");
		Log.i(TAG,"habe was geändert");
	}
>>>>>>> d86e1cbd0f52ac95eb1170bbad5ce560ed8f8057

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = null;
		Button button = null;

        a = (Button)findViewById(R.id.main_activity_button_a);
        a.setOnClickListener(this);

        a = (Button)findViewById(R.id.main_activity_button_b);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Log.i(TAG,"Button B has been pressed");
            }
        });

        View.OnClickListener v3 = new MyV3OnClickListener();
        a = (Button)findViewById(R.id.main_activity_button_c);
        a.setOnClickListener(v3);

        View.OnClickListener v4 = new MyV4OnCLickListener();
        a = (Button)findViewById(R.id.main_activity_button_d);
        a.setOnClickListener(v4);

    }

    @Override
    public void onClick(View _view) {
        switch(_view.getId()){
            case R.id.main_activity_button_a : {
                Log.i(TAG,"Button A has been pressed");
            } break;
            default: Log.e(TAG, "unexpected id encountered");
        }//switch id
    }


    public void someSuitableMethodName(View _whoCares){
        Log.i(TAG, "Using property on click event");
    }
}
