package j$.util.stream;

import j$.util.C3958z;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class F extends I implements InterfaceC3856g2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        s(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C3958z(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.INT_VALUE;
        C3958z c3958z = C3958z.c;
        c = new D(true, w2, c3958z, new C3893o(13), new C3893o(14));
        d = new D(false, w2, c3958z, new C3893o(13), new C3893o(14));
    }
}
