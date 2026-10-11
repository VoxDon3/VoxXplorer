package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC3684k {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char q;

    EnumC3684k(char c) {
        this.q = c;
    }

    public static EnumC3684k h(char c) {
        for (EnumC3684k enumC3684k : values()) {
            if (enumC3684k.q == c) {
                return enumC3684k;
            }
        }
        return UNSET;
    }
}
