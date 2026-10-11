/*
 * Decompiled with CFR 0.152.
 */
package ax.G2;

import ax.B2.i;
import ax.G2.c;
import ax.G2.d;
import ax.G2.f;
import ax.Gb.l;
import ax.H2.a;
import ax.H2.b;
import ax.H2.c;
import ax.H2.g;
import ax.H2.h;
import ax.I2.o;
import ax.K2.v;
import ax.sb.t;
import java.util.ArrayList;
import java.util.List;

public final class e
implements d,
c.a {
    private final c a;
    private final ax.H2.c<?>[] b;
    private final Object c;

    public e(c c8, ax.H2.c<?>[] cArray) {
        l.f(cArray, "constraintControllers");
        this.a = c8;
        this.b = cArray;
        this.c = new Object();
    }

    public e(o o8, c c8) {
        l.f(o8, "trackers");
        this(c8, new ax.H2.c[]{new a(o8.a()), new b(o8.b()), new h(o8.d()), new ax.H2.d(o8.c()), new g(o8.c()), new ax.H2.f(o8.c()), new ax.H2.e(o8.c())});
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.b;
                    int n8 = ((ax.H2.c<?>[])object2).length;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        object2[i8].f();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    object2 = t.a;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(Iterable<v> object) {
        l.f(object, "workSpecs");
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block9: {
                int n8;
                int n9;
                ax.H2.c<?>[] cArray;
                try {
                    cArray = this.b;
                    n9 = cArray.length;
                    int n10 = 0;
                    for (n8 = 0; n8 < n9; ++n8) {
                        cArray[n8].g(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                {
                    cArray = this.b;
                    n9 = cArray.length;
                    for (n8 = 0; n8 < n9; ++n8) {
                        cArray[n8].e((Iterable<v>)object);
                    }
                }
                {
                    object = this.b;
                    n9 = ((ax.H2.c<?>[])object).length;
                    for (n8 = n10; n8 < n9; ++n8) {
                        object[n8].g(this);
                    }
                }
                {
                    object = t.a;
                    return;
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
    @Override
    public void c(List<v> object) {
        l.f(object, "workSpecs");
        Object object2 = this.c;
        synchronized (object2) {
            int n8;
            Object object3;
            Object object4;
            try {
                object4 = (Iterable)object;
                object = new ArrayList();
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    object4 = object3.next();
                    if (!this.e(((v)object4).a)) continue;
                    object.add(object4);
                }
                n8 = ((ArrayList)object).size();
            }
            catch (Throwable throwable) {}
            throw throwable;
            for (int i8 = 0; i8 < n8; ++i8) {
                object4 = ((ArrayList)object).get(i8);
                v v8 = (v)object4;
                object4 = i.e();
                object3 = f.a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Constraints met for ");
                stringBuilder.append(v8);
                ((i)object4).a((String)object3, stringBuilder.toString());
            }
            object4 = this.a;
            if (object4 != null) {
                object4.f((List<v>)object);
                object = t.a;
            }
            return;
        }
    }

    @Override
    public void d(List<v> object) {
        l.f(object, "workSpecs");
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    c c8;
                    try {
                        c8 = this.a;
                        if (c8 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    c8.b((List<v>)object);
                    object = t.a;
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
    public final boolean e(String string) {
        l.f(string, "workSpecId");
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                ax.H2.c<?> c8;
                boolean bl;
                block8: {
                    Object object2;
                    block7: {
                        object2 = this.b;
                        int n8 = ((ax.H2.c<?>[])object2).length;
                        bl = false;
                        int n9 = 0;
                        while (n9 < n8) {
                            c8 = object2[n9];
                            if (!c8.d(string)) {
                                ++n9;
                                continue;
                            }
                            break block7;
                        }
                        return true;
                    }
                    if (c8 == null) break block8;
                    try {
                        i i8 = i.e();
                        String string2 = f.a();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Work ");
                        ((StringBuilder)object2).append(string);
                        ((StringBuilder)object2).append(" constrained by ");
                        ((StringBuilder)object2).append(c8.getClass().getSimpleName());
                        i8.a(string2, ((StringBuilder)object2).toString());
                    }
                    catch (Throwable throwable2) {}
                    break block9;
                }
                if (c8 != null) return bl;
                return true;
            }
            throw throwable2;
        }
    }
}

