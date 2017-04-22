package com.company;

/**
 * Created by jaradtouchberry on 4/17/17.
 */
public class Cheeseburger {
    Boolean mayo;
    int pattie;
    int bun;
    int bacon;
    String SpecialInstruction;


    public Cheeseburger(Boolean mayo, int pattie, int bun, int bacon, String SpecialInstruction) {
        this.mayo = mayo;
        this.pattie = pattie;
        this.bun = bun;
        this.bacon = bacon;
        this.SpecialInstruction = SpecialInstruction;
    }

    public Boolean getMayo() {
        return mayo;
    }

    public void setMayo(Boolean mayo) {
        this.mayo = mayo;
    }

    public int getPattie() {
        return pattie;
    }

    public void setPattie(int pattie) {
        this.pattie = pattie;
    }

    public int getBun() {
        return bun;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public int getBacon() {
        return bacon;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public String getSpecialInstruction() {
        return SpecialInstruction;
    }

    public void setSpecialInstruction(String specialInstruction) {
        SpecialInstruction = specialInstruction;
    }
}