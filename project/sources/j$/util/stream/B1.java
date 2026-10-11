package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class B1 extends P1 implements O1, InterfaceC3851f2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ C3898p d;

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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3851f2
    public final /* synthetic */ void s(Double d) {
        AbstractC3919t1.e(this, d);
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.a = this.d.apply(this.a, ((B1) o1).a);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public B1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C3898p c3898p) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = c3898p;
    }
}
