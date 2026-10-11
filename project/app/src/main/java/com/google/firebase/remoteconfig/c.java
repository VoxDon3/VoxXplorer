/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import ax.f1.i;
import ax.i8.m;
import ax.i8.n;
import ax.j8.k;
import ax.j8.o;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class c
implements ax.l8.a {
    private static final ax.R5.e j = ax.R5.h.c();
    private static final Random k = new Random();
    private static final Map<String, com.google.firebase.remoteconfig.a> l = new HashMap<String, com.google.firebase.remoteconfig.a>();
    private final Map<String, com.google.firebase.remoteconfig.a> a = new HashMap<String, com.google.firebase.remoteconfig.a>();
    private final Context b;
    private final ScheduledExecutorService c;
    private final ax.x7.f d;
    private final ax.b8.e e;
    private final ax.y7.c f;
    private final ax.a8.b<ax.A7.a> g;
    private final String h;
    private Map<String, String> i = new HashMap<String, String>();

    c(Context context, @ax.C7.b ScheduledExecutorService scheduledExecutorService, ax.x7.f f8, ax.b8.e e8, ax.y7.c c8, ax.a8.b<ax.A7.a> b8) {
        this(context, scheduledExecutorService, f8, e8, c8, b8, true);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, ax.x7.f f8, ax.b8.e e8, ax.y7.c c8, ax.a8.b<ax.A7.a> b8, boolean bl) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = f8;
        this.e = e8;
        this.f = c8;
        this.g = b8;
        this.h = f8.n().c();
        com.google.firebase.remoteconfig.c$a.c(context);
        if (bl) {
            ax.j6.m.c(scheduledExecutorService, new com.google.firebase.remoteconfig.b(this));
        }
    }

    public static /* synthetic */ ax.A7.a b() {
        return null;
    }

    private b f(String string, String string2) {
        string = String.format("%s_%s_%s_%s.json", "frc", this.h, string, string2);
        return com.google.firebase.remoteconfig.internal.b.h(this.c, com.google.firebase.remoteconfig.internal.h.c(this.b, string));
    }

    private k j(b b8, b b9) {
        return new k(this.c, b8, b9);
    }

    static e k(Context context, String string, String string2) {
        return new e(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", string, string2, "settings"), 0));
    }

    private static o l(ax.x7.f f8, String string, ax.a8.b<ax.A7.a> b8) {
        if (com.google.firebase.remoteconfig.c.p(f8) && string.equals("firebase")) {
            return new o(b8);
        }
        return null;
    }

    private ax.k8.e n(b b8, b b9) {
        return new ax.k8.e(b8, ax.k8.a.a(b8, b9), this.c);
    }

    private static boolean o(ax.x7.f f8, String string) {
        return string.equals("firebase") && com.google.firebase.remoteconfig.c.p(f8);
    }

    private static boolean p(ax.x7.f f8) {
        return f8.m().equals("[DEFAULT]");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void q(boolean bl) {
        synchronized (c.class) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<com.google.firebase.remoteconfig.a> iterator = l.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().n(bl);
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

    @Override
    public void a(String string, ax.m8.f f8) {
        this.e(string).j().e(f8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    com.google.firebase.remoteconfig.a d(ax.x7.f object, String string, ax.b8.e e8, ax.y7.c c8, Executor executor, b b8, b b9, b b10, d d8, k k8, e e9, ax.k8.e e10) {
        synchronized (this) {
            RuntimeException var1_4;
            f f8;
            Context context;
            try {
                if (this.a.containsKey(string)) return this.a.get(string);
                context = this.b;
                if (!com.google.firebase.remoteconfig.c.o((ax.x7.f)object, string)) {
                    c8 = null;
                }
                f8 = this.m((ax.x7.f)object, e8, d8, b9, this.b, string, e9);
            }
            catch (Throwable throwable) {}
            try {
                com.google.firebase.remoteconfig.a a8 = new com.google.firebase.remoteconfig.a(context, (ax.x7.f)object, e8, c8, executor, b8, b9, b10, d8, k8, e9, f8, e10);
                a8.o();
                this.a.put(string, a8);
                l.put(string, a8);
                return this.a.get(string);
            }
            catch (Throwable throwable) {}
            {
            }
            throw var1_4;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public com.google.firebase.remoteconfig.a e(String object) {
        synchronized (this) {
            RuntimeException var1_4;
            block9: {
                Object object2;
                Object object3;
                k k8;
                e e8;
                b b8;
                b b9;
                b b10;
                block8: {
                    try {
                        b10 = this.f((String)object, "fetch");
                        b9 = this.f((String)object, "activate");
                        b8 = this.f((String)object, "defaults");
                        e8 = com.google.firebase.remoteconfig.c.k(this.b, this.h, (String)object);
                        k8 = this.j(b9, b8);
                        object3 = com.google.firebase.remoteconfig.c.l(this.d, (String)object, this.g);
                        if (object3 == null) break block8;
                    }
                    catch (Throwable throwable) {}
                    try {
                        object2 = new m((o)object3);
                        k8.b((ax.R5.d<String, com.google.firebase.remoteconfig.internal.c>)object2);
                    }
                    catch (Throwable throwable) {
                        break block9;
                    }
                }
                object2 = this.n(b9, b8);
                object3 = this.d;
                ax.b8.e e9 = this.e;
                ax.y7.c c8 = this.f;
                ScheduledExecutorService scheduledExecutorService = this.c;
                d d8 = this.h((String)object, b10, e8);
                try {
                    return this.d((ax.x7.f)object3, (String)object, e9, c8, scheduledExecutorService, b10, b9, b8, d8, k8, e8, (ax.k8.e)object2);
                }
                catch (Throwable throwable) {}
                {
                }
            }
            throw var1_4;
        }
    }

    com.google.firebase.remoteconfig.a g() {
        return this.e("firebase");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    d h(String object, b b8, e e8) {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                n n8;
                ax.b8.e e9;
                try {
                    e9 = this.e;
                    n8 = com.google.firebase.remoteconfig.c.p(this.d) ? this.g : new n();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                return new d(e9, n8, this.c, j, k, b8, this.i(this.d.n().b(), (String)object, e8), e8, this.i);
            }
            throw throwable2;
        }
    }

    ConfigFetchHttpClient i(String string, String string2, e e8) {
        String string3 = this.d.n().c();
        return new ConfigFetchHttpClient(this.b, string3, string, string2, e8.b(), e8.b());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    f m(ax.x7.f object, ax.b8.e e8, d d8, b b8, Context context, String string, e e9) {
        synchronized (this) {
            return new f((ax.x7.f)object, e8, d8, b8, context, string, e9, this.c);
        }
    }

    private static class a
    implements a.a {
        private static final AtomicReference<a> a = new AtomicReference();

        private a() {
        }

        private static void c(Context object) {
            Application application = (Application)object.getApplicationContext();
            AtomicReference<a> atomicReference = a;
            if (atomicReference.get() == null && ax.f1.i.a(atomicReference, null, object = new a())) {
                com.google.android.gms.common.api.internal.a.c(application);
                com.google.android.gms.common.api.internal.a.b().a((a.a)object);
            }
        }

        @Override
        public void a(boolean bl) {
            com.google.firebase.remoteconfig.c.q(bl);
        }
    }
}

