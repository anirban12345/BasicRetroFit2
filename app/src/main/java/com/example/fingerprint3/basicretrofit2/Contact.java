package com.example.fingerprint3.basicretrofit2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("sid")
    @Expose
    private String sid;
    @SerializedName("sname")
    @Expose
    private String sname;
    @SerializedName("saddress")
    @Expose
    private String saddress;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }


}
