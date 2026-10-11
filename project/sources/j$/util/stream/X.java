package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class X extends AbstractC3836c2 {
    public boolean b;
    public final j$.util.F c;
    public final /* synthetic */ V d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(V v, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = v;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.c = new j$.util.F(interfaceC3866i22, 1);
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((K) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.F f = this.c;
                if (!z) {
                    intStream.sequential().forEach(f);
                } else {
                    j$.util.V spliterator = intStream.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((IntConsumer) f)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
