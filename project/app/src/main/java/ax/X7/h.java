/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

import ax.U7.d;
import ax.U7.e;
import ax.V7.b;
import ax.X7.f;
import ax.X7.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class h {
    private final Map<Class<?>, d<?>> a;
    private final Map<Class<?>, ax.U7.f<?>> b;
    private final d<Object> c;

    h(Map<Class<?>, d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, d<Object> d8) {
        this.a = map;
        this.b = map2;
        this.c = d8;
    }

    public static a a() {
        return new a();
    }

    public void b(Object object, OutputStream outputStream) throws IOException {
        new f(outputStream, this.a, this.b, this.c).t(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] c(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.b(object, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            return byteArrayOutputStream.toByteArray();
        }
    }

    public static final class a
    implements b<a> {
        private static final d<Object> d = new g();
        private final Map<Class<?>, d<?>> a = new HashMap();
        private final Map<Class<?>, ax.U7.f<?>> b = new HashMap();
        private d<Object> c = d;

        public static /* synthetic */ void b(Object object, e object2) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Couldn't find encoder for type ");
            ((StringBuilder)object2).append(object.getClass().getCanonicalName());
            throw new ax.U7.b(((StringBuilder)object2).toString());
        }

        public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(ax.V7.a a8) {
            a8.a(this);
            return this;
        }

        public <U> a e(Class<U> clazz, d<? super U> d8) {
            this.a.put(clazz, d8);
            this.b.remove(clazz);
            return this;
        }
    }
}

