/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import ax.Q0.m;
import ax.S0.a;
import ax.S0.d0;
import ax.Y0.g;
import ax.a1.k;

public final class j {
    private final Context a;
    private final f b;
    private final Handler c;
    private final c d;
    private final BroadcastReceiver e;
    private final d f;
    private ax.a1.e g;
    private k h;
    private ax.P0.c i;
    private boolean j;

    j(Context object, f f8, ax.P0.c c8, k k8) {
        Context context;
        this.a = context = object.getApplicationContext();
        this.b = ax.S0.a.e(f8);
        this.i = c8;
        this.h = k8;
        c8 = d0.C();
        this.c = c8;
        int n8 = Build.VERSION.SDK_INT;
        f8 = null;
        object = n8 >= 23 ? new c(this) : null;
        this.d = object;
        this.e = new e(this);
        k8 = ax.a1.e.i();
        object = f8;
        if (k8 != null) {
            object = new d(this, (Handler)c8, context.getContentResolver(), (Uri)k8);
        }
        this.f = object;
    }

    static /* synthetic */ k c(j j8, k k8) {
        j8.h = k8;
        return k8;
    }

    private void f(ax.a1.e e8) {
        if (this.j && !e8.equals(this.g)) {
            this.g = e8;
            this.b.a(e8);
        }
    }

    public void g(ax.a1.e e8) {
        this.f(e8);
    }

    public ax.a1.e h() {
        if (this.j) {
            return ax.S0.a.e(this.g);
        }
        this.j = true;
        Object object = this.f;
        if (object != null) {
            object.a();
        }
        if (Build.VERSION.SDK_INT >= 23 && (object = this.d) != null) {
            ax.a1.j$b.a(this.a, (AudioDeviceCallback)object, this.c);
        }
        object = this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.c);
        object = ax.a1.e.e(this.a, (Intent)object, this.i, this.h);
        this.g = object;
        return object;
    }

    public void i(ax.P0.c c8) {
        this.i = c8;
        this.f(ax.a1.e.f(this.a, c8, this.h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        k k8 = this.h;
        Object var3_3 = null;
        if (j.Objects.equals((Object)audioDeviceInfo, (Object)(k8 = k8 == null ? null : k8.a))) {
            return;
        }
        k8 = var3_3;
        if (audioDeviceInfo != null) {
            k8 = new k(audioDeviceInfo);
        }
        this.h = k8;
        this.f(ax.a1.e.f(this.a, this.i, k8));
    }

    public void k() {
        Object object;
        if (!this.j) {
            return;
        }
        this.g = null;
        if (Build.VERSION.SDK_INT >= 23 && (object = this.d) != null) {
            ax.a1.j$b.b(this.a, (AudioDeviceCallback)object);
        }
        this.a.unregisterReceiver(this.e);
        object = this.f;
        if (object != null) {
            ((d)((Object)object)).b();
        }
        this.j = false;
    }

    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ax.Y0.e.a(m.c(context), audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ax.Y0.g.a(m.c(context), audioDeviceCallback);
        }
    }

    private final class c
    extends AudioDeviceCallback {
        final j a;

        private c(j j8) {
            this.a = j8;
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] object) {
            object = this.a;
            ((j)object).f(ax.a1.e.f(((j)object).a, this.a.i, this.a.h));
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] object) {
            if (d0.s(object, this.a.h)) {
                ax.a1.j.c(this.a, null);
            }
            object = this.a;
            ((j)object).f(ax.a1.e.f(((j)object).a, this.a.i, this.a.h));
        }
    }

    private final class d
    extends ContentObserver {
        private final ContentResolver a;
        private final Uri b;
        final j c;

        public d(j j8, Handler handler, ContentResolver contentResolver, Uri uri) {
            this.c = j8;
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, (ContentObserver)this);
        }

        public void b() {
            this.a.unregisterContentObserver((ContentObserver)this);
        }

        public void onChange(boolean bl) {
            j j8 = this.c;
            j8.f(ax.a1.e.f(j8.a, this.c.i, this.c.h));
        }
    }

    private final class e
    extends BroadcastReceiver {
        final j a;

        private e(j j8) {
            this.a = j8;
        }

        public void onReceive(Context context, Intent intent) {
            if (!this.isInitialStickyBroadcast()) {
                j j8 = this.a;
                j8.f(ax.a1.e.e(context, intent, j8.i, this.a.h));
            }
        }
    }

    public static interface f {
        public void a(ax.a1.e var1);
    }
}

