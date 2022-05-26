/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

/**
 *
 * @author csnas
 */
import java.util.Random;
import java.util.Scanner;



    class Anna {

    static void apresentacao() {
        System.out.println("Anna é uma Elfa - Arqueira\n"
                + "\n"
                + "Anna vive na floresta de Dean, localizado no País de Gales, é uma criatura de aspecto frágil e delicado, elfos são parecidos com os humanos, mas o que difere são as orelhas pontiagudas, há quem diga que eles são imortais, mas não são, eles só morrem se for assassinado, portanto de velhice e doenças não morrem.\n"
                + "Possui agilidade e destreza em seus movimentos, tem um toque de graça e delicadeza, permitindo mover-se sigilosamente para espiar ou realizar um ataque surpresa. Também consegue se camuflar entre a natureza, que é o lugar em que ela se sente mais confortável.\n"
                + "Anna possui infra visão, permitindo que em noites escuras e nos bosques mais densos que dificilmente entra luz, conseguir ver perfeitamente o que está a sua frente.\n"
                + "Desde pequena foi treinada pela sua família a manusear a espada curta e a larga, mas é com o seu arco e flecha que ela possui uma agilidade rápida e perspicaz para lançar a flecha e rapidamente preparar-se para um novo disparo.\n"
                + "Anna, foi presenteada por um druida (próximo á família dela) com um arco longo que o comprimento é de 1,83 que alcança surpreendentemente 400 metros com uma velocidade de 2 km.");

    }

    static int habilidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Esfaquear: Anna empunha sua lâmina cuta e esfaqueia um inimigo");
        System.out.println("2 - Flecha de Precisão: Anna ergue seu arco e acerta uma flecha no inimigo");
        System.out.println("3 - Barragem: Atira uma saraivada de flechas em um oponente");
        return input.nextInt();
    }
}

class Floki {

    public static void apresentacao() {
        System.out.println(" Floki e um anão - Dois Machados de Uma Mão\n"
                + "\n"
                + "Nascido numa família de anões donos de uma grande taverna, Floki desde criança sempre ouviu que seu destino era herdar a Taverna de Yggdrasil, mas apesar de ter passado sua vida inteira caçando em prol da taverna e de seus pais, ele decidiu que esse não era o rumo que queria pra sua vida e sim aventuras gloriosas e sangrentas para que pudesse contar as seus filhos (quando tiver).\n"
                + "Personalidade, Ideais e Fraquezas:\n"
                + "Floki é um pouco soberbo, já que tem consciência de sua grande força e fortitude, e graças a isso ele também prefere ficar na linha de frente, um anão que se irrita facilmente e que gosta muito de beber com os amigos. Ele busca reconhecimento, para que sua família entenda o seu real desejo, virar um grande aventureiro.");

    }

    public static int habilidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Terremoto: Golpeia o chão fortemente com seus machados, criando tremores");
        System.out.println("2 - Avançar: Ataque um inimigo com seus machados");
        System.out.println("3 - Recuperar: Recupera uma parte da sua vida máxima");
        return input.nextInt();
    }
}

class Halroc {

    public static void apresentacao() {
        System.out.println("Halroc Christoper, é um ladrão humano, que está sempre à procura de um roubo mais desafiador, nascido em uma pequena vilarejo muito pobre, Halroc não conheceu seus pais e nada se sabe o que aconteceu com eles, e o próprio não tem interesse na sua origem, pois para ele, sua origem é ali, junto da sua gangue na qual é o próprio líder, chamada de “Bad Childrens”, em que ele considerava sua verdadeira família.\n"
                + "Ele e sua gangue eram os causadores de toda a bagunça no seu bairro, eles brincavam, arrumavam confusão, entre eles próprios ou com outras gangues e o principal, pequenos furtos, eles roubavam comida de mercadante, a pessoas ricas em áreas mais nobres, e o cérebro de tudo isso era Halroc, que além de bolar os planos, apresentava grandes habilidades furtivas e de fuga.\n"
                + "A gangue se desfez após alguns integrantes tentarem roubar um relógio de ouro de um grande senhor rico sem Halroc, foram encurralados por ele e alguns homens e foram espancados até a morte, causando medo no restante da gangue e abandonando Halroc.\n"
                + "Já adulto, Halroc seguiu sendo um ladrão, é um grande mentiroso, saindo de enrascadas sem precisar entrar em combate, brincalhão, audacioso, ardiloso e inteligente, montando planos de invasão e de fuga nos seus roubos");

    }

    public static int habilidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Corte Rápido: Aparece nas costas do oponente, cortando-o rapidamente e voltando a sua posição");
        System.out.println("2 - Corte Sombrio: Faz um corte no ar, interligando-o a um inimigo e o acertando");
        System.out.println("3 - Surpresa!!: Lança uma bomba no pé de um inimigo");
        return input.nextInt();
    }
}

class Yruan {

    public static void apresentacao() {
        System.out.println("Yruan – Anulus\n"
                + "\n"
                + "Yruam é um humano meio doido que fala sozinho, cabelos escuro, tamanho médio, pele escura e sua profissão e arqueólogo que gostava muito de descobrir as coisas, numa dessa viagem ele encontrou uma dungeon onde ele encontrou os 3 anulus do rei Nero que davam para ele poderes.\n"
                + "Historia dos Anulos\nHá muito tempo, existiam três dragões espalhados pelo mundo, eles eram consideram como “Deuses” por parte dos aldeões.\n"
                + "O rei Nero considerado louco e excêntrico pelo seu povo, constatou que esses dragões seria uma boa arma de guerra, decidiu que iria domar esses dragões para experiencias com partes do corpo dos três.\n"
                + "O primeiro foi Thorys, logo percebeu que não seria fácil domá-los, foi uma batalha em que se perdeu muitos soldados e trouxe tristeza em todo o reino, mas como o povo mesmo disse, ele era louco, não desistiu de tentar domar os dragões. Mais dois anos se passaram e finalmente conseguiram capturar Thorys, apanharam uma escama para estudo e viram que essa escama tinha uma pequena porcentagem do poder de Thorys. O rei decidiu levar essa escama para a aldeia dos anões onde tinha os melhores forjadores. Entregou a escama para os irmãos Brokk e Eitri. Os irmãos criaram um anel com poderes de raio, sem afetar quem usasse  e denominaram Anulus, essa nova arma. \n"
                + "Nero, mais confiante do que nunca, enfrentou os outros dois dragões, Hydraco e Vulcano conseguiram retirar as escamas para a fabricação de mais dois anéis. ");

    }

    public static int habilidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Alta Voltagem: Acerta um inimigo com o choque do seu anel");
        System.out.println("2 - Para-Raio: Ora a Thorys, fazendo com que caia um raio do céu no inimigo");
        System.out.println("3 - Imparável: Infunde seu corpo com energia e vai até o inimigo golpeá-lo");
        return input.nextInt();
    }
}

class Yvenna {

    public static void apresentacao() {
        System.out.println("Yvenna Kallamara – Lança magica \n"
                + "\n"
                + "Nascida em local desconhecido, Yvenna Kallamara, foi abandonada assim que veio ao mundo, foi encontrada e resgatada por uma anciã chamada Lith que a levou para sua tribo Salpphire e foi acolhida por todos.\n"
                + "Salpphire é uma tribo mística que chama a atenção por ter muitos poderes, o povo que habita lá precisa lutar se defender de aproveitadores que querem usufruir da magia do local. Não diferente dos outros habitantes Yvenna desde pequena foi treinada por Lith para se defender de qualquer inimigo que ameaçasse sua tribo.\n"
                + "Antes de Lith morrer, Yvenna passou por um ritual e recebeu todo poder e magia da anciã, e se tornou a sucessora e protetora da tribo, também foi presenteada com uma lança e mágica rara que pertenceu aos ancestrais da tribo, seu maior desafio foi aprender a lidar com todo o poder recebido. Atualmente continua em Salpphire protegendo sua tribo de quaisquer adversários que tente invadi-la.");

    }

    public static int habilidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Pedregulho: Levita um pedregulho e o lança a um oponente");
        System.out.println("2 - Lanceira: Avança até um inimigo e o acerta com sua lança");
        System.out.println("3 - Espinhos: Faz nascer alguns espinhos no chão");
        return input.nextInt();
    }

}

class Guarda {

    public static int habilidades() {
        Random gera = new Random();
        return gera.nextInt(2) + 1;
    }
}

class Javali {

    public static int habilidades() {
        Random gera = new Random();
        return gera.nextInt(2) + 1;
    }
}

class Ladrao {

    public static int habilidades() {
        Random gera = new Random();
        return gera.nextInt(2) + 1;

    }
}