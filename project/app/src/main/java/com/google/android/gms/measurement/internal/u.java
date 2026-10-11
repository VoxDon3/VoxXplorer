/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.f6.o;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.i3;
import com.google.android.gms.measurement.internal.x;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public final class u {
    private static final u f = new u(null, 100);
    private final int a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final EnumMap<h3.a, o> e;

    u(Boolean bl, int n8) {
        this(bl, n8, null, null);
    }

    u(Boolean bl, int n8, Boolean bl2, String string) {
        EnumMap<h3.a, o> enumMap = new EnumMap<h3.a, o>(h3.a.class);
        this.e = enumMap;
        enumMap.put(h3.a.e0, h3.d(bl));
        this.a = n8;
        this.b = this.l();
        this.c = bl2;
        this.d = string;
    }

    private u(EnumMap<h3.a, o> enumMap, int n8, Boolean bl, String string) {
        EnumMap<h3.a, o> enumMap2 = new EnumMap<h3.a, o>(h3.a.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = n8;
        this.b = this.l();
        this.c = bl;
        this.d = string;
    }

    public static u b(Bundle bundle, int n8) {
        Boolean bl = null;
        if (bundle == null) {
            return new u(null, n8);
        }
        EnumMap<h3.a, o> enumMap = new EnumMap<h3.a, o>(h3.a.class);
        for (h3.a a8 : i3.d0.d()) {
            enumMap.put(a8, h3.e(bundle.getString(a8.q)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bl = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new u(enumMap, n8, bl, bundle.getString("cps_display_str"));
    }

    static u c(o o8, int n8) {
        EnumMap<h3.a, o> enumMap = new EnumMap<h3.a, o>(h3.a.class);
        enumMap.put(h3.a.e0, o8);
        return new u(enumMap, -10, null, null);
    }

    public static u d(String stringArray) {
        if (stringArray != null && stringArray.length() > 0) {
            stringArray = stringArray.split(":");
            int n8 = Integer.parseInt(stringArray[0]);
            EnumMap<h3.a, o> enumMap = new EnumMap<h3.a, o>(h3.a.class);
            h3.a[] aArray = i3.d0.d();
            int n9 = aArray.length;
            int n10 = 1;
            int n11 = 0;
            while (n11 < n9) {
                enumMap.put(aArray[n11], h3.c(stringArray[n10].charAt(0)));
                ++n11;
                ++n10;
            }
            return new u(enumMap, n8, null, null);
        }
        return f;
    }

    public static Boolean e(Bundle object) {
        if (object == null) {
            return null;
        }
        if ((object = h3.e(object.getString("ad_personalization"))) == null) {
            return null;
        }
        int n8 = x.a[((Enum)object).ordinal()];
        if (n8 != 3) {
            if (n8 != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private final String l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        for (h3.a a8 : i3.d0.d()) {
            stringBuilder.append(":");
            stringBuilder.append(h3.a(this.e.get((Object)a8)));
        }
        return stringBuilder.toString();
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        if (!this.b.equalsIgnoreCase(((u)object).b)) {
            return false;
        }
        if (!j.Objects.equals((Object)this.c, (Object)((u)object).c)) {
            return false;
        }
        return j.Objects.equals((Object)this.d, (Object)((u)object).d);
    }

    public final Bundle f() {
        Object object;
        Bundle bundle = new Bundle();
        for (Map.Entry<h3.a, o> entry : this.e.entrySet()) {
            object = h3.r(entry.getValue());
            if (object == null) continue;
            bundle.putString(entry.getKey().q, (String)object);
        }
        object = this.c;
        if (object != null) {
            bundle.putString("is_dma_region", ((Boolean)object).toString());
        }
        if ((object = this.d) != null) {
            bundle.putString("cps_display_str", (String)object);
        }
        return bundle;
    }

    public final o g() {
        o o8;
        o o9 = o8 = this.e.get((Object)h3.a.e0);
        if (o8 == null) {
            o9 = o.c0;
        }
        return o9;
    }

    public final Boolean h() {
        return this.c;
    }

    public final int hashCode() {
        Object object = this.c;
        int n8 = object == null ? 3 : (object == Boolean.TRUE ? 7 : 13);
        object = this.d;
        int n9 = object == null ? 17 : ((String)object).hashCode();
        return this.b.hashCode() + n8 * 29 + n9 * 137;
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        Iterator<o> iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == o.c0) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source=");
        stringBuilder.append(h3.j(this.a));
        for (h3.a a8 : i3.d0.d()) {
            stringBuilder.append(",");
            stringBuilder.append(a8.q);
            stringBuilder.append("=");
            o enum_ = this.e.get((Object)a8);
            if (enum_ == null) {
                stringBuilder.append("uninitialized");
                continue;
            }
            int n8 = x.a[enum_.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) continue;
                        stringBuilder.append("granted");
                        continue;
                    }
                    stringBuilder.append("denied");
                    continue;
                }
                stringBuilder.append("eu_consent_policy");
                continue;
            }
            stringBuilder.append("uninitialized");
        }
        if (this.c != null) {
            stringBuilder.append(",isDmaRegion=");
            stringBuilder.append(this.c);
        }
        if (this.d != null) {
            stringBuilder.append(",cpsDisplayStr=");
            stringBuilder.append(this.d);
        }
        return stringBuilder.toString();
    }
}

