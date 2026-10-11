package ax.X7;

import ax.X7.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class f implements ax.U7.e {
    private static final Charset f = Charset.forName("UTF-8");
    private static final ax.U7.c g = ax.U7.c.a("key").b(ax.X7.a.b().c(1).a()).a();
    private static final ax.U7.c h = ax.U7.c.a("value").b(ax.X7.a.b().c(2).a()).a();
    private static final ax.U7.d<Map.Entry<Object, Object>> i = new ax.U7.d() { // from class: ax.X7.e
        @Override // ax.U7.d
        public final void a(Object obj, Object obj2) {
            f.f((Map.Entry) obj, (ax.U7.e) obj2);
        }
    };
    private OutputStream a;
    private final Map<Class<?>, ax.U7.d<?>> b;
    private final Map<Class<?>, ax.U7.f<?>> c;
    private final ax.U7.d<Object> d;
    private final i e = new i(this);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, ax.U7.d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, ax.U7.d<Object> dVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = dVar;
    }

    public static /* synthetic */ void f(Map.Entry entry, ax.U7.e eVar) {
        eVar.e(g, entry.getKey());
        eVar.e(h, entry.getValue());
    }

    private static ByteBuffer p(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(ax.U7.d<T> dVar, T t) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(t, this);
                this.a = outputStream;
                long length = bVar.getLength();
                bVar.close();
                return length;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f r(ax.U7.d<T> dVar, ax.U7.c cVar, T t, boolean z) throws IOException {
        long q = q(dVar, t);
        if (z && q == 0) {
            return this;
        }
        w((v(cVar) << 3) | 2);
        x(q);
        dVar.a(t, this);
        return this;
    }

    private <T> f s(ax.U7.f<T> fVar, ax.U7.c cVar, T t, boolean z) throws IOException {
        this.e.b(cVar, z);
        fVar.a(t, this.e);
        return this;
    }

    private static d u(ax.U7.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new ax.U7.b("Field has no @Protobuf config");
    }

    private static int v(ax.U7.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new ax.U7.b("Field has no @Protobuf config");
    }

    private void w(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    private void x(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    @Override // ax.U7.e
    public ax.U7.e d(ax.U7.c cVar, double d) throws IOException {
        return g(cVar, d, true);
    }

    @Override // ax.U7.e
    public ax.U7.e e(ax.U7.c cVar, Object obj) throws IOException {
        return i(cVar, obj, true);
    }

    ax.U7.e g(ax.U7.c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        w((v(cVar) << 3) | 1);
        this.a.write(p(8).putDouble(d).array());
        return this;
    }

    ax.U7.e h(ax.U7.c cVar, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        w((v(cVar) << 3) | 5);
        this.a.write(p(4).putFloat(f2).array());
        return this;
    }

    ax.U7.e i(ax.U7.c cVar, Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    w((v(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    w(bytes.length);
                    this.a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return g(cVar, ((Double) obj).doubleValue(), z);
                }
                if (obj instanceof Float) {
                    return h(cVar, ((Float) obj).floatValue(), z);
                }
                if (obj instanceof Number) {
                    return m(cVar, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return o(cVar, ((Boolean) obj).booleanValue(), z);
                }
                if (!(obj instanceof byte[])) {
                    ax.U7.d<?> dVar = this.b.get(obj.getClass());
                    if (dVar != null) {
                        return r(dVar, cVar, obj, z);
                    }
                    ax.U7.f<?> fVar = this.c.get(obj.getClass());
                    return fVar != null ? s(fVar, cVar, obj, z) : obj instanceof c ? b(cVar, ((c) obj).g()) : obj instanceof Enum ? b(cVar, ((Enum) obj).ordinal()) : r(this.d, cVar, obj, z);
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    w((v(cVar) << 3) | 2);
                    w(bArr.length);
                    this.a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // ax.U7.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f b(ax.U7.c cVar, int i2) throws IOException {
        return k(cVar, i2, true);
    }

    f k(ax.U7.c cVar, int i2, boolean z) throws IOException {
        if (!z || i2 != 0) {
            d u = u(cVar);
            int i3 = a.a[u.intEncoding().ordinal()];
            if (i3 == 1) {
                w(u.tag() << 3);
                w(i2);
                return this;
            }
            if (i3 == 2) {
                w(u.tag() << 3);
                w((i2 << 1) ^ (i2 >> 31));
                return this;
            }
            if (i3 == 3) {
                w((u.tag() << 3) | 5);
                this.a.write(p(4).putInt(i2).array());
                return this;
            }
        }
        return this;
    }

    @Override // ax.U7.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f c(ax.U7.c cVar, long j) throws IOException {
        return m(cVar, j, true);
    }

    f m(ax.U7.c cVar, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            d u = u(cVar);
            int i2 = a.a[u.intEncoding().ordinal()];
            if (i2 == 1) {
                w(u.tag() << 3);
                x(j);
                return this;
            }
            if (i2 == 2) {
                w(u.tag() << 3);
                x((j >> 63) ^ (j << 1));
                return this;
            }
            if (i2 == 3) {
                w((u.tag() << 3) | 1);
                this.a.write(p(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    @Override // ax.U7.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f a(ax.U7.c cVar, boolean z) throws IOException {
        return o(cVar, z, true);
    }

    f o(ax.U7.c cVar, boolean z, boolean z2) throws IOException {
        return k(cVar, z ? 1 : 0, z2);
    }

    f t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ax.U7.d<?> dVar = this.b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new ax.U7.b("No encoder for " + obj.getClass());
    }
}
