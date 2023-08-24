package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
//import com.example.calculatorapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : ComponentActivity() {
   // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = MainActivity().inflate(layoutInflater)
        //val view = binding.root

        val buttonPlus=findViewById<Button>(R.id.btnPlus)
        val inpt=findViewById<TextInputEditText>(R.id.In1)
        val inpt2=findViewById<TextInputEditText>(R.id.In2)
        val inpt3=findViewById<TextView>(R.id.tvResult)

        buttonPlus.setOnClickListener{
            val input1= inpt.text.toString().toInt()
            val input2= inpt2.text.toString().toInt()

            val res: String =(input1+input2).toString()
            inpt3.text=res

        }

        val buttonMinus=findViewById<Button>(R.id.btnMinus)

        buttonMinus.setOnClickListener{
            val input1= inpt.text.toString().toInt()
            val input2= inpt2.text.toString().toInt()
            val res: String =(input1-input2).toString()
            inpt3.text=res

        }
        val buttonMultiply=findViewById<Button>(R.id.btnMultiply)
        buttonMultiply.setOnClickListener{
            val input1= inpt.text.toString().toInt()
            val input2= inpt2.text.toString().toInt()
            val res: String =(input1*input2).toString()
            inpt3.text=res

        }

        val buttonDivide=findViewById<Button>(R.id.btnDivide)
        buttonDivide.setOnClickListener{
            val input1= inpt.text.toString().toInt()
            val input2= inpt2.text.toString().toInt()
            if(input2 == 0)
            {
                inpt3.text="Invalid Input"
            }
            else {
                val res: String = (input1 / input2).toString()
                inpt3.text = res
            }
        }



    }
}

