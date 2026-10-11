package j$.util.stream;

import j$.util.C3956x;
import j$.util.C3957y;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3864i0 implements InterfaceC3874k0, AutoCloseable {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ C3864i0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC3874k0 j(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C3869j0 ? ((C3869j0) longStream).a : new C3864i0(longStream);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 a() {
        return j(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ C asDoubleStream() {
        return A.j(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ C3957y average() {
        return j$.com.android.tools.r8.a.A(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 b() {
        return j(this.a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ Stream boxed() {
        return T2.j(this.a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 d() {
        return j(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 distinct() {
        return j(this.a.distinct());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 e() {
        return j(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C3864i0) {
            obj = ((C3864i0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ j$.util.A findAny() {
        return j$.com.android.tools.r8.a.C(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ j$.util.A findFirst() {
        return j$.com.android.tools.r8.a.C(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3874k0, j$.util.stream.InterfaceC3853g
    public final /* synthetic */ j$.util.M iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.L ? ((j$.util.L) it).a : new j$.util.K(it);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ C l() {
        return A.j(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return T2.j(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ j$.util.A max() {
        return j$.com.android.tools.r8.a.C(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ j$.util.A min() {
        return j$.com.android.tools.r8.a.C(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g onClose(Runnable runnable) {
        return C3843e.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ boolean p() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g parallel() {
        return C3843e.j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3874k0, j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3874k0 parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 peek(LongConsumer longConsumer) {
        return j(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ j$.util.A reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.C(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ boolean s() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g sequential() {
        return C3843e.j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3874k0, j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3874k0 sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ InterfaceC3874k0 sorted() {
        return j(this.a.sorted());
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3874k0, j$.util.stream.InterfaceC3853g
    public final /* synthetic */ j$.util.Y spliterator() {
        return j$.util.W.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g unordered() {
        return C3843e.j(this.a.unordered());
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ boolean x() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final /* synthetic */ IntStream z() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final C3956x summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC3874k0
    public final InterfaceC3874k0 c(j$.desugar.sun.nio.fs.g gVar) {
        LongStream longStream = this.a;
        j$.desugar.sun.nio.fs.g gVar2 = new j$.desugar.sun.nio.fs.g(10);
        gVar2.b = gVar;
        return j(longStream.flatMap(gVar2));
    }
}
