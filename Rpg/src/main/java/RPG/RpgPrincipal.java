
package RPG;

import java.util.Scanner;


public class RpgPrincipal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha = 0, opcao, menu = 0, personagem;
        int carisma = 10;
        String name = null;

        System.out.println("                                                                           \n"
                + "@@@  @@@  @@@  @@@@@@@@   @@@@@@   @@@@@@@    @@@@@@   @@@  @@@   @@@@@@   \n"
                + "@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@   \n"
                + "@@!  @@!  @@!  @@!       @@!  @@@  @@!  @@@  @@!  @@@  @@!@!@@@  !@@       \n"
                + "!@!  !@!  !@!  !@!       !@!  @!@  !@!  @!@  !@!  @!@  !@!!@!@!  !@!       \n"
                + "@!!  !!@  @!@  @!!!:!    @!@!@!@!  @!@@!@!   @!@  !@!  @!@ !!@!  !!@@!!    \n"
                + "!@!  !!!  !@!  !!!!!:    !!!@!!!!  !!@!!!    !@!  !!!  !@!  !!!   !!@!!!   \n"
                + "!!:  !!:  !!:  !!:       !!:  !!!  !!:       !!:  !!!  !!:  !!!       !:!  \n"
                + ":!:  :!:  :!:  :!:       :!:  !:!  :!:       :!:  !:!  :!:  !:!      !:!   \n"
                + " :::: :: :::    :: ::::  ::   :::   ::       ::::: ::   ::   ::  :::: ::   \n"
                + "  :: :  : :    : :: ::    :   : :   :         : :  :   ::    :   :: : :    \n"
                + "                                                                           \n"
                + "                                                                           \n"
                + "@@@       @@@@@@@@   @@@@@@@@  @@@@@@@@  @@@  @@@  @@@@@@@    @@@@@@       \n"
                + "@@@       @@@@@@@@  @@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@@@@@       \n"
                + "@@!       @@!       !@@        @@!       @@!@!@@@  @@!  @@@  !@@           \n"
                + "!@!       !@!       !@!        !@!       !@!!@!@!  !@!  @!@  !@!           \n"
                + "@!!       @!!!:!    !@! @!@!@  @!!!:!    @!@ !!@!  @!@  !@!  !!@@!!        \n"
                + "!!!       !!!!!:    !!! !!@!!  !!!!!:    !@!  !!!  !@!  !!!   !!@!!!       \n"
                + "!!:       !!:       :!!   !!:  !!:       !!:  !!!  !!:  !!!       !:!      \n"
                + " :!:      :!:       :!:   !::  :!:       :!:  !:!  :!:  !:!      !:!       \n"
                + " :: ::::   :: ::::   ::: ::::   :: ::::   ::   ::   :::: ::  :::: ::       \n"
                + ": :: : :  : :: ::    :: :: :   : :: ::   ::    :   :: :  :   :: : :        \n"
                + "                                                                           \n\n");

        do {

            System.out.print("=============================\n");
            System.out.print("          [1] JOGAR          \n");
            System.out.print("          [2] CRÉDITOS       \n");
            System.out.print("          [3] COMANDOS       \n");
            System.out.print("=============================\n\n\n");
            System.out.println("Digite uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Gostaria de iniciar");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NÃO");
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("Iniciando o Jogo\n \n");
                        break;
                    } else if (menu == 2) {
                        break;
                    }

                case 2:
                    System.out.println("Directed: Amaury S. Alves");
                    System.out.println("Executive Producer: Leonardo S. Santos");
                    System.out.println("Production Director: Amaurilio S. Alves");
                    System.out.println("Visual Producer: Erik S. Sena");
                    System.out.println("History: Catiane s. Nascimento ");
                    System.out.println("Plot: Cintia L. Gentil \n \n");

                    System.out.println("Quer voltar ao menu do jogo?");

                    System.out.println("[1] - NÃO, Você irá para o jogo diretamente.");
                    System.out.println("[2] - SIM");

                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("\n Iniciando");
                        break;
                    } else if (menu == 2) {
                        break;
                    }

                case 3:
                    // HA FAZER
                    break;

            }
        } while (menu != 1);
        System.out.println("Sejam bem-vindos! A cidade de Lavenham, uma das cidades mais rica de Nochma, nela você irá"
                + " descobrir que todos nós temos um mistério a ser revelado! \n");

        do {
            System.out.println("**--Escolha o seu personagem--**");
            System.out.println("[1] Anna");
            System.out.println("[2] Floki");
            System.out.println("[3] Halroc Christoper");
            System.out.println("[4] Yruan");
            System.out.println("[5] Yvenna Kallamara");
            personagem = input.nextInt();

            switch (personagem) {
                case 1:
                    Anna.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Anna";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 2:
                    Floki.apresentacao();
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Floki";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 3:
                    Halroc.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Halroc";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 4:
                   Yruan.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yruan";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }

                case 5:
                    Yvenna.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yvenna";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
            }

        } while (escolha != 1);

        System.out.println(name + " está no centro da cidade, onde se tem um vasto comércio de objetos artesanais, uma praça pública em frente a igreja e a 3km de distância tem o castelo do rei Gerald IV, ");
        System.out.println("onde tem uma imensa muralha, torres vigiadas o dia inteiro para a proteção do rei, familiares e de seu tesouro e no fundo do castelo tem ");
        System.out.println("o calabouço. Do lado leste à 5km está localizado a cidade dos anões, chamada de Yggdrasil, à norte a floresta de Dean, lá vive criaturas mágicas, do lado noroeste de ");
        System.out.println("Lavenham, há 20km está a tribo mística Salpphire. No Sul, são reinos mais pobres, portanto mais perigosos! ");

        System.out.println("\n\n- Veja! O mensageiro do rei na praça pública, ele tem um comunicado a se fazer, vamos ouvir o que ele tem a dizer?");
        System.out.println("\nEle disse que o rei está precisando de guerreiros dispostos a encarar desafios propostos por ele. Você aceita participar?");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Nao");
        escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("\n[Mensageiro] -- Vejam só, há um(a) nobre guerreiro(a) disposto(a) a enfrentar a criatura que está aterrorizando as terras do rei "
                        + "Qual é seu nome ?\n"
                        + "Meu nome é " + name + "!\n"
                        + "[Mensageiro] -- Vejo que você é de longe, o Rei vai adorar te conhcer, vamos para o castelo, lá você irá conhcecer o rei pessoalmente!\n");
                carisma = carisma + 2;

                System.out.println("*-- " + name + " e Mensageiro foram ao castelo, após chegarem, vão de encontro com o rei --*");
                System.out.println("[Mensageiro]() -- Com licença meu Rei, trouxe esse jovem aventureiro para conhecer o senhor, creio que ele poderá cumprir a missão imposta por vossa majestade.");
                System.out.println("[Rei Gerald IV]-- Isso é magnifico, então meu jovem, voce aparenta ser muito forte e habilidoso, porém, ainda nçao estou totalmente convencido.");
                System.out.println("[Rei Gerald IV]-- Irei testar sua força imediatamente");
                System.out.println(" **O Rei olha pra um de seus guardas e diz** , o acompanhe ate o centro de treinamento e lhe empreste uma arma adequada");
                System.out.println("[Rei Gerald IV]-- Estão prontos?");
                System.out.println("[Rei Gerald IV]-- LUTEM!!!");
                
                switch (name) {
                case "Anna":
                    dueloGuarda.dueloAnna(175, 43);
                    break;
                case "Floki":
                    dueloGuarda.dueloFloki(250, 43);
                    break;
                case "Halroc":
                    dueloGuarda.dueloHalroc(150, 43);
                    break;
                case "Yruan":
                    dueloGuarda.dueloYruan(140, 43);
                    break;
                case "Yvenna":
                    dueloGuarda.dueloYvenna(200, 43);
                    break;
            }
                
                System.out.println("[Rei Gerald IV]-- Já sei, agora voce irá duelar com um dos meus melhores guerreiros, ele é lider e comandante geral da guarda Real. ");
                
                switch (name) {
                case "Anna":
                    dueloGuarda.dueloAnna(175, 75);
                    break;
                case "Floki":
                    dueloGuarda.dueloFloki(250, 75);
                    break;
                case "Halroc":
                    dueloGuarda.dueloHalroc(150, 75);
                    break;
                case "Yruan":
                    dueloGuarda.dueloYruan(140, 75);
                    break;
                case "Yvenna":
                    dueloGuarda.dueloYvenna(200, 75);
                    break;
            }
                
                

                System.out.println("**-- PARABÉNS--**\n");
                System.out.println("Você acabou de receber +2 Pontos de carisma com a cidade, com esses pontos de carismas você consegue ter mais vantagens em algumas missões"
                        + " tente não recusar missões pois você pode acabar perdendo esses pontos, isso aumentara a dificuldade em alguns desafios\n");
                System.out.println("Quer ver seu nivel de carisma?");
                System.out.println("[1] - Sim");
                System.out.println("[2] - Nao");
                escolha = input.nextInt();
                if (escolha == 1) {
                    System.out.println("Seu atual nivel de Carisma com a cidade é: " + carisma);
                    break;
                } else if (escolha == 2) {
                    break;

                }

            case 2:
                System.out.println("[desconhecido1]-- Veja só, aquela pessoa é nova na cidade,você soube de um boato que mataram alguem ontem nos becos?\n");
                System.out.println("[Desconhecido2]-- Sim, provavelmente essa é a unica pessoa nova na cidade, não temos casos de assasinato há algum tempo, vamos chamar as autoridades!"
                        + "** Os desconhcidos chamam os guardas para levar você a cadeia!");
                
                 switch (name) {
                case "Anna":
                    dueloGuarda.dueloAnna(175, 90);
                    break;
                case "Floki":
                    dueloGuarda.dueloFloki(250, 90);
                    break;
                case "Halroc":
                    dueloGuarda.dueloHalroc(150, 90);
                    break;
                case "Yruan":
                    dueloGuarda.dueloYruan(140, 90);
                    break;
                case "Yvenna":
                    dueloGuarda.dueloYvenna(200, 90);
                    break;
            }
                
                
              
                System.out.println("Você perdeu -2 Pontos de carisma, se seu carisma chegar a 0, você poderá morrer por sofrer varias pedradas ao longo do caminho,"
                        + " Suba seu carismo para gnahar vantagens nas missões\n");
                carisma = carisma - 2;
                System.out.println("Seu atual nivel de carisma é: " + carisma);
                break;
        }
        
        // historia do javali \/
        
        System.out.println("Dirija-se a floresta e encontre o Javali.");
        //provavelmente uma condicional.

        System.out.println("Você chega na floresta."
                + "Veja, ali tem algumas pegadas e está dando a duas direções diferentes. ");

        int pegada;

        do {

            System.out.println("[1]Pegadas que levam a trilha da DIREITA ");
            System.out.println("[2]Pegadas que levam a trilha da ESQUERDA ");

            pegada = input.nextInt();

            switch (pegada) {
                case 1:

                    System.out.println("Pegadas te levam a um cervo");
                    System.out.println("Ele é muito dócil, não tem com o que se preocupar");
                    System.out.println("Continue Procurando");
                    break;
                case 2:
                    System.out.println("Pegadas te levam a um Javali, porém, não é o que você procura.");
                    System.out.println("Prepare-se, ele está vindo te atacar\n");

                    // Batalha com javali normal.
                     switch (name) {
                case "Anna":
                    dueloJavali.dueloAnna(175, 50);
                    break;
                case "Floki":
                    dueloJavali.dueloFloki(250, 50);
                    break;
                case "Halroc":
                    dueloJavali.dueloHalroc(150, 50);
                    break;
                case "Yruan":
                    dueloJavali.dueloYruan(140, 50);
                    break;
                case "Yvenna":
                    dueloJavali.dueloYvenna(200, 50);
                    break;
            }
                    
                    
                    break;
                default:
                    System.out.println("Escolha uma das opções!!");
            }
        } while (pegada != 1 && pegada != 2);

        System.out.println("[??????]Não adianta, você não vai achá-lo assim");
        System.out.println("**Uma figura mesteriosa aparece na sua frente**");
        System.out.println("[Desconhecido]: Olá, eu sou um caçador e eu sei muito qual animal você está procurando");
        System.out.println("[Caçador]: Não é assim que você vai achá-lo, como o próprio nome já diz  ");
        System.out.println("ELE É FLAMEJANTE!!");
        System.out.println("Esse jeito convencional não adianta, ou seja, você tem que procurar sinais de fogo na floresta");
        System.out.println("[Desconhecido]: Oh, olha, o que é aquilo? ");
        System.out.println("Você olha, e não ver nada, quando vira novamente, o caçador já não está mais lá.");

        System.out.println("Agora investigue a floresta e procure por sinais de incendio\n");

        int lugar = 0;
        do {

            System.out.println("[1]Adentrar a floresta. ");
            System.out.println("[2]Pequeno vilarejo ao lado da floresta ");
            System.out.println("[3]Lagoa");
            System.out.println("[4]Caverna misteriosa");

            lugar = input.nextInt();

            switch (lugar) {
                case 1:
                    System.out.println("Você adentrou a floresta");
                    System.out.println("Como pode ver ela parece normal, menos pelo cheiro de fumaça");
                    System.out.println("E olhe, também tem árvores carbonizadas, porém, é estranho.");
                    System.out.println("além de queimadas, elas também estão com rachaduras no meio");
                    System.out.println("Algo grande bateu nisso");
                    System.out.println("Porém, ja faz um tempo que aconteceu.");
                    System.out.println("Não há mais nada a fazer aqui\n");
                    break;
                case 2:
                    System.out.println("Você chegou no vilarejo.");
                    System.out.println("Está um cheiro insurpotavel de fumaça");
                    System.out.println("Veja só aquelas casas, completamente destruidas, não foi apenas um incêndio que causou isso");
                    System.out.println("Meu Deus, tem até corpos carbonizados.");
                    System.out.println("Não irei achar mais nada aqui\n");

                    break;
                case 3:
                    System.out.println("Você chegou na lagoa");
                    System.out.println("Está muito tranquilo por aqui,");
                    System.out.println("Você olha em volta e não encontra nada");
                    System.out.println("Vir aqui foi uma grande perda de tempo");
                    System.out.println("Não há nada a fazer aqui\n");

                    break;
                case 4:
                    System.out.println("Você chegou na caverna misteriosa");
                    System.out.println("como o proprio nome ja diz, ela é bem misteriosa");
                    System.out.println("POCOTÓ, POCOTÓ, POCOTÓ");
                    System.out.println("POOOOWWWWWW!!!!");
                    System.out.println("que barulho que foi esse?");
                    System.out.println("Parecia o impacto de alguma coisa e está vindo lá de dentro");
                    System.out.println("Espera, o que é aquele brilho vindo lá de dentro?");
                    System.out.println("WHOOOOSSSSSHHHHHH!!!!!");
                    System.out.println("nossa, quase que o acerta, isso foi perigoso");
                    System.out.println("não há duvidas, ele está lá dentro");
                    System.out.println("Ele está vindo, deve ter sentido seu cheiro");
                    System.out.println("PREPARE-SE!!!\n");

                    //Batalha contra o javali flamejante
                    switch (name) {
                case "Anna":
                    dueloJavaliF.dueloAnna(175, 120);
                    break;
                case "Floki":
                    dueloJavaliF.dueloFloki(250, 120);
                    break;
                case "Halroc":
                    dueloJavaliF.dueloHalroc(150, 120);
                    break;
                case "Yruan":
                    dueloJavaliF.dueloYruan(140, 120);
                    break;
                case "Yvenna":
                    dueloJavaliF.dueloYvenna(200, 120);
                    break;
            }
                    
                    
                    
                    break;
                default:
                    System.out.println("Escolha uma Opção");
            }
        } while (lugar != 4);
        
        
        // historia do bar
System.out.println("[Aliado do Rei - ] Vamos a taberna! comemorar por você ter vencido a luta contra aquela fera!\n"
        + name + ": Acho melhor não, estou aqui por motivos maiores, não posso perder o foco!\n"
                + "[Aliado do Rei - ] Vamos! Vai ser bom para conhecer a cidade e os moradores\n"
                + name +": Tudo bem! pensando desta forma, vai ser bom para me familiarizar\n");
        int avatar = 0;
        int donoDoBar = 0;

        System.out.println("*--Você entrou no Bar!--*");
        System.out.println("[Dono do Taverna] - Olá aventureiro(a)!");
        System.out.println("[Dono do Taverna] - Fiquei sabendo que você matou o javali flamejante que estava atormentando as os campos de plantação da cidade, "
                + "falo por todos da cidade que a partir de agora você será bem-vindo em Lavenham, como agradecimento venha tomar uma bebida ruim e barata com a gente!");
        System.out.println(".\n.\n.");
        System.out.println("*--Algum tempo se passou dentro da taverna--*\n");
        
        System.out.println("[Dono do Taverna] - Te proponho um desafio para ver se você é melhor que eu na cachaça, o desafio será da seguinte forma:");
        System.out.println("[Dono do Taverna] - Eu irei fazer uma pergunta, se você responder de forma correta, eu tomo um gole de rum, se você errar, você que irá beber\n");
        
        System.out.println("(" + name + "): Sim, eu aceito!, mas fique sabendo que você vai tomar na jabiroca");
        System.out.println("(" + name + "): Sou campeã(o) em tomar cachaça\n");
        
        System.out.println("[Dono do Taverna] - Seu pai, aquele cacacheiro, HAHAHA!");
        System.out.println("[Dono do Taverna] - Então vamos começar!");
        System.out.println("[Dono da Taverna] - Primeira pergunta, valendo um gole da minha cachaça");
        System.out.println("[Dono da Taverna] - O que a palavra legend significa em português?");
        System.out.println("a) Legenda\n"
                + "b) Conto\n"
                + "c) História\n"
                + "d) Lenda\n"
                + "e) Legendário");
        String p1 = input.next();

        switch (p1) {
            case "A":
            case "a":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cachaça--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Nossa, que bebida ruim!");
                }
                break;
            case "B":
            case "b":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cachaça--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Odiei!");
                }
                break;
            case "C":
            case "c":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cachaça--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que treco horrível!");
                }
                break;
            case "D":
            case "d":
                System.out.println("\n[Dono da Taverna] - Resposta certa!");
                System.out.println("[Dono da Taverna] - Você parece ser profissional mesmo");
                System.out.println("*-- Dono do Bar toma um gole da cachaça--*");
                donoDoBar = donoDoBar + 1;
                if (donoDoBar == 1) {
                    System.out.println("(" + name + "): Tu vai cair de tanto beber hoje!");
                }
                break;
            case "E":
            case "e":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cachaça--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que poiquera é essa!");
                }
                break;
        }
        System.out.println("\n\n[Dono da Taverna] - Segunda Pergunta: ");
        System.out.println("[Dono da Taverna] - Quem pintou Guernica?");
        System.out.println("a) Paulo Cesariano\n"
                + "b) Flávio Picaxu\n"
                + "c) Diogo Vergueira\n"
                + "d) Pastilha do Coral\n"
                + "e) Recife Delá");
        System.out.println("(" + name + "): Mas peraí, quem é Guernica?\n");
        System.out.println("[Dono do Bar] - Só responda logo!\n");
        System.out.println("(" + name + "): Ta bom véi.");
        String pf = input.next();
        switch (pf) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "C":
            case "c":
            case "D":
            case "d":
            case "E":
            case "e":
                
                System.out.println("\n[Dono da Taverna] - Errou mentecapto, não tem resposta certa!");
                System.out.println("[Dono da Taverna] - Esse era só pra ver se era bom mesmo");
                break;
            default:
                System.out.println("\n[Dono da Taverna] - Errou mentecapto, não tem resposta certa!");
                System.out.println("[Dono da Taverna] - Esse era só pra ver se era bom mesmo");

        }
        System.out.println("\n\n[Dono do Bar] - Pergunta de número 3:");
        System.out.println("[Dono do Bar] - Valendo 4 goles de cachaça!!!");
        System.out.println("[Dono do Bar] - O pai de Bodvar tem 5 filhos, eles são: Dez, Vinte, Trinta, Quarenta.");
        System.out.println("E qual é o nome do quinto filho?\n");
        String resposta = input.next();
        switch (resposta) {
            case "Bodvar":
            case "bodvar":
                System.out.println("\n[Dono do Bar] - Que onda é essa? você ganhou! Mas, você está se achando demais, quero ver a proxima perguta voce acertar ");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma três goles de sua cachaça--*");
                System.out.println("[Dono do Bar] - Eita cana braba da peste!!");
                donoDoBar = donoDoBar + 3;
                break;
            default:
                System.out.println("\n[Dono do Bar] - Você errou!! bastardo");
                System.out.println("*--" + name + " toma mais 3 goles da cachaça--*");
                System.out.println("(" + name + "): Pode encher que hoje é sexta-feita");
                avatar = avatar + 3;
        }
        System.out.println("[Dono do Bar] - Quarta Pergunta:");
        System.out.println("[Dono do Bar] - Se você está participando em uma corrida de cavalos e você ultrapassa o quarto lugar");
        System.out.println("[Dono do Bar] - Em que lugar você fica?");
        System.out.println("a) Terceiro\n"
                + "b) Quarto\n"
                + "c) Segundo\n"
                + "d) Primeiro");
        String enigma = input.next();
        switch (enigma) {
            case "b":
            case "B":
            case "quarto":
            case "Quarto":
            case "Quarto Lugar":
            case "quarto Lugar":
            case "quarto lugar":
            case "Quarto lugar":
                System.out.println("[Dono do Bar] - EiiTAAA! Bateu uma saudade dela!\n");
                System.out.println("(" + name + "): De quem ? \n");
                System.out.println("[DOno do bar] - Isqueçe BAHAHAHA");
                System.out.println("{Dono do Bar] - Só falta mais uma hein!!");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma quatro goles de sua cachaça--*\n");
                donoDoBar = donoDoBar + 4;
                break;
            default:
                 System.out.println("*--" + name + " toma mais 4 goles da cachaça--*");
                System.out.println("(" + name + "):- Aaahhh, Desce mais não que essas desçeram rasgando!");
                avatar = avatar + 4;
               break;
        }
        System.out.println("[Dono do Bar] - Ultima pergunta:");
        System.out.println("[Dono do Bar] - Um cara chegou no meu bar e deixou um papel com diversos números em continuação:");
        System.out.println("*--1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233... 610,987...--*");
        System.out.println("[Dono do Bar] - Vamos ver se você entende essa sequencia");
        System.out.println("[Dono do Bar] - Qual é o oitavo número depois do 987?");
        System.out.println("A)32.678\n"
                + "B) 47.526\n"
                + "C) 46.368\n"
                + "D) 57.943\n");
        String numero = input.next();
        switch (numero) {
            case "46368":
            case "46.368":
            case "46,368":
            case "c":
            case "C":
                
                System.out.println("[Dono do Bar] - Você é bom mesmo");
                System.out.println("[Dono do Bar] - Olokinho meu!!");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma cinco goles de sua cachaça--*");
                donoDoBar = donoDoBar + 5;
                break;
            default:
                System.out.println("[Dono do Bar] - Poxa meu nobre, isso foi facil demais! só não entende quem não quer!\n"
                        + "[Dono do bar] - Quem deixou isso aqui foi um tal de Fibonacci\n");
                System.out.println("*--" + name + " toma mais 5 goles da cachaça--*\n");
                System.out.println("(" + name + "):- OnDe É qui eu to? da Onde veio esaa mizera\n");
                avatar = avatar + 5;
                break;
        }
        if (donoDoBar > avatar) {
            System.out.println("\n*--Parabéns! Você Ganhou!--*\n");
            carisma = carisma + 10;
        } else {
            System.out.println("*--Fracassado! Você é um(a) cachaceiro(a) de primeira, bebeu todas e perdeu--*");
            carisma = carisma - 10;
        }

        // desafio do paradeiro do premio
        System.out.println(name +": É, realmente foi muito bom ter ido a taberna!\n"
                + "[DESCONHECIDO -]"+name+ ", vou embora! já está tarde!\n"
                        + "você quer ir?\n"
                        + name + ": Não, vou ficar! até mais!\n"
                                + "O tempo passou, "+name+" ficou no bar\n"
                                        + "acabará dormindo lá mesmo...");
        int npc, ladrao;
        
        
        

        System.out.println("Você desmaiou, acabou acordando no bar.\n");

        System.out.println("Ahh, que dor no corpo! o que aquele cara colocou na minha bebida, que me fez ficar assim?\n");

        System.out.println("Opa! cadê minha esfera?\n"
                + "Fui roubado!");

        System.out.println("Tente achar os suspeitos, temos ainda 3 pessoas no bar, elas sabem quem roubou a sua esfera!\n");

        System.out.println("Para quem você quer pedir essa informação?\n"
                + "[1]  Homem que está sentado a sua direita\n"
                + "[2] Garçonete\n"
                + "[3] Homem que está conversando com a garçonete.\n");
        npc = input.nextInt();

        while ((npc == 1) || (npc > 3)) {
            if (npc > 3) {
                System.out.println("OPERAÇÃO INVÁLIDA");
            } else {
                System.out.println("Boa noite,eu desmaiei e quando acordei percebi que roubaram o presente que o rei deu pra mim"
                        + " e eu quero saber se você viu quem foi?\n");
                System.out.println(" A que custo iria te dar essa informação?\n"
                        + "você é um estranho aqui nessa cidade! eu que deveria ter ganho essa esfera!"
                        + "Vamos, saia da minha frente!");
            }
            System.out.println("Pergunte para outra pessoa, para quem perguntar?");
            npc = input.nextInt();
        }
        System.out.println("Boa noite,eu desmaiei e quando acordei percebi que roubaram o presente que o rei deu pra mim"
                + " e eu quero saber se você viu quem foi?\n");
        System.out.println("Lamento o ocorrido, esses ladrões sempre estão na praça\n"
                + "Procure por alguém que está com roupas pretas, dos cabelos encaracolados.");

        System.out.println("Aparetemente a pessoa que te roubou está na praça que fica a 200m daqui. Caminhe até lá"
                + ".\n"
                + ".\n"
                + ".\n");
        System.out.println("Você chegou na praça, aviste a pessoa que te roubou.");
        System.out.println("Olhe a sua frente há dois homens, um está com roupas pretas e o outro tem cabelo encaracolado"
                + "quem você acha que é o ladrão????\n"
                + "[1] HOMEM DE PRETO\n"
                + "[2] HOMEM DE CABELO ENCARACOLADO\n");
        ladrao = input.nextInt();

        while ((ladrao > 2) || (ladrao == 1)) {
            if (ladrao == 1) {
                System.out.println("Você acusou a pessoa errada e agora sofrerá as consequências");
                System.out.println("Os guardas estão vindo, nem adianta correr");
                System.out.println("[GUARDA] - Venha, você será preso no calabouço");
                break;
            } else {
                System.out.println("OPERAÇÃO INVÁLIDA\n"
                        + "digite uma opção válida\n"
                        + "[1] HOMEM DE PRETO\n"
                        + "[2] HOMEM DE CABELO ENCARACOLADO\n");
                ladrao = input.nextInt();
            }
        }
        System.out.println("Você encontrou o ladrão, lute para recuperar seu artefato");
        
        switch (name) {
                case "Anna":
                    dueloLadrao.dueloAnna(60, 150);
                    break;
                case "Floki":
                    dueloLadrao.dueloFloki(60, 150);
                    break;
                case "Harolc":
                    dueloLadrao.dueloHalroc(60, 150);
                    break;
                case "Yruan":
                    dueloLadrao.dueloYruan(60, 150);
                    break;
                case "Yvenna":
                    dueloLadrao.dueloYvenna(60, 150);
                    break;
            }
        System.out.println("Além de perder a luta, você será preso no calabouço por acabar com a paz do reino de Nochma ");
        
        
        

        int escolha1, escolha2;
        String charada;

        System.out.println("Você foi preso no calabouço :( ");
        System.out.println("Por sorte você conseguiu roubar dos guardas o mapa do calabouço sem que eles "
                + "percebessem!!!!");

        do {
            System.out.println("Quer dar uma olhadinha no mapa?");
            System.out.println("[1] SIM");
            System.out.println("[2] NÃO");
            escolha1 = input.nextInt();

            switch (escolha1) {
                case 1:
                    System.out.println("#==============================|| ||\n"
                            + "#         E N T R A D A        || ||\n"
                            + "||E||#=========================|| ||\n"
                            + "||S||#                         || ||\n"
                            + "||C||#=========================|| ||\n"
                            + "||A||#     T U N Ú E L              \n"
                            + "||D||#=========================|| ||\n"
                            + "||A||#      P O R T A L             \n"
                            + "||R||#     S E C R E T O            \n"
                            + "||I||#=========================|| ||\n"
                            + "||A||#=========================|| ||\n"
                            + "######=========================|| ||");
                    break;
                case 2:
                    System.out.println("Vai ficar aqui até quando ... ");
                    System.out.println(".\n"
                            + ".\n"
                            + ".\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (escolha1 == 2);

        do {
            System.out.println("Olhando para o mapa, aparentemente você precisa chegar"
                    + "até o portal secreto, qual caminho irá seguir????");
            System.out.println("[1] ESCADARIA");
            System.out.println("[2] TÚNEL");
            escolha2 = input.nextInt();

            switch (escolha2) {
                case 1:
                    System.out.println("Boa sorte com essa enorme escada");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("você chegou ao fim, veja o que tem a frente ...");
                    System.out.println("Uma enorme parede, parece que não vai ser por aqui que "
                            + "você vai sair.");
                    break;
                case 2:
                    System.out.println("Será que há luz no fim do túnel?????");
                    System.out.println("Ande mais um pouquinho ... ");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("AAAAA, parece que você encontrou uma porta ... pena que"
                            + " está trancada, te desejo sorte para abrir hahahaha");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (escolha2 != 2);

        System.out.println("Veja, na porta há um pergaminho, talvez tenha alguma dica de como "
                + "abrir a porta\n");
        System.out.println("@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n"
                + "|Vc está há um passo de conseguir atravessar |\n"
                + "|o portal secreto, para isto é necessário que|\n"
                + "|vc diga a senha em voz alta. Há uma dica no |\n"
                + "|final do pergaminho.                        |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|                Boa sorte!!!                |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|                                            |\n"
                + "|Dica:Eu nunca fui, mas sempre serei. Ninguém|\n"
                + "|  nunca me viu, e nunca verão. Ainda assim, |\n"
                + "|  sou a esperança de todos. Quem sou eu?    |\n"
                + "@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n");

        System.out.println("E agora qual a senha?");
        charada = input.next();

        while (!charada.equalsIgnoreCase("futuro")) {

            System.out.println("Não é isso. Tente denovo");
            System.out.println("Diga-me novamente o que a senha:");
            charada = input.next();
        }
        System.out.println("Finalmente você acertou. Parabéns");
        System.out.println("o portal está se abrindo ...");
        System.out.println(".\n"
                + ".\n"
                + ".\n");
        System.out.println("O portal se abriu, logo a frente há uma saída. Vá em "
                + "frente e recupere seu artefato roubado."
                + ".\n"
                + ".\n"
                + ".\n");

        //Parte da historia para conectar as historias!
        
        System.out.println("Luta com astaroth");
        
        switch(name){
             case "Anna":
                    dueloFinal.dueloAnna(60, 1000);
                    break;
                case "Floki":
                    dueloFinal.dueloFloki(60, 1000);
                    break;
                case "Harolc":
                    dueloFinal.dueloHalroc(60, 1000);
                    break;
                case "Yruan":
                    dueloFinal.dueloYruan(60, 1000);
                    break;
                case "Yvenna":
                    dueloFinal.dueloYvenna(60, 1000);
                    break;
        }
        System.out.println("\n [Astaroth] - VOCÊ É INUTIL, NÃO SERVE NEM PARA UMA BOA BATALHA!");
        // Historia de reviravolta 
        
        System.out.println("Luta depois dos pesonagens ganherem algo na historia que deixem eles mais fortes");
        
        //Batalhaa depois da historia 
        
        switch (name){
            case "Anna":
                    dueloFinal2.dueloAnnaFinal(1250, 1000);
                    break;
                case "Floki":
                    dueloFinal2.dueloFlokiFinal(1256, 1000);
                    break;
                case "Harolc":
                    dueloFinal2.dueloHalrocFinal(1300, 1000);
                    break;
                case "Yruan":
                    dueloFinal2.dueloYruanFinal(1367, 1000);
                    break;
                case "Yvenna":
                    dueloFinal2.dueloYvennaFinal(1232, 1000);
                    break;
        }
        
    }
}
