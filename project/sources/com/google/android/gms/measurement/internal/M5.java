package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import ax.b6.F1;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
abstract class M5 {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    M5(String str, int i) {
        this.a = str;
        this.b = i;
    }

    static Boolean b(double d, ax.b6.D1 d1) {
        try {
            return h(new BigDecimal(d), d1, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, ax.b6.D1 d1) {
        try {
            return h(new BigDecimal(j), d1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, ax.b6.D1 d1) {
        if (!x5.h0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), d1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, F1.a aVar, boolean z, String str2, List<String> list, String str3, V1 v1) {
        if (str == null) {
            return null;
        }
        if (aVar == F1.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != F1.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (I5.a[aVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (v1 != null) {
                            v1.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean g(String str, ax.b6.F1 f1, V1 v1) {
        List<String> list;
        C0821p.l(f1);
        if (str == null || !f1.Q() || f1.I() == F1.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        F1.a I = f1.I();
        F1.a aVar = F1.a.IN_LIST;
        if (I == aVar) {
            if (f1.n() == 0) {
                return null;
            }
        } else if (!f1.P()) {
            return null;
        }
        F1.a I2 = f1.I();
        boolean N = f1.N();
        String L = (N || I2 == F1.a.REGEXP || I2 == aVar) ? f1.L() : f1.L().toUpperCase(Locale.ENGLISH);
        if (f1.n() == 0) {
            list = null;
        } else {
            List<String> M = f1.M();
            if (!N) {
                ArrayList arrayList = new ArrayList(M.size());
                Iterator<String> it = M.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                M = DesugarCollections.unmodifiableList(arrayList);
            }
            list = M;
        }
        return f(str, I2, N, L, list, I2 == F1.a.REGEXP ? L : null, v1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean h(java.math.BigDecimal r8, ax.b6.D1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M5.h(java.math.BigDecimal, ax.b6.D1, double):java.lang.Boolean");
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
