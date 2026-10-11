package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class S extends CountedCompleter {
    public Spliterator a;
    public final InterfaceC3866i2 b;
    public final AbstractC3823a c;
    public long d;

    public S(AbstractC3823a abstractC3823a, Spliterator spliterator, InterfaceC3866i2 interfaceC3866i2) {
        super(null);
        this.b = interfaceC3866i2;
        this.c = abstractC3823a;
        this.a = spliterator;
        this.d = 0L;
    }

    public S(S s, Spliterator spliterator) {
        super(s);
        this.a = spliterator;
        this.b = s.b;
        this.d = s.d;
        this.c = s.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC3838d.e(estimateSize);
            this.d = j;
        }
        boolean q = V2.SHORT_CIRCUIT.q(this.c.f);
        InterfaceC3866i2 interfaceC3866i2 = this.b;
        boolean z = false;
        S s = this;
        while (true) {
            if (q && interfaceC3866i2.q()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            S s2 = new S(s, trySplit);
            s.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                S s3 = s;
                s = s2;
                s2 = s3;
            }
            z = !z;
            s.fork();
            s = s2;
            estimateSize = spliterator.estimateSize();
        }
        s.c.k(spliterator, interfaceC3866i2);
        s.a = null;
        s.propagateCompletion();
    }
}
