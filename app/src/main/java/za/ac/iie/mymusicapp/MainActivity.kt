package za.ac.iie.mymusicapp

import android.os.Bundle
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
        var songShowTxt = findViewById<TextView>(R.id.songDisplay)
        var songDisplay = " "
        //accessing the song class to populate the song objects with specific attributes
        var song1= song("Choosin' Texas", "Ella Langley", "3:33",(2020))
        var song2= song("IceBerg", "John D", "3:00", (2016))
        var song3= song("falling apart","Helene","2:47", (2029))
        var song4= song("RageBait", "Lil Junior", "3:23", (2020))
        // creating an array to hold the song objects
        var songs = arrayOf<song>(song1,song2,song3,song4)
        // for loop to loop through and display songs from the array
        for (song in songs) {
            songDisplay += "${song.DisplaySong()}\n\n"
        }
        songShowTxt.text =songDisplay


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}