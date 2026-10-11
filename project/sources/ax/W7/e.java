package ax.W7;

import android.util.Base64;
import android.util.JsonWriter;
import ax.U7.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class e implements ax.U7.e, g {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, ax.U7.d<?>> d;
    private final Map<Class<?>, ax.U7.f<?>> e;
    private final ax.U7.d<Object> f;
    private final boolean g;

    e(Writer writer, Map<Class<?>, ax.U7.d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, ax.U7.d<Object> dVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = dVar;
        this.g = z;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws IOException, ax.U7.b {
        y();
        this.c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws IOException, ax.U7.b {
        if (obj == null) {
            return this;
        }
        y();
        this.c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.y();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override // ax.U7.e
    public ax.U7.e a(ax.U7.c cVar, boolean z) throws IOException {
        return q(cVar.b(), z);
    }

    @Override // ax.U7.e
    public ax.U7.e b(ax.U7.c cVar, int i) throws IOException {
        return n(cVar.b(), i);
    }

    @Override // ax.U7.e
    public ax.U7.e c(ax.U7.c cVar, long j) throws IOException {
        return o(cVar.b(), j);
    }

    @Override // ax.U7.e
    public ax.U7.e d(ax.U7.c cVar, double d) throws IOException {
        return m(cVar.b(), d);
    }

    @Override // ax.U7.e
    public ax.U7.e e(ax.U7.c cVar, Object obj) throws IOException {
        return p(cVar.b(), obj);
    }

    public e h(double d) throws IOException {
        y();
        this.c.value(d);
        return this;
    }

    public e i(int i) throws IOException {
        y();
        this.c.value(i);
        return this;
    }

    public e j(long j) throws IOException {
        y();
        this.c.value(j);
        return this;
    }

    e k(Object obj, boolean z) throws IOException {
        int i = 0;
        if (z && t(obj)) {
            throw new ax.U7.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new ax.U7.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            ax.U7.d<?> dVar = this.d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z);
            }
            ax.U7.f<?> fVar = this.e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f, obj, z);
            }
            if (obj instanceof f) {
                i(((f) obj).g());
                return this;
            }
            f(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                j(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    @Override // ax.U7.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e f(String str) throws IOException {
        y();
        this.c.value(str);
        return this;
    }

    public e m(String str, double d) throws IOException {
        y();
        this.c.name(str);
        return h(d);
    }

    public e n(String str, int i) throws IOException {
        y();
        this.c.name(str);
        return i(i);
    }

    public e o(String str, long j) throws IOException {
        y();
        this.c.name(str);
        return j(j);
    }

    public e p(String str, Object obj) throws IOException {
        return this.g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z) throws IOException {
        y();
        this.c.name(str);
        return g(z);
    }

    @Override // ax.U7.g
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z) throws IOException {
        y();
        this.c.value(z);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void u() throws IOException {
        y();
        this.c.flush();
    }

    e v(ax.U7.d<Object> dVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        dVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
