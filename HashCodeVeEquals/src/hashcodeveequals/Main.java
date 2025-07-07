package hashcodeveequals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: "+id+" ||| Isim: "+isim;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isim);
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }
    
    
}


public class Main {

    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<Player>();
        
        Player p = new Player("Kadir", 1);
        Player p1 = new Player("Kadir", 1);
        Player p2 = new Player("Baran", 3);
        Player p3 = new Player("Miray", 4);
    
        hashSet.add(p);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
      
        for (Player player : hashSet) {// aynı veriyi basmaması için
            System.out.println(player);
        }
        
        
    }
    
}
