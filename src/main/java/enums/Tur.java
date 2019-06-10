package enums;

public enum Tur{


    Kimya(2,"Kimya","Ders"),
    Fizik(1,"Fizik","Ders"),
    Biyoloji(3,"Biyoloji","Ders"),
    Matematik(4,"Matematik","Ders"),
    Geometri(5,"Geometri","Ders"),
    Edebiyat(6,"Edebiyat","Ders"),
    Ingilizce(7,"İngilizce","Ders"),
    Cografya(8,"Coğrafya","Ders");

    private Integer key;
    private String value;
    private String ozet;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOzet() {
        return ozet;
    }

    public void setOzet(String ozet) {
        this.ozet = ozet;
    }

    private Tur(Integer key, String value, String ozet){


    }


}
