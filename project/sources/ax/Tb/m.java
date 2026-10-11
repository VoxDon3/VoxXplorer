package ax.Tb;

import ax.Vb.F;
import ax.sb.t;
import ax.yb.AbstractC3523d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class m<T> extends ax.Ub.b<o> implements k<T>, b {
    private static final AtomicReferenceFieldUpdater f0 = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile Object _state;
    private int e0;

    @ax.yb.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    static final class a extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        Object h0;
        Object i0;
        /* synthetic */ Object j0;
        final /* synthetic */ m<T> k0;
        int l0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, ax.wb.e<? super a> eVar) {
            super(eVar);
            this.k0 = mVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.j0 = obj;
            this.l0 |= Integer.MIN_VALUE;
            return this.k0.a(null, this);
        }
    }

    public m(Object obj) {
        this._state = obj;
    }

    private final boolean j(Object obj, Object obj2) {
        int i;
        o[] g;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !ax.Gb.l.a(obj3, obj)) {
                return false;
            }
            if (ax.Gb.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e0;
            if ((i2 & 1) != 0) {
                this.e0 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e0 = i3;
            o[] g2 = g();
            t tVar = t.a;
            while (true) {
                o[] oVarArr = g2;
                if (oVarArr != null) {
                    for (o oVar : oVarArr) {
                        if (oVar != null) {
                            oVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.e0;
                    if (i == i3) {
                        this.e0 = i3 + 1;
                        return true;
                    }
                    g = g();
                    t tVar2 = t.a;
                }
                g2 = g;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        if (ax.Gb.l.a(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (((ax.Tb.p) r11).a(r0) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ax.Ub.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00dd -> B:14:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ef -> B:14:0x00ab). Please report as a decompilation issue!!! */
    @Override // ax.Tb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ax.Tb.c<? super T> r11, ax.wb.e<?> r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tb.m.a(ax.Tb.c, ax.wb.e):java.lang.Object");
    }

    @Override // ax.Tb.c
    public Object e(T t, ax.wb.e<? super t> eVar) {
        setValue(t);
        return t.a;
    }

    @Override // ax.Tb.k
    public T getValue() {
        F f = ax.Ub.h.a;
        T t = (T) f0.get(this);
        if (t == f) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.Ub.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.Ub.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o[] d(int i) {
        return new o[i];
    }

    @Override // ax.Tb.k
    public void setValue(T t) {
        if (t == null) {
            t = (T) ax.Ub.h.a;
        }
        j(null, t);
    }
}
