public class Main{
  public static void main(String[] args){
    Song s1 = new Song("Stayin' alive","Bee Gees",180, 200000000, "Pop");
    Song s2 = new Song("Stayin' alive","Bee ",160, 100000000, "Pop");
    Songverwaltung SW = new Songverwaltung();
    SW.insert(s1);
    SW.insert(s2);
    List<Song> L = SW.searchTitel("Stayin' alive");
    
    
    L.toFirst();
    while(L.hasAccess()){
      System.out.println(L.getContent().getKuenstler());
      L.next();
    }
  }
}