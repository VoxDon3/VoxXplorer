package com.voxdon.xplorer.musicplayer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.P4.a;
import ax.P4.k;
import ax.s3.C3045a;
import ax.u3.C3180B;
import ax.u3.C3189g;
import com.voxdon.xplorer.R;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class PlaybackControlsFragment extends Fragment {
    private static final String x0 = ax.S4.b.f(PlaybackControlsFragment.class);
    private View d0;
    private View e0;
    private ImageButton f0;
    private ImageButton g0;
    private TextView h0;
    private TextView i0;
    private TextView j0;
    private ImageView k0;
    private View l0;
    private String m0;
    private ProgressBar n0;
    private PlaybackStateCompat o0;
    private ScheduledFuture<?> r0;
    private boolean s0;
    private final Handler p0 = new Handler(Looper.getMainLooper());
    private final ScheduledExecutorService q0 = Executors.newSingleThreadScheduledExecutor();
    private final MediaControllerCompat.a t0 = new a();
    private final View.OnClickListener u0 = new d();
    private final View.OnClickListener v0 = new e();
    private final Runnable w0 = new f();

    class a extends MediaControllerCompat.a {
        a() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat == null) {
                return;
            }
            try {
                ax.S4.b.a(PlaybackControlsFragment.x0, "Received metadata state change to mediaId=", mediaMetadataCompat.e().f(), " song=", mediaMetadataCompat.e().i());
            } catch (RuntimeException e) {
                ax.Ha.c.h().f().d("METADATA COULD NOT READ BITMAP").l(e).h();
            }
            PlaybackControlsFragment.this.X2(mediaMetadataCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            ax.S4.b.a(PlaybackControlsFragment.x0, "Received playback state change to state ", Integer.valueOf(playbackStateCompat.j()));
            PlaybackControlsFragment.this.Y2(playbackStateCompat, false);
        }
    }

    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            PlaybackControlsFragment.this.d3();
        }
    }

    class c extends a.AbstractC0170a {
        c() {
        }

        @Override // ax.P4.a.AbstractC0170a
        public void b(String str, Exception exc) {
            super.b(str, exc);
            if (str.equals(PlaybackControlsFragment.this.m0)) {
                PlaybackControlsFragment.this.k0.setImageResource(R.drawable.ic_default_art);
            }
        }

        @Override // ax.P4.a.AbstractC0170a
        public void c(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            if (str.equals(PlaybackControlsFragment.this.m0) && bitmap3 != null) {
                PlaybackControlsFragment.this.k0.setImageBitmap(bitmap2);
            }
        }
    }

    class d extends ax.g3.c {
        d() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            com.voxdon.xplorer.activity.b bVar = (com.voxdon.xplorer.activity.b) PlaybackControlsFragment.this.f0();
            if (bVar == null || !PlaybackControlsFragment.this.X0()) {
                return;
            }
            bVar.K0();
        }
    }

    class e extends ax.g3.c {
        e() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (PlaybackControlsFragment.this.X0()) {
                MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) PlaybackControlsFragment.this.f0()).f0();
                if (f0 == null) {
                    com.voxdon.xplorer.activity.b bVar = (com.voxdon.xplorer.activity.b) PlaybackControlsFragment.this.f0();
                    ax.Ha.c.h().d("MediaController == null").g("Stopped:" + bVar.n0() + ":isConnecting:" + bVar.l0()).h();
                    return;
                }
                PlaybackStateCompat e = f0.e();
                int j = e == null ? 0 : e.j();
                ax.S4.b.a(PlaybackControlsFragment.x0, "Button pressed, in state " + j);
                if (view.getId() == R.id.play_pause) {
                    ax.S4.b.a(PlaybackControlsFragment.x0, "Play button pressed, in state " + j);
                    if (j == 2 || j == 1 || j == 0) {
                        PlaybackControlsFragment.this.b3();
                    } else if (j == 3 || j == 6 || j == 8) {
                        PlaybackControlsFragment.this.a3();
                    }
                }
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaybackControlsFragment.this.g3();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaybackControlsFragment.this.p0.post(PlaybackControlsFragment.this.w0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2(MediaMetadataCompat mediaMetadataCompat) {
        String str = x0;
        ax.S4.b.a(str, "onMetadataChanged ", mediaMetadataCompat);
        if (f0() == null) {
            ax.S4.b.j(str, "onMetadataChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring.");
            return;
        }
        if (mediaMetadataCompat == null) {
            return;
        }
        PlaybackStateCompat playbackStateCompat = this.o0;
        if (playbackStateCompat != null && playbackStateCompat.j() == 0) {
            h3();
        }
        MediaDescriptionCompat b2 = k.b(mediaMetadataCompat);
        this.h0.setText(b2.i());
        if (this.d0.isAccessibilityFocused()) {
            this.d0.announceForAccessibility(b2.i());
        }
        this.i0.setText(b2.g());
        f3(mediaMetadataCompat);
        g3();
        String uri = b2.d() != null ? b2.d().toString() : null;
        if (TextUtils.equals(uri, this.m0)) {
            return;
        }
        this.m0 = uri;
        Bitmap c2 = b2.c();
        ax.P4.a i = ax.P4.a.i();
        if (c2 == null) {
            c2 = i.j(this.m0);
        }
        if (c2 != null) {
            this.k0.setImageBitmap(c2);
            return;
        }
        this.k0.setImageBitmap(null);
        if (uri == null) {
            this.k0.setImageResource(R.drawable.ic_default_art);
        } else {
            i.f(b().getApplicationContext(), uri, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(PlaybackStateCompat playbackStateCompat, boolean z) {
        String string;
        String str = x0;
        ax.S4.b.a(str, "onPlaybackStateChanged ", playbackStateCompat);
        if (f0() == null) {
            ax.S4.b.j(str, "onPlaybackStateChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring.");
            return;
        }
        if (playbackStateCompat == null) {
            return;
        }
        this.o0 = playbackStateCompat;
        int j = playbackStateCompat.j();
        if (j == 0) {
            Z2();
            h3();
        } else {
            if (j != 1 && j != 2) {
                if (j == 3) {
                    this.l0.setVisibility(8);
                    c3();
                } else if (j == 6) {
                    e3();
                    this.l0.setVisibility(0);
                } else if (j != 7) {
                    e3();
                    this.l0.setVisibility(8);
                } else {
                    ax.S4.b.c(str, "error playbackstate: ", playbackStateCompat.c());
                    if (!z) {
                        Bundle d2 = playbackStateCompat.d();
                        if (d2 == null || d2.getInt("SUB_ERROR_CODE", 0) != 4005 || (string = d2.getString("SUB_ERROR_MSG")) == null || !ax.P2.a.q(string)) {
                            View findViewById = f0() != null ? f0().findViewById(android.R.id.content) : null;
                            if (findViewById != null) {
                                C3180B.T(findViewById, playbackStateCompat.c(), 0).a0();
                            } else {
                                Toast.makeText(f0(), playbackStateCompat.c(), 1).show();
                            }
                        } else {
                            Intent intent = new Intent("local.intent.action.SHOW_CODEC_DOWNLOAD");
                            intent.putExtra("mimetype", string);
                            C3189g.a().e(intent);
                        }
                    }
                    this.l0.setVisibility(8);
                    e3();
                }
                this.f0.setImageDrawable(C3045a.c(f0(), R.drawable.ic_pause));
                this.f0.setContentDescription(M0(R.string.playback_pause_description));
                return;
            }
            this.l0.setVisibility(8);
            Z2();
            e3();
        }
        this.f0.setImageDrawable(C3045a.c(f0(), R.drawable.ic_play_arrow));
        this.f0.setContentDescription(M0(R.string.playback_play_description));
    }

    private void Z2() {
        this.p0.post(this.w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3() {
        MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) f0()).f0();
        if (f0 != null) {
            f0.i().a();
            e3();
        }
        ax.Q2.a.i().m("menu_music_player", "pause").c("loc", "playback_control").e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) f0()).f0();
        if (f0 != null) {
            f0.i().b();
            c3();
        }
        ax.Q2.a.i().m("menu_music_player", "play").c("loc", "playback_control").e();
    }

    private void c3() {
        e3();
        if (this.q0.isShutdown()) {
            return;
        }
        this.r0 = this.q0.scheduleAtFixedRate(new g(), 100L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        com.voxdon.xplorer.activity.b bVar = (com.voxdon.xplorer.activity.b) f0();
        Intent intent = new Intent(f0(), (Class<?>) FullScreenPlayerActivity.class);
        intent.setFlags(536870912);
        MediaControllerCompat f0 = bVar.f0();
        if (f0 != null) {
            MediaMetadataCompat d2 = f0.d();
            if (d2 != null) {
                try {
                    intent.putExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION", d2.e());
                } catch (RuntimeException unused) {
                }
            }
            F2(intent);
            ax.Q2.a.i().m("menu_music_player", "fullscreen").e();
            return;
        }
        ax.Ha.c.h().d("MediaController NULL!!").g(bVar.n0() + ":" + bVar.l0()).h();
    }

    private void e3() {
        ScheduledFuture<?> scheduledFuture = this.r0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void f3(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        ax.S4.b.a(x0, "updateDuration called ");
        this.n0.setMax((int) mediaMetadataCompat.f("android.media.metadata.DURATION"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        PlaybackStateCompat playbackStateCompat = this.o0;
        if (playbackStateCompat == null) {
            return;
        }
        long i = playbackStateCompat.i();
        if (this.o0.j() != 0 && this.o0.j() != 2 && this.o0.j() != 1) {
            i = (long) (i + (((int) (SystemClock.elapsedRealtime() - this.o0.e())) * this.o0.f()));
        }
        this.n0.setProgress((int) i);
    }

    private void h3() {
        if (f0() == null) {
            return;
        }
        MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) f0()).f0();
        if (f0 != null && f0.d() != null) {
            MediaDescriptionCompat e2 = f0.d().e();
            if (e2.f() != null && e2.i() == null) {
                this.l0.setVisibility(0);
                return;
            }
        }
        this.l0.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        ax.S4.b.a(x0, "fragment.onStart");
        MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) f0()).f0();
        if (f0 != null) {
            V2(f0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        ax.S4.b.a(x0, "fragment.onStop");
        MediaControllerCompat f0 = ((com.voxdon.xplorer.activity.b) f0()).f0();
        if (f0 != null) {
            W2(f0);
        }
    }

    public void V2(MediaControllerCompat mediaControllerCompat) {
        ax.S4.b.a(x0, "onConnected, mediaController==null? ", Boolean.valueOf(mediaControllerCompat == null));
        if (mediaControllerCompat != null) {
            X2(mediaControllerCompat.d());
            Y2(mediaControllerCompat.e(), true);
            mediaControllerCompat.j(this.t0);
            this.s0 = true;
            PlaybackStateCompat e2 = mediaControllerCompat.e();
            g3();
            if (e2 != null) {
                if (e2.j() == 3 || e2.j() == 6) {
                    c3();
                }
            }
        }
    }

    public void W2(MediaControllerCompat mediaControllerCompat) {
        if (mediaControllerCompat == null || !this.s0) {
            return;
        }
        mediaControllerCompat.m(this.t0);
        this.s0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_playback_controls, viewGroup, false);
        this.d0 = inflate;
        this.e0 = inflate.findViewById(R.id.top_container);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.play_pause);
        this.f0 = imageButton;
        imageButton.setEnabled(true);
        this.f0.setOnClickListener(this.v0);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.stop);
        this.g0 = imageButton2;
        imageButton2.setEnabled(true);
        this.g0.setOnClickListener(this.u0);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.h0 = textView;
        textView.setSelected(true);
        this.i0 = (TextView) inflate.findViewById(R.id.artist);
        this.j0 = (TextView) inflate.findViewById(R.id.extra_info);
        this.k0 = (ImageView) inflate.findViewById(R.id.album_art);
        this.n0 = (ProgressBar) inflate.findViewById(R.id.play_progress);
        this.l0 = inflate.findViewById(R.id.progress);
        this.k0.setImageResource(R.drawable.ic_default_art);
        this.e0.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        e3();
        this.q0.shutdown();
    }
}
