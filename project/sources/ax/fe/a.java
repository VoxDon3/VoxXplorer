package ax.fe;

import ax.be.P;
import ax.de.c;

/* loaded from: classes3.dex */
abstract class a {
    private final P a;
    long b = 0;
    long c = 0;
    long d = 0;
    long e = 0;

    a(P p) {
        this.a = p;
    }

    private long e() {
        return c.a(this.e) + 1 + this.d + 4;
    }

    void a(long j, long j2) throws P {
        this.b += (3 + j) & (-4);
        this.c += j2;
        this.d += c.a(j) + c.a(j2);
        this.e++;
        if (this.b < 0 || this.c < 0 || c() > 17179869184L || d() < 0) {
            throw this.a;
        }
    }

    int b() {
        return (int) ((4 - e()) & 3);
    }

    public long c() {
        return (e() + 3) & (-4);
    }

    public long d() {
        return this.b + 12 + c() + 12;
    }
}
