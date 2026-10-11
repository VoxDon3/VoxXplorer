package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import ax.b6.C1595k0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3740t {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    static void b(V1 v1, SQLiteDatabase sQLiteDatabase) {
        if (v1 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(C1595k0.a().h(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            v1.L().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            v1.L().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            v1.L().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        v1.L().a("Failed to turn on database write permission for owner");
    }

    static void c(V1 v1, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (v1 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(v1, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> a = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!a.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!a.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (a.isEmpty()) {
                return;
            }
            v1.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        } catch (SQLiteException e) {
            v1.G().b("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static boolean d(V1 v1, SQLiteDatabase sQLiteDatabase, String str) {
        if (v1 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                v1.L().c("Error querying for table", str, e);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } finally {
        }
    }
}
