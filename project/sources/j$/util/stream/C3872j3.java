package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3872j3 implements InterfaceC3861h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ C3872j3(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
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

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((P2) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        switch (this.a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.util.function.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3861h2
    public final /* synthetic */ void j(Long l) {
        switch (this.a) {
            case 0:
                AbstractC3919t1.i(this, l);
                break;
            default:
                AbstractC3919t1.i(this, l);
                break;
        }
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
}
