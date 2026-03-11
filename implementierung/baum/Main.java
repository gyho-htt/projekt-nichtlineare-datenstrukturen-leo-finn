public class Main{
  public static void main(String[] args){
    Song s1 = new Song("Stayin' alive","Bee Gees",180, 200000000, "Pop");
    Song s2 = new Song("Staying alive","Bee Gees",160, 100000000, "Pop");
    Songverwaltung SW = new Songverwaltung();
    SW.insert(s1);
    SW.insert(s2);
    
    List<Song> L = SW.searchGenre("Pop");
    
    L.toFirst();
<<<<<<< HEAD
    while (L.hasAccess()) { 
      System.out.println(L.getContent().getTitel());
=======
    while(L.hasAccess()){
      System.out.println(L.getContent().getKuenstler());
>>>>>>> 3cb3dcb05bcf0904dafdd2c76ed60c4e74a193bb
      L.next();
    } // end of while
    
    SW.remove(s1);
    
    
    
    L.toFirst();
    while (L.hasAccess()) { 
      System.out.println(L.getContent().getTitel());
      L.next();
    } // end of while
    
    System.out.println(SW.searchStreams(100000000).getTitel());
  }
}