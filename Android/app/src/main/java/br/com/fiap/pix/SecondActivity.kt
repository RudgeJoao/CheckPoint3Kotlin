package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var pixValueTextView: TextView
    private lateinit var pixKeyEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transferValue = intent.getStringExtra("transferValue")
        pixValueTextView = findViewById(R.id.pixValueTextView)
        pixKeyEditText = findViewById(R.id.pixKeyEditText)

        pixValueTextView.text = "Para quem você deseja enviar R$$transferValue?"

        val continueButton = findViewById<Button>(R.id.continueButton)
        continueButton.setOnClickListener {
            val transferValue = intent.getStringExtra("transferValue")
            val pixKey = pixKeyEditText.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            intent.putExtra("pixKey", pixKey)
            startActivity(intent)
        }
    }
}
