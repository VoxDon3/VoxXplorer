/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.k;
import java.util.EnumMap;

final class i {
    private final EnumMap<h3.a, k> a;

    i() {
        this.a = new EnumMap(h3.a.class);
    }

    private i(EnumMap<h3.a, k> enumMap) {
        EnumMap<h3.a, k> enumMap2 = new EnumMap<h3.a, k>(h3.a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static i a(String string) {
        EnumMap<h3.a, k> enumMap = new EnumMap<h3.a, k>(h3.a.class);
        if (string.length() >= h3.a.values().length) {
            int n8 = 0;
            if (string.charAt(0) == '1') {
                h3.a[] aArray = h3.a.values();
                int n9 = aArray.length;
                int n10 = 1;
                while (n8 < n9) {
                    enumMap.put(aArray[n8], k.h(string.charAt(n10)));
                    ++n8;
                    ++n10;
                }
                return new i(enumMap);
            }
        }
        return new i();
    }

    public final k b(h3.a enum_) {
        k k8 = this.a.get(enum_);
        enum_ = k8;
        if (k8 == null) {
            enum_ = k.c0;
        }
        return enum_;
    }

    public final void c(h3.a a8, int n8) {
        k k8;
        block4: {
            block1: {
                block2: {
                    block3: {
                        k8 = k.c0;
                        if (n8 == -30) break block1;
                        if (n8 == -20) break block2;
                        if (n8 == -10) break block3;
                        if (n8 == 0) break block2;
                        if (n8 == 30) {
                            k8 = k.g0;
                        }
                        break block4;
                    }
                    k8 = k.f0;
                    break block4;
                }
                k8 = k.h0;
                break block4;
            }
            k8 = k.j0;
        }
        this.a.put(a8, k8);
    }

    public final void d(h3.a a8, k k8) {
        this.a.put(a8, k8);
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("1");
        for (h3.a a8 : h3.a.values()) {
            void enum_;
            k k8;
            k k9 = k8 = this.a.get((Object)a8);
            if (k8 == null) {
                k k10 = k.c0;
            }
            stringBuilder.append(k.d((k)enum_));
        }
        return stringBuilder.toString();
    }
}

