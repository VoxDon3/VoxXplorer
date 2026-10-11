/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.constraintlayout.widget.g;
import ax.K.j;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    private static final int[] f = new int[]{0, 4, 8};
    private static SparseIntArray g = new SparseIntArray();
    private static SparseIntArray h = new SparseIntArray();
    public String a = "";
    public int b = 0;
    private HashMap<String, androidx.constraintlayout.widget.b> c = new HashMap();
    private boolean d = true;
    private HashMap<Integer, a> e = new HashMap();

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
        int n8 = ax.L.c.q4;
        sparseIntArray.append(n8, 6);
        h.append(n8, 7);
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

    private int[] i(View object, String object2) {
        String[] stringArray = ((String)object2).split(",");
        Context context = object.getContext();
        object2 = new int[stringArray.length];
        int n8 = 0;
        int n9 = 0;
        while (n8 < stringArray.length) {
            int n10;
            String string = stringArray[n8].trim();
            try {
                n10 = ax.L.b.class.getField(string).getInt(null);
            }
            catch (Exception exception) {
                n10 = 0;
            }
            int n11 = n10;
            if (n10 == 0) {
                n11 = context.getResources().getIdentifier(string, "id", context.getPackageName());
            }
            n10 = n11;
            if (n11 == 0) {
                n10 = n11;
                if (object.isInEditMode()) {
                    n10 = n11;
                    if (object.getParent() instanceof ConstraintLayout) {
                        Object object3 = ((ConstraintLayout)object.getParent()).k(0, string);
                        n10 = n11;
                        if (object3 != null) {
                            n10 = n11;
                            if (object3 instanceof Integer) {
                                n10 = (Integer)object3;
                            }
                        }
                    }
                }
            }
            object2[n9] = n10;
            ++n8;
            ++n9;
        }
        object = object2;
        if (n9 != stringArray.length) {
            object = Arrays.copyOf((int[])object2, n9);
        }
        return object;
    }

    private a j(Context context, AttributeSet attributeSet, boolean bl) {
        a a8 = new a();
        int[] nArray = bl ? ax.L.c.k3 : ax.L.c.t;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
        this.r(context, a8, (TypedArray)attributeSet, bl);
        attributeSet.recycle();
        return a8;
    }

    private a k(int n8) {
        if (!this.e.containsKey(n8)) {
            this.e.put(n8, new a());
        }
        return this.e.get(n8);
    }

    private static int n(TypedArray typedArray, int n8, int n9) {
        if ((n9 = typedArray.getResourceId(n8, n9)) == -1) {
            return typedArray.getInt(n8, -1);
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    static void o(Object object, TypedArray typedArray, int n8, int n9) {
        boolean bl;
        block12: {
            block11: {
                block9: {
                    block10: {
                        if (object == null) {
                            return;
                        }
                        int n10 = typedArray.peekValue((int)n8).type;
                        if (n10 == 3) {
                            androidx.constraintlayout.widget.e.p(object, typedArray.getString(n8), n9);
                            return;
                        }
                        int n11 = 0;
                        if (n10 == 5) break block9;
                        n10 = typedArray.getInt(n8, 0);
                        if (n10 == -4) break block10;
                        n8 = n11;
                        if (n10 == -3) break block11;
                        n8 = n10;
                        if (n10 != -2) {
                            n8 = n10;
                            if (n10 != -1) {
                                n8 = n11;
                            }
                        }
                        break block11;
                    }
                    bl = true;
                    n8 = -2;
                    break block12;
                }
                n8 = typedArray.getDimensionPixelSize(n8, 0);
            }
            bl = false;
        }
        if (object instanceof ConstraintLayout.b) {
            object = (ConstraintLayout.b)((Object)object);
            if (n9 == 0) {
                ((ViewGroup.MarginLayoutParams)object).width = n8;
                ((ConstraintLayout.b)((Object)object)).a0 = bl;
                return;
            }
            ((ViewGroup.MarginLayoutParams)object).height = n8;
            ((ConstraintLayout.b)((Object)object)).b0 = bl;
            return;
        }
        if (object instanceof b) {
            object = (b)object;
            if (n9 == 0) {
                ((b)object).d = n8;
                ((b)object).n0 = bl;
                return;
            }
            ((b)object).e = n8;
            ((b)object).o0 = bl;
            return;
        }
        if (!(object instanceof a.a)) return;
        object = (a.a)object;
        if (n9 == 0) {
            ((a.a)object).b(23, n8);
            ((a.a)object).d(80, bl);
            return;
        }
        ((a.a)object).b(21, n8);
        ((a.a)object).d(81, bl);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void p(Object object, String string, int n8) {
        if (string == null) {
            return;
        }
        int n9 = string.indexOf(61);
        int n10 = string.length();
        if (n9 <= 0) return;
        if (n9 >= n10 - 1) return;
        String string2 = string.substring(0, n9);
        if ((string = string.substring(n9 + 1)).length() <= 0) return;
        string2 = string2.trim();
        string = string.trim();
        if ("ratio".equalsIgnoreCase(string2)) {
            if (object instanceof ConstraintLayout.b) {
                object = (ConstraintLayout.b)((Object)object);
                if (n8 == 0) {
                    ((ViewGroup.MarginLayoutParams)object).width = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams)object).height = 0;
                }
                androidx.constraintlayout.widget.e.q((ConstraintLayout.b)((Object)object), string);
                return;
            }
            if (object instanceof b) {
                ((b)object).A = string;
                return;
            }
            if (!(object instanceof a.a)) return;
            ((a.a)object).c(5, string);
            return;
        }
        if ("weight".equalsIgnoreCase(string2)) {
            try {
                float f8 = Float.parseFloat(string);
                if (object instanceof ConstraintLayout.b) {
                    object = (ConstraintLayout.b)((Object)object);
                    if (n8 == 0) {
                        ((ViewGroup.MarginLayoutParams)object).width = 0;
                        ((ConstraintLayout.b)((Object)object)).L = f8;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams)object).height = 0;
                    ((ConstraintLayout.b)((Object)object)).M = f8;
                    return;
                }
                if (object instanceof b) {
                    object = (b)object;
                    if (n8 == 0) {
                        ((b)object).d = 0;
                        ((b)object).W = f8;
                        return;
                    }
                    ((b)object).e = 0;
                    ((b)object).V = f8;
                    return;
                }
                if (!(object instanceof a.a)) return;
                object = (a.a)object;
                if (n8 == 0) {
                    ((a.a)object).b(23, 0);
                    ((a.a)object).a(39, f8);
                    return;
                }
                ((a.a)object).b(21, 0);
                ((a.a)object).a(40, f8);
                return;
            }
            catch (NumberFormatException numberFormatException) {
                return;
            }
        }
        if (!"parent".equalsIgnoreCase(string2)) return;
        {
            float f9 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(string)));
            if (object instanceof ConstraintLayout.b) {
                object = (ConstraintLayout.b)((Object)object);
                if (n8 == 0) {
                    ((ViewGroup.MarginLayoutParams)object).width = 0;
                    ((ConstraintLayout.b)((Object)object)).V = f9;
                    ((ConstraintLayout.b)((Object)object)).P = 2;
                    return;
                }
                ((ViewGroup.MarginLayoutParams)object).height = 0;
                ((ConstraintLayout.b)((Object)object)).W = f9;
                ((ConstraintLayout.b)((Object)object)).Q = 2;
                return;
            }
            if (object instanceof b) {
                object = (b)object;
                if (n8 == 0) {
                    ((b)object).d = 0;
                    ((b)object).f0 = f9;
                    ((b)object).Z = 2;
                    return;
                }
                ((b)object).e = 0;
                ((b)object).g0 = f9;
                ((b)object).a0 = 2;
                return;
            }
            if (!(object instanceof a.a)) return;
            object = (a.a)object;
            if (n8 == 0) {
                ((a.a)object).b(23, 0);
                ((a.a)object).b(54, 2);
                return;
            }
            ((a.a)object).b(21, 0);
            ((a.a)object).b(55, 2);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static void q(ConstraintLayout.b var0, String var1_1) {
        block13: {
            block14: {
                var3_2 = NaNf;
                var7_3 = -1;
                var2_4 = var3_2;
                var8_5 = var7_3;
                if (var1_1 == null) break block13;
                var10_6 = var1_1.length();
                var11_7 = var1_1.indexOf(44);
                var9_8 = 0;
                var6_9 = var7_3;
                var8_5 = var9_8;
                if (var11_7 > 0) {
                    var6_9 = var7_3;
                    var8_5 = var9_8;
                    if (var11_7 < var10_6 - 1) {
                        var12_10 = var1_1.substring(0, var11_7);
                        if (var12_10.equalsIgnoreCase("W")) {
                            var6_9 = 0;
                        } else {
                            var6_9 = var7_3;
                            if (var12_10.equalsIgnoreCase("H")) {
                                var6_9 = 1;
                            }
                        }
                        var8_5 = var11_7 + 1;
                    }
                }
                if ((var7_3 = var1_1.indexOf(58)) < 0 || var7_3 >= var10_6 - 1) break block14;
                var12_10 = var1_1.substring(var8_5, var7_3);
                var13_12 = var1_1.substring(var7_3 + 1);
                var2_4 = var3_2;
                var8_5 = var6_9;
                if (var12_10.length() <= 0) break block13;
                var2_4 = var3_2;
                var8_5 = var6_9;
                if (var13_12.length() <= 0) break block13;
                try {
                    var5_13 = Float.parseFloat(var12_10);
                    var4_14 = Float.parseFloat(var13_12);
                    var2_4 = var3_2;
                    var8_5 = var6_9;
                }
                catch (NumberFormatException var12_11) {
                    var2_4 = var3_2;
                    var8_5 = var6_9;
                    ** continue;
                }
                if (!(var5_13 > 0.0f)) break block13;
                var2_4 = var3_2;
                var8_5 = var6_9;
                if (!(var4_14 > 0.0f)) break block13;
                if (var6_9 == 1) {
                    var2_4 = Math.abs(var4_14 / var5_13);
                    var8_5 = var6_9;
                    break block13;
                }
                var2_4 = Math.abs(var5_13 / var4_14);
                var8_5 = var6_9;
                break block13;
            }
            var12_10 = var1_1.substring(var8_5);
            var2_4 = var3_2;
            var8_5 = var6_9;
            if (var12_10.length() > 0) {
                var2_4 = Float.parseFloat(var12_10);
                var8_5 = var6_9;
            }
        }
lbl63:
        // 2 sources

        while (true) {
            var0.I = var1_1;
            var0.J = var2_4;
            var0.K = var8_5;
            return;
        }
    }

    private void r(Context object, a a8, TypedArray typedArray, boolean bl) {
        if (bl) {
            androidx.constraintlayout.widget.e.s((Context)object, a8, typedArray);
            return;
        }
        int n8 = typedArray.getIndexCount();
        block96: for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = typedArray.getIndex(i8);
            if (n9 != ax.L.c.v && ax.L.c.N != n9 && ax.L.c.O != n9) {
                a8.d.a = true;
                a8.e.b = true;
                a8.c.a = true;
                a8.f.a = true;
            }
            switch (g.get(n9)) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown attribute 0x");
                    ((StringBuilder)object).append(Integer.toHexString(n9));
                    ((StringBuilder)object).append("   ");
                    ((StringBuilder)object).append(g.get(n9));
                    Log.w((String)"ConstraintSet", (String)((StringBuilder)object).toString());
                    continue block96;
                }
                case 97: {
                    object = a8.e;
                    ((b)object).q0 = typedArray.getInt(n9, ((b)object).q0);
                    continue block96;
                }
                case 96: {
                    androidx.constraintlayout.widget.e.o(a8.e, typedArray, n9, 1);
                    continue block96;
                }
                case 95: {
                    androidx.constraintlayout.widget.e.o(a8.e, typedArray, n9, 0);
                    continue block96;
                }
                case 94: {
                    object = a8.e;
                    ((b)object).U = typedArray.getDimensionPixelSize(n9, ((b)object).U);
                    continue block96;
                }
                case 93: {
                    object = a8.e;
                    ((b)object).N = typedArray.getDimensionPixelSize(n9, ((b)object).N);
                    continue block96;
                }
                case 92: {
                    object = a8.e;
                    ((b)object).t = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).t);
                    continue block96;
                }
                case 91: {
                    object = a8.e;
                    ((b)object).s = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).s);
                    continue block96;
                }
                case 87: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unused attribute 0x");
                    ((StringBuilder)object).append(Integer.toHexString(n9));
                    ((StringBuilder)object).append("   ");
                    ((StringBuilder)object).append(g.get(n9));
                    Log.w((String)"ConstraintSet", (String)((StringBuilder)object).toString());
                    continue block96;
                }
                case 86: {
                    int n10 = typedArray.peekValue((int)n9).type;
                    if (n10 == 1) {
                        a8.d.n = typedArray.getResourceId(n9, -1);
                        object = a8.d;
                        if (((c)object).n == -1) continue block96;
                        ((c)object).m = -2;
                        continue block96;
                    }
                    if (n10 == 3) {
                        a8.d.l = typedArray.getString(n9);
                        if (a8.d.l.indexOf("/") > 0) {
                            a8.d.n = typedArray.getResourceId(n9, -1);
                            a8.d.m = -2;
                            continue block96;
                        }
                        a8.d.m = -1;
                        continue block96;
                    }
                    object = a8.d;
                    ((c)object).m = typedArray.getInteger(n9, ((c)object).n);
                    continue block96;
                }
                case 85: {
                    object = a8.d;
                    ((c)object).j = typedArray.getFloat(n9, ((c)object).j);
                    continue block96;
                }
                case 84: {
                    object = a8.d;
                    ((c)object).k = typedArray.getInteger(n9, ((c)object).k);
                    continue block96;
                }
                case 83: {
                    object = a8.f;
                    ((e)object).i = androidx.constraintlayout.widget.e.n(typedArray, n9, ((e)object).i);
                    continue block96;
                }
                case 82: {
                    object = a8.d;
                    ((c)object).c = typedArray.getInteger(n9, ((c)object).c);
                    continue block96;
                }
                case 81: {
                    object = a8.e;
                    ((b)object).o0 = typedArray.getBoolean(n9, ((b)object).o0);
                    continue block96;
                }
                case 80: {
                    object = a8.e;
                    ((b)object).n0 = typedArray.getBoolean(n9, ((b)object).n0);
                    continue block96;
                }
                case 79: {
                    object = a8.d;
                    ((c)object).g = typedArray.getFloat(n9, ((c)object).g);
                    continue block96;
                }
                case 78: {
                    object = a8.c;
                    ((d)object).c = typedArray.getInt(n9, ((d)object).c);
                    continue block96;
                }
                case 77: {
                    a8.e.m0 = typedArray.getString(n9);
                    continue block96;
                }
                case 76: {
                    object = a8.d;
                    ((c)object).e = typedArray.getInt(n9, ((c)object).e);
                    continue block96;
                }
                case 75: {
                    object = a8.e;
                    ((b)object).p0 = typedArray.getBoolean(n9, ((b)object).p0);
                    continue block96;
                }
                case 74: {
                    a8.e.l0 = typedArray.getString(n9);
                    continue block96;
                }
                case 73: {
                    object = a8.e;
                    ((b)object).i0 = typedArray.getDimensionPixelSize(n9, ((b)object).i0);
                    continue block96;
                }
                case 72: {
                    object = a8.e;
                    ((b)object).h0 = typedArray.getInt(n9, ((b)object).h0);
                    continue block96;
                }
                case 71: {
                    Log.e((String)"ConstraintSet", (String)"CURRENTLY UNSUPPORTED");
                    continue block96;
                }
                case 70: {
                    a8.e.g0 = typedArray.getFloat(n9, 1.0f);
                    continue block96;
                }
                case 69: {
                    a8.e.f0 = typedArray.getFloat(n9, 1.0f);
                    continue block96;
                }
                case 68: {
                    object = a8.c;
                    ((d)object).e = typedArray.getFloat(n9, ((d)object).e);
                    continue block96;
                }
                case 67: {
                    object = a8.d;
                    ((c)object).i = typedArray.getFloat(n9, ((c)object).i);
                    continue block96;
                }
                case 66: {
                    a8.d.f = typedArray.getInt(n9, 0);
                    continue block96;
                }
                case 65: {
                    if (typedArray.peekValue((int)n9).type == 3) {
                        a8.d.d = typedArray.getString(n9);
                        continue block96;
                    }
                    a8.d.d = ax.F.b.c[typedArray.getInteger(n9, 0)];
                    continue block96;
                }
                case 64: {
                    object = a8.d;
                    ((c)object).b = androidx.constraintlayout.widget.e.n(typedArray, n9, ((c)object).b);
                    continue block96;
                }
                case 63: {
                    object = a8.e;
                    ((b)object).D = typedArray.getFloat(n9, ((b)object).D);
                    continue block96;
                }
                case 62: {
                    object = a8.e;
                    ((b)object).C = typedArray.getDimensionPixelSize(n9, ((b)object).C);
                    continue block96;
                }
                case 61: {
                    object = a8.e;
                    ((b)object).B = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).B);
                    continue block96;
                }
                case 60: {
                    object = a8.f;
                    ((e)object).b = typedArray.getFloat(n9, ((e)object).b);
                    continue block96;
                }
                case 59: {
                    object = a8.e;
                    ((b)object).e0 = typedArray.getDimensionPixelSize(n9, ((b)object).e0);
                    continue block96;
                }
                case 58: {
                    object = a8.e;
                    ((b)object).d0 = typedArray.getDimensionPixelSize(n9, ((b)object).d0);
                    continue block96;
                }
                case 57: {
                    object = a8.e;
                    ((b)object).c0 = typedArray.getDimensionPixelSize(n9, ((b)object).c0);
                    continue block96;
                }
                case 56: {
                    object = a8.e;
                    ((b)object).b0 = typedArray.getDimensionPixelSize(n9, ((b)object).b0);
                    continue block96;
                }
                case 55: {
                    object = a8.e;
                    ((b)object).a0 = typedArray.getInt(n9, ((b)object).a0);
                    continue block96;
                }
                case 54: {
                    object = a8.e;
                    ((b)object).Z = typedArray.getInt(n9, ((b)object).Z);
                    continue block96;
                }
                case 53: {
                    object = a8.f;
                    ((e)object).l = typedArray.getDimension(n9, ((e)object).l);
                    continue block96;
                }
                case 52: {
                    object = a8.f;
                    ((e)object).k = typedArray.getDimension(n9, ((e)object).k);
                    continue block96;
                }
                case 51: {
                    object = a8.f;
                    ((e)object).j = typedArray.getDimension(n9, ((e)object).j);
                    continue block96;
                }
                case 50: {
                    object = a8.f;
                    ((e)object).h = typedArray.getDimension(n9, ((e)object).h);
                    continue block96;
                }
                case 49: {
                    object = a8.f;
                    ((e)object).g = typedArray.getDimension(n9, ((e)object).g);
                    continue block96;
                }
                case 48: {
                    object = a8.f;
                    ((e)object).f = typedArray.getFloat(n9, ((e)object).f);
                    continue block96;
                }
                case 47: {
                    object = a8.f;
                    ((e)object).e = typedArray.getFloat(n9, ((e)object).e);
                    continue block96;
                }
                case 46: {
                    object = a8.f;
                    ((e)object).d = typedArray.getFloat(n9, ((e)object).d);
                    continue block96;
                }
                case 45: {
                    object = a8.f;
                    ((e)object).c = typedArray.getFloat(n9, ((e)object).c);
                    continue block96;
                }
                case 44: {
                    object = a8.f;
                    ((e)object).m = true;
                    ((e)object).n = typedArray.getDimension(n9, ((e)object).n);
                    continue block96;
                }
                case 43: {
                    object = a8.c;
                    ((d)object).d = typedArray.getFloat(n9, ((d)object).d);
                    continue block96;
                }
                case 42: {
                    object = a8.e;
                    ((b)object).Y = typedArray.getInt(n9, ((b)object).Y);
                    continue block96;
                }
                case 41: {
                    object = a8.e;
                    ((b)object).X = typedArray.getInt(n9, ((b)object).X);
                    continue block96;
                }
                case 40: {
                    object = a8.e;
                    ((b)object).V = typedArray.getFloat(n9, ((b)object).V);
                    continue block96;
                }
                case 39: {
                    object = a8.e;
                    ((b)object).W = typedArray.getFloat(n9, ((b)object).W);
                    continue block96;
                }
                case 38: {
                    a8.a = typedArray.getResourceId(n9, a8.a);
                    continue block96;
                }
                case 37: {
                    object = a8.e;
                    ((b)object).z = typedArray.getFloat(n9, ((b)object).z);
                    continue block96;
                }
                case 36: {
                    object = a8.e;
                    ((b)object).n = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).n);
                    continue block96;
                }
                case 35: {
                    object = a8.e;
                    ((b)object).o = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).o);
                    continue block96;
                }
                case 34: {
                    object = a8.e;
                    ((b)object).J = typedArray.getDimensionPixelSize(n9, ((b)object).J);
                    continue block96;
                }
                case 33: {
                    object = a8.e;
                    ((b)object).v = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).v);
                    continue block96;
                }
                case 32: {
                    object = a8.e;
                    ((b)object).u = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).u);
                    continue block96;
                }
                case 31: {
                    object = a8.e;
                    ((b)object).M = typedArray.getDimensionPixelSize(n9, ((b)object).M);
                    continue block96;
                }
                case 30: {
                    object = a8.e;
                    ((b)object).m = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).m);
                    continue block96;
                }
                case 29: {
                    object = a8.e;
                    ((b)object).l = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).l);
                    continue block96;
                }
                case 28: {
                    object = a8.e;
                    ((b)object).I = typedArray.getDimensionPixelSize(n9, ((b)object).I);
                    continue block96;
                }
                case 27: {
                    object = a8.e;
                    ((b)object).G = typedArray.getInt(n9, ((b)object).G);
                    continue block96;
                }
                case 26: {
                    object = a8.e;
                    ((b)object).k = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).k);
                    continue block96;
                }
                case 25: {
                    object = a8.e;
                    ((b)object).j = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).j);
                    continue block96;
                }
                case 24: {
                    object = a8.e;
                    ((b)object).H = typedArray.getDimensionPixelSize(n9, ((b)object).H);
                    continue block96;
                }
                case 23: {
                    object = a8.e;
                    ((b)object).d = typedArray.getLayoutDimension(n9, ((b)object).d);
                    continue block96;
                }
                case 22: {
                    object = a8.c;
                    ((d)object).b = typedArray.getInt(n9, ((d)object).b);
                    object = a8.c;
                    ((d)object).b = f[((d)object).b];
                    continue block96;
                }
                case 21: {
                    object = a8.e;
                    ((b)object).e = typedArray.getLayoutDimension(n9, ((b)object).e);
                    continue block96;
                }
                case 20: {
                    object = a8.e;
                    ((b)object).y = typedArray.getFloat(n9, ((b)object).y);
                    continue block96;
                }
                case 19: {
                    object = a8.e;
                    ((b)object).h = typedArray.getFloat(n9, ((b)object).h);
                    continue block96;
                }
                case 18: {
                    object = a8.e;
                    ((b)object).g = typedArray.getDimensionPixelOffset(n9, ((b)object).g);
                    continue block96;
                }
                case 17: {
                    object = a8.e;
                    ((b)object).f = typedArray.getDimensionPixelOffset(n9, ((b)object).f);
                    continue block96;
                }
                case 16: {
                    object = a8.e;
                    ((b)object).P = typedArray.getDimensionPixelSize(n9, ((b)object).P);
                    continue block96;
                }
                case 15: {
                    object = a8.e;
                    ((b)object).T = typedArray.getDimensionPixelSize(n9, ((b)object).T);
                    continue block96;
                }
                case 14: {
                    object = a8.e;
                    ((b)object).Q = typedArray.getDimensionPixelSize(n9, ((b)object).Q);
                    continue block96;
                }
                case 13: {
                    object = a8.e;
                    ((b)object).O = typedArray.getDimensionPixelSize(n9, ((b)object).O);
                    continue block96;
                }
                case 12: {
                    object = a8.e;
                    ((b)object).S = typedArray.getDimensionPixelSize(n9, ((b)object).S);
                    continue block96;
                }
                case 11: {
                    object = a8.e;
                    ((b)object).R = typedArray.getDimensionPixelSize(n9, ((b)object).R);
                    continue block96;
                }
                case 10: {
                    object = a8.e;
                    ((b)object).w = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).w);
                    continue block96;
                }
                case 9: {
                    object = a8.e;
                    ((b)object).x = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).x);
                    continue block96;
                }
                case 8: {
                    object = a8.e;
                    ((b)object).L = typedArray.getDimensionPixelSize(n9, ((b)object).L);
                    continue block96;
                }
                case 7: {
                    object = a8.e;
                    ((b)object).F = typedArray.getDimensionPixelOffset(n9, ((b)object).F);
                    continue block96;
                }
                case 6: {
                    object = a8.e;
                    ((b)object).E = typedArray.getDimensionPixelOffset(n9, ((b)object).E);
                    continue block96;
                }
                case 5: {
                    a8.e.A = typedArray.getString(n9);
                    continue block96;
                }
                case 4: {
                    object = a8.e;
                    ((b)object).p = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).p);
                    continue block96;
                }
                case 3: {
                    object = a8.e;
                    ((b)object).q = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).q);
                    continue block96;
                }
                case 2: {
                    object = a8.e;
                    ((b)object).K = typedArray.getDimensionPixelSize(n9, ((b)object).K);
                    continue block96;
                }
                case 1: {
                    object = a8.e;
                    ((b)object).r = androidx.constraintlayout.widget.e.n(typedArray, n9, ((b)object).r);
                }
            }
        }
        object = a8.e;
        if (((b)object).l0 != null) {
            ((b)object).k0 = null;
        }
    }

    private static void s(Context object, a a8, TypedArray typedArray) {
        int n8 = typedArray.getIndexCount();
        object = new a.a();
        a8.h = object;
        a8.d.a = false;
        a8.e.b = false;
        a8.c.a = false;
        a8.f.a = false;
        block82: for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = typedArray.getIndex(i8);
            switch (h.get(n9)) {
                default: {
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Unknown attribute 0x");
                    ((StringBuilder)object2).append(Integer.toHexString(n9));
                    ((StringBuilder)object2).append("   ");
                    ((StringBuilder)object2).append(g.get(n9));
                    Log.w((String)"ConstraintSet", (String)((StringBuilder)object2).toString());
                    continue block82;
                }
                case 99: {
                    ((a.a)object).d(99, typedArray.getBoolean(n9, a8.e.i));
                    continue block82;
                }
                case 98: {
                    int n10;
                    if (j.u0) {
                        a8.a = n10 = typedArray.getResourceId(n9, a8.a);
                        if (n10 != -1) continue block82;
                        a8.b = typedArray.getString(n9);
                        continue block82;
                    }
                    if (typedArray.peekValue((int)n9).type == 3) {
                        a8.b = typedArray.getString(n9);
                        continue block82;
                    }
                    a8.a = typedArray.getResourceId(n9, a8.a);
                    continue block82;
                }
                case 97: {
                    ((a.a)object).b(97, typedArray.getInt(n9, a8.e.q0));
                    continue block82;
                }
                case 96: {
                    androidx.constraintlayout.widget.e.o(object, typedArray, n9, 1);
                    continue block82;
                }
                case 95: {
                    androidx.constraintlayout.widget.e.o(object, typedArray, n9, 0);
                    continue block82;
                }
                case 94: {
                    ((a.a)object).b(94, typedArray.getDimensionPixelSize(n9, a8.e.U));
                    continue block82;
                }
                case 93: {
                    ((a.a)object).b(93, typedArray.getDimensionPixelSize(n9, a8.e.N));
                    continue block82;
                }
                case 87: {
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append("unused attribute 0x");
                    ((StringBuilder)object2).append(Integer.toHexString(n9));
                    ((StringBuilder)object2).append("   ");
                    ((StringBuilder)object2).append(g.get(n9));
                    Log.w((String)"ConstraintSet", (String)((StringBuilder)object2).toString());
                    continue block82;
                }
                case 86: {
                    Object object2;
                    int n10 = typedArray.peekValue((int)n9).type;
                    if (n10 == 1) {
                        a8.d.n = typedArray.getResourceId(n9, -1);
                        ((a.a)object).b(89, a8.d.n);
                        object2 = a8.d;
                        if (((c)object2).n == -1) continue block82;
                        ((c)object2).m = -2;
                        ((a.a)object).b(88, -2);
                        continue block82;
                    }
                    if (n10 == 3) {
                        a8.d.l = typedArray.getString(n9);
                        ((a.a)object).c(90, a8.d.l);
                        if (a8.d.l.indexOf("/") > 0) {
                            a8.d.n = typedArray.getResourceId(n9, -1);
                            ((a.a)object).b(89, a8.d.n);
                            a8.d.m = -2;
                            ((a.a)object).b(88, -2);
                            continue block82;
                        }
                        a8.d.m = -1;
                        ((a.a)object).b(88, -1);
                        continue block82;
                    }
                    object2 = a8.d;
                    ((c)object2).m = typedArray.getInteger(n9, ((c)object2).n);
                    ((a.a)object).b(88, a8.d.m);
                    continue block82;
                }
                case 85: {
                    ((a.a)object).a(85, typedArray.getFloat(n9, a8.d.j));
                    continue block82;
                }
                case 84: {
                    ((a.a)object).b(84, typedArray.getInteger(n9, a8.d.k));
                    continue block82;
                }
                case 83: {
                    ((a.a)object).b(83, androidx.constraintlayout.widget.e.n(typedArray, n9, a8.f.i));
                    continue block82;
                }
                case 82: {
                    ((a.a)object).b(82, typedArray.getInteger(n9, a8.d.c));
                    continue block82;
                }
                case 81: {
                    ((a.a)object).d(81, typedArray.getBoolean(n9, a8.e.o0));
                    continue block82;
                }
                case 80: {
                    ((a.a)object).d(80, typedArray.getBoolean(n9, a8.e.n0));
                    continue block82;
                }
                case 79: {
                    ((a.a)object).a(79, typedArray.getFloat(n9, a8.d.g));
                    continue block82;
                }
                case 78: {
                    ((a.a)object).b(78, typedArray.getInt(n9, a8.c.c));
                    continue block82;
                }
                case 77: {
                    ((a.a)object).c(77, typedArray.getString(n9));
                    continue block82;
                }
                case 76: {
                    ((a.a)object).b(76, typedArray.getInt(n9, a8.d.e));
                    continue block82;
                }
                case 75: {
                    ((a.a)object).d(75, typedArray.getBoolean(n9, a8.e.p0));
                    continue block82;
                }
                case 74: {
                    ((a.a)object).c(74, typedArray.getString(n9));
                    continue block82;
                }
                case 73: {
                    ((a.a)object).b(73, typedArray.getDimensionPixelSize(n9, a8.e.i0));
                    continue block82;
                }
                case 72: {
                    ((a.a)object).b(72, typedArray.getInt(n9, a8.e.h0));
                    continue block82;
                }
                case 71: {
                    Log.e((String)"ConstraintSet", (String)"CURRENTLY UNSUPPORTED");
                    continue block82;
                }
                case 70: {
                    ((a.a)object).a(70, typedArray.getFloat(n9, 1.0f));
                    continue block82;
                }
                case 69: {
                    ((a.a)object).a(69, typedArray.getFloat(n9, 1.0f));
                    continue block82;
                }
                case 68: {
                    ((a.a)object).a(68, typedArray.getFloat(n9, a8.c.e));
                    continue block82;
                }
                case 67: {
                    ((a.a)object).a(67, typedArray.getFloat(n9, a8.d.i));
                    continue block82;
                }
                case 66: {
                    ((a.a)object).b(66, typedArray.getInt(n9, 0));
                    continue block82;
                }
                case 65: {
                    if (typedArray.peekValue((int)n9).type == 3) {
                        ((a.a)object).c(65, typedArray.getString(n9));
                        continue block82;
                    }
                    ((a.a)object).c(65, ax.F.b.c[typedArray.getInteger(n9, 0)]);
                    continue block82;
                }
                case 64: {
                    ((a.a)object).b(64, androidx.constraintlayout.widget.e.n(typedArray, n9, a8.d.b));
                    continue block82;
                }
                case 63: {
                    ((a.a)object).a(63, typedArray.getFloat(n9, a8.e.D));
                    continue block82;
                }
                case 62: {
                    ((a.a)object).b(62, typedArray.getDimensionPixelSize(n9, a8.e.C));
                    continue block82;
                }
                case 60: {
                    ((a.a)object).a(60, typedArray.getFloat(n9, a8.f.b));
                    continue block82;
                }
                case 59: {
                    ((a.a)object).b(59, typedArray.getDimensionPixelSize(n9, a8.e.e0));
                    continue block82;
                }
                case 58: {
                    ((a.a)object).b(58, typedArray.getDimensionPixelSize(n9, a8.e.d0));
                    continue block82;
                }
                case 57: {
                    ((a.a)object).b(57, typedArray.getDimensionPixelSize(n9, a8.e.c0));
                    continue block82;
                }
                case 56: {
                    ((a.a)object).b(56, typedArray.getDimensionPixelSize(n9, a8.e.b0));
                    continue block82;
                }
                case 55: {
                    ((a.a)object).b(55, typedArray.getInt(n9, a8.e.a0));
                    continue block82;
                }
                case 54: {
                    ((a.a)object).b(54, typedArray.getInt(n9, a8.e.Z));
                    continue block82;
                }
                case 53: {
                    ((a.a)object).a(53, typedArray.getDimension(n9, a8.f.l));
                    continue block82;
                }
                case 52: {
                    ((a.a)object).a(52, typedArray.getDimension(n9, a8.f.k));
                    continue block82;
                }
                case 51: {
                    ((a.a)object).a(51, typedArray.getDimension(n9, a8.f.j));
                    continue block82;
                }
                case 50: {
                    ((a.a)object).a(50, typedArray.getDimension(n9, a8.f.h));
                    continue block82;
                }
                case 49: {
                    ((a.a)object).a(49, typedArray.getDimension(n9, a8.f.g));
                    continue block82;
                }
                case 48: {
                    ((a.a)object).a(48, typedArray.getFloat(n9, a8.f.f));
                    continue block82;
                }
                case 47: {
                    ((a.a)object).a(47, typedArray.getFloat(n9, a8.f.e));
                    continue block82;
                }
                case 46: {
                    ((a.a)object).a(46, typedArray.getFloat(n9, a8.f.d));
                    continue block82;
                }
                case 45: {
                    ((a.a)object).a(45, typedArray.getFloat(n9, a8.f.c));
                    continue block82;
                }
                case 44: {
                    ((a.a)object).d(44, true);
                    ((a.a)object).a(44, typedArray.getDimension(n9, a8.f.n));
                    continue block82;
                }
                case 43: {
                    ((a.a)object).a(43, typedArray.getFloat(n9, a8.c.d));
                    continue block82;
                }
                case 42: {
                    ((a.a)object).b(42, typedArray.getInt(n9, a8.e.Y));
                    continue block82;
                }
                case 41: {
                    ((a.a)object).b(41, typedArray.getInt(n9, a8.e.X));
                    continue block82;
                }
                case 40: {
                    ((a.a)object).a(40, typedArray.getFloat(n9, a8.e.V));
                    continue block82;
                }
                case 39: {
                    ((a.a)object).a(39, typedArray.getFloat(n9, a8.e.W));
                    continue block82;
                }
                case 38: {
                    a8.a = n9 = typedArray.getResourceId(n9, a8.a);
                    ((a.a)object).b(38, n9);
                    continue block82;
                }
                case 37: {
                    ((a.a)object).a(37, typedArray.getFloat(n9, a8.e.z));
                    continue block82;
                }
                case 34: {
                    ((a.a)object).b(34, typedArray.getDimensionPixelSize(n9, a8.e.J));
                    continue block82;
                }
                case 31: {
                    ((a.a)object).b(31, typedArray.getDimensionPixelSize(n9, a8.e.M));
                    continue block82;
                }
                case 28: {
                    ((a.a)object).b(28, typedArray.getDimensionPixelSize(n9, a8.e.I));
                    continue block82;
                }
                case 27: {
                    ((a.a)object).b(27, typedArray.getInt(n9, a8.e.G));
                    continue block82;
                }
                case 24: {
                    ((a.a)object).b(24, typedArray.getDimensionPixelSize(n9, a8.e.H));
                    continue block82;
                }
                case 23: {
                    ((a.a)object).b(23, typedArray.getLayoutDimension(n9, a8.e.d));
                    continue block82;
                }
                case 22: {
                    ((a.a)object).b(22, f[typedArray.getInt(n9, a8.c.b)]);
                    continue block82;
                }
                case 21: {
                    ((a.a)object).b(21, typedArray.getLayoutDimension(n9, a8.e.e));
                    continue block82;
                }
                case 20: {
                    ((a.a)object).a(20, typedArray.getFloat(n9, a8.e.y));
                    continue block82;
                }
                case 19: {
                    ((a.a)object).a(19, typedArray.getFloat(n9, a8.e.h));
                    continue block82;
                }
                case 18: {
                    ((a.a)object).b(18, typedArray.getDimensionPixelOffset(n9, a8.e.g));
                    continue block82;
                }
                case 17: {
                    ((a.a)object).b(17, typedArray.getDimensionPixelOffset(n9, a8.e.f));
                    continue block82;
                }
                case 16: {
                    ((a.a)object).b(16, typedArray.getDimensionPixelSize(n9, a8.e.P));
                    continue block82;
                }
                case 15: {
                    ((a.a)object).b(15, typedArray.getDimensionPixelSize(n9, a8.e.T));
                    continue block82;
                }
                case 14: {
                    ((a.a)object).b(14, typedArray.getDimensionPixelSize(n9, a8.e.Q));
                    continue block82;
                }
                case 13: {
                    ((a.a)object).b(13, typedArray.getDimensionPixelSize(n9, a8.e.O));
                    continue block82;
                }
                case 12: {
                    ((a.a)object).b(12, typedArray.getDimensionPixelSize(n9, a8.e.S));
                    continue block82;
                }
                case 11: {
                    ((a.a)object).b(11, typedArray.getDimensionPixelSize(n9, a8.e.R));
                    continue block82;
                }
                case 8: {
                    ((a.a)object).b(8, typedArray.getDimensionPixelSize(n9, a8.e.L));
                    continue block82;
                }
                case 7: {
                    ((a.a)object).b(7, typedArray.getDimensionPixelOffset(n9, a8.e.F));
                    continue block82;
                }
                case 6: {
                    ((a.a)object).b(6, typedArray.getDimensionPixelOffset(n9, a8.e.E));
                    continue block82;
                }
                case 5: {
                    ((a.a)object).c(5, typedArray.getString(n9));
                    continue block82;
                }
                case 2: {
                    ((a.a)object).b(2, typedArray.getDimensionPixelSize(n9, a8.e.K));
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        this.d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /*
     * Enabled aggressive block sorting
     */
    void d(ConstraintLayout constraintLayout, boolean bl) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n8;
        int n9 = constraintLayout.getChildCount();
        Object object6 = new HashSet(this.e.keySet());
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            int n11;
            block21: {
                block23: {
                    block22: {
                        object5 = constraintLayout.getChildAt(n8);
                        n11 = object5.getId();
                        if (!this.e.containsKey(n11)) {
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("id unknown ");
                            ((StringBuilder)object4).append(ax.K.a.b((View)object5));
                            Log.w((String)"ConstraintSet", (String)((StringBuilder)object4).toString());
                            continue;
                        }
                        if (this.d && n11 == -1) {
                            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        }
                        if (n11 == -1) continue;
                        if (!this.e.containsKey(n11)) break block21;
                        ((HashSet)object6).remove(n11);
                        object4 = this.e.get(n11);
                        if (object4 == null) continue;
                        if (object5 instanceof androidx.constraintlayout.widget.a) {
                            ((a)object4).e.j0 = 1;
                            object3 = (androidx.constraintlayout.widget.a)((Object)object5);
                            object3.setId(n11);
                            ((androidx.constraintlayout.widget.a)((Object)object3)).setType(((a)object4).e.h0);
                            ((androidx.constraintlayout.widget.a)((Object)object3)).setMargin(((a)object4).e.i0);
                            ((androidx.constraintlayout.widget.a)((Object)object3)).setAllowsGoneWidget(((a)object4).e.p0);
                            object2 = ((a)object4).e;
                            object = object2.k0;
                            if (object != null) {
                                ((androidx.constraintlayout.widget.c)((Object)object3)).setReferencedIds((int[])object);
                            } else {
                                object = object2.l0;
                                if (object != null) {
                                    object2.k0 = this.i((View)object3, (String)object);
                                    ((androidx.constraintlayout.widget.c)((Object)object3)).setReferencedIds(((a)object4).e.k0);
                                }
                            }
                        }
                        object3 = (ConstraintLayout.b)object5.getLayoutParams();
                        ((ConstraintLayout.b)((Object)object3)).a();
                        ((a)object4).d((ConstraintLayout.b)((Object)object3));
                        if (bl) {
                            androidx.constraintlayout.widget.b.e((View)object5, ((a)object4).g);
                        }
                        object5.setLayoutParams((ViewGroup.LayoutParams)object3);
                        object3 = ((a)object4).c;
                        if (((d)object3).c == 0) {
                            object5.setVisibility(((d)object3).b);
                        }
                        object5.setAlpha(((a)object4).c.d);
                        object5.setRotation(((a)object4).f.b);
                        object5.setRotationX(((a)object4).f.c);
                        object5.setRotationY(((a)object4).f.d);
                        object5.setScaleX(((a)object4).f.e);
                        object5.setScaleY(((a)object4).f.f);
                        object3 = ((a)object4).f;
                        if (((e)object3).i == -1) break block22;
                        object3 = ((View)object5.getParent()).findViewById(((a)object4).f.i);
                        if (object3 != null) {
                            float f8 = (float)(object3.getTop() + object3.getBottom()) / 2.0f;
                            float f9 = (float)(object3.getLeft() + object3.getRight()) / 2.0f;
                            if (object5.getRight() - object5.getLeft() > 0 && object5.getBottom() - object5.getTop() > 0) {
                                float f10 = object5.getLeft();
                                float f11 = object5.getTop();
                                object5.setPivotX(f9 - f10);
                                object5.setPivotY(f8 - f11);
                            }
                        }
                        break block23;
                    }
                    if (!Float.isNaN(((e)object3).g)) {
                        object5.setPivotX(((a)object4).f.g);
                    }
                    if (!Float.isNaN(((a)object4).f.h)) {
                        object5.setPivotY(((a)object4).f.h);
                    }
                }
                object5.setTranslationX(((a)object4).f.j);
                object5.setTranslationY(((a)object4).f.k);
                object5.setTranslationZ(((a)object4).f.l);
                object4 = ((a)object4).f;
                if (!((e)object4).m) continue;
                object5.setElevation(((e)object4).n);
                continue;
            }
            object5 = new StringBuilder();
            ((StringBuilder)object5).append("WARNING NO CONSTRAINTS for view ");
            ((StringBuilder)object5).append(n11);
            Log.v((String)"ConstraintSet", (String)((StringBuilder)object5).toString());
        }
        object5 = ((HashSet)object6).iterator();
        while (true) {
            n8 = n10;
            if (!object5.hasNext()) break;
            object4 = (Integer)object5.next();
            object6 = this.e.get(object4);
            if (object6 == null) continue;
            if (((a)object6).e.j0 == 1) {
                object3 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                object3.setId(((Integer)object4).intValue());
                object2 = ((a)object6).e;
                object = object2.k0;
                if (object != null) {
                    ((androidx.constraintlayout.widget.c)((Object)object3)).setReferencedIds((int[])object);
                } else {
                    object = object2.l0;
                    if (object != null) {
                        object2.k0 = this.i((View)object3, (String)object);
                        ((androidx.constraintlayout.widget.c)((Object)object3)).setReferencedIds(((a)object6).e.k0);
                    }
                }
                ((androidx.constraintlayout.widget.a)((Object)object3)).setType(((a)object6).e.h0);
                ((androidx.constraintlayout.widget.a)((Object)object3)).setMargin(((a)object6).e.i0);
                object2 = constraintLayout.i();
                ((androidx.constraintlayout.widget.c)((Object)object3)).s();
                ((a)object6).d((ConstraintLayout.b)((Object)object2));
                constraintLayout.addView((View)object3, (ViewGroup.LayoutParams)object2);
            }
            if (!((a)object6).e.a) continue;
            object3 = new g(constraintLayout.getContext());
            object3.setId(((Integer)object4).intValue());
            object4 = constraintLayout.i();
            ((a)object6).d((ConstraintLayout.b)((Object)object4));
            constraintLayout.addView((View)object3, (ViewGroup.LayoutParams)object4);
        }
        while (n8 < n9) {
            object6 = constraintLayout.getChildAt(n8);
            if (object6 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c)((Object)object6)).i(constraintLayout);
            }
            ++n8;
        }
        return;
    }

    public void e(Context context, int n8) {
        this.f((ConstraintLayout)LayoutInflater.from((Context)context).inflate(n8, null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int n8 = constraintLayout.getChildCount();
        this.e.clear();
        for (int i8 = 0; i8 < n8; ++i8) {
            a a8;
            View view = constraintLayout.getChildAt(i8);
            Object object = (ConstraintLayout.b)view.getLayoutParams();
            int n9 = view.getId();
            if (this.d && n9 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(n9)) {
                this.e.put(n9, new a());
            }
            if ((a8 = this.e.get(n9)) == null) continue;
            a8.g = androidx.constraintlayout.widget.b.a(this.c, view);
            a8.f(n9, object);
            a8.c.b = view.getVisibility();
            a8.c.d = view.getAlpha();
            a8.f.b = view.getRotation();
            a8.f.c = view.getRotationX();
            a8.f.d = view.getRotationY();
            a8.f.e = view.getScaleX();
            a8.f.f = view.getScaleY();
            float f8 = view.getPivotX();
            float f9 = view.getPivotY();
            if ((double)f8 != 0.0 || (double)f9 != 0.0) {
                object = a8.f;
                ((e)object).g = f8;
                ((e)object).h = f9;
            }
            a8.f.j = view.getTranslationX();
            a8.f.k = view.getTranslationY();
            a8.f.l = view.getTranslationZ();
            object = a8.f;
            if (((e)object).m) {
                ((e)object).n = view.getElevation();
            }
            if (!(view instanceof androidx.constraintlayout.widget.a)) continue;
            view = (androidx.constraintlayout.widget.a)view;
            a8.e.p0 = view.getAllowsGoneWidget();
            a8.e.k0 = view.getReferencedIds();
            a8.e.h0 = view.getType();
            a8.e.i0 = view.getMargin();
        }
    }

    public void g(f f8) {
        int n8 = f8.getChildCount();
        this.e.clear();
        for (int i8 = 0; i8 < n8; ++i8) {
            a a8;
            View view = f8.getChildAt(i8);
            f.a a9 = (f.a)view.getLayoutParams();
            int n9 = view.getId();
            if (this.d && n9 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(n9)) {
                this.e.put(n9, new a());
            }
            if ((a8 = this.e.get(n9)) == null) continue;
            if (view instanceof androidx.constraintlayout.widget.c) {
                a8.h((androidx.constraintlayout.widget.c)view, n9, a9);
            }
            a8.g(n9, a9);
        }
    }

    public void h(int n8, int n9, int n10, float f8) {
        b b8 = this.k((int)n8).e;
        b8.B = n9;
        b8.C = n10;
        b8.D = f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(Context context, int n8) {
        XmlResourceParser xmlResourceParser;
        block8: {
            XmlPullParserException xmlPullParserException2;
            block9: {
                xmlResourceParser = context.getResources().getXml(n8);
                try {
                    n8 = xmlResourceParser.getEventType();
                    break block8;
                }
                catch (IOException iOException) {
                }
                catch (XmlPullParserException xmlPullParserException2) {
                    break block9;
                }
                iOException.printStackTrace();
                return;
            }
            xmlPullParserException2.printStackTrace();
            return;
        }
        while (n8 != 1) {
            if (n8 != 0) {
                if (n8 == 2) {
                    String string = xmlResourceParser.getName();
                    a a8 = this.j(context, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), false);
                    if (string.equalsIgnoreCase("Guideline")) {
                        a8.e.a = true;
                    }
                    this.e.put(a8.a, a8);
                }
            } else {
                xmlResourceParser.getName();
            }
            n8 = xmlResourceParser.next();
        }
    }

    /*
     * Exception decompiling
     */
    public void m(Context var1_1, XmlPullParser var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [7, 6 : 127->138)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static class androidx.constraintlayout.widget.e$a {
        int a;
        String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, androidx.constraintlayout.widget.b> g = new HashMap();
        a h;

        private void f(int n8, ConstraintLayout.b b8) {
            this.a = n8;
            b b9 = this.e;
            b9.j = b8.e;
            b9.k = b8.f;
            b9.l = b8.g;
            b9.m = b8.h;
            b9.n = b8.i;
            b9.o = b8.j;
            b9.p = b8.k;
            b9.q = b8.l;
            b9.r = b8.m;
            b9.s = b8.n;
            b9.t = b8.o;
            b9.u = b8.s;
            b9.v = b8.t;
            b9.w = b8.u;
            b9.x = b8.v;
            b9.y = b8.G;
            b9.z = b8.H;
            b9.A = b8.I;
            b9.B = b8.p;
            b9.C = b8.q;
            b9.D = b8.r;
            b9.E = b8.X;
            b9.F = b8.Y;
            b9.G = b8.Z;
            b9.h = b8.c;
            b9.f = b8.a;
            b9.g = b8.b;
            b9.d = b8.width;
            b9.e = b8.height;
            b9.H = b8.leftMargin;
            b9.I = b8.rightMargin;
            b9.J = b8.topMargin;
            b9.K = b8.bottomMargin;
            b9.N = b8.D;
            b9.V = b8.M;
            b9.W = b8.L;
            b9.Y = b8.O;
            b9.X = b8.N;
            b9.n0 = b8.a0;
            b9.o0 = b8.b0;
            b9.Z = b8.P;
            b9.a0 = b8.Q;
            b9.b0 = b8.T;
            b9.c0 = b8.U;
            b9.d0 = b8.R;
            b9.e0 = b8.S;
            b9.f0 = b8.V;
            b9.g0 = b8.W;
            b9.m0 = b8.c0;
            b9.P = b8.x;
            b9.R = b8.z;
            b9.O = b8.w;
            b9.Q = b8.y;
            b9.T = b8.A;
            b9.S = b8.B;
            b9.U = b8.C;
            b9.q0 = b8.d0;
            b9.L = b8.getMarginEnd();
            this.e.M = b8.getMarginStart();
        }

        private void g(int n8, f.a a8) {
            this.f(n8, a8);
            this.c.d = a8.x0;
            e e8 = this.f;
            e8.b = a8.A0;
            e8.c = a8.B0;
            e8.d = a8.C0;
            e8.e = a8.D0;
            e8.f = a8.E0;
            e8.g = a8.F0;
            e8.h = a8.G0;
            e8.j = a8.H0;
            e8.k = a8.I0;
            e8.l = a8.J0;
            e8.n = a8.z0;
            e8.m = a8.y0;
        }

        private void h(androidx.constraintlayout.widget.c c8, int n8, f.a object) {
            this.g(n8, (f.a)((Object)object));
            if (c8 instanceof androidx.constraintlayout.widget.a) {
                object = this.e;
                ((b)object).j0 = 1;
                c8 = (androidx.constraintlayout.widget.a)c8;
                ((b)object).h0 = ((androidx.constraintlayout.widget.a)c8).getType();
                this.e.k0 = c8.getReferencedIds();
                this.e.i0 = ((androidx.constraintlayout.widget.a)c8).getMargin();
            }
        }

        public void d(ConstraintLayout.b b8) {
            b b9 = this.e;
            b8.e = b9.j;
            b8.f = b9.k;
            b8.g = b9.l;
            b8.h = b9.m;
            b8.i = b9.n;
            b8.j = b9.o;
            b8.k = b9.p;
            b8.l = b9.q;
            b8.m = b9.r;
            b8.n = b9.s;
            b8.o = b9.t;
            b8.s = b9.u;
            b8.t = b9.v;
            b8.u = b9.w;
            b8.v = b9.x;
            b8.leftMargin = b9.H;
            b8.rightMargin = b9.I;
            b8.topMargin = b9.J;
            b8.bottomMargin = b9.K;
            b8.A = b9.T;
            b8.B = b9.S;
            b8.x = b9.P;
            b8.z = b9.R;
            b8.G = b9.y;
            b8.H = b9.z;
            b8.p = b9.B;
            b8.q = b9.C;
            b8.r = b9.D;
            b8.I = b9.A;
            b8.X = b9.E;
            b8.Y = b9.F;
            b8.M = b9.V;
            b8.L = b9.W;
            b8.O = b9.Y;
            b8.N = b9.X;
            b8.a0 = b9.n0;
            b8.b0 = b9.o0;
            b8.P = b9.Z;
            b8.Q = b9.a0;
            b8.T = b9.b0;
            b8.U = b9.c0;
            b8.R = b9.d0;
            b8.S = b9.e0;
            b8.V = b9.f0;
            b8.W = b9.g0;
            b8.Z = b9.G;
            b8.c = b9.h;
            b8.a = b9.f;
            b8.b = b9.g;
            b8.width = b9.d;
            b8.height = b9.e;
            String string = b9.m0;
            if (string != null) {
                b8.c0 = string;
            }
            b8.d0 = b9.q0;
            b8.setMarginStart(b9.M);
            b8.setMarginEnd(this.e.L);
            b8.a();
        }

        public androidx.constraintlayout.widget.e$a e() {
            androidx.constraintlayout.widget.e$a a8 = new androidx.constraintlayout.widget.e$a();
            a8.e.a(this.e);
            a8.d.a(this.d);
            a8.c.a(this.c);
            a8.f.a(this.f);
            a8.a = this.a;
            a8.h = this.h;
            return a8;
        }

        static class a {
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

            a() {
            }

            void a(int n8, float f8) {
                int n9 = this.f;
                Object[] objectArray = this.d;
                if (n9 >= objectArray.length) {
                    this.d = Arrays.copyOf(objectArray, objectArray.length * 2);
                    objectArray = this.e;
                    this.e = Arrays.copyOf((float[])objectArray, objectArray.length * 2);
                }
                objectArray = this.d;
                n9 = this.f;
                objectArray[n9] = n8;
                objectArray = this.e;
                this.f = n9 + 1;
                objectArray[n9] = (int)f8;
            }

            void b(int n8, int n9) {
                int n10 = this.c;
                int[] nArray = this.a;
                if (n10 >= nArray.length) {
                    this.a = Arrays.copyOf(nArray, nArray.length * 2);
                    nArray = this.b;
                    this.b = Arrays.copyOf(nArray, nArray.length * 2);
                }
                nArray = this.a;
                n10 = this.c;
                nArray[n10] = n8;
                nArray = this.b;
                this.c = n10 + 1;
                nArray[n10] = n9;
            }

            void c(int n8, String string) {
                int n9 = this.i;
                Object[] objectArray = this.g;
                if (n9 >= objectArray.length) {
                    this.g = Arrays.copyOf(objectArray, objectArray.length * 2);
                    objectArray = this.h;
                    this.h = (String[])Arrays.copyOf(objectArray, objectArray.length * 2);
                }
                objectArray = this.g;
                n9 = this.i;
                objectArray[n9] = n8;
                objectArray = this.h;
                this.i = n9 + 1;
                objectArray[n9] = (int)string;
            }

            void d(int n8, boolean bl) {
                int n9 = this.l;
                Object[] objectArray = this.j;
                if (n9 >= objectArray.length) {
                    this.j = Arrays.copyOf(objectArray, objectArray.length * 2);
                    objectArray = this.k;
                    this.k = Arrays.copyOf((boolean[])objectArray, objectArray.length * 2);
                }
                objectArray = this.j;
                n9 = this.l;
                objectArray[n9] = n8;
                objectArray = this.k;
                this.l = n9 + 1;
                objectArray[n9] = bl ? 1 : 0;
            }
        }
    }

    public static class b {
        private static SparseIntArray r0;
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
        public boolean a = false;
        public int a0 = 0;
        public boolean b = false;
        public int b0 = 0;
        public boolean c = false;
        public int c0 = 0;
        public int d;
        public int d0 = 0;
        public int e;
        public int e0 = 0;
        public int f = -1;
        public float f0 = 1.0f;
        public int g = -1;
        public float g0 = 1.0f;
        public float h = -1.0f;
        public int h0 = -1;
        public boolean i = true;
        public int i0 = 0;
        public int j = -1;
        public int j0 = -1;
        public int k = -1;
        public int[] k0;
        public int l = -1;
        public String l0;
        public int m = -1;
        public String m0;
        public int n = -1;
        public boolean n0 = false;
        public int o = -1;
        public boolean o0 = false;
        public int p = -1;
        public boolean p0 = true;
        public int q = -1;
        public int q0 = 0;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;

        static {
            SparseIntArray sparseIntArray;
            r0 = sparseIntArray = new SparseIntArray();
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

        public void a(b b8) {
            this.a = b8.a;
            this.d = b8.d;
            this.b = b8.b;
            this.e = b8.e;
            this.f = b8.f;
            this.g = b8.g;
            this.h = b8.h;
            this.i = b8.i;
            this.j = b8.j;
            this.k = b8.k;
            this.l = b8.l;
            this.m = b8.m;
            this.n = b8.n;
            this.o = b8.o;
            this.p = b8.p;
            this.q = b8.q;
            this.r = b8.r;
            this.s = b8.s;
            this.t = b8.t;
            this.u = b8.u;
            this.v = b8.v;
            this.w = b8.w;
            this.x = b8.x;
            this.y = b8.y;
            this.z = b8.z;
            this.A = b8.A;
            this.B = b8.B;
            this.C = b8.C;
            this.D = b8.D;
            this.E = b8.E;
            this.F = b8.F;
            this.G = b8.G;
            this.H = b8.H;
            this.I = b8.I;
            this.J = b8.J;
            this.K = b8.K;
            this.L = b8.L;
            this.M = b8.M;
            this.N = b8.N;
            this.O = b8.O;
            this.P = b8.P;
            this.Q = b8.Q;
            this.R = b8.R;
            this.S = b8.S;
            this.T = b8.T;
            this.U = b8.U;
            this.V = b8.V;
            this.W = b8.W;
            this.X = b8.X;
            this.Y = b8.Y;
            this.Z = b8.Z;
            this.a0 = b8.a0;
            this.b0 = b8.b0;
            this.c0 = b8.c0;
            this.d0 = b8.d0;
            this.e0 = b8.e0;
            this.f0 = b8.f0;
            this.g0 = b8.g0;
            this.h0 = b8.h0;
            this.i0 = b8.i0;
            this.j0 = b8.j0;
            this.m0 = b8.m0;
            int[] nArray = b8.k0;
            this.k0 = (int[])(nArray != null && b8.l0 == null ? Arrays.copyOf(nArray, nArray.length) : null);
            this.l0 = b8.l0;
            this.n0 = b8.n0;
            this.o0 = b8.o0;
            this.p0 = b8.p0;
            this.q0 = b8.q0;
        }

        void b(Context context, AttributeSet object) {
            context = context.obtainStyledAttributes((AttributeSet)object, ax.L.c.x5);
            this.b = true;
            int n8 = context.getIndexCount();
            block74: for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                int n10 = r0.get(n9);
                switch (n10) {
                    default: {
                        switch (n10) {
                            default: {
                                switch (n10) {
                                    default: {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("Unknown attribute 0x");
                                        ((StringBuilder)object).append(Integer.toHexString(n9));
                                        ((StringBuilder)object).append("   ");
                                        ((StringBuilder)object).append(r0.get(n9));
                                        Log.w((String)"ConstraintSet", (String)((StringBuilder)object).toString());
                                        continue block74;
                                    }
                                    case 91: {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("unused attribute 0x");
                                        ((StringBuilder)object).append(Integer.toHexString(n9));
                                        ((StringBuilder)object).append("   ");
                                        ((StringBuilder)object).append(r0.get(n9));
                                        Log.w((String)"ConstraintSet", (String)((StringBuilder)object).toString());
                                        continue block74;
                                    }
                                    case 90: {
                                        this.i = context.getBoolean(n9, this.i);
                                        continue block74;
                                    }
                                    case 89: {
                                        this.m0 = context.getString(n9);
                                        continue block74;
                                    }
                                    case 88: {
                                        this.o0 = context.getBoolean(n9, this.o0);
                                        continue block74;
                                    }
                                    case 87: {
                                        this.n0 = context.getBoolean(n9, this.n0);
                                        continue block74;
                                    }
                                    case 86: {
                                        this.d0 = context.getDimensionPixelSize(n9, this.d0);
                                        continue block74;
                                    }
                                    case 85: {
                                        this.e0 = context.getDimensionPixelSize(n9, this.e0);
                                        continue block74;
                                    }
                                    case 84: {
                                        this.b0 = context.getDimensionPixelSize(n9, this.b0);
                                        continue block74;
                                    }
                                    case 83: {
                                        this.c0 = context.getDimensionPixelSize(n9, this.c0);
                                        continue block74;
                                    }
                                    case 82: {
                                        this.a0 = context.getInt(n9, this.a0);
                                        continue block74;
                                    }
                                    case 81: {
                                        this.Z = context.getInt(n9, this.Z);
                                        continue block74;
                                    }
                                    case 80: {
                                        this.N = context.getDimensionPixelSize(n9, this.N);
                                        continue block74;
                                    }
                                    case 79: {
                                        this.U = context.getDimensionPixelSize(n9, this.U);
                                        continue block74;
                                    }
                                    case 78: {
                                        this.t = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.t);
                                        continue block74;
                                    }
                                    case 77: {
                                        this.s = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.s);
                                        continue block74;
                                    }
                                    case 76: {
                                        this.q0 = context.getInt(n9, this.q0);
                                        continue block74;
                                    }
                                    case 75: {
                                        this.p0 = context.getBoolean(n9, this.p0);
                                        continue block74;
                                    }
                                    case 74: {
                                        this.l0 = context.getString(n9);
                                        continue block74;
                                    }
                                    case 73: {
                                        this.i0 = context.getDimensionPixelSize(n9, this.i0);
                                        continue block74;
                                    }
                                    case 72: {
                                        this.h0 = context.getInt(n9, this.h0);
                                        continue block74;
                                    }
                                    case 71: {
                                        Log.e((String)"ConstraintSet", (String)"CURRENTLY UNSUPPORTED");
                                        continue block74;
                                    }
                                    case 70: {
                                        this.g0 = context.getFloat(n9, 1.0f);
                                        continue block74;
                                    }
                                    case 69: 
                                }
                                this.f0 = context.getFloat(n9, 1.0f);
                                continue block74;
                            }
                            case 63: {
                                this.D = context.getFloat(n9, this.D);
                                continue block74;
                            }
                            case 62: {
                                this.C = context.getDimensionPixelSize(n9, this.C);
                                continue block74;
                            }
                            case 61: 
                        }
                        this.B = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.B);
                        continue block74;
                    }
                    case 42: {
                        androidx.constraintlayout.widget.e.o(this, (TypedArray)context, n9, 1);
                        continue block74;
                    }
                    case 41: {
                        androidx.constraintlayout.widget.e.o(this, (TypedArray)context, n9, 0);
                        continue block74;
                    }
                    case 40: {
                        this.Y = context.getInt(n9, this.Y);
                        continue block74;
                    }
                    case 39: {
                        this.X = context.getInt(n9, this.X);
                        continue block74;
                    }
                    case 38: {
                        this.V = context.getFloat(n9, this.V);
                        continue block74;
                    }
                    case 37: {
                        this.W = context.getFloat(n9, this.W);
                        continue block74;
                    }
                    case 36: {
                        this.z = context.getFloat(n9, this.z);
                        continue block74;
                    }
                    case 35: {
                        this.n = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.n);
                        continue block74;
                    }
                    case 34: {
                        this.o = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.o);
                        continue block74;
                    }
                    case 33: {
                        this.J = context.getDimensionPixelSize(n9, this.J);
                        continue block74;
                    }
                    case 32: {
                        this.v = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.v);
                        continue block74;
                    }
                    case 31: {
                        this.u = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.u);
                        continue block74;
                    }
                    case 30: {
                        this.M = context.getDimensionPixelSize(n9, this.M);
                        continue block74;
                    }
                    case 29: {
                        this.m = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.m);
                        continue block74;
                    }
                    case 28: {
                        this.l = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.l);
                        continue block74;
                    }
                    case 27: {
                        this.I = context.getDimensionPixelSize(n9, this.I);
                        continue block74;
                    }
                    case 26: {
                        this.G = context.getInt(n9, this.G);
                        continue block74;
                    }
                    case 25: {
                        this.k = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.k);
                        continue block74;
                    }
                    case 24: {
                        this.j = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.j);
                        continue block74;
                    }
                    case 23: {
                        this.H = context.getDimensionPixelSize(n9, this.H);
                        continue block74;
                    }
                    case 22: {
                        this.d = context.getLayoutDimension(n9, this.d);
                        continue block74;
                    }
                    case 21: {
                        this.e = context.getLayoutDimension(n9, this.e);
                        continue block74;
                    }
                    case 20: {
                        this.y = context.getFloat(n9, this.y);
                        continue block74;
                    }
                    case 19: {
                        this.h = context.getFloat(n9, this.h);
                        continue block74;
                    }
                    case 18: {
                        this.g = context.getDimensionPixelOffset(n9, this.g);
                        continue block74;
                    }
                    case 17: {
                        this.f = context.getDimensionPixelOffset(n9, this.f);
                        continue block74;
                    }
                    case 16: {
                        this.P = context.getDimensionPixelSize(n9, this.P);
                        continue block74;
                    }
                    case 15: {
                        this.T = context.getDimensionPixelSize(n9, this.T);
                        continue block74;
                    }
                    case 14: {
                        this.Q = context.getDimensionPixelSize(n9, this.Q);
                        continue block74;
                    }
                    case 13: {
                        this.O = context.getDimensionPixelSize(n9, this.O);
                        continue block74;
                    }
                    case 12: {
                        this.S = context.getDimensionPixelSize(n9, this.S);
                        continue block74;
                    }
                    case 11: {
                        this.R = context.getDimensionPixelSize(n9, this.R);
                        continue block74;
                    }
                    case 10: {
                        this.w = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.w);
                        continue block74;
                    }
                    case 9: {
                        this.x = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.x);
                        continue block74;
                    }
                    case 8: {
                        this.L = context.getDimensionPixelSize(n9, this.L);
                        continue block74;
                    }
                    case 7: {
                        this.F = context.getDimensionPixelOffset(n9, this.F);
                        continue block74;
                    }
                    case 6: {
                        this.E = context.getDimensionPixelOffset(n9, this.E);
                        continue block74;
                    }
                    case 5: {
                        this.A = context.getString(n9);
                        continue block74;
                    }
                    case 4: {
                        this.p = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.p);
                        continue block74;
                    }
                    case 3: {
                        this.q = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.q);
                        continue block74;
                    }
                    case 2: {
                        this.K = context.getDimensionPixelSize(n9, this.K);
                        continue block74;
                    }
                    case 1: {
                        this.r = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.r);
                    }
                }
            }
            context.recycle();
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
            SparseIntArray sparseIntArray;
            o = sparseIntArray = new SparseIntArray();
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

        public void a(c c8) {
            this.a = c8.a;
            this.b = c8.b;
            this.d = c8.d;
            this.e = c8.e;
            this.f = c8.f;
            this.i = c8.i;
            this.g = c8.g;
            this.h = c8.h;
        }

        void b(Context context, AttributeSet object) {
            context = context.obtainStyledAttributes((AttributeSet)object, ax.L.c.O6);
            this.a = true;
            int n8 = context.getIndexCount();
            block12: for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                switch (o.get(n9)) {
                    default: {
                        continue block12;
                    }
                    case 10: {
                        int n10 = context.peekValue((int)n9).type;
                        if (n10 == 1) {
                            this.n = n10 = context.getResourceId(n9, -1);
                            if (n10 == -1) continue block12;
                            this.m = -2;
                            continue block12;
                        }
                        if (n10 == 3) {
                            object = context.getString(n9);
                            this.l = object;
                            if (((String)object).indexOf("/") > 0) {
                                this.n = context.getResourceId(n9, -1);
                                this.m = -2;
                                continue block12;
                            }
                            this.m = -1;
                            continue block12;
                        }
                        this.m = context.getInteger(n9, this.n);
                        continue block12;
                    }
                    case 9: {
                        this.j = context.getFloat(n9, this.j);
                        continue block12;
                    }
                    case 8: {
                        this.k = context.getInteger(n9, this.k);
                        continue block12;
                    }
                    case 7: {
                        this.g = context.getFloat(n9, this.g);
                        continue block12;
                    }
                    case 6: {
                        this.c = context.getInteger(n9, this.c);
                        continue block12;
                    }
                    case 5: {
                        this.b = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.b);
                        continue block12;
                    }
                    case 4: {
                        this.f = context.getInt(n9, 0);
                        continue block12;
                    }
                    case 3: {
                        if (context.peekValue((int)n9).type == 3) {
                            this.d = context.getString(n9);
                            continue block12;
                        }
                        this.d = ax.F.b.c[context.getInteger(n9, 0)];
                        continue block12;
                    }
                    case 2: {
                        this.e = context.getInt(n9, this.e);
                        continue block12;
                    }
                    case 1: {
                        this.i = context.getFloat(n9, this.i);
                    }
                }
            }
            context.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d d8) {
            this.a = d8.a;
            this.b = d8.b;
            this.d = d8.d;
            this.e = d8.e;
            this.c = d8.c;
        }

        void b(Context context, AttributeSet attributeSet) {
            context = context.obtainStyledAttributes(attributeSet, ax.L.c.l7);
            this.a = true;
            int n8 = context.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                if (n9 == ax.L.c.n7) {
                    this.d = context.getFloat(n9, this.d);
                    continue;
                }
                if (n9 == ax.L.c.m7) {
                    this.b = context.getInt(n9, this.b);
                    this.b = f[this.b];
                    continue;
                }
                if (n9 == ax.L.c.p7) {
                    this.c = context.getInt(n9, this.c);
                    continue;
                }
                if (n9 != ax.L.c.o7) continue;
                this.e = context.getFloat(n9, this.e);
            }
            context.recycle();
        }
    }

    public static class e {
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
            SparseIntArray sparseIntArray;
            o = sparseIntArray = new SparseIntArray();
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

        public void a(e e8) {
            this.a = e8.a;
            this.b = e8.b;
            this.c = e8.c;
            this.d = e8.d;
            this.e = e8.e;
            this.f = e8.f;
            this.g = e8.g;
            this.h = e8.h;
            this.i = e8.i;
            this.j = e8.j;
            this.k = e8.k;
            this.l = e8.l;
            this.m = e8.m;
            this.n = e8.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            context = context.obtainStyledAttributes(attributeSet, ax.L.c.D7);
            this.a = true;
            int n8 = context.getIndexCount();
            block14: for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                switch (o.get(n9)) {
                    default: {
                        continue block14;
                    }
                    case 12: {
                        this.i = androidx.constraintlayout.widget.e.n((TypedArray)context, n9, this.i);
                        continue block14;
                    }
                    case 11: {
                        this.m = true;
                        this.n = context.getDimension(n9, this.n);
                        continue block14;
                    }
                    case 10: {
                        this.l = context.getDimension(n9, this.l);
                        continue block14;
                    }
                    case 9: {
                        this.k = context.getDimension(n9, this.k);
                        continue block14;
                    }
                    case 8: {
                        this.j = context.getDimension(n9, this.j);
                        continue block14;
                    }
                    case 7: {
                        this.h = context.getDimension(n9, this.h);
                        continue block14;
                    }
                    case 6: {
                        this.g = context.getDimension(n9, this.g);
                        continue block14;
                    }
                    case 5: {
                        this.f = context.getFloat(n9, this.f);
                        continue block14;
                    }
                    case 4: {
                        this.e = context.getFloat(n9, this.e);
                        continue block14;
                    }
                    case 3: {
                        this.d = context.getFloat(n9, this.d);
                        continue block14;
                    }
                    case 2: {
                        this.c = context.getFloat(n9, this.c);
                        continue block14;
                    }
                    case 1: {
                        this.b = context.getFloat(n9, this.b);
                    }
                }
            }
            context.recycle();
        }
    }
}

