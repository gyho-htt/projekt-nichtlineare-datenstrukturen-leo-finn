public class Songverwaltung{
  BinarySearchTree<Song> titelBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Kuenstler> kuenstlerBST = new BinarySearchTree<Kuenstler>(); 
  BinarySearchTree<Genre> genreBST = new BinarySearchTree<Genre>(); 
  BinarySearchTree<Song> laufzeitBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Song> streamsBST = new BinarySearchTree<Song>(); 
  
  public Songverwaltung(){
    
  }
  
  public void insert(Song pSong){
    pSong.setVergleich("Titel");
    titelBST.insert(pSong);
    
    Kuenstler k = new Kuenstler(pSong.getKuenstler());
    if (kuenstlerBST.search(k) == null){
      
      kuenstlerBST.insert(k);
      k.songEinfuegen(pSong);
    }
    else{
      kuenstlerBST.search(k).songEinfuegen(pSong); 
    }
    
    Genre g = new Genre(pSong.getGenre());
    if (genreBST.search(g) == null){
      
      genreBST.insert(g);
      g.songEinfuegen(pSong);
    }
    else{
      genreBST.search(g).songEinfuegen(pSong); 
    }
    
    pSong.setVergleich("Laufzeit");
    laufzeitBST.insert(pSong);
    pSong.setVergleich("Streams");
    streamsBST.insert(pSong);
  }
  
  public Song searchTitel(String pTitel){
    Song s = new Song(pTitel, "", 0, 0, "");
    s.setVergleich("Titel");
    
    return titelBST.search(s);
  }
  
  public List<Song> searchKuenstler(String pKuenstler){
    
    
    return kuenstlerBST.search(new Kuenstler(pKuenstler)).getSongs();
  } 
  
  public List<Song> searchGenre(String pGenre){
    
    
    return genreBST.search(new Genre(pGenre)).getSongs();
  }  
  
  public Song searchLaufzeit(int pLaufzeit){
    Song s = new Song("", "", pLaufzeit, 0, "");
    s.setVergleich("Laufzeit");
    
    return laufzeitBST.search(s);
  }
  
  public Song searchStreams(int pStreams){
    Song s = new Song("", "", 0, pStreams, "");
    s.setVergleich("Streams");
    
    return streamsBST.search(s);
  }
  
  public void remove(Song pSong){
    pSong.setVergleich("Titel");
    titelBST.remove(pSong);
    pSong.setVergleich("Streams");
    streamsBST.remove(pSong);
    pSong.setVergleich("Laufzeit");
    laufzeitBST.remove(pSong);
    
    Kuenstler k = kuenstlerBST.search(new Kuenstler(pSong.getKuenstler()));
    k.delete(pSong);
    
   Genre g = genreBST.search(new Genre(pSong.getGenre()));
   g.delete(pSong);
  }  
  
}