package za.ac.iie.mymusicapp

import android.R.attr.duration
import android.R.attr.name
import android.util.Log

class song (songName: String, songArtist: String, songDuration: String, 0, " "){
}     // created variables to holds song object's attributes
      songName: String,
      songArtist: String,
      songYear: Int,
      songDuration: String) {}
      var Name : String=""
      var Artist : String=""
      var Year : Int=0
      var Duration : String=""
      constructor (songName: String, songArtist: String) this(songName, songArtist, 0, " ")

// initialize vatiables
init {
      Name = songName
      Artist = songArtist
      Year = songYear
      Duration = songDuration
}

fun Play () {
      Log.v("song","$name playing now")
}
fun Pause(){
      Log.v("Song", "$name paused now")
}
fun Stop() {
      Log.v("Song", "$name stopped now")
}
fun Favourite(): Boolean {
      Log.v("Song", "$name favourite now")
      return true
}
fun displaySong(): String {
      val artist = ""
      return "$name - $artist ($duration)"
}
