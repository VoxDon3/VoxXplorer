package ax.W7;

import ax.U7.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements ax.V7.b<d> {
    private static final ax.U7.d<Object> e = new ax.U7.d() { // from class: ax.W7.a
        @Override // ax.U7.d
        public final void a(Object obj, Object obj2) {
            d.c(obj, (ax.U7.e) obj2);
        }
    };
    private static final ax.U7.f<String> f = new ax.U7.f() { // from class: ax.W7.b
        @Override // ax.U7.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).f((String) obj);
        }
    };
    private static final ax.U7.f<Boolean> g = new ax.U7.f() { // from class: ax.W7.c
        @Override // ax.U7.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).g(((Boolean) obj).booleanValue());
        }
    };
    private static final b h = new b(null);
    private final Map<Class<?>, ax.U7.d<?>> a = new HashMap();
    private final Map<Class<?>, ax.U7.f<?>> b = new HashMap();
    private ax.U7.d<Object> c = e;
    private boolean d = false;

    class a implements ax.U7.a {
        a() {
        }

        @Override // ax.U7.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.a, d.this.b, d.this.c, d.this.d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // ax.U7.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements ax.U7.f<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // ax.U7.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) throws IOException {
            gVar.f(a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f);
        m(Boolean.class, g);
        m(Date.class, h);
    }

    public static /* synthetic */ void c(Object obj, ax.U7.e eVar) {
        throw new ax.U7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public ax.U7.a i() {
        return new a();
    }

    public d j(ax.V7.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // ax.V7.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, ax.U7.d<? super T> dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, ax.U7.f<? super T> fVar) {
        this.b.put(cls, fVar);
        this.a.remove(cls);
        return this;
    }
}
