package com.voxdon.xplorer.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.Q2.f;
import ax.Q2.j;
import ax.X2.Q;
import ax.Z2.k;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.d3.AbstractC1927n;
import ax.d3.C0;
import ax.d3.Z;
import ax.d3.x0;
import ax.h3.C2148b;
import ax.s3.u;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.x3.C3405A;
import ax.x3.C3422h;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.musicplayer.PlaybackControlsFragment;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.widget.WindowInsetsFrameLayout;
import com.voxdon.xplorer.R;
import com.example.android.uamp.MusicService;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends com.voxdon.xplorer.activity.a implements x0.a {
    private MediaBrowserCompat j;
    private MediaControllerCompat k;
    private CoordinatorLayout l;
    private View m;
    protected PlaybackControlsFragment n;
    private j o;
    private Uri q;
    private Bundle r;
    private C0 u;
    private x0 v;
    private boolean p = false;
    private boolean s = false;
    private boolean t = false;
    private final MediaControllerCompat.a w = new a();
    private final MediaBrowserCompat.c x = new C0512b();

    class a extends MediaControllerCompat.a {
        a() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            b.this.M0();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            b.this.M0();
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.b$b, reason: collision with other inner class name */
    class C0512b extends MediaBrowserCompat.c {
        C0512b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            b.this.p = false;
            try {
                b bVar = b.this;
                bVar.c0(bVar.j.c());
            } catch (RemoteException unused) {
                b.this.j0();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            b.this.p = false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            b.this.p = false;
            b.this.s0();
        }
    }

    class c extends SwipeDismissBehavior<ViewGroup> {
        c() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return true;
        }
    }

    class d implements SwipeDismissBehavior.c {
        d() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            b.this.K0();
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
        }
    }

    private void D0(MediaControllerCompat mediaControllerCompat) {
        this.k = mediaControllerCompat;
    }

    private void b0() {
        if (this.p) {
            return;
        }
        u.j(this);
        try {
            this.j.a();
            this.p = true;
        } catch (IllegalStateException e) {
            ax.Ha.c.h().f().b("MEDIA BROWSER CONNECT").l(e).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(MediaSessionCompat.Token token) throws RemoteException {
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this, token);
        MediaControllerCompat.l(this, mediaControllerCompat);
        D0(mediaControllerCompat);
        mediaControllerCompat.j(this.w);
        M0();
        PlaybackControlsFragment playbackControlsFragment = this.n;
        if (playbackControlsFragment != null) {
            playbackControlsFragment.V2(mediaControllerCompat);
        }
        u0();
        if (this.q != null) {
            if (this.r.getBoolean("PLAY_PREPARE", false)) {
                mediaControllerCompat.i().d(this.q, this.r);
            } else {
                mediaControllerCompat.i().c(this.q, this.r);
            }
            this.q = null;
            this.r = null;
        }
    }

    public boolean A0(AbstractC3595n abstractC3595n, String str, List<AbstractC3595n> list, int i) {
        if (this.q != null) {
            return false;
        }
        boolean d2 = C1809B.d(abstractC3595n);
        if (Q.a0() && !d2 && n0() && C3180B.N(this)) {
            return false;
        }
        return y0(abstractC3595n, str, list, true, i);
    }

    protected void B0() {
        x0 x0Var = this.v;
        if (x0Var != null) {
            x0Var.g();
        }
    }

    public void C0(Z z) {
        C0 c0 = this.u;
        if (c0 != null) {
            c0.x(z);
        }
    }

    public void E0(int i) {
        x0 x0Var = this.v;
        if (x0Var != null) {
            x0Var.i(i);
        }
    }

    public void F0(C3422h.a aVar) {
        C3422h e0 = e0();
        if (e0 == null || aVar == e0.d()) {
            return;
        }
        e0.a(aVar);
        x0();
    }

    void G0() {
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            c cVar = new c();
            cVar.Q(0.1f);
            cVar.O(0.6f);
            cVar.R(2);
            cVar.P(new d());
            ((CoordinatorLayout.f) layoutParams).o(cVar);
        }
    }

    protected boolean H0() {
        MediaControllerCompat f0 = f0();
        if (f0 != null && f0.d() != null && f0.e() != null) {
            AbstractC1927n d0 = d0();
            int j = f0.e().j();
            if (d0 != null && d0.z3() == f.A0) {
                return j != 1 ? j != 7 : C2148b.b(this).e();
            }
            if (j != 0) {
                if (j != 1) {
                    if (j == 2) {
                        return true;
                    }
                    if (j != 7) {
                        if (d0 == null || d0.C3() == null) {
                            return j != 2;
                        }
                        try {
                            String string = f0.d().d().getString("__SOURCE_FOLDER__");
                            if (string != null) {
                                if (string.equals(C1809B.U(d0.A3(), d0.C3()))) {
                                    return true;
                                }
                            }
                            return j != 2;
                        } catch (RuntimeException e) {
                            ax.Ha.c.h().f().b("MusicPlayer MetaData error").l(e).h();
                            return false;
                        }
                    }
                }
                return false;
            }
            if (!C2148b.b(this).f(3600000L)) {
                return true;
            }
        }
        return false;
    }

    protected void I0() {
        if (this.t) {
            return;
        }
        this.m.clearAnimation();
        this.m.setAlpha(1.0f);
        if (this.l.getVisibility() != 0) {
            this.l.setVisibility(0);
            getSupportFragmentManager().o().t(R.anim.dock_bottom_enter, R.anim.dock_bottom_exit, R.anim.dock_bottom_enter, R.anim.dock_bottom_exit).v(this.n).j();
            B0();
        }
    }

    public void J0(boolean z) {
        C3422h e0 = e0();
        if (e0 == null) {
            return;
        }
        e0.t(z);
    }

    public void K0() {
        MediaControllerCompat f0 = f0();
        if (f0 == null || f0.d() == null || f0.e() == null) {
            j0();
            return;
        }
        MediaControllerCompat.c(this).i().k();
        C2148b.b(this).a();
        j0();
    }

    public abstract void L0();

    protected void M0() {
        if (this.n == null || isFinishing()) {
            return;
        }
        if (H0()) {
            I0();
            return;
        }
        j0();
        MediaControllerCompat f0 = f0();
        if (f0 == null || f0.e() == null || f0.e().j() != 2) {
            return;
        }
        k c2 = C2148b.b(this).c();
        if (c2 == null || c2.b() != f.A0) {
            f0.i().k();
        }
    }

    public void Y(Z z) {
        C0 c0 = this.u;
        if (c0 != null) {
            c0.n(z);
        }
    }

    public abstract void a0(f fVar, int i, String str);

    public abstract AbstractC1927n d0();

    public abstract C3422h e0();

    public MediaControllerCompat f0() {
        return this.k;
    }

    public j g0() {
        return this.o;
    }

    public abstract C3405A h0();

    public Point i0() {
        C0 c0 = this.u;
        if (c0 != null) {
            return c0.t(this);
        }
        C3184b.g("Invalid WindowSizeChanged Called.");
        return new Point(0, 0);
    }

    protected void j0() {
        CoordinatorLayout coordinatorLayout;
        if (this.t || (coordinatorLayout = this.l) == null || coordinatorLayout.getVisibility() == 8) {
            return;
        }
        getSupportFragmentManager().o().p(this.n).j();
        this.l.setVisibility(8);
        B0();
    }

    protected void k0() {
        x0 x0Var = new x0(this, this);
        this.v = x0Var;
        x0Var.d((WindowInsetsFrameLayout) findViewById(R.id.root_view));
    }

    public boolean l0() {
        return this.p;
    }

    protected boolean m0() {
        return this.n != null && this.l.getVisibility() == 0;
    }

    public boolean n0() {
        return this.s;
    }

    public boolean o0() {
        C0 c0 = this.u;
        if (c0 == null) {
            return false;
        }
        return c0.u();
    }

    @Override // ax.n.ActivityC2561c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C0 c0 = this.u;
        if (c0 != null) {
            c0.v(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j = new MediaBrowserCompat(this, new ComponentName(this, (Class<?>) MusicService.class), this.x, null);
        this.o = new j();
        this.s = false;
        com.voxdon.xplorer.shizuku.c.t().j();
        C0 c0 = new C0(this);
        this.u = c0;
        c0.m(null);
    }

    @Override // com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        this.t = true;
        super.onDestroy();
        com.voxdon.xplorer.shizuku.c.t().G();
    }

    @Override // ax.d3.x0.a
    public void onIMEVisibilityChanged(boolean z) {
    }

    @Override // com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.s = false;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.playback_controls_layout);
        this.l = coordinatorLayout;
        if (coordinatorLayout == null) {
            throw new IllegalStateException("Mising view with id 'controls'. Cannot continue.");
        }
        this.m = findViewById(R.id.fragment_playback_controls);
        G0();
        PlaybackControlsFragment playbackControlsFragment = (PlaybackControlsFragment) getSupportFragmentManager().j0(R.id.fragment_playback_controls);
        this.n = playbackControlsFragment;
        if (playbackControlsFragment == null) {
            throw new IllegalStateException("Mising fragment with id 'controls'. Cannot continue.");
        }
        j0();
        if (!MusicService.G() || this.p) {
            return;
        }
        if (this.j.d()) {
            this.j.b();
        }
        b0();
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.s = true;
        this.p = false;
        s0();
        this.j.b();
    }

    public abstract void p0();

    public abstract void q0(String str);

    public abstract void r0(Bookmark bookmark);

    protected void s0() {
        this.q = null;
        this.r = null;
        if (f0() != null) {
            f0().m(this.w);
            PlaybackControlsFragment playbackControlsFragment = this.n;
            if (playbackControlsFragment != null) {
                playbackControlsFragment.W2(f0());
            }
        }
        D0(null);
        MediaControllerCompat.l(this, null);
        v0();
        j0();
    }

    public abstract void t0(f fVar, int i, String str, boolean z);

    protected void u0() {
        Intent intent = new Intent("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED");
        intent.putExtra("CONNECTED", true);
        C3189g.a().e(intent);
    }

    protected void v0() {
        Intent intent = new Intent("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED");
        intent.putExtra("CONNECTED", false);
        C3189g.a().e(intent);
    }

    public abstract void w0(f fVar, int i, String str, boolean z);

    public abstract void x0();

    public boolean y0(AbstractC3595n abstractC3595n, String str, List<AbstractC3595n> list, boolean z, int i) {
        boolean z2;
        Uri l;
        Uri l2;
        ax.Q4.a.b().a();
        boolean d2 = C1809B.d(abstractC3595n);
        int h = com.voxdon.xplorer.service.b.f(this).h();
        if (!d2) {
            HttpServerService.q(this, abstractC3595n.P(), abstractC3595n.L(), true, true, false, null);
        }
        Bundle bundle = new Bundle();
        if (list != null && list.size() != 0) {
            ArrayList<AbstractC3595n> c2 = C1808A.c(list);
            ArrayList arrayList = new ArrayList();
            if (c2.size() != 0) {
                ArrayList<Pair<Uri, String>> arrayList2 = new ArrayList<>();
                int size = c2.size();
                boolean z3 = false;
                int i2 = 0;
                while (i2 < size) {
                    AbstractC3595n abstractC3595n2 = c2.get(i2);
                    i2++;
                    AbstractC3595n abstractC3595n3 = abstractC3595n2;
                    if (abstractC3595n.E().equals(abstractC3595n3.E())) {
                        z3 = true;
                    }
                    if (C1809B.d(abstractC3595n3)) {
                        l2 = C1832u.H(abstractC3595n3, true);
                    } else {
                        arrayList.add(abstractC3595n3);
                        l2 = HttpServerService.l(h, abstractC3595n3);
                    }
                    arrayList2.add(new Pair<>(l2, abstractC3595n3.Q()));
                }
                if (arrayList.size() > 0) {
                    com.voxdon.xplorer.service.b.f(b()).b(arrayList);
                }
                if (z3) {
                    ax.Q4.a.b().d(arrayList2);
                }
            }
        }
        bundle.putString("PLAY_FOLDER_URI", str);
        bundle.putBoolean("PLAY_LOCAL_HTTP", !d2);
        bundle.putInt("PLAYER_ENGINE", ax.t3.j.h(this));
        if (z) {
            bundle.putBoolean("PLAY_PREPARE", z);
        }
        bundle.putInt("PLAY_RESUME_POSITION", i);
        if (d2) {
            z2 = true;
            l = C1832u.H(abstractC3595n, true);
        } else {
            z2 = true;
            com.voxdon.xplorer.service.b.f(b()).c(abstractC3595n);
            l = HttpServerService.l(h, abstractC3595n);
        }
        C2148b.b(this).h(str, abstractC3595n.Q(), i);
        z0(l, bundle);
        return z2;
    }

    public void z0(Uri uri, Bundle bundle) {
        if (f0() == null) {
            this.q = uri;
            this.r = bundle;
            b0();
        } else {
            this.q = null;
            this.r = null;
            if (bundle.getBoolean("PLAY_PREPARE", false)) {
                f0().i().d(uri, bundle);
            } else {
                f0().i().c(uri, bundle);
            }
        }
    }
}
