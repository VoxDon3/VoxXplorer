package ax.W4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    protected static final char[] a;
    protected static final char[] b;
    protected static final byte[] c;
    protected static final byte[] d;
    protected static final int[] e;
    protected static final int[] f;
    protected static final int[] g;
    protected static final int[] h;
    protected static final int[] i;
    protected static final int[] j;
    protected static final int[] k;
    protected static final int[] l;

    private static class a {
        public static final a b = new a();
        private int[][] a = new int[128][];

        private a() {
        }

        public int[] a(int i) {
            int[] iArr = this.a[i];
            if (iArr == null) {
                iArr = Arrays.copyOf(c.k, 128);
                if (iArr[i] == 0) {
                    iArr[i] = -1;
                }
                this.a[i] = iArr;
            }
            return iArr;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        a = charArray;
        b = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        c = new byte[length];
        d = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            c[i2] = (byte) a[i2];
            d[i2] = (byte) b[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        f = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        g = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        h = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        i = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        j = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        k = iArr8;
        int[] iArr9 = new int[256];
        l = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            l[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = l;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static void a(StringBuilder sb, String str) {
        int[] iArr = k;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i3 = iArr[charAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = a;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static int b(int i2) {
        return l[i2 & 255];
    }

    public static byte[] c(boolean z) {
        return (byte[]) (z ? c.clone() : d.clone());
    }

    public static char[] d(boolean z) {
        return (char[]) (z ? a.clone() : b.clone());
    }

    public static int[] e() {
        return k;
    }

    public static int[] f(int i2) {
        return i2 == 34 ? k : a.b.a(i2);
    }

    public static int[] g() {
        return i;
    }

    public static int[] h() {
        return e;
    }

    public static int[] i() {
        return g;
    }

    public static int[] j() {
        return f;
    }

    public static int[] k() {
        return h;
    }

    public static char l(int i2) {
        return a[i2];
    }
}
