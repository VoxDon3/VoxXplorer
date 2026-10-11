/*
 * Decompiled with CFR 0.152.
 */
package ax.R0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import ax.R0.d;
import ax.S0.d0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public final class a {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    @Deprecated
    public static final a s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final String x;
    private static final String y;
    private static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        s = new b().o("").a();
        t = d0.G0(0);
        u = d0.G0(17);
        v = d0.G0(1);
        w = d0.G0(2);
        x = d0.G0(3);
        y = d0.G0(18);
        z = d0.G0(4);
        A = d0.G0(5);
        B = d0.G0(6);
        C = d0.G0(7);
        D = d0.G0(8);
        E = d0.G0(9);
        F = d0.G0(10);
        G = d0.G0(11);
        H = d0.G0(12);
        I = d0.G0(13);
        J = d0.G0(14);
        K = d0.G0(15);
        L = d0.G0(16);
        M = d0.G0(19);
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int n8, int n9, float f9, int n10, int n11, float f10, float f11, float f12, boolean bl, int n12, int n13, float f13, int n14) {
        if (charSequence == null) {
            ax.S0.a.e(bitmap);
        } else {
            boolean bl2 = bitmap == null;
            ax.S0.a.a(bl2);
        }
        this.a = charSequence instanceof Spanned ? SpannedString.valueOf((CharSequence)charSequence) : (charSequence != null ? charSequence.toString() : null);
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f8;
        this.f = n8;
        this.g = n9;
        this.h = f9;
        this.i = n10;
        this.j = f11;
        this.k = f12;
        this.l = bl;
        this.m = n12;
        this.n = n11;
        this.o = f10;
        this.p = n13;
        this.q = f13;
        this.r = n14;
    }

    public static a b(Bundle bundle) {
        Object object;
        b b8 = new b();
        CharSequence charSequence = bundle.getCharSequence(t);
        if (charSequence != null) {
            b8.o(charSequence);
            object = bundle.getParcelableArrayList(u);
            if (object != null) {
                charSequence = SpannableString.valueOf((CharSequence)charSequence);
                int n8 = object.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object e8 = object.get(i8);
                    ax.R0.d.c((Bundle)e8, (Spannable)charSequence);
                }
                b8.o(charSequence);
            }
        }
        if ((object = (Layout.Alignment)bundle.getSerializable(v)) != null) {
            b8.p((Layout.Alignment)object);
        }
        if ((object = (Layout.Alignment)bundle.getSerializable(w)) != null) {
            b8.j((Layout.Alignment)object);
        }
        if ((object = (Bitmap)bundle.getParcelable(x)) != null) {
            b8.f((Bitmap)object);
        } else {
            object = bundle.getByteArray(y);
            if (object != null) {
                b8.f(BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((Layout.Alignment)object).length));
            }
        }
        charSequence = z;
        if (bundle.containsKey((String)charSequence) && bundle.containsKey((String)(object = A))) {
            b8.h(bundle.getFloat((String)charSequence), bundle.getInt((String)object));
        }
        if (bundle.containsKey((String)(object = B))) {
            b8.i(bundle.getInt((String)object));
        }
        if (bundle.containsKey((String)(object = C))) {
            b8.k(bundle.getFloat((String)object));
        }
        if (bundle.containsKey((String)(object = D))) {
            b8.l(bundle.getInt((String)object));
        }
        if (bundle.containsKey((String)(charSequence = F)) && bundle.containsKey((String)(object = E))) {
            b8.q(bundle.getFloat((String)charSequence), bundle.getInt((String)object));
        }
        if (bundle.containsKey((String)(object = G))) {
            b8.n(bundle.getFloat((String)object));
        }
        if (bundle.containsKey((String)(object = H))) {
            b8.g(bundle.getFloat((String)object));
        }
        if (bundle.containsKey((String)(object = I))) {
            b8.s(bundle.getInt((String)object));
        }
        if (!bundle.getBoolean(J, false)) {
            b8.b();
        }
        if (bundle.containsKey((String)(object = K))) {
            b8.r(bundle.getInt((String)object));
        }
        if (bundle.containsKey((String)(object = L))) {
            b8.m(bundle.getFloat((String)object));
        }
        if (bundle.containsKey((String)(object = M))) {
            b8.t(bundle.getInt((String)object));
        }
        return b8.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        Object object = this.a;
        if (object != null) {
            bundle.putCharSequence(t, (CharSequence)object);
            object = this.a;
            if (object instanceof Spanned && !((ArrayList)(object = ax.R0.d.a((Spanned)object))).isEmpty()) {
                bundle.putParcelableArrayList(u, (ArrayList)object);
            }
        }
        bundle.putSerializable(v, (Serializable)this.b);
        bundle.putSerializable(w, (Serializable)this.c);
        bundle.putFloat(z, this.e);
        bundle.putInt(A, this.f);
        bundle.putInt(B, this.g);
        bundle.putFloat(C, this.h);
        bundle.putInt(D, this.i);
        bundle.putInt(E, this.n);
        bundle.putFloat(F, this.o);
        bundle.putFloat(G, this.j);
        bundle.putFloat(H, this.k);
        bundle.putBoolean(J, this.l);
        bundle.putInt(I, this.m);
        bundle.putInt(K, this.p);
        bundle.putFloat(L, this.q);
        bundle.putInt(M, this.r);
        return bundle;
    }

    public b a() {
        return new b(this);
    }

    public Bundle d() {
        Bundle bundle = this.c();
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ax.S0.a.g(this.d.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream));
            bundle.putByteArray(y, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            Bitmap bitmap;
            Bitmap bitmap2;
            object = (a)object;
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)((a)object).a) && this.b == ((a)object).b && this.c == ((a)object).c && ((bitmap2 = this.d) == null ? ((a)object).d == null : (bitmap = ((a)object).d) != null && bitmap2.sameAs(bitmap)) && this.e == ((a)object).e && this.f == ((a)object).f && this.g == ((a)object).g && this.h == ((a)object).h && this.i == ((a)object).i && this.j == ((a)object).j && this.k == ((a)object).k && this.l == ((a)object).l && this.m == ((a)object).m && this.n == ((a)object).n && this.o == ((a)object).o && this.p == ((a)object).p && this.q == ((a)object).q && this.r == ((a)object).r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), this.f, this.g, Float.valueOf(this.h), this.i, Float.valueOf(this.j), Float.valueOf(this.k), this.l, this.m, this.n, Float.valueOf(this.o), this.p, Float.valueOf(this.q), this.r});
    }

    public static final class b {
        private CharSequence a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;
        private int r;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        private b(a a8) {
            this.a = a8.a;
            this.b = a8.d;
            this.c = a8.b;
            this.d = a8.c;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
            this.h = a8.h;
            this.i = a8.i;
            this.j = a8.n;
            this.k = a8.o;
            this.l = a8.j;
            this.m = a8.k;
            this.n = a8.l;
            this.o = a8.m;
            this.p = a8.p;
            this.q = a8.q;
            this.r = a8.r;
        }

        public a a() {
            return new a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b f(Bitmap bitmap) {
            this.b = bitmap;
            this.a = null;
            return this;
        }

        public b g(float f8) {
            this.m = f8;
            return this;
        }

        public b h(float f8, int n8) {
            this.e = f8;
            this.f = n8;
            return this;
        }

        public b i(int n8) {
            this.g = n8;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f8) {
            this.h = f8;
            return this;
        }

        public b l(int n8) {
            this.i = n8;
            return this;
        }

        public b m(float f8) {
            this.q = f8;
            return this;
        }

        public b n(float f8) {
            this.l = f8;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.a = charSequence;
            this.b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b q(float f8, int n8) {
            this.k = f8;
            this.j = n8;
            return this;
        }

        public b r(int n8) {
            this.p = n8;
            return this;
        }

        public b s(int n8) {
            this.o = n8;
            this.n = true;
            return this;
        }

        public b t(int n8) {
            this.r = n8;
            return this;
        }
    }
}

