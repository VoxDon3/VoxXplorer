package ax.f4;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2045a {
    private final List<C0309a<?>> a = new ArrayList();

    /* renamed from: ax.f4.a$a, reason: collision with other inner class name */
    private static final class C0309a<T> {
        private final Class<T> a;
        final ax.M3.d<T> b;

        public C0309a(Class<T> cls, ax.M3.d<T> dVar) {
            this.a = cls;
            this.b = dVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, ax.M3.d<T> dVar) {
        this.a.add(new C0309a<>(cls, dVar));
    }

    public synchronized <T> ax.M3.d<T> b(Class<T> cls) {
        for (C0309a<?> c0309a : this.a) {
            if (c0309a.a(cls)) {
                return (ax.M3.d<T>) c0309a.b;
            }
        }
        return null;
    }
}
