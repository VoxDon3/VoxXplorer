package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3915s2 extends AbstractC3828b {
    public final AbstractC3823a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // j$.util.stream.AbstractC3828b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC3919t1.H(this.j.H()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (r2 >= r0) goto L52;
     */
    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C3915s2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public C3915s2(AbstractC3823a abstractC3823a, AbstractC3823a abstractC3823a2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC3823a2, spliterator);
        this.j = abstractC3823a;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public C3915s2(C3915s2 c3915s2, Spliterator spliterator) {
        super(c3915s2, spliterator);
        this.j = c3915s2.j;
        this.k = c3915s2.k;
        this.l = c3915s2.l;
        this.m = c3915s2.m;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new C3915s2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3828b
    public final Object h() {
        return AbstractC3919t1.H(this.j.H());
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        if (b()) {
            V2 v2 = V2.SIZED;
            AbstractC3823a abstractC3823a = this.j;
            int i = abstractC3823a.c;
            int i2 = v2.e;
            InterfaceC3933w0 I = this.j.I((i & i2) == i2 ? abstractC3823a.C(this.b) : -1L, this.k);
            InterfaceC3866i2 M = this.j.M(this.a.f, I);
            AbstractC3823a abstractC3823a2 = this.a;
            abstractC3823a2.n(this.b, abstractC3823a2.R(M));
            return I.a();
        }
        InterfaceC3933w0 I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            InterfaceC3866i2 M2 = this.j.M(this.a.f, I2);
            AbstractC3823a abstractC3823a3 = this.a;
            abstractC3823a3.n(this.b, abstractC3823a3.R(M2));
        } else {
            this.a.Q(this.b, I2);
        }
        E0 a = I2.a();
        this.n = a.count();
        this.o = true;
        this.b = null;
        return a;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C3915s2 c3915s2 = (C3915s2) this.d;
        C3915s2 c3915s22 = (C3915s2) this.e;
        if (c3915s2 == null || c3915s22 == null) {
            return this.n;
        }
        long j2 = c3915s2.j(j);
        return j2 >= j ? j2 : c3915s22.j(j) + j2;
    }
}
