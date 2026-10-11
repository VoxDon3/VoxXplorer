package ax.k2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import ax.o2.C2680a;
import ax.tb.C3115F;
import ax.tb.C3121L;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: ax.k2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2384o {
    public static final a q = new a(null);
    private static final String[] r = {"UPDATE", "DELETE", "INSERT"};
    private final AbstractC2390u a;
    private final Map<String, String> b;
    private final Map<String, Set<String>> c;
    private final Map<String, Integer> d;
    private final String[] e;
    private C2372c f;
    private final AtomicBoolean g;
    private volatile boolean h;
    private volatile ax.o2.k i;
    private final b j;
    private final C2382m k;
    private final ax.w.b<c, d> l;
    private C2387r m;
    private final Object n;
    private final Object o;
    public final Runnable p;

    /* renamed from: ax.k2.o$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final void a(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "database");
            if (gVar.E0()) {
                gVar.a0();
            } else {
                gVar.r();
            }
        }

        public final String b(String str, String str2) {
            ax.Gb.l.f(str, "tableName");
            ax.Gb.l.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private a() {
        }
    }

    /* renamed from: ax.k2.o$b */
    public static final class b {
        public static final a e = new a(null);
        private final long[] a;
        private final boolean[] b;
        private final int[] c;
        private boolean d;

        /* renamed from: ax.k2.o$b$a */
        public static final class a {
            public /* synthetic */ a(ax.Gb.g gVar) {
                this();
            }

            private a() {
            }
        }

        public b(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z;
            ax.Gb.l.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            this.d = true;
                            z = true;
                        }
                    }
                    ax.sb.t tVar = ax.sb.t.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final boolean c(int... iArr) {
            boolean z;
            ax.Gb.l.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            this.d = true;
                            z = true;
                        }
                    }
                    ax.sb.t tVar = ax.sb.t.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
                ax.sb.t tVar = ax.sb.t.a;
            }
        }
    }

    /* renamed from: ax.k2.o$c */
    public static abstract class c {
        private final String[] a;

        public c(String[] strArr) {
            ax.Gb.l.f(strArr, "tables");
            this.a = strArr;
        }

        public final String[] a() {
            return this.a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> set);
    }

    /* renamed from: ax.k2.o$d */
    public static final class d {
        private final c a;
        private final int[] b;
        private final String[] c;
        private final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
            ax.Gb.l.f(cVar, "observer");
            ax.Gb.l.f(iArr, "tableIds");
            ax.Gb.l.f(strArr, "tableNames");
            this.a = cVar;
            this.b = iArr;
            this.c = strArr;
            this.d = !(strArr.length == 0) ? C3121L.c(strArr[0]) : C3121L.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set<Integer> set) {
            Set<String> d;
            ax.Gb.l.f(set, "invalidatedTablesIds");
            int[] iArr = this.b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set b = C3121L.b();
                    int[] iArr2 = this.b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            b.add(this.c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    d = C3121L.a(b);
                } else {
                    d = set.contains(Integer.valueOf(iArr[0])) ? this.d : C3121L.d();
                }
            } else {
                d = C3121L.d();
            }
            if (d.isEmpty()) {
                return;
            }
            this.a.c(d);
        }

        public final void c(String[] strArr) {
            Set<String> d;
            ax.Gb.l.f(strArr, "tables");
            int length = this.c.length;
            if (length == 0) {
                d = C3121L.d();
            } else if (length == 1) {
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        d = C3121L.d();
                        break;
                    } else {
                        if (ax.Ob.h.v(strArr[i], this.c[0], true)) {
                            d = this.d;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set b = C3121L.b();
                for (String str : strArr) {
                    for (String str2 : this.c) {
                        if (ax.Ob.h.v(str2, str, true)) {
                            b.add(str2);
                        }
                    }
                }
                d = C3121L.a(b);
            }
            if (d.isEmpty()) {
                return;
            }
            this.a.c(d);
        }
    }

    /* renamed from: ax.k2.o$e */
    public static final class e implements Runnable {
        e() {
        }

        private final Set<Integer> a() {
            C2384o c2384o = C2384o.this;
            Set b = C3121L.b();
            Cursor y = AbstractC2390u.y(c2384o.e(), new C2680a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (y.moveToNext()) {
                try {
                    b.add(Integer.valueOf(y.getInt(0)));
                } finally {
                }
            }
            ax.sb.t tVar = ax.sb.t.a;
            ax.Db.a.a(y, null);
            Set<Integer> a = C3121L.a(b);
            if (a.isEmpty()) {
                return a;
            }
            if (C2384o.this.d() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ax.o2.k d = C2384o.this.d();
            if (d == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d.I();
            return a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        
            if (r2.isEmpty() != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r0 = r4.q.f();
            r1 = r4.q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        
            r1 = r1.f().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
        
            if (r1.hasNext() == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
        
            ((ax.k2.C2384o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            r1 = ax.sb.t.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
        
            if (r0 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        
            if (r0 == null) goto L44;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.k2.C2384o.e.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2384o(AbstractC2390u abstractC2390u, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String str;
        ax.Gb.l.f(abstractC2390u, "database");
        ax.Gb.l.f(map, "shadowTablesMap");
        ax.Gb.l.f(map2, "viewTables");
        ax.Gb.l.f(strArr, "tableNames");
        this.a = abstractC2390u;
        this.b = map;
        this.c = map2;
        this.g = new AtomicBoolean(false);
        this.j = new b(strArr.length);
        this.k = new C2382m(abstractC2390u);
        this.l = new ax.w.b<>();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            ax.Gb.l.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            ax.Gb.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(lowerCase, Integer.valueOf(i));
            String str3 = this.b.get(strArr[i]);
            if (str3 != null) {
                ax.Gb.l.e(locale, "US");
                str = str3.toLowerCase(locale);
                ax.Gb.l.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            ax.Gb.l.e(locale2, "US");
            String lowerCase2 = value.toLowerCase(locale2);
            ax.Gb.l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(lowerCase2)) {
                String key = entry.getKey();
                ax.Gb.l.e(locale2, "US");
                String lowerCase3 = key.toLowerCase(locale2);
                ax.Gb.l.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.d;
                map3.put(lowerCase3, C3115F.h(map3, lowerCase2));
            }
        }
        this.p = new e();
    }

    private final String[] n(String[] strArr) {
        Set b2 = C3121L.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.c;
            Locale locale = Locale.US;
            ax.Gb.l.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            ax.Gb.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.c;
                ax.Gb.l.e(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                ax.Gb.l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                ax.Gb.l.c(set);
                b2.addAll(set);
            } else {
                b2.add(str);
            }
        }
        Object[] array = C3121L.a(b2).toArray(new String[0]);
        ax.Gb.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void q(ax.o2.g gVar, int i) {
        gVar.C("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            ax.Gb.l.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.C(str3);
        }
    }

    private final void r(ax.o2.g gVar, int i) {
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "DROP TRIGGER IF EXISTS " + q.b(str, str2);
            ax.Gb.l.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.C(str3);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void b(c cVar) {
        d l;
        ax.Gb.l.f(cVar, "observer");
        String[] n = n(cVar.a());
        ArrayList arrayList = new ArrayList(n.length);
        for (String str : n) {
            Map<String, Integer> map = this.d;
            Locale locale = Locale.US;
            ax.Gb.l.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            ax.Gb.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] U = C3139o.U(arrayList);
        d dVar = new d(cVar, U, n);
        synchronized (this.l) {
            l = this.l.l(cVar, dVar);
        }
        if (l == null && this.j.b(Arrays.copyOf(U, U.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.a.w()) {
            return false;
        }
        if (!this.h) {
            this.a.m().g0();
        }
        if (this.h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final ax.o2.k d() {
        return this.i;
    }

    public final AbstractC2390u e() {
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

    public final void i(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "database");
        synchronized (this.o) {
            if (this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.C("PRAGMA temp_store = MEMORY;");
            gVar.C("PRAGMA recursive_triggers='ON';");
            gVar.C("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(gVar);
            this.i = gVar.J("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
            ax.sb.t tVar = ax.sb.t.a;
        }
    }

    public final void j(String... strArr) {
        ax.Gb.l.f(strArr, "tables");
        synchronized (this.l) {
            try {
                Iterator<Map.Entry<K, V>> it = this.l.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ax.Gb.l.e(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(strArr);
                    }
                }
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.o) {
            this.h = false;
            this.j.d();
            ax.sb.t tVar = ax.sb.t.a;
        }
    }

    public void l() {
        if (this.g.compareAndSet(false, true)) {
            C2372c c2372c = this.f;
            if (c2372c != null) {
                c2372c.j();
            }
            this.a.n().execute(this.p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void m(c cVar) {
        d n;
        ax.Gb.l.f(cVar, "observer");
        synchronized (this.l) {
            n = this.l.n(cVar);
        }
        if (n != null) {
            b bVar = this.j;
            int[] a2 = n.a();
            if (bVar.c(Arrays.copyOf(a2, a2.length))) {
                s();
            }
        }
    }

    public final void o(C2372c c2372c) {
        ax.Gb.l.f(c2372c, "autoCloser");
        this.f = c2372c;
        c2372c.m(new Runnable() { // from class: ax.k2.n
            @Override // java.lang.Runnable
            public final void run() {
                C2384o.this.k();
            }
        });
    }

    public final void p(Context context, String str, Intent intent) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(str, "name");
        ax.Gb.l.f(intent, "serviceIntent");
        this.m = new C2387r(context, str, intent, this, this.a.n());
    }

    public final void s() {
        if (this.a.w()) {
            t(this.a.m().g0());
        }
    }

    public final void t(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "database");
        if (gVar.z0()) {
            return;
        }
        try {
            Lock k = this.a.k();
            k.lock();
            try {
                synchronized (this.n) {
                    int[] a2 = this.j.a();
                    if (a2 != null) {
                        q.a(gVar);
                        try {
                            int length = a2.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = a2[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    q(gVar, i2);
                                } else if (i3 == 2) {
                                    r(gVar, i2);
                                }
                                i++;
                                i2 = i4;
                            }
                            gVar.Y();
                            gVar.j0();
                            ax.sb.t tVar = ax.sb.t.a;
                        } catch (Throwable th) {
                            gVar.j0();
                            throw th;
                        }
                    }
                }
            } finally {
                k.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
