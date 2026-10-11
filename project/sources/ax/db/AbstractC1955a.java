package ax.db;

/* renamed from: ax.db.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1955a {

    /* renamed from: ax.db.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0290a extends AbstractC1955a {
        AbstractC0290a() {
        }

        static AbstractC1955a c(Long l) {
            return new C1956b((Long) ax.cb.b.b(l, "longValue"));
        }

        abstract Long d();
    }

    /* renamed from: ax.db.a$b */
    static abstract class b extends AbstractC1955a {
        b() {
        }

        static AbstractC1955a c(String str) {
            return new C1957c((String) ax.cb.b.b(str, "stringValue"));
        }

        abstract String d();
    }

    AbstractC1955a() {
    }

    public static AbstractC1955a a(long j) {
        return AbstractC0290a.c(Long.valueOf(j));
    }

    public static AbstractC1955a b(String str) {
        return b.c(str);
    }
}
