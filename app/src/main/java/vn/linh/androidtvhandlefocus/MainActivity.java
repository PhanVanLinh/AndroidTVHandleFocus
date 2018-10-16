package vn.linh.androidtvhandlefocus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
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
                Log.i(TAG, "btn1 "+event.getAction());
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {
                    Log.i(TAG, "btn1 up");
                }
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {
                    Log.i(TAG, "btn1 down");
                }
                return false;
            }
        });

        btn2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.i(TAG, "btn2 "+event.getAction());
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {
                    Log.i(TAG, "btn2 up");
                }
                if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {
                    Log.i(TAG, "btn2 down");
                }
                return false;
            }
        });

        btn1.post(new Runnable() {
            @Override
            public void run() {
                btn1.requestFocus();
            }
        });
    }
}
