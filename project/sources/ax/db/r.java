package ax.db;

/* loaded from: classes3.dex */
public abstract class r {
    public abstract r a(boolean z);

    public abstract q b();

    static final class a extends r {
        private a(String str) {
            ax.cb.b.b(str, "name");
        }

        static a c(String str, q qVar) {
            return new a(str);
        }

        @Override // ax.db.r
        public q b() {
            return j.e;
        }

        @Override // ax.db.r
        public r a(boolean z) {
            return this;
        }
    }
}
