/*
 * Decompiled with CFR 0.152.
 */
package ax.j1;

import ax.j1.e;
import java.util.NoSuchElementException;

public abstract class a
implements e {
    private final long b;
    private final long c;
    private long d;

    public a(long l8, long l9) {
        this.b = l8;
        this.c = l9;
        this.f();
    }

    protected final void c() {
        long l8 = this.d;
        if (l8 >= this.b && l8 <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }

    protected final long d() {
        return this.d;
    }

    public boolean e() {
        return this.d > this.c;
    }

    public void f() {
        this.d = this.b - 1L;
    }

    @Override
    public boolean next() {
        ++this.d;
        return this.e() ^ true;
    }
}

