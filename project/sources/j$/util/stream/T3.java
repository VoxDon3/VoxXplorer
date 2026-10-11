package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class T3 extends AbstractC3838d {
    public final AbstractC3823a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3838d abstractC3838d = this.d;
        if (abstractC3838d != null) {
            if (this.j) {
                T3 t3 = (T3) abstractC3838d;
                long j = t3.l;
                this.l = j;
                if (j == t3.k) {
                    this.l = j + ((T3) this.e).l;
                }
            }
            T3 t32 = (T3) abstractC3838d;
            long j2 = t32.k;
            T3 t33 = (T3) this.e;
            this.k = j2 + t33.k;
            E0 F = t32.k == 0 ? (E0) t33.f : t33.k == 0 ? (E0) t32.f : AbstractC3919t1.F(this.h.H(), (E0) ((T3) this.d).f, (E0) ((T3) this.e).f);
            if (b() && this.j) {
                F = F.h(this.l, F.count(), this.i);
            }
            this.f = F;
        }
        super.onCompletion(countedCompleter);
    }

    public T3(AbstractC3823a abstractC3823a, AbstractC3823a abstractC3823a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3823a2, spliterator);
        this.h = abstractC3823a;
        this.i = intFunction;
        this.j = V2.ORDERED.q(abstractC3823a2.f);
    }

    public T3(T3 t3, Spliterator spliterator) {
        super(t3, spliterator);
        this.h = t3.h;
        this.i = t3.i;
        this.j = t3.j;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new T3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            V2 v2 = V2.SIZED;
            AbstractC3823a abstractC3823a = this.h;
            int i = abstractC3823a.c;
            int i2 = v2.e;
            if ((i & i2) == i2) {
                j = abstractC3823a.C(this.b);
                InterfaceC3933w0 I = this.a.I(j, this.i);
                S3 j2 = ((R3) this.h).j(I, (this.j || b) ? false : true);
                this.a.Q(this.b, j2);
                E0 a = I.a();
                this.k = a.count();
                this.l = j2.f();
                return a;
            }
        }
        j = -1;
        InterfaceC3933w0 I2 = this.a.I(j, this.i);
        S3 j22 = ((R3) this.h).j(I2, (this.j || b) ? false : true);
        this.a.Q(this.b, j22);
        E0 a2 = I2.a();
        this.k = a2.count();
        this.l = j22.f();
        return a2;
    }
}
