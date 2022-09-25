public class Main {
    public static void main(String[] args) {
        /*for(int i=1;i<=100;i++){
            if(i==1){}else{
            if(i==2){
                System.out.print(i+" ");
            }else if (i%2==1){
                if(i==3){
                    System.out.print(i+" ");
                } else if (i % 3 != 0) {
                    if(i==5){
                        System.out.print(i+" ");
                    } else if (i % 5 != 0) {
                        if(i==7){
                            System.out.print(i+" ");
                        }else if (i % 7 != 0) {
                            System.out.print(i+" ");
                        }
                    }
                }
            }
        }
        }
         */
        String asalSayilar = "";
        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println(asalSayilar);
    }
}
