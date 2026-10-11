package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3839d0 extends AbstractC3841d2 {
    public boolean b;
    public final j$.util.J c;
    public final /* synthetic */ C3844e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3839d0(C3844e0 c3844e0, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = c3844e0;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.c = new j$.util.J(interfaceC3866i22, 1);
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        InterfaceC3874k0 interfaceC3874k0 = (InterfaceC3874k0) ((j$.desugar.sun.nio.fs.g) this.d.n).apply(j);
        if (interfaceC3874k0 != null) {
            try {
                boolean z = this.b;
                j$.util.J j2 = this.c;
                if (!z) {
                    interfaceC3874k0.sequential().forEach(j2);
                } else {
                    j$.util.Y spliterator = interfaceC3874k0.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((LongConsumer) j2)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC3874k0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC3874k0 != null) {
            interfaceC3874k0.close();
        }
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
