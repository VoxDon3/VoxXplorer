package ax.x5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ax.ib.InterfaceC2296a;
import ax.n5.C2580b;
import ax.p5.i;
import ax.s5.C3048a;
import ax.s5.C3049b;
import ax.s5.C3050c;
import ax.s5.C3051d;
import ax.s5.C3052e;
import ax.t5.C3102a;
import ax.y5.C3506a;
import ax.y5.InterfaceC3507b;
import ax.z5.InterfaceC3550a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class M implements InterfaceC3444d, InterfaceC3507b, InterfaceC3443c, AutoCloseable {
    private static final C2580b g0 = C2580b.b("proto");
    private final InterfaceC3550a c0;
    private final InterfaceC3550a d0;
    private final AbstractC3445e e0;
    private final InterfaceC2296a<String> f0;
    private final W q;

    interface b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    M(InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, AbstractC3445e abstractC3445e, W w, InterfaceC2296a<String> interfaceC2296a) {
        this.q = w;
        this.c0 = interfaceC3550a;
        this.d0 = interfaceC3550a2;
        this.e0 = abstractC3445e;
        this.f0 = interfaceC2296a;
    }

    public static /* synthetic */ List A(SQLiteDatabase sQLiteDatabase) {
        return (List) r1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: ax.x5.J
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.g((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Integer A0(final M m, long j, SQLiteDatabase sQLiteDatabase) {
        m.getClass();
        String[] strArr = {String.valueOf(j)};
        r1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: ax.x5.r
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.o(M.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object C0(M m, List list, ax.p5.p pVar, Cursor cursor) {
        m.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            i.a o = ax.p5.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z) {
                o.h(new ax.p5.h(p1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o.h(new ax.p5.h(p1(cursor.getString(4)), m.n1(j)));
            }
            if (!cursor.isNull(6)) {
                o.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o.k(cursor.getBlob(11));
            }
            list.add(AbstractC3451k.a(j, pVar, o.d()));
        }
        return null;
    }

    public static /* synthetic */ Object D0(M m, SQLiteDatabase sQLiteDatabase) {
        m.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m.c0.a()).execute();
        return null;
    }

    public static /* synthetic */ C3048a F(M m, Map map, C3048a.C0450a c0450a, Cursor cursor) {
        m.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C3050c.b M0 = m.M0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C3050c.c().c(M0).b(j).a());
        }
        m.m1(c0450a, map);
        return c0450a.e(m.e1()).d(m.b1()).c(m.f0.get()).b();
    }

    public static /* synthetic */ C3048a F0(final M m, String str, final Map map, final C3048a.C0450a c0450a, SQLiteDatabase sQLiteDatabase) {
        m.getClass();
        return (C3048a) r1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: ax.x5.A
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.F(M.this, map, c0450a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long G0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Long L(M m, ax.p5.i iVar, ax.p5.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m.h1()) {
            m.d(1L, C3050c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long Y0 = m.Y0(sQLiteDatabase, pVar);
        int e = m.e0.e();
        byte[] a2 = iVar.e().a();
        boolean z = a2.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(Y0));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ ax.s5.f L0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (ax.s5.f) r1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: ax.x5.D
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.e(j, (Cursor) obj);
            }
        });
    }

    private C3050c.b M0(int i) {
        C3050c.b bVar = C3050c.b.REASON_UNKNOWN;
        if (i == bVar.g()) {
            return bVar;
        }
        C3050c.b bVar2 = C3050c.b.MESSAGE_TOO_OLD;
        if (i == bVar2.g()) {
            return bVar2;
        }
        C3050c.b bVar3 = C3050c.b.CACHE_FULL;
        if (i == bVar3.g()) {
            return bVar3;
        }
        C3050c.b bVar4 = C3050c.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.g()) {
            return bVar4;
        }
        C3050c.b bVar5 = C3050c.b.MAX_RETRIES_REACHED;
        if (i == bVar5.g()) {
            return bVar5;
        }
        C3050c.b bVar6 = C3050c.b.INVALID_PAYLOD;
        if (i == bVar6.g()) {
            return bVar6;
        }
        C3050c.b bVar7 = C3050c.b.SERVER_ERROR;
        if (i == bVar7.g()) {
            return bVar7;
        }
        C3102a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    private void T0(final SQLiteDatabase sQLiteDatabase) {
        o1(new d() { // from class: ax.x5.l
            @Override // ax.x5.M.d
            public final Object a() {
                return M.W(sQLiteDatabase);
            }
        }, new b() { // from class: ax.x5.w
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.o0((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ Object W(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private long Y0(SQLiteDatabase sQLiteDatabase, ax.p5.p pVar) {
        Long f1 = f1(sQLiteDatabase, pVar);
        if (f1 != null) {
            return f1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(ax.A5.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private C3049b b1() {
        return C3049b.b().b(C3052e.c().b(Z0()).c(AbstractC3445e.a.f()).a()).a();
    }

    private long c1() {
        return a1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Long d0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private long d1() {
        return a1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ ax.s5.f e(long j, Cursor cursor) {
        cursor.moveToNext();
        return ax.s5.f.c().c(cursor.getLong(0)).b(j).a();
    }

    private ax.s5.f e1() {
        final long a2 = this.c0.a();
        return (ax.s5.f) g1(new b() { // from class: ax.x5.C
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.L0(a2, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ List f(M m, ax.p5.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC3451k> j1 = m.j1(sQLiteDatabase, pVar, m.e0.d());
        for (ax.n5.e eVar : ax.n5.e.values()) {
            if (eVar != pVar.d()) {
                int d2 = m.e0.d() - j1.size();
                if (d2 <= 0) {
                    break;
                }
                j1.addAll(m.j1(sQLiteDatabase, pVar.f(eVar), d2));
            }
        }
        return m.i1(j1, m.k1(sQLiteDatabase, j1));
    }

    private Long f1(SQLiteDatabase sQLiteDatabase, ax.p5.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(ax.A5.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) r1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: ax.x5.x
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.d0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(ax.p5.p.a().b(cursor.getString(1)).d(ax.A5.a.b(cursor.getInt(2))).c(l1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private boolean h1() {
        return c1() * d1() >= this.e0.f();
    }

    private List<AbstractC3451k> i1(List<AbstractC3451k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC3451k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC3451k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a p = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    p.c(cVar.a, cVar.b);
                }
                listIterator.set(AbstractC3451k.a(next.c(), next.d(), p.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object j(M m, Cursor cursor) {
        m.getClass();
        while (cursor.moveToNext()) {
            m.d(cursor.getInt(0), C3050c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private List<AbstractC3451k> j1(SQLiteDatabase sQLiteDatabase, final ax.p5.p pVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long f1 = f1(sQLiteDatabase, pVar);
        if (f1 == null) {
            return arrayList;
        }
        r1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{f1.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: ax.x5.v
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.C0(M.this, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> k1(SQLiteDatabase sQLiteDatabase, List<AbstractC3451k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        r1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: ax.x5.z
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.u0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    private static byte[] l1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable th) {
        throw new C3506a("Timed out while trying to open db.", th);
    }

    private void m1(C3048a.C0450a c0450a, Map<String, List<C3050c>> map) {
        for (Map.Entry<String, List<C3050c>> entry : map.entrySet()) {
            c0450a.a(C3051d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] n1(long j) {
        return (byte[]) r1(a1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: ax.x5.B
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.v((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object o(M m, Cursor cursor) {
        m.getClass();
        while (cursor.moveToNext()) {
            m.d(cursor.getInt(0), C3050c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object o0(Throwable th) {
        throw new C3506a("Timed out while trying to acquire the lock.", th);
    }

    private <T> T o1(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.d0.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.d0.a() >= this.e0.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ Object p(final M m, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        r1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: ax.x5.u
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.j(M.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private static C2580b p1(String str) {
        return str == null ? g0 : C2580b.b(str);
    }

    public static /* synthetic */ Boolean q(M m, ax.p5.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long f1 = m.f1(sQLiteDatabase, pVar);
        return f1 == null ? Boolean.FALSE : (Boolean) r1(m.a1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{f1.toString()}), new b() { // from class: ax.x5.t
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private static String q1(Iterable<AbstractC3451k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC3451k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T r1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object s0(String str, C3050c.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) r1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())}), new b() { // from class: ax.x5.y
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.g()));
        contentValues.put("events_dropped_count", Long.valueOf(j));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object u(long j, ax.p5.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(ax.A5.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(ax.A5.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object u0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ byte[] v(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // ax.x5.InterfaceC3444d
    public AbstractC3451k E(final ax.p5.p pVar, final ax.p5.i iVar) {
        C3102a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long longValue = ((Long) g1(new b() { // from class: ax.x5.m
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.L(M.this, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC3451k.a(longValue, pVar, iVar);
    }

    @Override // ax.x5.InterfaceC3444d
    public long K0(ax.p5.p pVar) {
        return ((Long) r1(a1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(ax.A5.a.a(pVar.d()))}), new b() { // from class: ax.x5.H
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.G0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // ax.x5.InterfaceC3444d
    public void N0(Iterable<AbstractC3451k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + q1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            g1(new b() { // from class: ax.x5.K
                @Override // ax.x5.M.b
                public final Object apply(Object obj) {
                    return M.p(M.this, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // ax.x5.InterfaceC3444d
    public Iterable<ax.p5.p> Q() {
        return (Iterable) g1(new b() { // from class: ax.x5.G
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.A((SQLiteDatabase) obj);
            }
        });
    }

    @Override // ax.x5.InterfaceC3444d
    public void V(final ax.p5.p pVar, final long j) {
        g1(new b() { // from class: ax.x5.o
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.u(j, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    long Z0() {
        return c1() * d1();
    }

    @Override // ax.y5.InterfaceC3507b
    public <T> T a(InterfaceC3507b.a<T> aVar) {
        SQLiteDatabase a1 = a1();
        T0(a1);
        try {
            T execute = aVar.execute();
            a1.setTransactionSuccessful();
            return execute;
        } finally {
            a1.endTransaction();
        }
    }

    SQLiteDatabase a1() {
        final W w = this.q;
        Objects.requireNonNull(w);
        return (SQLiteDatabase) o1(new d() { // from class: ax.x5.E
            @Override // ax.x5.M.d
            public final Object a() {
                return W.this.getWritableDatabase();
            }
        }, new b() { // from class: ax.x5.F
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.m((Throwable) obj);
            }
        });
    }

    @Override // ax.x5.InterfaceC3443c
    public void b() {
        g1(new b() { // from class: ax.x5.p
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.D0(M.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // ax.x5.InterfaceC3443c
    public C3048a c() {
        final C3048a.C0450a e = C3048a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C3048a) g1(new b() { // from class: ax.x5.s
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.F0(M.this, str, hashMap, e, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q.close();
    }

    @Override // ax.x5.InterfaceC3443c
    public void d(final long j, final C3050c.b bVar, final String str) {
        g1(new b() { // from class: ax.x5.q
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.s0(str, bVar, j, (SQLiteDatabase) obj);
            }
        });
    }

    <T> T g1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase a1 = a1();
        a1.beginTransaction();
        try {
            T apply = bVar.apply(a1);
            a1.setTransactionSuccessful();
            return apply;
        } finally {
            a1.endTransaction();
        }
    }

    @Override // ax.x5.InterfaceC3444d
    public Iterable<AbstractC3451k> k0(final ax.p5.p pVar) {
        return (Iterable) g1(new b() { // from class: ax.x5.L
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.f(M.this, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // ax.x5.InterfaceC3444d
    public boolean s(final ax.p5.p pVar) {
        return ((Boolean) g1(new b() { // from class: ax.x5.n
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.q(M.this, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // ax.x5.InterfaceC3444d
    public int t() {
        final long a2 = this.c0.a() - this.e0.c();
        return ((Integer) g1(new b() { // from class: ax.x5.I
            @Override // ax.x5.M.b
            public final Object apply(Object obj) {
                return M.A0(M.this, a2, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // ax.x5.InterfaceC3444d
    public void w(Iterable<AbstractC3451k> iterable) {
        if (iterable.iterator().hasNext()) {
            a1().compileStatement("DELETE FROM events WHERE _id in " + q1(iterable)).execute();
        }
    }
}
