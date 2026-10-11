package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3885m1 extends AbstractC3900p1 implements InterfaceC3856g2 {
    public final int[] h;

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

    public C3885m1(Spliterator spliterator, AbstractC3823a abstractC3823a, int[] iArr) {
        super(spliterator, abstractC3823a, iArr.length);
        this.h = iArr;
    }

    public C3885m1(C3885m1 c3885m1, Spliterator spliterator, long j, long j2) {
        super(c3885m1, spliterator, j, j2, c3885m1.h.length);
        this.h = c3885m1.h;
    }

    @Override // j$.util.stream.AbstractC3900p1
    public final AbstractC3900p1 b(Spliterator spliterator, long j, long j2) {
        return new C3885m1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC3900p1, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}
