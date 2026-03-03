public class Songverwaltung{
  BinarySearchTree<Song> titelBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Song> kuenstlerBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Song> genreBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Song> laufzeitBST = new BinarySearchTree<Song>(); 
  BinarySearchTree<Song> streamsBST = new BinarySearchTree<Song>(); 
  
  public Songverwaltung(){
    
  }
  
  public void insert(Song pSong){
    pSong.setVergleich("Titel");
    titelBST.insert(pSong);
    pSong.setVergleich("Kuenstler");
    kuenstlerBST.insert(pSong);
    pSong.setVergleich("Genre");
    genreBST.insert(pSong);
    pSong.setVergleich("Laufzeit");
    laufzeitBST.insert(pSong);
    pSong.setVergleich("Stream");
    streamsBST.insert(pSong);
  }
  
  public List<Song> searchTitel(String pTitel){
    Song s = new Song(pTitel, "", 0, 0, "");
    List<Song> result = new List<Song>();
    BinarySearchTree<Song> BST = titelBST;
    
    while (BST.search(s) != null) { 
      result.append(BST.search(s));
      BST.remove(s);
    } // end of while.search(s);
    
    return result;
  }
  
  public List<Song> searchKuenstler(String pKuenstler){
    Song s = new Song("", pKuenstler, 0, 0, "");
    List<Song> result = new List<Song>();
    BinarySearchTree<Song> BST = kuenstlerBST;
    
    while (BST.search(s) != null) { 
      result.append(BST.search(s));
      BST.remove(s);
    } // end of while.search(s);
    
    return result;
  }
  
  public List<Song> searchGenre(String pGenre){
    Song s = new Song("", "", 0, 0, pGenre);
    List<Song> result = new List<Song>();
    BinarySearchTree<Song> BST = genreBST;
    
    while (BST.search(s) != null) { 
      result.append(BST.search(s));
      BST.remove(s);
    } // end of while.search(s);
    
    return result;
  }
  
  public List<Song> searchLaufzeit(int pLaufzeit){
    Song s = new Song("", "", pLaufzeit, 0, "");
    List<Song> result = new List<Song>();
    BinarySearchTree<Song> BST = laufzeitBST;
    
    while (BST.search(s) != null) { 
      result.append(BST.search(s));
      BST.remove(s);
    } // end of while.search(s);
    
    return result;
  }
  
  public List<Song> searchStreams(int pStreams){
    Song s = new Song("", "", 0, pStreams, "");
    List<Song> result = new List<Song>();
    BinarySearchTree<Song> BST = streamsBST;
    
    while (BST.search(s) != null) { 
      result.append(BST.search(s));
      BST.remove(s);
    } // end of while.search(s);
    
    return result;
  }
  
  public void remove(Song pSong){
    List<Song> titelL = this.searchTitel(pSong.getTitel());
    pSong.setVergleich("Titel");
    while (titelBST.search(pSong).getTitel() == pSong.getTitel()) { 
      titelBST.remove(pSong);
    } // end of while
    while (titelL.hasAccess()) { 
      if(titelL.getContent() != pSong) {
        titelBST.insert(titelL.getContent());
      }
      titelL.next();
    } // end of while
  }
}