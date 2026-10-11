/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.SystemClock;
import ax.Ha.b;
import ax.Ha.c;
import ax.Q2.d;
import ax.W2.h;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

public class i {
    private static final Logger a = Logger.getLogger("FileManager.CommandManager");
    private static AtomicLong b = new AtomicLong(0L);
    private static HashMap<Long, h> c = new HashMap();
    private static long d;
    private static String e;

    private static void a(h object) {
        object = object.getClass().getName();
        Object object2 = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("command put : ");
        stringBuilder.append((String)object);
        ((Logger)object2).fine(stringBuilder.toString());
        long l8 = SystemClock.uptimeMillis();
        long l9 = d;
        if (l9 != 0L && (l9 = l8 - l9) < 300L) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("FAST COMMAND GENERATION : ");
            stringBuilder.append((String)object);
            ((Logger)object2).fine(stringBuilder.toString());
            l9 /= 100L;
            object2 = ax.Ha.c.h().f().d("!! FAST COMMAND GENERATION !!!!").j();
            stringBuilder = new StringBuilder();
            stringBuilder.append("command:");
            stringBuilder.append((String)object);
            stringBuilder.append(",prevcommand:");
            stringBuilder.append(e);
            stringBuilder.append(",delay:");
            stringBuilder.append(l9);
            ((b)object2).g(stringBuilder.toString()).h();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Fast command generation:command:");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(",prevcommand:");
            ((StringBuilder)object2).append(e);
            ((StringBuilder)object2).append(",delay:");
            ((StringBuilder)object2).append(l9);
            ax.Q2.d.c("fast command", new Exception(((StringBuilder)object2).toString()));
        }
        d = l8;
        e = object;
    }

    public static long b(h h8) {
        i.a(h8);
        return b.incrementAndGet();
    }

    public static h c(long l8) {
        return c.remove(l8);
    }

    public static void d(h h8) {
        c.put(h8.e(), h8);
    }
}

