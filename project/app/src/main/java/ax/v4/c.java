/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import ax.T4.f;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public abstract class c<T> {
    private static final Charset a = Charset.forName("UTF-8");

    protected static void d(j j8) throws IOException, i {
        if (j8.j() == m.o0) {
            j8.H();
            return;
        }
        throw new i(j8, "expected end of array value.");
    }

    protected static void e(j j8) throws IOException, i {
        if (j8.j() == m.m0) {
            j8.H();
            return;
        }
        throw new i(j8, "expected end of object value.");
    }

    protected static void f(String charSequence, j j8) throws IOException, i {
        if (j8.j() == m.p0) {
            if (((String)charSequence).equals(j8.g())) {
                j8.H();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected field '");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("', but was: '");
            stringBuilder.append(j8.g());
            stringBuilder.append("'");
            throw new i(j8, stringBuilder.toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("expected field name, but was: ");
        ((StringBuilder)charSequence).append((Object)j8.j());
        throw new i(j8, ((StringBuilder)charSequence).toString());
    }

    protected static void g(j j8) throws IOException, i {
        if (j8.j() == m.n0) {
            j8.H();
            return;
        }
        throw new i(j8, "expected array value.");
    }

    protected static void h(j j8) throws IOException, i {
        if (j8.j() == m.l0) {
            j8.H();
            return;
        }
        throw new i(j8, "expected object value.");
    }

    protected static String i(j j8) throws IOException, i {
        if (j8.j() == m.r0) {
            return j8.u();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected string value, but was ");
        stringBuilder.append((Object)j8.j());
        throw new i(j8, stringBuilder.toString());
    }

    protected static void n(j j8) throws IOException, i {
        while (j8.j() != null && !j8.j().l()) {
            if (j8.j().n()) {
                j8.L();
                j8.H();
                continue;
            }
            if (j8.j() == m.p0) {
                j8.H();
                continue;
            }
            if (j8.j().j()) {
                j8.H();
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't skip token: ");
            stringBuilder.append((Object)j8.j());
            throw new i(j8, stringBuilder.toString());
        }
    }

    protected static void o(j j8) throws IOException, i {
        if (j8.j().n()) {
            j8.L();
            j8.H();
            return;
        }
        if (j8.j().j()) {
            j8.H();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't skip JSON value token: ");
        stringBuilder.append((Object)j8.j());
        throw new i(j8, stringBuilder.toString());
    }

    public abstract T a(j var1) throws IOException, i;

    public T b(InputStream closeable) throws IOException, i {
        closeable = g.a.s((InputStream)closeable);
        ((j)closeable).H();
        return this.a((j)closeable);
    }

    public T c(String object) throws i {
        i i82;
        block3: {
            try {
                object = g.a.u((String)object);
                ((j)object).H();
                object = this.a((j)object);
            }
            catch (IOException iOException) {
            }
            catch (i i82) {
                break block3;
            }
            return (T)object;
            throw new IllegalStateException("Impossible I/O exception", iOException);
        }
        throw i82;
    }

    public String j(T t8, boolean bl) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.m(t8, byteArrayOutputStream, bl);
            return new String(byteArrayOutputStream.toByteArray(), a);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Impossible I/O exception", iOException);
        }
        catch (f f8) {
            throw new IllegalStateException("Impossible JSON exception", f8);
        }
    }

    public abstract void k(T var1, ax.T4.g var2) throws IOException, f;

    public void l(T t8, OutputStream outputStream) throws IOException {
        this.m(t8, outputStream, false);
    }

    public void m(T t8, OutputStream closeable, boolean bl) throws IOException {
        closeable = g.a.p((OutputStream)closeable);
        if (bl) {
            ((ax.T4.g)closeable).f();
        }
        try {
            this.k(t8, (ax.T4.g)closeable);
            ((ax.T4.g)closeable).flush();
            return;
        }
        catch (f f8) {
            throw new IllegalStateException("Impossible JSON generation exception", f8);
        }
    }
}

