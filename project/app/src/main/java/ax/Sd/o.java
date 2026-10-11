/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Wd.m;
import ax.Wd.n;

public class o
extends b {
    private static final m e = new n();
    private ax.Wd.b b = new ax.Wd.b(e);
    private b.a c;
    private int d = 0;

    public o() {
        this.j();
    }

    @Override
    public String c() {
        return ax.Rd.b.u;
    }

    @Override
    public float d() {
        int n8 = this.d;
        float f8 = 0.99f;
        if (n8 < 6) {
            for (n8 = 0; n8 < this.d; ++n8) {
                f8 *= 0.5f;
            }
            return 1.0f - f8;
        }
        return 0.99f;
    }

    @Override
    public b.a e() {
        return this.c;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            int n10 = this.b.c(byArray[i8]);
            if (n10 == 1) {
                this.c = b.a.d0;
                break;
            }
            if (n10 == 2) {
                this.c = b.a.c0;
                break;
            }
            if (n10 != 0 || this.b.b() < 2) continue;
            ++this.d;
        }
        if (this.c == b.a.q && this.d() > 0.95f) {
            this.c = b.a.c0;
        }
        return this.c;
    }

    @Override
    public final void j() {
        this.b.d();
        this.d = 0;
        this.c = b.a.q;
    }
}

