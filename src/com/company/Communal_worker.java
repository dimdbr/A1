package com.company;

public class Communal_worker extends Worker{
    private CW_type type;
    private boolean is_winter;
    private double fix_problem_value;//комунальщики это наемные рабочие раз в месяц, они сами назначают стоимость их нештатных услуг
    public Communal_worker(String name, double salary, CW_type type) {
        super(name, salary);
        this.type = type;
    }

    public double getFix_problem_value() {
        return fix_problem_value;
    }

    public void setFix_problem_value(double fix_problem_value) {
        this.fix_problem_value = fix_problem_value;
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

    @Override
    public void do_a_work() {
        System.out.println("Doing communal job");
    }
}
