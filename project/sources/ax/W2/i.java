package ax.W2;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class i {
    private static final Logger a = Logger.getLogger("FileManager.CommandManager");
    private static AtomicLong b = new AtomicLong(0);
    private static HashMap<Long, h> c = new HashMap<>();
    private static long d;
    private static String e;

    private static void a(h hVar) {
        String name = hVar.getClass().getName();
        Logger logger = a;
        logger.fine("command put : " + name);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = d;
        if (j != 0) {
            long j2 = uptimeMillis - j;
            if (j2 < 300) {
                logger.fine("FAST COMMAND GENERATION : " + name);
                long j3 = j2 / 100;
                ax.Ha.c.h().f().d("!! FAST COMMAND GENERATION !!!!").j().g("command:" + name + ",prevcommand:" + e + ",delay:" + j3).h();
                ax.Q2.d.c("fast command", new Exception("Fast command generation:command:" + name + ",prevcommand:" + e + ",delay:" + j3));
            }
        }
        d = uptimeMillis;
        e = name;
    }

    public static long b(h hVar) {
        a(hVar);
        return b.incrementAndGet();
    }

    public static h c(long j) {
        return c.remove(Long.valueOf(j));
    }

    public static void d(h hVar) {
        c.put(Long.valueOf(hVar.e()), hVar);
    }
}
