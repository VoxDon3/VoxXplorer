package ax.Vb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class q {
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;
    private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater c0 = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");
    private static final AtomicReferenceFieldUpdater d0 = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");

    public static abstract class a extends AbstractC0995b<q> {
        public final q b;
        public q c;

        public a(q qVar) {
            this.b = qVar;
        }

        @Override // ax.Vb.AbstractC0995b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z = obj == null;
            q qVar2 = z ? this.b : this.c;
            if (qVar2 != null && ax.D.b.a(q.q, qVar, this, qVar2) && z) {
                q qVar3 = this.b;
                q qVar4 = this.c;
                ax.Gb.l.c(qVar4);
                qVar3.o(qVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (ax.D.b.a(r4, r3, r2, ((ax.Vb.z) r5).a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ax.Vb.q l(ax.Vb.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ax.Vb.q.c0
            java.lang.Object r0 = r0.get(r8)
            ax.Vb.q r0 = (ax.Vb.q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ax.Vb.q.q
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ax.Vb.q.c0
            boolean r0 = ax.D.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.s()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof ax.Vb.y
            if (r6 == 0) goto L33
            ax.Vb.y r5 = (ax.Vb.y) r5
            r5.a(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof ax.Vb.z
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            ax.Vb.z r5 = (ax.Vb.z) r5
            ax.Vb.q r5 = r5.a
            boolean r2 = ax.D.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ax.Vb.q.c0
            java.lang.Object r2 = r4.get(r2)
            ax.Vb.q r2 = (ax.Vb.q) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            ax.Gb.l.d(r5, r3)
            r3 = r5
            ax.Vb.q r3 = (ax.Vb.q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Vb.q.l(ax.Vb.y):ax.Vb.q");
    }

    private final q n(q qVar) {
        while (qVar.s()) {
            qVar = (q) c0.get(qVar);
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c0;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (p() != qVar) {
                return;
            }
        } while (!ax.D.b.a(c0, qVar, qVar2, this));
        if (s()) {
            qVar.l(null);
        }
    }

    private final z v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public final boolean k(q qVar) {
        c0.lazySet(qVar, this);
        q.lazySet(qVar, this);
        while (p() == this) {
            if (ax.D.b.a(q, this, this, qVar)) {
                qVar.o(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q q() {
        return p.b(p());
    }

    public final q r() {
        q l = l(null);
        return l == null ? n((q) c0.get(this)) : l;
    }

    public boolean s() {
        return p() instanceof z;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return new ax.Gb.p(this) { // from class: ax.Vb.q.b
            @Override // ax.Mb.e
            public Object get() {
                return ax.Qb.N.a(this.c0);
            }
        } + '@' + ax.Qb.N.b(this);
    }

    public final q u() {
        Object p;
        q qVar;
        do {
            p = p();
            if (p instanceof z) {
                return ((z) p).a;
            }
            if (p == this) {
                return (q) p;
            }
            ax.Gb.l.d(p, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) p;
        } while (!ax.D.b.a(q, this, p, qVar.v()));
        qVar.l(null);
        return null;
    }

    public final int w(q qVar, q qVar2, a aVar) {
        c0.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.c = qVar2;
        if (ax.D.b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
