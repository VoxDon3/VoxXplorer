/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.app.Application;
import android.util.Log;
import ax.Fb.p;
import ax.Gb.g;
import ax.Qb.J;
import ax.Qb.K;
import ax.n8.E;
import ax.n8.G;
import ax.n8.I;
import ax.n8.k;
import ax.o8.a;
import ax.p8.f;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import java.util.Collection;
import java.util.Map;

public final class l {
    public static final b c = new b(null);
    private final ax.x7.f a;
    private final f b;

    public l(ax.x7.f f8, f object, i i8, G g8) {
        ax.Gb.l.f(f8, "firebaseApp");
        ax.Gb.l.f(object, "settings");
        ax.Gb.l.f(i8, "backgroundDispatcher");
        ax.Gb.l.f(g8, "lifecycleServiceBinder");
        this.a = f8;
        this.b = object;
        Log.d((String)"FirebaseSessions", (String)"Initializing Firebase Sessions SDK.");
        f8 = f8.k().getApplicationContext();
        if (f8 instanceof Application) {
            ((Application)f8).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)I.a);
            ax.Qb.g.d(K.a(i8), null, null, new p<J, e<? super t>, Object>(this, i8, g8, null){
                int f0;
                final l g0;
                final i h0;
                final G i0;
                {
                    this.g0 = l8;
                    this.h0 = i8;
                    this.i0 = g8;
                    super(2, e8);
                }

                @Override
                public final e<t> a(Object object, e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Unable to fully structure code
                 */
                @Override
                public final Object p(Object var1_1) {
                    block6: {
                        block11: {
                            block10: {
                                block7: {
                                    block8: {
                                        block9: {
                                            var4_2 = ax.xb.b.c();
                                            var2_3 = this.f0;
                                            if (var2_3 == 0) break block7;
                                            if (var2_3 == 1) break block8;
                                            if (var2_3 != 2) break block9;
                                            o.b(var1_1);
                                            ** GOTO lbl29
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    o.b(var1_1);
                                    break block10;
                                }
                                o.b(var1_1);
                                var1_1 = ax.o8.a.a;
                                this.f0 = 1;
                                var1_1 = var3_4 = var1_1.c(this);
                                if (var3_4 == var4_2) ** GOTO lbl28
                            }
                            var1_1 = ((Map)var1_1).values();
                            if (var1_1 instanceof Collection && ((Collection)var1_1).isEmpty()) break block11;
                            var1_1 = var1_1.iterator();
                            while (var1_1.hasNext()) {
                                block12: {
                                    if (!((ax.o8.b)var1_1.next()).a()) continue;
                                    var1_1 = l.b(this.g0);
                                    this.f0 = 2;
                                    if (var1_1.g(this) != var4_2) break block12;
lbl28:
                                    // 2 sources

                                    return var4_2;
                                }
                                if (!l.b(this.g0).d()) {
                                    Log.d((String)"FirebaseSessions", (String)"Sessions SDK disabled. Not listening to lifecycle events.");
                                } else {
                                    var1_1 = new E(this.h0);
                                    var1_1.i(this.i0);
                                    I.a.a((E)var1_1);
                                    l.a(this.g0).h(new k());
                                }
                                break block6;
                            }
                        }
                        Log.d((String)"FirebaseSessions", (String)"No Sessions subscribers. Not listening to lifecycle events.");
                    }
                    return t.a;
                }

                public final Object u(J j8, e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to register lifecycle callbacks, unexpected context ");
        ((StringBuilder)object).append(f8.getClass());
        ((StringBuilder)object).append('.');
        Log.e((String)"FirebaseSessions", (String)((StringBuilder)object).toString());
    }

    public static final /* synthetic */ ax.x7.f a(l l8) {
        return l8.a;
    }

    public static final /* synthetic */ f b(l l8) {
        return l8.b;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }
}

