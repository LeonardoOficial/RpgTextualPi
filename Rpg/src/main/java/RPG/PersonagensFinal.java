package RPG;

/**
 *
 * @author csnas
 */
import java.util.Random;
import java.util.Scanner;



    class AnnaFinal {

    static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Mutilar: Anna empunha duas lâminas curta e faz cortes bem profundos no inimigo");
        System.out.println("2 - Flecha Mortífera: Anna ergue seu arco e com sua mira impecável, acerta uma flecha altamente mortal no seu inimigo");
        System.out.println("3 - Muro de Flechas: Atira uma quantidade inacreditável de flechas no oponente. Ast -150");
        return input.nextInt();
    }
    
    }

class FlokiFinal {

    public static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Ravina: Golpeia o chão com seus machados, abrindo uma ravina.  Ast -130\n");
        System.out.println("2 - Berserker: Fica extremamente furioso e ataca um inimigo com seus machados. Ast -150\n");
        System.out.println("3 - Renascer:Drena vida do inimigo e recupera uma grande parte da sua vida máxima");
        return input.nextInt();
    }
}

class HalrocFinal {

    public static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Corte Supersônico: Aparece nas costas do oponente em super velocidade, cortando-o em múltiplas vezes rapidamente e voltando a sua posição");
        System.out.println("2 - Corte das Trevas: Faz diversos cortes no ar, interligando-o a um inimigo e o acertando diversas vezes");
        System.out.println("3 - Surpresa em dobro!!: Lança um kit de bombas à longa distância  no rosto de um inimigo");
        return input.nextInt();
    }
}

class YruanFinal {

    public static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Bateria Humana: Acerta um inimigo com um choque extremamente energizado do seu anel.");
        System.out.println("2 - O Chamado: Convoca Thorys, Vulcano e Hydraco dos céus e fere o inimigo com raios, bolas de fogo e uma enchentes.");
        System.out.println("3 - Invisível: Infunde seu corpo com energia e fica tão rápido a ponto de seu inimigo não o ver, vai até o inimigo golpeá-lo.");
        return input.nextInt();
    }
}

class YvennaFinal {
    public static int habilidadesFinal() {
        Scanner input = new Scanner(System.in);
        System.out.println("~~ HABILIDADES ~~");
        System.out.println("1 - Extinção: Levanta sua lança ao alto e ao abaixa-la traz consigo dois meteoros do céu.");
        System.out.println("2 - Combatente: Avança até um inimigo e o acerta com sua lança em um ponto vital.");
        System.out.println("3 - Mar de Cactos: Faz crescer diversos espinhos divinos no corpo do inimigo.");
        return input.nextInt();
    }

}
