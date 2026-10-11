/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import ax.B2.i;
import ax.B2.l;
import ax.B2.t;
import ax.C2.D;
import ax.C2.o;
import ax.C2.u;
import ax.C2.x;
import ax.K2.a;
import ax.K2.n;
import ax.K2.v;
import ax.L2.b;
import ax.L2.d;
import ax.L2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class c
implements Runnable {
    private static final String d0 = i.i("EnqueueRunnable");
    private final o c0;
    private final x q;

    public c(x x8) {
        this(x8, new o());
    }

    public c(x x8, o o8) {
        this.q = x8;
        this.c0 = o8;
    }

    private static boolean b(x x8) {
        Set<String> set = x.l(x8);
        boolean bl = c.c(x8.g(), x8.f(), set.toArray(new String[0]), x8.d(), x8.b());
        x8.k();
        return bl;
    }

    private static boolean c(D object, List<? extends t> object2, String[] object3, String string, ax.B2.d object4) {
        boolean bl;
        boolean bl2;
        Object object5;
        Object object6;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        Object object7;
        long l8;
        block33: {
            block31: {
                block34: {
                    block35: {
                        Object object8;
                        block32: {
                            l8 = System.currentTimeMillis();
                            object7 = ((D)object).o();
                            n13 = object3 != null && ((String[])object3).length > 0 ? 1 : 0;
                            if (n13 != 0) {
                                int n14 = ((String[])object3).length;
                                int n15 = 0;
                                int n16 = 1;
                                n12 = 0;
                                n11 = 0;
                                while (true) {
                                    n10 = n16;
                                    n9 = n12;
                                    n8 = n11;
                                    if (n15 < n14) {
                                        object6 = object3[n15];
                                        object5 = ((WorkDatabase)object7).I().n((String)object6);
                                        if (object5 == null) {
                                            object = i.e();
                                            object2 = d0;
                                            object3 = new StringBuilder();
                                            ((StringBuilder)object3).append("Prerequisite ");
                                            ((StringBuilder)object3).append((String)object6);
                                            ((StringBuilder)object3).append(" doesn't exist; not enqueuing");
                                            ((i)object).c((String)object2, ((StringBuilder)object3).toString());
                                            return false;
                                        }
                                        object6 = ((v)object5).b;
                                        n8 = object6 == ax.B2.r.d0 ? 1 : 0;
                                        n16 &= n8;
                                        if (object6 == ax.B2.r.e0) {
                                            n8 = 1;
                                        } else {
                                            n8 = n11;
                                            if (object6 == ax.B2.r.g0) {
                                                n12 = 1;
                                                n8 = n11;
                                            }
                                        }
                                        ++n15;
                                        n11 = n8;
                                        continue;
                                    }
                                    break;
                                }
                            } else {
                                n10 = 1;
                                n9 = 0;
                                n8 = 0;
                            }
                            if ((bl2 = TextUtils.isEmpty((CharSequence)string)) || n13 != 0 || (object8 = ((WorkDatabase)object7).I().c(string)).isEmpty()) break block31;
                            if (object4 == ax.B2.d.d0 || object4 == ax.B2.d.e0) break block32;
                            if (object4 == ax.B2.d.c0) {
                                object4 = object8.iterator();
                                while (object4.hasNext()) {
                                    object6 = ((v.b)object4.next()).b;
                                    if (object6 != ax.B2.r.q && object6 != ax.B2.r.c0) continue;
                                    return false;
                                }
                            }
                            b.c(string, (D)object, false).run();
                            object4 = ((WorkDatabase)object7).I();
                            object6 = object8.iterator();
                            while (object6.hasNext()) {
                                object4.h(((v.b)object6.next()).a);
                            }
                            bl = true;
                            object4 = object3;
                            object6 = object7;
                            break block33;
                        }
                        object6 = ((WorkDatabase)object7).D();
                        object5 = new ArrayList<String>();
                        object8 = object8.iterator();
                        while (object8.hasNext()) {
                            v.b b8 = (v.b)object8.next();
                            if (!object6.d(b8.a)) {
                                ax.B2.r r8 = b8.b;
                                n11 = r8 == ax.B2.r.d0 ? 1 : 0;
                                if (r8 == ax.B2.r.e0) {
                                    n8 = 1;
                                    n13 = n9;
                                    n9 = n8;
                                } else {
                                    n13 = n9;
                                    n9 = n8;
                                    if (r8 == ax.B2.r.g0) {
                                        n13 = 1;
                                        n9 = n8;
                                    }
                                }
                                object5.add(b8.a);
                                n10 = n11 & n10;
                                n8 = n9;
                            } else {
                                n13 = n9;
                            }
                            n9 = n13;
                        }
                        n12 = n9;
                        n11 = n8;
                        object6 = object5;
                        if (object4 != ax.B2.d.e0) break block34;
                        if (n9 != 0) break block35;
                        n12 = n9;
                        n11 = n8;
                        object6 = object5;
                        if (n8 == 0) break block34;
                    }
                    object4 = ((WorkDatabase)object7).I();
                    object6 = object4.c(string).iterator();
                    while (object6.hasNext()) {
                        object4.h(((v.b)object6.next()).a);
                    }
                    object6 = Collections.EMPTY_LIST;
                    n12 = 0;
                    n11 = 0;
                }
                if (((Object)(object3 = (String[])object6.toArray((T[])object3))).length > 0) {
                    n13 = 1;
                    n9 = n12;
                    n8 = n11;
                } else {
                    n13 = 0;
                    n8 = n11;
                    n9 = n12;
                }
            }
            bl = false;
            object4 = object3;
            object6 = object7;
        }
        object3 = object2.iterator();
        object2 = object4;
        while (object3.hasNext()) {
            object5 = (t)object3.next();
            object4 = ((t)object5).d();
            if (n13 != 0 && n10 == 0) {
                ((v)object4).b = n8 != 0 ? ax.B2.r.e0 : (n9 != 0 ? ax.B2.r.g0 : ax.B2.r.f0);
            } else {
                ((v)object4).n = l8;
            }
            if (((v)object4).b == ax.B2.r.q) {
                bl = true;
            }
            ((WorkDatabase)object6).I().p(d.c(((D)object).m(), (v)object4));
            object4 = object2;
            object7 = object3;
            if (n13 != 0) {
                n12 = ((String[])object2).length;
                n11 = 0;
                while (true) {
                    object4 = object2;
                    object7 = object3;
                    if (n11 >= n12) break;
                    object4 = object2[n11];
                    object4 = new a(((t)object5).b(), (String)object4);
                    ((WorkDatabase)object6).D().b((a)object4);
                    ++n11;
                }
            }
            ((WorkDatabase)object6).J().c(((t)object5).b(), ((t)object5).c());
            if (!bl2) {
                ((WorkDatabase)object6).G().a(new n(string, ((t)object5).b()));
            }
            object3 = object7;
            object2 = object4;
        }
        return bl;
    }

    private static boolean e(x x8) {
        Object object = x8.e();
        boolean bl = false;
        boolean bl2 = false;
        if (object != null) {
            Iterator<x> iterator = object.iterator();
            while (true) {
                bl = bl2;
                if (!iterator.hasNext()) break;
                object = iterator.next();
                if (!((x)object).j()) {
                    bl2 |= c.e((x)object);
                    continue;
                }
                i i8 = i.e();
                String string = d0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Already enqueued work ids (");
                stringBuilder.append(TextUtils.join((CharSequence)", ", ((x)object).c()));
                stringBuilder.append(")");
                i8.k(string, stringBuilder.toString());
            }
        }
        return c.b(x8) | bl;
    }

    public boolean a() {
        WorkDatabase workDatabase = this.q.g().o();
        workDatabase.e();
        try {
            boolean bl = c.e(this.q);
            workDatabase.A();
            return bl;
        }
        finally {
            workDatabase.i();
        }
    }

    public l d() {
        return this.c0;
    }

    public void f() {
        D d8 = this.q.g();
        u.b(d8.h(), d8.o(), d8.m());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Throwable throwable2;
        block4: {
            block3: {
                try {
                    if (this.q.h()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("WorkContinuation has cycles (");
                        stringBuilder.append(this.q);
                        stringBuilder.append(")");
                        IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                        throw illegalStateException;
                    }
                    if (!this.a()) break block3;
                    r.a(this.q.g().g(), RescheduleReceiver.class, true);
                    this.f();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.c0.a(l.a);
            return;
        }
        this.c0.a(new l.b.a(throwable2));
    }
}

