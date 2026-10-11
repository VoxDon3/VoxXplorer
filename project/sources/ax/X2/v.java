package ax.X2;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.provider.DocumentsContract;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.system.StructStatVfs;
import android.system.StructTimespec;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import ax.b3.C1489d;
import ax.b3.C1495j;
import ax.c3.C1824l;
import java.io.FileNotFoundException;
import java.io.IOException;

@TargetApi(21)
/* loaded from: classes.dex */
public class v {
    static int a = 0;
    static int b = 1;
    static int c = -1;

    public static class a {
        public int a;
        public C1824l b;

        a(int i, C1824l c1824l) {
            this.a = i;
            this.b = c1824l;
        }
    }

    public static boolean a(Context context, Uri uri) throws C1495j {
        try {
            try {
                Cursor query = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                if (query == null) {
                    throw new C1495j("cursor is null");
                }
                boolean z = query.getCount() > 0;
                ax.c3.F.a(query);
                return z;
            } catch (Exception e) {
                e.printStackTrace();
                throw new C1495j(e);
            }
        } catch (Throwable th) {
            ax.c3.F.a(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        r6.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0131, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        r3.release();
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x006e: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:111), block:B:93:0x006e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri b(android.content.ContentResolver r9, android.net.Uri r10, java.lang.String r11, long r12, long r14) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.v.b(android.content.ContentResolver, android.net.Uri, java.lang.String, long, long):android.net.Uri");
    }

    public static Uri c(Uri uri, String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    public static Uri d(ContentResolver contentResolver, Uri uri, String str, String str2) throws C1495j {
        try {
            ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri.getAuthority());
            ContentProviderClient contentProviderClient = null;
            try {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("uri", uri);
                    bundle.putString("mime_type", str);
                    bundle.putString("_display_name", str2);
                    try {
                        Uri uri2 = (Uri) acquireUnstableContentProviderClient.call("android:createDocument", null, bundle).getParcelable("uri");
                        try {
                            acquireUnstableContentProviderClient.release();
                        } catch (Exception unused) {
                        }
                        return uri2;
                    } catch (DeadObjectException | NullPointerException unused2) {
                        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(uri.getAuthority());
                        try {
                            if (acquireContentProviderClient == null) {
                                throw new C1495j("ContentProviderClient for documentFile == null");
                            }
                            Bundle call = acquireContentProviderClient.call("android:createDocument", null, bundle);
                            ax.Ha.c.h().f().c("DeadObjectException RETRY SUCCESS").g("CREATE").h();
                            Uri uri3 = (Uri) call.getParcelable("uri");
                            if (acquireUnstableContentProviderClient != null) {
                                try {
                                    acquireUnstableContentProviderClient.release();
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                acquireContentProviderClient.release();
                            } catch (Exception unused4) {
                            }
                            return uri3;
                        } catch (IllegalArgumentException e) {
                            contentProviderClient = acquireContentProviderClient;
                            e = e;
                            if (Q.v()) {
                                Uri i = i(uri, str2);
                                if (k(contentResolver, i).a == a) {
                                    if (acquireUnstableContentProviderClient != null) {
                                        try {
                                            acquireUnstableContentProviderClient.release();
                                        } catch (Exception unused5) {
                                        }
                                    }
                                    if (contentProviderClient != null) {
                                        try {
                                            contentProviderClient.release();
                                        } catch (Exception unused6) {
                                        }
                                    }
                                    return i;
                                }
                            }
                            throw C1489d.a("create document error : " + e.getClass().getSimpleName() + ":" + e.getMessage(), e);
                        } catch (Exception e2) {
                            e = e2;
                            throw C1489d.a("create document error : " + e.getClass().getSimpleName() + ":" + e.getMessage(), e);
                        } catch (Throwable th) {
                            th = th;
                            contentProviderClient = acquireContentProviderClient;
                            if (acquireUnstableContentProviderClient != null) {
                                try {
                                    acquireUnstableContentProviderClient.release();
                                } catch (Exception unused7) {
                                }
                            }
                            if (contentProviderClient == null) {
                                throw th;
                            }
                            try {
                                contentProviderClient.release();
                                throw th;
                            } catch (Exception unused8) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
        } catch (SecurityException e5) {
            throw new C1495j(e5);
        }
    }

    public static Uri e(ContentResolver contentResolver, Uri uri, String str) throws C1495j {
        return d(contentResolver, uri, "vnd.android.document/directory", str);
    }

    public static void f(ContentResolver contentResolver, Uri uri) throws C1495j {
        try {
            ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri.getAuthority());
            ContentProviderClient contentProviderClient = null;
            try {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("uri", uri);
                    try {
                        acquireUnstableContentProviderClient.call("android:deleteDocument", null, bundle);
                    } catch (DeadObjectException | NullPointerException unused) {
                        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient(uri.getAuthority());
                        try {
                            if (acquireContentProviderClient == null) {
                                throw new C1495j("ContentProviderClient for documentFile == null");
                            }
                            acquireContentProviderClient.call("android:deleteDocument", null, bundle);
                            ax.Ha.c.h().f().c("DeadObjectException RETRY SUCCESS").g("DELETE").h();
                            contentProviderClient = acquireContentProviderClient;
                        } catch (Exception e) {
                            e = e;
                            throw new C1495j("delete document exception : " + e.getClass().getSimpleName() + ":" + e.getMessage());
                        } catch (Throwable th) {
                            contentProviderClient = acquireContentProviderClient;
                            th = th;
                            if (acquireUnstableContentProviderClient != null) {
                                try {
                                    acquireUnstableContentProviderClient.release();
                                } catch (Exception unused2) {
                                }
                            }
                            if (contentProviderClient == null) {
                                throw th;
                            }
                            try {
                                contentProviderClient.release();
                                throw th;
                            } catch (Exception unused3) {
                                throw th;
                            }
                        }
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            acquireUnstableContentProviderClient.release();
                        } catch (Exception unused4) {
                        }
                    }
                    if (contentProviderClient != null) {
                        try {
                            contentProviderClient.release();
                        } catch (Exception unused5) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SecurityException e3) {
            throw new C1495j(e3);
        }
    }

    public static String g(Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    public static String h(Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    private static Uri i(Uri uri, String str) {
        String str2;
        if (DocumentsContract.getTreeDocumentId(uri).equals(DocumentsContract.getDocumentId(uri))) {
            str2 = uri.toString() + str;
        } else {
            str2 = uri.toString() + Uri.encode("/" + str);
        }
        return Uri.parse(str2);
    }

    private static Uri j(Uri uri, String str) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        String documentId = DocumentsContract.getDocumentId(uri);
        return DocumentsContract.buildDocumentUriUsingTree(DocumentsContract.buildTreeDocumentUri(uri.getAuthority(), treeDocumentId), documentId.substring(0, Math.max(documentId.lastIndexOf("/"), documentId.lastIndexOf(":")) + 1) + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    static a k(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        Cursor cursor;
        ?? r1 = 0;
        try {
            try {
                cursor = contentResolver.query(uri, C1824l.g, null, null, null);
                try {
                    if (cursor == null) {
                        a aVar = new a(c, null);
                        ax.c3.F.a(cursor);
                        return aVar;
                    }
                    if (!cursor.moveToFirst()) {
                        a aVar2 = new a(b, null);
                        ax.c3.F.a(cursor);
                        return aVar2;
                    }
                    a aVar3 = new a(a, new C1824l(cursor));
                    ax.c3.F.a(cursor);
                    return aVar3;
                } catch (IllegalArgumentException unused) {
                    a aVar4 = new a(b, null);
                    ax.c3.F.a(cursor);
                    return aVar4;
                } catch (Exception unused2) {
                    a aVar5 = new a(c, null);
                    ax.c3.F.a(cursor);
                    return aVar5;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = contentResolver;
                ax.c3.F.a(r1);
                throw th;
            }
        } catch (IllegalArgumentException unused3) {
            cursor = null;
        } catch (Exception unused4) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            ax.c3.F.a(r1);
            throw th;
        }
    }

    public static L l(String str, L l) throws IOException {
        try {
            StructStat stat = Os.stat(str);
            boolean z = true;
            l.e = true;
            l.a = stat.st_size;
            if ((stat.st_mode & 61440) != 16384) {
                z = false;
            }
            l.b = z;
            l.c = n(stat);
            l.d = m(stat);
            return l;
        } catch (ErrnoException e) {
            if (e.errno != OsConstants.ENOENT) {
                e.printStackTrace();
                throw new IOException(e);
            }
            l.e = false;
            l.a = 0L;
            l.b = false;
            l.c = 0L;
            l.d = 0L;
            return l;
        } catch (IllegalArgumentException e2) {
            throw new IOException(e2);
        }
    }

    public static long m(StructStat structStat) {
        StructTimespec structTimespec;
        StructTimespec structTimespec2;
        long j;
        StructTimespec structTimespec3;
        long j2;
        if (Q.M1()) {
            structTimespec = structStat.st_atim;
            if (structTimespec != null) {
                if (!Q.O0()) {
                    return structStat.st_atime * 1000;
                }
                structTimespec2 = structStat.st_atim;
                j = structTimespec2.tv_sec;
                structTimespec3 = structStat.st_atim;
                j2 = structTimespec3.tv_nsec;
                return (j * 1000) + (j2 / 1000000);
            }
        }
        return structStat.st_atime * 1000;
    }

    public static long n(StructStat structStat) {
        StructTimespec structTimespec;
        StructTimespec structTimespec2;
        long j;
        StructTimespec structTimespec3;
        long j2;
        if (Q.M1()) {
            structTimespec = structStat.st_mtim;
            if (structTimespec != null) {
                if (!Q.O0()) {
                    return structStat.st_mtime * 1000;
                }
                structTimespec2 = structStat.st_mtim;
                j = structTimespec2.tv_sec;
                structTimespec3 = structStat.st_mtim;
                j2 = structTimespec3.tv_nsec;
                return (j * 1000) + (j2 / 1000000);
            }
        }
        return structStat.st_mtime * 1000;
    }

    public static M o(String str) throws IOException {
        try {
            StructStatVfs statvfs = Os.statvfs(str);
            return new M(statvfs.f_bsize, statvfs.f_blocks, statvfs.f_bavail, statvfs.f_bfree);
        } catch (ErrnoException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }

    public static AssetFileDescriptor p(Context context, Uri uri) throws FileNotFoundException {
        return context.getContentResolver().openAssetFileDescriptor(uri, "wt", null);
    }

    public static void q(ValueCallback<Boolean> valueCallback) {
        CookieManager.getInstance().removeAllCookies(valueCallback);
    }

    public static void r(Window window, int i) {
        window.setNavigationBarColor(i);
    }

    public static void s(Window window, int i) {
        window.addFlags(Integer.MIN_VALUE);
        try {
            window.setStatusBarColor(i);
        } catch (Exception e) {
            ax.Q2.d.c("setStatusBar", e);
        }
    }

    public static void t(Context context, Intent intent) {
        context.getContentResolver().takePersistableUriPermission(intent.getData(), intent.getFlags() & 3);
    }
}
