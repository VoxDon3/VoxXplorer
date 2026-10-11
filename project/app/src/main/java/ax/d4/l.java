/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import ax.B.a;
import ax.J3.c;
import ax.J3.j;
import ax.d4.g;
import ax.d4.h;
import ax.d4.k;
import ax.d4.m;
import ax.d4.o;
import ax.k4.i;
import java.util.HashMap;
import java.util.Map;

public class l
implements Handler.Callback {
    private static final b j0 = new b(){

        @Override
        public j a(c c8, h h8, m m8) {
            return new j(c8, h8, m8);
        }
    };
    final Map<android.app.FragmentManager, k> c0 = new HashMap<android.app.FragmentManager, k>();
    final Map<FragmentManager, o> d0 = new HashMap<FragmentManager, o>();
    private final Handler e0;
    private final b f0;
    private final a<View, androidx.fragment.app.Fragment> g0 = new a();
    private final a<View, Fragment> h0 = new a();
    private final Bundle i0 = new Bundle();
    private volatile j q;

    public l(b b8) {
        if (b8 == null) {
            b8 = j0;
        }
        this.f0 = b8;
        this.e0 = new Handler(Looper.getMainLooper(), (Handler.Callback)this);
    }

    @TargetApi(value=17)
    private static void a(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private j b(Context object, android.app.FragmentManager object2, Fragment object3) {
        if ((object3 = ((k)((Object)(object2 = this.g((android.app.FragmentManager)object2, (Fragment)object3)))).d()) == null) {
            object = c.c(object);
            object = this.f0.a((c)object, ((k)((Object)object2)).b(), ((k)((Object)object2)).e());
            ((k)((Object)object2)).i((j)object);
            return object;
        }
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private j f(Context object) {
        if (this.q != null) return this.q;
        synchronized (this) {
            try {
                if (this.q != null) return this.q;
                c c8 = c.c((Context)object);
                object = this.f0;
                ax.d4.b b8 = new ax.d4.b();
                g g8 = new g();
                this.q = object.a(c8, b8, g8);
                return this.q;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private j i(Context object, FragmentManager object2, androidx.fragment.app.Fragment object3) {
        if ((object3 = ((o)(object2 = this.h((FragmentManager)object2, (androidx.fragment.app.Fragment)object3))).N2()) == null) {
            object = c.c(object);
            object = this.f0.a((c)object, ((o)object2).L2(), ((o)object2).O2());
            ((o)object2).S2((j)object);
            return object;
        }
        return object3;
    }

    public j c(Activity activity) {
        if (i.o()) {
            return this.d(activity.getApplicationContext());
        }
        l.a(activity);
        return this.b((Context)activity, activity.getFragmentManager(), null);
    }

    public j d(Context context) {
        if (context != null) {
            if (i.p() && !(context instanceof Application)) {
                if (context instanceof f) {
                    return this.e((f)context);
                }
                if (context instanceof Activity) {
                    return this.c((Activity)context);
                }
                if (context instanceof ContextWrapper) {
                    return this.d(((ContextWrapper)context).getBaseContext());
                }
            }
            return this.f(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public j e(f f8) {
        if (i.o()) {
            return this.d(f8.getApplicationContext());
        }
        l.a(f8);
        return this.i((Context)f8, f8.getSupportFragmentManager(), null);
    }

    @TargetApi(value=17)
    k g(android.app.FragmentManager fragmentManager, Fragment fragment) {
        k k8;
        k k9 = k8 = (k)fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (k8 == null) {
            k9 = k8 = this.c0.get(fragmentManager);
            if (k8 == null) {
                k9 = new k();
                k9.h(fragment);
                this.c0.put(fragmentManager, k9);
                fragmentManager.beginTransaction().add((Fragment)k9, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.e0.obtainMessage(1, (Object)fragmentManager).sendToTarget();
            }
        }
        return k9;
    }

    o h(FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        o o8;
        o o9 = o8 = (o)fragmentManager.k0("com.bumptech.glide.manager");
        if (o8 == null) {
            o9 = o8 = this.d0.get(fragmentManager);
            if (o8 == null) {
                o9 = new o();
                o9.R2(fragment);
                this.d0.put(fragmentManager, o9);
                fragmentManager.o().e(o9, "com.bumptech.glide.manager").j();
                this.e0.obtainMessage(2, (Object)fragmentManager).sendToTarget();
            }
        }
        return o9;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean handleMessage(Message object) {
        Object var1_7;
        Object var5_12;
        Object var1_4;
        Object object2;
        int n8 = object.what;
        boolean bl = true;
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            object2 = (FragmentManager)object.obj;
            o o8 = this.d0.remove(object2);
        } else {
            object2 = (android.app.FragmentManager)object.obj;
            k k8 = this.c0.remove(object2);
        }
        void var5_11 = var1_4;
        Object object3 = object2;
        if (!bl) return bl;
        if (var5_12 != null) return bl;
        if (!Log.isLoggable((String)"RMRetriever", (int)5)) return bl;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Failed to remove expected request manager fragment, manager: ");
        ((StringBuilder)object2).append(var1_7);
        Log.w((String)"RMRetriever", (String)((StringBuilder)object2).toString());
        return bl;
    }

    public static interface b {
        public j a(c var1, h var2, m var3);
    }
}

