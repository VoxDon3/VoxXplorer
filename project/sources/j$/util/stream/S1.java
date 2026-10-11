package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class S1 extends U1 implements InterfaceC3861h2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.util.function.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3861h2
    public final /* synthetic */ void j(Long l) {
        AbstractC3919t1.i(this, l);
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
    public final void accept(long j) {
        this.b++;
    }
}
