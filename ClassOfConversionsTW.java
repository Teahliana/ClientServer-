package teahTW;


public class ClassOfConversionsTW {
    //Following methond convert given base two number to base 10
    public int Base2ToBase10TW(int binaryNumberTW){
        int decimalNumberTW = 0;
        int remainderTW;
        int i = 1;
        //running while loop converting the each numbers in base 2
        while(binaryNumberTW != 0){
            remainderTW = binaryNumberTW % 10;
            decimalNumberTW = decimalNumberTW + remainderTW * i;
            i = i * 2;
            binaryNumberTW = binaryNumberTW / 10;
        }
        //Return converted base 10 number
        return decimalNumberTW;
    }
      //Following methond convert given base 10 number to base 2
    public String Base10ToBase2TW(int decimaNumberTW){
        int i = 0;
        int[] binaryTW = new int[100];
        //running while loop converting the each numbers in base 10
        while(decimaNumberTW != 0){
            binaryTW[i] = decimaNumberTW % 2;
            decimaNumberTW = decimaNumberTW / 2;
            i++;
        }
        String binaryNumTW = "";
        for(int j = i-1; j >= 0 ; j--){
            binaryNumTW = binaryNumTW+binaryTW[j];
        }
        //Return converted base 2 number
        return binaryNumTW;
    }
     //Following methond convert given base 8 number to base 10
    public int Base8ToBase10TW(int OctalNumberTW){
        int decimalNumberTW = 0;
        int remainderTW;
        int i = 1;
         //running while loop converting the each numbers in base 8
        while(OctalNumberTW != 0){
            remainderTW = OctalNumberTW % 10;
            decimalNumberTW = decimalNumberTW + remainderTW * i;
            i = i * 8;
            OctalNumberTW = OctalNumberTW / 10;
        }
         //Return converted base 10 number
        return decimalNumberTW;
    }
     //Following methond convert given base 10 number to base 8
    public String Base10ToBase8TW(int decimaNumberTW){
        int i = 0;
        int[] binaryTW = new int[100];
         //running while loop converting the each numbers in base 10
        while(decimaNumberTW != 0){
            binaryTW[i] = decimaNumberTW % 8;
            decimaNumberTW = decimaNumberTW / 8;
            i++;
        }
        String binaryNumTW = "";
        for(int j = i-1; j >= 0 ; j--){
            binaryNumTW = binaryNumTW+binaryTW[j];
        }
         //Return converted base 8 number
        return binaryNumTW;
    }
      //Following methond convert given base 16 number to base 10
    public int Base16ToBase10TW(String HexNumberTW){ //AF123
             String digitsTW = "0123456789ABCDEF";
             HexNumberTW = HexNumberTW.toUpperCase();
             int valTW = 0;
              //running while loop converting the each numbers in base 16
             for (int i = 0; i < HexNumberTW.length(); i++){
                 char c = HexNumberTW.charAt(i);
                 int d = digitsTW.indexOf(c);
                 valTW = 16*valTW + d;
             }
              //Return converted base 10 number
             return valTW;
    }
    //Following methond convert given base 10 number to base 16
    public String Base10ToBase16TW(int decimaNumberTW){
        int i = 0;
        int remainderTW;
        String remTW;
        String[] binaryTW = new String[100];
        //running while loop converting the each numbers in base 10
        while(decimaNumberTW != 0){
            remainderTW = decimaNumberTW % 16;
            if(remainderTW == 10){
                remTW = "A";
            }else if(remainderTW == 11){
                remTW = "B";
            }else if(remainderTW == 12){
                remTW = "C";
            }else if(remainderTW == 13){
                remTW = "D";
            }else if(remainderTW == 14){
                remTW = "E";
            }else if(remainderTW == 15){
                remTW = "F";
            }else{
                remTW = ""+remainderTW;
            }
            binaryTW[i] = remTW;
            decimaNumberTW = decimaNumberTW / 16;
            i++;
        }
        String binaryNumTW = "";
        for(int j = i-1; j >= 0 ; j--){
            binaryNumTW = binaryNumTW+binaryTW[j];
        }
        //Return converted base 16 number
        return binaryNumTW;
    }
    // //Following methond convert given base custom 
    public int CutomBaseToBase10TW(int BaseNumberTW,int BaseTW){
        int decimalNumberTW = 0;
        int remainderTW;
        int i = 1;
         //running while loop converting the each numbers in base 10
        while(BaseNumberTW != 0){
            remainderTW = BaseNumberTW % 10;
            decimalNumberTW = decimalNumberTW + remainderTW * i;
            i = i * BaseTW;
            BaseNumberTW = BaseNumberTW / 10;
        }
        return decimalNumberTW;
    }
    
}
