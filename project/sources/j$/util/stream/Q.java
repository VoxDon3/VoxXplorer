package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class Q extends CountedCompleter {
    public final AbstractC3823a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final P e;
    public final Q f;
    public E0 g;

    public Q(AbstractC3823a abstractC3823a, Spliterator spliterator, P p) {
        super(null);
        this.a = abstractC3823a;
        this.b = spliterator;
        this.c = AbstractC3838d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC3838d.g << 1));
        this.e = p;
        this.f = null;
    }

    public Q(Q q, Spliterator spliterator, Q q2) {
        super(q);
        this.a = q.a;
        this.b = spliterator;
        this.c = q.c;
        this.d = q.d;
        this.e = q.e;
        this.f = q2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        Q q = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            Q q2 = new Q(q, trySplit, q.f);
            Q q3 = new Q(q, spliterator, q2);
            q.addToPendingCount(1);
            q3.addToPendingCount(1);
            q.d.put(q2, q3);
            if (q.f != null) {
                q2.addToPendingCount(1);
                if (q.d.replace(q.f, q, q2)) {
                    q.addToPendingCount(-1);
                } else {
                    q2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                q = q2;
                q2 = q3;
            } else {
                q = q3;
            }
            z = !z;
            q2.fork();
        }
        if (q.getPendingCount() > 0) {
            C3893o c3893o = new C3893o(19);
            AbstractC3823a abstractC3823a = q.a;
            InterfaceC3933w0 I = abstractC3823a.I(abstractC3823a.C(spliterator), c3893o);
            q.a.Q(spliterator, I);
            q.g = I.a();
            q.b = null;
        }
        q.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        E0 e0 = this.g;
        if (e0 != null) {
            e0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        Q q = (Q) this.d.remove(this);
        if (q != null) {
            q.tryComplete();
        }
    }
}
