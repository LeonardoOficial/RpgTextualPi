/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author csnas
 */
public class dueloGuarda {

    static int dueloAnna(int hpAnna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n Guarda " + hpInimigo);
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

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("O Guarda te acertou um soco!");
                        hpAnna -= 10;
                        break;
                    case 2:
                        System.out.println("O Guarda deu um triplo bye bye bird!");
                        hpAnna -= 12;
                        break;
                }
            } else {
                System.out.println("Guarda derrotado!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nAnna " + hpAnna);
            System.out.println("Hp \nGuarda " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpAnna;
    }

    static int dueloFloki(int hpFloki, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n Guarda " + hpInimigo);
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

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("O Guarda te acertou um soco!");
                        hpFloki -= 10;
                        break;
                    case 2:
                        System.out.println("O Guarda deu um triplo bye bye bird!");
                        hpFloki -= 12;
                        break;
                }
            } else {
                System.out.println("Guarda derrotado!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nFloki " + hpFloki);
            System.out.println("Hp \nGuarda " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpFloki;
    }

    static int dueloHalroc(int hpHalroc, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n Guarda " + hpInimigo);
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

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("O Guarda te acertou um soco!");
                        hpHalroc -= 10;
                        break;
                    case 2:
                        System.out.println("O Guarda deu um triplo bye bye bird!");
                        hpHalroc -= 12;
                        break;
                }
            } else {
                System.out.println("Guarda derrotado!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nHalroc " + hpHalroc);
            System.out.println("Hp \nGuarda " + hpInimigo);
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

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("O Guarda te acertou um soco!");
                        hpYruan -= 10;
                        break;
                    case 2:
                        System.out.println("O Guarda deu um triplo bye bye bird!");
                        hpYruan -= 12;
                        break;
                }
            } else {
                System.out.println("Guarda derrotado!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYruan " + hpYruan);
            System.out.println("Hp \nGuarda " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYruan;
    }

    static int dueloYvenna(int hpYvenna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n Guarda " + hpInimigo);
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

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("O Guarda te acertou um soco!");
                        hpYvenna -= 10;
                        break;
                    case 2:
                        System.out.println("O Guarda deu um triplo bye bye bird!");
                        hpYvenna -= 12;
                        break;
                }
            } else {
                System.out.println("Guarda derrotado!!!");
                break;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYvenna " + hpYvenna);
            System.out.println("Hp \nGuarda " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYvenna;
    }
}
