package ax.xc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class q {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final InterfaceC3482A b(File file) throws FileNotFoundException {
        ax.Gb.l.f(file, "<this>");
        return p.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        ax.Gb.l.f(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? ax.Ob.h.M(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final InterfaceC3482A d(File file, boolean z) throws FileNotFoundException {
        ax.Gb.l.f(file, "<this>");
        return p.g(new FileOutputStream(file, z));
    }

    public static final InterfaceC3482A e(OutputStream outputStream) {
        ax.Gb.l.f(outputStream, "<this>");
        return new t(outputStream, new D());
    }

    public static final InterfaceC3482A f(Socket socket) throws IOException {
        ax.Gb.l.f(socket, "<this>");
        B b = new B(socket);
        OutputStream outputStream = socket.getOutputStream();
        ax.Gb.l.e(outputStream, "getOutputStream(...)");
        return b.sink(new t(outputStream, b));
    }

    public static /* synthetic */ InterfaceC3482A g(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return p.f(file, z);
    }

    public static final C h(File file) throws FileNotFoundException {
        ax.Gb.l.f(file, "<this>");
        return new o(new FileInputStream(file), D.NONE);
    }

    public static final C i(InputStream inputStream) {
        ax.Gb.l.f(inputStream, "<this>");
        return new o(inputStream, new D());
    }

    public static final C j(Socket socket) throws IOException {
        ax.Gb.l.f(socket, "<this>");
        B b = new B(socket);
        InputStream inputStream = socket.getInputStream();
        ax.Gb.l.e(inputStream, "getInputStream(...)");
        return b.source(new o(inputStream, b));
    }
}
