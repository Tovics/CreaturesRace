
public class Walker extends Creatures {
    private final int MAXWATER = 12;

    Walker(String creaturesName, int waterLevel) {
        this.waterLevel = waterLevel;
        this.creaturesName = creaturesName;
    }

    @Override
    protected void deltaWaterLevel(Weather weather) {
        if (isAlive()) switch (weather) {
            case SUNNY:
                this.waterLevel -= 2;
                break;
            case CLOUDEY:
                this.waterLevel -= 1;
                break;
            case RAINY:
                this.waterLevel += 3;
                if (this.waterLevel > MAXWATER)
                    this.waterLevel = MAXWATER;
                break;
        }
    }

    @Override
    protected void deltaDistance(Weather weather) {
        if (isAlive()) switch (weather) {
            case SUNNY:
                this.distanceTravelled += 1;
                break;
            case CLOUDEY:
                this.distanceTravelled += 2;
                break;
            case RAINY:
                this.distanceTravelled += 1;
                break;
        }
    }
}
