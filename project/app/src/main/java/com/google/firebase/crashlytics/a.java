/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import ax.G7.d;
import ax.G7.f;
import ax.G7.g;
import ax.G7.l;
import ax.J7.C;
import ax.J7.i;
import ax.J7.m;
import ax.J7.r;
import ax.J7.x;
import ax.J7.z;
import ax.b8.e;
import ax.j6.b;
import ax.j6.j;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class a {
    final r a;

    private a(r r8) {
        this.a = r8;
    }

    public static a a() {
        a a8 = ax.x7.f.l().j(a.class);
        if (a8 != null) {
            return a8;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a b(ax.x7.f object, e object2, ax.a8.a<ax.G7.a> object3, ax.a8.a<ax.A7.a> object4, ax.a8.a<ax.l8.a> object5) {
        Context context = ((ax.x7.f)object).k();
        Object object6 = context.getPackageName();
        Object object7 = g.f();
        Object object8 = new StringBuilder();
        ((StringBuilder)object8).append("Initializing Firebase Crashlytics ");
        ((StringBuilder)object8).append(r.i());
        ((StringBuilder)object8).append(" for ");
        ((StringBuilder)object8).append((String)object6);
        ((g)object7).g(((StringBuilder)object8).toString());
        object8 = new ax.O7.g(context);
        object7 = new x((ax.x7.f)object);
        object2 = new C(context, (String)object6, (e)object2, (x)object7);
        object3 = new d((ax.a8.a<ax.G7.a>)object3);
        object6 = new ax.F7.d((ax.a8.a<ax.A7.a>)object4);
        Iterator<ax.J7.f> iterator = z.c("Crashlytics Exception Handler");
        object4 = new m((x)object7, (ax.O7.g)object8);
        ax.o8.a.e((ax.o8.b)object4);
        object5 = new l((ax.a8.a<ax.l8.a>)object5);
        object3 = new r((ax.x7.f)object, (C)object2, (ax.G7.a)object3, (x)object7, ((ax.F7.d)object6).e(), ((ax.F7.d)object6).d(), (ax.O7.g)object8, (ExecutorService)((Object)iterator), (m)object4, (l)object5);
        object = ((ax.x7.f)object).n().c();
        object4 = i.m(context);
        object5 = i.j(context);
        object6 = g.f();
        iterator = new StringBuilder();
        ((StringBuilder)((Object)iterator)).append("Mapping file ID is: ");
        ((StringBuilder)((Object)iterator)).append((String)object4);
        ((g)object6).b(((StringBuilder)((Object)iterator)).toString());
        iterator = object5.iterator();
        while (iterator.hasNext()) {
            object6 = iterator.next();
            g.f().b(String.format("Build id for %s on %s: %s", ((ax.J7.f)object6).c(), ((ax.J7.f)object6).a(), ((ax.J7.f)object6).b()));
        }
        object6 = new f(context);
        try {
            object4 = ax.J7.a.a(context, (C)object2, (String)object, (String)object4, object5, (f)object6);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            g.f().e("Error retrieving app package info.", nameNotFoundException);
            return null;
        }
        object6 = g.f();
        object5 = new StringBuilder();
        ((StringBuilder)object5).append("Installer package name is: ");
        ((StringBuilder)object5).append(((ax.J7.a)object4).d);
        ((g)object6).i(((StringBuilder)object5).toString());
        object5 = z.c("com.google.firebase.crashlytics.startup");
        object = ax.Q7.f.l(context, (String)object, (C)object2, new ax.N7.b(), ((ax.J7.a)object4).f, ((ax.J7.a)object4).g, (ax.O7.g)object8, (x)object7);
        ((ax.Q7.f)object).p((Executor)object5).g((Executor)object5, new b<Void, Object>(){

            @Override
            public Object a(j<Void> j8) throws Exception {
                if (!j8.m()) {
                    g.f().e("Error fetching settings.", j8.i());
                }
                return null;
            }
        });
        ax.j6.m.c((Executor)object5, new Callable<Void>(){
            final boolean a;
            final r b;
            final ax.Q7.f c;
            {
                this.a = bl;
                this.b = r8;
                this.c = f8;
            }

            public Void a() throws Exception {
                if (this.a) {
                    this.b.g(this.c);
                }
                return null;
            }
        });
        return new a((r)object3);
    }

    public void c(Throwable throwable) {
        if (throwable == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.l(throwable);
    }

    public void d(boolean bl) {
        this.a.p(bl);
    }

    public void e(String string, String string2) {
        this.a.q(string, string2);
    }
}

