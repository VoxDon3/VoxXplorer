package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3895o1 extends AbstractC3900p1 {
    public final Object[] h;

    public C3895o1(Spliterator spliterator, AbstractC3823a abstractC3823a, Object[] objArr) {
        super(spliterator, abstractC3823a, objArr.length);
        this.h = objArr;
    }

    public C3895o1(C3895o1 c3895o1, Spliterator spliterator, long j, long j2) {
        super(c3895o1, spliterator, j, j2, c3895o1.h.length);
        this.h = c3895o1.h;
    }

    @Override // j$.util.stream.AbstractC3900p1
    public final AbstractC3900p1 b(Spliterator spliterator, long j, long j2) {
        return new C3895o1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
