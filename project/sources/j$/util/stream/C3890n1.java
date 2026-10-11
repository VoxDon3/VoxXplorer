package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3890n1 extends AbstractC3900p1 implements InterfaceC3861h2 {
    public final long[] h;

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

    public C3890n1(Spliterator spliterator, AbstractC3823a abstractC3823a, long[] jArr) {
        super(spliterator, abstractC3823a, jArr.length);
        this.h = jArr;
    }

    public C3890n1(C3890n1 c3890n1, Spliterator spliterator, long j, long j2) {
        super(c3890n1, spliterator, j, j2, c3890n1.h.length);
        this.h = c3890n1.h;
    }

    @Override // j$.util.stream.AbstractC3900p1
    public final AbstractC3900p1 b(Spliterator spliterator, long j, long j2) {
        return new C3890n1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC3900p1, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }
}
