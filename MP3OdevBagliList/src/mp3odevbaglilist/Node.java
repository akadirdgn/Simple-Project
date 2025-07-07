package mp3odevbaglilist;

public class Node {
    String sarkiAdi;
    String sanatciAdi;
    String tur;
    int sure;

    public Node(String sarkiAdi, String sanatciAdi, String tur, int sure) {
        this.sarkiAdi = sarkiAdi;
        this.sanatciAdi = sanatciAdi;
        this.tur = tur;
        this.sure = sure;
    }
    
    Node next;
}
