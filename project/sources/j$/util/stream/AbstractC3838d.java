package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3838d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC3823a a;
    public Spliterator b;
    public long c;
    public AbstractC3838d d;
    public AbstractC3838d e;
    public Object f;

    public abstract Object a();

    public abstract AbstractC3838d c(Spliterator spliterator);

    public AbstractC3838d(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        super(null);
        this.a = abstractC3823a;
        this.b = spliterator;
        this.c = 0L;
    }

    public AbstractC3838d(AbstractC3838d abstractC3838d, Spliterator spliterator) {
        super(abstractC3838d);
        this.b = spliterator;
        this.a = abstractC3838d.a;
        this.c = abstractC3838d.c;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((AbstractC3838d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC3838d abstractC3838d = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC3838d c = abstractC3838d.c(trySplit);
            abstractC3838d.d = c;
            AbstractC3838d c2 = abstractC3838d.c(spliterator);
            abstractC3838d.e = c2;
            abstractC3838d.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC3838d = c;
                c = c2;
            } else {
                abstractC3838d = c2;
            }
            z = !z;
            c.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC3838d.d(abstractC3838d.a());
        abstractC3838d.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
