package br.com.fiap.pix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val transferValue = intent.getStringExtra("transferValue")
        val pixKey = intent.getStringExtra("pixKey")

        val successMessage = "R$$transferValue enviados para a chave pix $pixKey"

        val successMessageTextView = findViewById<TextView>(R.id.successMessageTextView)
        successMessageTextView.text = successMessage
    }
}
