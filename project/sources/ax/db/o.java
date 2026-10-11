package ax.db;

import ax.db.C1959e;

/* loaded from: classes3.dex */
public abstract class o extends h {

    public static abstract class a {
        a() {
        }

        public abstract o a();

        public abstract a b(long j);

        abstract a c(long j);

        public abstract a d(long j);
    }

    public enum b {
        SENT,
        RECEIVED
    }

    o() {
    }

    public static a a(b bVar, long j) {
        return new C1959e.b().e((b) ax.cb.b.b(bVar, "type")).c(j).d(0L).b(0L);
    }

    public abstract long b();

    public abstract long c();

    public abstract b d();

    public abstract long e();
}
