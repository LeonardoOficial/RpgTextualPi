
package RPG;


public class dueloFinal2 {

      static int dueloAnnaFinal(int hpAnna, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Anna " + hpAnna);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpAnna > 0 && hpAstaroth > 0) {

            switch (AnnaFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("Anna Multilou o corpo de ASTAROTH!");
                    hpAstaroth -= 120;
                    break;
                case 2:
                    System.out.println("Anna atinge o ponto cego de ASTAROTH!");
                    hpAstaroth -= 130;
                    break;
                case 3:
                    System.out.println("ASTAROTH é atingido pela chuva de flechas de Anna!");
                    hpAstaroth -= 150;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA ?");
                    break;
            }
            if (hpAstaroth > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpAnna -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH] Utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                        hpAnna -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nAnna " + hpAnna);
            System.out.println("Hp \nASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpAnna > 0 && hpAstaroth < 0) {
            System.out.println("\n[ASTAROTH] - NÃO, NÃO PODE SER, EU, O SER MAIS FORTE QUE JÁ PISOU NESSAS TERRAS, FUI DERROTADO!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Anna sai correndo para o corpo de Elizabeth, percebendo que ela se sacrificou para que ficasse mais forte --*");
            System.out.println("(Anna) - Obrigado Elizabeth, saiba que esse mundo só pôde ser salvo graças à você");
            System.out.println("*-- Anna começa a chorar --*");
            System.out.println("*-- Passa-se um tempo e Anna decide que não poderia ficar ali por muito mais tempo, afinal o rei deveria saber de tudo que aconteceu --*\n");

            System.out.println("\n*-- Anna retorna ao castelo e fala com o mensageiro, pedindo por uma conversa com o rei --*");
            System.out.println("*-- Depos de passar um tempo esperando, o rei chama por Anna e pede que venha à sua mesa de jantar --*");
            System.out.println("*-- Assim que Anna passa pela porta, o rei começa a falar --*\n");

            System.out.println("[Rei Gerald IV] - Pois bem me conte o resultado");
            System.out.println("(Anna) - Eu matei ASTAROTH!");
            System.out.println("[Rei Gerald IV] - Ótimo, era dessa notícia que eu precisava");

            System.out.println("\n*-- Após mais tempo de conversa, o rei te faz uma pergunta--*\n");
            System.out.println("[Rei Gerald IV] - Acredito que depois de tudo que passou, você esteja precisando de uma festinha né");
            System.out.println("(Anna) - Acho que estou precisando mesmo");
            System.out.println("[Rei Gerald IV] - Então irei providenciar, para tamanho feito, deve haver uma grandiosa festa");
            System.out.println("[Rei Gerald IV] - Farei disso um dia importante no Reino, para que não se enqueçam disso jamais");
            System.out.println("[Rei Gerald IV] - Mas você terá de esperar um pouco, tudo bem?");
            System.out.println("(Anna) - Mas é claro!!");
        } else if (hpAnna < 0 && hpAstaroth > 0) {
            System.out.println("[Astaroth] - HAHAHAHAHA!! NEM COM A AJUDA DAQUELES MALDITOS VOCÊ CONSEGUE ME DERROTAR HAHAHAHA!!");
            System.out.println("*--     Você Morreu     --*");
            System.out.println("\n*-- ASTAROTH PISA EM SEU CADÁVER E USA SEU PODER SUPREMO, A IRA INIGUALÁVEL --*");
            System.out.println("ELE CONSOME A VIDA DE TODOS E DESTROI TUDO EM SEU CAMINHO");
        }

        return hpAnna;
    }

    static int dueloFlokiFinal(int hpFloki, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Floki " + hpFloki);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpFloki > 0 && hpAstaroth > 0) {

            switch (FlokiFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("ASTAROTH caiu dentro de uma ravina causados por Floki!");
                    hpAstaroth -= 127;
                    break;
                case 2:
                    System.out.println("Floki ficou em modo Berkserk fez combos em cima de ASTAROTH utilizando seu Machado!");
                    hpAstaroth -= 138;
                    break;
                case 3:
                    System.out.println("Floki drenou a vida de ASTAROTH e recebeu ponto de vida");
                    hpFloki += 89;
                    hpAstaroth -= 89;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTÁ SUPER IRADO, POR QUE ERRAR AGORA? ");
                    break;
            }
            if (hpAstaroth > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpFloki -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH] Utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                        hpFloki -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }

            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nFloki " + hpFloki);
            System.out.println("Hp \nASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpFloki > 0 && hpAstaroth < 0) {
            System.out.println("\n[ASTAROTH] - NÃO, NÃO PODE SER, EU, O SER MAIS FORTE QUE JÁ PISOU NESSAS TERRAS, FUI DERROTADO!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Floki sai correndo para o corpo de Elizabeth, percebendo que ela se sacrificou para que ficasse mais forte --*");
            System.out.println("(Floki) - Obrigado Elizabeth, saiba que esse mundo só pôde ser salvo graças à você");
            System.out.println("*-- Floki começa a chorar --*");
            System.out.println("*-- Passa-se um tempo e Floki decide que não poderia ficar ali por muito mais tempo, afinal o rei deveria saber de tudo que aconteceu --*\n");

            System.out.println("\n*-- Floki retorna ao castelo e fala com o mensageiro, pedindo por uma conversa com o rei --*");
            System.out.println("*-- Depos de passar um tempo esperando, o rei chama por Floki e pede que venha à sua mesa de jantar --*");
            System.out.println("*-- Assim que Floki passa pela porta, o rei começa a falar --*\n");

            System.out.println("[Rei Gerald IV] - Pois bem me conte o resultado");
            System.out.println("(Floki) - Eu matei ASTAROTH!");
            System.out.println("[Rei Gerald IV] - Ótimo, era dessa notícia que eu precisava");

            System.out.println("\n*-- Após mais tempo de conversa, o rei te faz uma pergunta--*\n");
            System.out.println("[Rei Gerald IV] - Acredito que depois de tudo que passou, você esteja precisando de uma festinha né");
            System.out.println("(Floki) - Acho que estou precisando mesmo");
            System.out.println("[Rei Gerald IV] - Então irei providenciar, para tamanho feito, deve haver uma grandiosa festa");
            System.out.println("[Rei Gerald IV] - Farei disso um dia importante no Reino, para que não se enqueçam disso jamais");
            System.out.println("[Rei Gerald IV] - Mas você terá de esperar um pouco, tudo bem?");
            System.out.println("(Floki) - Mas é claro!!");
        } else if (hpFloki < 0 && hpAstaroth > 0) {
            System.out.println("[ASTAROTH] - HAHAHAHAHA!! NEM COM A AJUDA DAQUELES MALDITOS VOCÊ CONSEGUE ME DERROTAR HAHAHAHA!!");
            System.out.println("*--     Você Morreu     --*");
            System.out.println("\n*-- ASTAROTH PISA EM SEU CADÁVER E USA SEU PODER SUPREMO, A IRA INIGUALÁVEL --*");
            System.out.println("ELE CONSOME A VIDA DE TODOS E DESTROI TUDO EM SEU CAMINHO");
        }

        return hpFloki;
    }

    static int dueloHalrocFinal(int hpHalroc, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Harolc " + hpHalroc);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpHalroc > 0 && hpAstaroth > 0) {

            switch (HalrocFinal.habilidadesFinal()) {
                case 1:
                    System.out.println("Halroc fez um corte em super velocidade rápido em ASTAROTH!");
                    hpAstaroth -= 126;
                    break;
                case 2:
                    System.out.println("Halroc corta ASTAROTH com sua lâmina negra diversas vezes!");
                    hpAstaroth -= 158;
                    break;
                case 3:
                    System.out.println("O ASTAROTH é ferido pela explosão do kit de bombas em seu rosto!");
                    hpAstaroth -= 128;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA? ");
                    break;
            }
            if (hpAstaroth > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpHalroc -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH] Utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                        hpHalroc -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nHalroc " + hpHalroc);
            System.out.println("Hp \nASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpHalroc > 0 && hpAstaroth < 0) {
            System.out.println("\n[ASTAROTH] - NÃO, NÃO PODE SER, EU, O SER MAIS FORTE QUE JÁ PISOU NESSAS TERRAS, FUI DERROTADO!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Halroc sai correndo para o corpo de Elizabeth, percebendo que ela se sacrificou para que ficasse mais forte --*");
            System.out.println("(Halroc) - Obrigado Elizabeth, saiba que esse mundo só pôde ser salvo graças à você");
            System.out.println("*-- Halroc começa a chorar --*");
            System.out.println("*-- Passa-se um tempo e Halroc decide que não poderia ficar ali por muito mais tempo, afinal o rei deveria saber de tudo que aconteceu --*\n");

            System.out.println("\n*-- Halroc retorna ao castelo e fala com o mensageiro, pedindo por uma conversa com o rei --*");
            System.out.println("*-- Depos de passar um tempo esperando, o rei chama por Halroc e pede que venha à sua mesa de jantar --*");
            System.out.println("*-- Assim que Halroc passa pela porta, o rei começa a falar --*\n");

            System.out.println("[Rei Gerald IV] - Pois bem me conte o resultado");
            System.out.println("(Halroc) - Eu matei ASTAROTH!");
            System.out.println("[Rei Gerald IV] - Ótimo, era dessa notícia que eu precisava");

            System.out.println("\n*-- Após mais tempo de conversa, o rei te faz uma pergunta--*\n");
            System.out.println("[Rei Gerald IV] - Acredito que depois de tudo que passou, você esteja precisando de uma festinha né");
            System.out.println("(Halroc) - Acho que estou precisando mesmo");
            System.out.println("[Rei Gerald IV] - Então irei providenciar, para tamanho feito, deve haver uma grandiosa festa");
            System.out.println("[Rei Gerald IV] - Farei disso um dia importante no Reino, para que não se enqueçam disso jamais");
            System.out.println("[Rei Gerald IV] - Mas você terá de esperar um pouco, tudo bem?");
            System.out.println("(Halroc) - Mas é claro!!");
        } else if (hpHalroc < 0 && hpAstaroth > 0) {
            System.out.println("[ASTAROTH] - HAHAHAHAHA!! NEM COM A AJUDA DAQUELES MALDITOS VOCÊ CONSEGUE ME DERROTAR HAHAHAHA!!");
            System.out.println("*--     Você Morreu     --*");
            System.out.println("\n*-- ASTAROTH PISA EM SEU CADÁVER E USA SEU PODER SUPREMO, A IRA INIGUALÁVEL --*");
            System.out.println("ELE CONSOME A VIDA DE TODOS E DESTROI TUDO EM SEU CAMINHO");
        }

        return hpHalroc;
    }

    static int dueloYruanFinal(int hpYruan, int hpAstaroth) {
        System.out.println("=-=-=-=-=-=");
        System.out.println("HP \n Yruan " + hpYruan);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=");

        while (hpYruan > 0 && hpAstaroth > 0) {

            switch (Yruan.habilidades()) {
                case 1:
                    System.out.println("O ASTAROTH recebeu um alta quantidade de energia em alta voltagem.");
                    hpAstaroth -= 110;
                    break;
                case 2:
                    System.out.println("O ASTAROTH foi atingido pelo combo de dragões");
                    hpAstaroth -= 146;
                    break;
                case 3:
                    System.out.println("Yruan fica completamente invisivel e ataca ASTAROTH diversas vezes");
                    hpAstaroth -= 97;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA! VOCÊ ESTA SUPER IRADO, POR QUE ERRAR AGORA? ");
                    break;
            }
            if (hpAstaroth > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:
                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpYruan -= 157;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH] Utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                        hpYruan -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }

            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYruan " + hpYruan);
            System.out.println("Hp \nASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpYruan > 0 && hpAstaroth < 0) {
            System.out.println("\n[ASTAROTH] - NÃO, NÃO PODE SER, EU, O SER MAIS FORTE QUE JÁ PISOU NESSAS TERRAS, FUI DERROTADO!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Yruan sai correndo para o corpo de Elizabeth, percebendo que ela se sacrificou para que ficasse mais forte --*");
            System.out.println("(Yruan) - Obrigado Elizabeth, saiba que esse mundo só pôde ser salvo graças à você");
            System.out.println("*-- Yruan começa a chorar --*");
            System.out.println("*-- Passa-se um tempo e Yruan decide que não poderia ficar ali por muito mais tempo, afinal o rei deveria saber de tudo que aconteceu --*\n");

            System.out.println("\n*-- Yruan retorna ao castelo e fala com o mensageiro, pedindo por uma conversa com o rei --*");
            System.out.println("*-- Depos de passar um tempo esperando, o rei chama por Yruan e pede que venha à sua mesa de jantar --*");
            System.out.println("*-- Assim que Yruan passa pela porta, o rei começa a falar --*\n");

            System.out.println("[Rei Gerald IV] - Pois bem me conte o resultado");
            System.out.println("(Yruan) - Eu matei ASTAROTH!");
            System.out.println("[Rei Gerald IV] - Ótimo, era dessa notícia que eu precisava");

            System.out.println("\n*-- Após mais tempo de conversa, o rei te faz uma pergunta--*\n");
            System.out.println("[Rei Gerald IV] - Acredito que depois de tudo que passou, você esteja precisando de uma festinha né");
            System.out.println("(Yruan) - Acho que estou precisando mesmo");
            System.out.println("[Rei Gerald IV] - Então irei providenciar, para tamanho feito, deve haver uma grandiosa festa");
            System.out.println("[Rei Gerald IV] - Farei disso um dia importante no Reino, para que não se enqueçam disso jamais");
            System.out.println("[Rei Gerald IV] - Mas você terá de esperar um pouco, tudo bem?");
            System.out.println("(Yruan) - Mas é claro!!");
        } else if (hpYruan < 0 && hpAstaroth > 0) {
            System.out.println("[ASTAROTH] - HAHAHAHAHA!! NEM COM A AJUDA DAQUELES MALDITOS VOCÊ CONSEGUE ME DERROTAR HAHAHAHA!!");
            System.out.println("*--     Você Morreu     --*");
            System.out.println("\n*-- ASTAROTH PISA EM SEU CADÁVER E USA SEU PODER SUPREMO, A IRA INIGUALÁVEL --*");
            System.out.println("ELE CONSOME A VIDA DE TODOS E DESTROI TUDO EM SEU CAMINHO");
        }

        return hpYruan;
    }

    static int dueloYvennaFinal(int hpYvenna, int hpAstaroth) {
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("HP \n Yvenna " + hpYvenna);
        System.out.println("HP \n ASTAROTH " + hpAstaroth);
        System.out.println("=-=-=-=-=-=\n");

        while (hpYvenna > 0 && hpAstaroth > 0) {

            switch (Yvenna.habilidades()) {
                case 1:
                    System.out.println("O ASTAROTH é atingido por meteoros do céu");
                    hpAstaroth -= 120;
                    break;
                case 2:
                    System.out.println("Yvenna corta o ASTAROTH em seu ponto vunerável!");
                    hpAstaroth -= 134;
                    break;
                case 3:
                    System.out.println("Cresce vários espinhos divinos no corpo de ASTAROTH");
                    hpAstaroth -= 130;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
            if (hpAstaroth > 0) {
                switch (Astaroth.habilidades()) {
                    case 1:

                        System.out.println("[ASTAROTH]\n fez um corte com a CEIFADORA DE ALMAS");
                        hpYvenna -= 109;
                        break;
                    case 2:
                        System.out.println("[ASTAROTH] Utilizou o FULGOR NEGRO");
                        System.out.println("[ASTAROTH] Levantando seu braço e criando uma esfera negra no recinto,deixando tudo escuro como o vazio");
                        hpYvenna -= 145;
                        break;
                }
            } else {
                System.out.println("ASTAROTH DERROTADO!!!");
                break;
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Hp \nYvenna " + hpYvenna);
            System.out.println("Hp \nASTAROTH " + hpAstaroth);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
        }
        if (hpYvenna > 0 && hpAstaroth < 0) {
            System.out.println("\n[ASTAROTH] - NÃO, NÃO PODE SER, EU, O SER MAIS FORTE QUE JÁ PISOU NESSAS TERRAS, FUI DERROTADO!!!");
            System.out.println("*-- Após derrotar ASTAROTH, Yvenna sai correndo para o corpo de Elizabeth, percebendo que ela se sacrificou para que ficasse mais forte --*");
            System.out.println("(Yvenna) - Obrigado Elizabeth, saiba que esse mundo só pôde ser salvo graças à você");
            System.out.println("*-- Yvenna começa a chorar --*");
            System.out.println("*-- Passa-se um tempo e Yvennai decide que não poderia ficar ali por muito mais tempo, afinal o rei deveria saber de tudo que aconteceu --*\n");

            System.out.println("\n*-- Yvenna retorna ao castelo e fala com o mensageiro, pedindo por uma conversa com o rei --*");
            System.out.println("*-- Depos de passar um tempo esperando, o rei chama por Yvenna e pede que venha à sua mesa de jantar --*");
            System.out.println("*-- Assim que Yvenna passa pela porta, o rei começa a falar --*\n");

            System.out.println("[Rei Gerald IV] - Pois bem me conte o resultado");
            System.out.println("(Yvenna) - Eu matei ASTAROTH!");
            System.out.println("[Rei Gerald IV] - Ótimo, era dessa notícia que eu precisava");

            System.out.println("\n*-- Após mais tempo de conversa, o rei te faz uma pergunta--*\n");
            System.out.println("[Rei Gerald IV] - Acredito que depois de tudo que passou, você esteja precisando de uma festinha né");
            System.out.println("(Yvenna) - Acho que estou precisando mesmo");
            System.out.println("[Rei Gerald IV] - Então irei providenciar, para tamanho feito, deve haver uma grandiosa festa");
            System.out.println("[Rei Gerald IV] - Farei disso um dia importante no Reino, para que não se enqueçam disso jamais");
            System.out.println("[Rei Gerald IV] - Mas você terá de esperar um pouco, tudo bem?");
            System.out.println("(Yvenna) - Mas é claro!!");
        } else if (hpYvenna < 0 && hpAstaroth > 0) {
            System.out.println("[ASTAROTH] - HAHAHAHAHA!! NEM COM A AJUDA DAQUELES MALDITOS VOCÊ CONSEGUE ME DERROTAR HAHAHAHA!!");
            System.out.println("*--     Você Morreu     --*");
            System.out.println("\n*-- ASTAROTH PISA EM SEU CADÁVER E USA SEU PODER SUPREMO, A IRA INIGUALÁVEL --*");
            System.out.println("ELE CONSOME A VIDA DE TODOS E DESTROI TUDO EM SEU CAMINHO");
        }

        return hpYvenna;
    }
}

