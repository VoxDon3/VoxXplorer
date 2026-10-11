/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.H9.l;
import ax.H9.m;
import ax.H9.n;
import ax.I9.u;
import ax.I9.y;
import ax.Qa.c;

public abstract class v
extends u
implements y {
    public k h;
    public k i;
    public n j;
    public l k;

    public v() {
        m m8;
        this.h = m8 = new k("Frequency");
        this.f(m8);
        this.h.C(40.0, 440.0, 8000.0);
        this.i = m8 = new k("Amplitude", 1.0);
        this.f(m8);
        m8 = new n("Phase");
        this.j = m8;
        this.f(m8);
        m8 = new l("Output");
        this.k = m8;
        this.f(m8);
    }

    @Override
    public void a(double d8, double d9, c c8) {
        this.h.v(d8, c8);
        this.i.v(d9, c8);
    }

    @Override
    public l b() {
        return this.k;
    }

    @Override
    public void c(int n8) {
    }

    @Override
    public void e(c c8) {
        this.i.v(0.0, c8);
    }

    public double z(double d8) {
        try {
            double d9 = this.a.v();
            d8 *= d9;
        }
        catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
        }
        if (d8 > 1.0) {
            return 1.0;
        }
        if (d8 < -1.0) {
            return -1.0;
        }
        return d8;
    }
}

