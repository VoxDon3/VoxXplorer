package ax.c3;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import ax.r3.C2947d;
import ax.u3.C3184b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class M {
    private static final Logger a = ax.Q2.g.a(M.class);

    static class a {
        String a;
        boolean b;
        boolean c;

        a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }
    }

    private static boolean a(Context context, String str, boolean z) {
        Uri c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!new File(str).exists()) {
            a.severe("Scan requested file not found");
            return false;
        }
        ax.X2.Q.k(37, 36);
        try {
            String a2 = ax.X2.Q.c2() ? n0.a(str) : "external";
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            if (!z) {
                c = n0.c(a2);
            } else if (ax.X2.Q.x()) {
                c = n0.b(a2);
            } else {
                c = n0.c(a2);
                contentValues.put("format", (Integer) 12289);
            }
            contentValues.put("_data", str);
            return contentResolver.insert(c, contentValues) != null;
        } catch (Exception e) {
            e.printStackTrace();
            return z && (e instanceof SQLiteConstraintException) && e.getMessage() != null && e.getMessage().contains("UNIQUE constraint failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r16, java.util.List<ax.o3.f> r17, ax.g3.i r18) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.M.b(android.content.Context, java.util.List, ax.g3.i):void");
    }

    public static int c(Context context, List<ax.o3.f> list, boolean z, ax.g3.i iVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<ax.o3.f> it = list.iterator();
        while (it.hasNext()) {
            ax.o3.f next = it.next();
            if (!next.q && !next.m0) {
                boolean z2 = !next.d0 && C1808A.P(C1833v.g(d0.k(next.c0), "application/octet-stream"));
                if (z2 && !z) {
                    next.m0 = true;
                } else if (!((ax.X2.Q.V() && next.g0) || ax.X2.Q.U()) || next.d0 || next.b(context)) {
                    ContentProviderOperation h = h(next.c0, next.d0, z2);
                    if (h == null) {
                        next.m0 = true;
                    } else {
                        if (next.d0) {
                            arrayList3.add(h);
                            arrayList4.add(next);
                        } else {
                            arrayList.add(h);
                            arrayList2.add(next);
                        }
                        if (z2) {
                            next.m0 = true;
                        }
                    }
                } else if (z2) {
                    next.m0 = true;
                } else {
                    it.remove();
                }
            }
        }
        int size = arrayList3.size() + arrayList.size();
        return d(context, list, arrayList, arrayList2, d(context, list, arrayList3, arrayList4, 0, size, iVar), size, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(android.content.Context r16, java.util.List<ax.o3.f> r17, java.util.ArrayList<android.content.ContentProviderOperation> r18, java.util.ArrayList<ax.o3.f> r19, int r20, int r21, ax.g3.i r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.M.d(android.content.Context, java.util.List, java.util.ArrayList, java.util.ArrayList, int, int, ax.g3.i):int");
    }

    public static boolean e(Context context, String str) {
        Cursor query = context.getContentResolver().query(n0.c("external"), null, "_data = ?", new String[]{str}, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    query.close();
                    return true;
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
        }
        return false;
    }

    public static void f(Context context, List<ax.o3.f> list) {
        Iterator<ax.o3.f> it = list.iterator();
        while (it.hasNext()) {
            ax.o3.f next = it.next();
            if (!next.m0 && !next.b(context) && !next.d0) {
                if (next.q) {
                    if (ax.X2.Q.T()) {
                        String str = next.j0;
                        if (str != null) {
                            C2947d.B(context, C1809B.Z(next.c0, str, next.k0, next.l0, null));
                        }
                        it.remove();
                    }
                } else if (ax.X2.Q.U()) {
                    String g = C1833v.g(d0.k(next.c0), "application/octet-stream");
                    if (next.d0 || !C1808A.P(g)) {
                        it.remove();
                    }
                }
            }
        }
    }

    private static ContentProviderOperation g(String str, boolean z, boolean z2) {
        ax.X2.Q.k(37, 36);
        ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(Uri.parse(n0.c("external").toString() + "?deletedata=false"));
        if (z2) {
            if (z) {
                String str2 = str + "/";
                newDelete.withSelection("_data LIKE ?1 AND substr(_data,1,?2)=?3", new String[]{str2 + "%", Integer.toString(str2.length()), str2});
            } else {
                newDelete.withSelection("_data LIKE ?1 AND _data=?2", new String[]{str, str});
            }
        } else if (z) {
            String str3 = str + "/";
            newDelete.withSelection("_data LIKE ?1 AND lower(substr(_data,1,?2))=lower(?3)", new String[]{str3 + "%", Integer.toString(str3.length()), str3});
        } else {
            newDelete.withSelection("_data LIKE ?1 AND lower(_data)=lower(?2)", new String[]{str, str});
        }
        return newDelete.build();
    }

    private static ContentProviderOperation h(String str, boolean z, boolean z2) {
        Uri c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!new File(str).exists()) {
            a.severe("Scan requested file not found");
            return null;
        }
        ax.X2.Q.k(37, 36);
        ContentValues contentValues = new ContentValues();
        String a2 = ax.X2.Q.c2() ? n0.a(str) : "external";
        if (!z) {
            c = n0.c(a2);
        } else if (ax.X2.Q.x()) {
            c = n0.b(a2);
        } else {
            c = n0.c(a2);
            contentValues.put("format", (Integer) 12289);
        }
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(c);
        contentValues.put("_data", str);
        if (ax.X2.Q.w() && z2) {
            contentValues.put("mime_type", "application/octet-stream");
        }
        newInsert.withValues(contentValues);
        return newInsert.build();
    }

    private static int i(Context context, List<a> list) {
        int i = 0;
        for (a aVar : list) {
            i += j(context, aVar.a, aVar.b, aVar.c);
        }
        a.fine("Media Scanner delete using single operation : " + i + " of  " + list.size());
        return i;
    }

    public static int j(Context context, String str, boolean z, boolean z2) {
        ax.X2.Q.k(37, 36);
        Uri parse = Uri.parse(n0.c("external").toString() + "?deletedata=false");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (z2) {
                if (!z) {
                    return contentResolver.delete(parse, "_data LIKE ?1 AND _data=?2", new String[]{str, str});
                }
                String str2 = str + "/";
                return contentResolver.delete(parse, "_data LIKE ?1 AND substr(_data,1,?2)=?3", new String[]{str2 + "%", Integer.toString(str2.length()), str2});
            }
            if (!z) {
                return contentResolver.delete(parse, "_data LIKE ?1 AND lower(_data)=lower(?2)", new String[]{str, str});
            }
            String str3 = str + "/";
            return contentResolver.delete(parse, "_data LIKE ?1 AND lower(substr(_data,1,?2))=lower(?3)", new String[]{str3 + "%", Integer.toString(str3.length()), str3});
        } catch (SQLiteException e) {
            e.printStackTrace();
            ax.Ha.c.h().f().d("MED3:").l(e).h();
            return 0;
        } catch (IllegalArgumentException e2) {
            C3184b.e("What case is this? : " + str);
            e2.printStackTrace();
            if (e2.getMessage() == null || !e2.getMessage().startsWith("Too many")) {
                ax.Ha.c.h().f().d("MED1:").g(e2.getMessage()).h();
                return 0;
            }
            if (ax.X2.J.B()) {
                return 0;
            }
            ax.Ha.c.h().f().b("MED1-1:").g(e2.getMessage()).h();
            return 0;
        } catch (IllegalStateException e3) {
            ax.Ha.c.h().f().d("MED0:").g(e3.getMessage()).h();
            return 0;
        } catch (NullPointerException e4) {
            e4.printStackTrace();
            return 0;
        } catch (SecurityException e5) {
            e5.printStackTrace();
            ax.Ha.c.h().f().d("MED4:").l(e5).h();
            return 0;
        } catch (UnsupportedOperationException e6) {
            e6.printStackTrace();
            ax.Ha.c.h().f().d("MED2:").l(e6).h();
            return 0;
        }
    }

    private static int k(Context context, List<ax.o3.f> list, List<ax.o3.f> list2, int i, int i2, ax.g3.i iVar) {
        int i3 = 0;
        for (ax.o3.f fVar : list2) {
            if (fVar.q) {
                C3184b.f();
            } else {
                if (a(context, fVar.c0, fVar.d0)) {
                    i3++;
                    i++;
                    if (!fVar.m0) {
                        list.remove(fVar);
                    }
                } else {
                    fVar.m0 = true;
                }
                if (iVar != null) {
                    iVar.a(i, i2);
                }
            }
        }
        a.fine("Media Scanner insert using single operation :" + i3 + " of " + list2.size());
        return i3;
    }

    public static void l(Context context, Uri uri) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("format", (Integer) 12289);
        context.getContentResolver().update(uri, contentValues, "format = 12288", null);
    }
}
