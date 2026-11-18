/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.net.Uri;
import android.os.Build;
import ax.Q2.d;
import ax.Q2.f;
import ax.T2.h;
import ax.W2.j;
import ax.X2.Q;
import ax.Z2.j;
import ax.b3.e;
import ax.b3.u;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.d0;
import ax.c3.v;
import ax.g3.i;
import ax.u3.q;
import com.voxdon.xplorer.file.K;
import com.voxdon.xplorer.file.f;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class J
extends x {
    public static Uri A;
    private static HashSet<ax.c3.K> B;
    private static final Object C;
    private static final Object z;

    static {
        z = new Object();
        B = new HashSet();
        C = new Object();
    }

    public static void V1(ax.c3.K k8) {
        if (k8.b() == 0) {
            J.W1(ax.c3.K.e);
            if (j.F().t0()) {
                J.W1(ax.c3.K.f);
            }
            return;
        }
        J.W1(h.q(k8.b()));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void W1(ax.c3.K var0) {
        var1_4 = System.currentTimeMillis();
        var5_5 = ax.c3.x.e(var0);
        var3_6 = var5_5.z(J.b2(var0));
        if (!var3_6.n()) {
            return;
        }
        for (n var7_9 : var5_5.f0((n)var3_6)) {
            var6_8 = var7_9.B();
            if (!"dirs".equals(var6_8) && !"files".equals(var6_8)) {
                if (".nomedia".equals(var6_8)) continue;
                var5_5.m(var7_9);
                continue;
            }
            if (var7_9.isDirectory()) {
                var6_8 = var5_5.f0(var7_9).iterator();
                while (var6_8.hasNext()) {
                    var5_5.m((n)var6_8.next());
                }
                continue;
            }
            var5_5.m(var7_9);
        }
        h.S(var0).v0();
        h.a0().v0();
        if (var0.d() != f.p0 || var5_5.B((n)var3_6)) ** GOTO lbl37
        var3_6 = J.C;
        ** synchronized (var3_6)
lbl-1000:
        // 1 sources

        {
            try {
                if (J.B.contains(var0) != false) return;
                var4_7 = new b(var1_4, var0, var0.e());
                var4_7.i(new Void[0]);
                J.B.add(var0);
                return;
            }
            catch (Throwable var0_1) {}
        }
        throw var0_1;
lbl37:
        // 1 sources

        if (var0.d() != f.o0) return;
        if (Q.B() == false) return;
        var3_6 = J.C;
        ** synchronized (var3_6)
lbl-1000:
        // 1 sources

        {
            try {
                if (J.B.contains(var0) != false) return;
                var5_5 = d0.P(var0.e(), "/Android/obb");
                var4_7 = new b(var1_4, var0, (String)var5_5);
                var4_7.i(new Void[0]);
                J.B.add(var0);
                return;
            }
            catch (Throwable var0_2) {}
        }
        try {
            throw var0_2;
        }
        catch (ax.b3.j var0_3) {
            var0_3.printStackTrace();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void X1(ax.c3.K object, boolean bl) throws ax.b3.j {
        String string = J.b2((ax.c3.K)object);
        o o8 = ax.c3.x.e((ax.c3.K)object);
        y y8 = (y)o8.z(string);
        if (!y8.n()) {
            if (!o8.k(y8, false)) throw new ax.b3.j("Could not create Recycle Bin folder!");
            if (bl) {
                ax.Ha.b b8 = ax.Ha.c.h().f().c("CREATE RECYCLE BIN FOLDER");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(",writable:");
                stringBuilder.append(j.F().j0((ax.c3.K)object));
                stringBuilder.append(",useDocumentFile:");
                stringBuilder.append(y8.i0());
                stringBuilder.append(",loc:");
                stringBuilder.append(y8.P().I());
                stringBuilder.append(",location:");
                stringBuilder.append(((ax.c3.K)object).toString());
                stringBuilder.append(",baseloc:");
                stringBuilder.append(y8.B0().toString());
                b8.g(stringBuilder.toString()).h();
            }
        } else if (bl) {
            ax.Ha.c.h().f().c("CREATE RECYCLE BIN REPORT DIR EXIST").g(string).h();
        }
        if (!(object = o8.z(d0.Q(string, ".nomedia"))).n()) {
            o8.N((n)object);
        }
        if (!(object = o8.z(d0.Q(string, "dirs"))).n()) {
            o8.k((n)object, false);
        }
        if ((object = o8.z(d0.Q(string, "files"))).n()) return;
        o8.k((n)object, false);
    }

    private static ax.c3.K Y1(y y8) throws ax.b3.j {
        ax.c3.K k8 = y8.B0();
        int n8 = a.a[k8.d().ordinal()];
        if (n8 != 1 && n8 != 2) {
            ax.Ha.b b8 = ax.Ha.c.h().f().b("Invalid Recycle Bin Base location").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loc:");
            stringBuilder.append(y8.R().toString());
            stringBuilder.append(",base:");
            stringBuilder.append(k8.toString());
            b8.g(stringBuilder.toString()).h();
            throw new ax.b3.j("Invalid base location");
        }
        return k8;
    }

    public static long Z1(o o8, n n8, Map<String, f.a> map) {
        if (n8.isDirectory()) {
            if (map != null && map.containsKey(n8.Q())) {
                return map.get((Object)n8.Q()).c;
            }
            return J.a2(o8, n8);
        }
        return n8.p();
    }

    private static long a2(o o8, n object) {
        Stack<n> stack = new Stack<n>();
        stack.push((n)object);
        long l8 = 0L;
        while (!((AbstractCollection)stack).isEmpty()) {
            object = (n)stack.pop();
            if (object.isDirectory()) {
                try {
                    object = o8.f0((n)object).iterator();
                    while (object.hasNext()) {
                        stack.push((n)object.next());
                    }
                    continue;
                }
                catch (ax.b3.j j8) {
                    j8.printStackTrace();
                    continue;
                }
            }
            l8 += object.p();
        }
        return l8;
    }

    public static String b2(ax.c3.K k8) {
        if (!d0.B(k8.e())) {
            ax.Ha.b b8 = ax.Ha.c.h().f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not normalized root path in recycle bin :");
            stringBuilder.append(k8.e());
            b8.b(stringBuilder.toString()).h();
        }
        return d0.Q(k8.e(), ".$recycle_bin$");
    }

    private static boolean e2(n stringArray) {
        if (stringArray.isDirectory()) {
            return false;
        }
        if ((stringArray = stringArray.B().split("_")).length < 4) {
            return false;
        }
        if (stringArray[0].length() != 1) {
            return false;
        }
        try {
            Long.valueOf(stringArray[1]);
            Long.valueOf(stringArray[2]);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public static boolean f2(n n8) {
        if (!Q.q()) {
            return false;
        }
        if (!ax.c3.B.P(n8)) {
            return false;
        }
        if (!f.k0((n8 = (y)n8).P())) {
            return false;
        }
        return y.Y0(((y)n8).C0());
    }

    public static boolean g2(n n8) {
        return n8 instanceof K && ((K)n8).C1();
    }

    public static boolean h2(n n8) {
        return Q.B() && x.i1(n8);
    }

    public static boolean i2(n n8) {
        if (Q.B() && x.i1(n8)) {
            return true;
        }
        return Q.L() && x.h1(n8);
    }

    public static boolean j2(n n8) {
        if (!ax.c3.B.P(n8)) {
            return false;
        }
        if (J.l2(n8.W())) {
            return true;
        }
        return J.k2(n8.B());
    }

    public static boolean k2(String string) {
        return string.startsWith(".$recycle_bin$");
    }

    public static boolean l2(String string) {
        return string != null && d0.H("/.$recycle_bin$", string);
    }

    private boolean m2(n n8) {
        if (J.j2(n8)) {
            return true;
        }
        return n8.E().contains(".$recycle_bin$");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n2(List<n> var1_1, ax.c3.K var2_3) {
        var5_4 = this.L0(J.b2(var2_3), var2_3);
        if (!var5_4.n()) {
            return;
        }
        try {
            var5_4 = super.C((n)var5_4, m.f.q);
        }
        catch (ax.b3.j var5_5) {
            return;
        }
        if (var5_4 == null) {
            return;
        }
        var3_6 = System.currentTimeMillis();
        var6_7 = var5_4.iterator();
        block12: while (var6_7.hasNext() != false) {
            var7_8 = (n)var6_7.next();
            if (var7_8.isDirectory() || !J.e2(var7_8)) continue;
            var5_4 = J.z;
            synchronized (var5_4) {
                block22: {
                    block23: {
                        block24: {
                            block21: {
                                try {
                                    var9_13 = new K(this, (y)var7_8, var2_3, true);
                                    if (var9_13.B1() != null) ** GOTO lbl70
                                    if (var7_8.q() >= var3_6 - 3600000L) ** GOTO lbl-1000
                                    var9_13 = ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 1-1");
                                    var8_11 = new StringBuilder();
                                    var8_11.append("location:");
                                    var8_11.append(var2_3.toString());
                                    var8_11.append(",size:");
                                    var8_11.append(var7_8.p());
                                    var8_11.append(",exists:");
                                    var8_11.append(var7_8.n());
                                    var8_11.append(",");
                                    var8_11.append(var3_6 - var7_8.q());
                                    var9_13.g(var8_11.toString()).h();
                                    this.P(var7_8);
                                }
                                catch (Throwable var1_2) {
                                    ** break block20
                                }
                                catch (ax.b3.j var8_12) {
                                    break block21;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var8_11 = ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 1-2");
                                    var9_13 = new StringBuilder();
                                    var9_13.append("location:");
                                    var9_13.append(var2_3.toString());
                                    var9_13.append(",size:");
                                    var9_13.append(var7_8.p());
                                    var9_13.append(",exists:");
                                    var9_13.append(var7_8.n());
                                    var9_13.append(",");
                                    var9_13.append(var3_6 - var7_8.q());
                                    var8_11.g(var9_13.toString()).h();
lbl68:
                                    // 2 sources

                                    continue block12;
lbl70:
                                    // 1 sources

                                    var8_11 = this.L0(var9_13.B1(), var9_13.B0());
                                    if (!this.m2((n)var8_11)) {
                                        var9_13 = ax.Ha.c.h().f().b("INVALID RECYCLED FILE");
                                        var10_14 = new StringBuilder();
                                        var10_14.append("location:");
                                        var10_14.append(var2_3.toString());
                                        var10_14.append(",");
                                        var10_14.append(var8_11.E());
                                        var9_13.g(var10_14.toString()).h();
                                        break block22;
                                    }
                                    if (var8_11.n()) {
                                        var1_1.add((n)var9_13);
                                        break block22;
                                    }
                                    if (var9_13.q() < var3_6 - 3600000L) {
                                        var8_11 = ax.Ha.c.h().f().c("RECYCLED FILE DELETED");
                                        var9_13 = new StringBuilder();
                                        var9_13.append("location:");
                                        var9_13.append(var2_3.toString());
                                        var8_11.g(var9_13.toString()).h();
                                        this.P(var7_8);
                                        break block22;
                                    } else {
                                        var9_13 = ax.Ha.c.h().f().c("RECYCLED FILE SKIPPED");
                                        var8_11 = new StringBuilder();
                                        var8_11.append("location:");
                                        var8_11.append(var2_3.toString());
                                        var9_13.g(var8_11.toString()).h();
                                    }
                                    break block22;
                                }
                            }
                            if (var8_12.getMessage() == null || !var8_12.getMessage().startsWith("Invalid RecycleBin Index")) break block22;
                            if (var7_8.q() >= var3_6 - 3600000L) break block23;
                            var8_11 = ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 2-1");
                            var9_13 = new StringBuilder();
                            var9_13.append("location:");
                            var9_13.append(var2_3.toString());
                            var9_13.append(",size:");
                            var9_13.append(var7_8.p());
                            var9_13.append(",exists:");
                            var9_13.append(var7_8.n());
                            var9_13.append(",");
                            var9_13.append(var3_6 - var7_8.q());
                            var8_11.g(var9_13.toString()).h();
                            try {}
                            catch (ax.b3.j var7_10) {
                            }
                            break block24;
                            catch (ax.b3.j var7_9) {}
                            {
                                ** continue;
                            }
                        }
                        this.P(var7_8);
                    }
                    var8_11 = ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 2-2");
                    var9_13 = new StringBuilder();
                    var9_13.append("location:");
                    var9_13.append(var2_3.toString());
                    var9_13.append(",size:");
                    var9_13.append(var7_8.p());
                    var9_13.append(",exists:");
                    var9_13.append(var7_8.n());
                    var9_13.append(",");
                    var9_13.append(var3_6 - var7_8.q());
                    var8_11.g(var9_13.toString()).h();
                    continue;
                }
            }
        }
        return;
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c o2(n var0, ax.c3.K var1_6) throws ax.b3.j {
        block15: {
            block16: {
                block17: {
                    var18_9 = ax.c3.x.e((ax.c3.K)var1_6);
                    var13_10 = null;
                    var14_11 = null;
                    var7_12 = var14_11;
                    var8_13 = var13_10;
                    try {
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var10_15 = new InputStreamReader(var18_9.J((n)var0, 0L));
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var7_12 = var9_14 = new BufferedReader((Reader)var10_15);
                        var8_13 = var9_14;
                    }
                    catch (Throwable var0_3) {
                        break block15;
                    }
                    catch (IOException var0_4) {
                        break block16;
                    }
                    try {
                        var15_16 = var9_14.readLine();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var16_17 = var9_14.readLine();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var17_18 = var9_14.readLine();
                        var7_12 = var9_14;
                        var12_19 = var15_16;
                        var11_20 = var16_17;
                        var10_15 = var17_18;
                        if (var15_16 != null) break block17;
                        var7_12 = var9_14;
                        var12_19 = var15_16;
                        var11_20 = var16_17;
                        var10_15 = var17_18;
                        if (var17_18 == null) break block17;
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var9_14.close();
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                    }
                    catch (Throwable var0_1) {
                        break block15;
                    }
                    catch (IOException var0_2) {
                        break block16;
                    }
                    {
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var10_15 = new InputStreamReader(var18_9.J((n)var0, 0L));
                        var7_12 = var14_11;
                        var8_13 = var13_10;
                        var7_12 = var9_14 = new BufferedReader((Reader)var10_15);
                        var8_13 = var9_14;
                    }
                    {
                        var12_19 = var9_14.readLine();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var11_20 = var9_14.readLine();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var10_15 = var9_14.readLine();
                        var7_12 = var9_14;
                    }
                }
                var9_14 = var7_12;
                if (var10_15 != null && var12_19 != null) ** GOTO lbl188
                var7_12 = var9_14;
                var8_13 = var9_14;
                {
                    var3_21 = System.currentTimeMillis();
                    var7_12 = var9_14;
                    var8_13 = var9_14;
                    var5_22 = var0.q();
                    var2_23 = (var3_21 -= var5_22) < 5000L && var3_21 >= 0L;
                    if (var1_6 == null) ** GOTO lbl137
                    var7_12 = var9_14;
                    var8_13 = var9_14;
                }
                {
                    block18: {
                        var14_11 = ax.Ha.c.h().f().d("LOAD RECYCLE INDEX").j();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10 = new StringBuilder();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append("exists:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(var0.n());
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append("just mod :");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(var2_23);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(",1:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(var12_19);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(",2:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(var11_20);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(",3:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append((String)var10_15);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(",base:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.append(var1_6.toString());
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var14_11.g(var13_10.toString()).h();
                        break block18;
lbl137:
                        // 1 sources

                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10 = ax.Ha.c.h().f().d("LOAD RECYCLE INDEX").j();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6 = new StringBuilder();
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append("exists:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(var0.n());
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append("just mod :");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(var2_23);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(",1:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(var12_19);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(",2:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(var11_20);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append(",3:");
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var1_6.append((String)var10_15);
                        var7_12 = var9_14;
                        var8_13 = var9_14;
                        var13_10.g(var1_6.toString()).h();
                    }
                    var7_12 = var9_14;
                    var8_13 = var9_14;
                    var0 = new c(var12_19, var11_20, (String)var10_15);
                }
                try {
                    var9_14.close();
                    return var0;
                }
                catch (IOException var1_7) {
                    return var0;
                }
            }
            var7_12 = var8_13;
            {
                var7_12 = var8_13;
                var1_6 = new ax.b3.j((Throwable)var0);
                var7_12 = var8_13;
                throw var1_6;
            }
        }
        if (var7_12 == null) throw var0_5;
        try {
            var7_12.close();
            throw var0_5;
        }
        catch (IOException var1_8) {
            throw var0_5;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void p2(o o8, n iterator, n n82, ax.u3.c c8, i i8) throws ax.b3.j, ax.b3.a {
        ax.u3.b.c(iterator.isDirectory());
        n n9 = n82;
        if (!n82.n()) {
            if (!o8.B((n)((Object)iterator)) && !((n)((Object)iterator)).T().equals(n82.T())) {
                if (!o8.k(n82, true)) throw new ax.b3.j("Create folder failed in move directory");
                n9 = o8.z(n82.E());
            } else {
                o8.E((n)((Object)iterator), n82, c8, i8);
                return;
            }
        }
        if (!n9.isDirectory()) throw new u();
        for (n n82 : o8.f0((n)((Object)iterator))) {
            n n10 = o8.z(d0.Q(n9.E(), n82.B()));
            if (n82.isDirectory()) {
                J.p2(o8, n82, n10, c8, i8);
                continue;
            }
            o8.h0(n82, o8, n10, true, c8, i8);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String q2(o var0, n var1_2, long var2_4) throws ax.b3.j, ax.b3.a {
        var9_5 = System.currentTimeMillis();
        var6_6 = var1_2.isDirectory();
        var12_7 = var6_6 != false ? "D" : "F";
        var14_8 = J.b2(J.Y1((y)var1_2));
        var15_13 = var1_2.E();
        var7_14 = var0.B(var1_2);
        var8_15 = J.h2(var1_2);
        var5_16 = 0;
        if (var7_14 && !var8_15) {
            var11_17 = var6_6 != false ? d0.Q((String)var14_8, "dirs") : d0.Q((String)var14_8, "files");
            var16_19 = var0.z((String)var11_17);
            var13_20 = var11_17;
            if (!var16_19.n()) {
                if (!var0.k((n)var16_19, false)) {
                    throw new ax.b3.j("Could not create recycle bin taret parent!");
                }
                var13_20 = var11_17;
            }
        } else {
            var13_20 = var1_2.T();
        }
        var20_21 = J.z;
        synchronized (var20_21) {
            var4_22 = 0;
            while (true) {
                block29: {
                    block30: {
                        var11_17 = new StringBuilder();
                        var11_17.append(".$recycle_bin$_");
                        var11_17.append(var9_5);
                        var11_17.append("_");
                        var11_17.append(var4_22);
                        var11_17 = d0.Q((String)var13_20, var11_17.toString());
                        var21_23 = var0.z((String)var11_17);
                        if (var21_23.n()) break block29;
                        var4_22 = var5_16;
lbl37:
                        // 2 sources

                        while (true) {
                            var13_20 = new StringBuilder();
                            var13_20.append((String)var12_7);
                            var13_20.append("_");
                            var13_20.append(var9_5);
                            var13_20.append("_");
                            var13_20.append(var2_4);
                            var13_20.append("_");
                            var13_20.append(var4_22);
                            var16_19 = d0.Q((String)var14_8, var13_20.toString());
                            var13_20 = var0.z((String)var16_19);
                            var8_15 = var13_20.n();
                            if (var8_15) break block30;
                            J.t2((o)var0, (n)var13_20, (String)var15_13, (String)var11_17);
                            var17_24 /* !! */  = null;
                            ** GOTO lbl75
                            break;
                        }
                        {
                            catch (Throwable var0_1) {
                                break;
                            }
                            {
                                block31: {
                                    block33: {
                                        block32: {
                                            catch (ax.b3.j var1_3) {
                                                var11_17 = var0.z((String)var14_8);
                                                var0 = ax.Ha.c.h().f().d("FAILED TO WRITE RECYCLEBIN INDEX").l(var1_3);
                                                var12_7 = new StringBuilder();
                                                var12_7.append((String)var14_8);
                                                var12_7.append(", exists=");
                                                var12_7.append(var11_17.n());
                                                var0.g(var12_7.toString()).h();
                                                throw var1_3;
                                            }
lbl75:
                                            // 1 sources

                                            try {
                                                var0.E(var1_2, var21_23, null, null);
                                                // MONITOREXIT @DISABLED, blocks:[2, 3, 19, 10, 12] lbl78 : MonitorExitStatement: MONITOREXIT : var20_21
                                                if (!var6_6 || var7_14) break block31;
                                            }
                                            catch (ax.b3.j var22_25) {}
                                            var14_8 = var12_7 = "";
                                            var15_13 = var13_20;
                                            var11_17 = var12_7;
                                            try {
                                                if (!ax.c3.B.P(var1_2)) break block32;
                                                var14_8 = var12_7;
                                                var15_13 = var13_20;
                                                var11_17 = ((y)var1_2).B0().toString();
                                            }
                                            catch (Exception var11_18) {
                                                var13_20 = null;
                                                var12_7 = var15_13;
lbl92:
                                                // 2 sources

                                                while (true) {
                                                    var11_17 = null;
lbl94:
                                                    // 2 sources

                                                    while (true) {
                                                        var19_27 = null;
                                                        var18_26 /* !! */  = null;
                                                        var15_13 = var17_24 /* !! */ ;
                                                        var16_19 = var11_17;
                                                        var17_24 /* !! */  = var19_27;
                                                        var11_17 = var18_26 /* !! */ ;
                                                        break block33;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        var14_8 = var11_17;
                                        var15_13 = var13_20;
                                        var12_7 = var0.z((String)var16_19);
                                        var14_8 = var11_17;
                                        var15_13 = var12_7;
                                        var13_20 = var0.z(var1_2.E());
                                        var14_8 = var11_17;
                                        var15_13 = var12_7;
                                        var16_19 = var0.z(var21_23.E());
                                        var14_8 = var11_17;
                                        var15_13 = var12_7;
                                        var18_26 /* !! */  = var0.z(d0.r(var21_23.E()));
                                        var14_8 = var11_17;
                                        var15_13 = var12_7;
                                        var13_20 = var13_20.n();
                                        try {
                                            var16_19 = var16_19.n();
                                        }
                                        catch (Exception var14_12) {
                                            var14_8 = var11_17;
                                            ** continue;
                                        }
                                        try {
                                            var18_26 /* !! */  = Boolean.valueOf(var18_26 /* !! */ .n());
                                        }
                                        catch (Exception var14_11) {
                                            var14_8 = var11_17;
                                            var11_17 = var16_19;
                                            ** continue;
                                        }
                                        try {
                                            var19_28 = var12_7.n();
                                        }
                                        catch (Exception var14_10) {
                                            var19_29 = null;
                                            var15_13 = var17_24 /* !! */ ;
                                            var14_8 = var11_17;
                                            var17_24 /* !! */  = var18_26 /* !! */ ;
                                            var11_17 = var19_29;
                                            break block33;
                                        }
                                        try {
                                            var15_13 = J.h2(var1_2);
                                            var14_8 = var11_17;
                                            var17_24 /* !! */  = var18_26 /* !! */ ;
                                            var11_17 = var19_28;
                                        }
                                        catch (Exception var14_9) {
                                            var15_13 = var17_24 /* !! */ ;
                                            var14_8 = var11_17;
                                            var17_24 /* !! */  = var18_26 /* !! */ ;
                                            var11_17 = var19_28;
                                        }
                                    }
                                    if (var16_19 != null && !var16_19.booleanValue()) {
                                        var0.P((n)var12_7);
                                    }
                                    if (J.f2(var1_2)) {
                                        var0 = new e("Failed to move to recyclebin", var22_25);
                                        throw var0;
                                    }
                                    var12_7 = ax.Ha.c.h().f().d("FAILED MOVE TO RECYCLE BIN AFTER WRITING INDEX FILE").l(var22_25);
                                    var0 = new StringBuilder();
                                    var0.append("from:");
                                    var0.append(var1_2.P().I());
                                    var0.append(",");
                                    var0.append(((y)var1_2).B0().toString());
                                    var0.append(",to:");
                                    var0.append(var21_23.P().I());
                                    var0.append(",");
                                    var0.append(((y)var21_23).B0().toString());
                                    var0.append(",base:");
                                    var0.append((String)var14_8);
                                    var0.append(",src:");
                                    var0.append(var13_20);
                                    var0.append(",dst:");
                                    var0.append(var16_19);
                                    var0.append(",index:");
                                    var0.append(var11_17);
                                    var0.append(",parent:");
                                    var0.append(var17_24 /* !! */ );
                                    var0.append(",sdk:");
                                    var0.append(Build.VERSION.SDK_INT);
                                    var0.append(",ext:");
                                    var0.append(var1_2.A());
                                    var0.append(",limited:");
                                    var0.append(var15_13);
                                    var12_7.g(var0.toString()).h();
                                    var0 = new ax.b3.j("Failed to move to recyclebin", var22_25);
                                    throw var0;
                                    J.r2((o)var0, (String)var14_8, (String)var15_13, (String)var11_17);
                                }
                                return var13_20.E();
                            }
                        }
                    }
                    ++var4_22;
                    ** continue;
                }
                ++var4_22;
            }
            throw var0_1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void r2(o o8, String iterator, String string, String string2) {
        try {
            iterator = o8.f0(o8.z((String)((Object)iterator)));
            if (iterator == null) {
                return;
            }
            iterator = iterator.iterator();
        }
        catch (ax.b3.j j8) {
            ax.Ha.c.h().d("CANT GET RECYCLE BIN INDEX DIR").g(j8.getMessage()).h();
            j8.printStackTrace();
            return;
        }
        while (iterator.hasNext()) {
            Throwable throwable2;
            block13: {
                block11: {
                    CharSequence charSequence;
                    c c8;
                    Object object;
                    block12: {
                        object = (y)((n)iterator.next());
                        if (((y)object).isDirectory() || !J.e2((n)object)) continue;
                        try {
                            Object object2 = z;
                            // MONITORENTER : object2
                        }
                        catch (ax.b3.j j9) {
                            j9.printStackTrace();
                            continue;
                        }
                        try {
                            c8 = J.o2((n)object, ((y)object).B0());
                            charSequence = c8.c;
                            if (charSequence == null) break block11;
                            if (!d0.B((String)charSequence)) break block12;
                            if (d0.I(string, c8.c)) {
                                charSequence = d0.P(string2, d0.n(string, c8.c));
                                o8.P((n)object);
                                J.t2(o8, (n)object, c8.b, (String)charSequence);
                            }
                            break block11;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    object = ax.Ha.c.h().f().b("!! INVALID RECYCLED FILE PATH !!");
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("path : ");
                    ((StringBuilder)charSequence).append(c8.c);
                    ((ax.Ha.b)object).g(((StringBuilder)charSequence).toString()).h();
                }
                // MONITOREXIT : object2
                continue;
            }
            // MONITOREXIT : object2
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void s2(o o8, K k8, j.f object, ax.u3.c c8) throws ax.b3.j, ax.b3.a {
        n n8 = o8.z(k8.B1());
        n n9 = o8.z(k8.A1());
        n n10 = o8.z(k8.z1());
        if (!n8.n()) {
            o8.P(n10);
            throw new ax.b3.j("Recycled file does not exist");
        }
        boolean bl = n9.n();
        boolean bl2 = true;
        n n11 = n9;
        if (bl) {
            if (object == j.f.d0) {
                n11 = o8.X(n9, false);
            } else if (object == j.f.e0) {
                n11 = n9;
            } else {
                if (n9.isDirectory() != n8.isDirectory()) {
                    throw new ax.b3.f(bl2);
                }
                bl2 = false;
                throw new ax.b3.f(bl2);
            }
        }
        object = o8.z(n11.T());
        if (!object.n()) {
            if (!o8.k((n)object, true)) throw new ax.b3.j("Create parent failed");
        }
        if (bl2 = k8.isDirectory()) {
            J.p2(o8, n8, n11, c8, null);
        } else {
            o8.h0(n8, o8, n11, true, c8, null);
        }
        object = z;
        synchronized (object) {
            o8.P(n10);
        }
        if (!bl2) return;
        if (o8.B(k8)) return;
        J.r2(o8, J.b2(J.Y1(k8)), k8.B1(), k8.A1());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void t2(o o8, n n8, String object, String object2) throws ax.b3.j {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1\n");
        stringBuilder.append((String)object);
        stringBuilder.append("\n");
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString().getBytes(Charset.forName("UTF-8"));
        object = F.e((byte[])object2);
        try {
            ((x)o8.u()).D(n8, (G)object, "text/plain", ((Object)object2).length, null, null, true, null, null);
            return;
        }
        catch (ax.b3.a a8) {
            return;
        }
    }

    @Override
    public InputStream A(String object, String string, String string2) {
        Object object2;
        block4: {
            object2 = this.z(string);
            if (!J.e2((n)object2)) {
                return super.A((String)object, string, string2);
            }
            try {
                object = this.c2((n)object2);
                string2 = ((K)object).B1();
                object2 = d0.f(((K)object).A1());
                string = v.f((String)object2);
                object = string;
                if (string != null) break block4;
                object = "application/octet-stream";
            }
            catch (ax.b3.j j8) {
                return ax.r3.b.n();
            }
        }
        object = this.d1(string2, (String)object2, (String)object);
        return object;
    }

    @Override
    public List<n> C(n n8, m.f object) throws ax.b3.j {
        if (d0.E(n8)) {
            object = new ArrayList();
            if (this.t() == 0) {
                this.n2((List<n>)object, ax.c3.K.e);
                if (j.F().t0()) {
                    try {
                        this.n2((List<n>)object, ax.c3.K.f);
                        return object;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        d.c("recyclebin sdcard root", illegalArgumentException);
                    }
                }
                return object;
            }
            this.n2((List<n>)object, h.q(this.t()));
            return object;
        }
        return super.C(n8, (m.f)((Object)object));
    }

    @Override
    public int G(String string, String object) {
        String string2;
        block4: {
            Object object2 = this.z((String)object);
            if (!J.e2((n)object2)) {
                return super.G(string, (String)object);
            }
            try {
                object = this.c2((n)object2);
                string2 = ((K)object).B1();
                object = object2 = v.f(d0.f(((K)object).A1()));
                if (object2 != null) break block4;
                object = "application/octet-stream";
            }
            catch (ax.b3.j j8) {
                return -1;
            }
        }
        int n8 = this.c1(string, string2, (String)object);
        return n8;
    }

    @Override
    public String H(n n8) {
        if (n8 == null) {
            return null;
        }
        if (J.g2(n8)) {
            return ax.c3.B.X(n8);
        }
        return ax.c3.B.W(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public K c2(n n8) throws ax.b3.j {
        if (!J.e2(n8)) throw new ax.b3.j("invalid recycle bin index path");
        Object object = z;
        synchronized (object) {
            return new K(this, (y)n8, null, true);
        }
    }

    public K d2(String string) throws ax.b3.j {
        return this.c2(this.z(string));
    }

    private static class b
    extends q<Void, Void, Void> {
        long h;
        ax.c3.K i;
        String j;

        private b(long l8, ax.c3.K k8, String string) {
            super(q.e.g0);
            this.h = l8;
            this.i = k8;
            this.j = string;
        }

        private void w(o o8, String string, n n82) throws ax.b3.j {
            Stack<n> stack = new Stack<n>();
            stack.push(n82);
            while (((AbstractCollection)stack).size() > 0) {
                n82 = (n)stack.pop();
                if (!n82.n()) continue;
                for (n n82 : o8.f0(n82)) {
                    if (J.k2(n82.B())) {
                        if (n82.E().equals(string) || n82.q() >= this.h) continue;
                        o8.m(n82);
                        continue;
                    }
                    if (!n82.isDirectory()) continue;
                    stack.push(n82);
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Void x(Void ... object) {
            Object object2;
            try {
                object = ax.c3.x.e(this.i);
                object2 = ((o)object).z(this.j);
                this.w((o)object, J.b2(this.i), (n)object2);
            }
            catch (ax.b3.j j8) {
                j8.printStackTrace();
            }
            object2 = C;
            synchronized (object2) {
                B.remove(this.i);
                return null;
            }
        }
    }

    public static class c {
        String a;
        String b;
        String c;

        public c(String string, String string2, String string3) {
            this.a = string;
            this.b = string2;
            this.c = string3;
        }

        boolean a() {
            String string;
            return this.c != null && this.a != null && (string = this.b) != null && d0.B(string) && d0.B(this.c);
            {
            }
        }
    }
}

