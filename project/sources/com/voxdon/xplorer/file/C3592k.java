package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.G4.B0;
import ax.G4.C0693a;
import ax.G4.C0701e;
import ax.G4.C0702e0;
import ax.G4.C0704f0;
import ax.G4.C0707h;
import ax.G4.C0709i;
import ax.G4.C0710i0;
import ax.G4.C0712j0;
import ax.G4.C0719n;
import ax.G4.C0721o;
import ax.G4.C0723p;
import ax.G4.C0730t;
import ax.G4.E0;
import ax.G4.EnumC0726q0;
import ax.G4.EnumC0729s0;
import ax.G4.S0;
import ax.G4.T0;
import ax.G4.u0;
import ax.G4.v0;
import ax.G4.w0;
import ax.G4.z0;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1819g;
import ax.c3.C1825m;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.e0;
import ax.c3.k0;
import ax.p4.C2764a;
import ax.p4.C2767d;
import ax.p4.C2769f;
import ax.p4.C2773j;
import ax.s4.C3047b;
import ax.t4.C3099a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import ax.u4.C3206a;
import ax.u4.C3208c;
import ax.x4.C3430a;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3592k extends AbstractC3594m {
    static a p;
    private C3430a h;
    private b i;
    private InterfaceC3584c.a j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;
    private static final Logger o = Logger.getLogger("FileManager.DropboxFileHelper");
    static final HashSet<String> q = new HashSet<>(Arrays.asList("jpg", "jpeg", "png", "tiff", "tif", "gif", "webp", "ppm", "bmp", "svg", "heic", "cr2", "crw", "nef", "nrw", "sr2", "dng", "arw", "orf", "mp4", "m4v", "3gp", "3gpp", "3gpp2", "webm", "mkv", "wmv", "avi", "mpg", "mpeg", "mov", "asf", "ogv", "ts", "mts", "vob", "pdf"));

    /* renamed from: com.voxdon.xplorer.file.k$a */
    public static class a extends T {
        Context a;
        boolean b;
        b c;
        WeakReference<ax.g3.k> d;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("DropboxPrefs", 0).edit().remove("version_" + i).remove("app_userid_" + i).remove("app_accountid_" + i).remove("access_token_" + i).remove("credential_" + i).remove("app_name_" + i).remove("location_name_" + i).remove("app_email_" + i).remove("app_rootspaceid_" + i).remove("app_userootspace_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("DropboxPrefs", 0);
            String string = sharedPreferences.getString("app_name_" + i, null);
            String string2 = sharedPreferences.getString("app_email_" + i, null);
            String str = TextUtils.isEmpty(string2) ? string : string2;
            ax.Q2.f fVar = ax.Q2.f.N0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), str, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(Activity activity, ax.g3.k kVar) {
            this.d = new WeakReference<>(kVar);
            ax.Q2.f fVar = ax.Q2.f.N0;
            kVar.b(fVar);
            boolean C0 = C3592k.C0(activity);
            this.b = C0;
            if (C0) {
                return;
            }
            kVar.a(fVar, null, 0, null, null);
        }

        public void l(Activity activity, ax.g3.k kVar, int i, boolean z) {
            s(i, z);
            if (kVar != null) {
                kVar.c(ax.Q2.f.N0, i);
            }
        }

        int m(String str, String str2) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("DropboxPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.contains("app_accountid_" + i2)) {
                    if (TextUtils.isEmpty(str)) {
                        continue;
                    } else {
                        if (str.equals(sharedPreferences.getString("app_accountid_" + i2, null))) {
                            return i2;
                        }
                    }
                } else {
                    if (sharedPreferences.contains("app_name_" + i2) && !TextUtils.isEmpty(str2)) {
                        if (str2.equals(sharedPreferences.getString("app_name_" + i2, null))) {
                            return i2;
                        }
                    }
                }
            }
            return -1;
        }

        int n() {
            return this.a.getSharedPreferences("DropboxPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> o() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("DropboxPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                String string = sharedPreferences.getString("credential_" + i2, null);
                String string2 = sharedPreferences.getString("access_token_" + i2, null);
                if (string != null || string2 != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        public void p(Activity activity) {
            if (this.b) {
                b bVar = this.c;
                if (bVar == null || bVar.m().equals(AbstractC3199q.f.FINISHED)) {
                    ax.g3.k kVar = this.d.get();
                    if (kVar != null) {
                        C3206a a = com.dropbox.core.android.a.a();
                        if (a != null) {
                            b bVar2 = new b(activity, kVar, a);
                            this.c = bVar2;
                            bVar2.i(new Void[0]);
                        } else {
                            kVar.a(ax.Q2.f.N0, null, 0, null, null);
                        }
                    }
                    this.b = false;
                }
            }
        }

        void q(int i, C3206a c3206a) {
            ax.Q2.f fVar = ax.Q2.f.N0;
            c0 c0Var = new c0(fVar);
            SharedPreferences.Editor edit = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            edit.putInt("version_" + i, 3);
            edit.putString("credential_" + i, c0Var.e(ax.Y2.a.a().b(fVar), c3206a.toString()));
            edit.commit();
        }

        void r(int i, String str, String str2, String str3, String str4, String str5, C3206a c3206a) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("DropboxPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            ax.Q2.f fVar = ax.Q2.f.N0;
            c0 c0Var = new c0(fVar);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("app_accountid_" + i, str).putInt("version_" + i, 3).putString("app_name_" + i, str2).putString("access_token_" + i, c0Var.e(ax.Y2.a.a().b(fVar), str5)).putString("app_email_" + i, str3).putString("app_rootspaceid_" + i, str4).putString("location_name_" + i, fVar.M(this.a));
            if (c3206a != null) {
                edit.putString("credential_" + i, c0Var.e(ax.Y2.a.a().b(fVar), c3206a.toString()));
            } else {
                edit.putString("credential_" + i, null);
            }
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
        }

        void s(int i, boolean z) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("DropboxPrefs", 0).edit();
            edit.putBoolean("app_userootspace_" + i, z);
            edit.commit();
        }
    }

    /* renamed from: com.voxdon.xplorer.file.k$c */
    private class c extends AbstractC3199q<Void, Void, Integer> {
        Activity h;
        C3206a i;
        String j;

        public c(Activity activity, String str, C3206a c3206a) {
            super(AbstractC3199q.e.CONNECT);
            this.j = str;
            this.i = c3206a;
            this.h = activity;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            C3430a q0;
            try {
                C3206a c3206a = this.i;
                if (c3206a != null) {
                    q0 = C3592k.r0(c3206a);
                } else {
                    String str = this.j;
                    if (str == null) {
                        return -2;
                    }
                    q0 = C3592k.q0(str);
                }
                C3206a c3206a2 = this.i;
                if (c3206a2 != null && c3206a2.i() != null && this.i.a()) {
                    try {
                        q0.c();
                        C3592k.s0(C3592k.this.p()).q(C3592k.this.t(), this.i);
                    } catch (C3208c unused) {
                        return -2;
                    }
                }
                ax.M4.c a = q0.b().a();
                SharedPreferences sharedPreferences = C3592k.this.p().getSharedPreferences("DropboxPrefs", 0);
                String string = sharedPreferences.getString("app_email_" + C3592k.this.t(), null);
                String string2 = sharedPreferences.getString("app_rootspaceid_" + C3592k.this.t(), null);
                String b = a.d() != null ? a.d().b() : null;
                String b2 = a.b();
                if (!C3180B.j(string, b2) || !C3180B.j(string2, b)) {
                    C3592k.s0(C3592k.this.p()).r(C3592k.this.t(), a.a(), a.c().a(), b2, b, this.j, this.i);
                }
                C3592k.this.A0(b);
                C3592k.this.z0(q0);
                return 0;
            } catch (ax.p4.r e) {
                e.printStackTrace();
                return -2;
            } catch (C2773j e2) {
                e2.printStackTrace();
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (num.intValue() == 0) {
                C3592k.this.w0(true);
                return;
            }
            if (num.intValue() == -1) {
                C3592k.this.w0(false);
                return;
            }
            if (num.intValue() == -2) {
                Activity activity = this.h;
                if (activity == null) {
                    C3592k.this.w0(false);
                    return;
                }
                C3592k.this.k = C3592k.C0(activity);
                if (C3592k.this.k) {
                    return;
                }
                C3592k.this.w0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C0(Activity activity) {
        t0(activity);
        try {
            com.dropbox.core.android.a.b(activity, C1819g.c(activity).a(ax.Q2.f.N0), v0());
            return true;
        } catch (IllegalStateException e) {
            ax.Ha.c.h().d("Dropbox OAuth Error").l(e).h();
            return false;
        }
    }

    private void D0(C3430a c3430a, ax.c3.G g, long j, Long l, String str, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        int i = g.a() ? 2 : 1;
        Exception e = null;
        for (int i2 = 0; i2 < i; i2++) {
            e0 e0Var = new e0(g.b(), 0L, j, interfaceC3185c, iVar);
            try {
                try {
                } catch (ax.p4.t e2) {
                    e = e2;
                } catch (ax.p4.x e3) {
                    e = e3;
                }
                try {
                    u0 e4 = c3430a.a().v(str).e(Boolean.FALSE);
                    if (z) {
                        e4.g(T0.d);
                    } else {
                        e4.g(T0.c);
                    }
                    if (l != null && l.longValue() > 0) {
                        e4.f(new Date(l.longValue()));
                    }
                    if (j >= 0) {
                        e4.c(e0Var, j);
                    } else {
                        e4.b(e0Var);
                    }
                    try {
                        e0Var.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (ax.p4.t e5) {
                    e = e5;
                    try {
                        e.printStackTrace();
                        try {
                            e0Var.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                    }
                } catch (ax.p4.x e6) {
                    e = e6;
                    e.printStackTrace();
                    e0Var.close();
                }
            } catch (w0 e7) {
                throw p0("upload", e7);
            } catch (C2773j e8) {
                throw p0("dropbox uploadfile", e8);
            } catch (IOException e9) {
                if (!(e9.getCause() instanceof C1486a)) {
                    throw C1489d.b("dropbox uploadfile", e9);
                }
                throw ((C1486a) e9.getCause());
            }
        }
        throw C1489d.b("Maxed out upload attempts to Dropbox", e);
    }

    private C1495j E0(String str, C2773j c2773j, S0 s0) {
        if (s0.e()) {
            return new ax.b3.s(str, c2773j);
        }
        if (s0.f()) {
            return new C1490e(str, c2773j);
        }
        if (s0.d()) {
            return new ax.b3.o(str, c2773j);
        }
        return null;
    }

    private void o0(C3430a c3430a, ax.c3.G g, long j, Long l, String str, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        long a2;
        long j2;
        long j3 = 4194304;
        if (j < 4194304) {
            C3184b.g("File too small, use upload() instead.");
            return;
        }
        boolean a3 = g.a();
        int i = a3 ? 5 : 1;
        Exception exc = null;
        String str2 = null;
        long j4 = 0;
        int i2 = 0;
        while (i2 < i) {
            e0 e0Var = (!a3 || j4 <= 0) ? new e0(g.b(), 0L, j, interfaceC3185c, iVar) : new e0(g.c(j4), j4, j, interfaceC3185c, iVar);
            try {
                if (str2 == null) {
                    try {
                        try {
                            str2 = c3430a.a().A().e(e0Var, j3).a();
                            j4 += j3;
                        } catch (E0 e) {
                            try {
                                if (!e.d0.e() || !e.d0.d().d()) {
                                    throw new C1495j(e);
                                }
                                a2 = e.d0.d().b().a();
                                e = e;
                                try {
                                    e0Var.close();
                                } catch (IOException unused) {
                                }
                                j4 = a2;
                                i2++;
                                j3 = 4194304;
                                exc = e;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    e0Var.close();
                                } catch (IOException unused2) {
                                }
                                throw th;
                            }
                        } catch (C2773j e2) {
                            throw p0("chunk_upload", e2);
                        }
                    } catch (z0 e3) {
                        if (!e3.d0.d()) {
                            throw new C1495j(e3);
                        }
                        a2 = e3.d0.b().a();
                        e = e3;
                        e0Var.close();
                        j4 = a2;
                        i2++;
                        j3 = 4194304;
                        exc = e;
                    } catch (ax.p4.t e4) {
                        e = e4;
                        try {
                            e0Var.close();
                        } catch (IOException unused3) {
                        }
                        i2++;
                        j3 = 4194304;
                        exc = e;
                    } catch (ax.p4.x e5) {
                        e = e5;
                        e0Var.close();
                        i2++;
                        j3 = 4194304;
                        exc = e;
                    } catch (IOException e6) {
                        if (!(e6.getCause() instanceof C1486a)) {
                            throw new C1495j(e6);
                        }
                        throw ((C1486a) e6.getCause());
                    }
                }
                B0 b0 = new B0(str2, j4);
                while (true) {
                    j2 = j - j4;
                    if (j2 <= j3) {
                        break;
                    }
                    c3430a.a().x(b0).e(e0Var, j3);
                    j4 += j3;
                    b0 = new B0(str2, j4);
                }
                C0693a.C0084a b2 = C0693a.a(str).b(Boolean.FALSE);
                if (z) {
                    b2.d(T0.d);
                } else {
                    b2.d(T0.c);
                }
                if (l != null && l.longValue() > 0) {
                    b2.c(new Date(l.longValue()));
                }
                C0730t e7 = c3430a.a().y(b0, b2.a()).e(e0Var, j2);
                if (e7 != null && e7.f() < j) {
                    throw new C1495j("The size of the uploaded file is different from the source");
                }
                try {
                    e0Var.close();
                    return;
                } catch (IOException unused4) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw C1489d.b("Maxed out upload attempts to Dropbox", exc);
    }

    private C1495j p0(String str, C2773j c2773j) {
        C0709i c0709i;
        C0707h c0707h;
        C1495j E0;
        ax.G4.K k;
        ax.G4.J j;
        C1495j u0;
        ax.G4.X x;
        ax.G4.W w;
        C1495j E02;
        w0 w0Var;
        v0 v0Var;
        C1495j E03;
        C0723p c0723p;
        C0721o c0721o;
        C1495j u02;
        if (c2773j instanceof ax.p4.t) {
            return new ax.b3.q(str, c2773j);
        }
        if (c2773j instanceof C2764a) {
            return new C1490e(str, c2773j);
        }
        if ((c2773j instanceof C2767d) && ((C2767d) c2773j).a() == 507) {
            return new ax.b3.s(str, c2773j);
        }
        if ((c2773j instanceof C0723p) && (c0721o = (c0723p = (C0723p) c2773j).d0) != null && c0721o.c() && c0723p.d0.b() != null && (u02 = u0(str, c2773j, c0723p.d0.b())) != null) {
            return u02;
        }
        if ((c2773j instanceof w0) && (v0Var = (w0Var = (w0) c2773j).d0) != null && v0Var.d() && w0Var.d0.c() != null && w0Var.d0.c().a() != null && (E03 = E0(str, c2773j, w0Var.d0.c().a())) != null) {
            return E03;
        }
        if ((c2773j instanceof ax.G4.X) && (w = (x = (ax.G4.X) c2773j).d0) != null) {
            if (w.n()) {
                return new ax.b3.s(str, c2773j);
            }
            if (x.d0.l() && x.d0.j() != null) {
                C1495j u03 = u0(str, c2773j, x.d0.j());
                if (u03 != null) {
                    return u03;
                }
            } else if (x.d0.m() && x.d0.k() != null && (E02 = E0(str, c2773j, x.d0.k())) != null) {
                return E02;
            }
        }
        if ((c2773j instanceof ax.G4.K) && (j = (k = (ax.G4.K) c2773j).d0) != null && j.d() && k.d0.c() != null && (u0 = u0(str, c2773j, k.d0.c())) != null) {
            return u0;
        }
        if ((c2773j instanceof C0709i) && (c0707h = (c0709i = (C0709i) c2773j).d0) != null) {
            if (c0707h.e() && c0709i.d0.c() != null) {
                C1495j u04 = u0(str, c2773j, c0709i.d0.c());
                if (u04 != null) {
                    return u04;
                }
            } else if (c0709i.d0.f() && c0709i.d0.d() != null && (E0 = E0(str, c2773j, c0709i.d0.d())) != null) {
                return E0;
            }
        }
        return new C1495j(str, c2773j);
    }

    static C3430a q0(String str) {
        return new C3430a(v0(), str);
    }

    static C3430a r0(C3206a c3206a) {
        return new C3430a(v0(), c3206a);
    }

    public static a s0(Context context) {
        if (p == null) {
            p = new a(context.getApplicationContext());
        }
        return p;
    }

    private static void t0(Context context) {
    }

    private C1495j u0(String str, C2773j c2773j, ax.G4.M m) {
        if (m.b()) {
            return new ax.b3.t(c2773j);
        }
        if (m.c()) {
            return new C1490e(str, c2773j);
        }
        return null;
    }

    private static ax.p4.m v0() {
        return ax.p4.m.e("FileManager/2.8.2").b(C3047b.e).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(boolean z) {
        InterfaceC3584c.a aVar = this.j;
        if (aVar != null) {
            aVar.T(z, null);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        C3430a c3430a = this.h;
        if (c3430a == null) {
            return null;
        }
        try {
            return c3430a.a().l(str2).d(EnumC0726q0.JPEG).e(EnumC0729s0.W128H128).c().b();
        } catch (C2773j e) {
            e.printStackTrace();
            return null;
        }
    }

    void A0(String str) {
        this.m = str;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    void B0(boolean z) {
        this.n = z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        if (!a()) {
            ax.Ha.c.h().f().b("NOT CONNECT CALL LISTCHILDREN").j().h();
            throw new C1493h("Not connected to server");
        }
        C1825m c1825m = (C1825m) abstractC3595n;
        try {
            String E = d0.E(c1825m) ? HttpUrl.FRAGMENT_ENCODE_SET : c1825m.E();
            ArrayList arrayList = new ArrayList();
            ax.G4.L n = this.h.a().n(E);
            while (true) {
                List<ax.G4.P> b2 = n.b();
                if (b2 != null) {
                    for (ax.G4.P p2 : b2) {
                        if (p2.b() != null || p2.c() != null) {
                            arrayList.add(new C1825m(this, p2));
                        }
                    }
                }
                if (!n.c()) {
                    return arrayList;
                }
                n = this.h.a().p(n.a());
            }
        } catch (C2773j e) {
            throw p0("listChildren", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        String E = abstractC3595n.E();
        if (j < 4194304 || j == -1) {
            D0(this.h, g, j, l, E, false, interfaceC3185c, iVar);
        } else {
            o0(this.h, g, j, l, E, false, interfaceC3185c, iVar);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        try {
            long p2 = abstractC3595n.p();
            ax.G4.Z r = this.h.a().r(abstractC3595n.E(), abstractC3595n2.E());
            if (r == null || r.a() == null) {
                throw new C1495j("null result");
            }
            if (iVar != null) {
                iVar.a(p2, p2);
            }
        } catch (C2773j e) {
            throw p0("moveFile", e);
        } catch (IllegalArgumentException e2) {
            ax.Q2.d.c("dropbox move", e2);
            throw new C1495j("moveFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        try {
            long p2 = abstractC3595n.p();
            ax.G4.Z b2 = this.h.a().b(abstractC3595n.E(), abstractC3595n2.E());
            if (b2 == null || b2.a() == null) {
                throw new C1495j("Dropbox copy returns null entry");
            }
            if (iVar != null) {
                iVar.a(p2, p2);
            }
        } catch (C2773j e) {
            throw p0("copyFile", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (q.contains(abstractC3595n.A())) {
            return C1809B.Y(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            this.h.a().f(abstractC3595n.E());
        } catch (C2773j e) {
            e.printStackTrace();
            throw p0("deleteFile", e);
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().f().b("Dropbox Delete").l(e2).g("path:" + abstractC3595n.E()).h();
            throw new C1495j(e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (!a()) {
            throw new C1493h("Not connected : dropbox");
        }
        try {
            C0719n h = this.h.a().h(abstractC3595n.E());
            if (j > 0) {
                h.b(j);
            }
            return h.c().b();
        } catch (C2769f e) {
            throw p0("dropbox getinputstream : " + e.b() + " ; " + e.getMessage(), e);
        } catch (C2773j e2) {
            throw p0("dropbox getinputstream : " + e2.getMessage(), e2);
        } catch (IllegalArgumentException e3) {
            ax.Ha.c.h().f().b("dropbox path problem").g("path:" + abstractC3595n.E()).h();
            throw new C1495j("dropbox getInputStream : " + e3.getMessage(), e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        String a2;
        String str;
        if (this.k) {
            return;
        }
        ax.Q2.f fVar = ax.Q2.f.N0;
        c0 c0Var = new c0(fVar);
        SharedPreferences sharedPreferences = p().getSharedPreferences("DropboxPrefs", 0);
        int i = sharedPreferences.getInt("version_" + t(), 0);
        C3206a c3206a = null;
        if (i == 0) {
            str = sharedPreferences.getString("access_token_" + t(), null);
            a2 = sharedPreferences.getString("credential_" + t(), null);
        } else {
            String a3 = c0Var.a(i, ax.Y2.a.a().b(fVar), sharedPreferences.getString("access_token_" + t(), null));
            a2 = c0Var.a(i, ax.Y2.a.a().b(fVar), sharedPreferences.getString("credential_" + t(), null));
            str = a3;
        }
        String string = sharedPreferences.getString("app_rootspaceid_" + t(), null);
        boolean z = sharedPreferences.getBoolean("app_userootspace_" + t(), false);
        A0(string);
        B0(z);
        if (a2 != null) {
            try {
                c3206a = C3206a.f.i(a2);
            } catch (C3099a unused) {
            }
        }
        this.j = aVar;
        aVar.B();
        if (str != null || c3206a != null) {
            new c(activity, str, c3206a).i(new Void[0]);
            return;
        }
        if (activity == null) {
            w0(false);
            return;
        }
        boolean C0 = C0(activity);
        this.k = C0;
        if (C0) {
            return;
        }
        w0(false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            C0701e d = this.h.a().d(abstractC3595n.E(), false);
            if (d != null) {
                if (d.a() != null) {
                    return true;
                }
            }
            return false;
        } catch (C2773j e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return l(abstractC3595n);
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
        return this.h != null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
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
        String E = abstractC3595n.E();
        if (j < 4194304 || j == -1) {
            D0(this.h, g, j, l, E, true, interfaceC3185c, iVar);
        } else {
            o0(this.h, g, j, l, E, true, interfaceC3185c, iVar);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    synchronized void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        if (z2) {
            try {
                try {
                    String E = "/".equals(abstractC3595n.E()) ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.E();
                    C0710i0 t = this.h.a().t(str);
                    t.b(C0704f0.a().d(E).c(1000L).b(Boolean.TRUE).a());
                    C0712j0 a2 = t.a();
                    ArrayList arrayList = new ArrayList();
                    if (a2 != null && a2.a() != null) {
                        Iterator<C0702e0> it = a2.a().iterator();
                        while (it.hasNext()) {
                            ax.G4.Q a3 = it.next().a();
                            if (a3 != null && a3.c()) {
                                ax.G4.P b2 = a3.b();
                                if (b2.b() != null || b2.c() != null) {
                                    arrayList.add(new C1825m(this, b2));
                                }
                            }
                        }
                    }
                    hVar.Y(C1809B.h(arrayList, null, z, false), true);
                    return;
                } catch (C2773j e) {
                    e.printStackTrace();
                    throw p0("doSearch", e);
                }
            } catch (Throwable th) {
                th = th;
            }
        } else {
            try {
                o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public void x0() {
        if (this.k) {
            this.l = true;
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        try {
            ax.M4.h b2 = this.h.b().b();
            ax.M4.g a2 = b2.a();
            if (a2.f()) {
                return new k0(a2.c().a(), b2.b());
            }
            if (a2.g()) {
                return new k0(a2.d().a(), a2.d().b());
            }
            return null;
        } catch (C2773j e) {
            throw p0("storagespace", e);
        }
    }

    public void y0() {
        if (this.k && this.l) {
            b bVar = this.i;
            if (bVar == null || bVar.m().equals(AbstractC3199q.f.FINISHED)) {
                C3206a a2 = com.dropbox.core.android.a.a();
                if (a2 != null) {
                    b bVar2 = new b(p(), this, this.j, a2);
                    this.i = bVar2;
                    bVar2.i(new Void[0]);
                } else {
                    this.j.T(false, null);
                }
                this.k = false;
                this.l = false;
                this.j = null;
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        if ("/".equals(str)) {
            return new C1825m(this, "/");
        }
        if (!a()) {
            ax.Ha.c.h().f().b("NOT CONNECT CALL GET FILE INFO").j().h();
            throw new C1493h("Not connected to server");
        }
        try {
            return new C1825m(this, this.h.a().j(str));
        } catch (C2773j e) {
            if (e instanceof ax.G4.B) {
                ax.G4.B b2 = (ax.G4.B) e;
                if (b2.d0.c() && b2.d0.b() == ax.G4.M.c) {
                    return new C1825m(this, str);
                }
            }
            throw p0("getFileInfo", e);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw C1489d.b("dropbox getfileinfo", e2);
        }
    }

    void z0(C3430a c3430a) {
        if (!this.n || TextUtils.isEmpty(this.m)) {
            o.fine("Use dropbox user space");
            this.h = c3430a;
        } else {
            o.fine("Use dropbox team space");
            this.h = c3430a.d(ax.C4.a.c(this.m));
        }
    }

    /* renamed from: com.voxdon.xplorer.file.k$b */
    private static class b extends AbstractC3199q<Void, Void, Integer> {
        private InterfaceC3584c.a h;
        ax.g3.k i;
        C3206a j;
        Context k;
        C3592k l;
        int m;

        public b(Context context, C3592k c3592k, InterfaceC3584c.a aVar, C3206a c3206a) {
            super(AbstractC3199q.e.CONNECT);
            this.k = context;
            this.h = aVar;
            this.j = c3206a;
            this.l = c3592k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Integer g(java.lang.Void... r15) {
            /*
                r14 = this;
                java.lang.String r15 = ""
                ax.u4.a r0 = r14.j
                if (r0 != 0) goto Lc
                r15 = -1
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                return r15
            Lc:
                ax.x4.a r0 = com.voxdon.xplorer.file.C3592k.r0(r0)
                r1 = 0
                r2 = 0
                ax.M4.b r3 = r0.b()     // Catch: ax.p4.C2773j -> L68
                ax.M4.c r3 = r3.a()     // Catch: ax.p4.C2773j -> L68
                ax.M4.f r4 = r3.c()     // Catch: ax.p4.C2773j -> L68
                java.lang.String r4 = r4.a()     // Catch: ax.p4.C2773j -> L68
                java.lang.String r5 = r3.a()     // Catch: ax.p4.C2773j -> L63
                java.lang.String r15 = r3.b()     // Catch: ax.p4.C2773j -> L58
                ax.g3.k r6 = r14.i     // Catch: ax.p4.C2773j -> L58
                if (r6 == 0) goto L5d
                ax.C4.c r6 = r3.d()     // Catch: ax.p4.C2773j -> L58
                if (r6 == 0) goto L5d
                ax.C4.c r6 = r3.d()     // Catch: ax.p4.C2773j -> L58
                java.lang.String r2 = r6.b()     // Catch: ax.p4.C2773j -> L58
                ax.C4.c r3 = r3.d()     // Catch: ax.p4.C2773j -> L58
                java.lang.String r3 = r3.a()     // Catch: ax.p4.C2773j -> L58
                boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: ax.p4.C2773j -> L58
                if (r6 != 0) goto L5d
                boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: ax.p4.C2773j -> L58
                if (r6 != 0) goto L5d
                boolean r3 = r2.equals(r3)     // Catch: ax.p4.C2773j -> L58
                if (r3 != 0) goto L5d
                r3 = 1
                goto L5e
            L58:
                r3 = r2
                r2 = r15
            L5b:
                r15 = r4
                goto L6c
            L5d:
                r3 = 0
            L5e:
                r10 = r15
                r11 = r2
                r9 = r4
            L61:
                r8 = r5
                goto L71
            L63:
                r5 = r15
                r3 = r2
                r2 = r5
                goto L5b
            L68:
                r5 = r15
                r3 = r2
                r2 = r5
            L6c:
                r9 = r15
                r10 = r2
                r11 = r3
                r3 = 0
                goto L61
            L71:
                android.content.Context r15 = r14.k
                com.voxdon.xplorer.file.k$a r6 = com.voxdon.xplorer.file.C3592k.s0(r15)
                com.voxdon.xplorer.file.k r15 = r14.l
                if (r15 == 0) goto L81
                int r15 = r15.t()
            L7f:
                r7 = r15
                goto L8d
            L81:
                int r15 = r6.n()
                int r2 = r6.m(r8, r9)
                if (r2 < 0) goto L7f
                r15 = r2
                goto L7f
            L8d:
                r12 = 0
                ax.u4.a r13 = r14.j
                r6.r(r7, r8, r9, r10, r11, r12, r13)
                r14.m = r7
                ax.g3.k r15 = r14.i
                if (r15 == 0) goto La1
                if (r3 == 0) goto La1
                r15 = -2
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                return r15
            La1:
                com.voxdon.xplorer.file.k r15 = r14.l
                if (r15 == 0) goto Lad
                r15.A0(r11)
                com.voxdon.xplorer.file.k r15 = r14.l
                r15.z0(r0)
            Lad:
                java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3592k.b.g(java.lang.Void[]):java.lang.Integer");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (num.intValue() == 0) {
                InterfaceC3584c.a aVar = this.h;
                if (aVar != null) {
                    aVar.T(true, null);
                }
                ax.g3.k kVar = this.i;
                if (kVar != null) {
                    kVar.c(ax.Q2.f.N0, this.m);
                    return;
                }
                return;
            }
            if (num.intValue() != -2) {
                InterfaceC3584c.a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.T(false, null);
                }
                ax.g3.k kVar2 = this.i;
                if (kVar2 != null) {
                    kVar2.a(ax.Q2.f.N0, null, 0, null, null);
                    return;
                }
                return;
            }
            try {
                this.i.d(ax.Q2.f.N0, this.m, null);
            } catch (IllegalStateException unused) {
                InterfaceC3584c.a aVar3 = this.h;
                if (aVar3 != null) {
                    aVar3.T(false, null);
                }
                ax.g3.k kVar3 = this.i;
                if (kVar3 != null) {
                    kVar3.a(ax.Q2.f.N0, null, 0, null, null);
                }
            }
        }

        public b(Context context, ax.g3.k kVar, C3206a c3206a) {
            super(AbstractC3199q.e.CONNECT);
            this.k = context;
            this.i = kVar;
            this.j = c3206a;
        }
    }
}
