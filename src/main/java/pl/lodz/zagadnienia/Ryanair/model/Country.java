package pl.lodz.zagadnienia.Ryanair.model;


/**
 * Created by szymo on 11/03/2016.
 */

public class Country {
    private String code;
    private String name;
    private String seoName;
    private String englishSeoName;
    private String currency;
    private String url;

    public Country(String code, String name, String seoName, String englishSeoName, String currency, String url) {
        this.code = code;
        this.name = name;
        this.seoName = seoName;
        this.englishSeoName = englishSeoName;
        this.currency = currency;
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeoName() {
        return seoName;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public String getEnglishSeoName() {
        return englishSeoName;
    }

    public void setEnglishSeoName(String englishSeoName) {
        this.englishSeoName = englishSeoName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

