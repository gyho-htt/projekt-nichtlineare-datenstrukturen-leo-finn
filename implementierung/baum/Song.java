public class Song implements ComparableContent<Song>{
  String titel;
  String kuenstler;
  int laufzeit;
  int streams;
  String genre;
  String vergleich;
       
       
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
    if(vergleich == "Titel"){
      return this.titel.compareTo(pSong.getTitel()) < 0;
      
    }
      
    
    else if(vergleich == "Laufzeit"){
      return this.laufzeit < pSong.getLaufzeit();
      
    }
    else if(vergleich == "Streams"){
      return this.streams < pSong.getStreams();
      
    }
    
    return false;
    // end of if-else
  }
    
  public boolean isGreater(Song pSong){
    if(vergleich == "Titel"){
     return this.titel.compareTo(pSong.getTitel()) > 0;
      // end of if-else
    }
    
    else if(vergleich == "Laufzeit"){
     return this.laufzeit > pSong.getLaufzeit();
      // end of if-else
    }
    else if(vergleich == "Streams"){
      return this.streams > pSong.getStreams();
      // end of if-else
    }
    
    return false;
    // end of if-else
  }
    
  public boolean isEqual(Song pSong){
    if(!this.isLess(pSong) && !this.isGreater(pSong)) {
      return true;
    }
    else {
      return false;
    } // end of if-else
  }
}