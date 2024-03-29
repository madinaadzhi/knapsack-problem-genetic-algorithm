public class InputParams {
    private final int bagCapacity;
    private int cntItems;
    private int minValue;
    private int maxValue;
    private int minWeight;
    private int maxWeight;
    private int initialPopulation;
    private final int itemsCntInPopulation;
    private boolean uniqueItemsInPopulation;
    private int gensCntForCrossOvering;
    private int mutationProbability;
    private int mutationCnt;

    public InputParams(int bagCapacity, int cntItems, int minValue, int maxValue, int minWeight, int maxWeight, int initialPopulation, int itemsCntInPopulation, boolean uniqueItemsInPopulation, int gensCntForCrossOvering, int mutationProbability, int mutationCnt) {
        this.bagCapacity = bagCapacity;
        this.cntItems = cntItems;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.initialPopulation = initialPopulation;
        this.itemsCntInPopulation = itemsCntInPopulation;
        this.uniqueItemsInPopulation = uniqueItemsInPopulation;
        this.gensCntForCrossOvering = gensCntForCrossOvering;
        this.mutationProbability = mutationProbability;
        this.mutationCnt = mutationCnt;
    }

    public int getBagCapacity() {
        return bagCapacity;
    }

    public int getCntItems() {
        return cntItems;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getInitialPopulation() {
        return initialPopulation;
    }

    public boolean isUniqueItemsInPopulation() {
        return uniqueItemsInPopulation;
    }

    public int getGensCntForCrossOvering() {
        return gensCntForCrossOvering;
    }

    public int getMutationProbability() {
        return mutationProbability;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMutationCnt() {
        return mutationCnt;
    }

    public void setMutationCnt(int mutationCnt) {
        this.mutationCnt = mutationCnt;
    }
}

