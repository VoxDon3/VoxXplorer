package ax.R0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {
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

    @Deprecated
    public static final a s = new b().o(HttpUrl.FRAGMENT_ENCODE_SET).a();
    private static final String t = d0.G0(0);
    private static final String u = d0.G0(17);
    private static final String v = d0.G0(1);
    private static final String w = d0.G0(2);
    private static final String x = d0.G0(3);
    private static final String y = d0.G0(18);
    private static final String z = d0.G0(4);
    private static final String A = d0.G0(5);
    private static final String B = d0.G0(6);
    private static final String C = d0.G0(7);
    private static final String D = d0.G0(8);
    private static final String E = d0.G0(9);
    private static final String F = d0.G0(10);
    private static final String G = d0.G0(11);
    private static final String H = d0.G0(12);
    private static final String I = d0.G0(13);
    private static final String J = d0.G0(14);
    private static final String K = d0.G0(15);
    private static final String L = d0.G0(16);
    private static final String M = d0.G0(19);

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

        public b g(float f) {
            this.m = f;
            return this;
        }

        public b h(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b i(int i) {
            this.g = i;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f) {
            this.h = f;
            return this;
        }

        public b l(int i) {
            this.i = i;
            return this;
        }

        public b m(float f) {
            this.q = f;
            return this;
        }

        public b n(float f) {
            this.l = f;
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

        public b q(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b r(int i) {
            this.p = i;
            return this;
        }

        public b s(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b t(int i) {
            this.r = i;
            return this;
        }

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

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.d;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.n;
            this.k = aVar.o;
            this.l = aVar.j;
            this.m = aVar.k;
            this.n = aVar.l;
            this.o = aVar.m;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(u);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = parcelableArrayList.get(i);
                    i++;
                    d.c((Bundle) obj, valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = z;
        if (bundle.containsKey(str)) {
            String str2 = A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = F;
        if (bundle.containsKey(str6)) {
            String str7 = E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(J, false)) {
            bVar.b();
        }
        String str11 = K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(t, charSequence);
            CharSequence charSequence2 = this.a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> a = d.a((Spanned) charSequence2);
                if (!a.isEmpty()) {
                    bundle.putParcelableArrayList(u, a);
                }
            }
        }
        bundle.putSerializable(v, this.b);
        bundle.putSerializable(w, this.c);
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
        return new b();
    }

    public Bundle d() {
        Bundle c = c();
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0968a.g(this.d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c.putByteArray(y, byteArrayOutputStream.toByteArray());
        }
        return c;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && ((bitmap = this.d) != null ? !((bitmap2 = aVar.d) == null || !bitmap.sameAs(bitmap2)) : aVar.d == null) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            C0968a.e(bitmap);
        } else {
            C0968a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }
}
