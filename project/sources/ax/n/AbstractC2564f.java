package ax.n;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.a;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.Toolbar;
import ax.n.AbstractC2564f;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: ax.n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2564f {
    static c a = new c(new d());
    private static int b = -100;
    private static ax.Y.h c = null;
    private static ax.Y.h d = null;
    private static Boolean e = null;
    private static boolean f = false;
    private static final ax.B.b<WeakReference<AbstractC2564f>> g = new ax.B.b<>();
    private static final Object h = new Object();
    private static final Object i = new Object();

    /* renamed from: ax.n.f$a */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: ax.n.f$b */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: ax.n.f$c */
    static class c implements Executor {
        final Executor d0;
        Runnable e0;
        private final Object q = new Object();
        final Queue<Runnable> c0 = new ArrayDeque();

        c(Executor executor) {
            this.d0 = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.q) {
                try {
                    Runnable poll = this.c0.poll();
                    this.e0 = poll;
                    if (poll != null) {
                        this.d0.execute(poll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.q) {
                try {
                    this.c0.add(new Runnable() { // from class: ax.n.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2564f.c.a(AbstractC2564f.c.this, runnable);
                        }
                    });
                    if (this.e0 == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: ax.n.f$d */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    AbstractC2564f() {
    }

    static void G(AbstractC2564f abstractC2564f) {
        synchronized (h) {
            H(abstractC2564f);
        }
    }

    private static void H(AbstractC2564f abstractC2564f) {
        synchronized (h) {
            try {
                Iterator<WeakReference<AbstractC2564f>> it = g.iterator();
                while (it.hasNext()) {
                    AbstractC2564f abstractC2564f2 = it.next().get();
                    if (abstractC2564f2 == abstractC2564f || abstractC2564f2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void J(boolean z) {
        N.c(z);
    }

    public static void N(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (b != i2) {
            b = i2;
            g();
        }
    }

    static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String b2 = ax.P.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b2));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void U(final Context context) {
        if (x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new Runnable() { // from class: ax.n.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2564f.c(context);
                    }
                });
                return;
            }
            synchronized (i) {
                try {
                    ax.Y.h hVar = c;
                    if (hVar == null) {
                        if (d == null) {
                            d = ax.Y.h.c(ax.P.e.b(context));
                        }
                        if (d.f()) {
                        } else {
                            c = d;
                        }
                    } else if (!hVar.equals(d)) {
                        ax.Y.h hVar2 = c;
                        d = hVar2;
                        ax.P.e.a(context, hVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        T(context);
        f = true;
    }

    static void d(AbstractC2564f abstractC2564f) {
        synchronized (h) {
            H(abstractC2564f);
            g.add(new WeakReference<>(abstractC2564f));
        }
    }

    private static void g() {
        synchronized (h) {
            try {
                Iterator<WeakReference<AbstractC2564f>> it = g.iterator();
                while (it.hasNext()) {
                    AbstractC2564f abstractC2564f = it.next().get();
                    if (abstractC2564f != null) {
                        abstractC2564f.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AbstractC2564f j(Activity activity, InterfaceC2562d interfaceC2562d) {
        return new LayoutInflaterFactory2C2566h(activity, interfaceC2562d);
    }

    public static AbstractC2564f k(Dialog dialog, InterfaceC2562d interfaceC2562d) {
        return new LayoutInflaterFactory2C2566h(dialog, interfaceC2562d);
    }

    public static ax.Y.h m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object r = r();
            if (r != null) {
                return ax.Y.h.j(b.a(r));
            }
        } else {
            ax.Y.h hVar = c;
            if (hVar != null) {
                return hVar;
            }
        }
        return ax.Y.h.e();
    }

    public static int o() {
        return b;
    }

    static Object r() {
        Context n;
        Iterator<WeakReference<AbstractC2564f>> it = g.iterator();
        while (it.hasNext()) {
            AbstractC2564f abstractC2564f = it.next().get();
            if (abstractC2564f != null && (n = abstractC2564f.n()) != null) {
                return n.getSystemService("locale");
            }
        }
        return null;
    }

    static ax.Y.h t() {
        return c;
    }

    static boolean x(Context context) {
        if (e == null) {
            try {
                Bundle bundle = ServiceC2556A.a(context).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i2);

    public abstract void K(int i2);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void P(Toolbar toolbar);

    public abstract void R(CharSequence charSequence);

    public abstract androidx.appcompat.view.a S(a.InterfaceC0007a interfaceC0007a);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract <T extends View> T l(int i2);

    public Context n() {
        return null;
    }

    public abstract InterfaceC2560b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater s();

    public abstract AbstractC2559a u();

    public abstract void v();

    public abstract void w();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void Q(int i2) {
    }

    @Deprecated
    public void h(Context context) {
    }
}
