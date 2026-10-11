/*
 * Decompiled with CFR 0.152.
 */
package ax.m2;

import android.database.Cursor;
import ax.Db.a;
import ax.Gb.l;
import ax.m2.d;
import ax.o2.g;
import ax.tb.F;
import ax.tb.L;
import ax.tb.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class e {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Map<String, d.a> a(g g8, String object) {
        Throwable throwable2;
        block7: {
            Object object2;
            block6: {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("PRAGMA table_info(`");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("`)");
                g8 = g8.h0(((StringBuilder)object2).toString());
                try {
                    if (g8.getColumnCount() > 0) break block6;
                    object = F.g();
                }
                catch (Throwable throwable2) {}
                a.a(g8, null);
                return object;
            }
            int n8 = g8.getColumnIndex("name");
            int n9 = g8.getColumnIndex("type");
            int n10 = g8.getColumnIndex("notnull");
            int n11 = g8.getColumnIndex("pk");
            int n12 = g8.getColumnIndex("dflt_value");
            object2 = F.c();
            break block7;
            while (g8.moveToNext()) {
                String string = g8.getString(n8);
                String string2 = g8.getString(n9);
                boolean bl = g8.getInt(n10) != 0;
                int n13 = g8.getInt(n11);
                String string3 = g8.getString(n12);
                l.e(string, "name");
                l.e(string2, "type");
                object = new d.a(string, string2, bl, n13, string3, 2);
                object2.put(string, object);
            }
            object = F.b(object2);
            a.a(g8, null);
            return object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            a.a(g8, throwable2);
            throw throwable3;
        }
    }

    private static final List<d.d> b(Cursor cursor) {
        int n8 = cursor.getColumnIndex("id");
        int n9 = cursor.getColumnIndex("seq");
        int n10 = cursor.getColumnIndex("from");
        int n11 = cursor.getColumnIndex("to");
        List<d.d> list = o.c();
        while (cursor.moveToNext()) {
            int n12 = cursor.getInt(n8);
            int n13 = cursor.getInt(n9);
            String string = cursor.getString(n10);
            l.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(n11);
            l.e(string2, "cursor.getString(toColumnIndex)");
            list.add(new d.d(n12, n13, string, string2));
        }
        return o.Q(o.a(list));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Set<d.c> c(g var0, String var1_1) {
        block10: {
            block9: {
                block8: {
                    var9_3 = new StringBuilder();
                    var9_3.append("PRAGMA foreign_key_list(`");
                    var9_3.append((String)var1_1 /* !! */ );
                    var9_3.append("`)");
                    var0 = var0.h0(var9_3.toString());
                    try {
                        var6_5 = var0.getColumnIndex("id");
                        var3_6 = var0.getColumnIndex("seq");
                        var5_7 = var0.getColumnIndex("table");
                        var7_8 = var0.getColumnIndex("on_delete");
                        var4_9 = var0.getColumnIndex("on_update");
                        var1_1 /* !! */  = e.b((Cursor)var0);
                        var0.moveToPosition(-1);
                        var10_10 = L.b();
lbl19:
                        // 3 sources

                        while (var0.moveToNext()) {
                            if (var0.getInt(var3_6) != 0) continue;
                            var2_11 = var0.getInt(var6_5);
                            var9_3 = new ArrayList();
                            var11_13 = new ArrayList<String>();
                            var13_15 = var1_1 /* !! */ ;
                            var12_14 = new ArrayList();
                            var14_16 = var13_15.iterator();
                            while (var14_16.hasNext()) {
                                var13_15 = var14_16.next();
                                if (((d.d)var13_15).j() != var2_11) continue;
                                var12_14.add(var13_15);
                            }
                            break block8;
                        }
                        break block9;
                    }
                    catch (Throwable var1_2) {
                        break block10;
                    }
                }
                var8_12 = var12_14.size();
                for (var2_11 = 0; var2_11 < var8_12; ++var2_11) {
                    var13_15 = var12_14.get(var2_11);
                    var13_15 = (d.d)var13_15;
                    var9_3.add(var13_15.h());
                    var11_13.add(var13_15.l());
                }
                var15_17 = var0.getString(var5_7);
                l.e(var15_17, "cursor.getString(tableColumnIndex)");
                var13_15 = var0.getString(var7_8);
                l.e(var13_15, "cursor.getString(onDeleteColumnIndex)");
                var14_16 = var0.getString(var4_9);
                l.e(var14_16, "cursor.getString(onUpdateColumnIndex)");
                var12_14 = new d.c(var15_17, (String)var13_15, (String)var14_16, (List<String>)var9_3, var11_13);
                var10_10.add(var12_14);
                ** GOTO lbl19
            }
            var1_1 /* !! */  = L.a(var10_10);
            a.a(var0, null);
            return var1_1 /* !! */ ;
        }
        try {
            throw var1_2;
        }
        catch (Throwable var9_4) {
            a.a(var0, var1_2);
            throw var9_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final d.e d(g object, String string, boolean bl) {
        Object object2;
        TreeMap<Integer, String> treeMap;
        int n8;
        int n9;
        int n10;
        int n11;
        StringBuilder stringBuilder;
        block6: {
            Throwable throwable2;
            block7: {
                block5: {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("PRAGMA index_xinfo(`");
                    stringBuilder.append(string);
                    stringBuilder.append("`)");
                    stringBuilder = object.h0(stringBuilder.toString());
                    try {
                        n11 = stringBuilder.getColumnIndex("seqno");
                        n10 = stringBuilder.getColumnIndex("cid");
                        n9 = stringBuilder.getColumnIndex("name");
                        n8 = stringBuilder.getColumnIndex("desc");
                        if (n11 == -1 || n10 == -1 || n9 == -1 || n8 == -1) break block5;
                        treeMap = new TreeMap<Integer, String>();
                        object2 = new TreeMap();
                        break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                a.a((Closeable)((Object)stringBuilder), null);
                return null;
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                a.a((Closeable)((Object)stringBuilder), throwable2);
                throw throwable3;
            }
        }
        while (stringBuilder.moveToNext()) {
            if (stringBuilder.getInt(n10) < 0) continue;
            int n12 = stringBuilder.getInt(n11);
            String string2 = stringBuilder.getString(n9);
            object = stringBuilder.getInt(n8) > 0 ? "DESC" : "ASC";
            l.e(string2, "columnName");
            treeMap.put(n12, string2);
            object2.put(n12, object);
        }
        object = treeMap.values();
        l.e(object, "columnsMap.values");
        object = o.V((Iterable)object);
        object2 = ((TreeMap)object2).values();
        l.e(object2, "ordersMap.values");
        object = new d.e(string, bl, (List<String>)object, o.V((Iterable)object2));
        a.a((Closeable)((Object)stringBuilder), null);
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Set<d.e> e(g var0, String var1_2) {
        block11: {
            block7: {
                block10: {
                    block8: {
                        block9: {
                            var7_3 = new StringBuilder();
                            var7_3.append("PRAGMA index_list(`");
                            var7_3.append(var1_2);
                            var7_3.append("`)");
                            var1_2 = var0 /* !! */ .h0(var7_3.toString());
                            try {
                                var3_5 = var1_2.getColumnIndex("name");
                                var5_6 = var1_2.getColumnIndex("origin");
                                var4_7 = var1_2.getColumnIndex("unique");
                                if (var3_5 == -1 || var5_6 == -1 || var4_7 == -1) break block7;
                                var7_3 = L.b();
lbl15:
                                // 3 sources

                                while (var1_2.moveToNext()) {
                                    if (!l.a("c", var1_2.getString(var5_6))) continue;
                                    var8_10 = var1_2.getString(var3_5);
                                    var2_8 = var1_2.getInt(var4_7);
                                    var6_9 = true;
                                    if (var2_8 != 1) {
                                        var6_9 = false;
                                    }
                                    l.e(var8_10, "name");
                                    var8_10 = e.d((g)var0 /* !! */ , (String)var8_10, var6_9);
                                    if (var8_10 != null) break block8;
                                    break block9;
                                }
                                break block10;
                            }
                            catch (Throwable var7_4) {
                                break block11;
                            }
                        }
                        a.a((Closeable)var1_2, null);
                        return null;
                    }
                    var7_3.add(var8_10);
                    ** GOTO lbl15
                }
                var0 /* !! */  = L.a(var7_3);
                a.a((Closeable)var1_2, null);
                return var0 /* !! */ ;
            }
            a.a((Closeable)var1_2, null);
            return null;
        }
        try {
            throw var7_4;
        }
        catch (Throwable var0_1) {
            a.a((Closeable)var1_2, var7_4);
            throw var0_1;
        }
    }

    public static final d f(g g8, String string) {
        l.f(g8, "database");
        l.f(string, "tableName");
        return new d(string, e.a(g8, string), e.c(g8, string), e.e(g8, string));
    }
}

