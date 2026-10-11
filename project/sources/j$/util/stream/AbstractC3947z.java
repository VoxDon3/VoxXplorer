package j$.util.stream;

import j$.util.C3953u;
import j$.util.C3957y;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3947z extends AbstractC3823a implements C {
    @Override // j$.util.stream.C
    public final C3957y findAny() {
        return (C3957y) t(E.d);
    }

    @Override // j$.util.stream.C
    public final C3957y findFirst() {
        return (C3957y) t(E.c);
    }

    @Override // j$.util.stream.C
    public final C sorted() {
        return new A2(this, V2.q | V2.o, 0);
    }

    public static j$.util.S T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.S) {
            return (j$.util.S) spliterator;
        }
        if (D3.a) {
            D3.a(AbstractC3823a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        t(new L(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        t(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC3823a
    public final W2 H() {
        return W2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 A(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC3919t1.C(abstractC3823a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator P(AbstractC3823a abstractC3823a, Supplier supplier, boolean z) {
        return new C3857g3(abstractC3823a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean D(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        DoubleConsumer b;
        boolean q;
        j$.util.S T = T(spliterator);
        if (interfaceC3866i2 instanceof DoubleConsumer) {
            b = (DoubleConsumer) interfaceC3866i2;
        } else {
            if (D3.a) {
                D3.a(AbstractC3823a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3866i2);
            b = new j$.util.B(interfaceC3866i2, 1);
        }
        do {
            q = interfaceC3866i2.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(b));
        return q;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3933w0 I(long j, IntFunction intFunction) {
        return AbstractC3919t1.G(j);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final j$.util.E iterator() {
        j$.util.S spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g0(spliterator);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final j$.util.S spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.C
    public final Stream boxed() {
        return new r(this, 0, new C3893o(5), 0);
    }

    @Override // j$.util.stream.C
    public final C e() {
        Objects.requireNonNull(null);
        return new C3912s(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new r(this, V2.p | V2.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.C
    public final IntStream v() {
        Objects.requireNonNull(null);
        return new C3917t(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final InterfaceC3874k0 i() {
        Objects.requireNonNull(null);
        return new C3922u(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final C c(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new C3932w(this, V2.p | V2.n | V2.t, gVar, 0);
    }

    @Override // j$.util.stream.C
    public final C b() {
        Objects.requireNonNull(null);
        return new C3912s(this, V2.t, 2);
    }

    @Override // j$.util.stream.C
    public final C peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3932w(this, doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final C limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC3919t1.S(this, 0L, j);
    }

    @Override // j$.util.stream.C
    public final C skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC3919t1.S(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.C
    public final C a() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new A2(this, a4.a, 1);
    }

    @Override // j$.util.stream.C
    public final C d() {
        int i = a4.a;
        Objects.requireNonNull(null);
        return new Q3(this, a4.b, 0);
    }

    @Override // j$.util.stream.C
    public final C distinct() {
        return ((AbstractC3826a2) boxed()).distinct().mapToDouble(new C3893o(6));
    }

    @Override // j$.util.stream.C
    public final double sum() {
        double[] dArr = (double[]) collect(new C3893o(9), new C3893o(10), new j$.desugar.sun.nio.fs.m(28));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.C
    public final C3957y min() {
        return reduce(new j$.desugar.sun.nio.fs.m(29));
    }

    @Override // j$.util.stream.C
    public final C3957y max() {
        return reduce(new C3893o(8));
    }

    @Override // j$.util.stream.C
    public final C3957y average() {
        double[] dArr = (double[]) collect(new C3893o(0), new C3893o(1), new C3893o(2));
        if (dArr[2] <= 0.0d) {
            return C3957y.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C3957y(d / dArr[2]);
    }

    @Override // j$.util.stream.C
    public final C3953u summaryStatistics() {
        return (C3953u) collect(new j$.desugar.sun.nio.fs.m(10), new C3893o(3), new C3893o(4));
    }

    @Override // j$.util.stream.C
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3898p c3898p = new C3898p(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c3898p);
        return t(new C3944y1(W2.DOUBLE_VALUE, c3898p, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.C
    public final boolean q() {
        return ((Boolean) t(AbstractC3919t1.R(EnumC3908r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean h() {
        return ((Boolean) t(AbstractC3919t1.R(EnumC3908r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean E() {
        return ((Boolean) t(AbstractC3919t1.R(EnumC3908r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final double[] toArray() {
        return (double[]) AbstractC3919t1.K((InterfaceC3943y0) y(new C3893o(7))).d();
    }

    @Override // j$.util.stream.C
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) t(new C1(W2.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.C
    public final C3957y reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C3957y) t(new C3934w1(W2.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.C
    public final long count() {
        return ((Long) t(new A1(1))).longValue();
    }
}
