package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class M0 extends O0 implements A0 {
    @Override // j$.util.stream.E0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3919t1.r(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC3919t1.u(this, j, j2);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC3919t1.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.D0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        return new C3840d1(this);
    }

    @Override // j$.util.stream.E0
    public final j$.util.b0 spliterator() {
        return new C3840d1(this);
    }
}
