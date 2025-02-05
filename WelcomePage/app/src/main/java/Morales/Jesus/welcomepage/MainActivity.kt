package Morales.Jesus.welcomepage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_started) as Button

        button.setOnClickListener { it: View ->
            var intent: Intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}