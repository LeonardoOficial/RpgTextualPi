
package RPG;


public class dueloJavali {
    static int dueloAnna(int hpAnna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n Javali " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpAnna > 0 && hpInimigo > 0) {

            switch (Anna.habilidades()) {
                case 1:
                    System.out.println("Anna esfaqueou o Javali");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Anna acertou o Javali com uma flecha");
                    hpInimigo -= 12;
                    break;
                case 3:
                    System.out.println("O Javali foi atingido pelas flechas de Anna!");
                    hpInimigo -= 15;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (Javali.habilidades()) {
                    case 1:
                        System.out.println("Javali aplicou uma investida!!!");
                        hpAnna -= 15;
                        break;
                    case 2:
                        System.out.println("Javali mordeu!!!");
                        hpAnna -= 10;
                        break;
                  
                }
            } else {
                System.out.println("Javali DERROTADO!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nAnna " + hpAnna);
            System.out.println("Hp \nJavali " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpAnna;
    }

    static int dueloFloki(int hpFloki, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n Javali " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpFloki > 0 && hpInimigo > 0) {

            switch (Floki.habilidades()) {
                case 1:
                    System.out.println("O Javali caiu com os tremores causados por Floki!");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Floki deu uma machadada no Javali!");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("Floki recuperou parte da vida!");
                    hpFloki += 10;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (Javali.habilidades()) {
                    case 1:
                        System.out.println("Javali aplicou uma investida!!!");
                        hpFloki -= 15;
                        break;
                    case 2:
                        System.out.println("Javali mordeu!!!");
                        hpFloki -= 10;
                        break;
                   
                }
            } else {
                System.out.println("Javali DERROTADO!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nFloki " + hpFloki);
            System.out.println("Hp \nJavali " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpFloki;
    }

    static int dueloHalroc(int hpHalroc, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n Javali " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpHalroc > 0 && hpInimigo > 0) {

            switch (Halroc.habilidades()) {
                case 1:
                    System.out.println("Halroc deu um corte rápido no Javali!");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Halroc deu um corte sombrio no Javali!");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("O Javali é ferido pela explosão da bomba!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (Javali.habilidades()) {
                    case 1:
                        System.out.println("Javali aplicou uma investida!!!");
                        hpHalroc -= 15;
                        break;
                    case 2:
                        System.out.println("Javali mordeu!!!");
                        hpHalroc -= 10;
                        break;
                    
                }
            } else {
                System.out.println("Javali DERROTADO!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nHalroc " + hpHalroc);
            System.out.println("Hp \nJavali " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpHalroc;
    }

    static int dueloYruan(int hpYruan, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n Javali " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpInimigo > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("O Javali foi eletrificado!");
                    hpInimigo -= 15;
                    break;
                case 2:
                    System.out.println("O Javali foi antigido por Yruan!");
                    hpInimigo -= 20;
                    break;
                case 3:
                    System.out.println("Yruan golpeia o Javali!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (Javali.habilidades()) {
                    case 1:
                        System.out.println("Javali aplicou uma investida!!!");
                        hpYruan -= 15;
                        break;
                    case 2:
                        System.out.println("Javali mordeu!!!");
                        hpYruan -= 10;
                        break;
                    
                }
            } else {
                System.out.println("Javali DERROTADO!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYruan " + hpYruan);
            System.out.println("Hp \nJavali " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYruan;
    }

    static int dueloYvenna(int hpYvenna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n Javali " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYvenna > 0 && hpInimigo > 0) {

            switch (Yvenna.habilidades()) {
                case 1:
                    System.out.println("O Javali foi acertado pela pedra!");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Yvenna corta o Javali com sua lança!");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("O Javali é atingido pelos espinhos!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (Javali.habilidades()) {
                    case 1:
                        System.out.println("Javali aplicou uma investida!!!");
                        hpYvenna -= 15;
                        break;
                    case 2:
                        System.out.println("Javali mordeu!!!");
                        hpYvenna -= 10;
                        break;
                    
                }
            } else {
                System.out.println("Javali DERROTADO!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYvenna " + hpYvenna);
            System.out.println("Hp \nJavali " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYvenna;
    }
    
}
