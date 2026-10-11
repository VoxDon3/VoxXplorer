package ax.sb;

import java.io.Serializable;

/* renamed from: ax.sb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3082n<T> implements Serializable {
    public static final a q = new a(null);

    /* renamed from: ax.sb.n$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: ax.sb.n$b */
    public static final class b implements Serializable {
        public final Throwable q;

        public b(Throwable th) {
            ax.Gb.l.f(th, "exception");
            this.q = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && ax.Gb.l.a(this.q, ((b) obj).q);
        }

        public int hashCode() {
            return this.q.hashCode();
        }

        public String toString() {
            return "Failure(" + this.q + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).q;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static <T> Object a(Object obj) {
        return obj;
    }
}
