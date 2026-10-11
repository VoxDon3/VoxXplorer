/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
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
import ax.Q2.a;
import ax.g3.c;
import ax.u3.B;
import ax.u3.g;
import com.alphainventor.filemanager.activity.b;
import com.alphainventor.filemanager.musicplayer.FullScreenPlayerActivity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class PlaybackControlsFragment
extends Fragment {
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
    private final Handler p0 = new Handler(Looper.getMainLooper());
    private final ScheduledExecutorService q0 = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> r0;
    private boolean s0;
    private final MediaControllerCompat.a t0 = new MediaControllerCompat.a(this){
        final PlaybackControlsFragment d;
        {
            this.d = playbackControlsFragment;
        }

        @Override
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat == null) {
                return;
            }
            try {
                ax.S4.b.a(x0, "Received metadata state change to mediaId=", mediaMetadataCompat.e().f(), " song=", mediaMetadataCompat.e().i());
            }
            catch (RuntimeException runtimeException) {
                ax.Ha.c.h().f().d("METADATA COULD NOT READ BITMAP").l(runtimeException).h();
            }
            this.d.X2(mediaMetadataCompat);
        }

        @Override
        public void e(PlaybackStateCompat playbackStateCompat) {
            ax.S4.b.a(x0, "Received playback state change to state ", playbackStateCompat.j());
            this.d.Y2(playbackStateCompat, false);
        }
    };
    private final View.OnClickListener u0 = new c(this){
        final PlaybackControlsFragment c;
        {
            this.c = playbackControlsFragment;
        }

        @Override
        public void a(View object) {
            object = (b)this.c.f0();
            if (object != null && this.c.X0()) {
                ((b)object).K0();
            }
        }
    };
    private final View.OnClickListener v0 = new c(this){
        final PlaybackControlsFragment c;
        {
            this.c = playbackControlsFragment;
        }

        @Override
        public void a(View object) {
            if (this.c.X0()) {
                Object object2 = ((b)this.c.f0()).f0();
                if (object2 == null) {
                    b b8 = (b)this.c.f0();
                    object2 = ax.Ha.c.h().d("MediaController == null");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Stopped:");
                    ((StringBuilder)object).append(b8.n0());
                    ((StringBuilder)object).append(":isConnecting:");
                    ((StringBuilder)object).append(b8.l0());
                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    return;
                }
                int n8 = (object2 = ((MediaControllerCompat)object2).e()) == null ? 0 : ((PlaybackStateCompat)object2).j();
                object2 = x0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Button pressed, in state ");
                stringBuilder.append(n8);
                ax.S4.b.a((String)object2, stringBuilder.toString());
                if (object.getId() == 2131362698) {
                    object2 = x0;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Play button pressed, in state ");
                    ((StringBuilder)object).append(n8);
                    ax.S4.b.a((String)object2, ((StringBuilder)object).toString());
                    if (n8 != 2 && n8 != 1 && n8 != 0) {
                        if (n8 == 3 || n8 == 6 || n8 == 8) {
                            this.c.a3();
                            return;
                        }
                    } else {
                        this.c.b3();
                    }
                }
            }
        }
    };
    private final Runnable w0 = new Runnable(this){
        final PlaybackControlsFragment q;
        {
            this.q = playbackControlsFragment;
        }

        @Override
        public void run() {
            this.q.g3();
        }
    };

    private void X2(MediaMetadataCompat object) {
        Object object2 = x0;
        ax.S4.b.a((String)object2, "onMetadataChanged ", object);
        if (this.f0() == null) {
            ax.S4.b.j((String)object2, "onMetadataChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring.");
            return;
        }
        if (object != null) {
            object2 = this.o0;
            if (object2 != null && ((PlaybackStateCompat)object2).j() == 0) {
                this.h3();
            }
            object2 = k.b((MediaMetadataCompat)object);
            this.h0.setText(((MediaDescriptionCompat)object2).i());
            if (this.d0.isAccessibilityFocused()) {
                this.d0.announceForAccessibility(((MediaDescriptionCompat)object2).i());
            }
            this.i0.setText(((MediaDescriptionCompat)object2).g());
            this.f3((MediaMetadataCompat)object);
            this.g3();
            object = ((MediaDescriptionCompat)object2).d() != null ? ((MediaDescriptionCompat)object2).d().toString() : null;
            if (!TextUtils.equals((CharSequence)object, (CharSequence)this.m0)) {
                this.m0 = object;
                Bitmap bitmap = ((MediaDescriptionCompat)object2).c();
                ax.P4.a a8 = ax.P4.a.i();
                object2 = bitmap;
                if (bitmap == null) {
                    object2 = a8.j(this.m0);
                }
                if (object2 != null) {
                    this.k0.setImageBitmap((Bitmap)object2);
                    return;
                }
                this.k0.setImageBitmap(null);
                if (object == null) {
                    this.k0.setImageResource(2131231122);
                    return;
                }
                a8.f(this.b().getApplicationContext(), (String)object, new a.a(this){
                    final PlaybackControlsFragment a;
                    {
                        this.a = playbackControlsFragment;
                    }

                    @Override
                    public void b(String string, Exception exception) {
                        super.b(string, exception);
                        if (!string.equals(this.a.m0)) {
                            return;
                        }
                        this.a.k0.setImageResource(2131231122);
                    }

                    @Override
                    public void c(String string, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
                        if (string.equals(this.a.m0) && bitmap3 != null) {
                            this.a.k0.setImageBitmap(bitmap2);
                        }
                    }
                });
            }
        }
    }

    private void Y2(PlaybackStateCompat playbackStateCompat, boolean bl) {
        block13: {
            block7: {
                block8: {
                    block12: {
                        block9: {
                            block10: {
                                String string;
                                block11: {
                                    string = x0;
                                    ax.S4.b.a(string, "onPlaybackStateChanged ", playbackStateCompat);
                                    if (this.f0() == null) {
                                        ax.S4.b.j(string, "onPlaybackStateChanged called when getActivity null,this should not happen if the callback was properly unregistered. Ignoring.");
                                        return;
                                    }
                                    if (playbackStateCompat == null) {
                                        return;
                                    }
                                    this.o0 = playbackStateCompat;
                                    int n8 = playbackStateCompat.j();
                                    if (n8 == 0) break block7;
                                    if (n8 == 1 || n8 == 2) break block8;
                                    if (n8 == 3) break block9;
                                    if (n8 == 6) break block10;
                                    if (n8 == 7) break block11;
                                    this.e3();
                                    this.l0.setVisibility(8);
                                    break block12;
                                }
                                ax.S4.b.c(string, "error playbackstate: ", playbackStateCompat.c());
                                if (!bl) {
                                    string = playbackStateCompat.d();
                                    if (string != null && string.getInt("SUB_ERROR_CODE", 0) == 4005 && (string = string.getString("SUB_ERROR_MSG")) != null && ax.P2.a.q(string)) {
                                        playbackStateCompat = new Intent("local.intent.action.SHOW_CODEC_DOWNLOAD");
                                        playbackStateCompat.putExtra("mimetype", string);
                                        g.a().e((Intent)playbackStateCompat);
                                    } else {
                                        string = this.f0() != null ? this.f0().findViewById(0x1020002) : null;
                                        if (string != null) {
                                            B.T((View)string, playbackStateCompat.c(), 0).a0();
                                        } else {
                                            Toast.makeText((Context)this.f0(), (CharSequence)playbackStateCompat.c(), (int)1).show();
                                        }
                                    }
                                }
                                this.l0.setVisibility(8);
                                this.e3();
                                break block13;
                            }
                            this.e3();
                            this.l0.setVisibility(0);
                            break block12;
                        }
                        this.l0.setVisibility(8);
                        this.c3();
                    }
                    this.f0.setImageDrawable(ax.s3.a.c((Context)this.f0(), 2131231186));
                    this.f0.setContentDescription((CharSequence)this.M0(2131952500));
                    return;
                }
                this.l0.setVisibility(8);
                this.Z2();
                this.e3();
                break block13;
            }
            this.Z2();
            this.h3();
        }
        this.f0.setImageDrawable(ax.s3.a.c((Context)this.f0(), 2131231194));
        this.f0.setContentDescription((CharSequence)this.M0(2131952501));
    }

    private void Z2() {
        this.p0.post(this.w0);
    }

    private void a3() {
        MediaControllerCompat mediaControllerCompat = ((b)this.f0()).f0();
        if (mediaControllerCompat != null) {
            mediaControllerCompat.i().a();
            this.e3();
        }
        a.i().m("menu_music_player", "pause").c("loc", "playback_control").e();
    }

    private void b3() {
        MediaControllerCompat mediaControllerCompat = ((b)this.f0()).f0();
        if (mediaControllerCompat != null) {
            mediaControllerCompat.i().b();
            this.c3();
        }
        a.i().m("menu_music_player", "play").c("loc", "playback_control").e();
    }

    private void c3() {
        this.e3();
        if (!this.q0.isShutdown()) {
            this.r0 = this.q0.scheduleAtFixedRate(new Runnable(this){
                final PlaybackControlsFragment q;
                {
                    this.q = playbackControlsFragment;
                }

                @Override
                public void run() {
                    this.q.p0.post(this.q.w0);
                }
            }, 100L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d3() {
        Object object = (b)this.f0();
        Object object2 = new Intent((Context)this.f0(), FullScreenPlayerActivity.class);
        object2.setFlags(0x20000000);
        Object object3 = ((b)object).f0();
        if (object3 == null) {
            object2 = ax.Ha.c.h().d("MediaController NULL!!");
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(((b)object).n0());
            ((StringBuilder)object3).append(":");
            ((StringBuilder)object3).append(((b)object).l0());
            ((ax.Ha.b)object2).g(((StringBuilder)object3).toString()).h();
            return;
        }
        object = ((MediaControllerCompat)object3).d();
        if (object != null) {
            try {
                object2.putExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION", (Parcelable)((MediaMetadataCompat)object).e());
            }
            catch (RuntimeException runtimeException) {}
        }
        this.F2((Intent)object2);
        a.i().m("menu_music_player", "fullscreen").e();
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
        int n8 = (int)mediaMetadataCompat.f("android.media.metadata.DURATION");
        this.n0.setMax(n8);
    }

    private void g3() {
        long l8;
        PlaybackStateCompat playbackStateCompat = this.o0;
        if (playbackStateCompat == null) {
            return;
        }
        long l9 = l8 = playbackStateCompat.i();
        if (this.o0.j() != 0) {
            l9 = l8;
            if (this.o0.j() != 2) {
                l9 = l8;
                if (this.o0.j() != 1) {
                    long l10 = SystemClock.elapsedRealtime();
                    l9 = this.o0.e();
                    l9 = (long)((float)l8 + (float)((int)(l10 - l9)) * this.o0.f());
                }
            }
        }
        this.n0.setProgress((int)l9);
    }

    private void h3() {
        if (this.f0() == null) {
            return;
        }
        Object object = ((b)this.f0()).f0();
        if (object != null && ((MediaControllerCompat)object).d() != null && ((MediaDescriptionCompat)(object = ((MediaControllerCompat)object).d().e())).f() != null && ((MediaDescriptionCompat)object).i() == null) {
            this.l0.setVisibility(0);
            return;
        }
        this.l0.setVisibility(8);
    }

    @Override
    public void J1() {
        super.J1();
        ax.S4.b.a(x0, "fragment.onStart");
        MediaControllerCompat mediaControllerCompat = ((b)this.f0()).f0();
        if (mediaControllerCompat != null) {
            this.V2(mediaControllerCompat);
        }
    }

    @Override
    public void K1() {
        super.K1();
        ax.S4.b.a(x0, "fragment.onStop");
        MediaControllerCompat mediaControllerCompat = ((b)this.f0()).f0();
        if (mediaControllerCompat != null) {
            this.W2(mediaControllerCompat);
        }
    }

    public void V2(MediaControllerCompat object) {
        String string = x0;
        boolean bl = object == null;
        ax.S4.b.a(string, "onConnected, mediaController==null? ", bl);
        if (object != null) {
            this.X2(((MediaControllerCompat)object).d());
            this.Y2(((MediaControllerCompat)object).e(), true);
            ((MediaControllerCompat)object).j(this.t0);
            this.s0 = true;
            object = ((MediaControllerCompat)object).e();
            this.g3();
            if (object != null && (((PlaybackStateCompat)object).j() == 3 || ((PlaybackStateCompat)object).j() == 6)) {
                this.c3();
            }
        }
    }

    public void W2(MediaControllerCompat mediaControllerCompat) {
        if (mediaControllerCompat != null && this.s0) {
            mediaControllerCompat.m(this.t0);
            this.s0 = false;
        }
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131558556, viewGroup, false);
        this.d0 = layoutInflater;
        this.e0 = layoutInflater.findViewById(2131362989);
        viewGroup = (ImageButton)layoutInflater.findViewById(2131362698);
        this.f0 = viewGroup;
        viewGroup.setEnabled(true);
        this.f0.setOnClickListener(this.v0);
        viewGroup = (ImageButton)layoutInflater.findViewById(2131362900);
        this.g0 = viewGroup;
        viewGroup.setEnabled(true);
        this.g0.setOnClickListener(this.u0);
        viewGroup = (TextView)layoutInflater.findViewById(2131362963);
        this.h0 = viewGroup;
        viewGroup.setSelected(true);
        this.i0 = (TextView)layoutInflater.findViewById(2131361901);
        this.j0 = (TextView)layoutInflater.findViewById(2131362263);
        this.k0 = (ImageView)layoutInflater.findViewById(2131361877);
        this.n0 = (ProgressBar)layoutInflater.findViewById(2131362699);
        this.l0 = layoutInflater.findViewById(2131362712);
        this.k0.setImageResource(2131231122);
        this.e0.setOnClickListener((View.OnClickListener)new c(this){
            final PlaybackControlsFragment c;
            {
                this.c = playbackControlsFragment;
            }

            @Override
            public void a(View view) {
                this.c.d3();
            }
        });
        return layoutInflater;
    }

    @Override
    public void s1() {
        super.s1();
        this.e3();
        this.q0.shutdown();
    }
}

