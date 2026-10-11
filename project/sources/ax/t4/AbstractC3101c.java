package ax.t4;

import ax.T4.g;
import ax.w4.C3344d;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.TimeZone;

/* renamed from: ax.t4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3101c<T> {
    private static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");
    private static final String[] b = {null, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String[] c = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", null};

    public abstract void a(T t, g gVar) throws IOException;

    public final String b(T t) {
        return c(t, true);
    }

    public final String c(T t, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g p = AbstractC3100b.l.p(byteArrayOutputStream);
            if (z) {
                p = p.f();
            }
            try {
                a(t, p);
                p.flush();
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (Throwable th) {
                p.flush();
                throw th;
            }
        } catch (IOException e) {
            throw C3344d.a("Impossible", e);
        }
    }
}
