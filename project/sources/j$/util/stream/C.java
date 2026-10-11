package j$.util.stream;

import j$.util.C3953u;
import j$.util.C3957y;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface C extends InterfaceC3853g {
    boolean E();

    C a();

    C3957y average();

    C b();

    Stream boxed();

    C c(j$.desugar.sun.nio.fs.g gVar);

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    C d();

    C distinct();

    C e();

    C3957y findAny();

    C3957y findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    InterfaceC3874k0 i();

    @Override // j$.util.stream.InterfaceC3853g
    j$.util.E iterator();

    C limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    C3957y max();

    C3957y min();

    @Override // j$.util.stream.InterfaceC3853g
    C parallel();

    C peek(DoubleConsumer doubleConsumer);

    boolean q();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C3957y reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.InterfaceC3853g
    C sequential();

    C skip(long j);

    C sorted();

    @Override // j$.util.stream.InterfaceC3853g
    j$.util.S spliterator();

    double sum();

    C3953u summaryStatistics();

    double[] toArray();

    IntStream v();
}
