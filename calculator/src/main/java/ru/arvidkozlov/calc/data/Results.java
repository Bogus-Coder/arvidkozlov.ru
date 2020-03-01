package ru.arvidkozlov.calc.data;

public class Results {
    private StringBuilder sb = new StringBuilder();
    private float ope2X_total_km, spe2X_total_km, sp2X_total_km;
    private float sum2X_total_km;
    private float sum2X_total;
    private float diff2X_total;

    // км после вычета минимального
    private float ope2Min,spe2Min,sp2Min;
    // Количество километров после пересчета по нименьшему объему при соотношении 5 - 3 - 2
    private float ope2_min,spe2_min,sp2_min;
    // Количество километров в 1 занятии после пересчета 5 - 3 - 2
    private float ope2_km,spe2_km,sp2_km;
    // Количество километров в 1 занятии после коррекции 5 - 3 - 2
    private float ope2X_km,spe2X_km,sp2X_km;

    protected StringBuilder getSb() {
        return sb;
    }

    public void setSb(StringBuilder sb) {
        this.sb = sb;
    }

    public String getOpe2X_total_km() {
        return tos(ope2X_total_km);
    }

    protected static String tos(Float f) {
        return null == f ? null : String.format("%.1f", f);
    }

    public void setOpe2X_total_km(float ope2X_total_km) {
        this.ope2X_total_km = ope2X_total_km;
    }

    public String getSpe2X_total_km() {
        return tos(spe2X_total_km);
    }

    public void setSpe2X_total_km(float spe2X_total_km) {
        this.spe2X_total_km = spe2X_total_km;
    }

    public String getSp2X_total_km() {
        return tos(sp2X_total_km);
    }

    public void setSp2X_total_km(float sp2X_total_km) {
        this.sp2X_total_km = sp2X_total_km;
    }

    public String getSum2X_total_km() {
        return tos(sum2X_total_km);
    }

    public void setSum2X_total_km(float sum2X_total_km) {
        this.sum2X_total_km = sum2X_total_km;
    }

    public String getSum2X_total() {
        return tos(sum2X_total);
    }

    protected void setSum2X_total(float sum2X_total) {
        this.sum2X_total = sum2X_total;
    }

    public String getDiff2X_total() {
        return tos(diff2X_total);
    }

    public void setDiff2X_total(float diff2X_total) {
        this.diff2X_total = diff2X_total;
    }

    public String getOpe2Min() {
        return tos(ope2Min);
    }

    public void setOpe2Min(float ope2Min) {
        this.ope2Min = ope2Min;
    }

    public String getSpe2Min() {
        return tos(spe2Min);
    }

    public void setSpe2Min(float spe2Min) {
        this.spe2Min = spe2Min;
    }

    public String getSp2Min() {
        return tos(sp2Min);
    }

    public void setSp2Min(float sp2Min) {
        this.sp2Min = sp2Min;
    }

    public String getOpe2_min() {
        return tos(ope2_min);
    }

    public void setOpe2_min(float ope2_min) {
        this.ope2_min = ope2_min;
    }

    public String getSpe2_min() {
        return tos(spe2_min);
    }

    public void setSpe2_min(float spe2_min) {
        this.spe2_min = spe2_min;
    }

    public String getSp2_min() {
        return tos(sp2_min);
    }

    public void setSp2_min(float sp2_min) {
        this.sp2_min = sp2_min;
    }

    public String getOpe2_km() {
        return tos(ope2_km);
    }

    public void setOpe2_km(float ope2_km) {
        this.ope2_km = ope2_km;
    }

    public String getSpe2_km() {
        return tos(spe2_km);
    }

    public void setSpe2_km(float spe2_km) {
        this.spe2_km = spe2_km;
    }

    public String getSp2_km() {
        return tos(sp2_km);
    }

    public void setSp2_km(float sp2_km) {
        this.sp2_km = sp2_km;
    }

    public String getOpe2X_km() {
        return tos(ope2X_km);
    }

    public void setOpe2X_km(float ope2X_km) {
        this.ope2X_km = ope2X_km;
    }

    public String getSpe2X_km() {
        return tos(spe2X_km);
    }

    public void setSpe2X_km(float spe2X_km) {
        this.spe2X_km = spe2X_km;
    }

    public String getSp2X_km() {
        return tos(sp2X_km);
    }

    public void setSp2X_km(float sp2X_km) {
        this.sp2X_km = sp2X_km;
    }

    private float ope2X,  spe2X,  sp2X;
    protected void setRecalc(float ope2X, float spe2X, float sp2X) {
        this.ope2X = ope2X;
        this.spe2X = spe2X;
        this.sp2X = sp2X;
    }

    public String getOpe2X() {
        return tos(ope2X);
    }

    public String getSpe2X() {
        return tos(spe2X);
    }

    public String getSp2X() {
        return tos(sp2X);
    }
}
