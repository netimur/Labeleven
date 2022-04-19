package com.netimur.labeleven.domain.entity;

public class ThirdReportBody {
    private int count;
    private int month;

    public int getCount() {
        return count;
    }

    public int getMonth() {
        return month;
    }

    public ThirdReportBody(int count, int month) {
        this.count = count;
        this.month = month;
    }

    public ThirdReportBody() {
    }


    @Override
    public String toString() {
        return "\nПлавка:" +

                "за " + month + " месяц." +
                "количество=" + count;
    }
}
