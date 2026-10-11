/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Checksum;

final class CRC32
implements Checksum {
    private static int[] b = new int[256];
    private int a = 0;

    static {
        for (int i8 = 0; i8 < 256; ++i8) {
            int n8 = 8;
            int n9 = i8;
            while (--n8 >= 0) {
                if ((n9 & 1) != 0) {
                    n9 = n9 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n9 >>>= 1;
            }
            CRC32.b[i8] = n9;
        }
    }

    CRC32() {
    }

    @Override
    public void a() {
        this.a = 0;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        int n10 = ~this.a;
        while (--n9 >= 0) {
            n10 = n10 >>> 8 ^ b[(byArray[n8] ^ n10) & 0xFF];
            ++n8;
        }
        this.a = ~n10;
    }

    @Override
    public void c(long l8) {
        this.a = (int)(l8 & 0xFFFFFFFFL);
    }

    @Override
    public long getValue() {
        return (long)this.a & 0xFFFFFFFFL;
    }
}

