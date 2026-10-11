package ax.q0;

import ax.Gb.l;
import ax.tb.C3115F;
import java.util.Map;

/* renamed from: ax.q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2835d {

    /* renamed from: ax.q0.d$a */
    public static final class a<T> {
        private final String a;

        public a(String str) {
            l.f(str, "name");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.a, ((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: ax.q0.d$b */
    public static final class b<T> {
        private final a<T> a;
        private final T b;

        public final a<T> a() {
            return this.a;
        }

        public final T b() {
            return this.b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final C2832a c() {
        return new C2832a(C3115F.r(a()), false);
    }

    public final AbstractC2835d d() {
        return new C2832a(C3115F.r(a()), true);
    }
}
