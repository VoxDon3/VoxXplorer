/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Gb.v;
import ax.Qb.A0;
import ax.Qb.B;
import ax.Qb.C;
import ax.Qb.E0;
import ax.Qb.F0;
import ax.Qb.H0;
import ax.Qb.I0;
import ax.Qb.N;
import ax.Qb.Z;
import ax.Qb.b0;
import ax.Qb.m;
import ax.Qb.m0;
import ax.Qb.n0;
import ax.Qb.o;
import ax.Qb.q0;
import ax.Qb.r;
import ax.Qb.r0;
import ax.Qb.s;
import ax.Qb.s0;
import ax.Qb.t;
import ax.Qb.t0;
import ax.Qb.u0;
import ax.Qb.y0;
import ax.Qb.z;
import ax.Vb.p;
import ax.Vb.q;
import ax.Vb.y;
import ax.wb.e;
import ax.wb.i;
import ax.yb.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class z0
implements s0,
t,
H0 {
    private static final AtomicReferenceFieldUpdater c0;
    private static final AtomicReferenceFieldUpdater q;
    private volatile Object _parentHandle;
    private volatile Object _state;

    static {
        q = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state");
        c0 = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_parentHandle");
    }

    public z0(boolean bl) {
        b0 b02 = bl ? A0.c() : A0.d();
        this._state = b02;
    }

    private final boolean B0(n0 n02, Object object) {
        if (!ax.D.b.a(q, this, n02, A0.g(object))) {
            return false;
        }
        this.l0(null);
        this.m0(object);
        this.J(n02, object);
        return true;
    }

    private final boolean C0(n0 n02, Throwable throwable) {
        E0 e02 = this.U(n02);
        if (e02 == null) {
            return false;
        }
        c c8 = new c(e02, false, throwable);
        if (!ax.D.b.a(q, this, n02, c8)) {
            return false;
        }
        this.j0(e02, throwable);
        return true;
    }

    private final Object D(Object object) {
        Object object2;
        while (!(!((object2 = this.W()) instanceof n0) || object2 instanceof c && ((c)object2).h())) {
            if ((object2 = this.E0(object2, new z(this.M(object), false, 2, null))) == A0.b()) continue;
            return object2;
        }
        return A0.a();
    }

    private final boolean E(Throwable throwable) {
        if (this.b0()) {
            return true;
        }
        boolean bl = throwable instanceof CancellationException;
        r r8 = this.V();
        if (r8 != null && r8 != F0.q) {
            return r8.h(throwable) || bl;
            {
            }
        }
        return bl;
    }

    private final Object E0(Object object, Object object2) {
        if (!(object instanceof n0)) {
            return A0.a();
        }
        if ((object instanceof b0 || object instanceof y0) && !(object instanceof s) && !(object2 instanceof z)) {
            if (this.B0((n0)object, object2)) {
                return object2;
            }
            return A0.b();
        }
        return this.G0((n0)object, object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object G0(n0 object, Object object2) {
        E0 e02 = this.U((n0)object);
        if (e02 == null) {
            return A0.b();
        }
        boolean bl = object instanceof c;
        ax.sb.t t8 = null;
        Object object3 = bl ? (c)object : null;
        c c8 = object3;
        if (object3 == null) {
            c8 = new c(e02, false, null);
        }
        v v8 = new v();
        synchronized (c8) {
            try {
                if (c8.h()) {
                    return A0.a();
                }
                c8.k(true);
                if (c8 != object && !ax.D.b.a(q, this, object, c8)) {
                    return A0.b();
                }
                bl = c8.g();
                object3 = object2 instanceof z ? (z)object2 : null;
                if (object3 != null) {
                    c8.b(((z)object3).a);
                }
                Throwable throwable = c8.f();
                object3 = t8;
                if (!bl) {
                    object3 = throwable;
                }
                v8.q = object3;
                t8 = ax.sb.t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl28 : MonitorExitStatement: MONITOREXIT : var5_8
                if (object3 != null) {
                    this.j0(e02, (Throwable)object3);
                }
                if ((object = this.O((n0)object)) == null) return this.N(c8, object2);
                if (!this.H0(c8, (s)object, object2)) return this.N(c8, object2);
                return A0.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private final boolean H0(c c8, s s8, Object object) {
        s s9;
        do {
            if (s0.a.d(s8.f0, false, false, new b(this, c8, s8, object), 1, null) != F0.q) {
                return true;
            }
            s8 = s9 = this.i0(s8);
        } while (s9 != null);
        return false;
    }

    private final void J(n0 n02, Object object) {
        Object object2 = this.V();
        if (object2 != null) {
            object2.d();
            this.t0(F0.q);
        }
        boolean bl = object instanceof z;
        Object var5_6 = null;
        object2 = bl ? (z)object : null;
        object = var5_6;
        if (object2 != null) {
            object = ((z)object2).a;
        }
        if (n02 instanceof y0) {
            try {
                ((y0)n02).x((Throwable)object);
                return;
            }
            catch (Throwable throwable) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Exception in completion handler ");
                ((StringBuilder)object).append(n02);
                ((StringBuilder)object).append(" for ");
                ((StringBuilder)object).append(this);
                this.Y(new C(((StringBuilder)object).toString(), throwable));
            }
        } else if ((n02 = n02.a()) != null) {
            this.k0((E0)n02, (Throwable)object);
        }
    }

    private final void K(c c8, s s8, Object object) {
        if ((s8 = this.i0(s8)) != null && this.H0(c8, s8, object)) {
            return;
        }
        this.w(this.N(c8, object));
    }

    private final Throwable M(Object object) {
        boolean bl = object == null ? true : object instanceof Throwable;
        if (bl) {
            Throwable throwable = (Throwable)object;
            object = throwable;
            if (throwable == null) {
                object = new t0(this.G(), null, this);
            }
            return object;
        }
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((H0)object).D0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object N(c c8, Object object) {
        Object object2 = object instanceof z ? (z)object : null;
        object2 = object2 != null ? ((z)object2).a : null;
        // MONITORENTER : c8
        boolean bl = c8.g();
        List<Throwable> list = c8.j((Throwable)object2);
        Throwable throwable = this.R(c8, list);
        if (throwable != null) {
            this.u(throwable, list);
        }
        if (throwable != null && throwable != object2) {
            object = new z(throwable, false, 2, null);
        }
        if (throwable != null && (this.E(throwable) || this.X(throwable))) {
            l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((z)object).b();
        }
        if (!bl) {
            this.l0(throwable);
        }
        this.m0(object);
        ax.D.b.a(q, this, c8, A0.g(object));
        this.J(c8, object);
        return object;
    }

    private final s O(n0 n02) {
        s s8 = n02 instanceof s ? (s)n02 : null;
        if (s8 == null) {
            if ((n02 = n02.a()) != null) {
                return this.i0((q)((Object)n02));
            }
            return null;
        }
        return s8;
    }

    private final Throwable Q(Object object) {
        if ((object = object instanceof z ? (z)object : null) != null) {
            return ((z)object).a;
        }
        return null;
    }

    private final Throwable R(c object, List<? extends Throwable> list) {
        boolean bl = list.isEmpty();
        Object var4_4 = null;
        if (bl) {
            if (((c)object).g()) {
                return new t0(this.G(), null, this);
            }
            return null;
        }
        Iterator iterator = ((Iterable)list).iterator();
        do {
            object = var4_4;
        } while (iterator.hasNext() && (Throwable)(object = iterator.next()) instanceof CancellationException);
        if ((object = (Throwable)object) != null) {
            return object;
        }
        return list.get(0);
    }

    private final E0 U(n0 n02) {
        Object object = n02.a();
        if (object == null) {
            if (n02 instanceof b0) {
                return new E0();
            }
            if (n02 instanceof y0) {
                this.q0((y0)n02);
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("State should have list: ");
            ((StringBuilder)object).append(n02);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object c0(Object object) {
        Object var5_3 = null;
        Throwable throwable = null;
        while (true) {
            Object object2;
            Throwable throwable2;
            Object object3;
            if ((object3 = this.W()) instanceof c) {
                // MONITORENTER : object3
                if (((c)object3).i()) {
                    object = A0.f();
                    // MONITOREXIT : object3
                    return object;
                }
                boolean bl = ((c)object3).g();
                if (object != null || !bl) {
                    throwable2 = throwable;
                    if (throwable == null) {
                        throwable2 = this.M(object);
                    }
                    ((c)object3).b(throwable2);
                }
                throwable = ((c)object3).f();
                object = var5_3;
                if (!bl) {
                    object = throwable;
                }
                // MONITOREXIT : object3
                if (object == null) return A0.a();
                this.j0(((c)object3).a(), (Throwable)object);
                return A0.a();
            }
            if (!(object3 instanceof n0)) return A0.f();
            throwable2 = throwable;
            if (throwable == null) {
                throwable2 = this.M(object);
            }
            if ((object2 = (n0)object3).e()) {
                throwable = throwable2;
                if (!this.C0((n0)object2, throwable2)) continue;
                return A0.a();
            }
            object2 = this.E0(object3, new z(throwable2, false, 2, null));
            if (object2 == A0.a()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Cannot happen in ");
                ((StringBuilder)object).append(object3);
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
            throwable = throwable2;
            if (object2 != A0.b()) return object2;
        }
    }

    private final y0 g0(ax.Fb.l<? super Throwable, ax.sb.t> l8, boolean bl) {
        y0 y02 = null;
        u0 u02 = null;
        if (bl) {
            if (l8 instanceof u0) {
                u02 = (u0)l8;
            }
            y02 = u02;
            if (u02 == null) {
                y02 = new q0(l8);
            }
        } else {
            if (l8 instanceof y0) {
                y02 = (y0)l8;
            }
            if (y02 == null) {
                y02 = new r0(l8);
            }
        }
        y02.z(this);
        return y02;
    }

    private final s i0(q q8) {
        q q9;
        while (true) {
            q9 = q8;
            if (!q8.s()) break;
            q8 = q8.r();
        }
        while (true) {
            q9 = q8 = q9.q();
            if (q8.s()) continue;
            if (q8 instanceof s) {
                return (s)q8;
            }
            q9 = q8;
            if (q8 instanceof E0) break;
        }
        return null;
    }

    private final void j0(E0 e02, Throwable throwable) {
        this.l0(throwable);
        Object object = e02.p();
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (q)object;
        Object object2 = null;
        while (!l.a(object, e02)) {
            Object object3 = object2;
            if (object instanceof u0) {
                object3 = (y0)object;
                try {
                    ((B)object3).x(throwable);
                    object3 = object2;
                }
                catch (Throwable throwable2) {
                    if (object2 != null) {
                        ax.sb.a.a((Throwable)object2, throwable2);
                        object3 = object2;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Exception in completion handler ");
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(" for ");
                    ((StringBuilder)object2).append(this);
                    object3 = new C(((StringBuilder)object2).toString(), throwable2);
                    object2 = ax.sb.t.a;
                }
            }
            object = ((q)object).q();
            object2 = object3;
        }
        if (object2 != null) {
            this.Y((Throwable)object2);
        }
        this.E(throwable);
    }

    private final void k0(E0 e02, Throwable throwable) {
        Object object = e02.p();
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        object = (q)object;
        Object object2 = null;
        while (!l.a(object, e02)) {
            Serializable serializable = object2;
            if (object instanceof y0) {
                y0 y02 = (y0)object;
                try {
                    y02.x(throwable);
                    serializable = object2;
                }
                catch (Throwable throwable2) {
                    if (object2 != null) {
                        ax.sb.a.a(object2, throwable2);
                        serializable = object2;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Exception in completion handler ");
                    ((StringBuilder)object2).append(y02);
                    ((StringBuilder)object2).append(" for ");
                    ((StringBuilder)object2).append(this);
                    serializable = new C(((StringBuilder)object2).toString(), throwable2);
                    object2 = ax.sb.t.a;
                }
            }
            object = ((q)object).q();
            object2 = serializable;
        }
        if (object2 != null) {
            this.Y((Throwable)object2);
        }
    }

    private final void p0(b0 b02) {
        n0 n02 = new E0();
        if (!b02.e()) {
            n02 = new m0((E0)n02);
        }
        ax.D.b.a(q, this, b02, n02);
    }

    private final void q0(y0 y02) {
        y02.k(new E0());
        q q8 = y02.q();
        ax.D.b.a(q, this, y02, q8);
    }

    private final boolean t(Object object, E0 e02, y0 y02) {
        int n8;
        object = new q.a(y02, this, object){
            final z0 d;
            final Object e;
            {
                this.d = z02;
                this.e = object;
                super(q8);
            }

            public Object f(q q8) {
                if (this.d.W() == this.e) {
                    return null;
                }
                return p.a();
            }
        };
        while ((n8 = e02.r().w(y02, e02, (q.a)object)) != 1) {
            if (n8 != 2) continue;
            return false;
        }
        return true;
    }

    private final void u(Throwable throwable, List<? extends Throwable> object) {
        if (object.size() > 1) {
            Set set = Collections.newSetFromMap(new IdentityHashMap(object.size()));
            object = object.iterator();
            while (object.hasNext()) {
                Throwable throwable2 = (Throwable)object.next();
                if (throwable2 == throwable || throwable2 == throwable || throwable2 instanceof CancellationException || !set.add(throwable2)) continue;
                ax.sb.a.a(throwable, throwable2);
            }
        }
    }

    private final int v0(Object object) {
        if (object instanceof b0) {
            if (((b0)object).e()) {
                return 0;
            }
            if (!ax.D.b.a(q, this, object, A0.c())) {
                return -1;
            }
            this.n0();
            return 1;
        }
        if (object instanceof m0) {
            if (!ax.D.b.a(q, this, object, ((m0)object).a())) {
                return -1;
            }
            this.n0();
            return 1;
        }
        return 0;
    }

    private final String w0(Object object) {
        if (object instanceof c) {
            if (((c)(object = (c)object)).g()) {
                return "Cancelling";
            }
            if (((c)object).h()) {
                return "Completing";
            }
            return "Active";
        }
        if (object instanceof n0) {
            if (((n0)object).e()) {
                return "Active";
            }
            return "New";
        }
        if (object instanceof z) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final Object y(e<Object> e8) {
        Object object = new a<Object>(ax.xb.b.b(e8), this);
        ((m)object).C();
        o.a(object, this.F(new I0<Object>((m<Object>)object)));
        object = ((m)object).z();
        if (object == ax.xb.b.c()) {
            h.c(e8);
        }
        return object;
    }

    public static /* synthetic */ CancellationException y0(z0 z02, Throwable throwable, String string, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                string = null;
            }
            return z02.x0(throwable, string);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Z A0(boolean bl, boolean bl2, ax.Fb.l<? super Throwable, ax.sb.t> l8) {
        Object object;
        Object object2;
        Object object3;
        block14: {
            y0 y02 = this.g0(l8, bl);
            while (true) {
                if ((object3 = this.W()) instanceof b0) {
                    object2 = (b0)object3;
                    if (((b0)object2).e()) {
                        if (!ax.D.b.a(q, this, object3, y02)) continue;
                        return y02;
                    }
                    this.p0((b0)object2);
                    continue;
                }
                boolean bl3 = object3 instanceof n0;
                object = null;
                Throwable throwable = null;
                if (!bl3) break block14;
                E0 e02 = ((n0)object3).a();
                if (e02 == null) {
                    l.d(object3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.q0((y0)object3);
                    continue;
                }
                object = F0.q;
                Throwable throwable2 = throwable;
                object2 = object;
                if (bl) {
                    throwable2 = throwable;
                    object2 = object;
                    if (object3 instanceof c) {
                        synchronized (object3) {
                            Throwable throwable32;
                            block15: {
                                block16: {
                                    try {
                                        throwable2 = ((c)object3).f();
                                        if (throwable2 != null) {
                                            object2 = object;
                                            if (!(l8 instanceof s)) break block15;
                                            object2 = object;
                                            if (((c)object3).h()) break block15;
                                        }
                                        if (bl3 = this.t(object3, e02, y02)) break block16;
                                    }
                                    catch (Throwable throwable32) {}
                                    continue;
                                }
                                if (throwable2 == null) {
                                    return y02;
                                }
                                object2 = y02;
                            }
                            object = ax.sb.t.a;
                            throw throwable32;
                        }
                    }
                }
                if (throwable2 != null) {
                    if (!bl2) return object2;
                    l8.invoke(throwable2);
                    return object2;
                }
                if (this.t(object3, e02, y02)) break;
            }
            return y02;
        }
        if (!bl2) return F0.q;
        object2 = object3 instanceof z ? (z)object3 : null;
        if (object2 != null) {
            object = ((z)object2).a;
        }
        l8.invoke((Throwable)object);
        return F0.q;
    }

    public final boolean B(Object object) {
        Object object2;
        Object object3 = A0.a();
        if (this.T()) {
            object3 = object2 = this.D(object);
            if (object2 == A0.b) {
                return true;
            }
        }
        object2 = object3;
        if (object3 == A0.a()) {
            object2 = this.c0(object);
        }
        if (object2 == A0.a()) {
            return true;
        }
        if (object2 == A0.b) {
            return true;
        }
        if (object2 == A0.f()) {
            return false;
        }
        this.w(object2);
        return true;
    }

    public void C(Throwable throwable) {
        this.B(throwable);
    }

    @Override
    public CancellationException D0() {
        Object object;
        block8: {
            Throwable throwable;
            Serializable serializable;
            block6: {
                block7: {
                    block5: {
                        object = this.W();
                        boolean bl = object instanceof c;
                        serializable = null;
                        if (!bl) break block5;
                        throwable = ((c)object).f();
                        break block6;
                    }
                    if (!(object instanceof z)) break block7;
                    throwable = ((z)object).a;
                    break block6;
                }
                if (object instanceof n0) break block8;
                throwable = null;
            }
            if (throwable instanceof CancellationException) {
                serializable = (CancellationException)throwable;
            }
            CancellationException cancellationException = serializable;
            if (serializable == null) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Parent job is ");
                ((StringBuilder)serializable).append(this.w0(object));
                cancellationException = new t0(((StringBuilder)serializable).toString(), throwable, this);
            }
            return cancellationException;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot be cancelling child in this state: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @Override
    public final Z F(ax.Fb.l<? super Throwable, ax.sb.t> l8) {
        return this.A0(false, true, l8);
    }

    @Override
    public final void F0(H0 h02) {
        this.B(h02);
    }

    protected String G() {
        return "Job was cancelled";
    }

    public boolean I(Throwable throwable) {
        if (throwable instanceof CancellationException) {
            return true;
        }
        return this.B(throwable) && this.S();
    }

    @Override
    public void L0(CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new t0(this.G(), null, this);
        }
        this.C(cancellationException2);
    }

    public final Object P() {
        Object object = this.W();
        if (!(object instanceof n0)) {
            if (!(object instanceof z)) {
                return A0.h(object);
            }
            throw ((z)object).a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return false;
    }

    public final r V() {
        return (r)c0.get(this);
    }

    public final Object W() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        Object v8;
        while ((v8 = atomicReferenceFieldUpdater.get(this)) instanceof y) {
            ((y)v8).a(this);
        }
        return v8;
    }

    protected boolean X(Throwable throwable) {
        return false;
    }

    public void Y(Throwable throwable) {
        throw throwable;
    }

    protected final void Z(s0 object) {
        if (object == null) {
            this.t0(F0.q);
            return;
        }
        object.start();
        object = object.q(this);
        this.t0((r)object);
        if (this.a0()) {
            object.d();
            this.t0(F0.q);
        }
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        return s0.a.c(this, c8);
    }

    public final boolean a0() {
        return this.W() instanceof n0 ^ true;
    }

    protected boolean b0() {
        return false;
    }

    @Override
    public boolean e() {
        Object object = this.W();
        return object instanceof n0 && ((n0)object).e();
    }

    public final boolean e0(Object object) {
        Object object2;
        do {
            if ((object2 = this.E0(this.W(), object)) == A0.a()) {
                return false;
            }
            if (object2 != A0.b) continue;
            return true;
        } while (object2 == A0.b());
        this.w(object2);
        return true;
    }

    public final Object f0(Object object) {
        Object object2;
        while ((object2 = this.E0(this.W(), object)) != A0.a()) {
            if (object2 == A0.b()) continue;
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Job ");
        ((StringBuilder)object2).append(this);
        ((StringBuilder)object2).append(" is already complete or completing, but is being completed with ");
        ((StringBuilder)object2).append(object);
        throw new IllegalStateException(((StringBuilder)object2).toString(), this.Q(object));
    }

    @Override
    public final i.c<?> getKey() {
        return s0.c;
    }

    @Override
    public s0 getParent() {
        r r8 = this.V();
        if (r8 != null) {
            return r8.getParent();
        }
        return null;
    }

    public String h0() {
        return N.a(this);
    }

    @Override
    public final boolean isCancelled() {
        Object object = this.W();
        return object instanceof z || object instanceof c && ((c)object).g();
        {
        }
    }

    protected void l0(Throwable throwable) {
    }

    @Override
    public i m(i.c<?> c8) {
        return s0.a.e(this, c8);
    }

    protected void m0(Object object) {
    }

    protected void n0() {
    }

    @Override
    public final CancellationException o() {
        Object object = this.W();
        if (object instanceof c) {
            if ((object = ((c)object).f()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(N.a(this));
                stringBuilder.append(" is cancelling");
                object = this.x0((Throwable)object, stringBuilder.toString());
                if (object != null) {
                    return object;
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Job is still new or active: ");
            ((StringBuilder)object).append(this);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        if (!(object instanceof n0)) {
            if (object instanceof z) {
                return z0.y0(this, ((z)object).a, null, 1, null);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(N.a(this));
            ((StringBuilder)object).append(" has completed normally");
            return new t0(((StringBuilder)object).toString(), null, this);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Job is still new or active: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @Override
    public i p(i i8) {
        return s0.a.f(this, i8);
    }

    @Override
    public final r q(t object) {
        object = s0.a.d(this, true, false, new s((t)object), 2, null);
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r)object;
    }

    public final void r0(y0 y02) {
        block2: {
            Object object;
            while ((object = this.W()) instanceof y0) {
                if (object == y02 && !ax.D.b.a(q, this, object, A0.c())) continue;
                break block2;
            }
            if (object instanceof n0 && ((n0)object).a() != null) {
                y02.t();
            }
        }
    }

    @Override
    public final boolean start() {
        int n8;
        while ((n8 = this.v0(this.W())) != 0) {
            if (n8 != 1) continue;
            return true;
        }
        return false;
    }

    public final void t0(r r8) {
        c0.set(this, r8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.z0());
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        return stringBuilder.toString();
    }

    @Override
    public <R> R v(R r8, ax.Fb.p<? super R, ? super i.b, ? extends R> p8) {
        return s0.a.b(this, r8, p8);
    }

    protected void w(Object object) {
    }

    protected final Object x(e<Object> e8) {
        Object object;
        do {
            if ((object = this.W()) instanceof n0) continue;
            if (!(object instanceof z)) {
                return A0.h(object);
            }
            throw ((z)object).a;
        } while (this.v0(object) < 0);
        return this.y(e8);
    }

    protected final CancellationException x0(Throwable throwable, String string) {
        Object object = throwable instanceof CancellationException ? (CancellationException)throwable : null;
        CancellationException cancellationException = object;
        if (object == null) {
            object = string;
            if (string == null) {
                object = this.G();
            }
            cancellationException = new t0((String)object, throwable, this);
        }
        return cancellationException;
    }

    public final boolean z(Throwable throwable) {
        return this.B(throwable);
    }

    public final String z0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h0());
        stringBuilder.append('{');
        stringBuilder.append(this.w0(this.W()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static final class a<T>
    extends m<T> {
        private final z0 j0;

        public a(e<? super T> e8, z0 z02) {
            super(e8, 1);
            this.j0 = z02;
        }

        @Override
        protected String J() {
            return "AwaitContinuation";
        }

        @Override
        public Throwable x(s0 s02) {
            Throwable throwable;
            Object object = this.j0.W();
            if (object instanceof c && (throwable = ((c)object).f()) != null) {
                return throwable;
            }
            if (object instanceof z) {
                return ((z)object).a;
            }
            return s02.o();
        }
    }

    private static final class b
    extends y0 {
        private final z0 f0;
        private final c g0;
        private final s h0;
        private final Object i0;

        public b(z0 z02, c c8, s s8, Object object) {
            this.f0 = z02;
            this.g0 = c8;
            this.h0 = s8;
            this.i0 = object;
        }

        @Override
        public void x(Throwable throwable) {
            this.f0.K(this.g0, this.h0, this.i0);
        }
    }

    private static final class c
    implements n0 {
        private static final AtomicIntegerFieldUpdater c0 = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
        private static final AtomicReferenceFieldUpdater d0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
        private static final AtomicReferenceFieldUpdater e0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final E0 q;

        public c(E0 e02, boolean bl, Throwable throwable) {
            this.q = e02;
            this._isCompleting = bl ? 1 : 0;
            this._rootCause = throwable;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<Throwable>(4);
        }

        private final Object d() {
            return e0.get(this);
        }

        private final void l(Object object) {
            e0.set(this, object);
        }

        @Override
        public E0 a() {
            return this.q;
        }

        public final void b(Throwable serializable) {
            Object object;
            block7: {
                block8: {
                    block6: {
                        object = this.f();
                        if (object == null) {
                            this.m((Throwable)serializable);
                            return;
                        }
                        if (serializable == object) break block6;
                        object = this.d();
                        if (object == null) {
                            this.l(serializable);
                            return;
                        }
                        if (!(object instanceof Throwable)) break block7;
                        if (serializable != object) break block8;
                    }
                    return;
                }
                ArrayList<Throwable> arrayList = this.c();
                arrayList.add((Throwable)object);
                arrayList.add((Throwable)serializable);
                this.l(arrayList);
                return;
            }
            if (object instanceof ArrayList) {
                ((ArrayList)object).add(serializable);
                return;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("State is ");
            ((StringBuilder)serializable).append(object);
            throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
        }

        @Override
        public boolean e() {
            return this.f() == null;
        }

        public final Throwable f() {
            return (Throwable)d0.get(this);
        }

        public final boolean g() {
            return this.f() != null;
        }

        public final boolean h() {
            return c0.get(this) != 0;
        }

        public final boolean i() {
            return this.d() == A0.e();
        }

        public final List<Throwable> j(Throwable serializable) {
            Object object;
            block8: {
                ArrayList arrayList;
                block6: {
                    block7: {
                        block5: {
                            object = this.d();
                            if (object != null) break block5;
                            arrayList = this.c();
                            break block6;
                        }
                        if (!(object instanceof Throwable)) break block7;
                        arrayList = this.c();
                        arrayList.add((Throwable)object);
                        break block6;
                    }
                    if (!(object instanceof ArrayList)) break block8;
                    arrayList = (ArrayList)object;
                }
                object = this.f();
                if (object != null) {
                    arrayList.add(0, object);
                }
                if (serializable != null && !l.a(serializable, object)) {
                    arrayList.add(serializable);
                }
                this.l(A0.e());
                return arrayList;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("State is ");
            ((StringBuilder)serializable).append(object);
            throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
        }

        public final void k(boolean bl) {
            c0.set(this, bl ? 1 : 0);
        }

        public final void m(Throwable throwable) {
            d0.set(this, throwable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finishing[cancelling=");
            stringBuilder.append(this.g());
            stringBuilder.append(", completing=");
            stringBuilder.append(this.h());
            stringBuilder.append(", rootCause=");
            stringBuilder.append(this.f());
            stringBuilder.append(", exceptions=");
            stringBuilder.append(this.d());
            stringBuilder.append(", list=");
            stringBuilder.append(this.a());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }
}

