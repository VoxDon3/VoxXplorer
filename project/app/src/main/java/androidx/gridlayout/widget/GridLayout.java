/*
 * Decompiled with CFR 0.152.
 */
package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import ax.C0.a;
import ax.C0.b;
import ax.c0.d0;
import ax.c0.i0;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GridLayout
extends ViewGroup {
    public static final i A;
    public static final i B;
    public static final i C;
    static final Printer i;
    static final Printer j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    static final i r;
    private static final i s;
    private static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final i z;
    final l a = new l(this, true);
    final l b = new l(this, false);
    int c = 0;
    boolean d = false;
    int e = 1;
    int f;
    int g = 0;
    Printer h = i;

    static {
        i i8;
        i i9;
        i = new LogPrinter(3, GridLayout.class.getName());
        j = new Printer(){

            public void println(String string) {
            }
        };
        k = ax.C0.b.l;
        l = ax.C0.b.m;
        m = ax.C0.b.j;
        n = ax.C0.b.o;
        o = ax.C0.b.i;
        p = ax.C0.b.n;
        q = ax.C0.b.k;
        r = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                return Integer.MIN_VALUE;
            }

            @Override
            String c() {
                return "UNDEFINED";
            }

            @Override
            int d(View view, int n8) {
                return Integer.MIN_VALUE;
            }
        };
        s = i9 = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                return 0;
            }

            @Override
            String c() {
                return "LEADING";
            }

            @Override
            int d(View view, int n8) {
                return 0;
            }
        };
        t = i8 = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                return n8;
            }

            @Override
            String c() {
                return "TRAILING";
            }

            @Override
            int d(View view, int n8) {
                return n8;
            }
        };
        u = i9;
        v = i8;
        w = i9;
        x = i8;
        y = GridLayout.h(i9, i8);
        z = GridLayout.h(i8, i9);
        A = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                return n8 >> 1;
            }

            @Override
            String c() {
                return "CENTER";
            }

            @Override
            int d(View view, int n8) {
                return n8 >> 1;
            }
        };
        B = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                if (view.getVisibility() == 8) {
                    return 0;
                }
                n8 = n9 = view.getBaseline();
                if (n9 == -1) {
                    n8 = Integer.MIN_VALUE;
                }
                return n8;
            }

            @Override
            public m b() {
                return new m(this){
                    private int d;
                    final g e;
                    {
                        this.e = g8;
                    }

                    @Override
                    protected int a(GridLayout gridLayout, View view, i i8, int n8, boolean bl) {
                        return Math.max(0, super.a(gridLayout, view, i8, n8, bl));
                    }

                    @Override
                    protected void b(int n8, int n9) {
                        super.b(n8, n9);
                        this.d = Math.max(this.d, n8 + n9);
                    }

                    @Override
                    protected void d() {
                        super.d();
                        this.d = Integer.MIN_VALUE;
                    }

                    @Override
                    protected int e(boolean bl) {
                        return Math.max(super.e(bl), this.d);
                    }
                };
            }

            @Override
            String c() {
                return "BASELINE";
            }

            @Override
            int d(View view, int n8) {
                return 0;
            }
        };
        C = new i(){

            @Override
            public int a(View view, int n8, int n9) {
                return Integer.MIN_VALUE;
            }

            @Override
            String c() {
                return "FILL";
            }

            @Override
            int d(View view, int n8) {
                return 0;
            }

            @Override
            public int e(View view, int n8, int n9) {
                return n9;
            }
        };
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.f = context.getResources().getDimensionPixelOffset(ax.C0.a.a);
        attributeSet = context.obtainStyledAttributes(attributeSet, ax.C0.b.h);
        try {
            this.setRowCount(attributeSet.getInt(l, Integer.MIN_VALUE));
            this.setColumnCount(attributeSet.getInt(m, Integer.MIN_VALUE));
            this.setOrientation(attributeSet.getInt(k, 0));
            this.setUseDefaultMargins(attributeSet.getBoolean(n, false));
            this.setAlignmentMode(attributeSet.getInt(o, 1));
            this.setRowOrderPreserved(attributeSet.getBoolean(p, true));
            this.setColumnOrderPreserved(attributeSet.getBoolean(q, true));
            return;
        }
        finally {
            attributeSet.recycle();
        }
    }

    static int A(int[] nArray, int n8) {
        int n9 = nArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            n8 = Math.max(n8, nArray[i8]);
        }
        return n8;
    }

    private void B(View view, int n8, int n9, int n10, int n11) {
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)this.v(view, true), (int)n10), ViewGroup.getChildMeasureSpec((int)n9, (int)this.v(view, false), (int)n11));
    }

    private void C(int n8, int n9, boolean bl) {
        int n10 = this.getChildCount();
        for (int i8 = 0; i8 < n10; ++i8) {
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            o o8 = this.q(view);
            if (bl) {
                this.B(view, n8, n9, o8.width, o8.height);
                continue;
            }
            boolean bl2 = this.c == 0;
            Object object = bl2 ? o8.b : o8.a;
            if (((r)object).b(bl2) != C) continue;
            n n11 = ((r)object).b;
            object = bl2 ? this.a : this.b;
            object = ((l)object).u();
            reference var6_6 = object[n11.b] - object[n11.a] - this.v(view, bl2);
            if (bl2) {
                this.B(view, n8, n9, (int)var6_6, o8.height);
                continue;
            }
            this.B(view, n8, n9, o8.width, (int)var6_6);
        }
    }

    private static void D(int[] nArray, int n8, int n9, int n10) {
        int n11 = nArray.length;
        Arrays.fill(nArray, Math.min(n8, n11), Math.min(n9, n11), n10);
    }

    private static void E(o o8, int n8, int n9, int n10, int n11) {
        o8.d(new n(n8, n9 + n8));
        o8.c(new n(n10, n11 + n10));
    }

    public static r F(int n8) {
        return GridLayout.G(n8, 1);
    }

    public static r G(int n8, int n9) {
        return GridLayout.H(n8, n9, r);
    }

    public static r H(int n8, int n9, i i8) {
        return GridLayout.I(n8, n9, i8, 0.0f);
    }

    public static r I(int n8, int n9, i i8, float f8) {
        boolean bl = n8 != Integer.MIN_VALUE;
        return new r(bl, n8, n9, i8, f8);
    }

    private void J() {
        boolean bl = this.c == 0;
        Object object = bl ? this.a : this.b;
        int n8 = ((l)object).b;
        if (n8 == Integer.MIN_VALUE) {
            n8 = 0;
        }
        int[] nArray = new int[n8];
        int n9 = this.getChildCount();
        int n10 = 0;
        int n11 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n12;
            int n13;
            int n14;
            int n15;
            o o8;
            block11: {
                block13: {
                    int n16;
                    int n17;
                    boolean bl2;
                    block12: {
                        o8 = (o)this.getChildAt(i8).getLayoutParams();
                        object = bl ? o8.a : o8.b;
                        n n18 = ((r)object).b;
                        boolean bl3 = ((r)object).a;
                        n15 = n18.b();
                        if (bl3) {
                            n10 = n18.a;
                        }
                        object = bl ? o8.b : o8.a;
                        n18 = ((r)object).b;
                        bl2 = ((r)object).a;
                        n14 = GridLayout.e(n18, bl2, n8);
                        if (bl2) {
                            n11 = n18.a;
                        }
                        n13 = n10;
                        n12 = n11;
                        if (n8 == 0) break block11;
                        n17 = n10;
                        n16 = n11;
                        if (!bl3) break block12;
                        n13 = n10;
                        n12 = n11;
                        if (bl2) break block13;
                        n16 = n11;
                        n17 = n10;
                    }
                    while (true) {
                        n10 = n16 + n14;
                        n13 = ++n17;
                        n12 = n16;
                        if (GridLayout.i(nArray, n17, n16, n10)) break;
                        if (bl2) continue;
                        if (n10 <= n8) {
                            ++n16;
                            continue;
                        }
                        ++n17;
                        n16 = 0;
                    }
                }
                GridLayout.D(nArray, n12, n12 + n14, n13 + n15);
            }
            if (bl) {
                GridLayout.E(o8, n13, n15, n12, n14);
            } else {
                GridLayout.E(o8, n12, n14, n13, n15);
            }
            n11 = n12 + n14;
            n10 = n13;
        }
    }

    static int a(int n8, int n9) {
        return View.MeasureSpec.makeMeasureSpec((int)View.MeasureSpec.getSize((int)(n9 + n8)), (int)View.MeasureSpec.getMode((int)n8));
    }

    static <T> T[] b(T[] TArray, T[] TArray2) {
        Object[] objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), TArray.length + TArray2.length);
        System.arraycopy(TArray, 0, objectArray, 0, TArray.length);
        System.arraycopy(TArray2, 0, objectArray, TArray.length, TArray2.length);
        return objectArray;
    }

    static boolean c(int n8) {
        return (n8 & 2) != 0;
    }

    private void d(o object, boolean bl) {
        String string = bl ? "column" : "row";
        object = bl ? ((o)((Object)object)).b : ((o)((Object)object)).a;
        n n8 = ((r)object).b;
        int n9 = n8.a;
        if (n9 != Integer.MIN_VALUE && n9 < 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" indices must be positive");
            GridLayout.w(((StringBuilder)object).toString());
        }
        object = bl ? this.a : this.b;
        n9 = ((l)object).b;
        if (n9 != Integer.MIN_VALUE) {
            if (n8.b > n9) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" indices (start + span) mustn't exceed the ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" count");
                GridLayout.w(((StringBuilder)object).toString());
            }
            if (n8.b() > n9) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" span mustn't exceed the ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" count");
                GridLayout.w(((StringBuilder)object).toString());
            }
        }
    }

    private static int e(n n8, boolean bl, int n9) {
        int n10 = n8.b();
        if (n9 == 0) {
            return n10;
        }
        int n11 = bl ? Math.min(n8.a, n9) : 0;
        return Math.min(n10, n9 - n11);
    }

    private int f() {
        int n8 = this.getChildCount();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            n9 = n9 * 31 + ((o)view.getLayoutParams()).hashCode();
        }
        return n9;
    }

    private void g() {
        int n8 = this.g;
        if (n8 == 0) {
            this.J();
            this.g = this.f();
            return;
        }
        if (n8 != this.f()) {
            this.h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            this.x();
            this.g();
        }
    }

    private static i h(i i8, i i9) {
        return new i(i8, i9){
            final i a;
            final i b;
            {
                this.a = i8;
                this.b = i9;
            }

            @Override
            public int a(View view, int n8, int n9) {
                i i8 = d0.B(view) == 1 ? this.b : this.a;
                return i8.a(view, n8, n9);
            }

            @Override
            String c() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SWITCHING[L:");
                stringBuilder.append(this.a.c());
                stringBuilder.append(", R:");
                stringBuilder.append(this.b.c());
                stringBuilder.append("]");
                return stringBuilder.toString();
            }

            @Override
            int d(View view, int n8) {
                i i8 = d0.B(view) == 1 ? this.b : this.a;
                return i8.d(view, n8);
            }
        };
    }

    private static boolean i(int[] nArray, int n8, int n9, int n10) {
        if (n10 > nArray.length) {
            return false;
        }
        while (n9 < n10) {
            if (nArray[n9] > n8) {
                return false;
            }
            ++n9;
        }
        return true;
    }

    static i m(int n8, boolean bl) {
        int n9;
        int n10 = bl ? 7 : 112;
        if ((n8 = (n8 & n10) >> (n9 = bl ? 0 : 4)) != 1) {
            if (n8 != 3) {
                if (n8 != 5) {
                    if (n8 != 7) {
                        if (n8 != 0x800003) {
                            if (n8 != 0x800005) {
                                return r;
                            }
                            return x;
                        }
                        return w;
                    }
                    return C;
                }
                if (bl) {
                    return z;
                }
                return v;
            }
            if (bl) {
                return y;
            }
            return u;
        }
        return A;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int n(View view, o object, boolean bl, boolean bl2) {
        boolean var4_8;
        Object var2_5;
        boolean var3_7;
        boolean bl3 = this.d;
        boolean bl4 = false;
        if (!bl3) {
            return 0;
        }
        if (var3_7 != false) {
            r r8 = object.b;
        } else {
            r r9 = object.a;
        }
        l l8 = var3_7 != false ? this.a : this.b;
        n n8 = var2_5.b;
        bl3 = var3_7 != false && this.z() ? var4_8 == false : var4_8;
        if (bl3) {
            bl3 = bl4;
            if (n8.a != 0) return this.p(view, bl3, (boolean)var3_7, (boolean)var4_8);
        } else {
            bl3 = bl4;
            if (n8.b != l8.p()) return this.p(view, bl3, (boolean)var3_7, (boolean)var4_8);
        }
        bl3 = true;
        return this.p(view, bl3, (boolean)var3_7, (boolean)var4_8);
    }

    private int o(View view, boolean bl, boolean bl2) {
        if (view.getClass() != ax.F0.a.class && view.getClass() != Space.class) {
            return this.f / 2;
        }
        return 0;
    }

    private int p(View view, boolean bl, boolean bl2, boolean bl3) {
        return this.o(view, bl2, bl3);
    }

    private int r(View object, boolean bl, boolean bl2) {
        if (this.e == 1) {
            return this.s((View)object, bl, bl2);
        }
        Object object2 = bl ? this.a : this.b;
        object2 = bl2 ? (Object)((l)object2).t() : (Object)((l)object2).y();
        object = this.q((View)object);
        object = bl ? object.b : object.a;
        object = object.b;
        int n8 = bl2 ? object.a : object.b;
        return (int)object2[n8];
    }

    private int t(View view, boolean bl) {
        if (bl) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int v(View view, boolean bl) {
        return this.r(view, bl, true) + this.r(view, bl, false);
    }

    static void w(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(". ");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void x() {
        this.g = 0;
        l l8 = this.a;
        if (l8 != null) {
            l8.E();
        }
        if ((l8 = this.b) != null) {
            l8.E();
        }
        this.y();
    }

    private void y() {
        l l8 = this.a;
        if (l8 != null && this.b != null) {
            l8.F();
            this.b.F();
        }
    }

    private boolean z() {
        return d0.B((View)this) == 1;
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams object) {
        if (!(object instanceof o)) {
            return false;
        }
        object = (o)((Object)object);
        this.d((o)((Object)object), true);
        this.d((o)((Object)object), false);
        return true;
    }

    public int getAlignmentMode() {
        return this.e;
    }

    public int getColumnCount() {
        return this.a.p();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.h;
    }

    public int getRowCount() {
        return this.b.p();
    }

    public boolean getUseDefaultMargins() {
        return this.d;
    }

    protected o j() {
        return new o();
    }

    public o k(AttributeSet attributeSet) {
        return new o(this.getContext(), attributeSet);
    }

    protected o l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof o) {
            return new o((o)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new o((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new o(layoutParams);
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        this.g();
        n10 -= n8;
        n8 = this.getPaddingLeft();
        int n12 = this.getPaddingTop();
        int n13 = this.getPaddingRight();
        int n14 = this.getPaddingBottom();
        this.a.G(n10 - n8 - n13);
        this.b.G(n11 - n9 - n12 - n14);
        int[] nArray = this.a.u();
        int[] nArray2 = this.b.u();
        n14 = this.getChildCount();
        n9 = n12;
        for (n11 = 0; n11 < n14; ++n11) {
            View view = this.getChildAt(n11);
            if (view.getVisibility() == 8) continue;
            Object object = this.q(view);
            Object object2 = ((o)((Object)object)).b;
            object = ((o)((Object)object)).a;
            Object object3 = ((r)object2).b;
            Object object4 = ((r)object).b;
            n12 = nArray[((n)object3).a];
            int n15 = nArray2[((n)object4).a];
            int n16 = nArray[((n)object3).b];
            int n17 = nArray2[((n)object4).b];
            int n18 = n16 - n12;
            int n19 = n17 - n15;
            int n20 = this.t(view, true);
            int n21 = this.t(view, false);
            object2 = ((r)object2).b(true);
            object4 = ((r)object).b(false);
            object3 = this.a.s().c(n11);
            object = this.b.s().c(n11);
            int n22 = ((i)object2).d(view, n18 - ((m)object3).e(true));
            n17 = ((i)object4).d(view, n19 - ((m)object).e(true));
            int n23 = this.r(view, true, true);
            n16 = this.r(view, false, true);
            int n24 = this.r(view, true, false);
            int n25 = this.r(view, false, false);
            int n26 = n23 + n24;
            int n27 = n16 + n25;
            int n28 = ((m)object3).a(this, view, (i)object2, n20 + n26, true);
            n25 = ((m)object).a(this, view, (i)object4, n21 + n27, false);
            n18 = ((i)object2).e(view, n20, n18 - n26);
            n19 = ((i)object4).e(view, n21, n19 - n27);
            n12 = n12 + n22 + n28;
            n12 = !this.z() ? n8 + n23 + n12 : n10 - n18 - n13 - n24 - n12;
            n15 = n9 + n15 + n17 + n25 + n16;
            if (n18 != view.getMeasuredWidth() || n19 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec((int)n18, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n19, (int)0x40000000));
            }
            view.layout(n12, n15, n18 + n12, n19 + n15);
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        this.g();
        this.y();
        int n12 = this.getPaddingLeft() + this.getPaddingRight();
        int n13 = this.getPaddingTop() + this.getPaddingBottom();
        int n14 = GridLayout.a(n8, -n12);
        int n15 = GridLayout.a(n9, -n13);
        this.C(n14, n15, true);
        if (this.c == 0) {
            n11 = this.a.w(n14);
            this.C(n14, n15, false);
            n10 = this.b.w(n15);
        } else {
            n10 = this.b.w(n15);
            this.C(n14, n15, false);
            n11 = this.a.w(n14);
        }
        n11 = Math.max(n11 + n12, this.getSuggestedMinimumWidth());
        n10 = Math.max(n10 + n13, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)n11, (int)n8, (int)0), View.resolveSizeAndState((int)n10, (int)n9, (int)0));
    }

    final o q(View view) {
        return (o)view.getLayoutParams();
    }

    public void requestLayout() {
        super.requestLayout();
        this.x();
    }

    int s(View view, boolean bl, boolean bl2) {
        o o8 = this.q(view);
        int n8 = bl ? (bl2 ? o8.leftMargin : o8.rightMargin) : (bl2 ? o8.topMargin : o8.bottomMargin);
        if (n8 == Integer.MIN_VALUE) {
            return this.n(view, o8, bl, bl2);
        }
        return n8;
    }

    public void setAlignmentMode(int n8) {
        this.e = n8;
        this.requestLayout();
    }

    public void setColumnCount(int n8) {
        this.a.J(n8);
        this.x();
        this.requestLayout();
    }

    public void setColumnOrderPreserved(boolean bl) {
        this.a.K(bl);
        this.x();
        this.requestLayout();
    }

    public void setOrientation(int n8) {
        if (this.c != n8) {
            this.c = n8;
            this.x();
            this.requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        Printer printer2 = printer;
        if (printer == null) {
            printer2 = j;
        }
        this.h = printer2;
    }

    public void setRowCount(int n8) {
        this.b.J(n8);
        this.x();
        this.requestLayout();
    }

    public void setRowOrderPreserved(boolean bl) {
        this.b.K(bl);
        this.x();
        this.requestLayout();
    }

    public void setUseDefaultMargins(boolean bl) {
        this.d = bl;
        this.requestLayout();
    }

    final int u(View view, boolean bl) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return this.t(view, bl) + this.v(view, bl);
    }

    public static abstract class i {
        i() {
        }

        abstract int a(View var1, int var2, int var3);

        m b() {
            return new m();
        }

        abstract String c();

        abstract int d(View var1, int var2);

        int e(View view, int n8, int n9) {
            return n8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Alignment:");
            stringBuilder.append(this.c());
            return stringBuilder.toString();
        }
    }

    static final class j {
        public final n a;
        public final p b;
        public boolean c = true;

        public j(n n8, p p8) {
            this.a = n8;
            this.b = p8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" ");
            String string = !this.c ? "+>" : "->";
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    static final class k<K, V>
    extends ArrayList<Pair<K, V>> {
        private final Class<V> c0;
        private final Class<K> q;

        private k(Class<K> clazz, Class<V> clazz2) {
            this.q = clazz;
            this.c0 = clazz2;
        }

        public static <K, V> k<K, V> h(Class<K> clazz, Class<V> clazz2) {
            return new k<K, V>(clazz, clazz2);
        }

        public q<K, V> i() {
            int n8 = ((AbstractCollection)this).size();
            Object[] objectArray = (Object[])Array.newInstance(this.q, n8);
            Object[] objectArray2 = (Object[])Array.newInstance(this.c0, n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[i8] = ((Pair)((AbstractList)this).get((int)i8)).first;
                objectArray2[i8] = ((Pair)((AbstractList)this).get((int)i8)).second;
            }
            return new q<Object, Object>(objectArray, objectArray2);
        }

        public void k(K k8, V v8) {
            ((AbstractCollection)this).add(Pair.create(k8, v8));
        }
    }

    final class l {
        public final boolean a;
        public int b;
        private int c;
        q<r, m> d;
        public boolean e;
        q<n, p> f;
        public boolean g;
        q<n, p> h;
        public boolean i;
        public int[] j;
        public boolean k;
        public int[] l;
        public boolean m;
        public j[] n;
        public boolean o;
        public int[] p;
        public boolean q;
        public boolean r;
        public boolean s;
        public int[] t;
        boolean u;
        private p v;
        private p w;
        final GridLayout x;

        l(GridLayout gridLayout, boolean bl) {
            this.x = gridLayout;
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
            this.s = false;
            this.u = true;
            this.v = new p(0);
            this.w = new p(-100000);
            this.a = bl;
        }

        private boolean A() {
            if (!this.s) {
                this.r = this.g();
                this.s = true;
            }
            return this.r;
        }

        private void B(List<j> list, n n8, p p8) {
            this.C(list, n8, p8, true);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void C(List<j> list, n n8, p p8, boolean bl) {
            if (n8.b() == 0) return;
            if (bl) {
                Iterator<j> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().a.equals(n8)) continue;
                    return;
                }
            }
            list.add(new j(n8, p8));
        }

        private void D(int[] nArray) {
            Arrays.fill(nArray, 0);
        }

        private void H(String string, j[] printer, boolean[] object) {
            ArrayList<j> arrayList = new ArrayList<j>();
            ArrayList<j> arrayList2 = new ArrayList<j>();
            for (int i8 = 0; i8 < ((j[])printer).length; ++i8) {
                j j8 = printer[i8];
                if (object[i8]) {
                    arrayList.add(j8);
                }
                if (j8.c) continue;
                arrayList2.add(j8);
            }
            printer = this.x.h;
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" constraints: ");
            ((StringBuilder)object).append(this.b(arrayList));
            ((StringBuilder)object).append(" are inconsistent; permanently removing: ");
            ((StringBuilder)object).append(this.b(arrayList2));
            ((StringBuilder)object).append(". ");
            printer.println(((StringBuilder)object).toString());
        }

        private boolean I(int[] nArray, j j8) {
            if (!j8.c) {
                return false;
            }
            n n8 = j8.a;
            int n9 = n8.a;
            int n10 = j8.b.a;
            int n11 = n8.b;
            if ((n9 = nArray[n9] + n10) > nArray[n11]) {
                nArray[n11] = n9;
                return true;
            }
            return false;
        }

        private void L(int n8, int n9) {
            this.v.a = n8;
            this.w.a = -n9;
            this.q = false;
        }

        private void M(int n8, float f8) {
            Object object = this.t;
            Arrays.fill((int[])object, 0);
            int n9 = this.x.getChildCount();
            float f9 = f8;
            for (int i8 = 0; i8 < n9; ++i8) {
                int n10;
                object = this.x.getChildAt(i8);
                if (object.getVisibility() == 8) {
                    n10 = n8;
                    f8 = f9;
                } else {
                    object = (Object)this.x.q((View)object);
                    object = this.a ? (Object)((o)((Object)object)).b : (Object)((o)((Object)object)).a;
                    float f10 = ((r)object).d;
                    n10 = n8;
                    f8 = f9;
                    if (f10 != 0.0f) {
                        this.t[i8] = n10 = Math.round((float)n8 * f10 / f9);
                        n10 = n8 - n10;
                        f8 = f9 - f10;
                    }
                }
                n8 = n10;
                f9 = f8;
            }
        }

        private int N(int[] nArray) {
            return nArray[this.p()];
        }

        private boolean O(int[] nArray) {
            return this.P(this.n(), nArray);
        }

        private boolean P(j[] jArray, int[] nArray) {
            return this.Q(jArray, nArray, true);
        }

        private boolean Q(j[] jArray, int[] nArray, boolean bl) {
            String string = this.a ? "horizontal" : "vertical";
            int n8 = this.p() + 1;
            boolean[] blArray = null;
            block0: for (int i8 = 0; i8 < jArray.length; ++i8) {
                int n9;
                int n10;
                int n11;
                this.D(nArray);
                for (n11 = 0; n11 < n8; ++n11) {
                    int n12 = jArray.length;
                    n10 = 0;
                    for (n9 = 0; n9 < n12; ++n9) {
                        n10 |= this.I(nArray, jArray[n9]);
                    }
                    if (n10 != 0) continue;
                    if (blArray != null) {
                        this.H(string, jArray, blArray);
                    }
                    return true;
                }
                if (!bl) {
                    return false;
                }
                boolean[] blArray2 = new boolean[jArray.length];
                for (n11 = 0; n11 < n8; ++n11) {
                    n9 = jArray.length;
                    for (n10 = 0; n10 < n9; ++n10) {
                        blArray2[n10] = blArray2[n10] | this.I(nArray, jArray[n10]);
                    }
                }
                if (i8 == 0) {
                    blArray = blArray2;
                }
                for (n11 = 0; n11 < jArray.length; ++n11) {
                    if (!blArray2[n11]) continue;
                    j j8 = jArray[n11];
                    n n13 = j8.a;
                    if (n13.a < n13.b) continue;
                    j8.c = false;
                    continue block0;
                }
            }
            return true;
        }

        private void R(int[] nArray) {
            Arrays.fill(this.q(), 0);
            this.O(nArray);
            int n8 = this.v.a;
            int n9 = this.x.getChildCount();
            boolean bl = true;
            n8 = n8 * n9 + 1;
            if (n8 >= 2) {
                float f8 = this.d();
                n9 = -1;
                int n10 = 0;
                while (n10 < n8) {
                    int n11 = (int)(((long)n10 + (long)n8) / 2L);
                    this.F();
                    this.M(n11, f8);
                    bl = this.Q(this.n(), nArray, false);
                    if (bl) {
                        n10 = n11 + 1;
                        n9 = n11;
                        continue;
                    }
                    n8 = n11;
                }
                if (n9 > 0 && !bl) {
                    this.F();
                    this.M(n9, f8);
                    this.O(nArray);
                }
            }
        }

        private j[] S(List<j> list) {
            return this.T(list.toArray(new j[list.size()]));
        }

        private j[] T(j[] jArray) {
            return new Object(this, jArray){
                j[] a;
                int b;
                j[][] c;
                int[] d;
                final j[] e;
                final l f;
                {
                    this.f = l8;
                    this.e = jArray;
                    j[] jArray2 = new j[jArray.length];
                    this.a = jArray2;
                    this.b = jArray2.length - 1;
                    this.c = l8.z(jArray);
                    this.d = new int[l8.p() + 1];
                }

                j[] a() {
                    int n8 = this.c.length;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        this.b(i8);
                    }
                    return this.a;
                }

                void b(int n8) {
                    Object object = this.d;
                    if (object[n8] != 0) {
                        return;
                    }
                    object[n8] = 1;
                    j[] jArray = this.c[n8];
                    int n9 = jArray.length;
                    for (int i8 = 0; i8 < n9; ++i8) {
                        object = jArray[i8];
                        this.b(object.a.b);
                        j[] jArray2 = this.a;
                        int n10 = this.b;
                        this.b = n10 - 1;
                        jArray2[n10] = object;
                    }
                    this.d[n8] = 2;
                }
            }.a();
        }

        private void a(List<j> list, q<n, p> q8) {
            K[] KArray;
            for (int i8 = 0; i8 < ((n[])(KArray = q8.b)).length; ++i8) {
                this.C(list, ((n[])KArray)[i8], ((p[])q8.c)[i8], false);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private String b(List<j> iterator) {
            String string = this.a ? "x" : "y";
            StringBuilder stringBuilder = new StringBuilder();
            iterator = iterator.iterator();
            boolean bl = true;
            while (iterator.hasNext()) {
                Object object = (j)iterator.next();
                if (bl) {
                    bl = false;
                } else {
                    stringBuilder.append(", ");
                }
                n n8 = ((j)object).a;
                int n9 = n8.a;
                int n10 = n8.b;
                int n11 = ((j)object).b.a;
                if (n9 < n10) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(n9);
                    ((StringBuilder)object).append(">=");
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(n9);
                    ((StringBuilder)object).append("-");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append("<=");
                    n11 = -n11;
                }
                ((StringBuilder)object).append(n11);
                object = ((StringBuilder)object).toString();
                stringBuilder.append((String)object);
            }
            return stringBuilder.toString();
        }

        private int c() {
            int n8 = this.x.getChildCount();
            int n9 = -1;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = this.x.getChildAt(i8);
                object = this.x.q((View)object);
                object = this.a ? ((o)((Object)object)).b : ((o)((Object)object)).a;
                object = ((r)object).b;
                n9 = Math.max(Math.max(Math.max(n9, ((n)object).a), ((n)object).b), ((n)object).b());
            }
            if (n9 == -1) {
                return Integer.MIN_VALUE;
            }
            return n9;
        }

        private float d() {
            int n8 = this.x.getChildCount();
            float f8 = 0.0f;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = this.x.getChildAt(i8);
                if (object.getVisibility() == 8) continue;
                object = this.x.q((View)object);
                object = this.a ? object.b : object.a;
                f8 += object.d;
            }
            return f8;
        }

        private void e() {
            this.r();
            this.o();
        }

        private void f() {
            int n8;
            Object object = (m[])this.d.c;
            for (n8 = 0; n8 < ((m[])object).length; ++n8) {
                object[n8].d();
            }
            int n9 = this.x.getChildCount();
            for (n8 = 0; n8 < n9; ++n8) {
                View view = this.x.getChildAt(n8);
                object = this.x.q(view);
                boolean bl = this.a;
                object = bl ? object.b : object.a;
                int n10 = this.x.u(view, bl);
                int n11 = object.d == 0.0f ? 0 : this.q()[n8];
                this.d.c(n8).c(this.x, view, (r)object, this, n10 + n11);
            }
        }

        private boolean g() {
            int n8 = this.x.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = this.x.getChildAt(i8);
                if (object.getVisibility() == 8) continue;
                object = this.x.q((View)object);
                object = this.a ? object.b : object.a;
                if (object.d == 0.0f) continue;
                return true;
            }
            return false;
        }

        private void h(q<n, p> q8, boolean bl) {
            int n8;
            Object[] objectArray = (p[])q8.c;
            int n9 = 0;
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                objectArray[n8].a();
            }
            objectArray = (m[])this.s().c;
            for (n8 = n9; n8 < objectArray.length; ++n8) {
                n9 = ((m)objectArray[n8]).e(bl);
                p p8 = q8.c(n8);
                int n10 = p8.a;
                if (!bl) {
                    n9 = -n9;
                }
                p8.a = Math.max(n10, n9);
            }
        }

        private void i(int[] nArray) {
            if (!this.A()) {
                this.O(nArray);
            } else {
                this.R(nArray);
            }
            if (!this.u) {
                int n8 = nArray[0];
                int n9 = nArray.length;
                for (int i8 = 0; i8 < n9; ++i8) {
                    nArray[i8] = nArray[i8] - n8;
                }
            }
        }

        private void j(boolean bl) {
            int[] nArray = bl ? this.j : this.l;
            int n8 = this.x.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = this.x.getChildAt(i8);
                if (view.getVisibility() == 8) continue;
                Object object = this.x.q(view);
                boolean bl2 = this.a;
                object = bl2 ? object.b : object.a;
                object = ((r)object).b;
                int n9 = bl ? ((n)object).a : ((n)object).b;
                nArray[n9] = Math.max(nArray[n9], this.x.s(view, bl2, bl));
            }
        }

        private j[] k() {
            int n8;
            ArrayList<j> arrayList = new ArrayList<j>();
            ArrayList<j> arrayList2 = new ArrayList<j>();
            this.a(arrayList, this.r());
            this.a(arrayList2, this.o());
            if (this.u) {
                n8 = 0;
                while (n8 < this.p()) {
                    int n9 = n8 + 1;
                    this.B(arrayList, new n(n8, n9), new p(0));
                    n8 = n9;
                }
            }
            n8 = this.p();
            this.C(arrayList, new n(0, n8), this.v, false);
            this.C(arrayList2, new n(n8, 0), this.w, false);
            return GridLayout.b(this.S(arrayList), this.S(arrayList2));
        }

        private q<r, m> l() {
            k<r, m> k8 = androidx.gridlayout.widget.GridLayout$k.h(r.class, m.class);
            int n8 = this.x.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = this.x.getChildAt(i8);
                object = this.x.q((View)object);
                boolean bl = this.a;
                object = bl ? ((o)((Object)object)).b : ((o)((Object)object)).a;
                k8.k((r)object, ((r)object).b(bl).b());
            }
            return k8.i();
        }

        private q<n, p> m(boolean bl) {
            k<n, p> k8 = androidx.gridlayout.widget.GridLayout$k.h(n.class, p.class);
            r[] rArray = (r[])this.s().b;
            int n8 = rArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                n n9 = bl ? rArray[i8].b : rArray[i8].b.a();
                k8.k(n9, new p());
            }
            return k8.i();
        }

        private q<n, p> o() {
            if (this.h == null) {
                this.h = this.m(false);
            }
            if (!this.i) {
                this.h(this.h, false);
                this.i = true;
            }
            return this.h;
        }

        private q<n, p> r() {
            if (this.f == null) {
                this.f = this.m(true);
            }
            if (!this.g) {
                this.h(this.f, true);
                this.g = true;
            }
            return this.f;
        }

        private int v() {
            if (this.c == Integer.MIN_VALUE) {
                this.c = Math.max(0, this.c());
            }
            return this.c;
        }

        private int x(int n8, int n9) {
            this.L(n8, n9);
            return this.N(this.u());
        }

        public void E() {
            this.c = Integer.MIN_VALUE;
            this.d = null;
            this.f = null;
            this.h = null;
            this.j = null;
            this.l = null;
            this.n = null;
            this.p = null;
            this.t = null;
            this.s = false;
            this.F();
        }

        public void F() {
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
        }

        public void G(int n8) {
            this.L(n8, n8);
            this.u();
        }

        public void J(int n8) {
            if (n8 != Integer.MIN_VALUE && n8 < this.v()) {
                StringBuilder stringBuilder = new StringBuilder();
                String string = this.a ? "column" : "row";
                stringBuilder.append(string);
                stringBuilder.append("Count must be greater than or equal to the maximum of all grid indices ");
                stringBuilder.append("(and spans) defined in the LayoutParams of each child");
                GridLayout.w(stringBuilder.toString());
            }
            this.b = n8;
        }

        public void K(boolean bl) {
            this.u = bl;
            this.E();
        }

        public j[] n() {
            if (this.n == null) {
                this.n = this.k();
            }
            if (!this.o) {
                this.e();
                this.o = true;
            }
            return this.n;
        }

        public int p() {
            return Math.max(this.b, this.v());
        }

        public int[] q() {
            if (this.t == null) {
                this.t = new int[this.x.getChildCount()];
            }
            return this.t;
        }

        public q<r, m> s() {
            if (this.d == null) {
                this.d = this.l();
            }
            if (!this.e) {
                this.f();
                this.e = true;
            }
            return this.d;
        }

        public int[] t() {
            if (this.j == null) {
                this.j = new int[this.p() + 1];
            }
            if (!this.k) {
                this.j(true);
                this.k = true;
            }
            return this.j;
        }

        public int[] u() {
            if (this.p == null) {
                this.p = new int[this.p() + 1];
            }
            if (!this.q) {
                this.i(this.p);
                this.q = true;
            }
            return this.p;
        }

        public int w(int n8) {
            int n9 = View.MeasureSpec.getMode((int)n8);
            n8 = View.MeasureSpec.getSize((int)n8);
            if (n9 != Integer.MIN_VALUE) {
                if (n9 != 0) {
                    if (n9 != 0x40000000) {
                        return 0;
                    }
                    return this.x(n8, n8);
                }
                return this.x(0, 100000);
            }
            return this.x(0, n8);
        }

        public int[] y() {
            if (this.l == null) {
                this.l = new int[this.p() + 1];
            }
            if (!this.m) {
                this.j(false);
                this.m = true;
            }
            return this.l;
        }

        j[][] z(j[] jArray) {
            int n8;
            int n9 = this.p() + 1;
            j[][] jArray2 = new j[n9][];
            int[] nArray = new int[n9];
            int n10 = jArray.length;
            int n11 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                int n12 = jArray[n8].a.a;
                nArray[n12] = nArray[n12] + 1;
            }
            for (n8 = 0; n8 < n9; ++n8) {
                jArray2[n8] = new j[nArray[n8]];
            }
            Arrays.fill(nArray, 0);
            n9 = jArray.length;
            for (n8 = n11; n8 < n9; ++n8) {
                j j8 = jArray[n8];
                n11 = j8.a.a;
                j[] jArray3 = jArray2[n11];
                n10 = nArray[n11];
                nArray[n11] = n10 + 1;
                jArray3[n10] = j8;
            }
            return jArray2;
        }
    }

    static class m {
        public int a;
        public int b;
        public int c;

        m() {
            this.d();
        }

        protected int a(GridLayout gridLayout, View view, i i8, int n8, boolean bl) {
            return this.a - i8.a(view, n8, i0.a(gridLayout));
        }

        protected void b(int n8, int n9) {
            this.a = Math.max(this.a, n8);
            this.b = Math.max(this.b, n9);
        }

        protected final void c(GridLayout gridLayout, View view, r r8, l l8, int n8) {
            this.c &= r8.c();
            int n9 = r8.b(l8.a).a(view, n8, i0.a(gridLayout));
            this.b(n9, n8 - n9);
        }

        protected void d() {
            this.a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            this.c = 2;
        }

        protected int e(boolean bl) {
            if (!bl && GridLayout.c(this.c)) {
                return 100000;
            }
            return this.a + this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bounds{before=");
            stringBuilder.append(this.a);
            stringBuilder.append(", after=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static final class n {
        public final int a;
        public final int b;

        public n(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        n a() {
            return new n(this.b, this.a);
        }

        int b() {
            return this.b - this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && n.class == object.getClass()) {
                object = (n)object;
                if (this.b != ((n)object).b) {
                    return false;
                }
                return this.a == ((n)object).a;
            }
            return false;
        }

        public int hashCode() {
            return this.a * 31 + this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.a);
            stringBuilder.append(", ");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static class o
    extends ViewGroup.MarginLayoutParams {
        private static final n c;
        private static final int d;
        private static final int e;
        private static final int f;
        private static final int g;
        private static final int h;
        private static final int i;
        private static final int j;
        private static final int k;
        private static final int l;
        private static final int m;
        private static final int n;
        private static final int o;
        private static final int p;
        public r a;
        public r b;

        static {
            n n8;
            c = n8 = new n(Integer.MIN_VALUE, -2147483647);
            d = n8.b();
            e = ax.C0.b.q;
            f = ax.C0.b.r;
            g = ax.C0.b.s;
            h = ax.C0.b.t;
            i = ax.C0.b.u;
            j = ax.C0.b.v;
            k = ax.C0.b.w;
            l = ax.C0.b.x;
            m = ax.C0.b.z;
            n = ax.C0.b.A;
            o = ax.C0.b.B;
            p = ax.C0.b.y;
        }

        public o() {
            r r8 = androidx.gridlayout.widget.GridLayout$r.e;
            this(r8, r8);
        }

        private o(int n8, int n9, int n10, int n11, int n12, int n13, r r8, r r9) {
            super(n8, n9);
            r r10;
            this.a = r10 = androidx.gridlayout.widget.GridLayout$r.e;
            this.b = r10;
            this.setMargins(n10, n11, n12, n13);
            this.a = r8;
            this.b = r9;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            r r8;
            this.a = r8 = androidx.gridlayout.widget.GridLayout$r.e;
            this.b = r8;
            this.b(context, attributeSet);
            this.a(context, attributeSet);
        }

        public o(ViewGroup.LayoutParams object) {
            super(object);
            object = androidx.gridlayout.widget.GridLayout$r.e;
            this.a = object;
            this.b = object;
        }

        public o(ViewGroup.MarginLayoutParams object) {
            super(object);
            object = androidx.gridlayout.widget.GridLayout$r.e;
            this.a = object;
            this.b = object;
        }

        public o(o o8) {
            super((ViewGroup.MarginLayoutParams)o8);
            r r8;
            this.a = r8 = androidx.gridlayout.widget.GridLayout$r.e;
            this.b = r8;
            this.a = o8.a;
            this.b = o8.b;
        }

        public o(r r8, r r9) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, r8, r9);
        }

        private void a(Context context, AttributeSet attributeSet) {
            attributeSet = context.obtainStyledAttributes(attributeSet, ax.C0.b.p);
            try {
                int n8 = attributeSet.getInt(p, 0);
                int n9 = attributeSet.getInt(j, Integer.MIN_VALUE);
                int n10 = k;
                int n11 = d;
                n10 = attributeSet.getInt(n10, n11);
                float f8 = attributeSet.getFloat(l, 0.0f);
                this.b = GridLayout.I(n9, n10, GridLayout.m(n8, true), f8);
                n9 = attributeSet.getInt(m, Integer.MIN_VALUE);
                n11 = attributeSet.getInt(n, n11);
                f8 = attributeSet.getFloat(o, 0.0f);
                this.a = GridLayout.I(n9, n11, GridLayout.m(n8, false), f8);
                return;
            }
            finally {
                attributeSet.recycle();
            }
        }

        private void b(Context context, AttributeSet attributeSet) {
            attributeSet = context.obtainStyledAttributes(attributeSet, ax.C0.b.p);
            try {
                int n8 = attributeSet.getDimensionPixelSize(e, Integer.MIN_VALUE);
                this.leftMargin = attributeSet.getDimensionPixelSize(f, n8);
                this.topMargin = attributeSet.getDimensionPixelSize(g, n8);
                this.rightMargin = attributeSet.getDimensionPixelSize(h, n8);
                this.bottomMargin = attributeSet.getDimensionPixelSize(i, n8);
                return;
            }
            finally {
                attributeSet.recycle();
            }
        }

        final void c(n n8) {
            this.b = this.b.a(n8);
        }

        final void d(n n8) {
            this.a = this.a.a(n8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && ((Object)((Object)this)).getClass() == object.getClass()) {
                object = (o)((Object)object);
                if (!this.b.equals(((o)((Object)object)).b)) {
                    return false;
                }
                return this.a.equals(((o)((Object)object)).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }

        protected void setBaseAttributes(TypedArray typedArray, int n8, int n9) {
            this.width = typedArray.getLayoutDimension(n8, -2);
            this.height = typedArray.getLayoutDimension(n9, -2);
        }
    }

    static final class p {
        public int a;

        public p() {
            this.a();
        }

        public p(int n8) {
            this.a = n8;
        }

        public void a() {
            this.a = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.a);
        }
    }

    static final class q<K, V> {
        public final int[] a;
        public final K[] b;
        public final V[] c;

        q(K[] KArray, V[] VArray) {
            int[] nArray = androidx.gridlayout.widget.GridLayout$q.b(KArray);
            this.a = nArray;
            this.b = androidx.gridlayout.widget.GridLayout$q.a(KArray, nArray);
            this.c = androidx.gridlayout.widget.GridLayout$q.a(VArray, nArray);
        }

        private static <K> K[] a(K[] KArray, int[] nArray) {
            int n8 = KArray.length;
            Object[] objectArray = (Object[])Array.newInstance(KArray.getClass().getComponentType(), GridLayout.A(nArray, -1) + 1);
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[nArray[i8]] = KArray[i8];
            }
            return objectArray;
        }

        private static <K> int[] b(K[] KArray) {
            int n8 = KArray.length;
            int[] nArray = new int[n8];
            HashMap<K, Integer> hashMap = new HashMap<K, Integer>();
            for (int i8 = 0; i8 < n8; ++i8) {
                Integer n9;
                K k8 = KArray[i8];
                Integer n10 = n9 = (Integer)hashMap.get(k8);
                if (n9 == null) {
                    n10 = hashMap.size();
                    hashMap.put(k8, n10);
                }
                nArray[i8] = n10;
            }
            return nArray;
        }

        public V c(int n8) {
            return this.c[this.a[n8]];
        }
    }

    public static class r {
        static final r e = GridLayout.F(Integer.MIN_VALUE);
        final boolean a;
        final n b;
        final i c;
        final float d;

        r(boolean bl, int n8, int n9, i i8, float f8) {
            this(bl, new n(n8, n9 + n8), i8, f8);
        }

        private r(boolean bl, n n8, i i8, float f8) {
            this.a = bl;
            this.b = n8;
            this.c = i8;
            this.d = f8;
        }

        final r a(n n8) {
            return new r(this.a, n8, this.c, this.d);
        }

        public i b(boolean bl) {
            i i8 = this.c;
            if (i8 != r) {
                return i8;
            }
            if (this.d == 0.0f) {
                if (bl) {
                    return w;
                }
                return B;
            }
            return C;
        }

        final int c() {
            if (this.c == r && this.d == 0.0f) {
                return 0;
            }
            return 2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass()) {
                object = (r)object;
                if (!this.c.equals(((r)object).c)) {
                    return false;
                }
                return this.b.equals(((r)object).b);
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() * 31 + this.c.hashCode();
        }
    }
}

