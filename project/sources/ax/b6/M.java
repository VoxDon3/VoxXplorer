package ax.b6;

/* loaded from: classes3.dex */
final /* synthetic */ class M {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Z.values().length];
        a = iArr;
        try {
            iArr[Z.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Z.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Z.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
