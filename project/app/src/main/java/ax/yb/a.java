/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.l;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.xb.b;
import ax.yb.e;
import ax.yb.g;
import ax.yb.h;
import java.io.Serializable;

public abstract class a
implements ax.wb.e<Object>,
e,
Serializable {
    private final ax.wb.e<Object> q;

    public a(ax.wb.e<Object> e8) {
        this.q = e8;
    }

    public ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
        l.f(e8, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override
    public e d() {
        ax.wb.e<Object> e8 = this.q;
        if (e8 instanceof e) {
            return (e)((Object)e8);
        }
        return null;
    }

    @Override
    public final void f(Object object) {
        ax.wb.e<Object> e8 = this;
        do {
            h.b(e8);
            a a8 = e8;
            e8 = a8.q;
            l.c(e8);
            try {
                object = a8.p(object);
                if (object == b.c()) {
                    return;
                }
                object = n.a(object);
            }
            catch (Throwable throwable) {
                n.a a9 = n.q;
                object = n.a(o.a(throwable));
            }
            a8.q();
        } while (e8 instanceof a);
        e8.f(object);
    }

    public final ax.wb.e<Object> h() {
        return this.q;
    }

    public StackTraceElement o() {
        return g.d(this);
    }

    protected abstract Object p(Object var1);

    protected void q() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Continuation at ");
        Object object = this.o();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

