package Morales.Jesus.welcomepage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        enableEdgeToEdge()
        val button: Button = findViewById(R.id.btn_sign_in) as Button

        button.setOnClickListener { it: View ->
            var intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}