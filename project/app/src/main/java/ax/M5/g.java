/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import ax.K5.a;
import ax.K5.g;
import ax.L5.i;
import ax.M5.F;
import ax.M5.G;
import ax.M5.c;
import ax.M5.d;
import ax.M5.h;
import ax.M5.p;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class g<T extends IInterface>
extends c<T>
implements a.f {
    private final d G0;
    private final Set H0;
    private final Account I0;

    @Deprecated
    protected g(Context context, Looper looper, int n8, d d8, g.a a8, g.b b8) {
        this(context, looper, n8, d8, (ax.L5.c)a8, (i)b8);
    }

    protected g(Context context, Looper looper, int n8, d d8, ax.L5.c c8, i i8) {
        this(context, looper, h.c(context), ax.J5.h.o(), n8, d8, p.l(c8), p.l(i8));
    }

    protected g(Context context, Looper looper, h h8, ax.J5.h h9, int n8, d d8, ax.L5.c object, i object2) {
        Object var9_9 = null;
        object = object == null ? null : new F((ax.L5.c)object);
        object2 = object2 == null ? var9_9 : new G((i)object2);
        super(context, looper, h8, h9, n8, (c.a)object, (c.b)object2, d8.j());
        this.G0 = d8;
        this.I0 = d8.a();
        this.H0 = this.l0(d8.d());
    }

    private final Set l0(Set set) {
        Set<Scope> set2 = this.k0(set);
        Iterator<Scope> iterator = set2.iterator();
        while (iterator.hasNext()) {
            if (set.contains(iterator.next())) continue;
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        return set2;
    }

    @Override
    protected final Set<Scope> C() {
        return this.H0;
    }

    @Override
    public Set<Scope> d() {
        if (this.o()) {
            return this.H0;
        }
        return Collections.EMPTY_SET;
    }

    protected final d j0() {
        return this.G0;
    }

    protected Set<Scope> k0(Set<Scope> set) {
        return set;
    }

    @Override
    public final Account u() {
        return this.I0;
    }

    @Override
    protected Executor w() {
        return null;
    }
}

