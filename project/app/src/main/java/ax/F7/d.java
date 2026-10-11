/*
 * Decompiled with CFR 0.152.
 */
package ax.F7;

import android.os.Bundle;
import ax.A7.a;
import ax.F7.a;
import ax.F7.b;
import ax.F7.c;
import ax.F7.e;
import ax.G7.g;
import ax.H7.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d {
    private final ax.a8.a<ax.A7.a> a;
    private volatile ax.H7.a b;
    private volatile ax.I7.b c;
    private final List<ax.I7.a> d;

    public d(ax.a8.a<ax.A7.a> a8) {
        this(a8, new ax.I7.c(), new f());
    }

    public d(ax.a8.a<ax.A7.a> a8, ax.I7.b b8, ax.H7.a a9) {
        this.a = a8;
        this.c = b8;
        this.d = new ArrayList<ax.I7.a>();
        this.b = a9;
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void a(d d8, ax.a8.b object) {
        d8.getClass();
        g.f().b("AnalyticsConnector now available.");
        Object object2 = (ax.A7.a)object.get();
        ax.H7.a a8 = new ax.H7.e((ax.A7.a)object2);
        object = new e();
        if (ax.F7.d.g((ax.A7.a)object2, (e)object) == null) {
            g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        g.f().b("Registered Firebase Analytics listener.");
        object2 = new ax.H7.d();
        a8 = new ax.H7.c((ax.H7.e)a8, 500, TimeUnit.MILLISECONDS);
        synchronized (d8) {
            try {
                Iterator<ax.I7.a> iterator = d8.d.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        ((e)object).d((ax.H7.b)object2);
                        ((e)object).e((ax.H7.b)((Object)a8));
                        d8.c = object2;
                        d8.b = a8;
                        return;
                    }
                    ((ax.H7.d)object2).a(iterator.next());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ void b(d d8, String string, Bundle bundle) {
        d8.b.a(string, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void c(d d8, ax.I7.a a8) {
        synchronized (d8) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!(d8.c instanceof ax.I7.c)) break block3;
                        d8.d.add(a8);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                d8.c.a(a8);
                return;
            }
            throw throwable2;
        }
    }

    private void f() {
        this.a.a(new c(this));
    }

    private static a.a g(ax.A7.a object, e e8) {
        a.a a8 = object.c("clx", e8);
        if (a8 == null) {
            g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            object = object.c("crash", e8);
            if (object != null) {
                g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
            return object;
        }
        return a8;
    }

    public ax.H7.a d() {
        return new b(this);
    }

    public ax.I7.b e() {
        return new a(this);
    }
}

