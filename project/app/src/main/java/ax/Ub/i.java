/*
 * Decompiled with CFR 0.152.
 */
package ax.Ub;

import ax.Gb.l;
import ax.Ob.h;
import ax.Qb.w0;
import ax.Tb.c;
import ax.Ub.e;
import ax.Ub.g;
import ax.Ub.j;
import ax.Ub.k;
import ax.sb.n;
import ax.sb.t;
import ax.xb.b;
import ax.yb.d;

public final class i<T>
extends d
implements c<T>,
ax.yb.e {
    public final c<T> e0;
    public final ax.wb.i f0;
    public final int g0;
    private ax.wb.i h0;
    private ax.wb.e<? super t> i0;

    public i(c<? super T> c8, ax.wb.i i8) {
        super(g.q, ax.wb.j.q);
        this.e0 = c8;
        this.f0 = i8;
        this.g0 = ((Number)i8.v(0, a.q)).intValue();
    }

    private final void u(ax.wb.i i8, ax.wb.i i9, T t8) {
        if (i9 instanceof e) {
            this.w((e)i9, t8);
        }
        k.a(this, i8);
    }

    private final Object v(ax.wb.e<? super t> object, T t8) {
        Object object2 = object.b();
        w0.f((ax.wb.i)object2);
        ax.wb.i i8 = this.h0;
        if (i8 != object2) {
            this.u((ax.wb.i)object2, i8, t8);
            this.h0 = object2;
        }
        this.i0 = object;
        object = j.a();
        object2 = this.e0;
        l.d(object2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        object = object.c(object2, t8, this);
        if (!l.a(object, b.c())) {
            this.i0 = null;
        }
        return object;
    }

    private final void w(e e8, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        stringBuilder.append(e8.q);
        stringBuilder.append(", but then emission attempt of value '");
        stringBuilder.append(object);
        stringBuilder.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(h.j(stringBuilder.toString()).toString());
    }

    @Override
    public ax.wb.i b() {
        ax.wb.i i8;
        ax.wb.i i9 = i8 = this.h0;
        if (i8 == null) {
            i9 = ax.wb.j.q;
        }
        return i9;
    }

    @Override
    public ax.yb.e d() {
        ax.wb.e<? super t> e8 = this.i0;
        if (e8 instanceof ax.yb.e) {
            return (ax.yb.e)((Object)e8);
        }
        return null;
    }

    @Override
    public Object e(T object, ax.wb.e<? super t> e8) {
        try {
            object = this.v(e8, object);
        }
        catch (Throwable throwable) {
            this.h0 = new e(throwable, e8.b());
            throw throwable;
        }
        if (object == b.c()) {
            ax.yb.h.c(e8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    @Override
    public StackTraceElement o() {
        return null;
    }

    @Override
    public Object p(Object object) {
        Object object2 = n.b(object);
        if (object2 != null) {
            this.h0 = new e((Throwable)object2, this.b());
        }
        if ((object2 = this.i0) != null) {
            object2.f(object);
        }
        return b.c();
    }

    @Override
    public void q() {
        super.q();
    }
}

