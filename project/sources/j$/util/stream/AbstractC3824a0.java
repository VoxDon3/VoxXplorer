package j$.util.stream;

import j$.util.C3954v;
import j$.util.C3957y;
import j$.util.C3958z;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3824a0 extends AbstractC3823a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final C3958z findAny() {
        return (C3958z) t(F.d);
    }

    @Override // j$.util.stream.IntStream
    public final C3958z findFirst() {
        return (C3958z) t(F.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new B2(this, V2.q | V2.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        t(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        t(new M(intConsumer, true));
    }

    public static j$.util.V T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.V) {
            return (j$.util.V) spliterator;
        }
        if (D3.a) {
            D3.a(AbstractC3823a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC3823a
    public final W2 H() {
        return W2.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 A(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC3919t1.D(abstractC3823a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator P(AbstractC3823a abstractC3823a, Supplier supplier, boolean z) {
        return new C3867i3(abstractC3823a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean D(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        IntConsumer f;
        boolean q;
        j$.util.V T = T(spliterator);
        if (interfaceC3866i2 instanceof IntConsumer) {
            f = (IntConsumer) interfaceC3866i2;
        } else {
            if (D3.a) {
                D3.a(AbstractC3823a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3866i2);
            f = new j$.util.F(interfaceC3866i2, 1);
        }
        do {
            q = interfaceC3866i2.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(f));
        return q;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3933w0 I(long j, IntFunction intFunction) {
        return AbstractC3919t1.P(j);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final j$.util.I iterator() {
        j$.util.V spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e0(spliterator);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final j$.util.V spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC3874k0 asLongStream() {
        return new C3922u(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C asDoubleStream() {
        return new C3912s(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new r(this, 0, new C3893o(22), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new C3917t(this, V2.p | V2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new r(this, V2.p | V2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC3874k0 m() {
        Objects.requireNonNull(null);
        return new C3922u(this, V2.p | V2.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final C f() {
        Objects.requireNonNull(null);
        return new C3912s(this, V2.p | V2.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) t(new J1(W2.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream B(K k) {
        Objects.requireNonNull(k);
        return new V(this, V2.p | V2.n | V2.t, k, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C3958z reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C3958z) t(new C3934w1(W2.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C3917t(this, V2.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new V(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC3919t1.U(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC3919t1.U(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new B2(this, a4.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new J3(this, a4.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) t(new A1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC3826a2) boxed()).distinct().mapToInt(new C3893o(21));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C3893o(26));
    }

    @Override // j$.util.stream.IntStream
    public final C3958z min() {
        return reduce(new C3893o(23));
    }

    @Override // j$.util.stream.IntStream
    public final C3958z max() {
        return reduce(new C3893o(27));
    }

    @Override // j$.util.stream.IntStream
    public final C3957y average() {
        long j = ((long[]) collect(new C3893o(28), new C3893o(29), new T(0)))[0];
        return j > 0 ? new C3957y(r0[1] / j) : C3957y.c;
    }

    @Override // j$.util.stream.IntStream
    public final C3954v summaryStatistics() {
        return (C3954v) collect(new j$.desugar.sun.nio.fs.m(15), new C3893o(24), new C3893o(25));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3898p c3898p = new C3898p(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c3898p);
        return t(new C3944y1(W2.INT_VALUE, c3898p, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean u() {
        return ((Boolean) t(AbstractC3919t1.T(EnumC3908r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean w() {
        return ((Boolean) t(AbstractC3919t1.T(EnumC3908r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) t(AbstractC3919t1.T(EnumC3908r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC3919t1.L((A0) y(new C3893o(20))).d();
    }
}
