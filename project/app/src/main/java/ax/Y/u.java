/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class u {
    private static long a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class<Long> clazz = Long.TYPE;
                b = Trace.class.getMethod("isTagEnabled", clazz);
                Class<Integer> clazz2 = Integer.TYPE;
                c = Trace.class.getMethod("asyncTraceBegin", clazz, String.class, clazz2);
                d = Trace.class.getMethod("asyncTraceEnd", clazz, String.class, clazz2);
                e = Trace.class.getMethod("traceCounter", clazz, String.class, clazz2);
            }
            catch (Exception exception) {
                Log.i((String)"TraceCompat", (String)"Unable to initialize via reflection.", (Throwable)exception);
            }
        }
    }

    public static void a(String string) {
        Trace.beginSection((String)string);
    }

    public static void b() {
        Trace.endSection();
    }
}

