package com.glroland.iotsim.nasa;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import com.glroland.iotsim.utils.JsonUtils;

@CsvRecord(separator = " ", skipField = true, skipFirstLine = false)
public class EngineSensorMeasurement implements Serializable 
{
    @DataField(pos = 1)
    private int unitNumber;

    @DataField(pos = 2)
    private int timeInCycles;

    @DataField(pos = 3)
    private double operationalSetting1;

    @DataField(pos = 4)
    private double operationalSetting2;

    @DataField(pos = 5)
    private double operationalSetting3;

    @DataField(pos = 6)
    private double sensorMeasurement1;

    @DataField(pos = 7)
    private double sensorMeasurement2;

    @DataField(pos = 8)
    private double sensorMeasurement3;

    @DataField(pos = 9)
    private double sensorMeasurement4;

    @DataField(pos = 10)
    private double sensorMeasurement5;

    @DataField(pos = 11)
    private double sensorMeasurement6;

    @DataField(pos = 12)
    private double sensorMeasurement7;

    @DataField(pos = 13)
    private double sensorMeasurement8;

    @DataField(pos = 14)
    private double sensorMeasurement9;

    @DataField(pos = 15)
    private double sensorMeasurement10;

    @DataField(pos = 16)
    private double sensorMeasurement11;

    @DataField(pos = 17)
    private double sensorMeasurement12;

    @DataField(pos = 18)
    private double sensorMeasurement13;

    @DataField(pos = 19)
    private double sensorMeasurement14;

    @DataField(pos = 20)
    private double sensorMeasurement15;

    @DataField(pos = 21)
    private double sensorMeasurement16;

    @DataField(pos = 22)
    private double sensorMeasurement17;

    @DataField(pos = 23)
    private double sensorMeasurement18;

    @DataField(pos = 24)
    private double sensorMeasurement19;

    @DataField(pos = 25)
    private double sensorMeasurement20;

    @DataField(pos = 26)
    private double sensorMeasurement21;

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public int getTimeInCycles() {
        return timeInCycles;
    }

    public void setTimeInCycles(int timeInCycles) {
        this.timeInCycles = timeInCycles;
    }

    public double getOperationalSetting1() {
        return operationalSetting1;
    }

    public void setOperationalSetting1(double operationalSetting1) {
        this.operationalSetting1 = operationalSetting1;
    }

    public double getOperationalSetting2() {
        return operationalSetting2;
    }

    public void setOperationalSetting2(double operationalSetting2) {
        this.operationalSetting2 = operationalSetting2;
    }

    public double getOperationalSetting3() {
        return operationalSetting3;
    }

    public void setOperationalSetting3(double operationalSetting3) {
        this.operationalSetting3 = operationalSetting3;
    }

    public double getSensorMeasurement1() {
        return sensorMeasurement1;
    }

    public void setSensorMeasurement1(double sensorMeasurement1) {
        this.sensorMeasurement1 = sensorMeasurement1;
    }

    public double getSensorMeasurement2() {
        return sensorMeasurement2;
    }

    public void setSensorMeasurement2(double sensorMeasurement2) {
        this.sensorMeasurement2 = sensorMeasurement2;
    }

    public double getSensorMeasurement3() {
        return sensorMeasurement3;
    }

    public void setSensorMeasurement3(double sensorMeasurement3) {
        this.sensorMeasurement3 = sensorMeasurement3;
    }

    public double getSensorMeasurement4() {
        return sensorMeasurement4;
    }

    public void setSensorMeasurement4(double sensorMeasurement4) {
        this.sensorMeasurement4 = sensorMeasurement4;
    }

    public double getSensorMeasurement5() {
        return sensorMeasurement5;
    }

    public void setSensorMeasurement5(double sensorMeasurement5) {
        this.sensorMeasurement5 = sensorMeasurement5;
    }

    public double getSensorMeasurement6() {
        return sensorMeasurement6;
    }

    public void setSensorMeasurement6(double sensorMeasurement6) {
        this.sensorMeasurement6 = sensorMeasurement6;
    }

    public double getSensorMeasurement7() {
        return sensorMeasurement7;
    }

    public void setSensorMeasurement7(double sensorMeasurement7) {
        this.sensorMeasurement7 = sensorMeasurement7;
    }

    public double getSensorMeasurement8() {
        return sensorMeasurement8;
    }

    public void setSensorMeasurement8(double sensorMeasurement8) {
        this.sensorMeasurement8 = sensorMeasurement8;
    }

    public double getSensorMeasurement9() {
        return sensorMeasurement9;
    }

    public void setSensorMeasurement9(double sensorMeasurement9) {
        this.sensorMeasurement9 = sensorMeasurement9;
    }

    public double getSensorMeasurement10() {
        return sensorMeasurement10;
    }

    public void setSensorMeasurement10(double sensorMeasurement10) {
        this.sensorMeasurement10 = sensorMeasurement10;
    }

    public double getSensorMeasurement11() {
        return sensorMeasurement11;
    }

    public void setSensorMeasurement11(double sensorMeasurement11) {
        this.sensorMeasurement11 = sensorMeasurement11;
    }

    public double getSensorMeasurement12() {
        return sensorMeasurement12;
    }

    public void setSensorMeasurement12(double sensorMeasurement12) {
        this.sensorMeasurement12 = sensorMeasurement12;
    }

    public double getSensorMeasurement13() {
        return sensorMeasurement13;
    }

    public void setSensorMeasurement13(double sensorMeasurement13) {
        this.sensorMeasurement13 = sensorMeasurement13;
    }

    public double getSensorMeasurement14() {
        return sensorMeasurement14;
    }

    public void setSensorMeasurement14(double sensorMeasurement14) {
        this.sensorMeasurement14 = sensorMeasurement14;
    }

    public double getSensorMeasurement15() {
        return sensorMeasurement15;
    }

    public void setSensorMeasurement15(double sensorMeasurement15) {
        this.sensorMeasurement15 = sensorMeasurement15;
    }

    public double getSensorMeasurement16() {
        return sensorMeasurement16;
    }

    public void setSensorMeasurement16(double sensorMeasurement16) {
        this.sensorMeasurement16 = sensorMeasurement16;
    }

    public double getSensorMeasurement17() {
        return sensorMeasurement17;
    }

    public void setSensorMeasurement17(double sensorMeasurement17) {
        this.sensorMeasurement17 = sensorMeasurement17;
    }

    public double getSensorMeasurement18() {
        return sensorMeasurement18;
    }

    public void setSensorMeasurement18(double sensorMeasurement18) {
        this.sensorMeasurement18 = sensorMeasurement18;
    }

    public double getSensorMeasurement19() {
        return sensorMeasurement19;
    }

    public void setSensorMeasurement19(double sensorMeasurement19) {
        this.sensorMeasurement19 = sensorMeasurement19;
    }

    public double getSensorMeasurement20() {
        return sensorMeasurement20;
    }

    public void setSensorMeasurement20(double sensorMeasurement20) {
        this.sensorMeasurement20 = sensorMeasurement20;
    }

    public double getSensorMeasurement21() {
        return sensorMeasurement21;
    }

    public void setSensorMeasurement21(double sensorMeasurement21) {
        this.sensorMeasurement21 = sensorMeasurement21;
    }
    
    public String toString() {
        try {
           return JsonUtils.beanToJson(this);
        } catch(RuntimeException e) {
            return super.toString();
        }
    }
}
