package j$.util.stream;

import j$.util.C3956x;
import j$.util.C3957y;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3874k0 extends InterfaceC3853g {
    InterfaceC3874k0 a();

    C asDoubleStream();

    C3957y average();

    InterfaceC3874k0 b();

    Stream boxed();

    InterfaceC3874k0 c(j$.desugar.sun.nio.fs.g gVar);

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC3874k0 d();

    InterfaceC3874k0 distinct();

    InterfaceC3874k0 e();

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC3853g
    j$.util.M iterator();

    C l();

    InterfaceC3874k0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.A max();

    j$.util.A min();

    boolean p();

    @Override // j$.util.stream.InterfaceC3853g
    InterfaceC3874k0 parallel();

    InterfaceC3874k0 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.A reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC3853g
    InterfaceC3874k0 sequential();

    InterfaceC3874k0 skip(long j);

    InterfaceC3874k0 sorted();

    @Override // j$.util.stream.InterfaceC3853g
    j$.util.Y spliterator();

    long sum();

    C3956x summaryStatistics();

    long[] toArray();

    boolean x();

    IntStream z();
}
