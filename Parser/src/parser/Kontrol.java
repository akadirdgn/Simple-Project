package parser;

public class Kontrol {
    int i = 0,j=0;
    int gecici = 0; 
 
    //Hocam burası sabit sayıları kontrol edip if'in içine true yada false döndürüyor
    public boolean sabitSayiKontrolu(String[] array,int k){
        
        try{
            Integer.valueOf(array[k]);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    
    //Burası ana kontrol yerimiz
    public void anaKontrol(String[] array){
        
        while(array[i] != null){
            if(array[i].equals("TOP") || array[i].equals("CIK") || array[i].equals("CRP") || array[i].equals("BOL") || array[i].equals("HRK") || array[i].equals("VE") || array[i].equals("VEY")){
                i++;
                if(array[i].equals("AX") || array[i].equals("BX") || array[i].equals("CX") || array[i].equals("DX") || (array[i].startsWith("[") && array[i].endsWith("]")) || sabitSayiKontrolu(array, i)){
                    i++;
                    if(array[i].equals("AX") || array[i].equals("BX") || array[i].equals("CX") || array[i].equals("DX") || array[i].contains("[") || sabitSayiKontrolu(array, i)){
                    }
                    else{
                        gecici++;
                        System.out.println("Hata "+(j+1)+". satirdadir!");
                    }
                }
                else{
                    gecici++;
                    System.out.println("Hata "+(j+1)+". satirdadir!");
                }
            }
            
            else if(array[i].equals("D") || array[i].equals("DB") || array[i].equals("DK") || array[i].equals("DKE") || array[i].equals("DBE") || array[i].equals("DED") || array[i].equals("DE")){
                i++;
                if(array[i].equals("ETIKET1") || array[i].equals("ETIKET2") || array[i].equals("ETIKET3") || array[i].equals("ETIKET4") || array[i].equals("ETIKET5") || array[i].equals("ETIKET6") || array[i].equals("ETIKET7") || array[i].equals("ETIKET8") || array[i].equals("ETIKET9") || array[i].equals("ETIKET10")){
                }
                else{
                    gecici++;
                    System.out.println("Hata "+(j+1)+". satirdadir!");
                }
            }
            
            else if(array[i].equals("DEG") || array[i].equals("OKU") || array[i].equals("YAZ")){
                i++;
                if(array[i].equals("AX") || array[i].equals("BX") || array[i].equals("CX") || array[i].equals("DX") || array[i].contains("[") || sabitSayiKontrolu(array, i)){
                }
                else{
                    gecici++;
                    System.out.println("Hata "+(j+1)+". satirdadir!");
                }
            }
            else{
                gecici++;
                System.out.println("Hata "+(j+1)+". satirdadir!");
            }
            
            i++;
            j++;        
        }
        
        if(gecici != 0){    
            System.out.println("Yazim hatasi var");
        }
        else{
            System.out.println("Yazim hatasi yok");
        }
        
    }
    
}
