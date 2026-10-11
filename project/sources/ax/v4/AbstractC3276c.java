package ax.v4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: ax.v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3276c<T> {
    private static final Charset a = Charset.forName("UTF-8");

    protected static void d(j jVar) throws IOException, i {
        if (jVar.j() != m.END_ARRAY) {
            throw new i(jVar, "expected end of array value.");
        }
        jVar.H();
    }

    protected static void e(j jVar) throws IOException, i {
        if (jVar.j() != m.END_OBJECT) {
            throw new i(jVar, "expected end of object value.");
        }
        jVar.H();
    }

    protected static void f(String str, j jVar) throws IOException, i {
        if (jVar.j() != m.FIELD_NAME) {
            throw new i(jVar, "expected field name, but was: " + jVar.j());
        }
        if (str.equals(jVar.g())) {
            jVar.H();
            return;
        }
        throw new i(jVar, "expected field '" + str + "', but was: '" + jVar.g() + "'");
    }

    protected static void g(j jVar) throws IOException, i {
        if (jVar.j() != m.START_ARRAY) {
            throw new i(jVar, "expected array value.");
        }
        jVar.H();
    }

    protected static void h(j jVar) throws IOException, i {
        if (jVar.j() != m.START_OBJECT) {
            throw new i(jVar, "expected object value.");
        }
        jVar.H();
    }

    protected static String i(j jVar) throws IOException, i {
        if (jVar.j() == m.VALUE_STRING) {
            return jVar.u();
        }
        throw new i(jVar, "expected string value, but was " + jVar.j());
    }

    protected static void n(j jVar) throws IOException, i {
        while (jVar.j() != null && !jVar.j().l()) {
            if (jVar.j().n()) {
                jVar.L();
                jVar.H();
            } else if (jVar.j() == m.FIELD_NAME) {
                jVar.H();
            } else {
                if (!jVar.j().j()) {
                    throw new i(jVar, "Can't skip token: " + jVar.j());
                }
                jVar.H();
            }
        }
    }

    protected static void o(j jVar) throws IOException, i {
        if (jVar.j().n()) {
            jVar.L();
            jVar.H();
        } else {
            if (jVar.j().j()) {
                jVar.H();
                return;
            }
            throw new i(jVar, "Can't skip JSON value token: " + jVar.j());
        }
    }

    public abstract T a(j jVar) throws IOException, i;

    public T b(InputStream inputStream) throws IOException, i {
        j s = g.a.s(inputStream);
        s.H();
        return a(s);
    }

    public T c(String str) throws i {
        try {
            j u = g.a.u(str);
            u.H();
            return a(u);
        } catch (i e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalStateException("Impossible I/O exception", e2);
        }
    }

    public String j(T t, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m(t, byteArrayOutputStream, z);
            return new String(byteArrayOutputStream.toByteArray(), a);
        } catch (ax.T4.f e) {
            throw new IllegalStateException("Impossible JSON exception", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Impossible I/O exception", e2);
        }
    }

    public abstract void k(T t, ax.T4.g gVar) throws IOException, ax.T4.f;

    public void l(T t, OutputStream outputStream) throws IOException {
        m(t, outputStream, false);
    }

    public void m(T t, OutputStream outputStream, boolean z) throws IOException {
        ax.T4.g p = g.a.p(outputStream);
        if (z) {
            p.f();
        }
        try {
            k(t, p);
            p.flush();
        } catch (ax.T4.f e) {
            throw new IllegalStateException("Impossible JSON generation exception", e);
        }
    }
}
