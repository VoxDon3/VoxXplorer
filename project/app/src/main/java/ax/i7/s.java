/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.A;
import ax.i7.d;
import ax.i7.h;
import ax.i7.m;
import ax.i7.o;
import ax.i7.p;
import ax.i7.v;
import ax.i7.w;
import ax.m7.l;
import ax.m7.z;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class s {
    private InputStream a;
    private final String b;
    private final String c;
    private final o d;
    A e;
    private final int f;
    private final String g;
    private final p h;
    private final boolean i;
    private int j;
    private boolean k;
    private boolean l;

    s(p p8, A object) throws IOException {
        Object object2;
        StringBuilder stringBuilder;
        String string;
        this.h = p8;
        this.i = p8.l();
        this.j = p8.d();
        this.k = p8.s();
        this.e = object;
        this.b = ((A)object).c();
        int n8 = ((A)object).j();
        int n9 = 0;
        int n10 = n8;
        if (n8 < 0) {
            n10 = 0;
        }
        this.f = n10;
        this.g = string = ((A)object).i();
        Logger logger = w.a;
        n8 = n9;
        if (this.k) {
            n8 = n9;
            if (logger.isLoggable(Level.CONFIG)) {
                n8 = 1;
            }
        }
        CharSequence charSequence = null;
        if (n8 != 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("-------------- RESPONSE --------------");
            object2 = z.a;
            stringBuilder.append((String)object2);
            String string2 = ((A)object).k();
            if (string2 != null) {
                stringBuilder.append(string2);
            } else {
                stringBuilder.append(n10);
                if (string != null) {
                    stringBuilder.append(' ');
                    stringBuilder.append(string);
                }
            }
            stringBuilder.append((String)object2);
        } else {
            stringBuilder = null;
        }
        object2 = p8.j();
        if (n8 != 0) {
            charSequence = stringBuilder;
        }
        ((m)object2).l((A)object, (StringBuilder)charSequence);
        charSequence = ((A)object).e();
        object = charSequence;
        if (charSequence == null) {
            object = p8.j().n();
        }
        this.c = object;
        this.d = s.o((String)object);
        if (n8 != 0) {
            logger.config(stringBuilder.toString());
        }
    }

    private boolean j() throws IOException {
        int n8 = this.h();
        if (!this.g().i().equals("HEAD") && n8 / 100 != 1 && n8 != 204 && n8 != 304) {
            return true;
        }
        this.k();
        return false;
    }

    private static o o(String object) {
        if (object == null) {
            return null;
        }
        try {
            object = new o((String)object);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public void a() throws IOException {
        this.k();
        this.e.a();
    }

    public void b(OutputStream outputStream) throws IOException {
        ax.m7.l.b(this.c(), outputStream);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream c() throws IOException {
        block11: {
            block10: {
                if (this.l) break block11;
                InputStream inputStream = this.e.b();
                if (inputStream != null) {
                    Throwable throwable22222;
                    Object object;
                    InputStream inputStream2;
                    InputStream inputStream3;
                    InputStream inputStream4;
                    block8: {
                        block9: {
                            inputStream4 = inputStream;
                            inputStream3 = inputStream;
                            inputStream2 = inputStream;
                            try {
                                if (this.i) break block8;
                                inputStream4 = inputStream;
                                inputStream2 = inputStream;
                                object = this.b;
                                inputStream3 = inputStream;
                                if (object == null) break block8;
                                inputStream4 = inputStream;
                                inputStream2 = inputStream;
                                object = ((String)object).trim().toLowerCase(Locale.ENGLISH);
                                inputStream4 = inputStream;
                                inputStream2 = inputStream;
                                if ("gzip".equals(object)) break block9;
                                inputStream4 = inputStream;
                                inputStream3 = inputStream;
                                inputStream2 = inputStream;
                                if (!"x-gzip".equals(object)) break block8;
                            }
                            catch (Throwable throwable22222) {
                            }
                        }
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        inputStream3 = new d(inputStream);
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        inputStream3 = ax.i7.h.a(inputStream3);
                    }
                    inputStream4 = inputStream3;
                    inputStream2 = inputStream3;
                    Logger logger = w.a;
                    inputStream4 = inputStream3;
                    inputStream = inputStream3;
                    inputStream2 = inputStream3;
                    if (this.k) {
                        inputStream4 = inputStream3;
                        inputStream2 = inputStream3;
                        object = Level.CONFIG;
                        inputStream4 = inputStream3;
                        inputStream = inputStream3;
                        inputStream2 = inputStream3;
                        if (logger.isLoggable((Level)object)) {
                            inputStream4 = inputStream3;
                            inputStream2 = inputStream3;
                            inputStream4 = inputStream3;
                            inputStream2 = inputStream3;
                            inputStream = new ax.m7.p(inputStream3, logger, (Level)object, this.j);
                        }
                    }
                    inputStream4 = inputStream;
                    inputStream2 = inputStream;
                    if (this.i) {
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        this.a = inputStream;
                        break block10;
                    } else {
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        inputStream3 = new BufferedInputStream(inputStream);
                        inputStream4 = inputStream;
                        inputStream2 = inputStream;
                        this.a = inputStream3;
                    }
                    break block10;
                    catch (EOFException eOFException) {
                        inputStream2.close();
                        break block10;
                    }
                    inputStream4.close();
                    throw throwable22222;
                }
            }
            this.l = true;
        }
        return this.a;
    }

    public Charset d() {
        o o8 = this.d;
        if (o8 != null) {
            if (o8.e() != null) {
                return this.d.e();
            }
            if ("application".equals(this.d.h()) && "json".equals(this.d.g())) {
                return StandardCharsets.UTF_8;
            }
            if ("text".equals(this.d.h()) && "csv".equals(this.d.g())) {
                return StandardCharsets.UTF_8;
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public String e() {
        return this.c;
    }

    public m f() {
        return this.h.j();
    }

    public p g() {
        return this.h;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public void k() throws IOException {
        Object object = this.e;
        if (object != null && (object = ((A)object).b()) != null) {
            ((InputStream)object).close();
        }
    }

    public boolean l() {
        return v.b(this.f);
    }

    public <T> T m(Class<T> clazz) throws IOException {
        if (!this.j()) {
            return null;
        }
        return this.h.h().a(this.c(), this.d(), clazz);
    }

    public String n() throws IOException {
        InputStream inputStream = this.c();
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ax.m7.l.b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString(this.d().name());
    }
}

