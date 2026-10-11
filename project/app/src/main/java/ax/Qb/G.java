/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.N;
import ax.Vb.j;
import ax.Vb.m;
import ax.Vb.n;
import ax.wb.b;
import ax.wb.e;
import ax.wb.f;
import ax.wb.i;

public abstract class G
extends ax.wb.a
implements f {
    public static final a c0 = new a(null);

    public G() {
        super(f.b0);
    }

    @Override
    public final <T> e<T> A(e<? super T> e8) {
        return new j<T>(this, e8);
    }

    public G Y0(int n8) {
        n.a(n8);
        return new m(this, n8);
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        return f.a.a(this, c8);
    }

    public abstract void b(i var1, Runnable var2);

    public boolean f(i i8) {
        return true;
    }

    @Override
    public i m(i.c<?> c8) {
        return f.a.b(this, c8);
    }

    @Override
    public final void s0(e<?> e8) {
        l.d(e8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j)e8).u();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N.a(this));
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        return stringBuilder.toString();
    }

    public static final class ax.Qb.G$a
    extends b<f, G> {
        private ax.Qb.G$a() {
            super(f.b0, a.q);
        }

        public /* synthetic */ ax.Qb.G$a(g g8) {
            this();
        }
    }
}

