package ax.I0;

import ax.Gb.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {
    private final Map<b<?>, Object> a = new LinkedHashMap();

    /* renamed from: ax.I0.a$a, reason: collision with other inner class name */
    public static final class C0090a extends a {
        public static final C0090a b = new C0090a();

        private C0090a() {
        }

        @Override // ax.I0.a
        public <T> T a(b<T> bVar) {
            l.f(bVar, "key");
            return null;
        }
    }

    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.a;
    }
}
