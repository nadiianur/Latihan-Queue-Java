import java.util.Queue;
import java.util.LinkedList;

public class LatihanQueue {
    public static void main(String[] args) {
        Queue<String> planet = new LinkedList<String>();
        planet.add("Pluto");
        planet.add("Merkurius");
        planet.add("Venus");
        planet.add("Bumi");
        planet.add("Mars");
        planet.add("Jupiter");
        planet.add("Saturnus");
        planet.add("Uranus");
        planet.add("Neptunus");

        System.out.println("\nApakah Tata Surya kosong?\t: " + planet.isEmpty());

        System.out.println("\nPlanet Tata Surya  ");
        System.out.println("--------------------------");
        System.out.println(planet);

        System.out.println("\nJumlah Planet   \t\t: " + planet.size());

        System.out.println("\nPlanet hilang   \t\t: " + planet.poll());

        System.out.println("\nJumlah Planet Sekarang\t\t: " + planet.size());

        System.out.println("\nPlanet terdekat dari matahari \t: " + planet.peek());

        System.out.println("\nRemove Planet    \t\t: " + planet.remove() + " dan " + planet.remove());

        System.out.println("\nPlanet tempat manusia berada\t: " + planet.element());

        planet.add("Merkurius");
        planet.add("Venus");
        System.out.println("\nAdd planet Merkurius dan Venus  :");
        System.out.println(planet);

        System.out.println("\n-------------------------");
        System.out.println("| Nama Planet  \t\t|");
        System.out.println("-------------------------");
        Object ob;
        while ((ob = planet.poll()) != null) {
            System.out.println("| " + ob + "            \t|");
        }
        System.out.println("-------------------------");

    }
}
