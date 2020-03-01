package ru.arvidkozlov.calc.data;

public class CalcData {
    private final int zone;
    private final float ope2;
    private final float spe2;
    private final float sp2;
    private final float totalOPE;
    private final float totalSPE;
    private final float totalSP;
    private final int x2;
    private final int x3;
    private final int x4;

    public CalcData(int zone, float ope2, float spe2, float sp2, float totalOPE, float totalSPE, float totalSP, int x2, int x3, int x4) {
        this.zone = zone;
        this.ope2 = ope2;
        this.spe2 = spe2;
        this.sp2 = sp2;
        this.totalOPE = totalOPE;
        this.totalSPE = totalSPE;
        this.totalSP = totalSP;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    public int getZone() {
        return zone;
    }

    public float getOpe2() {
        return ope2;
    }

    public float getSpe2() {
        return spe2;
    }

    public float getSp2() {
        return sp2;
    }

    public float getTotalOPE() {
        return totalOPE;
    }

    public float getTotalSPE() {
        return totalSPE;
    }

    public float getTotalSP() {
        return totalSP;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getX4() {
        return x4;
    }
}
