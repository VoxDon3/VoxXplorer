package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3831b2 implements InterfaceC3851f2 {
    public final InterfaceC3866i2 a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        s((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3851f2
    public final /* synthetic */ void s(Double d) {
        AbstractC3919t1.e(this, d);
    }

    public AbstractC3831b2(InterfaceC3866i2 interfaceC3866i2) {
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
