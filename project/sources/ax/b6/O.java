package ax.b6;

/* loaded from: classes3.dex */
final /* synthetic */ class O {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Z.values().length];
        a = iArr;
        try {
            iArr[Z.FOR_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Z.FOR_IN_CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Z.FOR_IN_LET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Z.FOR_LET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Z.FOR_OF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Z.FOR_OF_CONST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Z.FOR_OF_LET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[Z.WHILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
