package com.example.storedaterealtime;

public class Dateclass {

    private String dataTitle;
    private String dataDesc;
    private String dataLang;
    private String dateImage;

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDatalang() {
        return dataLang;
    }

    public String getDateImage() {
        return dateImage;
    }

    public Dateclass(String dataTitle, String dataDesc, String datalang, String dateImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = datalang;
        this.dateImage = dateImage;
    }
}
