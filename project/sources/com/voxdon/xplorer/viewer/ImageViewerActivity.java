package com.voxdon.xplorer.viewer;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import androidx.fragment.app.Fragment;
import ax.W2.h;
import ax.W2.o;
import ax.W2.x;
import ax.X2.Q;
import ax.X2.v;
import ax.Z2.c;
import ax.Z2.t;
import ax.b3.C1488c;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1834w;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.K;
import ax.d3.AbstractC1927n;
import ax.d3.M;
import ax.i.C2186b;
import ax.i.r;
import ax.n.ActivityC2561c;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.z;
import ax.x3.C3409E;
import ax.x3.C3418d;
import ax.y0.C3495a;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.viewer.c;
import com.android.ex.photo.PhotoViewPager;
import com.android.ex.photo.f;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ImageViewerActivity extends com.voxdon.xplorer.activity.a implements f.g, ax.R2.a {
    public static int G = 36102;
    public static String H = "IMAGE_INFO_KEY";
    private long A;
    private boolean B;
    private String C;
    private String D;
    private boolean E;
    private com.android.ex.photo.f j;
    private com.android.ex.photo.b k;
    private C3409E l;
    List<AbstractC3595n> n;
    private ax.Q2.f o;
    private int p;
    C3596o q;
    int r;
    C3418d s;
    View t;
    boolean u;
    View v;
    View w;
    M x;
    private AbstractC3595n z;
    private final HashMap<String, Boolean> m = new HashMap<>();
    private HashMap<ComponentName, m> y = new HashMap<>();
    r F = new e(true);

    class a implements AbstractC1927n.p {
        final /* synthetic */ AbstractC3595n a;
        final /* synthetic */ File b;

        a(AbstractC3595n abstractC3595n, File file) {
            this.a = abstractC3595n;
            this.b = file;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (ImageViewerActivity.this.s() == null) {
                return;
            }
            C1832u.h0(ImageViewerActivity.this.s(), this.a.s(), this.b);
        }
    }

    class b implements AbstractC1927n.p {
        final /* synthetic */ AbstractC3595n a;
        final /* synthetic */ File b;

        b(AbstractC3595n abstractC3595n, File file) {
            this.a = abstractC3595n;
            this.b = file;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (ImageViewerActivity.this.s() == null) {
                return;
            }
            C1832u.m0(ImageViewerActivity.this.s(), this.a.s(), this.b);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class d implements C3409E.d {
        d() {
        }

        @Override // ax.x3.C3409E.d
        public void a(boolean z) {
            if (z) {
                ImageViewerActivity.this.j.E0(false);
            }
            if (ImageViewerActivity.this.j.s()) {
                ImageViewerActivity.this.j.n();
            }
            if (ImageViewerActivity.this.getWindow() != null) {
                ImageViewerActivity.this.getWindow().clearFlags(128);
            }
        }

        @Override // ax.x3.C3409E.d
        public void b(boolean z) {
            if (z) {
                ImageViewerActivity.this.j.E0(false);
            }
            if (ImageViewerActivity.this.getWindow() != null) {
                ImageViewerActivity.this.getWindow().clearFlags(128);
            }
        }

        @Override // ax.x3.C3409E.d
        public void c(boolean z) {
            if (z) {
                ImageViewerActivity.this.j.E0(true);
            }
            ImageViewerActivity.this.v0();
            if (ImageViewerActivity.this.getWindow() != null) {
                ImageViewerActivity.this.getWindow().addFlags(128);
            }
        }
    }

    class e extends r {
        e(boolean z) {
            super(z);
        }

        @Override // ax.i.r
        public void c() {
            ImageViewerActivity.this.B = false;
            ImageViewerActivity.this.p();
        }

        @Override // ax.i.r
        public void d() {
            ImageViewerActivity.this.j.e0();
            ImageViewerActivity.this.B = false;
            ImageViewerActivity.this.p();
        }

        @Override // ax.i.r
        public void f(C2186b c2186b) {
            ImageViewerActivity.this.B = true;
        }
    }

    class f extends ax.g3.c {
        f(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            ImageViewerActivity.this.w0(view.getId());
        }
    }

    class g implements C3418d.f {
        g() {
        }

        @Override // ax.x3.C3418d.f
        public boolean a(int i) {
            ImageViewerActivity.this.w0(i);
            return true;
        }
    }

    class h implements C3418d.g {
        h() {
        }

        @Override // ax.x3.C3418d.g
        public void a() {
            boolean z;
            Intent W0;
            m n0;
            ImageViewerActivity imageViewerActivity = ImageViewerActivity.this;
            AbstractC3595n k0 = ImageViewerActivity.this.k0(((com.voxdon.xplorer.viewer.b) imageViewerActivity.j()).V0());
            boolean H = k0 != null ? C1809B.H(k0) : false;
            ImageViewerActivity.this.s.t(R.id.menu_open_with, H);
            if (!H || (W0 = com.voxdon.xplorer.viewer.b.W0(imageViewerActivity, k0, true)) == null || (n0 = ImageViewerActivity.this.n0(W0)) == null) {
                z = false;
            } else {
                ImageViewerActivity.this.s.s(R.id.menu_open_default, n0.a);
                ImageViewerActivity.this.s.q(R.id.menu_open_default, n0.b);
                z = true;
            }
            ImageViewerActivity.this.s.t(R.id.menu_open_default, z);
            ImageViewerActivity.this.s.t(R.id.menu_slideshow, true);
            ImageViewerActivity.this.s.t(R.id.menu_edit, false);
        }

        @Override // ax.x3.C3418d.g
        public void b(boolean z) {
            ImageViewerActivity.this.j.a(z);
        }
    }

    class i implements h.a {
        final /* synthetic */ AbstractC3595n a;

        i(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar != h.b.SUCCESS) {
                ImageViewerActivity.this.J0(str, 0);
                return;
            }
            int indexOf = ImageViewerActivity.this.n.indexOf(this.a);
            ImageViewerActivity.this.n.remove(this.a);
            if (ImageViewerActivity.this.n.isEmpty()) {
                Toast.makeText(ImageViewerActivity.this, str, 1).show();
                ImageViewerActivity.this.finish();
                return;
            }
            ((com.voxdon.xplorer.viewer.b) ImageViewerActivity.this.j()).e1();
            if (arrayList.size() <= 0 || indexOf < 0) {
                ImageViewerActivity.this.J0(str, -1);
            } else {
                ImageViewerActivity.this.K0(this.a, indexOf, str, arrayList);
            }
        }

        @Override // ax.W2.h.a
        public void b() {
            ImageViewerActivity.this.j().t0();
        }
    }

    class j implements DialogInterface.OnCancelListener {
        j() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ImageViewerActivity.this.j().t0();
        }
    }

    class k extends ax.g3.c {
        final /* synthetic */ List c;
        final /* synthetic */ int d;
        final /* synthetic */ AbstractC3595n e;

        class a implements h.a {
            a() {
            }

            @Override // ax.W2.h.a
            public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
                if (bVar != h.b.SUCCESS) {
                    ImageViewerActivity.this.J0(str, 0);
                    return;
                }
                k kVar = k.this;
                int size = kVar.d > ImageViewerActivity.this.n.size() ? ImageViewerActivity.this.n.size() : k.this.d;
                k kVar2 = k.this;
                ImageViewerActivity.this.n.add(size, kVar2.e);
                ImageViewerActivity.this.j().A0(size);
                ((com.voxdon.xplorer.viewer.b) ImageViewerActivity.this.j()).e1();
                ImageViewerActivity.this.J0(str, -1);
            }

            @Override // ax.W2.h.a
            public void b() {
            }
        }

        k(List list, int i, AbstractC3595n abstractC3595n) {
            this.c = list;
            this.d = i;
            this.e = abstractC3595n;
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_image_viewer", "undo_delete").c("loc", "image_viewer").e();
            ImageViewerActivity imageViewerActivity = ImageViewerActivity.this;
            x.m(imageViewerActivity, imageViewerActivity.q, this.c, new a());
        }
    }

    class l implements h.a {
        final /* synthetic */ AbstractC1927n.p a;

        l(AbstractC1927n.p pVar) {
            this.a = pVar;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            int i = c.a[bVar.ordinal()];
            if (i == 1) {
                this.a.a();
            } else if (i == 2 || i == 3) {
                Toast.makeText(ImageViewerActivity.this.s(), str, 1).show();
            }
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    static class m {
        CharSequence a;
        Drawable b;

        m(CharSequence charSequence, Drawable drawable) {
            this.a = charSequence;
            this.b = drawable;
        }
    }

    class n extends AbstractC3199q<Void, Integer, Boolean> {
        private AbstractC3595n h;

        n(AbstractC3595n abstractC3595n) {
            super(AbstractC3199q.e.HIGH);
            this.h = abstractC3595n;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            return Boolean.valueOf(ImageViewerActivity.this.C0(this.h));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (bool.booleanValue()) {
                ((com.voxdon.xplorer.viewer.b) ImageViewerActivity.this.j()).f1();
            } else {
                Toast.makeText(ImageViewerActivity.this, R.string.error, 0).show();
            }
        }
    }

    private void A0() {
        if (j() == null || j().V() == null) {
            return;
        }
        if (!j().s()) {
            j().n();
        }
        this.l.z();
    }

    private void B0(AbstractC3595n abstractC3595n) {
        String str;
        if (!(abstractC3595n instanceof C3605y)) {
            if (abstractC3595n == null) {
                str = "loc:null";
            } else {
                str = "loc:" + abstractC3595n.P().I();
            }
            C3184b.g(str);
            return;
        }
        if (!(this.q.u() instanceof C3604x)) {
            C3184b.f();
            return;
        }
        K B0 = ((C3605y) abstractC3595n).B0();
        if (B0 == null || B0.e() == null) {
            return;
        }
        new n(abstractC3595n).i(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C0(AbstractC3595n abstractC3595n) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                K B0 = ((C3605y) abstractC3595n).B0();
                if (B0 == null || B0.e() == null || !i0(B0)) {
                    return false;
                }
                long q = abstractC3595n.q();
                C3604x c3604x = (C3604x) this.q.u();
                ParcelFileDescriptor U0 = c3604x.U0((C3605y) abstractC3595n);
                if (U0 == null) {
                    if (U0 != null) {
                        try {
                            U0.close();
                        } catch (IOException unused) {
                        }
                    }
                    return false;
                }
                C3495a c3495a = new C3495a(U0.getFileDescriptor());
                if (c3495a.l("Orientation", 1) == 0) {
                    c3495a.f0();
                }
                c3495a.h0(-90);
                c3495a.i0();
                c3604x.d(abstractC3595n, q);
                c3604x.Q1(abstractC3595n);
                C2947d.B(this, this.q.H(abstractC3595n));
                try {
                    U0.close();
                } catch (IOException unused2) {
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (0 != 0) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private void D0() {
        if (!r0()) {
            C3184b.f();
            Toast.makeText(this, R.string.error, 1).show();
        } else {
            this.E = true;
            C1832u.s0(this, Uri.fromFile(new File(this.C)), this.D);
            finish();
        }
    }

    private void E0(AbstractC3595n abstractC3595n) {
        ax.Q2.a.i().m("menu_image_viewer", "set_as").e();
        if (C1809B.H(abstractC3595n)) {
            C1832u.g0(s(), (AbstractC1823k) abstractC3595n);
            return;
        }
        File Z = abstractC3595n.Z();
        if (!C1809B.G(Z, abstractC3595n)) {
            h0(abstractC3595n, new a(abstractC3595n, Z));
        } else {
            t.b().e(Z);
            C1832u.h0(s(), abstractC3595n.s(), Z);
        }
    }

    private void G0(AbstractC3595n abstractC3595n) {
        this.z = abstractC3595n;
        this.A = abstractC3595n.q();
    }

    private void H0(AbstractC3595n abstractC3595n) {
        ax.Q2.a.i().m("menu_image_viewer", "share").c("loc", "image_viewer").c("type", "file").e();
        if (C1809B.H(abstractC3595n)) {
            C1832u.j0(s(), (AbstractC1823k) abstractC3595n);
            return;
        }
        File Z = abstractC3595n.Z();
        if (!C1809B.G(Z, abstractC3595n)) {
            h0(abstractC3595n, new b(abstractC3595n, Z));
        } else {
            t.b().e(Z);
            C1832u.m0(s(), abstractC3595n.s(), Z);
        }
    }

    private void I0(AbstractC3595n abstractC3595n) {
        j().c(true);
        if (j().s()) {
            return;
        }
        j().n();
    }

    private void L0(AbstractC3595n abstractC3595n) {
        if (j() == null || j().V() == null) {
            return;
        }
        if (!j().s()) {
            j().n();
        }
        this.l.D();
    }

    private boolean M0(AbstractC3595n abstractC3595n) {
        if (C1809B.H(abstractC3595n)) {
            return true;
        }
        Q.r0();
        return false;
    }

    private void d0() {
        f fVar = new f(400L);
        this.s = new C3418d(s(), findViewById(R.id.bottom_menu_layout), null);
        if (r0()) {
            this.s.d(R.id.menu_save, R.string.menu_save, R.drawable.ic_save, fVar);
            this.s.d(R.id.menu_info, R.string.menu_info, R.drawable.ic_info_outline, fVar);
            this.s.d(R.id.menu_set_as, R.string.set_as, R.drawable.ic_ab_wallpaper, fVar);
            return;
        }
        this.s.d(R.id.menu_share, R.string.menu_share, R.drawable.ic_share, fVar);
        this.s.d(R.id.menu_rotate, R.string.menu_rotate, R.drawable.ic_rotate_90_ccw, fVar);
        this.s.d(R.id.menu_delete, R.string.menu_delete, R.drawable.ic_delete, fVar);
        this.s.d(R.id.menu_info, R.string.menu_info, R.drawable.ic_info_outline, fVar);
        this.s.e();
        this.s.l(R.menu.image_viewer);
        this.s.n(new g());
        this.s.x(new h());
    }

    private void e0() {
        AbstractC3595n abstractC3595n = this.z;
        if (abstractC3595n == null) {
            return;
        }
        if (abstractC3595n instanceof AbstractC1823k) {
            try {
                if (C1835x.e(abstractC3595n.R()).z(this.z.E()).q() != this.A) {
                    ((com.voxdon.xplorer.viewer.b) j()).f1();
                }
            } catch (C1495j unused) {
            }
        }
        this.z = null;
        this.A = 0L;
    }

    private void g0(AbstractC3595n abstractC3595n) {
        ax.Q2.a.i().m("menu_image_viewer", "delete").c("loc", "image_viewer").c("type", "file").e();
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC3595n);
        boolean z = C1809B.a(arrayList) && ax.Q2.f.l(abstractC3595n.P());
        j().L();
        o.m(this.q, arrayList, 0, z, this, false, new i(abstractC3595n), new j());
    }

    private void h0(AbstractC3595n abstractC3595n, AbstractC1927n.p pVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC3595n);
        ax.W2.r l2 = ax.W2.r.l();
        l2.k(this.q, arrayList, true, new l(pVar));
        try {
            l(l2, true);
        } catch (C1488c unused) {
            Toast.makeText(this, R.string.error, 0).show();
        }
    }

    private boolean i0(K k2) {
        String e2 = k2.e();
        if (this.m.containsKey(e2)) {
            return this.m.get(e2).booleanValue();
        }
        boolean t = C1809B.t(k2);
        this.m.put(e2, Boolean.valueOf(t));
        return t;
    }

    private void j0(AbstractC3595n abstractC3595n) {
        if (C1809B.H(abstractC3595n)) {
            try {
                C1832u.o0(this, C1832u.e(this, (AbstractC1823k) abstractC3595n, false));
            } catch (ActivityNotFoundException unused) {
                J0(getString(R.string.no_apps_to_open_file), -1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC3595n k0(Uri uri) {
        if (uri == null) {
            return null;
        }
        for (AbstractC3595n abstractC3595n : this.n) {
            if (uri.toString().equals(abstractC3595n.Q())) {
                return abstractC3595n;
            }
        }
        return null;
    }

    private void m0(int i2) {
        View j2 = i2 == 20 ? this.s.j() : l0();
        if (j2 != null) {
            if (q0()) {
                j().n();
            } else {
                j().u0();
            }
            j2.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m n0(Intent intent) {
        ComponentName component = intent.getComponent();
        if (this.y.containsKey(component)) {
            return this.y.get(component);
        }
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        ResolveInfo resolveInfo = queryIntentActivities.get(0);
        CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(packageManager);
        Drawable n2 = ax.Z2.h.n(packageManager, resolveInfo, 0);
        if (n2 != null) {
            int e2 = C3180B.e(this, C3418d.n);
            n2 = new BitmapDrawable(getResources(), z.f(n2, e2, e2));
        }
        m mVar = new m(loadLabel, n2);
        this.y.put(component, mVar);
        return mVar;
    }

    private boolean o0(ViewGroup viewGroup, View view) {
        return z.s(viewGroup, view);
    }

    private boolean p0(String str) {
        return "webp".equals(str) || "png".equals(str) || "jpg".equals(str) || "jpeg".equals(str);
    }

    private boolean q0() {
        return this.s.k() != 0;
    }

    private boolean r0() {
        return this.C != null;
    }

    private void s0(AbstractC3595n abstractC3595n) {
        Intent W0 = com.voxdon.xplorer.viewer.b.W0(this, abstractC3595n, false);
        if (W0 != null && C1832u.U(W0)) {
            ((com.voxdon.xplorer.viewer.b) j()).r(Uri.parse(abstractC3595n.Q()), true);
        } else if (W0 != null) {
            try {
                C1832u.o0(this, W0);
                G0(abstractC3595n);
            } catch (ActivityNotFoundException | NullPointerException | SecurityException e2) {
                Toast.makeText(this, R.string.error, 1).show();
                ax.Ha.c.h().f().b("ImageViewer openDefault").l(e2).h();
            }
        }
    }

    private void t0(AbstractC1823k abstractC1823k, String str, String str2, boolean z, boolean z2) {
        ax.a3.Q.R3(m(), c.a.IN_IMAGE_VIEWER, ax.a3.Q.E3(abstractC1823k), str, str2, z, z2);
        G0(abstractC1823k);
    }

    private void u0(AbstractC3595n abstractC3595n) {
        if (isFinishing()) {
            return;
        }
        String s = abstractC3595n.s();
        if (!C1834w.a(this, abstractC3595n, s, false)) {
            Toast.makeText(this, R.string.no_apps_to_open_file, 1).show();
        } else if (C1809B.H(abstractC3595n)) {
            t0((AbstractC1823k) abstractC3595n, s, s, true, true);
        } else {
            C3184b.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        AbstractC3595n k0;
        Uri V0 = ((com.voxdon.xplorer.viewer.b) j()).V0();
        if (V0 != null && (k0 = k0(V0)) != null && this.l.x() && !this.l.w() && C1809B.H(k0) && k0.G() == EnumC1837z.VIDEO && C1808A.E(k0)) {
            this.l.y();
            try {
                startActivityForResult(C1834w.i(this, (AbstractC1823k) k0, this.l.s() ? 0 : this.l.r(), false), G);
            } catch (ActivityNotFoundException | NullPointerException | SecurityException e2) {
                Toast.makeText(this, R.string.error, 1).show();
                ax.Ha.c.h().f().b("PVI:").l(e2).h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w0(int i2) {
        AbstractC3595n k0;
        j().u0();
        Uri V0 = ((com.voxdon.xplorer.viewer.b) j()).V0();
        if (V0 == null || (k0 = k0(V0)) == null) {
            return false;
        }
        switch (i2) {
            case R.id.menu_delete /* 2131362506 */:
            case R.id.menu_edit /* 2131362507 */:
                if (C3604x.E1(this, k0, false)) {
                    C3605y c3605y = (C3605y) k0;
                    R(3, c3605y.B0(), c3605y.M0(), false, true);
                    return true;
                }
                break;
        }
        switch (i2) {
            case R.id.menu_delete /* 2131362506 */:
                g0(k0);
                break;
            case R.id.menu_edit /* 2131362507 */:
                j0(k0);
                break;
            case R.id.menu_info /* 2131362516 */:
                I0(k0);
                break;
            case R.id.menu_open_default /* 2131362522 */:
                s0(k0);
                break;
            case R.id.menu_open_with /* 2131362524 */:
                u0(k0);
                break;
            case R.id.menu_rotate /* 2131362535 */:
                B0(k0);
                break;
            case R.id.menu_save /* 2131362536 */:
                D0();
                break;
            case R.id.menu_set_as /* 2131362543 */:
                E0(k0);
                break;
            case R.id.menu_share /* 2131362545 */:
                H0(k0);
                break;
            case R.id.menu_slideshow /* 2131362547 */:
                L0(k0);
                break;
        }
        return false;
    }

    public void F0(boolean z) {
        if (this.v == null || this.w == null || j() == null) {
            return;
        }
        this.u = z;
        this.v.setVisibility(z ? 0 : 8);
        x0();
    }

    void J0(CharSequence charSequence, int i2) {
        C3180B.T(this.t, charSequence, i2).a0();
    }

    void K0(AbstractC3595n abstractC3595n, int i2, CharSequence charSequence, List<String> list) {
        C3180B.O(this.t, charSequence, 0, R.string.menu_undo, false, new k(list, i2, abstractC3595n)).a0();
    }

    @Override // com.android.ex.photo.f.g
    public boolean d() {
        return this.l.u();
    }

    @Override // com.android.ex.photo.f.g
    public void e(int i2) {
        if (i2 == 1) {
            this.l.p();
        }
    }

    @Override // com.android.ex.photo.f.g
    public void f() {
        this.l.q();
    }

    protected com.android.ex.photo.f f0() {
        c.a a2 = com.voxdon.xplorer.viewer.c.b().a(getIntent().getStringExtra(H));
        if (a2 != null) {
            this.n = a2.a;
            this.r = a2.b;
        }
        getIntent().putExtra("photo_index", this.r);
        return new com.voxdon.xplorer.viewer.b(this, this.n, this.q);
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity
    public View findViewById(int i2) {
        return getDelegate().l(i2);
    }

    @Override // com.android.ex.photo.f.g
    public void i() {
        AbstractC3595n k0;
        Uri V0 = ((com.voxdon.xplorer.viewer.b) j()).V0();
        if (V0 == null || (k0 = k0(V0)) == null) {
            return;
        }
        if (k0.G() != EnumC1837z.VIDEO || M0(k0)) {
            this.s.t(R.id.menu_info, true);
        } else {
            this.s.t(R.id.menu_info, false);
        }
        if (!r0()) {
            if (this.q.e0(k0)) {
                this.s.o(R.id.menu_delete, true);
            } else {
                this.s.o(R.id.menu_delete, false);
            }
            this.s.t(R.id.menu_rotate, Q.E1() && (k0 instanceof C3605y) && k0.G() == EnumC1837z.IMAGE && p0(k0.A()) && i0(((C3605y) k0).B0()));
        }
        v0();
    }

    @Override // com.android.ex.photo.f.g
    public com.android.ex.photo.f j() {
        return this.j;
    }

    View l0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTouchscreenBlocksFocus(false);
        View childAt = toolbar.getChildAt(0);
        if (!(childAt instanceof p)) {
            C3184b.e("not work anymore");
            return childAt;
        }
        if (toolbar.getNavigationContentDescription() == null || !toolbar.getNavigationContentDescription().equals(childAt.getContentDescription())) {
            C3184b.e("not work anymore");
            return childAt;
        }
        childAt.setId(android.R.id.home);
        return childAt;
    }

    @Override // com.android.ex.photo.f.g
    public Fragment m() {
        return this.x;
    }

    @Override // com.android.ex.photo.f.g
    public com.android.ex.photo.a o() {
        if (this.k == null) {
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            this.k = new com.android.ex.photo.b(getSupportActionBar());
        }
        return this.k;
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.j.d0(i2, i3, intent);
        if (i2 == G) {
            if (i3 == -1) {
                A0();
            } else if (i3 == 0) {
                this.l.p();
                if (this.j.s()) {
                    this.j.n();
                }
            }
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        PhotoViewPager V = j().V();
        if (V != null) {
            int currentItem = V.getCurrentItem();
            V.setAdapter(V.getAdapter());
            V.setCurrentItem(currentItem);
        }
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M m2 = (M) getSupportFragmentManager().k0("headless_fragment");
        this.x = m2;
        if (m2 == null) {
            this.x = M.K2("ImageViewerActivity");
            getSupportFragmentManager().o().e(this.x, "headless_fragment").i();
        }
        this.o = (ax.Q2.f) getIntent().getSerializableExtra("location");
        this.p = getIntent().getIntExtra("location_key", 0);
        if (this.o == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpUrl.FRAGMENT_ENCODE_SET);
            sb.append(getIntent().getExtras() == null);
            sb.append(",key:");
            sb.append(this.p);
            ax.Ha.c.h().d("ImageViewer no location").g(sb.toString()).h();
            Toast.makeText(this, R.string.error, 1).show();
            finish();
            return;
        }
        this.C = getIntent().getStringExtra("extra_temp_file_path");
        this.D = getIntent().getStringExtra("extra_temp_file_type");
        C3596o d2 = C1835x.d(this.o, this.p);
        this.q = d2;
        d2.n0();
        com.android.ex.photo.f f0 = f0();
        this.j = f0;
        f0.f0(bundle);
        this.l = new C3409E(findViewById(R.id.slideshow_options), this.j.V(), new d());
        List<AbstractC3595n> list = this.n;
        if (list == null || list.size() == 0) {
            finish();
            return;
        }
        if (!this.q.a()) {
            if ((this.q.u() instanceof C3583b) && !((C3583b) this.q.u()).e1()) {
                ax.Ha.b b2 = ax.Ha.c.h().f().b("IMAGEVIEWER NOT CONNECTED OPERATOR ARCHIVE");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("location:");
                sb2.append(this.o.I());
                sb2.append(",");
                sb2.append(this.p);
                sb2.append(",");
                sb2.append(bundle != null);
                b2.g(sb2.toString()).h();
                Toast.makeText(this, R.string.error, 1).show();
                finish();
                return;
            }
            ax.Ha.c.h().f().b("IMAGEVIEWER NOT CONNECTED OPERATOR").g("location:" + this.o.I()).h();
        }
        d0();
        this.t = findViewById(R.id.snackbar_container);
        this.v = findViewById(R.id.btn_motion_play);
        this.w = findViewById(R.id.buttons_line);
        getOnBackPressedDispatcher().h(this, this.F);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        com.android.ex.photo.f fVar = this.j;
        return (fVar != null && fVar.g0(menu)) || super.onCreateOptionsMenu(menu);
    }

    @Override // com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        com.android.ex.photo.f fVar = this.j;
        if (fVar != null) {
            fVar.h0();
        }
        C3596o c3596o = this.q;
        if (c3596o != null) {
            c3596o.k0(false);
        }
        try {
            super.onDestroy();
        } catch (IllegalArgumentException unused) {
        }
        if (!r0() || this.E) {
            return;
        }
        try {
            new File(this.C).delete();
        } catch (Exception unused2) {
        }
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        View currentFocus;
        if (this.l.u()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.l.p();
        if (keyEvent.isMetaPressed() || keyEvent.isShiftPressed() || keyEvent.isAltPressed()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 == 112) {
            w0(R.id.menu_delete);
            return true;
        }
        switch (i2) {
            case 19:
            case 20:
                if (j().s()) {
                    m0(i2);
                    return true;
                }
                View currentFocus2 = getCurrentFocus();
                if (currentFocus2 == null) {
                    m0(i2);
                    return true;
                }
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bottom_menu_layout);
                if (o0(toolbar, currentFocus2)) {
                    if (i2 == 20) {
                        j().n();
                        return true;
                    }
                } else {
                    if (!o0(viewGroup, currentFocus2)) {
                        m0(i2);
                        return true;
                    }
                    if (i2 == 19) {
                        j().n();
                        return true;
                    }
                }
                break;
            case 21:
            case 22:
                boolean onKeyDown = super.onKeyDown(i2, keyEvent);
                if (!q0() && (currentFocus = getCurrentFocus()) != null) {
                    Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar);
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.bottom_menu_layout);
                    if (o0(toolbar2, currentFocus) || o0(viewGroup2, currentFocus)) {
                        j().u0();
                    }
                }
                return onKeyDown;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.j.l0(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return w0(menuItem.getItemId());
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        this.j.m0();
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        com.android.ex.photo.f fVar = this.j;
        return (fVar != null && fVar.n0(menu)) || super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.j.o0();
        e0();
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.j.p0(bundle);
    }

    @Override // com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.j.q0();
        if (Q.N1()) {
            v.s(getWindow(), -1157627904);
            v.r(getWindow(), -1157627904);
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        this.j.r0();
        this.l.p();
        super.onStop();
    }

    @Override // com.android.ex.photo.f.g
    public void p() {
        com.android.ex.photo.f fVar = this.j;
        if (fVar == null || this.B) {
            return;
        }
        this.F.j(fVar.b0());
    }

    @Override // com.android.ex.photo.f.g
    public void q(boolean z) {
        if (getSupportActionBar() == null || this.s == null) {
            C3184b.f();
            return;
        }
        if (z) {
            getSupportActionBar().n();
            this.s.y(8);
        } else {
            getSupportActionBar().J();
            this.s.y(0);
            this.s.A();
            if (j() != null && j().B()) {
                j().c(false);
            }
            this.l.p();
        }
        x0();
    }

    @Override // com.android.ex.photo.f.g
    public boolean r() {
        return this.l.v();
    }

    public void x0() {
        if (j() == null) {
            return;
        }
        this.w.setVisibility(!j().B() && this.u ? 0 : 8);
    }

    public void y0() {
        z0();
    }

    void z0() {
        Fragment k0 = getSupportFragmentManager().k0("dialog");
        if (k0 != null) {
            androidx.fragment.app.t o = getSupportFragmentManager().o();
            o.q(k0);
            o.j();
        }
    }

    @Override // com.voxdon.xplorer.activity.a, ax.R2.a
    public ActivityC2561c s() {
        return this;
    }
}
