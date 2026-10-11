package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class U1 extends P1 implements O1 {
    public long b;

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
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.b = 0L;
    }
}
