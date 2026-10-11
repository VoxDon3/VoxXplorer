package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C3667h3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3670i {
    private final EnumMap<C3667h3.a, EnumC3684k> a;

    C3670i() {
        this.a = new EnumMap<>(C3667h3.a.class);
    }

    public static C3670i a(String str) {
        EnumMap enumMap = new EnumMap(C3667h3.a.class);
        if (str.length() >= C3667h3.a.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                C3667h3.a[] values = C3667h3.a.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (C3667h3.a) EnumC3684k.h(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new C3670i(enumMap);
            }
        }
        return new C3670i();
    }

    public final EnumC3684k b(C3667h3.a aVar) {
        EnumC3684k enumC3684k = this.a.get(aVar);
        return enumC3684k == null ? EnumC3684k.UNSET : enumC3684k;
    }

    public final void c(C3667h3.a aVar, int i) {
        EnumC3684k enumC3684k = EnumC3684k.UNSET;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    enumC3684k = EnumC3684k.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        enumC3684k = EnumC3684k.INITIALIZATION;
                    }
                }
            }
            enumC3684k = EnumC3684k.API;
        } else {
            enumC3684k = EnumC3684k.TCF;
        }
        this.a.put((EnumMap<C3667h3.a, EnumC3684k>) aVar, (C3667h3.a) enumC3684k);
    }

    public final void d(C3667h3.a aVar, EnumC3684k enumC3684k) {
        this.a.put((EnumMap<C3667h3.a, EnumC3684k>) aVar, (C3667h3.a) enumC3684k);
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (C3667h3.a aVar : C3667h3.a.values()) {
            EnumC3684k enumC3684k = this.a.get(aVar);
            if (enumC3684k == null) {
                enumC3684k = EnumC3684k.UNSET;
            }
            c = enumC3684k.q;
            sb.append(c);
        }
        return sb.toString();
    }

    private C3670i(EnumMap<C3667h3.a, EnumC3684k> enumMap) {
        EnumMap<C3667h3.a, EnumC3684k> enumMap2 = new EnumMap<>((Class<C3667h3.a>) C3667h3.a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
