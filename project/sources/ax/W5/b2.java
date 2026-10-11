package ax.W5;

/* loaded from: classes3.dex */
final class b2 {
    private static final Z1 a;
    public static final /* synthetic */ int b = 0;

    static {
        if (X1.u() && X1.v()) {
            int i = C1028f0.a;
        }
        a = new a2();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b2 = bArr[i - 1];
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            byte b3 = bArr[i];
            if (b2 > -12 || b3 > -65) {
                return -1;
            }
            return (b3 << 8) ^ b2;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b4 = bArr[i];
        byte b5 = bArr[i + 1];
        if (b2 > -12 || b4 > -65 || b5 > -65) {
            return -1;
        }
        return (b5 << 16) ^ ((b4 << 8) ^ b2);
    }

    static boolean b(byte[] bArr) {
        return a.b(bArr, 0, bArr.length);
    }

    static boolean c(byte[] bArr, int i, int i2) {
        return a.b(bArr, i, i2);
    }
}
