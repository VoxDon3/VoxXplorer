package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class D1 extends P1 implements O1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

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

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.a = this.d.apply(this.a, ((D1) o1).a);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a = this.b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    public D1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}
