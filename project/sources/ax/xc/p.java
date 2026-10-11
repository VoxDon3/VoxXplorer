package ax.xc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class p {
    public static final InterfaceC3482A a(File file) throws FileNotFoundException {
        return q.b(file);
    }

    public static final InterfaceC3482A b() {
        return r.a();
    }

    public static final InterfaceC3488f c(InterfaceC3482A interfaceC3482A) {
        return r.b(interfaceC3482A);
    }

    public static final g d(C c) {
        return r.c(c);
    }

    public static final boolean e(AssertionError assertionError) {
        return q.c(assertionError);
    }

    public static final InterfaceC3482A f(File file, boolean z) throws FileNotFoundException {
        return q.d(file, z);
    }

    public static final InterfaceC3482A g(OutputStream outputStream) {
        return q.e(outputStream);
    }

    public static final InterfaceC3482A h(Socket socket) throws IOException {
        return q.f(socket);
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
