/*
 * Decompiled with CFR 0.152.
 */
package ax.W7;

import android.util.Base64;
import android.util.JsonWriter;
import ax.U7.b;
import ax.U7.c;
import ax.U7.d;
import ax.U7.g;
import ax.W7.f;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

final class e
implements ax.U7.e,
g {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, d<?>> d;
    private final Map<Class<?>, ax.U7.f<?>> e;
    private final d<Object> f;
    private final boolean g;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, d<Object> d8, boolean bl) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = d8;
        this.g = bl;
    }

    private boolean t(Object object) {
        return object == null || object.getClass().isArray() || object instanceof Collection || object instanceof Date || object instanceof Enum || object instanceof Number;
        {
        }
    }

    private e w(String string, Object object) throws IOException, b {
        this.y();
        this.c.name(string);
        if (object == null) {
            this.c.nullValue();
            return this;
        }
        return this.k(object, false);
    }

    private e x(String string, Object object) throws IOException, b {
        if (object == null) {
            return this;
        }
        this.y();
        this.c.name(string);
        return this.k(object, false);
    }

    private void y() throws IOException {
        if (this.b) {
            e e8 = this.a;
            if (e8 != null) {
                e8.y();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override
    public ax.U7.e a(c c8, boolean bl) throws IOException {
        return this.q(c8.b(), bl);
    }

    @Override
    public ax.U7.e b(c c8, int n8) throws IOException {
        return this.n(c8.b(), n8);
    }

    @Override
    public ax.U7.e c(c c8, long l8) throws IOException {
        return this.o(c8.b(), l8);
    }

    @Override
    public ax.U7.e d(c c8, double d8) throws IOException {
        return this.m(c8.b(), d8);
    }

    @Override
    public ax.U7.e e(c c8, Object object) throws IOException {
        return this.p(c8.b(), object);
    }

    public e h(double d8) throws IOException {
        this.y();
        this.c.value(d8);
        return this;
    }

    public e i(int n8) throws IOException {
        this.y();
        this.c.value((long)n8);
        return this;
    }

    public e j(long l8) throws IOException {
        this.y();
        this.c.value(l8);
        return this;
    }

    e k(Object object, boolean object22) throws IOException {
        Object object3 = 0;
        int n8 = 0;
        int n9 = 0;
        if (object22 && this.t(object)) {
            object = object == null ? null : object.getClass();
            throw new b(String.format("%s cannot be encoded inline", object));
        }
        if (object == null) {
            this.c.nullValue();
            return this;
        }
        if (object instanceof Number) {
            this.c.value((Number)object);
            return this;
        }
        if (object.getClass().isArray()) {
            int n10;
            if (object instanceof byte[]) {
                return this.s((byte[])object);
            }
            this.c.beginArray();
            if (object instanceof int[]) {
                object = (int[])object;
                n8 = ((Iterator<E>)object).length;
                for (n10 = n9; n10 < n8; ++n10) {
                    object3 = object[n10];
                    this.c.value((long)object3);
                }
            } else if (object instanceof long[]) {
                object = (long[])object;
                n8 = ((Object)object).length;
                for (n10 = object3; n10 < n8; ++n10) {
                    this.j((long)object[n10]);
                }
            } else if (object instanceof double[]) {
                object = (double[])object;
                object3 = ((Object)object).length;
                for (n10 = n8; n10 < object3; ++n10) {
                    Object object4 = object[n10];
                    this.c.value((double)object4);
                }
            } else if (object instanceof boolean[]) {
                for (Object object22 : (Object)((boolean[])object)) {
                    this.c.value(object22);
                }
            } else if (object instanceof Number[]) {
                object = (Number[])object;
                n8 = ((Object[])object).length;
                for (n10 = 0; n10 < n8; ++n10) {
                    this.k(object[n10], false);
                }
            } else {
                object = (Object[])object;
                n8 = ((Object[])object).length;
                for (n10 = 0; n10 < n8; ++n10) {
                    this.k(object[n10], false);
                }
            }
            this.c.endArray();
            return this;
        }
        if (object instanceof Collection) {
            object = (Collection)object;
            this.c.beginArray();
            object = object.iterator();
            while (object.hasNext()) {
                this.k(object.next(), false);
            }
            this.c.endArray();
            return this;
        }
        if (object instanceof Map) {
            object = (Map)object;
            this.c.beginObject();
            for (Map.Entry entry : object.entrySet()) {
                object = entry.getKey();
                try {
                    this.p((String)object, entry.getValue());
                }
                catch (ClassCastException classCastException) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object, object.getClass()), classCastException);
                }
            }
            this.c.endObject();
            return this;
        }
        Object object5 = this.d.get(object.getClass());
        if (object5 != null) {
            return this.v((d<Object>)object5, object, (boolean)object22);
        }
        object5 = this.e.get(object.getClass());
        if (object5 != null) {
            object5.a(object, this);
            return this;
        }
        if (object instanceof Enum) {
            if (object instanceof f) {
                this.i(((f)object).g());
                return this;
            }
            this.l(((Enum)object).name());
            return this;
        }
        return this.v(this.f, object, (boolean)object22);
    }

    public e l(String string) throws IOException {
        this.y();
        this.c.value(string);
        return this;
    }

    public e m(String string, double d8) throws IOException {
        this.y();
        this.c.name(string);
        return this.h(d8);
    }

    public e n(String string, int n8) throws IOException {
        this.y();
        this.c.name(string);
        return this.i(n8);
    }

    public e o(String string, long l8) throws IOException {
        this.y();
        this.c.name(string);
        return this.j(l8);
    }

    public e p(String string, Object object) throws IOException {
        if (this.g) {
            return this.x(string, object);
        }
        return this.w(string, object);
    }

    public e q(String string, boolean bl) throws IOException {
        this.y();
        this.c.name(string);
        return this.r(bl);
    }

    public e r(boolean bl) throws IOException {
        this.y();
        this.c.value(bl);
        return this;
    }

    public e s(byte[] byArray) throws IOException {
        this.y();
        if (byArray == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString((byte[])byArray, (int)2));
        return this;
    }

    void u() throws IOException {
        this.y();
        this.c.flush();
    }

    e v(d<Object> d8, Object object, boolean bl) throws IOException {
        if (!bl) {
            this.c.beginObject();
        }
        d8.a(object, this);
        if (!bl) {
            this.c.endObject();
        }
        return this;
    }
}

