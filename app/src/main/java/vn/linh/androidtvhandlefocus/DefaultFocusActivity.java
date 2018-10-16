package vn.linh.androidtvhandlefocus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class DefaultFocusActivity extends AppCompatActivity {

    String TAG = getClass().getSimpleName();
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);

        btn1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.i(TAG, "btn1 " + getActionName(event.getAction()));
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {
                    Log.i(TAG, "btn1 key pad up");
                }
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {
                    Log.i(TAG, "btn1 key pad down");
                }
                return false;
            }
        });

        btn2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.i(TAG, "btn2 " + getActionName(event.getAction()));
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {
                    Log.i(TAG, "btn2 key pad up");
                }
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {
                    Log.i(TAG, "btn2 key pad down");
                }
                return false;
            }
        });
    }

    private String getActionName(int action) {
        if (action == KeyEvent.ACTION_DOWN) {
            return "action down";
        }
        if (action == KeyEvent.ACTION_UP) {
            return "action up";
        }
        return "action multable";
    }
}