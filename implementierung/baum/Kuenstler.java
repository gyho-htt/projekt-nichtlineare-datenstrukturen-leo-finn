public class Kuenstler implements ComparableContent<Kuenstler>{
  String name;
  
  public Kuenstler(String pName){
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
  
  public boolean isLess(Kuenstler pKuenstler){
    return this.name.compareTo(pKuenstler.getName()) < 0 ;
  }
  
  public boolean isGreater(Kuenstler pKuenstler){
    return this.name.compareTo(pKuenstler.getName()) > 0;
  }
  
  public boolean isEqual(Kuenstler pKuenstler){
    return this.name.compareTo(pKuenstler.getName()) == 0;     
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