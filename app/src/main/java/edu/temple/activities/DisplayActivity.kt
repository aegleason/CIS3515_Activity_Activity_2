package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {

    // TODO Step 1: Launch TextSizeActivity when button clicked to allow selection of text size value

    private val textSizeLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        Intent(
            this, TextSizeActivity::class.java
        )
    }

    // TODO Step 3: Use returned value for lyricsDisplayTextView text size

    private lateinit var lyricsDisplayTextView: TextView
    private lateinit var textSizeSelectorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        lyricsDisplayTextView = findViewById(R.id.lyricsDisplayTextView)
        textSizeSelectorButton = findViewById(R.id.textSizeSelectorButton)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(
                Intent(this, TextSizeActivity::class.java)
            )
        }

        /* findViewById<Button>(R.id.button2).setOnClickListener {
            startActivity(
                Intent( this, DisplayActivity::class.java
                )
            )

            launcher.launch(Intent(this, DisplayActivity::class.java))
        }

         */

        textSizeSelectorButton.setOnClickListener {
            val intent = Intent(this, TextSizeActivity::class.java)
            textSizeLauncher.launch(intent)
        }

        /* Added a comment just so my commit would work correctly

         */

    }
}