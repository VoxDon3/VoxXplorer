/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.g;
import ax.xc.x;

public final class u
implements C,
AutoCloseable {
    private final e c0;
    private x d0;
    private int e0;
    private boolean f0;
    private long g0;
    private final g q;

    public u(g object) {
        l.f(object, "upstream");
        this.q = object;
        object = object.k();
        this.c0 = object;
        this.d0 = object = ((e)object).q;
        int n8 = object != null ? ((x)object).b : -1;
        this.e0 = n8;
    }

    @Override
    public void close() {
        this.f0 = true;
    }

    @Override
    public long read(e object, long l8) {
        block6: {
            block7: {
                x x8;
                long l9;
                block8: {
                    block9: {
                        l.f(object, "sink");
                        long l10 = l8 - 0L;
                        l9 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                        if (l9 < 0) break block6;
                        if (this.f0) break block7;
                        x8 = this.d0;
                        if (x8 == null) break block8;
                        x x9 = this.c0.q;
                        if (x8 != x9) break block9;
                        int n8 = this.e0;
                        l.c(x9);
                        if (n8 == x9.b) break block8;
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (l9 == false) {
                    return 0L;
                }
                if (!this.q.r0(this.g0 + 1L)) {
                    return -1L;
                }
                if (this.d0 == null && (x8 = this.c0.q) != null) {
                    this.d0 = x8;
                    l.c(x8);
                    this.e0 = x8.b;
                }
                l8 = Math.min(l8, this.c0.size() - this.g0);
                this.c0.j((e)object, this.g0, l8);
                this.g0 += l8;
                return l8;
            }
            throw new IllegalStateException("closed");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public D timeout() {
        return this.q.timeout();
    }
}

