package ax.db;

import ax.eb.AbstractC1995b;

/* loaded from: classes3.dex */
public abstract class v {

    private static final class b extends v {
        private final AbstractC1995b a;

        @Override // ax.db.v
        public AbstractC1995b a() {
            return this.a;
        }

        @Override // ax.db.v
        public y b() {
            return y.a();
        }

        private b() {
            this.a = AbstractC1995b.b();
        }
    }

    static v c() {
        return new b();
    }

    public abstract AbstractC1995b a();

    public abstract y b();
}
