package ax.a6;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.a6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1409l {
    private final Context a;
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();

    C1409l(Application application) {
        this.a = application.getApplicationContext();
    }

    public final Object a(String str) {
        Object obj;
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null || (obj = ((Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void b(Context context) {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(ax.S5.e.a(context).b(context.getPackageName(), 128).metaData);
            } catch (PackageManager.NameNotFoundException | NullPointerException e) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e);
            }
        }
    }

    public final void c(Map map) {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            try {
                hashMap.put((Enum) ((Method) this.e.get()).invoke(null, str), (Enum) ((Method) this.d.get()).invoke(null, map.get(str)));
            } catch (Exception e) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
            }
        }
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null || hashMap.isEmpty()) {
            return;
        }
        try {
            ((Method) atomicReference.get()).invoke(this.b.get(), hashMap);
        } catch (Exception e2) {
            Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e2);
        }
    }

    public final boolean d() {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.a;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            this.b.set(FirebaseAnalytics.class.getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            this.c.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
            FirebaseAnalytics.a aVar = FirebaseAnalytics.a.GRANTED;
            FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_STORAGE;
            Method declaredMethod = FirebaseAnalytics.a.class.getDeclaredMethod("valueOf", String.class);
            Method declaredMethod2 = FirebaseAnalytics.b.class.getDeclaredMethod("valueOf", String.class);
            this.d.set(declaredMethod);
            this.e.set(declaredMethod2);
            this.g.set(Boolean.TRUE);
            return true;
        } catch (Exception e) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
            this.g.set(Boolean.FALSE);
            return false;
        }
    }
}
