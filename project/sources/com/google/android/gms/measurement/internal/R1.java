package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.C0821p;
import ax.f6.C2068p;
import ax.f6.C2069q;
import ax.f6.C2071s;
import ax.f6.InterfaceC2060h;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class R1 {
    private static final AtomicReference<String[]> b = new AtomicReference<>();
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private final InterfaceC2060h a;

    public R1(InterfaceC2060h interfaceC2060h) {
        this.a = interfaceC2060h;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C0821p.l(strArr);
        C0821p.l(strArr2);
        C0821p.l(atomicReference);
        C0821p.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String a = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String b(D d2) {
        if (d2 == null) {
            return null;
        }
        if (!this.a.a()) {
            return d2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(d2.d0);
        sb.append(",name=");
        sb.append(c(d2.q));
        sb.append(",params=");
        C c2 = d2.c0;
        sb.append(c2 != null ? !this.a.a() ? c2.toString() : a(c2.B()) : null);
        return sb.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : d(str, C2069q.c, C2069q.a, b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : d(str, C2068p.b, C2068p.a, c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, C2071s.b, C2071s.a, d);
        }
        return "experiment_id(" + str + ")";
    }
}
