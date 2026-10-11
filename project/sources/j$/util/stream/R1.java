package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class R1 extends U1 implements InterfaceC3856g2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3856g2
    public final /* synthetic */ void p(Integer num) {
        AbstractC3919t1.g(this, num);
    }

    @Override // j$.util.stream.P1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.b += ((U1) o1).b;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        this.b++;
    }
}
