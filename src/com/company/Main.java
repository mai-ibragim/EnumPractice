package com.company;

public class Main {

    public static void main(String[] args) {
	Region region = Region.OSH;

   /* switch(region) {
        case OSH -> System.out.println("Sulaiman-Mountain");
        case CHUY -> System.out.println("Capital of Kyrgyzstan is Bishkek");
        case ISSYK_KOL -> System.out.println("Lake Issyk-Kol");
        case NARYN -> System.out.println("Food Besh-Barmak");
        case TALAS -> System.out.println("Manas baatyr");
        case BATKEN -> System.out.println("Apricot");
        case JALAL_ABAD -> System.out.println("Walnut");*/

        if (region == Region.OSH) {
            System.out.println("Sulaiman-Mountain");
        } else if (region == Region.CHUY) {
            System.out.println("Capital of Kyrgyzstan is Bishkek");
        }else if (region == Region.ISSYK_KOL) {
            System.out.println("Lake Issyk-Kol");
        }else if (region == Region.NARYN) {
            System.out.println("Food Besh-Barmak");
        } else if  (region == Region.TALAS) {
            System.out.println("Manas baatyr");
        } else if (region == Region.BATKEN) {
            System.out.println("Apricot");
        } else if(region == Region.JALAL_ABAD) {
            System.out.println("Walnut");
        }
    }
}

