package com.example.testforproject.function;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class GetAppInfo {
    private List<String> packageNames;
    //读取系统所有包名
    public void allPackage(Context context) {
        //获取PackageManager
        PackageManager packageManager = context.getPackageManager();
        //获取所有已安装程序的包信息
        List<PackageInfo> packageInfos = packageManager.getInstalledPackages(0);
        //用于存储所有已安装程序的包名
        // List<String> packageNames = new ArrayList<>();
        packageNames = new ArrayList<>();

        //从pinfo中将包名字逐一取出，压入pName list中
        if (packageInfos != null) {
            Log.e("GetAppInfo", "start record:========================");
            for (int i = 0; i < packageInfos.size(); i++) {
                String packName = packageInfos.get(i).packageName;
                if (!packName.contains("android")) {
                    packageNames.add(packName);
                    try {
                        ApplicationInfo info = packageManager.getApplicationInfo(packName, 0);
                        CharSequence AppName=packageManager.getApplicationLabel(info);
                        Log.e("GetAPPInfo", "allPackage: ------------------------------------" + packName +"===================="+ AppName);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }


                }
            }
        }

    }
}
