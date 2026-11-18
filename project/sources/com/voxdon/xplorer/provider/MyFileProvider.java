package com.voxdon.xplorer.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Q2.f;
import ax.X2.Q;
import ax.Z2.k;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.b3.r;
import ax.b3.t;
import ax.c3.C1809B;
import ax.c3.C1833v;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.o3.C2685b;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class MyFileProvider extends ContentProvider {
    private static final Logger d = Logger.getLogger("FileManager.MyFileProvider");
    private static final String[] e = {"_display_name", "_size", "_data"};
    private static final String[] f = {"_display_name", "_size"};
    private static boolean g;
    private static MyFileProvider h;
    private com.voxdon.xplorer.provider.a b;
    private Handler a = new Handler(Looper.getMainLooper());
    private final HashMap<Uri, AbstractC3595n> c = new HashMap<>();

    class a implements ParcelFileDescriptor.OnCloseListener {
        final /* synthetic */ C2685b.d a;
        final /* synthetic */ File b;

        a(C2685b.d dVar, File file) {
            this.a = dVar;
            this.b = file;
        }

        @Override // android.os.ParcelFileDescriptor.OnCloseListener
        public void onClose(IOException iOException) {
            this.a.a(this.b, iOException);
        }
    }

    static class b extends AbstractC3199q<Void, Void, AbstractC3595n> {
        c h;
        CountDownLatch i;
        AbstractC3595n j;
        boolean k;

        b(c cVar, CountDownLatch countDownLatch) {
            super(AbstractC3199q.e.HIGHER);
            this.k = C3180B.H();
            this.h = cVar;
            this.i = countDownLatch;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            this.i.countDown();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC3595n g(Void... voidArr) {
            boolean z;
            try {
                K e = this.h.e();
                if (e == null) {
                    return null;
                }
                C3596o e2 = C1835x.e(e);
                if (!e2.a()) {
                    if (this.k) {
                        ax.Ha.c.h().f().b("PROXY FILE OPERATOR NOT CONNECTED").h();
                        z = false;
                    } else {
                        z = e2.i(0L);
                    }
                    if (!z) {
                        return null;
                    }
                }
                try {
                    e2.n0();
                    return e2.z(this.h.d);
                } finally {
                    e2.k0(false);
                }
            } catch (C1495j unused) {
                return null;
            }
        }

        AbstractC3595n x() {
            return this.j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(AbstractC3595n abstractC3595n) {
            this.j = abstractC3595n;
            this.i.countDown();
        }
    }

    static class c {
        private K a;
        private boolean b;
        String c;
        String d;

        c(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                boolean z = true;
                int indexOf = encodedPath.indexOf(47, 1);
                this.c = Uri.decode(encodedPath.substring(1, indexOf));
                this.d = Uri.decode(encodedPath.substring(indexOf));
                if (!"root".equals(this.c) && !"external_files".equals(this.c)) {
                    z = false;
                }
                this.b = z;
                if (z) {
                    this.a = C1835x.g(this.d).T();
                } else {
                    this.a = K.h(this.c);
                }
            }
        }

        private static String a(K k, String str) {
            return Uri.encode(k.k()) + Uri.encode(str, "/");
        }

        static c b(Uri uri) {
            return new c(uri);
        }

        static Uri g(AbstractC3595n abstractC3595n) {
            return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath(a(abstractC3595n.R(), abstractC3595n.E())).build();
        }

        static Uri h(C3605y c3605y) {
            return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath(a(c3605y.B0(), c3605y.E())).build();
        }

        File c() {
            return new File(this.d).getAbsoluteFile();
        }

        k d() {
            K e = e();
            if (e != null) {
                return new k(e, this.d);
            }
            C3184b.f();
            return null;
        }

        K e() {
            return this.a;
        }

        String f() {
            String f;
            String str = this.d;
            return (str == null || (f = C1833v.f(d0.k(str))) == null) ? "application/octet-stream" : f;
        }

        boolean i() {
            K k;
            if (this.b || (k = this.a) == null) {
                return false;
            }
            return f.b0(k.d()) || f.o0(this.a.d());
        }

        boolean j() {
            K k;
            if (this.b || (k = this.a) == null) {
                return false;
            }
            return f.j0(k.d());
        }

        boolean k() {
            return this.b;
        }

        boolean l() {
            K k;
            if (this.b || (k = this.a) == null) {
                return false;
            }
            return f.n0(k.d());
        }
    }

    public static boolean A(Uri uri) {
        if ("com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return c.b(uri).i();
        }
        return false;
    }

    public static boolean B(Uri uri) {
        if ("com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return c.b(uri).k();
        }
        return false;
    }

    public static boolean C(Uri uri) {
        return D(uri) && "1".equals(uri.getQueryParameter("motion_photo"));
    }

    public static boolean D(Uri uri) {
        if (uri == null) {
            return false;
        }
        return "com.voxdon.xplorer.fileprovider".equals(uri.getAuthority());
    }

    public static boolean E(Uri uri) {
        if ("com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return c.b(uri).l();
        }
        return false;
    }

    private static int F(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private ParcelFileDescriptor G(File file, String str) throws FileNotFoundException {
        int F = F(str);
        try {
            C2685b.d k = C2685b.j().k();
            k.b(file);
            return ParcelFileDescriptor.open(file, F, this.a, new a(k, file));
        } catch (IOException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    private ParcelFileDescriptor H(c cVar, String str) throws FileNotFoundException {
        int F = F(str);
        k d2 = cVar.d();
        if (d2 == null) {
            C3184b.g("location uri is not valid");
            throw new FileNotFoundException("location uri is not valid");
        }
        try {
            return q().b(d2, F);
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    private MatrixCursor b(String[] strArr) {
        if (strArr == null) {
            strArr = f;
        }
        return new MatrixCursor(strArr, 0);
    }

    private MatrixCursor c(String[] strArr, AbstractC3595n abstractC3595n) {
        int i;
        if (strArr == null) {
            strArr = f;
        }
        String[] strArr2 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str : strArr) {
            if ("_display_name".equals(str)) {
                strArr2[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = abstractC3595n.B();
            } else if ("_size".equals(str)) {
                strArr2[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(abstractC3595n.p());
            } else if ("mime_type".equals(str)) {
                strArr2[i2] = "mime_type";
                i = i2 + 1;
                objArr[i2] = abstractC3595n.s();
            } else if ("_data".equals(str)) {
                strArr2[i2] = "_data";
                i = i2 + 1;
                objArr[i2] = null;
            }
            i2 = i;
        }
        String[] g2 = g(strArr2, i2);
        Object[] f2 = f(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(g2, 1);
        matrixCursor.addRow(f2);
        return matrixCursor;
    }

    private MatrixCursor d(Uri uri, String[] strArr) {
        int i;
        if (strArr == null) {
            strArr = f;
        }
        String[] strArr2 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        c b2 = c.b(uri);
        long o = o(uri, "length");
        int i2 = 0;
        for (String str : strArr) {
            if ("_display_name".equals(str)) {
                strArr2[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = new File(b2.d).getName() + ".mp4";
            } else if ("_size".equals(str)) {
                strArr2[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(o);
            } else if ("mime_type".equals(str)) {
                strArr2[i2] = "mime_type";
                i = i2 + 1;
                objArr[i2] = n(uri);
            } else if ("_data".equals(str)) {
                strArr2[i2] = "_data";
                i = i2 + 1;
                objArr[i2] = null;
            }
            i2 = i;
        }
        MatrixCursor matrixCursor = new MatrixCursor(g(strArr2, i2), 1);
        matrixCursor.addRow(f(objArr, i2));
        return matrixCursor;
    }

    public static k e(Uri uri) {
        if ("com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return c.b(uri).d();
        }
        return null;
    }

    private static Object[] f(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] g(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private void h(c cVar) throws C1495j {
        K e2 = cVar.e();
        if (e2 == null) {
            throw new C1495j("Bad Uri");
        }
        C3596o e3 = C1835x.e(e2);
        if (!e3.a()) {
            throw new C1495j("Not connected");
        }
        try {
            e3.n0();
            e3.P(e3.z(cVar.d));
        } finally {
            e3.k0(true);
        }
    }

    public static Uri i(Uri uri) {
        c b2 = c.b(uri);
        C3184b.c(b2.k());
        return u("external_files", b2.d);
    }

    private ParcelFileDescriptor j(c cVar, String str) throws C1495j, FileNotFoundException {
        K e2 = cVar.e();
        if (e2 == null) {
            throw new C1495j("Bad Uri");
        }
        C3596o e3 = C1835x.e(e2);
        if (!e3.a()) {
            if (!f.e0(e3.S()) && !f.o0(e3.S())) {
                C3184b.g("not document location?" + e3.S().I());
                throw new C1493h("Not connected");
            }
            e3.h(null);
            if (!e3.a()) {
                throw new C1493h("Not connected");
            }
        }
        try {
            e3.n0();
            return C3588g.o(getContext(), C3588g.l(e3.z(cVar.d)), str);
        } finally {
            e3.k0(false);
        }
    }

    private static AbstractC3595n k(c cVar) throws C1495j {
        if (!cVar.j() && !cVar.i()) {
            C3184b.g(cVar.c + ":" + cVar.d);
        }
        K e2 = cVar.e();
        if (e2 == null) {
            throw new C1495j("Bad Uri");
        }
        C3596o e3 = C1835x.e(e2);
        if (!e3.a()) {
            throw new C1495j("Not connected");
        }
        try {
            e3.n0();
            return e3.z(cVar.d);
        } finally {
            e3.k0(false);
        }
    }

    public static MyFileProvider l() {
        return h;
    }

    public static File m(Uri uri) {
        return c.b(uri).c();
    }

    private static String n(Uri uri) {
        String queryParameter = uri.getQueryParameter("mimetype");
        return !TextUtils.isEmpty(queryParameter) ? queryParameter : "video/mp4";
    }

    private static long o(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return -1L;
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Uri p(AbstractC3595n abstractC3595n, long j, long j2, String str) {
        if (!C1809B.H(abstractC3595n) || j < 0 || j2 <= 0) {
            throw new IllegalArgumentException("Invalid Motion Photo video range");
        }
        return (abstractC3595n instanceof C3605y ? t((C3605y) abstractC3595n) : c.g(abstractC3595n)).buildUpon().appendQueryParameter("motion_photo", "1").appendQueryParameter("offset", Long.toString(j)).appendQueryParameter("length", Long.toString(j2)).appendQueryParameter("mimetype", str).build();
    }

    private com.voxdon.xplorer.provider.a q() {
        z();
        return this.b;
    }

    public static Uri r(C3590i c3590i) {
        return c.g(c3590i);
    }

    public static Uri s(File file) {
        return u("root", file.getAbsolutePath());
    }

    public static Uri t(C3605y c3605y) {
        return s(c3605y.F0());
    }

    private static Uri u(String str, String str2) {
        return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath(Uri.encode(str) + Uri.encode(str2, "/")).build();
    }

    public static Uri v(C3605y c3605y) {
        return c.h(c3605y);
    }

    public static Uri w(C3605y c3605y) {
        return s(c3605y.F0());
    }

    public static Uri x(AbstractC3595n abstractC3595n) {
        Uri g2 = c.g(abstractC3595n);
        MyFileProvider myFileProvider = h;
        if (myFileProvider != null) {
            myFileProvider.a(g2, abstractC3595n);
        }
        return g2;
    }

    public static void y(Context context) {
        if (context == null || g) {
            return;
        }
        try {
            context.grantUriPermission("com.android.systemui", Uri.parse("content://com.voxdon.xplorer.fileprovider/"), 129);
            g = true;
        } catch (Exception unused) {
        }
    }

    void a(Uri uri, AbstractC3595n abstractC3595n) {
        this.c.put(uri, abstractC3595n);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        c b2 = c.b(uri);
        if (b2.k()) {
            return b2.c().delete() ? 1 : 0;
        }
        if (b2.l()) {
            ax.Ha.c.i(getContext()).f().b("PROXY FILE DELETE REQUESTED").h();
            return 0;
        }
        try {
            h(b2);
            return 1;
        } catch (C1495j unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return C(uri) ? n(uri) : c.b(uri).f();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ax.Q2.b.k(getContext());
        h = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        if (!C(uri)) {
            return super.openAssetFile(uri, str);
        }
        if (!"r".equals(str)) {
            throw new FileNotFoundException("Motion Photo is read-only");
        }
        long o = o(uri, "offset");
        long o2 = o(uri, "length");
        if (o < 0 || o2 <= 0 || o > Long.MAX_VALUE - o2) {
            throw new FileNotFoundException("Invalid Motion Photo video range");
        }
        ParcelFileDescriptor openFile = openFile(uri.buildUpon().clearQuery().build(), "r");
        if (openFile == null) {
            throw new FileNotFoundException("Unable to open Motion Photo");
        }
        long statSize = openFile.getStatSize();
        if (statSize < 0 || o + o2 <= statSize) {
            return new AssetFileDescriptor(openFile, o, o2);
        }
        try {
            openFile.close();
        } catch (IOException unused) {
        }
        throw new FileNotFoundException("Motion Photo video range exceeds file size");
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        ax.Q2.b.f(getContext(), false);
        if (C(uri)) {
            throw new FileNotFoundException("Motion Photo must be opened as an asset file");
        }
        getContext();
        c b2 = c.b(uri);
        if (!Q.V1()) {
            return G(b2.c(), str);
        }
        if (b2.k()) {
            File c2 = b2.c();
            try {
                C3605y c3605y = (C3605y) C1835x.f(c2).z(c2.getAbsolutePath());
                if (c3605y != null) {
                    try {
                        if (c3605y.d1()) {
                            return com.voxdon.xplorer.shizuku.c.t().w(c3605y.E());
                        }
                    } catch (r | IOException unused) {
                        return G(c2, str);
                    }
                }
                if (c3605y == null || !c3605y.i0() || getContext() == null) {
                    return G(c2, str);
                }
                ParcelFileDescriptor openFileDescriptor = getContext().getContentResolver().openFileDescriptor(C3588g.l(c3605y), str);
                if (openFileDescriptor != null) {
                    return openFileDescriptor.dup();
                }
                return null;
            } catch (C1495j e2) {
                e2.printStackTrace();
                throw new FileNotFoundException();
            } catch (SecurityException unused2) {
                throw new FileNotFoundException();
            }
        }
        if (b2.l()) {
            if (Q.t1()) {
                return H(b2, str);
            }
            C3184b.g("API VERSION NOT SUPPORTED");
            throw new FileNotFoundException("API VERSION NOT SUPPORTED");
        }
        try {
            ParcelFileDescriptor j = j(b2, str);
            if (j != null) {
                return j.dup();
            }
            return null;
        } catch (C1495j e3) {
            if (!(e3 instanceof t) && !(e3 instanceof C1493h)) {
                if (e3 instanceof r) {
                    ax.Ha.c.h().f().b("MyFileProvider error 1").l(e3).g("uri:" + b2.d).h();
                } else {
                    ax.Ha.c.h().f().b("MyFileProvider error 2").l(e3).h();
                }
            }
            if (b2.j()) {
                return G(b2.c(), str);
            }
            throw new FileNotFoundException(e3.getMessage());
        } catch (IOException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        int i;
        ax.Q2.b.f(getContext(), false);
        if (C(uri)) {
            return d(uri, strArr);
        }
        c b2 = c.b(uri);
        if (!b2.k()) {
            if (!b2.l()) {
                try {
                    return c(strArr, k(b2));
                } catch (C1495j e2) {
                    throw new IllegalStateException(e2);
                }
            }
            AbstractC3595n abstractC3595n = this.c.get(uri);
            if (abstractC3595n != null) {
                return c(strArr, abstractC3595n);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            b bVar = new b(b2, countDownLatch);
            bVar.i(new Void[0]);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
            AbstractC3595n x = bVar.x();
            return x != null ? c(strArr, x) : b(strArr);
        }
        File c2 = b2.c();
        try {
            z = !((C3605y) C1835x.f(c2).z(c2.getAbsolutePath())).a1();
        } catch (C1495j unused2) {
            z = true;
        }
        if (strArr == null) {
            strArr = z ? e : f;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = c2.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(c2.length());
            } else {
                if ("_data".equals(str3)) {
                    strArr3[i2] = "_data";
                    objArr[i2] = c2.getAbsolutePath();
                    i2++;
                } else if ("mime_type".equals(str3)) {
                    strArr3[i2] = "mime_type";
                    i = i2 + 1;
                    objArr[i2] = b2.f();
                }
            }
            i2 = i;
        }
        String[] g2 = g(strArr3, i2);
        Object[] f2 = f(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(g2, 1);
        matrixCursor.addRow(f2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public synchronized void z() {
        if (this.b == null) {
            this.b = new com.voxdon.xplorer.provider.a(getContext());
        }
    }
}
