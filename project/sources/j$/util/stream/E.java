package j$.util.stream;

import j$.util.C3957y;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class E extends I implements InterfaceC3851f2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        s(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C3957y(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.DOUBLE_VALUE;
        C3957y c3957y = C3957y.c;
        c = new D(true, w2, c3957y, new C3893o(11), new C3893o(12));
        d = new D(false, w2, c3957y, new C3893o(11), new C3893o(12));
    }
}
