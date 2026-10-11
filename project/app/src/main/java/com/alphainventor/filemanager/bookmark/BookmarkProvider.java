/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.bookmark;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.provider.BaseColumns;
import ax.Ha.b;
import ax.Ha.c;

public class BookmarkProvider
extends ContentProvider
implements BaseColumns {
    public static final Uri b;
    public static final String[] c;
    private static final String d;
    private static final UriMatcher e;
    private a a;

    static {
        UriMatcher uriMatcher;
        b = Uri.parse((String)"content://com.voxdon.xplorer.bookmark");
        c = new String[]{"_id", "type", "display_name", "location_name", "location_key", "path", "file_id", "is_directory", "timestamp"};
        d = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s TEXT, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT, %s TEXT, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL)", "bookmarks", "_id", "type", "display_name", "location_name", "location_key", "path", "file_id", "is_directory", "timestamp");
        e = uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.voxdon.xplorer.bookmark", "", 1000);
        uriMatcher.addURI("com.voxdon.xplorer.bookmark", "/#", 2000);
    }

    private SQLiteDatabase b() {
        return this.a.getWritableDatabase();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int delete(Uri uri, String charSequence, String[] stringArray) {
        Throwable var1_4;
        int n8;
        block7: {
            int n9;
            int n10;
            block6: {
                int n11;
                SQLiteDatabase sQLiteDatabase;
                block5: {
                    sQLiteDatabase = this.b();
                    n11 = 0;
                    n9 = n10 = 0;
                    n8 = n11;
                    try {
                        int n12 = e.match(uri);
                        if (n12 == 2000) break block5;
                        n9 = n10;
                        n8 = n11;
                        n8 = n10 = sQLiteDatabase.delete("bookmarks", (String)charSequence, stringArray);
                        break block6;
                    }
                    catch (SecurityException securityException) {
                        n8 = n9;
                        break block7;
                    }
                    catch (SQLiteException sQLiteException) {
                        break block7;
                    }
                }
                n9 = n10;
                n8 = n11;
                String string = uri.getLastPathSegment();
                if (charSequence == null) {
                    n9 = n10;
                    n8 = n11;
                    n9 = n10;
                    n8 = n11;
                    charSequence = new StringBuilder();
                    n9 = n10;
                    n8 = n11;
                    ((StringBuilder)charSequence).append("_id=");
                    n9 = n10;
                    n8 = n11;
                    ((StringBuilder)charSequence).append(string);
                    n9 = n10;
                    n8 = n11;
                    n8 = n10 = sQLiteDatabase.delete("bookmarks", ((StringBuilder)charSequence).toString(), null);
                } else {
                    n9 = n10;
                    n8 = n11;
                    n9 = n10;
                    n8 = n11;
                    StringBuilder stringBuilder = new StringBuilder();
                    n9 = n10;
                    n8 = n11;
                    stringBuilder.append("_id=");
                    n9 = n10;
                    n8 = n11;
                    stringBuilder.append(string);
                    n9 = n10;
                    n8 = n11;
                    stringBuilder.append(" and (");
                    n9 = n10;
                    n8 = n11;
                    stringBuilder.append((String)charSequence);
                    n9 = n10;
                    n8 = n11;
                    stringBuilder.append(")");
                    n9 = n10;
                    n8 = n11;
                    n8 = n10 = sQLiteDatabase.delete("bookmarks", stringBuilder.toString(), stringArray);
                }
            }
            n10 = n8;
            n9 = n10;
            n8 = n10;
            this.getContext().getContentResolver().notifyChange(uri, null);
            return n10;
        }
        var1_4.printStackTrace();
        ax.Ha.c.h().d("BP").l((Throwable)var1_4).h();
        return n8;
    }

    public String getType(Uri uri) {
        int n8 = e.match(uri);
        if (n8 != 1000) {
            if (n8 == 2000) {
                return "vnd.android.cursor.item/bookmark";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown URI: ");
            stringBuilder.append(uri);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return "vnd.android.cursor.dir/bookmarks";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase = this.b();
        long l8 = sQLiteDatabase.insert("bookmarks", "", contentValues);
        if (l8 > 0L) {
            uri = ContentUris.withAppendedId((Uri)b, (long)l8);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("bookmarks");
            if (contentValues.getAsInteger("type") != 2 && contentValues.getAsInteger("type") == 3) {
                contentValues = sQLiteQueryBuilder.query(sQLiteDatabase, new String[]{"_id"}, "type = 3", null, null, null, "timestamp asc");
                if (contentValues != null && contentValues.getCount() > 200 && contentValues.moveToFirst()) {
                    sQLiteDatabase.delete("bookmarks", "_id=?", new String[]{Integer.toString(contentValues.getInt(0))});
                }
                contentValues.close();
            }
            this.getContext().getContentResolver().notifyChange(uri, null);
            return uri;
        }
        return null;
    }

    public boolean onCreate() {
        this.a = new a(this.getContext());
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Cursor query(Uri uri, String[] cursor, String string, String[] stringArray, String string2) {
        SQLiteDatabase sQLiteDatabase = this.b();
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("bookmarks");
        if (e.match(uri) == 2000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("_id=");
            stringBuilder.append(uri.getLastPathSegment());
            sQLiteQueryBuilder.appendWhere((CharSequence)stringBuilder.toString());
        }
        cursor = sQLiteQueryBuilder.query(sQLiteDatabase, (String[])cursor, string, stringArray, null, null, string2);
        try {
            cursor.setNotificationUri(this.getContext().getContentResolver(), uri);
            return cursor;
        }
        catch (SecurityException securityException) {
            return cursor;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String charSequence, String[] stringArray) {
        int n8;
        SQLiteDatabase sQLiteDatabase = this.b();
        if (e.match(uri) != 2000) {
            n8 = sQLiteDatabase.update("bookmarks", contentValues, (String)charSequence, stringArray);
        } else {
            String string = uri.getLastPathSegment();
            if (charSequence == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("_id=");
                ((StringBuilder)charSequence).append(string);
                n8 = sQLiteDatabase.update("bookmarks", contentValues, ((StringBuilder)charSequence).toString(), null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("_id=");
                stringBuilder.append(string);
                stringBuilder.append(" and (");
                stringBuilder.append((String)charSequence);
                stringBuilder.append(")");
                n8 = sQLiteDatabase.update("bookmarks", contentValues, stringBuilder.toString(), stringArray);
            }
        }
        this.getContext().getContentResolver().notifyChange(uri, null);
        return n8;
    }

    private static class a
    extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "com.alphainventor.filemanager", null, 3);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(d);
        }

        public void onDowngrade(SQLiteDatabase object, int n8, int n9) {
            object.execSQL("DROP TABLE bookmarks");
            object.execSQL(d);
            object = ax.Ha.c.h().d("BookmarkProvider.onDowngrade");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("old:");
            stringBuilder.append(n8);
            stringBuilder.append(" new:");
            stringBuilder.append(n9);
            ((b)object).g(stringBuilder.toString()).h();
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
            if (n8 < 3) {
                sQLiteDatabase.execSQL("DROP TABLE bookmarks");
                sQLiteDatabase.execSQL(d);
            }
        }
    }
}

