/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.Fb.q;
import ax.Qb.N;
import ax.Qb.R0;
import ax.Qb.l;
import ax.Qb.m;
import ax.Qb.o;
import ax.Vb.C;
import ax.Vb.F;
import ax.Zb.c;
import ax.Zb.d;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import ax.yb.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class b
extends d
implements ax.Zb.a {
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");
    private final q<ax.Yb.b<?>, Object, Object, ax.Fb.l<Throwable, t>> h;
    private volatile Object owner;

    public b(boolean bl) {
        super(1, bl ? 1 : 0);
        F f8 = bl ? null : c.c();
        this.owner = f8;
        this.h = new q<ax.Yb.b<?>, Object, Object, ax.Fb.l<? super Throwable, ? extends t>>(this){
            final b q;
            {
                this.q = b8;
                super(3);
            }

            public final ax.Fb.l<Throwable, t> a(ax.Yb.b<?> b8, Object object, Object object2) {
                return new ax.Fb.l<Throwable, t>(this.q, object){
                    final Object c0;
                    final b q;
                    {
                        this.q = b8;
                        this.c0 = object;
                        super(1);
                    }

                    public final void a(Throwable throwable) {
                        this.q.c(this.c0);
                    }
                };
            }
        };
    }

    private final int n(Object object) {
        Object v8;
        do {
            if (this.b()) continue;
            return 0;
        } while ((v8 = i.get(this)) == c.c());
        if (v8 == object) {
            return 1;
        }
        return 2;
    }

    static /* synthetic */ Object o(b object, Object object2, e<? super t> e8) {
        if (((b)object).q(object2)) {
            return t.a;
        }
        if ((object = ((b)object).p(object2, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    private final Object p(Object object, e<? super t> e8) {
        m<? super t> m8 = o.b(ax.xb.b.b(e8));
        try {
            a a8 = new a(this, m8, object);
            this.d(a8);
            object = m8.z();
        }
        catch (Throwable throwable) {
            m8.L();
            throw throwable;
        }
        if (object == ax.xb.b.c()) {
            ax.yb.h.c(e8);
        }
        if (object == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    private final int r(Object object) {
        block3: {
            int n8;
            do {
                if (this.j()) {
                    i.set(this, object);
                    return 0;
                }
                if (object == null) {
                    return 1;
                }
                n8 = this.n(object);
                if (n8 == 1) break block3;
            } while (n8 != 2);
            return 1;
        }
        return 2;
    }

    @Override
    public Object a(Object object, e<? super t> e8) {
        return b.o(this, object, e8);
    }

    @Override
    public boolean b() {
        return this.h() == 0;
    }

    @Override
    public void c(Object object) {
        while (this.b()) {
            Object object2 = i;
            Object v8 = ((AtomicReferenceFieldUpdater)object2).get(this);
            if (v8 == c.c()) continue;
            if (v8 != object && object != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("This mutex is locked by ");
                ((StringBuilder)object2).append(v8);
                ((StringBuilder)object2).append(", but ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" is expected");
                throw new IllegalStateException(((StringBuilder)object2).toString().toString());
            }
            if (!ax.D.b.a((AtomicReferenceFieldUpdater)object2, this, v8, c.c())) continue;
            this.i();
            return;
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public boolean q(Object object) {
        int n8 = this.r(object);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("This mutex is already locked by the specified owner: ");
                stringBuilder.append(object);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutex@");
        stringBuilder.append(N.b(this));
        stringBuilder.append("[isLocked=");
        stringBuilder.append(this.b());
        stringBuilder.append(",owner=");
        stringBuilder.append(i.get(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private final class a
    implements l<t>,
    R0 {
        public final Object c0;
        final b d0;
        public final m<t> q;

        public a(b b8, m<? super t> m8, Object object) {
            this.d0 = b8;
            this.q = m8;
            this.c0 = object;
        }

        @Override
        public void a(C<?> c8, int n8) {
            this.q.a(c8, n8);
        }

        @Override
        public i b() {
            return this.q.b();
        }

        public void c(t t8, ax.Fb.l<? super Throwable, t> l8) {
            i.set(this.d0, this.c0);
            this.q.k(t8, new ax.Fb.l<Throwable, t>(this.d0, this){
                final a c0;
                final b q;
                {
                    this.q = b8;
                    this.c0 = a8;
                    super(1);
                }

                public final void a(Throwable throwable) {
                    this.q.c(this.c0.c0);
                }
            });
        }

        public Object d(t object, Object object2, ax.Fb.l<? super Throwable, t> object3) {
            object3 = this.d0;
            if ((object = this.q.l((t)object, object2, new ax.Fb.l<Throwable, t>((b)object3, this){
                final a c0;
                final b q;
                {
                    this.q = b8;
                    this.c0 = a8;
                    super(1);
                }

                public final void a(Throwable throwable) {
                    i.set(this.q, this.c0.c0);
                    this.q.c(this.c0.c0);
                }
            })) != null) {
                i.set(this.d0, this.c0);
            }
            return object;
        }

        @Override
        public void f(Object object) {
            this.q.f(object);
        }

        @Override
        public boolean n(Throwable throwable) {
            return this.q.n(throwable);
        }

        @Override
        public void r(ax.Fb.l<? super Throwable, t> l8) {
            this.q.r(l8);
        }

        @Override
        public void s(Object object) {
            this.q.s(object);
        }
    }
}

