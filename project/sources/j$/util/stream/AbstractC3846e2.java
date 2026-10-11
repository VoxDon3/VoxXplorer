package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3846e2 implements InterfaceC3866i2 {
    public final InterfaceC3866i2 a;

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(int i) {
        AbstractC3919t1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(long j) {
        AbstractC3919t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public AbstractC3846e2(InterfaceC3866i2 interfaceC3866i2) {
        this.a = (InterfaceC3866i2) Objects.requireNonNull(interfaceC3866i2);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public void m(long j) {
        this.a.m(j);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public void l() {
        this.a.l();
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public boolean q() {
        return this.a.q();
    }
}
