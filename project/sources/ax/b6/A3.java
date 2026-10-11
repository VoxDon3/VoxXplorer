package ax.b6;

import ax.b6.C1653r2;

/* loaded from: classes3.dex */
final /* synthetic */ class A3 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[C1653r2.a.values().length];
        a = iArr;
        try {
            iArr[C1653r2.a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[C1653r2.a.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[C1653r2.a.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[C1653r2.a.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[C1653r2.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
