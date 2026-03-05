public class Song implements ComparableContent<Song>{
  String titel;
  String kuenstler;
  int laufzeit;
  int streams;
  String genre;
  String vergleich = "";
       
       
  public Song(String pTitel, String pKuenstler, int pLaufzeit, int pStreams, String pGenre){
    titel = pTitel;
    kuenstler = pKuenstler;
    laufzeit = pLaufzeit;
    streams = pStreams;
    genre = pGenre;
  }
         
  public String getTitel(){
    return titel;
  }
       
  public String getKuenstler(){
    return kuenstler;
  }
         
  public String getGenre(){
    return genre;
  }  
         
  public int getLaufzeit(){
    return laufzeit;
  }
         
  public int getStreams(){
    return streams;
  }
  
  public String getVergleich(){
    return vergleich;
  }
    
  public void setVergleich(String pVergleich){
    this.vergleich = pVergleich;
  }
  
  public boolean isLess(Song pSong){
    if(vergleich.equals("Titel")){
      if(this.titel.compareTo(pSong.getTitel()) < 0){
        return true;
      }
      
    }
    else if(vergleich == "Kuenstler"){
      if(this.kuenstler.compareTo(pSong.getKuenstler()) < 0){
        return true;
      }
      
    }
    else if(vergleich == "Genre"){
      if(this.genre.compareTo(pSong.getGenre()) < 0){
        return true;
      }
      
    }
    else if(vergleich == "Laufzeit"){
      if(this.laufzeit < pSong.getLaufzeit()){
        return true;
      }
      
    }
    else if(vergleich == "Streams"){
      if(this.streams < pSong.getStreams()){
        return true;
      }
      
    }
    
    return false;
    // end of if-else
  }
    
  public boolean isGreater(Song pSong){
    if(vergleich.equals("Titel")){
      if(this.titel.compareTo(pSong.getTitel()) > 0){
        return true;
      }
      // end of if-else
    }
    else if(vergleich == "Kuenstler"){
      if(this.kuenstler.compareTo(pSong.getKuenstler()) > 0){
        return true;
      }
      // end of if-else
    }
    else if(vergleich == "Genre"){
      if(this.genre.compareTo(pSong.getGenre()) > 0){
        return true;
      }
      // end of if-else
    }
    else if(vergleich == "Laufzeit"){
      if(this.laufzeit > pSong.getLaufzeit()){
        return true;
      }
      // end of if-else
    }
    else if(vergleich == "Streams"){
      if(this.streams > pSong.getStreams()){
        return true;
      }
      // end of if-else
    }
    
    return false;
    // end of if-else
  }
    
  public boolean isEqual(Song pSong){
    
    return !this.isLess(pSong) && !this.isGreater(pSong);

  }
}