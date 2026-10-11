package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3823a implements InterfaceC3853g, AutoCloseable {
    public final AbstractC3823a a;
    public final AbstractC3823a b;
    public final int c;
    public final AbstractC3823a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public abstract E0 A(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract boolean D(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2);

    public abstract W2 H();

    public abstract InterfaceC3933w0 I(long j, IntFunction intFunction);

    public abstract boolean L();

    public abstract InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2);

    public abstract Spliterator P(AbstractC3823a abstractC3823a, Supplier supplier, boolean z);

    public AbstractC3823a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = V2.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & V2.l;
        this.e = 0;
        this.k = z;
    }

    public AbstractC3823a(AbstractC3823a abstractC3823a, int i) {
        if (abstractC3823a.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC3823a.h = true;
        abstractC3823a.d = this;
        this.b = abstractC3823a;
        this.c = V2.h & i;
        this.f = V2.j(i, abstractC3823a.f);
        AbstractC3823a abstractC3823a2 = abstractC3823a.a;
        this.a = abstractC3823a2;
        if (L()) {
            abstractC3823a2.i = true;
        }
        this.e = abstractC3823a.e + 1;
    }

    public final Object t(B3 b3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return b3.c(this, N(b3.d()));
        }
        return b3.b(this, N(b3.d()));
    }

    public final E0 y(IntFunction intFunction) {
        AbstractC3823a abstractC3823a;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (abstractC3823a = this.b) != null && L()) {
            this.e = 0;
            return J(abstractC3823a, abstractC3823a.N(0), intFunction);
        }
        return o(N(0), true, intFunction);
    }

    public final Spliterator O() {
        AbstractC3823a abstractC3823a = this.a;
        if (this != abstractC3823a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC3823a.g;
        if (spliterator != null) {
            abstractC3823a.g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g parallel() {
        this.a.k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC3823a abstractC3823a = this.a;
        Runnable runnable = abstractC3823a.j;
        if (runnable != null) {
            abstractC3823a.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC3823a abstractC3823a = this.a;
        Runnable runnable2 = abstractC3823a.j;
        if (runnable2 != null) {
            runnable = new A3(runnable2, runnable);
        }
        abstractC3823a.j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3853g
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC3823a abstractC3823a = this.a;
        if (this == abstractC3823a) {
            Spliterator spliterator = abstractC3823a.g;
            if (spliterator != null) {
                abstractC3823a.g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return P(this, new j$.desugar.sun.nio.fs.g(5, this), abstractC3823a.k);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final boolean isParallel() {
        return this.a.k;
    }

    public final E0 o(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return A(this, spliterator, z, intFunction);
        }
        InterfaceC3933w0 I = I(C(spliterator), intFunction);
        Q(spliterator, I);
        return I.a();
    }

    public final Spliterator N(int i) {
        int i2;
        int i3;
        AbstractC3823a abstractC3823a = this.a;
        Spliterator spliterator = abstractC3823a.g;
        if (spliterator != null) {
            abstractC3823a.g = null;
            if (abstractC3823a.k && abstractC3823a.i) {
                AbstractC3823a abstractC3823a2 = abstractC3823a.d;
                int i4 = 1;
                while (abstractC3823a != this) {
                    int i5 = abstractC3823a2.c;
                    if (abstractC3823a2.L()) {
                        if (V2.SHORT_CIRCUIT.q(i5)) {
                            i5 &= ~V2.u;
                        }
                        spliterator = abstractC3823a2.K(abstractC3823a, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~V2.t) & i5;
                            i3 = V2.s;
                        } else {
                            i2 = (~V2.s) & i5;
                            i3 = V2.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    int i6 = i4 + 1;
                    abstractC3823a2.e = i4;
                    abstractC3823a2.f = V2.j(i5, abstractC3823a.f);
                    AbstractC3823a abstractC3823a3 = abstractC3823a2;
                    abstractC3823a2 = abstractC3823a2.d;
                    abstractC3823a = abstractC3823a3;
                    i4 = i6;
                }
            }
            if (i != 0) {
                this.f = V2.j(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final long C(Spliterator spliterator) {
        if (V2.SIZED.q(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final InterfaceC3866i2 Q(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        k(spliterator, R((InterfaceC3866i2) Objects.requireNonNull(interfaceC3866i2)));
        return interfaceC3866i2;
    }

    public final void k(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        Objects.requireNonNull(interfaceC3866i2);
        if (!V2.SHORT_CIRCUIT.q(this.f)) {
            interfaceC3866i2.m(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC3866i2);
            interfaceC3866i2.l();
            return;
        }
        n(spliterator, interfaceC3866i2);
    }

    public final boolean n(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        AbstractC3823a abstractC3823a = this;
        while (abstractC3823a.e > 0) {
            abstractC3823a = abstractC3823a.b;
        }
        interfaceC3866i2.m(spliterator.getExactSizeIfKnown());
        boolean D = abstractC3823a.D(spliterator, interfaceC3866i2);
        interfaceC3866i2.l();
        return D;
    }

    public final InterfaceC3866i2 R(InterfaceC3866i2 interfaceC3866i2) {
        Objects.requireNonNull(interfaceC3866i2);
        AbstractC3823a abstractC3823a = this;
        while (abstractC3823a.e > 0) {
            AbstractC3823a abstractC3823a2 = abstractC3823a.b;
            interfaceC3866i2 = abstractC3823a.M(abstractC3823a2.f, interfaceC3866i2);
            abstractC3823a = abstractC3823a2;
        }
        return interfaceC3866i2;
    }

    public final Spliterator S(Spliterator spliterator) {
        return this.e == 0 ? spliterator : P(this, new j$.desugar.sun.nio.fs.g(6, spliterator), this.a.k);
    }

    public E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return J(abstractC3823a, spliterator, new j$.desugar.sun.nio.fs.m(9)).spliterator();
    }
}
