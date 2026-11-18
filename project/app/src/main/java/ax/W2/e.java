/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.p;
import ax.W2.v;
import ax.W2.w;
import ax.X2.J;
import ax.X2.Q;
import ax.a3.H;
import ax.a3.K;
import ax.b3.B;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.i0;
import ax.c3.x;
import ax.r7.q;
import ax.u3.b;
import ax.u3.c;
import ax.u3.q;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.p;
import com.voxdon.xplorer.file.v;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.file.z;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;

public class e
extends ax.W2.j {
    private static final Logger p0 = ax.Q2.g.a(e.class);
    private static final c q0 = new c(){

        @Override
        public boolean isCancelled() {
            return false;
        }
    };
    private LinkedList<k> A;
    private HashMap<String, String> B;
    private HashMap<String, f> C;
    private f D = new f();
    private boolean E;
    private HashSet<String> F = new HashSet();
    private List<Map.Entry<n, g>> G = new ArrayList<Map.Entry<n, g>>();
    private n H;
    private o I;
    private n J;
    private o K;
    private i L;
    private j M;
    private String N;
    private String O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private n X;
    private n Y;
    private n Z;
    private n a0;
    private q<n> b0;
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private j.f f0;
    private j.f g0;
    private ax.a3.K h0;
    private H i0;
    private long j0;
    private int k0;
    private Long l0;
    private String m0;
    private boolean n0;
    private ax.B.b<String> o0 = new ax.B.b();
    private List<n> w;
    private List<n> x;
    private LinkedList<n> y;
    private LinkedList<m> z;

    public e(h.a a8, List<n> list, o o8, n n8, o o9, n n9, boolean bl) {
        super(a8);
        this.w = list;
        this.I = o8;
        this.J = n8;
        this.K = o9;
        this.H = n9;
        this.c0 = bl;
        o8.n0();
        this.K.n0();
        this.h(this.I.T());
        this.h(this.K.T());
        this.b0 = q.l(249);
    }

    private void A2(n n8, n n9, int n10) {
        ax.a3.K k8 = new ax.a3.K();
        boolean bl = n8.isDirectory();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", this.C());
        bundle.putString("fileName", n8.B());
        bundle.putBoolean("isDirectory", bl);
        bundle.putInt("errCode", n10);
        bundle.putBoolean("applyToAll", true);
        bundle.putBoolean("useMergeForFolder", true);
        if (!bl) {
            bundle.putBoolean("use_overwrite_newer", true);
        }
        bundle.putBoolean("directoryRename", false);
        if (!bl && n10 == 1) {
            bundle.putString("new_file_path", n8.E());
            bundle.putLong("new_file_date", n8.q());
            bundle.putLong("new_file_size", n8.p());
            bundle.putString("old_file_path", n9.E());
            bundle.putLong("old_file_date", n9.q());
            bundle.putLong("old_file_size", n9.p());
        }
        k8.v2(bundle);
        k8.v3(new K.i(){
            final boolean a;
            final e b;
            {
                this.b = e8;
                this.a = bl;
            }

            @Override
            public void a(j.f f8, boolean bl) {
                if (this.a) {
                    e.P0(this.b, bl);
                    e.k1(this.b, f8);
                } else {
                    e.x1(this.b, bl);
                    e.N1(this.b, f8);
                }
                e.x0(this.b, new j(this.b, true, f8));
                this.b.M.i(new Void[0]);
            }
        });
        this.h0 = k8;
        this.q().K(this, k8);
    }

    static /* synthetic */ int B1(e e8, int n8) {
        e8.P = n8;
        return n8;
    }

    private void B2(n n8, n n9) {
        H h8 = ax.a3.H.l3(n8.B(), 2131951948);
        h8.m3(new H.b(){
            final n a;
            final n b;
            final e c;
            {
                this.c = e8;
                this.a = n8;
                this.b = n9;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    e.x0(this.c, new j(this.c));
                    this.c.M.R(true);
                    this.c.M.i(new Void[0]);
                    return;
                }
                this.c.u2(this.a, this.b.B(), 1);
                this.c.o();
            }
        });
        this.i0 = h8;
        this.q().K(this, h8);
    }

    static /* synthetic */ LinkedList C0(e e8, LinkedList linkedList) {
        e8.z = linkedList;
        return linkedList;
    }

    static /* synthetic */ int D1(e e8, int n8) {
        e8.Q = n8;
        return n8;
    }

    static /* synthetic */ HashMap E0(e e8, HashMap hashMap) {
        e8.B = hashMap;
        return hashMap;
    }

    static /* synthetic */ int F1(e e8, int n8) {
        e8.R = n8;
        return n8;
    }

    static /* synthetic */ String I0(e e8) {
        return e8.m0;
    }

    static /* synthetic */ String J0(e e8, String string) {
        e8.m0 = string;
        return string;
    }

    static /* synthetic */ LinkedList J1(e e8, LinkedList linkedList) {
        e8.y = linkedList;
        return linkedList;
    }

    static /* synthetic */ j.f L1(e e8) {
        return e8.f0;
    }

    static /* synthetic */ boolean M0(e e8, boolean bl) {
        e8.E = bl;
        return bl;
    }

    static /* synthetic */ void M1(e e8, n n8) {
        e8.y2(n8);
    }

    static /* synthetic */ boolean N0(e e8) {
        return e8.e0;
    }

    static /* synthetic */ j.f N1(e e8, j.f f8) {
        e8.f0 = f8;
        return f8;
    }

    static /* synthetic */ String O1(e e8, String string) {
        return e8.n2(string);
    }

    static /* synthetic */ boolean P0(e e8, boolean bl) {
        e8.e0 = bl;
        return bl;
    }

    static /* synthetic */ String P1(e e8, n n8, n n9) {
        return e8.o2(n8, n9);
    }

    static /* synthetic */ void Q1(e e8, n n8) {
        e8.z2(n8);
    }

    static /* synthetic */ List R0(e e8, List list) {
        e8.x = list;
        return list;
    }

    static /* synthetic */ int U0(e e8, int n8) {
        e8.W = n8;
        return n8;
    }

    static /* synthetic */ LinkedList U1(e e8, LinkedList linkedList) {
        e8.A = linkedList;
        return linkedList;
    }

    static /* synthetic */ int V0(e e8) {
        int n8 = e8.W;
        e8.W = n8 + 1;
        return n8;
    }

    static /* synthetic */ boolean Y0(e e8, boolean bl) {
        e8.n0 = bl;
        return bl;
    }

    static /* synthetic */ int a1(e e8, int n8) {
        e8.T = n8;
        return n8;
    }

    static /* synthetic */ int b1(e e8, int n8) {
        e8.T = n8 = e8.T + n8;
        return n8;
    }

    static /* synthetic */ HashMap c2(e e8, HashMap hashMap) {
        e8.C = hashMap;
        return hashMap;
    }

    static /* synthetic */ int d1(e e8, int n8) {
        e8.U = n8;
        return n8;
    }

    private void d2(n object) {
        if (this.x != null) {
            String string = ((n)object).E();
            Iterator<n> iterator = this.x.iterator();
            while (iterator.hasNext()) {
                n n8 = iterator.next();
                object = n8.E();
                if (!((String)object).equals(string) && !ax.c3.d0.I((String)object, string)) continue;
                iterator.remove();
                this.F.remove(n8.Q());
            }
        }
    }

    static /* synthetic */ int e1(e e8) {
        int n8 = e8.U;
        e8.U = n8 + 1;
        return n8;
    }

    private boolean e2(n n8, n n9) {
        if (!this.c0) {
            return false;
        }
        if (ax.X2.J.x(this.r()) && ax.c3.B.M(n8) && !this.f2(this.r(), n8)) {
            return false;
        }
        return this.I.e(n8, n9) && this.I.B(n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean f2(Context object, n object2) {
        Throwable throwable2;
        Object object3;
        block5: {
            block6: {
                RuntimeException runtimeException2;
                block4: {
                    Context context;
                    ContentResolver contentResolver = object.getContentResolver();
                    String string = null;
                    object3 = context = null;
                    object = string;
                    try {
                        Uri uri = ax.W2.d.a();
                        object3 = context;
                        object = string;
                        object2 = ((n)object2).E();
                        object3 = context;
                        object = string;
                        object2 = contentResolver.query(uri, new String[]{"owner_package_name"}, "_data = ?", new String[]{object2}, null);
                        if (object2 == null) break block4;
                        object3 = object2;
                        object = object2;
                        if (!object2.moveToFirst()) break block4;
                        object3 = object2;
                        object = object2;
                        string = object2.getString(0);
                        if (string == null) break block4;
                        object3 = object2;
                        object = object2;
                        boolean bl = string.contains("chrome");
                        if (!bl) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    catch (RuntimeException runtimeException2) {}
                    object2.close();
                    return false;
                }
                if (object2 == null) return true;
                object = object2;
                break block6;
                object3 = object;
                {
                    runtimeException2.printStackTrace();
                    if (object == null) return true;
                }
            }
            object.close();
            return true;
        }
        if (object3 == null) throw throwable2;
        object3.close();
        throw throwable2;
    }

    static /* synthetic */ int g1(e e8, int n8) {
        e8.V = n8;
        return n8;
    }

    private boolean g2(n n8, n n9) {
        return this.e2(n8, n9) && !n9.n();
    }

    static /* synthetic */ int h1(e e8) {
        int n8 = e8.V;
        e8.V = n8 + 1;
        return n8;
    }

    private boolean h2() {
        boolean bl;
        block1: {
            Iterator<n> iterator = this.w.iterator();
            while (iterator.hasNext()) {
                if (this.e2(iterator.next(), this.H)) continue;
                bl = false;
                break block1;
            }
            bl = true;
        }
        return bl ^ true;
    }

    static /* synthetic */ j.f i1(e e8) {
        return e8.g0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i2() throws ax.b3.j {
        block23: {
            block22: {
                block27: {
                    block25: {
                        block29: {
                            block28: {
                                block26: {
                                    block24: {
                                        block21: {
                                            if (ax.X2.J.m() != false) return;
                                            if (ax.Q2.f.w0(this.K.S()) == false) return;
                                            var7_1 = System.currentTimeMillis();
                                            var2_2 = this.b0.size();
                                            if (var2_2 == 0) {
                                                return;
                                            }
                                            var9_3 = this.w();
                                            var4_6 = true;
                                            var9_3.S(true);
                                            this.w().T(v.a.d0);
                                            try {
                                                var12_7 = this.x();
                                                var5_8 = var2_2;
                                                var12_7.a(0L, var5_8);
                                                var13_9 /* !! */  = new ArrayList<n>(this.b0);
                                                var1_10 = 0;
lbl17:
                                                // 2 sources

                                                while (var1_10 < var2_2) {
                                                    var14_21 = (ax.c3.k)var13_9 /* !! */ .get(var1_10);
                                                    var9_3 = null;
                                                    var10_12 = null;
                                                    var11_20 = var10_12;
                                                    break block21;
                                                }
                                                break block22;
                                            }
                                            catch (Throwable var9_5) {
                                                break block23;
                                            }
                                        }
                                        try {
                                            try {
                                                var3_11 = var14_21.k0();
                                                if (!var3_11) break block24;
                                                var11_20 = var10_12;
                                            }
                                            catch (ax.b3.j var10_18) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var3_11 = false;
                                                    break block25;
                                                    break;
                                                }
                                            }
                                            var10_12 = var14_21.e0(true);
                                            var9_3 = var10_12;
                                            var3_11 = true;
                                            break block26;
                                        }
                                        catch (Throwable var9_4) {
                                            break block27;
                                        }
                                        catch (ax.b3.j var10_13) {
                                            var3_11 = var4_6;
                                            break block25;
                                        }
                                        catch (IOException var10_14) {
                                            var3_11 = var4_6;
                                            break block25;
                                        }
                                    }
                                    var11_20 = var10_12;
                                    try {
                                        if (!(var14_21 instanceof y)) break block28;
                                        var11_20 = var10_12;
                                        var10_12 = ParcelFileDescriptor.open((File)((y)var14_21).F0(), (int)0x10000000);
                                        var9_3 = var10_12;
                                        var3_11 = false;
                                    }
                                    catch (IOException var10_19) {
                                        ** continue;
                                    }
                                }
                                var11_20 = var9_3;
                                try {
                                    var9_3.getFileDescriptor().sync();
                                }
                                catch (ax.b3.j var10_15) {
                                    break block25;
                                }
                                catch (IOException var10_17) {
                                    break block25;
                                }
                                {
                                    ax.c3.F.a((AutoCloseable)var9_3);
                                    var12_7.a(var1_10 + 1, var5_8);
                                    break block29;
                                }
                            }
                            var11_20 = var10_12;
                            {
                                var11_20 = var10_12;
                                var14_21 = new Comparable<n>();
                                var11_20 = var10_12;
                                var14_21.append("finish sync not reachable:");
                                var11_20 = var10_12;
                                var14_21.append(this.y());
                                var11_20 = var10_12;
                                ax.u3.b.g(var14_21.toString());
                            }
                        }
                        ++var1_10;
                        ** GOTO lbl17
                    }
                    var11_20 = var9_3;
                    {
                        var11_20 = var9_3;
                        var11_20 = var9_3;
                        var12_7 = new StringBuilder();
                        var11_20 = var9_3;
                        var12_7.append("Sync error : ");
                        var11_20 = var9_3;
                        var12_7.append(var1_10);
                        var11_20 = var9_3;
                        var12_7.append("/");
                        var11_20 = var9_3;
                        var12_7.append(var2_2);
                        var11_20 = var9_3;
                        var12_7.append(":");
                        var11_20 = var9_3;
                        var12_7.append(var3_11);
                        var11_20 = var9_3;
                        var12_7.append(":");
                        var11_20 = var9_3;
                        var12_7.append(this.w().z());
                        var11_20 = var9_3;
                        var13_9 /* !! */  = new ArrayList<n>(var12_7.toString(), (Throwable)var10_16);
                        var11_20 = var9_3;
                        ax.Q2.d.c("clipboard finishing", var13_9 /* !! */ );
                        var11_20 = var9_3;
                        var11_20 = var9_3;
                        var12_7 = new ax.b3.j((Throwable)var10_16);
                        var11_20 = var9_3;
                        throw var12_7;
                    }
                }
                if (var11_20 == null) throw var9_4;
                {
                    ax.c3.F.a((AutoCloseable)var11_20);
                    throw var9_4;
                }
            }
            this.w().S(false);
            var9_3 = e.p0;
            var10_12 = new StringBuilder();
            var10_12.append("USB syncing time : ");
            var10_12.append(System.currentTimeMillis() - var7_1);
            var9_3.fine(var10_12.toString());
            return;
        }
        this.w().S(false);
        throw var9_5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j2() {
        n n8;
        if (ax.Q2.f.g0(this.K.S()) && (n8 = this.H) instanceof v) {
            try {
                long l8 = ax.c3.x.e(((v)n8).B0()).v();
                if (l8 <= 0L) return;
                this.l0 = l8;
                return;
            }
            catch (ax.b3.j j8) {
                return;
            }
        }
        if (!ax.Q2.f.l0(this.K.S())) return;
        {
            long l9 = this.K.v();
            if (l9 <= 0L) return;
            this.l0 = l9;
            return;
        }
    }

    static /* synthetic */ j.f k1(e e8, j.f f8) {
        e8.g0 = f8;
        return f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k2(o object, n comparable, HashMap<String, f> hashMap, c c8) throws ax.b3.a {
        Stack<Object> stack = new Stack<Object>();
        stack.push(comparable);
        boolean bl = false;
        while (((AbstractCollection)stack).size() > 0) {
            f f8;
            n n8;
            block10: {
                Object object2;
                Object object3;
                block11: {
                    if (c8 != null && c8.isCancelled()) {
                        throw new ax.b3.a();
                    }
                    n8 = (n)stack.pop();
                    if (n8 == null) break;
                    if (!n8.isDirectory()) {
                        this.w().h(n8.p());
                        this.w().g(1);
                        continue;
                    }
                    f8 = new f();
                    try {
                        if (!n8.n()) {
                            if (n8.P() != ax.Q2.f.t0) {
                                object3 = ax.Ha.c.h().f().b("CLIPBOARD DIR NOT EXIST");
                                object2 = new Object();
                                ((StringBuilder)object2).append("location:");
                                ((StringBuilder)object2).append(n8.R());
                                ((StringBuilder)object2).append(",");
                                ((StringBuilder)object2).append(n8.E());
                                ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
                            }
                            break block10;
                        }
                        object2 = ((o)object).f0(n8);
                        if (object2 == null || object2.size() <= 0) break block10;
                        object2 = object2.iterator();
                        break block11;
                    }
                    catch (ax.b3.j j8) {}
                    j8.printStackTrace();
                    break block10;
                }
                while (object2.hasNext()) {
                    object3 = object2.next();
                    if (!object3.isDirectory()) {
                        long l8 = object3.p();
                        this.w().h(l8);
                        this.w().g(1);
                        ++f8.a;
                        f8.b += l8;
                        continue;
                    }
                    stack.push(object3);
                    f8.c.add(((n)object3).Q());
                }
            }
            hashMap.put(n8.Q(), f8);
            if (!this.r2(n8)) continue;
            bl = true;
        }
        if (this.c0 && bl && this.C.containsKey(object = this.p2(((n)comparable).R()))) {
            object = this.m2((String)object, null);
            this.k0 = ((f)object).a;
            this.j0 = ((f)object).b;
            object = p0;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Thumbnail Detected :");
            ((StringBuilder)comparable).append(this.k0);
            ((StringBuilder)comparable).append("/");
            ((StringBuilder)comparable).append(this.j0);
            ((Logger)object).fine(((StringBuilder)comparable).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int l2(String string) {
        synchronized (this) {
            this.m2(string, this.D);
            return this.D.a;
        }
    }

    static /* synthetic */ boolean m1(e e8, n n8) {
        return e8.q2(n8);
    }

    private f m2(String arrayList, f f8) {
        Stack<Object> stack = new Stack<Object>();
        arrayList = this.C.get(arrayList);
        if (f8 != null) {
            f8.a();
        } else {
            f8 = new f();
        }
        stack.push(arrayList);
        while (((AbstractCollection)stack).size() > 0 && (arrayList = (f)stack.pop()) != null) {
            f8.a += ((f)((Object)arrayList)).a;
            f8.b += ((f)((Object)arrayList)).b;
            arrayList = ((f)((Object)arrayList)).c;
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string = arrayList.get(i8);
                stack.push(this.C.get(string));
            }
        }
        return f8;
    }

    static /* synthetic */ Logger n1() {
        return p0;
    }

    private String n2(String string) {
        for (k k8 : this.A) {
            if (!ax.c3.d0.I(k8.a, string)) continue;
            string = ax.c3.d0.n(k8.a, string);
            return ax.c3.d0.P(k8.b, string);
        }
        return null;
    }

    private String o2(n n8, n object) {
        object = ((n)object).E();
        String string = this.B.get(n8.E());
        String string2 = n8.E();
        if (((String)object).equals(string)) {
            return string2;
        }
        if (!(TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string) || TextUtils.isEmpty((CharSequence)object))) {
            if (!ax.c3.d0.J(string, string2, n8.P().W())) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("COGTFP!!:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(":");
                stringBuilder.append(string2);
                stringBuilder.append(":");
                stringBuilder.append(n8.R());
                b8.g(stringBuilder.toString()).h();
            }
            return ax.c3.d0.P((String)object, ax.c3.d0.o(string, string2, n8.P().W()));
        }
        throw new IllegalArgumentException("empty path");
    }

    static /* synthetic */ int p1(e e8, int n8) {
        e8.S = n8;
        return n8;
    }

    private String p2(K k8) {
        return ax.c3.B.U(k8, ax.c3.d0.W(k8, "/DCIM/.thumbnails"));
    }

    static /* synthetic */ int q1(e e8) {
        int n8 = e8.S;
        e8.S = n8 + 1;
        return n8;
    }

    private boolean q2(n n8) {
        if (!ax.Q2.f.j0(n8.P())) {
            return false;
        }
        return this.s2(n8.R(), n8.T());
    }

    static /* synthetic */ void r1(e e8) throws ax.b3.j {
        e8.i2();
    }

    private boolean r2(n n8) {
        if (!ax.Q2.f.k0(n8.P())) {
            return false;
        }
        if (!n8.isDirectory()) {
            return false;
        }
        return this.s2(n8.R(), n8.E());
    }

    static /* synthetic */ n s1(e e8) {
        return e8.H;
    }

    private boolean s2(K k8, String string) {
        if (!ax.c3.d0.I(k8.e(), string)) {
            return false;
        }
        return "/DCIM/.thumbnails".equals(ax.c3.d0.n(k8.e(), string));
    }

    private void t2() {
        LinkedList<n> linkedList = this.y;
        if (linkedList != null && !linkedList.isEmpty() || (linkedList = this.z) != null && !linkedList.isEmpty()) {
            this.M = linkedList = new j(this);
            ((ax.u3.q)((Object)linkedList)).i(new Void[0]);
            return;
        }
        this.l0(true);
        if (this.w().O() != this.w().z()) {
            linkedList = p0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Total : ");
            stringBuilder.append(this.w().O());
            stringBuilder.append(" != Progress : ");
            stringBuilder.append(this.w().z());
            ((Logger)((Object)linkedList)).severe(stringBuilder.toString());
        }
        this.o();
    }

    private void u2(n n8, String string, int n9) {
        this.d2(n8);
        this.w().c(v.b.c0, n9);
        this.w().a(n9);
        this.w().b(string);
    }

    private void v2(String string, String string2) {
        this.A.push(new k(string, string2));
    }

    static /* synthetic */ boolean w1(e e8) {
        return e8.d0;
    }

    private void w2(n n8) {
        this.Z = n8;
    }

    static /* synthetic */ j x0(e e8, j j8) {
        e8.M = j8;
        return j8;
    }

    static /* synthetic */ boolean x1(e e8, boolean bl) {
        e8.d0 = bl;
        return bl;
    }

    private void x2(n n8) {
        this.a0 = n8;
    }

    private void y2(n n8) {
        this.X = n8;
    }

    private void z2(n n8) {
        this.Y = n8;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        if (this.c0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String C() {
        if (this.c0) {
            return this.r().getString(2131952519);
        }
        return this.r().getString(2131952512);
    }

    @Override
    protected Object E() {
        return new e(this.I, this.J, this.w, this.c0 ^ true);
    }

    @Override
    public String F() {
        int n8 = d.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            if (this.c0) {
                return this.r().getResources().getString(2131952350);
            }
            return this.r().getResources().getString(2131952328);
        }
        if (this.w().H() == 0 && this.w().M() != 0) {
            return "";
        }
        n8 = this.w.size();
        if (n8 == 1) {
            String string = this.w.get(0).B();
            if (this.c0) {
                return this.r().getResources().getString(2131952351, new Object[]{string, this.H.E()});
            }
            return this.r().getResources().getString(2131952327, new Object[]{string, this.H.E()});
        }
        if (this.c0) {
            return this.r().getResources().getQuantityString(2131820555, n8, new Object[]{n8, this.H.E()});
        }
        return this.r().getResources().getQuantityString(2131820552, n8, new Object[]{n8, this.H.E()});
    }

    @Override
    public String G() {
        if (d.a[this.D().ordinal()] != 2) {
            return "";
        }
        boolean bl = this.K.S() == ax.Q2.f.p0;
        return this.v(bl);
    }

    @Override
    public K H() {
        n n8 = this.Z;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String J() {
        n n8 = this.Z;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    public K K() {
        n n8 = this.a0;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.a0;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        if (this.K.Y()) {
            return true;
        }
        return this.I.Y();
    }

    @Override
    protected void W() {
        ax.a3.j j8 = this.h0;
        if (j8 != null && j8.X0()) {
            if (this.h0.e1()) {
                this.h0.N2();
            } else {
                this.h0.u3(true);
            }
        }
        if ((j8 = this.i0) != null && j8.X0()) {
            if (this.i0.e1()) {
                this.i0.N2();
                return;
            }
            this.i0.n3(true);
        }
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.L)) {
            this.L.e();
            bl = true;
        } else {
            bl = false;
        }
        if (this.S(this.M)) {
            this.M.e();
            return true;
        }
        return bl;
    }

    @Override
    protected void Y() {
        o o8;
        o o9;
        this.w().T(v.a.c0);
        if (this.K.Y()) {
            this.K.n(this.x());
        }
        if ((o9 = this.K) != (o8 = this.I) && o8.Y()) {
            this.I.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.H != null) {
            ax.W2.w.c().g(this.H.R(), this.H.E(), this.o0);
        }
        int n8 = this.w().H();
        int n9 = this.w().C();
        if (this.w().M() == n8 + n9 && !this.n0) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        this.j0();
        this.O = this.H.P().I();
        Object object = this.w;
        this.N = object != null && object.size() > 0 ? this.w.get(0).P().I() : "-";
        this.n0 = false;
        this.L = object = new i(this);
        ((ax.u3.q)object).i(new Void[0]);
    }

    @Override
    public void k() {
        this.I.k0(true);
        this.K.k0(true);
    }

    @Override
    public void n0() {
        String string = this.c0 ? "file_move" : "file_copy";
        String string2 = a.c.a(this.D());
        ax.Q2.a.i().m("command", string).c("result", string2).c("src", this.N).c("tgt", this.O).d(this.w().x()).e();
    }

    public static class e {
        public boolean a;
        public o b;
        public n c;
        public List<n> d;

        public e(o o8, n n8, List<n> list, boolean bl) {
            this.b = o8;
            this.c = n8;
            this.d = list;
            this.a = bl;
        }
    }

    static class f {
        int a;
        long b;
        ArrayList<String> c = new ArrayList();

        f() {
        }

        void a() {
            this.a = 0;
            this.b = 0L;
            this.c.clear();
        }
    }

    private static class g {
        long a;
        p b;

        g(long l8, p p8) {
            this.a = l8;
            this.b = p8;
        }
    }

    private static final class h
    extends Enum<h> {
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        public static final /* enum */ h e0;
        private static final h[] f0;
        public static final /* enum */ h q;

        static {
            q = new h();
            c0 = new h();
            d0 = new h();
            e0 = new h();
            f0 = h.d();
        }

        private static /* synthetic */ h[] d() {
            return new h[]{q, c0, d0, e0};
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])f0.clone();
        }
    }

    private class i
    extends ax.u3.q<Void, Void, Void> {
        final e h;

        public i(e e8) {
            this.h = e8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Void w(Void ... object2) {
            e.c2(this.h, new HashMap());
            e.J1(this.h, new LinkedList());
            e.C0(this.h, new LinkedList());
            e.U1(this.h, new LinkedList());
            e.E0(this.h, new HashMap());
            try {
                for (Object object2 : this.h.w) {
                    boolean bl;
                    this.h.y.offer(object2);
                    this.h.B.put(((n)object2).E(), ((n)object2).T());
                    if (ax.X2.Q.P1() && (bl = object2 instanceof y)) {
                        try {
                            ((y)object2).t1();
                        }
                        catch (IOException iOException) {}
                    }
                    e e8 = this.h;
                    e8.k2(e8.I, (n)object2, this.h.C, this);
                }
            }
            catch (ax.b3.a a8) {}
            if (this.h.c0) {
                object2 = this.h;
                e.M0((e)object2, ((e)object2).h2());
                if (this.h.E) {
                    this.h.w().f0(true);
                    this.h.w().V(this.h.w().M());
                    this.h.w().g(this.h.w.size());
                }
            }
            this.h.j2();
            return null;
        }

        protected void x(Void void_) {
            this.h.g0();
        }

        protected void y(Void void_) {
            this.h.k0();
            this.h.t2();
        }
    }

    private class j
    extends ax.u3.q<Void, Void, Integer> {
        boolean h;
        j.f i;
        boolean j;
        final e k;

        public j(e e8) {
            this(e8, false, j.f.q);
        }

        public j(e e8, boolean bl, j.f f8) {
            this.k = e8;
            super(q.e.f0);
            this.h = bl;
            this.i = f8;
        }

        private boolean A(n n8) throws ax.b3.j {
            return !ax.c3.d0.K(n8.E()) || this.B(this.k.K, n8);
            {
            }
        }

        private boolean B(o o8, n n8) throws ax.b3.j {
            if (o8.z(n8.E()).n()) {
                return true;
            }
            String string = ax.c3.d0.b(n8.B());
            string = ax.c3.d0.Q(n8.T(), string);
            return !n8.E().equals(string) && o8.z(string).n();
        }

        private h C(n n8, n n9, c object) {
            ax.u3.b.c(n8.isDirectory());
            try {
                this.k.I.E(n8, n9, (c)object, null);
                object = ax.W2.e$h.q;
            }
            catch (ax.b3.a a8) {
                object = ax.W2.e$h.d0;
            }
            catch (ax.b3.j j8) {
                object = ax.W2.e$h.c0;
            }
            int n10 = this.k.l2(n8.Q());
            if (object == ax.W2.e$h.q) {
                this.k.w().c(v.b.q, n10);
                e.b1(this.k, n10);
                e.e1(this.k);
                this.k.w().a(n10);
            } else {
                e.h1(this.k);
                if (n10 == 0) {
                    e.Y0(this.k, true);
                }
                this.k.u2(n8, n9.B(), n10);
            }
            return object;
        }

        private void D() {
            if (this.k.x != null && this.k.x.size() != 0) {
                for (n n8 : this.k.x) {
                    try {
                        if (this.z(n8)) continue;
                        this.k.I.P(n8);
                    }
                    catch (ax.b3.j j8) {
                        j8.printStackTrace();
                    }
                }
                this.k.x.clear();
            }
        }

        private boolean E(n list) throws ax.b3.j, ax.b3.a {
            boolean bl;
            block10: {
                Stack<p.c> stack = new Stack<p.c>();
                stack.push(new p.c((n)((Object)list)));
                boolean bl2 = true;
                block6: while (true) {
                    bl = bl2;
                    if (((AbstractCollection)stack).size() <= 0) break block10;
                    this.k.v0();
                    if (this.isCancelled()) break;
                    p.c c8 = (p.c)stack.pop();
                    list = c8.a;
                    if (list.isDirectory()) {
                        if (!c8.b) {
                            c8.b = true;
                            stack.push(c8);
                            list = this.k.I.f0((n)((Object)list));
                            if (list == null || list.size() <= 0) continue;
                            list = list.iterator();
                            while (true) {
                                if (!list.hasNext()) continue block6;
                                stack.push(new p.c((n)list.next()));
                            }
                        }
                        try {
                            if (!this.k.F.contains(((n)((Object)list)).Q()) || this.z((n)((Object)list))) continue;
                            this.k.I.P((n)((Object)list));
                            continue;
                        }
                        catch (ax.b3.j j8) {
                            bl = false;
                            break block10;
                        }
                    }
                    try {
                        if (!this.k.F.contains(((n)((Object)list)).Q())) continue;
                        this.k.I.P((n)((Object)list));
                        this.k.l0(false);
                    }
                    catch (ax.b3.j j9) {
                        boolean bl3;
                        try {
                            bl = this.k.I.z(((n)((Object)list)).E()).n();
                            bl3 = bl ^ true;
                        }
                        catch (ax.b3.j j10) {
                            bl3 = false;
                        }
                        if (bl3) continue;
                        bl2 = false;
                    }
                }
                throw new ax.b3.a();
            }
            return bl;
        }

        private void F(m m8) {
            block6: {
                block5: {
                    if (!m8.b) break block5;
                    if (!this.k.c0) break block6;
                    n n8 = m8.a;
                    try {
                        if (this.k.x.contains(n8)) {
                            this.k.x.remove(n8);
                            int n9 = this.k.w().n();
                            int n10 = this.k.w().C();
                            if (n9 == m8.c && n10 == m8.d && !this.z(n8)) {
                                this.k.I.P(n8);
                            }
                        }
                    }
                    catch (ax.b3.j j8) {
                        j8.printStackTrace();
                    }
                }
                return;
            }
            ax.u3.b.f();
        }

        private String I(String string) {
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("/sdcard/")) {
                    string2 = string.replaceFirst("/sdcard", ax.Q2.e.v());
                }
            }
            return string2;
        }

        private boolean J() {
            if (this.k.E) {
                return this.k.w().k() == this.k.w().j() + 1;
            }
            return this.k.w().M() == this.k.w().x() + 1;
        }

        private boolean K() {
            if (this.k.c0 && !this.k.E) {
                return this.k.l0 != null && this.k.l0 < 0x200000L;
            }
            return this.k.l0 != null && this.k.l0 < this.k.w().N() + 0x200000L;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private h O(n var1_1, n var2_2, c var3_3) {
            block25: {
                block28: {
                    block31: {
                        block30: {
                            block29: {
                                block23: {
                                    block24: {
                                        block27: {
                                            block26: {
                                                try {
                                                    if (!e.K0(this.k) || e.L0(this.k)) break block23;
                                                    if (e.X1(this.k) != 0 && e.m1(this.k, var1_1) && !var1_1.n()) {
                                                        this.k.w().c(v.b.d0, 1);
                                                        this.k.w().a(1);
                                                        e.n1().fine("Thumbnail file skipped!!");
                                                        return ax.W2.e$h.q;
                                                    }
                                                }
                                                catch (ax.b3.j var8_5) {
                                                }
                                                var7_8 = var2_2.P();
                                                if (!ax.Q2.f.z0(var7_8)) break block26;
                                                var5_12 = true;
                                                break block24;
                                            }
                                            if (ax.Q2.f.u0(var7_8)) ** GOTO lbl-1000
                                            if (ax.Q2.f.p0 == var7_8) {
                                                ** if (this.k.w().N() <= 500000000L) goto lbl-1000
lbl-1000:
                                                // 1 sources

                                                {
                                                    var5_12 = this.J();
                                                    break block24;
                                                }
                                            }
                                            break block27;
lbl-1000:
                                            // 2 sources

                                            {
                                                var5_12 = false;
                                            }
                                            break block24;
                                        }
                                        var5_12 = this.J();
                                    }
                                    e.O0(this.k).h0(var1_1, e.F0(this.k), var2_2, var5_12, var3_3 /* !! */ , this.k.V());
                                    e.l1(this.k).add(var2_2);
                                    var3_3 /* !! */  = ax.W2.e$h.q;
                                    break block25;
                                }
                                var6_14 = this.J();
                                var7_9 = var2_2.P();
                                var5_13 = ax.Q2.f.z0(var7_9) != false || ax.Q2.f.u0(var7_9) != false || this.k.w().N() <= 500000000L && ax.Q2.f.p0 == var7_9 ? false : var6_14;
                                e.O0(this.k).j(var1_1, e.F0(this.k), var2_2, true, true, var5_13, var3_3 /* !! */ , this.k.V());
                                if (e.K0(this.k)) {
                                    e.S0(this.k).add(var1_1.Q());
                                    e.q1(this.k);
                                    if (var6_14) {
                                        this.y(var2_2);
                                    }
                                }
                                e.l1(this.k).add(var2_2);
                                if (var6_14) {
                                    e.r1(this.k);
                                }
                                var3_3 /* !! */  = ax.W2.e$h.q;
                                break block25;
                                catch (ax.b3.a var3_4) {
                                    var3_3 /* !! */  = ax.W2.e$h.d0;
                                    break block25;
                                }
                                var4_15 = this.k.q0(var8_5);
                                var8_5.printStackTrace();
                                var3_3 /* !! */  = var4_15 == 50 ? ax.W2.e$h.e0 : ax.W2.e$h.c0;
                                if (var1_1 != null) {
                                    var7_10 = new StringBuilder();
                                    var7_10.append("sourceLocation : ");
                                    var7_10.append(var1_1.R());
                                    var7_10 = var7_10.toString();
                                } else {
                                    var7_10 = "sourceFile null";
                                }
                                if (var2_2 != null) {
                                    var9_16 = new StringBuilder();
                                    var9_16.append((String)var7_10);
                                    var9_16.append(",targetLocation : ");
                                    var9_16.append(var2_2.R());
                                    var7_10 = var9_16.toString();
                                } else {
                                    var9_16 = new StringBuilder();
                                    var9_16.append((String)var7_10);
                                    var9_16.append(",targetFile null");
                                    var7_10 = var9_16.toString();
                                }
                                if (var4_15 == 10 || var4_15 == 100 || var4_15 == 50 || var4_15 == 160) break block25;
                                if (var4_15 == 60 || var4_15 == 70 || var4_15 == 40 || var4_15 == 30 || var4_15 == 90 || var4_15 == 150) break block28;
                                if (var4_15 != 80) break block29;
                                ax.Ha.c.h().f().d("UNSUPPORTED ENCRYPTION : PASTE FAILED").g(var7_10).l(var8_5).h();
                                break block25;
                            }
                            if (var4_15 != 20) break block30;
                            ax.Ha.c.h().f().d("PASTE FAILED : FILE NOT FOUND").g(var7_10).l(var8_5).h();
                            break block25;
                        }
                        if (var8_5.getMessage() == null || !var8_5.getMessage().contains("CreateDocument Parent not exists")) break block31;
                        var8_6 = (String)e.D0(this.k).get(var1_1.E());
                        if (!(var2_2 == null || ax.c3.d0.M(var2_2.B()) && ax.c3.d0.M(ax.c3.d0.h(var2_2.T())))) {
                            this.k.r0(40);
                            break block25;
                        } else {
                            try {
                                var7_10 = new StringBuilder();
                                var7_10.append("target:");
                                var7_10.append(e.s1(this.k).E());
                                var7_10.append(",currentTarget:");
                                var7_10.append(var2_2.E());
                                var7_10.append(",lastCreatedFolder:");
                                var7_10.append(e.I0(this.k));
                                var7_10.append(",currentSource:");
                                var7_10.append(var1_1.E());
                                var7_10.append(",sourceParent:");
                                var7_10.append(var8_6);
                                var7_10 = var7_10.toString();
                                ax.Ha.c.h().f().d("PASTE FAILED NO PARENT").g(var7_10).h();
                            }
                            catch (Exception var7_11) {}
                        }
                        break block25;
                    }
                    if (var8_5.getMessage() != null && var8_5.getMessage().contains("EIO") || var8_5.getCause() != null && var8_5.getCause().getMessage() != null && var8_5.getCause().getMessage().contains("EIO")) break block25;
                    if (var1_1 != null && ax.Q2.f.n0(var1_1.P())) {
                        ax.Ha.c.h().f().d("PASTE FAILED : SOURCE NETWORK").l(var8_5).g(var7_10).h();
                        break block25;
                    } else if (var2_2 != null && ax.Q2.f.n0(var2_2.P())) {
                        ax.Ha.c.h().f().d("PASTE FAILED : TARGET NETWORK").l(var8_5).g(var7_10).h();
                        break block25;
                    } else {
                        ax.Ha.c.h().f().d("PASTE FAILED").l(var8_5).g(var7_10).h();
                    }
                    break block25;
                }
                var9_16 = ax.Ha.c.h().f().d("PASTE FAILED HAS KNOWN REASON");
                var8_7 = new StringBuilder();
                var8_7.append((String)var7_10);
                var8_7.append(",");
                var8_7.append(var4_15);
                var9_16.g(var8_7.toString()).h();
            }
            if (var3_3 /* !! */  == ax.W2.e$h.q) {
                this.k.w().c(v.b.q, 1);
                this.k.w().a(1);
                return var3_3 /* !! */ ;
            }
            if (var3_3 /* !! */  == ax.W2.e$h.e0) return var3_3 /* !! */ ;
            e.y0(this.k, var1_1, var2_2.B(), 1);
            return var3_3 /* !! */ ;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void Q(n object, n object2, j.f f8) throws l {
            int n8;
            long l8 = this.k.w().z();
            int n9 = this.k.w().n();
            Object object3 = this.k.Y;
            boolean bl = false;
            boolean bl2 = object2 == object3;
            switch (d.b[f8.ordinal()]) {
                default: {
                    ax.u3.b.g("invalid overwrite type");
                    object2 = ax.W2.e$h.c0;
                    break;
                }
                case 6: {
                    this.k.i();
                    object2 = ax.W2.e$h.d0;
                    break;
                }
                case 5: {
                    long l9;
                    if (object.isDirectory()) {
                        object2 = this.k.m2(((n)object).Q(), null);
                        n8 = ((f)object2).a;
                        l9 = ((f)object2).b;
                    } else {
                        l9 = object.p();
                        n8 = 1;
                    }
                    this.k.w().c(v.b.d0, n8);
                    this.k.w().a(n8);
                    if (l9 > 0L) {
                        this.k.w().e(l9);
                    }
                    object2 = ax.W2.e$h.q;
                    break;
                }
                case 4: {
                    try {
                        boolean bl3 = ((n)object).E().equals(((n)object2).E());
                        object3 = this.k.K.X((n)object2, bl3);
                        this.k.x2(object3);
                        if (object.isDirectory()) {
                            this.k.v2(((n)object).E(), object3.E());
                        }
                        object3 = this.P((n)object, (n)object3);
                        object2 = object3;
                        break;
                    }
                    catch (ax.b3.j j8) {}
                    n8 = object.isDirectory() ? this.k.l2(((n)object).Q()) : 1;
                    if (n8 == 0) {
                        e.Y0(this.k, true);
                    }
                    this.k.u2((n)object, ((n)object2).B(), n8);
                    j8.printStackTrace();
                    object2 = ax.W2.e$h.c0;
                    break;
                }
                case 3: {
                    if (object.q() / 1000L > object2.q() / 1000L || object.p() != object2.p() && object.q() > object2.q()) {
                        object2 = this.P((n)object, (n)object2);
                        break;
                    }
                    this.k.w().c(v.b.d0, 1);
                    this.k.w().a(1);
                    long l10 = object.p();
                    if (l10 > 0L) {
                        this.k.w().e(l10);
                    }
                    object2 = ax.W2.e$h.q;
                    break;
                }
                case 1: 
                case 2: {
                    object2 = this.P((n)object, (n)object2);
                }
            }
            if (object2 == ax.W2.e$h.e0) {
                this.k.w().c0(l8);
                this.k.w().W(n9);
                throw new l();
            }
            if (bl2 && this.k.a0 != null) {
                this.k.o0.add(this.k.a0.B());
            }
            if (this.k.z == null) return;
            if (!this.k.z.isEmpty()) return;
            if (this.isCancelled()) return;
            if (this.k.E && object2 == ax.W2.e$h.q) {
                if (this.k.P != this.k.a.n()) return;
                if (this.k.V != 0) return;
                n8 = this.k.a.H() - this.k.Q;
                bl2 = bl;
                if (this.k.T == n8) {
                    bl2 = bl;
                    if (this.k.U > 0) {
                        bl2 = true;
                    }
                }
                if (this.k.S + this.k.T != n8) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("expected:");
                    ((StringBuilder)object2).append(this.k.S);
                    ((StringBuilder)object2).append(",");
                    ((StringBuilder)object2).append(this.k.T);
                    ((StringBuilder)object2).append(",result:");
                    ((StringBuilder)object2).append(this.k.a.H());
                    ((StringBuilder)object2).append(",");
                    ((StringBuilder)object2).append(this.k.Q);
                    ((StringBuilder)object2).append(",");
                    ((StringBuilder)object2).append(this.k.a.C());
                    ((StringBuilder)object2).append(",");
                    ((StringBuilder)object2).append(this.k.R);
                    ((StringBuilder)object2).append(",dir:");
                    ((StringBuilder)object2).append(this.k.W);
                    ((StringBuilder)object2).append(",type:");
                    ((StringBuilder)object2).append((Object)f8);
                    ((StringBuilder)object2).append(",location:");
                    ((StringBuilder)object2).append(((n)object).P().I());
                    object = ((StringBuilder)object2).toString();
                    ax.Ha.c.h().f().b("MOVE FILE COUNT NOT MATCH").g(object).h();
                }
                object = this.k;
                ((e)object).w2(((e)object).X);
                object = this.k;
                ((e)object).x2(((e)object).Y);
                this.k.l0(true);
                if (bl2) {
                    this.k.w().c(v.b.q, 1);
                    return;
                }
                if (this.G(this.k.X)) {
                    this.k.w().c(v.b.q, 1);
                    return;
                }
                this.k.w().c(v.b.c0, 1);
                this.k.w().b(this.k.X.B());
                this.k.r0(130);
                return;
            }
            if (!this.k.c0) return;
            this.D();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void w(o object, n n8) {
            Iterator<n> iterator;
            boolean bl;
            block10: {
                if (n8 == null) return;
                if (!n8.isDirectory()) {
                    return;
                }
                if (!n8.n()) {
                    object = ax.Ha.c.h().f().b("ADD SUB FILE NOT EXIST");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("location:");
                    stringBuilder.append(n8.R());
                    stringBuilder.append(",");
                    stringBuilder.append(n8.E());
                    ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    return;
                }
                if (this.k.k0 != 0 && this.k.r2(n8)) {
                    this.k.w().d0(this.k.w().M() - this.k.k0);
                    this.k.w().e0(this.k.w().N() - this.k.j0);
                    bl = true;
                } else {
                    bl = false;
                }
                try {
                    iterator = ax.c3.q.g(((o)object).g0(n8, m.f.q, false, false), ax.c3.q.c("DateDown")).iterator();
                    break block10;
                }
                catch (ax.b3.j j8) {}
                j8.printStackTrace();
                return;
            }
            while (iterator.hasNext()) {
                Object object2;
                n n9 = iterator.next();
                if (bl) {
                    try {
                        object2 = this.k;
                        ((e)object2).k2((o)object, n9, ((e)object2).C, q0);
                    }
                    catch (ax.b3.a a8) {}
                }
                object2 = this.k.z;
                m m8 = new m(n9, false, 0, 0);
                ((LinkedList)object2).push(m8);
                object2 = (String)this.k.B.get(n8.E());
                if (TextUtils.isEmpty((CharSequence)object2)) continue;
                this.k.B.put(n9.E(), object2);
            }
        }

        private void x(n n8, n n9) throws ax.b3.j {
            if (!n9.n()) {
                if (this.k.K.k(n9, false)) {
                    Object object;
                    this.k.G.add(new AbstractMap.SimpleEntry<n, g>(n9, new g(n8.q(), n8.D())));
                    if (ax.Q2.f.V(n9.P()) && !ax.c3.d0.M((String)(object = n9.B())) && !this.k.K.z(n9.E()).n()) {
                        object = ax.c3.d0.Q(n9.T(), ax.c3.d0.b((String)object));
                        object = this.k.K.z((String)object);
                        if (object.n()) {
                            this.k.v2(n8.E(), ((n)object).E());
                        }
                    }
                    e.J0(this.k, n9.E());
                } else {
                    throw new ax.b3.j("Could not create folder in addSubFiles");
                }
            }
            if (this.k.c0 && !this.k.E) {
                int n10 = this.k.w().n();
                int n11 = this.k.w().C();
                this.k.z.push(new m(n8, true, n10, n11));
            }
            this.w(this.k.I, n8);
            if (this.k.c0) {
                if (this.k.x == null) {
                    e.R0(this.k, new ArrayList());
                }
                this.k.x.add(0, n8);
                this.k.F.add(n8.Q());
                e.V0(this.k);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void y(n object) throws ax.b3.j {
            ax.b3.j j82;
            block7: {
                ax.Q2.f f8 = this.k.K.S();
                if (f8 != ax.Q2.f.p0) return;
                if (this.k.w().z() <= 500000000L) {
                    return;
                }
                try {
                    if (this.k.l0 == null) return;
                    long l8 = this.k.K.v();
                    if (l8 <= 0L) return;
                    l8 = this.k.l0 - l8;
                    long l9 = this.k.w().z() * 2L / 3L;
                    if (l8 <= 0L) return;
                    if (l8 >= l9) return;
                    int n8 = this.A((n)object) ^ 1;
                    object = this.k.b0.iterator();
                    while (object.hasNext()) {
                        if (this.A((n)object.next())) continue;
                        ++n8;
                    }
                    if (n8 <= 10) {
                        return;
                    }
                    ax.Ha.b b8 = ax.Ha.c.h().f().b("SD WRITTEN FILE NOT EXIST");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("location:");
                    ((StringBuilder)object).append((Object)f8);
                    ((StringBuilder)object).append(",increased:");
                    ((StringBuilder)object).append(l8);
                    ((StringBuilder)object).append(",progressed:");
                    ((StringBuilder)object).append(this.k.w().z());
                    ((StringBuilder)object).append(",total:");
                    ((StringBuilder)object).append(this.k.w().N());
                    ((StringBuilder)object).append(",isAllInvalid:");
                    ((StringBuilder)object).append(n8);
                    b8.g(((StringBuilder)object).toString()).h();
                    throw new B("SD card corruption is detected. Written file not exist.");
                }
                catch (Exception exception) {
                }
                catch (ax.b3.j j82) {
                    break block7;
                }
                ax.Ha.c.h().f().b("checkLastFileWriteCheck error").l(exception).h();
                exception.printStackTrace();
                return;
            }
            j82.printStackTrace();
        }

        private boolean z(n n8) throws ax.b3.j {
            if (ax.Q2.f.g0(this.k.I.S())) {
                o o8 = ax.c3.x.g(n8.E());
                return o8.f0(o8.z(n8.E())).size() != 0;
            }
            return this.k.I.f0(n8).size() != 0;
        }

        boolean G(n n8) {
            if (this.k.I.O()) {
                try {
                    if (this.k.F.contains(n8.Q())) {
                        this.k.I.I(n8);
                    }
                    return true;
                }
                catch (ax.b3.j j8) {
                    return false;
                }
            }
            try {
                boolean bl = this.E(n8);
                return bl;
            }
            catch (ax.b3.a | ax.b3.j exception) {
                return false;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Integer H(Void ... var1_1) {
            block47: {
                try {
                    do {
                        block50: {
                            block49: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                block48: {
                                                    this.k.v0();
                                                    if (this.isCancelled()) break;
                                                    if (this.K()) {
                                                        var5_6 = e.n1();
                                                        var1_1 = new StringBuilder();
                                                        var1_1.append("not enough free space. free : ");
                                                        var1_1.append(e.j1(this.k));
                                                        var1_1.append(", total:");
                                                        var1_1.append(this.k.w().N());
                                                        var5_6.severe(var1_1.toString());
                                                        this.k.w().c(v.b.c0, this.k.w().M());
                                                        this.k.w().a(this.k.w().k());
                                                        e.I1(this.k).clear();
                                                        e.B0(this.k).clear();
                                                        this.k.r0(10);
                                                        return 0;
                                                    }
                                                    if (this.h) {
                                                        this.h = false;
                                                        this.Q(e.K1(this.k), e.y1(this.k), this.i);
                                                        continue;
                                                    }
                                                    if (this.j) {
                                                        this.j = false;
                                                        this.Q(e.K1(this.k), e.y1(this.k), j.f.q);
                                                        continue;
                                                    }
                                                    if (!e.B0(this.k).isEmpty()) {
                                                        var1_1 = (m)e.B0(this.k).pop();
                                                        if (var1_1.b) {
                                                            this.F((m)var1_1);
                                                            continue;
                                                        }
                                                        var8_15 = var1_1.a;
                                                        var2_3 = 0;
                                                    } else {
                                                        var8_15 = (n)e.I1(this.k).pop();
                                                        e.M1(this.k, var8_15);
                                                        var1_1 = this.k;
                                                        e.B1((e)var1_1, var1_1.w().n());
                                                        var1_1 = this.k;
                                                        e.D1((e)var1_1, var1_1.w().H());
                                                        var1_1 = this.k;
                                                        e.F1((e)var1_1, var1_1.w().C());
                                                        e.p1(this.k, 0);
                                                        e.a1(this.k, 0);
                                                        e.U0(this.k, 0);
                                                        e.d1(this.k, 0);
                                                        e.g1(this.k, 0);
                                                        var2_3 = 1;
                                                    }
                                                    e.H1(this.k, var8_15);
                                                    var1_1 = var8_15.E();
                                                    var4_5 = ax.c3.d0.B((String)var1_1);
                                                    if (var4_5) break block48;
                                                    var4_5 = var1_1.endsWith("/");
                                                    if (var4_5) {
                                                        var9_16 /* !! */  = var8_15.T();
                                                        var5_6 = var8_15.B();
                                                        var7_14 = ax.Ha.c.h().b("Illegal File Path 1");
                                                        var6_13 = new StringBuilder();
                                                        var6_13.append(e.O0(this.k).T().toString());
                                                        var6_13.append(",parent=");
                                                        var6_13.append(var9_16 /* !! */ );
                                                        var6_13.append(",path=");
                                                        var6_13.append((String)var1_1);
                                                        var6_13.append(",name=");
                                                        var6_13.append((String)var5_6);
                                                        var7_14.g(var6_13.toString()).h();
                                                    } else {
                                                        var6_13 = ax.Ha.c.h().b("Illegal File Path 2");
                                                        var5_6 = new StringBuilder();
                                                        var5_6.append("loc=");
                                                        var5_6.append(e.O0(this.k).T().toString());
                                                        var5_6.append(",path=");
                                                        var5_6.append((String)var1_1);
                                                        var6_13.g(var5_6.toString()).h();
                                                    }
                                                    ** GOTO lbl102
                                                }
                                                if ("/".equals(var1_1)) {
                                                    ax.Ha.c.h().d("!!ROOTSRC").g(e.O0(this.k).T().toString()).h();
lbl102:
                                                    // 3 sources

                                                    var3_4 = true;
                                                } else {
                                                    var3_4 = false;
                                                }
                                                var1_1 = null;
                                                if (var3_4) break block49;
                                                var1_1 = e.O1(this.k, var8_15.E());
                                                if (!TextUtils.isEmpty((CharSequence)var1_1)) break block43;
                                                var1_1 = this.k;
                                                var1_1 = e.P1((e)var1_1, var8_15, e.s1((e)var1_1));
                                            }
                                            var6_13 = e.F0(this.k).z((String)var1_1);
                                            try {
                                                e.u1(this.k, (n)var6_13);
                                                if (var2_3 == 0) break block44;
                                                e.Q1(this.k, (n)var6_13);
                                            }
                                            catch (IllegalArgumentException var5_7) {
                                                var7_14 = var1_1;
                                                var1_1 = var6_13;
                                                break block45;
                                            }
                                            catch (ax.b3.j var5_8) {
                                                var7_14 = var1_1;
                                                var1_1 = var6_13;
                                                break block46;
                                            }
                                        }
                                        var10_17 = null;
                                        var5_6 = var6_13;
                                        var7_14 = var1_1;
                                        var9_16 /* !! */  = null;
                                        var6_13 = var10_17;
                                        var1_1 = var5_6;
                                        var5_6 = var9_16 /* !! */ ;
                                        break block50;
                                        catch (IllegalArgumentException var5_9) {
                                            var6_13 = null;
                                            var7_14 = var1_1;
                                            var1_1 = var6_13;
                                            break block45;
                                        }
                                        catch (ax.b3.j var5_10) {
                                            var6_13 = null;
                                            var7_14 = var1_1;
                                            var1_1 = var6_13;
                                            break block46;
                                        }
                                        catch (IllegalArgumentException var5_11) {
                                            var7_14 = null;
                                            var1_1 = null;
                                        }
                                        catch (ax.b3.j var5_12) {
                                            var7_14 = null;
                                            var1_1 = null;
                                            break block46;
                                        }
                                    }
                                    var5_6.printStackTrace();
                                    var6_13 = null;
                                    break block50;
                                }
                                var5_6.printStackTrace();
                                var9_16 /* !! */  = null;
                                var6_13 = var5_6;
                                var5_6 = var9_16 /* !! */ ;
                                break block50;
                            }
                            var6_13 = null;
                            var7_14 = var5_6 = null;
                        }
                        if (var1_1 == null) {
                            if (var6_13 != null) {
                                this.k.q0((ax.b3.j)var6_13);
                            }
                            if (var3_4) {
                                this.k.r0(40);
                            } else if (var6_13 == null) {
                                if (var5_6 != null) {
                                    var1_1 = ax.Ha.c.h().f().d("CLIPBOARD TARGET PATH");
                                    var6_13 = new StringBuilder();
                                    var6_13.append("source");
                                    var6_13.append(e.O0(this.k).T().toString());
                                    var6_13.append(",target:");
                                    var6_13.append(e.F0(this.k).T().toString());
                                    var1_1.g(var6_13.toString()).l((Throwable)var5_6).h();
                                } else {
                                    var1_1 = ax.Ha.c.h().f().d("CTNUL2");
                                    var5_6 = new StringBuilder();
                                    var5_6.append(e.F0(this.k).T().toString());
                                    var5_6.append(":");
                                    var5_6.append((String)var7_14);
                                    var1_1.g(var5_6.toString()).h();
                                }
                            }
                            var2_3 = var8_15.isDirectory() != false ? e.X0(this.k, var8_15.Q()) : 1;
                            if (var2_3 == 0) {
                                e.Y0(this.k, true);
                            }
                            e.y0(this.k, var8_15, var8_15.B(), var2_3);
                            continue;
                        }
                        this.k.l0(true);
                        if (ax.c3.B.O(var8_15, e.s1(this.k))) {
                            var7_14 = var8_15.E();
                            var6_13 = e.s1(this.k).E();
                            var5_6 = var8_15.T();
                            var10_17 = var8_15.P();
                            if (var10_17 != (var9_16 /* !! */  = ax.Q2.f.t0) && e.s1(this.k).P() != var9_16 /* !! */ ) {
                                var2_3 = 0;
                            } else {
                                var7_14 = this.I((String)var7_14);
                                var6_13 = this.I((String)var6_13);
                                var5_6 = this.I((String)var5_6);
                                var2_3 = 1;
                            }
                            if (this.L(var8_15.isDirectory(), (String)var7_14, (String)var6_13)) {
                                return 3;
                            }
                            if (ax.c3.d0.G((String)var5_6, (String)var6_13)) {
                                if (e.K0(this.k)) {
                                    return 4;
                                }
                                if (var2_3 != 0 && !ax.c3.d0.G(var8_15.T(), e.s1(this.k).E())) {
                                    return 4;
                                }
                                this.Q(var8_15, (n)var1_1, j.f.d0);
                                continue;
                            }
                        }
                        if (var1_1.n()) {
                            if (var8_15.isDirectory() != var1_1.isDirectory()) {
                                return 2;
                            }
                            if (var8_15.isDirectory() && e.N0(this.k)) {
                                this.Q(var8_15, (n)var1_1, e.i1(this.k));
                                continue;
                            }
                            if (!var8_15.isDirectory() && e.w1(this.k)) {
                                this.Q(var8_15, (n)var1_1, e.L1(this.k));
                                continue;
                            }
                            return 1;
                        }
                        this.Q(var8_15, (n)var1_1, j.f.q);
                    } while (!e.I1(this.k).isEmpty() || !e.B0(this.k).isEmpty());
                    if (!e.F0(this.k).r0()) break block47;
                    for (Object var6_13 : e.G0(this.k)) {
                        var5_6 = (n)var6_13.getKey();
                        var6_13 = (g)var6_13.getValue();
                        ((i0)e.F0(this.k).u()).d((n)var5_6, var6_13.a);
                        if (var6_13.b == null || var5_6.R() != ax.c3.K.h || !ax.Z2.j.F().q()) continue;
                        com.voxdon.xplorer.file.z.Y().V(var5_6.E(), var6_13.b);
                    }
                }
                catch (l var1_2) {
                    return 11;
                }
            }
            return 0;
        }

        boolean L(boolean bl, String string, String string2) {
            return bl && (ax.c3.d0.G(string, string2) || ax.c3.d0.I(string, string2));
        }

        protected void M(Integer n8) {
            this.k.g0();
        }

        protected void N(Integer object) {
            int n8 = (Integer)object;
            if (n8 == 0) {
                this.k.t2();
                return;
            }
            if (n8 == 11) {
                object = this.k;
                ((e)object).B2(((e)object).Z, this.k.a0);
                return;
            }
            object = this.k;
            ((e)object).A2(((e)object).Z, this.k.a0, n8);
        }

        h P(n n8, n n9) {
            this.k.l0(true);
            if (n8.isDirectory()) {
                if (this.k.g2(n8, n9)) {
                    return this.C(n8, n9, this);
                }
                try {
                    this.x(n8, n9);
                    h h8 = ax.W2.e$h.q;
                    return h8;
                }
                catch (ax.b3.j j8) {
                    j8.printStackTrace();
                    int n10 = this.k.l2(n8.Q());
                    if (n10 == 0) {
                        e.Y0(this.k, true);
                    }
                    this.k.u2(n8, n9.B(), n10);
                    return ax.W2.e$h.c0;
                }
            }
            return this.O(n8, n9, this);
        }

        public void R(boolean bl) {
            this.j = bl;
        }
    }

    private static class k {
        String a;
        String b;

        k(String string, String string2) {
            this.a = string;
            this.b = string2;
        }
    }

    private static class l
    extends Exception {
        private l() {
        }
    }

    static class m {
        n a;
        boolean b;
        int c;
        int d;

        m(n n8, boolean bl, int n9, int n10) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
            this.d = n10;
        }
    }
}

