package RPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RpgPrincipal {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        int escolha = 0, menu = 0;
        String opcao;
        String personagem;
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
            System.out.print("          [2] CR??DITOS       \n");
            System.out.print("          [3] INSTRU??OES       \n");
            System.out.print("          [4] HIST??RIA       \n ");
            System.out.print("=============================\n\n\n");
            System.out.println("Digite uma op????o: ");
            opcao = input.next();

            switch (opcao) {
                case "1":
                case "Jogar":
                case "jogar":
                case "JOGAR":
                    System.out.println("Gostaria de iniciar");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - N??O");
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("Iniciando o Jogo\n \n");
                        break;
                    } else if (menu == 2) {
                        break;
                    }
                    break;

                case "2":
                case "Cr??ditos":
                case "cr??ditos":
                case "Creditos":
                case "creditos":
                case "CR??DITOS":
                case "CREDITOS":
                    System.out.println("Directed: Amaury S. Alves");
                    System.out.println("Executive Producer: Leonardo S. Santos");
                    System.out.println("Production Director: Amaurilio S. Alves");
                    System.out.println("Visual Producer: Erik S. Sena");
                    System.out.println("History: Catiane s. Nascimento ");
                    System.out.println("Plot: Cintia L. Gentil \n \n");

                    System.out.println("Quer voltar ao menu do jogo?");

                    System.out.println("[1] - N??O, Voc?? ir?? para o jogo diretamente.");
                    System.out.println("[2] - SIM");

                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("\n Iniciando");
                        break;
                    }
                    if (menu == 2) {
                        break;
                    }
                    break;

                case "3":
                case "INSTRU????ES":
                case "INSTRU??OES":
                case "INSTRUCOES":
                case "Instru????es":
                case "instru????es":
                    
                    System.out.println("A????es de personagens *-- --*\n");
                    System.out.println("Falas de personagens - \n");
                    System.out.println("Em algumas perguntas [1] & [2] pode colocar n??mero e letra\n");
                    System.out.println("Em perguntas com ( ) ultilize n??meros");
                    break;

                case "4":

                    historia.historia();

                    break;
            }

        } while (menu != 1);
        System.out.println("Sejam bem-vindos! A cidade de Lavenham, uma das cidades mais rica de Nochma, nela voc?? ir??"
                + " descobrir que todos n??s temos um mist??rio a ser revelado! \n");
        TimeUnit.SECONDS.sleep(3);

        do {
            System.out.println("**--Escolha o seu personagem--**");
            System.out.println("[1] Anna");
            System.out.println("[2] Floki");
            System.out.println("[3] Halroc Christoper");
            System.out.println("[4] Yruan");
            System.out.println("[5] Yvenna Kallamara");
            personagem = input.next();

            switch (personagem) {
                case "1":
                case "Anna":
                case "anna":
                case "ANNA":
                    Anna.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Anna";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
                    break;

                case "2":
                case "floki":
                case "Floki":
                case "FLOKI":
                    Floki.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha = input.nextInt();

                    if (escolha == 1) {
                        name = "Floki";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
                    break;

                case "3":
                case "Halroc":
                case "HALROC":
                case "halroc":
                    Halroc.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Halroc";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
                    break;

                case "4":
                case "Yruan":
                case "yruan":
                case "YRUAN":

                    Yruan.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yruan";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
                    break;

                case "5":
                case "Yvenna":
                case "yvenna":
                case "YVENNA":
                    Yvenna.apresentacao();
                    System.out.println("Gostaria de jogar com esse personagem? ");
                    System.out.println("(1) - SIM");
                    System.out.println("(2) - NAO");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        name = "Yvenna";
                        break;
                    } else if (escolha == 2) {
                        break;
                    }
                    break;
            }

        } while (escolha != 1);

        System.out.println(name + " est?? no centro da cidade, onde se tem um vasto com??rcio de objetos artesanais, uma pra??a p??blica em frente a igreja e a 3km de dist??ncia tem o castelo\n"
                + "do rei Gerald IV, ");
        System.out.println("onde tem uma imensa muralha, torres vigiadas o dia inteiro para a prote????o do rei, familiares e de seu tesouro, e no fundo do castelo tem\n");
        System.out.println("o calabou??o. Do lado leste ?? 5km est?? localizado a cidade dos an??es, chamada de Yggdrasil, ?? norte a floresta de Dean, l?? vive criaturas m??gicas, do lado noroeste\n"
                + "de Lavenham, h?? 20km est?? a tribo m??stica Salpphire. No Sul, s??o reinos mais pobres, portanto mais perigosos! ");
        

        System.out.println("\n\n- Veja! O mensageiro do rei na pra??a p??blica, ele tem um comunicado a se fazer, vamos ouvir o que ele tem a dizer?");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("\nEle disse que o rei est?? precisando de guerreiros dispostos a encarar desafios propostos por ele. Voc?? aceita participar?");

        do {
            System.out.println("(1) - Sim");
            System.out.println("(2) - N??o");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\n[Mensageiro] -- Vejam s??! h?? um(a) nobre guerreiro(a) disposto(a) a enfrentar a criatura que est?? aterrorizando as terras do rei\n"
                            + "Qual ?? seu nome?\n"
                            + "Meu nome ?? " + name + "!\n"
                            + "[Mensageiro] -- Vejo que voc?? ?? de longe, o Rei vai adorar te conhecer, vamos para o castelo, l?? voc?? ir?? conhcecer o rei pessoalmente!\n");
                    carisma = carisma + 2;
                    TimeUnit.SECONDS.sleep(6);
                    System.out.println("*-- " + name + " e o mensageiro foram ao castelo, ap??s chegarem, v??o de encontro com o rei --*");
                    System.out.println("[Mensageiro] -- Com licen??a meu Rei, trouxe esse jovem aventureiro para conhecer o senhor, creio que ele poder?? cumprir a miss??o imposta por vossa majestade.\n");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("[Rei Gerald IV]-- Isso ?? magnifico, ent??o meu jovem, voc?? aparenta ser muito forte e habilidoso, por??m ainda n??o estou totalmente convencido.\n");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("[Rei Gerald IV]-- Irei testar sua for??a imediatamente\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(" **O Rei olha para um de seus guardas e diz** , o acompanhe at?? o centro de treinamento e lhe empreste uma arma adequada\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("[Rei Gerald IV]-- Est??o prontos?\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("[Rei Gerald IV]-- LUTEM!!!\n");
                    TimeUnit.SECONDS.sleep(2);

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

                    System.out.println("\n[Rei Gerald IV]-- J?? sei, agora voc?? ir?? duelar com um dos meus melhores guerreiros, ele ?? lider e comandante geral da guarda Real. \n");
                    TimeUnit.SECONDS.sleep(3);

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

                    System.out.println("\n**-- PARAB??NS--**\n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("[Rei Gerald IV]-- Certo voc?? se provou digno de prosseguir com a miss??o,\n"
                            + " agora irei para meus aposentos,mensageiro acredito que passou as informa????es para o viajante, mas se n??o passou passe imediatamente!\n"
                            + "estou me retirando.\n");
                    TimeUnit.SECONDS.sleep(3);

                    System.out.println("[Mensageiro]-- Sua miss??o ?? ir at?? a floresta de Dean e descobrir o paradeiro do javali e acabar com ele!\n");
                    TimeUnit.SECONDS.sleep(3);

                    System.out.println("Voc?? acabou de receber +2 Pontos de carisma com a cidade, com esses pontos de carismas voc?? consegue ter mais vantagens em algumas miss??es\n"
                            + " tente n??o recusar miss??es pois voc?? pode acabar perdendo esses pontos, isso aumentar?? a dificuldade em alguns desafios\n");
                    TimeUnit.SECONDS.sleep(4);

                    System.out.println("Quer ver seu n??vel de carisma?");
                    System.out.println("[1] - Sim");
                    System.out.println("[2] - N??o");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        System.out.println("Seu atual n??vel de Carisma com a cidade ??: " + carisma);
                        break;
                    } else if (escolha == 2) {
                        break;

                    }

                case 2:
                    System.out.println("[Desconhecido1]-- Veja s??, aquela pessoa ?? nova na cidade,voc?? soube de um boato que mataram algu??m ontem nos becos?\n");
                    System.out.println("[Desconhecido2]-- Sim, provavelmente essa ?? a ??nica pessoa nova na cidade, n??o temos casos de assasinato h?? algum tempo, vamos chamar as autoridades!\n"
                            + "** Os desconhcidos chamam os guardas para levar voc?? at?? a cadeia!\n");
                    TimeUnit.SECONDS.sleep(5);

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

                    System.out.println("\nVoc?? derretou o guarda e fugiu para os becos da cidade e ficou escondido por l?? mesmo\n");
                    System.out.println("Tempo se passou e voc?? escutou a conversa de duas pessoas\n");
                    System.out.println("[Desconhecido3]-- Voc?? viu o que est?? acontecendo na floresta de dean?");
                    System.out.println("[Desconhecido4]-- Sim, dizem que tem uma criatura de fogo aterrorizando toda floresta.\n");
                    System.out.println("[Desconhecido3]-- Parece que  o rei dar?? uma recompensa para quem matar essa criatura, queria ser forte para acabar com essa criatura...\n");
                    System.out.println("As duas pessoas se dist??ncia\n");
                    System.out.println("Depois de ouvir aquilo, voc?? resolveu ir investigar a floresta, com a inten????o de conseguir a recompensa disposta pelo rei!");
                    System.out.println("Chegando na Floresta voc?? deparou com uma pegada de javali e o local todo em cinza\n");
                    TimeUnit.SECONDS.sleep(6);

                    System.out.println("Voc?? perdeu -2 Pontos de carisma, se seu carisma chegar a 0, voc?? poder?? morrer por sofrer v??rias pedradas ao longo do caminho,\n"
                            + " Suba seu carismo para ganhar vantagens nas miss??es.\n");
                    carisma = carisma - 2;
                    System.out.println("Seu atual nivel de carisma ??: " + carisma);
                    break;
            }
        } while (escolha != 1 && escolha != 2);

        System.out.println("\nDirija-se ?? floresta e encontre o Javali.\n");

        System.out.println("Voc?? chega na floresta."
                + "Veja, ali tem algumas pegadas e est?? dando a duas dire????es diferentes.\n");
        TimeUnit.SECONDS.sleep(3);

        int pegada;

        do {

            System.out.println("(1) Pegadas que levam a trilha da DIREITA ");
            System.out.println("(2) Pegadas que levam a trilha da ESQUERDA ");

            TimeUnit.SECONDS.sleep(3);

            pegada = input.nextInt();

            switch (pegada) {
                case 1:

                    System.out.println("Pegadas te levam a um cervo");
                    System.out.println("Ele ?? muito d??cil, n??o tem com o que se preocupar");
                    System.out.println("Continue Procurando");
                    break;
                case 2:
                    System.out.println("Pegadas te levam a um Javali, por??m n??o ?? o que voc?? procura.");
                    System.out.println("Prepare-se, ele est?? vindo te atacar\n");

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
                    System.out.println("Escolha uma das op????es!!");
            }
        } while (pegada != 1 && pegada != 2);

        System.out.println("[??????]N??o adianta, voc?? n??o vai ach??-lo assim.");
        System.out.println("**Uma figura misteriosa aparece na sua frente**");
        System.out.println("[Desconhecido]: Ol??, eu sou um ca??ador e eu sei qual animal voc?? est?? procurando");
        System.out.println("[Ca??ador]: N??o ?? assim que voc?? vai ach??-lo, como o pr??prio nome j?? diz... ");
        System.out.println("ELE ?? FLAMEJANTE!!");
        System.out.println("Esse jeito convencional n??o adianta, ou seja, voc?? tem que procurar sinais de fogo na floresta");
        System.out.println("[Desconhecido]: Oh, olha, o que ?? aquilo? ");
        System.out.println("Voc?? olha e n??o v?? nada, quando vira novamente, o ca??ador j?? n??o est?? mais l??.\n");
        TimeUnit.SECONDS.sleep(7);

        System.out.println("Agora investigue a floresta e procure por sinais de inc??ndio\n");

        int lugar = 0;
        do {

            System.out.println("(1)Adentrar a floresta. ");
            System.out.println("(2)Pequeno vilarejo ao lado da floresta ");
            System.out.println("(3)Lagoa");
            System.out.println("(4)Caverna misteriosa");

            lugar = input.nextInt();

            switch (lugar) {
                case 1:
                    System.out.println("Voc?? adentrou a floresta");
                    System.out.println("Como pode ver ela parece normal, menos pelo cheiro de fuma??a");
                    System.out.println("E olhe, tamb??m tem ??rvores carbonizadas, por??m ?? estranho.");
                    System.out.println("al??m de queimadas, elas tamb??m est??o com rachaduras no meio");
                    System.out.println("Algo grande bateu nisso");
                    System.out.println("Por??m, ja faz um tempo que aconteceu.");
                    System.out.println("N??o h?? mais nada a fazer aqui\n");
                    TimeUnit.SECONDS.sleep(4);
                    break;
                case 2:
                    System.out.println("Voc?? chegou no vilarejo.");
                    System.out.println("Est?? um cheiro insurpot??vel de fuma??a");
                    System.out.println("Veja s?? aquelas casas, completamente destru??das, n??o foi apenas um inc??ndio que causou isso");
                    System.out.println("Meu Deus, tem at?? corpos carbonizados.");
                    System.out.println("N??o irei achar mais nada aqui\n");
                    TimeUnit.SECONDS.sleep(4);

                    break;
                case 3:
                    System.out.println("Voc?? chegou na lagoa");
                    System.out.println("Est?? muito tranquilo por aqui,");
                    System.out.println("Voc?? olha em volta e n??o encontra nada");
                    System.out.println("Vir aqui foi uma grande perda de tempo");
                    System.out.println("N??o h?? nada a fazer aqui\n");
                    TimeUnit.SECONDS.sleep(4);

                    break;
                case 4:
                    System.out.println("Voc?? chegou na caverna misteriosa");
                    System.out.println("como o pr??prio nome j?? diz, ela ?? bem misteriosa");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("POCOT??, POCOT??, POCOT??");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("POOOOWWWWWW!!!!");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("que barulho que foi esse?");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Parecia o impacto de alguma coisa e est?? vindo l?? de dentro");
                    System.out.println("Espera, o que ?? aquele brilho vindo l?? de dentro?");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("WHOOOOSSSSSHHHHHH!!!!!");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("nossa, quase que o acerta, isso foi perigoso");
                    System.out.println("n??o h?? d??vidas, ele est?? l?? dentro");
                    System.out.println("Ele est?? vindo, deve ter sentido seu cheiro");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("PREPARE-SE!!!\n");
                    TimeUnit.SECONDS.sleep(1);

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
                    System.out.println("Escolha uma Op????o");
            }
        } while (lugar != 4);

        // historia do bar
        System.out.println("\n[Aliado do Rei - ] Vamos a taberna! comemorar por voc?? ter vencido a luta contra aquela fera!\n"
                + name + ": Acho melhor n??o, estou aqui por motivos maiores, n??o posso perder o foco!\n"
                + "[Aliado do Rei - ] Vamos! Vai ser bom para conhecer a cidade e os moradores\n"
                + name + ": Tudo bem! pensando desta forma, vai ser bom para me familiarizar\n");
        TimeUnit.SECONDS.sleep(4);

        int avatar = 0;
        int donoDoBar = 0;

        System.out.println("*--Voc?? entrou no Bar!--*");
        System.out.println("[Dono do Taverna] - Ol?? aventureiro(a)!");
        System.out.println("[Dono do Taverna] - Fiquei sabendo que voc?? matou o javali flamejante que estava atormentando os campos de planta????o da cidade,\n "
                + "falo por todos da cidade que a partir de agora voc?? ser?? bem-vindo em Lavenham, como agradecimento venha tomar uma bebida ruim e barata com a gente!");
        System.out.println(".\n.\n.");
        TimeUnit.SECONDS.sleep(4);

        System.out.println("*--Algum tempo se passou dentro da taverna--*\n");

        System.out.println("[Dono do Taverna] - Te proponho um desafio para ver se voc?? ?? melhor que eu na cacha??a, o desafio ser?? da seguinte forma:");
        System.out.println("[Dono do Taverna] - Eu irei fazer uma pergunta, se voc?? responder de forma correta, eu tomo um gole de rum, se voc?? errar, voc?? que ir?? beber\n");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("(" + name + "): Sim, eu aceito!, mas fique sabendo que voc?? vai tomar na jabiroca");
        System.out.println("(" + name + "): Sou campe??(o) em tomar cacha??a\n");
        TimeUnit.SECONDS.sleep(4);

        System.out.println("[Dono do Taverna] - Seu pai, aquele cachaceiro, HAHAHA!");
        System.out.println("[Dono do Taverna] - Ent??o vamos come??ar!");
        System.out.println("[Dono da Taverna] - Primeira pergunta, valendo um gole da minha cacha??a");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("[Dono da Taverna] - O que a palavra legend significa em portugu??s?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("a) Legenda\n"
                + "b) Conto\n"
                + "c) Hist??ria\n"
                + "d) Lenda\n"
                + "e) Legend??rio");
        String p1 = input.next();

        switch (p1) {
            case "A":
            case "a":
            case "Legenda":
            case "legenda":
            case "LEGENDA":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cacha??a--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Nossa, que bebida ruim!");
                }
                break;
            case "B":
            case "b":
            case "Conto":
            case "conto":
            case "CONTO":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cacha??a--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Odiei!");
                }
                break;
            case "C":
            case "c":
            case "Hist??ria":
            case "hist??ria":
            case "Historia":
            case "historia":
            case "HIST??RIA":
            case "HISTORIA":
                System.out.println("\n[Dono da Taverna] - Resposta errada!, beba um gole!");
                System.out.println("*--" + name + " toma um gole da cacha??a--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que treco horr??vel!");
                }
                break;
            case "D":
            case "d":
            case "Lenda":
            case "lenda":
            case "LENDA":
                System.out.println("\n[Dono da Taverna] - Resposta certa!");
                System.out.println("[Dono da Taverna] - Voc?? parece ser profissional mesmo");
                System.out.println("*-- Dono do Bar toma um gole da cacha??a--*");
                donoDoBar = donoDoBar + 1;
                if (donoDoBar == 1) {
                    System.out.println("(" + name + "): Tu vai cair de tanto beber hoje!");
                }
                break;
            case "E":
            case "e":
            case "Legend??rio":
            case "legend??rio":
            case "Legendario":
            case "legendario":
            case "LEGEND??RIO":
            case "LEGENDARIO":
                System.out.println("\n[Dono da Taverna] - Resposta errada! beba um gole!");
                System.out.println("*--" + name + " toma um gole da cacha??a--*");
                avatar = avatar + 1;
                if (avatar == 1) {
                    System.out.println("(" + name + "): Que porqueira ?? essa!");
                }
                break;
        }
        System.out.println("\n\n[Dono da Taverna] - Segunda Pergunta: ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("[Dono da Taverna] - Quem pintou Guernica?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("a) Paulo Cesariano\n"
                + "b) Fl??vio Picaxu\n"
                + "c) Diogo Vergueira\n"
                + "d) Pastilha do Coral\n"
                + "e) Recife Del??");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("(" + name + "): Mas pera??, quem ?? Guernica?\n");

        System.out.println("[Dono do Bar] - S?? responda logo!\n");
        System.out.println("(" + name + "): Ta bom vai.");
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

                System.out.println("\n[Dono da Taverna] - Errou mentecapto, n??o tem resposta certa!");
                System.out.println("[Dono da Taverna] - Esse era s?? pra ver se voc?? era bom mesmo");
                break;
            default:
                System.out.println("\n[Dono da Taverna] - Errou mentecapto, n??o tem resposta certa!");
                System.out.println("[Dono da Taverna] - Esse era s?? pra ver se voc?? era bom mesmo");

        }
        System.out.println("\n\n[Dono do Bar] - Pergunta de n??mero 3:");
        System.out.println("[Dono do Bar] - Valendo 4 goles de cacha??a!!!");
        System.out.println("[Dono do Bar] - O pai de Bodvar tem 5 filhos, eles s??o: Dez, Vinte, Trinta, Quarenta.");
        System.out.println("E qual ?? o nome do quinto filho?\n");
        String resposta = input.next();
        switch (resposta) {
            case "Bodvar":
            case "bodvar":
                System.out.println("\n[Dono do Bar] - Que onda ?? essa? voc?? ganhou! N??o v?? se achando demais, quero ver a pr??xima perguta se voc?? vai acertar! ");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma tr??s goles de sua cacha??a--*");
                System.out.println("[Dono do Bar] - Eita cana braba da peste!!");
                donoDoBar = donoDoBar + 3;
                break;
            default:
                System.out.println("\n[Dono do Bar] - Voc?? errou!! bastardo");
                System.out.println("*--" + name + " toma mais 3 goles da cacha??a--*");
                System.out.println("(" + name + "): Pode encher que hoje ?? sexta-feita!");
                avatar = avatar + 3;
        }
        System.out.println("[Dono do Bar] - Quarta Pergunta:");
        System.out.println("[Dono do Bar] - Se voc?? est?? participando em uma corrida de cavalos e voc?? ultrapassa o quarto lugar,");
        System.out.println("[Dono do Bar] - Em que lugar voc?? fica?");
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
            case "QuartoLugar":
            case "quartoLugar":
            case "quartolugar":
            case "Quartolugar":
                System.out.println("[Dono do Bar] - EiiTAAA! Bateu uma saudade dela!\n");
                System.out.println("(" + name + "): De quem ? \n");
                System.out.println("[DOno do bar] - Isque??e BAHAHAHA");
                System.out.println("{Dono do Bar] - S?? falta mais uma hein!!");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma quatro goles de sua cacha??a--*\n");
                donoDoBar = donoDoBar + 4;
                break;
            default:
                System.out.println("*--" + name + " toma mais 4 goles da cacha??a--*");
                System.out.println("(" + name + "):- Aaahhh, Desce mais, n??o que essas des??eram rasgando!");
                avatar = avatar + 4;
                break;
        }
        System.out.println("[Dono do Bar] - ??ltima pergunta:");
        System.out.println("[Dono do Bar] - Um cara chegou no meu bar e deixou um papel com diversos n??meros em continua????o:");
        System.out.println("*--1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233... 610,987...--*");
        System.out.println("[Dono do Bar] - Vamos ver se voc?? entende essa sequencia");
        System.out.println("[Dono do Bar] - Qual ?? o oitavo n??mero depois do 987?");
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

                System.out.println("[Dono do Bar] - Voc?? ?? bom mesmo!");
                System.out.println("[Dono do Bar] - Olokinho meu!!");
                System.out.println("[Dono do Bar] *-- Dono Do Bar toma cinco goles de sua cacha??a--*");
                donoDoBar = donoDoBar + 5;
                break;
            default:
                System.out.println("[Dono do Bar] - Poxa meu nobre, isso foi f??cil demais! s?? n??o entende quem n??o quer!\n"
                        + "[Dono do bar] - Quem deixou isso aqui foi um tal de Fibonacci\n");
                System.out.println("*--" + name + " toma mais 5 goles da cacha??a--*\n");
                System.out.println("(" + name + "):- OnDe ?? qui eu to? da Onde veio esaa mizera\n");
                avatar = avatar + 5;
                break;
        }
        if (donoDoBar > avatar) {
            System.out.println("\n*--Parab??ns! Voc?? Ganhou!--*\n");
            carisma = carisma + 10;
        } else {
            System.out.println("*--Fracassado! Voc?? ?? um(a) cachaceiro(a) de primeira, bebeu todas e perdeu--*");
            carisma = carisma - 10;
        }

        // desafio do paradeiro do premio
      
        
        System.out.println(name + ": ??, realmente foi muito bom ter ido a taberna!\n"
                + "[DESCONHECIDO -]" + name + ", vou embora! j?? est?? tarde!\n"
                + "voc?? quer ir?\n"
                + name + ": N??o, vou ficar! at?? mais!\n");
        System.out.println("[Dono do bar]: AGORA QUE A VERDADEIRA FESTA COME??A HAHAHAHAHAHAHAHAHAHAHAHAHAHAHA!!!!!");
        System.out.println("*--Dono do bar come??a a distribuir hidromel dos an??es para todos da taberna--*");
        System.out.println("*--" + name + " come??a a beber todas sem parar, e come??a a dan??ar em cima da mesa--*");
        System.out.println("todos come??am a cantar, rir e dan??ar");
        System.out.println("*--" + name + " n??o aguenta mais beber e apaga completamente.--*");
        
        int npc, ladrao;

        System.out.println("Voc?? desmaiou, acabou acordando no bar.\n");

        System.out.println("Ahh, que dor no corpo! o que aquele cara colocou na minha bebida, que me fez ficar assim?\n");

        System.out.println("Opa! cad?? minha esfera?\n"
                + "Fui roubado!");
        TimeUnit.SECONDS.sleep(4);

        System.out.println("Tente achar os suspeitos, temos ainda 3 pessoas no bar, elas sabem quem roubou a sua esfera!\n");

        System.out.println("Para quem voc?? quer pedir essa informa????o?\n"
                + "(1)  Homem que est?? sentado a sua direita\n"
                + "(2) Gar??onete\n"
                + "(3) Homem que est?? conversando com a gar??onete.\n");
        npc = input.nextInt();
        TimeUnit.SECONDS.sleep(3);
        while ((npc == 1) || (npc > 3)) {
            if (npc > 3) {
                System.out.println("OPERA????O INV??LIDA");
            } else {
                System.out.println("Boa noite,eu desmaiei e quando acordei percebi que roubaram o presente que o rei deu pra mim"
                        + " e eu quero saber se voc?? viu quem foi?\n");
                System.out.println(" A que custo iria te dar essa informa????o?\n"
                        + "voc?? ?? um estranho aqui nessa cidade! eu que deveria ter ganho essa esfera!"
                        + "Vamos, saia da minha frente!");
            }
            System.out.println("Pergunte para outra pessoa, para quem perguntar?");
            npc = input.nextInt();
        }
        System.out.println("Boa noite,eu desmaiei e quando acordei percebi que roubaram o presente que o rei deu pra mim"
                + " e eu quero saber se voc?? viu quem foi?\n");
        System.out.println("Lamento o ocorrido, esses ladr??es sempre est??o na pra??a\n"
                + "Procure por algu??m que est?? com roupas pretas, dos cabelos encaracolados.");

        System.out.println("Aparetemente a pessoa que te roubou est?? na pra??a que fica a 200m daqui. Caminhe at?? l??"
                + ".\n"
                + ".\n"
                + ".\n");
        System.out.println("Voc?? chegou na pra??a, aviste a pessoa que te roubou.");
        TimeUnit.SECONDS.sleep(7);
        System.out.println("Olhe a sua frente h?? dois homens, um est?? com roupas pretas e o outro tem cabelo encaracolado"
                + "quem voc?? acha que ?? o ladr??o????\n"
                + "(1) HOMEM DE PRETO\n"
                + "(2) HOMEM DE CABELO ENCARACOLADO\n");
        ladrao = input.nextInt();

        OUTER:
        while (ladrao >=3) {
            switch (ladrao) {
                case 1:
                System.out.println("Voc?? acusou a pessoa errada e agora sofrer?? as consequ??ncias");
                System.out.println("Os guardas est??o vindo, nem adianta correr");
                System.out.println("[GUARDA] - Venha, voc?? ser?? preso no calabou??o");
                break;
                case 2:
        System.out.println("Voc?? encontrou o ladr??o, lute para recuperar seu artefato");
        TimeUnit.SECONDS.sleep(3);

        switch (name) {
            case "Anna":
                dueloLadrao.dueloAnna(60, 150);
                            System.out.println("Al??m de perder a luta, voc?? ser?? preso no calabou??o por acabar com a paz do reino de Nochma ");
                            TimeUnit.SECONDS.sleep(3);
                break;
            case "Floki":
                dueloLadrao.dueloFloki(60, 150);
                            System.out.println("Al??m de perder a luta, voc?? ser?? preso no calabou??o por acabar com a paz do reino de Nochma ");
                            TimeUnit.SECONDS.sleep(3);
                break;
            case "Harolc":
                dueloLadrao.dueloHalroc(60, 150);
                            System.out.println("Al??m de perder a luta, voc?? ser?? preso no calabou??o por acabar com a paz do reino de Nochma ");
                            TimeUnit.SECONDS.sleep(3);
                break;
            case "Yruan":
                dueloLadrao.dueloYruan(60, 150);
                            System.out.println("Al??m de perder a luta, voc?? ser?? preso no calabou??o por acabar com a paz do reino de Nochma ");
                            TimeUnit.SECONDS.sleep(3);
                break;
            case "Yvenna":
                dueloLadrao.dueloYvenna(60, 150);
                            System.out.println("Al??m de perder a luta, voc?? ser?? preso no calabou??o por acabar com a paz do reino de Nochma ");
                            TimeUnit.SECONDS.sleep(3);
                break;
        }
                default:
                    System.out.println("OPERA????O INV??LIDA\n"
                            + "digite uma op????o v??lida\n"
                            + "[1] HOMEM DE PRETO\n"
                            + "[2] HOMEM DE CABELO ENCARACOLADO\n");
                    ladrao = input.nextInt();
                    break;
            }
        }
        int escolha1, escolha2;
        String charada;

        System.out.println("Voc?? foi preso no calabou??o :( ");
        System.out.println("Por sorte voc?? conseguiu roubar dos guardas o mapa do calabou??o sem que eles "
                + "percebessem!!!!");
        TimeUnit.SECONDS.sleep(5);

        do {
            System.out.println("Quer dar uma olhadinha no mapa?");
            System.out.println("[1] SIM");
            System.out.println("[2] N??O");
            escolha1 = input.nextInt();

            switch (escolha1) {
                case 1:
                    System.out.println("#==============================|| ||\n"
                            + "#         E N T R A D A        || ||\n"
                            + "||E||#=========================|| ||\n"
                            + "||S||#                         || ||\n"
                            + "||C||#=========================|| ||\n"
                            + "||A||#     T U N ?? E L              \n"
                            + "||D||#=========================|| ||\n"
                            + "||A||#      P O R T A L             \n"
                            + "||R||#     S E C R E T O            \n"
                            + "||I||#=========================|| ||\n"
                            + "||A||#=========================|| ||\n"
                            + "######=========================|| ||");
                    break;
                case 2:
                    System.out.println("Vai ficar aqui at?? quando? ... ");
                    System.out.println(".\n"
                            + ".\n"
                            + ".\n");
                    break;
                default:
                    System.out.println("Op????o inv??lida");
                    break;
            }

        } while (escolha1 == 2);

        do {
            System.out.println("Olhando para o mapa, aparentemente voc?? precisa chegar"
                    + "at?? o portal secreto, qual caminho ir?? seguir????");
            System.out.println("(1) ESCADARIA");
            System.out.println("(2) T??NEL");
            escolha2 = input.nextInt();

            switch (escolha2) {
                case 1:
                    System.out.println("Boa sorte com essa enorme escada");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("voc?? chegou ao fim, veja o que tem a frente ...");
                    System.out.println("Uma enorme parede, parece que n??o vai ser por aqui que "
                            + "voc?? vai sair.");
                    break;
                case 2:
                    System.out.println("Ser?? que h?? luz no fim do t??nel?????");
                    System.out.println("Ande mais um pouquinho ... ");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println("AAAAA, parece que voc?? encontrou uma porta ... pena que"
                            + " est?? trancada, te desejo sorte para abrir hahahaha");
                    break;
                default:
                    System.out.println("Op????o inv??lida");
                    break;
            }

        } while (escolha2 != 2);

        System.out.println("Veja, na porta h?? um pergaminho, talvez tenha alguma dica de como "
                + "abrir a porta\n");
        System.out.println("@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n"
                + "|Vc est?? h?? um passo de conseguir atravessar |\n"
                + "|o portal secreto, para isto ?? necess??rio que|\n"
                + "|vc diga a senha em voz alta. H?? uma dica no |\n"
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
                + "|Dica:Eu nunca fui, mas sempre serei. Ningu??m|\n"
                + "|  nunca me viu, e nunca ver??o. Ainda assim, |\n"
                + "|  sou a esperan??a de todos. Quem sou eu?    |\n"
                + "@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@\n");

        TimeUnit.SECONDS.sleep(5);

        System.out.println("E agora qual a senha?");
        charada = input.next();

        while (!charada.equalsIgnoreCase("futuro")) {

            System.out.println("N??o ?? isso. Tente denovo");
            System.out.println("Diga-me novamente o que a senha:");
            charada = input.next();
        }
        System.out.println("Finalmente voc?? acertou. Parab??ns");
        System.out.println("o portal est?? se abrindo ...");
        System.out.println(".\n"
                + ".\n"
                + ".\n");
        System.out.println("O portal se abriu, logo a frente h?? uma sa??da."
                + " *--V?? em frente e tente encontrar a Elizabeth e recupere o seu artefato.--*"
                + ".\n"
                + ".\n"
                + ".\n");

        System.out.println("  ### E para a surpresa de todos, a esfera que foi dada de presente para " + name + " como agradecimento pelo rei, tem grande prop??sito!\n"
                + "Est?? esfera acumula todo o poder da criatura mais poderosa que j?? existiu na terra... Chamada ASTAROTH. A linhagem do Rei, tem como prote????o a mais antiga das bruxas\n"
                + "de Nochma e j?? estava previsto que Astaroth estava no reino ?? procura desta esfera, assim possui-l?? e dominar n??o s?? Nochma, mas o mundo inteiro!\n"
                + "Esta mesma bruxa preveu, que um guerreiro(a) corajoso(a) e com o cora????o puro! iria virar historia\n"
                + "A bruxa sabia desde o Javali... o(a) guerreiro(a)" + name + " iria gerar prosperidade para todos do reino!###\n");

        System.out.println("\n *-- Elizabeth a bruxa foi at??" + name + " que estaria saindo do calabou??o --*\n");
        System.out.println("[Elizabeth - Bruxa] - Encontrei voc??!\n");
        System.out.println("(" + name + ") - U??, Mas quem ?? a senhora! eu nunca te vi no reino antes! E o que a senhora quer comigo?\n");
        System.out.println("[Elizabeth - Bruxa] - O reino est?? em perigo! eu sou Elizabeth ''A MAGA SUPREMA''! Precisamos de voc??, o povo precisa de voc??!\n ");
        System.out.println("[Elizabeth - Bruxa] - O ladr??o que roubou sua esfera ?? Matidig, o meu aprendinz, ele roubou o livro de feiti??os e vai invocar ASTAROTH!\n");
        System.out.println("(" + name + ") - Pera ai!!!  Quem ?? Astaroth? E por que eu tenho que que ir enfrentar ele? num vo, aaahhh, mais num vo mesmo!\n");
        System.out.println("[Elizabeth - Bruxa] - Voc?? est?? destinado a deter Astaroth!\n");
        System.out.println("(" + name + ") - Vamo l?? n??, fazer o que... logo hoje que ?? sabado vei...\n");

        System.out.println(" *-- " + name + " e Elizabeth foram at?? onde estaria Matidig, num local desertico, apos chegarem l??, se deparam com Matidig morto por Astaroth--*");
        System.out.println("*-- Matidig j?? havia invocado Astaroth com a esfera de " + name + " --*\n");

        System.out.println("[Elizabeth - Bruxa] - N??oooooooo, Matidig! SEU MONSTRO!\n");

        System.out.println("[ASTAROTH] - ARKINE MAKITU MAYKARA ZUBABA! HAHAHAHA ELE FOI UM SERVO FIEL!\n");

        System.out.println("*-- Elizabeth vai para cima de Astaroth, maspor ter seu livro de feiti??os roubados, ela n??o teria magia o suficiente para confronta-lo.");
        System.out.println("Ent??o Astaroth ultliza sua espada para perfurar Elizabeth,Mas " + name + " impedi, e logo Astaroth parte para cima de" + name + " e come??a uma batalha--*");

        System.out.println(name + " Luta com Astaroth");

        switch (name) {
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
        System.out.println("\n [Astaroth] - VOC?? ?? INUTIL, N??O SERVE NEM PARA UMA BOA BATALHA!\n"
                + ".\n"
                + ".\n"
                + ".\n");
        System.out.println("\n [Astaroth] - VOC?? ?? INUTIL, N??O SERVE NEM PARA UMA BOA BATALHA!");
        System.out.println("[Elizabeth] - " + name + ", voc?? ainda n??o despertou seu verdadeiro poder , vou realizar minha ultima magia,\n ");
        System.out.println("para fazer com que voc?? desperte suas habilidades aprimoradas e consiga derrotar Astaroth!\n");
        System.out.println("*-- Elizibeth come??a fazer sua magia final e come??a a recitar versos de sua magia proibida --*");
        System.out.println("[Elizabeth] - UGOKU GAI VEGITAI UGOKU GAI VEGITA, ANANATRAK GUDVASSE HEDHASSE ");
        System.out.println("*-- Elizabeth se ajoelha e ergue suas m??os aos ceus, Astaroth tentaa impedirr a magia, mais um fecho gigante de luz o accerta.");
        System.out.println("O mesmo fecho de luz levita Eizabeth, e a mesma conversa com os seres celestiais!");
        System.out.println("*-- Celestial come??a a falar com Elizabeth --*");
        System.out.println("(CELESTIAL) - ?????????!!!!!?!??!?!?!?!?!?!?!?!?!?!?!?!?!?!?!?!??!?!!?");
        System.out.println("[Elizabeth] - Eu estou entregando a minha vida para fortalecert o alido e enfraquecer a besta fera!\n");
        
        System.out.println("(CELESTIAL) ?????!?!?!?!?!?!??!?!?!?!?!?!?!?!?\n");
        
        System.out.println("[Elizabeth] - EU aceito!\n");
        
        System.out.println("*-- Ent??o um fecho de luz atingiria Astaroth fazendo com que seus poderes diminuissem, uma labareda de fogo desceria do c??u."
                + "\n Logo ent??o o fogo se envolveria com o corpo de "+ name + " e faria os ferimentos se curarem e dar mais poder--*\n");
        System.out.println("*-- " + name + " Se levanta e enfrenta Astaroth novamente e cheio de furia! \n");
        
        System.out.println(name + " VAI COM TUDO PRA CIMA DE ASTAROTH\n");
        
        System.out.println("("+name+") - TA NA HORA DE BOTAR O NENEM PRA DORMIR!");
        
        switch (name) {
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
        System.out.println("Ap??s a luta com Astaroth, o reino fica em paz...");
        System.out.println("FIM DO JOGO");
    }
}
