package com.company;

public final class CommunalWorker extends Worker{
    private CWType type;
    private boolean isWinter;
    private Malfunction malfunction;

    public CommunalWorker(String name, double salary, CWType type, boolean isWinter) {
        super(name, salary);
        this.type = type;
        this.isWinter = isWinter;
        this.malfunction = new Malfunction();
    }

    public CommunalWorker(CWType type, boolean isWinter) {
        this.type = type;
        this.isWinter = isWinter;
        this.malfunction = new Malfunction();
    }

    public boolean getIsWinter() {
        return isWinter;
    }

    public void setIsWinter(boolean is_winter) {
        this.isWinter = isWinter;
    }

    public CommunalWorker(CWType type) {
        this.type = type;
    }

    public CWType getType() {
        return type;
    }

    public void setMalfunction(Malfunction malfunction) {
        this.malfunction = malfunction;
    }

    public boolean isIs_winter() {
        return isWinter;
    }

    public Malfunction getMalfunction() {
        return malfunction;
    }

    @Override
    public String toString() {
        return "CommunalWorker{" +
                "type=" + type +
                ", isWinter=" + isWinter +
                ", malfunction=" + malfunction +
                '}';
    }
}
