/*
 * Decompiled with CFR 0.152.
 */
package ax.n6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import ax.C6.f;
import ax.F6.w;
import ax.K6.e;
import ax.S0.U;
import ax.k6.j;
import ax.k6.k;
import ax.k6.l;
import ax.k6.m;
import ax.n6.b;
import java.io.Serializable;
import java.util.Locale;

public final class c {
    private final a a;
    private final a b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    int k;
    int l;

    c(Context object, int n8, int n9, int n10, a object2) {
        a a8;
        this.b = a8 = new a();
        a a9 = object2;
        if (object2 == null) {
            a9 = new a();
        }
        if (n8 != 0) {
            ax.n6.c$a.b(a9, n8);
        }
        TypedArray typedArray = this.a((Context)object, a9.q, n9, n10);
        Resources resources = object.getResources();
        this.c = typedArray.getDimensionPixelSize(m.m, -1);
        this.i = object.getResources().getDimensionPixelSize(ax.k6.e.W);
        this.j = object.getResources().getDimensionPixelSize(ax.k6.e.Y);
        this.d = typedArray.getDimensionPixelSize(m.w, -1);
        n9 = m.u;
        n8 = ax.k6.e.o;
        this.e = typedArray.getDimension(n9, resources.getDimension(n8));
        n10 = m.z;
        n9 = ax.k6.e.p;
        this.g = typedArray.getDimension(n10, resources.getDimension(n9));
        this.f = typedArray.getDimension(m.l, resources.getDimension(n8));
        this.h = typedArray.getDimension(m.v, resources.getDimension(n9));
        n8 = m.G;
        boolean bl = true;
        this.k = typedArray.getInt(n8, 1);
        this.l = typedArray.getInt(m.j, 0);
        n8 = a9.j0 == -2 ? 255 : a9.j0;
        ax.n6.c$a.f(a8, n8);
        if (a9.l0 != -2) {
            ax.n6.c$a.N(a8, a9.l0);
        } else {
            n8 = m.F;
            if (typedArray.hasValue(n8)) {
                ax.n6.c$a.N(a8, typedArray.getInt(n8, 0));
            } else {
                ax.n6.c$a.N(a8, -1);
            }
        }
        if (a9.k0 != null) {
            ax.n6.c$a.h0(a8, a9.k0);
        } else {
            n8 = m.p;
            if (typedArray.hasValue(n8)) {
                ax.n6.c$a.h0(a8, typedArray.getString(n8));
            }
        }
        ax.n6.c$a.j0(a8, a9.p0);
        object2 = a9.q0 == null ? object.getString(ax.k6.k.j) : a9.q0;
        ax.n6.c$a.l0(a8, (CharSequence)object2);
        n8 = a9.r0 == 0 ? ax.k6.j.a : a9.r0;
        ax.n6.c$a.n0(a8, n8);
        n8 = a9.s0 == 0 ? ax.k6.k.o : a9.s0;
        ax.n6.c$a.p0(a8, n8);
        boolean bl2 = bl;
        if (a9.u0 != null) {
            bl2 = a9.u0 != false ? bl : false;
        }
        ax.n6.c$a.r0(a8, bl2);
        n8 = a9.m0 == -2 ? typedArray.getInt(m.D, -2) : a9.m0;
        ax.n6.c$a.t0(a8, n8);
        n8 = a9.n0 == -2 ? typedArray.getInt(m.E, -2) : a9.n0;
        ax.n6.c$a.e(a8, n8);
        n8 = a9.f0 == null ? typedArray.getResourceId(m.n, ax.k6.l.c) : a9.f0.intValue();
        ax.n6.c$a.i(a8, n8);
        n8 = a9.g0 == null ? typedArray.getResourceId(m.o, 0) : a9.g0.intValue();
        ax.n6.c$a.k(a8, n8);
        n8 = a9.h0 == null ? typedArray.getResourceId(m.x, ax.k6.l.c) : a9.h0.intValue();
        ax.n6.c$a.o(a8, n8);
        n8 = a9.i0 == null ? typedArray.getResourceId(m.y, 0) : a9.i0.intValue();
        ax.n6.c$a.y(a8, n8);
        n8 = a9.c0 == null ? ax.n6.c.G(object, typedArray, m.i) : a9.c0;
        ax.n6.c$a.B(a8, n8);
        n8 = a9.e0 == null ? typedArray.getResourceId(m.q, ax.k6.l.e) : a9.e0.intValue();
        ax.n6.c$a.D(a8, n8);
        if (a9.d0 != null) {
            ax.n6.c$a.F(a8, a9.d0);
        } else {
            n8 = m.r;
            if (typedArray.hasValue(n8)) {
                ax.n6.c$a.F(a8, ax.n6.c.G(object, typedArray, n8));
            } else {
                ax.n6.c$a.F(a8, new e((Context)object, a8.e0).j().getDefaultColor());
            }
        }
        n8 = a9.t0 == null ? typedArray.getInt(m.k, 8388661) : a9.t0.intValue();
        ax.n6.c$a.H(a8, n8);
        n8 = a9.v0 == null ? typedArray.getDimensionPixelSize(m.t, resources.getDimensionPixelSize(ax.k6.e.X)) : a9.v0.intValue();
        ax.n6.c$a.J(a8, n8);
        n8 = a9.w0 == null ? typedArray.getDimensionPixelSize(m.s, resources.getDimensionPixelSize(ax.k6.e.q)) : a9.w0.intValue();
        ax.n6.c$a.M(a8, n8);
        n8 = a9.x0 == null ? typedArray.getDimensionPixelOffset(m.A, 0) : a9.x0.intValue();
        ax.n6.c$a.P(a8, n8);
        n8 = a9.y0 == null ? typedArray.getDimensionPixelOffset(m.H, 0) : a9.y0.intValue();
        ax.n6.c$a.R(a8, n8);
        n8 = a9.z0 == null ? typedArray.getDimensionPixelOffset(m.B, a8.x0.intValue()) : a9.z0.intValue();
        ax.n6.c$a.T(a8, n8);
        n8 = a9.A0 == null ? typedArray.getDimensionPixelOffset(m.I, a8.y0.intValue()) : a9.A0.intValue();
        ax.n6.c$a.V(a8, n8);
        n8 = a9.D0 == null ? typedArray.getDimensionPixelOffset(m.C, 0) : a9.D0.intValue();
        ax.n6.c$a.X(a8, n8);
        n8 = a9.B0 == null ? 0 : a9.B0;
        ax.n6.c$a.Z(a8, n8);
        n8 = a9.C0 == null ? 0 : a9.C0;
        ax.n6.c$a.b0(a8, n8);
        bl2 = a9.E0 == null ? typedArray.getBoolean(m.h, false) : a9.E0.booleanValue();
        ax.n6.c$a.d0(a8, bl2);
        typedArray.recycle();
        if (a9.o0 == null) {
            object = Build.VERSION.SDK_INT >= 24 ? U.a(ax.n6.b.a()) : Locale.getDefault();
            ax.n6.c$a.f0(a8, (Locale)object);
        } else {
            ax.n6.c$a.f0(a8, a9.o0);
        }
        this.a = a9;
    }

    private static int G(Context context, TypedArray typedArray, int n8) {
        return ax.K6.c.a(context, typedArray, n8).getDefaultColor();
    }

    private TypedArray a(Context context, int n8, int n9, int n10) {
        AttributeSet attributeSet;
        block2: {
            if (n8 != 0) {
                attributeSet = ax.C6.f.i(context, n8, "badge");
                n8 = attributeSet.getStyleAttribute();
            } else {
                attributeSet = null;
                n8 = 0;
            }
            if (n8 != 0) break block2;
            n8 = n10;
        }
        return w.i(context, attributeSet, m.g, n9, n8, new int[0]);
    }

    int A() {
        return this.b.A0;
    }

    int B() {
        return this.b.y0;
    }

    boolean C() {
        return this.b.l0 != -1;
    }

    boolean D() {
        return this.b.k0 != null;
    }

    @Deprecated
    boolean E() {
        return this.b.E0;
    }

    boolean F() {
        return this.b.u0;
    }

    void H(int n8) {
        ax.n6.c$a.f(this.a, n8);
        ax.n6.c$a.f(this.b, n8);
    }

    int b() {
        return this.b.B0;
    }

    int c() {
        return this.b.C0;
    }

    int d() {
        return this.b.j0;
    }

    int e() {
        return this.b.c0;
    }

    int f() {
        return this.b.t0;
    }

    int g() {
        return this.b.v0;
    }

    int h() {
        return this.b.g0;
    }

    int i() {
        return this.b.f0;
    }

    int j() {
        return this.b.d0;
    }

    int k() {
        return this.b.w0;
    }

    int l() {
        return this.b.i0;
    }

    int m() {
        return this.b.h0;
    }

    int n() {
        return this.b.s0;
    }

    CharSequence o() {
        return this.b.p0;
    }

    CharSequence p() {
        return this.b.q0;
    }

    int q() {
        return this.b.r0;
    }

    int r() {
        return this.b.z0;
    }

    int s() {
        return this.b.x0;
    }

    int t() {
        return this.b.D0;
    }

    int u() {
        return this.b.m0;
    }

    int v() {
        return this.b.n0;
    }

    int w() {
        return this.b.l0;
    }

    Locale x() {
        return this.b.o0;
    }

    String y() {
        return this.b.k0;
    }

    int z() {
        return this.b.e0;
    }

    public static final class a
    implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

            public a a(Parcel parcel) {
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
        private Integer A0;
        private Integer B0;
        private Integer C0;
        private Integer D0;
        private Boolean E0;
        private Integer F0;
        private Integer c0;
        private Integer d0;
        private Integer e0;
        private Integer f0;
        private Integer g0;
        private Integer h0;
        private Integer i0;
        private int j0 = 255;
        private String k0;
        private int l0 = -2;
        private int m0 = -2;
        private int n0 = -2;
        private Locale o0;
        private CharSequence p0;
        private int q;
        private CharSequence q0;
        private int r0;
        private int s0;
        private Integer t0;
        private Boolean u0 = Boolean.TRUE;
        private Integer v0;
        private Integer w0;
        private Integer x0;
        private Integer y0;
        private Integer z0;

        public a() {
        }

        a(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = (Integer)parcel.readSerializable();
            this.d0 = (Integer)parcel.readSerializable();
            this.e0 = (Integer)parcel.readSerializable();
            this.f0 = (Integer)parcel.readSerializable();
            this.g0 = (Integer)parcel.readSerializable();
            this.h0 = (Integer)parcel.readSerializable();
            this.i0 = (Integer)parcel.readSerializable();
            this.j0 = parcel.readInt();
            this.k0 = parcel.readString();
            this.l0 = parcel.readInt();
            this.m0 = parcel.readInt();
            this.n0 = parcel.readInt();
            this.p0 = parcel.readString();
            this.q0 = parcel.readString();
            this.r0 = parcel.readInt();
            this.t0 = (Integer)parcel.readSerializable();
            this.v0 = (Integer)parcel.readSerializable();
            this.w0 = (Integer)parcel.readSerializable();
            this.x0 = (Integer)parcel.readSerializable();
            this.y0 = (Integer)parcel.readSerializable();
            this.z0 = (Integer)parcel.readSerializable();
            this.A0 = (Integer)parcel.readSerializable();
            this.D0 = (Integer)parcel.readSerializable();
            this.B0 = (Integer)parcel.readSerializable();
            this.C0 = (Integer)parcel.readSerializable();
            this.u0 = (Boolean)parcel.readSerializable();
            this.o0 = (Locale)parcel.readSerializable();
            this.E0 = (Boolean)parcel.readSerializable();
            this.F0 = (Integer)parcel.readSerializable();
        }

        static /* synthetic */ Integer B(a a8, Integer n8) {
            a8.c0 = n8;
            return n8;
        }

        static /* synthetic */ Integer D(a a8, Integer n8) {
            a8.e0 = n8;
            return n8;
        }

        static /* synthetic */ Integer F(a a8, Integer n8) {
            a8.d0 = n8;
            return n8;
        }

        static /* synthetic */ Integer H(a a8, Integer n8) {
            a8.t0 = n8;
            return n8;
        }

        static /* synthetic */ Integer J(a a8, Integer n8) {
            a8.v0 = n8;
            return n8;
        }

        static /* synthetic */ Integer M(a a8, Integer n8) {
            a8.w0 = n8;
            return n8;
        }

        static /* synthetic */ int N(a a8, int n8) {
            a8.l0 = n8;
            return n8;
        }

        static /* synthetic */ Integer P(a a8, Integer n8) {
            a8.x0 = n8;
            return n8;
        }

        static /* synthetic */ Integer R(a a8, Integer n8) {
            a8.y0 = n8;
            return n8;
        }

        static /* synthetic */ Integer T(a a8, Integer n8) {
            a8.z0 = n8;
            return n8;
        }

        static /* synthetic */ Integer V(a a8, Integer n8) {
            a8.A0 = n8;
            return n8;
        }

        static /* synthetic */ Integer X(a a8, Integer n8) {
            a8.D0 = n8;
            return n8;
        }

        static /* synthetic */ Integer Z(a a8, Integer n8) {
            a8.B0 = n8;
            return n8;
        }

        static /* synthetic */ int b(a a8, int n8) {
            a8.q = n8;
            return n8;
        }

        static /* synthetic */ Integer b0(a a8, Integer n8) {
            a8.C0 = n8;
            return n8;
        }

        static /* synthetic */ Boolean d0(a a8, Boolean bl) {
            a8.E0 = bl;
            return bl;
        }

        static /* synthetic */ int e(a a8, int n8) {
            a8.n0 = n8;
            return n8;
        }

        static /* synthetic */ int f(a a8, int n8) {
            a8.j0 = n8;
            return n8;
        }

        static /* synthetic */ Locale f0(a a8, Locale locale) {
            a8.o0 = locale;
            return locale;
        }

        static /* synthetic */ String h0(a a8, String string) {
            a8.k0 = string;
            return string;
        }

        static /* synthetic */ Integer i(a a8, Integer n8) {
            a8.f0 = n8;
            return n8;
        }

        static /* synthetic */ CharSequence j0(a a8, CharSequence charSequence) {
            a8.p0 = charSequence;
            return charSequence;
        }

        static /* synthetic */ Integer k(a a8, Integer n8) {
            a8.g0 = n8;
            return n8;
        }

        static /* synthetic */ CharSequence l0(a a8, CharSequence charSequence) {
            a8.q0 = charSequence;
            return charSequence;
        }

        static /* synthetic */ int n0(a a8, int n8) {
            a8.r0 = n8;
            return n8;
        }

        static /* synthetic */ Integer o(a a8, Integer n8) {
            a8.h0 = n8;
            return n8;
        }

        static /* synthetic */ int p0(a a8, int n8) {
            a8.s0 = n8;
            return n8;
        }

        static /* synthetic */ Boolean r0(a a8, Boolean bl) {
            a8.u0 = bl;
            return bl;
        }

        static /* synthetic */ int t0(a a8, int n8) {
            a8.m0 = n8;
            return n8;
        }

        static /* synthetic */ Integer y(a a8, Integer n8) {
            a8.i0 = n8;
            return n8;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.q);
            parcel.writeSerializable((Serializable)this.c0);
            parcel.writeSerializable((Serializable)this.d0);
            parcel.writeSerializable((Serializable)this.e0);
            parcel.writeSerializable((Serializable)this.f0);
            parcel.writeSerializable((Serializable)this.g0);
            parcel.writeSerializable((Serializable)this.h0);
            parcel.writeSerializable((Serializable)this.i0);
            parcel.writeInt(this.j0);
            parcel.writeString(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
            parcel.writeInt(this.n0);
            CharSequence charSequence = this.p0;
            Object var4_4 = null;
            charSequence = charSequence != null ? charSequence.toString() : null;
            parcel.writeString((String)charSequence);
            CharSequence charSequence2 = this.q0;
            charSequence = var4_4;
            if (charSequence2 != null) {
                charSequence = charSequence2.toString();
            }
            parcel.writeString((String)charSequence);
            parcel.writeInt(this.r0);
            parcel.writeSerializable((Serializable)this.t0);
            parcel.writeSerializable((Serializable)this.v0);
            parcel.writeSerializable((Serializable)this.w0);
            parcel.writeSerializable((Serializable)this.x0);
            parcel.writeSerializable((Serializable)this.y0);
            parcel.writeSerializable((Serializable)this.z0);
            parcel.writeSerializable((Serializable)this.A0);
            parcel.writeSerializable((Serializable)this.D0);
            parcel.writeSerializable((Serializable)this.B0);
            parcel.writeSerializable((Serializable)this.C0);
            parcel.writeSerializable((Serializable)this.u0);
            parcel.writeSerializable((Serializable)this.o0);
            parcel.writeSerializable((Serializable)this.E0);
            parcel.writeSerializable((Serializable)this.F0);
        }
    }
}

