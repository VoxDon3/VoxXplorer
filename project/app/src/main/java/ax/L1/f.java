/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.P0.E;
import ax.S0.G;
import ax.S0.a;
import ax.q1.s;
import ax.q1.u;
import java.io.IOException;

final class f {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final G k = new G(255);

    f() {
    }

    public boolean a(s s8, boolean bl) throws IOException {
        this.b();
        this.k.X(27);
        byte[] byArray = this.k.f();
        if (u.c(s8, byArray, 0, 27, bl) && this.k.O() == 1332176723L) {
            int n8;
            this.a = n8 = this.k.M();
            if (n8 != 0) {
                if (bl) {
                    return false;
                }
                throw E.d("unsupported bit stream revision");
            }
            this.b = this.k.M();
            this.c = this.k.A();
            this.d = this.k.C();
            this.e = this.k.C();
            this.f = this.k.C();
            this.g = n8 = this.k.M();
            this.h = n8 + 27;
            this.k.X(n8);
            if (!u.c(s8, this.k.f(), 0, this.g, bl)) {
                return false;
            }
            for (int i8 = 0; i8 < this.g; ++i8) {
                this.j[i8] = this.k.M();
                this.i += this.j[i8];
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(s s8) throws IOException {
        return this.d(s8, -1L);
    }

    public boolean d(s s8, long l8) throws IOException {
        long l9;
        long l10;
        boolean bl = s8.getPosition() == s8.i();
        ax.S0.a.a(bl);
        this.k.X(4);
        while (((l10 = (l9 = l8 - -1L) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false || s8.getPosition() + 4L < l8) && u.c(s8, this.k.f(), 0, 4, true)) {
            this.k.b0(0);
            if (this.k.O() == 1332176723L) {
                s8.m();
                return true;
            }
            s8.n(1);
        }
        while ((l10 == false || s8.getPosition() < l8) && s8.a(1) != -1) {
        }
        return false;
    }
}

