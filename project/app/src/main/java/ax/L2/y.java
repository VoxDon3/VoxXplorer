/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.content.Context;
import android.os.PowerManager;
import ax.B2.i;
import ax.Gb.l;
import ax.L2.z;
import ax.sb.t;
import java.util.LinkedHashMap;
import java.util.Map;

public final class y {
    private static final String a;

    static {
        String string = i.i("WakeLocks");
        l.e(string, "tagWithPrefix(\"WakeLocks\")");
        a = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a() {
        Object object = new LinkedHashMap();
        Object z8 = z.a;
        synchronized (z8) {
            object.putAll(((z)z8).a());
            t object2 = t.a;
        }
        z8 = object.entrySet().iterator();
        while (z8.hasNext()) {
            Map.Entry entry = (Map.Entry)z8.next();
            object = (PowerManager.WakeLock)entry.getKey();
            String string = (String)entry.getValue();
            if (object == null || !object.isHeld()) continue;
            i i8 = i.e();
            String string2 = a;
            object = new StringBuilder();
            ((StringBuilder)object).append("WakeLock held for ");
            ((StringBuilder)object).append(string);
            i8.k(string2, ((StringBuilder)object).toString());
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final PowerManager.WakeLock b(Context object, String string) {
        l.f(object, "context");
        l.f(string, "tag");
        object = object.getApplicationContext().getSystemService("power");
        l.d(object, "null cannot be cast to non-null type android.os.PowerManager");
        object = (PowerManager)object;
        CharSequence charSequence = new StringBuilder();
        charSequence.append("WorkManager: ");
        charSequence.append(string);
        charSequence = charSequence.toString();
        string = object.newWakeLock(1, (String)charSequence);
        object = z.a;
        synchronized (object) {
            charSequence = ((z)object).a().put((PowerManager.WakeLock)string, (String)charSequence);
        }
        l.e(string, "wakeLock");
        return string;
    }
}

