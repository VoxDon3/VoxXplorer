/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.Qb.A0;
import ax.Qb.D;
import ax.Qb.F;
import ax.Qb.I;
import ax.Qb.J;
import ax.Qb.L;
import ax.Qb.N;
import ax.Qb.s0;
import ax.Qb.z;
import ax.Qb.z0;
import ax.wb.e;
import ax.wb.i;

public abstract class a<T>
extends z0
implements s0,
e<T>,
J {
    private final i d0;

    public a(i i8, boolean bl, boolean bl2) {
        super(bl2);
        if (bl) {
            this.Z(i8.a(s0.c));
        }
        this.d0 = i8.p(this);
    }

    @Override
    protected String G() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N.a(this));
        stringBuilder.append(" was cancelled");
        return stringBuilder.toString();
    }

    protected void I0(Object object) {
        this.w(object);
    }

    protected void J0(Throwable throwable, boolean bl) {
    }

    protected void K0(T t8) {
    }

    public final <R> void N0(L l8, R r8, p<? super R, ? super e<? super T>, ? extends Object> p8) {
        l8.h(p8, r8, this);
    }

    @Override
    public final void Y(Throwable throwable) {
        I.a(this.d0, throwable);
    }

    @Override
    public final i b() {
        return this.d0;
    }

    @Override
    public boolean e() {
        return super.e();
    }

    @Override
    public final void f(Object object) {
        if ((object = this.f0(D.d(object, null, 1, null))) == A0.b) {
            return;
        }
        this.I0(object);
    }

    @Override
    public i h() {
        return this.d0;
    }

    @Override
    public String h0() {
        String string = F.b(this.d0);
        if (string == null) {
            return super.h0();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append(string);
        stringBuilder.append("\":");
        stringBuilder.append(super.h0());
        return stringBuilder.toString();
    }

    @Override
    protected final void m0(Object object) {
        if (object instanceof z) {
            object = (z)object;
            this.J0(((z)object).a, ((z)object).a());
            return;
        }
        this.K0(object);
    }
}

