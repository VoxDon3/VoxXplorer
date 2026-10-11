package ax.W4;

/* loaded from: classes.dex */
public final class g {
    private static final char[] a = c.d(true);
    private static final byte[] b = c.c(true);
    private static final g c = new g();

    private static int a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    private static void b(int i) {
        throw new IllegalArgumentException(n.c(i));
    }

    static int c(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }

    public static g e() {
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] d(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W4.g.d(java.lang.String):byte[]");
    }
}
