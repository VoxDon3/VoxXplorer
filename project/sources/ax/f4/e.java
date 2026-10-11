package ax.f4;

import ax.M3.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    private final List<a<?, ?>> a = new ArrayList();

    private static class a<T, R> {
        private final Class<T> a;
        final Class<R> b;
        final k<T, R> c;

        public a(Class<T> cls, Class<R> cls2, k<T, R> kVar) {
            this.a = cls;
            this.b = cls2;
            this.c = kVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <T, R> void a(k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        this.a.add(new a<>(cls, cls2, kVar));
    }

    public synchronized <T, R> List<k<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(aVar.c);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> c(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void d(k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        this.a.add(0, new a<>(cls, cls2, kVar));
    }
}
