package com.volcano.mycoolweather.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

/*
[
    {
        "id": 1,
        "name": "北京"
    },
    {
        "id": 2,
        "name": "上海"
    }
]
 */
public class Province extends DataSupport {

    private int id;

    @SerializedName("name")
    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
