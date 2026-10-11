/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import ax.P0.f;
import ax.S0.d0;

public final class c {
    public static final c h = new e().a();
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

    private c(int n8, int n9, int n10, int n11, int n12, boolean bl) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = bl;
    }

    public d a() {
        if (this.g == null) {
            this.g = new d(this);
        }
        return this.g;
    }

    public int b() {
        if ((this.b & 1) == 1) {
            return 1;
        }
        switch (this.c) {
            default: {
                return 3;
            }
            case 13: {
                return 1;
            }
            case 11: {
                return 10;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 2: 
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.a == ((c)object).a && this.b == ((c)object).b && this.c == ((c)object).c && this.d == ((c)object).d && this.e == ((c)object).e && this.f == ((c)object).f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f;
    }

    private static final class b {
        @SuppressLint(value={"WrongConstant"})
        public static void a(AudioAttributes.Builder builder, int n8) {
            ax.P0.d.a(builder, n8);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, boolean bl) {
            ax.P0.e.a(builder, bl);
        }

        @SuppressLint(value={"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int n8) {
            ax.P0.f.a(builder, n8);
        }
    }

    public static final class d {
        public final AudioAttributes a;

        private d(c c8) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder().setContentType(c8.a).setFlags(c8.b).setUsage(c8.c);
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 29) {
                ax.P0.c$b.a(builder, c8.d);
            }
            if (n8 >= 32) {
                ax.P0.c$c.b(builder, c8.e);
                ax.P0.c$c.a(builder, c8.f);
            }
            this.a = builder.build();
        }
    }

    public static final class e {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;
        private int e = 0;
        private boolean f = false;

        public c a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public e b(int n8) {
            this.a = n8;
            return this;
        }

        public e c(int n8) {
            this.c = n8;
            return this;
        }
    }
}

