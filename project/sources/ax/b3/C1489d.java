package ax.b3;

import ax.Dc.C0687w;
import ax.oc.C2743a;
import ax.pb.C2794a0;
import ax.rb.C3025d;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* renamed from: ax.b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1489d {
    public static C1495j a(String str, Exception exc) {
        C1495j c = c(str, exc, false);
        return c != null ? c : b(str, exc);
    }

    public static C1495j b(String str, Exception exc) {
        if (e(exc)) {
            return new q(str, exc);
        }
        if (exc instanceof ax.p4.t) {
            return new q(str, exc);
        }
        Throwable cause = exc.getCause();
        while (cause != null) {
            if (e(cause)) {
                return new q(str, exc);
            }
            cause = cause != cause.getCause() ? cause.getCause() : null;
        }
        if (exc instanceof ax.c9.e) {
            if (exc.getMessage() != null && exc.getMessage().contains("Timeout expired")) {
                return new q(str, exc);
            }
        } else if (exc instanceof C2794a0) {
            C2794a0 c2794a0 = (C2794a0) exc;
            if (c2794a0.d() instanceof C3025d) {
                Throwable d = c2794a0.d();
                if (d.getMessage() != null && d.getMessage().contains("timedout waiting for response")) {
                    return new q(str, exc);
                }
            }
        } else if ((exc instanceof C3025d) && exc.getMessage() != null && exc.getMessage().contains("timedout waiting for response to")) {
            return new q(str, exc);
        }
        return new C1495j(str, exc);
    }

    public static C1495j c(String str, Exception exc, boolean z) {
        String message = exc.getMessage();
        if (message != null) {
            if (message.contains("ENOSPC")) {
                return new s(str, exc);
            }
            if (message.contains("EACCES")) {
                return new C1490e(str, exc);
            }
            if (message.contains("EINVAL")) {
                return new n(str, exc);
            }
            if (message.contains("EFBIG")) {
                return new D(str, exc);
            }
            if (message.contains("EROFS")) {
                return new x(str, exc);
            }
            if (message.contains("ENOENT")) {
                return new t(exc);
            }
            if (message.contains("Read-only file system")) {
                return new x(str, exc);
            }
            if (message.contains("No space left on device")) {
                return new s(str, exc);
            }
            if (message.contains("Permission denied")) {
                return new C1490e(str, exc);
            }
            if ((exc instanceof C0687w) && message.contains("unsupported feature encryption used")) {
                return new F(str, exc);
            }
            if (exc instanceof ax.zc.b) {
                return new F(str, exc);
            }
            message.contains("EPERM");
        }
        if (exc instanceof C2743a) {
            C2743a c2743a = (C2743a) exc;
            if (c2743a.a() == C2743a.EnumC0408a.WRONG_PASSWORD) {
                return new I(exc);
            }
            if (c2743a.a() == C2743a.EnumC0408a.UNSUPPORTED_ENCRYPTION) {
                return new F(exc);
            }
        }
        if (z) {
            return new C1495j(str, exc);
        }
        return null;
    }

    public static boolean d(Throwable th, Class<?> cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            Throwable cause = th.getCause();
            if (cause == th) {
                return false;
            }
            th = cause;
        }
        return false;
    }

    public static boolean e(Throwable th) {
        return (th instanceof SocketException) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof SSLException);
    }
}
