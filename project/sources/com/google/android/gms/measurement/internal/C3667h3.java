package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.f6.EnumC2067o;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3667h3 {
    public static final C3667h3 c = new C3667h3(null, null, 100);
    private final EnumMap<a, EnumC2067o> a;
    private final int b;

    /* renamed from: com.google.android.gms.measurement.internal.h3$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String q;

        a(String str) {
            this.q = str;
        }
    }

    private C3667h3(EnumMap<a, EnumC2067o> enumMap, int i) {
        EnumMap<a, EnumC2067o> enumMap2 = new EnumMap<>((Class<a>) a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }

    static char a(EnumC2067o enumC2067o) {
        if (enumC2067o == null) {
            return '-';
        }
        int ordinal = enumC2067o.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    static EnumC2067o c(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? EnumC2067o.UNINITIALIZED : EnumC2067o.GRANTED : EnumC2067o.DENIED : EnumC2067o.POLICY;
    }

    static EnumC2067o d(Boolean bool) {
        return bool == null ? EnumC2067o.UNINITIALIZED : bool.booleanValue() ? EnumC2067o.GRANTED : EnumC2067o.DENIED;
    }

    static EnumC2067o e(String str) {
        return str == null ? EnumC2067o.UNINITIALIZED : str.equals("granted") ? EnumC2067o.GRANTED : str.equals("denied") ? EnumC2067o.DENIED : EnumC2067o.UNINITIALIZED;
    }

    public static C3667h3 f(Bundle bundle, int i) {
        a[] aVarArr;
        if (bundle == null) {
            return new C3667h3(null, null, i);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC3674i3.STORAGE.q;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) e(bundle.getString(aVar.q)));
        }
        return new C3667h3(enumMap, i);
    }

    public static C3667h3 g(EnumC2067o enumC2067o, EnumC2067o enumC2067o2, int i) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) enumC2067o);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) enumC2067o2);
        return new C3667h3(enumMap, -10);
    }

    public static C3667h3 i(String str, int i) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        a[] d = EnumC3674i3.STORAGE.d();
        for (int i2 = 0; i2 < d.length; i2++) {
            a aVar = d[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) c(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) aVar, (a) EnumC2067o.UNINITIALIZED);
            }
        }
        return new C3667h3(enumMap, i);
    }

    static String j(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String k(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = EnumC3674i3.STORAGE.q;
        int length = aVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            a aVar = aVarArr[i];
            if (bundle.containsKey(aVar.q) && (string = bundle.getString(aVar.q)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public static boolean l(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    public static C3667h3 q(String str) {
        return i(str, 100);
    }

    static String r(EnumC2067o enumC2067o) {
        int ordinal = enumC2067o.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        return m(a.AD_STORAGE);
    }

    public final boolean B() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean C() {
        Iterator<EnumC2067o> it = this.a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != EnumC2067o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof C3667h3)) {
            return false;
        }
        C3667h3 c3667h3 = (C3667h3) obj;
        aVarArr = EnumC3674i3.STORAGE.q;
        for (a aVar : aVarArr) {
            if (this.a.get(aVar) != c3667h3.a.get(aVar)) {
                return false;
            }
        }
        return this.b == c3667h3.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C3667h3 h(com.google.android.gms.measurement.internal.C3667h3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.h3$a> r1 = com.google.android.gms.measurement.internal.C3667h3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.i3 r1 = com.google.android.gms.measurement.internal.EnumC3674i3.STORAGE
            com.google.android.gms.measurement.internal.h3$a[] r1 = com.google.android.gms.measurement.internal.EnumC3674i3.h(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.h3$a, ax.f6.o> r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            ax.f6.o r5 = (ax.f6.EnumC2067o) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.h3$a, ax.f6.o> r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            ax.f6.o r6 = (ax.f6.EnumC2067o) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            ax.f6.o r7 = ax.f6.EnumC2067o.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            ax.f6.o r7 = ax.f6.EnumC2067o.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            ax.f6.o r7 = ax.f6.EnumC2067o.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            ax.f6.o r5 = ax.f6.EnumC2067o.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.h3 r9 = new com.google.android.gms.measurement.internal.h3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3667h3.h(com.google.android.gms.measurement.internal.h3):com.google.android.gms.measurement.internal.h3");
    }

    public final int hashCode() {
        int i = this.b * 17;
        Iterator<EnumC2067o> it = this.a.values().iterator();
        while (it.hasNext()) {
            i = (i * 31) + it.next().hashCode();
        }
        return i;
    }

    public final boolean m(a aVar) {
        return this.a.get(aVar) != EnumC2067o.DENIED;
    }

    public final boolean n(C3667h3 c3667h3, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!c3667h3.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, EnumC2067o> entry : this.a.entrySet()) {
            String r = r(entry.getValue());
            if (r != null) {
                bundle.putString(entry.getKey().q, r);
            }
        }
        return bundle;
    }

    public final C3667h3 p(C3667h3 c3667h3) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC3674i3.STORAGE.q;
        for (a aVar : aVarArr) {
            EnumC2067o enumC2067o = this.a.get(aVar);
            if (enumC2067o == EnumC2067o.UNINITIALIZED) {
                enumC2067o = c3667h3.a.get(aVar);
            }
            if (enumC2067o != null) {
                enumMap.put((EnumMap) aVar, (a) enumC2067o);
            }
        }
        return new C3667h3(enumMap, this.b);
    }

    public final boolean s(C3667h3 c3667h3, a... aVarArr) {
        for (a aVar : aVarArr) {
            EnumC2067o enumC2067o = this.a.get(aVar);
            EnumC2067o enumC2067o2 = c3667h3.a.get(aVar);
            EnumC2067o enumC2067o3 = EnumC2067o.DENIED;
            if (enumC2067o == enumC2067o3 && enumC2067o2 != enumC2067o3) {
                return true;
            }
        }
        return false;
    }

    public final EnumC2067o t() {
        EnumC2067o enumC2067o = this.a.get(a.AD_STORAGE);
        return enumC2067o == null ? EnumC2067o.UNINITIALIZED : enumC2067o;
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(j(this.b));
        aVarArr = EnumC3674i3.STORAGE.q;
        for (a aVar : aVarArr) {
            sb.append(",");
            sb.append(aVar.q);
            sb.append("=");
            EnumC2067o enumC2067o = this.a.get(aVar);
            if (enumC2067o == null) {
                enumC2067o = EnumC2067o.UNINITIALIZED;
            }
            sb.append(enumC2067o);
        }
        return sb.toString();
    }

    public final boolean u(C3667h3 c3667h3) {
        return s(c3667h3, (a[]) this.a.keySet().toArray(new a[0]));
    }

    public final EnumC2067o v() {
        EnumC2067o enumC2067o = this.a.get(a.ANALYTICS_STORAGE);
        return enumC2067o == null ? EnumC2067o.UNINITIALIZED : enumC2067o;
    }

    public final Boolean w() {
        EnumC2067o enumC2067o = this.a.get(a.AD_STORAGE);
        if (enumC2067o == null) {
            return null;
        }
        int ordinal = enumC2067o.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean x() {
        EnumC2067o enumC2067o = this.a.get(a.ANALYTICS_STORAGE);
        if (enumC2067o == null) {
            return null;
        }
        int ordinal = enumC2067o.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final String y() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : EnumC3674i3.STORAGE.d()) {
            EnumC2067o enumC2067o = this.a.get(aVar);
            char c2 = '-';
            if (enumC2067o != null && (ordinal = enumC2067o.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String z() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : EnumC3674i3.STORAGE.d()) {
            sb.append(a(this.a.get(aVar)));
        }
        return sb.toString();
    }

    public C3667h3(Boolean bool, Boolean bool2, int i) {
        EnumMap<a, EnumC2067o> enumMap = new EnumMap<>((Class<a>) a.class);
        this.a = enumMap;
        enumMap.put((EnumMap<a, EnumC2067o>) a.AD_STORAGE, (a) d(bool));
        enumMap.put((EnumMap<a, EnumC2067o>) a.ANALYTICS_STORAGE, (a) d(bool2));
        this.b = i;
    }
}
