package com.voxdon.xplorer.musicplayer;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.DateUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.MySpinner;
import androidx.appcompat.widget.Toolbar;
import ax.P4.a;
import ax.X2.Q;
import ax.X2.v;
import ax.c3.C1832u;
import ax.c3.C1833v;
import ax.d3.C0;
import ax.d3.Z;
import ax.n.ActivityC2561c;
import ax.s3.C3045a;
import ax.s3.u;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.viewer.a;
import com.voxdon.xplorer.viewer.d;
import com.voxdon.xplorer.R;
import com.example.android.uamp.MusicService;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class FullScreenPlayerActivity extends ActivityC2561c implements Z {
    private static final String Z = ax.S4.b.f(FullScreenPlayerActivity.class);
    private TextView A;
    private View B;
    private View C;
    private String D;
    private MediaBrowserCompat F;
    private long G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean N;
    private ScheduledFuture<?> Q;
    private PlaybackStateCompat R;
    private C0 S;
    private File T;
    private String U;
    private boolean V;
    private Toolbar a;
    private View b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private SeekBar j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private ProgressBar o;
    private View p;
    private Drawable q;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private Drawable u;
    private ImageView v;
    private TextView w;
    private MySpinner x;
    private View y;
    private ImageView z;
    private final Handler E = new Handler();
    private float M = 1.0f;
    private final Runnable O = new k();
    private final ScheduledExecutorService P = Executors.newSingleThreadScheduledExecutor();
    private final MediaControllerCompat.a W = new l();
    private final MediaBrowserCompat.c X = new m();
    private final GestureDetector.SimpleOnGestureListener Y = new j();

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            FullScreenPlayerActivity.this.Y0(10000L);
        }
    }

    class b implements SeekBar.OnSeekBarChangeListener {
        boolean a = false;

        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            FullScreenPlayerActivity.this.h.setText(DateUtils.formatElapsedTime(i / 1000));
            if (!z || this.a) {
                return;
            }
            FullScreenPlayerActivity.this.X0(seekBar.getProgress(), false);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.a = true;
            FullScreenPlayerActivity.this.e1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.a = false;
            FullScreenPlayerActivity.this.X0(seekBar.getProgress(), false);
        }
    }

    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            FullScreenPlayerActivity.this.f1();
        }
    }

    class d implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.voxdon.xplorer.viewer.d a;

        d(com.voxdon.xplorer.viewer.d dVar) {
            this.a = dVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            d.a aVar = (d.a) this.a.getItem(i);
            if (aVar != null) {
                FullScreenPlayerActivity.this.c1(aVar.b, true);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullScreenPlayerActivity.this.E.post(FullScreenPlayerActivity.this.O);
        }
    }

    class f extends a.AbstractC0170a {
        f() {
        }

        @Override // ax.P4.a.AbstractC0170a
        public void b(String str, Exception exc) {
            super.b(str, exc);
            if (str.equals(FullScreenPlayerActivity.this.D)) {
                FullScreenPlayerActivity.this.v.setImageResource(R.drawable.ic_default_art_large);
            }
        }

        @Override // ax.P4.a.AbstractC0170a
        public void c(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            if (str.equals(FullScreenPlayerActivity.this.D)) {
                FullScreenPlayerActivity.this.v.setImageBitmap(bitmap);
            }
        }
    }

    class g implements a.b {
        g() {
        }

        @Override // com.voxdon.xplorer.viewer.a.b
        public void a(MotionEvent motionEvent) {
            FullScreenPlayerActivity.this.T0();
        }
    }

    class h implements View.OnTouchListener {
        final /* synthetic */ com.voxdon.xplorer.viewer.a a;
        final /* synthetic */ GestureDetector b;

        h(com.voxdon.xplorer.viewer.a aVar, GestureDetector gestureDetector) {
            this.a = aVar;
            this.b = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.a.g(motionEvent);
            boolean onTouchEvent = this.b.onTouchEvent(motionEvent);
            if (FullScreenPlayerActivity.this.M0()) {
                if (motionEvent.getAction() == 1) {
                    FullScreenPlayerActivity.this.F0();
                }
                return true;
            }
            if (!FullScreenPlayerActivity.this.O0()) {
                return onTouchEvent;
            }
            if (motionEvent.getAction() == 1) {
                FullScreenPlayerActivity.this.Q0();
            }
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullScreenPlayerActivity.this.w.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    class j extends GestureDetector.SimpleOnGestureListener {
        private float a;
        private long b;

        j() {
        }

        private void a(long j, boolean z, boolean z2) {
            if (z2) {
                FullScreenPlayerActivity.this.w.setText(C3180B.n(j));
            }
            FullScreenPlayerActivity.this.I = j;
        }

        private void b() {
            if (FullScreenPlayerActivity.this.I0() == null) {
                return;
            }
            FullScreenPlayerActivity.this.J = true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            int width = FullScreenPlayerActivity.this.b.getWidth();
            if (width > 0) {
                int i = width / 3;
                int i2 = (width * 2) / 3;
                if (motionEvent.getX() < i) {
                    FullScreenPlayerActivity.this.E0(false);
                    return true;
                }
                if (motionEvent.getX() > i2) {
                    FullScreenPlayerActivity.this.E0(true);
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return FullScreenPlayerActivity.this.I0() != null && Math.abs(f) >= Math.abs(f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (FullScreenPlayerActivity.this.I0() == null) {
                return;
            }
            FullScreenPlayerActivity.this.S0();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (FullScreenPlayerActivity.this.I0() == null || motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (!FullScreenPlayerActivity.this.M0()) {
                if (Math.abs(f) < Math.abs(f2) || Math.abs(motionEvent.getX() - motionEvent2.getX()) < FullScreenPlayerActivity.this.K || !FullScreenPlayerActivity.this.y0()) {
                    return false;
                }
                this.a = motionEvent.getX();
                this.b = FullScreenPlayerActivity.this.H;
                b();
            }
            if (!FullScreenPlayerActivity.this.M0()) {
                C3184b.e("what case is this : " + this.a + "," + motionEvent.getX());
                return true;
            }
            long f3 = this.b + ((C3180B.f(FullScreenPlayerActivity.this, (int) (motionEvent2.getX() - this.a)) * 40000) / 360);
            long j = FullScreenPlayerActivity.this.G;
            if (j < 0) {
                j = 0;
            }
            if (f3 < 0) {
                f3 = 0;
            } else if (f3 > j) {
                f3 = j;
            }
            a(f3, f > 0.0f, true);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullScreenPlayerActivity.this.o1();
        }
    }

    class l extends MediaControllerCompat.a {
        l() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c(Bundle bundle) {
            if (bundle != null) {
                FullScreenPlayerActivity.this.p1(bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                FullScreenPlayerActivity.this.l1(mediaMetadataCompat);
                FullScreenPlayerActivity.this.h1(mediaMetadataCompat);
                FullScreenPlayerActivity.this.n1(mediaMetadataCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            ax.S4.b.a(FullScreenPlayerActivity.Z, "onPlaybackstate changed", playbackStateCompat);
            FullScreenPlayerActivity.this.m1(playbackStateCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void h(int i) {
            FullScreenPlayerActivity.this.q1(i);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void l(int i) {
            FullScreenPlayerActivity.this.r1(i);
        }
    }

    class m extends MediaBrowserCompat.c {
        m() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            ax.S4.b.a(FullScreenPlayerActivity.Z, "onConnected");
            try {
                FullScreenPlayerActivity fullScreenPlayerActivity = FullScreenPlayerActivity.this;
                fullScreenPlayerActivity.B0(fullScreenPlayerActivity.F.c());
            } catch (RemoteException e) {
                ax.S4.b.b(FullScreenPlayerActivity.Z, e, "could not connect media controller");
            }
        }
    }

    class n extends ax.g3.c {
        n() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            int h = FullScreenPlayerActivity.this.I0().h();
            MediaControllerCompat.e i = FullScreenPlayerActivity.this.I0().i();
            int i2 = h == 1 ? 0 : 1;
            i.h(i2);
            if (FullScreenPlayerActivity.this.c.isAccessibilityFocused()) {
                if (i2 == 1) {
                    FullScreenPlayerActivity.this.c.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.shuffle_on));
                } else if (i2 == 0) {
                    FullScreenPlayerActivity.this.c.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.shuffle_off));
                }
            }
            ax.Q2.a.i().m("menu_music_player", "shuffle").c("loc", "fullscreen_player").e();
        }
    }

    class o extends ax.g3.c {
        o() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            int f = FullScreenPlayerActivity.this.I0().f();
            MediaControllerCompat.e i = FullScreenPlayerActivity.this.I0().i();
            int i2 = f == 2 ? 3 : f == 3 ? 1 : f == 1 ? 0 : 2;
            i.g(i2);
            if (FullScreenPlayerActivity.this.d.isAccessibilityFocused()) {
                if (i2 == 2) {
                    FullScreenPlayerActivity.this.d.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.repeat_all));
                } else if (i2 == 0) {
                    FullScreenPlayerActivity.this.d.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.repeat_none));
                } else if (i2 == 1) {
                    FullScreenPlayerActivity.this.d.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.repeat_single));
                } else if (i2 == 3) {
                    FullScreenPlayerActivity.this.d.announceForAccessibility(FullScreenPlayerActivity.this.getString(R.string.repeat_none_single));
                }
            }
            ax.Q2.a.i().m("menu_music_player", "repeat").c("loc", "fullscreen_player").e();
        }
    }

    class p extends ax.g3.c {
        p() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            FullScreenPlayerActivity.this.I0().i().i();
            ax.Q2.a.i().m("menu_music_player", "next").c("loc", "fullscreen_player").e();
        }
    }

    class q extends ax.g3.c {
        q() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            FullScreenPlayerActivity.this.I0().i().j();
            ax.Q2.a.i().m("menu_music_player", "prev").c("loc", "fullscreen_player").e();
        }
    }

    class r extends ax.g3.c {
        r() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (FullScreenPlayerActivity.this.I0() == null) {
                return;
            }
            FullScreenPlayerActivity fullScreenPlayerActivity = FullScreenPlayerActivity.this;
            fullScreenPlayerActivity.C0(fullScreenPlayerActivity.I0(), false, false);
        }
    }

    class s extends ax.g3.c {
        s() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            FullScreenPlayerActivity.this.Y0(-10000L);
        }
    }

    private boolean A0() {
        return this.e.isEnabled() && this.e.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(MediaSessionCompat.Token token) throws RemoteException {
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this, token);
        if (mediaControllerCompat.d() == null && this.T == null) {
            finish();
            return;
        }
        b1(mediaControllerCompat);
        if (this.T != null) {
            mediaControllerCompat.i().c(Uri.fromFile(this.T), null);
        }
        mediaControllerCompat.j(this.W);
        PlaybackStateCompat e2 = mediaControllerCompat.e();
        m1(e2);
        this.M = e2.f();
        s1();
        MediaMetadataCompat d2 = mediaControllerCompat.d();
        if (d2 != null) {
            l1(d2);
            h1(d2);
            n1(d2);
        }
        Bundle b2 = mediaControllerCompat.b();
        if (b2 != null) {
            p1(b2);
        }
        q1(mediaControllerCompat.f());
        r1(mediaControllerCompat.h());
        o1();
        if (e2.j() == 3 || e2.j() == 6) {
            W0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(MediaControllerCompat mediaControllerCompat, boolean z, boolean z2) {
        PlaybackStateCompat e2 = mediaControllerCompat.e();
        if (e2 != null) {
            MediaControllerCompat.e i2 = mediaControllerCompat.i();
            int j2 = e2.j();
            if (j2 != 0 && j2 != 1 && j2 != 2) {
                if (j2 == 3 || j2 == 6) {
                    if (z2) {
                        return;
                    }
                    i2.a();
                    e1();
                    ax.Q2.a.i().m("menu_music_player", "pause").c("loc", "fullscreen_player").e();
                    return;
                }
                if (j2 != 7) {
                    ax.S4.b.a(Z, "onClick with state ", Integer.valueOf(e2.j()));
                    return;
                }
            }
            if (z) {
                return;
            }
            i2.b();
            W0();
            ax.Q2.a.i().m("menu_music_player", "play").c("loc", "fullscreen_player").e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(boolean z) {
        if (z ? Y0(10000L) : Y0(-10000L)) {
            if (z) {
                this.w.setText("+" + C3180B.n(10000L));
            } else {
                this.w.setText("-" + C3180B.n(10000L));
            }
            this.w.postDelayed(new i(), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        this.J = false;
        this.w.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        if (I0() != null) {
            X0(this.I, true);
        }
        this.I = 0L;
    }

    private void G0(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat.d() == null) {
            this.D = null;
            this.v.setImageResource(R.drawable.ic_default_art_large);
            return;
        }
        String uri = mediaDescriptionCompat.d().toString();
        this.D = uri;
        ax.P4.a i2 = ax.P4.a.i();
        Bitmap g2 = i2.g(uri);
        if (g2 != null) {
            this.v.setImageBitmap(g2);
        } else {
            this.v.setImageBitmap(null);
            i2.f(getApplicationContext(), uri, new f());
        }
    }

    private long H0() {
        long i2 = this.R.i();
        return (this.R.j() == 0 || this.R.j() == 2 || this.R.j() == 1) ? i2 : (long) (i2 + ((SystemClock.elapsedRealtime() - this.R.e()) * this.R.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaControllerCompat I0() {
        return MediaControllerCompat.c(this);
    }

    private void J0() {
        this.K = C3180B.e(this, 30);
        this.v.setOnTouchListener(new h(new com.voxdon.xplorer.viewer.a(this, 1.0f, new g()), new GestureDetector(this, this.Y)));
    }

    private void K0() {
        this.N = ax.t3.f.a(this);
        g1();
        this.c.setOnClickListener(new n());
        this.d.setOnClickListener(new o());
        this.f.setOnClickListener(new p());
        this.e.setOnClickListener(new q());
        this.g.setOnClickListener(new r());
        this.B.setOnClickListener(new s());
        this.C.setOnClickListener(new a());
        this.j.setOnSeekBarChangeListener(new b());
        this.z.setOnClickListener(new c());
        com.voxdon.xplorer.viewer.d dVar = new com.voxdon.xplorer.viewer.d(this);
        this.x.setAdapter((SpinnerAdapter) dVar);
        this.x.setOnItemSelectedListener(new d(dVar));
        if (this.M != 0.0f) {
            s1();
        }
    }

    private void L0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.a = toolbar;
        if (toolbar == null) {
            throw new IllegalStateException("Layout is required to include a Toolbar with id 'toolbar'");
        }
        setSupportActionBar(toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M0() {
        return this.J;
    }

    private static boolean N0(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O0() {
        return this.L;
    }

    private boolean P0() {
        return this.T != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        this.L = false;
        c1(this.M, false);
        this.A.setVisibility(8);
    }

    private void R0(float f2) {
        PlaybackStateCompat playbackStateCompat;
        if (I0() == null || (playbackStateCompat = this.R) == null || playbackStateCompat.j() != 3) {
            return;
        }
        this.L = true;
        if (f2 == 0.5f) {
            this.A.setText("0.5X▶▶");
        } else if (f2 == 2.0f) {
            this.A.setText("2X▶▶");
        } else {
            C3184b.f();
            this.A.setText(f2 + "X▶▶");
        }
        c1(f2, false);
        this.A.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        R0(2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        R0(0.5f);
    }

    private void U0() {
        this.E.post(this.O);
    }

    private void V0(File file) {
        MediaControllerCompat I0 = I0();
        if (I0 == null) {
            return;
        }
        I0.i().c(Uri.fromFile(file), null);
    }

    private void W0() {
        e1();
        if (this.P.isShutdown()) {
            return;
        }
        this.Q = this.P.scheduleAtFixedRate(new e(), 100L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(long j2, boolean z) {
        if (I0() == null) {
            return;
        }
        if (z) {
            this.j.setProgress((int) j2);
        }
        I0().i().e(j2);
        a1(j2);
        W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0(long j2) {
        if (I0() == null || !y0()) {
            return false;
        }
        long j3 = this.H;
        long x0 = x0(j2);
        if (j3 == x0) {
            return false;
        }
        X0(x0, true);
        return true;
    }

    private void Z0(boolean z) {
        this.N = z;
        ax.t3.f.b(this, z);
        g1();
        invalidateOptionsMenu();
    }

    private void a1(long j2) {
        this.H = j2;
    }

    private void b1(MediaControllerCompat mediaControllerCompat) {
        MediaControllerCompat.l(this, mediaControllerCompat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(float f2, boolean z) {
        MediaControllerCompat I0 = I0();
        if (I0 == null) {
            return;
        }
        I0.i().f(f2);
        if (z) {
            this.M = f2;
        }
    }

    private void d1() {
        MediaMetadataCompat d2;
        String i2;
        MediaControllerCompat I0 = I0();
        if (I0 == null || (d2 = I0.d()) == null || (i2 = d2.i("__SOURCE__")) == null) {
            return;
        }
        Uri parse = Uri.parse(i2);
        String h2 = C1833v.h(parse.getPath());
        if (h2 == null) {
            return;
        }
        C1832u.k0(this, h2, parse);
        ax.Q2.a.i().m("menu_music_player", "share").c("loc", "music_player").c("type", "file").e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        ScheduledFuture<?> scheduledFuture = this.Q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        Z0(!this.N);
    }

    private void g1() {
        if (this.N) {
            this.y.setVisibility(0);
            this.z.setImageResource(R.drawable.ic_collapse_all);
            this.z.setContentDescription(getString(R.string.menu_collapse));
        } else {
            this.y.setVisibility(8);
            this.z.setImageResource(R.drawable.ic_expand_all);
            this.z.setContentDescription(getString(R.string.menu_expand));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        ax.S4.b.a(Z, "updateDuration called ");
        this.G = mediaMetadataCompat.f("android.media.metadata.DURATION");
        a1(-1L);
        this.j.setMax((int) this.G);
        this.i.setText(DateUtils.formatElapsedTime(r5 / 1000));
    }

    private void i1(Intent intent) {
        MediaDescriptionCompat mediaDescriptionCompat;
        if (intent == null || (mediaDescriptionCompat = (MediaDescriptionCompat) intent.getParcelableExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION")) == null) {
            return;
        }
        k1(mediaDescriptionCompat);
    }

    private void j1(int i2) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        if (i2 < 400) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.addRule(2, R.id.controllers);
            this.n.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams2.addRule(2, R.id.buttons_line);
            this.n.setLayoutParams(layoutParams2);
        }
    }

    private void k1(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        ax.S4.b.a(Z, "updateMediaDescription called ");
        this.k.setText(mediaDescriptionCompat.b());
        this.l.setText(mediaDescriptionCompat.i());
        this.m.setText(mediaDescriptionCompat.g());
        G0(mediaDescriptionCompat);
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l1(MediaMetadataCompat mediaMetadataCompat) {
        k1(ax.P4.k.b(mediaMetadataCompat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return;
        }
        this.R = playbackStateCompat;
        int j2 = playbackStateCompat.j();
        if (j2 == 0 || j2 == 1) {
            this.p.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.r);
            this.g.setContentDescription(getString(R.string.playback_play_description));
            this.o.setVisibility(4);
            this.n.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            e1();
            U0();
        } else if (j2 == 2) {
            this.p.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.r);
            this.g.setContentDescription(getString(R.string.playback_play_description));
            this.o.setVisibility(4);
            this.n.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            e1();
        } else if (j2 == 3) {
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.q);
            this.g.setContentDescription(getString(R.string.playback_pause_description));
            this.p.setVisibility(0);
            this.o.setVisibility(4);
            this.n.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            W0();
        } else if (j2 == 6) {
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.q);
            this.g.setContentDescription(getString(R.string.playback_pause_description));
            this.o.setVisibility(0);
            this.n.setText(R.string.loading);
            e1();
        } else if (j2 != 7) {
            ax.S4.b.a(Z, "Unhandled state ", Integer.valueOf(playbackStateCompat.j()));
        } else {
            this.p.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.r);
            this.g.setContentDescription(getString(R.string.playback_play_description));
            this.o.setVisibility(4);
            if (ax.t3.j.o(this)) {
                this.n.setText(getString(R.string.error) + " : " + ((Object) playbackStateCompat.c()));
            } else {
                this.n.setText(R.string.error);
            }
            e1();
        }
        this.f.setVisibility((playbackStateCompat.b() & 32) == 0 ? 4 : 0);
        this.e.setVisibility((playbackStateCompat.b() & 16) == 0 ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1(MediaMetadataCompat mediaMetadataCompat) {
        if (((int) mediaMetadataCompat.f("__TRACK_COUNT__")) <= 1) {
            this.f.setEnabled(false);
            this.f.setAlpha(0.5f);
            this.e.setEnabled(false);
            this.e.setAlpha(0.5f);
            return;
        }
        this.f.setEnabled(true);
        this.f.setAlpha(1.0f);
        this.e.setEnabled(true);
        this.e.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        if (this.R == null) {
            return;
        }
        long H0 = H0();
        this.j.setProgress((int) H0);
        a1(H0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i2 = bundle.getInt("file.manager.music.player.QUEUE_POSITION", -1);
        int i3 = bundle.getInt("file.manager.music.player.QUEUE_SIZE", -1);
        if (i2 <= 0 || i3 <= 0 || getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().H(getResources().getString(R.string.photo_view_count, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1(int i2) {
        if (i2 == 1) {
            this.d.setImageDrawable(this.t);
            this.d.setAlpha(1.0f);
        } else if (i2 == 2) {
            this.d.setImageDrawable(this.s);
            this.d.setAlpha(1.0f);
        } else if (i2 == 3) {
            this.d.setImageDrawable(this.u);
            this.d.setAlpha(1.0f);
        } else {
            this.d.setImageDrawable(this.s);
            this.d.setAlpha(0.35f);
        }
        if (Q.a()) {
            if (i2 == 1) {
                this.d.setStateDescription(getString(R.string.repeat_single));
                return;
            }
            if (i2 == 2) {
                this.d.setStateDescription(getString(R.string.repeat_all));
            } else if (i2 == 3) {
                this.d.setStateDescription(getString(R.string.repeat_none_single));
            } else {
                this.d.setStateDescription(getString(R.string.repeat_none));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(int i2) {
        if (i2 == 1) {
            this.c.setAlpha(1.0f);
        } else {
            this.c.setAlpha(0.35f);
        }
        if (Q.a()) {
            if (i2 == 1) {
                this.c.setStateDescription(getString(R.string.shuffle_on));
            } else {
                this.c.setStateDescription(getString(R.string.shuffle_off));
            }
        }
    }

    private void s1() {
        this.x.setSelection(com.voxdon.xplorer.viewer.d.c(this.M));
    }

    private long x0(long j2) {
        long j3 = this.H + j2;
        long j4 = this.G;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3 > j4 ? j4 : j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y0() {
        PlaybackStateCompat playbackStateCompat = this.R;
        return (playbackStateCompat == null || playbackStateCompat.j() == 0 || this.G == 0 || this.H == -1) ? false : true;
    }

    private boolean z0() {
        return this.f.isEnabled() && this.f.getVisibility() == 0;
    }

    public boolean D0(int i2, KeyEvent keyEvent) {
        MediaControllerCompat I0;
        MediaControllerCompat.e i3;
        if (!N0(i2) || (I0 = I0()) == null || (i3 = I0.i()) == null) {
            return false;
        }
        if (i2 == 90) {
            E0(true);
        } else if (i2 == 89) {
            E0(false);
        } else if (keyEvent.getRepeatCount() == 0) {
            if (i2 == 79 || i2 == 85) {
                C0(I0, false, false);
            } else if (i2 != 87) {
                if (i2 != 88) {
                    if (i2 == 126) {
                        C0(I0, false, true);
                    } else if (i2 == 127) {
                        C0(I0, true, false);
                    }
                } else if (A0()) {
                    i3.j();
                }
            } else if (z0()) {
                i3.i();
            }
        }
        return true;
    }

    @Override // ax.n.ActivityC2561c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.S.v(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_full_player);
        L0();
        if (getSupportActionBar() != null) {
            getSupportActionBar().x(true);
            getSupportActionBar().H(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        this.b = findViewById(R.id.pageView);
        this.v = (ImageView) findViewById(R.id.background_image);
        this.w = (TextView) findViewById(R.id.drag_seek_text);
        this.q = C3045a.c(this, R.drawable.ic_pause);
        this.r = C3045a.c(this, R.drawable.ic_play_arrow);
        this.s = C3045a.c(this, R.drawable.ic_repeat);
        this.t = C3045a.c(this, R.drawable.ic_repeat_one);
        this.u = C3045a.c(this, R.drawable.ic_play_one);
        this.g = (ImageView) findViewById(R.id.play_pause);
        this.f = (ImageView) findViewById(R.id.next);
        this.e = (ImageView) findViewById(R.id.prev);
        this.c = (ImageView) findViewById(R.id.shuffle);
        this.d = (ImageView) findViewById(R.id.repeat);
        this.h = (TextView) findViewById(R.id.startText);
        this.i = (TextView) findViewById(R.id.endText);
        this.j = (SeekBar) findViewById(R.id.seekBar1);
        this.k = (TextView) findViewById(R.id.line0);
        this.l = (TextView) findViewById(R.id.line1);
        this.m = (TextView) findViewById(R.id.line2);
        this.n = (TextView) findViewById(R.id.line3);
        this.B = findViewById(R.id.rew10);
        this.C = findViewById(R.id.ffwd10);
        this.o = (ProgressBar) findViewById(R.id.progressBar1);
        this.p = findViewById(R.id.controllers);
        MySpinner mySpinner = (MySpinner) findViewById(R.id.custom_speed);
        this.x = mySpinner;
        mySpinner.setPromptId(R.string.playback_speed);
        this.y = findViewById(R.id.control_buttons_expanded_line);
        this.z = (ImageView) findViewById(R.id.custom_toggle_expand);
        this.A = (TextView) findViewById(R.id.change_speed_playing_indicator);
        if (!Q.R()) {
            this.x.setVisibility(4);
        }
        J0();
        K0();
        if (bundle == null) {
            i1(getIntent());
        }
        this.F = new MediaBrowserCompat(this, new ComponentName(this, (Class<?>) MusicService.class), this.X, null);
        C0 c0 = new C0(this);
        this.S = c0;
        c0.m(null);
        String stringExtra = getIntent().getStringExtra("extra_temp_file_path");
        this.U = getIntent().getStringExtra("extra_temp_file_type");
        if (stringExtra != null) {
            u.j(this);
            File file = new File(stringExtra);
            if (file.exists()) {
                this.T = file;
                V0(file);
            } else {
                Toast.makeText(this, R.string.error_file_load, 1).show();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.full_screen_player, menu);
        return true;
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e1();
        this.P.shutdown();
        if (this.T != null) {
            MediaControllerCompat I0 = I0();
            if (I0 != null) {
                I0.i().k();
            }
            if (this.V) {
                return;
            }
            this.T.delete();
        }
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return D0(i2, keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.menu_equalizer /* 2131362511 */:
                Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                if (ax.R4.e.J() != 0) {
                    intent.putExtra("android.media.extra.AUDIO_SESSION", ax.R4.e.J());
                }
                try {
                    C1832u.q0(this, intent, 1020);
                } catch (ActivityNotFoundException | SecurityException unused) {
                    Toast.makeText(this, R.string.error, 1).show();
                }
                return true;
            case R.id.menu_save /* 2131362536 */:
                File file = this.T;
                if (file != null) {
                    this.V = true;
                    C1832u.s0(this, Uri.fromFile(file), this.U);
                    finish();
                } else {
                    Toast.makeText(this, R.string.error, 1).show();
                }
                return true;
            case R.id.menu_share /* 2131362545 */:
                d1();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MediaMetadataCompat d2;
        MediaControllerCompat I0 = I0();
        String str = null;
        boolean z = I0 == null || (d2 = I0.d()) == null || (str = d2.i("__SOURCE__")) == null;
        MenuItem findItem = menu.findItem(R.id.menu_share);
        if (findItem != null) {
            if (z) {
                findItem.setVisible(false);
            } else if (P0()) {
                findItem.setVisible(false);
            } else if (ax.Q4.b.m(str)) {
                findItem.setVisible(true);
            } else {
                findItem.setVisible(false);
            }
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_equalizer);
        if (findItem2 != null) {
            Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
            if (z) {
                findItem2.setVisible(false);
            } else if (P0()) {
                findItem2.setVisible(false);
            } else if (intent.resolveActivity(getPackageManager()) != null) {
                findItem2.setVisible(true);
            } else {
                findItem2.setVisible(false);
            }
        }
        MenuItem findItem3 = menu.findItem(R.id.menu_save);
        if (findItem3 != null) {
            if (z) {
                findItem3.setVisible(false);
            } else if (P0()) {
                findItem3.setVisible(true);
            } else {
                findItem3.setVisible(false);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onStart() {
        super.onStart();
        MediaBrowserCompat mediaBrowserCompat = this.F;
        if (mediaBrowserCompat != null) {
            try {
                mediaBrowserCompat.a();
            } catch (IllegalStateException e2) {
                ax.Ha.c.h().f().b("MEDIA BROWSER CONNECT IN FULL PLAYER").l(e2).g("connected:" + this.F.d()).h();
            }
        }
        if (Q.N1()) {
            v.s(getWindow(), -16777216);
            v.r(getWindow(), -16777216);
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onStop() {
        super.onStop();
        MediaBrowserCompat mediaBrowserCompat = this.F;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.b();
        }
        if (I0() != null) {
            I0().m(this.W);
        }
    }

    @Override // ax.d3.Z
    public void t(int i2, int i3) {
        j1(i3);
    }
}
