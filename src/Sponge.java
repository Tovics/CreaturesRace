
public class Sponge extends Creatures {
    private final int MAXWATER = 20;

    Sponge(String creaturesName, int waterLevel) {
        this.waterLevel = waterLevel;
        this.creaturesName = creaturesName;
    }

    @Override
    protected void deltaWaterLevel(Weather weather) {
        if (isAlive()) switch (weather) {
            case SUNNY:
                this.waterLevel -= 4;
                break;
            case CLOUDEY:
                this.waterLevel -= 1;
                break;
            case RAINY:
                this.waterLevel += 6;
                if (this.waterLevel > MAXWATER)
                    this.waterLevel = MAXWATER;
                break;
        }
    }

    @Override
    protected void deltaDistance(Weather weather) {
        if (isAlive()) switch (weather) {
            case SUNNY:
                break;
            case CLOUDEY:
                this.distanceTravelled += 1;
                break;
            case RAINY:
                this.distanceTravelled += 3;
                break;
        }
    }
}
