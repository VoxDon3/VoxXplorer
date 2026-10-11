/*
 * Decompiled with CFR 0.152.
 */
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
import ax.n.A;
import ax.n.e;
import ax.n.g;
import ax.n.h;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class f {
    static c a = new c(new d());
    private static int b = -100;
    private static ax.Y.h c = null;
    private static ax.Y.h d = null;
    private static Boolean e = null;
    private static boolean f = false;
    private static final ax.B.b<WeakReference<f>> g = new ax.B.b();
    private static final Object h = new Object();
    private static final Object i = new Object();

    f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void G(f f8) {
        Object object = h;
        synchronized (object) {
            ax.n.f.H(f8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void H(f f8) {
        Object object = h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<WeakReference<f>> iterator = g.iterator();
                    while (iterator.hasNext()) {
                        f f9 = (f)iterator.next().get();
                        if (f9 != f8 && f9 != null) continue;
                        iterator.remove();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static void J(boolean bl) {
        N.c(bl);
    }

    public static void N(int n8) {
        if (n8 != -1 && n8 != 0 && n8 != 1 && n8 != 2 && n8 != 3) {
            Log.d((String)"AppCompatDelegate", (String)"setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (b != n8) {
            b = n8;
            ax.n.f.g();
        }
    }

    static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (ax.n.f.m().f()) {
                    String string = ax.P.e.b(context);
                    Object object = context.getSystemService("locale");
                    if (object != null) {
                        ax.n.f$b.b(object, ax.n.f$a.a(string));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void U(Context context) {
        if (!ax.n.f.x(context)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (f) return;
            a.execute(new e(context));
            return;
        }
        Object object = i;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                block9: {
                    ax.Y.h h8;
                    block6: {
                        block7: {
                            try {
                                h8 = c;
                                if (h8 != null) break block6;
                                if (d != null) break block7;
                                d = ax.Y.h.c(ax.P.e.b(context));
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        if (d.f()) {
                            return;
                        }
                        c = d;
                        break block9;
                    }
                    if (h8.equals(d)) return;
                    d = h8 = c;
                    ax.P.e.a(context, h8.h());
                }
                return;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void c(Context context) {
        ax.n.f.T(context);
        f = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void d(f f8) {
        Object object = h;
        synchronized (object) {
            ax.n.f.H(f8);
            ax.B.b<WeakReference<f>> b8 = g;
            WeakReference<f> weakReference = new WeakReference<f>(f8);
            b8.add(weakReference);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void g() {
        Object object = h;
        synchronized (object) {
            try {
                Iterator<WeakReference<f>> iterator = g.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    f f8 = (f)iterator.next().get();
                    if (f8 == null) continue;
                    f8.f();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static f j(Activity activity, ax.n.d d8) {
        return new h(activity, d8);
    }

    public static f k(Dialog dialog, ax.n.d d8) {
        return new h(dialog, d8);
    }

    public static ax.Y.h m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object object = ax.n.f.r();
            if (object != null) {
                return ax.Y.h.j(ax.n.f$b.a(object));
            }
        } else {
            ax.Y.h h8 = c;
            if (h8 != null) {
                return h8;
            }
        }
        return ax.Y.h.e();
    }

    public static int o() {
        return b;
    }

    static Object r() {
        Iterator<WeakReference<f>> iterator = g.iterator();
        while (iterator.hasNext()) {
            f f8 = (f)iterator.next().get();
            if (f8 == null || (f8 = f8.n()) == null) continue;
            return f8.getSystemService("locale");
        }
        return null;
    }

    static ax.Y.h t() {
        return c;
    }

    static boolean x(Context context) {
        block4: {
            if (e == null) {
                context = A.a((Context)context).metaData;
                if (context == null) break block4;
                try {
                    e = context.getBoolean("autoStoreLocales");
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.d((String)"AppCompatDelegate", (String)"Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                    e = Boolean.FALSE;
                }
            }
        }
        return e;
    }

    public abstract void A();

    public abstract void B(Bundle var1);

    public abstract void C();

    public abstract void D(Bundle var1);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int var1);

    public abstract void K(int var1);

    public abstract void L(View var1);

    public abstract void M(View var1, ViewGroup.LayoutParams var2);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void P(Toolbar var1);

    public void Q(int n8) {
    }

    public abstract void R(CharSequence var1);

    public abstract androidx.appcompat.view.a S(a.a var1);

    public abstract void e(View var1, ViewGroup.LayoutParams var2);

    public abstract boolean f();

    @Deprecated
    public void h(Context context) {
    }

    public Context i(Context context) {
        this.h(context);
        return context;
    }

    public abstract <T extends View> T l(int var1);

    public Context n() {
        return null;
    }

    public abstract ax.n.b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater s();

    public abstract ax.n.a u();

    public abstract void v();

    public abstract void w();

    public abstract void y(Configuration var1);

    public abstract void z(Bundle var1);

    static class a {
        static LocaleList a(String string) {
            return LocaleList.forLanguageTags((String)string);
        }
    }

    static class b {
        static LocaleList a(Object object) {
            return ((LocaleManager)object).getApplicationLocales();
        }

        static void b(Object object, LocaleList localeList) {
            ((LocaleManager)object).setApplicationLocales(localeList);
        }
    }

    static class c
    implements Executor {
        final Queue<Runnable> c0;
        final Executor d0;
        Runnable e0;
        private final Object q = new Object();

        c(Executor executor) {
            this.c0 = new ArrayDeque<Runnable>();
            this.d0 = executor;
        }

        public static /* synthetic */ void a(c c8, Runnable runnable2) {
            c8.getClass();
            try {
                runnable2.run();
                return;
            }
            finally {
                c8.b();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void b() {
            Object object = this.q;
            synchronized (object) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            Runnable runnable2;
                            this.e0 = runnable2 = this.c0.poll();
                            if (runnable2 == null) break block3;
                            this.d0.execute(runnable2);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void execute(Runnable runnable2) {
            Object object = this.q;
            synchronized (object) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            Queue<Runnable> queue = this.c0;
                            g g8 = new g(this, runnable2);
                            queue.add(g8);
                            if (this.e0 != null) break block3;
                            this.b();
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }

    static class d
    implements Executor {
        d() {
        }

        @Override
        public void execute(Runnable runnable2) {
            new Thread(runnable2).start();
        }
    }
}

