package com.voxdon.xplorer.file;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStatVfs;
import android.text.TextUtils;
import ax.Z2.j;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.b3.C1496k;
import ax.c3.C1809B;
import ax.c3.C1824l;
import ax.c3.C1833v;
import ax.c3.d0;
import ax.c3.k0;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import j$.nio.channels.DesugarChannels;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3588g {
    private static final Logger b = Logger.getLogger("FileManager.DocumentFileClient");
    Context a;

    C3588g(Context context) {
        this.a = context;
    }

    public static String A(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(":")) >= 0) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    public static String B(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(":")) >= 0) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    public static boolean C(Context context, ax.c3.K k, String str) {
        String x;
        if (!ax.Z2.j.F().E0(k) || str == null) {
            x = x(context, k, str);
        } else {
            Uri n = n(k, str);
            x = (n == null || !a(context, n)) ? null : n.toString();
        }
        if (TextUtils.isEmpty(x)) {
            return false;
        }
        return H(context, k, str, Uri.parse(x));
    }

    private static boolean D(ax.c3.K k, C1824l c1824l) {
        String str;
        if (ax.Q2.f.i0(k.d())) {
            String e = k.e();
            if (e == null) {
                return false;
            }
            str = d0.h(e);
        } else if (ax.Q2.f.c0(k.d())) {
            str = ax.Z2.j.F().Z(k);
        } else {
            C3184b.g("Unexpected location unit : " + k);
            str = null;
        }
        String str2 = c1824l.b;
        if (str2 != null) {
            if (str2.equals(str)) {
                return true;
            }
            String A = A(c1824l.a);
            if (A != null && A.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(":");
    }

    public static boolean F(Context context, ax.c3.K k, String str, Uri uri) {
        String h;
        if (!ax.X2.Q.V1()) {
            return false;
        }
        if (k.e() == null) {
            return false;
        }
        String h2 = ax.X2.v.h(uri);
        if (str != null) {
            String z = z(h2);
            if (z == null || !z.equals(str)) {
                return false;
            }
        } else if (!E(h2)) {
            return false;
        }
        if (str != null) {
            h = d0.h(str);
        } else if (ax.Q2.f.i0(k.d())) {
            h = d0.h(k.e());
        } else if (ax.Q2.f.c0(k.d())) {
            h = ax.Z2.j.F().Z(k);
        } else {
            if (ax.Q2.f.o0(k.d())) {
                return false;
            }
            h = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1824l i = i(context, c(uri), h);
        if (i == null) {
            return false;
        }
        if (str == null) {
            return D(k, i);
        }
        String B = B(h2);
        if (k == ax.c3.K.e) {
            return "primary".equals(B);
        }
        if (k == ax.c3.K.f) {
            String h3 = d0.h(k.e());
            return h3 != null && h3.equals(B);
        }
        C3184b.f();
        return false;
    }

    public static boolean G(Context context, ax.c3.K k, Uri uri) {
        j.f M;
        C1824l i;
        if (!ax.X2.Q.V1()) {
            return false;
        }
        if (k.e() == null || (M = ax.Z2.j.F().M(k)) == null) {
            return false;
        }
        Uri uri2 = M.b;
        if (uri2 != null) {
            return uri2.equals(uri);
        }
        String lastPathSegment = M.a.getLastPathSegment();
        String lastPathSegment2 = uri.getLastPathSegment();
        if (lastPathSegment2 == null || !lastPathSegment2.equals(lastPathSegment) || (i = i(context, c(uri), null)) == null) {
            return false;
        }
        ax.Z2.j.F().U0(k, uri, i.b);
        k.j(i.b);
        String h = ax.X2.v.h(uri);
        if (h != null && h.equals(i.a)) {
            M.b = uri;
            M.c = i.b;
            return true;
        }
        return false;
    }

    public static boolean H(Context context, ax.c3.K k, String str, Uri uri) {
        String authority = uri.getAuthority();
        if ("com.android.externalstorage.documents".equals(authority)) {
            return F(context, k, str, uri);
        }
        if ("com.android.mtp.documents".equals(authority)) {
            return G(context, k, uri);
        }
        b.severe("Unknown Document Athority : " + authority);
        return false;
    }

    public static boolean I(ax.c3.K k, Uri uri) {
        if (ax.Q2.f.b0(k.d())) {
            Uri n = n(k, null);
            if (n == null) {
                return false;
            }
            return uri.toString().startsWith(n.toString());
        }
        if (ax.Q2.f.h1 == k.d()) {
            return "com.android.mtp.documents".equals(uri.getAuthority());
        }
        C3184b.g("same storage uri :" + k + ":" + uri);
        return false;
    }

    public static List<AbstractC3595n> J(AbstractC3586e abstractC3586e, AbstractC3595n abstractC3595n) throws C1495j {
        Exception exc;
        IllegalArgumentException illegalArgumentException;
        Throwable th;
        Cursor query;
        Uri l = l(abstractC3595n);
        ContentResolver contentResolver = abstractC3586e.p().getContentResolver();
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(l, DocumentsContract.getDocumentId(l));
        if (ax.X2.Q.L() && C1809B.P(abstractC3595n) && abstractC3595n.E().endsWith("/Android") && "/Android".equals(((C3605y) abstractC3595n).C0())) {
            buildChildDocumentsUriUsingTree = N(buildChildDocumentsUriUsingTree);
        }
        Uri uri = buildChildDocumentsUriUsingTree;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                query = contentResolver.query(uri, C1824l.g, null, null, null);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    if (query == null) {
                        throw new C1495j("query return null");
                    }
                    String E = abstractC3595n.E();
                    if (C1809B.P(abstractC3595n)) {
                        Uri N0 = ((C3605y) abstractC3595n).N0();
                        ax.c3.K B0 = ((C3605y) abstractC3595n).B0();
                        while (query.moveToNext()) {
                            try {
                                arrayList.add(new C3605y((C3604x) abstractC3586e, N0, B0, E, query));
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    } else {
                        C3590i c3590i = (C3590i) abstractC3595n;
                        while (query.moveToNext()) {
                            C3590i c3590i2 = new C3590i((C3589h) abstractC3586e, E, query);
                            c3590i2.q0(c3590i.m0());
                            arrayList.add(c3590i2);
                        }
                    }
                    if (ax.X2.Q.L() && arrayList.size() == 0 && (abstractC3595n instanceof C3605y)) {
                        C3605y c3605y = (C3605y) abstractC3595n;
                        if (c3605y.a1() && !c3605y.F0().canRead()) {
                            c3605y.q1();
                            if (!c3605y.n()) {
                                throw new ax.b3.t();
                            }
                            if (abstractC3595n.R() != ax.c3.K.e) {
                                if ("/Android/data".equals(c3605y.C0())) {
                                    throw new C1490e();
                                }
                                ax.c3.F.a(query);
                                return arrayList;
                            }
                            try {
                                ((C3605y) abstractC3595n).x1();
                            } catch (ax.b3.r unused2) {
                                throw new C1490e();
                            }
                        }
                    }
                    ax.c3.F.a(query);
                    return arrayList;
                } catch (IllegalArgumentException e) {
                    illegalArgumentException = e;
                    illegalArgumentException.printStackTrace();
                    if (!TextUtils.isEmpty(illegalArgumentException.getMessage()) && !illegalArgumentException.getMessage().contains("FileNotFoundException")) {
                        ax.Ha.c.h().f().b("DOCUMENT FILE EXCEPTION DO NOT CONTAIN FILENOTFOUND").l(illegalArgumentException).h();
                    }
                    throw new ax.b3.t();
                }
            } catch (C1495j e2) {
                throw e2;
            } catch (Exception e3) {
                exc = e3;
                throw C1489d.a("listChildren : " + exc.getClass().getSimpleName() + ":" + exc.getMessage(), exc);
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                ax.c3.F.a(cursor);
                throw th;
            }
        } catch (C1495j e4) {
            throw e4;
        } catch (IllegalArgumentException e5) {
            illegalArgumentException = e5;
        } catch (Exception e6) {
            exc = e6;
        }
    }

    public static void K(Context context, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        Uri uri;
        Uri b2;
        long p = abstractC3595n.p();
        Uri l = l(abstractC3595n);
        Uri v = v(abstractC3595n);
        Uri v2 = v(abstractC3595n2);
        if (!abstractC3595n.n()) {
            throw new ax.b3.t("Source File not exist");
        }
        boolean equals = abstractC3595n.B().equals(abstractC3595n2.B());
        Uri uri2 = (equals || (b2 = ax.X2.v.b(context.getContentResolver(), l, abstractC3595n2.B(), abstractC3595n.p(), abstractC3595n.q())) == null) ? l : b2;
        Uri uri3 = null;
        try {
            uri = uri2;
            try {
                uri3 = ax.X2.y.a(context.getContentResolver(), uri, v, v2, abstractC3595n.p(), abstractC3595n.q());
                e = null;
            } catch (C1495j e) {
                e = e;
            }
        } catch (C1495j e2) {
            e = e2;
            uri = uri2;
        }
        if (uri3 == null) {
            if (!uri.equals(l)) {
                ax.X2.v.b(context.getContentResolver(), uri, abstractC3595n.B(), abstractC3595n.p(), abstractC3595n.q());
            }
            if (e != null) {
                throw new C1495j("moveDocument failed 2", e);
            }
            throw new C1495j("moveDocument failed 1");
        }
        if (ax.Q2.f.b0(abstractC3595n.P())) {
            if (!uri3.equals(l(abstractC3595n2)) && !equals) {
                if (ax.X2.v.b(context.getContentResolver(), uri3, abstractC3595n2.B(), abstractC3595n.p(), abstractC3595n.q()) == null) {
                    throw new C1495j("renameDocument in move failed");
                }
            }
        } else if (ax.Q2.f.h1 == abstractC3595n.P()) {
            C3184b.f();
        }
        if (iVar != null) {
            iVar.a(p, p);
        }
    }

    public static void L(AbstractC3586e abstractC3586e, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        AbstractC3586e abstractC3586e2;
        AbstractC3595n abstractC3595n3;
        long p = abstractC3595n.p();
        if (abstractC3595n2.n()) {
            ax.Ha.c.h().f().d("!! Move Document FILE ALREADY EXISTS !!").j().g("location:" + abstractC3595n2.P().I()).h();
            throw new C1495j("moveUsingCopyDocumentFile file already exists");
        }
        if (abstractC3595n.isDirectory()) {
            if (abstractC3586e.u() != ax.Q2.f.h1) {
                C3184b.g("Not supported : doesSupportMoveFileToDifferentParent() == false");
            }
            throw new C1495j("Folder rename is not supported");
        }
        try {
            abstractC3586e2 = abstractC3586e;
            abstractC3595n3 = abstractC3595n2;
        } catch (C1486a e) {
            e = e;
            abstractC3586e2 = abstractC3586e;
            abstractC3595n3 = abstractC3595n2;
        } catch (C1495j e2) {
            e = e2;
            abstractC3586e2 = abstractC3586e;
            abstractC3595n3 = abstractC3595n2;
        }
        try {
            Q(abstractC3586e2, abstractC3595n3, abstractC3586e.s(abstractC3595n), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), true, interfaceC3185c, iVar);
            g(abstractC3586e2, abstractC3595n);
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (C1486a e3) {
            e = e3;
            C1486a c1486a = e;
            g(abstractC3586e2, abstractC3595n3);
            throw new C1495j(c1486a);
        } catch (C1495j e4) {
            e = e4;
            C1495j c1495j = e;
            g(abstractC3586e2, abstractC3595n3);
            throw c1495j;
        }
    }

    public static void M(Context context, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        long p = abstractC3595n.p();
        ax.X2.v.b(context.getContentResolver(), l(abstractC3595n), abstractC3595n2.B(), abstractC3595n.p(), abstractC3595n.q());
        if (iVar != null) {
            iVar.a(p, p);
        }
    }

    public static Uri N(Uri uri) {
        ax.X2.Q.l(31);
        return uri.buildUpon().appendQueryParameter("manage", "true").build();
    }

    public static void O(Context context, ax.c3.K k, String str, Uri uri) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("pref_secondary", 0).edit();
            edit.putString(y(k, str), uri.toString());
            edit.commit();
        } catch (ax.b3.M e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.nio.channels.FileChannel, java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.ContentResolver] */
    public static void P(AbstractC3586e abstractC3586e, AbstractC3595n abstractC3595n, long j) throws IOException, C1495j {
        ParcelFileDescriptor parcelFileDescriptor;
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        Context p = abstractC3586e.p();
        ?? l = l(abstractC3595n);
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                parcelFileDescriptor = p.getContentResolver().openFileDescriptor(l, "rw");
                try {
                    l = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        r1 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(l.getChannel());
                        r1.truncate(j);
                        r1.close();
                        l.close();
                        parcelFileDescriptor.close();
                    } catch (IllegalArgumentException e) {
                        e = e;
                        ax.Ha.c.h().f().b("trucate failed").l(e).g("FILE:" + abstractC3595n.n()).h();
                        throw new IOException(e);
                    } catch (SecurityException e2) {
                        e = e2;
                        throw new C1495j(e);
                    } catch (Throwable th) {
                        th = th;
                        if (r1 != 0) {
                            r1.close();
                        }
                        if (l != 0) {
                            l.close();
                        }
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                } catch (SecurityException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    l = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = p;
                parcelFileDescriptor = null;
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (SecurityException e6) {
            e = e6;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
            l = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f A[EDGE_INSN: B:81:0x017f->B:63:0x017f BREAK  A[LOOP:0: B:7:0x008a->B:53:0x008a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q(com.voxdon.xplorer.file.AbstractC3586e r10, com.voxdon.xplorer.file.AbstractC3595n r11, ax.c3.G r12, long r13, java.lang.Long r15, boolean r16, ax.u3.InterfaceC3185c r17, ax.g3.i r18) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3588g.Q(com.voxdon.xplorer.file.e, com.voxdon.xplorer.file.n, ax.c3.G, long, java.lang.Long, boolean, ax.u3.c, ax.g3.i):void");
    }

    public static boolean a(Context context, Uri uri) {
        return ax.Z2.n.b(context).d(uri);
    }

    public static void b(Context context, ax.c3.K k, String str) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("pref_secondary", 0).edit();
            if (k.d() == ax.Q2.f.p0) {
                edit.remove("secondaryRootUri");
            }
            edit.remove(y(k, str));
            edit.commit();
        } catch (ax.b3.M e) {
            e.printStackTrace();
        }
    }

    public static Uri c(Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    public static Uri d(AbstractC3586e abstractC3586e, AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        Context p = abstractC3586e.p();
        String E = abstractC3595n.E();
        String B = abstractC3595n.B();
        AbstractC3595n z2 = abstractC3586e.z(d0.r(E));
        if (z2 == null || !z2.n()) {
            throw new C1495j("CreateDocument Parent not exists");
        }
        Uri v = v(abstractC3595n);
        if (z) {
            try {
                return ax.X2.v.e(p.getContentResolver(), v, B);
            } catch (SecurityException e) {
                ax.Ha.c.h().f().d("CDF1").l(e).h();
                return null;
            }
        }
        String h = C1833v.h(E);
        if (h == null) {
            h = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            return ax.X2.v.d(p.getContentResolver(), v, h, B);
        } catch (SecurityException e2) {
            ax.Ha.c.h().f().d("CDF2").l(e2).h();
            return null;
        }
    }

    public static Uri e(ax.c3.K k, Uri uri, String str) throws C1495j {
        if (uri == null) {
            ax.Ha.c.h().b("Null RootUri").j().g("loc:" + k.toString()).h();
            throw new ax.b3.r("RootUri is empty");
        }
        String e = k.e();
        if (str.equals(e)) {
            return ax.X2.v.c(uri, ax.X2.v.h(uri));
        }
        try {
            if (d0.I(e, str)) {
                return f(uri, d0.n(e, str));
            }
            throw new C1495j("Path is not subdir of root" + e + ":" + str);
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().f().d("Invalid PATH").l(e2).g(str).h();
            throw new C1495j(e2);
        }
    }

    private static Uri f(Uri uri, String str) throws C1495j {
        int indexOf;
        try {
            String h = ax.X2.v.h(uri);
            if (!h.endsWith(":") && (indexOf = h.indexOf(":")) >= 0) {
                h = h.substring(0, indexOf + 1);
            }
            return ax.X2.v.c(uri, h + d0.m(str));
        } catch (IllegalArgumentException e) {
            ax.Ha.c.h().f().d("Invalid Tree PATH").l(e).g(str).h();
            throw new C1495j(e);
        }
    }

    public static void g(AbstractC3594m abstractC3594m, AbstractC3595n abstractC3595n) throws C1495j {
        List<AbstractC3595n> b0;
        if (abstractC3595n.isDirectory() && (b0 = abstractC3594m.b0(abstractC3595n)) != null && b0.size() > 0) {
            throw new C1496k("DocumentFile Delete Failed : has Children");
        }
        try {
            ax.X2.v.f(abstractC3594m.p().getContentResolver(), l(abstractC3595n));
        } catch (C1495j | SecurityException e) {
            if (e instanceof SecurityException) {
                if (".$recycle_bin$".equals(d0.h(abstractC3595n.T()))) {
                    ax.Ha.c.h().f().d("CDF3").l(e).h();
                } else {
                    ax.Ha.c.h().f().d("CDF4").l(e).h();
                }
            }
            if (!abstractC3594m.z(abstractC3595n.E()).n()) {
                throw new ax.b3.t("DocumentFile delete failed : File not exist");
            }
            throw C1489d.a("DocumentFile delete failed : exist=true, dir=" + abstractC3595n.isDirectory(), e);
        }
    }

    public static ax.c3.K h(Context context, Uri uri) {
        if (ax.X2.Q.L()) {
            try {
                String h = ax.X2.v.h(uri);
                ax.Z2.j F = ax.Z2.j.F();
                ax.c3.K k = ax.c3.K.e;
                String Z = F.Z(k);
                if (h != null && Z != null) {
                    if (h.startsWith(Z)) {
                        return k;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (ax.Z2.j.F().Y() != null) {
            for (ax.c3.K k2 : ax.Z2.j.F().Y()) {
                if (H(context, k2, null, uri)) {
                    return k2;
                }
            }
        }
        for (ax.c3.K k3 : ax.Z2.j.F().L()) {
            if (H(context, k3, null, uri)) {
                return k3;
            }
        }
        ax.Q2.f[] fVarArr = {ax.Q2.f.p0, ax.Q2.f.u0};
        for (int i = 0; i < 2; i++) {
            ax.c3.K a = ax.c3.K.a(fVarArr[i], 0);
            if (a.e() != null && H(context, a, null, uri)) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.AutoCloseable] */
    public static C1824l i(Context context, Uri uri, String str) throws C1495j {
        ?? r13;
        Throwable th;
        RuntimeException runtimeException;
        SecurityException securityException;
        IllegalArgumentException illegalArgumentException;
        Cursor cursor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            try {
                cursor = contentResolver.query(uri, C1824l.g, null, null, null);
                try {
                    if (cursor != null) {
                        if (!cursor.moveToFirst()) {
                            ax.c3.F.a(cursor);
                            return null;
                        }
                        C1824l c1824l = new C1824l(cursor);
                        ax.c3.F.a(cursor);
                        return c1824l;
                    }
                    String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (!Objects.equals(treeDocumentId, documentId)) {
                        throw new ax.b3.v("Remote Provider Error");
                    }
                    try {
                        Cursor query = contentResolver.query(Uri.parse(uri.toString() + "$A$B$C$D$E$F$G$H$I$J$K$L"), new String[]{"document_id"}, null, null, null);
                        if (query == null) {
                            throw new ax.b3.v("Remote Provider Error");
                        }
                        ax.Ha.c.h().c("RETRY success for getting file attribute 1").h();
                        C1824l c1824l2 = new C1824l(documentId, str);
                        ax.c3.F.a(query);
                        return c1824l2;
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage() != null && e.getMessage().contains("No root for")) {
                            throw new ax.b3.C(e);
                        }
                        if (e.getMessage() == null || !e.getMessage().contains("Missing file")) {
                            throw new C1495j(e);
                        }
                        ax.Ha.c.h().f().c("RETRY success for getting file attribute 2").l(e).h();
                        C1824l c1824l3 = new C1824l(documentId, str);
                        ax.c3.F.a(cursor);
                        return c1824l3;
                    } catch (Exception e2) {
                        throw new C1495j(e2);
                    }
                } catch (IllegalArgumentException e3) {
                    illegalArgumentException = e3;
                    if (illegalArgumentException.getMessage() != null && illegalArgumentException.getMessage().contains("No root for")) {
                        throw new ax.b3.C(illegalArgumentException);
                    }
                    if (illegalArgumentException.getMessage() == null || !illegalArgumentException.getMessage().contains("Missing file")) {
                        illegalArgumentException.printStackTrace();
                        throw new ax.b3.t(illegalArgumentException);
                    }
                    ax.c3.F.a(cursor);
                    return null;
                } catch (SecurityException e4) {
                    securityException = e4;
                    throw new ax.b3.p(securityException);
                } catch (RuntimeException e5) {
                    runtimeException = e5;
                    runtimeException.printStackTrace();
                    throw new C1495j(runtimeException);
                }
            } catch (Throwable th2) {
                th = th2;
                r13 = uri;
                ax.c3.F.a(r13);
                throw th;
            }
        } catch (IllegalArgumentException e6) {
            illegalArgumentException = e6;
            cursor = null;
        } catch (SecurityException e7) {
            securityException = e7;
        } catch (RuntimeException e8) {
            runtimeException = e8;
        } catch (Throwable th3) {
            r13 = 0;
            th = th3;
            ax.c3.F.a(r13);
            throw th;
        }
    }

    public static C1824l j(Context context, AbstractC3595n abstractC3595n) throws C1495j {
        return i(context, l(abstractC3595n), abstractC3595n.B());
    }

    public static k0 k(Context context, AbstractC3594m abstractC3594m, ax.c3.K k, Uri uri) throws C1495j {
        String e;
        if (ax.X2.Q.u()) {
            e = d0.Q(k.e(), "LOST.DIR");
            if (!abstractC3594m.z(e).n()) {
                e = d0.Q(k.e(), ".tempfstat");
                AbstractC3595n z = abstractC3594m.z(e);
                if (!z.n()) {
                    abstractC3594m.N(z);
                }
            }
        } else {
            e = k.e();
        }
        Uri e2 = e(k, uri, e);
        try {
            try {
                ParcelFileDescriptor o = o(context, e2, "r");
                if (o == null) {
                    throw new C1495j("faild to get file descriptor");
                }
                StructStatVfs fstatvfs = Os.fstatvfs(o.getFileDescriptor());
                long j = fstatvfs.f_blocks;
                long j2 = fstatvfs.f_bsize;
                k0 k0Var = new k0(j * j2, j2 * (j - fstatvfs.f_bavail), 0);
                try {
                    o.close();
                } catch (IOException unused) {
                }
                return k0Var;
            } catch (ErrnoException e3) {
                throw new C1495j(e3);
            }
        } finally {
        }
    }

    public static Uri l(AbstractC3595n abstractC3595n) throws C1495j {
        if (C1809B.P(abstractC3595n)) {
            C3605y c3605y = (C3605y) abstractC3595n;
            return e(c3605y.B0(), c3605y.N0(), abstractC3595n.E());
        }
        if (C1809B.J(abstractC3595n)) {
            return ((C3590i) abstractC3595n).n0();
        }
        C3184b.f();
        throw new C1495j("Illegal File Info Class");
    }

    public static Uri m(ax.c3.K k, String str) {
        if (ax.Q2.f.b0(k.d()) || ax.Q2.f.Q(k)) {
            Uri n = n(k, str);
            if (n == null) {
                return null;
            }
            return c(n);
        }
        C3184b.g("not reachable root uri : " + k);
        return null;
    }

    public static Uri n(ax.c3.K k, String str) {
        if (!ax.Q2.f.b0(k.d()) && !ax.Q2.f.Q(k)) {
            C3184b.g("not reachable root tree : " + k);
            return null;
        }
        String m = (str == null || !ax.Q2.f.Q(k)) ? HttpUrl.FRAGMENT_ENCODE_SET : d0.m(str);
        String Z = ax.Z2.j.F().Z(k);
        if (Z == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(Z + ":" + m).build();
    }

    public static ParcelFileDescriptor o(Context context, Uri uri, String str) throws C1495j {
        try {
            return context.getContentResolver().openFileDescriptor(uri, str);
        } catch (SQLiteException | IllegalStateException | NullPointerException | SecurityException e) {
            throw new C1495j(e);
        } catch (FileNotFoundException | IllegalArgumentException e2) {
            throw new ax.b3.t(e2);
        }
    }

    private static String p(String str, String str2) {
        int indexOf;
        if (str2 == null || (indexOf = str2.indexOf(":")) < 0) {
            return null;
        }
        String substring = str2.substring(indexOf + 1);
        return TextUtils.isEmpty(substring) ? str : d0.Q(str, substring);
    }

    public static String q(Context context, ax.c3.K k, Uri uri, String str, String str2, C1824l c1824l) throws C1495j {
        return ax.Q2.f.o0(k.d()) ? s(uri, str, str2, c1824l) : p(k.e(), str);
    }

    public static String r(Uri uri) {
        String g;
        String A;
        ax.c3.K k;
        String e;
        String h;
        try {
            g = ax.X2.v.g(uri);
            A = A(g);
        } catch (Exception unused) {
        }
        if ("primary".equals(A)) {
            return p(ax.c3.K.e.e(), g);
        }
        if (ax.Z2.j.F().t0() && (e = (k = ax.c3.K.f).e()) != null && (h = d0.h(e)) != null && h.equals(A)) {
            return p(k.e(), g);
        }
        return null;
    }

    private static String s(Uri uri, String str, String str2, C1824l c1824l) throws C1495j {
        if (!ax.X2.Q.k1()) {
            C3184b.f();
            throw new C1495j("not reachable");
        }
        if (uri != null) {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
            if (treeDocumentId != null && treeDocumentId.equals(str)) {
                return "/";
            }
        } else {
            C3184b.f();
        }
        String str3 = c1824l.b;
        if (str3 != null) {
            return d0.Q(str2, str3);
        }
        C3184b.f();
        throw new C1495j("No displayname");
    }

    public static InputStream t(Context context, AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(o(context, l(abstractC3595n), "r"));
            if (j != 0) {
                long skip = autoCloseInputStream.skip(j);
                if (skip != j) {
                    ax.Ha.c.h().b("Document file SKIP FAILED").g("offst:" + j + ",skipped:" + skip).h();
                    throw new C1495j("AutoCloseInputStream skip failed");
                }
            }
            return autoCloseInputStream;
        } catch (FileNotFoundException e) {
            throw new ax.b3.t(e);
        } catch (IOException e2) {
            throw C1489d.a("document getInputStream", e2);
        }
    }

    public static OutputStream u(AbstractC3586e abstractC3586e, AbstractC3595n abstractC3595n, boolean z) throws IOException, C1495j {
        Uri l;
        Uri uri;
        String g;
        Context p = abstractC3586e.p();
        Uri uri2 = null;
        if (abstractC3595n.n()) {
            l = l(abstractC3595n);
            uri = null;
        } else {
            l = d(abstractC3586e, abstractC3595n, false);
            if (l == null) {
                throw new IOException("Create Document File failed");
            }
            if (ax.Q2.f.b0(abstractC3595n.P())) {
                uri2 = l(abstractC3595n);
                if (!l.equals(uri2) && d0.M(abstractC3595n.B()) && ((g = d0.g(d0.h(l.getPath()))) == null || !g.endsWith(")") || !g.contains("("))) {
                    ax.Ha.c.h().f().d("UNEXPECTED DOCUMENT FILE NAME 2").g("expected:" + uri2 + ",created:" + l).h();
                }
            }
            uri = uri2;
            uri2 = l;
        }
        try {
            return new ParcelFileDescriptor.AutoCloseOutputStream(z ? p.getContentResolver().openFileDescriptor(l, "wa") : p.getContentResolver().openFileDescriptor(l, "wt"));
        } catch (IllegalArgumentException e) {
            String str = "FILE:" + abstractC3595n.n() + ":" + z;
            if (uri2 != null) {
                str = str + ",CREATED:" + uri2.toString();
            }
            if (uri != null) {
                str = str + ",EXPECTED:" + uri.toString();
            }
            ax.Ha.c.h().f().b("GetOutputStreamForDocumentFile failed").l(e).g(str).h();
            throw new IOException(e);
        } catch (SecurityException e2) {
            throw new C1495j(e2);
        }
    }

    public static Uri v(AbstractC3595n abstractC3595n) throws C1495j {
        if (C1809B.P(abstractC3595n)) {
            C3605y c3605y = (C3605y) abstractC3595n;
            return e(c3605y.B0(), c3605y.N0(), abstractC3595n.T());
        }
        if (C1809B.J(abstractC3595n)) {
            return ((C3590i) abstractC3595n).o0();
        }
        C3184b.f();
        throw new C1495j("Illegal File Info Class");
    }

    public static ParcelFileDescriptor w(Context context, AbstractC3595n abstractC3595n) throws C1495j {
        return o(context, l(abstractC3595n), "rw");
    }

    public static String x(Context context, ax.c3.K k, String str) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("pref_secondary", 0);
            if (k.d() == ax.Q2.f.p0 && (string = sharedPreferences.getString("secondaryRootUri", null)) != null) {
                return string;
            }
            String string2 = sharedPreferences.getString(y(k, str), null);
            return (ax.X2.J.o() && string2 != null && string2.startsWith("content://0@com.android.externalstorage.documents")) ? string2.replace("0@com.android.externalstorage.documents", "com.android.externalstorage.documents") : string2;
        } catch (ax.b3.M e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String y(ax.c3.K k, String str) throws ax.b3.M {
        ax.Q2.f d = k.d();
        if (ax.Q2.f.i0(d)) {
            if (str == null) {
                return "secondaryRootUri:" + k.e();
            }
            C3184b.c(d == ax.Q2.f.p0);
            return "secondaryRootUri:" + k.e() + ":" + str;
        }
        if (d == ax.Q2.f.o0 || d == ax.Q2.f.s0) {
            if (str == null) {
                ax.Ha.c.h().f().b("ROOT URI PREF NULL ROOT").j().h();
                throw new ax.b3.M("no rootTreePath");
            }
            String Z = ax.Z2.j.F().Z(k);
            if (Z == null) {
                throw new ax.b3.M("uuid is null");
            }
            return "primaryRootUri:" + Z + ":" + str;
        }
        if (ax.Q2.f.c0(d)) {
            String Z2 = ax.Z2.j.F().Z(k);
            if (Z2 == null) {
                throw new ax.b3.M("uuid is null");
            }
            return "documentRootUri:" + d.I() + ":" + Z2;
        }
        if (ax.Q2.f.o0(d)) {
            return "nonExternalRootUri:" + d.I() + ":" + k.b();
        }
        C3184b.g("not reachable:" + d.I());
        return "documentRootUri:" + d.I() + ":" + k.b();
    }

    public static String z(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(":")) < 0) {
            return null;
        }
        return "/" + str.substring(indexOf + 1);
    }
}
