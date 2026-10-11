package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import ax.K.j;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {
    private static final int[] f = {0, 4, 8};
    private static SparseIntArray g = new SparseIntArray();
    private static SparseIntArray h = new SparseIntArray();
    public String a = HttpUrl.FRAGMENT_ENCODE_SET;
    public int b = 0;
    private HashMap<String, androidx.constraintlayout.widget.b> c = new HashMap<>();
    private boolean d = true;
    private HashMap<Integer, a> e = new HashMap<>();

    public static class a {
        int a;
        String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final C0013e f = new C0013e();
        public HashMap<String, androidx.constraintlayout.widget.b> g = new HashMap<>();
        C0012a h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C0012a {
            int[] a = new int[10];
            int[] b = new int[10];
            int c = 0;
            int[] d = new int[10];
            float[] e = new float[10];
            int f = 0;
            int[] g = new int[5];
            String[] h = new String[5];
            int i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];
            int l = 0;

            C0012a() {
            }

            void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i, f.a aVar) {
            f(i, aVar);
            this.c.d = aVar.x0;
            C0013e c0013e = this.f;
            c0013e.b = aVar.A0;
            c0013e.c = aVar.B0;
            c0013e.d = aVar.C0;
            c0013e.e = aVar.D0;
            c0013e.f = aVar.E0;
            c0013e.g = aVar.F0;
            c0013e.h = aVar.G0;
            c0013e.j = aVar.H0;
            c0013e.k = aVar.I0;
            c0013e.l = aVar.J0;
            c0013e.n = aVar.z0;
            c0013e.m = aVar.y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.c cVar, int i, f.a aVar) {
            g(i, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.e;
                bVar.j0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.h0 = aVar2.getType();
                this.e.k0 = aVar2.getReferencedIds();
                this.e.i0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(ax.L.c.j6, 24);
            r0.append(ax.L.c.k6, 25);
            r0.append(ax.L.c.m6, 28);
            r0.append(ax.L.c.n6, 29);
            r0.append(ax.L.c.s6, 35);
            r0.append(ax.L.c.r6, 34);
            r0.append(ax.L.c.T5, 4);
            r0.append(ax.L.c.S5, 3);
            r0.append(ax.L.c.Q5, 1);
            r0.append(ax.L.c.y6, 6);
            r0.append(ax.L.c.z6, 7);
            r0.append(ax.L.c.a6, 17);
            r0.append(ax.L.c.b6, 18);
            r0.append(ax.L.c.c6, 19);
            r0.append(ax.L.c.M5, 90);
            r0.append(ax.L.c.y5, 26);
            r0.append(ax.L.c.o6, 31);
            r0.append(ax.L.c.p6, 32);
            r0.append(ax.L.c.Z5, 10);
            r0.append(ax.L.c.Y5, 9);
            r0.append(ax.L.c.C6, 13);
            r0.append(ax.L.c.F6, 16);
            r0.append(ax.L.c.D6, 14);
            r0.append(ax.L.c.A6, 11);
            r0.append(ax.L.c.E6, 15);
            r0.append(ax.L.c.B6, 12);
            r0.append(ax.L.c.v6, 38);
            r0.append(ax.L.c.h6, 37);
            r0.append(ax.L.c.g6, 39);
            r0.append(ax.L.c.u6, 40);
            r0.append(ax.L.c.f6, 20);
            r0.append(ax.L.c.t6, 36);
            r0.append(ax.L.c.X5, 5);
            r0.append(ax.L.c.i6, 91);
            r0.append(ax.L.c.q6, 91);
            r0.append(ax.L.c.l6, 91);
            r0.append(ax.L.c.R5, 91);
            r0.append(ax.L.c.P5, 91);
            r0.append(ax.L.c.B5, 23);
            r0.append(ax.L.c.D5, 27);
            r0.append(ax.L.c.F5, 30);
            r0.append(ax.L.c.G5, 8);
            r0.append(ax.L.c.C5, 33);
            r0.append(ax.L.c.E5, 2);
            r0.append(ax.L.c.z5, 22);
            r0.append(ax.L.c.A5, 21);
            r0.append(ax.L.c.w6, 41);
            r0.append(ax.L.c.d6, 42);
            r0.append(ax.L.c.O5, 41);
            r0.append(ax.L.c.N5, 42);
            r0.append(ax.L.c.G6, 76);
            r0.append(ax.L.c.U5, 61);
            r0.append(ax.L.c.W5, 62);
            r0.append(ax.L.c.V5, 63);
            r0.append(ax.L.c.x6, 69);
            r0.append(ax.L.c.e6, 70);
            r0.append(ax.L.c.K5, 71);
            r0.append(ax.L.c.I5, 72);
            r0.append(ax.L.c.J5, 73);
            r0.append(ax.L.c.L5, 74);
            r0.append(ax.L.c.H5, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.x5);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.r = e.n(obtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = e.n(obtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = e.n(obtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = e.n(obtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = e.n(obtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = e.n(obtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = e.n(obtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = e.n(obtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = e.n(obtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = e.n(obtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = e.n(obtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = e.n(obtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = e.n(obtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.o(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.o(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = e.n(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case 73:
                                        this.i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = obtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = obtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.s = e.n(obtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = e.n(obtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = obtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        private static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(ax.L.c.S6, 1);
            o.append(ax.L.c.U6, 2);
            o.append(ax.L.c.Y6, 3);
            o.append(ax.L.c.R6, 4);
            o.append(ax.L.c.Q6, 5);
            o.append(ax.L.c.P6, 6);
            o.append(ax.L.c.T6, 7);
            o.append(ax.L.c.X6, 8);
            o.append(ax.L.c.W6, 9);
            o.append(ax.L.c.V6, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.O6);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = ax.F.b.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = e.n(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.l7);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.n7) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == ax.L.c.m7) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = e.f[this.b];
                } else if (index == ax.L.c.p7) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == ax.L.c.o7) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0013e {
        private static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(ax.L.c.K7, 1);
            o.append(ax.L.c.L7, 2);
            o.append(ax.L.c.M7, 3);
            o.append(ax.L.c.I7, 4);
            o.append(ax.L.c.J7, 5);
            o.append(ax.L.c.E7, 6);
            o.append(ax.L.c.F7, 7);
            o.append(ax.L.c.G7, 8);
            o.append(ax.L.c.H7, 9);
            o.append(ax.L.c.N7, 10);
            o.append(ax.L.c.O7, 11);
            o.append(ax.L.c.P7, 12);
        }

        public void a(C0013e c0013e) {
            this.a = c0013e.a;
            this.b = c0013e.b;
            this.c = c0013e.c;
            this.d = c0013e.d;
            this.e = c0013e.e;
            this.f = c0013e.f;
            this.g = c0013e.g;
            this.h = c0013e.h;
            this.i = c0013e.i;
            this.j = c0013e.j;
            this.k = c0013e.k;
            this.l = c0013e.l;
            this.m = c0013e.m;
            this.n = c0013e.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.D7);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = e.n(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        g.append(ax.L.c.A0, 25);
        g.append(ax.L.c.B0, 26);
        g.append(ax.L.c.D0, 29);
        g.append(ax.L.c.E0, 30);
        g.append(ax.L.c.K0, 36);
        g.append(ax.L.c.J0, 35);
        g.append(ax.L.c.h0, 4);
        g.append(ax.L.c.g0, 3);
        g.append(ax.L.c.c0, 1);
        g.append(ax.L.c.e0, 91);
        g.append(ax.L.c.d0, 92);
        g.append(ax.L.c.T0, 6);
        g.append(ax.L.c.U0, 7);
        g.append(ax.L.c.o0, 17);
        g.append(ax.L.c.p0, 18);
        g.append(ax.L.c.q0, 19);
        g.append(ax.L.c.Y, 99);
        g.append(ax.L.c.u, 27);
        g.append(ax.L.c.F0, 32);
        g.append(ax.L.c.G0, 33);
        g.append(ax.L.c.n0, 10);
        g.append(ax.L.c.m0, 9);
        g.append(ax.L.c.X0, 13);
        g.append(ax.L.c.a1, 16);
        g.append(ax.L.c.Y0, 14);
        g.append(ax.L.c.V0, 11);
        g.append(ax.L.c.Z0, 15);
        g.append(ax.L.c.W0, 12);
        g.append(ax.L.c.N0, 40);
        g.append(ax.L.c.y0, 39);
        g.append(ax.L.c.x0, 41);
        g.append(ax.L.c.M0, 42);
        g.append(ax.L.c.w0, 20);
        g.append(ax.L.c.L0, 37);
        g.append(ax.L.c.l0, 5);
        g.append(ax.L.c.z0, 87);
        g.append(ax.L.c.I0, 87);
        g.append(ax.L.c.C0, 87);
        g.append(ax.L.c.f0, 87);
        g.append(ax.L.c.b0, 87);
        g.append(ax.L.c.z, 24);
        g.append(ax.L.c.B, 28);
        g.append(ax.L.c.N, 31);
        g.append(ax.L.c.O, 8);
        g.append(ax.L.c.A, 34);
        g.append(ax.L.c.C, 2);
        g.append(ax.L.c.x, 23);
        g.append(ax.L.c.y, 21);
        g.append(ax.L.c.O0, 95);
        g.append(ax.L.c.r0, 96);
        g.append(ax.L.c.w, 22);
        g.append(ax.L.c.D, 43);
        g.append(ax.L.c.Q, 44);
        g.append(ax.L.c.L, 45);
        g.append(ax.L.c.M, 46);
        g.append(ax.L.c.K, 60);
        g.append(ax.L.c.I, 47);
        g.append(ax.L.c.J, 48);
        g.append(ax.L.c.E, 49);
        g.append(ax.L.c.F, 50);
        g.append(ax.L.c.G, 51);
        g.append(ax.L.c.H, 52);
        g.append(ax.L.c.P, 53);
        g.append(ax.L.c.P0, 54);
        g.append(ax.L.c.s0, 55);
        g.append(ax.L.c.Q0, 56);
        g.append(ax.L.c.t0, 57);
        g.append(ax.L.c.R0, 58);
        g.append(ax.L.c.u0, 59);
        g.append(ax.L.c.i0, 61);
        g.append(ax.L.c.k0, 62);
        g.append(ax.L.c.j0, 63);
        g.append(ax.L.c.R, 64);
        g.append(ax.L.c.k1, 65);
        g.append(ax.L.c.X, 66);
        g.append(ax.L.c.l1, 67);
        g.append(ax.L.c.d1, 79);
        g.append(ax.L.c.v, 38);
        g.append(ax.L.c.c1, 68);
        g.append(ax.L.c.S0, 69);
        g.append(ax.L.c.v0, 70);
        g.append(ax.L.c.b1, 97);
        g.append(ax.L.c.V, 71);
        g.append(ax.L.c.T, 72);
        g.append(ax.L.c.U, 73);
        g.append(ax.L.c.W, 74);
        g.append(ax.L.c.S, 75);
        g.append(ax.L.c.e1, 76);
        g.append(ax.L.c.H0, 77);
        g.append(ax.L.c.m1, 78);
        g.append(ax.L.c.a0, 80);
        g.append(ax.L.c.Z, 81);
        g.append(ax.L.c.f1, 82);
        g.append(ax.L.c.j1, 83);
        g.append(ax.L.c.i1, 84);
        g.append(ax.L.c.h1, 85);
        g.append(ax.L.c.g1, 86);
        SparseIntArray sparseIntArray = h;
        int i = ax.L.c.q4;
        sparseIntArray.append(i, 6);
        h.append(i, 7);
        h.append(ax.L.c.l3, 27);
        h.append(ax.L.c.t4, 13);
        h.append(ax.L.c.w4, 16);
        h.append(ax.L.c.u4, 14);
        h.append(ax.L.c.r4, 11);
        h.append(ax.L.c.v4, 15);
        h.append(ax.L.c.s4, 12);
        h.append(ax.L.c.k4, 40);
        h.append(ax.L.c.d4, 39);
        h.append(ax.L.c.c4, 41);
        h.append(ax.L.c.j4, 42);
        h.append(ax.L.c.b4, 20);
        h.append(ax.L.c.i4, 37);
        h.append(ax.L.c.V3, 5);
        h.append(ax.L.c.e4, 87);
        h.append(ax.L.c.h4, 87);
        h.append(ax.L.c.f4, 87);
        h.append(ax.L.c.S3, 87);
        h.append(ax.L.c.R3, 87);
        h.append(ax.L.c.q3, 24);
        h.append(ax.L.c.s3, 28);
        h.append(ax.L.c.E3, 31);
        h.append(ax.L.c.F3, 8);
        h.append(ax.L.c.r3, 34);
        h.append(ax.L.c.t3, 2);
        h.append(ax.L.c.o3, 23);
        h.append(ax.L.c.p3, 21);
        h.append(ax.L.c.l4, 95);
        h.append(ax.L.c.W3, 96);
        h.append(ax.L.c.n3, 22);
        h.append(ax.L.c.u3, 43);
        h.append(ax.L.c.H3, 44);
        h.append(ax.L.c.C3, 45);
        h.append(ax.L.c.D3, 46);
        h.append(ax.L.c.B3, 60);
        h.append(ax.L.c.z3, 47);
        h.append(ax.L.c.A3, 48);
        h.append(ax.L.c.v3, 49);
        h.append(ax.L.c.w3, 50);
        h.append(ax.L.c.x3, 51);
        h.append(ax.L.c.y3, 52);
        h.append(ax.L.c.G3, 53);
        h.append(ax.L.c.m4, 54);
        h.append(ax.L.c.X3, 55);
        h.append(ax.L.c.n4, 56);
        h.append(ax.L.c.Y3, 57);
        h.append(ax.L.c.o4, 58);
        h.append(ax.L.c.Z3, 59);
        h.append(ax.L.c.U3, 62);
        h.append(ax.L.c.T3, 63);
        h.append(ax.L.c.I3, 64);
        h.append(ax.L.c.H4, 65);
        h.append(ax.L.c.O3, 66);
        h.append(ax.L.c.I4, 67);
        h.append(ax.L.c.z4, 79);
        h.append(ax.L.c.m3, 38);
        h.append(ax.L.c.A4, 98);
        h.append(ax.L.c.y4, 68);
        h.append(ax.L.c.p4, 69);
        h.append(ax.L.c.a4, 70);
        h.append(ax.L.c.M3, 71);
        h.append(ax.L.c.K3, 72);
        h.append(ax.L.c.L3, 73);
        h.append(ax.L.c.N3, 74);
        h.append(ax.L.c.J3, 75);
        h.append(ax.L.c.B4, 76);
        h.append(ax.L.c.g4, 77);
        h.append(ax.L.c.J4, 78);
        h.append(ax.L.c.Q3, 80);
        h.append(ax.L.c.P3, 81);
        h.append(ax.L.c.C4, 82);
        h.append(ax.L.c.G4, 83);
        h.append(ax.L.c.F4, 84);
        h.append(ax.L.c.E4, 85);
        h.append(ax.L.c.D4, 86);
        h.append(ax.L.c.x4, 97);
    }

    private int[] i(View view, String str) {
        int i;
        Object k;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = ax.L.b.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (k = ((ConstraintLayout) view.getParent()).k(0, trim)) != null && (k instanceof Integer)) {
                i = ((Integer) k).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? ax.L.c.k3 : ax.L.c.t);
        r(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            this.e.put(Integer.valueOf(i), new a());
        }
        return this.e.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r4 == (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void o(java.lang.Object r3, android.content.res.TypedArray r4, int r5, int r6) {
        /*
            if (r3 != 0) goto L4
            goto L6f
        L4:
            android.util.TypedValue r0 = r4.peekValue(r5)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L29
            int r4 = r4.getInt(r5, r2)
            r5 = -4
            r0 = -2
            if (r4 == r5) goto L25
            r5 = -3
            if (r4 == r5) goto L21
            if (r4 == r0) goto L23
            r5 = -1
            if (r4 == r5) goto L23
        L21:
            r4 = 0
            goto L2e
        L23:
            r2 = r4
            goto L21
        L25:
            r2 = 1
            r4 = 1
            r2 = -2
            goto L2e
        L29:
            int r4 = r4.getDimensionPixelSize(r5, r2)
            goto L23
        L2e:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r5 == 0) goto L40
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            if (r6 != 0) goto L3b
            r3.width = r2
            r3.a0 = r4
            return
        L3b:
            r3.height = r2
            r3.b0 = r4
            return
        L40:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.e.b
            if (r5 == 0) goto L52
            androidx.constraintlayout.widget.e$b r3 = (androidx.constraintlayout.widget.e.b) r3
            if (r6 != 0) goto L4d
            r3.d = r2
            r3.n0 = r4
            return
        L4d:
            r3.e = r2
            r3.o0 = r4
            return
        L52:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.e.a.C0012a
            if (r5 == 0) goto L6f
            androidx.constraintlayout.widget.e$a$a r3 = (androidx.constraintlayout.widget.e.a.C0012a) r3
            if (r6 != 0) goto L65
            r5 = 23
            r3.b(r5, r2)
            r5 = 80
            r3.d(r5, r4)
            return
        L65:
            r5 = 21
            r3.b(r5, r2)
            r5 = 81
            r3.d(r5, r4)
        L6f:
            return
        L70:
            java.lang.String r4 = r4.getString(r5)
            p(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.o(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void p(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    q(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0012a) {
                        ((a.C0012a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i == 0) {
                            bVar3.d = 0;
                            bVar3.W = parseFloat;
                            return;
                        } else {
                            bVar3.e = 0;
                            bVar3.V = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof a.C0012a) {
                        a.C0012a c0012a = (a.C0012a) obj;
                        if (i == 0) {
                            c0012a.b(23, 0);
                            c0012a.a(39, parseFloat);
                            return;
                        } else {
                            c0012a.b(21, 0);
                            c0012a.a(40, parseFloat);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i == 0) {
                            bVar5.d = 0;
                            bVar5.f0 = max;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.e = 0;
                            bVar5.g0 = max;
                            bVar5.a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0012a) {
                        a.C0012a c0012a2 = (a.C0012a) obj;
                        if (i == 0) {
                            c0012a2.b(23, 0);
                            c0012a2.b(54, 2);
                        } else {
                            c0012a2.b(21, 0);
                            c0012a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void q(ConstraintLayout.b bVar, String str) {
        float f2 = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i2);
                    if (substring2.length() > 0) {
                        f2 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f2 = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f2;
        bVar.K = i;
    }

    private void r(Context context, a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            s(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != ax.L.c.v && ax.L.c.N != index && ax.L.c.O != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (g.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = n(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = n(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = n(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.x = n(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.w = n(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = f[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.j = n(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.k = n(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.l = n(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = n(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = n(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = n(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.o = n(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = n(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    C0013e c0013e = aVar.f;
                    c0013e.m = true;
                    c0013e.n = typedArray.getDimension(index, c0013e.n);
                    break;
                case 45:
                    C0013e c0013e2 = aVar.f;
                    c0013e2.c = typedArray.getFloat(index, c0013e2.c);
                    break;
                case 46:
                    C0013e c0013e3 = aVar.f;
                    c0013e3.d = typedArray.getFloat(index, c0013e3.d);
                    break;
                case 47:
                    C0013e c0013e4 = aVar.f;
                    c0013e4.e = typedArray.getFloat(index, c0013e4.e);
                    break;
                case 48:
                    C0013e c0013e5 = aVar.f;
                    c0013e5.f = typedArray.getFloat(index, c0013e5.f);
                    break;
                case 49:
                    C0013e c0013e6 = aVar.f;
                    c0013e6.g = typedArray.getDimension(index, c0013e6.g);
                    break;
                case 50:
                    C0013e c0013e7 = aVar.f;
                    c0013e7.h = typedArray.getDimension(index, c0013e7.h);
                    break;
                case 51:
                    C0013e c0013e8 = aVar.f;
                    c0013e8.j = typedArray.getDimension(index, c0013e8.j);
                    break;
                case 52:
                    C0013e c0013e9 = aVar.f;
                    c0013e9.k = typedArray.getDimension(index, c0013e9.k);
                    break;
                case 53:
                    C0013e c0013e10 = aVar.f;
                    c0013e10.l = typedArray.getDimension(index, c0013e10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    C0013e c0013e11 = aVar.f;
                    c0013e11.b = typedArray.getFloat(index, c0013e11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.B = n(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = n(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = ax.F.b.c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    C0013e c0013e12 = aVar.f;
                    c0013e12.i = n(typedArray, index, c0013e12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = n(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = n(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    o(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    o(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    private static void s(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0012a c0012a = new a.C0012a();
        aVar.h = c0012a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (h.get(index)) {
                case 2:
                    c0012a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 5:
                    c0012a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0012a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    c0012a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    c0012a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 11:
                    c0012a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    c0012a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    c0012a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    c0012a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    c0012a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    c0012a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    c0012a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0012a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0012a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0012a.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    c0012a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0012a.b(22, f[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0012a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0012a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    c0012a.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    c0012a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    c0012a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    c0012a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    c0012a.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0012a.b(38, resourceId);
                    break;
                case 39:
                    c0012a.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    c0012a.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    c0012a.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    c0012a.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    c0012a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0012a.d(44, true);
                    c0012a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0012a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0012a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0012a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0012a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0012a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0012a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0012a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0012a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    c0012a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0012a.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    c0012a.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    c0012a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    c0012a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    c0012a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    c0012a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case 60:
                    c0012a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0012a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    c0012a.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    c0012a.b(64, n(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0012a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0012a.c(65, ax.F.b.c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0012a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0012a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0012a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0012a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0012a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0012a.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case 73:
                    c0012a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    c0012a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0012a.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case 76:
                    c0012a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0012a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0012a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0012a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0012a.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    c0012a.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    c0012a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0012a.b(83, n(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0012a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0012a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0012a.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0012a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0012a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0012a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0012a.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            c0012a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0012a.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 93:
                    c0012a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    c0012a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    o(c0012a, typedArray, index, 0);
                    break;
                case 96:
                    o(c0012a, typedArray, index, 1);
                    break;
                case 97:
                    c0012a.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (j.u0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    c0012a.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ax.K.a.b(childAt));
            } else {
                if (this.d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.e.j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.e.h0);
                                aVar2.setMargin(aVar.e.i0);
                                aVar2.setAllowsGoneWidget(aVar.e.p0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = i(aVar2, str);
                                        aVar2.setReferencedIds(aVar.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z) {
                                androidx.constraintlayout.widget.b.e(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            C0013e c0013e = aVar.f;
                            if (c0013e.i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f.i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0013e.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            C0013e c0013e2 = aVar.f;
                            if (c0013e2.m) {
                                childAt.setElevation(c0013e2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.e.get(num);
            if (aVar3 != null) {
                if (aVar3.e.j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = i(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.e.k0);
                        }
                    }
                    aVar4.setType(aVar3.e.h0);
                    aVar4.setMargin(aVar3.e.i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.e.a) {
                    View gVar = new g(constraintLayout.getContext());
                    gVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(gVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(Integer.valueOf(id))) {
                this.e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.b.a(this.c, childAt);
                aVar.f(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0013e c0013e = aVar.f;
                    c0013e.g = pivotX;
                    c0013e.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                C0013e c0013e2 = aVar.f;
                if (c0013e2.m) {
                    c0013e2.n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.e.p0 = aVar2.getAllowsGoneWidget();
                    aVar.e.k0 = aVar2.getReferencedIds();
                    aVar.e.h0 = aVar2.getType();
                    aVar.e.i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = fVar.getChildAt(i);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(Integer.valueOf(id))) {
                this.e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.e.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    aVar2.h((androidx.constraintlayout.widget.c) childAt, id, aVar);
                }
                aVar2.g(id, aVar);
            }
        }
    }

    public void h(int i, int i2, int i3, float f2) {
        b bVar = k(i).e;
        bVar.B = i2;
        bVar.C = i3;
        bVar.D = f2;
    }

    public void l(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a j = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        j.e.a = true;
                    }
                    this.e.put(Integer.valueOf(j.a), j);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
