package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3900p1 extends CountedCompleter implements InterfaceC3866i2 {
    public final Spliterator a;
    public final AbstractC3823a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC3919t1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC3919t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public abstract AbstractC3900p1 b(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    public AbstractC3900p1(Spliterator spliterator, AbstractC3823a abstractC3823a, int i) {
        this.a = spliterator;
        this.b = abstractC3823a;
        this.c = AbstractC3838d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public AbstractC3900p1(AbstractC3900p1 abstractC3900p1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC3900p1);
        this.a = spliterator;
        this.b = abstractC3900p1.b;
        this.c = abstractC3900p1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        AbstractC3900p1 abstractC3900p1 = this;
        while (spliterator.estimateSize() > abstractC3900p1.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC3900p1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            AbstractC3900p1 abstractC3900p12 = abstractC3900p1;
            abstractC3900p12.b(trySplit, abstractC3900p1.d, estimateSize).fork();
            abstractC3900p1 = abstractC3900p12.b(spliterator, abstractC3900p12.d + estimateSize, abstractC3900p12.e - estimateSize);
        }
        AbstractC3900p1 abstractC3900p13 = abstractC3900p1;
        abstractC3900p13.b.Q(spliterator, abstractC3900p13);
        abstractC3900p13.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
