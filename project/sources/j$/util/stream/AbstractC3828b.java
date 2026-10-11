package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3828b extends AbstractC3838d {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC3828b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        super(abstractC3823a, spliterator);
        this.h = new AtomicReference(null);
    }

    public AbstractC3828b(AbstractC3828b abstractC3828b, Spliterator spliterator) {
        super(abstractC3828b, spliterator);
        this.h = abstractC3828b.h;
    }

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC3838d.e(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC3828b abstractC3828b = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC3828b.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC3828b.getCompleter();
                while (true) {
                    AbstractC3828b abstractC3828b2 = (AbstractC3828b) ((AbstractC3838d) completer);
                    if (z2 || abstractC3828b2 == null) {
                        break;
                    }
                    z2 = abstractC3828b2.i;
                    completer = abstractC3828b2.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC3828b.h();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC3828b abstractC3828b3 = (AbstractC3828b) abstractC3828b.c(trySplit);
            abstractC3828b.d = abstractC3828b3;
            AbstractC3828b abstractC3828b4 = (AbstractC3828b) abstractC3828b.c(spliterator);
            abstractC3828b.e = abstractC3828b4;
            abstractC3828b.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC3828b = abstractC3828b3;
                abstractC3828b3 = abstractC3828b4;
            } else {
                abstractC3828b = abstractC3828b4;
            }
            z = !z;
            abstractC3828b3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC3828b.a();
        abstractC3828b.d(obj);
        abstractC3828b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC3838d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC3828b abstractC3828b = this;
        for (AbstractC3828b abstractC3828b2 = (AbstractC3828b) ((AbstractC3838d) getCompleter()); abstractC3828b2 != null; abstractC3828b2 = (AbstractC3828b) ((AbstractC3838d) abstractC3828b2.getCompleter())) {
            if (abstractC3828b2.d == abstractC3828b) {
                AbstractC3828b abstractC3828b3 = (AbstractC3828b) abstractC3828b2.e;
                if (!abstractC3828b3.i) {
                    abstractC3828b3.f();
                }
            }
            abstractC3828b = abstractC3828b2;
        }
    }
}
