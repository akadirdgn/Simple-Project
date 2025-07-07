package execution2;

import java.util.Scanner;

public class Islem {

    public static String[] array = new String[50];
    public static int AX, BX, CX, DX;
    public static int gecici;
    public static String gecici2, gecici3, gecici4;
    public static int temp, temp2;

    public Islem(String[] array) {
        this.array = array;
    }

    public void Cagir() {
        Islem.anaKontrol(0);
    }

    public static void anaKontrol(int sp) {  
            if(array[sp].contains("ETIKET")){
                array[sp] = "ETIKET";
            }
            switch (array[sp]) {
                
                case "TOP", "CIK", "CRP", "BOL" ->
                    Islem.aritmetik(sp);

                case "HRK" ->
                    Islem.atama(sp);

                case "D", "DB", "DK", "DBE", "DKE", "DED", "DE" ->
                    Islem.dallanma(sp);

                case "YAZ", "OKU" ->
                    Islem.g_c(sp);

                case "VE", "VEY", "DEG" ->
                    Islem.mantiksal(sp);
                    
                case "ETIKET" ->
                    Islem.etiket(sp);
                                
            }
        }

    public static void aritmetik(int sp) {

        if (array[sp].equals("TOP")) {
            sp++;
            if (array[sp].equals("AX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    AX += gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        AX += BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        AX += CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        AX += DX;
                    }
                }

            } else if (array[sp].equals("BX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    BX += gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        BX += AX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        BX += CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        BX += DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    CX += gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        CX += AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        CX += BX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        CX += DX;
                    }
                }
            } else {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    DX += gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        DX += AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        DX += BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        DX += CX;
                    }
                }
            }

        }

        if (array[sp].equals("CIK")) {
            sp++;
            if (array[sp].equals("AX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    AX -= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        AX -= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        AX -= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        AX -= DX;
                    }
                }

            } else if (array[sp].equals("BX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    BX -= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        BX -= AX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        BX -= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        BX -= DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    CX -= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        CX -= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        CX -= BX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        CX -= DX;
                    }
                }
            } else {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    DX -= gecici;
                } catch (Exception e) {
                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        DX -= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        DX -= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        DX -= CX;
                    }
                }
            }

        }

        if (array[sp].equals("CRP")) {
            sp++;
            if (array[sp].equals("AX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    AX *= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        AX *= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        AX *= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        AX *= DX;
                    }
                }
            } else if (array[sp].equals("BX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    BX *= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        BX *= AX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        BX *= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        BX *= DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    CX *= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        CX *= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        CX *= BX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        CX *= DX;
                    }
                }
            } else {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    DX *= gecici;
                } catch (Exception e) {
                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        DX *= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        DX *= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        DX *= CX;
                    }
                }
            }

        }

        if (array[sp].equals("BOL")) {
            sp++;
            if (array[sp].equals("AX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    AX /= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        AX /= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        AX /= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        AX /= DX;
                    }
                }

            } else if (array[sp].equals("BX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    BX /= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        BX /= AX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        BX /= CX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        BX /= DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    CX /= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        CX /= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        CX /= BX;
                    } else if (array[sp].equals("DX")) {
                        gecici4 = array[sp];
                        CX /= DX;
                    }
                }
            } else {
                gecici3 = array[sp];
                try {
                    sp++;
                    gecici4 = array[sp];
                    gecici = Integer.parseInt(array[sp]);
                    DX /= gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        gecici4 = array[sp];
                        DX /= AX;
                    } else if (array[sp].equals("BX")) {
                        gecici4 = array[sp];
                        DX /= BX;
                    } else if (array[sp].equals("CX")) {
                        gecici4 = array[sp];
                        DX /= CX;
                    }
                }
            }

        }

        Islem.control();

        sp++;

        if (array[sp] != null) {
            Islem.anaKontrol(sp);
        } else {
            System.exit(0);
        }
    }

    public static void atama(int sp) {
        sp++;
        if (array[sp].equals("AX")) {
            try {
                sp++;
                gecici = Integer.parseInt(array[sp]);
                AX = gecici;
            } catch (Exception e) {
                if (array[sp].equals("BX")) {
                    AX = BX;
                } else if (array[sp].equals("CX")) {
                    AX = CX;
                } else if (array[sp].equals("DX")) {
                    AX = DX;
                }
            }

        } else if (array[sp].equals("BX")) {
            try {
                sp++;
                gecici = Integer.parseInt(array[sp]);
                BX = gecici;
            } catch (Exception e) {

                if (array[sp].equals("AX")) {
                    BX = AX;
                } else if (array[sp].equals("CX")) {
                    BX = CX;
                } else if (array[sp].equals("DX")) {
                    BX = DX;
                }
            }
        } else if (array[sp].equals("CX")) {
            try {
                sp++;
                gecici = Integer.parseInt(array[sp]);
                CX = gecici;
            } catch (Exception e) {

                if (array[sp].equals("AX")) {
                    CX = AX;
                } else if (array[sp].equals("BX")) {
                    CX = BX;
                } else if (array[sp].equals("DX")) {
                    CX = DX;
                }
            }
        } else {
            try {
                sp++;
                gecici = Integer.parseInt(array[sp]);
                DX = gecici;
            } catch (Exception e) {

                if (array[sp].equals("AX")) {
                    DX = AX;
                } else if (array[sp].equals("BX")) {
                    DX = BX;
                } else if (array[sp].equals("CX")) {
                    DX = CX;
                }
            }
        }

        sp++;
        if (array[sp] != null) {
            Islem.anaKontrol(sp);
        } else {
            System.exit(0);
        }
    }

    public static void dallanma(int sp) {
        if (array[sp].equals("D")) {
            while (!array[sp].contains("ETIKET")){
                sp--;
            }
            sp++;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DB")) {
            if (temp - temp2 >= 0) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DBE")) {
            if (temp - temp2 >= -1) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DK")) {
            if (0 <= temp2 - temp) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DKE")) {
            if (-1 <= temp2 - temp) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DED")) {
            if (temp != temp2) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        } else if (array[sp].equals("DE")) {
            if (temp == temp2) {
                while (!array[sp].contains("ETIKET")){
                    sp--;
                }
                sp++;
                Islem.anaKontrol(sp);
            }
            sp += 2;
            Islem.anaKontrol(sp);

        }
    }

    public static void mantiksal(int sp) {
        
        if (array[sp].equals("VE")) {

            sp++;
            if (array[sp].equals("AX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    AX = AX & gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        AX = AX & BX;
                    } else if (array[sp].equals("CX")) {
                        AX = AX & CX;
                    } else if (array[sp].equals("DX")) {
                        AX = AX & DX;
                    }
                }

            } else if (array[sp].equals("BX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    BX = BX & gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        BX = BX & AX;
                    } else if (array[sp].equals("CX")) {
                        BX = BX & CX;
                    } else if (array[sp].equals("DX")) {
                        BX = BX & DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    CX = gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        CX = CX & AX;
                    } else if (array[sp].equals("BX")) {
                        CX = CX & BX;
                    } else if (array[sp].equals("DX")) {
                        CX = CX & DX;
                    }
                }
            } else {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    DX = gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        DX = DX & AX;
                    } else if (array[sp].equals("BX")) {
                        DX = DX & BX;
                    } else if (array[sp].equals("CX")) {
                        DX = DX & CX;
                    }
                }
            }
        } else if (array[sp].equals("VEY")) {

            sp++;
            if (array[sp].equals("AX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    AX = AX | gecici;
                } catch (Exception e) {

                    if (array[sp].equals("BX")) {
                        AX = AX | BX;
                    } else if (array[sp].equals("CX")) {
                        AX = AX | CX;
                    } else if (array[sp].equals("DX")) {
                        AX = AX | DX;
                    }
                }

            } else if (array[sp].equals("BX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    BX = BX | gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        BX = BX | AX;
                    } else if (array[sp].equals("CX")) {
                        BX = BX | CX;
                    } else if (array[sp].equals("DX")) {
                        BX = BX | DX;
                    }
                }
            } else if (array[sp].equals("CX")) {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    CX = CX | gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        CX = CX | AX;
                    } else if (array[sp].equals("BX")) {
                        CX = CX | BX;
                    } else if (array[sp].equals("DX")) {
                        CX = CX | DX;
                    }
                }
            } else {
                try {
                    sp++;
                    gecici = Integer.parseInt(array[sp]);
                    DX = DX | gecici;
                } catch (Exception e) {

                    if (array[sp].equals("AX")) {
                        DX = DX | AX;
                    } else if (array[sp].equals("BX")) {
                        DX = DX | BX;
                    } else if (array[sp].equals("CX")) {
                        DX = DX | CX;
                    }
                }
            }
        } else {

            sp++;
            if (array[sp].equals("AX")) {
                AX = Integer.MAX_VALUE - AX;
            } else if (array[sp].equals("BX")) {
                AX = Integer.MAX_VALUE - BX;
            } else if (array[sp].equals("CX")) {
                AX = Integer.MAX_VALUE - CX;
            } else {
                AX = Integer.MAX_VALUE - DX;
            }
        }
        sp++;
        if (array[sp] != null) {
            Islem.anaKontrol(sp);
        } else {
            System.exit(0);
        }
    }

    public static void g_c(int sp) {
        if (array[sp].equals("YAZ")) {
            sp++;
            if (array[sp].equals("AX")) {
                System.out.println(AX);
            } else if (array[sp].equals("BX")) {
                System.out.println(BX);
            } else if (array[sp].equals("CX")) {
                System.out.println(CX);
            } else if (array[sp].equals("DX")) {
                System.out.println(DX);
            } else {
                System.out.println(array[sp]);
            }

        } else {
            Scanner scanner = new Scanner(System.in);
                sp++;
                if (array[sp].equals("AX")) {
                    System.out.print("AX degerini giriniz: ");
                    AX = scanner.nextInt();
                } else if (array[sp].equals("BX")) {
                    System.out.print("BX degerini giriniz: ");
                    BX = scanner.nextInt();
                } else if (array[sp].equals("CX")) {
                    System.out.print("CX degerini giriniz: ");
                    CX = scanner.nextInt();
                } else {
                    System.out.print("DX degerini giriniz: ");
                    DX = scanner.nextInt();
                }
        }
        sp++;
        if (array[sp] != null) {
            Islem.anaKontrol(sp);
        } else {
            System.exit(0);
        }
    }
    
    public static void etiket(int sp){
        sp++;
        if (array[sp] != null) {
            Islem.anaKontrol(sp);
        }
    }

    public static void control() {

        if (gecici3.equals("AX") && gecici4.equals("BX")) {
            temp = AX;
            temp2 = BX;
        } else if (gecici3.equals("AX") && gecici4.equals("CX")) {
            temp = AX;
            temp2 = CX;
        } else if (gecici3.equals("AX") && gecici4.equals("DX")) {
            temp = AX;
            temp2 = DX;
        } else if (gecici3.equals("BX") && gecici4.equals("AX")) {
            temp = BX;
            temp2 = AX;
        } else if (gecici3.equals("BX") && gecici4.equals("CX")) {
            temp = BX;
            temp2 = CX;
        } else if (gecici3.equals("BX") && gecici4.equals("DX")) {
            temp = BX;
            temp2 = DX;
        } else if (gecici3.equals("CX") && gecici4.equals("AX")) {
            temp = CX;
            temp2 = AX;
        } else if (gecici3.equals("CX") && gecici4.equals("BX")) {
            temp = CX;
            temp2 = BX;
        } else if (gecici3.equals("CX") && gecici4.equals("DX")) {
            temp = CX;
            temp2 = DX;
        } else if (gecici3.equals("DX") && gecici4.equals("AX")) {
            temp = DX;
            temp2 = AX;
        } else if (gecici3.equals("DX") && gecici4.equals("BX")) {
            temp = DX;
            temp2 = BX;
        } else if (gecici3.equals("DX") && gecici4.equals("CX")) {
            temp = DX;
            temp2 = CX;
        } else if (gecici3.equals("AX")) {
            temp = AX;
            temp2 = Integer.parseInt(gecici4);
        } else if (gecici3.equals("BX")) {
            temp = AX;
            temp2 = Integer.parseInt(gecici4);
        } else if (gecici3.equals("CX")) {
            temp = AX;
            temp2 = Integer.parseInt(gecici4);
        } else if (gecici3.equals("DX")) {
            temp = AX;
            temp2 = Integer.parseInt(gecici4);
        } 
        
        

    }

}