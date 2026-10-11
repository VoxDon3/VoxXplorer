package com.voxdon.xplorer.file;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.J5.C0740a;
import ax.a7.C1427a;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1812E;
import ax.c3.C1829q;
import ax.c3.d0;
import ax.c3.k0;
import ax.c7.C1846a;
import ax.d7.C1943a;
import ax.d7.C1944b;
import ax.d7.C1946d;
import ax.e7.C1983a;
import ax.e7.C1984b;
import ax.f7.C2080b;
import ax.f7.InterfaceC2081c;
import ax.j7.C2334e;
import ax.m7.C2534i;
import ax.o7.C2730a;
import ax.p7.C2777a;
import ax.p7.C2779c;
import ax.p7.C2780d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class r extends AbstractC3594m {
    private static final Logger n = Logger.getLogger("FileManager.GoogleDriveFileHelper");
    private static c o;
    private C2730a h;
    private String i;
    private boolean j;
    private ConcurrentHashMap<String, AbstractC3595n> k = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> l = new ConcurrentHashMap<>();
    private e m;

    class a implements InterfaceC2081c {
        final /* synthetic */ InterfaceC3185c a;
        final /* synthetic */ InputStream b;
        final /* synthetic */ ax.g3.i c;
        final /* synthetic */ long d;

        a(InterfaceC3185c interfaceC3185c, InputStream inputStream, ax.g3.i iVar, long j) {
            this.a = interfaceC3185c;
            this.b = inputStream;
            this.c = iVar;
            this.d = j;
        }

        @Override // ax.f7.InterfaceC2081c
        public void a(C2080b c2080b) throws IOException {
            ax.g3.i iVar;
            if (c2080b == null) {
                return;
            }
            InterfaceC3185c interfaceC3185c = this.a;
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                this.b.close();
            }
            int i = b.a[c2080b.i().ordinal()];
            if (i != 1) {
                if (i == 2 && (iVar = this.c) != null) {
                    iVar.a(c2080b.h(), this.d);
                    return;
                }
                return;
            }
            ax.g3.i iVar2 = this.c;
            if (iVar2 != null) {
                iVar2.a(c2080b.h(), this.d);
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C2080b.EnumC0311b.values().length];
            a = iArr;
            try {
                iArr[C2080b.EnumC0311b.MEDIA_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C2080b.EnumC0311b.MEDIA_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c extends T {
        Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit().remove("display_name_" + i).remove("account_name_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("GoogleDrivePrefs", 0);
            String string = sharedPreferences.getString("display_name_" + i, null);
            String string2 = sharedPreferences.getString("account_name_" + i, null);
            String str = TextUtils.isEmpty(string2) ? string : string2;
            ax.Q2.f fVar = ax.Q2.f.O0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), str, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(String str, ax.g3.k kVar) {
            ax.Q2.f fVar = ax.Q2.f.O0;
            kVar.b(fVar);
            int m = m();
            int l = l(str);
            if (l >= 0) {
                m = l;
            }
            p(m, str);
            kVar.c(fVar, m);
        }

        int l(String str) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("GoogleDrivePrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (str.equals(sharedPreferences.getString("account_name_" + i2, null))) {
                    return i2;
                }
            }
            return -1;
        }

        int m() {
            return this.a.getSharedPreferences("GoogleDrivePrefs", 0).getInt("count", 0);
        }

        public Intent n(String str) {
            if (str != null) {
                return C0740a.a(new Account(str, "com.google"), null, new String[]{"com.google"}, true, null, null, null, null);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://www.googleapis.com/auth/drive");
            return C1943a.e(this.a, arrayList).c();
        }

        public List<ax.Z2.s> o() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("GoogleDrivePrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("account_name_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        public void p(int i, String str) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("GoogleDrivePrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("account_name_" + i, str).putString("display_name_" + i, HttpUrl.FRAGMENT_ENCODE_SET).putString("location_name_" + i, ax.Q2.f.O0.M(this.a));
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
        }
    }

    static class d {
        C2779c a;
        String b;

        d(C2779c c2779c, String str) {
            this.a = c2779c;
            this.b = str;
        }
    }

    private class e extends AbstractC3199q<Object, Void, Integer> {
        private InterfaceC3584c.a h;
        String i;
        ax.d3.L j;
        boolean k;
        private Intent l;
        private Throwable m;

        class a implements ax.i7.r {
            final /* synthetic */ ax.i7.r a;

            a(ax.i7.r rVar) {
                this.a = rVar;
            }

            @Override // ax.i7.r
            public void b(ax.i7.p pVar) throws IOException {
                this.a.b(pVar);
                pVar.y(45000);
            }
        }

        public e(ax.d3.L l, String str, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.i = str;
            this.h = aVar;
            this.j = l;
            this.k = false;
            this.l = null;
        }

        private int w() {
            ax.D5.a cause;
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add("https://www.googleapis.com/auth/drive");
                C1943a e = C1943a.e(r.this.p(), arrayList);
                e.d(this.i);
                r.this.h = new C2730a.b(new C2334e(), new C1427a(), z(e)).j(r.this.p().getString(R.string.app_name)).h();
                String n = r.this.h.m().a().H("user").execute().o().n();
                SharedPreferences sharedPreferences = r.this.p().getSharedPreferences("GoogleDrivePrefs", 0);
                if (n != null) {
                    if (!n.equals(sharedPreferences.getString("display_name_" + r.this.t(), null))) {
                        sharedPreferences.edit().putString("display_name_" + r.this.t(), n).apply();
                        this.k = true;
                    }
                }
                r.this.i = r.this.h.n().d("root").execute().r();
                return 0;
            } catch (C1946d e2) {
                e2.printStackTrace();
                this.l = e2.c();
                return -1;
            } catch (ExceptionInInitializerError e3) {
                e = e3;
                this.m = e;
                ax.Q2.d.b(e);
                return -2;
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                C1846a c1846a = new C1846a(r.this.p());
                Account[] b = c1846a.b();
                if (b == null || b.length <= 0) {
                    ax.Ha.b l = ax.Ha.c.h().f().d("!!GoogleDriveAuth 3!!").l(e4);
                    StringBuilder sb = new StringBuilder();
                    sb.append("account not null : ");
                    sb.append(this.i != null);
                    l.g(sb.toString()).h();
                    return -4;
                }
                if (c1846a.a(this.i) == null) {
                    r.n.severe("Google Account '" + this.i + "' is not found in the device");
                    ax.Ha.c.h().f().d("!!GoogleDriveAuth 1!!").l(e4).h();
                    return -3;
                }
                ax.Ha.b d = ax.Ha.c.h().f().d("!!GoogleDriveAuth 2!!");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ex:");
                sb2.append(e4.getMessage());
                sb2.append(", account not null : ");
                sb2.append(this.i != null);
                d.g(sb2.toString()).h();
                return -6;
            } catch (NoClassDefFoundError e5) {
                e = e5;
                this.m = e;
                ax.Q2.d.b(e);
                return -2;
            } catch (SecurityException e6) {
                ax.Ha.c.h().f().d("!!GoogleDriveAuth 4!!").l(e6).h();
                return -5;
            } catch (Exception e7) {
                e7.printStackTrace();
                this.m = e7;
                if ("NetworkError".equals(e7.getMessage())) {
                    return -9;
                }
                ax.Ha.c.h().f().d("!!GoogleDriveAuth 5!!").l(e7).h();
                return (!(e7 instanceof C1944b) || (cause = ((C1944b) e7).getCause()) == null || !"UNREGISTERED_ON_API_CONSOLE".equals(cause.getMessage()) || C3180B.J(r.this.p())) ? -2 : -8;
            }
        }

        private ax.i7.r z(ax.i7.r rVar) {
            return new a(rVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer g(Object... objArr) {
            r.this.i();
            try {
                int w = w();
                if (w == -6 || w == -3 || w == -4) {
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException unused) {
                    }
                    int w2 = w();
                    if (w2 == 0) {
                        ax.Ha.b d = ax.Ha.c.h().f().d("GoogleDriveAuth RETRY SUCCESS");
                        StringBuilder sb = new StringBuilder();
                        sb.append("result:");
                        sb.append(w);
                        sb.append(",acocunt not null:");
                        sb.append(this.i != null);
                        d.g(sb.toString()).h();
                    } else if (w == -6 && w2 == -6) {
                        ax.Ha.b d2 = ax.Ha.c.h().f().d("GoogleDriveAuth RETRY FAILURE");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("acocunt not null:");
                        sb2.append(this.i != null);
                        d2.g(sb2.toString()).h();
                    }
                    w = ((w2 == -3 || w2 == -4) && !ax.X2.Q.l0()) ? -7 : w2;
                }
                return Integer.valueOf(w);
            } finally {
                r.this.j();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            ax.d3.L l;
            if (this.k && (l = this.j) != null) {
                l.va();
            }
            if (num.intValue() == 0) {
                r.this.j = true;
                this.h.T(true, null);
                return;
            }
            r.this.j = false;
            if (num.intValue() == -1) {
                this.h.T(false, this.l);
                return;
            }
            if (num.intValue() == -2) {
                this.h.T(false, this.m);
                return;
            }
            if (num.intValue() == -3) {
                this.h.T(false, r.this.p().getString(R.string.google_account_not_found, this.i));
                return;
            }
            if (num.intValue() == -4 || num.intValue() == -5 || num.intValue() == -6) {
                this.h.T(false, r.this.p().getString(R.string.could_not_access_account));
                return;
            }
            if (num.intValue() == -7) {
                this.h.T(false, new f(this.i));
                return;
            }
            if (num.intValue() == -8) {
                this.h.T(false, r.this.p().getString(R.string.msg_connection_failed, ax.Q2.f.O0) + " : THIS APP IS NOT GENUINE");
                return;
            }
            if (num.intValue() == -9) {
                this.h.T(false, r.this.p().getString(R.string.error_network));
            } else {
                this.h.T(false, this.m);
            }
        }
    }

    public static class f {
        public String a;

        f(String str) {
            this.a = str;
        }
    }

    public static c A0(Context context) {
        if (o == null) {
            o = new c(context.getApplicationContext());
        }
        return o;
    }

    private String B0(AbstractC3595n abstractC3595n) throws C1495j {
        String h0 = ((C1812E) abstractC3595n).h0();
        if (h0 == null) {
            C1812E c1812e = (C1812E) z(abstractC3595n.T());
            if (!c1812e.n()) {
                return null;
            }
            h0 = y0(c1812e);
        }
        return r0(h0);
    }

    private C1812E C0(C2779c c2779c, String str, String str2, String str3) throws IOException {
        String str4;
        if (c2779c.w() == null || c2779c.w().size() <= 0) {
            return t0();
        }
        String str5 = c2779c.w().get(0);
        if (E0(str5)) {
            return new C1812E(this, "/");
        }
        if (str3 == null || !str3.equals(str5)) {
            str4 = this.l.get(str5);
        } else {
            str5 = str;
            str4 = str2;
        }
        if (str4 != null && this.k.containsKey(str4)) {
            return (C1812E) this.k.get(str4);
        }
        C2779c execute = this.h.n().d(str5).H("kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed").execute();
        C1812E C0 = C0(execute, str, str2, str3);
        String Q = d0.Q(C0.E(), J0(execute));
        C1812E c1812e = new C1812E(this, C0.t(), y0(C0), execute, Q);
        this.k.put(Q, c1812e);
        this.l.put(c1812e.t(), c1812e.E());
        return c1812e;
    }

    private String D0(ArrayList<d> arrayList, String str, String str2, String str3, String str4) {
        String str5;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (str != null) {
                if (!str.equals(str4)) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            str5 = str;
                            break;
                        }
                        d dVar = arrayList.get(i);
                        i++;
                        d dVar2 = dVar;
                        if (str.equals(dVar2.a.r())) {
                            str5 = dVar2.b;
                            sb.insert(0, dVar2.a.v());
                            sb.insert(0, "/");
                            break;
                        }
                    }
                    if (str5 != null) {
                        if (str5.equals(this.i) || str5.equals("root")) {
                            break;
                        }
                        if ("no-parent-id".equals(str5)) {
                            sb.insert(0, ".hidden-system-folder");
                            sb.insert(0, "/");
                            break;
                        }
                        if (str5.equals(str)) {
                            C3184b.e("what case is this?");
                            break;
                        }
                        str = str5;
                    } else {
                        C3184b.e("what case is this?");
                        break;
                    }
                } else {
                    sb.insert(0, str3);
                    break;
                }
            } else {
                break;
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private boolean E0(String str) {
        if ("root".equals(str)) {
            return true;
        }
        String str2 = this.i;
        return str2 != null && str2.equals(str);
    }

    public static String F0(String str) {
        if (str == null) {
            return null;
        }
        return str.replace('/', '_');
    }

    private synchronized List<C2779c> H0(String str) throws IOException {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            C2730a.c.d K = this.h.n().e().I("nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)").K(str);
            do {
                try {
                    C2780d execute = K.execute();
                    Iterator<C2779c> it = execute.n().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    K.J(execute.o());
                } catch (IOException e2) {
                    e2.printStackTrace();
                    K.J(null);
                }
                if (K.G() == null) {
                    break;
                }
            } while (K.G().length() > 0);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private void I0(String str) {
        for (String str2 : this.k.keySet()) {
            if (str2.startsWith(str)) {
                this.k.remove(str2);
            }
        }
    }

    public static String J0(C2779c c2779c) {
        return F0(c2779c.v());
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (r13 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100 A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #8 {all -> 0x00cd, blocks: (B:50:0x00b2, B:52:0x00c0, B:55:0x00c7, B:56:0x00cc, B:66:0x00e1, B:67:0x00e8, B:28:0x0100, B:30:0x0106, B:31:0x010b, B:33:0x010c, B:34:0x0112, B:72:0x00f5, B:73:0x00fd), top: B:12:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K0(com.voxdon.xplorer.file.AbstractC3595n r12, ax.c3.G r13, java.lang.String r14, long r15, java.lang.Long r17, boolean r18, boolean r19, ax.u3.InterfaceC3185c r20, ax.g3.i r21) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.r.K0(com.voxdon.xplorer.file.n, ax.c3.G, java.lang.String, long, java.lang.Long, boolean, boolean, ax.u3.c, ax.g3.i):void");
    }

    private ArrayList<d> p0() throws IOException {
        String str;
        ArrayList<d> arrayList = new ArrayList<>();
        C2730a.c.d K = this.h.n().e().I("nextPageToken, files(id,name,parents)").K("trashed = false and mimeType = 'application/vnd.google-apps.folder'");
        do {
            try {
                C2780d execute = K.execute();
                for (C2779c c2779c : execute.n()) {
                    List<String> w = c2779c.w();
                    if (w != null && w.size() != 0) {
                        if (w.size() == 1) {
                            str = w.get(0);
                        } else {
                            C3184b.g("parent:" + w.size());
                            str = w.get(0);
                        }
                        if (str != null && c2779c.r() != null) {
                            arrayList.add(new d(c2779c, str));
                        }
                        C3184b.f();
                    }
                    str = "no-parent-id";
                    if (str != null) {
                        arrayList.add(new d(c2779c, str));
                    }
                    C3184b.f();
                }
                K.J(execute.o());
            } catch (IOException e2) {
                e2.printStackTrace();
                K.J(null);
            }
            if (K.G() == null) {
                break;
            }
        } while (K.G().length() > 0);
        return arrayList;
    }

    private String q0(C1812E c1812e) {
        return r0(c1812e.t());
    }

    private String r0(String str) {
        return str;
    }

    private C1495j s0(String str, Exception exc) {
        List<C1983a.C0297a> n2;
        if (exc instanceof C1984b) {
            C1984b c1984b = (C1984b) exc;
            int b2 = c1984b.b();
            if (b2 == 403 && c1984b.e() != null) {
                List<C1983a.C0297a> n3 = c1984b.e().n();
                if (n3 != null) {
                    Iterator<C1983a.C0297a> it = n3.iterator();
                    while (it.hasNext()) {
                        String n4 = it.next().n();
                        if ("quotaExceeded".equals(n4) || "storageQuotaExceeded".equals(n4)) {
                            return new ax.b3.s(exc);
                        }
                        if ("forbidden".equals(n4) || "insufficientPermissions".equals(n4) || "insufficientParentPermissions".equals(n4)) {
                            return new C1490e(exc);
                        }
                    }
                }
            } else if (b2 == 404 && c1984b.e() != null && (n2 = c1984b.e().n()) != null) {
                Iterator<C1983a.C0297a> it2 = n2.iterator();
                while (it2.hasNext()) {
                    if ("notFound".equals(it2.next().n())) {
                        return new ax.b3.t(exc);
                    }
                }
            }
        } else if (exc instanceof ax.i7.t) {
            ax.i7.t tVar = (ax.i7.t) exc;
            String c2 = tVar.c();
            int b3 = tVar.b();
            if (b3 == 403 && "Forbidden".equalsIgnoreCase(c2)) {
                return new C1490e(exc);
            }
            if (b3 == 404 && "Not Found".equalsIgnoreCase(c2)) {
                return new ax.b3.t(exc);
            }
        }
        return (exc.getMessage() == null || !exc.getMessage().startsWith("NetworkError")) ? C1489d.b(str, exc) : new ax.b3.q(exc);
    }

    private C1812E t0() {
        return new C1812E(this, "/.hidden-system-folder", true, true);
    }

    private String u0(String str) {
        return str.replace("'", "\\'");
    }

    private String v0() {
        return p().getSharedPreferences("GoogleDrivePrefs", 0).getString("account_name_" + t(), null);
    }

    private HashSet<String> w0(ArrayList<d> arrayList, String str) {
        Stack stack = new Stack();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(str);
        stack.add(str);
        while (stack.size() > 0) {
            String str2 = (String) stack.pop();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                d dVar = arrayList.get(i);
                i++;
                d dVar2 = dVar;
                if (dVar2.b.equals(str2)) {
                    hashSet.add(dVar2.a.r());
                    stack.add(dVar2.a.r());
                }
            }
        }
        return hashSet;
    }

    private String y0(C1812E c1812e) {
        C2779c g0;
        String n2 = (!c1812e.l() || (g0 = c1812e.g0()) == null || g0.x() == null) ? null : g0.x().n();
        return n2 == null ? c1812e.t() : n2;
    }

    private String z0(C2779c c2779c) {
        if (c2779c.w() == null || c2779c.w().size() <= 0) {
            return "root";
        }
        String str = c2779c.w().get(0);
        return E0(str) ? "root" : str;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        String decode;
        if (str3 != null) {
            try {
                if (str3.startsWith("url=")) {
                    decode = Uri.decode(str3.substring(4));
                    ax.i7.s b2 = this.h.e().a(new ax.i7.g(decode)).b();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    b2.b(byteArrayOutputStream);
                    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
            } catch (C1495j e2) {
                e = e2;
                e.printStackTrace();
                return null;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }
        C1812E c1812e = (C1812E) z(str2);
        if (c1812e.i0() == null) {
            return null;
        }
        decode = c1812e.i0();
        ax.i7.s b22 = this.h.e().a(new ax.i7.g(decode)).b();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        b22.b(byteArrayOutputStream2);
        return new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if ("/.hidden-system-folder".equals(abstractC3595n.E())) {
            throw new C1490e();
        }
        C3184b.c(abstractC3595n.isDirectory());
        List<AbstractC3595n> x0 = x0((C1812E) abstractC3595n);
        for (AbstractC3595n abstractC3595n2 : x0) {
            if (abstractC3595n2.isDirectory()) {
                this.k.put(abstractC3595n2.E(), abstractC3595n2);
                this.l.put(abstractC3595n2.t(), abstractC3595n2.E());
            }
        }
        return x0;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        K0(abstractC3595n, g, str, j, l, z, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (abstractC3595n.isDirectory()) {
            I0(abstractC3595n.E());
        }
        try {
            long p = abstractC3595n.p();
            C2779c c2779c = new C2779c();
            c2779c.F(new C2534i(abstractC3595n.q()));
            c2779c.G(abstractC3595n2.B());
            C2730a.c.e f2 = this.h.n().f(q0((C1812E) abstractC3595n), c2779c);
            if (!abstractC3595n.T().equals(abstractC3595n2.T())) {
                String B0 = B0(abstractC3595n);
                String B02 = B0(abstractC3595n2);
                if (B02 == null) {
                    throw new C1495j("Target parent does not exist");
                }
                if (B0 == null) {
                    throw new C1495j("Source parent does not exist");
                }
                f2.H(B02);
                f2.J(B0);
            }
            f2.I("name");
            if (f2.execute() == null) {
                throw new C1495j("result is null");
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (IOException e2) {
            e = e2;
            throw s0("GD moveFile", e);
        } catch (SecurityException e3) {
            e = e3;
            throw s0("GD moveFile", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t("not existing source file");
        }
        C1812E c1812e = (C1812E) abstractC3595n;
        C2779c c2779c = new C2779c();
        long q = abstractC3595n.q();
        if (q >= 0) {
            c2779c.F(new C2534i(q));
        }
        c2779c.G(abstractC3595n2.B());
        if (!abstractC3595n.T().equals(abstractC3595n2.T())) {
            String B0 = B0(abstractC3595n2);
            if (B0 == null) {
                throw new C1495j("Dst parent not found");
            }
            c2779c.H(Arrays.asList(B0));
        }
        try {
            long p = abstractC3595n.p();
            if (this.h.n().a(q0(c1812e), c2779c).execute() == null) {
                throw new C1495j("GoogleDrive copy returns null");
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (IOException e2) {
            e = e2;
            throw s0("GD copyFile", e);
        } catch (SecurityException e3) {
            e = e3;
            throw s0("GD copyFile", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EDGE_INSN: B:37:0x00b4->B:34:0x00b4 BREAK  A[LOOP:0: B:2:0x001d->B:36:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.voxdon.xplorer.file.AbstractC3595n> G0(java.lang.String r16, java.util.ArrayList<com.voxdon.xplorer.file.r.d> r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.io.IOException {
        /*
            r15 = this;
            r6 = r20
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            ax.o7.a r0 = r15.h
            ax.o7.a$c r0 = r0.n()
            ax.o7.a$c$d r0 = r0.e()
            java.lang.String r2 = "nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)"
            ax.o7.a$c$d r0 = r0.I(r2)
            r2 = r16
            ax.o7.a$c$d r8 = r0.K(r2)
        L1d:
            r9 = 0
            java.lang.Object r0 = r8.execute()     // Catch: java.io.IOException -> L48
            r10 = r0
            ax.p7.d r10 = (ax.p7.C2780d) r10     // Catch: java.io.IOException -> L48
            java.util.List r0 = r10.n()     // Catch: java.io.IOException -> L48
            java.util.Iterator r11 = r0.iterator()     // Catch: java.io.IOException -> L48
        L2d:
            boolean r0 = r11.hasNext()     // Catch: java.io.IOException -> L48
            if (r0 == 0) goto L92
            java.lang.Object r0 = r11.next()     // Catch: java.io.IOException -> L48
            ax.p7.c r0 = (ax.p7.C2779c) r0     // Catch: java.io.IOException -> L48
            java.lang.String r2 = r15.z0(r0)     // Catch: java.io.IOException -> L48
            if (r6 == 0) goto L4e
            boolean r3 = r6.equals(r2)     // Catch: java.io.IOException -> L48
            if (r3 == 0) goto L4e
            r12 = r19
            goto L4f
        L48:
            r0 = move-exception
            r13 = r18
            r14 = r19
            goto L9e
        L4e:
            r12 = r9
        L4f:
            if (r12 != 0) goto L68
            if (r17 == 0) goto L68
            r1 = r15
            r4 = r18
            r5 = r19
            r3 = r2
            r2 = r17
            java.lang.String r12 = r1.D0(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L48
            r2 = r3
            if (r12 == 0) goto L64
            r3 = 1
            goto L65
        L64:
            r3 = 0
        L65:
            ax.u3.C3184b.c(r3)     // Catch: java.io.IOException -> L48
        L68:
            if (r12 != 0) goto L7a
            r13 = r18
            r14 = r19
            ax.c3.E r3 = r15.C0(r0, r13, r14, r6)     // Catch: java.io.IOException -> L78
            java.lang.String r12 = r3.E()     // Catch: java.io.IOException -> L78
        L76:
            r4 = r0
            goto L7f
        L78:
            r0 = move-exception
            goto L9e
        L7a:
            r13 = r18
            r14 = r19
            goto L76
        L7f:
            ax.c3.E r0 = new ax.c3.E     // Catch: java.io.IOException -> L78
            java.lang.String r3 = J0(r4)     // Catch: java.io.IOException -> L78
            java.lang.String r5 = ax.c3.d0.Q(r12, r3)     // Catch: java.io.IOException -> L78
            r3 = r2
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L78
            r7.add(r0)     // Catch: java.io.IOException -> L78
            goto L2d
        L92:
            r13 = r18
            r14 = r19
            java.lang.String r0 = r10.o()     // Catch: java.io.IOException -> L78
            r8.J(r0)     // Catch: java.io.IOException -> L78
            goto La4
        L9e:
            r0.printStackTrace()
            r8.J(r9)
        La4:
            java.lang.String r0 = r8.G()
            if (r0 == 0) goto Lb4
            java.lang.String r0 = r8.G()
            int r0 = r0.length()
            if (r0 > 0) goto L1d
        Lb4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.r.G0(java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        C1812E c1812e = (C1812E) abstractC3595n;
        if (c1812e.i0() == null) {
            return null;
        }
        String str = "url=" + Uri.encode(c1812e.i0());
        if (C1808A.J(abstractC3595n)) {
            return C1809B.a0(abstractC3595n, str);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        if (this.h == null) {
            throw new C1493h("Service is not connected!");
        }
        try {
            if (!abstractC3595n.n()) {
                throw new ax.b3.t();
            }
            I0(abstractC3595n.E());
            C2779c c2779c = new C2779c();
            c2779c.I(Boolean.TRUE);
            this.h.n().f(abstractC3595n.t(), c2779c).execute();
        } catch (IOException e2) {
            e2.printStackTrace();
            throw s0("GoogleDrive deleteFileRecursively", e2);
        } catch (SecurityException e3) {
            throw new C1495j(e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (this.h == null) {
            throw new C1493h("Service is not connected!");
        }
        try {
            if (((C1812E) abstractC3595n).g0() == null) {
                throw new C1495j("The file doesn't have any content stored on Drive : " + abstractC3595n.n());
            }
            C2730a.c.C0405c d2 = this.h.n().d(y0((C1812E) abstractC3595n));
            if (j != 0) {
                d2.s().O("bytes=" + j + "-");
            }
            return d2.l();
        } catch (IOException e2) {
            e = e2;
            throw s0("googledrive getInputstream", e);
        } catch (IllegalArgumentException e3) {
            throw new C1495j(e3);
        } catch (SecurityException e4) {
            e = e4;
            throw s0("googledrive getInputstream", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        aVar.B();
        e eVar = new e((ax.d3.L) fragment, v0(), aVar);
        eVar.i(new Object[0]);
        this.m = eVar;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            C1812E c1812e = (C1812E) z(abstractC3595n.T());
            if (!c1812e.n() || abstractC3595n.n()) {
                return false;
            }
            C2779c c2779c = new C2779c();
            c2779c.G(abstractC3595n.B());
            c2779c.E("application/vnd.google-apps.folder");
            c2779c.H(Arrays.asList(y0(c1812e)));
            C2779c execute = this.h.n().b(c2779c).execute();
            if (execute == null) {
                return false;
            }
            String E = abstractC3595n.E();
            try {
                C1812E c1812e2 = new C1812E(this, c1812e.t(), y0(c1812e), execute, E);
                this.k.put(E, c1812e2);
                this.l.put(c1812e2.t(), c1812e2.E());
                return true;
            } catch (C1495j e2) {
                e = e2;
                e.printStackTrace();
                return false;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                return false;
            } catch (SecurityException e4) {
                e = e4;
                e.printStackTrace();
                return false;
            }
        } catch (C1495j | IOException | SecurityException e5) {
            e = e5;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        try {
            C1812E c1812e = (C1812E) z(abstractC3595n.T());
            if (!c1812e.n() || abstractC3595n.n()) {
                return false;
            }
            C2779c c2779c = new C2779c();
            c2779c.G(abstractC3595n.B());
            c2779c.E(abstractC3595n.s());
            c2779c.H(Arrays.asList(y0(c1812e)));
            return this.h.n().b(c2779c).execute() != null;
        } catch (C1495j | IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        I(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.j;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        this.k.clear();
        this.l.clear();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean g0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        K0(abstractC3595n, g, str, j, l, z, true, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    synchronized void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        List<AbstractC3595n> arrayList;
        List<AbstractC3595n> h;
        r rVar = this;
        synchronized (this) {
            try {
                if (!z2) {
                    o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
                    return;
                }
                try {
                    String u0 = rVar.u0(str);
                    if (d0.E(abstractC3595n)) {
                        arrayList = rVar.G0("name contains '" + u0 + "' and trashed = false", null, null, null, null);
                    } else {
                        List<AbstractC3595n> g = ax.Z2.b.k().g(abstractC3595n);
                        if (g != null && (h = C1809B.h(C1829q.g(new ArrayList(g), C1829q.c("Search")), str, z, false)) != null && !h.isEmpty()) {
                            hVar.Y(h, false);
                        }
                        String E = abstractC3595n.E();
                        String t = abstractC3595n.t();
                        String y0 = rVar.y0((C1812E) abstractC3595n);
                        ArrayList<d> p0 = rVar.p0();
                        HashSet<String> w0 = rVar.w0(p0, y0);
                        StringBuilder sb = new StringBuilder();
                        Iterator<String> it = w0.iterator();
                        boolean z3 = true;
                        int i = 0;
                        while (it.hasNext()) {
                            try {
                                String next = it.next();
                                if (z3) {
                                    z3 = false;
                                } else {
                                    sb.append(" or ");
                                }
                                sb.append("'");
                                sb.append(next);
                                sb.append("' in parents");
                                i++;
                                if (i >= 300) {
                                    String str2 = "name contains '" + u0 + "' and (" + sb.toString() + ") and trashed = false";
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.addAll(rVar.G0(str2, p0, t, E, y0));
                                    List<AbstractC3595n> h2 = C1809B.h(arrayList2, null, z, false);
                                    if (h2 != null && !h2.isEmpty()) {
                                        hVar.Y(h2, false);
                                    }
                                    sb.setLength(0);
                                    z3 = true;
                                    i = 0;
                                }
                                rVar = this;
                            } catch (IOException e2) {
                                e = e2;
                                rVar = this;
                                throw rVar.s0("do search", e);
                            } catch (SecurityException e3) {
                                e = e3;
                                rVar = this;
                                throw rVar.s0("do search", e);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        arrayList = new ArrayList<>();
                        if (sb.length() > 0) {
                            rVar = this;
                            arrayList.addAll(rVar.G0("name contains '" + u0 + "' and (" + sb.toString() + ") and trashed = false", p0, t, E, y0));
                        } else {
                            rVar = this;
                        }
                    }
                    if (arrayList == null) {
                        return;
                    }
                    hVar.Y(C1809B.h(arrayList, null, z, false), true);
                } catch (IOException e4) {
                    e = e4;
                } catch (SecurityException e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void n(AbstractC3595n abstractC3595n) throws C1495j {
        C2779c g0;
        if (!(abstractC3595n instanceof C1812E)) {
            throw new C1495j("Invalid File Type :" + abstractC3595n.getClass().getName());
        }
        try {
            if (!abstractC3595n.l() || (g0 = ((C1812E) abstractC3595n).g0()) == null || g0.x() == null) {
                return;
            }
            C2779c execute = this.h.n().d(g0.x().n()).H("size").execute();
            if (execute == null || execute.y() == null) {
                return;
            }
            ((C1812E) abstractC3595n).l0(execute.y().longValue());
        } catch (IOException e2) {
            throw new C1495j(e2);
        }
    }

    public List<AbstractC3595n> x0(C1812E c1812e) throws C1495j {
        ArrayList arrayList = new ArrayList();
        String y0 = y0(c1812e);
        if (a()) {
            try {
                C2730a.c.d K = this.h.n().e().I("nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)").K("'" + y0 + "' in parents and trashed = false");
                do {
                    C2780d execute = K.execute();
                    for (C2779c c2779c : execute.n()) {
                        try {
                            arrayList.add(new C1812E(this, c1812e.t(), y0(c1812e), c2779c, d0.Q(c1812e.E(), J0(c2779c))));
                        } catch (IOException e2) {
                            e = e2;
                            throw s0("GD getChildList", e);
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            Throwable th = e;
                            ax.Ha.c.h().f().d("GoogleDrive: getChildFileList").l(th).h();
                            throw new C1495j(th);
                        } catch (NullPointerException e4) {
                            e = e4;
                            Throwable th2 = e;
                            ax.Ha.c.h().f().d("GoogleDrive: getChildFileList").l(th2).h();
                            throw new C1495j(th2);
                        } catch (OutOfMemoryError e5) {
                            e = e5;
                            OutOfMemoryError outOfMemoryError = e;
                            ax.Ha.c.h().f().d("GoogleDrive: getChildFileList : OOM").l(outOfMemoryError).h();
                            throw new C1495j(outOfMemoryError);
                        } catch (SecurityException e6) {
                            e = e6;
                            throw s0("GD getChildList", e);
                        }
                    }
                    K.J(execute.o());
                    if (K.G() == null) {
                        break;
                    }
                } while (K.G().length() > 0);
            } catch (IOException e7) {
                e = e7;
                throw s0("GD getChildList", e);
            } catch (IllegalArgumentException e8) {
                e = e8;
                Throwable th22 = e;
                ax.Ha.c.h().f().d("GoogleDrive: getChildFileList").l(th22).h();
                throw new C1495j(th22);
            } catch (NullPointerException e9) {
                e = e9;
                Throwable th222 = e;
                ax.Ha.c.h().f().d("GoogleDrive: getChildFileList").l(th222).h();
                throw new C1495j(th222);
            } catch (OutOfMemoryError e10) {
                e = e10;
            } catch (SecurityException e11) {
                e = e11;
                throw s0("GD getChildList", e);
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        try {
            C2777a execute = this.h.m().a().H("storageQuota").execute();
            if (execute == null || execute.n() == null) {
                throw new C1495j("No storage Quota");
            }
            Long n2 = execute.n().n();
            Long o2 = execute.n().o();
            if (n2 != null && o2 != null) {
                return new k0(n2.longValue(), o2.longValue());
            }
            throw new C1495j("no total :" + n2 + "," + o2);
        } catch (IOException e2) {
            e = e2;
            throw s0("GD getStorageSpace", e);
        } catch (SecurityException e3) {
            e = e3;
            throw s0("GD getStorageSpace", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        if (this.h == null) {
            throw new C1493h("Service is not connected!");
        }
        if (this.k.containsKey(str)) {
            return this.k.get(str);
        }
        if (d0.a.equals(str)) {
            return new C1812E(this, str);
        }
        if ("/.hidden-system-folder".equals(str)) {
            return t0();
        }
        try {
            C1812E c1812e = (C1812E) z(d0.r(str));
            String h = d0.h(str);
            String u0 = u0(h);
            try {
                if (!c1812e.n() || !c1812e.isDirectory()) {
                    return new C1812E(this, str);
                }
                String y0 = y0(c1812e);
                List<C2779c> H0 = H0("'" + y0 + "' in parents and name = '" + u0 + "' and trashed = false");
                if (H0 != null && H0.size() > 0) {
                    C1812E c1812e2 = new C1812E(this, c1812e.t(), y0(c1812e), H0.get(0), str);
                    if (!c1812e2.isDirectory()) {
                        return c1812e2;
                    }
                    this.k.put(str, c1812e2);
                    this.l.put(c1812e2.t(), c1812e2.E());
                    return c1812e2;
                }
                if (h.contains("_")) {
                    List<C2779c> H02 = H0("'" + y0 + "' in parents and trashed = false");
                    if (H02 != null && H02.size() > 0) {
                        for (C2779c c2779c : H02) {
                            if (J0(c2779c).equals(h)) {
                                try {
                                    C1812E c1812e3 = new C1812E(this, c1812e.t(), y0(c1812e), c2779c, str);
                                    if (c1812e3.isDirectory()) {
                                        this.k.put(str, c1812e3);
                                        this.l.put(c1812e3.t(), c1812e3.E());
                                    }
                                    return c1812e3;
                                } catch (IOException e2) {
                                    e = e2;
                                    Exception exc = e;
                                    exc.printStackTrace();
                                    throw s0("GoogleDrive getFileInfo", exc);
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    Exception exc2 = e;
                                    exc2.printStackTrace();
                                    throw s0("GoogleDrive getFileInfo", exc2);
                                } catch (NullPointerException e4) {
                                    e = e4;
                                    NullPointerException nullPointerException = e;
                                    ax.Ha.c.h().f().b("GoogleDrive queryFiles null").l(nullPointerException).h();
                                    throw s0("GoogleDrive getFileInfo null", nullPointerException);
                                } catch (SecurityException e5) {
                                    e = e5;
                                    Exception exc22 = e;
                                    exc22.printStackTrace();
                                    throw s0("GoogleDrive getFileInfo", exc22);
                                }
                            }
                        }
                    }
                }
                return new C1812E(this, c1812e.t(), y0(c1812e), str);
            } catch (IOException e6) {
                e = e6;
            } catch (IllegalArgumentException e7) {
                e = e7;
            } catch (NullPointerException e8) {
                e = e8;
            } catch (SecurityException e9) {
                e = e9;
            }
        } catch (IOException e10) {
            e = e10;
            Exception exc222 = e;
            exc222.printStackTrace();
            throw s0("GoogleDrive getFileInfo", exc222);
        } catch (IllegalArgumentException e11) {
            e = e11;
            Exception exc2222 = e;
            exc2222.printStackTrace();
            throw s0("GoogleDrive getFileInfo", exc2222);
        } catch (NullPointerException e12) {
            e = e12;
        } catch (SecurityException e13) {
            e = e13;
            Exception exc22222 = e;
            exc22222.printStackTrace();
            throw s0("GoogleDrive getFileInfo", exc22222);
        }
    }
}
