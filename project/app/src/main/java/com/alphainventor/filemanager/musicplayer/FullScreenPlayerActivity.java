/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.musicplayer;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
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
import android.view.ViewGroup;
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
import ax.P4.k;
import ax.Q2.a;
import ax.Q4.b;
import ax.R4.e;
import ax.X2.Q;
import ax.c3.u;
import ax.c3.v;
import ax.d3.C0;
import ax.d3.Z;
import ax.g3.c;
import ax.t3.f;
import ax.t3.j;
import ax.u3.B;
import com.alphainventor.filemanager.viewer.a;
import com.alphainventor.filemanager.viewer.d;
import com.example.android.uamp.MusicService;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FullScreenPlayerActivity
extends ax.n.c
implements Z {
    private static final String Z = ax.S4.b.f(FullScreenPlayerActivity.class);
    private TextView A;
    private View B;
    private View C;
    private String D;
    private final Handler E = new Handler();
    private MediaBrowserCompat F;
    private long G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private float M = 1.0f;
    private boolean N;
    private final Runnable O = new Runnable(this){
        final FullScreenPlayerActivity q;
        {
            this.q = fullScreenPlayerActivity;
        }

        @Override
        public void run() {
            this.q.o1();
        }
    };
    private final ScheduledExecutorService P = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> Q;
    private PlaybackStateCompat R;
    private C0 S;
    private File T;
    private String U;
    private boolean V;
    private final MediaControllerCompat.a W = new MediaControllerCompat.a(this){
        final FullScreenPlayerActivity d;
        {
            this.d = fullScreenPlayerActivity;
        }

        @Override
        public void c(Bundle bundle) {
            if (bundle != null) {
                this.d.p1(bundle);
            }
        }

        @Override
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                this.d.l1(mediaMetadataCompat);
                this.d.h1(mediaMetadataCompat);
                this.d.n1(mediaMetadataCompat);
            }
        }

        @Override
        public void e(PlaybackStateCompat playbackStateCompat) {
            ax.S4.b.a(Z, "onPlaybackstate changed", playbackStateCompat);
            this.d.m1(playbackStateCompat);
        }

        @Override
        public void h(int n8) {
            this.d.q1(n8);
        }

        @Override
        public void l(int n8) {
            this.d.r1(n8);
        }
    };
    private final MediaBrowserCompat.c X = new MediaBrowserCompat.c(this){
        final FullScreenPlayerActivity c;
        {
            this.c = fullScreenPlayerActivity;
        }

        @Override
        public void a() {
            ax.S4.b.a(Z, "onConnected");
            try {
                FullScreenPlayerActivity fullScreenPlayerActivity = this.c;
                fullScreenPlayerActivity.B0(fullScreenPlayerActivity.F.c());
                return;
            }
            catch (RemoteException remoteException) {
                ax.S4.b.b(Z, remoteException, "could not connect media controller");
                return;
            }
        }
    };
    private final GestureDetector.SimpleOnGestureListener Y = new GestureDetector.SimpleOnGestureListener(this){
        private float a;
        private long b;
        final FullScreenPlayerActivity c;
        {
            this.c = fullScreenPlayerActivity;
        }

        private void a(long l8, boolean bl, boolean bl2) {
            if (bl2) {
                this.c.w.setText((CharSequence)ax.u3.B.n(l8));
            }
            FullScreenPlayerActivity.p0(this.c, l8);
        }

        private void b() {
            if (this.c.I0() == null) {
                return;
            }
            FullScreenPlayerActivity.o0(this.c, true);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            int n8 = this.c.b.getWidth();
            if (n8 > 0) {
                int n9 = n8 / 3;
                n8 = n8 * 2 / 3;
                if (motionEvent.getX() < (float)n9) {
                    this.c.E0(false);
                    return true;
                }
                if (motionEvent.getX() > (float)n8) {
                    this.c.E0(true);
                }
            }
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            if (this.c.I0() == null) {
                return false;
            }
            return !(Math.abs(f8) < Math.abs(f9));
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.c.I0() == null) {
                return;
            }
            this.c.S0();
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent object, float f8, float f9) {
            MediaControllerCompat mediaControllerCompat = this.c.I0();
            boolean bl = false;
            if (mediaControllerCompat == null) {
                return false;
            }
            if (motionEvent != null && object != null) {
                long l8;
                if (!this.c.M0()) {
                    if (Math.abs(f8) < Math.abs(f9)) {
                        return false;
                    }
                    if (Math.abs(motionEvent.getX() - object.getX()) < (float)this.c.K) {
                        return false;
                    }
                    if (!this.c.y0()) {
                        return false;
                    }
                    this.a = motionEvent.getX();
                    this.b = this.c.H;
                    this.b();
                }
                if (!this.c.M0()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("what case is this : ");
                    ((StringBuilder)object).append(this.a);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(motionEvent.getX());
                    ax.u3.b.e(((StringBuilder)object).toString());
                    return true;
                }
                f9 = object.getX();
                float f10 = this.a;
                long l9 = (long)ax.u3.B.f((Context)this.c, (int)(f9 - f10)) * 40000L / 360L;
                long l10 = this.b + l9;
                l9 = l8 = this.c.G;
                if (l8 < 0L) {
                    l9 = 0L;
                }
                if (l10 < 0L) {
                    l8 = 0L;
                } else {
                    l8 = l10;
                    if (l10 > l9) {
                        l8 = l9;
                    }
                }
                if (f8 > 0.0f) {
                    bl = true;
                }
                this.a(l8, bl, true);
                return true;
            }
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    };
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

    private boolean A0() {
        return this.e.isEnabled() && this.e.getVisibility() == 0;
    }

    private void B0(MediaSessionCompat.Token object) throws RemoteException {
        if (((MediaControllerCompat)(object = new MediaControllerCompat((Context)this, (MediaSessionCompat.Token)object))).d() == null && this.T == null) {
            this.finish();
            return;
        }
        this.b1((MediaControllerCompat)object);
        if (this.T != null) {
            ((MediaControllerCompat)object).i().c(Uri.fromFile((File)this.T), null);
        }
        ((MediaControllerCompat)object).j(this.W);
        PlaybackStateCompat playbackStateCompat = ((MediaControllerCompat)object).e();
        this.m1(playbackStateCompat);
        this.M = playbackStateCompat.f();
        this.s1();
        MediaMetadataCompat mediaMetadataCompat = ((MediaControllerCompat)object).d();
        if (mediaMetadataCompat != null) {
            this.l1(mediaMetadataCompat);
            this.h1(mediaMetadataCompat);
            this.n1(mediaMetadataCompat);
        }
        if ((mediaMetadataCompat = ((MediaControllerCompat)object).b()) != null) {
            this.p1((Bundle)mediaMetadataCompat);
        }
        this.q1(((MediaControllerCompat)object).f());
        this.r1(((MediaControllerCompat)object).h());
        this.o1();
        if (playbackStateCompat.j() != 3 && playbackStateCompat.j() != 6) {
            return;
        }
        this.W0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void C0(MediaControllerCompat object, boolean bl, boolean bl2) {
        PlaybackStateCompat playbackStateCompat = ((MediaControllerCompat)object).e();
        if (playbackStateCompat == null) return;
        object = ((MediaControllerCompat)object).i();
        int n8 = playbackStateCompat.j();
        if (n8 != 0 && n8 != 1 && n8 != 2) {
            if (n8 != 3 && n8 != 6) {
                if (n8 != 7) {
                    ax.S4.b.a(Z, "onClick with state ", playbackStateCompat.j());
                    return;
                }
            } else {
                if (bl2) return;
                ((MediaControllerCompat.e)object).a();
                this.e1();
                ax.Q2.a.i().m("menu_music_player", "pause").c("loc", "fullscreen_player").e();
                return;
            }
        }
        if (bl) return;
        ((MediaControllerCompat.e)object).b();
        this.W0();
        ax.Q2.a.i().m("menu_music_player", "play").c("loc", "fullscreen_player").e();
    }

    private void E0(boolean bl) {
        boolean bl2 = bl ? this.Y0(10000L) : this.Y0(-10000L);
        if (!bl2) {
            return;
        }
        if (bl) {
            TextView textView = this.w;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+");
            stringBuilder.append(ax.u3.B.n(10000L));
            textView.setText((CharSequence)stringBuilder.toString());
        } else {
            TextView textView = this.w;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("-");
            stringBuilder.append(ax.u3.B.n(10000L));
            textView.setText((CharSequence)stringBuilder.toString());
        }
        this.w.postDelayed(new Runnable(this){
            final FullScreenPlayerActivity q;
            {
                this.q = fullScreenPlayerActivity;
            }

            @Override
            public void run() {
                this.q.w.setText((CharSequence)"");
            }
        }, 1000L);
    }

    private void F0() {
        this.J = false;
        this.w.setText((CharSequence)"");
        if (this.I0() != null) {
            this.X0(this.I, true);
        }
        this.I = 0L;
    }

    private void G0(MediaDescriptionCompat object) {
        String string;
        if (((MediaDescriptionCompat)object).d() == null) {
            this.D = null;
            this.v.setImageResource(2131231123);
            return;
        }
        this.D = string = ((MediaDescriptionCompat)object).d().toString();
        object = ax.P4.a.i();
        Bitmap bitmap = ((ax.P4.a)object).g(string);
        if (bitmap != null) {
            this.v.setImageBitmap(bitmap);
            return;
        }
        this.v.setImageBitmap(null);
        ((ax.P4.a)object).f(this.getApplicationContext(), string, new a.a(this){
            final FullScreenPlayerActivity a;
            {
                this.a = fullScreenPlayerActivity;
            }

            @Override
            public void b(String string, Exception exception) {
                super.b(string, exception);
                if (string.equals(this.a.D)) {
                    this.a.v.setImageResource(2131231123);
                }
            }

            @Override
            public void c(String string, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
                if (string.equals(this.a.D)) {
                    this.a.v.setImageBitmap(bitmap);
                }
            }
        });
    }

    private long H0() {
        long l8;
        long l9 = l8 = this.R.i();
        if (this.R.j() != 0) {
            l9 = l8;
            if (this.R.j() != 2) {
                l9 = l8;
                if (this.R.j() != 1) {
                    long l10 = SystemClock.elapsedRealtime();
                    l9 = this.R.e();
                    l9 = (long)((float)l8 + (float)(l10 - l9) * this.R.f());
                }
            }
        }
        return l9;
    }

    private MediaControllerCompat I0() {
        return MediaControllerCompat.c(this);
    }

    private void J0() {
        this.K = ax.u3.B.e((Context)this, 30);
        com.alphainventor.filemanager.viewer.a a8 = new com.alphainventor.filemanager.viewer.a((Context)this, 1.0f, new a.b(this){
            final FullScreenPlayerActivity a;
            {
                this.a = fullScreenPlayerActivity;
            }

            @Override
            public void a(MotionEvent motionEvent) {
                this.a.T0();
            }
        });
        GestureDetector gestureDetector = new GestureDetector((Context)this, (GestureDetector.OnGestureListener)this.Y);
        this.v.setOnTouchListener(new View.OnTouchListener(){
            final com.alphainventor.filemanager.viewer.a a;
            final GestureDetector b;
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
                this.a = a8;
                this.b = gestureDetector;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                this.a.g(motionEvent);
                boolean bl = this.b.onTouchEvent(motionEvent);
                if (this.c.M0()) {
                    if (motionEvent.getAction() == 1) {
                        this.c.F0();
                    }
                    return true;
                }
                if (this.c.O0()) {
                    if (motionEvent.getAction() == 1) {
                        this.c.Q0();
                    }
                    return true;
                }
                return bl;
            }
        });
    }

    private void K0() {
        this.N = ax.t3.f.a((Context)this);
        this.g1();
        this.c.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View object) {
                int n8 = this.c.I0().h();
                object = this.c.I0().i();
                n8 = n8 == 1 ? 0 : 1;
                ((MediaControllerCompat.e)object).h(n8);
                if (this.c.c.isAccessibilityFocused()) {
                    if (n8 == 1) {
                        this.c.c.announceForAccessibility((CharSequence)this.c.getString(2131952604));
                    } else if (n8 == 0) {
                        this.c.c.announceForAccessibility((CharSequence)this.c.getString(2131952603));
                    }
                }
                ax.Q2.a.i().m("menu_music_player", "shuffle").c("loc", "fullscreen_player").e();
            }
        });
        this.d.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View object) {
                int n8 = this.c.I0().f();
                object = this.c.I0().i();
                n8 = n8 == 2 ? 3 : (n8 == 3 ? 1 : (n8 == 1 ? 0 : 2));
                ((MediaControllerCompat.e)object).g(n8);
                if (this.c.d.isAccessibilityFocused()) {
                    if (n8 == 2) {
                        this.c.d.announceForAccessibility((CharSequence)this.c.getString(2131952536));
                    } else if (n8 == 0) {
                        this.c.d.announceForAccessibility((CharSequence)this.c.getString(2131952537));
                    } else if (n8 == 1) {
                        this.c.d.announceForAccessibility((CharSequence)this.c.getString(2131952540));
                    } else if (n8 == 3) {
                        this.c.d.announceForAccessibility((CharSequence)this.c.getString(2131952538));
                    }
                }
                ax.Q2.a.i().m("menu_music_player", "repeat").c("loc", "fullscreen_player").e();
            }
        });
        this.f.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.I0().i().i();
                ax.Q2.a.i().m("menu_music_player", "next").c("loc", "fullscreen_player").e();
            }
        });
        this.e.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.I0().i().j();
                ax.Q2.a.i().m("menu_music_player", "prev").c("loc", "fullscreen_player").e();
            }
        });
        this.g.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View object) {
                if (this.c.I0() == null) {
                    return;
                }
                object = this.c;
                ((FullScreenPlayerActivity)object).C0(((FullScreenPlayerActivity)object).I0(), false, false);
            }
        });
        this.B.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.Y0(-10000L);
            }
        });
        this.C.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.Y0(10000L);
            }
        });
        this.j.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(this){
            boolean a;
            final FullScreenPlayerActivity b;
            {
                this.b = fullScreenPlayerActivity;
                this.a = false;
            }

            public void onProgressChanged(SeekBar seekBar, int n8, boolean bl) {
                this.b.h.setText((CharSequence)DateUtils.formatElapsedTime((long)(n8 / 1000)));
                if (bl && !this.a) {
                    this.b.X0(seekBar.getProgress(), false);
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                this.a = true;
                this.b.e1();
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                this.a = false;
                this.b.X0(seekBar.getProgress(), false);
            }
        });
        this.z.setOnClickListener((View.OnClickListener)new c(this){
            final FullScreenPlayerActivity c;
            {
                this.c = fullScreenPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.f1();
            }
        });
        d d8 = new d((Context)this);
        this.x.setAdapter((SpinnerAdapter)d8);
        this.x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            final d a;
            final FullScreenPlayerActivity b;
            {
                this.b = fullScreenPlayerActivity;
                this.a = d8;
            }

            public void onItemSelected(AdapterView<?> object, View view, int n8, long l8) {
                object = (d.a)this.a.getItem(n8);
                if (object != null) {
                    this.b.c1(object.b, true);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        if (this.M != 0.0f) {
            this.s1();
        }
    }

    private void L0() {
        Toolbar toolbar;
        this.a = toolbar = (Toolbar)this.findViewById(2131362981);
        if (toolbar != null) {
            this.setSupportActionBar(toolbar);
            return;
        }
        throw new IllegalStateException("Layout is required to include a Toolbar with id 'toolbar'");
    }

    private boolean M0() {
        return this.J;
    }

    private static boolean N0(int n8) {
        return n8 == 90 || n8 == 89 || n8 == 85 || n8 == 79 || n8 == 126 || n8 == 127 || n8 == 87 || n8 == 88;
        {
        }
    }

    private boolean O0() {
        return this.L;
    }

    private boolean P0() {
        return this.T != null;
    }

    private void Q0() {
        this.L = false;
        this.c1(this.M, false);
        this.A.setVisibility(8);
    }

    private void R0(float f8) {
        Object object;
        if (this.I0() != null && (object = this.R) != null && ((PlaybackStateCompat)object).j() == 3) {
            this.L = true;
            if (f8 == 0.5f) {
                this.A.setText((CharSequence)"0.5X\u25b6\u25b6");
            } else if (f8 == 2.0f) {
                this.A.setText((CharSequence)"2X\u25b6\u25b6");
            } else {
                ax.u3.b.f();
                TextView textView = this.A;
                object = new StringBuilder();
                ((StringBuilder)object).append(f8);
                ((StringBuilder)object).append("X\u25b6\u25b6");
                textView.setText((CharSequence)((StringBuilder)object).toString());
            }
            this.c1(f8, false);
            this.A.setVisibility(0);
        }
    }

    private void S0() {
        this.R0(2.0f);
    }

    private void T0() {
        this.R0(0.5f);
    }

    private void U0() {
        this.E.post(this.O);
    }

    private void V0(File file) {
        MediaControllerCompat mediaControllerCompat = this.I0();
        if (mediaControllerCompat == null) {
            return;
        }
        mediaControllerCompat.i().c(Uri.fromFile((File)file), null);
    }

    private void W0() {
        this.e1();
        if (!this.P.isShutdown()) {
            this.Q = this.P.scheduleAtFixedRate(new Runnable(this){
                final FullScreenPlayerActivity q;
                {
                    this.q = fullScreenPlayerActivity;
                }

                @Override
                public void run() {
                    this.q.E.post(this.q.O);
                }
            }, 100L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void X0(long l8, boolean bl) {
        if (this.I0() == null) {
            return;
        }
        if (bl) {
            this.j.setProgress((int)l8);
        }
        this.I0().i().e(l8);
        this.a1(l8);
        this.W0();
    }

    private boolean Y0(long l8) {
        if (this.I0() == null) {
            return false;
        }
        if (!this.y0()) {
            return false;
        }
        long l9 = this.H;
        if (l9 == (l8 = this.x0(l8))) {
            return false;
        }
        this.X0(l8, true);
        return true;
    }

    private void Z0(boolean bl) {
        this.N = bl;
        ax.t3.f.b((Context)this, bl);
        this.g1();
        this.invalidateOptionsMenu();
    }

    private void a1(long l8) {
        this.H = l8;
    }

    private void b1(MediaControllerCompat mediaControllerCompat) {
        MediaControllerCompat.l(this, mediaControllerCompat);
    }

    private void c1(float f8, boolean bl) {
        MediaControllerCompat mediaControllerCompat = this.I0();
        if (mediaControllerCompat != null) {
            mediaControllerCompat.i().f(f8);
            if (bl) {
                this.M = f8;
            }
        }
    }

    private void d1() {
        String string;
        Object object = this.I0();
        if (object == null || (object = ((MediaControllerCompat)object).d()) == null || (object = ((MediaMetadataCompat)object).i("__SOURCE__")) == null || (string = ax.c3.v.h((object = Uri.parse((String)object)).getPath())) == null) {
            return;
        }
        ax.c3.u.k0((Context)this, string, (Uri)object);
        ax.Q2.a.i().m("menu_music_player", "share").c("loc", "music_player").c("type", "file").e();
    }

    private void e1() {
        ScheduledFuture<?> scheduledFuture = this.Q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void f1() {
        this.Z0(this.N ^ true);
    }

    private void g1() {
        if (this.N) {
            this.y.setVisibility(0);
            this.z.setImageResource(2131231112);
            this.z.setContentDescription((CharSequence)this.getString(2131952249));
            return;
        }
        this.y.setVisibility(8);
        this.z.setImageResource(2131231135);
        this.z.setContentDescription((CharSequence)this.getString(2131952263));
    }

    private void h1(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        ax.S4.b.a(Z, "updateDuration called ");
        this.G = mediaMetadataCompat.f("android.media.metadata.DURATION");
        this.a1(-1L);
        int n8 = (int)this.G;
        this.j.setMax(n8);
        this.i.setText((CharSequence)DateUtils.formatElapsedTime((long)(n8 / 1000)));
    }

    private void i1(Intent object) {
        if (object != null && (object = (MediaDescriptionCompat)object.getParcelableExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION")) != null) {
            this.k1((MediaDescriptionCompat)object);
        }
    }

    private void j1(int n8) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        if (n8 < 400) {
            textView = (RelativeLayout.LayoutParams)textView.getLayoutParams();
            textView.addRule(2, 2131362069);
            this.n.setLayoutParams((ViewGroup.LayoutParams)textView);
            return;
        }
        textView = (RelativeLayout.LayoutParams)textView.getLayoutParams();
        textView.addRule(2, 2131361990);
        this.n.setLayoutParams((ViewGroup.LayoutParams)textView);
    }

    private void k1(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        ax.S4.b.a(Z, "updateMediaDescription called ");
        this.k.setText(mediaDescriptionCompat.b());
        this.l.setText(mediaDescriptionCompat.i());
        this.m.setText(mediaDescriptionCompat.g());
        this.G0(mediaDescriptionCompat);
        this.invalidateOptionsMenu();
    }

    private void l1(MediaMetadataCompat mediaMetadataCompat) {
        this.k1(ax.P4.k.b(mediaMetadataCompat));
    }

    private void m1(PlaybackStateCompat playbackStateCompat) {
        Object object;
        int n8 = 0;
        if (playbackStateCompat == null) {
            return;
        }
        this.R = playbackStateCompat;
        int n9 = playbackStateCompat.j();
        if (n9 != 0 && n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 != 6) {
                        if (n9 != 7) {
                            ax.S4.b.a(Z, "Unhandled state ", playbackStateCompat.j());
                        } else {
                            this.p.setVisibility(0);
                            this.g.setVisibility(0);
                            this.g.setImageDrawable(this.r);
                            this.g.setContentDescription((CharSequence)this.getString(2131952501));
                            this.o.setVisibility(4);
                            if (ax.t3.j.o((Context)this)) {
                                TextView textView = this.n;
                                object = new StringBuilder();
                                ((StringBuilder)object).append(this.getString(2131951927));
                                ((StringBuilder)object).append(" : ");
                                ((StringBuilder)object).append((Object)playbackStateCompat.c());
                                textView.setText((CharSequence)((StringBuilder)object).toString());
                            } else {
                                this.n.setText(2131951927);
                            }
                            this.e1();
                        }
                    } else {
                        this.g.setVisibility(0);
                        this.g.setImageDrawable(this.q);
                        this.g.setContentDescription((CharSequence)this.getString(2131952500));
                        this.o.setVisibility(0);
                        this.n.setText(2131952143);
                        this.e1();
                    }
                } else {
                    this.g.setVisibility(0);
                    this.g.setImageDrawable(this.q);
                    this.g.setContentDescription((CharSequence)this.getString(2131952500));
                    this.p.setVisibility(0);
                    this.o.setVisibility(4);
                    this.n.setText((CharSequence)"");
                    this.W0();
                }
            } else {
                this.p.setVisibility(0);
                this.g.setVisibility(0);
                this.g.setImageDrawable(this.r);
                this.g.setContentDescription((CharSequence)this.getString(2131952501));
                this.o.setVisibility(4);
                this.n.setText((CharSequence)"");
                this.e1();
            }
        } else {
            this.p.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setImageDrawable(this.r);
            this.g.setContentDescription((CharSequence)this.getString(2131952501));
            this.o.setVisibility(4);
            this.n.setText((CharSequence)"");
            this.e1();
            this.U0();
        }
        object = this.f;
        n9 = (playbackStateCompat.b() & 0x20L) == 0L ? 4 : 0;
        object.setVisibility(n9);
        object = this.e;
        n9 = n8;
        if ((playbackStateCompat.b() & 0x10L) == 0L) {
            n9 = 4;
        }
        object.setVisibility(n9);
    }

    private void n1(MediaMetadataCompat mediaMetadataCompat) {
        if ((int)mediaMetadataCompat.f("__TRACK_COUNT__") <= 1) {
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

    static /* synthetic */ boolean o0(FullScreenPlayerActivity fullScreenPlayerActivity, boolean bl) {
        fullScreenPlayerActivity.J = bl;
        return bl;
    }

    private void o1() {
        if (this.R == null) {
            return;
        }
        long l8 = this.H0();
        this.j.setProgress((int)l8);
        this.a1(l8);
    }

    static /* synthetic */ long p0(FullScreenPlayerActivity fullScreenPlayerActivity, long l8) {
        fullScreenPlayerActivity.I = l8;
        return l8;
    }

    private void p1(Bundle object) {
        if (object != null) {
            int n8 = object.getInt("file.manager.music.player.QUEUE_POSITION", -1);
            int n9 = object.getInt("file.manager.music.player.QUEUE_SIZE", -1);
            if (n8 > 0 && n9 > 0 && this.getSupportActionBar() != null) {
                object = this.getResources().getString(2131952497, new Object[]{n8, n9});
                this.getSupportActionBar().H((CharSequence)object);
            }
        }
    }

    private void q1(int n8) {
        if (n8 == 1) {
            this.d.setImageDrawable(this.t);
            this.d.setAlpha(1.0f);
        } else if (n8 == 2) {
            this.d.setImageDrawable(this.s);
            this.d.setAlpha(1.0f);
        } else if (n8 == 3) {
            this.d.setImageDrawable(this.u);
            this.d.setAlpha(1.0f);
        } else {
            this.d.setImageDrawable(this.s);
            this.d.setAlpha(0.35f);
        }
        if (ax.X2.Q.a()) {
            if (n8 == 1) {
                ax.h3.a.a(this.d, this.getString(2131952540));
                return;
            }
            if (n8 == 2) {
                ax.h3.a.a(this.d, this.getString(2131952536));
                return;
            }
            if (n8 == 3) {
                ax.h3.a.a(this.d, this.getString(2131952538));
                return;
            }
            ax.h3.a.a(this.d, this.getString(2131952537));
        }
    }

    private void r1(int n8) {
        if (n8 == 1) {
            this.c.setAlpha(1.0f);
        } else {
            this.c.setAlpha(0.35f);
        }
        if (ax.X2.Q.a()) {
            if (n8 == 1) {
                ax.h3.a.a(this.c, this.getString(2131952604));
                return;
            }
            ax.h3.a.a(this.c, this.getString(2131952603));
        }
    }

    private void s1() {
        this.x.setSelection(com.alphainventor.filemanager.viewer.d.c(this.M));
    }

    private long x0(long l8) {
        long l9;
        long l10 = this.H + l8;
        l8 = l9 = this.G;
        if (l9 < 0L) {
            l8 = 0L;
        }
        if (l10 < 0L) {
            return 0L;
        }
        if (l10 > l8) {
            return l8;
        }
        return l10;
    }

    private boolean y0() {
        PlaybackStateCompat playbackStateCompat = this.R;
        return playbackStateCompat != null && playbackStateCompat.j() != 0 && this.G != 0L && this.H != -1L;
    }

    private boolean z0() {
        return this.f.isEnabled() && this.f.getVisibility() == 0;
    }

    public boolean D0(int n8, KeyEvent keyEvent) {
        if (!FullScreenPlayerActivity.N0(n8)) {
            return false;
        }
        MediaControllerCompat mediaControllerCompat = this.I0();
        if (mediaControllerCompat == null) {
            return false;
        }
        MediaControllerCompat.e e8 = mediaControllerCompat.i();
        if (e8 == null) {
            return false;
        }
        if (n8 == 90) {
            this.E0(true);
        } else if (n8 == 89) {
            this.E0(false);
        } else if (keyEvent.getRepeatCount() == 0) {
            if (n8 != 79 && n8 != 85) {
                if (n8 != 87) {
                    if (n8 != 88) {
                        if (n8 != 126) {
                            if (n8 == 127) {
                                this.C0(mediaControllerCompat, true, false);
                            }
                        } else {
                            this.C0(mediaControllerCompat, false, true);
                        }
                    } else if (this.A0()) {
                        e8.j();
                    }
                } else if (this.z0()) {
                    e8.i();
                }
            } else {
                this.C0(mediaControllerCompat, false, false);
            }
        }
        return true;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.S.v(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override
    public void onCreate(Bundle object) {
        MySpinner mySpinner;
        super.onCreate((Bundle)object);
        this.setContentView(2131558431);
        this.L0();
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().x(true);
            this.getSupportActionBar().H("");
        }
        this.b = this.findViewById(2131362661);
        this.v = (ImageView)this.findViewById(2131361912);
        this.w = (TextView)this.findViewById(2131362158);
        this.q = ax.s3.a.c((Context)this, 2131231186);
        this.r = ax.s3.a.c((Context)this, 2131231194);
        this.s = ax.s3.a.c((Context)this, 2131231203);
        this.t = ax.s3.a.c((Context)this, 2131231204);
        this.u = ax.s3.a.c((Context)this, 2131231197);
        this.g = (ImageView)this.findViewById(2131362698);
        this.f = (ImageView)this.findViewById(2131362611);
        this.e = (ImageView)this.findViewById(2131362710);
        this.c = (ImageView)this.findViewById(2131362829);
        this.d = (ImageView)this.findViewById(2131362732);
        this.h = (TextView)this.findViewById(2131362877);
        this.i = (TextView)this.findViewById(2131362183);
        this.j = (SeekBar)this.findViewById(2131362774);
        this.k = (TextView)this.findViewById(2131362447);
        this.l = (TextView)this.findViewById(2131362448);
        this.m = (TextView)this.findViewById(2131362449);
        this.n = (TextView)this.findViewById(2131362450);
        this.B = this.findViewById(2131362739);
        this.C = this.findViewById(2131362265);
        this.o = (ProgressBar)this.findViewById(2131362713);
        this.p = this.findViewById(2131362069);
        this.x = mySpinner = (MySpinner)((Object)this.findViewById(2131362089));
        mySpinner.setPromptId(2131952502);
        this.y = this.findViewById(2131362063);
        this.z = (ImageView)this.findViewById(2131362091);
        this.A = (TextView)this.findViewById(2131362026);
        if (!ax.X2.Q.R()) {
            this.x.setVisibility(4);
        }
        this.J0();
        this.K0();
        if (object == null) {
            this.i1(this.getIntent());
        }
        this.F = new MediaBrowserCompat((Context)this, new ComponentName((Context)this, MusicService.class), this.X, null);
        object = new C0(this);
        this.S = object;
        ((C0)object).m(null);
        object = this.getIntent().getStringExtra("extra_temp_file_path");
        this.U = this.getIntent().getStringExtra("extra_temp_file_type");
        if (object != null) {
            ax.s3.u.j((Context)this);
            object = new File((String)object);
            if (((File)object).exists()) {
                this.T = object;
                this.V0((File)object);
                return;
            }
            Toast.makeText((Context)this, (int)2131951934, (int)1).show();
            this.finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.getMenuInflater().inflate(2131689491, menu);
        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.e1();
        this.P.shutdown();
        if (this.T != null) {
            MediaControllerCompat mediaControllerCompat = this.I0();
            if (mediaControllerCompat != null) {
                mediaControllerCompat.i().k();
            }
            if (!this.V) {
                this.T.delete();
            }
        }
    }

    @Override
    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        return this.D0(n8, keyEvent) || super.onKeyDown(n8, keyEvent);
        {
        }
    }

    public boolean onOptionsItemSelected(MenuItem object) {
        switch (object.getItemId()) {
            default: {
                return super.onOptionsItemSelected(object);
            }
            case 2131362545: {
                this.d1();
                return true;
            }
            case 2131362536: {
                object = this.T;
                if (object != null) {
                    this.V = true;
                    ax.c3.u.s0(this, Uri.fromFile((File)object), this.U);
                    this.finish();
                } else {
                    Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                }
                return true;
            }
            case 2131362511: {
                object = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                if (ax.R4.e.J() != 0) {
                    object.putExtra("android.media.extra.AUDIO_SESSION", ax.R4.e.J());
                }
                try {
                    ax.c3.u.q0(this, (Intent)object, 1020);
                }
                catch (ActivityNotFoundException | SecurityException throwable) {
                    Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                }
                return true;
            }
            case 16908332: 
        }
        this.finish();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onPrepareOptionsMenu(Menu menu) {
        Object object = this.I0();
        String string = null;
        boolean bl = object == null || (object = ((MediaControllerCompat)object).d()) == null || (string = ((MediaMetadataCompat)object).i("__SOURCE__")) == null;
        object = menu.findItem(2131362545);
        if (object != null) {
            if (bl) {
                object.setVisible(false);
            } else if (this.P0()) {
                object.setVisible(false);
            } else if (ax.Q4.b.m(string)) {
                object.setVisible(true);
            } else {
                object.setVisible(false);
            }
        }
        if ((object = menu.findItem(2131362511)) != null) {
            string = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
            if (bl) {
                object.setVisible(false);
            } else if (this.P0()) {
                object.setVisible(false);
            } else if (string.resolveActivity(this.getPackageManager()) != null) {
                object.setVisible(true);
            } else {
                object.setVisible(false);
            }
        }
        if ((string = menu.findItem(2131362536)) == null) return super.onPrepareOptionsMenu(menu);
        if (bl) {
            string.setVisible(false);
            return super.onPrepareOptionsMenu(menu);
        }
        if (this.P0()) {
            string.setVisible(true);
            return super.onPrepareOptionsMenu(menu);
        }
        string.setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onStart() {
        super.onStart();
        MediaBrowserCompat mediaBrowserCompat = this.F;
        if (mediaBrowserCompat != null) {
            try {
                mediaBrowserCompat.a();
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.b b8 = ax.Ha.c.h().f().b("MEDIA BROWSER CONNECT IN FULL PLAYER").l(illegalStateException);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("connected:");
                stringBuilder.append(this.F.d());
                b8.g(stringBuilder.toString()).h();
            }
        }
        if (ax.X2.Q.N1()) {
            ax.X2.v.s(this.getWindow(), -16777216);
            ax.X2.v.r(this.getWindow(), -16777216);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        MediaBrowserCompat mediaBrowserCompat = this.F;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.b();
        }
        if (this.I0() != null) {
            this.I0().m(this.W);
        }
    }

    @Override
    public void t(int n8, int n9) {
        this.j1(n9);
    }
}

