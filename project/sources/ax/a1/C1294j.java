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
import ax.P0.C0894c;
import ax.S0.C0968a;
import j$.util.Objects;

/* renamed from: ax.a1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294j {
    private final Context a;
    private final f b;
    private final Handler c;
    private final c d;
    private final BroadcastReceiver e;
    private final d f;
    private C1285e g;
    private C1295k h;
    private C0894c i;
    private boolean j;

    /* renamed from: ax.a1.j$b */
    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ax.Q0.m.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ax.Q0.m.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: ax.a1.j$c */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1294j c1294j = C1294j.this;
            c1294j.f(C1285e.f(c1294j.a, C1294j.this.i, C1294j.this.h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (ax.S0.d0.s(audioDeviceInfoArr, C1294j.this.h)) {
                C1294j.this.h = null;
            }
            C1294j c1294j = C1294j.this;
            c1294j.f(C1285e.f(c1294j.a, C1294j.this.i, C1294j.this.h));
        }
    }

    /* renamed from: ax.a1.j$d */
    private final class d extends ContentObserver {
        private final ContentResolver a;
        private final Uri b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C1294j c1294j = C1294j.this;
            c1294j.f(C1285e.f(c1294j.a, C1294j.this.i, C1294j.this.h));
        }
    }

    /* renamed from: ax.a1.j$e */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1294j c1294j = C1294j.this;
            c1294j.f(C1285e.e(context, intent, c1294j.i, C1294j.this.h));
        }
    }

    /* renamed from: ax.a1.j$f */
    public interface f {
        void a(C1285e c1285e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    C1294j(Context context, f fVar, C0894c c0894c, C1295k c1295k) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (f) C0968a.e(fVar);
        this.i = c0894c;
        this.h = c1295k;
        Handler C = ax.S0.d0.C();
        this.c = C;
        Object[] objArr = 0;
        this.d = Build.VERSION.SDK_INT >= 23 ? new c() : null;
        this.e = new e();
        Uri i = C1285e.i();
        this.f = i != null ? new d(C, applicationContext.getContentResolver(), i) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(C1285e c1285e) {
        if (!this.j || c1285e.equals(this.g)) {
            return;
        }
        this.g = c1285e;
        this.b.a(c1285e);
    }

    public void g(C1285e c1285e) {
        f(c1285e);
    }

    public C1285e h() {
        c cVar;
        if (this.j) {
            return (C1285e) C0968a.e(this.g);
        }
        this.j = true;
        d dVar = this.f;
        if (dVar != null) {
            dVar.a();
        }
        if (Build.VERSION.SDK_INT >= 23 && (cVar = this.d) != null) {
            b.a(this.a, cVar, this.c);
        }
        C1285e e2 = C1285e.e(this.a, this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.c), this.i, this.h);
        this.g = e2;
        return e2;
    }

    public void i(C0894c c0894c) {
        this.i = c0894c;
        f(C1285e.f(this.a, c0894c, this.h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        C1295k c1295k = this.h;
        if (Objects.equals(audioDeviceInfo, c1295k == null ? null : c1295k.a)) {
            return;
        }
        C1295k c1295k2 = audioDeviceInfo != null ? new C1295k(audioDeviceInfo) : null;
        this.h = c1295k2;
        f(C1285e.f(this.a, this.i, c1295k2));
    }

    public void k() {
        c cVar;
        if (this.j) {
            this.g = null;
            if (Build.VERSION.SDK_INT >= 23 && (cVar = this.d) != null) {
                b.b(this.a, cVar);
            }
            this.a.unregisterReceiver(this.e);
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
            }
            this.j = false;
        }
    }
}
