import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [][] pole = {
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
            {" ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "," ■ "," O "},
        };

        System.out.println("Zadej V kolikátém sloupci v prvním řádku budeš");
        int [] aktualnipozice = new int[2];
        int startovaciPozice = sc.nextInt();
        pole[0][startovaciPozice-1 ] = " X ";
        boolean konec = true;
        aktualnipozice[0] = 0;
        aktualnipozice[1] = startovaciPozice-1;
        while(konec) {
            if(aktualnipozice[0]+1 != 8){
                if(aktualnipozice[0]%2 == 0){
                    System.out.println(pole[aktualnipozice[0]][aktualnipozice[1]]);
                    pole[aktualnipozice[0]][aktualnipozice[1]] = " O "; 
                } else {
                    System.out.println(pole[aktualnipozice[0]][aktualnipozice[1]]);
                    pole[aktualnipozice[0]][aktualnipozice[1]] = " ■ ";
                }
                System.out.println("Zadej sloupec");
                int radek = sc.nextInt();
                System.out.println("Zadej radek");
                int sloupec = sc.nextInt();
                
                if(sloupec-1 != aktualnipozice[0]+1){
                    System.out.println("Zadal jsi až moc tahů chlape");
                    return;
                }
                aktualnipozice[0] = sloupec-1;
                aktualnipozice[1] = radek-1;
                pole[sloupec-1][radek-1] = " X ";
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print(pole[i][j]);
                    }
                    System.out.println(" ");
                }
            } else {
                konec = false;
            }
        }
    }
}
