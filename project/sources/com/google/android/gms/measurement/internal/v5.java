package com.google.android.gms.measurement.internal;

import ax.f6.EnumC2067o;

/* loaded from: classes3.dex */
final /* synthetic */ class v5 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC2067o.values().length];
        a = iArr;
        try {
            iArr[EnumC2067o.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC2067o.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC2067o.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC2067o.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
