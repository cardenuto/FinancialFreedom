package info.anth.financialindependence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void step0(View view) {
        Log.i("ajc", "inStep0");
    }
    public void step1(View view) {
        Log.i("ajc", "inStep1");
    }
    public void step2(View view) {
        Log.i("ajc", "inStep2");
    }
    public void step3(View view) {
        Log.i("ajc", "inStep3");
    }
    public void step4(View view) {
        Log.i("ajc", "inStep4");
    }
    public void step5(View view) {
        Log.i("ajc", "inStep5");
    }
    public void step6(View view) {
        Log.i("ajc", "inStep6");
    }
    public void step7(View view) {
        Log.i("ajc", "inStep7");
    }
}
