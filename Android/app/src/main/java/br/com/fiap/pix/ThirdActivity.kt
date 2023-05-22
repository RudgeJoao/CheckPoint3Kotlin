package br.com.fiap.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private lateinit var transferValueTextView: TextView
    private lateinit var pixKeyTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        transferValueTextView = findViewById(R.id.transferValueTextView)
        pixKeyTextView = findViewById(R.id.pixKeyTextView)

        val transferValue = intent.getStringExtra("transferValue")
        val pixKey = intent.getStringExtra("pixKey")

        transferValueTextView.text = "Transferindo R$$transferValue"
        pixKeyTextView.text = "Chave pix: $pixKey"

        val confirmTransferButton = findViewById<Button>(R.id.confirmTransferButton)
        val revisePixButton = findViewById<Button>(R.id.revisePixButton)

        confirmTransferButton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("transferValue", transferValue)
            intent.putExtra("pixKey", pixKey)
            startActivity(intent)
        }

        revisePixButton.setOnClickListener {
            finish()
        }
    }
}
