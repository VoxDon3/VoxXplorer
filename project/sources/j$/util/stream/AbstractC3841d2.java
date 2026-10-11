package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3841d2 implements InterfaceC3861h2 {
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.util.function.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3861h2
    public final /* synthetic */ void j(Long l) {
        AbstractC3919t1.i(this, l);
    }

    public AbstractC3841d2(InterfaceC3866i2 interfaceC3866i2) {
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
