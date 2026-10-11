package ax.X7;

import ax.X7.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h {
    private final Map<Class<?>, ax.U7.d<?>> a;
    private final Map<Class<?>, ax.U7.f<?>> b;
    private final ax.U7.d<Object> c;

    public static final class a implements ax.V7.b<a> {
        private static final ax.U7.d<Object> d = new ax.U7.d() { // from class: ax.X7.g
            @Override // ax.U7.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (ax.U7.e) obj2);
            }
        };
        private final Map<Class<?>, ax.U7.d<?>> a = new HashMap();
        private final Map<Class<?>, ax.U7.f<?>> b = new HashMap();
        private ax.U7.d<Object> c = d;

        public static /* synthetic */ void b(Object obj, ax.U7.e eVar) {
            throw new ax.U7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(ax.V7.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // ax.V7.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, ax.U7.d<? super U> dVar) {
            this.a.put(cls, dVar);
            this.b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, ax.U7.d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, ax.U7.d<Object> dVar) {
        this.a = map;
        this.b = map2;
        this.c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.a, this.b, this.c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
