package org.marissajones.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //---Identify buttons and text view.
    var rButton = findViewById<View>(R.id.rButton) as Button;
    var pButton = findViewById<View>(R.id.playButton) as Button;
    var sButton = findViewById<View>(R.id.sButton) as Button;
    var playButton = findViewById<View>(R.id.playButton) as Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        //---Create Id for buttons
        //---var rButton = findViewById<View>(R.id.rButton) as Button;
        //--- var pButton = findViewById<View>(R.id.playButton) as Button;
        //--- var sButton = findViewById<View>(R.id.sButton) as Button;
    //--- var playButton = findViewById<View>(R.id.playButton) as Button;

        //---Create ID for text views
        var textView1 = findViewById<View>(R.id.textView1) as TextView
        var textView2 = findViewById<View>(R.id.textView2) as TextView

        pButton.setOnClickListener(new View.OnClickListener() {
        val public = null
        public void onClick(View view) {
            String message = play_turn("paper");
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show()
        }
    }
        rButton.setOnClickListener(new View.OnClickListener() {
        val public = null
        public void onClick(View view) {
            String message = play_turn("rock");
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show()
        }
    }
        sButton.setOnClickListener(new View.OnClickListener() {
        val public = null
        public void onClick(View view) {
            String message = play_turn("scissors");
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show()
        }
    }

    }


    //-- Compare human and computer choice to determine who won.
        if (computer_choice == player_choice) : String {
        return "Draw."
        }
        else if (player_choice == "rock" && computer_choice == "scissors") {
        return "Rock beats scissors. You won."
        }
        else if (player_choice == "scissors" && computer_choice == "paper") {
        return "Scissors beat paper. You won."
        }
        else if (player_choice == "paper" && computer_choice == "rock") {
        return "Paper beats rock. You won."
        }
        else if (player_choice == "scisspors" && computer_choice == "rock") {
        return "Rock beats scissos. Opponent wins."
        }
        else if (player_choice == "paper" && computer_choice == "scissors") {
        return "Scissors beat paper. Oppnent wins."
        }
        else if (player_choice == "rock" && computer_choice == "peper") {
        return "Paper beats rock. Opponent wins."
        }