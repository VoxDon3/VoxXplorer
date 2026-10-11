package ax.a1;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import ax.P0.C0894c;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285e {
    public static final C1285e c = new C1285e(AbstractC2991z.A(C0243e.d));

    @SuppressLint({"InlinedApi"})
    private static final AbstractC2991z<Integer> d = AbstractC2991z.C(2, 5, 6);
    static final AbstractC2962A<Integer, Integer> e = new AbstractC2962A.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();
    private final SparseArray<C0243e> a;
    private final int b;

    /* renamed from: ax.a1.e$b */
    private static final class b {
        private static AbstractC2964C<Integer> a() {
            AbstractC2964C.a i = new AbstractC2964C.a().i(8, 7);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                i.i(26, 27);
            }
            if (i2 >= 33) {
                i.a(30);
            }
            return i.l();
        }

        public static boolean b(AudioManager audioManager, C1295k c1295k) {
            int type;
            AudioDeviceInfo[] devices = c1295k == null ? ((AudioManager) C0968a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c1295k.a};
            AbstractC2964C<Integer> a = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                type = audioDeviceInfo.getType();
                if (a.contains(Integer.valueOf(type))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ax.a1.e$c */
    private static final class c {
        public static AbstractC2991z<Integer> a(C0894c c0894c) {
            boolean isDirectPlaybackSupported;
            AbstractC2991z.a r = AbstractC2991z.r();
            ax.r7.j0<Integer> it = C1285e.e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int intValue = next.intValue();
                if (Build.VERSION.SDK_INT >= ax.S0.d0.K(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c0894c.a().a);
                    if (isDirectPlaybackSupported) {
                        r.a(next);
                    }
                }
            }
            r.a(2);
            return r.k();
        }

        public static int b(int i, int i2, C0894c c0894c) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 10; i3 > 0; i3--) {
                int M = ax.S0.d0.M(i3);
                if (M != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(M).build(), c0894c.a().a);
                    if (isDirectPlaybackSupported) {
                        return i3;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: ax.a1.e$d */
    private static final class d {
        public static C1285e a(AudioManager audioManager, C0894c c0894c) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c0894c.a().a);
            return new C1285e(C1285e.c(directProfilesForAttributes));
        }

        public static C1295k b(AudioManager audioManager, C0894c c0894c) {
            List audioDevicesForAttributes;
            audioDevicesForAttributes = ((AudioManager) C0968a.e(audioManager)).getAudioDevicesForAttributes(c0894c.a().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C1295k(C1291h.a(audioDevicesForAttributes.get(0)));
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static AbstractC2991z<C0243e> c(List<AudioProfile> list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(C3218f.c(12)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile a2 = C1277a.a(list.get(i));
            encapsulationType = a2.getEncapsulationType();
            if (encapsulationType != 1) {
                format = a2.getFormat();
                if (ax.S0.d0.L0(format) || e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) C0968a.e((Set) hashMap.get(Integer.valueOf(format)));
                        channelMasks2 = a2.getChannelMasks();
                        set.addAll(C3218f.c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = a2.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(C3218f.c(channelMasks)));
                    }
                }
            }
        }
        AbstractC2991z.a r = AbstractC2991z.r();
        for (Map.Entry entry : hashMap.entrySet()) {
            r.a(new C0243e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return r.k();
    }

    private static AbstractC2991z<C0243e> d(int[] iArr, int i) {
        AbstractC2991z.a r = AbstractC2991z.r();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            r.a(new C0243e(i2, i));
        }
        return r.k();
    }

    @SuppressLint({"InlinedApi"})
    static C1285e e(Context context, Intent intent, C0894c c0894c, C1295k c1295k) {
        AudioManager c2 = ax.Q0.m.c(context);
        if (c1295k == null) {
            c1295k = Build.VERSION.SDK_INT >= 33 ? d.b(c2, c0894c) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (ax.S0.d0.S0(context) || ax.S0.d0.I0(context))) {
            return d.a(c2, c0894c);
        }
        if (i >= 23 && b.b(c2, c1295k)) {
            return c;
        }
        AbstractC2964C.a aVar = new AbstractC2964C.a();
        aVar.a(2);
        if (i >= 29 && (ax.S0.d0.S0(context) || ax.S0.d0.I0(context))) {
            aVar.j(c.a(c0894c));
            return new C1285e(d(C3218f.o(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1285e(d(C3218f.o(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(C3218f.c(intArrayExtra));
        }
        return new C1285e(d(C3218f.o(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static C1285e f(Context context, C0894c c0894c, C1295k c1295k) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0894c, c1295k);
    }

    private static int g(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        return ax.S0.d0.M(i);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1285e)) {
            return false;
        }
        C1285e c1285e = (C1285e) obj;
        return ax.S0.d0.t(this.a, c1285e.a) && this.b == c1285e.b;
    }

    public Pair<Integer, Integer> h(C0912v c0912v, C0894c c0894c) {
        int f = ax.P0.D.f((String) C0968a.e(c0912v.o), c0912v.k);
        if (!e.containsKey(Integer.valueOf(f))) {
            return null;
        }
        if (f == 18 && !k(18)) {
            f = 6;
        } else if ((f == 8 && !k(8)) || (f == 30 && !k(30))) {
            f = 7;
        }
        if (!k(f)) {
            return null;
        }
        C0243e c0243e = (C0243e) C0968a.e(this.a.get(f));
        int i = c0912v.G;
        if (i == -1 || f == 18) {
            int i2 = c0912v.H;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = c0243e.b(i2, c0894c);
        } else if (!c0912v.o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c0243e.c(i)) {
                return null;
            }
        } else if (i > 10) {
            return null;
        }
        int g = g(i);
        if (g == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(g));
    }

    public int hashCode() {
        return this.b + (ax.S0.d0.u(this.a) * 31);
    }

    public boolean j(C0912v c0912v, C0894c c0894c) {
        return h(c0912v, c0894c) != null;
    }

    public boolean k(int i) {
        return ax.S0.d0.r(this.a, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }

    private C1285e(List<C0243e> list) {
        this.a = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            C0243e c0243e = list.get(i);
            this.a.put(c0243e.a, c0243e);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, this.a.valueAt(i3).b);
        }
        this.b = i2;
    }

    /* renamed from: ax.a1.e$e, reason: collision with other inner class name */
    private static final class C0243e {
        public static final C0243e d;
        public final int a;
        public final int b;
        private final AbstractC2964C<Integer> c;

        static {
            d = Build.VERSION.SDK_INT >= 33 ? new C0243e(2, a(10)) : new C0243e(2, 10);
        }

        public C0243e(int i, Set<Integer> set) {
            this.a = i;
            AbstractC2964C<Integer> t = AbstractC2964C.t(set);
            this.c = t;
            ax.r7.j0<Integer> it = t.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 = Math.max(i2, Integer.bitCount(it.next().intValue()));
            }
            this.b = i2;
        }

        private static AbstractC2964C<Integer> a(int i) {
            AbstractC2964C.a aVar = new AbstractC2964C.a();
            for (int i2 = 1; i2 <= i; i2++) {
                aVar.a(Integer.valueOf(ax.S0.d0.M(i2)));
            }
            return aVar.l();
        }

        public int b(int i, C0894c c0894c) {
            return this.c != null ? this.b : Build.VERSION.SDK_INT >= 29 ? c.b(this.a, i, c0894c) : ((Integer) C0968a.e(C1285e.e.getOrDefault(Integer.valueOf(this.a), 0))).intValue();
        }

        public boolean c(int i) {
            if (this.c == null) {
                return i <= this.b;
            }
            int M = ax.S0.d0.M(i);
            if (M == 0) {
                return false;
            }
            return this.c.contains(Integer.valueOf(M));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0243e)) {
                return false;
            }
            C0243e c0243e = (C0243e) obj;
            return this.a == c0243e.a && this.b == c0243e.b && Objects.equals(this.c, c0243e.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            AbstractC2964C<Integer> abstractC2964C = this.c;
            return i + (abstractC2964C == null ? 0 : abstractC2964C.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public C0243e(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
