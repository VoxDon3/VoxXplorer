/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.Ob.h;
import ax.xc.A;
import ax.xc.B;
import ax.xc.C;
import ax.xc.D;
import ax.xc.o;
import ax.xc.p;
import ax.xc.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

final class q {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final /* synthetic */ Logger a() {
        return a;
    }

    public static final A b(File file) throws FileNotFoundException {
        l.f(file, "<this>");
        return p.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError object) {
        boolean bl;
        l.f(object, "<this>");
        return ((Throwable)object).getCause() != null && (bl = (object = ((Throwable)object).getMessage()) != null ? h.M((CharSequence)object, "getsockname failed", false, 2, null) : false);
    }

    public static final A d(File file, boolean bl) throws FileNotFoundException {
        l.f(file, "<this>");
        return p.g(new FileOutputStream(file, bl));
    }

    public static final A e(OutputStream outputStream) {
        l.f(outputStream, "<this>");
        return new t(outputStream, new D());
    }

    public static final A f(Socket closeable) throws IOException {
        l.f(closeable, "<this>");
        B b8 = new B((Socket)closeable);
        closeable = closeable.getOutputStream();
        l.e(closeable, "getOutputStream(...)");
        return b8.sink(new t((OutputStream)closeable, b8));
    }

    public static /* synthetic */ A g(File file, boolean bl, int n8, Object object) throws FileNotFoundException {
        if ((n8 & 1) != 0) {
            bl = false;
        }
        return p.f(file, bl);
    }

    public static final C h(File file) throws FileNotFoundException {
        l.f(file, "<this>");
        return new o(new FileInputStream(file), D.NONE);
    }

    public static final C i(InputStream inputStream) {
        l.f(inputStream, "<this>");
        return new o(inputStream, new D());
    }

    public static final C j(Socket closeable) throws IOException {
        l.f(closeable, "<this>");
        B b8 = new B((Socket)closeable);
        closeable = closeable.getInputStream();
        l.e(closeable, "getInputStream(...)");
        return b8.source(new o((InputStream)closeable, b8));
    }
}

