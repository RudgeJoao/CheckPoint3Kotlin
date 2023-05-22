package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.fiap.pix.R
import br.com.fiap.pix.SecondActivity

class MainActivity : AppCompatActivity() {
    private lateinit var transferValueEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val continueButton: Button = findViewById(R.id.continueButton)
        transferValueEditText = findViewById(R.id.transferValueEditText)

        continueButton.setOnClickListener {
            val transferValue = transferValueEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            startActivity(intent)
        }
    }
}
