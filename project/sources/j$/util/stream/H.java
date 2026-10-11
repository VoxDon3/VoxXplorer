package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class H extends I {
    public static final D c;
    public static final D d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new Optional(this.b);
        }
        return null;
    }

    static {
        W2 w2 = W2.REFERENCE;
        Optional optional = Optional.b;
        c = new D(true, w2, optional, new C3893o(17), new C3893o(18));
        d = new D(false, w2, optional, new C3893o(17), new C3893o(18));
    }
}
