/*
 * Decompiled with CFR 0.152.
 */
package ax.W7;

import ax.U7.f;
import ax.U7.g;
import ax.W7.a;
import ax.W7.c;
import ax.W7.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class d
implements ax.V7.b<d> {
    private static final ax.U7.d<Object> e = new a();
    private static final f<String> f = new ax.W7.b();
    private static final f<Boolean> g = new c();
    private static final b h = new b();
    private final Map<Class<?>, ax.U7.d<?>> a = new HashMap();
    private final Map<Class<?>, f<?>> b = new HashMap();
    private ax.U7.d<Object> c = e;
    private boolean d = false;

    public d() {
        this.m(String.class, f);
        this.m(Boolean.class, g);
        this.m(Date.class, h);
    }

    public static /* synthetic */ void b(Boolean bl, g g8) {
        g8.g(bl);
    }

    public static /* synthetic */ void c(Object object, ax.U7.e object2) {
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Couldn't find encoder for type ");
        ((StringBuilder)object2).append(object.getClass().getCanonicalName());
        throw new ax.U7.b(((StringBuilder)object2).toString());
    }

    public static /* synthetic */ void d(String string, g g8) {
        g8.f(string);
    }

    public ax.U7.a i() {
        return new ax.U7.a(this){
            final d a;
            {
                this.a = d8;
            }

            @Override
            public void a(Object object, Writer object2) throws IOException {
                object2 = new e((Writer)object2, this.a.a, this.a.b, this.a.c, this.a.d);
                ((e)object2).k(object, false);
                ((e)object2).u();
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public String b(Object object) {
                StringWriter stringWriter = new StringWriter();
                try {
                    this.a(object, stringWriter);
                    return stringWriter.toString();
                }
                catch (IOException iOException) {
                    return stringWriter.toString();
                }
            }
        };
    }

    public d j(ax.V7.a a8) {
        a8.a(this);
        return this;
    }

    public d k(boolean bl) {
        this.d = bl;
        return this;
    }

    public <T> d l(Class<T> clazz, ax.U7.d<? super T> d8) {
        this.a.put(clazz, d8);
        this.b.remove(clazz);
        return this;
    }

    public <T> d m(Class<T> clazz, f<? super T> f8) {
        this.b.put(clazz, f8);
        this.a.remove(clazz);
        return this;
    }

    private static final class b
    implements f<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        }

        private b() {
        }

        public void b(Date date, g g8) throws IOException {
            g8.f(a.format(date));
        }
    }
}

