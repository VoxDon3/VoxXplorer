/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.k2.m;
import ax.k2.n;
import ax.k2.r;
import ax.k2.u;
import ax.o2.k;
import ax.sb.t;
import ax.tb.F;
import ax.tb.L;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class o {
    public static final a q = new a(null);
    private static final String[] r = new String[]{"UPDATE", "DELETE", "INSERT"};
    private final u a;
    private final Map<String, String> b;
    private final Map<String, Set<String>> c;
    private final Map<String, Integer> d;
    private final String[] e;
    private ax.k2.c f;
    private final AtomicBoolean g;
    private volatile boolean h;
    private volatile k i;
    private final b j;
    private final m k;
    private final ax.w.b<c, d> l;
    private r m;
    private final Object n;
    private final Object o;
    public final Runnable p;

    public o(u object, Map<String, String> object2, Map<String, Set<String>> object3, String ... object42) {
        ax.Gb.l.f(object, "database");
        ax.Gb.l.f(object2, "shadowTablesMap");
        ax.Gb.l.f(object3, "viewTables");
        ax.Gb.l.f(object42, "tableNames");
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.g = new AtomicBoolean(false);
        this.j = new b(((Object)object42).length);
        this.k = new m((u)object);
        this.l = new ax.w.b();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap<String, Integer>();
        int n8 = ((Object)object42).length;
        object3 = new String[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            object2 = object42[i8];
            object = Locale.US;
            ax.Gb.l.e(object, "US");
            object2 = ((String)object2).toLowerCase((Locale)object);
            ax.Gb.l.e(object2, "this as java.lang.String).toLowerCase(locale)");
            this.d.put((String)object2, i8);
            String string = this.b.get(object42[i8]);
            if (string != null) {
                ax.Gb.l.e(object, "US");
                object = string.toLowerCase((Locale)object);
                ax.Gb.l.e(object, "this as java.lang.String).toLowerCase(locale)");
            } else {
                object = null;
            }
            if (object == null) {
                object = object2;
            }
            object3[i8] = object;
        }
        this.e = object3;
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            object2 = entry.getValue();
            object3 = Locale.US;
            ax.Gb.l.e(object3, "US");
            object2 = ((String)object2).toLowerCase((Locale)object3);
            ax.Gb.l.e(object2, "this as java.lang.String).toLowerCase(locale)");
            if (!this.d.containsKey(object2)) continue;
            String string = entry.getKey();
            ax.Gb.l.e(object3, "US");
            object3 = string.toLowerCase((Locale)object3);
            ax.Gb.l.e(object3, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Integer> map = this.d;
            map.put((String)object3, F.h(map, object2));
        }
        this.p = new Runnable(this){
            final o q;
            {
                this.q = o8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            private final Set<Integer> a() {
                Throwable throwable2;
                Object object;
                block8: {
                    object = this.q;
                    Object object2 = L.b();
                    object = u.y(((o)object).e(), new ax.o2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                    try {
                        while (object.moveToNext()) {
                            object2.add(object.getInt(0));
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    t t8 = t.a;
                    ax.Db.a.a((Closeable)object, null);
                    object = L.a(object2);
                    if (object.isEmpty()) {
                        return object;
                    }
                    if (this.q.d() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    object2 = this.q.d();
                    if (object2 != null) {
                        object2.I();
                        return object;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                try {
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    ax.Db.a.a((Closeable)object, throwable2);
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
            @Override
            public void run() {
                block25: {
                    block24: {
                        block21: {
                            var2_1 = this.q.e().k();
                            var2_1.lock();
                            var1_3 = this.q.c();
                            if (!var1_3) {
                            }
                            ** GOTO lbl17
                            {
                                block23: {
                                    block22: {
                                        catch (SQLiteException var3_7) {
                                            break block21;
                                        }
                                        catch (IllegalStateException var3_8) {
                                            ** GOTO lbl-1000
                                        }
                                        var2_1.unlock();
                                        var2_1 = ax.k2.o.a(this.q);
                                        if (var2_1 == null) return;
                                        var2_1.e();
                                        return;
lbl17:
                                        // 1 sources

                                        try {
                                            var1_3 = this.q.g().compareAndSet(true, false);
                                            if (var1_3) break block22;
                                            var2_1.unlock();
                                        }
                                        catch (Throwable var3_6) {
                                            break block25;
                                        }
                                        var2_1 = ax.k2.o.a(this.q);
                                        if (var2_1 == null) return;
                                        var2_1.e();
                                        return;
                                    }
                                    var1_3 = this.q.e().q();
                                    if (!var1_3) break block23;
                                    var2_1.unlock();
                                    var2_1 = ax.k2.o.a(this.q);
                                    if (var2_1 == null) return;
                                    var2_1.e();
                                    return;
                                }
                                var4_4 = this.q.e().m().g0();
                                var4_4.a0();
                                var3_5 = this.a();
                                var4_4.Y();
                                var4_4.j0();
                                var2_1.unlock();
                                var4_4 = ax.k2.o.a(this.q);
                                var2_1 = var3_5;
                                if (var4_4 == null) break block24;
                                var2_1 = var3_5;
                                var3_5 = var4_4;
lbl52:
                                // 3 sources

                                while (true) {
                                    var3_5.e();
                                    break block24;
                                    break;
                                }
                                catch (Throwable var3_9) {}
                                {
                                    var4_4.j0();
                                    throw var3_9;
                                }
                            }
                        }
                        Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var3_7);
                        var4_4 = L.d();
                        var2_1.unlock();
                        var3_5 = ax.k2.o.a(this.q);
                        var2_1 = var4_4;
                        if (var3_5 == null) break block24;
                        var2_1 = var4_4;
                        ** GOTO lbl52
lbl-1000:
                        // 1 sources

                        {
                            Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var3_8);
                            var4_4 = L.d();
                            var2_1.unlock();
                        }
                        var3_5 = ax.k2.o.a(this.q);
                        var2_1 = var4_4;
                        if (var3_5 != null) {
                            var2_1 = var4_4;
                            ** continue;
                        }
                    }
                    if (var2_1.isEmpty() != false) return;
                    var3_5 = this.q.f();
                    var4_4 = this.q;
                    synchronized (var3_5) {
                        try {
                            var4_4 = var4_4.f().iterator();
                            while (true) {
                                if (!var4_4.hasNext()) {
                                    var2_1 = t.a;
                                    return;
                                }
                                ((d)((Map.Entry)var4_4.next()).getValue()).b(var2_1);
                            }
                        }
                        catch (Throwable var2_2) {}
                        throw var2_2;
                    }
                }
                var2_1.unlock();
                var2_1 = ax.k2.o.a(this.q);
                if (var2_1 == null) throw var3_6;
                var2_1.e();
                throw var3_6;
            }
        };
    }

    public static final /* synthetic */ ax.k2.c a(o o8) {
        return o8.f;
    }

    private final String[] n(String[] stringArray) {
        Set<String> set = L.b();
        for (String string : stringArray) {
            Map<String, Set<String>> map = this.c;
            Set<String> set2 = Locale.US;
            ax.Gb.l.e(set2, "US");
            String string2 = string.toLowerCase((Locale)((Object)set2));
            ax.Gb.l.e(string2, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(string2)) {
                map = this.c;
                ax.Gb.l.e(set2, "US");
                set2 = string.toLowerCase((Locale)((Object)set2));
                ax.Gb.l.e(set2, "this as java.lang.String).toLowerCase(locale)");
                set2 = map.get(set2);
                ax.Gb.l.c(set2);
                set.addAll((Collection)set2);
                continue;
            }
            set.add(string);
        }
        stringArray = L.a(set).toArray(new String[0]);
        ax.Gb.l.d(stringArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return stringArray;
    }

    private final void q(ax.o2.g g8, int n8) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        charSequence.append(n8);
        charSequence.append(", 0)");
        g8.C(charSequence.toString());
        charSequence = this.e[n8];
        for (String string : r) {
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            charSequence2.append(q.b((String)charSequence, string));
            charSequence2.append(" AFTER ");
            charSequence2.append(string);
            charSequence2.append(" ON `");
            charSequence2.append((String)charSequence);
            charSequence2.append("` BEGIN UPDATE ");
            charSequence2.append("room_table_modification_log");
            charSequence2.append(" SET ");
            charSequence2.append("invalidated");
            charSequence2.append(" = 1");
            charSequence2.append(" WHERE ");
            charSequence2.append("table_id");
            charSequence2.append(" = ");
            charSequence2.append(n8);
            charSequence2.append(" AND ");
            charSequence2.append("invalidated");
            charSequence2.append(" = 0");
            charSequence2.append("; END");
            charSequence2 = charSequence2.toString();
            ax.Gb.l.e(charSequence2, "StringBuilder().apply(builderAction).toString()");
            g8.C((String)charSequence2);
        }
    }

    private final void r(ax.o2.g g8, int n8) {
        String string = this.e[n8];
        for (String string2 : r) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DROP TRIGGER IF EXISTS ");
            stringBuilder.append(q.b(string, string2));
            string2 = stringBuilder.toString();
            ax.Gb.l.e(string2, "StringBuilder().apply(builderAction).toString()");
            g8.C(string2);
        }
    }

    @SuppressLint(value={"RestrictedApi"})
    public void b(c object) {
        ax.Gb.l.f(object, "observer");
        String[] object3 = this.n(((c)object).a());
        Object object2 = new ArrayList<Integer>(object3.length);
        int n8 = object3.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = object3[i8];
            Object object4 = this.d;
            Object object5 = Locale.US;
            ax.Gb.l.e(object5, "US");
            object5 = string.toLowerCase((Locale)object5);
            ax.Gb.l.e(object5, "this as java.lang.String).toLowerCase(locale)");
            object4 = object4.get(object5);
            if (object4 != null) {
                object2.add(object4);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("There is no table with name ");
            ((StringBuilder)object).append(string);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object2 = ax.tb.o.U(object2);
        d d8 = new d((c)object, (int[])object2, object3);
        ax.w.b<c, d> b8 = this.l;
        synchronized (b8) {
            object = this.l.l((c)object, d8);
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl29 : MonitorExitStatement: MONITOREXIT : var4_9
            if (object == null && this.j.b(Arrays.copyOf((int[])object2, ((Object)object2).length))) {
                this.s();
            }
            return;
        }
    }

    public final boolean c() {
        if (!this.a.w()) {
            return false;
        }
        if (!this.h) {
            this.a.m().g0();
        }
        if (!this.h) {
            Log.e((String)"ROOM", (String)"database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final k d() {
        return this.i;
    }

    public final u e() {
        return this.a;
    }

    public final ax.w.b<c, d> f() {
        return this.l;
    }

    public final AtomicBoolean g() {
        return this.g;
    }

    public final Map<String, Integer> h() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(ax.o2.g object) {
        ax.Gb.l.f(object, "database");
        Object object2 = this.o;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.h) {
                        Log.e((String)"ROOM", (String)"Invalidation tracker is initialized twice :/.");
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object.C("PRAGMA temp_store = MEMORY;");
                object.C("PRAGMA recursive_triggers='ON';");
                object.C("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                this.t((ax.o2.g)object);
                this.i = object.J("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                this.h = true;
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(String ... stringArray) {
        ax.Gb.l.f(stringArray, "tables");
        ax.w.b<c, d> b8 = this.l;
        synchronized (b8) {
            try {
                Iterator iterator = this.l.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        stringArray = t.a;
                        return;
                    }
                    Object object = (Map.Entry)iterator.next();
                    ax.Gb.l.e(object, "(observer, wrapper)");
                    c c8 = (c)object.getKey();
                    object = (d)object.getValue();
                    if (c8.b()) continue;
                    ((d)object).c(stringArray);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void k() {
        Object object = this.o;
        synchronized (object) {
            this.h = false;
            this.j.d();
            t t8 = t.a;
            return;
        }
    }

    public void l() {
        if (this.g.compareAndSet(false, true)) {
            ax.k2.c c8 = this.f;
            if (c8 != null) {
                c8.j();
            }
            this.a.n().execute(this.p);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"RestrictedApi"})
    public void m(c object) {
        ax.Gb.l.f(object, "observer");
        Object object2 = this.l;
        // MONITORENTER : object2
        object = this.l.n((c)object);
        // MONITOREXIT : object2
        if (object == null) return;
        object2 = this.j;
        if (!((b)object2).c(Arrays.copyOf((int[])(object = (Object)((d)object).a()), ((Object)object).length))) return;
        this.s();
    }

    public final void o(ax.k2.c c8) {
        ax.Gb.l.f(c8, "autoCloser");
        this.f = c8;
        c8.m(new n(this));
    }

    public final void p(Context context, String string, Intent intent) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(string, "name");
        ax.Gb.l.f(intent, "serviceIntent");
        this.m = new r(context, string, intent, this, this.a.n());
    }

    public final void s() {
        if (!this.a.w()) {
            return;
        }
        this.t(this.a.m().g0());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void t(ax.o2.g var1_1) {
        block21: {
            ax.Gb.l.f(var1_1, "database");
            if (var1_1.z0()) {
                return;
            }
            var6_6 = this.a.k();
            var6_6.lock();
            var7_7 = this.n;
            // MONITORENTER : var7_7
            var8_8 = this.j.a();
            if (var8_8 == null) break block21;
            ax.k2.o.q.a((ax.o2.g)var1_1);
            var4_10 = var8_8.length;
            var2_12 = 0;
            ** GOTO lbl34
        }
lbl19:
        // 2 sources

        while (true) {
            try {
                var6_6.unlock();
                return;
            }
            catch (SQLiteException var1_2) {}
            Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var1_2);
            return;
            catch (IllegalStateException var1_3) {}
            Log.e((String)"ROOM", (String)"Cannot run invalidation tracker. Is the db closed?", (Throwable)var1_3);
            return;
        }
        {
            catch (Throwable var1_4) {}
            {
                var6_6.unlock();
                throw var1_4;
            }
lbl34:
            // 4 sources

            for (var3_11 = 0; var3_11 < var4_10; ++var3_11, ++var2_12) {
                var5_13 = var8_8[var3_11];
                if (var5_13 == 1) ** GOTO lbl41
                if (var5_13 != 2) continue;
                this.r((ax.o2.g)var1_1, var2_12);
                continue;
lbl41:
                // 1 sources

                this.q((ax.o2.g)var1_1, var2_12);
            }
            try {
                var1_1.Y();
            }
            catch (Throwable var8_9) {
                ** GOTO lbl-1000
            }
            ** try [egrp 9[TRYBLOCK] [12 : 158->190)] { 
lbl49:
            // 1 sources

            var1_1.j0();
            var1_1 = t.a;
            // MONITOREXIT : var7_7
            ** continue;
        }
lbl53:
        // 2 sources

        catch (Throwable var1_5) {
            throw var1_5;
        }
lbl-1000:
        // 1 sources

        {
            var1_1.j0();
            throw var8_9;
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(ax.o2.g g8) {
            ax.Gb.l.f(g8, "database");
            if (g8.E0()) {
                g8.a0();
                return;
            }
            g8.r();
        }

        public final String b(String string, String string2) {
            ax.Gb.l.f(string, "tableName");
            ax.Gb.l.f(string2, "triggerType");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("`room_table_modification_trigger_");
            stringBuilder.append(string);
            stringBuilder.append('_');
            stringBuilder.append(string2);
            stringBuilder.append('`');
            return stringBuilder.toString();
        }
    }

    public static final class b {
        public static final a e = new a(null);
        private final long[] a;
        private final boolean[] b;
        private final int[] c;
        private boolean d;

        public b(int n8) {
            this.a = new long[n8];
            this.b = new boolean[n8];
            this.c = new int[n8];
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final int[] a() {
            synchronized (this) {
                int n8;
                block12: {
                    n8 = this.d;
                    if (n8 != 0) break block12;
                    return null;
                }
                long[] lArray = this.a;
                int n9 = lArray.length;
                int n10 = 0;
                for (int i8 = 0; i8 < n9; ++i8, ++n10) {
                    long l8 = lArray[i8];
                    int n11 = 1;
                    n8 = l8 > 0L ? 1 : 0;
                    Object[] objectArray = this.b;
                    if (n8 != objectArray[n10]) {
                        int[] nArray = this.c;
                        if (n8 == 0) {
                            n11 = 2;
                        }
                        nArray[n10] = n11;
                    } else {
                        this.c[n10] = 0;
                    }
                    objectArray[n10] = n8;
                }
                try {
                    this.d = false;
                    return (int[])this.c.clone();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final boolean b(int ... object) {
            ax.Gb.l.f(object, "tableIds");
            synchronized (this) {
                Throwable throwable2;
                block7: {
                    boolean bl;
                    int n8;
                    try {
                        n8 = ((int[])object).length;
                        bl = false;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    for (int i8 = 0; i8 < n8; ++i8) {
                        long[] lArray;
                        int n9 = object[i8];
                        {
                            lArray = this.a;
                        }
                        long l8 = lArray[n9];
                        lArray[n9] = 1L + l8;
                        if (l8 != 0L) continue;
                        {
                            this.d = true;
                            bl = true;
                        }
                    }
                    {
                        object = t.a;
                        return bl;
                    }
                }
                throw throwable2;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final boolean c(int ... object) {
            ax.Gb.l.f(object, "tableIds");
            synchronized (this) {
                Throwable throwable2;
                block7: {
                    boolean bl;
                    int n8;
                    try {
                        n8 = ((int[])object).length;
                        bl = false;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    for (int i8 = 0; i8 < n8; ++i8) {
                        long[] lArray;
                        int n9 = object[i8];
                        {
                            lArray = this.a;
                        }
                        long l8 = lArray[n9];
                        lArray[n9] = l8 - 1L;
                        if (l8 != 1L) continue;
                        {
                            this.d = true;
                            bl = true;
                        }
                    }
                    {
                        object = t.a;
                        return bl;
                    }
                }
                throw throwable2;
            }
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
                t t8 = t.a;
                return;
            }
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }
    }

    public static abstract class c {
        private final String[] a;

        public c(String[] stringArray) {
            ax.Gb.l.f(stringArray, "tables");
            this.a = stringArray;
        }

        public final String[] a() {
            return this.a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> var1);
    }

    public static final class d {
        private final c a;
        private final int[] b;
        private final String[] c;
        private final Set<String> d;

        public d(c set, int[] nArray, String[] stringArray) {
            ax.Gb.l.f(set, "observer");
            ax.Gb.l.f(nArray, "tableIds");
            ax.Gb.l.f(stringArray, "tableNames");
            this.a = set;
            this.b = nArray;
            this.c = stringArray;
            boolean bl = stringArray.length == 0;
            set = !bl ? L.c(stringArray[0]) : L.d();
            this.d = set;
            if (nArray.length == stringArray.length) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set<Integer> set) {
            ax.Gb.l.f(set, "invalidatedTablesIds");
            Object object = this.b;
            int n8 = ((int[])object).length;
            if (n8 != 0) {
                int n9 = 0;
                if (n8 != 1) {
                    object = L.b();
                    int[] nArray = this.b;
                    int n10 = nArray.length;
                    n8 = 0;
                    while (n9 < n10) {
                        if (set.contains(nArray[n9])) {
                            object.add(this.c[n8]);
                        }
                        ++n9;
                        ++n8;
                    }
                    set = L.a(object);
                } else {
                    set = set.contains(object[0]) ? this.d : L.d();
                }
            } else {
                set = L.d();
            }
            if (!set.isEmpty()) {
                this.a.c(set);
            }
        }

        public final void c(String[] object) {
            block8: {
                ax.Gb.l.f(object, "tables");
                int n8 = this.c.length;
                if (n8 != 0) {
                    if (n8 != 1) {
                        Set<String> set = L.b();
                        for (Object object2 : object) {
                            for (String string : this.c) {
                                if (!ax.Ob.h.v(string, (String)object2, true)) continue;
                                set.add(string);
                            }
                        }
                        object = L.a(set);
                    } else {
                        int n9 = ((Object)object).length;
                        for (n8 = 0; n8 < n9; ++n8) {
                            if (!ax.Ob.h.v((String)object[n8], this.c[0], true)) continue;
                            object = this.d;
                            break block8;
                        }
                        object = L.d();
                    }
                } else {
                    object = L.d();
                }
            }
            if (!object.isEmpty()) {
                this.a.c((Set<String>)object);
            }
        }
    }
}

