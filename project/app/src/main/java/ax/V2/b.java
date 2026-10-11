/*
 * Decompiled with CFR 0.152.
 */
package ax.V2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Environment;
import ax.Ha.c;
import ax.Q2.a;
import ax.Q2.g;
import ax.b3.j;
import ax.c3.K;
import ax.c3.x;
import ax.t3.k;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.bookmark.BookmarkProvider;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.File;
import java.util.logging.Logger;

public class b {
    private static final Logger a = g.a(b.class);

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, Bookmark object, boolean bl) {
        Throwable throwable2;
        Object object2;
        block12: {
            block17: {
                SQLiteException sQLiteException2;
                Object object3;
                block14: {
                    block16: {
                        RuntimeException runtimeException2;
                        Object object4;
                        block13: {
                            block15: {
                                Uri uri;
                                ContentValues contentValues;
                                block10: {
                                    block11: {
                                        Object object5;
                                        if (((Bookmark)object).z() == 2 && !bl) {
                                            ax.Q2.a.i().m("bookmark", "boomark_add").c("loc", ((Bookmark)object).s().I()).e();
                                        }
                                        contentValues = b.f((Bookmark)object);
                                        bl = false;
                                        boolean bl2 = false;
                                        Object object6 = null;
                                        Object object7 = null;
                                        object2 = object5 = null;
                                        object4 = object6;
                                        object3 = object7;
                                        try {
                                            ContentResolver contentResolver = context.getContentResolver();
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            uri = BookmarkProvider.b;
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            int n8 = ((Bookmark)object).z();
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            String string = ((Bookmark)object).s().I();
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            String string2 = Integer.toString(((Bookmark)object).t());
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            object = ((Bookmark)object).q();
                                            object2 = object5;
                                            object4 = object6;
                                            object3 = object7;
                                            object = contentResolver.query(uri, new String[]{"_id"}, "type =?  and location_name=? and location_key=? and file_id=?", new String[]{String.valueOf(n8), string, string2, object}, null);
                                            if (object == null) break block10;
                                            object2 = object;
                                            object4 = object;
                                            object3 = object;
                                            if (!object.moveToFirst()) break block10;
                                            object2 = object;
                                            object4 = object;
                                            object3 = object;
                                            n8 = context.getContentResolver().update(uri, contentValues, "_id=?", new String[]{object.getString(0)});
                                            bl = bl2;
                                            if (n8 != 1) break block11;
                                            bl = true;
                                        }
                                        catch (Throwable throwable2) {
                                            break block12;
                                        }
                                        catch (RuntimeException runtimeException2) {
                                            break block13;
                                        }
                                        catch (SQLiteException sQLiteException2) {
                                            break block14;
                                        }
                                    }
                                    object.close();
                                    return bl;
                                }
                                object2 = object;
                                object4 = object;
                                object3 = object;
                                {
                                    if ((context = context.getContentResolver().insert(uri, contentValues)) != null) {
                                        bl = true;
                                    }
                                    if (object == null) break block15;
                                }
                                object.close();
                            }
                            return bl;
                        }
                        object2 = object4;
                        {
                            runtimeException2.printStackTrace();
                            object2 = object4;
                            c.h().f().d("BOOKADD 2").l(runtimeException2).h();
                            if (object4 == null) break block16;
                        }
                        object4.close();
                    }
                    return false;
                }
                object2 = object3;
                {
                    sQLiteException2.printStackTrace();
                    object2 = object3;
                    c.h().f().d("BOOKADD 1").l(sQLiteException2).h();
                    if (object3 == null) break block17;
                }
                object3.close();
            }
            return false;
        }
        if (object2 != null) {
            object2.close();
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(Context context, File comparable, int n8) {
        if (!((File)comparable).exists()) {
            ((File)comparable).mkdirs();
        }
        if (!((File)comparable).exists()) {
            return;
        }
        o o8 = x.f(comparable);
        o8.n0();
        try {
            comparable = o8.z(((File)comparable).getAbsolutePath());
            o8.k0(false);
            b.a(context, Bookmark.h(context.getString(n8), o8.T(), ((n)comparable).E(), comparable.t(), comparable.isDirectory()), true);
            return;
        }
        catch (j j8) {
            return;
        }
    }

    private static void c(Context context, String string, int n8) {
        try {
            b.b(context, Environment.getExternalStoragePublicDirectory((String)string), n8);
            return;
        }
        catch (RuntimeException runtimeException) {
            c.h().f().b("DEFAULT BOOKMARK CREATING FAILED").l(runtimeException).h();
            return;
        }
    }

    public static void d(Context context) {
        if (!k.e()) {
            b.c(context, Environment.DIRECTORY_DCIM, 2131952065);
            b.c(context, Environment.DIRECTORY_MOVIES, 2131952068);
            b.c(context, Environment.DIRECTORY_MUSIC, 2131952069);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ax.Z2.j.F().O());
            stringBuilder.append("/backups");
            b.b(context, new File(stringBuilder.toString()), 2131952064);
            k.z();
        }
    }

    public static int e(Context context) {
        SQLiteException sQLiteException2;
        block3: {
            try {
                int n8 = context.getContentResolver().delete(BookmarkProvider.b, "type = 4", null);
                return n8;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            c.h().d("BOOKLVDEL:").g(illegalArgumentException.getMessage()).h();
            return 0;
        }
        c.h().d("BOOKLVDEL-SQL:").l(sQLiteException2).h();
        return 0;
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

    public static boolean g(Context object, K object2) {
        int n8 = object.getContentResolver().delete(BookmarkProvider.b, "location_name =? and location_key =?", new String[]{((K)object2).d().I(), Integer.toString(((K)object2).b())});
        if (n8 > 1) {
            object = a;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("location bookmark deleted : ");
            ((StringBuilder)object2).append(n8);
            ((Logger)object).severe(((StringBuilder)object2).toString());
        }
        return n8 > 0;
    }
}

