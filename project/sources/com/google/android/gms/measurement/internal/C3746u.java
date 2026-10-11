package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.f6.EnumC2067o;
import com.google.android.gms.measurement.internal.C3667h3;
import j$.util.Objects;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3746u {
    private static final C3746u f = new C3746u(null, 100);
    private final int a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final EnumMap<C3667h3.a, EnumC2067o> e;

    C3746u(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    public static C3746u b(Bundle bundle, int i) {
        if (bundle == null) {
            return new C3746u(null, i);
        }
        EnumMap enumMap = new EnumMap(C3667h3.a.class);
        for (C3667h3.a aVar : EnumC3674i3.DMA.d()) {
            enumMap.put((EnumMap) aVar, (C3667h3.a) C3667h3.e(bundle.getString(aVar.q)));
        }
        return new C3746u((EnumMap<C3667h3.a, EnumC2067o>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static C3746u c(EnumC2067o enumC2067o, int i) {
        EnumMap enumMap = new EnumMap(C3667h3.a.class);
        enumMap.put((EnumMap) C3667h3.a.AD_USER_DATA, (C3667h3.a) enumC2067o);
        return new C3746u((EnumMap<C3667h3.a, EnumC2067o>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static C3746u d(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C3667h3.a.class);
        C3667h3.a[] d = EnumC3674i3.DMA.d();
        int length = d.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) d[i2], (C3667h3.a) C3667h3.c(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new C3746u((EnumMap<C3667h3.a, EnumC2067o>) enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        EnumC2067o e;
        if (bundle == null || (e = C3667h3.e(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = C3764x.a[e.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (C3667h3.a aVar : EnumC3674i3.DMA.d()) {
            sb.append(":");
            sb.append(C3667h3.a(this.e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3746u)) {
            return false;
        }
        C3746u c3746u = (C3746u) obj;
        if (this.b.equalsIgnoreCase(c3746u.b) && Objects.equals(this.c, c3746u.c)) {
            return Objects.equals(this.d, c3746u.d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry<C3667h3.a, EnumC2067o> entry : this.e.entrySet()) {
            String r = C3667h3.r(entry.getValue());
            if (r != null) {
                bundle.putString(entry.getKey().q, r);
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final EnumC2067o g() {
        EnumC2067o enumC2067o = this.e.get(C3667h3.a.AD_USER_DATA);
        return enumC2067o == null ? EnumC2067o.UNINITIALIZED : enumC2067o;
    }

    public final Boolean h() {
        return this.c;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.d;
        return this.b.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        Iterator<EnumC2067o> it = this.e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != EnumC2067o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C3667h3.j(this.a));
        for (C3667h3.a aVar : EnumC3674i3.DMA.d()) {
            sb.append(",");
            sb.append(aVar.q);
            sb.append("=");
            EnumC2067o enumC2067o = this.e.get(aVar);
            if (enumC2067o == null) {
                sb.append("uninitialized");
            } else {
                int i = C3764x.a[enumC2067o.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.d);
        }
        return sb.toString();
    }

    C3746u(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<C3667h3.a, EnumC2067o> enumMap = new EnumMap<>((Class<C3667h3.a>) C3667h3.a.class);
        this.e = enumMap;
        enumMap.put((EnumMap<C3667h3.a, EnumC2067o>) C3667h3.a.AD_USER_DATA, (C3667h3.a) C3667h3.d(bool));
        this.a = i;
        this.b = l();
        this.c = bool2;
        this.d = str;
    }

    private C3746u(EnumMap<C3667h3.a, EnumC2067o> enumMap, int i, Boolean bool, String str) {
        EnumMap<C3667h3.a, EnumC2067o> enumMap2 = new EnumMap<>((Class<C3667h3.a>) C3667h3.a.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = l();
        this.c = bool;
        this.d = str;
    }
}
