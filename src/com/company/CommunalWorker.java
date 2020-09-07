package com.company;

public class CommunalWorker extends Worker{
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

    public boolean get_is_winter() {
        return isWinter;
    }

    public void setIs_winter(boolean is_winter) {
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


}
