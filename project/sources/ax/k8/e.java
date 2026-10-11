package ax.k8;

import android.util.Log;
import ax.i8.i;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2324g;
import ax.m8.f;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class e {
    private com.google.firebase.remoteconfig.internal.b a;
    private C2412a b;
    private Executor c;
    private Set<f> d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(com.google.firebase.remoteconfig.internal.b bVar, C2412a c2412a, Executor executor) {
        this.a = bVar;
        this.b = c2412a;
        this.c = executor;
    }

    public static /* synthetic */ void a(e eVar, AbstractC2327j abstractC2327j, final f fVar, com.google.firebase.remoteconfig.internal.c cVar) {
        eVar.getClass();
        try {
            com.google.firebase.remoteconfig.internal.c cVar2 = (com.google.firebase.remoteconfig.internal.c) abstractC2327j.j();
            if (cVar2 != null) {
                final ax.m8.e b = eVar.b.b(cVar2);
                eVar.c.execute(new Runnable() { // from class: ax.k8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.a(b);
                    }
                });
            }
        } catch (i e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void d(com.google.firebase.remoteconfig.internal.c cVar) {
        try {
            final ax.m8.e b = this.b.b(cVar);
            for (final f fVar : this.d) {
                this.c.execute(new Runnable() { // from class: ax.k8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.a(b);
                    }
                });
            }
        } catch (i e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }

    public void e(final f fVar) {
        this.d.add(fVar);
        final AbstractC2327j<com.google.firebase.remoteconfig.internal.c> e = this.a.e();
        e.e(this.c, new InterfaceC2324g() { // from class: ax.k8.b
            @Override // ax.j6.InterfaceC2324g
            public final void a(Object obj) {
                e.a(e.this, e, fVar, (com.google.firebase.remoteconfig.internal.c) obj);
            }
        });
    }
}
