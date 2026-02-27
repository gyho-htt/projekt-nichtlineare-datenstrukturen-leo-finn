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
}