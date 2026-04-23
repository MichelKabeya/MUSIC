package za.ac.iie.mymusicapp

import android.util.Log

class Song (songName: String, songArtist: String, songYear: Int, songDuration: String){
// created variables to holds song object's attributes
//      songName: String,
//      songArtist: String,
//      songYear: Int,
//      songDuration: String) {}
      var name : String=""
      var artist : String=""
      var year : Int=0
      var duration : String=""
      // exception
      constructor(songName: String, songArtist: String): this(songName, songArtist, 0, "" ){}
      constructor(songName: String, songYear: Int): this(songName, "", songYear, ""){}

// initialize variables
init {
      name = songName
      artist = songArtist
      year = songYear
      duration = songDuration
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
fun DisplaySong(): String {
      val Qrtist = ""
      return "$name $artist $year ($duration)"}}

