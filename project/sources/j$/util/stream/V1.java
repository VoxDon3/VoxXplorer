package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class V1 extends AbstractC3838d {
    public final AbstractC3919t1 h;

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3838d abstractC3838d = this.d;
        if (abstractC3838d != null) {
            O1 o1 = (O1) ((V1) abstractC3838d).f;
            o1.g((O1) ((V1) this.e).f);
            this.f = o1;
        }
        super.onCompletion(countedCompleter);
    }

    public V1(AbstractC3919t1 abstractC3919t1, AbstractC3823a abstractC3823a, Spliterator spliterator) {
        super(abstractC3823a, spliterator);
        this.h = abstractC3919t1;
    }

    public V1(V1 v1, Spliterator spliterator) {
        super(v1, spliterator);
        this.h = v1.h;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new V1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        AbstractC3823a abstractC3823a = this.a;
        O1 Z = this.h.Z();
        abstractC3823a.Q(this.b, Z);
        return Z;
    }
}
