package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC3787a;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC3787a.values().length];
        a = iArr;
        try {
            iArr[EnumC3787a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC3787a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC3787a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
