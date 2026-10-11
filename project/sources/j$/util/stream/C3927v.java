package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3927v extends AbstractC3831b2 {
    public boolean b;
    public final j$.util.B c;
    public final /* synthetic */ C3932w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3927v(C3932w c3932w, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = c3932w;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.c = new j$.util.B(interfaceC3866i22, 1);
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        C c = (C) ((j$.desugar.sun.nio.fs.g) this.d.n).apply(d);
        if (c != null) {
            try {
                boolean z = this.b;
                j$.util.B b = this.c;
                if (!z) {
                    c.sequential().forEach(b);
                } else {
                    j$.util.S spliterator = c.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((DoubleConsumer) b)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c != null) {
            c.close();
        }
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
