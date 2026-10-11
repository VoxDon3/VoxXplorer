/*
 * Decompiled with CFR 0.152.
 */
package ax.k8;

import android.util.Log;
import ax.i8.i;
import ax.j6.j;
import ax.k8.a;
import ax.k8.b;
import ax.k8.c;
import ax.k8.d;
import ax.m8.f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class e {
    private com.google.firebase.remoteconfig.internal.b a;
    private a b;
    private Executor c;
    private Set<f> d = Collections.newSetFromMap(new j.ConcurrentHashMap());

    public e(com.google.firebase.remoteconfig.internal.b b8, a a8, Executor executor) {
        this.a = b8;
        this.b = a8;
        this.c = executor;
    }

    public static /* synthetic */ void a(e object, j object2, f f8, com.google.firebase.remoteconfig.internal.c object3) {
        block3: {
            object.getClass();
            object2 = (com.google.firebase.remoteconfig.internal.c)((j)object2).j();
            if (object2 == null) break block3;
            try {
                object2 = ((e)object).b.b((com.google.firebase.remoteconfig.internal.c)object2);
                object = ((e)object).c;
                object3 = new d(f8, (ax.m8.e)object2);
                object.execute((Runnable)object3);
                return;
            }
            catch (i i8) {
                Log.w((String)"FirebaseRemoteConfig", (String)"Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", (Throwable)i8);
            }
        }
    }

    public static /* synthetic */ void b(f f8, ax.m8.e e8) {
        f8.a(e8);
    }

    public static /* synthetic */ void c(f f8, ax.m8.e e8) {
        f8.a(e8);
    }

    public void d(com.google.firebase.remoteconfig.internal.c object) {
        try {
            ax.m8.e e8 = this.b.b((com.google.firebase.remoteconfig.internal.c)object);
            for (f f8 : this.d) {
                object = this.c;
                c c8 = new c(f8, e8);
                object.execute(c8);
            }
        }
        catch (i i8) {
            Log.w((String)"FirebaseRemoteConfig", (String)"Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", (Throwable)i8);
        }
    }

    public void e(f f8) {
        this.d.add(f8);
        j<com.google.firebase.remoteconfig.internal.c> j8 = this.a.e();
        j8.e(this.c, new b(this, j8, f8));
    }
}

