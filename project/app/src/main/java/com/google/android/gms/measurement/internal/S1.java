/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.measurement.internal.P1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.t;

final class S1
extends SQLiteOpenHelper {
    private final P1 q;

    S1(P1 p12, Context context, String string) {
        this.q = p12;
        super(context, string, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            ((f3)this.q).k().G().a("Opening the local database failed, dropping and recreating it");
            if (!((f3)this.q).a().getDatabasePath("google_app_measurement_local.db").delete()) {
                ((f3)this.q).k().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
                return sQLiteDatabase;
            }
            catch (SQLiteException sQLiteException2) {
                ((f3)this.q).k().G().b("Failed to open local database. Events will bypass local storage", (Object)sQLiteException2);
                return null;
            }
        }
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
            throw sQLiteDatabaseLockedException;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        t.b(((f3)this.q).k(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        t.c(((f3)this.q).k(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
    }
}

