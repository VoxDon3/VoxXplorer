/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Vd.l;

public class n
extends b {
    private b.a b;
    private l c;
    private boolean d;
    private short e;
    private int f;
    private int[] g;
    private int h;
    private int i;
    private b j;

    public n(l l8) {
        this.c = l8;
        this.d = false;
        this.j = null;
        this.g = new int[4];
        this.j();
    }

    public n(l l8, boolean bl, b b8) {
        this.c = l8;
        this.d = bl;
        this.j = b8;
        this.g = new int[4];
        this.j();
    }

    @Override
    public String c() {
        b b8 = this.j;
        if (b8 == null) {
            return this.c.a();
        }
        return b8.c();
    }

    @Override
    public float d() {
        int n8 = this.f;
        if (n8 > 0) {
            float f8 = (float)this.g[3] * 1.0f / (float)n8 / this.c.d() * (float)this.i / (float)this.h;
            if (f8 >= 1.0f) {
                return 0.99f;
            }
            return f8;
        }
        return 0.01f;
    }

    @Override
    public b.a e() {
        return this.b;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            short s8 = this.c.b(byArray[i8]);
            if (s8 < 250) {
                ++this.h;
            }
            if (s8 < 64) {
                ++this.i;
                short s9 = this.e;
                if (s9 < 64) {
                    int[] nArray;
                    ++this.f;
                    if (!this.d) {
                        nArray = this.g;
                        s9 = this.c.c(s9 * 64 + s8);
                        nArray[s9] = nArray[s9] + 1;
                    } else {
                        nArray = this.g;
                        s9 = this.c.c(s8 * 64 + s9);
                        nArray[s9] = nArray[s9] + 1;
                    }
                }
            }
            this.e = s8;
        }
        if (this.b == b.a.q && this.f > 1024) {
            float f8 = this.d();
            if (f8 > 0.95f) {
                this.b = b.a.c0;
            } else if (f8 < 0.05f) {
                this.b = b.a.d0;
            }
        }
        return this.b;
    }

    @Override
    public final void j() {
        this.b = b.a.q;
        this.e = (short)255;
        for (int i8 = 0; i8 < 4; ++i8) {
            this.g[i8] = 0;
        }
        this.f = 0;
        this.h = 0;
        this.i = 0;
    }

    public float l() {
        int n8 = this.f;
        if (n8 > 0) {
            int[] nArray = this.g;
            float f8 = ((float)nArray[3] * 1.0f + (float)nArray[2] * 0.5f) / (float)n8 / this.c.d() * (float)this.i / (float)this.h;
            if (f8 >= 1.0f) {
                return 0.99f;
            }
            return f8;
        }
        return 0.01f;
    }
}

