/*
 * Decompiled with CFR 0.152.
 */
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
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import ax.P0.D;
import ax.P0.v;
import ax.Q0.m;
import ax.S0.d0;
import ax.a1.a;
import ax.a1.f;
import ax.a1.g;
import ax.a1.h;
import ax.a1.i;
import ax.a1.k;
import ax.r7.A;
import ax.r7.C;
import ax.r7.j0;
import ax.r7.x;
import ax.r7.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e {
    public static final e c = new e(z.A(ax.a1.e$e.d));
    @SuppressLint(value={"InlinedApi"})
    private static final z<Integer> d;
    static final A<Integer, Integer> e;
    private final SparseArray<e> a = new SparseArray();
    private final int b;

    static {
        Integer n8 = 5;
        Integer n9 = 6;
        d = z.C(2, n8, n9);
        A.a<Integer, Integer> a8 = new A.a<Integer, Integer>().f(n8, n9).f(17, n9).f(7, n9).f(30, 10).f(18, n9);
        n8 = 8;
        e = a8.f(n9, n8).f(n8, n8).f(14, n8).c();
    }

    private e(List<e> list) {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < list.size(); ++n8) {
            e e8 = list.get(n8);
            this.a.put(e8.a, (Object)e8);
        }
        int n10 = 0;
        for (n8 = n9; n8 < this.a.size(); ++n8) {
            n10 = Math.max(n10, ((e)this.a.valueAt((int)n8)).b);
        }
        this.b = n10;
    }

    private static boolean b() {
        String string = Build.MANUFACTURER;
        return string.equals("Amazon") || string.equals("Xiaomi");
        {
        }
    }

    @SuppressLint(value={"WrongConstant"})
    private static z<e> c(List<AudioProfile> object) {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<Integer, HashSet<Integer>>();
        hashMap.put(2, new HashSet<Integer>(ax.u7.f.c(12)));
        for (int i8 = 0; i8 < object.size(); ++i8) {
            int n8;
            AudioProfile object2 = ax.a1.a.a(object.get(i8));
            if (ax.a1.b.a(object2) == 1 || !d0.L0(n8 = ax.a1.c.a(object2)) && !e.containsKey(n8)) continue;
            if (hashMap.containsKey(n8)) {
                ax.S0.a.e((Set)hashMap.get(n8)).addAll(ax.u7.f.c(ax.a1.d.a(object2)));
                continue;
            }
            hashMap.put(n8, new HashSet<Integer>(ax.u7.f.c(ax.a1.d.a(object2))));
        }
        object = z.r();
        for (Map.Entry entry : hashMap.entrySet()) {
            object.h(new e((int)((Integer)entry.getKey()), (Set)entry.getValue()));
        }
        return object.k();
    }

    private static z<e> d(int[] nArray, int n8) {
        int n9;
        z.a<e> a8 = z.r();
        int n10 = n9 = 0;
        int[] nArray2 = nArray;
        if (nArray == null) {
            nArray2 = new int[]{};
            n10 = n9;
        }
        while (n10 < nArray2.length) {
            a8.h(new e(nArray2[n10], n8));
            ++n10;
        }
        return a8.k();
    }

    @SuppressLint(value={"InlinedApi"})
    static e e(Context object, Intent intent, ax.P0.c c8, k object2) {
        int n8;
        AudioManager audioManager = m.c(object);
        if (object2 == null) {
            object2 = Build.VERSION.SDK_INT >= 33 ? ax.a1.e$d.b(audioManager, c8) : null;
        }
        if ((n8 = Build.VERSION.SDK_INT) >= 33 && (d0.S0(object) || d0.I0(object))) {
            return ax.a1.e$d.a(audioManager, c8);
        }
        if (n8 >= 23 && ax.a1.e$b.b(audioManager, (k)object2)) {
            return c;
        }
        object2 = new C.a();
        ((C.a)object2).h(2);
        if (n8 >= 29 && (d0.S0(object) || d0.I0(object))) {
            ((C.a)object2).j(ax.a1.e$c.a(c8));
            return new e(ax.a1.e.d(ax.u7.f.o(((C.a)object2).l()), 10));
        }
        n8 = Settings.Global.getInt((ContentResolver)(object = object.getContentResolver()), (String)"use_external_surround_sound_flag", (int)0) == 1 ? 1 : 0;
        if ((n8 != 0 || ax.a1.e.b()) && Settings.Global.getInt((ContentResolver)object, (String)"external_surround_sound_enabled", (int)0) == 1) {
            ((C.a)object2).j(d);
        }
        if (intent != null && n8 == 0 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            object = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (object != null) {
                ((C.a)object2).j(ax.u7.f.c((int[])object));
            }
            return new e(ax.a1.e.d(ax.u7.f.o(((C.a)object2).l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new e(ax.a1.e.d(ax.u7.f.o(((C.a)object2).l()), 10));
    }

    @SuppressLint(value={"UnprotectedReceiver"})
    static e f(Context context, ax.P0.c c8, k k8) {
        return ax.a1.e.e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c8, k8);
    }

    private static int g(int n8) {
        int n9;
        int n10;
        block6: {
            block8: {
                block7: {
                    n10 = Build.VERSION.SDK_INT;
                    n9 = n8;
                    if (n10 > 28) break block6;
                    if (n8 != 7) break block7;
                    n9 = 8;
                    break block6;
                }
                if (n8 == 3 || n8 == 4) break block8;
                n9 = n8;
                if (n8 != 5) break block6;
            }
            n9 = 6;
        }
        n8 = n9;
        if (n10 <= 26) {
            n8 = n9;
            if ("fugu".equals(Build.DEVICE)) {
                n8 = n9;
                if (n9 == 1) {
                    n8 = 2;
                }
            }
        }
        return d0.M(n8);
    }

    static Uri i() {
        if (ax.a1.e.b()) {
            return Settings.Global.getUriFor((String)"external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return d0.t(this.a, ((e)object).a) && this.b == ((e)object).b;
    }

    public Pair<Integer, Integer> h(v v8, ax.P0.c c8) {
        int n8;
        int n9;
        block15: {
            block16: {
                block14: {
                    n9 = D.f(ax.S0.a.e(v8.o), v8.k);
                    if (!e.containsKey(n9)) {
                        return null;
                    }
                    if (n9 != 18 || this.k(18)) break block14;
                    n8 = 6;
                    break block15;
                }
                if (n9 == 8 && !this.k(8)) break block16;
                n8 = n9;
                if (n9 != 30) break block15;
                n8 = n9;
                if (this.k(30)) break block15;
            }
            n8 = 7;
        }
        if (!this.k(n8)) {
            return null;
        }
        e e8 = ax.S0.a.e((e)this.a.get(n8));
        int n10 = v8.G;
        if (n10 != -1 && n8 != 18) {
            if (v8.o.equals("audio/vnd.dts.uhd;profile=p2") && Build.VERSION.SDK_INT < 33) {
                n9 = n10;
                if (n10 > 10) {
                    return null;
                }
            } else {
                n9 = n10;
                if (!e8.c(n10)) {
                    return null;
                }
            }
        } else {
            n9 = v8.H;
            if (n9 == -1) {
                n9 = 48000;
            }
            n9 = e8.b(n9, c8);
        }
        if ((n9 = ax.a1.e.g(n9)) == 0) {
            return null;
        }
        return Pair.create((Object)n8, (Object)n9);
    }

    public int hashCode() {
        return this.b + d0.u(this.a) * 31;
    }

    public boolean j(v v8, ax.P0.c c8) {
        return this.h(v8, c8) != null;
    }

    public boolean k(int n8) {
        return d0.r(this.a, n8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", audioProfiles=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static final class b {
        private static C<Integer> a() {
            C.a<Integer> a8 = new C.a<Integer>().i(8, 7);
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 31) {
                a8.i((Integer[])new Integer[]{26, 27});
            }
            if (n8 >= 33) {
                a8.h(30);
            }
            return a8.l();
        }

        public static boolean b(AudioManager audioDeviceInfoArray, k object) {
            audioDeviceInfoArray = object == null ? ax.Y0.h.a(ax.S0.a.e(audioDeviceInfoArray), 2) : new AudioDeviceInfo[]{((k)object).a};
            object = ax.a1.e$b.a();
            int n8 = audioDeviceInfoArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!((x)object).contains(ax.Y0.i.a(audioDeviceInfoArray[i8]))) continue;
                return true;
            }
            return false;
        }
    }

    private static final class c {
        public static z<Integer> a(ax.P0.c c8) {
            z.a<Integer> a8 = z.r();
            j0<Integer> j02 = e.j().n();
            while (j02.hasNext()) {
                Integer n8 = (Integer)j02.next();
                int n9 = n8;
                if (Build.VERSION.SDK_INT < d0.K(n9) || !f.a(new AudioFormat.Builder().setChannelMask(12).setEncoding(n9).setSampleRate(48000).build(), c8.a().a)) continue;
                a8.h(n8);
            }
            a8.h(2);
            return a8.k();
        }

        public static int b(int n8, int n9, ax.P0.c c8) {
            for (int i8 = 10; i8 > 0; --i8) {
                int n10 = d0.M(i8);
                if (n10 == 0 || !f.a(new AudioFormat.Builder().setEncoding(n8).setSampleRate(n9).setChannelMask(n10).build(), c8.a().a)) continue;
                return i8;
            }
            return 0;
        }
    }

    private static final class d {
        public static e a(AudioManager audioManager, ax.P0.c c8) {
            return new e(ax.a1.e.c(i.a(audioManager, c8.a().a)));
        }

        public static k b(AudioManager object, ax.P0.c c8) {
            if ((object = g.a(ax.S0.a.e(object), c8.a().a)).isEmpty()) {
                return null;
            }
            return new k(h.a(object.get(0)));
        }
    }

    private static final class e {
        public static final e d;
        public final int a;
        public final int b;
        private final C<Integer> c;

        static {
            e e8 = Build.VERSION.SDK_INT >= 33 ? new e(2, ax.a1.e$e.a(10)) : new e(2, 10);
            d = e8;
        }

        public e(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = null;
        }

        public e(int n8, Set<Integer> object) {
            this.a = n8;
            object = C.t(object);
            this.c = object;
            object = ((C)object).n();
            n8 = 0;
            while (object.hasNext()) {
                n8 = Math.max(n8, Integer.bitCount((Integer)object.next()));
            }
            this.b = n8;
        }

        private static C<Integer> a(int n8) {
            C.a<Integer> a8 = new C.a<Integer>();
            for (int i8 = 1; i8 <= n8; ++i8) {
                a8.h(d0.M(i8));
            }
            return a8.l();
        }

        public int b(int n8, ax.P0.c c8) {
            if (this.c != null) {
                return this.b;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return ax.a1.e$c.b(this.a, n8, c8);
            }
            return ax.S0.a.e(e.getOrDefault(this.a, 0));
        }

        public boolean c(int n8) {
            if (this.c == null) {
                return n8 <= this.b;
            }
            if ((n8 = d0.M(n8)) == 0) {
                return false;
            }
            return this.c.contains(n8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof e)) {
                return false;
            }
            object = (e)object;
            return this.a == ((e)object).a && this.b == ((e)object).b && j.Objects.equals(this.c, ((e)object).c);
        }

        public int hashCode() {
            int n8 = this.a;
            int n9 = this.b;
            C<Integer> c8 = this.c;
            int n10 = c8 == null ? 0 : c8.hashCode();
            return (n8 * 31 + n9) * 31 + n10;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioProfile[format=");
            stringBuilder.append(this.a);
            stringBuilder.append(", maxChannelCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", channelMasks=");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

