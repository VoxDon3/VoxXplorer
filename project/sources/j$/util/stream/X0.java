package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class X0 implements E0 {
    @Override // j$.util.stream.E0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.E0
    public /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC3919t1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // j$.util.stream.E0
    public E0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0
    public final Object[] r(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void v(int i, Object obj) {
    }
}
