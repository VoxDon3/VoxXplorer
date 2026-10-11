package ax.Z4;

import ax.T4.g;
import ax.T4.n;
import ax.T4.p;
import ax.T4.t;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class c extends ax.U4.a {
    protected static final int[] r0 = ax.W4.c.e();
    protected static final ax.b5.h<t> s0 = ax.T4.g.d0;
    protected final ax.W4.e l0;
    protected int[] m0;
    protected int n0;
    protected p o0;
    protected boolean p0;
    protected boolean q0;

    public c(ax.W4.e eVar, int i, n nVar) {
        super(i, nVar);
        this.m0 = r0;
        this.o0 = ax.b5.e.i0;
        this.l0 = eVar;
        if (g.a.ESCAPE_NON_ASCII.j(i)) {
            this.n0 = 127;
        }
        this.q0 = g.a.WRITE_HEX_UPPER_CASE.j(i);
        this.p0 = !g.a.QUOTE_FIELD_NAMES.j(i);
    }

    protected void M0(String str) throws IOException {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.i0.h()));
    }

    protected void T0(String str, int i) throws IOException {
        if (i == 0) {
            if (this.i0.e()) {
                this.q.e(this);
                return;
            } else {
                if (this.i0.f()) {
                    this.q.a(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.q.j(this);
            return;
        }
        if (i == 2) {
            this.q.d(this);
            return;
        }
        if (i == 3) {
            this.q.i(this);
        } else if (i != 5) {
            b();
        } else {
            M0(str);
        }
    }

    public ax.T4.g Y0(p pVar) {
        this.o0 = pVar;
        return this;
    }

    @Override // ax.T4.g
    public ax.T4.g d(int i) {
        if (i < 0) {
            i = 0;
        }
        this.n0 = i;
        return this;
    }
}
