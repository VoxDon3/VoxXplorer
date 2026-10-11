package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3862h3 implements InterfaceC3856g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C3862h3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.a();
                throw null;
            default:
                AbstractC3919t1.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((N2) this.b).accept(i);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.l();
                throw null;
            default:
                AbstractC3919t1.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        switch (this.a) {
            case 0:
                p((Integer) obj);
                break;
            default:
                p((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void m(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC3856g2
    public final /* synthetic */ void p(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.g(this, num);
                break;
            default:
                AbstractC3919t1.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }
}
