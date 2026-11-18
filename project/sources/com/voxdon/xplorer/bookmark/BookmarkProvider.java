package com.voxdon.xplorer.bookmark;

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
import ax.Ha.c;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BookmarkProvider extends ContentProvider implements BaseColumns {
    public static final Uri b = Uri.parse("content://com.voxdon.xplorer.bookmark");
    public static final String[] c = {"_id", "type", "display_name", "location_name", "location_key", "path", "file_id", "is_directory", "timestamp"};
    private static final String d = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s TEXT, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT, %s TEXT, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL)", "bookmarks", "_id", "type", "display_name", "location_name", "location_key", "path", "file_id", "is_directory", "timestamp");
    private static final UriMatcher e;
    private a a;

    private static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "com.voxdon.xplorer", (SQLiteDatabase.CursorFactory) null, 3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(BookmarkProvider.d);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE bookmarks");
            sQLiteDatabase.execSQL(BookmarkProvider.d);
            c.h().d("BookmarkProvider.onDowngrade").g("old:" + i + " new:" + i2).h();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 3) {
                sQLiteDatabase.execSQL("DROP TABLE bookmarks");
                sQLiteDatabase.execSQL(BookmarkProvider.d);
            }
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.voxdon.xplorer.bookmark", HttpUrl.FRAGMENT_ENCODE_SET, 1000);
        uriMatcher.addURI("com.voxdon.xplorer.bookmark", "/#", 2000);
    }

    private SQLiteDatabase b() {
        return this.a.getWritableDatabase();
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        SQLiteDatabase b2 = b();
        int i = 0;
        try {
            if (e.match(uri) != 2000) {
                delete = b2.delete("bookmarks", str, strArr);
            } else {
                String lastPathSegment = uri.getLastPathSegment();
                if (str == null) {
                    delete = b2.delete("bookmarks", "_id=" + lastPathSegment, null);
                } else {
                    delete = b2.delete("bookmarks", "_id=" + lastPathSegment + " and (" + str + ")", strArr);
                }
            }
            i = delete;
            getContext().getContentResolver().notifyChange(uri, null);
            return i;
        } catch (SQLiteException e2) {
            e = e2;
            e.printStackTrace();
            c.h().d("BP").l(e).h();
            return i;
        } catch (SecurityException e3) {
            e = e3;
            e.printStackTrace();
            c.h().d("BP").l(e).h();
            return i;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = e.match(uri);
        if (match == 1000) {
            return "vnd.android.cursor.dir/bookmarks";
        }
        if (match == 2000) {
            return "vnd.android.cursor.item/bookmark";
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase b2 = b();
        long insert = b2.insert("bookmarks", HttpUrl.FRAGMENT_ENCODE_SET, contentValues);
        if (insert <= 0) {
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(b, insert);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("bookmarks");
        String[] strArr = {"_id"};
        if (contentValues.getAsInteger("type").intValue() != 2 && contentValues.getAsInteger("type").intValue() == 3) {
            Cursor query = sQLiteQueryBuilder.query(b2, strArr, "type = 3", null, null, null, "timestamp asc");
            if (query != null && query.getCount() > 200 && query.moveToFirst()) {
                b2.delete("bookmarks", "_id=?", new String[]{Integer.toString(query.getInt(0))});
            }
            query.close();
        }
        getContext().getContentResolver().notifyChange(withAppendedId, null);
        return withAppendedId;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase b2 = b();
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("bookmarks");
        if (e.match(uri) == 2000) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        }
        Cursor query = sQLiteQueryBuilder.query(b2, strArr, str, strArr2, null, null, str2);
        try {
            query.setNotificationUri(getContext().getContentResolver(), uri);
        } catch (SecurityException unused) {
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        SQLiteDatabase b2 = b();
        if (e.match(uri) != 2000) {
            update = b2.update("bookmarks", contentValues, str, strArr);
        } else {
            String lastPathSegment = uri.getLastPathSegment();
            if (str == null) {
                update = b2.update("bookmarks", contentValues, "_id=" + lastPathSegment, null);
            } else {
                update = b2.update("bookmarks", contentValues, "_id=" + lastPathSegment + " and (" + str + ")", strArr);
            }
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return update;
    }
}
