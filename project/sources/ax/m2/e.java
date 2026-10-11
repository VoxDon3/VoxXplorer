package ax.m2;

import android.database.Cursor;
import ax.Gb.l;
import ax.m2.d;
import ax.o2.g;
import ax.tb.C3115F;
import ax.tb.C3121L;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {
    private static final Map<String, d.a> a(g gVar, String str) {
        Cursor h0 = gVar.h0("PRAGMA table_info(`" + str + "`)");
        try {
            if (h0.getColumnCount() <= 0) {
                Map<String, d.a> g = C3115F.g();
                ax.Db.a.a(h0, null);
                return g;
            }
            int columnIndex = h0.getColumnIndex("name");
            int columnIndex2 = h0.getColumnIndex("type");
            int columnIndex3 = h0.getColumnIndex("notnull");
            int columnIndex4 = h0.getColumnIndex("pk");
            int columnIndex5 = h0.getColumnIndex("dflt_value");
            Map c = C3115F.c();
            while (h0.moveToNext()) {
                String string = h0.getString(columnIndex);
                String string2 = h0.getString(columnIndex2);
                boolean z = h0.getInt(columnIndex3) != 0;
                int i = h0.getInt(columnIndex4);
                String string3 = h0.getString(columnIndex5);
                l.e(string, "name");
                l.e(string2, "type");
                c.put(string, new d.a(string, string2, z, i, string3, 2));
            }
            Map<String, d.a> b = C3115F.b(c);
            ax.Db.a.a(h0, null);
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ax.Db.a.a(h0, th);
                throw th2;
            }
        }
    }

    private static final List<d.C0371d> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c = C3139o.c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l.e(string2, "cursor.getString(toColumnIndex)");
            c.add(new d.C0371d(i, i2, string, string2));
        }
        return C3139o.Q(C3139o.a(c));
    }

    private static final Set<d.c> c(g gVar, String str) {
        Cursor h0 = gVar.h0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = h0.getColumnIndex("id");
            int columnIndex2 = h0.getColumnIndex("seq");
            int columnIndex3 = h0.getColumnIndex("table");
            int columnIndex4 = h0.getColumnIndex("on_delete");
            int columnIndex5 = h0.getColumnIndex("on_update");
            List<d.C0371d> b = b(h0);
            h0.moveToPosition(-1);
            Set b2 = C3121L.b();
            while (h0.moveToNext()) {
                if (h0.getInt(columnIndex2) == 0) {
                    int i = h0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : b) {
                        if (((d.C0371d) obj).j() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        d.C0371d c0371d = (d.C0371d) obj2;
                        arrayList.add(c0371d.h());
                        arrayList2.add(c0371d.l());
                    }
                    String string = h0.getString(columnIndex3);
                    l.e(string, "cursor.getString(tableColumnIndex)");
                    String string2 = h0.getString(columnIndex4);
                    l.e(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = h0.getString(columnIndex5);
                    l.e(string3, "cursor.getString(onUpdateColumnIndex)");
                    b2.add(new d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<d.c> a = C3121L.a(b2);
            ax.Db.a.a(h0, null);
            return a;
        } finally {
        }
    }

    private static final d.e d(g gVar, String str, boolean z) {
        Cursor h0 = gVar.h0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = h0.getColumnIndex("seqno");
            int columnIndex2 = h0.getColumnIndex("cid");
            int columnIndex3 = h0.getColumnIndex("name");
            int columnIndex4 = h0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (h0.moveToNext()) {
                    if (h0.getInt(columnIndex2) >= 0) {
                        int i = h0.getInt(columnIndex);
                        String string = h0.getString(columnIndex3);
                        String str2 = h0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        l.e(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                l.e(values, "columnsMap.values");
                List V = C3139o.V(values);
                Collection values2 = treeMap2.values();
                l.e(values2, "ordersMap.values");
                d.e eVar = new d.e(str, z, V, C3139o.V(values2));
                ax.Db.a.a(h0, null);
                return eVar;
            }
            ax.Db.a.a(h0, null);
            return null;
        } finally {
        }
    }

    private static final Set<d.e> e(g gVar, String str) {
        Cursor h0 = gVar.h0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = h0.getColumnIndex("name");
            int columnIndex2 = h0.getColumnIndex("origin");
            int columnIndex3 = h0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set b = C3121L.b();
                while (h0.moveToNext()) {
                    if (l.a("c", h0.getString(columnIndex2))) {
                        String string = h0.getString(columnIndex);
                        boolean z = true;
                        if (h0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        l.e(string, "name");
                        d.e d = d(gVar, string, z);
                        if (d == null) {
                            ax.Db.a.a(h0, null);
                            return null;
                        }
                        b.add(d);
                    }
                }
                Set<d.e> a = C3121L.a(b);
                ax.Db.a.a(h0, null);
                return a;
            }
            ax.Db.a.a(h0, null);
            return null;
        } finally {
        }
    }

    public static final d f(g gVar, String str) {
        l.f(gVar, "database");
        l.f(str, "tableName");
        return new d(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
