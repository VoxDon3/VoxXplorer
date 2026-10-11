package ax.V2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Environment;
import ax.Q2.g;
import ax.Z2.j;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.K;
import ax.t3.k;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.bookmark.BookmarkProvider;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class b {
    private static final Logger a = g.a(b.class);

    public static boolean a(Context context, Bookmark bookmark, boolean z) {
        boolean z2;
        if (bookmark.z() == 2 && !z) {
            ax.Q2.a.i().m("bookmark", "boomark_add").c("loc", bookmark.s().I()).e();
        }
        ContentValues f = f(bookmark);
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = BookmarkProvider.b;
                Cursor query = contentResolver.query(uri, new String[]{"_id"}, "type =?  and location_name=? and location_key=? and file_id=?", new String[]{String.valueOf(bookmark.z()), bookmark.s().I(), Integer.toString(bookmark.t()), bookmark.q()}, null);
                if (query != null && query.moveToFirst()) {
                    z2 = context.getContentResolver().update(uri, f, "_id=?", new String[]{query.getString(0)}) == 1;
                    query.close();
                    return z2;
                }
                z2 = context.getContentResolver().insert(uri, f) != null;
                if (query != null) {
                    query.close();
                }
                return z2;
            } catch (SQLiteException e) {
                e.printStackTrace();
                ax.Ha.c.h().f().d("BOOKADD 1").l(e).h();
                if (0 != 0) {
                    cursor.close();
                }
                return false;
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                ax.Ha.c.h().f().d("BOOKADD 2").l(e2).h();
                if (0 != 0) {
                    cursor.close();
                }
                return false;
            }
        } finally {
        }
    }

    private static void b(Context context, File file, int i) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.exists()) {
            C3596o f = C1835x.f(file);
            f.n0();
            try {
                AbstractC3595n z = f.z(file.getAbsolutePath());
                f.k0(false);
                a(context, Bookmark.h(context.getString(i), f.T(), z.E(), z.t(), z.isDirectory()), true);
            } catch (C1495j unused) {
            }
        }
    }

    private static void c(Context context, String str, int i) {
        try {
            b(context, Environment.getExternalStoragePublicDirectory(str), i);
        } catch (RuntimeException e) {
            ax.Ha.c.h().f().b("DEFAULT BOOKMARK CREATING FAILED").l(e).h();
        }
    }

    public static void d(Context context) {
        if (k.e()) {
            return;
        }
        c(context, Environment.DIRECTORY_DCIM, R.string.folder_camera);
        c(context, Environment.DIRECTORY_MOVIES, R.string.folder_movies);
        c(context, Environment.DIRECTORY_MUSIC, R.string.folder_music);
        b(context, new File(j.F().O() + "/backups"), R.string.folder_backups);
        k.z();
    }

    public static int e(Context context) {
        try {
            return context.getContentResolver().delete(BookmarkProvider.b, "type = 4", null);
        } catch (SQLiteException e) {
            ax.Ha.c.h().d("BOOKLVDEL-SQL:").l(e).h();
            return 0;
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().d("BOOKLVDEL:").g(e2.getMessage()).h();
            return 0;
        }
    }

    private static ContentValues f(Bookmark bookmark) {
        ContentValues contentValues = new ContentValues();
        if (bookmark.v() != null) {
            contentValues.put("display_name", bookmark.v());
        }
        contentValues.put("type", Integer.valueOf(bookmark.z()));
        contentValues.put("location_name", bookmark.s().I());
        contentValues.put("location_key", Integer.valueOf(bookmark.t()));
        contentValues.put("path", bookmark.w());
        contentValues.put("file_id", bookmark.q());
        contentValues.put("is_directory", Boolean.valueOf(bookmark.A()));
        contentValues.put("timestamp", Long.valueOf(bookmark.y()));
        return contentValues;
    }

    public static boolean g(Context context, K k) {
        int delete = context.getContentResolver().delete(BookmarkProvider.b, "location_name =? and location_key =?", new String[]{k.d().I(), Integer.toString(k.b())});
        if (delete > 1) {
            a.severe("location bookmark deleted : " + delete);
        }
        return delete > 0;
    }
}
