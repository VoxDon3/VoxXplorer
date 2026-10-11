package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3880l1 extends AbstractC3900p1 implements InterfaceC3851f2 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3851f2
    public final /* synthetic */ void s(Double d) {
        AbstractC3919t1.e(this, d);
    }

    public C3880l1(Spliterator spliterator, AbstractC3823a abstractC3823a, double[] dArr) {
        super(spliterator, abstractC3823a, dArr.length);
        this.h = dArr;
    }

    public C3880l1(C3880l1 c3880l1, Spliterator spliterator, long j, long j2) {
        super(c3880l1, spliterator, j, j2, c3880l1.h.length);
        this.h = c3880l1.h;
    }

    @Override // j$.util.stream.AbstractC3900p1
    public final AbstractC3900p1 b(Spliterator spliterator, long j, long j2) {
        return new C3880l1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC3900p1, j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}
