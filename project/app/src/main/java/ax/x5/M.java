/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ax.p5.h;
import ax.p5.i;
import ax.s5.a;
import ax.s5.c;
import ax.s5.f;
import ax.x5.A;
import ax.x5.B;
import ax.x5.C;
import ax.x5.D;
import ax.x5.E;
import ax.x5.F;
import ax.x5.G;
import ax.x5.H;
import ax.x5.I;
import ax.x5.J;
import ax.x5.K;
import ax.x5.L;
import ax.x5.W;
import ax.x5.e;
import ax.x5.k;
import ax.x5.l;
import ax.x5.m;
import ax.x5.n;
import ax.x5.o;
import ax.x5.p;
import ax.x5.q;
import ax.x5.r;
import ax.x5.s;
import ax.x5.t;
import ax.x5.u;
import ax.x5.v;
import ax.x5.w;
import ax.x5.x;
import ax.x5.y;
import ax.x5.z;
import ax.y5.a;
import ax.y5.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class M
implements ax.x5.d,
ax.y5.b,
ax.x5.c,
AutoCloseable {
    private static final ax.n5.b g0 = ax.n5.b.b("proto");
    private final ax.z5.a c0;
    private final ax.z5.a d0;
    private final e e0;
    private final ax.ib.a<String> f0;
    private final W q;

    M(ax.z5.a a8, ax.z5.a a9, e e8, W w8, ax.ib.a<String> a10) {
        this.q = w8;
        this.c0 = a8;
        this.d0 = a9;
        this.e0 = e8;
        this.f0 = a10;
    }

    public static /* synthetic */ List A(SQLiteDatabase sQLiteDatabase) {
        return (List)M.r1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new J());
    }

    public static /* synthetic */ Integer A0(M m8, long l8, SQLiteDatabase sQLiteDatabase) {
        m8.getClass();
        String[] stringArray = new String[]{String.valueOf(l8)};
        M.r1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", stringArray), new r(m8));
        return sQLiteDatabase.delete("events", "timestamp_ms < ?", stringArray);
    }

    public static /* synthetic */ Object C0(M m8, List list, ax.p5.p p8, Cursor cursor) {
        m8.getClass();
        while (cursor.moveToNext()) {
            boolean bl = false;
            long l8 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                bl = true;
            }
            i.a a8 = i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (bl) {
                a8.h(new h(M.p1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                a8.h(new h(M.p1(cursor.getString(4)), m8.n1(l8)));
            }
            if (!cursor.isNull(6)) {
                a8.g(cursor.getInt(6));
            }
            if (!cursor.isNull(8)) {
                a8.l(cursor.getInt(8));
            }
            if (!cursor.isNull(9)) {
                a8.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                a8.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                a8.k(cursor.getBlob(11));
            }
            list.add(k.a(l8, p8, a8.d()));
        }
        return null;
    }

    public static /* synthetic */ Object D0(M m8, SQLiteDatabase sQLiteDatabase) {
        m8.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE global_log_event_state SET last_metrics_upload_ms=");
        stringBuilder.append(m8.c0.a());
        sQLiteDatabase.compileStatement(stringBuilder.toString()).execute();
        return null;
    }

    public static /* synthetic */ ax.s5.a F(M m8, Map map, a.a a8, Cursor cursor) {
        m8.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b b8 = m8.M0(cursor.getInt(1));
            long l8 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List)map.get(string)).add(ax.s5.c.c().c(b8).b(l8).a());
        }
        m8.m1(a8, map);
        return a8.e(m8.e1()).d(m8.b1()).c(m8.f0.get()).b();
    }

    public static /* synthetic */ ax.s5.a F0(M m8, String string, Map map, a.a a8, SQLiteDatabase sQLiteDatabase) {
        m8.getClass();
        return (ax.s5.a)M.r1(sQLiteDatabase.rawQuery(string, new String[0]), new A(m8, map, a8));
    }

    public static /* synthetic */ Long G0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return cursor.getLong(0);
        }
        return 0L;
    }

    public static /* synthetic */ Boolean H(Cursor cursor) {
        boolean bl = cursor.getCount() > 0;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Long L(M object2, i i8, ax.p5.p iterator, SQLiteDatabase sQLiteDatabase) {
        Object var0_3;
        Object object;
        SQLiteDatabase var3_10;
        ContentValues contentValues;
        if (super.h1()) {
            ((M)object2).d(1L, c.b.e0, contentValues.n());
            return -1L;
        }
        long l8 = super.Y0((SQLiteDatabase)var3_10, (ax.p5.p)object);
        int n8 = ((M)object2).e0.e();
        object = contentValues.e().a();
        int n9 = ((byte[])object).length;
        int n10 = 1;
        boolean bl = n9 <= n8;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(l8));
        contentValues2.put("transport_name", contentValues.n());
        contentValues2.put("timestamp_ms", Long.valueOf(contentValues.f()));
        contentValues2.put("uptime_ms", Long.valueOf(contentValues.o()));
        contentValues2.put("payload_encoding", contentValues.e().b().a());
        contentValues2.put("code", contentValues.d());
        contentValues2.put("num_attempts", Integer.valueOf(0));
        contentValues2.put("inline", Boolean.valueOf(bl));
        if (bl) {
            byte[] byArray = object;
        } else {
            byte[] byArray = new byte[]{};
        }
        contentValues2.put("payload", (byte[])var0_3);
        contentValues2.put("product_id", contentValues.l());
        contentValues2.put("pseudonymous_id", contentValues.m());
        contentValues2.put("experiment_ids_clear_blob", contentValues.g());
        contentValues2.put("experiment_ids_encrypted_blob", contentValues.h());
        l8 = var3_10.insert("events", null, contentValues2);
        if (!bl) {
            n9 = (int)Math.ceil((double)((byte[])object).length / (double)n8);
            while (n10 <= n9) {
                byte[] byArray = Arrays.copyOfRange((byte[])object, (n10 - 1) * n8, Math.min(n10 * n8, ((Object)object).length));
                contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(l8));
                contentValues2.put("sequence_num", Integer.valueOf(n10));
                contentValues2.put("bytes", byArray);
                var3_10.insert("event_payloads", null, contentValues2);
                ++n10;
            }
        }
        object = contentValues.k().entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            contentValues = new ContentValues();
            contentValues.put("event_id", Long.valueOf(l8));
            contentValues.put("name", (String)entry.getKey());
            contentValues.put("value", (String)entry.getValue());
            var3_10.insert("event_metadata", null, contentValues);
        }
        return l8;
    }

    public static /* synthetic */ f L0(long l8, SQLiteDatabase sQLiteDatabase) {
        return (f)M.r1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new D(l8));
    }

    private c.b M0(int n8) {
        c.b b8 = c.b.c0;
        if (n8 == b8.g()) {
            return b8;
        }
        c.b b9 = c.b.d0;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.e0;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.f0;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.g0;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.h0;
        if (n8 == b9.g()) {
            return b9;
        }
        b9 = c.b.i0;
        if (n8 == b9.g()) {
            return b9;
        }
        ax.t5.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", n8);
        return b8;
    }

    private void T0(SQLiteDatabase sQLiteDatabase) {
        this.o1(new l(sQLiteDatabase), new w());
    }

    public static /* synthetic */ Object W(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private long Y0(SQLiteDatabase sQLiteDatabase, ax.p5.p p8) {
        Long l8 = this.f1(sQLiteDatabase, p8);
        if (l8 != null) {
            return l8;
        }
        l8 = new ContentValues();
        l8.put("backend_name", p8.b());
        l8.put("priority", ax.A5.a.a(p8.d()));
        l8.put("next_request_ms", 0);
        if (p8.c() != null) {
            l8.put("extras", Base64.encodeToString((byte[])p8.c(), (int)0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, (ContentValues)l8);
    }

    private ax.s5.b b1() {
        return ax.s5.b.b().b(ax.s5.e.c().b(this.Z0()).c(e.a.f()).a()).a();
    }

    private long c1() {
        return this.a1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Long d0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return cursor.getLong(0);
    }

    private long d1() {
        return this.a1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ f e(long l8, Cursor cursor) {
        cursor.moveToNext();
        long l9 = cursor.getLong(0);
        return f.c().c(l9).b(l8).a();
    }

    private f e1() {
        return (f)this.g1(new C(this.c0.a()));
    }

    public static /* synthetic */ List f(M m8, ax.p5.p p8, SQLiteDatabase sQLiteDatabase) {
        List<k> list = m8.j1(sQLiteDatabase, p8, m8.e0.d());
        for (ax.n5.e e8 : ax.n5.e.values()) {
            if (e8 == p8.d()) continue;
            int n8 = m8.e0.d() - list.size();
            if (n8 <= 0) break;
            list.addAll(m8.j1(sQLiteDatabase, p8.f(e8), n8));
        }
        return m8.i1(list, m8.k1(sQLiteDatabase, list));
    }

    private Long f1(SQLiteDatabase sQLiteDatabase, ax.p5.p object) {
        StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
        String[] stringArray = new ArrayList(Arrays.asList(((ax.p5.p)object).b(), String.valueOf(ax.A5.a.a(((ax.p5.p)object).d()))));
        if (((ax.p5.p)object).c() != null) {
            stringBuilder.append(" and extras = ?");
            stringArray.add((String)Base64.encodeToString((byte[])((ax.p5.p)object).c(), (int)0));
        } else {
            stringBuilder.append(" and extras is null");
        }
        object = stringBuilder.toString();
        stringArray = stringArray.toArray(new String[0]);
        return (Long)M.r1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, (String)object, stringArray, null, null, null), new x());
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList<ax.p5.p> arrayList = new ArrayList<ax.p5.p>();
        while (cursor.moveToNext()) {
            arrayList.add(ax.p5.p.a().b(cursor.getString(1)).d(ax.A5.a.b(cursor.getInt(2))).c(M.l1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private boolean h1() {
        return this.c1() * this.d1() >= this.e0.f();
    }

    private List<k> i1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k k8 = listIterator.next();
            if (!map.containsKey(k8.c())) continue;
            i.a a8 = k8.b().p();
            for (c c8 : map.get(k8.c())) {
                a8.c(c8.a, c8.b);
            }
            listIterator.set(k.a(k8.c(), k8.d(), a8.d()));
        }
        return list;
    }

    public static /* synthetic */ Object j(M m8, Cursor cursor) {
        m8.getClass();
        while (cursor.moveToNext()) {
            int n8 = cursor.getInt(0);
            String string = cursor.getString(1);
            m8.d(n8, c.b.g0, string);
        }
        return null;
    }

    private List<k> j1(SQLiteDatabase sQLiteDatabase, ax.p5.p p8, int n8) {
        ArrayList<k> arrayList = new ArrayList<k>();
        Object object = this.f1(sQLiteDatabase, p8);
        if (object == null) {
            return arrayList;
        }
        object = ((Long)object).toString();
        M.r1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{object}, null, null, null, String.valueOf(n8)), new v(this, arrayList, p8));
        return arrayList;
    }

    private Map<Long, Set<c>> k1(SQLiteDatabase sQLiteDatabase, List<k> object) {
        HashMap<Long, Set<c>> hashMap = new HashMap<Long, Set<c>>();
        StringBuilder stringBuilder = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < object.size(); ++i8) {
            stringBuilder.append(object.get(i8).c());
            if (i8 >= object.size() - 1) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        object = stringBuilder.toString();
        M.r1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, (String)object, null, null, null, null), new z(hashMap));
        return hashMap;
    }

    private static byte[] l1(String string) {
        if (string == null) {
            return null;
        }
        return Base64.decode((String)string, (int)0);
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable throwable) {
        throw new a("Timed out while trying to open db.", throwable);
    }

    private void m1(a.a a8, Map<String, List<ax.s5.c>> object) {
        for (Map.Entry entry : object.entrySet()) {
            a8.a(ax.s5.d.c().c((String)entry.getKey()).b((List)entry.getValue()).a());
        }
    }

    private byte[] n1(long l8) {
        return (byte[])M.r1(this.a1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(l8)}, null, null, "sequence_num"), new B());
    }

    public static /* synthetic */ Object o(M m8, Cursor cursor) {
        m8.getClass();
        while (cursor.moveToNext()) {
            int n8 = cursor.getInt(0);
            String string = cursor.getString(1);
            m8.d(n8, c.b.d0, string);
        }
        return null;
    }

    public static /* synthetic */ Object o0(Throwable throwable) {
        throw new a("Timed out while trying to acquire the lock.", throwable);
    }

    private <T> T o1(d<T> d8, b<Throwable, T> b8) {
        long l8 = this.d0.a();
        while (true) {
            T t8;
            try {
                t8 = d8.a();
            }
            catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                if (this.d0.a() >= (long)this.e0.b() + l8) {
                    return b8.apply(sQLiteDatabaseLockedException);
                }
                SystemClock.sleep((long)50L);
                continue;
            }
            return t8;
        }
    }

    public static /* synthetic */ Object p(M m8, String string, String string2, SQLiteDatabase sQLiteDatabase) {
        m8.getClass();
        sQLiteDatabase.compileStatement(string).execute();
        M.r1(sQLiteDatabase.rawQuery(string2, null), new u(m8));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private static ax.n5.b p1(String string) {
        if (string == null) {
            return g0;
        }
        return ax.n5.b.b(string);
    }

    public static /* synthetic */ Boolean q(M m8, ax.p5.p object, SQLiteDatabase sQLiteDatabase) {
        if ((object = m8.f1(sQLiteDatabase, (ax.p5.p)object)) == null) {
            return Boolean.FALSE;
        }
        return (Boolean)M.r1(m8.a1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{((Long)object).toString()}), new t());
    }

    private static String q1(Iterable<k> object) {
        StringBuilder stringBuilder = new StringBuilder("(");
        object = object.iterator();
        while (object.hasNext()) {
            stringBuilder.append(((k)object.next()).c());
            if (!object.hasNext()) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static <T> T r1(Cursor cursor, b<Cursor, T> b8) {
        try {
            b8 = b8.apply(cursor);
            return (T)b8;
        }
        finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object s0(String string, c.b b8, long l8, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean)M.r1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{string, Integer.toString(b8.g())}), new y())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", string);
            contentValues.put("reason", Integer.valueOf(b8.g()));
            contentValues.put("events_dropped_count", Long.valueOf(l8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
        stringBuilder.append(l8);
        stringBuilder.append(" WHERE log_source = ? AND reason = ?");
        sQLiteDatabase.execSQL(stringBuilder.toString(), (Object[])new String[]{string, Integer.toString(b8.g())});
        return null;
    }

    public static /* synthetic */ Object u(long l8, ax.p5.p p8, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(l8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{p8.b(), String.valueOf(ax.A5.a.a(p8.d()))}) < 1) {
            contentValues.put("backend_name", p8.b());
            contentValues.put("priority", Integer.valueOf(ax.A5.a.a(p8.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object u0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            HashSet<c> hashSet;
            long l8 = cursor.getLong(0);
            HashSet<c> hashSet2 = hashSet = (HashSet<c>)map.get(l8);
            if (hashSet == null) {
                hashSet2 = new HashSet<c>();
                map.put(l8, hashSet2);
            }
            hashSet2.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ byte[] v(Cursor object) {
        byte[] byArray;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n8 = 0;
        while (object.moveToNext()) {
            byArray = object.getBlob(0);
            arrayList.add(byArray);
            n8 += byArray.length;
        }
        byArray = new byte[n8];
        n8 = 0;
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            object = (byte[])arrayList.get(i8);
            System.arraycopy(object, 0, byArray, n8, ((Cursor)object).length);
            n8 += ((Cursor)object).length;
        }
        return byArray;
    }

    @Override
    public k E(ax.p5.p p8, i i8) {
        ax.t5.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[]{p8.d(), i8.n(), p8.b()});
        long l8 = (Long)this.g1(new m(this, i8, p8));
        if (l8 < 1L) {
            return null;
        }
        return k.a(l8, p8, i8);
    }

    @Override
    public long K0(ax.p5.p p8) {
        return (Long)M.r1(this.a1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{p8.b(), String.valueOf(ax.A5.a.a(p8.d()))}), new H());
    }

    @Override
    public void N0(Iterable<k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        stringBuilder.append(M.q1(iterable));
        this.g1(new K(this, stringBuilder.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
    }

    @Override
    public Iterable<ax.p5.p> Q() {
        return (Iterable)this.g1(new G());
    }

    @Override
    public void V(ax.p5.p p8, long l8) {
        this.g1(new o(l8, p8));
    }

    long Z0() {
        return this.c1() * this.d1();
    }

    @Override
    public <T> T a(b.a<T> a8) {
        SQLiteDatabase sQLiteDatabase = this.a1();
        this.T0(sQLiteDatabase);
        try {
            a8 = a8.execute();
            sQLiteDatabase.setTransactionSuccessful();
            return (T)a8;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    SQLiteDatabase a1() {
        W w8 = this.q;
        j.Objects.requireNonNull((Object)((Object)w8));
        return (SQLiteDatabase)this.o1(new E(w8), new F());
    }

    @Override
    public void b() {
        this.g1(new p(this));
    }

    @Override
    public ax.s5.a c() {
        a.a a8 = ax.s5.a.e();
        return (ax.s5.a)this.g1(new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), a8));
    }

    @Override
    public void close() {
        this.q.close();
    }

    @Override
    public void d(long l8, c.b b8, String string) {
        this.g1(new q(string, b8, l8));
    }

    <T> T g1(b<SQLiteDatabase, T> b8) {
        SQLiteDatabase sQLiteDatabase = this.a1();
        sQLiteDatabase.beginTransaction();
        try {
            b8 = b8.apply(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return (T)b8;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override
    public Iterable<k> k0(ax.p5.p p8) {
        return (Iterable)this.g1(new L(this, p8));
    }

    @Override
    public boolean s(ax.p5.p p8) {
        return (Boolean)this.g1(new n(this, p8));
    }

    @Override
    public int t() {
        return (Integer)this.g1(new I(this, this.c0.a() - this.e0.c()));
    }

    @Override
    public void w(Iterable<k> object) {
        if (!object.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM events WHERE _id in ");
        stringBuilder.append(M.q1(object));
        object = stringBuilder.toString();
        this.a1().compileStatement((String)object).execute();
    }

    static interface b<T, U> {
        public U apply(T var1);
    }

    private static class c {
        final String a;
        final String b;

        private c(String string, String string2) {
            this.a = string;
            this.b = string2;
        }
    }

    static interface d<T> {
        public T a();
    }
}

