package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class I implements C3 {
    public boolean a;
    public Object b;

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public /* synthetic */ void accept(int i) {
        AbstractC3919t1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public /* synthetic */ void accept(long j) {
        AbstractC3919t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void m(long j) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void s(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return this.a;
    }
}
