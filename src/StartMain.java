public class StartMain {
    private float temperature;
    private int coreVoltage;
    private int memoryClock;
    private int coreClock;
    private int minGraphic;
    private int maxGraphic;
    private int minCoreGraph;
    private int maxCoreGraph;
    private float mhs = 5;
    private float lastMhs;
    private int lastMemoryClock;
    private int memoryWeight;
    private int memoryWeightGraphic;
    private int coreWeight;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getCoreVoltage() {
        return coreVoltage;
    }

    public void setCoreVoltage(int coreVoltage) {
        this.coreVoltage = coreVoltage;
    }

    public int getMemoryClock() {
        return memoryClock;
    }

    public void setMemoryClock(int memoryClock) {
        this.memoryClock = memoryClock;
    }

    public int getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }

    public int getMinGraphic() {
        return minGraphic;
    }

    public void setMinGraphic(int minGraphic) {
        this.minGraphic = minGraphic;
    }

    public int getMaxGraphic() {
        return maxGraphic;
    }

    public void setMaxGraphic(int maxGraphic) {
        this.maxGraphic = maxGraphic;
    }

    public int getMinCoreGraph() {
        return minCoreGraph;
    }

    public void setMinCoreGraph(int minCoreGraph) {
        this.minCoreGraph = minCoreGraph;
    }

    public int getMaxCoreGraph() {
        return maxCoreGraph;
    }

    public void setMaxCoreGraph(int maxCoreGraph) {
        this.maxCoreGraph = maxCoreGraph;
    }

    public float getMhs() {
        return mhs;
    }

    public void setMhs(float mhs) {
        this.mhs = mhs;
    }

    public float getLastMhs() {
        return lastMhs;
    }

    public void setLastMhs(float lastMhs) {
        this.lastMhs = lastMhs;
    }

    public int getLastMemoryClock() {
        return lastMemoryClock;
    }

    public void setLastMemoryClock(int lastMemoryClock) {
        this.lastMemoryClock = lastMemoryClock;
    }

    public int getMemoryWeight() {
        return memoryWeight;
    }

    public void setMemoryWeight(int memoryWeight) {
        this.memoryWeight = memoryWeight;
    }

    public int getMemoryWeightGraphic() {
        return memoryWeightGraphic;
    }

    public void setMemoryWeightGraphic(int memoryWeightGraphic) {
        this.memoryWeightGraphic = memoryWeightGraphic;
    }

    public int getCoreWeight() {
        return coreWeight;
    }

    public void setCoreWeight(int coreWeight) {
        this.coreWeight = coreWeight;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.setValues();
        for (int i = 0; i < 5; i++) {
            calculation.additionCore();
            calculation.subtractionCore();
        }
    }
}
