/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.D7;
import ax.b6.I1;

final class x2 {
    static final int[] a;
    static final int[] b;
    static final int[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[I1.d.values().length];
        c = nArray;
        try {
            nArray[I1.d.e0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.c[I1.d.d0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[I1.e.values().length];
        b = nArray;
        try {
            nArray[I1.e.d0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.b[I1.e.e0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.b[I1.e.f0.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.b[I1.e.g0.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[D7.values().length];
        a = nArray;
        try {
            nArray[D7.q.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.a[D7.c0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.a[D7.f0.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            x2.a[D7.e0.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

