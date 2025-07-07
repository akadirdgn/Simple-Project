package mirasalmapro2odev4;

public class Islem {

    String[] array = new String[50];
    String[] array2 = new String[50];
    String[] array3 = new String[50];// public private ayırmak için
    String[] array4 = new String[50];// aynı değişken mi
    String classAdi;

    int i = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;

    public Islem(String[] array) {
        this.array = array;
    }

    public void kontrol() {

        while (array[i] != null) {
            
            boolean kontrol = true;
            
            int j = 0;
            j = i + 2;
            if (array[i].equals("class") && (!array[j].equals("extends"))) {//Miras alan class mı değilmi 

                //class-struct ayrımı
                array2[i2] = "struct";
                i++;
                i2++;

                //class adı 
                array2[i2] = array[i];
                classAdi = array2[i2];
                
                i++;
                i2++;

                //süslü parantez
                array2[i2] = array[i];
                i++;

                while (!array[i].equals("}")) {

                    //public private kontrol
                    if (array[i].equals("public")) {

                        //veri tipi ekleme
                        i++;
                        i2++;
                        array2[i2] = array[i];
                        array3[i3] = array[i];

                        //değişken ismi ayrımı
                        i++;
                        i2++;
                        i3++;
                        array2[i2] = array[i];
                        array3[i3] = array[i];

                        i3++;
                        i++;
                    } else {//Miras alan

                        //veri tipi ekleme
                        i++;
                        i2++;
                        array2[i2] = array[i];

                        //değişken ismi ayrımı
                        i++;
                        i2++;
                        array2[i2] = array[i];

                        i++;

                    }

                }
                //süslü parantez kapatma
                i2++;
                array2[i2] = array[i];

                //miras alma kısmına geçiyoruz
                i++;
                i2++;

            } else {

                //class-struct ayrımı
                array2[i2] = "struct";
                i++;
                i2++;

                //class adı 
                array2[i2] = array[i];
                
                i = i + 2;
                i2++;
                
                if(!classAdi.equals(array[i])){
                    kontrol = false;
                }
                
                i++;

                //süslü parantez
                array2[i2] = array[i];
                i++;

                while (!(array[i].equals("}"))) {

                    //veri tipi ekleme
                    i++;
                    i2++;
                    array2[i2] = array[i];

                    //değişken ismi ayrımı
                    i++;
                    i2++;
                    array2[i2] = array[i];
                    array4[i4] = array2[i2];
                    
                    
                    i++;
                    i4++;
                }
                
                
                boolean test = true;
                int k = 1;
                int z = 0;

                if (kontrol) {
                    while (k != i3 + 1) {

                        for (int l = 0; l < i4; l++) {

                            if (array3[k].equals(array4[l])) {
                                test = false;
                                z += 2;
                            }

                        }

                        if (test) {

                            i2++;
                            array2[i2] = array3[z];

                            i2++;
                            z++;
                            array2[i2] = array3[z];

                            z++;
                        }

                        test = true;

                        k += 2;
                    }
                }

                //süslü parantez kapatma
                i2++;
                array2[i2] = array[i];

                i++;
            }

        }

        Islem.yazdir(array2);
    }

    public static void yazdir(String[] array2) {
        
        int i = 0;

        while (array2[i] != null) {

            if (array2[i].equals("struct")) {
                
                for (int j = 0; j < 3; j++) {
                    System.out.print(array2[i] + " ");
                    i++;
                }
                System.out.println("");
            }else if (array2[i].equals("}")) {
                System.out.println(array2[i]);
                i++;
            } else{

                System.out.print("  " + array2[i] + " ");
                i++;

                System.out.print(array2[i]);
                i++;

                System.out.println("");
            } 
            
        }
    }

}