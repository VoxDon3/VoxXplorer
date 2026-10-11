/*
 * Decompiled with CFR 0.152.
 */
package ax.u2;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import ax.u2.a;
import ax.u2.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {
    private static long a;
    private static Method b;

    public static void a(String string) {
        c.a(string);
    }

    public static void b() {
        c.b();
    }

    private static void c(String object, Exception exception) {
        if (exception instanceof InvocationTargetException) {
            object = exception.getCause();
            if (object instanceof RuntimeException) {
                throw (RuntimeException)object;
            }
            throw new RuntimeException((Throwable)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to call ");
        stringBuilder.append((String)object);
        stringBuilder.append(" via reflection");
        Log.v((String)"Trace", (String)stringBuilder.toString(), (Throwable)exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"NewApi"})
    public static boolean d() {
        try {
            if (b != null) return ax.u2.b.e();
            return ax.u2.a.a();
        }
        catch (NoClassDefFoundError | NoSuchMethodError linkageError) {
            return ax.u2.b.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean e() {
        try {
            if (b != null) return (Boolean)b.invoke(null, a);
            a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            return (Boolean)b.invoke(null, a);
        }
        catch (Exception exception) {}
        ax.u2.b.c("isTagEnabled", exception);
        return false;
    }
}

