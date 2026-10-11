/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import ax.S5.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class l {
    private final Context a;
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();

    l(Application application) {
        this.a = application.getApplicationContext();
    }

    public final Object a(String object) {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() != null && (object = ((Bundle)atomicReference.get()).get((String)object)) != null) {
            if (object instanceof Boolean) {
                return (Boolean)object;
            }
            if (object instanceof String) {
                return (String)object;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final void b(Context context) {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            Throwable var1_4;
            try {
                atomicReference.set(ax.S5.e.a((Context)context).b((String)context.getPackageName(), (int)128).metaData);
                return;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
            Log.w((String)"UserMessagingPlatform", (String)"Failed to get metadata. ", (Throwable)var1_4);
        }
    }

    public final void c(Map object) {
        Log.d((String)"UserMessagingPlatform", (String)"Update Firebase: ".concat(object.toString()));
        HashMap<Enum, Enum> hashMap = new HashMap<Enum, Enum>();
        for (String string : object.keySet()) {
            try {
                hashMap.put((Enum)((Method)this.e.get()).invoke(null, string), (Enum)((Method)this.d.get()).invoke(null, object.get(string)));
            }
            catch (Exception exception) {
                Log.w((String)"UserMessagingPlatform", (String)"Failed to invoke the Firebase static method.", (Throwable)exception);
            }
        }
        object = this.c;
        if (((AtomicReference)object).get() != null && !hashMap.isEmpty()) {
            try {
                ((Method)((AtomicReference)object).get()).invoke(this.b.get(), hashMap);
            }
            catch (Exception exception) {
                Log.w((String)"UserMessagingPlatform", (String)"Failed to invoke Firebase method. ", (Throwable)exception);
            }
        }
    }

    public final boolean d() {
        Object object = this.g;
        if (((AtomicReference)object).get() != null) {
            return (Boolean)((AtomicReference)object).get();
        }
        Object object2 = this.a;
        if (object2 == null) {
            ((AtomicReference)object).set(Boolean.FALSE);
            return false;
        }
        try {
            object = FirebaseAnalytics.class.getDeclaredMethod("getInstance", Context.class);
            this.b.set(((Method)object).invoke(null, object2));
            object2 = FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class);
            this.c.set(object2);
            object2 = FirebaseAnalytics.a.q;
            object2 = FirebaseAnalytics.b.q;
            object = FirebaseAnalytics.a.class.getDeclaredMethod("valueOf", String.class);
            object2 = FirebaseAnalytics.b.class.getDeclaredMethod("valueOf", String.class);
            this.d.set(object);
            this.e.set(object2);
            this.g.set(Boolean.TRUE);
            return true;
        }
        catch (Exception exception) {
            Log.w((String)"UserMessagingPlatform", (String)"No Firebase class found. ", (Throwable)exception);
            this.g.set(Boolean.FALSE);
            return false;
        }
    }
}

