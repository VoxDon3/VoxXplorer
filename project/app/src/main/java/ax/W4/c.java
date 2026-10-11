/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import java.util.Arrays;

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

    static {
        int n8;
        Object[] objectArray = "0123456789ABCDEF".toCharArray();
        a = objectArray;
        b = "0123456789abcdef".toCharArray();
        int n9 = objectArray.length;
        c = new byte[n9];
        d = new byte[n9];
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            ax.W4.c.c[n8] = (byte)a[n8];
            ax.W4.c.d[n8] = (byte)b[n8];
        }
        int[] nArray = new int[256];
        for (n8 = 0; n8 < 32; ++n8) {
            nArray[n8] = -1;
        }
        nArray[34] = 1;
        nArray[92] = 1;
        e = nArray;
        n8 = nArray.length;
        objectArray = new int[n8];
        System.arraycopy(nArray, 0, objectArray, 0, n8);
        for (n9 = 128; n9 < 256; ++n9) {
            n8 = (n9 & 0xE0) == 192 ? 2 : ((n9 & 0xF0) == 224 ? 3 : ((n9 & 0xF8) == 240 ? 4 : -1));
            objectArray[n9] = n8;
        }
        f = objectArray;
        nArray = new int[256];
        Arrays.fill(nArray, -1);
        for (n8 = 33; n8 < 256; ++n8) {
            if (!Character.isJavaIdentifierPart((char)n8)) continue;
            nArray[n8] = 0;
        }
        nArray[64] = 0;
        nArray[35] = 0;
        nArray[42] = 0;
        nArray[45] = 0;
        nArray[43] = 0;
        g = nArray;
        objectArray = new int[256];
        System.arraycopy(nArray, 0, objectArray, 0, 256);
        Arrays.fill((int[])objectArray, 128, 128, 0);
        h = objectArray;
        nArray = new int[256];
        objectArray = f;
        System.arraycopy(objectArray, 128, nArray, 128, 128);
        Arrays.fill(nArray, 0, 32, -1);
        nArray[9] = 0;
        nArray[10] = 10;
        nArray[13] = 13;
        nArray[42] = 42;
        i = nArray;
        nArray = new int[256];
        System.arraycopy(objectArray, 128, nArray, 128, 128);
        Arrays.fill(nArray, 0, 32, -1);
        nArray[32] = 1;
        nArray[9] = 1;
        nArray[10] = 10;
        nArray[13] = 13;
        nArray[47] = 47;
        nArray[35] = 35;
        j = nArray;
        objectArray = new int[128];
        for (n8 = 0; n8 < 32; ++n8) {
            objectArray[n8] = -1;
        }
        objectArray[34] = 34;
        objectArray[92] = 92;
        objectArray[8] = 98;
        objectArray[9] = 116;
        objectArray[12] = 102;
        objectArray[10] = 110;
        objectArray[13] = 114;
        k = objectArray;
        objectArray = new int[256];
        l = objectArray;
        Arrays.fill((int[])objectArray, -1);
        n9 = 0;
        while (true) {
            if (n9 >= 10) break;
            ax.W4.c.l[n9 + 48] = n9;
            ++n9;
        }
        for (n8 = n10; n8 < 6; ++n8) {
            objectArray = l;
            objectArray[n8 + 97] = n9 = n8 + 10;
            objectArray[n8 + 65] = n9;
        }
    }

    public static void a(StringBuilder stringBuilder, String string) {
        int[] nArray = k;
        int n8 = nArray.length;
        int n9 = string.length();
        for (int i8 = 0; i8 < n9; ++i8) {
            char c8 = string.charAt(i8);
            if (c8 < n8 && nArray[c8] != 0) {
                stringBuilder.append('\\');
                int n10 = nArray[c8];
                if (n10 < 0) {
                    stringBuilder.append('u');
                    stringBuilder.append('0');
                    stringBuilder.append('0');
                    char[] cArray = a;
                    stringBuilder.append(cArray[c8 >> 4]);
                    stringBuilder.append(cArray[c8 & 0xF]);
                    continue;
                }
                stringBuilder.append((char)n10);
                continue;
            }
            stringBuilder.append(c8);
        }
    }

    public static int b(int n8) {
        return l[n8 & 0xFF];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] c(boolean bl) {
        Object object;
        if (bl) {
            object = c.clone();
            return (byte[])object;
        }
        object = d.clone();
        return (byte[])object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static char[] d(boolean bl) {
        Object object;
        if (bl) {
            object = a.clone();
            return (char[])object;
        }
        object = b.clone();
        return (char[])object;
    }

    public static int[] e() {
        return k;
    }

    public static int[] f(int n8) {
        if (n8 == 34) {
            return k;
        }
        return ax.W4.c$a.b.a(n8);
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

    public static char l(int n8) {
        return a[n8];
    }

    private static class a {
        public static final a b = new a();
        private int[][] a = new int[128][];

        private a() {
        }

        public int[] a(int n8) {
            int[] nArray;
            int[] nArray2 = nArray = this.a[n8];
            if (nArray == null) {
                nArray2 = Arrays.copyOf(k, 128);
                if (nArray2[n8] == 0) {
                    nArray2[n8] = -1;
                }
                this.a[n8] = nArray2;
            }
            return nArray2;
        }
    }
}

