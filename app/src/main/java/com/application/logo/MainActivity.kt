package com.application.logo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication
import java.util.Date

class MainActivity : AppCompatActivity() {
    // button storeing
   lateinit var bProceed:Button
   // declare all required variable to store id's
    var userName:EditText?=null
    var pass:EditText?=null
    var email:EditText?=null
    var date:EditText?=null
    var phone:EditText?=null
    // boolean variable check fields
    var isAllFieldCheck = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //extract id's from activity.xml file all field
        bProceed=findViewById(R.id.txtbtn)
        userName=findViewById(R.id.txt1)
        pass=findViewById(R.id.txt2)
        email=findViewById(R.id.txt3)
        date=findViewById(R.id.txt4)
        phone=findViewById(R.id.txt5)
          // set fuction to button click
        bProceed.setOnClickListener(object:View.OnClickListener {
            // onclick function override because its already implemented by class itself
            override fun onClick(v: View?) {

               // check all field not blank by fuction call
                isAllFieldCheck = checkAllFields()

                // the boolean variable turns to be true then
                // only the user must be proceed to the activity2
               // if not blank field of any then Toast will be display
                if (isAllFieldCheck) {
                    Toast.makeText(this@MainActivity,"Data has been entereed",Toast.LENGTH_SHORT).show()
                    //startActivity(intent)
                }
               //if blank field then this Toast will be dispaly
               else{
                   Toast.makeText(this@MainActivity,"Enter the Data",Toast.LENGTH_SHORT).show()
                }
            }
        });
        
    }
    // fuction defination check field return boolean
    private fun checkAllFields(): Boolean {
        //check length of all field one by one
        if(userName!!.length()==0){
            return false
        }
        else if(pass!!.length()==0){
            return false
        }
        else if(email!!.length()==0){
            return false
        }
        else if(date!!.length()==0){
            return false
        }
        else if(phone!!.length()==0){
            return false
        }
        // all condition false then return true in last
        else{
            return true
        }
    }
}