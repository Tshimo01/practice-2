package vcmsa.ci.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val Henessy = findViewById<EditText>(R.id.edtNum1)
        val num2 = findViewById<EditText>(R.id.edtNum2)
        val btnAdd = findViewById<Button>(R.id.btnSub)
        val btnSubtract = findViewById<Button>(R.id.btnSub)
        val txtResults = findViewById<TextView>(R.id.txtResult)

        btnAdd.setOnClickListener {

            val Henessy = Henessy.text.toString().toIntOrNull()?:0
        }
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets






        }
    }
}