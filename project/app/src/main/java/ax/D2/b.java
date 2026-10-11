/*
 * Decompiled with CFR 0.152.
 */
package ax.D2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import ax.B2.i;
import ax.B2.r;
import ax.C2.D;
import ax.C2.v;
import ax.C2.w;
import ax.D2.a;
import ax.G2.c;
import ax.G2.d;
import ax.G2.e;
import ax.I2.o;
import ax.K2.m;
import ax.K2.y;
import ax.L2.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b
implements ax.C2.t,
c,
ax.C2.e {
    private static final String j = ax.B2.i.i("GreedyScheduler");
    private final Context a;
    private final D b;
    private final d c;
    private final Set<ax.K2.v> d = new HashSet<ax.K2.v>();
    private a e;
    private boolean f;
    private final Object g;
    private final w h = new w();
    Boolean i;

    public b(Context context, androidx.work.a a8, o o8, D d8) {
        this.a = context;
        this.b = d8;
        this.c = new e(o8, this);
        this.e = new a(this, a8.k());
        this.g = new Object();
    }

    private void g() {
        androidx.work.a a8 = this.b.h();
        this.i = t.b(this.a, a8);
    }

    private void h() {
        if (!this.f) {
            this.b.l().g(this);
            this.f = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(m m8) {
        Object object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    Object object2 = this.d.iterator();
                    while (object2.hasNext()) {
                        ax.K2.v v8 = object2.next();
                        if (!y.a(v8).equals(m8)) continue;
                        i i8 = ax.B2.i.e();
                        object2 = j;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Stopping tracking for ");
                        stringBuilder.append(m8);
                        i8.a((String)object2, stringBuilder.toString());
                        this.d.remove(v8);
                        this.c.b(this.d);
                        break;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(ax.K2.v ... object) {
        Object object2;
        Object object3;
        if (this.i == null) {
            this.g();
        }
        if (!this.i.booleanValue()) {
            ax.B2.i.e().f(j, "Ignoring schedule request in a secondary process");
            return;
        }
        this.h();
        HashSet<Object> hashSet = new HashSet<Object>();
        Object object4 = new HashSet();
        for (Object object5 : object) {
            StringBuilder stringBuilder;
            object3 = y.a((ax.K2.v)object5);
            if (this.h.a((m)object3)) continue;
            long l8 = ((ax.K2.v)object5).a();
            long l9 = System.currentTimeMillis();
            if (((ax.K2.v)object5).b != r.q) continue;
            if (l9 < l8) {
                object3 = this.e;
                if (object3 == null) continue;
                ((a)object3).a((ax.K2.v)object5);
                continue;
            }
            if (((ax.K2.v)object5).f()) {
                int n8 = Build.VERSION.SDK_INT;
                if (n8 >= 23 && ((ax.K2.v)object5).j.h()) {
                    object2 = ax.B2.i.e();
                    object3 = j;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring ");
                    stringBuilder.append(object5);
                    stringBuilder.append(". Requires device idle.");
                    ((i)object2).a((String)object3, stringBuilder.toString());
                    continue;
                }
                if (n8 >= 24 && ((ax.K2.v)object5).j.e()) {
                    object3 = ax.B2.i.e();
                    object2 = j;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring ");
                    stringBuilder.append(object5);
                    stringBuilder.append(". Requires ContentUri triggers.");
                    ((i)object3).a((String)object2, stringBuilder.toString());
                    continue;
                }
                hashSet.add(object5);
                object4.add(((ax.K2.v)object5).a);
                continue;
            }
            if (this.h.a(y.a((ax.K2.v)object5))) continue;
            object2 = ax.B2.i.e();
            object3 = j;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Starting work for ");
            stringBuilder.append(((ax.K2.v)object5).a);
            ((i)object2).a((String)object3, stringBuilder.toString());
            this.b.u(this.h.e((ax.K2.v)object5));
        }
        object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block11: {
                block10: {
                    try {
                        Object object5;
                        if (hashSet.isEmpty()) break block10;
                        object3 = TextUtils.join((CharSequence)",", object4);
                        object4 = ax.B2.i.e();
                        object2 = j;
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append("Starting tracking for ");
                        ((StringBuilder)object5).append((String)object3);
                        ((i)object4).a((String)object2, ((StringBuilder)object5).toString());
                        this.d.addAll(hashSet);
                        this.c.b(this.d);
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void b(List<ax.K2.v> object) {
        object = object.iterator();
        while (object.hasNext()) {
            m m8 = y.a((ax.K2.v)object.next());
            Object object2 = ax.B2.i.e();
            String string = j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Constraints not met: Cancelling work ID ");
            stringBuilder.append(m8);
            ((i)object2).a(string, stringBuilder.toString());
            object2 = this.h.b(m8);
            if (object2 == null) continue;
            this.b.x((v)object2);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void d(String object) {
        if (this.i == null) {
            this.g();
        }
        if (!this.i.booleanValue()) {
            ax.B2.i.e().f(j, "Ignoring schedule request in non-main process");
            return;
        }
        this.h();
        i object22 = ax.B2.i.e();
        String string = j;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cancelling work ID ");
        stringBuilder.append((String)((Object)object));
        object22.a(string, stringBuilder.toString());
        a a8 = this.e;
        if (a8 != null) {
            a8.b((String)((Object)object));
        }
        for (v v8 : this.h.c((String)((Object)object))) {
            this.b.x(v8);
        }
    }

    @Override
    public void e(m m8, boolean bl) {
        this.h.b(m8);
        this.i(m8);
    }

    @Override
    public void f(List<ax.K2.v> object) {
        Iterator<ax.K2.v> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = y.a(iterator.next());
            if (this.h.a((m)object)) continue;
            i i8 = ax.B2.i.e();
            String string = j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Constraints met: Scheduling work ID ");
            stringBuilder.append(object);
            i8.a(string, stringBuilder.toString());
            this.b.u(this.h.d((m)object));
        }
    }
}

