/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import ax.D7.x;
import ax.M5.p;
import ax.b8.a;
import ax.j6.j;
import ax.j6.k;
import ax.j6.m;
import com.google.firebase.installations.d;
import com.google.firebase.installations.e;
import com.google.firebase.installations.f;
import com.google.firebase.installations.g;
import com.google.firebase.installations.h;
import com.google.firebase.installations.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c
implements ax.b8.e {
    private static final Object m = new Object();
    private static final ThreadFactory n = new ThreadFactory(){
        private final AtomicInteger a = new AtomicInteger(1);

        @Override
        @SuppressLint(value={"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable2) {
            return new Thread(runnable2, String.format("firebase-installations-executor-%d", this.a.getAndIncrement()));
        }
    };
    private final ax.x7.f a;
    private final ax.e8.c b;
    private final ax.d8.c c;
    private final i d;
    private final x<ax.d8.b> e;
    private final ax.b8.g f;
    private final Object g = new Object();
    private final ExecutorService h;
    private final Executor i;
    private String j;
    private Set<ax.c8.a> k = new HashSet<ax.c8.a>();
    private final List<h> l = new ArrayList<h>();

    @SuppressLint(value={"ThreadPoolCreation"})
    c(ax.x7.f f8, ax.a8.b<ax.Z7.i> b8, ExecutorService executorService, Executor executor) {
        this(executorService, executor, f8, new ax.e8.c(f8.k(), b8), new ax.d8.c(f8), com.google.firebase.installations.i.c(), new x<ax.d8.b>(new a(f8)), new ax.b8.g());
    }

    @SuppressLint(value={"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, ax.x7.f f8, ax.e8.c c8, ax.d8.c c9, i i8, x<ax.d8.b> x8, ax.b8.g g8) {
        this.a = f8;
        this.b = c8;
        this.c = c9;
        this.d = i8;
        this.e = x8;
        this.f = g8;
        this.h = executorService;
        this.i = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A(ax.d8.d d8) {
        Object object = this.g;
        synchronized (object) {
            try {
                Iterator<h> iterator = this.l.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    if (!iterator.next().a(d8)) continue;
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void B(String string) {
        synchronized (this) {
            this.j = string;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void C(ax.d8.d object, ax.d8.d d8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (this.k.size() == 0 || TextUtils.equals((CharSequence)((ax.d8.d)object).d(), (CharSequence)d8.d())) break block5;
                        object = this.k.iterator();
                        while (object.hasNext()) {
                            ((ax.c8.a)object.next()).a(d8.d());
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void c(c c8, boolean bl) {
        c8.k(bl);
    }

    public static /* synthetic */ void d(c c8, boolean bl) {
        c8.j(bl);
    }

    public static /* synthetic */ void e(c c8) {
        c8.k(false);
    }

    public static /* synthetic */ ax.d8.b f(ax.x7.f f8) {
        return new ax.d8.b(f8);
    }

    private j<g> g() {
        k<g> k8 = new k<g>();
        this.i(new e(this.d, k8));
        return k8.a();
    }

    private j<String> h() {
        k<String> k8 = new k<String>();
        this.i(new f(k8));
        return k8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(h h8) {
        Object object = this.g;
        synchronized (object) {
            this.l.add(h8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(boolean bl) {
        d d82;
        block7: {
            ax.d8.d d9;
            ax.d8.d d10;
            block8: {
                block6: {
                    d10 = this.s();
                    try {
                        if (d10.i() || d10.l()) break block6;
                        if (!bl && !this.d.f(d10)) {
                            return;
                        }
                    }
                    catch (d d82) {
                        break block7;
                    }
                    d9 = this.l(d10);
                    break block8;
                }
                d9 = this.y(d10);
            }
            this.v(d9);
            this.C(d10, d9);
            if (d9.k()) {
                this.B(d9.d());
            }
            if (d9.i()) {
                this.z(new d(d.a.q));
                return;
            }
            if (d9.j()) {
                this.z(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                return;
            }
            this.A(d9);
            return;
        }
        this.z(d82);
    }

    private final void k(boolean bl) {
        ax.d8.d d8;
        ax.d8.d d9 = d8 = this.t();
        if (bl) {
            d9 = d8.p();
        }
        this.A(d9);
        this.i.execute(new ax.b8.d(this, bl));
    }

    private ax.d8.d l(ax.d8.d d8) throws d {
        ax.e8.f f8 = this.b.e(this.m(), d8.d(), this.u(), d8.f());
        int n8 = com.google.firebase.installations.c$b.b[f8.b().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.B(null);
                    return d8.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
            }
            return d8.q("BAD CONFIG");
        }
        return d8.o(f8.c(), f8.d(), this.d.b());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String o() {
        synchronized (this) {
            return this.j;
        }
    }

    private ax.d8.b p() {
        return this.e.get();
    }

    public static c q() {
        return com.google.firebase.installations.c.r(ax.x7.f.l());
    }

    public static c r(ax.x7.f f8) {
        boolean bl = f8 != null;
        p.b(bl, "Null is not a valid value of FirebaseApp.");
        return (c)f8.j(ax.b8.e.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.d8.d s() {
        Object object = m;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                ax.d8.d d8;
                block7: {
                    com.google.firebase.installations.b b8;
                    try {
                        b8 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    try {
                        d8 = this.c.d();
                        if (b8 == null) break block7;
                    }
                    catch (Throwable throwable3) {
                        if (b8 != null) {
                            b8.b();
                        }
                        throw throwable3;
                    }
                    b8.b();
                }
                return d8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.d8.d t() {
        Object object = m;
        synchronized (object) {
            Throwable throwable3;
            block8: {
                Throwable throwable22;
                com.google.firebase.installations.b b8;
                block10: {
                    Object object2;
                    block9: {
                        try {
                            b8 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                        }
                        catch (Throwable throwable3) {
                            break block8;
                        }
                        try {
                            ax.d8.d d8 = this.c.d();
                            object2 = d8;
                            if (!d8.j()) break block9;
                            object2 = this.x(d8);
                            object2 = this.c.b(d8.t((String)object2));
                        }
                        catch (Throwable throwable22) {
                            break block10;
                        }
                    }
                    if (b8 != null) {
                        b8.b();
                    }
                    return object2;
                }
                if (b8 != null) {
                    b8.b();
                }
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void v(ax.d8.d d8) {
        Object object = m;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                block7: {
                    com.google.firebase.installations.b b8;
                    try {
                        b8 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    try {
                        this.c.b(d8);
                        if (b8 == null) break block7;
                    }
                    catch (Throwable throwable3) {
                        if (b8 != null) {
                            b8.b();
                        }
                        throw throwable3;
                    }
                    b8.b();
                }
                return;
            }
            throw throwable2;
        }
    }

    private void w() {
        p.g(this.n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(this.u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(this.m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(com.google.firebase.installations.i.h(this.n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(com.google.firebase.installations.i.g(this.m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(ax.d8.d object) {
        if (!this.a.m().equals("CHIME_ANDROID_SDK") && !this.a.u() || !((ax.d8.d)object).m()) {
            return this.f.a();
        }
        String string = this.p().f();
        object = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            object = this.f.a();
        }
        return object;
    }

    private ax.d8.d y(ax.d8.d d8) throws d {
        Object object = d8.d() != null && d8.d().length() == 11 ? this.p().i() : null;
        object = this.b.d(this.m(), d8.d(), this.u(), this.n(), (String)object);
        int n8 = com.google.firebase.installations.c$b.a[((ax.e8.d)object).e().ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                return d8.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
        }
        return d8.s(((ax.e8.d)object).c(), ((ax.e8.d)object).d(), this.d.b(), ((ax.e8.d)object).b().c(), ((ax.e8.d)object).b().d());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z(Exception exception) {
        Object object = this.g;
        synchronized (object) {
            try {
                Iterator<h> iterator = this.l.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    if (!iterator.next().b(exception)) continue;
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public j<String> a() {
        this.w();
        Object object = this.o();
        if (object != null) {
            return ax.j6.m.e(object);
        }
        object = this.h();
        this.h.execute(new ax.b8.b(this));
        return object;
    }

    @Override
    public j<g> b(boolean bl) {
        this.w();
        j<g> j8 = this.g();
        this.h.execute(new ax.b8.c(this, bl));
        return j8;
    }

    String m() {
        return this.a.n().b();
    }

    String n() {
        return this.a.n().c();
    }

    String u() {
        return this.a.n().e();
    }
}

