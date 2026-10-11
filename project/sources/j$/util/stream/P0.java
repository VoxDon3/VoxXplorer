package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class P0 extends G0 {
    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        return new C3855g1(this);
    }

    @Override // j$.util.stream.E0
    public final void i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        E0 e0 = this.a;
        e0.i(objArr, i);
        this.b.i(objArr, i + ((int) e0.count()));
    }

    @Override // j$.util.stream.E0
    public final Object[] r(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.E0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.E0
    public final E0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.h(j - count, j2 - count, intFunction);
        }
        if (j2 > count) {
            return AbstractC3919t1.F(W2.REFERENCE, this.a.h(j, count, intFunction), this.b.h(0L, j2 - count, intFunction));
        }
        return this.a.h(j, j2, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
