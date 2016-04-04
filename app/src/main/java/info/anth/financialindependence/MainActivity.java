package info.anth.financialindependence;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void step0(View view) {
        Context context = view.getContext();
        callStepIntent(context, 0);
    }
    public void step1(View view) {
        Context context = view.getContext();
        callStepIntent(context, 1);
    }
    public void step2(View view) {
        Context context = view.getContext();
        callStepIntent(context, 2);
    }
    public void step3(View view) {
        Context context = view.getContext();
        callStepIntent(context, 3);
    }
    public void step4(View view) {
        Context context = view.getContext();
        callStepIntent(context, 4);
    }
    public void step5(View view) {
        Context context = view.getContext();
        callStepIntent(context, 5);
    }
    public void step6(View view) {
        Context context = view.getContext();
        callStepIntent(context, 6);
    }
    public void step7(View view) {
        Context context = view.getContext();
        callStepIntent(context, 7);
    }

    public void callStepIntent(Context context, int stepNo){
        Intent intent = new Intent(context, Steps.class);
        intent.putExtra(Steps.REQUEST_CURRENT_STEP, stepNo);
        context.startActivity(intent);
    }
}
