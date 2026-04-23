package za.ac.iie.mymusicapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// added a background image from :
// https://i.pinimg.com/736x/2f/66/a3/2f66a3a5c54e662cf134b5852e4f0922.jpg
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val songShowTxt = findViewById<TextView>(R.id.songDisplay)
        var songDisplay = " "
        //accessing the song class to populate the song objects with specific attributes
        val song1= Song("Choosin' Texas", "Ella Langley", 2026, "2:50")
        val song2= Song("IceBerg", "John D",  )
        val song3= Song("falling apart","Helene")
        val song4= Song("Break it all", 2015, )
        val song5= Song("The end",2023)
        // creating an array to hold the song objects
        val songs = arrayOf(song1,song2,song3,song4, song5)
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