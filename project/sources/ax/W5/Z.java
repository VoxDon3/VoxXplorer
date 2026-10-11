package ax.W5;

/* loaded from: classes3.dex */
final class Z implements W {
    private static final W d0 = new W() { // from class: ax.W5.Y
        @Override // ax.W5.W
        public final Object a() {
            throw new IllegalStateException();
        }
    };
    private Object c0;
    private volatile W q;

    Z(W w) {
        this.q = w;
    }

    @Override // ax.W5.W
    public final Object a() {
        W w = this.q;
        W w2 = d0;
        if (w != w2) {
            synchronized (this) {
                try {
                    if (this.q != w2) {
                        Object a = this.q.a();
                        this.c0 = a;
                        this.q = w2;
                        return a;
                    }
                } finally {
                }
            }
        }
        return this.c0;
    }

    public final String toString() {
        Object obj = this.q;
        if (obj == d0) {
            obj = "<supplier that returned " + String.valueOf(this.c0) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
