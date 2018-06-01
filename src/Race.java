import java.util.ArrayList;

public class Race {

    private static ArrayList<Creatures> creatures = new ArrayList<>();
    private static String[] daysWeather = {"s", "c", "c", "r", "r", "r", "s", "c"};
    private static Weather weather = Weather.SUNNY;

    public static void main(String[] args) {

        creatures.add(new SandWalker("Wanderer", 4));
        creatures.add(new Walker("Walker", 7));
        creatures.add(new Sponge("Slider", 12));
        creatures.add(new Sponge("Glider", 10));


        for (String aDaysWeather : daysWeather) {
            System.out.println("\n--------------------------" + "aDaysWeather: " + aDaysWeather);
            switch (aDaysWeather) {
                case "s":
                    weather = Weather.SUNNY;
                    break;
                case "c":
                    weather = Weather.CLOUDEY;
                    break;
                default:
                    weather = Weather.RAINY;
                    break;
            }

            System.out.println(weather);

            for (Creatures myCreatures : creatures) {
                myCreatures.deltaWaterLevel(weather);
                myCreatures.deltaDistance(weather);
                System.out.println("\n" + myCreatures.getName()
                        + "\nDistance Travelled: " + myCreatures.getDistanceTravelled()
                        + "\nWaterlevel: " + myCreatures.getWaterLevel());
            }
        }
    }
}