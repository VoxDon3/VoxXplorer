/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.g;
import ax.T4.n;
import ax.T4.p;
import ax.T4.t;
import ax.U4.a;
import ax.b5.e;
import ax.b5.h;
import java.io.IOException;

public abstract class c
extends a {
    protected static final int[] r0 = ax.W4.c.e();
    protected static final h<t> s0 = g.d0;
    protected final ax.W4.e l0;
    protected int[] m0 = r0;
    protected int n0;
    protected p o0 = e.i0;
    protected boolean p0;
    protected boolean q0;

    public c(ax.W4.e e8, int n8, n n9) {
        super(n8, n9);
        this.l0 = e8;
        if (g.a.i0.j(n8)) {
            this.n0 = 127;
        }
        this.q0 = g.a.o0.j(n8);
        this.p0 = g.a.g0.j(n8) ^ true;
    }

    protected void M0(String string) throws IOException {
        this.a(String.format("Can not %s, expecting field name (context: %s)", string, this.i0.h()));
    }

    protected void T0(String string, int n8) throws IOException {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 5) {
                            this.b();
                            return;
                        }
                        this.M0(string);
                        return;
                    }
                    this.q.i(this);
                    return;
                }
                this.q.d(this);
                return;
            }
            this.q.j(this);
            return;
        }
        if (this.i0.e()) {
            this.q.e(this);
            return;
        }
        if (this.i0.f()) {
            this.q.a(this);
        }
    }

    public g Y0(p p8) {
        this.o0 = p8;
        return this;
    }

    @Override
    public g d(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = 0;
        }
        this.n0 = n9;
        return this;
    }
}

