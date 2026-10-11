package ax.db;

import ax.ab.AbstractC1435b;
import ax.db.C1960f;

@Deprecated
/* loaded from: classes3.dex */
public abstract class p extends h {

    @Deprecated
    public static abstract class a {
        a() {
        }

        public abstract p a();

        public abstract a b(long j);

        abstract a c(long j);

        public abstract a d(long j);
    }

    public enum b {
        SENT,
        RECV
    }

    p() {
    }

    public static a a(b bVar, long j) {
        return new C1960f.b().e((b) ax.cb.b.b(bVar, "type")).c(j).d(0L).b(0L);
    }

    public abstract long b();

    public abstract AbstractC1435b c();

    public abstract long d();

    public abstract b e();

    public abstract long f();
}
