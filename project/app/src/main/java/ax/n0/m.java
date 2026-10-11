/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Gb.g;
import ax.Gb.t;
import ax.Gb.v;
import ax.Qb.J;
import ax.Qb.u;
import ax.Qb.w;
import ax.Tb.d;
import ax.n0.f;
import ax.n0.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class m<T>
implements f<T> {
    public static final a k = new a(null);
    private static final Set<String> l = new LinkedHashSet<String>();
    private static final Object m = new Object();
    private final ax.Fb.a<File> a;
    private final ax.n0.k<T> b;
    private final ax.n0.b<T> c;
    private final J d;
    private final ax.Tb.b<T> e;
    private final String f;
    private final ax.sb.h g;
    private final ax.Tb.k<ax.n0.n<T>> h;
    private List<? extends ax.Fb.p<? super ax.n0.i<T>, ? super ax.wb.e<? super ax.sb.t>, ? extends Object>> i;
    private final ax.n0.l<b<T>> j;

    public m(ax.Fb.a<? extends File> a8, ax.n0.k<T> k8, List<? extends ax.Fb.p<? super ax.n0.i<T>, ? super ax.wb.e<? super ax.sb.t>, ? extends Object>> list, ax.n0.b<T> b8, J j8) {
        ax.Gb.l.f(a8, "produceFile");
        ax.Gb.l.f(k8, "serializer");
        ax.Gb.l.f(list, "initTasksList");
        ax.Gb.l.f(b8, "corruptionHandler");
        ax.Gb.l.f(j8, "scope");
        this.a = a8;
        this.b = k8;
        this.c = b8;
        this.d = j8;
        this.e = ax.Tb.d.g(new ax.Fb.p<ax.Tb.c<? super T>, ax.wb.e<? super ax.sb.t>, Object>(this, null){
            int f0;
            private Object g0;
            final m<T> h0;
            {
                this.h0 = m8;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<ax.sb.t> a(Object object, ax.wb.e<?> p8) {
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
                    ax.sb.o.b(object);
                    return ax.sb.t.a;
                } else {
                    ax.sb.o.b(object);
                    object = (ax.Tb.c)this.g0;
                    Object object3 = (ax.n0.n)this.h0.h.getValue();
                    if (!(object3 instanceof ax.n0.c)) {
                        this.h0.j.e(new b.a(object3));
                    }
                    object3 = new ax.Tb.b<T>(ax.Tb.d.c(this.h0.h, new ax.Fb.p<ax.n0.n<T>, ax.wb.e<? super Boolean>, Object>(object3, null){
                        int f0;
                        Object g0;
                        final ax.n0.n<T> h0;
                        {
                            this.h0 = n8;
                            super(2, e8);
                        }

                        @Override
                        public final ax.wb.e<ax.sb.t> a(Object object, ax.wb.e<?> p8) {
                            p8 = new /* invalid duplicate definition of identical inner class */;
                            p8.g0 = object;
                            return p8;
                        }

                        @Override
                        public final Object p(Object object) {
                            ax.xb.b.c();
                            if (this.f0 == 0) {
                                boolean bl;
                                ax.sb.o.b(object);
                                object = (ax.n0.n)this.g0;
                                ax.n0.n n8 = this.h0;
                                boolean bl2 = n8 instanceof ax.n0.c;
                                boolean bl3 = bl = false;
                                if (!bl2) {
                                    if (n8 instanceof h) {
                                        bl3 = bl;
                                    } else {
                                        bl3 = bl;
                                        if (object == n8) {
                                            bl3 = true;
                                        }
                                    }
                                }
                                return ax.yb.b.a(bl3);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        public final Object u(ax.n0.n<T> n8, ax.wb.e<? super Boolean> e8) {
                            return (this.a(n8, e8)).p(ax.sb.t.a);
                        }
                    })){
                        final ax.Tb.b q;
                        {
                            this.q = b8;
                        }

                        @Override
                        public Object a(ax.Tb.c object, ax.wb.e e8) {
                            if ((object = this.q.a(new ax.Tb.c<ax.n0.n<T>>((ax.Tb.c)object){
                                final ax.Tb.c q;
                                {
                                    this.q = c8;
                                }

                                /*
                                 * Unable to fully structure code
                                 */
                                @Override
                                public Object e(Object var1_1, ax.wb.e var2_2) {
                                    block8: {
                                        block9: {
                                            block10: {
                                                block7: {
                                                    block5: {
                                                        block6: {
                                                            if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                                            var4_3 = var2_2;
                                                            var3_4 = var4_3.f0;
                                                            if ((var3_4 & -2147483648) != 0) {
                                                                var4_3.f0 = var3_4 + -2147483648;
                                                                var2_2 = var4_3;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var2_2 = new ax.yb.d(this, (ax.wb.e)var2_2){
                                                                    Object e0;
                                                                    int f0;
                                                                    final a g0;
                                                                    {
                                                                        this.g0 = a8;
                                                                        super(e8);
                                                                    }

                                                                    @Override
                                                                    public final Object p(Object object) {
                                                                        this.e0 = object;
                                                                        this.f0 |= Integer.MIN_VALUE;
                                                                        return this.g0.e((Object)null, (ax.wb.e)this);
                                                                    }
                                                                };
                                                            }
                                                            var5_5 = var2_2.e0;
                                                            var4_3 = ax.xb.b.c();
                                                            var3_4 = var2_2.f0;
                                                            if (var3_4 == 0) break block5;
                                                            if (var3_4 != 1) break block6;
                                                            ax.sb.o.b(var5_5);
                                                            break block7;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ax.sb.o.b(var5_5);
                                                    var5_5 = this.q;
                                                    var1_1 = (ax.n0.n)var1_1;
                                                    if (var1_1 instanceof ax.n0.j) break block8;
                                                    if (var1_1 instanceof h) break block9;
                                                    if (var1_1 instanceof ax.n0.c) {
                                                        var1_1 = ((ax.n0.c)var1_1).b();
                                                        var2_2.f0 = 1;
                                                        if (var5_5.e(var1_1, (ax.wb.e<? super ax.sb.t>)var2_2) == var4_3) {
                                                            return var4_3;
                                                        } else {
                                                            ** GOTO lbl30
                                                        }
                                                    }
                                                    break block10;
                                                }
                                                return ax.sb.t.a;
                                            }
                                            if (var1_1 instanceof ax.n0.o) {
                                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                            }
                                            throw new ax.sb.l();
                                        }
                                        throw ((h)var1_1).a();
                                    }
                                    throw ((ax.n0.j)var1_1).a();
                                }
                            }, e8)) == ax.xb.b.c()) {
                                return object;
                            }
                            return ax.sb.t.a;
                        }
                    };
                    this.f0 = 1;
                    if (ax.Tb.d.d(object, object3, this) != object2) return ax.sb.t.a;
                    return object2;
                }
            }

            public final Object u(ax.Tb.c<? super T> c8, ax.wb.e<? super ax.sb.t> e8) {
                return (this.a(c8, e8)).p(ax.sb.t.a);
            }
        });
        this.f = ".tmp";
        this.g = ax.sb.i.a(new ax.Fb.a<File>(this){
            final m<T> q;
            {
                this.q = m8;
                super(0);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final File a() {
                Object object = (File)this.q.a.invoke();
                Object object2 = ((File)object).getAbsolutePath();
                Object object3 = k;
                Object object4 = ((a)object3).b();
                synchronized (object4) {
                    Throwable throwable2;
                    block4: {
                        try {
                            if (!((a)object3).a().contains(object2)) {
                                object3 = ((a)object3).a();
                                ax.Gb.l.e(object2, "it");
                                object3.add(object2);
                                return object;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("There are multiple DataStores active for the same file: ");
                        ((StringBuilder)object2).append(object);
                        ((StringBuilder)object2).append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                        object = ((StringBuilder)object2).toString();
                        object2 = new IllegalStateException(object.toString());
                        throw object2;
                    }
                    throw throwable2;
                }
            }
        });
        this.h = ax.Tb.n.a(ax.n0.o.a);
        this.i = ax.tb.o.V((Iterable)list);
        this.j = new ax.n0.l(j8, (ax.Fb.l<? super Throwable, ax.sb.t>)new ax.Fb.l<Throwable, ax.sb.t>(this){
            final m<T> q;
            {
                this.q = m8;
                super(1);
            }

            public final void a(Throwable object) {
                if (object != null) {
                    this.q.h.setValue(new h((Throwable)object));
                }
                Object object2 = k;
                object = ((a)object2).b();
                m m8 = this.q;
                synchronized (object) {
                    ((a)object2).a().remove(m8.r().getAbsolutePath());
                    object2 = ax.sb.t.a;
                    return;
                }
            }
        }, ax.n0.m$e.q, new ax.Fb.p<b<T>, ax.wb.e<? super ax.sb.t>, Object>(this, null){
            int f0;
            Object g0;
            final m<T> h0;
            {
                this.h0 = m8;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<ax.sb.t> a(Object object, ax.wb.e<?> p8) {
                p8 = new /* invalid duplicate definition of identical inner class */;
                p8.g0 = object;
                return p8;
            }

            @Override
            public final Object p(Object object) {
                block5: {
                    Object object2;
                    block7: {
                        block6: {
                            block4: {
                                object2 = ax.xb.b.c();
                                int n8 = this.f0;
                                if (n8 == 0) break block4;
                                if (n8 != 1 && n8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ax.sb.o.b(object);
                                break block5;
                            }
                            ax.sb.o.b(object);
                            object = (b)this.g0;
                            if (!(object instanceof b.a)) break block6;
                            m m8 = this.h0;
                            object = (b.a)object;
                            this.f0 = 1;
                            if (m8.s((b.a)object, this) != object2) break block5;
                            break block7;
                        }
                        if (!(object instanceof b.b)) break block5;
                        m m9 = this.h0;
                        object = (b.b)object;
                        this.f0 = 2;
                        if (m9.t((b.b)object, this) != object2) break block5;
                    }
                    return object2;
                }
                return ax.sb.t.a;
            }

            public final Object u(b<T> b8, ax.wb.e<? super ax.sb.t> e8) {
                return (this.a(b8, e8)).p(ax.sb.t.a);
            }
        });
    }

    private final void q(File file) {
        block3: {
            block2: {
                File file2 = file.getCanonicalFile().getParentFile();
                if (file2 == null) break block2;
                file2.mkdirs();
                if (!file2.isDirectory()) break block3;
            }
            return;
        }
        throw new IOException(ax.Gb.l.m("Unable to create parent directories of ", file));
    }

    private final File r() {
        return (File)this.g.getValue();
    }

    private final Object s(b.a<T> object, ax.wb.e<? super ax.sb.t> e8) {
        block10: {
            block8: {
                ax.n0.n<T> n8;
                block9: {
                    n8 = this.h.getValue();
                    if (n8 instanceof ax.n0.c) break block8;
                    if (!(n8 instanceof ax.n0.j)) break block9;
                    if (n8 == ((b.a)object).a()) {
                        object = this.w(e8);
                        if (object == ax.xb.b.c()) {
                            return object;
                        }
                        return ax.sb.t.a;
                    }
                    break block8;
                }
                if (ax.Gb.l.a(n8, ax.n0.o.a)) {
                    object = this.w(e8);
                    if (object == ax.xb.b.c()) {
                        return object;
                    }
                    return ax.sb.t.a;
                }
                if (n8 instanceof h) break block10;
            }
            return ax.sb.t.a;
        }
        throw new IllegalStateException("Can't read in final state.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object t(b.b<T> var1_1, ax.wb.e<? super ax.sb.t> var2_2) {
        block20: {
            block17: {
                block19: {
                    block16: {
                        block18: {
                            block21: {
                                block22: {
                                    block24: {
                                        block23: {
                                            if (!(var2_2 instanceof i)) ** GOTO lbl-1000
                                            var6_5 = var2_2;
                                            var3_6 = var6_5.j0;
                                            if ((var3_6 & -2147483648) != 0) {
                                                var6_5.j0 = var3_6 + -2147483648;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var6_5 = new ax.yb.d(this, (ax.wb.e<? super i>)var2_2){
                                                    Object e0;
                                                    Object f0;
                                                    Object g0;
                                                    Object h0;
                                                    final m<T> i0;
                                                    int j0;
                                                    {
                                                        this.i0 = m8;
                                                        super(e8);
                                                    }

                                                    @Override
                                                    public final Object p(Object object) {
                                                        this.h0 = object;
                                                        this.j0 |= Integer.MIN_VALUE;
                                                        return this.i0.t(null, this);
                                                    }
                                                };
                                            }
                                            var5_7 = var6_5.h0;
                                            var9_8 = ax.xb.b.c();
                                            var3_6 = var6_5.j0;
                                            var4_9 = true;
                                            if (var3_6 == 0) break block21;
                                            if (var3_6 == 1) break block22;
                                            if (var3_6 == 2) break block23;
                                            if (var3_6 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            var2_2 = (u)var6_5.e0;
                                            break block24;
                                        }
                                        var2_2 = (u)var6_5.g0;
                                        var8_10 = (m)var6_5.f0;
                                        var7_11 = (b.b)var6_5.e0;
                                        var1_1 = var2_2;
                                        ax.sb.o.b(var5_7);
                                        var1_1 = var8_10;
                                        ** GOTO lbl88
                                    }
lbl28:
                                    // 2 sources

                                    while (true) {
                                        var1_1 = var2_2;
                                        try {
                                            ax.sb.o.b(var5_7);
                                            break block16;
                                        }
                                        catch (Throwable var2_3) {
                                            break block17;
                                        }
                                        break;
                                    }
                                }
                                var2_2 = (u)var6_5.e0;
                                ** while (true)
                            }
                            ax.sb.o.b(var5_7);
                            var5_7 = var2_2 = var1_1.a();
                            try {
                                var7_11 = ax.sb.n.q;
                                var5_7 = var2_2;
                                var7_11 = this.h.getValue();
                                var5_7 = var2_2;
                                if (!(var7_11 instanceof ax.n0.c)) break block18;
                                var5_7 = var2_2;
                                var7_11 = var1_1.d();
                                var5_7 = var2_2;
                                var1_1 = var1_1.b();
                                var5_7 = var2_2;
                                var6_5.e0 = var2_2;
                                var5_7 = var2_2;
                                var6_5.j0 = 1;
                                var5_7 = var2_2;
                                var1_1 = var6_5 = this.z((ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object>)var7_11, (ax.wb.i)var1_1, (ax.wb.e<? super T>)var6_5);
                                if (var6_5 == var9_8) {
                                    return var9_8;
                                }
                            }
                            catch (Throwable var2_4) {
                                var1_1 = var5_7;
                                break block17;
                            }
                            while (true) {
                                var5_7 = var1_1;
                                break block16;
                                break;
                            }
                        }
                        var5_7 = var2_2;
                        {
                            if (!(var7_11 instanceof ax.n0.j)) {
                                var5_7 = var2_2;
                                var4_9 = var7_11 instanceof ax.n0.o;
                            }
                            if (!var4_9) ** GOTO lbl113
                            var5_7 = var2_2;
                            if (var7_11 != var1_1.c()) break block19;
                            var5_7 = var2_2;
                            var6_5.e0 = var1_1;
                            var5_7 = var2_2;
                            var6_5.f0 = this;
                            var5_7 = var2_2;
                            var6_5.g0 = var2_2;
                            var5_7 = var2_2;
                            var6_5.j0 = 2;
                            var5_7 = var2_2;
                            if (this.v((ax.wb.e<ax.sb.t>)var6_5) == var9_8) {
                                return var9_8;
                            }
                            var5_7 = this;
                            var7_11 = var1_1;
                            var1_1 = var5_7;
lbl88:
                            // 2 sources

                            var5_7 = var2_2;
                            var8_10 = var7_11.d();
                            var5_7 = var2_2;
                            var7_11 = var7_11.b();
                            var5_7 = var2_2;
                            var6_5.e0 = var2_2;
                            var5_7 = var2_2;
                            var6_5.f0 = null;
                            var5_7 = var2_2;
                            var6_5.g0 = null;
                            var5_7 = var2_2;
                            var6_5.j0 = 3;
                            var5_7 = var2_2;
                            var1_1 = var6_5 = super.z((ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object>)var8_10, (ax.wb.i)var7_11, (ax.wb.e<? super T>)var6_5);
                            if (var6_5 != var9_8) ** continue;
                        }
                        return var9_8;
                    }
                    var1_1 = var2_2;
                    {
                        var5_7 = ax.sb.n.a(var5_7);
                        var1_1 = var2_2;
                        var2_2 = var5_7;
                        break block20;
                    }
                }
                var5_7 = var2_2;
                {
                    throw ((ax.n0.j)var7_11).a();
lbl113:
                    // 1 sources

                    var5_7 = var2_2;
                    if (var7_11 instanceof h) {
                        var5_7 = var2_2;
                        throw ((h)var7_11).a();
                    }
                    var5_7 = var2_2;
                    var5_7 = var2_2;
                    var1_1 = new ax.sb.l();
                    var5_7 = var2_2;
                    throw var1_1;
                }
            }
            var5_7 = ax.sb.n.q;
            var2_2 = ax.sb.n.a(ax.sb.o.a((Throwable)var2_2));
        }
        w.c(var1_1, var2_2);
        return ax.sb.t.a;
    }

    /*
     * Unable to fully structure code
     */
    private final Object u(ax.wb.e<? super ax.sb.t> var1_1) {
        block19: {
            block16: {
                block11: {
                    block20: {
                        block17: {
                            block18: {
                                block12: {
                                    block13: {
                                        block14: {
                                            block15: {
                                                if (!(var1_1 instanceof j)) ** GOTO lbl-1000
                                                var7_2 = var1_1;
                                                var2_3 = var7_2.m0;
                                                if ((var2_3 & -2147483648) != 0) {
                                                    var7_2.m0 = var2_3 + -2147483648;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var7_2 = new ax.yb.d(this, (ax.wb.e<? super j>)var1_1){
                                                        Object e0;
                                                        Object f0;
                                                        Object g0;
                                                        Object h0;
                                                        Object i0;
                                                        Object j0;
                                                        Object k0;
                                                        final m<T> l0;
                                                        int m0;
                                                        {
                                                            this.l0 = m8;
                                                            super(e8);
                                                        }

                                                        @Override
                                                        public final Object p(Object object) {
                                                            this.k0 = object;
                                                            this.m0 |= Integer.MIN_VALUE;
                                                            return this.l0.u(this);
                                                        }
                                                    };
                                                }
                                                var6_4 = var7_2.k0;
                                                var11_5 = ax.xb.b.c();
                                                var2_3 = var7_2.m0;
                                                var3_6 = 0;
                                                if (var2_3 == 0) break block12;
                                                if (var2_3 == 1) break block13;
                                                if (var2_3 == 2) break block14;
                                                if (var2_3 != 3) break block15;
                                                var1_1 = (ax.Zb.a)var7_2.h0;
                                                var8_7 = (t)var7_2.g0;
                                                var4_9 = (v)var7_2.f0;
                                                var5_11 = (m)var7_2.e0;
                                                ax.sb.o.b(var6_4);
                                                var6_4 = var8_7;
                                                break block16;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        var8_8 = (Iterator)var7_2.j0;
                                        var9_12 = var7_2.i0;
                                        var10_13 = (t)var7_2.h0;
                                        var5_11 = (v)var7_2.g0;
                                        var4_9 = (ax.Zb.a)var7_2.f0;
                                        var1_1 = (m)var7_2.e0;
                                        ax.sb.o.b(var6_4);
                                        var6_4 = var10_13;
                                        break block17;
                                    }
                                    var8_8 = (v)var7_2.h0;
                                    var4_9 = (v)var7_2.g0;
                                    var1_1 = (ax.Zb.a)var7_2.f0;
                                    var5_11 = (m)var7_2.e0;
                                    ax.sb.o.b(var6_4);
                                    break block18;
                                }
                                ax.sb.o.b(var6_4);
                                var2_3 = !ax.Gb.l.a(this.h.getValue(), ax.n0.o.a) && !(this.h.getValue() instanceof ax.n0.j) ? 0 : 1;
                                if (var2_3 == 0) break block19;
                                var1_1 = ax.Zb.c.b(false, 1, null);
                                var8_8 = new v<T>();
                                var7_2.e0 = this;
                                var7_2.f0 = var1_1;
                                var7_2.g0 = var8_8;
                                var7_2.h0 = var8_8;
                                var7_2.m0 = 1;
                                var6_4 = this.y(var7_2);
                                if (var6_4 == var11_5) break block11;
                                var5_11 = this;
                                var4_9 = var8_8;
                            }
                            var8_8.q = var6_4;
                            var6_4 = new t();
                            var9_12 = new ax.n0.i<T>((ax.Zb.a)var1_1, (t)var6_4, var4_9, var5_11){
                                final ax.Zb.a a;
                                final t b;
                                final v<T> c;
                                final m<T> d;
                                {
                                    this.a = a8;
                                    this.b = t8;
                                    this.c = v8;
                                    this.d = m8;
                                }

                                /*
                                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                                 * Unable to fully structure code
                                 * Enabled aggressive block sorting
                                 * Enabled unnecessary exception pruning
                                 * Enabled aggressive exception aggregation
                                 */
                                @Override
                                public Object a(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> var1_1, ax.wb.e<? super T> var2_2) {
                                    block16: {
                                        block19: {
                                            block18: {
                                                block22: {
                                                    block20: {
                                                        block21: {
                                                            block17: {
                                                                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                                                var6_5 = var2_2;
                                                                var3_6 = var6_5.l0;
                                                                if ((var3_6 & -2147483648) != 0) {
                                                                    var6_5.l0 = var3_6 + -2147483648;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var6_5 = new ax.yb.d(this, (ax.wb.e<? super a>)var2_2){
                                                                        Object e0;
                                                                        Object f0;
                                                                        Object g0;
                                                                        Object h0;
                                                                        Object i0;
                                                                        Object j0;
                                                                        final k k0;
                                                                        int l0;
                                                                        {
                                                                            this.k0 = k8;
                                                                            super(e8);
                                                                        }

                                                                        @Override
                                                                        public final Object p(Object object) {
                                                                            this.j0 = object;
                                                                            this.l0 |= Integer.MIN_VALUE;
                                                                            return this.k0.a(null, this);
                                                                        }
                                                                    };
                                                                }
                                                                var5_7 = var6_5.j0;
                                                                var9_8 = ax.xb.b.c();
                                                                var3_6 = var6_5.l0;
                                                                if (var3_6 == 0) break block20;
                                                                if (var3_6 == 1) break block21;
                                                                if (var3_6 != 2) {
                                                                    if (var3_6 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    var7_9 = var6_5.g0;
                                                                    var4_11 = (v)var6_5.f0;
                                                                    var1_1 = var2_2 = (ax.Zb.a)var6_5.e0;
                                                                    try {
                                                                        ax.sb.o.b(var5_7);
                                                                        var5_7 = var7_9;
                                                                        break block16;
                                                                    }
                                                                    catch (Throwable var2_3) {
                                                                        break block17;
                                                                    }
                                                                }
                                                                var7_10 = (m)var6_5.g0;
                                                                var2_2 = (v)var6_5.f0;
                                                                var4_11 = var1_1 = (ax.Zb.a)var6_5.e0;
                                                                try {
                                                                    ax.sb.o.b(var5_7);
                                                                    break block18;
                                                                }
                                                                catch (Throwable var2_4) {
                                                                    var1_1 = var4_11;
                                                                    ** GOTO lbl31
                                                                }
                                                            }
lbl31:
                                                            // 3 sources

                                                            while (true) {
                                                                var1_1.c(null);
                                                                throw var2_2;
                                                            }
                                                        }
                                                        var1_1 = (m)var6_5.i0;
                                                        var4_11 = (v)var6_5.h0;
                                                        var7_10 = (t)var6_5.g0;
                                                        var2_2 = (ax.Zb.a)var6_5.f0;
                                                        var8_13 = (ax.Fb.p)var6_5.e0;
                                                        ax.sb.o.b(var5_7);
                                                        var5_7 = var8_13;
                                                        break block22;
                                                    }
                                                    ax.sb.o.b(var5_7);
                                                    var2_2 = this.a;
                                                    var7_10 = this.b;
                                                    var4_11 = this.c;
                                                    var8_14 = this.d;
                                                    var6_5.e0 = var1_1;
                                                    var6_5.f0 = var2_2;
                                                    var6_5.g0 = var7_10;
                                                    var6_5.h0 = var4_11;
                                                    var6_5.i0 = var8_14;
                                                    var6_5.l0 = 1;
                                                    if (var2_2.a(null, (ax.wb.e<? super ax.sb.t>)var6_5) == var9_8) {
                                                        return var9_8;
                                                    }
                                                    var5_7 = var1_1;
                                                    var1_1 = var8_14;
                                                }
                                                try {
                                                    if (!var7_10.q) {
                                                        var7_10 = var4_11.q;
                                                        var6_5.e0 = var2_2;
                                                        var6_5.f0 = var4_11;
                                                        var6_5.g0 = var1_1;
                                                        var6_5.h0 = null;
                                                        var6_5.i0 = null;
                                                        var6_5.l0 = 2;
                                                        if ((var5_7 = var5_7.j(var7_10, var6_5)) == var9_8) {
                                                            return var9_8;
                                                        }
                                                        var7_10 = var1_1;
                                                        var1_1 = var2_2;
                                                        var2_2 = var4_11;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                catch (Throwable var4_12) {
                                                    var1_1 = var2_2;
                                                    var2_2 = var4_12;
                                                    ** continue;
                                                }
                                            }
                                            var4_11 = var1_1;
                                            {
                                                if (ax.Gb.l.a(var5_7, var2_2.q)) ** GOTO lbl104
                                                var4_11 = var1_1;
                                                var6_5.e0 = var1_1;
                                                var4_11 = var1_1;
                                                var6_5.f0 = var2_2;
                                                var4_11 = var1_1;
                                                var6_5.g0 = var5_7;
                                                var4_11 = var1_1;
                                                var6_5.l0 = 3;
                                                var4_11 = var1_1;
                                                if ((var6_5 = var7_10.A(var5_7, (ax.wb.e<? super ax.sb.t>)var6_5)) != var9_8) break block19;
                                            }
                                            return var9_8;
                                        }
                                        var4_11 = var2_2;
                                        var2_2 = var1_1;
                                    }
                                    var1_1 = var2_2;
                                    {
                                        block23: {
                                            var4_11.q = var5_7;
                                            break block23;
lbl104:
                                            // 1 sources

                                            var4_11 = var2_2;
                                            var2_2 = var1_1;
                                        }
                                        var1_1 = var2_2;
                                        var4_11 = var4_11.q;
                                        var2_2.c(null);
                                        return var4_11;
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var1_1 = new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                        throw var1_1;
                                    }
                                }
                            };
                            var8_8 = var5_11.i;
                            if (var8_8 == null) break block20;
                            var8_8 = ((Iterable)var8_8).iterator();
                            var10_13 = var5_11;
                            var5_11 = var4_9;
                            var4_9 = var1_1;
                            var1_1 = var10_13;
                        }
                        while (var8_8.hasNext()) {
                            var10_13 = (ax.Fb.p)var8_8.next();
                            var7_2.e0 = var1_1;
                            var7_2.f0 = var4_9;
                            var7_2.g0 = var5_11;
                            var7_2.h0 = var6_4;
                            var7_2.i0 = var9_12;
                            var7_2.j0 = var8_8;
                            var7_2.m0 = 2;
                            if (var10_13.j(var9_12, var7_2) != var11_5) continue;
                            break block11;
                        }
                        var8_8 = var5_11;
                        var5_11 = var1_1;
                        var1_1 = var4_9;
                        var4_9 = var8_8;
                    }
                    var5_11.i = null;
                    var7_2.e0 = var5_11;
                    var7_2.f0 = var4_9;
                    var7_2.g0 = var6_4;
                    var7_2.h0 = var1_1;
                    var7_2.i0 = null;
                    var7_2.j0 = null;
                    var7_2.m0 = 3;
                    if (var1_1.a(null, var7_2) != var11_5) break block16;
                }
                return var11_5;
            }
            try {
                var6_4.q = true;
                var6_4 = ax.sb.t.a;
                var1_1 = var5_11.h;
                var4_9 = var4_9.q;
                var2_3 = var3_6;
                if (var4_9 != null) {
                    var2_3 = var4_9.hashCode();
                }
                var1_1.setValue(new ax.n0.c<Object>(var4_9, var2_3));
                return ax.sb.t.a;
            }
            finally {
                var1_1.c(null);
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    /*
     * Unable to fully structure code
     */
    private final Object v(ax.wb.e<? super ax.sb.t> var1_1) {
        block9: {
            block8: {
                if (!(var1_1 instanceof l)) ** GOTO lbl-1000
                var3_2 = var1_1;
                var2_6 = var3_2.h0;
                if ((var2_6 & -2147483648) != 0) {
                    var3_2.h0 = var2_6 + -2147483648;
                    var1_1 = var3_2;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new ax.yb.d(this, (ax.wb.e<? super l>)var1_1){
                        Object e0;
                        Object f0;
                        final m<T> g0;
                        int h0;
                        {
                            this.g0 = m8;
                            super(e8);
                        }

                        @Override
                        public final Object p(Object object) {
                            this.f0 = object;
                            this.h0 |= Integer.MIN_VALUE;
                            return this.g0.v(this);
                        }
                    };
                }
                var4_7 = var1_1.f0;
                var3_2 = ax.xb.b.c();
                var2_6 = var1_1.h0;
                if (var2_6 != 0) {
                    if (var2_6 == 1) {
                        var1_1 = (m)var1_1.e0;
                        try {
                            ax.sb.o.b(var4_7);
                            break block8;
                        }
                        catch (Throwable var3_3) {
                            break block9;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ax.sb.o.b(var4_7);
                try {
                    var1_1.e0 = this;
                    var1_1.h0 = 1;
                    var1_1 = this.u((ax.wb.e<ax.sb.t>)var1_1);
                    if (var1_1 != var3_2) break block8;
                    return var3_2;
                }
                catch (Throwable var3_4) {
                    var1_1 = this;
                }
            }
            return ax.sb.t.a;
        }
        var1_1.h.setValue(new ax.n0.j<T>((Throwable)var3_5));
        throw var3_5;
    }

    /*
     * Unable to fully structure code
     */
    private final Object w(ax.wb.e<? super ax.sb.t> var1_1) {
        block10: {
            block9: {
                if (!(var1_1 instanceof m)) ** GOTO lbl-1000
                var3_2 = var1_1;
                var2_6 = var3_2.h0;
                if ((var2_6 & -2147483648) != 0) {
                    var3_2.h0 = var2_6 + -2147483648;
                    var1_1 = var3_2;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new ax.yb.d(this, (ax.wb.e<? super m>)var1_1){
                        Object e0;
                        Object f0;
                        final m<T> g0;
                        int h0;
                        {
                            this.g0 = m8;
                            super(e8);
                        }

                        @Override
                        public final Object p(Object object) {
                            this.f0 = object;
                            this.h0 |= Integer.MIN_VALUE;
                            return this.g0.w(this);
                        }
                    };
                }
                var3_2 = var1_1.f0;
                var4_7 = ax.xb.b.c();
                var2_6 = var1_1.h0;
                if (var2_6 != 0) {
                    if (var2_6 == 1) {
                        var1_1 = (m)var1_1.e0;
                        try {
                            ax.sb.o.b(var3_2);
                        }
                        catch (Throwable var3_3) {
                            break block9;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ax.sb.o.b(var3_2);
                try {
                    var1_1.e0 = this;
                    var1_1.h0 = 1;
                    var1_1 = this.u((ax.wb.e<ax.sb.t>)var1_1);
                    if (var1_1 == var4_7) {
                        return var4_7;
                    }
                    break block10;
                }
                catch (Throwable var3_4) {
                    var1_1 = this;
                }
            }
            var1_1.h.setValue(new ax.n0.j<T>((Throwable)var3_5));
        }
        return ax.sb.t.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object x(ax.wb.e<? super T> var1_1) {
        block17: {
            block16: {
                block18: {
                    if (!(var1_1 instanceof n)) ** GOTO lbl-1000
                    var3_2 = var1_1;
                    var2_6 = var3_2.j0;
                    if ((var2_6 & -2147483648) != 0) {
                        var3_2.j0 = var2_6 + -2147483648;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_2 = new ax.yb.d(this, (ax.wb.e<? super n>)var1_1){
                            Object e0;
                            Object f0;
                            Object g0;
                            Object h0;
                            final m<T> i0;
                            int j0;
                            {
                                this.i0 = m8;
                                super(e8);
                            }

                            @Override
                            public final Object p(Object object) {
                                this.h0 = object;
                                this.j0 |= Integer.MIN_VALUE;
                                return this.i0.x(this);
                            }
                        };
                    }
                    var6_7 = var3_2.h0;
                    var4_10 = ax.xb.b.c();
                    var2_6 = var3_2.j0;
                    if (var2_6 == 0) break block18;
                    if (var2_6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var5_12 = (Throwable)var3_2.g0;
                    var4_10 = (Closeable)var3_2.f0;
                    var1_1 = (m)var3_2.e0;
                    try {
                        ax.sb.o.b(var6_7);
                        var3_2 = var6_7;
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var6_8) {
                        var3_2 = var1_1;
                        var5_12 = var4_10;
                        var4_10 = var6_8;
                        break block16;
                    }
                }
                ax.sb.o.b(var6_7);
                try {
                    var1_1 = new FileInputStream(this.r());
                }
                catch (FileNotFoundException var3_4) {
                    var1_1 = this;
                    break block17;
                }
                try {
                    var5_12 = this.b;
                    var3_2.e0 = this;
                    var3_2.f0 = var1_1;
                    var3_2.g0 = null;
                    var3_2.j0 = 1;
                    var3_2 = var5_12.c((InputStream)var1_1, var3_2);
                    if (var3_2 == var4_10) {
                        return var4_10;
                    }
                    var6_7 = this;
                    var5_12 = null;
                    var4_10 = var1_1;
                    var1_1 = var6_7;
                }
                catch (Throwable var4_11) {
                    var3_2 = this;
                    var5_12 = var1_1;
                    break block16;
                }
lbl-1000:
                // 2 sources

                {
                    ax.Db.a.a((Closeable)var4_10, (Throwable)var5_12);
                    return var3_2;
                }
            }
            try {
                throw var4_10;
            }
            catch (Throwable var6_9) {
                var1_1 = var3_2;
                {
                    ax.Db.a.a((Closeable)var5_12, (Throwable)var4_10);
                    var1_1 = var3_2;
                    throw var6_9;
                }
            }
        }
        if (!super.r().exists()) {
            return var1_1.b.b();
        }
        throw var3_5;
    }

    /*
     * Unable to fully structure code
     */
    private final Object y(ax.wb.e<? super T> var1_1) {
        block18: {
            block13: {
                block12: {
                    block19: {
                        block20: {
                            block14: {
                                block15: {
                                    block16: {
                                        block17: {
                                            if (!(var1_1 instanceof o)) ** GOTO lbl-1000
                                            var4_3 = var1_1;
                                            var2_4 = var4_3.i0;
                                            if ((var2_4 & -2147483648) != 0) {
                                                var4_3.i0 = var2_4 + -2147483648;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_3 = new ax.yb.d(this, (ax.wb.e<? super o>)var1_1){
                                                    Object e0;
                                                    Object f0;
                                                    Object g0;
                                                    final m<T> h0;
                                                    int i0;
                                                    {
                                                        this.h0 = m8;
                                                        super(e8);
                                                    }

                                                    @Override
                                                    public final Object p(Object object) {
                                                        this.g0 = object;
                                                        this.i0 |= Integer.MIN_VALUE;
                                                        return this.h0.y(this);
                                                    }
                                                };
                                            }
                                            var5_5 = var4_3.g0;
                                            var7_6 = ax.xb.b.c();
                                            var2_4 = var4_3.i0;
                                            if (var2_4 == 0) break block14;
                                            if (var2_4 == 1) break block15;
                                            if (var2_4 == 2) break block16;
                                            if (var2_4 != 3) break block17;
                                            var1_1 = var4_3.f0;
                                            var4_3 = (ax.n0.a)var4_3.e0;
                                            try {
                                                ax.sb.o.b(var5_5);
                                                return var1_1;
                                            }
                                            catch (IOException var1_2) {
                                                var3_7 = var1_2;
                                            }
                                            break block18;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    var1_1 = (ax.n0.a)var4_3.f0;
                                    var6_12 = (m)var4_3.e0;
                                    ax.sb.o.b(var5_5);
                                    break block19;
                                }
                                var1_1 = (m)var4_3.e0;
                                try {
                                    ax.sb.o.b(var5_5);
                                    return var5_5;
                                }
                                catch (ax.n0.a var3_8) {}
                                break block20;
                            }
                            ax.sb.o.b(var5_5);
                            try {
                                var4_3.e0 = this;
                                var4_3.i0 = 1;
                                var1_1 = this.x((ax.wb.e<? super T>)var4_3);
                                if (var1_1 != var7_6) {
                                    return var1_1;
                                }
                                break block12;
                            }
                            catch (ax.n0.a var3_9) {
                                var1_1 = this;
                            }
                        }
                        var5_5 = var1_1.c;
                        var4_3.e0 = var1_1;
                        var4_3.f0 = var3_10;
                        var4_3.i0 = 2;
                        var5_5 = var5_5.a((ax.n0.a)var3_10, var4_3);
                        if (var5_5 == var7_6) break block12;
                        var6_12 = var1_1;
                        var1_1 = var3_10;
                    }
                    try {
                        var4_3.e0 = var1_1;
                        var4_3.f0 = var5_5;
                        var4_3.i0 = 3;
                        var3_10 = var6_12.A(var5_5, (ax.wb.e<ax.sb.t>)var4_3);
                        if (var3_10 != var7_6) break block13;
                    }
                    catch (IOException var3_11) {
                        var4_3 = var1_1;
                    }
                }
                return var7_6;
            }
            return var5_5;
        }
        ax.sb.a.a((Throwable)var4_3, var3_7);
        throw var4_3;
    }

    /*
     * Unable to fully structure code
     */
    private final Object z(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> var1_1, ax.wb.i var2_2, ax.wb.e<? super T> var3_3) {
        block9: {
            block12: {
                block11: {
                    block10: {
                        block6: {
                            block7: {
                                block8: {
                                    if (!(var3_3 instanceof p)) ** GOTO lbl-1000
                                    var5_4 = var3_3;
                                    var4_5 = var5_4.j0;
                                    if ((var4_5 & -2147483648) != 0) {
                                        var5_4.j0 = var4_5 + -2147483648;
                                        var3_3 = var5_4;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = new ax.yb.d(this, (ax.wb.e<? super p>)var3_3){
                                            Object e0;
                                            Object f0;
                                            Object g0;
                                            Object h0;
                                            final m<T> i0;
                                            int j0;
                                            {
                                                this.i0 = m8;
                                                super(e8);
                                            }

                                            @Override
                                            public final Object p(Object object) {
                                                this.h0 = object;
                                                this.j0 |= Integer.MIN_VALUE;
                                                return this.i0.z(null, null, this);
                                            }
                                        };
                                    }
                                    var7_6 = var3_3.h0;
                                    var8_7 = ax.xb.b.c();
                                    var4_5 = var3_3.j0;
                                    if (var4_5 == 0) break block6;
                                    if (var4_5 == 1) break block7;
                                    if (var4_5 != 2) break block8;
                                    var1_1 = var3_3.f0;
                                    var3_3 = (m)var3_3.e0;
                                    ax.sb.o.b(var7_6);
                                    break block9;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var5_4 = var3_3.g0;
                            var6_8 = (ax.n0.c)var3_3.f0;
                            var1_1 = (m)var3_3.e0;
                            ax.sb.o.b(var7_6);
                            var2_2 = var7_6;
                            break block10;
                        }
                        ax.sb.o.b(var7_6);
                        var6_8 = (ax.n0.c)this.h.getValue();
                        var6_8.a();
                        var5_4 = var6_8.b();
                        var1_1 = new ax.Fb.p<J, ax.wb.e<? super T>, Object>(var1_1, var5_4, null){
                            int f0;
                            final ax.Fb.p<T, ax.wb.e<? super T>, Object> g0;
                            final T h0;
                            {
                                this.g0 = p8;
                                this.h0 = t8;
                                super(2, e8);
                            }

                            @Override
                            public final ax.wb.e<ax.sb.t> a(Object object, ax.wb.e<?> e8) {
                                return new /* invalid duplicate definition of identical inner class */;
                            }

                            @Override
                            public final Object p(Object object) {
                                Object object2 = ax.xb.b.c();
                                int n8 = this.f0;
                                if (n8 != 0) {
                                    if (n8 == 1) {
                                        ax.sb.o.b(object);
                                        return object;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ax.sb.o.b(object);
                                ax.Fb.p p8 = this.g0;
                                object = this.h0;
                                this.f0 = 1;
                                object = p8.j(object, this);
                                if (object == object2) {
                                    return object2;
                                }
                                return object;
                            }

                            public final Object u(J j8, ax.wb.e<? super T> e8) {
                                return (this.a(j8, e8)).p(ax.sb.t.a);
                            }
                        };
                        var3_3.e0 = this;
                        var3_3.f0 = var6_8;
                        var3_3.g0 = var5_4;
                        var3_3.j0 = 1;
                        var2_2 = ax.Qb.g.g(var2_2, var1_1, var3_3);
                        if (var2_2 == var8_7) break block11;
                        var1_1 = this;
                    }
                    var6_8.a();
                    if (ax.Gb.l.a(var5_4, var2_2)) {
                        return var5_4;
                    }
                    var3_3.e0 = var1_1;
                    var3_3.f0 = var2_2;
                    var3_3.g0 = null;
                    var3_3.j0 = 2;
                    if (var1_1.A(var2_2, (ax.wb.e<? super ax.sb.t>)var3_3) != var8_7) break block12;
                }
                return var8_7;
            }
            var3_3 = var1_1;
            var1_1 = var2_2;
        }
        var2_2 = var3_3.h;
        var4_5 = var1_1 != null ? var1_1.hashCode() : 0;
        var2_2.setValue(new ax.n0.c<Object>(var1_1, var4_5));
        return var1_1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object A(T var1_1, ax.wb.e<? super ax.sb.t> var2_5) {
        block21: {
            block20: {
                block19: {
                    if (!(var2_5 instanceof r)) ** GOTO lbl-1000
                    var6_6 = var2_5;
                    var3_10 = var6_6.l0;
                    if ((var3_10 & -2147483648) != 0) {
                        var6_6.l0 = var3_10 + -2147483648;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6 = new ax.yb.d(this, (ax.wb.e<? super r>)var2_5){
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
                                return this.k0.A(null, this);
                            }
                        };
                    }
                    var11_11 = var6_6.j0;
                    var7_12 = ax.xb.b.c();
                    var3_10 = var6_6.l0;
                    if (var3_10 != 0) {
                        if (var3_10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var10_14 = (FileOutputStream)var6_6.i0;
                        var8_15 = (Throwable)var6_6.h0;
                        var9_16 = (Closeable)var6_6.g0;
                        var1_1 = (File)var6_6.f0;
                        var7_12 = (m)var6_6.e0;
                        var5_17 = var9_16;
                        var2_5 = var1_1;
                        try {
                            ax.sb.o.b(var11_11);
                            var6_6 = var9_16;
                            var9_16 = var10_14;
                            break block19;
                        }
                        catch (Throwable var6_7) {
                            var1_1 = var2_5;
                            break block20;
                        }
                    }
                    ax.sb.o.b(var11_11);
                    this.q(this.r());
                    var5_17 = new File(ax.Gb.l.m(this.r().getAbsolutePath(), this.f));
                    try {
                        var2_5 = new FileOutputStream((File)var5_17);
                    }
                    catch (IOException var1_3) {
                        // empty catch block
                        break block21;
                    }
                    try {
                        var8_15 = this.b;
                        var9_16 = new c((FileOutputStream)var2_5);
                        var6_6.e0 = this;
                        var6_6.f0 = var5_17;
                        var6_6.g0 = var2_5;
                        var6_6.h0 = null;
                        var6_6.i0 = var2_5;
                        var6_6.l0 = 1;
                        var1_1 = var8_15.a(var1_1, (OutputStream)var9_16, (ax.wb.e<? super ax.sb.t>)var6_6);
                        if (var1_1 == var7_12) {
                            return var7_12;
                        }
                        var7_12 = this;
                        var1_1 = var5_17;
                        var9_16 = var2_5;
                        var8_15 = null;
                        var6_6 = var2_5;
                    }
                    catch (Throwable var6_8) {
                        var1_1 = var5_17;
                        var5_17 = var2_5;
                        break block20;
                    }
                }
                var5_17 = var6_6;
                var2_5 = var1_1;
                {
                    var9_16.getFD().sync();
                    var5_17 = var6_6;
                    var2_5 = var1_1;
                    var9_16 = ax.sb.t.a;
                    var2_5 = var1_1;
                }
                {
                    ax.Db.a.a((Closeable)var6_6, (Throwable)var8_15);
                    var2_5 = var1_1;
                    var4_18 = var1_1.renameTo(super.r());
                    if (var4_18) {
                        return ax.sb.t.a;
                    }
                    var2_5 = var1_1;
                    var2_5 = var1_1;
                    var2_5 = var1_1;
                    var5_17 = new StringBuilder();
                    var2_5 = var1_1;
                    var5_17.append("Unable to rename ");
                    var2_5 = var1_1;
                    var5_17.append(var1_1);
                    var2_5 = var1_1;
                    var5_17.append(".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                    var2_5 = var1_1;
                    var6_6 = new IOException(var5_17.toString());
                    var2_5 = var1_1;
                    throw var6_6;
                }
            }
            try {
                throw var6_9;
            }
            catch (Throwable var7_13) {
                var2_5 = var1_1;
                {
                    ax.Db.a.a((Closeable)var5_17, (Throwable)var6_9);
                    var2_5 = var1_1;
                    throw var7_13;
                }
            }
        }
        if (var5_17.exists()) {
            var5_17.delete();
        }
        throw var1_4;
    }

    @Override
    public Object a(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> object, ax.wb.e<? super T> e8) {
        u u8 = w.b(null, 1, null);
        object = new b.b<T>(object, u8, this.h.getValue(), e8.b());
        this.j.e((b<Object>)object);
        return u8.T0(e8);
    }

    @Override
    public ax.Tb.b<T> b() {
        return this.e;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Set<String> a() {
            return l;
        }

        public final Object b() {
            return m;
        }
    }

    private static abstract class ax.n0.m$b<T> {
        private ax.n0.m$b() {
        }

        public /* synthetic */ ax.n0.m$b(g g8) {
            this();
        }

        public static final class a<T>
        extends ax.n0.m$b<T> {
            private final ax.n0.n<T> a;

            public a(ax.n0.n<T> n8) {
                super(null);
                this.a = n8;
            }

            public ax.n0.n<T> a() {
                return this.a;
            }
        }

        public static final class b<T>
        extends ax.n0.m$b<T> {
            private final ax.Fb.p<T, ax.wb.e<? super T>, Object> a;
            private final u<T> b;
            private final ax.n0.n<T> c;
            private final ax.wb.i d;

            public b(ax.Fb.p<? super T, ? super ax.wb.e<? super T>, ? extends Object> p8, u<T> u8, ax.n0.n<T> n8, ax.wb.i i8) {
                ax.Gb.l.f(p8, "transform");
                ax.Gb.l.f(u8, "ack");
                ax.Gb.l.f(i8, "callerContext");
                super(null);
                this.a = p8;
                this.b = u8;
                this.c = n8;
                this.d = i8;
            }

            public final u<T> a() {
                return this.b;
            }

            public final ax.wb.i b() {
                return this.d;
            }

            public ax.n0.n<T> c() {
                return this.c;
            }

            public final ax.Fb.p<T, ax.wb.e<? super T>, Object> d() {
                return this.a;
            }
        }
    }

    private static final class c
    extends OutputStream
    implements AutoCloseable {
        private final FileOutputStream q;

        public c(FileOutputStream fileOutputStream) {
            ax.Gb.l.f(fileOutputStream, "fileOutputStream");
            this.q = fileOutputStream;
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
            this.q.flush();
        }

        @Override
        public void write(int n8) {
            this.q.write(n8);
        }

        @Override
        public void write(byte[] byArray) {
            ax.Gb.l.f(byArray, "b");
            this.q.write(byArray);
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) {
            ax.Gb.l.f(byArray, "bytes");
            this.q.write(byArray, n8, n9);
        }
    }
}

