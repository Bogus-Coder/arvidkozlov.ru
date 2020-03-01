package ru.arvidkozlov.calc.data;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorData {
    private final static String newLine = "<br/>";

    private String kmInYear = "1450";
    private String txtKRN = "39";
    private String txtOPE = "12";
    private String txtSPE = "3.5";
    private String txtSP = "6.5";

    private String txtKZG = "276";

    private String txtZp1 = "19";
    private String txtZp2 = "49";
    private String txtZp3 = "25";
    private String txtZp4 = "5";
    private String txtZp5 = "2";

    private String txtX2 = "5";
    private String txtX3 = "3";
    private String txtX4 = "2";

    private String txtY2 = "2";
    private String txtY3 = "3";
    private String txtY4 = "5";

    private String txtZ2 = "1";
    private String txtZ3 = "3";
    private String txtZ4 = "6";

    private Results r2, r3, r4;
    private final DataContainer itogo = new DataContainer();
    private final DataContainer znT = new DataContainer();
    private final DataContainer znMy = new DataContainer();
    private final DataContainer krn = new DataContainer();
    private final DataContainer zan = new DataContainer();
    private final DataContainer znOPE = new DataContainer();
    private final DataContainer znSPE = new DataContainer();
    private final DataContainer znSP = new DataContainer();

    public DataContainer getItogo() {
        return itogo;
    }

    public DataContainer getZnMy() {
        return znMy;
    }

    public DataContainer getZnT() {
        return znT;
    }

    public DataContainer getZnOPE() {
        return znOPE;
    }

    public DataContainer getZnSPE() {
        return znSPE;
    }

    public DataContainer getZnSP() {
        return znSP;
    }

    public DataContainer getZan() {
        return zan;
    }

    public DataContainer getKrn() {
        return krn;
    }

    public String getKmInYear() {
        return kmInYear;
    }

    public void setKmInYear(String kmInYear) {
        this.kmInYear = kmInYear;
    }

    public String getTxtKRN() {
        return txtKRN;
    }

    public void setTxtKRN(String txtKRN) {
        this.txtKRN = txtKRN;
    }

    public String getTxtOPE() {
        return txtOPE;
    }

    public void setTxtOPE(String txtOPE) {
        this.txtOPE = txtOPE;
    }

    public String getTxtSPE() {
        return txtSPE;
    }

    public void setTxtSPE(String txtSPE) {
        this.txtSPE = txtSPE;
    }

    public String getTxtSP() {
        return txtSP;
    }

    public void setTxtSP(String txtSP) {
        this.txtSP = txtSP;
    }

    public String getTxtKZG() {
        return txtKZG;
    }

    public void setTxtKZG(String txtKZG) {
        this.txtKZG = txtKZG;
    }

    public String getTxtZp1() {
        return txtZp1;
    }

    public void setTxtZp1(String txtZp1) {
        this.txtZp1 = txtZp1;
    }

    public String getTxtZp2() {
        return txtZp2;
    }

    public void setTxtZp2(String txtZp2) {
        this.txtZp2 = txtZp2;
    }

    public String getTxtZp3() {
        return txtZp3;
    }

    public void setTxtZp3(String txtZp3) {
        this.txtZp3 = txtZp3;
    }

    public String getTxtZp4() {
        return txtZp4;
    }

    public void setTxtZp4(String txtZp4) {
        this.txtZp4 = txtZp4;
    }

    public String getTxtZp5() {
        return txtZp5;
    }

    public void setTxtZp5(String txtZp5) {
        this.txtZp5 = txtZp5;
    }

    public String getTxtX2() {
        return txtX2;
    }

    public void setTxtX2(String txtX2) {
        this.txtX2 = txtX2;
    }

    public String getTxtX3() {
        return txtX3;
    }

    public void setTxtX3(String txtX3) {
        this.txtX3 = txtX3;
    }

    public String getTxtX4() {
        return txtX4;
    }

    public void setTxtX4(String txtX4) {
        this.txtX4 = txtX4;
    }

    public String getTxtY2() {
        return txtY2;
    }

    public void setTxtY2(String txtY2) {
        this.txtY2 = txtY2;
    }

    public String getTxtY3() {
        return txtY3;
    }

    public void setTxtY3(String txtY3) {
        this.txtY3 = txtY3;
    }

    public String getTxtY4() {
        return txtY4;
    }

    public void setTxtY4(String txtY4) {
        this.txtY4 = txtY4;
    }

    public String getTxtZ2() {
        return txtZ2;
    }

    public void setTxtZ2(String txtZ2) {
        this.txtZ2 = txtZ2;
    }

    public String getTxtZ3() {
        return txtZ3;
    }

    public void setTxtZ3(String txtZ3) {
        this.txtZ3 = txtZ3;
    }

    public String getTxtZ4() {
        return txtZ4;
    }

    public void setTxtZ4(String txtZ4) {
        this.txtZ4 = txtZ4;
    }

    public Results getR2() {
        return r2;
    }

    public void setR2(Results r2) {
        this.r2 = r2;
    }

    public Results getR3() {
        return r3;
    }

    public void setR3(Results r3) {
        this.r3 = r3;
    }

    public Results getR4() {
        return r4;
    }

    public void setR4(Results r4) {
        this.r4 = r4;
    }

    public String calculate() {
        StringBuilder sb = new StringBuilder();


        BigDecimal kmInYear_, Zp1, Zp2, Zp3, Zp4, Zp5;
        int X2, X3, X4, Y2, Y3, Y4, Z2, Z3, Z4;
        BigDecimal KRN, OPE, SPE, SP;

        int KZG, KZN;

        // чтение входных данных в переменные
        kmInYear_ = BigDecimal.valueOf(Double.parseDouble(kmInYear));
        KZG = Integer.parseInt(txtKZG);
        OPE = BigDecimal.valueOf(Float.parseFloat(txtOPE));
        SPE = BigDecimal.valueOf(Float.parseFloat(txtSPE));
        SP = BigDecimal.valueOf(Float.parseFloat(txtSP));
        Zp1 =  BigDecimal.valueOf(Float.parseFloat(txtZp1));
        Zp2 =  BigDecimal.valueOf(Float.parseFloat(txtZp2));
        Zp3 =  BigDecimal.valueOf(Float.parseFloat(txtZp3));
        Zp4 =  BigDecimal.valueOf(Float.parseFloat(txtZp4));
        Zp5 =  BigDecimal.valueOf(Float.parseFloat(txtZp5));
        X2 = Integer.parseInt(txtX2);
        Y2 = Integer.parseInt(txtY2);
        Z2 = Integer.parseInt(txtZ2);
        X3 = Integer.parseInt(txtX3);
        Y3 = Integer.parseInt(txtY3);
        Z3 = Integer.parseInt(txtZ3);
        X4 = Integer.parseInt(txtX4);
        Y4 = Integer.parseInt(txtY4);
        Z4 = Integer.parseInt(txtZ4);
        KRN = BigDecimal.valueOf(Float.parseFloat(txtKRN));

        // validate
        if (KRN.compareTo(OPE.add(SPE).add(SP)) < 0){
            throw new IllegalArgumentException("Колчество рабочих недель не может быть меньше суммы недель ОПЭ + СПЭ + СП");
        }
        BigDecimal bd100 = Zp1.add(Zp2).add(Zp3).add(Zp4).add(Zp5);


        krn.fill(OPE.floatValue(), SPE.floatValue(), SP.floatValue(), null,null);

        // определение среднегодовых значений объёмов плавания по зонам интенсивности на каждое занятие
        float J1 = ((kmInYear_.floatValue() * Zp1.floatValue() / bd100.floatValue()));
        float J2 = ((kmInYear_.floatValue() * Zp2.floatValue() / bd100.floatValue()));
        float J3 = ((kmInYear_.floatValue() * Zp3.floatValue() / bd100.floatValue()));
        float J4 = ((kmInYear_.floatValue() * Zp4.floatValue() / bd100.floatValue()));
        float J5 = ((kmInYear_.floatValue() * Zp5.floatValue() / bd100.floatValue()));
        znT.fill(J1, J2, J3, J4, J5);


        sb.append(newLine).append("Расчет объемов по зонам интенсивности");
        sb.append(newLine).append("1-я зона ").append(String.format("%.2fкм * %.2f%%", kmInYear_, Zp1)).append(String.format(" = %.2fкм", J1));
        sb.append(newLine).append("2-я зона ").append(String.format("%.2fкм * %.2f%%", kmInYear_, Zp2)).append(String.format(" = %.2fкм", J2));
        sb.append(newLine).append("3-я зона ").append(String.format("%.2fкм * %.2f%%", kmInYear_, Zp3)).append(String.format(" = %.2fкм", J3));
        sb.append(newLine).append("4-я зона ").append(String.format("%.2fкм * %.2f%%", kmInYear_, Zp4)).append(String.format(" = %.2fкм", J4));
        sb.append(newLine).append("5-я зона ").append(String.format("%.2fкм * %.2f%%", kmInYear_, Zp5)).append(String.format(" = %.2fкм", J5));


        // определение количества занятий в неделю
        KZN = (KZG / KRN.intValue());
        sb.append(newLine).append(newLine).append("Оределение количества занятий в неделю");
        sb.append(newLine).append(String.format("%d / %d = %d", KZG, KRN.intValue(), KZN));


        float z1o = BigDecimal.valueOf(J1 / KZG).setScale(1, RoundingMode.CEILING).floatValue();
        float z2o = BigDecimal.valueOf(J2 / KZG).setScale(1, RoundingMode.CEILING).floatValue();//J2 / KZG;
        float z3o = BigDecimal.valueOf(J3 / KZG).setScale(1, RoundingMode.CEILING).floatValue();//J3 / KZG;
        float z4o = BigDecimal.valueOf(J4 / KZG).setScale(1, RoundingMode.CEILING).floatValue();//J4 / KZG;
        float z5o = BigDecimal.valueOf(J5 / KZG).setScale(1, RoundingMode.CEILING).floatValue();//J5 / KZG;
        znMy.fill(z1o, z2o, z3o, z4o, z5o);
        sb.append(newLine).append(newLine).append("Оределение среднегодовых значений объемов плавания по зонам интенсивности за занятие");
        sb.append(newLine).append("1-я зона ").append(String.format("%.2fкм / %d", J1, KZG)).append(String.format(" = %.2fкм", z1o));
        sb.append(newLine).append("2-я зона ").append(String.format("%.2fкм / %d", J2, KZG)).append(String.format(" = %.2fкм", z2o));
        sb.append(newLine).append("3-я зона ").append(String.format("%.2fкм / %d", J3, KZG)).append(String.format(" = %.2fкм", z3o));
        sb.append(newLine).append("4-я зона ").append(String.format("%.2fкм / %d", J4, KZG)).append(String.format(" = %.2fкм", z4o));
        sb.append(newLine).append("5-я зона ").append(String.format("%.2fкм / %d", J5, KZG)).append(String.format(" = %.2fкм", z5o));


        float totalOPE = KZN * OPE.floatValue();
        float totalSPE = KZN * SPE.floatValue();
        float totalSP = KZN * SP.floatValue();
        zan.fill(totalOPE , totalSPE , totalSP, null, null);

        sb.append(newLine).append(newLine).append("Общее количество занятий");
        sb.append(newLine).append("ОПЭ ").append(String.format("%d * %.1f = ", KZN, OPE.floatValue())).append(String.format("%.1f", totalOPE));
        sb.append(newLine).append("СПЭ ").append(String.format("%d * %.1f = ", KZN, SPE.floatValue())).append(String.format("%.1f", totalSPE));
        sb.append(newLine).append("СП ").append(String.format("%d * %.1f = ", KZN, SP.floatValue())).append(String.format("%.1f", totalSP));

        float ope1 = totalOPE * z1o;
        float ope2 = totalOPE * z2o;
        float ope3 = totalOPE * z3o;
        float ope4 = totalOPE * z4o;
        float ope5 = totalOPE * z5o;
        znOPE.fill(ope1,ope2,ope3,ope4,ope5);

        float spe1 = totalSPE * z1o;
        float spe2 = totalSPE * z2o;
        float spe3 = totalSPE * z3o;
        float spe4 = totalSPE * z4o;
        float spe5 = totalSPE * z5o;
        znSPE.fill( spe1,spe2,spe3,spe4,spe5);


        float sp1 = totalSP * z1o;
        float sp2 = totalSP * z2o;
        float sp3 = totalSP * z3o;
        float sp4 = totalSP * z4o;
        float sp5 = totalSP * z5o;
        znSP.fill(sp1,sp2,sp3,sp4,sp5);

        itogo.fill(ope1 + spe1 + sp1,
                ope2 + spe2 + sp2,
                ope3 + spe3 + sp3,
                ope4 + spe4 + sp4,
                ope5 + spe5 + sp5
        );

        sb.append(newLine).append(newLine).append("Количество проплываемых км");
        sb.append(newLine).append("ОПЭ 1 зона ").append(String.format("%.1f * %.2f = ", totalOPE, z1o)).append(String.format("%.1f", ope1)).append("км");
        sb.append(newLine).append("ОПЭ 2 зона ").append(String.format("%.1f * %.2f = ", totalOPE, z2o)).append(String.format("%.1f", ope2)).append("км");
        sb.append(newLine).append("ОПЭ 3 зона ").append(String.format("%.1f * %.2f = ", totalOPE, z3o)).append(String.format("%.1f", ope3)).append("км");
        sb.append(newLine).append("ОПЭ 4 зона ").append(String.format("%.1f * %.2f = ", totalOPE, z4o)).append(String.format("%.1f", ope4)).append("км");
        sb.append(newLine).append("ОПЭ 5 зона ").append(String.format("%.1f * %.2f = ", totalOPE, z5o)).append(String.format("%.1f", ope5)).append("км");
        sb.append(newLine);

        sb.append(newLine).append("СПЭ 1 зона ").append(String.format("%.1f * %.2f = ", totalSPE, z1o)).append(String.format("%.1f", spe1)).append("км");
        sb.append(newLine).append("СПЭ 2 зона ").append(String.format("%.1f * %.2f = ", totalSPE, z2o)).append(String.format("%.1f", spe2)).append("км");
        sb.append(newLine).append("СПЭ 3 зона ").append(String.format("%.1f * %.2f = ", totalSPE, z3o)).append(String.format("%.1f", spe3)).append("км");
        sb.append(newLine).append("СПЭ 4 зона ").append(String.format("%.1f * %.2f = ", totalSPE, z4o)).append(String.format("%.1f", spe4)).append("км");
        sb.append(newLine).append("СПЭ 5 зона ").append(String.format("%.1f * %.2f = ", totalSPE, z5o)).append(String.format("%.1f", spe5)).append("км");
        sb.append(newLine);

        sb.append(newLine).append("СП 1 зона ").append(String.format("%.1f * %.2f = ", totalSP, z1o)).append(String.format("%.1f", sp1)).append("км");
        sb.append(newLine).append("СП 2 зона ").append(String.format("%.1f * %.2f = ", totalSP, z2o)).append(String.format("%.1f", sp2)).append("км");
        sb.append(newLine).append("СП 3 зона ").append(String.format("%.1f * %.2f = ", totalSP, z3o)).append(String.format("%.1f", sp3)).append("км");
        sb.append(newLine).append("СП 4 зона ").append(String.format("%.1f * %.2f = ", totalSP, z4o)).append(String.format("%.1f", sp4)).append("км");
        sb.append(newLine).append("СП 5 зона ").append(String.format("%.1f * %.2f = ", totalSP, z5o)).append(String.format("%.1f", sp5)).append("км");
        sb.append(newLine);

        CalcData cd2 = new CalcData(2, ope2, spe2, sp2, totalOPE, totalSPE, totalSP, X2, X3, X4);
        r2 = recalculate(cd2);
        sb.append(r2.getSb());

        CalcData cd3 = new CalcData(3, ope3, spe3, sp3, totalOPE, totalSPE, totalSP, Y2, Y3, Y4);
        r3 = recalculate(cd3);
        sb.append(r3.getSb());

        CalcData cd4 = new CalcData(4, ope4, spe4, sp4, totalOPE, totalSPE, totalSP, Z2, Z3, Z4);
        r4 = recalculate(cd4);
        sb.append(r4.getSb());


        System.out.println(sb);
        return sb.toString();

    }

    private Results recalculate(CalcData cd) {
        Results r = new Results();
        r.getSb().append(newLine).append("********************************************************************************");
        r.getSb().append(newLine).append("********************************************************************************");
        r.getSb().append(newLine).append("Перерасчет по минимальному из ").append(cd.getZone()).append(" зоны");
        float min = Math.min(cd.getOpe2(), cd.getSpe2());
        min = Math.min(min, cd.getSp2());
        r.getSb().append(newLine).append("Минимум из ").append(cd.getZone()).append(" зоны : ").append(String.format("%.1fкм", min));

        r.getSb().append(newLine).append(newLine).append("Осталось км после вычета минимального");
        float ope2Min = cd.getOpe2() - min;
        float spe2Min = cd.getSpe2() - min;
        float sp2Min = cd.getSp2() - min;

        r.setOpe2Min(ope2Min);
        r.setSpe2Min(spe2Min);
        r.setSp2Min(sp2Min);
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зоны : ").append(String.format("%.1fкм", ope2Min));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зоны : ").append(String.format("%.1fкм", spe2Min));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зоны : ").append(String.format("%.1fкм", sp2Min));

        float total = min * 3;
        r.getSb().append(newLine).append(newLine).append("Всего км");
        r.getSb().append(newLine).append(String.format("%.1fкм + %.1fкм + %.1fкм = ", min, min, min)).append(String.format("%.1fкм", total));

        r.getSb().append(newLine).append(newLine).append(String.format("Перерасчет ОПЭ %d - %d - %d", cd.getX2(), cd.getX3(), cd.getX4()));
        int totalX = cd.getX2() + cd.getX3() + cd.getX4();
        float ope2X = (total * cd.getX2()) / totalX;
        float spe2X = (total * cd.getX3()) / totalX;
        float sp2X = (total * cd.getX4()) / totalX;
        r.setRecalc(ope2X, spe2X, sp2X);
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", ope2X));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", spe2X));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", sp2X));


        float ope2_min = ope2Min + ope2X;
        float spe2_min = spe2Min + spe2X;
        float sp2_min = sp2Min + sp2X;
        r.setOpe2_min(ope2_min);
        r.setSpe2_min(spe2_min);
        r.setSp2_min(sp2_min);
        r.getSb().append(newLine).append(newLine).append(String.format("Количество километров после пересчета по нименьшему объему при соотношении %d - %d - %d", cd.getX2(), cd.getX3(), cd.getX4()));
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.1fкм", ope2_min));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.1fкм", spe2_min));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зона : ").append(String.format("%.1fкм", sp2_min));


        float ope2_km = ope2_min / cd.getTotalOPE();
        float spe2_km = spe2_min / cd.getTotalSPE();
        float sp2_km = sp2_min / cd.getTotalSP();
        r.setOpe2_km(ope2_km);
        r.setSpe2_km(spe2_km);
        r.setSp2_km(sp2_km);
        r.getSb().append(newLine).append(newLine).append(String.format("Количество километров в 1 занятии после пересчета %d - %d - %d", cd.getX2(), cd.getX3(), cd.getX4()));
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", ope2_km));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", spe2_km));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", sp2_km));

        float total_km = ope2_km + spe2_km + sp2_km;
        float ope2X_km = (total_km * cd.getX2()) / totalX;
        float spe2X_km = (total_km * cd.getX3()) / totalX;
        float sp2X_km = (total_km * cd.getX4()) / totalX;
        r.setOpe2X_km(ope2X_km);
        r.setSpe2X_km(spe2X_km);
        r.setSp2X_km(sp2X_km);
        r.getSb().append(newLine).append(newLine).append(String.format("Количество километров в 1 занятии после коррекции %d - %d - %d", cd.getX2(), cd.getX3(), cd.getX4()));
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", ope2X_km));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", spe2X_km));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", sp2X_km));

        float ope2X_total_km = ope2X_km * cd.getTotalOPE();
        float spe2X_total_km = spe2X_km * cd.getTotalSPE();
        float sp2X_total_km = sp2X_km * cd.getTotalSP();
        float sum2X_total_km = ope2X_total_km + spe2X_total_km + sp2X_total_km;
        float sum2X_total = cd.getOpe2() + cd.getSpe2() + cd.getSp2();
        float diff2X_total = sum2X_total_km - sum2X_total;
        r.setOpe2X_total_km(ope2X_total_km);
        r.setSpe2X_total_km(spe2X_total_km);
        r.setSp2X_total_km(sp2X_total_km);
        r.setSum2X_total_km(sum2X_total_km);
        r.setSum2X_total(sum2X_total);
        r.setDiff2X_total(diff2X_total);
        r.getSb().append(newLine).append(newLine).append(String.format("Общее количество километров после коррекции %d - %d - %d", cd.getX2(), cd.getX3(), cd.getX4()));
        r.getSb().append(newLine).append("ОПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", ope2X_total_km));
        r.getSb().append(newLine).append("СПЭ ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", spe2X_total_km));
        r.getSb().append(newLine).append("СП ").append(cd.getZone()).append(" зона : ").append(String.format("%.2fкм", sp2X_total_km));
        r.getSb().append(newLine).append(String.format("=:  %.2fкм", sum2X_total_km));
        r.getSb().append(newLine).append(String.format("До:  %.2fкм", sum2X_total));
        r.getSb().append(newLine).append(String.format("Разница:  %.2fкм", diff2X_total));

        return r;
    }

    public void preCalculate() {
        float Zp1 = Float.parseFloat(txtZp1);
        float Zp2 = Float.parseFloat(txtZp2);
        float Zp3 = Float.parseFloat(txtZp3);
        float Zp4 = Float.parseFloat(txtZp4);
        float Zp5 = Float.parseFloat(txtZp5);

        Zp5 = 100.0f - Zp1 - Zp2 - Zp3 - Zp4;
        txtZp5 = String.format("%.0f", Zp5);
    }
}

