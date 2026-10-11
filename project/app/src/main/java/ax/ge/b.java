/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

class b {
    static final int[] a = new int[256];

    static {
        for (int i8 = 0; i8 < 256; ++i8) {
            int n8 = i8;
            for (int i9 = 0; i9 < 8; ++i9) {
                int n9;
                int n10 = n9 = n8 >>> 1;
                if ((n8 & 1) != 0) {
                    n10 = n9 ^ 0xEDB88320;
                }
                n8 = n10;
            }
            b.a[i8] = n8;
        }
    }

    b() {
    }
}

