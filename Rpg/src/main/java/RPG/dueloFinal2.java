/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RPG;

/**
 *
 * @author Leonardo
 */
public class dueloFinal2 {

      static int dueloAnnaFinal(int hpAnna, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n Astaroth " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpAnna > 0 && hpAstaroth > 0) {

            switch (AnnaFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("Anna Multilou o corpo de Astaroth!");
                    hpAstaroth -= 120;
                    break;
                case 2:
                    System.out.println("Anna atinge o ponto cego de Astaroth!");
                    hpAstaroth -= 130;
                    break;
                case 3:
                    System.out.println("Astaroth é atingido pela chuva de flechas de Anna!");
                    hpAstaroth -= 150;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA ?");
                    break;
            }
                 switch (Astaroth.habilidades()) {
                    case 1:
                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpAnna -= 157;
                    break;
                case 2:
                    System.out.println("[ASTAROTH] Ultilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                    hpAnna -= 145;
                    break;
                }
            
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Anna " + hpAnna);
            System.out.println("Hp Ladrão " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpAnna;
    }

    static int dueloFlokiFinal(int hpFloki, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n Astaroth " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpFloki > 0 && hpAstaroth > 0) {

            switch (FlokiFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("Astaroth caiu dentro de uma ravina causados por Floki!");
                    hpAstaroth -= 127;
                    break;
                case 2:
                    System.out.println("Floki ficou em modo Berkserk fez combos em cima de Astaroth ultilizando seu Machado!");
                    hpAstaroth -= 138;
                    break;
                case 3:
                    System.out.println("Floki drenou a vida de Astaroth e recebeu pontod de vida");
                    hpFloki += 89;
                    hpAstaroth-=89;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA ?");
                    break;
            }
                 switch (Astaroth.habilidades()) {
                    case 1:
                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpFloki -= 157;
                    break;
                case 2:
                  System.out.println("[ASTAROTH] Ultilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                    hpFloki -= 145;
                    break;
                }
            
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Floki " + hpFloki);
            System.out.println("Hp Guarda " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpFloki;
    }

    static int dueloHalrocFinal(int hpHalroc, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n Ladrão " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpHalroc > 0 && hpAstaroth > 0) {

            switch (HalrocFinal.habilidadesFinal()){
                case 1:
                    System.out.println("Halroc fez um corte em super velocidade rápido em Astaroth!");
                    hpAstaroth -= 126;
                    break;
                case 2:
                    System.out.println("Halroc corta Astaroth com sua lamina negra diversas vezes!");
                    hpAstaroth -= 158;
                    break;
                case 3:
                    System.out.println("O Astaroth é ferido pela explosão do kit de bombas em seu rosto!");
                    hpAstaroth -= 128;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA ?");
                    break;
            }
                 switch (Astaroth.habilidades()) {
                    case 1:
                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpHalroc -= 157;
                    break;
                case 2:
                    System.out.println("[ASTAROTH] Ultilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                    hpHalroc -= 145;
                    break;                }
             System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Halroc " + hpHalroc);
            System.out.println("Hp Ladrão " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpHalroc;
    }

    static int dueloYruanFinal(int hpYruan, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n Ladrão " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpAstaroth > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("O Astaroth recebeu um alta quantidade de energia em alta voltagem.");
                    hpAstaroth -= 110;
                    break;
                case 2:
                    System.out.println("O Astaroth foi atingido pelo combo de dragões");
                    hpAstaroth -= 146;
                    break;
                case 3:
                    System.out.println("Yruan fica completamente invisivel e ataca Astaroth diversas vezes");
                    hpAstaroth -= 97;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA ?");
                    break;
            }
                switch (Astaroth.habilidades()) {
                    case 1:
                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpYruan -= 157;
                    break;
                case 2:
                    System.out.println("[ASTAROTH] Ultilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                    hpYruan -= 145;
                    break;      
                }
         
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yruan " + hpYruan);
            System.out.println("Hp Astaroth " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpYruan;
    }

    static int dueloYvennaFinal(int hpYvenna, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n Ladrão " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpYvenna > 0 && hpAstaroth > 0) {

            switch (Yvenna.habilidades()) {  
                case 1:
                    System.out.println("O Astaroth é atingido por meteoros do céu");
                    hpAstaroth -= 120;
                    break;
                case 2:
                    System.out.println("Yvenna corta o Astaroth em seu ponto vuneravel!");
                    hpAstaroth -= 134;
                    break;
                case 3:
                    System.out.println("Cresce varios espinhos divinos no corpo de Astaroyh");
                    hpAstaroth -= 130;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
                 switch (Astaroth.habilidades()) {
                    case 1:

                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpYvenna -= 109;
                    break;
                case 2:
                    System.out.println("[ASTAROTH] Ultilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                    hpYvenna -= 145;
                    break;
                }
             System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp Yvenna " + hpYvenna);
            System.out.println("Hp ASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        return hpYvenna;
    }
}

