/*
 * Decompiled with CFR 0.152.
 */
package ax.o8;

import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.Zb.a;
import ax.Zb.c;
import ax.o8.b;
import ax.sb.o;
import ax.sb.t;
import ax.tb.F;
import ax.wb.e;
import ax.yb.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {
    public static final a a = new a();
    private static final Map<b.a, a> b = java.util.DesugarCollections.synchronizedMap(new LinkedHashMap());

    private a() {
    }

    public static final void a(b.a a8) {
        l.f((Object)a8, "subscriberName");
        if (a8 != b.a.c0) {
            Map<b.a, a> map = b;
            if (map.containsKey((Object)a8)) {
                map = new StringBuilder();
                ((StringBuilder)((Object)map)).append("Dependency ");
                ((StringBuilder)((Object)map)).append((Object)a8);
                ((StringBuilder)((Object)map)).append(" already added.");
                Log.d((String)"SessionsDependencies", (String)((StringBuilder)((Object)map)).toString());
                return;
            }
            l.e(map, "dependencies");
            map.put(a8, new a(c.a(true), null, 2, null));
            map = new StringBuilder();
            ((StringBuilder)((Object)map)).append("Dependency to ");
            ((StringBuilder)((Object)map)).append((Object)a8);
            ((StringBuilder)((Object)map)).append(" added.");
            Log.d((String)"SessionsDependencies", (String)((StringBuilder)((Object)map)).toString());
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    private final a b(b.a a8) {
        Object object = b;
        l.e(object, "dependencies");
        object = object.get((Object)a8);
        if (object != null) {
            l.e(object, "dependencies.getOrElse(s\u2026load time.\"\n      )\n    }");
            return (a)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot get dependency ");
        ((StringBuilder)object).append((Object)a8);
        ((StringBuilder)object).append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public static final void e(ax.o8.b object) {
        l.f(object, "subscriber");
        b.a a8 = object.b();
        a a9 = a.b(a8);
        if (a9.b() != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Subscriber ");
            ((StringBuilder)object).append((Object)a8);
            ((StringBuilder)object).append(" already registered.");
            Log.d((String)"SessionsDependencies", (String)((StringBuilder)object).toString());
            return;
        }
        a9.c((ax.o8.b)object);
        object = new StringBuilder();
        ((StringBuilder)object).append("Subscriber ");
        ((StringBuilder)object).append((Object)a8);
        ((StringBuilder)object).append(" registered.");
        Log.d((String)"SessionsDependencies", (String)((StringBuilder)object).toString());
        a.a.a(a9.a(), null, 1, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object c(e<? super Map<b.a, ? extends ax.o8.b>> var1_1) {
        block7: {
            block8: {
                if (!(var1_1 instanceof b)) ** GOTO lbl-1000
                var3_3 = var1_1;
                var2_4 = var3_3.m0;
                if ((var2_4 & -2147483648) != 0) {
                    var3_3.m0 = var2_4 + -2147483648;
                    var1_1 = var3_3;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new d(this, (e<? super b>)var1_1){
                        Object e0;
                        Object f0;
                        Object g0;
                        Object h0;
                        Object i0;
                        Object j0;
                        Object k0;
                        final a l0;
                        int m0;
                        {
                            this.l0 = a8;
                            super(e8);
                        }

                        @Override
                        public final Object p(Object object) {
                            this.k0 = object;
                            this.m0 |= Integer.MIN_VALUE;
                            return this.l0.c(this);
                        }
                    };
                }
                var4_5 = var1_1.k0;
                var10_6 = ax.xb.b.c();
                var2_4 = var1_1.m0;
                if (var2_4 == 0) break block7;
                if (var2_4 != 1) break block8;
                var7_7 = var1_1.j0;
                var3_3 = (Map)var1_1.i0;
                var6_8 = (ax.Zb.a)var1_1.h0;
                var8_9 /* !! */  = (b.a)var1_1.g0;
                var5_10 = (Iterator)var1_1.f0;
                var9_11 = (Map)var1_1.e0;
                o.b(var4_5);
                var4_5 = var1_1;
                var1_1 = var9_11;
                ** GOTO lbl49
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(var4_5);
        var4_5 = ax.o8.a.b;
        l.e(var4_5, "dependencies");
        var3_3 = new LinkedHashMap<Object, b.a>(F.d(var4_5.size()));
        var5_10 = var4_5.entrySet().iterator();
        var4_5 = var1_1;
        while (var5_10.hasNext()) {
            var1_1 = (Map.Entry)var5_10.next();
            var7_7 = var1_1.getKey();
            var8_9 /* !! */  = (b.a)var1_1.getKey();
            var6_8 = ((a)var1_1.getValue()).a();
            var4_5.e0 = var3_3;
            var4_5.f0 = var5_10;
            var4_5.g0 = var8_9 /* !! */ ;
            var4_5.h0 = var6_8;
            var4_5.i0 = var3_3;
            var4_5.j0 = var7_7;
            var4_5.m0 = 1;
            if (var6_8.a(null, (e<? super t>)var4_5) == var10_6) {
                return var10_6;
            }
            var1_1 = var3_3;
lbl49:
            // 3 sources

            var8_9 /* !! */  = ax.o8.a.a.d(var8_9 /* !! */ );
            var3_3.put(var7_7, var8_9 /* !! */ );
            var3_3 = var1_1;
            continue;
            finally {
                var6_8.c(null);
            }
        }
        return var3_3;
    }

    public final ax.o8.b d(b.a a8) {
        l.f((Object)a8, "subscriberName");
        Object object = this.b(a8).b();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Subscriber ");
        ((StringBuilder)object).append((Object)a8);
        ((StringBuilder)object).append(" has not been registered.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private static final class a {
        private final ax.Zb.a a;
        private ax.o8.b b;

        public a(ax.Zb.a a8, ax.o8.b b8) {
            l.f(a8, "mutex");
            this.a = a8;
            this.b = b8;
        }

        public /* synthetic */ a(ax.Zb.a a8, ax.o8.b b8, int n8, g g8) {
            if ((n8 & 2) != 0) {
                b8 = null;
            }
            this(a8, b8);
        }

        public final ax.Zb.a a() {
            return this.a;
        }

        public final ax.o8.b b() {
            return this.b;
        }

        public final void c(ax.o8.b b8) {
            this.b = b8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!l.a(this.a, ((a)object).a)) {
                return false;
            }
            return l.a(this.b, ((a)object).b);
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            ax.o8.b b8 = this.b;
            int n9 = b8 == null ? 0 : b8.hashCode();
            return n8 * 31 + n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dependency(mutex=");
            stringBuilder.append(this.a);
            stringBuilder.append(", subscriber=");
            stringBuilder.append(this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

