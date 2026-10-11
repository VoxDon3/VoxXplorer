/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Gb.l;
import ax.Qb.s0;
import ax.Qb.w0;
import ax.Tb.b;
import ax.Tb.c;
import ax.Tb.k;
import ax.Tb.o;
import ax.Tb.p;
import ax.Ub.h;
import ax.Vb.F;
import ax.sb.t;
import ax.wb.e;
import ax.yb.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class m<T>
extends ax.Ub.b<o>
implements k<T>,
b {
    private static final AtomicReferenceFieldUpdater f0 = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile Object _state;
    private int e0;

    public m(Object object) {
        this._state = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean j(Object dArray, Object object2) {
        Throwable throwable3;
        int n8;
        block17: {
            synchronized (this) {
                Throwable throwable22;
                block16: {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                    block15: {
                        boolean bl;
                        Object v8;
                        block14: {
                            try {
                                atomicReferenceFieldUpdater = f0;
                                v8 = atomicReferenceFieldUpdater.get(this);
                                if (dArray == null || (bl = l.a(v8, dArray))) break block14;
                            }
                            catch (Throwable throwable22) {}
                            return false;
                        }
                        bl = l.a(v8, object2);
                        if (!bl) break block15;
                        return true;
                    }
                    atomicReferenceFieldUpdater.set(this, object2);
                    n8 = this.e0;
                    if ((n8 & 1) != 0) break block16;
                    ++n8;
                    this.e0 = n8;
                    dArray = this.g();
                    object2 = t.a;
                    break block17;
                }
                this.e0 = n8 + 2;
                return true;
                throw throwable22;
            }
        }
        while (true) {
            int n9;
            if ((dArray = (o[])dArray) != null) {
                for (Object object2 : dArray) {
                    if (object2 == null) continue;
                    ((o)object2).g();
                }
            }
            synchronized (this) {
                try {
                    n9 = this.e0;
                    if (n9 == n8) {
                        this.e0 = n8 + 1;
                        return true;
                    }
                }
                catch (Throwable throwable3) {
                    break;
                }
                dArray = this.g();
                object2 = t.a;
            }
            n8 = n9;
        }
        {
            throw throwable3;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object a(c<? super T> var1_1, e<?> var2_3) {
        block17: {
            block18: {
                block19: {
                    block20: {
                        block21: {
                            block22: {
                                if (!(var2_3 instanceof a)) ** GOTO lbl-1000
                                var4_4 = var2_3;
                                var3_6 = var4_4.l0;
                                if ((var3_6 & -2147483648) != 0) {
                                    var4_4.l0 = var3_6 + -2147483648;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new d(this, (e<? super a>)var2_3){
                                        Object e0;
                                        Object f0;
                                        Object g0;
                                        Object h0;
                                        Object i0;
                                        Object j0;
                                        final m<T> k0;
                                        int l0;
                                        {
                                            this.k0 = m8;
                                            super(e8);
                                        }

                                        @Override
                                        public final Object p(Object object) {
                                            this.j0 = object;
                                            this.l0 |= Integer.MIN_VALUE;
                                            return this.k0.a(null, (e<?>)this);
                                        }
                                    };
                                }
                                var12_7 = var4_4.j0;
                                var17_8 = ax.xb.b.c();
                                var3_6 = var4_4.l0;
                                if (var3_6 == 0) break block20;
                                if (var3_6 == 1) break block21;
                                if (var3_6 == 2) break block22;
                                if (var3_6 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                var9_9 = var4_4.i0;
                                var7_10 = (s0)var4_4.h0;
                                var5_11 = (o)var4_4.g0;
                                var8_12 = (c)var4_4.f0;
                                var6_13 = (m)var4_4.e0;
                                var2_3 = var5_11;
                                var1_1 = var6_13;
                                try {
                                    ax.sb.o.b(var12_7);
                                    var12_7 = var4_4;
                                    ** GOTO lbl78
                                }
                                catch (Throwable var4_5) {
                                    var5_11 = var1_1;
                                    var1_1 = var4_5;
                                    break block17;
                                }
                            }
                            var11_14 = var4_4.i0;
                            var14_15 = (s0)var4_4.h0;
                            var5_11 = (o)var4_4.g0;
                            var16_16 = (c)var4_4.f0;
                            var10_17 = (m)var4_4.e0;
                            var2_3 = var5_11;
                            var1_1 = var10_17;
                            {
                                ax.sb.o.b(var12_7);
                                var13_18 = var4_4;
                                var4_4 = var5_11;
                                ** GOTO lbl128
                            }
                        }
                        var5_11 = (o)var4_4.g0;
                        var7_10 = (m)var4_4.f0;
                        var6_13 = (m)var4_4.e0;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        {
                            ax.sb.o.b(var12_7);
                            break block18;
                        }
                    }
                    ax.sb.o.b(var12_7);
                    var2_3 = (o)this.b();
                    try {
                        if (!(var1_1 instanceof p)) break block19;
                        var5_11 = (p)var1_1;
                        var4_4.e0 = this;
                        var4_4.f0 = var1_1;
                        var4_4.g0 = var2_3;
                        var4_4.l0 = 1;
                        if ((var5_11 = var5_11.a((e<? super t>)var4_4)) == var17_8) {
                            return var17_8;
                        }
                    }
                    catch (Throwable var1_2) {
                        var5_11 = var4_4 = this;
                        break block17;
                    }
                }
                var6_13 = this;
                var7_10 = var1_1;
                var5_11 = var2_3;
            }
            var2_3 = var5_11;
            var1_1 = var6_13;
            {
                var9_9 = var4_4.b().a(s0.c);
                var8_12 = var7_10;
                var7_10 = var9_9;
                var9_9 = null;
                var12_7 = var4_4;
lbl78:
                // 2 sources

                while (true) {
                    block24: {
                        block23: {
                            var2_3 = var5_11;
                            var1_1 = var6_13;
                            var15_19 /* !! */  = m.f0.get(var6_13);
                            if (var7_10 != null) {
                                var2_3 = var5_11;
                                var1_1 = var6_13;
                                w0.e((s0)var7_10);
                            }
                            if (var9_9 == null) break block23;
                            var2_3 = var5_11;
                            var1_1 = var6_13;
                            var13_18 = var12_7;
                            var14_15 = var7_10;
                            var4_4 = var5_11;
                            var16_16 = var8_12;
                            var10_17 = var6_13;
                            var11_14 = var9_9;
                            if (l.a(var9_9, var15_19 /* !! */ )) break block24;
                        }
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var4_4 = var15_19 /* !! */  == h.a ? null : var15_19 /* !! */ ;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.e0 = var6_13;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.f0 = var8_12;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.g0 = var5_11;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.h0 = var7_10;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.i0 = var15_19 /* !! */ ;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        var12_7.l0 = 2;
                        var2_3 = var5_11;
                        var1_1 = var6_13;
                        if (var8_12.e(var4_4, (e<? super t>)var12_7) == var17_8) {
                            return var17_8;
                        }
                        var11_14 = var15_19 /* !! */ ;
                        var10_17 = var6_13;
                        var16_16 = var8_12;
                        var4_4 = var5_11;
                        var14_15 = var7_10;
                        var13_18 = var12_7;
                    }
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var12_7 = var13_18;
                    var7_10 = var14_15;
                    var5_11 = var4_4;
                    var8_12 = var16_16;
                    var6_13 = var10_17;
                    var9_9 = var11_14;
                    if (var4_4.h()) continue;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.e0 = var10_17;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.f0 = var16_16;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.g0 = var4_4;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.h0 = var14_15;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.i0 = var11_14;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var13_18.l0 = 3;
                    var2_3 = var4_4;
                    var1_1 = var10_17;
                    var15_19 /* !! */  = var4_4.e((e<? super t>)var13_18);
                    var12_7 = var13_18;
                    var7_10 = var14_15;
                    var5_11 = var4_4;
                    var8_12 = var16_16;
                    var6_13 = var10_17;
                    var9_9 = var11_14;
                    if (var15_19 /* !! */  == var17_8) break;
                }
            }
            return var17_8;
        }
        var5_11.f(var2_3);
        throw var1_1;
    }

    @Override
    public Object e(T t8, e<? super t> e8) {
        this.setValue(t8);
        return t.a;
    }

    @Override
    public T getValue() {
        F f8 = h.a;
        Object v8 = f0.get(this);
        if (v8 == f8) {
            return null;
        }
        return (T)v8;
    }

    protected o h() {
        return new o();
    }

    protected o[] i(int n8) {
        return new o[n8];
    }

    @Override
    public void setValue(T t8) {
        Object object = t8;
        if (t8 == null) {
            object = h.a;
        }
        this.j(null, object);
    }
}

