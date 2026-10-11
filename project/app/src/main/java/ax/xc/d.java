/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.D;
import ax.xc.e;

final class d
implements A,
AutoCloseable {
    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public D timeout() {
        return D.NONE;
    }

    @Override
    public void write(e e8, long l8) {
        l.f(e8, "source");
        e8.skip(l8);
    }
}

