/*
 * Decompiled with CFR 0.152.
 */
package ax.fe;

import ax.be.P;
import ax.de.c;

abstract class a {
    private final P a;
    long b = 0L;
    long c = 0L;
    long d = 0L;
    long e = 0L;

    a(P p8) {
        this.a = p8;
    }

    private long e() {
        return (long)(ax.de.c.a(this.e) + 1) + this.d + 4L;
    }

    void a(long l8, long l9) throws P {
        this.b += 3L + l8 & 0xFFFFFFFFFFFFFFFCL;
        this.c += l9;
        this.d += (long)(ax.de.c.a(l8) + ax.de.c.a(l9));
        ++this.e;
        if (this.b >= 0L && this.c >= 0L && this.c() <= 0x400000000L && this.d() >= 0L) {
            return;
        }
        throw this.a;
    }

    int b() {
        return (int)(4L - this.e() & 3L);
    }

    public long c() {
        return this.e() + 3L & 0xFFFFFFFFFFFFFFFCL;
    }

    public long d() {
        return this.b + 12L + this.c() + 12L;
    }
}

