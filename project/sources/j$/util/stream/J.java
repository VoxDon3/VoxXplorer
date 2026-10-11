package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class J extends AbstractC3828b {
    public final D j;
    public final boolean k;

    public J(D d, boolean z, AbstractC3823a abstractC3823a, Spliterator spliterator) {
        super(abstractC3823a, spliterator);
        this.k = z;
        this.j = d;
    }

    public J(J j, Spliterator spliterator) {
        super(j, spliterator);
        this.k = j.k;
        this.j = j.j;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3828b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        AbstractC3823a abstractC3823a = this.a;
        C3 c3 = (C3) this.j.d.get();
        abstractC3823a.Q(this.b, c3);
        Object obj = c3.get();
        if (this.k) {
            if (obj != null) {
                AbstractC3838d abstractC3838d = this;
                while (abstractC3838d != null) {
                    AbstractC3838d abstractC3838d2 = (AbstractC3838d) abstractC3838d.getCompleter();
                    if (abstractC3838d2 != null && abstractC3838d2.d != abstractC3838d) {
                        g();
                        return obj;
                    }
                    abstractC3838d = abstractC3838d2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            J j = (J) this.d;
            J j2 = null;
            while (true) {
                if (j != j2) {
                    Object i = j.i();
                    if (i != null && this.j.c.test(i)) {
                        d(i);
                        AbstractC3838d abstractC3838d = this;
                        while (true) {
                            if (abstractC3838d != null) {
                                AbstractC3838d abstractC3838d2 = (AbstractC3838d) abstractC3838d.getCompleter();
                                if (abstractC3838d2 != null && abstractC3838d2.d != abstractC3838d) {
                                    g();
                                    break;
                                }
                                abstractC3838d = abstractC3838d2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, i) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        j2 = j;
                        j = (J) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
