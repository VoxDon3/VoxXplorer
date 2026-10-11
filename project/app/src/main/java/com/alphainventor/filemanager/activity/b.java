/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.ComponentName;
import android.content.Context;
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
import ax.c3.B;
import ax.c3.u;
import ax.d3.C0;
import ax.d3.Z;
import ax.d3.n;
import ax.d3.x0;
import ax.u3.g;
import ax.x3.A;
import ax.x3.h;
import com.alphainventor.filemanager.activity.a;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.musicplayer.PlaybackControlsFragment;
import com.alphainventor.filemanager.service.HttpServerService;
import com.alphainventor.filemanager.shizuku.c;
import com.alphainventor.filemanager.widget.WindowInsetsFrameLayout;
import com.example.android.uamp.MusicService;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;

public abstract class b
extends a
implements x0.a {
    private MediaBrowserCompat j;
    private MediaControllerCompat k;
    private CoordinatorLayout l;
    private View m;
    protected PlaybackControlsFragment n;
    private j o;
    private boolean p = false;
    private Uri q;
    private Bundle r;
    private boolean s = false;
    private boolean t = false;
    private C0 u;
    private x0 v;
    private final MediaControllerCompat.a w = new MediaControllerCompat.a(this){
        final b d;
        {
            this.d = b8;
        }

        @Override
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            this.d.M0();
        }

        @Override
        public void e(PlaybackStateCompat playbackStateCompat) {
            this.d.M0();
        }
    };
    private final MediaBrowserCompat.c x = new MediaBrowserCompat.c(this){
        final b c;
        {
            this.c = b8;
        }

        @Override
        public void a() {
            b.V(this.c, false);
            try {
                b b8 = this.c;
                b8.c0(b8.j.c());
                return;
            }
            catch (RemoteException remoteException) {
                this.c.j0();
                return;
            }
        }

        @Override
        public void b() {
            b.V(this.c, false);
        }

        @Override
        public void c() {
            b.V(this.c, false);
            this.c.s0();
        }
    };

    private void D0(MediaControllerCompat mediaControllerCompat) {
        this.k = mediaControllerCompat;
    }

    static /* synthetic */ boolean V(b b8, boolean bl) {
        b8.p = bl;
        return bl;
    }

    private void b0() {
        if (!this.p) {
            ax.s3.u.j((Context)this);
            try {
                this.j.a();
                this.p = true;
                return;
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.c.h().f().b("MEDIA BROWSER CONNECT").l(illegalStateException).h();
            }
        }
    }

    private void c0(MediaSessionCompat.Token object) throws RemoteException {
        object = new MediaControllerCompat((Context)this, (MediaSessionCompat.Token)object);
        MediaControllerCompat.l(this, (MediaControllerCompat)object);
        this.D0((MediaControllerCompat)object);
        ((MediaControllerCompat)object).j(this.w);
        this.M0();
        PlaybackControlsFragment playbackControlsFragment = this.n;
        if (playbackControlsFragment != null) {
            playbackControlsFragment.V2((MediaControllerCompat)object);
        }
        this.u0();
        if (this.q != null) {
            if (this.r.getBoolean("PLAY_PREPARE", false)) {
                ((MediaControllerCompat)object).i().d(this.q, this.r);
            } else {
                ((MediaControllerCompat)object).i().c(this.q, this.r);
            }
            this.q = null;
            this.r = null;
        }
    }

    public boolean A0(com.alphainventor.filemanager.file.n n8, String string, List<com.alphainventor.filemanager.file.n> list, int n9) {
        if (this.q != null) {
            return false;
        }
        boolean bl = B.d(n8);
        if (Q.a0() && !bl && this.n0() && ax.u3.B.N((Context)this)) {
            return false;
        }
        return this.y0(n8, string, list, true, n9);
    }

    protected void B0() {
        x0 x02 = this.v;
        if (x02 != null) {
            x02.g();
        }
    }

    public void C0(Z z8) {
        C0 c02 = this.u;
        if (c02 != null) {
            c02.x(z8);
        }
    }

    public void E0(int n8) {
        x0 x02 = this.v;
        if (x02 != null) {
            x02.i(n8);
        }
    }

    public void F0(h.a a8) {
        h h8 = this.e0();
        if (h8 == null || a8 == h8.d()) {
            return;
        }
        h8.a(a8);
        this.x0();
    }

    void G0() {
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            SwipeDismissBehavior<ViewGroup> swipeDismissBehavior = new SwipeDismissBehavior<ViewGroup>(this){
                final b l;
                {
                    this.l = b8;
                }

                @Override
                public boolean J(View view) {
                    return true;
                }
            };
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(2);
            swipeDismissBehavior.P(new SwipeDismissBehavior.c(this){
                final b a;
                {
                    this.a = b8;
                }

                @Override
                public void a(View view) {
                    this.a.K0();
                }

                @Override
                public void b(int n8) {
                }
            });
            ((CoordinatorLayout.f)layoutParams).o(swipeDismissBehavior);
        }
    }

    protected boolean H0() {
        Object object = this.f0();
        if (object != null && ((MediaControllerCompat)object).d() != null && ((MediaControllerCompat)object).e() != null) {
            n n8 = this.d0();
            int n9 = ((MediaControllerCompat)object).e().j();
            if (n8 != null && n8.z3() == f.A0) {
                if (n9 != 1) {
                    return n9 != 7;
                }
                return ax.h3.b.b((Context)this).e();
            }
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 7) {
                            if (n8 != null && n8.C3() != null) {
                                RuntimeException runtimeException2;
                                block15: {
                                    block14: {
                                        try {
                                            object = ((MediaControllerCompat)object).d().d().getString("__SOURCE_FOLDER__");
                                            if (object == null) break block14;
                                        }
                                        catch (RuntimeException runtimeException2) {
                                            break block15;
                                        }
                                        boolean bl = ((String)object).equals(B.U(n8.A3(), n8.C3()));
                                        if (bl) {
                                            return true;
                                        }
                                    }
                                    return n9 != 2;
                                }
                                ax.Ha.c.h().f().b("MusicPlayer MetaData error").l(runtimeException2).h();
                                return false;
                            }
                            return n9 != 2;
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            if (!ax.h3.b.b((Context)this).f(3600000L)) {
                return true;
            }
        }
        return false;
    }

    protected void I0() {
        if (!this.t) {
            this.m.clearAnimation();
            this.m.setAlpha(1.0f);
            if (this.l.getVisibility() != 0) {
                this.l.setVisibility(0);
                this.getSupportFragmentManager().o().t(2130771996, 2130771997, 2130771996, 2130771997).v(this.n).j();
                this.B0();
            }
        }
    }

    public void J0(boolean bl) {
        h h8 = this.e0();
        if (h8 == null) {
            return;
        }
        h8.t(bl);
    }

    public void K0() {
        MediaControllerCompat mediaControllerCompat = this.f0();
        if (mediaControllerCompat != null && mediaControllerCompat.d() != null && mediaControllerCompat.e() != null) {
            MediaControllerCompat.c(this).i().k();
            ax.h3.b.b((Context)this).a();
            this.j0();
            return;
        }
        this.j0();
    }

    public abstract void L0();

    protected void M0() {
        if (this.n != null && !this.isFinishing()) {
            k k8;
            if (this.H0()) {
                this.I0();
                return;
            }
            this.j0();
            MediaControllerCompat mediaControllerCompat = this.f0();
            if (mediaControllerCompat != null && mediaControllerCompat.e() != null && mediaControllerCompat.e().j() == 2 && ((k8 = ax.h3.b.b((Context)this).c()) == null || k8.b() != f.A0)) {
                mediaControllerCompat.i().k();
            }
        }
    }

    public void Y(Z z8) {
        C0 c02 = this.u;
        if (c02 != null) {
            c02.n(z8);
        }
    }

    public abstract void a0(f var1, int var2, String var3);

    public abstract n d0();

    public abstract h e0();

    public MediaControllerCompat f0() {
        return this.k;
    }

    public j g0() {
        return this.o;
    }

    public abstract A h0();

    public Point i0() {
        C0 c02 = this.u;
        if (c02 == null) {
            ax.u3.b.g("Invalid WindowSizeChanged Called.");
            return new Point(0, 0);
        }
        return c02.t((Context)this);
    }

    protected void j0() {
        CoordinatorLayout coordinatorLayout;
        if (!this.t && (coordinatorLayout = this.l) != null && coordinatorLayout.getVisibility() != 8) {
            this.getSupportFragmentManager().o().p(this.n).j();
            this.l.setVisibility(8);
            this.B0();
        }
    }

    protected void k0() {
        x0 x02;
        this.v = x02 = new x0(this, this);
        x02.d((WindowInsetsFrameLayout)((Object)this.findViewById(2131362746)));
    }

    public boolean l0() {
        return this.p;
    }

    protected boolean m0() {
        if (this.n == null) {
            return false;
        }
        return this.l.getVisibility() == 0;
    }

    public boolean n0() {
        return this.s;
    }

    public boolean o0() {
        C0 c02 = this.u;
        if (c02 == null) {
            return false;
        }
        return c02.u();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        C0 c02 = this.u;
        if (c02 != null) {
            c02.v(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.j = new MediaBrowserCompat((Context)this, new ComponentName((Context)this, MusicService.class), this.x, null);
        this.o = new j();
        this.s = false;
        c.t().j();
        object = new C0(this);
        this.u = object;
        ((C0)object).m(null);
    }

    @Override
    protected void onDestroy() {
        this.t = true;
        super.onDestroy();
        c.t().G();
    }

    @Override
    public void onIMEVisibilityChanged(boolean bl) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.s = false;
        Object object = (CoordinatorLayout)this.findViewById(2131362700);
        this.l = object;
        if (object != null) {
            this.m = this.findViewById(2131362334);
            this.G0();
            this.n = object = (PlaybackControlsFragment)this.getSupportFragmentManager().j0(2131362334);
            if (object != null) {
                this.j0();
                if (MusicService.G() && !this.p) {
                    if (this.j.d()) {
                        this.j.b();
                    }
                    this.b0();
                }
                return;
            }
            throw new IllegalStateException("Mising fragment with id 'controls'. Cannot continue.");
        }
        throw new IllegalStateException("Mising view with id 'controls'. Cannot continue.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.s = true;
        this.p = false;
        this.s0();
        this.j.b();
    }

    public abstract void p0();

    public abstract void q0(String var1);

    public abstract void r0(Bookmark var1);

    protected void s0() {
        this.q = null;
        this.r = null;
        if (this.f0() != null) {
            this.f0().m(this.w);
            PlaybackControlsFragment playbackControlsFragment = this.n;
            if (playbackControlsFragment != null) {
                playbackControlsFragment.W2(this.f0());
            }
        }
        this.D0(null);
        MediaControllerCompat.l(this, null);
        this.v0();
        this.j0();
    }

    public abstract void t0(f var1, int var2, String var3, boolean var4);

    protected void u0() {
        Intent intent = new Intent("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED");
        intent.putExtra("CONNECTED", true);
        g.a().e(intent);
    }

    protected void v0() {
        Intent intent = new Intent("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED");
        intent.putExtra("CONNECTED", false);
        g.a().e(intent);
    }

    public abstract void w0(f var1, int var2, String var3, boolean var4);

    public abstract void x0();

    public boolean y0(com.alphainventor.filemanager.file.n n8, String string, List<com.alphainventor.filemanager.file.n> object, boolean bl, int n9) {
        ax.Q4.a.b().a();
        boolean bl2 = B.d(n8);
        int n10 = com.alphainventor.filemanager.service.b.f((Context)this).h();
        if (!bl2) {
            HttpServerService.q((Context)this, n8.P(), n8.L(), true, true, false, null);
        }
        Bundle bundle = new Bundle();
        if (object != null && object.size() != 0) {
            ArrayList<com.alphainventor.filemanager.file.n> arrayList = ax.c3.A.c(object);
            ArrayList<com.alphainventor.filemanager.file.n> arrayList2 = new ArrayList<com.alphainventor.filemanager.file.n>();
            if (arrayList.size() != 0) {
                ArrayList<Pair<Uri, String>> arrayList3 = new ArrayList<Pair<Uri, String>>();
                int n11 = arrayList.size();
                boolean bl3 = false;
                int n12 = 0;
                while (n12 < n11) {
                    object = arrayList.get(n12);
                    ++n12;
                    com.alphainventor.filemanager.file.n n13 = (com.alphainventor.filemanager.file.n)object;
                    if (n8.E().equals(n13.E())) {
                        bl3 = true;
                    }
                    if (B.d(n13)) {
                        object = ax.c3.u.H(n13, true);
                    } else {
                        arrayList2.add(n13);
                        object = HttpServerService.l(n10, n13);
                    }
                    arrayList3.add((Pair<Uri, String>)new Pair(object, (Object)n13.Q()));
                }
                if (arrayList2.size() > 0) {
                    com.alphainventor.filemanager.service.b.f(this.b()).b(arrayList2);
                }
                if (bl3) {
                    ax.Q4.a.b().d(arrayList3);
                }
            }
        }
        bundle.putString("PLAY_FOLDER_URI", string);
        bundle.putBoolean("PLAY_LOCAL_HTTP", bl2 ^ true);
        bundle.putInt("PLAYER_ENGINE", ax.t3.j.h((Context)this));
        if (bl) {
            bundle.putBoolean("PLAY_PREPARE", bl);
        }
        bundle.putInt("PLAY_RESUME_POSITION", n9);
        if (bl2) {
            object = ax.c3.u.H(n8, true);
        } else {
            com.alphainventor.filemanager.service.b.f(this.b()).c(n8);
            object = HttpServerService.l(n10, n8);
        }
        ax.h3.b.b((Context)this).h(string, n8.Q(), n9);
        this.z0((Uri)object, bundle);
        return true;
    }

    public void z0(Uri uri, Bundle bundle) {
        if (this.f0() != null) {
            this.q = null;
            this.r = null;
            if (bundle.getBoolean("PLAY_PREPARE", false)) {
                this.f0().i().d(uri, bundle);
                return;
            }
            this.f0().i().c(uri, bundle);
            return;
        }
        this.q = uri;
        this.r = bundle;
        this.b0();
    }
}

