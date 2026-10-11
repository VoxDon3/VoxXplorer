/*
 * Decompiled with CFR 0.152.
 */
package ax.b3;

import ax.Dc.w;
import ax.b3.D;
import ax.b3.F;
import ax.b3.I;
import ax.b3.e;
import ax.b3.j;
import ax.b3.n;
import ax.b3.q;
import ax.b3.s;
import ax.b3.t;
import ax.b3.x;
import ax.oc.a;
import ax.pb.a0;
import ax.zc.b;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

public class d {
    public static j a(String string, Exception exception) {
        j j8 = d.c(string, exception, false);
        if (j8 != null) {
            return j8;
        }
        return d.b(string, exception);
    }

    public static j b(String string, Exception exception) {
        if (d.e(exception)) {
            return new q(string, exception);
        }
        if (exception instanceof ax.p4.t) {
            return new q(string, exception);
        }
        Throwable throwable = exception.getCause();
        while (throwable != null) {
            if (d.e(throwable)) {
                return new q(string, exception);
            }
            if (throwable != throwable.getCause()) {
                throwable = throwable.getCause();
                continue;
            }
            throwable = null;
        }
        if (exception instanceof ax.c9.e ? exception.getMessage() != null && exception.getMessage().contains("Timeout expired") : (exception instanceof a0 ? ((a0)(throwable = (a0)exception)).d() instanceof ax.rb.d && (throwable = ((a0)throwable).d()).getMessage() != null && throwable.getMessage().contains("timedout waiting for response") : exception instanceof ax.rb.d && exception.getMessage() != null && exception.getMessage().contains("timedout waiting for response to"))) {
            return new q(string, exception);
        }
        return new j(string, exception);
    }

    public static j c(String string, Exception exception, boolean bl) {
        Object object = exception.getMessage();
        if (object != null) {
            if (((String)object).contains("ENOSPC")) {
                return new s(string, exception);
            }
            if (((String)object).contains("EACCES")) {
                return new e(string, exception);
            }
            if (((String)object).contains("EINVAL")) {
                return new n(string, exception);
            }
            if (((String)object).contains("EFBIG")) {
                return new D(string, exception);
            }
            if (((String)object).contains("EROFS")) {
                return new x(string, exception);
            }
            if (((String)object).contains("ENOENT")) {
                return new t(exception);
            }
            if (((String)object).contains("Read-only file system")) {
                return new x(string, exception);
            }
            if (((String)object).contains("No space left on device")) {
                return new s(string, exception);
            }
            if (((String)object).contains("Permission denied")) {
                return new e(string, exception);
            }
            if (exception instanceof w && ((String)object).contains("unsupported feature encryption used")) {
                return new F(string, exception);
            }
            if (exception instanceof b) {
                return new F(string, exception);
            }
            ((String)object).contains("EPERM");
        }
        if (exception instanceof a) {
            object = (a)exception;
            if (((a)object).a() == a.a.q) {
                return new I(exception);
            }
            if (((a)object).a() == a.a.g0) {
                return new F(exception);
            }
        }
        if (bl) {
            return new j(string, exception);
        }
        return null;
    }

    public static boolean d(Throwable throwable, Class<?> clazz) {
        while (throwable != null) {
            if (clazz.isInstance(throwable)) {
                return true;
            }
            Throwable throwable2 = throwable.getCause();
            if (throwable2 == throwable) break;
            throwable = throwable2;
        }
        return false;
    }

    public static boolean e(Throwable throwable) {
        if (throwable instanceof SocketException) {
            return true;
        }
        if (throwable instanceof SocketTimeoutException) {
            return true;
        }
        if (throwable instanceof UnknownHostException) {
            return true;
        }
        return throwable instanceof SSLException;
    }
}

