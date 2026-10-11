/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import ax.G2.a;
import ax.Gb.l;
import ax.I2.i;
import ax.N2.c;
import ax.sb.t;
import ax.tb.o;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class h<T> {
    private final c a;
    private final Context b;
    private final Object c;
    private final LinkedHashSet<a<T>> d;
    private T e;

    protected h(Context context, c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        this.a = c8;
        context = context.getApplicationContext();
        l.e(context, "context.applicationContext");
        this.b = context;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public static /* synthetic */ void a(List list, h h8) {
        h.b(list, h8);
    }

    private static final void b(List object, h h8) {
        l.f(object, "$listenersList");
        l.f(h8, "this$0");
        object = ((Iterable)object).iterator();
        while (object.hasNext()) {
            ((a)object.next()).a(h8.e);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(a<T> object) {
        l.f(object, "listener");
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            if (!((AbstractCollection)this.d).add((a<T>)object)) break block3;
                            if (((AbstractCollection)this.d).size() != 1) break block4;
                            this.e = this.e();
                            ax.B2.i i8 = ax.B2.i.e();
                            String string = i.a();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.getClass().getSimpleName());
                            stringBuilder.append(": initial state = ");
                            stringBuilder.append(this.e);
                            i8.a(string, stringBuilder.toString());
                            this.h();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object.a(this.e);
                }
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    protected final Context d() {
        return this.b;
    }

    public abstract T e();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(a<T> object) {
        l.f(object, "listener");
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!((AbstractCollection)this.d).remove(object) || !((AbstractCollection)this.d).isEmpty()) break block3;
                        this.i();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = t.a;
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
    public final void g(T object) {
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            Object object3;
            block4: {
                try {
                    boolean bl;
                    object3 = this.e;
                    if (object3 == null || !(bl = l.a(object3, object))) break block4;
                }
                catch (Throwable throwable2) {}
                return;
            }
            this.e = object;
            object = o.V(this.d);
            Executor executor = this.a.a();
            object3 = new Object((List)object, this);
            executor.execute((Runnable)object3);
            object = t.a;
            return;
            throw throwable2;
        }
    }

    public abstract void h();

    public abstract void i();
}

