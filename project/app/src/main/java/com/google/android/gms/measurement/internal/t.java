/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import ax.b6.k0;
import com.google.android.gms.measurement.internal.V1;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class t {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String string) {
        HashSet<String> hashSet = new HashSet<String>();
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(string);
        stringBuilder.append(" LIMIT 0");
        sQLiteDatabase = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            Collections.addAll(hashSet, sQLiteDatabase.getColumnNames());
            return hashSet;
        }
        finally {
            sQLiteDatabase.close();
        }
    }

    static void b(V1 v12, SQLiteDatabase object) {
        if (v12 != null) {
            object = new File(k0.a().h(object.getPath()));
            if (!((File)object).setReadable(false, false)) {
                v12.L().a("Failed to turn off database read permission");
            }
            if (!((File)object).setWritable(false, false)) {
                v12.L().a("Failed to turn off database write permission");
            }
            if (!((File)object).setReadable(true, true)) {
                v12.L().a("Failed to turn on database read permission for owner");
            }
            if (!((File)object).setWritable(true, true)) {
                v12.L().a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(V1 v12, SQLiteDatabase object, String string, String object2, String object3, String[] stringArray) throws SQLiteException {
        if (v12 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!t.d(v12, (SQLiteDatabase)object, string)) {
            object.execSQL((String)object2);
        }
        try {
            int n8;
            Set<String> set = t.a((SQLiteDatabase)object, string);
            object3 = object3.split(",");
            int n9 = ((Object)object3).length;
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                object2 = object3[n8];
                if (set.remove(object2)) {
                    continue;
                }
                object = new StringBuilder("Table ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" is missing required column: ");
                ((StringBuilder)object).append((String)object2);
                object3 = new SQLiteException(((StringBuilder)object).toString());
                throw object3;
            }
            if (stringArray != null) {
                for (n8 = n10; n8 < stringArray.length; n8 += 2) {
                    if (set.remove(stringArray[n8])) continue;
                    object.execSQL(stringArray[n8 + 1]);
                }
            }
            if (!set.isEmpty()) {
                v12.L().c("Table has extra columns. table, columns", string, TextUtils.join((CharSequence)", ", set));
            }
            return;
        }
        catch (SQLiteException sQLiteException) {}
        v12.G().b("Failed to verify columns on table that was just created", string);
        throw sQLiteException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean d(V1 v12, SQLiteDatabase sQLiteDatabase, String string) {
        Throwable throwable2222222;
        SQLiteDatabase sQLiteDatabase2;
        block6: {
            if (v12 == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            SQLiteDatabase sQLiteDatabase3 = null;
            sQLiteDatabase2 = null;
            sQLiteDatabase2 = sQLiteDatabase = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{string}, null, null, null);
            sQLiteDatabase3 = sQLiteDatabase;
            boolean bl = sQLiteDatabase.moveToFirst();
            {
                block7: {
                    catch (Throwable throwable2222222) {
                        break block6;
                    }
                    catch (SQLiteException sQLiteException) {}
                    sQLiteDatabase2 = sQLiteDatabase3;
                    {
                        v12.L().c("Error querying for table", string, (Object)sQLiteException);
                        if (sQLiteDatabase3 == null) break block7;
                    }
                    sQLiteDatabase3.close();
                }
                return false;
            }
            sQLiteDatabase.close();
            return bl;
        }
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.close();
        }
        throw throwable2222222;
    }
}

