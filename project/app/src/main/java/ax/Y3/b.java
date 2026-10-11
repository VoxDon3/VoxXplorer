/*
 * Decompiled with CFR 0.152.
 */
package ax.Y3;

import ax.P3.s;
import ax.k4.h;

public class b
implements s<byte[]> {
    private final byte[] q;

    public b(byte[] byArray) {
        this.q = h.d(byArray);
    }

    public byte[] a() {
        return this.q;
    }

    @Override
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override
    public int getSize() {
        return this.q.length;
    }

    @Override
    public void recycle() {
    }
}

