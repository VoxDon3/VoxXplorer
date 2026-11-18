package com.voxdon.xplorer.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.X2.Q;
import ax.X2.v;
import ax.Z2.k;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.c3.W;
import ax.c3.d0;
import ax.d3.AbstractC1927n;
import ax.d3.C1925l;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.z;
import ax.x3.C3405A;
import ax.x3.C3422h;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.shizuku.c;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ArchiveActivity extends com.voxdon.xplorer.activity.b {
    private C3405A A;
    private ArrayList<ParcelFileDescriptor> B = new ArrayList<>();
    private boolean C;
    private C1925l y;
    C3422h z;

    private class a extends AbstractC3199q<Void, Void, Boolean> {
        private Context h;
        private Uri i;
        private File j;
        private C3596o k;
        private Throwable l;
        private long m;
        private ParcelFileDescriptor n;
        private String o;
        private Uri p;

        public a(Context context, Uri uri, String str, long j, Uri uri2) {
            super(AbstractC3199q.e.HIGHER);
            this.h = context;
            this.i = uri;
            this.j = ArchiveActivity.this.Y0(str);
            this.m = j;
            this.o = str;
            this.p = uri2;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            this.k.k0(true);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C3596o f = C1835x.f(this.j);
            this.k = f;
            f.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x018f, code lost:
        
            if (r12.k.Y() != false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x017a, code lost:
        
            r12.k.n(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
        
            if (r12.k.Y() != false) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean g(java.lang.Void... r15) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.activity.ArchiveActivity.a.g(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            this.k.k0(true);
            if (bool.booleanValue()) {
                if (this.n == null) {
                    ArchiveActivity.this.V0(this.o, this.j, 2, this.p);
                    return;
                } else {
                    ArchiveActivity.this.B.add(this.n);
                    ArchiveActivity.this.S0(this.i, this.o, this.n, this.p);
                    return;
                }
            }
            Throwable th = this.l;
            if (th == null || !(th instanceof FileNotFoundException)) {
                Toast.makeText(ArchiveActivity.this, R.string.error_loading, 1).show();
            } else {
                Toast.makeText(ArchiveActivity.this, R.string.requested_file_not_found, 1).show();
            }
            ArchiveActivity.this.finish();
        }
    }

    private class b extends AbstractC3199q<Void, Void, Boolean> {
        private Context h;
        private File i;
        private C3596o j;
        private long k;
        private ParcelFileDescriptor l;
        private String m;
        private C3605y n;
        private Uri o;
        private Uri p;

        public b(Context context, Uri uri, C3605y c3605y, Uri uri2) {
            super(AbstractC3199q.e.HIGHER);
            this.h = context;
            String B = c3605y.B();
            this.m = B;
            this.i = ArchiveActivity.this.Y0(B);
            this.k = c3605y.p();
            this.n = c3605y;
            this.o = uri;
            this.p = uri2;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            this.j.k0(true);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C3596o f = C1835x.f(this.i);
            this.j = f;
            f.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                ParcelFileDescriptor U0 = ((C3604x) this.j.u()).U0(this.n);
                this.l = U0;
                if (U0 != null) {
                    return Boolean.TRUE;
                }
            } catch (C1495j e) {
                e.printStackTrace();
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            this.j.k0(true);
            if (bool.booleanValue()) {
                ArchiveActivity.this.B.add(this.l);
                ArchiveActivity.this.S0(this.o, this.m, this.l, this.p);
            } else {
                Toast.makeText(ArchiveActivity.this, R.string.error_loading, 1).show();
                ArchiveActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(Uri uri, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri2) {
        C1925l c1925l = new C1925l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("archive_uri", uri);
        bundle.putInt("archive_file_type", 3);
        bundle.putString("archive_name", str);
        bundle.putInt("file_descriptor", parcelFileDescriptor.getFd());
        bundle.putInt("location_key", C3583b.M0(uri));
        c1925l.v2(bundle);
        T0(c1925l, uri2);
    }

    private void T0(C1925l c1925l, Uri uri) {
        this.y = c1925l;
        if (uri != null) {
            try {
                k a2 = k.a(uri);
                if (a2.d() == c1925l.A3()) {
                    c1925l.Z3(a2.e());
                } else {
                    C3184b.g("location unit does not match");
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (isFinishing() || getSupportFragmentManager().I0()) {
            return;
        }
        getSupportFragmentManager().o().s(R.id.fragment_container, this.y, "archive").g("archive").j();
    }

    private void U0(String str, Uri uri, int i, Uri uri2, C3596o c3596o) {
        C1925l c1925l = new C1925l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("archive_uri", uri);
        bundle.putInt("archive_file_type", i);
        bundle.putString("archive_name", str);
        bundle.putParcelable("open_uri", uri2);
        if (c3596o != null) {
            c1925l.Ea(c3596o);
            bundle.putInt("location_key", c3596o.y());
        } else {
            bundle.putInt("location_key", C3583b.M0(uri));
        }
        c1925l.v2(bundle);
        T0(c1925l, uri2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(String str, File file, int i, Uri uri) {
        U0(str, C1832u.w(file), i, uri, null);
    }

    private boolean W0(File file) {
        try {
            C3605y I0 = C3605y.I0(file.getAbsolutePath());
            if (I0.a1() && c.t().l()) {
                return I0.n();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File Y0(String str) {
        File file = new File(ax.Z2.a.m(this, "archive-tmp"), HttpUrl.FRAGMENT_ENCODE_SET + System.currentTimeMillis());
        file.mkdir();
        return new File(file, str);
    }

    @Override // com.voxdon.xplorer.activity.b
    public void L0() {
        invalidateOptionsMenu();
    }

    public AbstractC1927n X0() {
        return this.y;
    }

    @Override // com.voxdon.xplorer.activity.b
    public void a0(f fVar, int i, String str) {
        finish();
    }

    @Override // com.voxdon.xplorer.activity.b
    public AbstractC1927n d0() {
        return this.y;
    }

    @Override // com.voxdon.xplorer.activity.b
    public C3422h e0() {
        return this.z;
    }

    @Override // com.voxdon.xplorer.activity.b
    public C3405A h0() {
        if (this.A == null) {
            C3405A c3405a = new C3405A(this, findViewById(R.id.paste_layout), findViewById(R.id.paste_layout_safe_area));
            this.A = c3405a;
            c3405a.D();
        }
        return this.A;
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        if (m0()) {
            return true;
        }
        C3405A c3405a = this.A;
        return c3405a != null && c3405a.m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C1925l c1925l = this.y;
        if (c1925l == null || !c1925l.V2()) {
            finish();
        }
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Fragment j0;
        super.onCreate(bundle);
        setContentView(R.layout.activity_archive);
        if (Q.N1() && z.w(this)) {
            v.r(getWindow(), -16777216);
        }
        this.z = new C3422h(this, (ViewGroup) findViewById(R.id.toolbar_container));
        Uri uri = getIntent().hasExtra("open_uri") ? (Uri) getIntent().getParcelableExtra("open_uri") : null;
        Uri data = getIntent().hasExtra("data_uri") ? (Uri) getIntent().getParcelableExtra("data_uri") : getIntent().getData();
        this.C = bundle != null;
        if (bundle != null && (j0 = getSupportFragmentManager().j0(R.id.fragment_container)) != null) {
            getSupportFragmentManager().o().q(j0).j();
        }
        k0();
        if (uri != null && k.h(uri.getScheme(), f.X0)) {
            C3596o e = C1835x.e(k.a(uri).d());
            if (e.a()) {
                String W0 = ((C3583b) e.u()).W0();
                U0(W0, data, 4, uri, e);
                this.z.q(W0);
                if (getIntent().getBooleanExtra("open_uri_release", false)) {
                    e.k0(false);
                    return;
                }
                return;
            }
        }
        ArchiveActivity archiveActivity = this;
        if (data == null) {
            Toast.makeText(this, R.string.error_loading, 1).show();
            finish();
            return;
        }
        String path = data.getPath();
        String scheme = data.getScheme();
        if (!"content".equals(scheme)) {
            if ("file".equals(scheme) && d0.B(path)) {
                String h = d0.h(path);
                V0(h, new File(path), 1, uri);
                archiveActivity.z.q(h);
                return;
            } else {
                if (!k.h(scheme, f.X0)) {
                    ax.Ha.c.h().d("AA").g(data.toString()).h();
                    Toast.makeText(this, R.string.error_loading, 1).show();
                    finish();
                    return;
                }
                C3184b.g("Archive LocationUri");
                C3596o e2 = C1835x.e(k.a(data).d());
                if (!e2.a()) {
                    Toast.makeText(this, R.string.error_loading, 1).show();
                    finish();
                    return;
                } else {
                    String W02 = ((C3583b) e2.u()).W0();
                    archiveActivity.U0(W02, data, 4, uri, e2);
                    archiveActivity.z.q(W02);
                    return;
                }
            }
        }
        if (!MyFileProvider.B(data)) {
            W x = C1809B.x(this, data, "zip");
            String a2 = x.a();
            new a(this, data, a2, x.b, uri).h(new Void[0]);
            this.z.q(a2);
            return;
        }
        File m = MyFileProvider.m(data);
        String name = m.getName();
        if (m.exists() || !W0(m)) {
            V0(name, m, 1, uri);
        } else {
            try {
                try {
                    try {
                        b bVar = new b(this, data, C3605y.I0(m.getAbsolutePath()), uri);
                        archiveActivity = this;
                        uri = uri;
                        bVar.h(new Void[0]);
                    } catch (C1495j unused) {
                        archiveActivity = this;
                        uri = uri;
                        V0(name, m, 1, uri);
                        archiveActivity.z.q(name);
                    }
                } catch (C1495j unused2) {
                    archiveActivity = this;
                }
            } catch (C1495j unused3) {
            }
        }
        archiveActivity.z.q(name);
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ArrayList<ParcelFileDescriptor> arrayList = this.B;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ParcelFileDescriptor parcelFileDescriptor = arrayList.get(i);
            i++;
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (X0() == null || !X0().Y3(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C1925l c1925l = this.y;
        if (c1925l == null) {
            finish();
            return true;
        }
        c1925l.na("toolbar_back");
        return true;
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // com.voxdon.xplorer.activity.b
    public void p0() {
        e0().b();
    }

    @Override // com.voxdon.xplorer.activity.b
    public void q0(String str) {
        finish();
    }

    @Override // com.voxdon.xplorer.activity.b
    public void r0(Bookmark bookmark) {
    }

    @Override // com.voxdon.xplorer.activity.b
    public void w0(f fVar, int i, String str, boolean z) {
        if (z) {
            M0();
        }
    }

    @Override // com.voxdon.xplorer.activity.b
    public void x0() {
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
    }

    @Override // com.voxdon.xplorer.activity.b
    public void t0(f fVar, int i, String str, boolean z) {
    }
}
