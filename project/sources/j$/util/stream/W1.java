package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC3846e2 {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public final Object d;
    public final /* synthetic */ AbstractC3823a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(V v, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.e = v;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.d = new j$.util.F(interfaceC3866i22, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(C3932w c3932w, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.e = c3932w;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.d = new j$.util.B(interfaceC3866i22, 1);
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        switch (this.b) {
            case 0:
                this.a.m(-1L);
                break;
            case 1:
                this.a.m(-1L);
                break;
            default:
                this.a.m(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC3874k0 interfaceC3874k0 = (InterfaceC3874k0) ((j$.desugar.sun.nio.fs.g) ((C3844e0) this.e).n).apply((j$.desugar.sun.nio.fs.g) obj);
                if (interfaceC3874k0 != null) {
                    try {
                        boolean z = this.c;
                        j$.util.J j = (j$.util.J) this.d;
                        if (!z) {
                            interfaceC3874k0.sequential().forEach(j);
                        } else {
                            j$.util.Y spliterator = interfaceC3874k0.sequential().spliterator();
                            while (!this.a.q() && spliterator.tryAdvance((LongConsumer) j)) {
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
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((j$.desugar.sun.nio.fs.g) ((V) this.e).n).apply((j$.desugar.sun.nio.fs.g) obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        j$.util.F f = (j$.util.F) this.d;
                        if (!z2) {
                            intStream.sequential().forEach(f);
                        } else {
                            j$.util.V spliterator2 = intStream.sequential().spliterator();
                            while (!this.a.q() && spliterator2.tryAdvance((IntConsumer) f)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                C c = (C) ((j$.desugar.sun.nio.fs.g) ((C3932w) this.e).n).apply((j$.desugar.sun.nio.fs.g) obj);
                if (c != null) {
                    try {
                        boolean z3 = this.c;
                        j$.util.B b = (j$.util.B) this.d;
                        if (!z3) {
                            c.sequential().forEach(b);
                        } else {
                            j$.util.S spliterator3 = c.sequential().spliterator();
                            while (!this.a.q() && spliterator3.tryAdvance((DoubleConsumer) b)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            c.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.q();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(C3844e0 c3844e0, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.e = c3844e0;
        InterfaceC3866i2 interfaceC3866i22 = this.a;
        Objects.requireNonNull(interfaceC3866i22);
        this.d = new j$.util.J(interfaceC3866i22, 1);
    }
}
