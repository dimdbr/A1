package com.company;

public class Communal_worker extends Worker{
    private CW_type type;
    private boolean is_winter;
    private Malfunction malfunction;

    public Communal_worker(String name, double salary, CW_type type, boolean is_winter) {
        super(name, salary);
        this.type = type;
        this.is_winter = is_winter;
        this.malfunction = null;
    }

    public Communal_worker(CW_type type, boolean is_winter) {
        this.type = type;
        this.is_winter = is_winter;
        this.malfunction = null;
    }

    public boolean get_is_winter() {
        return is_winter;
    }

    public void setIs_winter(boolean is_winter) {
        this.is_winter = is_winter;
    }

    public Communal_worker(CW_type type) {
        this.type = type;
    }

    public CW_type getType() {
        return type;
    }

    public void setMalfunction(Malfunction malfunction) {
        this.malfunction = malfunction;
    }

    @Override
    public void do_a_work() {
        System.out.println("Doing communal job");
    }
}
