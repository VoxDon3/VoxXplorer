/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ax.Z7.f;
import ax.h8.c;
import ax.h8.e;
import ax.x7.h;
import ax.x7.i;
import ax.x7.j;
import ax.x7.k;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar
implements ComponentRegistrar {
    public static /* synthetic */ String a(Context object) {
        if ((object = object.getPackageManager().getInstallerPackageName(object.getPackageName())) != null) {
            return FirebaseCommonRegistrar.e((String)object);
        }
        return "";
    }

    public static /* synthetic */ String b(Context context) {
        if ((context = context.getApplicationInfo()) != null && Build.VERSION.SDK_INT >= 24) {
            return String.valueOf(ax.U2.e.a((ApplicationInfo)context));
        }
        return "";
    }

    public static /* synthetic */ String c(Context context) {
        if ((context = context.getApplicationInfo()) != null) {
            return String.valueOf(context.targetSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String d(Context context) {
        int n8 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (n8 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (n8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    private static String e(String string) {
        return string.replace(' ', '_').replace('/', '_');
    }

    @Override
    public List<ax.D7.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(f.f());
        arrayList.add(ax.h8.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ax.h8.h.b("fire-core", "21.0.0"));
        arrayList.add(ax.h8.h.b("device-name", FirebaseCommonRegistrar.e(Build.PRODUCT)));
        arrayList.add(ax.h8.h.b("device-model", FirebaseCommonRegistrar.e(Build.DEVICE)));
        arrayList.add(ax.h8.h.b("device-brand", FirebaseCommonRegistrar.e(Build.BRAND)));
        arrayList.add(ax.h8.h.c("android-target-sdk", new h()));
        arrayList.add(ax.h8.h.c("android-min-sdk", new i()));
        arrayList.add(ax.h8.h.c("android-platform", new j()));
        arrayList.add(ax.h8.h.c("android-installer", new k()));
        String string = e.a();
        if (string != null) {
            arrayList.add(ax.h8.h.b("kotlin", string));
        }
        return arrayList;
    }
}

