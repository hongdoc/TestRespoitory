package com.hongdoc.dday

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startBtn)
        val endButton = findViewById<Button>(R.id.endBtn)

        var startDate=""
        var endDate=""

        startButton.setOnClickListener{

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)

            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                  override fun onDateSet(view: DatePicker?, year: Int, month : Int, dayOfMonth : Int) {
                      //20211215
                      //12
                      //15
                      //startDate = "{$year} + {$month} + {$dayOfMonth}"
                      endDate = year.toString() + month+1.toString() + dayOfMonth.toString()
                      Log.d("day : ",endDate)

                  }
            },year, month, day)
            dlg.show()

        }

        endButton.setOnClickListener{



        }



    }

}