/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author csnas
 */
public class dueloLadrao {
      static int dueloAnna(int hpAnna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n Ladrão " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpAnna > 0 && hpInimigo > 0) {

            switch (Anna.habilidades()) {
                case 1:
                    System.out.println("Anna esfaqueou o ladrão");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Anna acertou o ladrão com uma flecha");
                    hpInimigo -= 12;
                    break;
                case 3:
                    System.out.println("Anna atingiu o ladrão com uma dupla flechada");
                    hpInimigo -= 15;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                 switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Ladrão aplicou um soco!");
                        hpAnna -= 10;
                        break;
                    case 2:
                        System.out.println("Ladrão deu um triplo bye bye bird!");
                        hpAnna -= 12;
                        break;
                }
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Anna " + hpAnna);
            System.out.println("Hp Ladrão " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpAnna;
    }

    static int dueloFloki(int hpFloki, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n Ladrão " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpFloki > 0 && hpInimigo > 0) {

            switch (Floki.habilidades()) {
                case 1:
                    System.out.println("O ladrão caiu com os tremores causados por Floki");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Floki deu uma machadada no ladrão");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("Floki ganhou mais força");
                    hpFloki += 10;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                 switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Ladrão aplicou um soco!");
                        hpFloki -= 10;
                        break;
                    case 2:
                        System.out.println("Ladrão deu um triplo bye bye bird!");
                        hpFloki -= 12;
                        break;
                }
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Floki " + hpFloki);
            System.out.println("Hp Guarda " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpFloki;
    }

    static int dueloHalroc(int hpHalroc, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n Ladrão " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpHalroc > 0 && hpInimigo > 0) {

            switch (Halroc.habilidades()) {
                case 1:
                    System.out.println("Halroc deu um corte rápido no ladrão");
                    hpInimigo -= 12;
                    break;
                case 2:
                    System.out.println("Halroc deu um corte sombrio no ladrão");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("Você deu um ponta pé no ladrão");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                 switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Ladrão aplicou um soco!");
                        hpHalroc -= 10;
                        break;
                    case 2:
                        System.out.println("Ladrão deu um triplo bye bye bird!");
                        hpHalroc -= 12;
                        break;
                }
             System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Halroc " + hpHalroc);
            System.out.println("Hp Ladrão " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpHalroc;
    }

    static int dueloYruan(int hpYruan, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n Ladrão " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpInimigo > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("Yruan eletrificou o ladrão");
                    hpInimigo -= 15;
                    break;
                case 2:
                    System.out.println("Yruan acertou um raio no ladrão");
                    hpInimigo -= 20;
                    break;
                case 3:
                    System.out.println("Yruan deu um ponta pé no ladrão");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("Ladrão aplicou um soco!");
                        hpYruan -= 10;
                        break;
                    case 2:
                        System.out.println("Ladrão deu um triplo bye bye bird!");
                        hpYruan -= 12;
                        break;
                }
         
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yruan " + hpYruan);
            System.out.println("Hp Ladrão " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYruan;
    }

    static int dueloYvenna(int hpYvenna, int hpInimigo) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n Ladrão " + hpInimigo);
        System.out.println("=-=-=-=-=-=");

        while (hpYvenna > 0 && hpInimigo > 0) {

            switch (Yvenna.habilidades()) {
                case 1:
                    System.out.println("Você atingiu o ladrão com a sua lança");
                    hpInimigo -= 20;
                    break;
                case 2:
                    System.out.println("Você deu um soco duplo e o ladrão foi parar no chão");
                    hpInimigo -= 15;
                    break;
                case 3:
                    System.out.println("Você deu um ponta pé");
                    hpInimigo -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                 switch (Ladrao.habilidades()) {
                    case 1:
                        System.out.println("Ladrão aplicou um soco!");
                        hpYvenna -= 10;
                        break;
                    case 2:
                        System.out.println("Ladrão deu um triplo bye bye bird!");
                        hpYvenna -= 12;
                        break;
                }
             System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yvenna " + hpYvenna);
            System.out.println("Hp Ladrão " + hpInimigo);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        }
        return hpYvenna;
    }
}

