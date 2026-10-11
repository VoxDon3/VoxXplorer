package ax.m7;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ax.m7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2527b {
    private final Map<String, a> a = C2526a.c();
    private final Map<Field, a> b = C2526a.c();
    private final Object c;

    /* renamed from: ax.m7.b$a */
    static class a {
        final Class<?> a;
        final ArrayList<Object> b = new ArrayList<>();

        a(Class<?> cls) {
            this.a = cls;
        }

        void a(Class<?> cls, Object obj) {
            v.a(cls == this.a);
            this.b.add(obj);
        }

        Object b() {
            return C2524C.o(this.b, this.a);
        }
    }

    public C2527b(Object obj) {
        this.c = obj;
    }

    public void a(Field field, Class<?> cls, Object obj) {
        a aVar = this.b.get(field);
        if (aVar == null) {
            aVar = new a(cls);
            this.b.put(field, aVar);
        }
        aVar.a(cls, obj);
    }

    public void b() {
        for (Map.Entry<String, a> entry : this.a.entrySet()) {
            ((Map) this.c).put(entry.getKey(), entry.getValue().b());
        }
        for (Map.Entry<Field, a> entry2 : this.b.entrySet()) {
            C2535j.l(entry2.getKey(), this.c, entry2.getValue().b());
        }
    }
}
