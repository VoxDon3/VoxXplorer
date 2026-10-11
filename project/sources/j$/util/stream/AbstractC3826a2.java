package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3826a2 extends AbstractC3823a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new D2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C3888n(this, V2.m | V2.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) t(H.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) t(H.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new D2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return t(new C3944y1(W2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return t(new C3944y1(W2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        t(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        t(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC3823a
    public final W2 H() {
        return W2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) t(new C3934w1(W2.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 A(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC3919t1.B(abstractC3823a, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator P(AbstractC3823a abstractC3823a, Supplier supplier, boolean z) {
        return new C3951z3(abstractC3823a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean D(Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        boolean q;
        do {
            q = interfaceC3866i2.q();
            if (q) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC3866i2));
        return q;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3933w0 I(long j, IntFunction intFunction) {
        return AbstractC3919t1.z(j, intFunction);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new r(this, V2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new r(this, V2.p | V2.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new V(this, V2.p | V2.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return t(new C3944y1(W2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC3874k0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C3844e0(this, V2.p | V2.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final C mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C3932w(this, V2.p | V2.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) t(new A1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream c(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new r(this, V2.p | V2.n | V2.t, gVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream F(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new V(this, V2.p | V2.n | V2.t, gVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final C r(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new C3932w(this, V2.p | V2.n | V2.t, gVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object t;
        if (!this.a.k || !collector.characteristics().contains(EnumC3858h.CONCURRENT) || (V2.ORDERED.q(this.f) && !collector.characteristics().contains(EnumC3858h.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            t = t(new F1(W2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            t = collector.supplier().get();
            forEach(new j$.nio.file.w(8, collector.accumulator(), t));
            collector2 = collector;
        }
        return collector2.characteristics().contains(EnumC3858h.IDENTITY_FINISH) ? t : collector2.finisher().apply(t);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC3874k0 G(j$.desugar.sun.nio.fs.g gVar) {
        Objects.requireNonNull(gVar);
        return new C3844e0(this, V2.p | V2.n | V2.t, gVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new r(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC3919t1.Y(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC3919t1.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = a4.a;
        Objects.requireNonNull(predicate);
        return new E3(this, a4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = a4.a;
        Objects.requireNonNull(predicate);
        return new G3(this, a4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC3919t1.J(y(intFunction), intFunction).r(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new T(21));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) t(AbstractC3919t1.X(EnumC3908r0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) t(AbstractC3919t1.X(EnumC3908r0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) t(AbstractC3919t1.X(EnumC3908r0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
