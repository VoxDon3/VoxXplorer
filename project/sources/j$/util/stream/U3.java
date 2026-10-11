package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class U3 extends AbstractC3828b {
    public final AbstractC3823a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // j$.util.stream.AbstractC3828b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(AbstractC3919t1.H(this.j.H()));
        }
    }

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object F;
        AbstractC3838d abstractC3838d = this.d;
        if (abstractC3838d != null) {
            this.n = ((U3) abstractC3838d).n | ((U3) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                F = AbstractC3919t1.H(this.j.H());
            } else {
                if (this.l) {
                    U3 u3 = (U3) this.d;
                    if (u3.n) {
                        this.m = u3.m;
                        F = (E0) u3.i();
                    }
                }
                U3 u32 = (U3) this.d;
                long j = u32.m;
                U3 u33 = (U3) this.e;
                this.m = j + u33.m;
                if (u32.m == 0) {
                    F = (E0) u33.i();
                } else if (u33.m == 0) {
                    F = (E0) u32.i();
                } else {
                    F = AbstractC3919t1.F(this.j.H(), (E0) ((U3) this.d).i(), (E0) ((U3) this.e).i());
                }
            }
            d(F);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public U3(AbstractC3823a abstractC3823a, AbstractC3823a abstractC3823a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3823a2, spliterator);
        this.j = abstractC3823a;
        this.k = intFunction;
        this.l = V2.ORDERED.q(abstractC3823a2.f);
    }

    public U3(U3 u3, Spliterator spliterator) {
        super(u3, spliterator);
        this.j = u3.j;
        this.k = u3.k;
        this.l = u3.l;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new U3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3828b
    public final Object h() {
        return AbstractC3919t1.H(this.j.H());
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        InterfaceC3933w0 I = this.a.I(-1L, this.k);
        InterfaceC3866i2 M = this.j.M(this.a.f, I);
        AbstractC3823a abstractC3823a = this.a;
        boolean n = abstractC3823a.n(this.b, abstractC3823a.R(M));
        this.n = n;
        if (n) {
            g();
        }
        E0 a = I.a();
        this.m = a.count();
        return a;
    }
}
