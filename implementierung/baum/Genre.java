public class Genre implements ComparableContent<Genre>{
  String name;
  
  public Genre(String pName){
    name = pName;
  }
  
  List<Song> L = new List<Song>();
   
  public void songEinfuegen(Song pSong){
    L.append(pSong);
  }
  
  public List<Song> getSongs(){
       return L;
    }
  
  public String getName(){
    return name;
  }
  
  public boolean isLess(Genre pGenre){
    return this.name.compareTo(pGenre.getName()) < 0;
  }
  
  public boolean isGreater(Genre pGenre){
    return this.name.compareTo(pGenre.getName()) > 0;
  }
  
  public boolean isEqual(Genre pGenre){
    return this.name.compareTo(pGenre.getName()) == 0;     
  }
  
  public void delete(Song pSong){
     L.toFirst();
     while (L.hasAccess()) { 
      if (pSong == L.getContent()) {
        L.remove();
      } // end of if
      L.next(); 
     } // end of while
    }
}