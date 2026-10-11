package j$.util.stream;

import j$.util.C3956x;
import j$.util.C3957y;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3859h0 extends AbstractC3823a implements InterfaceC3874k0 {
    @Override // j$.util.stream.InterfaceC3874k0
    public final j$.util.A findAny() {
        return (j$.util.A) t(G.d);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final j$.util.A findFirst() {
        return (j$.util.A) t(G.c);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 sorted() {
        return new C2(this, V2.q | V2.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        t(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        t(new N(longConsumer, true));
    }

    public static j$.util.Y T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (D3.a) {
            D3.a(AbstractC3823a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC3823a
    public final W2 H() {
        return W2.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 A(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC3919t1.E(abstractC3823a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator P(AbstractC3823a abstractC3823a, Supplier supplier, boolean z) {
        return new C3877k3(abstractC3823a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean D(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        LongConsumer j;
        boolean q;
        j$.util.Y T = T(spliterator);
        if (interfaceC3866i2 instanceof LongConsumer) {
            j = (LongConsumer) interfaceC3866i2;
        } else {
            if (D3.a) {
                D3.a(AbstractC3823a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3866i2);
            j = new j$.util.J(interfaceC3866i2, 1);
        }
        do {
            q = interfaceC3866i2.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(j));
        return q;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3933w0 I(long j, IntFunction intFunction) {
        return AbstractC3919t1.Q(j);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final j$.util.M iterator() {
        j$.util.Y spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f0(spliterator);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final j$.util.Y spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final C asDoubleStream() {
        return new C3912s(this, V2.n, 5);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final Stream boxed() {
        return new r(this, 0, new T(6), 2);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 e() {
        Objects.requireNonNull(null);
        return new C3922u(this, V2.p | V2.n, 3);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new r(this, V2.p | V2.n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final IntStream z() {
        Objects.requireNonNull(null);
        return new C3917t(this, V2.p | V2.n, 4);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final C l() {
        Objects.requireNonNull(null);
        return new C3912s(this, V2.p | V2.n, 6);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 c(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new C3844e0(this, V2.p | V2.n | V2.t, gVar, 0);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 b() {
        Objects.requireNonNull(null);
        return new C3922u(this, V2.t, 5);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C3844e0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC3919t1.W(this, 0L, j);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC3919t1.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 a() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new C2(this, a4.a, 1);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 d() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new N3(this, a4.b, 0);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 distinct() {
        return ((AbstractC3826a2) boxed()).distinct().mapToLong(new T(3));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final long sum() {
        return reduce(0L, new T(11));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final j$.util.A min() {
        return reduce(new T(2));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final j$.util.A max() {
        return reduce(new T(10));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final C3957y average() {
        long j = ((long[]) collect(new T(7), new T(8), new T(9)))[0];
        return j > 0 ? new C3957y(r0[1] / j) : C3957y.c;
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) t(new C3924u1(W2.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final C3956x summaryStatistics() {
        return (C3956x) collect(new j$.desugar.sun.nio.fs.m(18), new T(1), new T(4));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3898p c3898p = new C3898p(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c3898p);
        return t(new C3944y1(W2.LONG_VALUE, c3898p, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final boolean x() {
        return ((Boolean) t(AbstractC3919t1.V(EnumC3908r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final j$.util.A reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.A) t(new C3934w1(W2.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final boolean s() {
        return ((Boolean) t(AbstractC3919t1.V(EnumC3908r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final boolean p() {
        return ((Boolean) t(AbstractC3919t1.V(EnumC3908r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final long[] toArray() {
        return (long[]) AbstractC3919t1.M((C0) y(new T(5))).d();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final long count() {
        return ((Long) t(new A1(0))).longValue();
    }
}
