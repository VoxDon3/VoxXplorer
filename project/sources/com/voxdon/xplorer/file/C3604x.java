package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.W2.C1011c;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.b3.C1496k;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1824l;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.c3.i0;
import ax.c3.k0;
import ax.c3.n0;
import ax.ca.C1852a;
import ax.r3.C2945b;
import ax.r3.C2946c;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import ax.y0.C3495a;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.C3601u;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.service.ScanService;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.Paths;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.UUID;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: com.voxdon.xplorer.file.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3604x extends AbstractC3586e implements i0 {
    private static final Logger r = Logger.getLogger("FileManager.LocalFileHelper");
    private static int s = 327680;
    private static final List<String> t = Arrays.asList("acct", "cache", "charger", "config", ax.ba.d.d, "data", "debug_ramdisk", "dev", "etc", "mnt", "oem", "proc", "property_contexts", "root", "sbin", "sdcard", "storage", "sys", "system", "vendor");
    private static final List<String> u = Arrays.asList("0", "999", "95", "96");
    private static final List<String> v = Arrays.asList("/DCIM/Camera", "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Images");
    private static final List<String> w = Arrays.asList("/DCIM/Camera");
    private static final List<String> x = Arrays.asList("/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Voice Notes", "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses");
    private static final String[] y = {"_id", "_data", "date_modified", "_size", "mime_type", "date_added", "datetaken"};
    private C3588g l;
    private HashSet<String> n;
    private HashSet<String> o;
    private Boolean p;
    private HashMap<String, Boolean> h = new HashMap<>();
    private ArrayList<ax.o3.f> i = new ArrayList<>();
    private boolean j = false;
    private ConcurrentHashMap<String, ax.o3.f> k = new ConcurrentHashMap<>();
    private final Object m = new Object();
    private boolean q = false;

    /* renamed from: com.voxdon.xplorer.file.x$a */
    class a implements ax.g3.h {
        final /* synthetic */ List a;
        final /* synthetic */ ax.g3.h b;

        a(List list, ax.g3.h hVar) {
            this.a = list;
            this.b = hVar;
        }

        @Override // ax.g3.h
        public void Y(List<AbstractC3595n> list, boolean z) {
            ArrayList arrayList = null;
            for (AbstractC3595n abstractC3595n : list) {
                if (!this.a.contains(abstractC3595n.E())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractC3595n);
                }
            }
            if (arrayList != null) {
                this.b.Y(arrayList, z);
            }
        }

        @Override // ax.g3.h
        public void i() {
        }

        @Override // ax.g3.h
        public void o() {
        }
    }

    /* renamed from: com.voxdon.xplorer.file.x$b */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.F0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.s0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.p0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.x0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.v0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.w0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.u0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ax.Q2.f.t0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ax.Q2.f.r0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ax.Q2.f.q0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.x$c */
    static class c extends ax.c3.Y {
        C3605y c0;
        C3604x d0;
        boolean e0;

        c(C3604x c3604x, C3605y c3605y, boolean z, boolean z2) throws FileNotFoundException {
            super(new FileOutputStream(c3605y.F0(), z));
            this.d0 = c3604x;
            this.c0 = c3605y;
            this.e0 = z2;
        }

        @Override // ax.c3.Y, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.d0.M1(this.c0, false, false, false, this.e0);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.x$d */
    private class d extends AbstractC3199q<Long, Long, Long> {
        private ArrayList<ax.o3.f> h;
        private long i;
        private long j;

        public d(ArrayList<ax.o3.f> arrayList, long j) {
            super(AbstractC3199q.e.HIGH);
            this.i = System.currentTimeMillis();
            this.j = j;
            this.h = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Long g(Long... lArr) {
            if (this.j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.i;
                long j = this.j;
                if (currentTimeMillis < j) {
                    try {
                        Thread.sleep(j - currentTimeMillis);
                    } catch (Exception unused) {
                    }
                }
            }
            C3604x.this.H0(this.h, 0, null);
            return null;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.x$f */
    public interface f {
        void a();

        void b(boolean z);
    }

    /* renamed from: com.voxdon.xplorer.file.x$g */
    public static class g extends AbstractC3199q<Void, Void, Boolean> {
        C3604x h;
        AbstractC3595n i;
        f j;
        boolean k;
        C3596o l;

        public g(C3596o c3596o, AbstractC3595n abstractC3595n, boolean z, f fVar) {
            super(AbstractC3199q.e.HIGH);
            this.l = c3596o;
            this.h = (C3604x) c3596o.u();
            this.i = abstractC3595n;
            this.j = fVar;
            this.k = z;
            this.l.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            boolean z;
            boolean z2 = true;
            boolean z3 = ax.Q2.f.f0(this.i.P()) || ax.Q2.f.g0(this.i.P());
            if (this.k) {
                z = z3 ? ax.Z2.g.h().n(this.i, true) : this.h.s0(this.i);
            } else {
                boolean n = z3 ? ax.Z2.g.h().n(this.i, false) : false;
                boolean I1 = this.h.I1(this.i);
                if (!n && !I1) {
                    z2 = false;
                }
                z = z2;
            }
            if (ax.X2.Q.X1() && this.l.Y()) {
                this.l.n(null);
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.j != null) {
                if (bool.booleanValue()) {
                    this.j.b(this.k);
                } else {
                    this.j.a();
                }
            }
            this.l.k0(true);
        }
    }

    private void A1(C3605y c3605y, C3605y c3605y2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!c3605y.isDirectory()) {
            z1(c3605y, c3605y2, interfaceC3185c, iVar);
        } else {
            x0(c3605y, c3605y2, interfaceC3185c, iVar);
            C0(c3605y);
        }
    }

    private A B0(ax.c3.K k, Cursor cursor, ax.X2.L l) {
        boolean z = true;
        String string = cursor.getString(1);
        long j = cursor.getLong(2) * 1000;
        long j2 = cursor.getLong(3);
        boolean k1 = k1(cursor.getString(4));
        if (!cursor.isNull(2) && (k1 || !cursor.isNull(3))) {
            z = false;
        }
        long j3 = cursor.getLong(5);
        if (k1 || j == 0 || z) {
            try {
                ax.X2.v.l(string, l);
                j = l.c;
                k1 = l.b;
                if (!k1) {
                    j2 = l.a;
                }
            } catch (IOException unused) {
                File file = new File(string);
                j = file.lastModified();
                String f2 = d0.f(string);
                if (!TextUtils.isEmpty(f2) && C1808A.g(f2) != null) {
                    k1 = file.isDirectory();
                }
            }
        }
        long j4 = j;
        boolean z2 = k1;
        Long l2 = null;
        if (!cursor.isNull(6)) {
            try {
                l2 = Long.valueOf(cursor.getLong(6));
            } catch (Exception unused2) {
            }
        }
        return new A(string, z2, j4, l2, j3, j2);
    }

    private boolean B1(AbstractC3595n abstractC3595n) {
        return !ax.X2.J.x(p()) && C1809B.M(abstractC3595n);
    }

    public static boolean C1(Context context, ax.c3.K k, C3605y c3605y) {
        if (c3605y == null || !(c3605y.o0() || c3605y.d1() || c3605y.f1())) {
            return D1(context, k, c3605y == null ? null : c3605y.M0());
        }
        return false;
    }

    private boolean D0(AbstractC3595n abstractC3595n, boolean z) {
        if (!m1() || !C1809B.P(abstractC3595n)) {
            return true;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.B0().d() == ax.Q2.f.t0) {
            return true;
        }
        if (c3605y.C0().startsWith("/Android") && (h1(abstractC3595n) || i1(abstractC3595n))) {
            return true;
        }
        if ((!ax.X2.Q.A0() && !z && !C1808A.L(abstractC3595n.A())) || "tmp".equals(abstractC3595n.A())) {
            return true;
        }
        String C0 = c3605y.C0();
        if (C0.contains(".$recycle_bin$")) {
            return true;
        }
        return ax.X2.Q.L() ? d0.H("/.localcache", C0) || d0.H("/Android/media/com.voxdon.xplorer/.localcache", C0) : !ax.X2.Q.L() && C0.contains("/localcache");
    }

    public static boolean D1(Context context, ax.c3.K k, String str) {
        if (!ax.X2.Q.V1()) {
            return false;
        }
        if (!ax.Q2.f.Q(k)) {
            return (!ax.Q2.f.i0(k.d()) || ax.Z2.j.F().k0(k) || C3588g.C(context, k, null) || ax.Z2.j.F().j0(k)) ? false : true;
        }
        if (str != null) {
            return !C3588g.C(context, k, str);
        }
        if (ax.Z2.j.F().j0(k)) {
            return false;
        }
        return !C3588g.C(context, k, null);
    }

    public static boolean E1(Context context, AbstractC3595n abstractC3595n, boolean z) {
        if (!C1809B.P(abstractC3595n)) {
            return false;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.d1() || c3605y.o0() || c3605y.f1()) {
            return false;
        }
        if (z && ax.Z2.j.F().E0(c3605y.B0()) && t0(context, c3605y)) {
            return false;
        }
        return C1(context, c3605y.B0(), c3605y);
    }

    private void F0(ArrayList<ax.o3.f> arrayList) {
        ArrayList<ax.o3.f> arrayList2 = new ArrayList<>();
        boolean z = false;
        int i = 5000;
        do {
            if (z) {
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                z = false;
                i = 5000;
            }
            try {
                Iterator<ax.o3.f> it = arrayList.iterator();
                while (it.hasNext()) {
                    ax.o3.f next = it.next();
                    if (next != null) {
                        arrayList2.add(next);
                        i += next.a();
                    }
                    it.remove();
                    if (i >= s) {
                        P1(arrayList2, it.hasNext(), i);
                        return;
                    }
                }
                if (arrayList2.size() > 0) {
                    P1(arrayList2, false, i);
                    return;
                }
            } catch (RuntimeException e2) {
                if ((e2.getCause() instanceof TransactionTooLargeException) && s == 327680) {
                    s = 163840;
                    z = true;
                } else {
                    ax.Q2.d.c("executePendingScan", e2);
                }
            }
        } while (z);
    }

    private void F1(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, Throwable th) throws C1495j {
        boolean z = false;
        if (u0() && (p1(abstractC3595n) || p1(abstractC3595n2))) {
            z = C3606z.Y().P(abstractC3595n.E(), abstractC3595n2.E(), false);
        }
        if (z) {
            return;
        }
        ((C3605y) abstractC3595n).q1();
        if (th == null) {
            if (!abstractC3595n.n()) {
                throw new ax.b3.t("move source not exist");
            }
            throw new C1495j("File.renameTo failed");
        }
        if (!abstractC3595n.n()) {
            throw new ax.b3.t(th);
        }
        throw new C1495j("Files.move failed", th);
    }

    private String G1(Uri uri, String[] strArr, String str, String[] strArr2, int i) {
        Throwable th;
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        try {
            Cursor query = p().getContentResolver().query(uri, strArr, str, strArr2, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(i);
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(ArrayList<ax.o3.f> arrayList, int i, ax.g3.i iVar) {
        while (arrayList.size() > 0) {
            if (iVar != null) {
                iVar.a(i - arrayList.size(), i);
            }
            F0(arrayList);
            if (arrayList.size() > 0) {
                try {
                    Thread.sleep(500L);
                } catch (Exception unused) {
                }
            }
        }
        if (iVar != null) {
            iVar.a(i - arrayList.size(), i);
        }
    }

    public static AbstractC3595n J0(List<AbstractC3595n> list) {
        for (AbstractC3595n abstractC3595n : list) {
            if (".hidden".equals(abstractC3595n.B())) {
                return abstractC3595n;
            }
        }
        return null;
    }

    private static long K1(long j) {
        long j2;
        long j3 = 1;
        long j4 = 1;
        while (true) {
            j2 = j3 * j4;
            if (j2 >= j || j - j2 <= j2 / 2) {
                break;
            }
            j3 <<= 1;
            if (j3 > 512) {
                j4 *= ax.X2.Q.b2() ? 1000L : RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                j3 = 1;
            }
        }
        return j2 > j ? j2 : j;
    }

    private void L1(AbstractC3595n abstractC3595n, boolean z, boolean z2) {
        if (D0(abstractC3595n, z)) {
            return;
        }
        r0(abstractC3595n, true, z, false, false, z2, false);
    }

    private AbstractC3595n M0(C3605y c3605y, String str) {
        AbstractC3595n r2;
        if (c3605y.T0()) {
            try {
                return V0(c3605y);
            } catch (C1495j unused) {
            }
        } else if (ax.c3.I.b(c3605y.R())) {
            File c2 = ax.c3.I.c(c3605y.R(), str);
            if (c2 != null) {
                return new C3605y(this, c2, c3605y.B0(), true);
            }
        } else if (ax.c3.I.a(c3605y.B0()) && c3605y.b1()) {
            File c3 = ax.c3.I.c(c3605y.R(), str);
            if (c3 != null) {
                return new C3605y(this, c3, c3605y.B0(), true);
            }
        } else if (com.voxdon.xplorer.shizuku.c.t().l() && (r2 = com.voxdon.xplorer.shizuku.c.t().r(this, null, str)) != null) {
            return r2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1(AbstractC3595n abstractC3595n, boolean z, boolean z2, boolean z3, boolean z4) {
        if (D0(abstractC3595n, abstractC3595n.isDirectory())) {
            return;
        }
        if (abstractC3595n.isDirectory()) {
            q0(abstractC3595n, z, z2, z3);
        } else {
            r0(abstractC3595n, false, false, z, z2, z3, z4);
        }
    }

    private void N1(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) {
        C3604x c3604x;
        C3604x c3604x2;
        if (interfaceC3185c == null || !interfaceC3185c.isCancelled()) {
            AbstractC3595n abstractC3595n2 = abstractC3595n;
            String str2 = str;
            List<String> d2 = ax.c3.N.d(p(), abstractC3595n2, str2, z2);
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            for (String str4 : d2) {
                String r2 = d0.r(str4);
                if (str3.equals(r2)) {
                    c3604x2 = this;
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (arrayList.size() <= 0 || currentTimeMillis2 - currentTimeMillis <= 100) {
                        c3604x2 = this;
                    } else {
                        I0(abstractC3595n2, arrayList, false, str2, z, hVar);
                        c3604x2 = this;
                        arrayList.clear();
                        currentTimeMillis = currentTimeMillis2;
                    }
                    if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                        return;
                    } else {
                        str3 = r2;
                    }
                }
                AbstractC3595n z3 = c3604x2.z(str4);
                if (z3.n() && !J.j2(z3)) {
                    arrayList.add(z3);
                }
                abstractC3595n2 = abstractC3595n;
                str2 = str;
            }
            if (arrayList.size() > 0) {
                c3604x = this;
                c3604x.I0(abstractC3595n, arrayList, true, str, z, hVar);
                arrayList.clear();
            } else {
                c3604x = this;
            }
            c3604x.o(abstractC3595n, str, z, z2, c3604x.new a(d2, hVar), interfaceC3185c);
        }
    }

    public static C3605y O0(File file) {
        try {
            return (C3605y) C1835x.f(file).z(file.getAbsolutePath());
        } catch (C1495j unused) {
            C3184b.f();
            return null;
        }
    }

    public static void O1(Context context, ArrayList<ax.o3.f> arrayList, boolean z, int i) {
        Intent intent = new Intent(context, (Class<?>) ScanService.class);
        intent.putExtra("PENDING_SCAN_ARRAY", (Parcelable[]) arrayList.toArray(new ax.o3.f[0]));
        intent.putExtra("HAS_FOLLOWING_LIST", z);
        try {
            C3180B.f0(context, intent, true, true);
        } catch (IllegalStateException e2) {
            ax.Ha.c.i(context).f().b("START SCAN SERVICE FOREGROUND").l(e2).h();
        }
    }

    private InputStream P0(C3605y c3605y, long j) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(c3605y.F0());
        if (j != 0) {
            fileInputStream.skip(j);
        }
        return fileInputStream;
    }

    private void P1(ArrayList<ax.o3.f> arrayList, boolean z, int i) {
        O1(p(), arrayList, z, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r12.q() < java.lang.System.currentTimeMillis()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String Q0(java.lang.String r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = ax.X2.Q.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r13 == 0) goto L12
            android.net.Uri r13 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r0 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
            java.lang.String r2 = "video_id"
        L10:
            r4 = r13
            goto L19
        L12:
            android.net.Uri r13 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r0 = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI
            java.lang.String r2 = "image_id"
            goto L10
        L19:
            java.lang.String r13 = "_id"
            java.lang.String r9 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r13, r9}
            java.lang.String[] r7 = new java.lang.String[]{r12}
            r8 = 0
            java.lang.String r6 = "_data = ?"
            r3 = r11
            java.lang.String r4 = r3.G1(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L51
            java.lang.String[] r7 = new java.lang.String[]{r13, r9}
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            java.lang.String r2 = " = ?"
            r13.append(r2)
            java.lang.String r8 = r13.toString()
            java.lang.String[] r9 = new java.lang.String[]{r4}
            r10 = 1
            r5 = r11
            r6 = r0
            java.lang.String r13 = r5.G1(r6, r7, r8, r9, r10)
            r3 = r5
            goto L53
        L51:
            r3 = r11
            r13 = r1
        L53:
            if (r13 == 0) goto L84
            com.voxdon.xplorer.file.n r0 = r11.z(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L61
        L5f:
            r13 = r1
            goto L84
        L61:
            com.voxdon.xplorer.file.n r12 = r11.z(r12)
            boolean r2 = r12.n()
            if (r2 == 0) goto L84
            long r4 = r12.q()
            long r6 = r0.q()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L84
            long r4 = r12.q()
            long r6 = java.lang.System.currentTimeMillis()
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 >= 0) goto L84
            goto L5f
        L84:
            if (r13 == 0) goto L8e
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L8d
            goto L8e
        L8d:
            return r13
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3604x.Q0(java.lang.String, boolean):java.lang.String");
    }

    public static C3591j R0(Context context, List<AbstractC3595n> list) {
        C3605y c3605y;
        String str = null;
        ax.c3.K k = null;
        for (AbstractC3595n abstractC3595n : list) {
            if (C1809B.P(abstractC3595n)) {
                if ((abstractC3595n instanceof K) && ((K) abstractC3595n).C1()) {
                    try {
                        c3605y = C3605y.I0(abstractC3595n.E());
                    } catch (C1495j unused) {
                        c3605y = (C3605y) abstractC3595n;
                    }
                } else {
                    c3605y = (C3605y) abstractC3595n;
                }
                ax.c3.K B0 = c3605y.B0();
                if (B0.equals(k)) {
                    continue;
                } else {
                    if (C1(context, B0, c3605y)) {
                        if (ax.Q2.f.Q(B0) && c3605y.a1()) {
                            str = c3605y.M0();
                        }
                        return new C3591j(B0, str);
                    }
                    k = B0;
                }
            }
        }
        return null;
    }

    private boolean R1(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        C3605y c3605y = (C3605y) abstractC3595n;
        C3605y c3605y2 = (C3605y) abstractC3595n2;
        boolean i0 = c3605y.i0();
        if (i0 || (c3605y.B0() == ax.c3.K.f && c3605y.T0())) {
            return c3605y.B0() == ax.c3.K.e ? i0 && c3605y2.i0() : c3605y.B0() != ax.c3.K.f || i0 || c3605y2.i0();
        }
        return false;
    }

    private static synchronized Bitmap S0(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        PdfRenderer.Page page;
        PdfRenderer pdfRenderer;
        Bitmap createBitmap;
        synchronized (C3604x.class) {
            PdfRenderer pdfRenderer2 = null;
            try {
                pdfRenderer = new PdfRenderer(parcelFileDescriptor);
                try {
                    createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
                    createBitmap.eraseColor(-1);
                    page = pdfRenderer.openPage(0);
                } catch (Exception unused) {
                    page = null;
                } catch (Throwable th) {
                    th = th;
                    page = null;
                }
            } catch (Exception unused2) {
                page = null;
                pdfRenderer = null;
            } catch (Throwable th2) {
                th = th2;
                page = null;
            }
            try {
                page.render(createBitmap, null, null, 1);
                ax.c3.F.a(page);
                ax.c3.F.a(pdfRenderer);
                return createBitmap;
            } catch (Exception unused3) {
                if (pdfRenderer != null) {
                    ax.c3.F.a(page);
                    ax.c3.F.a(pdfRenderer);
                } else {
                    ax.c3.F.a(parcelFileDescriptor);
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                pdfRenderer2 = pdfRenderer;
                if (pdfRenderer2 != null) {
                    ax.c3.F.a(page);
                    ax.c3.F.a(pdfRenderer2);
                } else {
                    ax.c3.F.a(parcelFileDescriptor);
                }
                throw th;
            }
        }
    }

    private boolean S1() {
        return this.q && u() == ax.Q2.f.t0 && ax.Z2.j.F().q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    private C3605y V0(C3605y c3605y) throws C1495j {
        String E = c3605y.E();
        Uri N0 = c3605y.N0();
        ax.c3.K B0 = c3605y.B0();
        ?? e2 = C3588g.e(v(), N0, E);
        try {
            try {
                Cursor query = p().getContentResolver().query(e2, C1824l.g, null, null, null);
                try {
                    if (query == null) {
                        throw new C1495j("query return null");
                    }
                    if (!query.moveToFirst()) {
                        throw new ax.b3.t();
                    }
                    C3605y c3605y2 = new C3605y(this, N0, B0, d0.r(E), query);
                    ax.c3.F.a(query);
                    return c3605y2;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    throw new C1495j(e);
                } catch (Exception e4) {
                    e = e4;
                    Exception exc = e;
                    throw C1489d.a("getFileInfo : " + exc.getClass().getSimpleName() + ":" + exc.getMessage(), exc);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                ax.c3.F.a(e2);
                throw th2;
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            e2 = 0;
            Throwable th22 = th;
            ax.c3.F.a(e2);
            throw th22;
        }
    }

    private k0 W0(String str, long j) throws C1495j {
        UUID uuidForPath;
        long allocatableBytes;
        try {
            ax.X2.M o = ax.X2.v.o(str);
            if (j <= 0) {
                j = o.b * o.a;
            }
            long j2 = j;
            StorageManager storageManager = (StorageManager) p().getSystemService("storage");
            uuidForPath = storageManager.getUuidForPath(new File(str));
            allocatableBytes = storageManager.getAllocatableBytes(uuidForPath);
            return new k0(j2, j2 - allocatableBytes, 0);
        } catch (Exception e2) {
            throw new C1495j(e2);
        }
    }

    private k0 X0() throws C1495j {
        long j;
        int i;
        ax.Q2.f u2 = u();
        AbstractC3595n z = z(x());
        if (!z.n()) {
            throw new ax.b3.t("StorageSpaceIteration root file not found");
        }
        long j2 = 0;
        if (!z.isDirectory()) {
            if (u2 != ax.Q2.f.q0) {
                ax.Ha.c.h().f().d("RootPath is File").j().g(u2.I() + ":" + z.p()).h();
            } else if (z.p() == 0) {
                P(z);
                ax.Ha.c.h().c("Download root path file size 0 deleted").h();
            }
            throw new C1495j("Root path is file");
        }
        List<AbstractC3595n> g2 = ax.Z2.b.k().g(z);
        if (g2 == null) {
            g2 = b0(z);
        }
        C3601u.a C1 = z instanceof C ? ((C) z).C1() : null;
        int i2 = 0;
        if (g2 != null) {
            ArrayList arrayList = new ArrayList(g2);
            int size = arrayList.size();
            long j3 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                File F0 = ((C3605y) ((AbstractC3595n) obj)).F0();
                if (F0.exists()) {
                    i2 += C1809B.v(F0, C1);
                    j3 += C1809B.p(F0, C1);
                }
            }
            i = i2;
            j = j3;
        } else {
            j = 0;
            i = 0;
        }
        if (!TextUtils.isEmpty(x()) && !"/".equals(x())) {
            j2 = Y0().d;
        }
        return new k0(j, j, j2, i);
    }

    private k0 Y0() throws C1495j {
        String x2 = x();
        if (TextUtils.isEmpty(x2)) {
            ax.Ha.c.h().f().d("LOCAL STORAGE SPACE").g(u().I() + " " + x() + " (" + ax.Q2.e.z() + ")").h();
            throw new C1495j("no root path");
        }
        if (u() == ax.Q2.f.o0 && !ax.Z2.j.F().o0() && x2.equals("/storage/emulated/0")) {
            long totalSpace = Environment.getRootDirectory().getTotalSpace();
            long totalSpace2 = Environment.getDataDirectory().getTotalSpace();
            return Z0(x2, totalSpace > 1000000000000L ? K1(totalSpace2) : K1(totalSpace2 + totalSpace));
        }
        if ((u() != ax.Q2.f.p0 && u() != ax.Q2.f.v0 && u() != ax.Q2.f.x0 && u() != ax.Q2.f.w0) || !j1()) {
            return Z0(x2, 0L);
        }
        if (!ax.Q2.e.I()) {
            String x3 = C3588g.x(p(), v(), null);
            if (!TextUtils.isEmpty(x3)) {
                try {
                    return C3588g.k(p(), this, v(), Uri.parse(x3));
                } catch (C1495j unused) {
                }
            }
        }
        return Z0(x2, 0L);
    }

    private k0 Z0(String str, long j) throws C1495j {
        return ax.X2.Q.P1() ? b1(str, j) : a1(str, j);
    }

    private k0 a1(String str, long j) {
        File file = new File(str);
        if (j <= 0) {
            j = file.getTotalSpace();
        }
        long j2 = j;
        return new k0(j2, j2 - file.getUsableSpace(), 0);
    }

    private k0 b1(String str, long j) throws C1495j {
        try {
            ax.X2.M o = ax.X2.v.o(str);
            long j2 = j > 0 ? j : o.b * o.a;
            long j3 = o.c;
            long j4 = o.a;
            Long.signum(j3);
            long j5 = j2 - (j3 * j4);
            if (ax.X2.J.F() && u() == ax.Q2.f.o0 && j2 > 1000000000000L && (j5 * 100) / j2 >= 95) {
                long j6 = j2 - (o.d * o.a);
                if (j6 > 0 && (j6 * 100) / j2 < 95) {
                    return new k0(j2, j6, 0);
                }
                if (ax.X2.Q.S0()) {
                    k0 W0 = W0(str, j);
                    long j7 = W0.b;
                    if (j7 != 0) {
                        long j8 = W0.a;
                        if (j8 > 0 && (j8 * 100) / j7 < 95) {
                            return W0;
                        }
                    }
                }
                String Q = d0.Q(str, "DCIM");
                if (new File(Q).exists()) {
                    try {
                        k0 a1 = a1(Q, j);
                        long j9 = a1.b;
                        if (j9 != 0) {
                            long j10 = a1.a;
                            if (j10 > 0 && (j10 * 100) / j9 < 95) {
                                return a1;
                            }
                        }
                        return new k0(j2, j5, 0);
                    } catch (Exception e2) {
                        e = e2;
                        throw new C1495j(e);
                    }
                }
            }
            return new k0(j2, j5, 0);
        } catch (Exception e3) {
            e = e3;
        }
    }

    private InputStream e1(String str) {
        if (new File(str).length() == 0) {
            return C2945b.n();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return (options.outWidth <= 0 || options.outHeight <= 0) ? C2945b.n() : x1(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream f1(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = r5.Q0(r6, r0)
            if (r1 != 0) goto L6f
            com.voxdon.xplorer.file.n r1 = r5.z(r6)
            com.voxdon.xplorer.file.y r1 = (com.voxdon.xplorer.file.C3605y) r1
            boolean r2 = r1.k0()
            r3 = 512(0x200, float:7.175E-43)
            r4 = 0
            if (r2 == 0) goto L49
            android.os.ParcelFileDescriptor r0 = r1.e0(r0)     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33
            android.content.Context r1 = r5.p()     // Catch: java.lang.Throwable -> L2c ax.b3.C1495j -> L2f
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L2c ax.b3.C1495j -> L2f
            android.graphics.Bitmap r6 = ax.u3.C3180B.g(r1, r4, r2, r4, r3)     // Catch: java.lang.Throwable -> L2c ax.b3.C1495j -> L2f
        L26:
            r0.close()     // Catch: java.io.IOException -> L2a
            goto L51
        L2a:
            goto L51
        L2c:
            r6 = move-exception
            r4 = r0
            goto L43
        L2f:
            r1 = move-exception
            goto L35
        L31:
            r6 = move-exception
            goto L43
        L33:
            r1 = move-exception
            r0 = r4
        L35:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            android.content.Context r1 = r5.p()     // Catch: java.lang.Throwable -> L2c
            android.graphics.Bitmap r6 = ax.u3.C3180B.g(r1, r6, r4, r4, r3)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L51
            goto L26
        L43:
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.io.IOException -> L48
        L48:
            throw r6
        L49:
            android.content.Context r0 = r5.p()
            android.graphics.Bitmap r6 = ax.u3.C3180B.g(r0, r6, r4, r4, r3)
        L51:
            if (r6 != 0) goto L57
            android.graphics.Bitmap r6 = ax.s3.C3045a.b()
        L57:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.<init>(r1)
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 0
            r6.compress(r1, r2, r0)
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r6.<init>(r0)
            return r6
        L6f:
            java.io.InputStream r6 = r5.x1(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3604x.f1(java.lang.String):java.io.InputStream");
    }

    static boolean h1(AbstractC3595n abstractC3595n) {
        if (!ax.X2.Q.L() || !C1809B.P(abstractC3595n)) {
            return false;
        }
        try {
            C3605y c3605y = (C3605y) abstractC3595n;
            if (c3605y.B0() != ax.c3.K.e && c3605y.B0() != ax.c3.K.f) {
                return false;
            }
            return d0.J("/Android/data", c3605y.C0(), true);
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().f().b("SUBDIRECTORY ERROR").l(e2).h();
            return false;
        }
    }

    static boolean i1(AbstractC3595n abstractC3595n) {
        if (!C1809B.P(abstractC3595n)) {
            return false;
        }
        try {
            C3605y c3605y = (C3605y) abstractC3595n;
            if (c3605y.B0() != ax.c3.K.e && (c3605y.B0() != ax.c3.K.f || !ax.X2.Q.L())) {
                return false;
            }
            return d0.J("/Android/obb", c3605y.C0(), true);
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().f().b("SUBDIRECTORY ERROR").l(e2).h();
            return false;
        }
    }

    private boolean j1() {
        if (!ax.X2.Q.V1()) {
            return false;
        }
        return !ax.Z2.j.F().j0(v());
    }

    private boolean k1(String str) {
        return str == null || "vnd.android.document/directory".equals(str);
    }

    private boolean l1(Exception exc) {
        if ("AccessDeniedException".equals(exc.getClass().getSimpleName()) || "DirectoryNotEmptyException".equals(exc.getClass().getSimpleName())) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().endsWith("Operation not permitted");
    }

    private boolean m1() {
        if (this.p == null) {
            this.p = Boolean.valueOf(ax.Q2.f.s0(u()));
        }
        return this.p.booleanValue();
    }

    private boolean n1(C3605y c3605y) {
        return (!ax.Q2.f.k0(c3605y.P()) || c3605y.a1() || J.j2(c3605y) || c3605y.E().endsWith(".tmp")) ? false : true;
    }

    private void o0(C3605y c3605y, ax.c3.K k, File[] fileArr, List<AbstractC3595n> list, boolean z) {
        boolean z2;
        ax.c3.K k2;
        boolean V0 = c3605y.V0();
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            File file = fileArr[i];
            String name = file.getName();
            if (d0.C(name)) {
                k2 = k;
                z2 = z;
            } else {
                if (u() == ax.Q2.f.t0 && file.isDirectory()) {
                    z2 = z;
                    list.add(new C3605y(this, c3605y.F0(), file, (ax.c3.K) null, z2));
                } else {
                    z2 = z;
                    if (V0 && ax.c3.I.a(c3605y.R()) && ("data".equals(name) || "obb".equals(name))) {
                        list.add(z(file.getAbsolutePath()));
                    } else {
                        k2 = k;
                        list.add(new C3605y(this, c3605y.F0(), file, k2, z2));
                    }
                }
                k2 = k;
            }
            i++;
            k = k2;
            z = z2;
        }
    }

    public static boolean o1(Context context, ax.c3.K k, Uri uri) {
        String uri2 = uri.toString();
        if (uri2 == null) {
            ax.Ha.c.h().d("DOCUMENT TREE URI ERROR 1").g(uri.toString()).h();
            return false;
        }
        if (uri2.lastIndexOf("/") < 0) {
            ax.Ha.c.h().d("DOCUMENT TREE URI ERROR 2").g(uri.toString()).h();
            return false;
        }
        String substring = uri2.substring(uri2.lastIndexOf("/"));
        String h = d0.h(k.e());
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(h);
        return substring.startsWith(sb.toString());
    }

    private void p0(AbstractC3595n abstractC3595n, boolean z, boolean z2) {
        if (D0(abstractC3595n, true)) {
            return;
        }
        r0(abstractC3595n, false, true, false, false, z, z2);
    }

    private boolean p1(AbstractC3595n abstractC3595n) {
        C3605y c3605y = (C3605y) abstractC3595n;
        ax.Q2.f u2 = u();
        ax.Q2.f fVar = ax.Q2.f.t0;
        return u2 == fVar || c3605y.B0().d() == fVar;
    }

    private void q0(AbstractC3595n abstractC3595n, boolean z, boolean z2, boolean z3) {
        Stack stack = new Stack();
        stack.push(abstractC3595n);
        while (stack.size() > 0) {
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
            C3604x c3604x = this;
            c3604x.r0(abstractC3595n2, false, true, z, z2, z3, false);
            try {
                for (AbstractC3595n abstractC3595n3 : c3604x.b0(abstractC3595n2)) {
                    if (abstractC3595n3.isDirectory()) {
                        stack.push(abstractC3595n3);
                    } else {
                        c3604x.r0(abstractC3595n3, false, false, z, z2, z3, false);
                    }
                    c3604x = this;
                }
            } catch (C1495j unused) {
            }
        }
    }

    private void r0(AbstractC3595n abstractC3595n, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        HashSet<String> hashSet;
        ax.o3.f fVar;
        synchronized (this.m) {
            try {
                String E = abstractC3595n.E();
                if (this.k.containsKey(E) && (fVar = this.k.get(E)) != null) {
                    this.i.remove(fVar);
                    this.k.remove(E);
                    if (!fVar.q && z && fVar.i0) {
                        return;
                    }
                }
                if (z2 && z) {
                    Iterator<ax.o3.f> it = this.i.iterator();
                    while (it.hasNext()) {
                        ax.o3.f next = it.next();
                        if (d0.J(E, next.c0, true)) {
                            it.remove();
                            this.k.remove(next.c0);
                        }
                    }
                }
                ax.o3.f fVar2 = new ax.o3.f(E, abstractC3595n.P().K(), abstractC3595n.L(), abstractC3595n.q(), z, z2, z3, z4, z5, z6);
                this.k.put(E, fVar2);
                this.i.add(fVar2);
                if (ax.X2.Q.X1() && (hashSet = this.n) != null && hashSet.contains(abstractC3595n.T())) {
                    fVar2.n0 = true;
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.voxdon.xplorer.file.AbstractC3595n> r1(com.voxdon.xplorer.file.AbstractC3595n r9) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3604x.r1(com.voxdon.xplorer.file.n):java.util.List");
    }

    private List<AbstractC3595n> s1(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            Cursor query = p().getContentResolver().query(n0.c("external"), y, "bucket_id=? AND bucket_display_name=?", new String[]{String.valueOf(abstractC3595n.E().toLowerCase(Locale.ROOT).hashCode()), abstractC3595n.B()}, "_data asc");
            if (query == null) {
                return null;
            }
            if (query.getCount() <= 0) {
                query.close();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ax.c3.K B0 = ((C3605y) abstractC3595n).B0();
            ax.X2.L l = new ax.X2.L();
            long j = 0;
            C3605y c3605y = null;
            while (query.moveToNext()) {
                A B02 = B0(B0, query, l);
                C3605y A0 = A0(B0, B02);
                long j2 = B02.e;
                if (c3605y != null && c3605y.E().equalsIgnoreCase(A0.E())) {
                    if (j2 > j) {
                        arrayList.remove(c3605y);
                    }
                }
                arrayList.add(A0);
                c3605y = A0;
                j = j2;
            }
            query.close();
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean t0(Context context, C3605y c3605y) {
        if (c3605y.b1()) {
            if (!c3605y.j() && !c3605y.d1()) {
                List<AbstractC3595n> p = C1011c.q().p();
                if (p != null && p.size() == 1) {
                    AbstractC3595n abstractC3595n = p.get(0);
                    if (abstractC3595n.isDirectory() && abstractC3595n.B().contains(".")) {
                        if (C3588g.C(context, c3605y.B0(), d0.Q(c3605y.M0(), abstractC3595n.B()))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private void t1(AbstractC3595n abstractC3595n, List<AbstractC3595n> list, ax.c3.K k) {
        if (ax.Q2.f.Q(k)) {
            for (ax.U2.f fVar : ax.U2.d.F(p()).B()) {
                if (!TextUtils.isEmpty(fVar.r())) {
                    File file = new File(d0.Q(abstractC3595n.E(), fVar.r()));
                    if (file.exists()) {
                        list.add(new C3605y(this, file, k));
                    } else if (ax.X2.Q.j() && fVar.B()) {
                        C3605y c3605y = new C3605y(this, file, k, true, false, true, false, 0L, 0L);
                        if (c3605y.T0()) {
                            c3605y.q1();
                            if (c3605y.n()) {
                                list.add(c3605y);
                            } else {
                                ax.Z2.n.b(p()).e(p());
                            }
                        } else {
                            c3605y.j1(true);
                            list.add(c3605y);
                        }
                    }
                }
            }
        }
    }

    private boolean u0() {
        return ax.Z2.j.F().q();
    }

    private void v0(AbstractC3595n abstractC3595n) throws C1495j {
        if (!abstractC3595n.n()) {
            ax.Ha.c.h().f().d("LLISTCH0").j().g("Location = " + u().I()).h();
            throw new ax.b3.t();
        }
        if (abstractC3595n.isDirectory()) {
            return;
        }
        ax.Ha.c.h().d("LLISTCH1").g(abstractC3595n.isDirectory() + ":" + abstractC3595n.n()).h();
        throw new C1495j("file is not directory");
    }

    private void v1(List<AbstractC3595n> list, ax.c3.K k) {
        File file = new File("/storage/emulated");
        if (file.exists()) {
            list.add(new C3605y(this, file, k));
        }
    }

    private void w0() {
        this.i.clear();
        this.k.clear();
        this.j = false;
    }

    private void w1(List<AbstractC3595n> list, ax.c3.K k) {
        Iterator<String> it = u.iterator();
        while (it.hasNext()) {
            File file = new File("/storage/emulated/", it.next());
            if (file.exists()) {
                list.add(new C3605y(this, file, k));
            }
        }
    }

    private InputStream x1(String str) {
        try {
            C3605y c3605y = (C3605y) z(str);
            return new C1852a(new BufferedInputStream(J(c3605y, 0L), 32768), (int) c3605y.p());
        } catch (C1495j unused) {
            return null;
        }
    }

    private boolean y0(C3605y c3605y) throws C1495j {
        Uri d2 = C3588g.d(this, c3605y, true);
        if (d2 == null) {
            return false;
        }
        if (".$recycle_bin$".equals(c3605y.B())) {
            J.A = d2;
        }
        return true;
    }

    private void y1(AbstractC3594m abstractC3594m, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        Context p = abstractC3594m.p();
        boolean equals = abstractC3595n.T().equals(abstractC3595n2.T());
        boolean isDirectory = abstractC3595n.isDirectory();
        boolean B1 = B1(abstractC3595n);
        if (equals) {
            C3605y c3605y = (C3605y) abstractC3595n;
            if (ax.Z2.j.F().E0(c3605y.B0()) && c3605y.Z0()) {
                throw new C1490e("/Android/data package folders cannot be renamed from Android 13");
            }
            C3588g.M(p, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            if (ax.X2.Q.d0()) {
                L1(abstractC3595n, isDirectory, true);
                M1(z(abstractC3595n2.E()), true, B1, true, false);
                return;
            }
            return;
        }
        if (ax.X2.Q.I0() && Q(abstractC3595n, abstractC3595n2)) {
            C3588g.K(p, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            if (ax.X2.Q.d0()) {
                L1(abstractC3595n, isDirectory, true);
                M1(z(abstractC3595n2.E()), true, B1, true, false);
                return;
            }
            return;
        }
        if (!abstractC3595n.isDirectory()) {
            z1(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            return;
        }
        C3605y c3605y2 = (C3605y) abstractC3595n;
        C3605y c3605y3 = (C3605y) abstractC3595n2;
        if (!ax.X2.Q.L() || c3605y2.P0() == c3605y3.P0()) {
            ax.Ha.c.h().f().b("MOVE ERROR").j().g("location:" + c3605y2.P() + "," + c3605y3.P()).h();
        }
        throw new C1495j("treespace problem : doesSupportMoveFileToDifferentParent() == false");
    }

    private void z1(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.c(!abstractC3595n.isDirectory());
        try {
            F(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            long p = abstractC3595n.p();
            P(abstractC3595n);
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (C1486a e2) {
            P(abstractC3595n2);
            throw e2;
        } catch (C1495j e3) {
            P(abstractC3595n2);
            throw e3;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        C3605y c3605y = (C3605y) z(str2);
        return d1(c3605y.K0(), c3605y.A(), c3605y.s());
    }

    public C3605y A0(ax.c3.K k, A a2) {
        C3605y c3605y = new C3605y(this, new File(a2.a), k, a2.b, false, true, true, a2.d, a2.c);
        Long l = a2.f;
        if (l != null) {
            c3605y.i1(l.longValue());
        }
        return c3605y;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        if (abstractC3595n != null) {
            return !((C3605y) abstractC3595n).i0() || ax.X2.Q.I0();
        }
        C3184b.f();
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        HashSet<String> hashSet;
        List<AbstractC3595n> s1;
        v0(abstractC3595n);
        C3605y c3605y = (C3605y) abstractC3595n;
        if (!c3605y.m0() || c3605y.o1()) {
            return (ax.X2.Q.h1() && ax.Q2.f.g0(abstractC3595n.P()) && (((hashSet = this.n) != null && hashSet.contains(abstractC3595n.E())) || fVar == AbstractC3594m.f.USE_MEDIA_STORE) && (s1 = s1(abstractC3595n)) != null && s1.size() != 0) ? s1 : r1(abstractC3595n);
        }
        try {
            return C3588g.J(this, abstractC3595n);
        } catch (C1495j e2) {
            if (ax.Z2.j.F().E0(c3605y.B0()) && c3605y.Z0() && ax.Z2.n.b(p()).c(p(), c3605y)) {
                try {
                    ax.Z2.n.b(p()).e(p());
                    c3605y.x1();
                } catch (ax.b3.r unused) {
                }
            }
            e2.printStackTrace();
            return r1(abstractC3595n);
        } catch (RuntimeException e3) {
            ax.Ha.c.h().b("listchildren local document runtime").l(e3).h();
            return r1(abstractC3595n);
        }
    }

    public void C0(AbstractC3595n abstractC3595n) throws C1495j {
        if (!abstractC3595n.isDirectory()) {
            P(abstractC3595n);
            return;
        }
        Iterator<AbstractC3595n> it = b0(abstractC3595n).iterator();
        while (it.hasNext()) {
            C0(it.next());
        }
        P(abstractC3595n);
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x018c: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:397), block:B:181:0x018b */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026c A[Catch: all -> 0x01bf, TryCatch #23 {all -> 0x01bf, blocks: (B:86:0x0163, B:95:0x0197, B:98:0x01a1, B:100:0x01ad, B:102:0x01d1, B:104:0x01d9, B:105:0x01e3, B:111:0x01c8, B:171:0x01f7, B:172:0x01fd, B:142:0x0228, B:144:0x0230, B:131:0x0241, B:134:0x0262, B:136:0x026c, B:137:0x0273, B:138:0x0274, B:139:0x027a), top: B:77:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0274 A[Catch: all -> 0x01bf, TryCatch #23 {all -> 0x01bf, blocks: (B:86:0x0163, B:95:0x0197, B:98:0x01a1, B:100:0x01ad, B:102:0x01d1, B:104:0x01d9, B:105:0x01e3, B:111:0x01c8, B:171:0x01f7, B:172:0x01fd, B:142:0x0228, B:144:0x0230, B:131:0x0241, B:134:0x0262, B:136:0x026c, B:137:0x0273, B:138:0x0274, B:139:0x027a), top: B:77:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(com.voxdon.xplorer.file.AbstractC3595n r21, ax.c3.G r22, java.lang.String r23, long r24, java.lang.Long r26, com.voxdon.xplorer.file.C3597p r27, boolean r28, ax.u3.InterfaceC3185c r29, ax.g3.i r30) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3604x.D(com.voxdon.xplorer.file.n, ax.c3.G, java.lang.String, long, java.lang.Long, com.voxdon.xplorer.file.p, boolean, ax.u3.c, ax.g3.i):void");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        C3605y c3605y = (C3605y) abstractC3595n;
        C3605y c3605y2 = (C3605y) abstractC3595n2;
        if (c3605y.d1()) {
            long p = abstractC3595n.p();
            boolean isDirectory = abstractC3595n.isDirectory();
            if (!com.voxdon.xplorer.shizuku.c.t().H(abstractC3595n.E(), abstractC3595n2.E())) {
                F1(abstractC3595n, abstractC3595n2, null);
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
            if (n1(c3605y)) {
                L1(abstractC3595n, isDirectory, true);
            }
            if (n1(c3605y2)) {
                M1(z(abstractC3595n2.E()), false, B1(abstractC3595n), true, false);
                return;
            }
            return;
        }
        if (R1(abstractC3595n, abstractC3595n2)) {
            y1(this, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
            return;
        }
        long p2 = abstractC3595n.p();
        boolean isDirectory2 = abstractC3595n.isDirectory();
        C3605y c3605y3 = (C3605y) abstractC3595n;
        if (ax.X2.Q.P0()) {
            boolean z = false;
            try {
                Path path = Paths.get(c3605y3.K0(), new String[0]);
                Path path2 = Paths.get(c3605y2.K0(), new String[0]);
                if (path != null && path2 != null && !path.getFileSystem().equals(path2.getFileSystem())) {
                    C3184b.f();
                }
                try {
                    Files.move(path, path2, new CopyOption[0]);
                } catch (IOException | SecurityException e2) {
                    if ((!ax.X2.Q.e() || !l1(e2) || (!i1(abstractC3595n2) && !i1(abstractC3595n))) && ((!ax.X2.Q.L() || !l1(e2) || (!c3605y2.a1() && !c3605y3.a1())) && (!ax.X2.Q.L() || !l1(e2) || ((!h1(abstractC3595n) && !h1(abstractC3595n2)) || !abstractC3595n.isDirectory())))) {
                        e2.printStackTrace();
                        if (!c3605y3.F0().renameTo(c3605y2.F0())) {
                            F1(abstractC3595n, abstractC3595n2, e2);
                        }
                    }
                    if (abstractC3595n.isDirectory()) {
                        A1(c3605y3, c3605y2, interfaceC3185c, iVar);
                        return;
                    } else {
                        z1(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
                        return;
                    }
                }
            } catch (RuntimeException e3) {
                if (c3605y3.F0().renameTo(c3605y2.F0())) {
                    z = true;
                } else {
                    F1(abstractC3595n, abstractC3595n2, null);
                }
                ax.Ha.c.h().f().b("moveFile InvalidPath").l(e3).g("retry success=" + z).h();
            }
        } else if (!c3605y3.F0().renameTo(c3605y2.F0())) {
            F1(abstractC3595n, abstractC3595n2, null);
        }
        if (iVar != null) {
            iVar.a(p2, p2);
        }
        boolean B1 = B1(abstractC3595n);
        L1(abstractC3595n, isDirectory2, true);
        M1((C3605y) J1(c3605y2), false, B1, true, false);
    }

    public void E0(ax.g3.i iVar) {
        synchronized (this.m) {
            try {
                if (this.i.size() == 0) {
                    return;
                }
                ArrayList<ax.o3.f> arrayList = new ArrayList<>(this.i);
                w0();
                int size = arrayList.size();
                ax.c3.M.b(p(), arrayList, iVar);
                ax.c3.M.c(p(), arrayList, true, iVar);
                H0(arrayList, size, iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return c1(str, str2, ((C3605y) z(str2)).s());
    }

    public void G0() {
        synchronized (this.m) {
            try {
                if (this.i.size() == 0) {
                    return;
                }
                ArrayList<ax.o3.f> arrayList = new ArrayList<>(this.i);
                w0();
                if (ax.X2.Q.U() || ax.X2.Q.T()) {
                    ax.c3.M.f(p(), arrayList);
                    if (arrayList.size() == 0) {
                        return;
                    }
                }
                F0(arrayList);
                if (arrayList.size() > 0) {
                    new d(arrayList, 500L).h(new Long[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        if (u() == ax.Q2.f.t0 && !abstractC3595n.d()) {
            if (EnumC1837z.IMAGE != abstractC3595n.G()) {
                return null;
            }
        }
        return C1809B.Y(abstractC3595n);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0027: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:40), block:B:32:0x0027 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> H1(com.voxdon.xplorer.file.AbstractC3595n r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33 java.io.IOException -> L36
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33 java.io.IOException -> L36
            r4 = 0
            java.io.InputStream r7 = r6.J(r7, r4)     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33 java.io.IOException -> L36
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33 java.io.IOException -> L36
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 ax.b3.C1495j -> L33 java.io.IOException -> L36
        L16:
            java.lang.String r7 = r2.readLine()     // Catch: java.lang.Throwable -> L26 ax.b3.C1495j -> L29 java.io.IOException -> L2b
            if (r7 == 0) goto L2d
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Throwable -> L26 ax.b3.C1495j -> L29 java.io.IOException -> L2b
            if (r3 != 0) goto L16
            r0.add(r7)     // Catch: java.lang.Throwable -> L26 ax.b3.C1495j -> L29 java.io.IOException -> L2b
            goto L16
        L26:
            r7 = move-exception
            r1 = r2
            goto L53
        L29:
            r7 = move-exception
            goto L38
        L2b:
            r7 = move-exception
            goto L38
        L2d:
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            return r0
        L31:
            r7 = move-exception
            goto L53
        L33:
            r7 = move-exception
        L34:
            r2 = r1
            goto L38
        L36:
            r7 = move-exception
            goto L34
        L38:
            ax.Ha.b r0 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> L26
            ax.Ha.b r0 = r0.f()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "DOT_HIDDEN READ ERROR"
            ax.Ha.b r0 = r0.d(r3)     // Catch: java.lang.Throwable -> L26
            ax.Ha.b r7 = r0.l(r7)     // Catch: java.lang.Throwable -> L26
            r7.h()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L52
        L52:
            return r1
        L53:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3604x.H1(com.voxdon.xplorer.file.n):java.util.List");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    protected void I0(AbstractC3595n abstractC3595n, List<AbstractC3595n> list, boolean z, String str, boolean z2, ax.g3.h hVar) {
        hVar.Y(C1809B.h(list, str, z2, true), z);
    }

    public boolean I1(AbstractC3595n abstractC3595n) {
        List<String> H1;
        OutputStreamWriter outputStreamWriter;
        String Q = d0.Q(abstractC3595n.T(), ".hidden");
        AbstractC3595n z = z(Q);
        if (!z.n() || (H1 = H1(z)) == null) {
            return false;
        }
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            try {
                outputStreamWriter = new OutputStreamWriter(c(Q, false));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            boolean z2 = true;
            for (String str : H1) {
                if (!z2) {
                    outputStreamWriter.write("\n");
                }
                if (!str.equals(abstractC3595n.B())) {
                    outputStreamWriter.write(str);
                    if (z2) {
                        z2 = false;
                    }
                }
            }
            try {
                outputStreamWriter.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (IOException e3) {
            e = e3;
            outputStreamWriter2 = outputStreamWriter;
            e.printStackTrace();
            if (outputStreamWriter2 != null) {
                try {
                    outputStreamWriter2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter2 = outputStreamWriter;
            if (outputStreamWriter2 != null) {
                try {
                    outputStreamWriter2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        long j2;
        long j3;
        C3605y c3605y = (C3605y) abstractC3595n;
        try {
            try {
                try {
                    if (!c3605y.m0()) {
                        if (!c3605y.d1()) {
                            return P0(c3605y, j);
                        }
                        InputStream s2 = com.voxdon.xplorer.shizuku.c.t().s(abstractC3595n.E(), j);
                        return c3605y.a1() ? new e(s2, c3605y.p(), j) : s2;
                    }
                    try {
                        InputStream t2 = C3588g.t(p(), abstractC3595n, j);
                        if (!c3605y.a1()) {
                            return t2;
                        }
                        try {
                            return new e(t2, c3605y.p(), j);
                        } catch (C1495j unused) {
                            j3 = j;
                            return P0(c3605y, j3);
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            j2 = j;
                            FileNotFoundException fileNotFoundException = e;
                            if (ax.Z2.j.F().q0() && C3606z.Y().m(abstractC3595n.E())) {
                                FileInputStream w2 = ax.t3.j.k(p()) ? C3606z.Y().w(abstractC3595n, j2) : C3606z.Y().z(abstractC3595n, j2);
                                if (w2 != null) {
                                    return w2;
                                }
                            }
                            C1495j c2 = C1489d.c("getInputStream", fileNotFoundException, false);
                            if (c2 != null) {
                                throw c2;
                            }
                            throw new ax.b3.t(fileNotFoundException);
                        }
                    } catch (C1495j unused2) {
                        j3 = j;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                throw new C1495j(e4);
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            j2 = j;
        }
    }

    protected AbstractC3595n J1(C3605y c3605y) {
        AbstractC3595n M0;
        String F = c3605y.F();
        C3605y z0 = z0(new File(F), c3605y.B0(), c3605y.f1());
        z0.t0(c3605y);
        return (ax.X2.Q.L() && z0.a1() && (M0 = M0(z0, F)) != null) ? M0 : z0;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        aVar.B();
        aVar.T(true, null);
    }

    protected InputStream K0(String str) {
        byte[] k = C3180B.k(p(), str, null);
        if (k != null) {
            return new ByteArrayInputStream(k);
        }
        String G1 = G1(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"album_id", "_data"}, "_data = ?", new String[]{str}, 0);
        String G12 = G1 != null ? G1(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"album_art", "album"}, "_id = ? AND album_art IS NOT NULL", new String[]{G1}, 0) : null;
        if (G12 == null || G12.isEmpty() || !((C3605y) z(G12)).n()) {
            return null;
        }
        return x1(G12);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    protected AbstractC3595n L0(String str, ax.c3.K k) {
        return z0(new File(str), k, false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.n()) {
            return false;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.d1()) {
            return com.voxdon.xplorer.shizuku.c.t().o(abstractC3595n.E());
        }
        if (c3605y.i0()) {
            try {
                return y0((C3605y) abstractC3595n);
            } catch (C1495j unused) {
                return false;
            }
        }
        boolean mkdir = c3605y.F0().mkdir();
        if (mkdir) {
            p0(abstractC3595n, false, true);
        }
        return (!mkdir && u0() && p1(abstractC3595n)) ? C3606z.Y().i(abstractC3595n.E()) : mkdir;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.n()) {
            return false;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.d1()) {
            return com.voxdon.xplorer.shizuku.c.t().p(abstractC3595n.E());
        }
        if (c3605y.i0()) {
            try {
                if (C3588g.d(this, abstractC3595n, false) != null) {
                    M1(z(abstractC3595n.E()), false, false, false, true);
                    return true;
                }
            } catch (C1495j unused) {
            }
            return false;
        }
        try {
            boolean createNewFile = ((C3605y) abstractC3595n).F0().createNewFile();
            if (!createNewFile) {
                return createNewFile;
            }
            M1(z(abstractC3595n.E()), false, false, false, true);
            return createNewFile;
        } catch (IOException e2) {
            if (u0() && p1(abstractC3595n)) {
                return C3606z.Y().h(abstractC3595n.E());
            }
            e2.printStackTrace();
            return false;
        }
    }

    protected InputStream N0(String str) {
        String Q0 = Q0(str, false);
        if (Q0 == null) {
            this.h.put(str, Boolean.FALSE);
            return x1(str);
        }
        this.h.put(str, Boolean.TRUE);
        return x1(Q0);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        boolean z;
        String[] list;
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.d1()) {
            boolean isDirectory = abstractC3595n.isDirectory();
            if (com.voxdon.xplorer.shizuku.c.t().q(abstractC3595n.E())) {
                if (n1(c3605y)) {
                    L1(abstractC3595n, isDirectory, false);
                    return;
                }
                return;
            } else {
                c3605y.q1();
                if (!c3605y.n()) {
                    throw new ax.b3.t("Shizuku.delete failed : not exist");
                }
                throw new C1495j("Shizuku.delete failed.");
            }
        }
        if (c3605y.i0()) {
            C3588g.g(this, abstractC3595n);
            if (ax.X2.Q.G0()) {
                return;
            }
            L1(abstractC3595n, abstractC3595n.isDirectory(), false);
            return;
        }
        boolean isDirectory2 = abstractC3595n.isDirectory();
        if (isDirectory2 && (list = c3605y.F0().list()) != null && list.length > 0) {
            throw new C1496k("File.delete directory that has children");
        }
        Throwable th = null;
        if (ax.X2.Q.P0()) {
            try {
                Files.delete(Paths.get(c3605y.K0(), new String[0]));
                z = true;
            } catch (IOException | RuntimeException e2) {
                th = e2;
                z = false;
            }
        } else {
            z = c3605y.F0().delete();
        }
        if (ax.X2.J.f() && z) {
            File F0 = c3605y.F0();
            if (F0.exists()) {
                File u2 = C1809B.u(F0);
                if (F0.renameTo(u2)) {
                    u2.delete();
                }
            }
        }
        if (z) {
            L1(abstractC3595n, isDirectory2, false);
            return;
        }
        if (u0() && p1(abstractC3595n) && C3606z.Y().j(abstractC3595n.E())) {
            return;
        }
        c3605y.q1();
        if (!c3605y.n()) {
            throw new ax.b3.t("File.delete failed : File not exist");
        }
        if (abstractC3595n.P() == ax.Q2.f.t0 && !abstractC3595n.j()) {
            throw new ax.b3.w("Read only system file.delete failed");
        }
        if (th == null) {
            throw new C1495j("File.delete failed dir=" + isDirectory2 + ",exists=true");
        }
        throw new C1495j("File.delete failed dir=:" + isDirectory2 + ":" + th.getMessage(), th);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        if (C1809B.P(abstractC3595n) && C1809B.P(abstractC3595n2)) {
            return C3605y.c1((C3605y) abstractC3595n, (C3605y) abstractC3595n2);
        }
        C3184b.f();
        return abstractC3595n.P() == abstractC3595n2.P();
    }

    public void Q1(AbstractC3595n abstractC3595n) {
        ArrayList<ax.o3.f> arrayList = new ArrayList<>();
        arrayList.add(new ax.o3.f(abstractC3595n.E(), abstractC3595n.P().K(), abstractC3595n.L(), abstractC3595n.q(), false, false, false, true, false, false));
        P1(arrayList, false, 10000);
    }

    protected InputStream T0(String str) {
        Bitmap S0;
        int s2 = (int) (C3180B.s(p()) * 128.0f);
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(new File(str), 268435456);
            if (open == null || (S0 = S0(open, s2, s2)) == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
            S0.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            S0.recycle();
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    public ParcelFileDescriptor U0(C3605y c3605y) throws C1495j {
        try {
            return (ax.X2.Q.F1() && c3605y.d1()) ? com.voxdon.xplorer.shizuku.c.t().x(c3605y.E()) : !c3605y.i0() ? ParcelFileDescriptor.open(c3605y.F0(), 805306368) : C3588g.w(p(), c3605y);
        } catch (IOException e2) {
            throw new C1495j(e2);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void W(Context context, ax.c3.K k) {
        super.W(context, k);
        if (ax.X2.Q.V1()) {
            this.l = new C3588g(context);
        }
        if (k == ax.c3.K.e || ax.Q2.f.g0(k.d())) {
            this.n = new HashSet<>();
            Iterator<String> it = v.iterator();
            while (it.hasNext()) {
                this.n.add(d0.P(ax.c3.K.e.e(), it.next()));
            }
            this.o = new HashSet<>();
            Iterator<String> it2 = x.iterator();
            while (it2.hasNext()) {
                this.o.add(d0.P(ax.c3.K.e.e(), it2.next()));
            }
        }
        ax.c3.K k2 = ax.c3.K.f;
        if (k == k2 || ax.Q2.f.g0(k.d())) {
            if (this.n == null) {
                this.n = new HashSet<>();
            }
            if (!ax.Z2.j.F().t0() || TextUtils.isEmpty(k2.e())) {
                return;
            }
            Iterator<String> it3 = w.iterator();
            while (it3.hasNext()) {
                this.n.add(d0.P(ax.c3.K.f.e(), it3.next()));
            }
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
    }

    @Override // ax.c3.X
    public OutputStream c(String str, boolean z) throws IOException {
        C3605y c3605y = (C3605y) z(str);
        if (ax.X2.Q.F1() && c3605y.d1()) {
            return com.voxdon.xplorer.shizuku.c.t().v(str, z);
        }
        if (c3605y.i0()) {
            try {
                return C3588g.u(this, c3605y, z);
            } catch (C1495j e2) {
                throw new IOException(e2);
            }
        }
        if (!u0() || !p1(c3605y)) {
            return new c(this, c3605y, z, !c3605y.n());
        }
        try {
            return new c(this, c3605y, z, !c3605y.n());
        } catch (IOException unused) {
            FileOutputStream D = C3606z.Y().D(c3605y, z);
            if (D != null) {
                return D;
            }
            throw new FileNotFoundException("failed to open outputstream using root");
        }
    }

    protected int c1(String str, String str2, String str3) {
        Boolean bool;
        try {
            if (str3.startsWith("image") && (bool = this.h.get(str2)) != null && bool.booleanValue()) {
                return new C3495a(str2).l("Orientation", 0);
            }
            return -1;
        } catch (FileNotFoundException | IOException unused) {
            return -1;
        }
    }

    @Override // ax.c3.i0
    public boolean d(AbstractC3595n abstractC3595n, long j) {
        if (j < 0 || !(abstractC3595n instanceof C3605y)) {
            return false;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (c3605y.d1()) {
            boolean I = com.voxdon.xplorer.shizuku.c.t().I(c3605y.E(), j);
            if (I) {
                c3605y.m1(j);
            }
            return I;
        }
        try {
            boolean lastModified = c3605y.F0().setLastModified(j);
            if (!lastModified) {
                return lastModified;
            }
            c3605y.r0();
            return lastModified;
        } catch (Exception e2) {
            ax.Ha.c.h().f().d("set last modified").l(e2).g("base:" + c3605y.B0().k()).h();
            return false;
        }
    }

    protected InputStream d1(String str, String str2, String str3) {
        InputStream K0;
        String lowerCase = str2 != null ? str2.toLowerCase() : null;
        EnumC1837z g2 = C1808A.g(lowerCase);
        if (EnumC1837z.AUDIO == g2 || str3.startsWith("audio")) {
            K0 = K0(str);
        } else if (EnumC1837z.VIDEO == g2 || str3.startsWith("video")) {
            K0 = f1(str);
        } else if (EnumC1837z.IMAGE == g2 || str3.startsWith("image")) {
            if (C1808A.S(lowerCase)) {
                K0 = C2946c.e(N0(str), (int) (C3180B.s(p()) * 128.0f));
                if (K0 == null) {
                    K0 = C2945b.n();
                }
            } else {
                K0 = N0(str);
            }
        } else if (EnumC1837z.APK == g2 || str3.equals("application/vnd.android.package-archive")) {
            K0 = ax.U2.d.r(p(), str);
        } else if (EnumC1837z.PDF == g2 && ax.X2.Q.r1()) {
            K0 = T0(str);
        } else if ("epub".equals(lowerCase)) {
            K0 = C2946c.c(p(), str);
            if (K0 == null) {
                K0 = C2945b.n();
            }
        } else {
            K0 = e1(str);
        }
        return K0 == null ? C2945b.n() : K0;
    }

    public boolean g1() {
        boolean z;
        synchronized (this.m) {
            z = this.i.size() > 0;
        }
        return z;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3586e
    public void l0(String str, long j) throws IOException {
        C3605y c3605y = (C3605y) z(str);
        if (c3605y.i0()) {
            try {
                C3588g.P(this, c3605y, j);
            } catch (C1495j e2) {
                throw new IOException(e2);
            }
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            try {
                randomAccessFile.setLength(j);
            } finally {
                randomAccessFile.close();
            }
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) {
        N1(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public long q() throws C1495j {
        k0 Y0;
        switch (b.a[u().ordinal()]) {
            case 1:
                return 0L;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (TextUtils.isEmpty(x()) || (Y0 = Y0()) == null || Y0.b == 0) {
                    return -1L;
                }
                long j = Y0.d;
                if (j >= 0) {
                    return j;
                }
                return -1L;
            default:
                C3184b.g("freespace not reachable : " + u().I());
                r.severe("INVALID GETFREESPACE CALL FOR LOCATOIN : " + u());
                throw new C1495j();
        }
    }

    public List<A> q1(AbstractC3595n abstractC3595n, boolean z, long j, long j2) {
        long j3;
        long j4;
        boolean z2;
        String str = null;
        try {
            Context p = p();
            String str2 = "_data LIKE '" + abstractC3595n.E() + "/%'";
            long j5 = 0;
            if (j2 > 0) {
                str2 = str2 + " AND (_size > " + j2 + " OR _size IS NULL)";
            }
            Cursor query = p.getContentResolver().query(n0.c("external"), y, str2, null, "_data asc");
            if (query == null) {
                return null;
            }
            if (query.getCount() <= 0) {
                query.close();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ax.c3.K B0 = ((C3605y) abstractC3595n).B0();
            ax.X2.L l = new ax.X2.L();
            long j6 = j / 1000;
            A a2 = null;
            long j7 = 0;
            while (query.moveToNext()) {
                try {
                    if (j6 > j5) {
                        j3 = j5;
                        long j8 = query.getLong(2);
                        if (j8 != j3 && j8 < j6) {
                            j5 = j3;
                        }
                    } else {
                        j3 = j5;
                    }
                    A B02 = B0(B0, query, l);
                    long j9 = B02.e;
                    String str3 = B02.a;
                    if (a2 != null) {
                        j4 = j9;
                        if (a2.a.equalsIgnoreCase(str3)) {
                            if (j4 > j7) {
                                arrayList.remove(a2);
                            } else {
                                j5 = j3;
                            }
                        }
                    } else {
                        j4 = j9;
                    }
                    boolean z3 = true;
                    if (str == null || !d0.H(str, str3)) {
                        HashSet<String> hashSet = this.o;
                        str = (hashSet == null || !hashSet.contains(str3)) ? null : str3;
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (j > j3 && B02.c < j) {
                        z2 = true;
                    }
                    if (j2 > 0 && B02.d < j2) {
                        z2 = true;
                    }
                    if (z || !B02.b) {
                        z3 = z2;
                    }
                    if (!z3) {
                        arrayList.add(B02);
                    }
                    a2 = B02;
                    j5 = j3;
                    j7 = j4;
                } catch (Exception unused) {
                    return null;
                }
            }
            query.close();
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }

    public boolean s0(AbstractC3595n abstractC3595n) {
        String Q = d0.Q(abstractC3595n.T(), ".hidden");
        AbstractC3595n z = z(Q);
        boolean n = z.n();
        OutputStreamWriter outputStreamWriter = null;
        try {
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c(Q, true));
                if (n) {
                    try {
                        outputStreamWriter2.write("\n");
                    } catch (IOException unused) {
                        outputStreamWriter = outputStreamWriter2;
                        if (z.isDirectory()) {
                            ax.Ha.c.h().f().d(".hidden foder exists").g(z.E()).h();
                        }
                        if (outputStreamWriter == null) {
                            return false;
                        }
                        try {
                            outputStreamWriter.close();
                            return false;
                        } catch (IOException unused2) {
                            return false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                outputStreamWriter2.write(abstractC3595n.B());
                try {
                    outputStreamWriter2.close();
                } catch (IOException unused4) {
                }
                return true;
            } catch (IOException unused5) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    void u1(List<AbstractC3595n> list, ax.c3.K k) {
        Iterator<String> it = t.iterator();
        while (it.hasNext()) {
            File file = new File("/", it.next());
            if (file.exists()) {
                list.add(new C3605y(this, file, k));
            }
        }
    }

    public void x0(C3605y c3605y, C3605y c3605y2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!c3605y.isDirectory()) {
            F(c3605y, c3605y2, interfaceC3185c, iVar);
            return;
        }
        if (!c3605y2.n()) {
            if (c3605y2.E().endsWith("com.voxdon.xplorer") && "/Android/data/com.voxdon.xplorer".equals(c3605y2.C0())) {
                ax.Q2.e.q(p());
                c3605y2 = (C3605y) z(c3605y2.E());
                if (!c3605y2.n()) {
                    M(c3605y2);
                }
            } else {
                M(c3605y2);
            }
        }
        for (AbstractC3595n abstractC3595n : b0(c3605y)) {
            x0((C3605y) abstractC3595n, (C3605y) z(d0.Q(c3605y2.E(), abstractC3595n.B())), interfaceC3185c, iVar);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        switch (b.a[u().ordinal()]) {
            case 1:
            case 10:
            case 11:
                return X0();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Y0();
            default:
                C3184b.g("not reachable storage space : " + u().I());
                r.severe("INVALID GETSTORAGESPACE CALL FOR LOCATOIN : " + u());
                throw new C1495j();
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) {
        AbstractC3595n M0;
        C3605y c3605y = new C3605y(this, new File(str), (ax.c3.K) null);
        return (ax.X2.Q.L() && c3605y.a1() && (M0 = M0(c3605y, str)) != null) ? M0 : c3605y;
    }

    public C3605y z0(File file, ax.c3.K k, boolean z) {
        return new C3605y(this, file, k, z);
    }

    /* renamed from: com.voxdon.xplorer.file.x$e */
    static class e extends ax.c3.H {
        long c0;

        public e(InputStream inputStream, long j, long j2) {
            super(inputStream);
            this.c0 = j - j2;
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.c0--;
            }
            return read;
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            try {
                read = super.read(bArr, i, i2);
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("ENOENT")) {
                    int available = available();
                    if (available <= 0) {
                        if (available == 0) {
                            if (this.c0 == 0) {
                                return -1;
                            }
                            throw e;
                        }
                        C3184b.e("io utils error :" + message);
                        throw e;
                    }
                    read = super.read(bArr, i, available());
                } else {
                    C3184b.e("io utils error :" + message);
                    throw e;
                }
            }
            if (read != -1) {
                this.c0 -= read;
            }
            return read;
        }
    }
}
