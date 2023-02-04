 public class Butelka {
    double ileLitrow;

    Butelka(double ileLitrow){
        this.ileLitrow = ileLitrow;
    }
    double getIleLitrow(){
        return ileLitrow;
    }
    boolean wlej(double ilosc){
        if(ilosc + ileLitrow <= 25){
        this.ileLitrow += ilosc;
        return true;}
        else
            System.out.println("W butelce nie ma wystarczajacej ilosci miejsca w butelce!!!");
        return false;
    }
     boolean wylej(double ilosc){
        if (ilosc <= ileLitrow)
        this.ileLitrow -= ilosc;
        else {
            System.out.println("Za mało wody w wiadrze.");
            this.ileLitrow -= ileLitrow;
            System.out.println("Z wiadra została wylana całą jego zawartość.");
            return false;
        }
        return true;
     }
     void przelej(double ilosc, Butelka gdziePrzelac){
        if(this.wylej(ilosc)){
        gdziePrzelac.wlej(ilosc);
        }else
            System.out.println();
     }
    public static void main(String[] args) {
    Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);


        butelka[0].wylej(12);
        // butelka[0].wlej(12);
        // butelka[0].przelej(16,butelka[1]);
        // butelka [0].przelej(10, butelka[1]);

        System.out.println("Iość wody w butelce 0:  " + butelka[0].getIleLitrow() + " Litrow");
        System.out.println("Iość wody w butelce 1:  " + butelka[1].getIleLitrow() + " Litrow");

    }
}