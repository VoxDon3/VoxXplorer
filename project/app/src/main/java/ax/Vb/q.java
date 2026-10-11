/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.l;
import ax.Qb.N;
import ax.Vb.b;
import ax.Vb.p;
import ax.Vb.y;
import ax.Vb.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class q {
    private static final AtomicReferenceFieldUpdater c0;
    private static final AtomicReferenceFieldUpdater d0;
    private static final AtomicReferenceFieldUpdater q;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    static {
        q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");
        c0 = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");
        d0 = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final q l(y var1_1) {
        block0: while (true) {
            var2_2 /* !! */  = var4_4 = (q)ax.Vb.q.c0.get(this);
            block1: while (true) {
                var3_3 = null;
                while (true) {
                    block14: {
                        block13: {
                            block12: {
                                if ((var5_5 /* !! */  = (var6_6 = ax.Vb.q.q).get(var2_2 /* !! */ )) != this) break block12;
                                if (var4_4 != var2_2 /* !! */  && !ax.D.b.a(ax.Vb.q.c0, this, var4_4, var2_2 /* !! */ )) {
                                    continue block0;
                                }
                                break block13;
                            }
                            if (this.s()) {
                                return null;
                            }
                            if (var5_5 /* !! */  != var1_1) break block14;
                        }
                        return var2_2 /* !! */ ;
                    }
                    if (var5_5 /* !! */  instanceof y) {
                        ((y)var5_5 /* !! */ ).a(var2_2 /* !! */ );
                        continue block0;
                    }
                    if (var5_5 /* !! */  instanceof z) {
                        if (var3_3 != null) {
                            if (ax.D.b.a(var6_6, var3_3, var2_2 /* !! */ , ((z)var5_5 /* !! */ ).a)) ** break;
                            continue block0;
                            var2_2 /* !! */  = var3_3;
                            continue block1;
                        }
                        var2_2 /* !! */  = (q)ax.Vb.q.c0.get(var2_2 /* !! */ );
                        continue;
                    }
                    l.d(var5_5 /* !! */ , "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    var5_5 /* !! */  = (q)var5_5 /* !! */ ;
                    var3_3 = var2_2 /* !! */ ;
                    var2_2 /* !! */  = var5_5 /* !! */ ;
                }
                break;
            }
            break;
        }
    }

    private final q n(q q8) {
        while (q8.s()) {
            q8 = (q)c0.get(q8);
        }
        return q8;
    }

    private final void o(q q8) {
        block2: {
            q q9;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c0;
            do {
                q9 = (q)atomicReferenceFieldUpdater.get(q8);
                if (this.p() != q8) break block2;
            } while (!ax.D.b.a(c0, q8, q9, this));
            if (this.s()) {
                q8.l(null);
            }
        }
    }

    private final z v() {
        z z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0;
        z z9 = z8 = (z)atomicReferenceFieldUpdater.get(this);
        if (z8 == null) {
            z9 = new z(this);
            atomicReferenceFieldUpdater.lazySet(this, z9);
        }
        return z9;
    }

    public final boolean k(q q8) {
        c0.lazySet(q8, this);
        q.lazySet(q8, this);
        do {
            if (this.p() == this) continue;
            return false;
        } while (!ax.D.b.a(q, this, this, q8));
        q8.o(this);
        return true;
    }

    public final Object p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        Object v8;
        while ((v8 = atomicReferenceFieldUpdater.get(this)) instanceof y) {
            ((y)v8).a(this);
        }
        return v8;
    }

    public final q q() {
        return p.b(this.p());
    }

    public final q r() {
        q q8;
        q q9 = q8 = this.l(null);
        if (q8 == null) {
            q9 = this.n((q)c0.get(this));
        }
        return q9;
    }

    public boolean s() {
        return this.p() instanceof z;
    }

    public boolean t() {
        return this.u() == null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new ax.Gb.p(this){

            public Object get() {
                return N.a(this.c0);
            }
        });
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        return stringBuilder.toString();
    }

    public final q u() {
        q q8;
        z z8;
        Object object;
        do {
            if ((object = this.p()) instanceof z) {
                return ((z)object).a;
            }
            if (object == this) {
                return (q)object;
            }
            l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        } while (!ax.D.b.a(q, this, object, z8 = (q8 = (q)object).v()));
        q8.l(null);
        return null;
    }

    public final int w(q q8, q q9, a a8) {
        c0.lazySet(q8, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        atomicReferenceFieldUpdater.lazySet(q8, q9);
        a8.c = q9;
        if (!ax.D.b.a(atomicReferenceFieldUpdater, this, q9, a8)) {
            return 0;
        }
        if (a8.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public static abstract class a
    extends b<q> {
        public final q b;
        public q c;

        public a(q q8) {
            this.b = q8;
        }

        public void e(q q8, Object object) {
            boolean bl = object == null;
            if ((object = bl ? this.b : this.c) != null && ax.D.b.a(q, q8, this, object) && bl) {
                q8 = this.b;
                object = this.c;
                l.c(object);
                q8.o((q)object);
            }
        }
    }
}

