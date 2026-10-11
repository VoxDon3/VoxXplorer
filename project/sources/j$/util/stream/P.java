package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class P implements B3, C3 {
    public final boolean a;

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

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void m(long j) {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    public P(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.B3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return V2.r;
    }

    public final void e(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        if (this.a) {
            new Q(abstractC3823a, spliterator, this).invoke();
        } else {
            new S(abstractC3823a, spliterator, abstractC3823a.R(this)).invoke();
        }
    }
}
