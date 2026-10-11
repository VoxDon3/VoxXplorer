/*
 * Decompiled with CFR 0.152.
 */
package ax.nc;

import ax.tc.e;

public class b {
    private static final int[] b = new int[256];
    private final int[] a = new int[3];

    static {
        for (int i8 = 0; i8 < 256; ++i8) {
            int n8 = i8;
            for (int i9 = 0; i9 < 8; ++i9) {
                if ((n8 & 1) == 1) {
                    n8 = n8 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n8 >>>= 1;
            }
            ax.nc.b.b[i8] = n8;
        }
    }

    private int a(int n8, byte by) {
        return b[(n8 ^ by) & 0xFF] ^ n8 >>> 8;
    }

    public byte b() {
        int n8 = this.a[2] | 2;
        return (byte)(n8 * (n8 ^ 1) >>> 8);
    }

    public void c(char[] objectArray, boolean bl) {
        int[] nArray = this.a;
        nArray[0] = 305419896;
        nArray[1] = 591751049;
        nArray[2] = 878082192;
        objectArray = e.a(objectArray, bl);
        int n8 = objectArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.d((byte)(objectArray[i8] & 0xFF));
        }
    }

    public void d(byte by) {
        int n8;
        int[] nArray = this.a;
        nArray[0] = this.a(nArray[0], by);
        nArray = this.a;
        nArray[1] = n8 = nArray[1] + (nArray[0] & 0xFF);
        nArray[1] = n8 = n8 * 134775813 + 1;
        nArray[2] = this.a(nArray[2], (byte)(n8 >> 24));
    }
}

