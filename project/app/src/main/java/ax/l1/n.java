/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import ax.P0.N;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.T;
import ax.S0.d0;
import ax.Y0.V;
import ax.Y0.W;
import ax.i1.F;
import ax.i1.q0;
import ax.l1.A;
import ax.l1.B;
import ax.l1.D;
import ax.l1.G;
import ax.l1.I;
import ax.l1.a;
import ax.l1.l;
import ax.l1.m;
import ax.l1.o;
import ax.l1.p;
import ax.l1.q;
import ax.l1.r;
import ax.l1.s;
import ax.l1.t;
import ax.l1.u;
import ax.l1.v;
import ax.l1.w;
import ax.l1.x;
import ax.l1.y;
import ax.l1.z;
import ax.r7.z;
import ax.v0.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class n
extends G
implements N0.a {
    private static final ax.r7.T<Integer> l = ax.r7.T.b(new ax.l1.d());
    private final Object d = new Object();
    public final Context e;
    private final D.b f;
    private e g;
    private Thread h;
    private h i;
    private ax.P0.c j;
    private Boolean k;

    public n(Context context) {
        this(context, (D.b)new a.b());
    }

    public n(Context context, T t8, D.b b8) {
        this(t8, b8, context);
    }

    public n(Context context, D.b b8) {
        this(context, ax.l1.n$e.G0, b8);
    }

    @Deprecated
    public n(T t8, D.b b8) {
        this(t8, b8, null);
    }

    private n(T t8, D.b b8, Context context) {
        Context context2 = context != null ? context.getApplicationContext() : null;
        this.e = context2;
        this.f = b8;
        this.g = t8 instanceof e ? (e)t8 : ax.l1.n$e.G0.P().r0(t8).m0();
        this.j = ax.P0.c.h;
        if (this.g.z0 && context == null) {
            ax.S0.u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* synthetic */ int A(String string) {
        return n.N(string);
    }

    private static void F(G.a a8, e e8, D.a[] aArray) {
        int n8 = a8.d();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = a8.g(i8);
            if (!e8.V(i8, (q0)object)) continue;
            g g8 = e8.U(i8, (q0)object);
            object = g8 != null && g8.b.length != 0 ? new D.a(((q0)object).c(g8.a), g8.b, g8.d) : null;
            aArray[i8] = object;
        }
    }

    private static void G(G.a a8, T object, D.a[] aArray) {
        int n8;
        int n9 = a8.d();
        HashMap<Integer, Q> hashMap = new HashMap<Integer, Q>();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n.H(a8.g(n8), (T)object, hashMap);
        }
        n.H(a8.j(), (T)object, hashMap);
        for (n8 = n10; n8 < n9; ++n8) {
            object = hashMap.get(a8.f(n8));
            if (object == null) continue;
            object = !((Q)object).b.isEmpty() && a8.g(n8).e(((Q)object).a) != -1 ? new D.a(((Q)object).a, ax.u7.f.o(((Q)object).b)) : null;
            aArray[n8] = object;
        }
    }

    private static void H(q0 q02, T t8, Map<Integer, Q> map) {
        for (int i8 = 0; i8 < q02.a; ++i8) {
            Object object = q02.c(i8);
            Q q8 = t8.D.get(object);
            if (q8 == null || (object = map.get(q8.b())) != null && (!((Q)object).b.isEmpty() || q8.b.isEmpty())) continue;
            map.put(q8.b(), q8);
        }
    }

    protected static int I(ax.P0.v object, String string, boolean bl) {
        if (!TextUtils.isEmpty((CharSequence)string) && string.equals(((ax.P0.v)object).d)) {
            return 4;
        }
        string = n.V(string);
        object = n.V(((ax.P0.v)object).d);
        if (object != null && string != null) {
            if (!((String)object).startsWith(string) && !string.startsWith((String)object)) {
                if (d0.y1((String)object, "-")[0].equals(d0.y1(string, "-")[0])) {
                    return 2;
                }
                return 0;
            }
            return 3;
        }
        if (bl && object == null) {
            return 1;
        }
        return 0;
    }

    private static int J(P p8, int n8, int n9, boolean bl) {
        int n10;
        int n11 = n10 = Integer.MAX_VALUE;
        if (n8 != Integer.MAX_VALUE) {
            if (n9 == Integer.MAX_VALUE) {
                n11 = n10;
            } else {
                int n12 = 0;
                while (true) {
                    n11 = n10;
                    if (n12 >= p8.a) break;
                    ax.P0.v v8 = p8.b(n12);
                    int n13 = v8.v;
                    n11 = n10;
                    if (n13 > 0) {
                        int n14 = v8.w;
                        n11 = n10;
                        if (n14 > 0) {
                            Point point = I.d(bl, n8, n9, n13, n14);
                            n13 = v8.v;
                            int n15 = v8.w;
                            n14 = n13 * n15;
                            n11 = n10;
                            if (n13 >= (int)((float)point.x * 0.98f)) {
                                n11 = n10;
                                if (n15 >= (int)((float)point.y * 0.98f)) {
                                    n11 = n10;
                                    if (n14 < n10) {
                                        n11 = n14;
                                    }
                                }
                            }
                        }
                    }
                    ++n12;
                    n10 = n11;
                }
            }
        }
        return n11;
    }

    private static String L(Context object) {
        if (object == null) {
            return null;
        }
        if ((object = (CaptioningManager)object.getSystemService("captioning")) != null && object.isEnabled()) {
            if ((object = object.getLocale()) == null) {
                return null;
            }
            return d0.f0((Locale)object);
        }
        return null;
    }

    private static int M(int n8, int n9) {
        if (n8 != 0 && n8 == n9) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(n8 & n9);
    }

    private static int N(String string) {
        if (string == null) {
            return 0;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1599127257: {
                if (!string.equals("video/x-vnd.on2.vp9")) break;
                n8 = 4;
                break;
            }
            case 1331836730: {
                if (!string.equals("video/avc")) break;
                n8 = 3;
                break;
            }
            case -1662541442: {
                if (!string.equals("video/hevc")) break;
                n8 = 2;
                break;
            }
            case -1662735862: {
                if (!string.equals("video/av01")) break;
                n8 = 1;
                break;
            }
            case -1851077871: {
                if (!string.equals("video/dolby-vision")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return 0;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 0: 
        }
        return 5;
    }

    private boolean O(ax.P0.v v8, e object) {
        int n8;
        return !((e)object).z0 || (object = this.k) != null && ((Boolean)object).booleanValue() || (n8 = v8.G) == -1 || n8 <= 2 || n.P(v8) && (Build.VERSION.SDK_INT < 32 || (object = this.i) == null || !((h)object).d()) || Build.VERSION.SDK_INT >= 32 && (object = this.i) != null && ((h)object).d() && this.i.b() && this.i.c() && this.i.a(this.j, v8);
        {
        }
    }

    private static boolean P(ax.P0.v object) {
        object = ((ax.P0.v)object).o;
        if (object == null) {
            return false;
        }
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1504578661: {
                if (!((String)object).equals("audio/eac3")) break;
                n8 = 3;
                break;
            }
            case 187078297: {
                if (!((String)object).equals("audio/ac4")) break;
                n8 = 2;
                break;
            }
            case 187078296: {
                if (!((String)object).equals("audio/ac3")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!((String)object).equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
        }
        return true;
    }

    private static boolean Q(ax.P0.v object) {
        object = ((ax.P0.v)object).o;
        if (object == null) {
            return false;
        }
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1504698186: {
                if (!((String)object).equals("audio/iamf")) break;
                n8 = 2;
                break;
            }
            case 187078297: {
                if (!((String)object).equals("audio/ac4")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!((String)object).equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
        }
        return true;
    }

    private static void R(e object, G.a a8, int[][][] nArray, W[] wArray, D[] dArray) {
        int n8;
        int n9 = -1;
        boolean bl = false;
        int n10 = 0;
        for (n8 = 0; n8 < a8.d(); ++n8) {
            int n11 = a8.f(n8);
            D d8 = dArray[n8];
            if (n11 != 1 && d8 != null) {
                return;
            }
            int n12 = n9;
            int n13 = n10;
            if (n11 == 1) {
                n12 = n9;
                n13 = n10;
                if (d8 != null) {
                    n12 = n9;
                    n13 = n10;
                    if (d8.length() == 1) {
                        n11 = a8.g(n8).e(d8.b());
                        n12 = n9;
                        n13 = n10;
                        if (n.W((e)object, nArray[n8][n11][d8.j(0)], d8.m())) {
                            n13 = n10 + 1;
                            n12 = n8;
                        }
                    }
                }
            }
            n9 = n12;
            n10 = n13;
        }
        if (n10 == 1) {
            n8 = ((T)object).u.b ? 1 : 2;
            object = wArray[n9];
            boolean bl2 = bl;
            if (object != null) {
                bl2 = bl;
                if (((W)object).b) {
                    bl2 = true;
                }
            }
            wArray[n9] = new W(n8, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void S(G.a object, int[][][] nArray, W[] wArray, D[] dArray) {
        int n8;
        int n9;
        int n10;
        int n11;
        block3: {
            n11 = -1;
            n10 = -1;
            for (n9 = 0; n9 < ((G.a)object).d(); ++n9) {
                int n12;
                block5: {
                    block8: {
                        block7: {
                            block6: {
                                D d8;
                                int n13;
                                block4: {
                                    n13 = ((G.a)object).f(n9);
                                    d8 = dArray[n9];
                                    if (n13 == 1) break block4;
                                    n8 = n11;
                                    n12 = n10;
                                    if (n13 != 2) break block5;
                                }
                                n8 = n11;
                                n12 = n10;
                                if (d8 == null) break block5;
                                n8 = n11;
                                n12 = n10;
                                if (!n.X(nArray[n9], ((G.a)object).g(n9), d8)) break block5;
                                if (n13 != 1) break block6;
                                if (n10 != -1) break block7;
                                n12 = n9;
                                n8 = n11;
                                break block5;
                            }
                            if (n11 == -1) break block8;
                        }
                        n9 = 0;
                        break block3;
                    }
                    n8 = n9;
                    n12 = n10;
                }
                n11 = n8;
                n10 = n12;
            }
            n9 = 1;
        }
        n8 = n10 != -1 && n11 != -1 ? 1 : 0;
        if ((n9 & n8) != 0) {
            wArray[n10] = object = new W(0, true);
            wArray[n11] = object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void T() {
        Object object = this.d;
        synchronized (object) {
            try {
                if (!this.g.z0) return;
                if (Build.VERSION.SDK_INT < 32) return;
                h h8 = this.i;
                if (h8 == null) return;
                if (!h8.d()) return;
                boolean bl = true;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : var2_1
                if (!bl) return;
                this.f();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void U(M0 m02) {
        Object object = this.d;
        // MONITORENTER : object
        boolean bl = this.g.D0;
        // MONITOREXIT : object
        if (!bl) return;
        this.g(m02);
    }

    protected static String V(String string) {
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.equals((CharSequence)string, (CharSequence)"und")) {
            return string;
        }
        return null;
    }

    private static boolean W(e e8, int n8, ax.P0.v v8) {
        if (V.g(n8) == 0) {
            return false;
        }
        if (e8.u.c && (V.g(n8) & 0x800) == 0) {
            return false;
        }
        if (e8.u.b) {
            boolean bl = v8.J != 0 || v8.K != 0;
            n8 = (V.g(n8) & 0x400) != 0 ? 1 : 0;
            if (bl && n8 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean X(int[][] nArray, q0 q02, D d8) {
        if (d8 == null) {
            return false;
        }
        int n8 = q02.e(d8.b());
        for (int i8 = 0; i8 < d8.length(); ++i8) {
            if (V.k(nArray[n8][d8.j(i8)]) == 32) continue;
            return false;
        }
        return true;
    }

    private <T extends j<T>> Pair<D.a, Integer> d0(int n8, G.a object, int[][][] object2, j.a<T> a8, Comparator<List<T>> comparator) {
        ArrayList<AbstractCollection> arrayList = new ArrayList<AbstractCollection>();
        int n9 = ((G.a)object).d();
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = n9;
            if (n8 == ((G.a)object).f(i8)) {
                q0 q02 = ((G.a)object).g(i8);
                int n11 = 0;
                while (true) {
                    n10 = n9;
                    if (n11 >= q02.a) break;
                    P p8 = q02.c(n11);
                    List<T> list = a8.a(i8, p8, (int[])object2[i8][n11]);
                    boolean[] blArray = new boolean[p8.a];
                    for (n10 = 0; n10 < p8.a; ++n10) {
                        AbstractCollection abstractCollection;
                        j j8 = (j)list.get(n10);
                        int n12 = j8.d();
                        if (blArray[n10] || n12 == 0) continue;
                        if (n12 == 1) {
                            abstractCollection = ax.r7.z.A(j8);
                        } else {
                            abstractCollection = new ArrayList();
                            abstractCollection.add((j)j8);
                            for (n12 = n10 + 1; n12 < p8.a; ++n12) {
                                j j9 = (j)list.get(n12);
                                if (j9.d() != 2 || !j8.h(j9)) continue;
                                abstractCollection.add(j9);
                                blArray[n12] = true;
                            }
                        }
                        arrayList.add(abstractCollection);
                    }
                    ++n11;
                }
            }
            n9 = n10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        object2 = Collections.max(arrayList, comparator);
        object = new int[object2.size()];
        for (n8 = 0; n8 < object2.size(); ++n8) {
            object[n8] = ((j)object2.get((int)n8)).d0;
        }
        object2 = (j)object2.get(0);
        return Pair.create((Object)new D.a(((j)object2).c0, (int[])object), (Object)((j)object2).q);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void f0(e e8) {
        ax.S0.a.e(e8);
        Object object = this.d;
        // MONITORENTER : object
        boolean bl = this.g.equals(e8);
        this.g = e8;
        // MONITOREXIT : object
        if (bl) return;
        if (e8.z0 && this.e == null) {
            ax.S0.u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        this.f();
    }

    public static /* synthetic */ List s(n n8, e e8, boolean bl, int[] nArray, int n9, P p8, int[] nArray2) {
        n8.getClass();
        return b.n(n9, p8, e8, nArray2, bl, new m(n8, e8), nArray[n9]);
    }

    public static /* synthetic */ List t(e e8, int n8, P p8, int[] nArray) {
        return c.n(n8, p8, e8, nArray);
    }

    public static /* synthetic */ boolean u(n n8, e e8, ax.P0.v v8) {
        return n8.O(v8, e8);
    }

    public static /* synthetic */ List v(e e8, String string, int[] nArray, Point point, int n8, P p8, int[] nArray2) {
        return ax.l1.n$k.r(n8, p8, e8, nArray2, string, nArray[n8], point);
    }

    public static /* synthetic */ int w(Integer n8, Integer n9) {
        if (n8 == -1) {
            if (n9 == -1) {
                return 0;
            }
            return -1;
        }
        if (n9 == -1) {
            return 1;
        }
        return n8 - n9;
    }

    public static /* synthetic */ List x(e e8, String string, String string2, int n8, P p8, int[] nArray) {
        return ax.l1.n$i.n(n8, p8, e8, nArray, string, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e K() {
        Object object = this.d;
        synchronized (object) {
            return this.g;
        }
    }

    protected D.a[] Y(G.a a8, int[][][] nArray, int[] object, e e8) throws androidx.media3.exoplayer.s {
        Pair<D.a, Integer> pair;
        int n8;
        Object object2;
        D.a[] aArray;
        int n9;
        block13: {
            block12: {
                n9 = a8.d();
                aArray = new D.a[n9];
                object2 = this.Z(a8, nArray, (int[])object, e8);
                if (object2 != null) {
                    aArray[((Integer)object2.second).intValue()] = (D.a)object2.first;
                }
                n8 = 0;
                Object var9_9 = null;
                if (object2 == null) {
                    object2 = null;
                } else {
                    object2 = object2.first;
                    object2 = ((D.a)object2).a.b((int)((D.a)object2).b[0]).d;
                }
                pair = this.e0(a8, nArray, (int[])object, e8, (String)object2);
                if (e8.A) break block12;
                object = var9_9;
                if (pair != null) break block13;
            }
            object = this.a0(a8, nArray, e8);
        }
        if (object != null) {
            aArray[((Integer)object.second).intValue()] = (D.a)object.first;
        } else if (pair != null) {
            aArray[((Integer)pair.second).intValue()] = (D.a)pair.first;
        }
        object = this.c0(a8, nArray, e8, (String)object2);
        int n10 = n8;
        if (object != null) {
            aArray[((Integer)object.second).intValue()] = (D.a)object.first;
            n10 = n8;
        }
        while (n10 < n9) {
            n8 = a8.f(n10);
            if (n8 != 2 && n8 != 1 && n8 != 3 && n8 != 4) {
                aArray[n10] = this.b0(n8, a8.g(n10), nArray[n10], e8);
            }
            ++n10;
        }
        return aArray;
    }

    protected Pair<D.a, Integer> Z(G.a a8, int[][][] nArray, int[] nArray2, e e8) throws androidx.media3.exoplayer.s {
        boolean bl;
        boolean bl2 = false;
        int n8 = 0;
        while (true) {
            bl = bl2;
            if (n8 >= a8.d()) break;
            if (2 == a8.f(n8) && a8.g((int)n8).a > 0) {
                bl = true;
                break;
            }
            ++n8;
        }
        return this.d0(1, a8, nArray, new ax.l1.i(this, e8, bl, nArray2), new ax.l1.j());
    }

    @Override
    public void a(M0 m02) {
        this.U(m02);
    }

    protected Pair<D.a, Integer> a0(G.a a8, int[][][] nArray, e e8) throws androidx.media3.exoplayer.s {
        if (e8.u.a == 2) {
            return null;
        }
        return this.d0(4, a8, nArray, new ax.l1.e(e8), new ax.l1.f());
    }

    protected D.a b0(int n8, q0 q02, int[][] nArray, e e8) throws androidx.media3.exoplayer.s {
        if (e8.u.a == 2) {
            return null;
        }
        P p8 = null;
        d d8 = null;
        int n9 = 0;
        for (int i8 = 0; i8 < q02.a; ++i8) {
            P p9 = q02.c(i8);
            int[] nArray2 = nArray[i8];
            for (n8 = 0; n8 < p9.a; ++n8) {
                d d9;
                int n10;
                P p10;
                block7: {
                    d d10;
                    block8: {
                        p10 = p8;
                        n10 = n9;
                        d9 = d8;
                        if (!V.l(nArray2[n8], e8.A0)) break block7;
                        d10 = new d(p9.b(n8), nArray2[n8]);
                        if (d8 == null) break block8;
                        p10 = p8;
                        n10 = n9;
                        d9 = d8;
                        if (d10.d(d8) <= 0) break block7;
                    }
                    p10 = p9;
                    n10 = n8;
                    d9 = d10;
                }
                p8 = p10;
                n9 = n10;
                d8 = d9;
            }
        }
        if (p8 == null) {
            return null;
        }
        return new D.a(p8, n9);
    }

    protected Pair<D.a, Integer> c0(G.a a8, int[][][] nArray, e e8, String string) throws androidx.media3.exoplayer.s {
        int n8 = e8.u.a;
        String string2 = null;
        if (n8 == 2) {
            return null;
        }
        if (e8.x) {
            string2 = n.L(this.e);
        }
        return this.d0(3, a8, nArray, new ax.l1.k(e8, string, string2), new l());
    }

    @Override
    public N0.a d() {
        return this;
    }

    protected Pair<D.a, Integer> e0(G.a a8, int[][][] nArray, int[] nArray2, e e8, String string) throws androidx.media3.exoplayer.s {
        int n8 = e8.u.a;
        Point point = null;
        if (n8 == 2) {
            return null;
        }
        Point point2 = point;
        if (e8.k) {
            Context context = this.e;
            point2 = point;
            if (context != null) {
                point2 = d0.V(context);
            }
        }
        return this.d0(2, a8, nArray, new ax.l1.g(e8, string, nArray2, point2), new ax.l1.h());
    }

    @Override
    public boolean h() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j() {
        Object object = this.d;
        synchronized (object) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    boolean bl = thread == Thread.currentThread();
                    ax.S0.a.h(bl, "DefaultTrackSelector is accessed on the wrong thread.");
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var2_1
                if (Build.VERSION.SDK_INT >= 32 && (object = this.i) != null) {
                    ((h)object).e();
                    this.i = null;
                }
                super.j();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void l(ax.P0.c c8) {
        if (this.j.equals(c8)) {
            return;
        }
        this.j = c8;
        this.T();
    }

    @Override
    public void m(T t8) {
        if (t8 instanceof e) {
            this.f0((e)t8);
        }
        this.f0(new e.a(this.K()).r0(t8).m0());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    protected final Pair<W[], D[]> r(G.a a8, int[][][] nArray, int[] object, F.b wArray, N dArray) throws androidx.media3.exoplayer.s {
        int n8;
        Object object2 = this.d;
        // MONITORENTER : object2
        this.h = Thread.currentThread();
        e e8 = this.g;
        // MONITOREXIT : object2
        if (this.k == null && (object2 = this.e) != null) {
            this.k = d0.S0((Context)object2);
        }
        if (e8.z0 && Build.VERSION.SDK_INT >= 32 && this.i == null) {
            this.i = new h(this.e, this, this.k);
        }
        int n9 = a8.d();
        object = this.Y(a8, nArray, (int[])object, e8);
        n.G(a8, e8, (D.a[])object);
        n.F(a8, e8, (D.a[])object);
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            int n11 = a8.f(n8);
            if (!e8.T(n8) && !e8.E.contains(n11)) continue;
            object[n8] = (int)null;
        }
        dArray = this.f.a((D.a[])object, this.b(), (F.b)wArray, (N)dArray);
        wArray = new W[n9];
        for (n8 = n10; n8 < n9; ++n8) {
            n10 = a8.f(n8);
            object = !e8.T(n8) && !e8.E.contains(n10) && (a8.f(n8) == -2 || dArray[n8] != null) ? (Object)W.c : null;
            wArray[n8] = object;
        }
        if (e8.B0) {
            n.S(a8, nArray, wArray, dArray);
        }
        if (e8.u.a == 0) return Pair.create((Object)wArray, (Object)dArray);
        n.R(e8, a8, nArray, wArray, dArray);
        return Pair.create((Object)wArray, (Object)dArray);
    }

    private static final class b
    extends j<b>
    implements Comparable<b> {
        private final int f0;
        private final boolean g0;
        private final String h0;
        private final e i0;
        private final boolean j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final boolean n0;
        private final boolean o0;
        private final int p0;
        private final int q0;
        private final boolean r0;
        private final int s0;
        private final int t0;
        private final int u0;
        private final int v0;
        private final boolean w0;
        private final boolean x0;
        private final boolean y0;

        public b(int n8, P object, int n9, e e8, int n10, boolean bl, ax.q7.o<ax.P0.v> o8, int n11) {
            int n12;
            boolean bl2;
            boolean bl3;
            block7: {
                block6: {
                    super(n8, (P)object, n9);
                    this.i0 = e8;
                    n9 = e8.y0 ? 24 : 16;
                    bl3 = e8.u0;
                    bl2 = true;
                    bl3 = bl3 && (n11 & n9) != 0;
                    this.n0 = bl3;
                    this.h0 = n.V(this.e0.d);
                    this.j0 = V.l(n10, false);
                    n8 = 0;
                    while (true) {
                        n11 = e8.p.size();
                        n12 = Integer.MAX_VALUE;
                        if (n8 >= n11) break;
                        int n13 = n.I(this.e0, (String)e8.p.get(n8), false);
                        if (n13 > 0) {
                            n11 = n8;
                            n8 = n13;
                            break block6;
                        }
                        ++n8;
                    }
                    n11 = Integer.MAX_VALUE;
                    n8 = 0;
                }
                this.l0 = n11;
                this.k0 = n8;
                this.m0 = n.M(this.e0.f, e8.q);
                object = this.e0;
                n8 = ((ax.P0.v)object).f;
                bl3 = n8 == 0 || (n8 & 1) != 0;
                this.o0 = bl3;
                bl3 = (((ax.P0.v)object).e & 1) != 0;
                this.r0 = bl3;
                this.y0 = n.Q((ax.P0.v)object);
                object = this.e0;
                this.s0 = n8 = ((ax.P0.v)object).G;
                this.t0 = ((ax.P0.v)object).H;
                this.u0 = n11 = ((ax.P0.v)object).j;
                bl3 = !(n11 != -1 && n11 > e8.s || n8 != -1 && n8 > e8.r || !o8.apply((ax.P0.v)object));
                this.g0 = bl3;
                object = d0.r0();
                for (n8 = 0; n8 < ((String[])object).length; ++n8) {
                    n11 = n.I(this.e0, object[n8], false);
                    if (n11 <= 0) {
                        continue;
                    }
                    break block7;
                }
                n8 = Integer.MAX_VALUE;
                n11 = 0;
            }
            this.p0 = n8;
            this.q0 = n11;
            n8 = 0;
            while (true) {
                n11 = n12;
                if (n8 >= e8.t.size()) break;
                object = this.e0.o;
                if (object != null && ((String)object).equals(e8.t.get(n8))) {
                    n11 = n8;
                    break;
                }
                ++n8;
            }
            this.v0 = n11;
            bl3 = V.h(n10) == 128;
            this.w0 = bl3;
            bl3 = V.j(n10) == 64 ? bl2 : false;
            this.x0 = bl3;
            this.f0 = this.p(n10, bl, n9);
        }

        public static int j(List<b> list, List<b> list2) {
            return Collections.max(list).l(Collections.max(list2));
        }

        public static ax.r7.z<b> n(int n8, P p8, e e8, int[] nArray, boolean bl, ax.q7.o<ax.P0.v> o8, int n9) {
            z.a<b> a8 = ax.r7.z.r();
            for (int i8 = 0; i8 < p8.a; ++i8) {
                a8.h(new b(n8, p8, i8, e8, nArray[i8], bl, o8, n9));
            }
            return a8.k();
        }

        private int p(int n8, boolean bl, int n9) {
            if (!V.l(n8, this.i0.A0)) {
                return 0;
            }
            if (!this.g0 && !this.i0.t0) {
                return 0;
            }
            e e8 = this.i0;
            if (e8.u.a == 2 && !n.W(e8, n8, this.e0)) {
                return 0;
            }
            if (V.l(n8, false) && this.g0 && this.e0.j != -1) {
                e8 = this.i0;
                if (!(e8.C || e8.B || !e8.C0 && bl || e8.u.a == 2 || (n8 & n9) == 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override
        public int d() {
            return this.f0;
        }

        public int l(b b8) {
            ax.r7.n n8;
            ax.r7.T t8 = this.g0 && this.j0 ? l : l.g();
            ax.r7.n n9 = n8 = ax.r7.n.j().g(this.j0, b8.j0).f(this.l0, b8.l0, ax.r7.T.d().g()).d(this.k0, b8.k0).d(this.m0, b8.m0).g(this.r0, b8.r0).g(this.o0, b8.o0).f(this.p0, b8.p0, ax.r7.T.d().g()).d(this.q0, b8.q0).g(this.g0, b8.g0).f(this.v0, b8.v0, ax.r7.T.d().g());
            if (this.i0.B) {
                n9 = n8.f(this.u0, b8.u0, l.g());
            }
            n9 = n8 = n9.g(this.w0, b8.w0).g(this.x0, b8.x0).g(this.y0, b8.y0).f(this.s0, b8.s0, t8).f(this.t0, b8.t0, t8);
            if (j.Objects.equals((Object)this.h0, (Object)b8.h0)) {
                n9 = n8.f(this.u0, b8.u0, t8);
            }
            return n9.i();
        }

        public boolean q(b b8) {
            block3: {
                block2: {
                    Object object;
                    int n8;
                    if (!this.i0.w0 && ((n8 = this.e0.G) == -1 || n8 != b8.e0.G) || !this.n0 && ((object = this.e0.o) == null || !TextUtils.equals((CharSequence)object, (CharSequence)b8.e0.o))) break block2;
                    object = this.i0;
                    if ((((e)object).v0 || (n8 = this.e0.H) != -1 && n8 == b8.e0.H) && (((e)object).x0 || this.w0 == b8.w0 && this.x0 == b8.x0)) break block3;
                }
                return false;
            }
            return true;
        }
    }

    private static final class c
    extends j<c>
    implements Comparable<c> {
        private final int f0;
        private final int g0;

        public c(int n8, P p8, int n9, e e8, int n10) {
            super(n8, p8, n9);
            this.f0 = V.l(n10, e8.A0) ? 1 : 0;
            this.g0 = this.e0.g();
        }

        public static int j(List<c> list, List<c> list2) {
            return list.get(0).l(list2.get(0));
        }

        public static ax.r7.z<c> n(int n8, P p8, e e8, int[] nArray) {
            z.a<c> a8 = ax.r7.z.r();
            for (int i8 = 0; i8 < p8.a; ++i8) {
                a8.h(new c(n8, p8, i8, e8, nArray[i8]));
            }
            return a8.k();
        }

        @Override
        public int d() {
            return this.f0;
        }

        public int l(c c8) {
            return Integer.compare(this.g0, c8.g0);
        }

        public boolean p(c c8) {
            return false;
        }
    }

    private static final class d
    implements Comparable<d> {
        private final boolean c0;
        private final boolean q;

        public d(ax.P0.v v8, int n8) {
            int n9 = v8.e;
            boolean bl = true;
            if ((n9 & 1) == 0) {
                bl = false;
            }
            this.q = bl;
            this.c0 = V.l(n8, false);
        }

        public int d(d d8) {
            return ax.r7.n.j().g(this.c0, d8.c0).g(this.q, d8.q).i();
        }
    }

    public static final class e
    extends T {
        public static final e G0;
        @Deprecated
        public static final e H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;
        private static final String a1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        private final SparseArray<Map<q0, g>> E0;
        private final SparseBooleanArray F0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final boolean y0;
        public final boolean z0;

        static {
            e e8;
            G0 = e8 = new a().m0();
            H0 = e8;
            I0 = d0.G0(1000);
            J0 = d0.G0(1001);
            K0 = d0.G0(1002);
            L0 = d0.G0(1003);
            M0 = d0.G0(1004);
            N0 = d0.G0(1005);
            O0 = d0.G0(1006);
            P0 = d0.G0(1007);
            Q0 = d0.G0(1008);
            R0 = d0.G0(1009);
            S0 = d0.G0(1010);
            T0 = d0.G0(1011);
            U0 = d0.G0(1012);
            V0 = d0.G0(1013);
            W0 = d0.G0(1014);
            X0 = d0.G0(1015);
            Y0 = d0.G0(1016);
            Z0 = d0.G0(1017);
            a1 = d0.G0(1018);
        }

        private e(a a8) {
            super(a8);
            this.p0 = a8.F;
            this.q0 = a8.G;
            this.r0 = a8.H;
            this.s0 = a8.I;
            this.t0 = a8.J;
            this.u0 = a8.K;
            this.v0 = a8.L;
            this.w0 = a8.M;
            this.x0 = a8.N;
            this.y0 = a8.O;
            this.z0 = a8.P;
            this.A0 = a8.Q;
            this.B0 = a8.R;
            this.C0 = a8.S;
            this.D0 = a8.T;
            this.E0 = a8.U;
            this.F0 = a8.V;
        }

        private static boolean M(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int n8 = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != n8) {
                return false;
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i8)) >= 0) continue;
                return false;
            }
            return true;
        }

        private static boolean N(SparseArray<Map<q0, g>> sparseArray, SparseArray<Map<q0, g>> sparseArray2) {
            int n8 = sparseArray.size();
            if (sparseArray2.size() != n8) {
                return false;
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                if (n9 >= 0 && ax.l1.n$e.O((Map)sparseArray.valueAt(i8), (Map)sparseArray2.valueAt(n9))) {
                    continue;
                }
                return false;
            }
            return true;
        }

        private static boolean O(Map<q0, g> entry2, Map<q0, g> map) {
            int n8 = entry2.size();
            if (map.size() != n8) {
                return false;
            }
            for (Map.Entry<q0, g> entry2 : entry2.entrySet()) {
                q0 q02 = (q0)entry2.getKey();
                if (map.containsKey(q02) && j.Objects.equals(entry2.getValue(), (Object)map.get(q02))) continue;
                return false;
            }
            return true;
        }

        public static e Q(Bundle bundle) {
            return new a(bundle).m0();
        }

        @Deprecated
        public static e R(Context context) {
            return G0;
        }

        private static int[] S(SparseBooleanArray sparseBooleanArray) {
            int[] nArray = new int[sparseBooleanArray.size()];
            for (int i8 = 0; i8 < sparseBooleanArray.size(); ++i8) {
                nArray[i8] = sparseBooleanArray.keyAt(i8);
            }
            return nArray;
        }

        private static void W(Bundle bundle, SparseArray<Map<q0, g>> sparseArray) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList<q0> arrayList2 = new ArrayList<q0>();
            SparseArray sparseArray2 = new SparseArray();
            for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                int n8 = sparseArray.keyAt(i8);
                for (Map.Entry entry : ((Map)sparseArray.valueAt(i8)).entrySet()) {
                    g g8 = (g)entry.getValue();
                    if (g8 != null) {
                        sparseArray2.put(arrayList2.size(), (Object)g8);
                    }
                    arrayList2.add((q0)entry.getKey());
                    arrayList.add(n8);
                }
                bundle.putIntArray(S0, ax.u7.f.o(arrayList));
                bundle.putParcelableArrayList(T0, ax.S0.g.d(arrayList2, new o()));
                bundle.putSparseParcelableArray(U0, ax.S0.g.e(sparseArray2, new p()));
            }
        }

        @Override
        public Bundle J() {
            Bundle bundle = super.J();
            bundle.putBoolean(I0, this.p0);
            bundle.putBoolean(J0, this.q0);
            bundle.putBoolean(K0, this.r0);
            bundle.putBoolean(W0, this.s0);
            bundle.putBoolean(L0, this.t0);
            bundle.putBoolean(M0, this.u0);
            bundle.putBoolean(N0, this.v0);
            bundle.putBoolean(O0, this.w0);
            bundle.putBoolean(X0, this.x0);
            bundle.putBoolean(a1, this.y0);
            bundle.putBoolean(Y0, this.z0);
            bundle.putBoolean(P0, this.A0);
            bundle.putBoolean(Q0, this.B0);
            bundle.putBoolean(R0, this.C0);
            bundle.putBoolean(Z0, this.D0);
            ax.l1.n$e.W(bundle, this.E0);
            bundle.putIntArray(V0, ax.l1.n$e.S(this.F0));
            return bundle;
        }

        public a P() {
            return new a(this);
        }

        public boolean T(int n8) {
            return this.F0.get(n8);
        }

        @Deprecated
        public g U(int n8, q0 q02) {
            Map map = (Map)this.E0.get(n8);
            if (map != null) {
                return (g)map.get(q02);
            }
            return null;
        }

        @Deprecated
        public boolean V(int n8, q0 q02) {
            Map map = (Map)this.E0.get(n8);
            return map != null && map.containsKey(q02);
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            return object != null && e.class == object.getClass() && super.equals(object = (e)object) && this.p0 == ((e)object).p0 && this.q0 == ((e)object).q0 && this.r0 == ((e)object).r0 && this.s0 == ((e)object).s0 && this.t0 == ((e)object).t0 && this.u0 == ((e)object).u0 && this.v0 == ((e)object).v0 && this.w0 == ((e)object).w0 && this.x0 == ((e)object).x0 && this.y0 == ((e)object).y0 && this.z0 == ((e)object).z0 && this.A0 == ((e)object).A0 && this.B0 == ((e)object).B0 && this.C0 == ((e)object).C0 && this.D0 == ((e)object).D0 && ax.l1.n$e.M(this.F0, ((e)object).F0) && ax.l1.n$e.N(this.E0, ((e)object).E0);
        }

        @Override
        public int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31 + this.p0) * 31 + this.q0) * 31 + this.r0) * 31 + this.s0) * 31 + this.t0) * 31 + this.u0) * 31 + this.v0) * 31 + this.w0) * 31 + this.x0) * 31 + this.y0) * 31 + this.z0) * 31 + this.A0) * 31 + this.B0) * 31 + this.C0) * 31 + this.D0;
        }

        public static final class a
        extends T.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray<Map<q0, g>> U;
            private final SparseBooleanArray V;

            public a() {
                this.U = new SparseArray();
                this.V = new SparseBooleanArray();
                this.p0();
            }

            @Deprecated
            public a(Context context) {
                this();
            }

            private a(Bundle bundle) {
                super(bundle);
                this.p0();
                e e8 = G0;
                this.G0(bundle.getBoolean(I0, e8.p0));
                this.A0(bundle.getBoolean(J0, e8.q0));
                this.B0(bundle.getBoolean(K0, e8.r0));
                this.z0(bundle.getBoolean(W0, e8.s0));
                this.E0(bundle.getBoolean(L0, e8.t0));
                this.u0(bundle.getBoolean(M0, e8.u0));
                this.v0(bundle.getBoolean(N0, e8.v0));
                this.s0(bundle.getBoolean(O0, e8.w0));
                this.t0(bundle.getBoolean(X0, e8.x0));
                this.w0(bundle.getBoolean(a1, e8.y0));
                this.C0(bundle.getBoolean(Y0, e8.z0));
                this.F0(bundle.getBoolean(P0, e8.A0));
                this.S0(bundle.getBoolean(Q0, e8.B0));
                this.y0(bundle.getBoolean(R0, e8.C0));
                this.x0(bundle.getBoolean(Z0, e8.D0));
                this.U = new SparseArray();
                this.Q0(bundle);
                this.V = this.q0(bundle.getIntArray(V0));
            }

            private a(e e8) {
                super(e8);
                this.F = e8.p0;
                this.G = e8.q0;
                this.H = e8.r0;
                this.I = e8.s0;
                this.J = e8.t0;
                this.K = e8.u0;
                this.L = e8.v0;
                this.M = e8.w0;
                this.N = e8.x0;
                this.O = e8.y0;
                this.P = e8.z0;
                this.Q = e8.A0;
                this.R = e8.B0;
                this.S = e8.C0;
                this.T = e8.D0;
                this.U = a.o0((SparseArray<Map<q0, g>>)e8.E0);
                this.V = e8.F0.clone();
            }

            private void Q0(Bundle object) {
                int[] nArray = object.getIntArray(S0);
                AbstractCollection abstractCollection = object.getParcelableArrayList(T0);
                abstractCollection = abstractCollection == null ? ax.r7.z.z() : ax.S0.g.b(new q(), (List<Bundle>)((Object)abstractCollection));
                object = object.getSparseParcelableArray(U0);
                object = object == null ? new SparseArray() : ax.S0.g.c(new r(), (SparseArray<Bundle>)object);
                if (nArray != null && nArray.length == abstractCollection.size()) {
                    for (int i8 = 0; i8 < nArray.length; ++i8) {
                        this.P0(nArray[i8], (q0)abstractCollection.get(i8), (g)object.get(i8));
                    }
                }
            }

            private static SparseArray<Map<q0, g>> o0(SparseArray<Map<q0, g>> sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                    sparseArray2.put(sparseArray.keyAt(i8), new HashMap((Map)sparseArray.valueAt(i8)));
                }
                return sparseArray2;
            }

            private void p0() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            private SparseBooleanArray q0(int[] nArray) {
                if (nArray == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(nArray.length);
                int n8 = nArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    sparseBooleanArray.append(nArray[i8], true);
                }
                return sparseBooleanArray;
            }

            public a A0(boolean bl) {
                this.G = bl;
                return this;
            }

            public a B0(boolean bl) {
                this.H = bl;
                return this;
            }

            public a C0(boolean bl) {
                this.P = bl;
                return this;
            }

            public a D0(Set<Integer> set) {
                super.L(set);
                return this;
            }

            public a E0(boolean bl) {
                this.J = bl;
                return this;
            }

            public a F0(boolean bl) {
                this.Q = bl;
                return this;
            }

            public a G0(boolean bl) {
                this.F = bl;
                return this;
            }

            public a H0(int n8) {
                super.M(n8);
                return this;
            }

            public a I0(Q q8) {
                super.N(q8);
                return this;
            }

            public a J0(String string) {
                super.O(string);
                return this;
            }

            public a K0(String ... stringArray) {
                super.P(stringArray);
                return this;
            }

            public a L0(String string) {
                super.Q(string);
                return this;
            }

            public a M0(String ... stringArray) {
                super.R(stringArray);
                return this;
            }

            public a N0(int n8) {
                super.S(n8);
                return this;
            }

            public a O0(boolean bl) {
                super.T(bl);
                return this;
            }

            @Deprecated
            public a P0(int n8, q0 q02, g g8) {
                HashMap<q0, g> hashMap;
                HashMap<q0, g> hashMap2 = hashMap = (HashMap<q0, g>)this.U.get(n8);
                if (hashMap == null) {
                    hashMap2 = new HashMap<q0, g>();
                    this.U.put(n8, hashMap2);
                }
                if (hashMap2.containsKey(q02) && j.Objects.equals(hashMap2.get(q02), (Object)g8)) {
                    return this;
                }
                hashMap2.put(q02, g8);
                return this;
            }

            public a R0(int n8, boolean bl) {
                super.U(n8, bl);
                return this;
            }

            public a S0(boolean bl) {
                this.R = bl;
                return this;
            }

            public e m0() {
                return new e(this);
            }

            public a n0(int n8) {
                super.G(n8);
                return this;
            }

            protected a r0(T t8) {
                super.K(t8);
                return this;
            }

            public a s0(boolean bl) {
                this.M = bl;
                return this;
            }

            public a t0(boolean bl) {
                this.N = bl;
                return this;
            }

            public a u0(boolean bl) {
                this.K = bl;
                return this;
            }

            public a v0(boolean bl) {
                this.L = bl;
                return this;
            }

            public a w0(boolean bl) {
                this.O = bl;
                return this;
            }

            public a x0(boolean bl) {
                this.T = bl;
                return this;
            }

            public a y0(boolean bl) {
                this.S = bl;
                return this;
            }

            public a z0(boolean bl) {
                this.I = bl;
                return this;
            }
        }
    }

    @Deprecated
    public static final class f
    extends T.c {
        private final e.a F;

        public f(Context context) {
            this.F = new e.a(context);
        }

        public e V() {
            return this.F.m0();
        }

        public f W(int n8) {
            this.F.n0(n8);
            return this;
        }

        public f X(Set<Integer> set) {
            this.F.D0(set);
            return this;
        }

        public f Y(int n8) {
            this.F.H0(n8);
            return this;
        }

        public f Z(Q q8) {
            this.F.I0(q8);
            return this;
        }

        public f a0(String string) {
            this.F.J0(string);
            return this;
        }

        public f b0(String ... stringArray) {
            this.F.K0(stringArray);
            return this;
        }

        public f c0(String string) {
            this.F.L0(string);
            return this;
        }

        public f d0(String ... stringArray) {
            this.F.M0(stringArray);
            return this;
        }

        public f e0(int n8) {
            this.F.N0(n8);
            return this;
        }

        public f f0(boolean bl) {
            this.F.O0(bl);
            return this;
        }

        public f g0(int n8, boolean bl) {
            this.F.R0(n8, bl);
            return this;
        }
    }

    public static final class g {
        private static final String e = d0.G0(0);
        private static final String f = d0.G0(1);
        private static final String g = d0.G0(2);
        public final int a;
        public final int[] b;
        public final int c;
        public final int d;

        public g(int n8, int[] nArray, int n9) {
            this.a = n8;
            int[] nArray2 = Arrays.copyOf(nArray, nArray.length);
            this.b = nArray2;
            this.c = nArray.length;
            this.d = n9;
            Arrays.sort(nArray2);
        }

        public static g a(Bundle bundle) {
            int n8 = bundle.getInt(e, -1);
            int[] nArray = bundle.getIntArray(f);
            int n9 = bundle.getInt(g, -1);
            boolean bl = n8 >= 0 && n9 >= 0;
            ax.S0.a.a(bl);
            ax.S0.a.e(nArray);
            return new g(n8, nArray, n9);
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.a);
            bundle.putIntArray(f, this.b);
            bundle.putInt(g, this.d);
            return bundle;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && g.class == object.getClass()) {
                object = (g)object;
                if (this.a == ((g)object).a && Arrays.equals(this.b, ((g)object).b) && this.d == ((g)object).d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31 + Arrays.hashCode(this.b)) * 31 + this.d;
        }
    }

    private static class h {
        private final Spatializer a;
        private final boolean b;
        private final Handler c;
        private final Spatializer.OnSpatializerStateChangedListener d;

        public h(Context object, n n8, Boolean object2) {
            object = object == null ? null : ax.Q0.m.c(object);
            boolean bl = false;
            if (!(object == null || object2 != null && ((Boolean)object2).booleanValue())) {
                object = s.a((AudioManager)object);
                this.a = object;
                if (t.a((Spatializer)object) != 0) {
                    bl = true;
                }
                this.b = bl;
                object2 = new Spatializer.OnSpatializerStateChangedListener(){
                    final n a;
                    final h b;
                    {
                        this.b = h8;
                        this.a = n8;
                    }

                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean bl) {
                        this.a.T();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean bl) {
                        this.a.T();
                    }
                };
                this.d = object2;
                n8 = new Handler(ax.S0.a.i(Looper.myLooper()));
                this.c = n8;
                j.Objects.requireNonNull((Object)n8);
                u.a((Spatializer)object, new a((Handler)n8), (Spatializer.OnSpatializerStateChangedListener)object2);
                return;
            }
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
        }

        public boolean a(ax.P0.c c8, ax.P0.v v8) {
            int n8;
            block7: {
                block9: {
                    block10: {
                        block8: {
                            int n9;
                            block6: {
                                int n10;
                                if (!j.Objects.equals((Object)v8.o, (Object)"audio/eac3-joc")) break block6;
                                n8 = n10 = v8.G;
                                if (n10 == 16) {
                                    n8 = 12;
                                }
                                break block7;
                            }
                            if (!j.Objects.equals((Object)v8.o, (Object)"audio/iamf")) break block8;
                            n8 = n9 = v8.G;
                            if (n9 == -1) {
                                n8 = 6;
                            }
                            break block7;
                        }
                        if (!j.Objects.equals((Object)v8.o, (Object)"audio/ac4")) break block9;
                        int n11 = v8.G;
                        if (n11 == 18) break block10;
                        n8 = n11;
                        if (n11 != 21) break block7;
                    }
                    n8 = 24;
                    break block7;
                }
                n8 = v8.G;
            }
            if ((n8 = d0.M(n8)) == 0) {
                return false;
            }
            AudioFormat.Builder builder = new AudioFormat.Builder().setEncoding(2).setChannelMask(n8);
            n8 = v8.H;
            if (n8 != -1) {
                builder.setSampleRate(n8);
            }
            return z.a(w.a(ax.S0.a.e(this.a)), c8.a().a, builder.build());
        }

        public boolean b() {
            return x.a(w.a(ax.S0.a.e(this.a)));
        }

        public boolean c() {
            return y.a(w.a(ax.S0.a.e(this.a)));
        }

        public boolean d() {
            return this.b;
        }

        public void e() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
            Spatializer spatializer = this.a;
            if (spatializer != null && (onSpatializerStateChangedListener = this.d) != null && this.c != null) {
                v.a(spatializer, onSpatializerStateChangedListener);
                this.c.removeCallbacksAndMessages(null);
            }
        }
    }

    private static final class i
    extends j<i>
    implements Comparable<i> {
        private final int f0;
        private final boolean g0;
        private final boolean h0;
        private final boolean i0;
        private final int j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final boolean n0;

        public i(int n8, P z8, int n9, e e8, int n10, String string, String string2) {
            int n11;
            boolean bl;
            int n12;
            block4: {
                super(n8, (P)((Object)z8), n9);
                n12 = 0;
                this.g0 = V.l(n10, false);
                n8 = this.e0.e & ~e8.y;
                bl = (n8 & 1) != 0;
                this.h0 = bl;
                bl = (n8 & 2) != 0;
                this.i0 = bl;
                z8 = string2 != null ? ax.r7.z.A(string2) : (e8.v.isEmpty() ? ax.r7.z.A("") : e8.v);
                for (n8 = 0; n8 < z8.size(); ++n8) {
                    n9 = n.I(this.e0, (String)z8.get(n8), e8.z);
                    if (n9 <= 0) {
                        continue;
                    }
                    break block4;
                }
                n8 = Integer.MAX_VALUE;
                n9 = 0;
            }
            this.j0 = n8;
            this.k0 = n9;
            n8 = string2 != null ? 1088 : e8.w;
            this.l0 = n8 = n.M(this.e0.f, n8);
            bl = (0x440 & this.e0.f) != 0;
            this.n0 = bl;
            bl = n.V(string) == null;
            this.m0 = n11 = n.I(this.e0, string, bl);
            n9 = !(n9 > 0 || e8.v.isEmpty() && n8 > 0 || this.h0 || this.i0 && n11 > 0) ? 0 : 1;
            n8 = n12;
            if (V.l(n10, e8.A0)) {
                n8 = n12;
                if (n9 != 0) {
                    n8 = 1;
                }
            }
            this.f0 = n8;
        }

        public static int j(List<i> list, List<i> list2) {
            return list.get(0).l(list2.get(0));
        }

        public static ax.r7.z<i> n(int n8, P p8, e e8, int[] nArray, String string, String string2) {
            z.a<i> a8 = ax.r7.z.r();
            for (int i8 = 0; i8 < p8.a; ++i8) {
                a8.h(new i(n8, p8, i8, e8, nArray[i8], string, string2));
            }
            return a8.k();
        }

        @Override
        public int d() {
            return this.f0;
        }

        public int l(i i8) {
            ax.r7.n n8 = ax.r7.n.j().g(this.g0, i8.g0).f(this.j0, i8.j0, ax.r7.T.d().g()).d(this.k0, i8.k0).d(this.l0, i8.l0).g(this.h0, i8.h0);
            boolean bl = this.i0;
            boolean bl2 = i8.i0;
            ax.r7.T<Object> t8 = this.k0 == 0 ? ax.r7.T.d() : ax.r7.T.d().g();
            n8 = n8.f(bl, bl2, t8).d(this.m0, i8.m0);
            t8 = n8;
            if (this.l0 == 0) {
                t8 = n8.h(this.n0, i8.n0);
            }
            return ((ax.r7.n)((Object)t8)).i();
        }

        public boolean p(i i8) {
            return false;
        }
    }

    private static abstract class j<T extends j<T>> {
        public final P c0;
        public final int d0;
        public final ax.P0.v e0;
        public final int q;

        public j(int n8, P p8, int n9) {
            this.q = n8;
            this.c0 = p8;
            this.d0 = n9;
            this.e0 = p8.b(n9);
        }

        public abstract int d();

        public abstract boolean h(T var1);

        public static interface a<T extends j<T>> {
            public List<T> a(int var1, P var2, int[] var3);
        }
    }

    private static final class k
    extends j<k> {
        private final boolean f0;
        private final e g0;
        private final boolean h0;
        private final boolean i0;
        private final boolean j0;
        private final int k0;
        private final int l0;
        private final int m0;
        private final int n0;
        private final int o0;
        private final int p0;
        private final boolean q0;
        private final int r0;
        private final boolean s0;
        private final int t0;
        private final boolean u0;
        private final boolean v0;
        private final int w0;

        /*
         * Unable to fully structure code
         */
        public k(int var1_1, P var2_2, int var3_3, e var4_4, int var5_5, String var6_6, int var7_7, boolean var8_8) {
            block8: {
                super(var1_1, (P)var2_2, var3_3);
                this.g0 = var4_4;
                var3_3 = var4_4.r0 != false ? 24 : 16;
                var11_9 = var4_4.q0;
                var12_10 = true;
                var11_9 = var11_9 != false && (var7_7 & var3_3) != 0;
                this.s0 = var11_9;
                if (!var8_8) ** GOTO lbl-1000
                var2_2 = this.e0;
                var1_1 = var2_2.v;
                if (!(var1_1 != -1 && var1_1 > var4_4.a || (var1_1 = var2_2.w) != -1 && var1_1 > var4_4.b || (var9_11 = var2_2.z) != -1.0f && !(var9_11 <= (float)var4_4.c) || (var1_1 = var2_2.j) != -1 && var1_1 > var4_4.d)) {
                    var11_9 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var11_9 = false;
                }
                this.f0 = var11_9;
                if (!var8_8) ** GOTO lbl-1000
                var2_2 = this.e0;
                var1_1 = var2_2.v;
                if (!(var1_1 != -1 && var1_1 < var4_4.e || (var1_1 = var2_2.w) != -1 && var1_1 < var4_4.f || (var9_11 = var2_2.z) != -1.0f && !(var9_11 >= (float)var4_4.g) || (var1_1 = var2_2.j) != -1 && var1_1 < var4_4.h)) {
                    var8_8 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var8_8 = false;
                }
                this.h0 = var8_8;
                this.i0 = V.l(var5_5, false);
                var2_2 = this.e0;
                var9_11 = var2_2.z;
                var8_8 = var9_11 != -1.0f && var9_11 >= 10.0f;
                this.j0 = var8_8;
                this.k0 = var2_2.j;
                this.l0 = var2_2.g();
                var1_1 = 0;
                while (true) {
                    var7_7 = var4_4.n.size();
                    var10_12 = 0x7FFFFFFF;
                    if (var1_1 >= var7_7) break;
                    var7_7 = n.I(this.e0, (String)var4_4.n.get(var1_1), false);
                    if (var7_7 <= 0) {
                        ++var1_1;
                        continue;
                    }
                    break block8;
                    break;
                }
                var1_1 = 0x7FFFFFFF;
                var7_7 = 0;
            }
            this.n0 = var1_1;
            this.o0 = var7_7;
            this.p0 = n.z(this.e0.f, var4_4.o);
            var1_1 = this.e0.f;
            var8_8 = var1_1 == 0 || (var1_1 & 1) != 0;
            this.q0 = var8_8;
            var8_8 = n.V(var6_6) == null;
            this.r0 = n.I(this.e0, var6_6, var8_8);
            var1_1 = 0;
            while (true) {
                var7_7 = var10_12;
                if (var1_1 >= var4_4.m.size()) break;
                var2_2 = this.e0.o;
                if (var2_2 != null && var2_2.equals(var4_4.m.get(var1_1))) {
                    var7_7 = var1_1;
                    break;
                }
                ++var1_1;
            }
            this.m0 = var7_7;
            var8_8 = V.h(var5_5) == 128;
            this.u0 = var8_8;
            var8_8 = V.j(var5_5) == 64 ? var12_10 : false;
            this.v0 = var8_8;
            this.w0 = n.A(this.e0.o);
            this.t0 = this.s(var5_5, var3_3);
        }

        public static /* synthetic */ int j(k k8, k k9) {
            return ax.l1.n$k.p(k8, k9);
        }

        public static /* synthetic */ int l(k k8, k k9) {
            return ax.l1.n$k.n(k8, k9);
        }

        private static int n(k k8, k k9) {
            ax.r7.n n8;
            ax.r7.n n9 = n8 = ax.r7.n.j().g(k8.i0, k9.i0).f(k8.n0, k9.n0, ax.r7.T.d().g()).d(k8.o0, k9.o0).d(k8.p0, k9.p0).g(k8.q0, k9.q0).d(k8.r0, k9.r0).g(k8.j0, k9.j0).g(k8.f0, k9.f0).g(k8.h0, k9.h0).f(k8.m0, k9.m0, ax.r7.T.d().g()).g(k8.u0, k9.u0).g(k8.v0, k9.v0);
            if (k8.u0) {
                n9 = n8;
                if (k8.v0) {
                    n9 = n8.d(k8.w0, k9.w0);
                }
            }
            return n9.i();
        }

        private static int p(k k8, k k9) {
            ax.r7.n n8;
            ax.r7.T t8 = k8.f0 && k8.i0 ? l : l.g();
            ax.r7.n n9 = n8 = ax.r7.n.j();
            if (k8.g0.B) {
                n9 = n8.f(k8.k0, k9.k0, l.g());
            }
            return n9.f(k8.l0, k9.l0, t8).f(k8.k0, k9.k0, t8).i();
        }

        public static int q(List<k> list, List<k> list2) {
            return ax.r7.n.j().f(Collections.max(list, new A()), Collections.max(list2, new A()), new A()).d(list.size(), list2.size()).f(Collections.max(list, new B()), Collections.max(list2, new B()), new B()).i();
        }

        public static ax.r7.z<k> r(int n8, P p8, e e8, int[] nArray, String string, int n9, Point object) {
            int n10 = object != null ? ((Point)object).x : e8.i;
            int n11 = object != null ? ((Point)object).y : e8.j;
            n11 = n.J(p8, n10, n11, e8.l);
            object = ax.r7.z.r();
            for (n10 = 0; n10 < p8.a; ++n10) {
                int n12 = p8.b(n10).g();
                boolean bl = n11 == Integer.MAX_VALUE || n12 != -1 && n12 <= n11;
                ((z.a)object).h(new k(n8, p8, n10, e8, nArray[n10], string, n9, bl));
            }
            return ((z.a)object).k();
        }

        private int s(int n8, int n9) {
            if ((this.e0.f & 0x4000) != 0) {
                return 0;
            }
            if (!V.l(n8, this.g0.A0)) {
                return 0;
            }
            if (!this.f0 && !this.g0.p0) {
                return 0;
            }
            if (V.l(n8, false) && this.h0 && this.f0 && this.e0.j != -1) {
                e e8 = this.g0;
                if (!e8.C && !e8.B && (n8 & n9) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override
        public int d() {
            return this.t0;
        }

        public boolean t(k k8) {
            return (this.s0 || j.Objects.equals((Object)this.e0.o, (Object)k8.e0.o)) && (this.g0.s0 || this.u0 == k8.u0 && this.v0 == k8.v0);
            {
            }
        }
    }
}

