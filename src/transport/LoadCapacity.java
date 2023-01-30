package transport;

public enum LoadCapacity {
    N1(3.5, 12),
    N2(13, 20),
    N3(21, 500);

    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }
    LoadCapacity(){}

    public double getMin() {
        return min;}

    public double getMax() {
        return max;
    }
    public static LoadCapacity getValue(double value){
        for (LoadCapacity e : LoadCapacity.values()){
            if (value >= e.getMin() && value <= e.getMax()){
                System.out.println(e);
                return e;
            }
        }
        return null;
    }
}
