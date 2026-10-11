/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.a;
import ax.q1.U;
import ax.q1.b;
import ax.q1.s;
import java.io.IOException;

public final class V {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public void a(U u8, U.a a8) {
        if (this.c > 0) {
            u8.f(this.d, this.e, this.f, this.g, a8);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(U u8, long l8, int n8, int n9, int n10, U.a a8) {
        boolean bl = this.g <= n9 + n10;
        ax.S0.a.h(bl, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int n11;
            int n12 = this.c;
            this.c = n11 = n12 + 1;
            if (n12 == 0) {
                this.d = l8;
                this.e = n8;
                this.f = 0;
            }
            this.f += n9;
            this.g = n10;
            if (n11 >= 16) {
                this.a(u8, a8);
            }
        }
    }

    public void d(s s8) throws IOException {
        block3: {
            block2: {
                if (this.b) break block2;
                s8.p(this.a, 0, 10);
                s8.m();
                if (ax.q1.b.j(this.a) != 0) break block3;
            }
            return;
        }
        this.b = true;
    }
}

