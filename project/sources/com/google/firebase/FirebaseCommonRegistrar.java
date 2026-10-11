package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ax.D7.C0661c;
import ax.Z7.f;
import ax.h8.C2168c;
import ax.h8.e;
import ax.h8.h;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static /* synthetic */ String b(Context context) {
        int i;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        i = applicationInfo.minSdkVersion;
        return String.valueOf(i);
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static /* synthetic */ String d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? HttpUrl.FRAGMENT_ENCODE_SET : "embedded" : "auto";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2168c.c());
        arrayList.add(f.f());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "21.0.0"));
        arrayList.add(h.b("device-name", e(Build.PRODUCT)));
        arrayList.add(h.b("device-model", e(Build.DEVICE)));
        arrayList.add(h.b("device-brand", e(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: ax.x7.h
            @Override // ax.h8.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: ax.x7.i
            @Override // ax.h8.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: ax.x7.j
            @Override // ax.h8.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: ax.x7.k
            @Override // ax.h8.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String a = e.a();
        if (a != null) {
            arrayList.add(h.b("kotlin", a));
        }
        return arrayList;
    }
}
