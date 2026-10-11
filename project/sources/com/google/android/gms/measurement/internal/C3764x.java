package com.google.android.gms.measurement.internal;

import ax.f6.EnumC2067o;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C3764x {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC2067o.values().length];
        a = iArr;
        try {
            iArr[EnumC2067o.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC2067o.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC2067o.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC2067o.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
