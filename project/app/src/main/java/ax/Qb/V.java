/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Qb.F;
import ax.Qb.I;
import ax.Qb.M;
import ax.Qb.W;
import ax.Qb.s0;
import ax.Qb.z;
import ax.Vb.J;
import ax.Vb.j;
import ax.Xb.h;
import ax.sb.a;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;

public abstract class V<T>
extends h {
    public int d0;

    public V(int n8) {
        this.d0 = n8;
    }

    public void c(Object object, Throwable throwable) {
    }

    public abstract e<T> e();

    public Throwable g(Object object) {
        if ((object = object instanceof z ? (z)object : null) != null) {
            return ((z)object).a;
        }
        return null;
    }

    public <T> T h(Object object) {
        return (T)object;
    }

    public final void i(Throwable object, Throwable throwable) {
        if (object == null && throwable == null) {
            return;
        }
        if (object != null && throwable != null) {
            a.a((Throwable)object, throwable);
        }
        Throwable throwable2 = object;
        if (object == null) {
            throwable2 = throwable;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fatal exception in coroutines machinery for ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        object = ((StringBuilder)object).toString();
        l.c(throwable2);
        object = new M((String)object, throwable2);
        I.a(this.e().b(), (Throwable)object);
    }

    public abstract Object j();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block14: {
            block15: {
                block16: {
                    var3_1 = this.c0;
                    try {
                        var1_2 = this.e();
                        l.d(var1_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                        var1_2 = (j)var1_2;
                        var5_4 = var1_2.f0;
                        var1_2 = var1_2.h0;
                        var4_5 = var5_4.b();
                        var6_6 = J.c(var4_5, var1_2);
                        var1_2 = var6_6 != J.a ? F.g(var5_4, var4_5, var6_6) : null;
                    }
                    catch (Throwable var2_7) {
                        break block14;
                    }
                    try {
                        var2_8 = var5_4.b();
                        var7_11 = this.j();
                        var8_12 = this.g(var7_11);
                        var2_8 = var8_12 == null && W.b(this.d0) != false ? var2_8.a(s0.c) : null;
                    }
                    catch (Throwable var2_9) {
                        break block15;
                    }
                    if (var2_8 != null && !var2_8.e()) {
                        var2_8 = var2_8.o();
                        this.c(var7_11, (Throwable)var2_8);
                        var7_11 = n.q;
                        var5_4.f(n.a(o.a((Throwable)var2_8)));
                    } else if (var8_12 != null) {
                        var2_8 = n.q;
                        var5_4.f(n.a(o.a(var8_12)));
                    } else {
                        var2_8 = n.q;
                        var5_4.f(n.a(this.h(var7_11)));
                    }
                    var2_8 = t.a;
                    {
                        if (var1_2 != null && !var1_2.O0()) break block16;
                        J.a(var4_5, var6_6);
                    }
                }
                try {
                    var3_1.a();
                    var1_2 = n.a(t.a);
                }
                catch (Throwable var2_10) {
                    var1_2 = n.q;
                    var1_2 = n.a(o.a(var2_10));
                }
                this.i(null, n.b(var1_2));
                return;
            }
            if (var1_2 == null) ** GOTO lbl48
            {
                if (var1_2.O0() == false) throw var2_9;
lbl48:
                // 2 sources

                J.a(var4_5, var6_6);
                throw var2_9;
            }
        }
        try {
            var1_2 = n.q;
            var3_1.a();
            var1_2 = n.a(t.a);
        }
        catch (Throwable var1_3) {
            var3_1 = n.q;
            var1_2 = n.a(o.a(var1_3));
        }
        this.i(var2_7, n.b(var1_2));
    }
}

