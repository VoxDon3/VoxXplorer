package ax.c4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.c4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1842e {
    private final List<a<?, ?>> a = new ArrayList();

    /* renamed from: ax.c4.e$a */
    private static final class a<Z, R> {
        private final Class<Z> a;
        private final Class<R> b;
        final InterfaceC1841d<Z, R> c;

        a(Class<Z> cls, Class<R> cls2, InterfaceC1841d<Z, R> interfaceC1841d) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC1841d;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <Z, R> InterfaceC1841d<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return f.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (InterfaceC1841d<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, InterfaceC1841d<Z, R> interfaceC1841d) {
        this.a.add(new a<>(cls, cls2, interfaceC1841d));
    }
}
