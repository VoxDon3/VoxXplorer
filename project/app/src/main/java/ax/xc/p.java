/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.A;
import ax.xc.C;
import ax.xc.f;
import ax.xc.g;
import ax.xc.q;
import ax.xc.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class p {
    public static final A a(File file) throws FileNotFoundException {
        return q.b(file);
    }

    public static final A b() {
        return r.a();
    }

    public static final f c(A a8) {
        return r.b(a8);
    }

    public static final g d(C c8) {
        return r.c(c8);
    }

    public static final boolean e(AssertionError assertionError) {
        return q.c(assertionError);
    }

    public static final A f(File file, boolean bl) throws FileNotFoundException {
        return q.d(file, bl);
    }

    public static final A g(OutputStream outputStream) {
        return q.e(outputStream);
    }

    public static final A h(Socket socket) throws IOException {
        return q.f(socket);
    }

    public static /* synthetic */ A i(File file, boolean bl, int n8, Object object) throws FileNotFoundException {
        return q.g(file, bl, n8, object);
    }

    public static final C j(File file) throws FileNotFoundException {
        return q.h(file);
    }

    public static final C k(InputStream inputStream) {
        return q.i(inputStream);
    }

    public static final C l(Socket socket) throws IOException {
        return q.j(socket);
    }
}

