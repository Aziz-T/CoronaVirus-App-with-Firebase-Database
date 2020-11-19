package com.k.coronavirus;

public class ulke_model {

    private String ulkeAdı, bayrakUrl;
    private String vakaSayı, iyiSayı, olumSayı;

    public ulke_model(){}

    public ulke_model(String ulkeAdı, String bayrakUrl, String vakaSayı, String iyiSayı, String olumSayı) {
        this.ulkeAdı = ulkeAdı;
        this.bayrakUrl = bayrakUrl;
        this.vakaSayı = vakaSayı;
        this.iyiSayı = iyiSayı;
        this.olumSayı = olumSayı;
    }

    public String getUlkeAdı() {
        return ulkeAdı;
    }

    public void setUlkeAdı(String ulkeAdı) {
        this.ulkeAdı = ulkeAdı;
    }

    public String getBayrakUrl() {
        return bayrakUrl;
    }

    public void setBayrakUrl(String bayrakUrl) {
        this.bayrakUrl = bayrakUrl;
    }

    public String getVakaSayı() {
        return vakaSayı;
    }

    public void setVakaSayı(String vakaSayı) {
        this.vakaSayı = vakaSayı;
    }

    public String getIyiSayı() {
        return iyiSayı;
    }

    public void setIyiSayı(String iyiSayı) {
        this.iyiSayı = iyiSayı;
    }

    public String getOlumSayı() {
        return olumSayı;
    }

    public void setOlumSayı(String olumSayı) {
        this.olumSayı = olumSayı;
    }
}
