package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3878l extends AbstractC3846e2 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ C3878l(InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3878l(E3 e3, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = e3;
        this.c = true;
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
                InterfaceC3866i2 interfaceC3866i2 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC3866i2.s((InterfaceC3866i2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC3866i2.s((InterfaceC3866i2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.desugar.sun.nio.fs.g) ((r) this.d).n).apply((j$.desugar.sun.nio.fs.g) obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC3866i2 interfaceC3866i22 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(interfaceC3866i22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC3866i22.q() && spliterator.tryAdvance(interfaceC3866i22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((E3) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        this.a.s((InterfaceC3866i2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public boolean q() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.q();
            case 2:
                return !this.c || this.a.q();
            default:
                return super.q();
        }
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public void l() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.l();
                break;
            default:
                super.l();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3878l(r rVar, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.d = rVar;
    }
}
