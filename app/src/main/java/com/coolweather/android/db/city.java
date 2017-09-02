package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by PanJunYi on 2017/9/3.
 */
public class city extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int ProvinceID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(int provinceID) {
        ProvinceID = provinceID;
    }
}
