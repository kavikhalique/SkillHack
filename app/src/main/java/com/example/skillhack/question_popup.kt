package com.example.skillhack


import android.content.Intent
import android.os.Build
import android.os.Build.VERSION.SDK_INT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.auth.User



class question_popup : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_popup)
        Log.d("TAG","entered in popup")
        //val question= intent.getParcelableExtra("question",questions::class.java)
//        if(question!=null){
//            Log.d("TAG","entered in if")
//            val short=findViewById<TextView>(R.id.one_line)
//            val long=findViewById<TextView>(R.id.mul_line)
//            val datenrew=findViewById<TextView>(R.id.datenrew)
//            short.text=question.shortDiscriptionQuestion.toString()
//            long.text=question.fullQuestion.toString()
//            datenrew.text="Result will be live by $question.lastDate. \nTop problem solver will win cash rewards of Rs. $question.rewardAmt"
//            val startsolving=findViewById<Button>(R.id.startsolving)
//
//            startsolving.setOnClickListener{
//                setVisible(false)
//            }
//        }
    }

}


