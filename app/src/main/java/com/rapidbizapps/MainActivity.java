package com.rapidbizapps;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.rba.ui.ButtonFlat;
import com.rba.ui.dateandtime.time.RadialPickerLayout;
import com.rba.ui.dateandtime.time.TimePickerDialog;
import com.rba.ui.dialog.MaterialDialog;

import java.util.Calendar;




public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showBasicNoTitle();
        ButtonFlat timeButton = (ButtonFlat)findViewById(R.id.time_button);
        // Show a timepicker when the timeButton is clicked
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                TimePickerDialog tpd = TimePickerDialog.newInstance(
                        MainActivity.this,
                        now.get(Calendar.HOUR_OF_DAY),
                        now.get(Calendar.MINUTE),
                        false
                );

                tpd.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        Log.d("TimePicker", "Dialog was cancelled");
                    }
                });
                tpd.show(getFragmentManager(), "Timepickerdialog");
            }
        });

    }





    private void showBasicNoTitle() {
        new MaterialDialog.Builder(MainActivity.this)
                .content("show Basic No tille")
                .positiveText("Agree")
                .negativeText("DisAgree")
                .show();
    }




    @Override
    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {

    }
}
