/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Checksum;

final class Adler32
implements Checksum {
    private long a = 1L;
    private long b = 0L;

    Adler32() {
    }

    @Override
    public void a() {
        this.a = 1L;
        this.b = 0L;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        long l8;
        int n10;
        if (n9 == 1) {
            long l9 = this.a + (long)(byArray[n8] & 0xFF);
            long l10 = this.b;
            this.a = l9 % 65521L;
            this.b = (l10 + l9) % 65521L;
            return;
        }
        int n11 = n9 / 5552;
        int n12 = n9 % 5552;
        n9 = n11;
        while (true) {
            n10 = n8;
            if (n9 <= 0) break;
            for (n11 = 5552; n11 > 0; --n11) {
                this.a = l8 = this.a + (long)(byArray[n8] & 0xFF);
                this.b += l8;
                ++n8;
            }
            this.a %= 65521L;
            this.b %= 65521L;
            --n9;
        }
        for (n11 = n12; n11 > 0; --n11) {
            this.a = l8 = this.a + (long)(byArray[n10] & 0xFF);
            this.b += l8;
            ++n10;
        }
        this.a %= 65521L;
        this.b %= 65521L;
    }

    @Override
    public void c(long l8) {
        this.a = l8 & 0xFFFFL;
        this.b = l8 >> 16 & 0xFFFFL;
    }

    @Override
    public long getValue() {
        return this.b << 16 | this.a;
    }
}

