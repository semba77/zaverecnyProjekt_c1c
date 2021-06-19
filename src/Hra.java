import java.util.Scanner;

public class Hra {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        StavHry stav = new StavHry();
        stav.vytvorMapu();

        do {
            if (stav.getHrdina().getXp()>100){
                stav.getHrdina().addLevel(1);
                stav.getHrdina().addDamadge(1);
                stav.getHrdina().addXp(-100);
            }
            //chození po mapě
            Mistnost aktualni= stav.getAktualniMistnost();
            System.out.println("\nchceš jít");

            if(aktualni.isDopredu()){
                System.out.println("dopredu?");
            }
            if(aktualni.isDozadu()){
                System.out.println("dozadu?");
            }
            if(aktualni.isDoleva()){
                System.out.println("doleva?");
            }
            if(aktualni.isDoprava()){
                System.out.println("doprava?");
            }

            String smer = vstup.nextLine();
            if (smer.equals("dopredu")&& aktualni.isDopredu() ) {
                stav.setAktualniMistnost(aktualni.getDopredu());
                System.out.print(" vztupuješ do místnosti ");
                aktualni= stav.getAktualniMistnost();
                System.out.println(aktualni.getJmeno());

            } else if(smer.equals("dozadu")&& aktualni.isDozadu() ){
                stav.setAktualniMistnost(aktualni.getDozadu());
                System.out.print(" vztupuješ do místnosti ");
                aktualni= stav.getAktualniMistnost();
                System.out.println(aktualni.getJmeno());

            } else if(smer.equals("doprava")&& aktualni.isDoprava() ){
                stav.setAktualniMistnost(aktualni.getDoprava());
                System.out.print(" vztupuješ do místnosti ");
                aktualni= stav.getAktualniMistnost();
                System.out.println(aktualni.getJmeno());

            } else if(smer.equals("doleva")&& aktualni.isDoleva() ){
                stav.setAktualniMistnost(aktualni.getDoleva());
                System.out.print(" vztupuješ do místnosti ");
                aktualni= stav.getAktualniMistnost();
                System.out.println(aktualni.getJmeno());
            }
            //soubojový systém
            if(aktualni.isNepritel()){
                System.out.println("v místnosti je nepřítel, co uděláš? \n utok \n  \n");
                String akce = vstup.nextLine();
                if (akce.equals("utok")){
                    if (stav.getHrdina().souboj(aktualni.getNepritel())){
                        if(aktualni.getNepritel().getZivoty()==0){
                            aktualni.setNepritel(null);
                            System.out.println("vyhrál jsi");
                            stav.getHrdina().addXp(50);
                        }
                    }else break;

                }
            }




        } while (stav.getAktualniMistnost() != stav.getKonecnaMistnost());
        System.out.println("Hra skončila");
    }
}
