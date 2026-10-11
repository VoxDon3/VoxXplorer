package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3836c2 implements InterfaceC3856g2 {
    public final InterfaceC3866i2 a;

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(long j) {
        AbstractC3919t1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3856g2
    public final /* synthetic */ void p(Integer num) {
        AbstractC3919t1.g(this, num);
    }

    public AbstractC3836c2(InterfaceC3866i2 interfaceC3866i2) {
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
