/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Random;

class Packet {
    private static Random c;
    Buffer a;
    byte[] b = new byte[4];

    Packet(Buffer buffer) {
        this.a = buffer;
    }

    static void d(Random random) {
        c = random;
    }

    Buffer a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b(int n8, boolean bl) {
        int n9;
        int n10;
        Buffer buffer = this.a;
        int n11 = n10 = buffer.c;
        if (!bl) {
            n11 = n10 - 4;
        }
        n10 = n9 = -n11 & n8 - 1;
        if (n9 < n8) {
            n10 = n9 + n8;
        }
        n8 = n11 += n10;
        if (bl) {
            n8 = n11 - 4;
        }
        Object object = this.b;
        object[0] = (byte)(n8 >>> 24);
        object[1] = (byte)(n8 >>> 16);
        object[2] = (byte)(n8 >>> 8);
        object[3] = (byte)n8;
        System.arraycopy(object, 0, buffer.b, 0, 4);
        this.a.b[4] = (byte)n10;
        object = c;
        synchronized (object) {
            Random random = c;
            buffer = this.a;
            random.a(buffer.b, buffer.c, n10);
        }
        this.a.E(n10);
    }

    void c() {
        this.a.c = 5;
    }

    int e(int n8, int n9, int n10) {
        int n11;
        int n12 = n8 + 14;
        int n13 = n11 = -n12 & n9 - 1;
        if (n11 < n9) {
            n13 = n11 + n9;
        }
        n9 = n13 + n12 + n10 + 32;
        Object object = this.a;
        Object object2 = ((Buffer)object).b;
        n13 = ((byte[])object2).length;
        n10 = ((Buffer)object).c;
        if (n13 < n9 + n10 - 14 - n8) {
            object = new byte[n10 + n9 - 14 - n8];
            System.arraycopy(object2, 0, object, 0, ((byte[])object2).length);
            this.a.b = (byte[])object;
        }
        object = this.a;
        object2 = ((Buffer)object).b;
        System.arraycopy(object2, n12, object2, n9, ((Buffer)object).c - 14 - n8);
        object2 = this.a;
        object2.c = 10;
        object2.v(n8);
        this.a.c = n12;
        return n9;
    }

    void f(byte by, int n8, int n9, int n10) {
        Object object = this.a.b;
        System.arraycopy(object, n9, object, 14, n10);
        object = this.a;
        ((Buffer)object).b[5] = by;
        ((Buffer)object).c = 6;
        ((Buffer)object).v(n8);
        this.a.v(n10);
        this.a.c = n10 + 14;
    }
}

