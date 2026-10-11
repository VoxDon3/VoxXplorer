/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.D1;
import ax.b6.F1;

final class I5 {
    static final int[] a;
    static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[D1.a.values().length];
        b = nArray;
        try {
            nArray[D1.a.d0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.b[D1.a.e0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.b[D1.a.f0.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.b[D1.a.g0.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[F1.a.values().length];
        a = nArray;
        try {
            nArray[F1.a.d0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.a[F1.a.e0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.a[F1.a.f0.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.a[F1.a.g0.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.a[F1.a.h0.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            I5.a[F1.a.i0.ordinal()] = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

