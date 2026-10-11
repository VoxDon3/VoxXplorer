/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Fb.p;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.v;
import ax.n0.d;
import ax.n0.i;
import ax.sb.o;
import ax.sb.t;
import ax.xb.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e<T> {
    public static final a a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final <T> Object c(List<? extends d<T>> var1_1, i<T> var2_3, ax.wb.e<? super t> var3_4) {
            block13: {
                block12: {
                    block11: {
                        if (!(var3_4 instanceof b)) ** GOTO lbl-1000
                        var5_5 /* !! */  = var3_4;
                        var4_6 = var5_5 /* !! */ .i0;
                        if ((var4_6 & -2147483648) != 0) {
                            var5_5 /* !! */ .i0 = var4_6 + -2147483648;
                            var3_4 = var5_5 /* !! */ ;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_4 = new ax.yb.d(this, var3_4){
                                Object e0;
                                Object f0;
                                Object g0;
                                final a h0;
                                int i0;
                                {
                                    this.h0 = a8;
                                    super(e8);
                                }

                                @Override
                                public final Object p(Object object) {
                                    this.g0 = object;
                                    this.i0 |= Integer.MIN_VALUE;
                                    return this.h0.c(null, null, this);
                                }
                            };
                        }
                        var9_7 = var3_4.g0;
                        var8_8 = ax.xb.b.c();
                        var4_6 = var3_4.i0;
                        if (var4_6 != 0) {
                            if (var4_6 != 1) {
                                if (var4_6 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                var2_3 /* !! */  = (Iterator)var3_4.f0;
                                var1_1 = (v)var3_4.e0;
                                var6_9 = var3_4;
                                var5_5 /* !! */  = var2_3 /* !! */ ;
                                var7_10 = var1_1;
                                try {
                                    o.b(var9_7);
                                    break block11;
                                }
                                catch (Throwable var1_2) {
                                    break block12;
                                }
                            }
                            var1_1 = (List)var3_4.e0;
                            o.b(var9_7);
                        } else {
                            o.b(var9_7);
                            var5_5 /* !! */  = new ArrayList<E>();
                            var1_1 = new p<T, ax.wb.e<? super T>, Object>(var1_1, (List<ax.Fb.l<ax.wb.e<? super t>, Object>>)var5_5 /* !! */ , null){
                                Object f0;
                                Object g0;
                                Object h0;
                                int i0;
                                Object j0;
                                final List<d<T>> k0;
                                final List<ax.Fb.l<ax.wb.e<? super t>, Object>> l0;
                                {
                                    this.k0 = list;
                                    this.l0 = list2;
                                    super(2, e8);
                                }

                                @Override
                                public final ax.wb.e<t> a(Object object, ax.wb.e<?> p8) {
                                    p8 = new /* invalid duplicate definition of identical inner class */;
                                    p8.j0 = object;
                                    return p8;
                                }

                                /*
                                 * Unable to fully structure code
                                 */
                                @Override
                                public final Object p(Object var1_1) {
                                    block7: {
                                        block4: {
                                            block5: {
                                                block6: {
                                                    var8_2 = ax.xb.b.c();
                                                    var2_3 = this.i0;
                                                    if (var2_3 == 0) break block4;
                                                    if (var2_3 == 1) break block5;
                                                    if (var2_3 != 2) break block6;
                                                    var3_4 = (Iterator)this.f0;
                                                    var4_5 = (List)this.j0;
                                                    o.b(var1_1);
                                                    break block7;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            var4_5 = this.h0;
                                            var6_6 = (d)this.g0;
                                            var3_4 = (Iterator)this.f0;
                                            var5_7 = (List)this.j0;
                                            o.b(var1_1);
                                            var7_8 = var6_6;
                                            var6_6 = var1_1;
                                            ** GOTO lbl39
                                        }
                                        o.b(var1_1);
                                        var1_1 = this.j0;
                                        var3_4 = this.k0;
                                        var4_5 = this.l0;
                                        var3_4 = var3_4.iterator();
                                    }
                                    block0: while (var3_4.hasNext()) {
                                        block9: {
                                            block10: {
                                                block8: {
                                                    var7_8 = (d)var3_4.next();
                                                    this.j0 = var4_5;
                                                    this.f0 = var3_4;
                                                    this.g0 = var7_8;
                                                    this.h0 = var1_1;
                                                    this.i0 = 1;
                                                    var6_6 = var7_8.a(var1_1, this);
                                                    if (var6_6 == var8_2) break block8;
                                                    var5_7 = var4_5;
                                                    var4_5 = var1_1;
lbl39:
                                                    // 2 sources

                                                    if (!((Boolean)var6_6).booleanValue()) break block9;
                                                    var5_7.add(new ax.Fb.l<ax.wb.e<? super t>, Object>(var7_8, null){
                                                        int f0;
                                                        final d<T> g0;
                                                        {
                                                            this.g0 = d8;
                                                            super(1, e8);
                                                        }

                                                        /*
                                                         * Enabled force condition propagation
                                                         * Lifted jumps to return sites
                                                         */
                                                        @Override
                                                        public final Object p(Object d8) {
                                                            Object object = ax.xb.b.c();
                                                            int n8 = this.f0;
                                                            if (n8 != 0) {
                                                                if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                o.b(d8);
                                                                return t.a;
                                                            } else {
                                                                o.b(d8);
                                                                d8 = this.g0;
                                                                this.f0 = 1;
                                                                if (d8.c(this) != object) return t.a;
                                                                return object;
                                                            }
                                                        }

                                                        public final ax.wb.e<t> u(ax.wb.e<?> e8) {
                                                            return new /* invalid duplicate definition of identical inner class */;
                                                        }

                                                        public final Object v(ax.wb.e<? super t> e8) {
                                                            return (this.u(e8)).p(t.a);
                                                        }
                                                    });
                                                    this.j0 = var5_7;
                                                    this.f0 = var3_4;
                                                    this.g0 = null;
                                                    this.h0 = null;
                                                    this.i0 = 2;
                                                    var1_1 = var4_5 = var7_8.b(var4_5, this);
                                                    if (var4_5 != var8_2) break block10;
                                                }
                                                return var8_2;
                                            }
lbl52:
                                            // 2 sources

                                            while (true) {
                                                var4_5 = var5_7;
                                                continue block0;
                                                break;
                                            }
                                        }
                                        var1_1 = var4_5;
                                        ** continue;
                                    }
                                    return var1_1;
                                }

                                public final Object u(T t8, ax.wb.e<? super T> e8) {
                                    return (this.a(t8, e8)).p(t.a);
                                }
                            };
                            var3_4.e0 = var5_5 /* !! */ ;
                            var3_4.i0 = 1;
                            if (var2_3 /* !! */ .a((p<Object, ax.wb.e<Object>, Object>)var1_1, var3_4) == var8_8) {
                                return var8_8;
                            }
                            var1_1 = var5_5 /* !! */ ;
                        }
                        var5_5 /* !! */  = new v<T>();
                        var2_3 /* !! */  = ((Iterable)var1_1).iterator();
                        var1_1 = var5_5 /* !! */ ;
                    }
lbl40:
                    // 3 sources

                    while (true) {
                        if (!var2_3 /* !! */ .hasNext()) {
                            var1_1 = (Throwable)var1_1.q;
                            if (var1_1 != null) throw var1_1;
                            return t.a;
                        }
                        var9_7 = (ax.Fb.l)var2_3 /* !! */ .next();
                        var6_9 = var3_4;
                        var5_5 /* !! */  = var2_3 /* !! */ ;
                        var7_10 = var1_1;
                        {
                            var3_4.e0 = var1_1;
                            var6_9 = var3_4;
                            var5_5 /* !! */  = var2_3 /* !! */ ;
                            var7_10 = var1_1;
                            var3_4.f0 = var2_3 /* !! */ ;
                            var6_9 = var3_4;
                            var5_5 /* !! */  = var2_3 /* !! */ ;
                            var7_10 = var1_1;
                            var3_4.i0 = 2;
                            var6_9 = var3_4;
                            var5_5 /* !! */  = var2_3 /* !! */ ;
                            var7_10 = var1_1;
                            if ((var9_7 = var9_7.invoke(var3_4)) != var8_8) continue;
                        }
                        return var8_8;
                    }
                }
                var2_3 /* !! */  = var7_10.q;
                if (var2_3 /* !! */  != null) break block13;
                var7_10.q = var1_2;
                var3_4 = var6_9;
                var2_3 /* !! */  = var5_5 /* !! */ ;
                var1_1 = var7_10;
                ** GOTO lbl40
            }
            l.c(var2_3 /* !! */ );
            ax.sb.a.a((Throwable)var7_10.q, var1_2);
            var3_4 = var6_9;
            var2_3 /* !! */  = var5_5 /* !! */ ;
            var1_1 = var7_10;
            ** while (true)
        }

        public final <T> p<i<T>, ax.wb.e<? super t>, Object> b(List<? extends d<T>> list) {
            l.f(list, "migrations");
            return new p<i<T>, ax.wb.e<? super t>, Object>(list, null){
                int f0;
                Object g0;
                final List<d<T>> h0;
                {
                    this.h0 = list;
                    super(2, e8);
                }

                @Override
                public final ax.wb.e<t> a(Object object, ax.wb.e<?> p8) {
                    p8 = new /* invalid duplicate definition of identical inner class */;
                    p8.g0 = object;
                    return p8;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        i i8 = (i)this.g0;
                        object = a;
                        List list = this.h0;
                        this.f0 = 1;
                        if (((a)object).c(list, i8, this) != object2) return t.a;
                        return object2;
                    }
                }

                public final Object u(i<T> i8, ax.wb.e<? super t> e8) {
                    return (this.a(i8, e8)).p(t.a);
                }
            };
        }
    }
}

