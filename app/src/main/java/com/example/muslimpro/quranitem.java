package com.example.muslimpro;

public class quranitem {
    String soraname ;
    int img_id ;

    public quranitem(String soraname, int img_id) {
        this.soraname = soraname;
        this.img_id = img_id;
    }

    public String getSoraname() {
        return soraname;
    }

    public void setSoraname(String soraname) {
        this.soraname = soraname;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
