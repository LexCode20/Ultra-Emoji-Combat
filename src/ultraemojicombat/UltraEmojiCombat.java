package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[12];
        l[0] = new Lutador("França", "Pretty Boy", "Masculino", 2, 1, 11, 1.75f, 68.9f, 31);
        l[1] = new Lutador("Brasil", "Putscript", "Masculino", 2, 3, 14, 1.68f, 57.8f, 29);
        l[2] = new Lutador("EUA", "Snapshadow", "Masculino", 2, 1, 13, 1.65f, 80.9f, 35);
        l[3] = new Lutador("Austrália", "Dead Code", "Masculino", 0, 13, 2, 1.93f, 81.6f, 28);
        l[4] = new Lutador("Brasil", "UFOCobol", "Masculino", 2, 45, 3, 1.70f, 119.3f, 37);
        l[5] = new Lutador("EUA", "Nerdaart", "Masculino", 2, 4, 12, 1.81f, 105.7f, 30);
        l[6] = new Lutador("Argentina", "Hermanita", "Feminino", 1, 2, 8, 1.58f, 52.1f, 22);
        l[7] = new Lutador("Brasil", "Pythonia", "Feminino", 3, 1, 15, 1.70f, 65.3f, 28);
        l[8] = new Lutador("EUA", "Ruby Rose", "Feminino", 1, 4, 10, 1.65f, 54.8f, 24);
        l[9] = new Lutador("Japão", "Kawaii", "Feminino", 5, 2, 18, 1.60f, 53.5f, 26);
        l[10] = new Lutador("França", "Madame Tech", "Feminino", 2, 3, 12, 1.75f, 63.2f, 29);
        l[11] = new Lutador("Canadá", "Maple Fighter", "Feminino", 4, 1, 14, 1.68f, 59.7f, 27);

        luta UEC01 = new luta();
        UEC01.marcarLuta(l[1], l[5]);
        UEC01.lutar();

        // Teste de luta feminina
        luta UEC02 = new luta();
        UEC02.marcarLuta(l[6], l[7]);
        UEC02.lutar();
    }
}
