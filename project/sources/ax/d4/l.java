package ax.d4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l implements Handler.Callback {
    private static final b j0 = new a();
    private final Handler e0;
    private final b f0;
    private volatile ax.J3.j q;
    final Map<FragmentManager, k> c0 = new HashMap();
    final Map<androidx.fragment.app.FragmentManager, o> d0 = new HashMap();
    private final ax.B.a<View, Fragment> g0 = new ax.B.a<>();
    private final ax.B.a<View, android.app.Fragment> h0 = new ax.B.a<>();
    private final Bundle i0 = new Bundle();

    static class a implements b {
        a() {
        }

        @Override // ax.d4.l.b
        public ax.J3.j a(ax.J3.c cVar, h hVar, m mVar) {
            return new ax.J3.j(cVar, hVar, mVar);
        }
    }

    public interface b {
        ax.J3.j a(ax.J3.c cVar, h hVar, m mVar);
    }

    public l(b bVar) {
        this.f0 = bVar == null ? j0 : bVar;
        this.e0 = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private ax.J3.j b(Context context, FragmentManager fragmentManager, android.app.Fragment fragment) {
        k g = g(fragmentManager, fragment);
        ax.J3.j d = g.d();
        if (d != null) {
            return d;
        }
        ax.J3.j a2 = this.f0.a(ax.J3.c.c(context), g.b(), g.e());
        g.i(a2);
        return a2;
    }

    private ax.J3.j f(Context context) {
        if (this.q == null) {
            synchronized (this) {
                try {
                    if (this.q == null) {
                        this.q = this.f0.a(ax.J3.c.c(context), new ax.d4.b(), new g());
                    }
                } finally {
                }
            }
        }
        return this.q;
    }

    private ax.J3.j i(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        o h = h(fragmentManager, fragment);
        ax.J3.j N2 = h.N2();
        if (N2 != null) {
            return N2;
        }
        ax.J3.j a2 = this.f0.a(ax.J3.c.c(context), h.L2(), h.O2());
        h.S2(a2);
        return a2;
    }

    public ax.J3.j c(Activity activity) {
        if (ax.k4.i.o()) {
            return d(activity.getApplicationContext());
        }
        a(activity);
        return b(activity, activity.getFragmentManager(), null);
    }

    public ax.J3.j d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (ax.k4.i.p() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.f) {
                return e((androidx.fragment.app.f) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return d(((ContextWrapper) context).getBaseContext());
            }
        }
        return f(context);
    }

    public ax.J3.j e(androidx.fragment.app.f fVar) {
        if (ax.k4.i.o()) {
            return d(fVar.getApplicationContext());
        }
        a(fVar);
        return i(fVar, fVar.getSupportFragmentManager(), null);
    }

    @TargetApi(17)
    k g(FragmentManager fragmentManager, android.app.Fragment fragment) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = this.c0.get(fragmentManager);
        if (kVar2 != null) {
            return kVar2;
        }
        k kVar3 = new k();
        kVar3.h(fragment);
        this.c0.put(fragmentManager, kVar3);
        fragmentManager.beginTransaction().add(kVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e0.obtainMessage(1, fragmentManager).sendToTarget();
        return kVar3;
    }

    o h(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        o oVar = (o) fragmentManager.k0("com.bumptech.glide.manager");
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = this.d0.get(fragmentManager);
        if (oVar2 != null) {
            return oVar2;
        }
        o oVar3 = new o();
        oVar3.R2(fragment);
        this.d0.put(fragmentManager, oVar3);
        fragmentManager.o().e(oVar3, "com.bumptech.glide.manager").j();
        this.e0.obtainMessage(2, fragmentManager).sendToTarget();
        return oVar3;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks remove;
        Object obj2;
        ComponentCallbacks componentCallbacks;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.c0.remove(obj);
        } else {
            if (i != 2) {
                componentCallbacks = null;
                z = false;
                obj2 = null;
                if (z && componentCallbacks == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.d0.remove(obj);
        }
        ComponentCallbacks componentCallbacks2 = remove;
        obj2 = obj;
        componentCallbacks = componentCallbacks2;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }
}
