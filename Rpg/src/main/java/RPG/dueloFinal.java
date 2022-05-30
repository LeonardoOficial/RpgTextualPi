/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RPG;

//**
//* @author leonardo.ssantos60
public class dueloFinal {

    static int dueloAnna(int hpAnna, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n ASTAROTH  " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpAnna > 0 && hpAstaroth > 0) {
            switch (Anna.habilidades()) {
                case 1:
                    System.out.println("Anna esfaqueou o Ladrão! \n--SÓ FEZ CARINHO--");
                    hpAstaroth -= 20;
                    break;
                case 2:
                    System.out.println("Anna acertou o Ladrão com uma flecha! \n-- NÃO DEU DANO O SUFICIENTE!--");
                    hpAstaroth -= 12;
                    break;
                case 3:
                    System.out.println("O Astaroth foi atingido pelas flechas de Anna! \n--MAS NÃO ESTA CAUSANDO EFEITO--");
                    hpAstaroth -= 15;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!-- VOCÊ ACABA DE SENTENCIAR A PROPRIA MORTE");
                    break;
            }
            switch (Astaroth.habilidades()) {
                case 1:

                    System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                    hpAnna -= 1000;
                    break;
                case 2:
                    System.out.println("[ASTAROTH]\n utilizou o FULGOR NEGRO");
                    System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                    hpAnna -= 2000;
                    break;
            }
        }
        return hpAnna;
    }

    static int dueloFloki(int hpFloki, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpFloki > 0 && hpAstaroth > 0) {

            switch (Floki.habilidades()) {
                case 1:
                    System.out.println("ASTAROTH nem se mexeu com os tremores causados por Floki!");
                    hpAstaroth -= 12;
                    break;
                case 2:
                    System.out.println("Floki deu uma machadada em ASTAROTH! MAS, SÓ FEZ CARINHO");
                    hpAstaroth -= 15;
                    break;
                case 3:
                    System.out.println("Floki recuperou parte da vida! PIOR ESCOLHA QUE VOCÊ JÁ FEZ!");
                    hpFloki += 10;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ACABA DE SENTENCIAR A PROPRIA MORTE");
                    break;
            }
            if (hpAstaroth > 0) {

                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        System.out.println("s");
                        hpFloki -= 1000;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH]\n utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpFloki -= 2000;
                        break;
                }
            }
        }
        return hpFloki;
    }

    static int dueloHalroc(int hpHalroc, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpHalroc > 0 && hpAstaroth > 0) {

            switch (Halroc.habilidades()) {
                case 1:
                    System.out.println("Halroc deu um corte rápido em ASTAROTH! MAS O CORTE NÃO CHEGOU A FERI-LO");
                    hpAstaroth -= 12;
                    break;
                case 2:
                    System.out.println("Halroc deu um corte sombrio no ASTAROTH! O CORTE FOI PROFUNDO, MAS NÃO O SUFICIENTE");
                    hpAstaroth -= 15;
                    break;
                case 3:
                    System.out.println("O ASTAROTH é ferido pela explosão da bomba! MAS O DANO É MINIMO");
                    hpAstaroth -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ACABOU DE SENTENCIAR SUA MORTE");
                    break;
            }

            if (hpAstaroth > 0) {

                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpHalroc -= 1000;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH]\n ultilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpHalroc -= 2000;
                        break;
                }
            }
        }
        return hpHalroc;
    }

    static int dueloYruan(int hpYruan, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpAstaroth > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("ASTAROTH foi eletrificado! MAS, A CARGA NÃO FOI SUFICIENTE PARA DERRUBAR ASTAROTH");
                    hpAstaroth -= 15;
                    break;
                case 2:
                    System.out.println("O Guarda foi antigido por Yruan! O RAIO CAIRIA EM ASTAROTH, MAS NÃO O MATAVA");
                    hpAstaroth -= 20;
                    break;
                case 3:
                    System.out.println("Yruan golpeia o Guarda! ASTAROTH APENAS SENTIU COCEGAS");
                    hpAstaroth -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! PIOR ESCLHA QUE VOCÊ PODERIA TER FEITO");
                    break;
            }
            if (hpAstaroth > 0) {

                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        System.out.println("s");
                        hpYruan -= 1000;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH]\n utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpYruan -= 2000;
                        break;
                }
            }
        }
        return hpYruan;
    }

    static int dueloYvenna(int hpYvenna, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpYvenna > 0 && hpAstaroth > 0) {

            switch (Yvenna.habilidades()) {
                case 1:
                    System.out.println("O Guarda foi acertado pela pedra!NÃO CAUSOU MUITO EFEITO");
                    hpAstaroth -= 20;
                    break;
                case 2:
                    System.out.println("Yvenna  faz um corte em ASTAROTH com sua lança! MAS O CORTE NÃO CHEGOU A SER PROFUNDO");
                    hpAstaroth -= 15;
                    break;
                case 3:
                    System.out.println("ASTAROTH é atingido pelos espinhos! MAS APENAS FAZ CARINHO");
                    hpAstaroth -= 12;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!PIOR ESCOLHA QUE VOCÊ JÁ FEZ");
                    break;
            }
            if (hpAstaroth > 0) {

                switch (Guarda.habilidades()) {
                    case 1:
                        System.out.println("ASTAROTH\n fez um corte com a CEIFADORA DE ALMAS");
                        System.out.println("s");
                        hpYvenna -= 1000;
                        break;
                    case 2:
                        System.out.println("ASTAROTH\n utilizou o FULGOR NEGRO");
                        System.out.println("ASTAROTH levanta seu braço e uma esfera negra é criada no recinto,deixando tudo escuro como o vazio");
                        hpYvenna -= 2000;
                        break;
                }
            }
            
        }
    return hpYvenna;
}
}
