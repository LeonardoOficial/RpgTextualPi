
package RPG;


public class dueloJavaliF {
    
    static int dueloAnna(int hpAnna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n Javali Flamejante " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpAnna > 0 && hpInimigo > 0) {

            switch (Anna.habilidades()) {
                case 1:
                    System.out.println("Anna esfaqueou o Guarda");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Anna acertou o Guarda com uma flecha");
                    hpInimigo -= 12;
                    break;
                case 3:
                    System.out.println("O Guarda foi atingido pelas flechas de Anna!");
                    hpInimigo -= 15;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (javaliF.habilidades()) {
                    case 1:
                        System.out.println("Javali Flamejante aplicou uma investida de fogo!!!");
                        hpAnna -= 22;
                        break;
                    case 2:
                        System.out.println("Javali Flamejante lançou uma esfera de fogo!!!");
                        hpAnna -= 18;
                        break;
                    case 3:
                        System.out.println("Javali Flamejante aplicou uma mordida");
                        hpAnna -= 15;
                        break;
                }
            } else {
                System.out.println("Javali Flamejante DERROTADO!!!");
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Anna " + hpAnna);
            System.out.println("Hp Javali Flamejante " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpAnna;
    }

    static int dueloFloki(int hpFloki, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n Javali Flamejante " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpFloki > 0 && hpInimigo > 0) {

            switch (Floki.habilidades()) {
                case 1:
                    System.out.println("O Guarda caiu com os tremores causados por Floki!");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Floki deu uma machadada no Guarda!");
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

                switch (javaliF.habilidades()) {
                    case 1:
                        System.out.println("Javali Flamejante aplicou uma investida de fogo!!!");
                        hpFloki -= 22;
                        break;
                    case 2:
                        System.out.println("Javali Flamejante lançou uma esfera de fogo!!!");
                        hpFloki -= 18;
                        break;
                    case 3:
                        System.out.println("Javali Flamejante aplicou uma mordida");
                        hpFloki -= 15;
                        break;
                }
            } else {
                System.out.println("Javali Flamejante DERROTADO!!!");
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Floki " + hpFloki);
            System.out.println("Hp Javali Flamejante " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpFloki;
    }

    static int dueloHalroc(int hpHalroc, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n Javali Flamejante " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpHalroc > 0 && hpInimigo > 0) {

            switch (Halroc.habilidades()) {
                case 1:
                    System.out.println("Halroc deu um corte rápido no Guarda!");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Halroc deu um corte sombrio no Guarda!");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("O Guarda é ferido pela explosão da bomba!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (javaliF.habilidades()) {
                    case 1:
                        System.out.println("Javali Flamejante aplicou uma investida de fogo!!!");
                        hpHalroc -= 22;
                        break;
                    case 2:
                        System.out.println("Javali Flamejante lançou uma esfera de fogo!!!");
                        hpHalroc -= 18;
                        break;
                    case 3:
                        System.out.println("Javali Flamejante aplicou uma mordida");
                        hpHalroc -= 15;
                        break;
                }
            } else {
                System.out.println("Javali Flamejante DERROTADO!!!");
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Halroc " + hpHalroc);
            System.out.println("Hp Javali Flamejante " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpHalroc;
    }

    static int dueloYruan(int hpYruan, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n Guarda " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpInimigo > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("O Guarda foi eletrificado!");
                    hpInimigo -= 15;
                    break;
                case 2:
                    System.out.println("O Guarda foi antigido por Yruan!");
                    hpInimigo -= 20;
                    break;
                case 3:
                    System.out.println("Yruan golpeia o Guarda!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (javaliF.habilidades()) {
                    case 1:
                        System.out.println("Javali Flamejante aplicou uma investida de fogo!!!");
                        hpYruan -= 22;
                        break;
                    case 2:
                        System.out.println("Javali Flamejante lançou uma esfera de fogo!!!");
                        hpYruan -= 18;
                        break;
                    case 3:
                        System.out.println("Javali Flamejante aplicou uma mordida");
                        hpYruan -= 15;
                        break;
                }
            } else {
                System.out.println("Javali Flamejante DERROTADO!!!");
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yruan " + hpYruan);
            System.out.println("Hp Javali Flamejante " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYruan;
    }

    static int dueloYvenna(int hpYvenna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n Javali Flamejante " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYvenna > 0 && hpInimigo > 0) {

            switch (Yvenna.habilidades()) {
                case 1:
                    System.out.println("O Guarda foi acertado pela pedra!");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Yvenna corta o Guarda com sua lança!");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("O Guarda é atingido pelos espinhos!");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpInimigo > 0) {

                switch (javaliF.habilidades()) {
                    case 1:
                        System.out.println("Javali Flamejante aplicou uma investida de fogo!!!");
                        hpYvenna -= 22;
                        break;
                    case 2:
                        System.out.println("Javali Flamejante lançou uma esfera de fogo!!!");
                        hpYvenna -= 18;
                        break;
                    case 3:
                        System.out.println("Javali Flamejante aplicou uma mordida");
                        hpYvenna -= 15;
                        break;
                }
            } else {
                System.out.println("Javali Flamejante DERROTADO!!!");
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yvenna " + hpYvenna);
            System.out.println("Hp Javali Flamejante " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYvenna;
    }
    
}