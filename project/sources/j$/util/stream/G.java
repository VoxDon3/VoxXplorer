package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class G extends I implements InterfaceC3861h2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.util.function.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        s(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.A(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.LONG_VALUE;
        j$.util.A a = j$.util.A.c;
        c = new D(true, w2, a, new C3893o(15), new C3893o(16));
        d = new D(false, w2, a, new C3893o(15), new C3893o(16));
    }
}
