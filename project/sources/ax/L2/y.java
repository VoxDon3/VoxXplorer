package ax.L2;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y {
    private static final String a;

    static {
        String i = ax.B2.i.i("WakeLocks");
        ax.Gb.l.e(i, "tagWithPrefix(\"WakeLocks\")");
        a = i;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z zVar = z.a;
        synchronized (zVar) {
            linkedHashMap.putAll(zVar.a());
            ax.sb.t tVar = ax.sb.t.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                ax.B2.i.e().k(a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        z zVar = z.a;
        synchronized (zVar) {
            zVar.a().put(newWakeLock, str2);
        }
        ax.Gb.l.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
