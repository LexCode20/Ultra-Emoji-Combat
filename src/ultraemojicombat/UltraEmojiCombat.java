package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("França", "Pretty Boy", 2, 1, 11, 1.75f, 68.9f, 31);
        l[1] = new Lutador("Brasil", "Putscript", 2, 3, 14, 1.68f,57.8f, 29);
        l[2] = new Lutador("EUA", "Snapshadow", 2, 1, 13, 1.65f, 80.9f, 35);
        l[3] = new Lutador("Austrália", "Dead Code", 0, 13, 2, 1.93f, 81.6f, 28);
        l[4] = new Lutador("Brasil", "UFOCobol", 4,5,3, 1.70f, 119.3f, 37);
        l[5] = new Lutador("EUA", "Nerdaart", 2, 4, 12, 1.81f, 105.7f, 30);
        l[3].status();

    }
}
