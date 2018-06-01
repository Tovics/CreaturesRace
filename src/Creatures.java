
public abstract class Creatures {

    protected String creaturesName;
    protected int waterLevel;
    protected int distanceTravelled = 0;

    protected boolean isAlive() {
        return waterLevel > 0;
    }

    protected String getName() {
        return this.creaturesName;
    }

    protected int getWaterLevel() {
        return this.waterLevel;
    }

    protected int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    protected abstract void deltaWaterLevel(Weather weather);

    protected abstract void deltaDistance(Weather weather);
}
