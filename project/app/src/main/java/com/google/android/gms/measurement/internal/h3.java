/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.f6.o;
import com.google.android.gms.measurement.internal.i3;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public final class h3 {
    public static final h3 c = new h3(null, null, 100);
    private final EnumMap<a, o> a;
    private final int b;

    public h3(Boolean bl, Boolean bl2, int n8) {
        EnumMap<a, o> enumMap = new EnumMap<a, o>(a.class);
        this.a = enumMap;
        enumMap.put(com.google.android.gms.measurement.internal.h3$a.c0, h3.d(bl));
        enumMap.put(com.google.android.gms.measurement.internal.h3$a.d0, h3.d(bl2));
        this.b = n8;
    }

    private h3(EnumMap<a, o> enumMap, int n8) {
        EnumMap<a, o> enumMap2 = new EnumMap<a, o>(a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static char a(o o8) {
        if (o8 == null) return '-';
        int n8 = o8.ordinal();
        if (n8 == 1) return '+';
        if (n8 == 2) return '0';
        if (n8 != 3) return '-';
        return '1';
    }

    static o c(char c8) {
        if (c8 != '+') {
            if (c8 != '0') {
                if (c8 != '1') {
                    return o.c0;
                }
                return o.f0;
            }
            return o.e0;
        }
        return o.d0;
    }

    static o d(Boolean bl) {
        if (bl == null) {
            return o.c0;
        }
        if (bl.booleanValue()) {
            return o.f0;
        }
        return o.e0;
    }

    static o e(String string) {
        if (string == null) {
            return o.c0;
        }
        if (string.equals("granted")) {
            return o.f0;
        }
        if (string.equals("denied")) {
            return o.e0;
        }
        return o.c0;
    }

    public static h3 f(Bundle bundle, int n8) {
        if (bundle == null) {
            return new h3(null, null, n8);
        }
        EnumMap<a, o> enumMap = new EnumMap<a, o>(a.class);
        for (a a8 : i3.h(i3.c0)) {
            enumMap.put(a8, h3.e(bundle.getString(a8.q)));
        }
        return new h3(enumMap, n8);
    }

    public static h3 g(o o8, o o9, int n8) {
        EnumMap<a, o> enumMap = new EnumMap<a, o>(a.class);
        enumMap.put(com.google.android.gms.measurement.internal.h3$a.c0, o8);
        enumMap.put(com.google.android.gms.measurement.internal.h3$a.d0, o9);
        return new h3(enumMap, -10);
    }

    public static h3 i(String object, int n8) {
        EnumMap<a, o> enumMap = new EnumMap<a, o>(a.class);
        String string = object;
        if (object == null) {
            string = "";
        }
        a[] aArray = i3.c0.d();
        for (int i8 = 0; i8 < aArray.length; ++i8) {
            object = aArray[i8];
            int n9 = i8 + 2;
            if (n9 < string.length()) {
                enumMap.put((a)((Object)object), h3.c(string.charAt(n9)));
                continue;
            }
            enumMap.put((a)((Object)object), o.c0);
        }
        return new h3(enumMap, n8);
    }

    static String j(int n8) {
        if (n8 != -30) {
            if (n8 != -20) {
                if (n8 != -10) {
                    if (n8 != 0) {
                        if (n8 != 30) {
                            if (n8 != 90) {
                                if (n8 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static String k(Bundle bundle) {
        a[] aArray = i3.h(i3.c0);
        int n8 = aArray.length;
        int n9 = 0;
        while (true) {
            Boolean bl = null;
            if (n9 >= n8) break;
            Object object = aArray[n9];
            if (bundle.containsKey(((a)((Object)object)).q) && (object = bundle.getString(((a)((Object)object)).q)) != null) {
                if (((String)object).equals("granted")) {
                    bl = Boolean.TRUE;
                } else if (((String)object).equals("denied")) {
                    bl = Boolean.FALSE;
                }
                if (bl == null) {
                    return object;
                }
            }
            ++n9;
        }
        return null;
    }

    public static boolean l(int n8, int n9) {
        return n8 == -20 && n9 == -30 || n8 == -30 && n9 == -20 || n8 == n9 || n8 < n9;
    }

    public static h3 q(String string) {
        return h3.i(string, 100);
    }

    static String r(o o8) {
        int n8 = o8.ordinal();
        if (n8 != 2) {
            if (n8 != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    public final boolean A() {
        return this.m(com.google.android.gms.measurement.internal.h3$a.c0);
    }

    public final boolean B() {
        return this.m(com.google.android.gms.measurement.internal.h3$a.d0);
    }

    public final boolean C() {
        Iterator<o> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == o.c0) continue;
            return true;
        }
        return false;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof h3)) {
            return false;
        }
        object = (h3)object;
        for (a a8 : i3.h(i3.c0)) {
            if (this.a.get((Object)a8) == ((h3)object).a.get((Object)a8)) continue;
            return false;
        }
        return this.b == ((h3)object).b;
    }

    /*
     * Unable to fully structure code
     */
    public final h3 h(h3 var1_1) {
        var8_2 = new EnumMap<a, o>(a.class);
        for (a var9_9 : i3.h(i3.c0)) {
            block6: {
                var4_6 = this.a.get((Object)var9_9);
                var5_7 = var1_1.a.get((Object)var9_9);
                if (var4_6 == null) ** GOTO lbl-1000
                if (var5_7 == null) break block6;
                var6_8 = o.c0;
                if (var4_6 != var6_8) {
                    if (var5_7 != var6_8) {
                        var6_8 = o.d0;
                        ** if (var4_6 != var6_8) goto lbl-1000
                    } else {
                        ** GOTO lbl13
                    }
                }
                ** GOTO lbl-1000
lbl13:
                // 2 sources

                break block6;
lbl-1000:
                // 3 sources

                {
                    var4_6 = var5_7;
                    ** GOTO lbl19
                }
lbl-1000:
                // 1 sources

                {
                    if (var5_7 != var6_8) {
                        var6_8 = o.e0;
                        var4_6 = var4_6 != var6_8 && var5_7 != var6_8 ? o.f0 : var6_8;
                    }
                }
            }
            if (var4_6 == null) continue;
            var8_2.put(var9_9, var4_6);
        }
        return new h3(var8_2, 100);
    }

    public final int hashCode() {
        int n8 = this.b * 17;
        Iterator<o> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            n8 = n8 * 31 + ((Object)((Object)iterator.next())).hashCode();
        }
        return n8;
    }

    public final boolean m(a a8) {
        return this.a.get((Object)a8) != o.e0;
    }

    public final boolean n(h3 h32, a ... aArray) {
        for (a a8 : aArray) {
            if (h32.m(a8) || !this.m(a8)) continue;
            return true;
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, o> entry : this.a.entrySet()) {
            String string = h3.r(entry.getValue());
            if (string == null) continue;
            bundle.putString(entry.getKey().q, string);
        }
        return bundle;
    }

    public final h3 p(h3 h32) {
        EnumMap<a, o> enumMap = new EnumMap<a, o>(a.class);
        for (a a8 : i3.h(i3.c0)) {
            o o8;
            o o9 = o8 = this.a.get((Object)a8);
            if (o8 == o.c0) {
                o9 = h32.a.get((Object)a8);
            }
            if (o9 == null) continue;
            enumMap.put(a8, o9);
        }
        return new h3(enumMap, this.b);
    }

    public final boolean s(h3 h32, a ... aArray) {
        for (a a8 : aArray) {
            o o8 = this.a.get((Object)a8);
            o o9 = h32.a.get((Object)a8);
            o enum_ = o.e0;
            if (o8 != enum_ || o9 == enum_) continue;
            return true;
        }
        return false;
    }

    public final o t() {
        o o8;
        o o9 = o8 = this.a.get((Object)com.google.android.gms.measurement.internal.h3$a.c0);
        if (o8 == null) {
            o9 = o.c0;
        }
        return o9;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source=");
        stringBuilder.append(h3.j(this.b));
        for (a a8 : i3.h(i3.c0)) {
            void enum_;
            o o8;
            stringBuilder.append(",");
            stringBuilder.append(a8.q);
            stringBuilder.append("=");
            o o9 = o8 = this.a.get((Object)a8);
            if (o8 == null) {
                o o10 = o.c0;
            }
            stringBuilder.append(enum_);
        }
        return stringBuilder.toString();
    }

    public final boolean u(h3 h32) {
        return this.s(h32, this.a.keySet().toArray(new a[0]));
    }

    public final o v() {
        o o8;
        o o9 = o8 = this.a.get((Object)com.google.android.gms.measurement.internal.h3$a.d0);
        if (o8 == null) {
            o9 = o.c0;
        }
        return o9;
    }

    public final Boolean w() {
        block0: {
            block1: {
                block2: {
                    o o8 = this.a.get((Object)com.google.android.gms.measurement.internal.h3$a.c0);
                    if (o8 == null) break block0;
                    int n8 = o8.ordinal();
                    if (n8 == 1) break block1;
                    if (n8 == 2) break block2;
                    if (n8 == 3) break block1;
                    break block0;
                }
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean x() {
        block0: {
            block1: {
                block2: {
                    o o8 = this.a.get((Object)com.google.android.gms.measurement.internal.h3$a.d0);
                    if (o8 == null) break block0;
                    int n8 = o8.ordinal();
                    if (n8 == 1) break block1;
                    if (n8 == 2) break block2;
                    if (n8 == 3) break block1;
                    break block0;
                }
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final String y() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        for (a a8 : i3.c0.d()) {
            int n8;
            block1: {
                block2: {
                    block3: {
                        int n9;
                        o enum_ = this.a.get((Object)a8);
                        n8 = n9 = 45;
                        if (enum_ == null) break block1;
                        int n10 = enum_.ordinal();
                        n8 = n9;
                        if (n10 == 0) break block1;
                        if (n10 == 1) break block2;
                        if (n10 == 2) break block3;
                        if (n10 == 3) break block2;
                        n8 = n9;
                        break block1;
                    }
                    n8 = 48;
                    break block1;
                }
                n8 = 49;
            }
            stringBuilder.append((char)n8);
        }
        return stringBuilder.toString();
    }

    public final String z() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        for (a a8 : i3.c0.d()) {
            stringBuilder.append(h3.a(this.a.get((Object)a8)));
        }
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public final String q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            c0 = a11 = new a("ad_storage");
            d0 = a10 = new a("analytics_storage");
            e0 = a9 = new a("ad_user_data");
            f0 = a8 = new a("ad_personalization");
            g0 = new a[]{a11, a10, a9, a8};
        }

        private a(String string2) {
            this.q = string2;
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }
}

