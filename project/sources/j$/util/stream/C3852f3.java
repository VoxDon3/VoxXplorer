package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3852f3 implements InterfaceC3851f2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ C3852f3(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((L2) this.b).accept(d);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.k();
                throw null;
            default:
                AbstractC3919t1.k();
                throw null;
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
                s((Double) obj);
                break;
            default:
                s((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void m(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC3851f2
    public final /* synthetic */ void s(Double d) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.e(this, d);
                break;
            default:
                AbstractC3919t1.e(this, d);
                break;
        }
    }
}
