package projetoyoutube;
public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Layson", 22, "M", 0,"lbarral", 0);
        g[1] = new Gafanhoto("Juliana", 18, "F", 0, "juzinhaS2", 0);

        Visualizacao vis[] = new Visualizacao[5];
        /*vis[0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0].toString());*/

        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(6);
        //System.out.println(g[0].toString());
        System.out.println(vis[0].toString());
    }
}