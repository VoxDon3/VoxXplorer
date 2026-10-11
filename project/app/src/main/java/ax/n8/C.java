/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.util.Log;
import ax.Fb.p;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.J;
import ax.Qb.K;
import ax.b8.e;
import ax.n8.A;
import ax.n8.B;
import ax.n8.i;
import ax.n8.t;
import ax.n8.z;
import ax.p8.f;
import ax.sb.o;
import ax.xb.b;
import ax.yb.d;
import java.util.Map;

public final class C
implements com.google.firebase.sessions.b {
    public static final a g = new a(null);
    private static final double h = Math.random();
    private final ax.x7.f b;
    private final e c;
    private final f d;
    private final i e;
    private final ax.wb.i f;

    public C(ax.x7.f f8, e e8, f f9, i i8, ax.wb.i i9) {
        l.f(f8, "firebaseApp");
        l.f(e8, "firebaseInstallations");
        l.f(f9, "sessionSettings");
        l.f(i8, "eventGDTLogger");
        l.f(i9, "backgroundDispatcher");
        this.b = f8;
        this.c = e8;
        this.d = f9;
        this.e = i8;
        this.f = i9;
    }

    private final void g(A a8) {
        try {
            this.e.a(a8);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Successfully logged Session Start event: ");
            stringBuilder.append(a8.c().f());
            Log.d((String)"SessionFirelogPublisher", (String)stringBuilder.toString());
            return;
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"SessionFirelogPublisher", (String)"Error logging Session Start event to DataTransport: ", (Throwable)runtimeException);
            return;
        }
    }

    private final boolean h() {
        return h <= this.d.b();
    }

    /*
     * Unable to fully structure code
     */
    private final Object i(ax.wb.e<? super Boolean> var1_1) {
        if (!(var1_1 instanceof c)) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_3 = var3_2.h0;
        if ((var2_3 & -2147483648) != 0) {
            var3_2.h0 = var2_3 + -2147483648;
            var1_1 = var3_2;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = new d(this, (ax.wb.e<? super c>)var1_1){
                Object e0;
                Object f0;
                final C g0;
                int h0;
                {
                    this.g0 = c8;
                    super(e8);
                }

                @Override
                public final Object p(Object object) {
                    this.f0 = object;
                    this.h0 |= Integer.MIN_VALUE;
                    return this.g0.i(this);
                }
            };
        }
        var4_4 = var1_1.f0;
        var3_2 = ax.xb.b.c();
        var2_3 = var1_1.h0;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            var1_1 = (C)var1_1.e0;
            o.b(var4_4);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            o.b(var4_4);
            Log.d((String)"SessionFirelogPublisher", (String)"Data Collection is enabled for at least one Subscriber");
            var4_4 = this.d;
            var1_1.e0 = this;
            var1_1.h0 = 1;
            if (var4_4.g((ax.wb.e<? super ax.sb.t>)var1_1) == var3_2) {
                return var3_2;
            }
            var1_1 = this;
        }
        if (!var1_1.d.d()) {
            Log.d((String)"SessionFirelogPublisher", (String)"Sessions SDK disabled. Events will not be sent.");
            return ax.yb.b.a(false);
        }
        if (!super.h()) {
            Log.d((String)"SessionFirelogPublisher", (String)"Sessions SDK has dropped this session due to sampling.");
            return ax.yb.b.a(false);
        }
        return ax.yb.b.a(true);
    }

    @Override
    public void a(z z8) {
        l.f(z8, "sessionDetails");
        ax.Qb.g.d(K.a(this.f), null, null, new p<J, ax.wb.e<? super ax.sb.t>, Object>(this, z8, null){
            Object f0;
            Object g0;
            Object h0;
            Object i0;
            Object j0;
            Object k0;
            int l0;
            final C m0;
            final z n0;
            {
                this.m0 = c8;
                this.n0 = z8;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<ax.sb.t> a(Object object, ax.wb.e<?> e8) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Override
            public final Object p(Object object) {
                block10: {
                    t t8;
                    C c8;
                    Object object2;
                    ax.x7.f f8;
                    z z8;
                    f f9;
                    block6: {
                        Object object3;
                        block9: {
                            block7: {
                                block8: {
                                    block2: {
                                        block3: {
                                            block4: {
                                                block5: {
                                                    object3 = ax.xb.b.c();
                                                    int n8 = this.l0;
                                                    if (n8 == 0) break block2;
                                                    if (n8 == 1) break block3;
                                                    if (n8 == 2) break block4;
                                                    if (n8 != 3) break block5;
                                                    f9 = (f)this.k0;
                                                    z8 = (z)this.j0;
                                                    f8 = (ax.x7.f)this.i0;
                                                    object2 = (B)this.h0;
                                                    c8 = (C)this.g0;
                                                    t8 = (t)this.f0;
                                                    o.b(object);
                                                    break block6;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            o.b(object);
                                            break block7;
                                        }
                                        o.b(object);
                                        break block8;
                                    }
                                    o.b(object);
                                    object = this.m0;
                                    this.l0 = 1;
                                    object = object2 = ((C)object).i(this);
                                    if (object2 == object3) break block9;
                                }
                                if (!((Boolean)object).booleanValue()) break block10;
                                object = t.c;
                                object2 = this.m0.c;
                                this.l0 = 2;
                                object = object2 = ((t.a)object).a((e)object2, this);
                                if (object2 == object3) break block9;
                            }
                            t8 = (t)object;
                            c8 = this.m0;
                            object2 = B.a;
                            f8 = c8.b;
                            z8 = this.n0;
                            f9 = this.m0.d;
                            object = ax.o8.a.a;
                            this.f0 = t8;
                            this.g0 = c8;
                            this.h0 = object2;
                            this.i0 = f8;
                            this.j0 = z8;
                            this.k0 = f9;
                            this.l0 = 3;
                            object = ((ax.o8.a)object).c(this);
                            if (object != object3) break block6;
                        }
                        return object3;
                    }
                    c8.g(((B)object2).a(f8, z8, f9, (Map)object, t8.b(), t8.a()));
                }
                return ax.sb.t.a;
            }

            public final Object u(J j8, ax.wb.e<? super ax.sb.t> e8) {
                return (this.a(j8, e8)).p(ax.sb.t.a);
            }
        }, 3, null);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

