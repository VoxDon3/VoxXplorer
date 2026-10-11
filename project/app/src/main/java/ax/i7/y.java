/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.b;
import ax.m7.v;
import java.io.InputStream;

public final class y
extends b {
    private long c = -1L;
    private boolean d;
    private final InputStream e;

    public y(String string, InputStream inputStream) {
        super(string);
        this.e = v.d(inputStream);
    }

    @Override
    public boolean c() {
        return this.d;
    }

    @Override
    public InputStream e() {
        return this.e;
    }

    @Override
    public long getLength() {
        return this.c;
    }

    public y h(boolean bl) {
        return (y)super.f(bl);
    }

    public y i(long l8) {
        this.c = l8;
        return this;
    }

    public y j(boolean bl) {
        this.d = bl;
        return this;
    }

    public y k(String string) {
        return (y)super.g(string);
    }
}

