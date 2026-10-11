/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;

public class h
extends b {
    private int b;
    private int c;
    private byte d;
    private byte e;
    private b f = null;
    private b g = null;

    public h() {
        this.j();
    }

    protected static boolean l(byte by) {
        return (by = (byte)(by & 0xFF)) == 234 || by == 237 || by == 239 || by == 243 || by == 245;
        {
        }
    }

    protected static boolean m(byte by) {
        return (by = (byte)(by & 0xFF)) == 235 || by == 238 || by == 240 || by == 244;
        {
        }
    }

    @Override
    public String c() {
        int n8 = this.b - this.c;
        if (n8 >= 5) {
            return ax.Rd.b.t;
        }
        if (n8 <= -5) {
            return ax.Rd.b.f;
        }
        float f8 = this.f.d() - this.g.d();
        if (f8 > 0.01f) {
            return ax.Rd.b.t;
        }
        if (f8 < -0.01f) {
            return ax.Rd.b.f;
        }
        if (n8 < 0) {
            return ax.Rd.b.f;
        }
        return ax.Rd.b.t;
    }

    @Override
    public float d() {
        return 0.0f;
    }

    @Override
    public b.a e() {
        b.a a8;
        b.a a9 = this.f.e();
        if (a9 == (a8 = b.a.d0) && this.g.e() == a8) {
            return a8;
        }
        return b.a.q;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        b.a a8;
        b.a a9 = this.e();
        if (a9 == (a8 = b.a.d0)) {
            return a8;
        }
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            byte by = byArray[i8];
            if (by == 32) {
                if (this.e != 32) {
                    if (h.l(this.d)) {
                        ++this.b;
                    } else if (h.m(this.d)) {
                        ++this.c;
                    }
                }
            } else if (this.e == 32 && h.l(this.d) && by != 32) {
                ++this.c;
            }
            this.e = this.d;
            this.d = by;
        }
        return b.a.q;
    }

    @Override
    public final void j() {
        this.b = 0;
        this.c = 0;
        this.d = (byte)32;
        this.e = (byte)32;
    }

    public void n(b b8, b b9) {
        this.f = b8;
        this.g = b9;
    }
}

