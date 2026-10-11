package ax.d3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ax.W2.t;
import ax.a3.L;
import ax.b0.InterfaceC1440a;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.d3.C1925l;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3197o;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1925l extends E {
    private static final Logger F2 = Logger.getLogger("FileManager.ArchiveFileHelper");
    private t.a A2;
    private int B2;
    private c C2 = c.NOT_STARTED;
    private boolean D2;
    private Uri E2;
    ProgressDialog s2;
    private C3596o t2;
    private boolean u2;
    private String v2;
    private String w2;
    private C3605y x2;
    private int y2;
    private Uri z2;

    /* renamed from: ax.d3.l$a */
    class a implements L.c {
        final /* synthetic */ C3583b a;

        /* renamed from: ax.d3.l$a$a, reason: collision with other inner class name */
        class RunnableC0281a implements Runnable {
            final /* synthetic */ C3583b q;

            RunnableC0281a(C3583b c3583b) {
                this.q = c3583b;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1925l.this.Ha(this.q, C1925l.this.M0(R.string.error_wrong_password));
            }
        }

        a(C3583b c3583b) {
            this.a = c3583b;
        }

        public static /* synthetic */ void b(a aVar, C3583b c3583b, String str, C3583b.e eVar) {
            aVar.getClass();
            if (eVar == C3583b.e.SUCCESS) {
                c3583b.n1(str);
                C1925l.this.h9();
            } else if (eVar == C3583b.e.WRONG_PASSWORD) {
                new Handler().postDelayed(aVar.new RunnableC0281a(c3583b), 500L);
            } else {
                C1925l.this.i3("archive_password_input");
            }
        }

        @Override // ax.a3.L.c
        public void X(final String str) {
            if (C1925l.this.b() == null) {
                return;
            }
            final C3583b c3583b = this.a;
            c3583b.r1(str, new InterfaceC1440a() { // from class: ax.d3.k
                @Override // ax.b0.InterfaceC1440a
                public final void accept(Object obj) {
                    C1925l.a.b(C1925l.a.this, c3583b, str, (C3583b.e) obj);
                }
            });
        }

        @Override // ax.a3.L.c
        public void a() {
            C1925l.this.i3("archive_password_input");
        }
    }

    /* renamed from: ax.d3.l$b */
    private class b extends AbstractC3199q<Void, Void, Boolean> {
        private final File h;
        private final String i;

        b(String str) {
            super(AbstractC3199q.e.HIGHER);
            this.i = str;
            this.h = ax.Z2.a.i(C1925l.this.o3(), C1925l.this.z3(), C1925l.this.x3());
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            C1925l.this.Ia(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                return !this.h.exists() ? Boolean.TRUE : Boolean.valueOf(ax.Z2.a.f(this.h, true));
            } catch (RuntimeException unused) {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            C1925l.this.za();
            C1925l.this.Aa(this.i);
        }
    }

    /* renamed from: ax.d3.l$c */
    enum c {
        NOT_STARTED,
        UPDATING,
        FINISHED
    }

    /* renamed from: ax.d3.l$d */
    class d extends AbstractC3199q<Long, Integer, Integer> {
        Throwable h;

        /* renamed from: ax.d3.l$d$a */
        class a implements ax.g3.i {
            long a;

            a() {
            }

            @Override // ax.g3.i
            public void a(long j, long j2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - this.a >= 250 || j >= j2) {
                    d.this.v(Integer.valueOf((int) j), Integer.valueOf((int) j2));
                    this.a = uptimeMillis;
                }
            }
        }

        public d() {
            super(AbstractC3199q.e.HIGHER);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C1925l.this.C2 = c.UPDATING;
            C1925l.this.Ia(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer g(Long... lArr) {
            boolean z;
            int i = 0;
            if (C1925l.this.Ca()) {
                C3596o c3596o = C1925l.this.t2;
                c3596o.n0();
                while (true) {
                    if (!CommandService.y(C1925l.this.A3())) {
                        break;
                    }
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                    if (i > 30) {
                        CommandService q = CommandService.q();
                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (q != null) {
                            Iterator<ax.W2.j> it = q.o(C1925l.this.A3()).iterator();
                            while (it.hasNext()) {
                                str = str + "type:" + it.next().B() + ";";
                            }
                        }
                        ax.Ha.c.h().f().b("ARCHIVE WAIT OPERATION TIMEOUT").g(str).h();
                    }
                }
                try {
                    try {
                        try {
                            try {
                                i = !((C3583b) c3596o.u()).s1(new a()) ? 1 : 0;
                            } catch (ax.b3.s e) {
                                e.printStackTrace();
                                this.h = e;
                                c3596o.k0(true);
                                i = 1;
                                return Integer.valueOf(i);
                            }
                        } catch (ConcurrentModificationException e2) {
                            e2.printStackTrace();
                            this.h = e2;
                            ax.Ha.c.h().f().b("ArchiveUpdate ConurrentModification").l(e2).g("using:" + CommandService.y(C1925l.this.A3())).h();
                            c3596o.k0(true);
                            i = 2;
                        }
                    } catch (C1495j e3) {
                        e3.printStackTrace();
                        ax.Ha.c.h().d("UAERR:").l(e3).h();
                        this.h = e3;
                        c3596o.k0(true);
                        i = 1;
                        return Integer.valueOf(i);
                    }
                } finally {
                    c3596o.k0(true);
                }
            }
            return Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (num.intValue() != 0) {
                C1925l.this.o3();
                if (this.h instanceof ax.b3.s) {
                    C1925l.this.J4(R.string.failed_to_update_archive, 1);
                    C1925l.this.J4(R.string.error_not_enough_storage, 0);
                } else {
                    C1925l.this.J4(R.string.failed_to_update_archive, 1);
                }
            }
            C1925l.this.za();
            if (num.intValue() == 2) {
                C1925l.this.C2 = c.NOT_STARTED;
            } else {
                C1925l.this.C2 = c.FINISHED;
                C1925l.this.Ba("archive_update");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void s(Integer... numArr) {
            if (C1925l.this.s2.getMax() != numArr[1].intValue()) {
                C1925l.this.s2.setMax(numArr[1].intValue());
            }
            C1925l.this.s2.setProgress(numArr[0].intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Aa(String str) {
        if (this.E2 != null) {
            C1832u.d0(f0(), this.E2);
            this.E2 = null;
        }
        super.i3(str);
    }

    private void Da(List<AbstractC3595n> list) {
        ParcelFileDescriptor fromFd;
        ax.Z2.k e;
        C3605y c3605y;
        if (f0() == null) {
            return;
        }
        if (!C3197o.e(f0())) {
            F2(C1832u.G(f0()));
            return;
        }
        int i = this.y2;
        ax.c3.K k = null;
        if (i != 0) {
            try {
                fromFd = ParcelFileDescriptor.fromFd(i);
            } catch (IOException e2) {
                ax.Ha.b l = ax.Ha.c.h().f().b("ARCHIVE GET FD ERROR").l(e2);
                StringBuilder sb = new StringBuilder();
                sb.append("haspath:");
                sb.append(this.w2 != null);
                l.g(sb.toString()).h();
                E4(R.string.error, 1);
                return;
            }
        } else {
            fromFd = null;
        }
        if (this.B2 == 1 && (c3605y = this.x2) != null) {
            k = c3605y.B0();
        } else if ((MyFileProvider.B(this.z2) || MyFileProvider.A(this.z2)) && (e = MyFileProvider.e(this.z2)) != null) {
            k = e.d();
        }
        ax.c3.K k2 = k;
        t.a aVar = this.A2;
        String str = this.v2;
        AbstractC1823k abstractC1823k = this.x2;
        q8(k2, aVar, str, fromFd, abstractC1823k, abstractC1823k, list);
    }

    private void Fa() {
        s7().o(R.id.bottom_menu_cut, false);
        s7().o(R.id.bottom_menu_delete, false);
        s7().o(R.id.bottom_menu_rename, false);
    }

    private boolean Ga() {
        C3596o c3596o = this.t2;
        if (c3596o == null) {
            return false;
        }
        return ((C3583b) c3596o.u()).c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ha(C3583b c3583b, String str) {
        if (b() == null) {
            return;
        }
        String W0 = c3583b.W0();
        if (TextUtils.isEmpty(W0)) {
            W0 = b().getString(R.string.dialog_entry_password);
        }
        A(ax.a3.L.n3(W0, str, new a(c3583b)), "password", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ia(boolean z) {
        if (f0() != null) {
            ProgressDialog progressDialog = new ProgressDialog(f0());
            this.s2 = progressDialog;
            progressDialog.setMessage(N0(R.string.dialog_title_zip_update, this.v2));
            this.s2.setProgressStyle(1);
            this.s2.setCancelable(false);
            this.s2.setCanceledOnTouchOutside(false);
            if (z) {
                this.s2.setIndeterminate(z);
            }
            this.s2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void za() {
        try {
            this.s2.dismiss();
        } catch (IllegalArgumentException e) {
            ax.Ha.c.h().f().d("ILLEGAL STATUS ARCHIVE LIST").l(e).h();
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_extract_all) {
            return super.B1(menuItem);
        }
        ax.Q2.a.i().m("menu_folder", "extract_all").c("loc", z3().I()).e();
        Da(null);
        return true;
    }

    @Override // ax.d3.E
    protected String B7() {
        return this.v2;
    }

    protected void Ba(String str) {
        if (!Ga()) {
            Aa(str);
        } else {
            if (this.D2) {
                return;
            }
            this.D2 = true;
            new b(str).i(new Void[0]);
        }
    }

    @Override // ax.d3.E
    protected boolean C7() {
        return false;
    }

    boolean Ca() {
        C3596o c3596o = this.t2;
        if (c3596o == null) {
            return false;
        }
        return ((C3583b) c3596o.u()).b1();
    }

    public void Ea(C3596o c3596o) {
        this.t2 = c3596o;
        c3596o.n0();
    }

    @Override // ax.d3.E
    protected boolean K7(int i, List<AbstractC3595n> list, boolean z) {
        if (i != R.id.menu_extract) {
            return super.K7(i, list, z);
        }
        ax.Q2.a.i().m("menu_folder", "extract").c("loc", z3().I()).e();
        Da(new ArrayList(list));
        h3();
        return true;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.W0.setIsArchiveFile(true);
    }

    @Override // ax.d3.E
    protected void P8(Uri uri) {
        if (f0() == null) {
            return;
        }
        try {
            ax.Z2.k a2 = ax.Z2.k.a(uri);
            if (a2.d() == A3()) {
                Z3(a2.e());
            } else {
                this.E2 = uri;
                i3("return_uri");
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean V2() {
        if (super.V2()) {
            return true;
        }
        i3("hw_back");
        return true;
    }

    @Override // ax.d3.E
    public boolean Y7() {
        return false;
    }

    @Override // ax.d3.E
    protected boolean e7() {
        return false;
    }

    @Override // ax.d3.E
    protected void h9() {
        if (T7()) {
            C3583b c3583b = (C3583b) w7().u();
            if (c3583b.c1() && !c3583b.f1()) {
                Ha(c3583b, null);
                return;
            }
        }
        super.h9();
    }

    @Override // ax.d3.AbstractC1927n
    protected void i3(String str) {
        c cVar = this.C2;
        if (cVar == c.NOT_STARTED) {
            if (Ca()) {
                new d().i(new Long[0]);
                return;
            } else {
                Ba(str);
                return;
            }
        }
        if (cVar != c.FINISHED || f0() == null || f0().isFinishing()) {
            return;
        }
        ax.Ha.c.h().d("!! ARCHIVE FINISH !!").j().g("from : " + str).h();
        Ba(str);
    }

    @Override // ax.d3.E
    protected void ia(Menu menu) {
        menu.findItem(R.id.menu_extract_all).setShowAsActionFlags(8);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        this.A2 = t.a.ZIP;
        this.z2 = (Uri) j0().getParcelable("archive_uri");
        this.B2 = j0().getInt("archive_file_type", 0);
        Uri uri = (Uri) j0().getParcelable("open_uri");
        if (this.B2 == 4) {
            C3184b.c(uri != null);
            if (this.t2 == null) {
                C3596o d2 = C1835x.d(ax.Q2.f.X0, x3());
                this.t2 = d2;
                d2.n0();
            }
            C3583b c3583b = (C3583b) this.t2.u();
            this.z2 = c3583b.O0();
            this.B2 = c3583b.N0();
            this.y2 = c3583b.T0();
            this.v2 = c3583b.W0();
        } else {
            this.y2 = j0().getInt("file_descriptor", 0);
            this.v2 = j0().getString("archive_name");
        }
        int i = this.B2;
        if (i == 1 || i == 2) {
            String path = this.z2.getPath();
            this.w2 = path;
            if (path != null) {
                try {
                    this.x2 = C3605y.I0(path);
                } catch (C1495j unused) {
                }
            } else {
                C3184b.f();
            }
        } else if (i != 3) {
            C3184b.g("unknown archive file type : " + this.B2);
        }
        super.j1(activity);
    }

    @Override // ax.d3.E
    protected void k8(List<AbstractC3595n> list) {
        if (a8()) {
            s7().o(R.id.bottom_menu_rename, false);
        } else {
            Fa();
        }
        s7().l(R.menu.more_archive_multi);
    }

    @Override // ax.d3.E
    protected void l8(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return;
        }
        if (a8()) {
            s7().o(R.id.bottom_menu_rename, true);
        } else {
            Fa();
        }
        s7().l(R.menu.more_archive_single);
        if (abstractC3595n.isDirectory()) {
            s7().t(R.id.menu_share, false);
        } else {
            s7().t(R.id.menu_share, true);
        }
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        String str;
        if (X0()) {
            if (z) {
                C3583b c3583b = (C3583b) w7().u();
                if (c3583b.c1()) {
                    Ha(c3583b, null);
                    return;
                } else {
                    h9();
                    return;
                }
            }
            if (obj instanceof IOException) {
                IOException iOException = (IOException) obj;
                iOException.printStackTrace();
                String message = iOException.getMessage();
                if (message != null && message.startsWith("Error on ZipFile") && iOException.getCause() != null && !TextUtils.isEmpty(iOException.getCause().getMessage())) {
                    message = iOException.getCause().getMessage();
                }
                if (this.u2 && this.w2 == null && this.y2 != 0) {
                    F2.severe("ArchiveViewer restored from saved state!");
                } else if (message != null && message.toLowerCase().startsWith("archive is not a zip archive")) {
                    A4(R.string.archive_is_damaged, 1);
                } else if ((message == null || !(message.contains("ENOENT") || message.contains("No such file"))) && !"NoSuchFileException".equals(iOException.getClass().getSimpleName())) {
                    if (this.x2 != null) {
                        str = iOException.getClass().getSimpleName() + ":" + message + ":" + this.x2.n();
                    } else {
                        str = iOException.getClass().getSimpleName() + ":" + message + ":ParcelFileDescriptor";
                    }
                    J4(R.string.error_loading, 1);
                    ax.Ha.c.h().f().d("ARCHIVE LOADING").g(str).h();
                } else {
                    J4(R.string.error_file_not_found, 1);
                }
            } else {
                C3184b.g("archive error : " + this.A2);
                J4(R.string.error_loading, 1);
            }
            i3("archive_get_operator");
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle != null) {
            this.u2 = true;
        } else {
            this.u2 = false;
        }
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_archive);
        O7(menu);
        ia(menu);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        C3596o c3596o = this.t2;
        if (c3596o != null) {
            c3596o.k0(false);
            this.t2 = null;
        }
        super.s1();
    }

    @Override // ax.d3.E
    public C3596o w7() {
        if (this.t2 == null) {
            int i = this.B2;
            if (i == 1 || i == 2) {
                if (this.x2 == null) {
                    C3184b.f();
                }
                this.t2 = C1835x.a(A3(), this.z2, this.x2, this.B2);
            } else if (i == 3) {
                if (this.y2 == 0) {
                    C3184b.f();
                }
                this.t2 = C1835x.b(A3(), this.z2, this.v2, this.y2, this.B2);
            } else if (i != 4) {
                C3184b.f();
            } else {
                C3184b.f();
            }
            if (this.t2 == null) {
                C3184b.g("archive file operator == null :" + this.B2);
            }
            this.t2.n0();
        }
        return this.t2;
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.X0;
    }
}
