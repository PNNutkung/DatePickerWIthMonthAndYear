package com.example.pattadon23.datepickerandroid;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;

public class DatePickerExample extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_example);
        MonthDatePickerDialog pd = new MonthDatePickerDialog();
        pd.setListener(this);
        pd.show(getSupportFragmentManager(), "MonthYearPickerDialog");
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }
}
