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
import ax.k6.C2404e;
import ax.k6.C2409j;
import ax.k6.C2410k;
import ax.k6.l;
import ax.k6.m;
import java.util.Locale;

/* loaded from: classes3.dex */
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

    c(Context context, int i, int i2, int i3, a aVar) {
        Locale locale;
        Locale.Category category;
        a aVar2 = new a();
        this.b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i != 0) {
            aVar.q = i;
        }
        TypedArray a2 = a(context, aVar.q, i2, i3);
        Resources resources = context.getResources();
        this.c = a2.getDimensionPixelSize(m.m, -1);
        this.i = context.getResources().getDimensionPixelSize(C2404e.W);
        this.j = context.getResources().getDimensionPixelSize(C2404e.Y);
        this.d = a2.getDimensionPixelSize(m.w, -1);
        int i4 = m.u;
        int i5 = C2404e.o;
        this.e = a2.getDimension(i4, resources.getDimension(i5));
        int i6 = m.z;
        int i7 = C2404e.p;
        this.g = a2.getDimension(i6, resources.getDimension(i7));
        this.f = a2.getDimension(m.l, resources.getDimension(i5));
        this.h = a2.getDimension(m.v, resources.getDimension(i7));
        boolean z = true;
        this.k = a2.getInt(m.G, 1);
        this.l = a2.getInt(m.j, 0);
        aVar2.j0 = aVar.j0 == -2 ? 255 : aVar.j0;
        if (aVar.l0 != -2) {
            aVar2.l0 = aVar.l0;
        } else {
            int i8 = m.F;
            if (a2.hasValue(i8)) {
                aVar2.l0 = a2.getInt(i8, 0);
            } else {
                aVar2.l0 = -1;
            }
        }
        if (aVar.k0 != null) {
            aVar2.k0 = aVar.k0;
        } else {
            int i9 = m.p;
            if (a2.hasValue(i9)) {
                aVar2.k0 = a2.getString(i9);
            }
        }
        aVar2.p0 = aVar.p0;
        aVar2.q0 = aVar.q0 == null ? context.getString(C2410k.j) : aVar.q0;
        aVar2.r0 = aVar.r0 == 0 ? C2409j.a : aVar.r0;
        aVar2.s0 = aVar.s0 == 0 ? C2410k.o : aVar.s0;
        if (aVar.u0 != null && !aVar.u0.booleanValue()) {
            z = false;
        }
        aVar2.u0 = Boolean.valueOf(z);
        aVar2.m0 = aVar.m0 == -2 ? a2.getInt(m.D, -2) : aVar.m0;
        aVar2.n0 = aVar.n0 == -2 ? a2.getInt(m.E, -2) : aVar.n0;
        aVar2.f0 = Integer.valueOf(aVar.f0 == null ? a2.getResourceId(m.n, l.c) : aVar.f0.intValue());
        aVar2.g0 = Integer.valueOf(aVar.g0 == null ? a2.getResourceId(m.o, 0) : aVar.g0.intValue());
        aVar2.h0 = Integer.valueOf(aVar.h0 == null ? a2.getResourceId(m.x, l.c) : aVar.h0.intValue());
        aVar2.i0 = Integer.valueOf(aVar.i0 == null ? a2.getResourceId(m.y, 0) : aVar.i0.intValue());
        aVar2.c0 = Integer.valueOf(aVar.c0 == null ? G(context, a2, m.i) : aVar.c0.intValue());
        aVar2.e0 = Integer.valueOf(aVar.e0 == null ? a2.getResourceId(m.q, l.e) : aVar.e0.intValue());
        if (aVar.d0 != null) {
            aVar2.d0 = aVar.d0;
        } else {
            int i10 = m.r;
            if (a2.hasValue(i10)) {
                aVar2.d0 = Integer.valueOf(G(context, a2, i10));
            } else {
                aVar2.d0 = Integer.valueOf(new e(context, aVar2.e0.intValue()).j().getDefaultColor());
            }
        }
        aVar2.t0 = Integer.valueOf(aVar.t0 == null ? a2.getInt(m.k, 8388661) : aVar.t0.intValue());
        aVar2.v0 = Integer.valueOf(aVar.v0 == null ? a2.getDimensionPixelSize(m.t, resources.getDimensionPixelSize(C2404e.X)) : aVar.v0.intValue());
        aVar2.w0 = Integer.valueOf(aVar.w0 == null ? a2.getDimensionPixelSize(m.s, resources.getDimensionPixelSize(C2404e.q)) : aVar.w0.intValue());
        aVar2.x0 = Integer.valueOf(aVar.x0 == null ? a2.getDimensionPixelOffset(m.A, 0) : aVar.x0.intValue());
        aVar2.y0 = Integer.valueOf(aVar.y0 == null ? a2.getDimensionPixelOffset(m.H, 0) : aVar.y0.intValue());
        aVar2.z0 = Integer.valueOf(aVar.z0 == null ? a2.getDimensionPixelOffset(m.B, aVar2.x0.intValue()) : aVar.z0.intValue());
        aVar2.A0 = Integer.valueOf(aVar.A0 == null ? a2.getDimensionPixelOffset(m.I, aVar2.y0.intValue()) : aVar.A0.intValue());
        aVar2.D0 = Integer.valueOf(aVar.D0 == null ? a2.getDimensionPixelOffset(m.C, 0) : aVar.D0.intValue());
        aVar2.B0 = Integer.valueOf(aVar.B0 == null ? 0 : aVar.B0.intValue());
        aVar2.C0 = Integer.valueOf(aVar.C0 == null ? 0 : aVar.C0.intValue());
        aVar2.E0 = Boolean.valueOf(aVar.E0 == null ? a2.getBoolean(m.h, false) : aVar.E0.booleanValue());
        a2.recycle();
        if (aVar.o0 == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            aVar2.o0 = locale;
        } else {
            aVar2.o0 = aVar.o0;
        }
        this.a = aVar;
    }

    private static int G(Context context, TypedArray typedArray, int i) {
        return ax.K6.c.a(context, typedArray, i).getDefaultColor();
    }

    private TypedArray a(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        if (i != 0) {
            attributeSet = f.i(context, i, "badge");
            i4 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i4 = 0;
        }
        return w.i(context, attributeSet, m.g, i2, i4 == 0 ? i3 : i4, new int[0]);
    }

    int A() {
        return this.b.A0.intValue();
    }

    int B() {
        return this.b.y0.intValue();
    }

    boolean C() {
        return this.b.l0 != -1;
    }

    boolean D() {
        return this.b.k0 != null;
    }

    @Deprecated
    boolean E() {
        return this.b.E0.booleanValue();
    }

    boolean F() {
        return this.b.u0.booleanValue();
    }

    void H(int i) {
        this.a.j0 = i;
        this.b.j0 = i;
    }

    int b() {
        return this.b.B0.intValue();
    }

    int c() {
        return this.b.C0.intValue();
    }

    int d() {
        return this.b.j0;
    }

    int e() {
        return this.b.c0.intValue();
    }

    int f() {
        return this.b.t0.intValue();
    }

    int g() {
        return this.b.v0.intValue();
    }

    int h() {
        return this.b.g0.intValue();
    }

    int i() {
        return this.b.f0.intValue();
    }

    int j() {
        return this.b.d0.intValue();
    }

    int k() {
        return this.b.w0.intValue();
    }

    int l() {
        return this.b.i0.intValue();
    }

    int m() {
        return this.b.h0.intValue();
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
        return this.b.z0.intValue();
    }

    int s() {
        return this.b.x0.intValue();
    }

    int t() {
        return this.b.D0.intValue();
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
        return this.b.e0.intValue();
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0385a();
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
        private int j0;
        private String k0;
        private int l0;
        private int m0;
        private int n0;
        private Locale o0;
        private CharSequence p0;
        private int q;
        private CharSequence q0;
        private int r0;
        private int s0;
        private Integer t0;
        private Boolean u0;
        private Integer v0;
        private Integer w0;
        private Integer x0;
        private Integer y0;
        private Integer z0;

        /* renamed from: ax.n6.c$a$a, reason: collision with other inner class name */
        class C0385a implements Parcelable.Creator<a> {
            C0385a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            this.j0 = 255;
            this.l0 = -2;
            this.m0 = -2;
            this.n0 = -2;
            this.u0 = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.q);
            parcel.writeSerializable(this.c0);
            parcel.writeSerializable(this.d0);
            parcel.writeSerializable(this.e0);
            parcel.writeSerializable(this.f0);
            parcel.writeSerializable(this.g0);
            parcel.writeSerializable(this.h0);
            parcel.writeSerializable(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeString(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
            parcel.writeInt(this.n0);
            CharSequence charSequence = this.p0;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.q0;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.r0);
            parcel.writeSerializable(this.t0);
            parcel.writeSerializable(this.v0);
            parcel.writeSerializable(this.w0);
            parcel.writeSerializable(this.x0);
            parcel.writeSerializable(this.y0);
            parcel.writeSerializable(this.z0);
            parcel.writeSerializable(this.A0);
            parcel.writeSerializable(this.D0);
            parcel.writeSerializable(this.B0);
            parcel.writeSerializable(this.C0);
            parcel.writeSerializable(this.u0);
            parcel.writeSerializable(this.o0);
            parcel.writeSerializable(this.E0);
            parcel.writeSerializable(this.F0);
        }

        a(Parcel parcel) {
            this.j0 = 255;
            this.l0 = -2;
            this.m0 = -2;
            this.n0 = -2;
            this.u0 = Boolean.TRUE;
            this.q = parcel.readInt();
            this.c0 = (Integer) parcel.readSerializable();
            this.d0 = (Integer) parcel.readSerializable();
            this.e0 = (Integer) parcel.readSerializable();
            this.f0 = (Integer) parcel.readSerializable();
            this.g0 = (Integer) parcel.readSerializable();
            this.h0 = (Integer) parcel.readSerializable();
            this.i0 = (Integer) parcel.readSerializable();
            this.j0 = parcel.readInt();
            this.k0 = parcel.readString();
            this.l0 = parcel.readInt();
            this.m0 = parcel.readInt();
            this.n0 = parcel.readInt();
            this.p0 = parcel.readString();
            this.q0 = parcel.readString();
            this.r0 = parcel.readInt();
            this.t0 = (Integer) parcel.readSerializable();
            this.v0 = (Integer) parcel.readSerializable();
            this.w0 = (Integer) parcel.readSerializable();
            this.x0 = (Integer) parcel.readSerializable();
            this.y0 = (Integer) parcel.readSerializable();
            this.z0 = (Integer) parcel.readSerializable();
            this.A0 = (Integer) parcel.readSerializable();
            this.D0 = (Integer) parcel.readSerializable();
            this.B0 = (Integer) parcel.readSerializable();
            this.C0 = (Integer) parcel.readSerializable();
            this.u0 = (Boolean) parcel.readSerializable();
            this.o0 = (Locale) parcel.readSerializable();
            this.E0 = (Boolean) parcel.readSerializable();
            this.F0 = (Integer) parcel.readSerializable();
        }
    }
}
