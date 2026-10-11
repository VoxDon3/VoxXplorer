/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import ax.B2.i;
import ax.C2.G;
import ax.C2.e;
import ax.C2.p;
import ax.C2.q;
import ax.C2.t;
import ax.C2.v;
import ax.K2.m;
import ax.L2.y;
import ax.N2.c;
import ax.Q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class r
implements e,
ax.J2.a {
    private static final String m = ax.B2.i.i("Processor");
    private PowerManager.WakeLock a;
    private Context b;
    private androidx.work.a c;
    private c d;
    private WorkDatabase e;
    private Map<String, G> f;
    private Map<String, G> g;
    private Map<String, Set<v>> h;
    private List<t> i;
    private Set<String> j;
    private final List<e> k;
    private final Object l;

    public r(Context context, androidx.work.a a8, c c8, WorkDatabase workDatabase, List<t> list) {
        this.b = context;
        this.c = a8;
        this.d = c8;
        this.e = workDatabase;
        this.g = new HashMap<String, G>();
        this.f = new HashMap<String, G>();
        this.i = list;
        this.j = new HashSet<String>();
        this.k = new ArrayList<e>();
        this.a = null;
        this.l = new Object();
        this.h = new HashMap<String, Set<v>>();
    }

    public static /* synthetic */ void d(r r8, m m8, boolean bl) {
        r8.e(m8, bl);
    }

    public static /* synthetic */ ax.K2.v f(r r8, ArrayList arrayList, String string) {
        arrayList.addAll(r8.e.J().b(string));
        return r8.e.I().n(string);
    }

    private static boolean i(String string, G object) {
        if (object != null) {
            ((G)object).g();
            object = ax.B2.i.e();
            String string2 = m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WorkerWrapper interrupted for ");
            stringBuilder.append(string);
            ((i)object).a(string2, stringBuilder.toString());
            return true;
        }
        i i8 = ax.B2.i.e();
        String string3 = m;
        object = new StringBuilder();
        ((StringBuilder)object).append("WorkerWrapper could not be found for ");
        ((StringBuilder)object).append(string);
        i8.a(string3, ((StringBuilder)object).toString());
        return false;
    }

    private void m(m m8, boolean bl) {
        this.d.a().execute(new q(this, m8, bl));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void q() {
        var1_1 = this.l;
        synchronized (var1_1) {
            block8: {
                if (this.f.isEmpty()) {
                    var2_2 = androidx.work.impl.foreground.a.g(this.b);
                }
                ** GOTO lbl21
                {
                    block9: {
                        catch (Throwable var2_4) {
                            break block8;
                        }
                        try {
                            this.b.startService(var2_2);
                            break block9;
                        }
                        catch (Throwable var2_3) {}
                        ax.B2.i.e().d(r.m, "Unable to stop foreground service", var2_3);
                    }
                    var2_2 = this.a;
                    if (var2_2 != null) {
                        var2_2.release();
                        this.a = null;
                    }
lbl21:
                    // 4 sources

                    return;
                }
            }
            throw var2_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string) {
        Object object = this.l;
        synchronized (object) {
            this.f.remove(string);
            this.q();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean b(String string) {
        Object object = this.l;
        synchronized (object) {
            return this.f.containsKey(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(String string, ax.B2.e e8) {
        Object object = this.l;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block3: {
                    Object object2;
                    block4: {
                        try {
                            i i8 = ax.B2.i.e();
                            object2 = m;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Moving WorkSpec (");
                            stringBuilder.append(string);
                            stringBuilder.append(") to the foreground");
                            i8.f((String)object2, stringBuilder.toString());
                            object2 = this.g.remove(string);
                            if (object2 == null) break block3;
                            if (this.a != null) break block4;
                            i8 = y.b(this.b, "ProcessorForegroundLck");
                            this.a = i8;
                            i8.acquire();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.f.put(string, (G)object2);
                    string = androidx.work.impl.foreground.a.d(this.b, ((G)object2).d(), e8);
                    ax.Q.b.m(this.b, (Intent)string);
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
    public void e(m m8, boolean bl) {
        Object object = this.l;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Iterator<e> iterator;
                block5: {
                    try {
                        iterator = this.g.get(m8.b());
                        if (iterator == null || !m8.equals(((G)((Object)iterator)).d())) break block5;
                        this.g.remove(m8.b());
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                i i8 = ax.B2.i.e();
                iterator = m;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(" ");
                stringBuilder.append(m8.b());
                stringBuilder.append(" executed; reschedule = ");
                stringBuilder.append(bl);
                i8.a((String)((Object)iterator), stringBuilder.toString());
                iterator = this.k.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    iterator.next().e(m8, bl);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(e e8) {
        Object object = this.l;
        synchronized (object) {
            this.k.add(e8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.K2.v h(String object) {
        Object object2 = this.l;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                G g8;
                block3: {
                    try {
                        G g9;
                        g8 = g9 = this.f.get(object);
                        if (g9 != null) break block3;
                        g8 = this.g.get(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                if (g8 == null) return null;
                return g8.e();
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean j(String string) {
        Object object = this.l;
        synchronized (object) {
            return this.j.contains(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean k(String string) {
        Object object = this.l;
        synchronized (object) {
            try {
                if (this.g.containsKey(string)) return true;
                if (!this.f.containsKey(string)) return false;
                return true;
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
    public void l(e e8) {
        Object object = this.l;
        synchronized (object) {
            this.k.remove(e8);
            return;
        }
    }

    public boolean n(v v8) {
        return this.o(v8, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean o(v object, WorkerParameters.a object2) {
        Object object3;
        ax.K2.v v8;
        CharSequence charSequence;
        m m8;
        ArrayList<String> arrayList;
        block14: {
            block13: {
                arrayList = new ArrayList<String>();
                m8 = ((v)object).a();
                charSequence = m8.b();
                v8 = (ax.K2.v)this.e.z(new p(this, arrayList, (String)charSequence));
                if (v8 == null) {
                    i i8 = ax.B2.i.e();
                    object = m;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Didn't find WorkSpec for id ");
                    ((StringBuilder)object2).append(m8);
                    i8.k((String)object, ((StringBuilder)object2).toString());
                    this.m(m8, false);
                    return false;
                }
                object3 = this.l;
                // MONITORENTER : object3
                try {
                    boolean bl = this.k((String)charSequence);
                    if (!bl) break block13;
                }
                catch (Throwable throwable) {
                    throw object;
                }
                object2 = this.h.get(charSequence);
                if (object2.iterator().next().a().a() == m8.a()) {
                    object2.add((v)object);
                    object = ax.B2.i.e();
                    object2 = m;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Work ");
                    ((StringBuilder)charSequence).append(m8);
                    ((StringBuilder)charSequence).append(" is already enqueued for processing");
                    ((i)object).a((String)object2, ((StringBuilder)charSequence).toString());
                    return false;
                }
                this.m(m8, false);
                // MONITOREXIT : object3
                return false;
            }
            int n8 = v8.d();
            int n9 = m8.a();
            if (n8 == n9) break block14;
            try {
                this.m(m8, false);
                // MONITOREXIT : object3
                return false;
            }
            catch (Throwable throwable) {
                throw object;
            }
        }
        Context context = this.b;
        HashSet<Object> hashSet = this.c;
        c c8 = this.d;
        Object object4 = this.e;
        try {
            G.c c9 = new G.c(context, (androidx.work.a)((Object)hashSet), c8, this, (WorkDatabase)object4, v8, arrayList);
            object2 = c9.d(this.i).c((WorkerParameters.a)object2).b();
            hashSet = ((G)object2).c();
            object4 = new a(this, ((v)object).a(), (ax.v7.e<Boolean>)((Object)hashSet));
            hashSet.h((Runnable)object4, this.d.a());
            this.g.put((String)charSequence, (G)object2);
            hashSet = new HashSet<Object>();
            hashSet.add(object);
            this.h.put((String)charSequence, hashSet);
            // MONITOREXIT : object3
            this.d.b().execute((Runnable)object2);
        }
        catch (Throwable throwable) {
            throw object;
        }
        object = ax.B2.i.e();
        object3 = m;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.getClass().getSimpleName());
        ((StringBuilder)object2).append(": processing ");
        ((StringBuilder)object2).append(m8);
        ((i)object).a((String)object3, ((StringBuilder)object2).toString());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean p(String string) {
        Object object2 = this.l;
        // MONITORENTER : object2
        Object object = ax.B2.i.e();
        String string2 = m;
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append("Processor cancelling ");
        ((StringBuilder)object3).append(string);
        ((i)object).a(string2, ((StringBuilder)object3).toString());
        this.j.add(string);
        object3 = this.f.remove(string);
        boolean bl = object3 != null;
        object = object3;
        if (object3 == null) {
            object = this.g.remove(string);
        }
        if (object != null) {
            this.h.remove(string);
        }
        // MONITOREXIT : object2
        boolean bl2 = r.i(string, (G)object);
        if (!bl) return bl2;
        this.q();
        return bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean r(v object) {
        String string = ((v)object).a().b();
        object = this.l;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    try {
                        i i8 = ax.B2.i.e();
                        object2 = m;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Processor stopping foreground work ");
                        stringBuilder.append(string);
                        i8.a((String)object2, stringBuilder.toString());
                        object2 = this.f.remove(string);
                        if (object2 == null) break block4;
                        this.h.remove(string);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return r.i(string, (G)object2);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean s(v object) {
        String string = ((v)object).a().b();
        Object object2 = this.l;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Object object3;
                try {
                    object3 = this.g.remove(string);
                    if (object3 == null) {
                        object = ax.B2.i.e();
                        object3 = m;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("WorkerWrapper could not be found for ");
                        stringBuilder.append(string);
                        ((i)object).a((String)object3, stringBuilder.toString());
                        return false;
                    }
                    Set<v> set = this.h.get(string);
                    if (set == null || !set.contains(object)) break block5;
                    set = ax.B2.i.e();
                    object = m;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Processor stopping background work ");
                    stringBuilder.append(string);
                    ((i)((Object)set)).a((String)object, stringBuilder.toString());
                    this.h.remove(string);
                }
                catch (Throwable throwable2) {}
                return r.i(string, (G)object3);
            }
            return false;
            throw throwable2;
        }
    }

    private static class a
    implements Runnable {
        private final m c0;
        private ax.v7.e<Boolean> d0;
        private e q;

        a(e e8, m m8, ax.v7.e<Boolean> e9) {
            this.q = e8;
            this.c0 = m8;
            this.d0 = e9;
        }

        @Override
        public void run() {
            boolean bl;
            try {
                bl = (Boolean)this.d0.get();
            }
            catch (InterruptedException | ExecutionException exception) {
                bl = true;
            }
            this.q.e(this.c0, bl);
        }
    }
}

