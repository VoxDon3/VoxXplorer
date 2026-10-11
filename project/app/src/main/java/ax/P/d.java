/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class d {
    protected static final Class<?> a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    private static final Handler g;

    static {
        g = new Handler(Looper.getMainLooper());
        Class<?> clazz = ax.P.d.a();
        a = clazz;
        b = ax.P.d.b();
        c = ax.P.d.f();
        d = ax.P.d.d(clazz);
        e = ax.P.d.c(clazz);
        f = ax.P.d.e(clazz);
    }

    private static Class<?> a() {
        try {
            Class<?> clazz = Class.forName("android.app.ActivityThread");
            return clazz;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field field = Activity.class.getDeclaredField("mMainThread");
            ((AccessibleObject)field).setAccessible(true);
            return field;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Method c(Class<?> genericDeclaration) {
        if (genericDeclaration == null) {
            return null;
        }
        try {
            genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            return genericDeclaration;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Method d(Class<?> genericDeclaration) {
        if (genericDeclaration == null) {
            return null;
        }
        try {
            genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            return genericDeclaration;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Method e(Class<?> genericDeclaration) {
        if (!ax.P.d.g()) return null;
        if (genericDeclaration == null) {
            return null;
        }
        try {
            Class<Integer> clazz = Integer.TYPE;
            Class<Boolean> clazz2 = Boolean.TYPE;
            genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, clazz, clazz2, Configuration.class, Configuration.class, clazz2, clazz2);
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            return genericDeclaration;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Field f() {
        try {
            Field field = Activity.class.getDeclaredField("mToken");
            ((AccessibleObject)field).setAccessible(true);
            return field;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static boolean g() {
        int n8 = Build.VERSION.SDK_INT;
        return n8 == 26 || n8 == 27;
        {
        }
    }

    protected static boolean h(Object runnable2, int n8, Activity activity) {
        Throwable throwable2;
        block5: {
            block4: {
                Object object;
                try {
                    object = c.get(activity);
                    if (object != runnable2) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (activity.hashCode() == n8) {
                    Object object2 = b.get(activity);
                    activity = g;
                    runnable2 = new Runnable(){
                        final Object c0;
                        final Object q;
                        {
                            this.q = object;
                            this.c0 = object2;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void run() {
                            RuntimeException runtimeException2;
                            block5: {
                                Throwable throwable2;
                                block4: {
                                    try {
                                        Method method = d;
                                        if (method != null) {
                                            method.invoke(this.q, this.c0, Boolean.FALSE, "AppCompat recreation");
                                            return;
                                        }
                                    }
                                    catch (Throwable throwable2) {
                                        break block4;
                                    }
                                    catch (RuntimeException runtimeException2) {
                                        break block5;
                                    }
                                    e.invoke(this.q, this.c0, Boolean.FALSE);
                                    return;
                                }
                                Log.e((String)"ActivityRecreator", (String)"Exception while invoking performStopActivity", (Throwable)throwable2);
                                return;
                            }
                            if (runtimeException2.getClass() != RuntimeException.class) return;
                            if (runtimeException2.getMessage() == null) return;
                            if (runtimeException2.getMessage().startsWith("Unable to stop")) throw runtimeException2;
                        }
                    };
                    activity.postAtFrontOfQueue(runnable2);
                    return true;
                }
            }
            return false;
        }
        Log.e((String)"ActivityRecreator", (String)"Exception while fetching field values", (Throwable)throwable2);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean i(Activity var0) {
        block10: {
            if (Build.VERSION.SDK_INT >= 28) {
                var0 /* !! */ .recreate();
                return true;
            }
            if (ax.P.d.g() && ax.P.d.f == null) {
                return false;
            }
            if (ax.P.d.e == null && ax.P.d.d == null) {
                return false;
            }
            try {
                var4_3 = ax.P.d.c.get(var0 /* !! */ );
                if (var4_3 == null) {
                    return false;
                }
                var5_4 = ax.P.d.b.get(var0 /* !! */ );
                if (var5_4 == null) {
                    return false;
                }
                var2_5 = var0 /* !! */ .getApplication();
                var1_6 = new d(var0 /* !! */ );
                var2_5.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var1_6);
                var3_7 = ax.P.d.g;
                var6_8 = new Runnable(){
                    final Object c0;
                    final d q;
                    {
                        this.q = d8;
                        this.c0 = object;
                    }

                    @Override
                    public void run() {
                        this.q.a = this.c0;
                    }
                };
                var3_7.post(var6_8);
            }
            catch (Throwable var0_2) {
                return false;
            }
            try {
                if (!ax.P.d.g()) break block10;
                var6_8 = ax.P.d.f;
                var0 /* !! */  = Boolean.FALSE;
                var6_8.invoke(var5_4, new Object[]{var4_3, null, null, 0, var0 /* !! */ , null, null, var0 /* !! */ , var0 /* !! */ });
                ** GOTO lbl-1000
            }
            catch (Throwable var0_1) {
                ** GOTO lbl40
            }
        }
        var0 /* !! */ .recreate();
lbl-1000:
        // 2 sources

        {
            var0 /* !! */  = new Runnable(){
                final d c0;
                final Application q;
                {
                    this.q = application;
                    this.c0 = d8;
                }

                @Override
                public void run() {
                    this.q.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c0);
                }
            };
            var3_7.post((Runnable)var0 /* !! */ );
            return true;
lbl40:
            // 1 sources

            var3_7 = ax.P.d.g;
            var4_3 = new /* invalid duplicate definition of identical inner class */;
            var3_7.post(var4_3);
            throw var0_1;
        }
    }

    private static final class d
    implements Application.ActivityLifecycleCallbacks {
        Object a;
        private Activity b;
        private final int c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        d(Activity activity) {
            this.b = activity;
            this.c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.e && !this.f && !this.d && ax.P.d.h(this.a, this.c, activity)) {
                this.f = true;
                this.a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}

