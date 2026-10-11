package ax.P0;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import ax.S0.d0;

/* renamed from: ax.P0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894c {
    public static final C0894c h = new e().a();
    private static final String i = d0.G0(0);
    private static final String j = d0.G0(1);
    private static final String k = d0.G0(2);
    private static final String l = d0.G0(3);
    private static final String m = d0.G0(4);
    private static final String n = d0.G0(5);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    private d g;

    /* renamed from: ax.P0.c$b */
    private static final class b {
        @SuppressLint({"WrongConstant"})
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* renamed from: ax.P0.c$c, reason: collision with other inner class name */
    private static final class C0166c {
        public static void a(AudioAttributes.Builder builder, boolean z) {
            builder.setIsContentSpatialized(z);
        }

        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* renamed from: ax.P0.c$d */
    public static final class d {
        public final AudioAttributes a;

        private d(C0894c c0894c) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0894c.a).setFlags(c0894c.b).setUsage(c0894c.c);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(usage, c0894c.d);
            }
            if (i >= 32) {
                C0166c.b(usage, c0894c.e);
                C0166c.a(usage, c0894c.f);
            }
            this.a = usage.build();
        }
    }

    /* renamed from: ax.P0.c$e */
    public static final class e {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;
        private int e = 0;
        private boolean f = false;

        public C0894c a() {
            return new C0894c(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public e b(int i) {
            this.a = i;
            return this;
        }

        public e c(int i) {
            this.c = i;
            return this;
        }
    }

    public d a() {
        if (this.g == null) {
            this.g = new d();
        }
        return this.g;
    }

    public int b() {
        if ((this.b & 1) == 1) {
            return 1;
        }
        switch (this.c) {
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0894c.class == obj.getClass()) {
            C0894c c0894c = (C0894c) obj;
            if (this.a == c0894c.a && this.b == c0894c.b && this.c == c0894c.c && this.d == c0894c.d && this.e == c0894c.e && this.f == c0894c.f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0);
    }

    private C0894c(int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
    }
}
