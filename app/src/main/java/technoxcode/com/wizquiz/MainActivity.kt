package technoxcode.com.wizquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn = findViewById<Button>(R.id.StartBtn)
        val etText: EditText = findViewById(R.id.et_text)
        startBtn.setOnClickListener {

            if (etText.text.isEmpty()) {
                Toast.makeText(this, "Please Enter your name", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Welcome ${etText.text}!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etText.text.toString())//Sending data to constant
                startActivity(intent)
                finish()


            }
        }

    }
}