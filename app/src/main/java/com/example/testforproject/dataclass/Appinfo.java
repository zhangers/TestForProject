package com.example.testforproject.dataclass;

import android.graphics.drawable.Drawable;

public class Appinfo {
    private String Pkginfo;
    private Drawable AppIcon;
    private String Appname;

    public String getPkginfo() {
        return Pkginfo;
    }

    public Drawable getAppIcon(){
        return AppIcon;
    }

    public String getAppname(){
        return Appname;
    }
}
