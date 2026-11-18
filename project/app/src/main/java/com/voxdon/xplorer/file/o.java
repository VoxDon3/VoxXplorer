/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import ax.Q2.a;
import ax.Q2.f;
import ax.X2.Q;
import ax.Z2.g;
import ax.b3.j;
import ax.b3.r;
import ax.b3.t;
import ax.b3.z;
import ax.c3.B;
import ax.c3.G;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.i0;
import ax.c3.k0;
import ax.g3.h;
import ax.g3.i;
import ax.u3.q;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import com.voxdon.xplorer.file.u;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class o
implements c {
    private static final Logger m = Logger.getLogger("FileManager.FileOperator");
    m a;
    final AtomicInteger b = new AtomicInteger(0);
    final String c;
    final Context d;
    String e = "";
    String f = "";
    String g = "";
    String h = "";
    String i = "";
    String j = "";
    String k = "";
    String l = "";

    public o(Context object, m m8) {
        this.d = object;
        this.a = m8;
        try {
            object = object.getString(2131951795);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = " - Copy";
        }
        this.c = object;
    }

    private boolean a0() {
        return ax.T2.h.n0(this.T());
    }

    private boolean b0(n n8) {
        return ax.T2.h.n0(n8.R());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(o object, n n8, n object2) throws j, ax.b3.a {
        boolean bl;
        Comparable<n> comparable;
        Object var6_9;
        String string;
        block13: {
            j j8222;
            block12: {
                n n9;
                block11: {
                    string = n8.E();
                    n9 = B.n((o)object, n8);
                    var6_9 = null;
                    try {
                        if (n8.p() != 0L) break block11;
                        ((o)object).P(n8);
                    }
                    catch (j j8222) {
                        break block12;
                    }
                }
                comparable = n9;
                if (n9.n()) {
                    ((o)object).P(n9);
                    comparable = ((o)object).z(n9.E());
                }
                ((o)object).E(n8, (n)comparable, null, null);
                break block13;
            }
            j8222.printStackTrace();
        }
        comparable = ((o)object).z(string);
        n8 = comparable;
        if (comparable.n()) {
            ax.Ha.c.h().f().d("MoveTempToDst 1").g(((n)comparable).P().I()).h();
            try {
                ((o)object).P((n)comparable);
                bl = true;
            }
            catch (j j9) {
                bl = false;
            }
            n8 = ((o)object).z(string);
            if (n8.n()) {
                if (n8.P() == ax.Q2.f.p0 && Q.V1()) {
                    object = ((y)n8).N0();
                } else {
                    object2 = ax.Ha.c.h().f().d("MoveTempToDst 2-2");
                    object = new StringBuilder();
                    ((StringBuilder)object).append(n8.P().I());
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(bl);
                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    throw new j("Could not delete and overwrite");
                }
            }
        }
        ((o)object).E((n)object2, n8, null, null);
        return;
        catch (r r8) {
            object = var6_9;
        }
        object2 = ax.Ha.c.h().f().d("MoveTempToDst 2-1");
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append(n8.P().I());
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(n8.p());
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(bl);
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(object);
        ((ax.Ha.b)object2).g(((StringBuilder)comparable).toString()).h();
        throw new j("Could not delete and overwrite");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(o object, n n8, n comparable) throws j, ax.b3.a {
        String string = n8.E();
        ((o)object).P(n8);
        n n9 = ((o)object).z(string);
        boolean bl = n9.n();
        ax.Ha.b b8 = null;
        n8 = n9;
        if (bl) {
            ax.Ha.c.h().f().d("MoveTempToDst 1").g(n9.P().I()).h();
            try {
                ((o)object).P(n9);
                bl = true;
            }
            catch (j j8) {
                bl = false;
            }
            n8 = ((o)object).z(string);
            if (n8.n()) {
                if (n8.P() == ax.Q2.f.p0 && Q.V1()) {
                    object = ((y)n8).N0();
                } else {
                    object = ax.Ha.c.h().f().d("MoveTempToDst 2-2");
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append(n8.P().I());
                    ((StringBuilder)comparable).append(":");
                    ((StringBuilder)comparable).append(string);
                    ((StringBuilder)comparable).append(":");
                    ((StringBuilder)comparable).append(bl);
                    ((ax.Ha.b)object).g(((StringBuilder)comparable).toString()).h();
                    throw new j("Could not delete and overwrite");
                }
            }
        }
        ((o)object).E((n)comparable, n8, null, null);
        return;
        catch (r r8) {
            object = b8;
        }
        b8 = ax.Ha.c.h().f().d("MoveTempToDst 2-1");
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append(n8.P().I());
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(n8.p());
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(bl);
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append(object);
        b8.g(((StringBuilder)comparable).toString()).h();
        throw new j("Could not delete and overwrite");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l0() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.b.get() <= 0) break block4;
                        this.b.getAndDecrement();
                        if (this.b.get() != 0) break block4;
                        this.a.b();
                        ax.Z2.b.k().d(this.T());
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public InputStream A(String string, String string2, String string3) throws IOException {
        return this.a.A(string, string2, string3);
    }

    @Override
    public boolean B(n n8) {
        return this.a.B(n8);
    }

    @Override
    public List<n> C(n n8, m.f object) throws j {
        if (n8.isDirectory()) {
            object = this.a.C(n8, (m.f)((Object)object));
            if (this.u0(n8)) {
                ax.Z2.b.k().m(n8, (List<n>)object);
            }
            return object;
        }
        ax.Ha.b b8 = ax.Ha.c.h().f().d("FOLICH!!!").j();
        object = new StringBuilder();
        ((StringBuilder)object).append(this.S().I());
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n8.n());
        b8.g(((StringBuilder)object).toString()).h();
        throw new j("list children : fileinfo is not directory");
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.Z2.b.k().p(this.T(), n8.T());
        ax.Z2.b.k().e(n8);
        this.a.D(n8, g8, string, l8, l9, p8, bl, c8, i8);
        if (this.b0(n8)) {
            ax.T2.h.T(n8).b(n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n n8, n n9, ax.u3.c object, i i8) throws j, ax.b3.a {
        block10: {
            Throwable throwable2;
            block9: {
                boolean bl;
                block8: {
                    f f8 = this.S();
                    f f9 = n8.P();
                    boolean bl2 = false;
                    bl = f8 == f9;
                    ax.u3.b.c(bl);
                    if (!B.P(n8)) {
                        bl = n8.P() == n9.P();
                        ax.u3.b.c(bl);
                    }
                    if (!n8.n()) {
                        ax.Ha.c.h().f().d("MV2").j().g(this.S().I()).h();
                        throw new t("Source file not exists");
                    }
                    if (n9.n()) {
                        ax.Ha.c.h().f().d("MV1").j().g(this.S().I()).h();
                        bl = bl2;
                        if (n8.isDirectory() != n9.isDirectory()) {
                            bl = true;
                        }
                        throw new ax.b3.f(bl);
                    }
                    long l8 = this.b0(n8) ? ax.T2.h.T(n8).Y(n8) : 0L;
                    try {
                        this.a.E(n8, n9, (ax.u3.c)object, i8);
                        if (!this.b0(n8)) break block8;
                        ax.T2.h.T(n8).s(n8, l8);
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                if (!(bl = this.b0(n9))) break block10;
                try {
                    object = n8.R() != n9.R() ? ax.c3.x.e(n9.R()).z(n9.E()) : this.z(n9.E());
                    ax.T2.h.T((n)object).b((n)object);
                    break block10;
                }
                catch (j j8) {}
            }
            ax.Z2.b.k().t(n8);
            ax.Z2.b.k().p(n8.R(), n8.T());
            ax.Z2.b.k().p(n9.R(), n9.T());
            ax.Z2.b.k().e(n8);
            ax.Z2.b.k().e(n9);
            throw throwable2;
        }
        ax.Z2.b.k().t(n8);
        ax.Z2.b.k().p(n8.R(), n8.T());
        ax.Z2.b.k().p(n9.R(), n9.T());
        ax.Z2.b.k().e(n8);
        ax.Z2.b.k().e(n9);
    }

    @Override
    public void F(n n8, n n9, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.u3.b.a(n8.isDirectory());
        if (!n9.n()) {
            if (n8.n()) {
                ax.Z2.b.k().p(n9.R(), n9.T());
                ax.Z2.b.k().e(n9);
                this.a.F(n8, n9, c8, i8);
                if (this.b0(n9)) {
                    ax.T2.h.T(n9).b(n9);
                }
                return;
            }
            ax.Ha.c.h().f().d("CP2").j().g(this.S().I()).h();
            throw new t("Source is not exist");
        }
        ax.Ha.c.h().d("CP1").j().g(this.S().I()).h();
        throw new j("Target is aleady exist");
    }

    @Override
    public int G(String string, String string2) {
        return this.a.G(string, string2);
    }

    @Override
    public String H(n n8) {
        return this.a.H(n8);
    }

    @Override
    public void I(n n8) throws j {
        long l8 = this.b0(n8) ? ax.T2.h.T(n8).Y(n8) : 0L;
        try {
            this.a.I(n8);
            if (this.b0(n8)) {
                ax.T2.h.T(n8).s(n8, l8);
            }
            return;
        }
        finally {
            ax.Z2.b.k().s(this.T(), n8.E());
            ax.Z2.b.k().p(this.T(), n8.T());
            ax.Z2.b.k().e(n8);
        }
    }

    @Override
    public InputStream J(n n8, long l8) throws j {
        return this.a.J(n8, l8);
    }

    @Override
    public void K(Activity activity, Fragment fragment, c.a a8) {
        this.a.K(activity, fragment, a8);
    }

    @Override
    public boolean L() {
        return this.a.L();
    }

    @Override
    public boolean N(n n8) {
        boolean bl = this.a.N(n8);
        if (bl) {
            ax.Z2.b.k().p(this.T(), n8.T());
            ax.Z2.b.k().e(n8);
        }
        return bl;
    }

    @Override
    public boolean O() {
        return this.a.O();
    }

    @Override
    public void P(n n8) throws j {
        long l8 = this.b0(n8) && !n8.isDirectory() ? n8.p() : 0L;
        try {
            this.a.P(n8);
            if (this.b0(n8)) {
                ax.T2.h.T(n8).s(n8, l8);
            }
            return;
        }
        finally {
            ax.Z2.b.k().s(this.T(), n8.E());
            ax.Z2.b.k().p(this.T(), n8.T());
            ax.Z2.b.k().e(n8);
        }
    }

    @Override
    public boolean Q(n n8, n n9) {
        return this.a.Q(n8, n9);
    }

    public String R() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i);
        stringBuilder.append(":");
        stringBuilder.append(this.j);
        stringBuilder.append(":");
        stringBuilder.append(this.k);
        stringBuilder.append(":");
        stringBuilder.append(this.l);
        stringBuilder.append(" - ");
        stringBuilder.append(this.e);
        stringBuilder.append(":");
        stringBuilder.append(this.f);
        stringBuilder.append(":");
        stringBuilder.append(this.g);
        stringBuilder.append(":");
        stringBuilder.append(this.h);
        return stringBuilder.toString();
    }

    public f S() {
        return this.a.u();
    }

    public K T() {
        return this.a.v();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int U() {
        synchronized (this) {
            return this.b.get();
        }
    }

    public String V() {
        return this.a.r();
    }

    public k0 W() throws j {
        return this.a.y();
    }

    public n X(n object, boolean bl) throws j {
        boolean bl2 = this.S() == ((n)object).P();
        ax.u3.b.c(bl2);
        if (object.n()) {
            int n8;
            Object object2;
            Object object3 = ((n)object).B();
            String string = ((n)object).T();
            bl2 = object.isDirectory();
            object = "";
            if (bl2) {
                object2 = object3;
            } else {
                n8 = ((String)object3).lastIndexOf(46);
                object2 = object3;
                if (n8 > 0) {
                    object2 = ((String)object3).substring(0, n8);
                    object = ((String)object3).substring(n8);
                }
            }
            n8 = 2;
            if (bl) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(this.c);
                object3 = d0.Q(string, ((StringBuilder)object3).toString());
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append((String)object);
                object2 = this.z(((StringBuilder)object2).toString());
                while (object2.n()) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(" (");
                    ((StringBuilder)object2).append(n8);
                    ((StringBuilder)object2).append(")");
                    ((StringBuilder)object2).append((String)object);
                    object2 = this.z(((StringBuilder)object2).toString());
                    ++n8;
                }
                return object2;
            }
            object2 = d0.Q(string, (String)object2);
            while (true) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(" (");
                ((StringBuilder)object3).append(n8);
                ((StringBuilder)object3).append(")");
                ((StringBuilder)object3).append((String)object);
                object3 = this.z(((StringBuilder)object3).toString());
                if (!object3.n()) {
                    return object3;
                }
                ++n8;
            }
        }
        return object;
    }

    public boolean Y() {
        if (!(this.u() instanceof x)) {
            return false;
        }
        return ((x)this.u()).g1();
    }

    public boolean Z() {
        return this.a.V();
    }

    @Override
    public boolean a() {
        return this.a.a();
    }

    @Override
    public void b() {
        this.a.b();
    }

    public boolean c0(n n8) {
        if (this.u0(n8)) {
            return ax.Z2.b.k().f(n8);
        }
        return false;
    }

    public boolean d0() {
        return this.a.Y();
    }

    public boolean e(n n8, n n9) {
        if (B.P(n8) && B.P(n9)) {
            return this.Q(n8, n9);
        }
        if (!B.N(n8, n9)) {
            return false;
        }
        return this.Q(n8, n9);
    }

    public boolean e0(n n8) {
        return this.a.a0(n8);
    }

    public void f(String string) {
        if ((string = Uri.parse((String)string).getPath()) == null) {
            return;
        }
        this.a.f(string);
    }

    public List<n> f0(n n8) throws j {
        return this.C(n8, m.f.q);
    }

    public void g() {
        this.a.g();
    }

    public List<n> g0(n object, m.f object2, boolean bl, boolean bl2) throws j {
        if (this.c0((n)object)) {
            object2 = ax.Z2.b.k().g((n)object);
            if (bl && object2 != null && ax.Q2.f.g0(this.S())) {
                return ((u)this.a).g2((n)object, (List<n>)object2, true);
            }
            return object2;
        }
        object = this.C((n)object, (m.f)((Object)object2));
        if (bl2 && object != null && this.u() instanceof x) {
            Object object3;
            Object object4;
            object2 = x.J0((List<n>)object);
            if (object2 != null && !object2.isDirectory() && (object2 = ((x)this.u()).H1((n)object2)) != null) {
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    String string = (String)object2.next();
                    object4 = object.iterator();
                    while (object4.hasNext()) {
                        object3 = (n)object4.next();
                        if (!string.equals(((n)object3).B())) continue;
                        ((y)object3).k1(y.b.d0);
                    }
                }
            }
            object2 = object.iterator();
            while (object2.hasNext()) {
                object4 = (n)object2.next();
                object3 = ax.Z2.g.h().f((n)object4);
                if (object3 == null) continue;
                object3 = ax.Z2.g.c((String)object3);
                ((y)object4).k1((y.b)((Object)object3));
            }
        }
        return object;
    }

    public void h(c.a a8) {
        this.a.h(a8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h0(n var1_1, o var2_4, n var3_5, boolean var4_20, ax.u3.c var5_21, i var6_22) throws j, ax.b3.a {
        block36: {
            block34: {
                block38: {
                    block37: {
                        block39: {
                            block35: {
                                block33: {
                                    var16_23 /* !! */  = this.S();
                                    var15_25 /* !! */  = var1_1.P();
                                    var9_26 = true;
                                    var10_27 = var16_23 /* !! */  == var15_25 /* !! */ ;
                                    ax.u3.b.c(var10_27);
                                    ax.u3.b.a(var1_1.isDirectory());
                                    if (!var1_1.n()) {
                                        ax.Ha.c.h().f().d("MVEX").g(this.S().I()).h();
                                        throw new t("Move source file not found");
                                    }
                                    var15_25 /* !! */  = var2_4.z(var3_5.T());
                                    if (!d0.E((n)var15_25 /* !! */ ) && !var15_25 /* !! */ .n()) {
                                        if (var2_4.k((n)var15_25 /* !! */ , false) == false) throw new j("Create target folder failed");
                                    }
                                    var18_28 = null;
                                    var17_29 = null;
                                    var15_25 /* !! */  = var17_29;
                                    var16_23 /* !! */  = var18_28;
                                    var10_27 = this.e(var1_1, (n)var3_5);
                                    var15_25 /* !! */  = var17_29;
                                    var16_23 /* !! */  = var18_28;
                                    if (var3_5.n()) {
                                        var15_25 /* !! */  = var17_29;
                                        var16_23 /* !! */  = var18_28;
                                        if (var3_5.isDirectory()) {
                                            var15_25 /* !! */  = var17_29;
                                            var16_23 /* !! */  = var18_28;
                                            var15_25 /* !! */  = var17_29;
                                            var16_23 /* !! */  = var18_28;
                                            var3_5 = new ax.b3.u();
                                            var15_25 /* !! */  = var17_29;
                                            var16_23 /* !! */  = var18_28;
                                            throw var3_5;
                                        }
                                        var15_25 /* !! */  = var17_29;
                                        var16_23 /* !! */  = var18_28;
                                        if (var2_4.o0() && !var10_27) {
                                            var15_25 /* !! */  = null;
                                            var7_30 = true;
                                        } else {
                                            var15_25 /* !! */  = var17_29;
                                            var16_23 /* !! */  = var18_28;
                                            var17_29 = B.z(var2_4, (n)var3_5);
                                            var7_30 = false;
                                            var15_25 /* !! */  = var17_29;
                                        }
                                        var8_31 = true;
                                    } else {
                                        var15_25 /* !! */  = var3_5;
                                        var7_30 = false;
                                        var8_31 = false;
                                    }
                                    if (!var10_27) break block33;
                                    try {
                                        this.E(var1_1, (n)var15_25 /* !! */ , (ax.u3.c)var5_21, var6_22);
                                        var9_26 = false;
                                        ** GOTO lbl86
                                    }
                                    catch (j var3_8) {
                                        break block34;
                                    }
                                }
                                var10_27 = var1_1.c0();
                                if (!var10_27) break block35;
                                try {
                                    this.r(var1_1);
                                }
                                catch (ax.b3.a var3_10) {}
                                ** GOTO lbl-1000
                                catch (j var16_24) {
                                    // empty catch block
                                }
                            }
                            if (!var7_30) break block39;
                            try {
                                var2_4.s0((n)var3_5, this.x(var1_1), var1_1.s(), var1_1.p(), var1_1.q(), var1_1.D(), var4_20, (ax.u3.c)var5_21, var6_22);
                                ** GOTO lbl86
                            }
                            catch (j var3_12) {
                                break block34;
                            }
                            catch (ax.b3.a var3_13) {}
lbl-1000:
                            // 2 sources

                            {
                                var16_23 /* !! */  = var15_25 /* !! */ ;
                                break block36;
                            }
                        }
                        var18_28 = this.x(var1_1);
                        var16_23 /* !! */  = var1_1.s();
                        var11_32 = var1_1.p();
                        var13_33 = var1_1.q();
                        var17_29 = var1_1.D();
                        var2_4.D((n)var15_25 /* !! */ , var18_28, (String)var16_23 /* !! */ , var11_32, var13_33, (p)var17_29, var4_20, (ax.u3.c)var5_21, var6_22);
lbl86:
                        // 3 sources

                        if (!var8_31 || var7_30) break block37;
                        var5_21 = var2_4.z(var15_25 /* !! */ .E());
                        var15_25 /* !! */  = var5_21;
                        var16_23 /* !! */  = var5_21;
                        try {
                            if (!var5_21.n()) {
                                var15_25 /* !! */  = var5_21;
                                var16_23 /* !! */  = var5_21;
                                var15_25 /* !! */  = var5_21;
                                var16_23 /* !! */  = var5_21;
                                var3_5 = new t("tmp file not exists");
                                var15_25 /* !! */  = var5_21;
                                var16_23 /* !! */  = var5_21;
                                throw var3_5;
                            }
                            var15_25 /* !! */  = var5_21;
                            var16_23 /* !! */  = var5_21;
                            this.l(var2_4, (n)var3_5, (n)var5_21);
                            var16_23 /* !! */  = var5_21;
                            break block38;
                        }
                        catch (j var3_6) {
                            break block34;
                        }
                        catch (ax.b3.a var3_7) {
                            break block36;
                        }
                        catch (j var3_14) {
                        }
                        catch (ax.b3.a var3_15) {}
                        ** GOTO lbl-1000
                    }
                    var16_23 /* !! */  = var15_25 /* !! */ ;
                }
                if (var9_26 == false) return;
                var15_25 /* !! */  = var16_23 /* !! */ ;
                this.P(var1_1);
                return;
                catch (j var3_16) {
                    break block34;
                }
                catch (ax.b3.a var3_17) {
                    ** GOTO lbl-1000
                }
                catch (j var3_18) {
                    break block34;
                }
                catch (ax.b3.a var3_19) {}
lbl-1000:
                // 3 sources

                {
                    var16_23 /* !! */  = var15_25 /* !! */ ;
                    break block36;
                }
            }
            var3_9.printStackTrace();
            if (var15_25 /* !! */  == null) throw var3_9;
            if (var3_9 instanceof ax.b3.f != false) throw var3_9;
            try {
                if (this.z(var1_1.E()).n() == false) throw var3_9;
                var2_4.P((n)var15_25 /* !! */ );
            }
            catch (j var1_2) {
                throw var3_9;
            }
            throw var3_9;
        }
        if (var16_23 /* !! */  == null) throw var3_11;
        try {
            if (this.z(var1_1.E()).n() == false) throw var3_11;
            var2_4.P((n)var16_23 /* !! */ );
        }
        catch (j var1_3) {
            throw var3_11;
        }
        throw var3_11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i(long l8) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.h(new c.a(){
            final AtomicBoolean a;
            final CountDownLatch b;
            final o c;
            {
                this.c = o8;
                this.a = atomicBoolean;
                this.b = countDownLatch;
            }

            @Override
            public void B() {
            }

            @Override
            public void T(boolean bl, Object object) {
                this.a.set(bl);
                this.b.countDown();
            }
        });
        long l9 = l8;
        if (l8 == 0L) {
            l9 = 20000L;
        }
        try {
            countDownLatch.await(l9, TimeUnit.MILLISECONDS);
            return atomicBoolean.get();
        }
        catch (InterruptedException interruptedException) {
            return atomicBoolean.get();
        }
    }

    public boolean i0() {
        return this.a.c0();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(n var1_1, o var2_16, n var3_19, boolean var4_20, boolean var5_21, boolean var6_22, ax.u3.c var7_23, i var8_24) throws j, ax.b3.a {
        block44: {
            block39: {
                block41: {
                    block40: {
                        block43: {
                            block38: {
                                block37: {
                                    block36: {
                                        var12_25 = this.S() == var1_1.P();
                                        ax.u3.b.c(var12_25);
                                        ax.u3.b.a(var1_1.isDirectory());
                                        var16_26 = null;
                                        var15_27 = null;
                                        var17_28 = null;
                                        try {
                                            var12_25 = B.N((n)var1_1, (n)var3_19);
                                            if (!var3_19.n()) break block36;
                                            if (var2_16.o0() && !var12_25) {
                                                var15_27 = null;
                                                var9_29 = true;
                                            } else {
                                                var18_30 = B.z(var2_16, (n)var3_19);
                                                var15_27 = var18_30;
                                                var9_29 = false;
                                            }
                                            var11_32 = true;
                                            var10_33 = var9_29;
                                            var9_29 = var11_32;
                                            break block37;
                                        }
                                        catch (j var1_2) {
                                            var3_19 = var16_26;
                                            break block38;
                                        }
                                        catch (ax.b3.a var1_3) {
                                            var3_19 = var15_27;
                                            break block39;
                                        }
                                    }
                                    var15_27 = var3_19;
                                    var10_33 = false;
                                    var9_29 = false;
                                }
                                if (!var12_25) ** GOTO lbl36
                                this.F((n)var1_1, var15_27, (ax.u3.c)var7_23, var8_24);
                                break block40;
lbl36:
                                // 1 sources

                                var16_26 = var4_20 != false ? Long.valueOf(var1_1.q()) : null;
                                if (var5_21) {
                                    var17_28 = var1_1.D();
                                }
                                ** GOTO lbl57
                            }
lbl42:
                            // 4 sources

                            while (var3_19 != null) {
                                var3_19 = var2_16.z(var3_19.E());
                                if (var3_19.n()) {
                                    var2_16.P((n)var3_19);
                                }
                                break block41;
                            }
                            {
                                block42: {
                                    break block41;
                                    catch (j var1_4) {
                                        var3_19 = var15_27;
                                        ** GOTO lbl42
                                    }
                                    catch (ax.b3.a var1_5) {
                                        var3_19 = var15_27;
                                        break block39;
                                    }
lbl57:
                                    // 3 sources

                                    var4_20 = var1_1.c0();
                                    if (!var4_20) break block42;
                                    try {
                                        this.r((n)var1_1);
                                    }
                                    catch (j var18_31) {
                                        // empty catch block
                                    }
                                }
                                if (!var10_33) break block43;
                                {
                                    var2_16.s0((n)var3_19, this.x((n)var1_1), var1_1.s(), var1_1.p(), var16_26, var17_28, var6_22, (ax.u3.c)var7_23, var8_24);
                                    break block40;
                                }
                            }
                        }
                        var18_30 = this.x((n)var1_1);
                        var19_34 = var1_1.s();
                        var13_35 = var1_1.p();
                        var2_16.D(var15_27, (G)var18_30, var19_34, var13_35, var16_26, var17_28, var6_22, (ax.u3.c)var7_23, var8_24);
                    }
                    if (var9_29 == false) return;
                    if (var10_33 != false) return;
                    var7_23 = var2_16.z(var15_27.E());
                    try {
                        if (var7_23.n()) {
                            this.l(var2_16, (n)var3_19, (n)var7_23);
                            return;
                        }
                    }
                    catch (j var1_6) {
                        var3_19 = var7_23;
                        ** GOTO lbl42
                    }
                    catch (ax.b3.a var1_7) {
                        var3_19 = var7_23;
                        break block39;
                    }
                    var1_1 = new t("tmp file not exists");
                    throw var1_1;
                    catch (j var1_8) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var3_19 = var15_27;
                            ** GOTO lbl42
                            break;
                        }
                    }
                    catch (ax.b3.a var1_10) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var3_19 = var15_27;
                            break block39;
                            break;
                        }
                    }
                    catch (j var1_14) {
                        ** GOTO lbl-1000
                    }
                    catch (ax.b3.a var1_15) {
                        ** GOTO lbl-1000
                    }
                    catch (j var1_12) {
                        ** continue;
                    }
                    catch (ax.b3.a var1_13) {
                        ** continue;
                    }
                }
lbl110:
                // 2 sources

                while (true) {
                    var1_9.printStackTrace();
                    throw var1_9;
                }
            }
            if (var3_19 == null) throw var1_11;
            try {}
            catch (j var2_18) {
                throw var1_11;
            }
            break block44;
            catch (j var2_17) {}
            ** while (true)
        }
        var3_19 = var2_16.z(var3_19.E());
        if (var3_19.n() == false) throw var1_11;
        var2_16.P((n)var3_19);
        throw var1_11;
    }

    public ax.l3.a j0(String string, int n8) throws j {
        return this.a.e0(string, n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean k(n n8, boolean bl) {
        block12: {
            Object object;
            block11: {
                block10: {
                    block9: {
                        if (!bl) {
                            bl = this.a.M(n8);
                            if (!bl) return bl;
                            ax.Z2.b.k().p(this.T(), n8.T());
                            ax.Z2.b.k().e(n8);
                            if (!this.a0()) return bl;
                            n8 = this.z(n8.E());
                            ax.T2.h.S(this.T()).b(n8);
                            return bl;
                        }
                        try {
                            if (!this.k(n8, false)) break block9;
                            return true;
                        }
                        catch (j j8) {
                            return false;
                        }
                    }
                    object = n8.T();
                    if (!d0.a.equals(object)) break block10;
                    return false;
                }
                object = this.z((String)object);
                if (!object.n()) break block11;
                return false;
            }
            if (!this.k((n)object, true) || !(bl = this.k(n8, false))) break block12;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k0(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block7: {
                    block6: {
                        try {
                            if (this.b.get() != 0) break block6;
                            m.severe("OPEROATOR RELEASED MORE THAN RETAINED!!!!!");
                            object = ax.Ha.c.h().d("REL").j();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.S().I());
                            stringBuilder.append(":");
                            stringBuilder.append(this.R());
                            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    this.l = this.k;
                    this.k = this.j;
                    this.j = this.i;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("(");
                    ((StringBuilder)object).append(this.b.get());
                    ((StringBuilder)object).append(") ");
                    ((StringBuilder)object).append(ax.Q2.a.g());
                    this.i = ((StringBuilder)object).toString();
                }
                if (this.L()) {
                    object = new b(this);
                    ((q)object).i(new Long[0]);
                } else {
                    this.l0();
                    if (bl && this.u() instanceof x && ((x)(object = (x)this.u())).g1()) {
                        Q.a0();
                        ((x)object).G0();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void m(n n8) throws j {
        if (this.O()) {
            this.I(n8);
            return;
        }
        if (n8.isDirectory()) {
            Iterator<n> iterator = this.f0(n8).iterator();
            while (iterator.hasNext()) {
                this.m(iterator.next());
            }
            this.P(n8);
            return;
        }
        this.P(n8);
    }

    public void m0(n n8, n n9, ax.u3.c c8, i i8) throws j, ax.b3.a {
        if (n9.n()) {
            boolean bl = n8.isDirectory() != n9.isDirectory();
            throw new ax.b3.f(bl);
        }
        this.E(n8, n9, c8, i8);
    }

    public void n(i i8) {
        if (!(this.u() instanceof x)) {
            return;
        }
        ((x)this.u()).E0(i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n0() {
        synchronized (this) {
            this.b.getAndIncrement();
            this.h = this.g;
            this.g = this.f;
            this.f = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(this.b.get());
            stringBuilder.append(") ");
            stringBuilder.append(ax.Q2.a.g());
            this.e = stringBuilder.toString();
            return;
        }
    }

    public void o(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) throws j {
        this.a.m(n8, string, bl, bl2, h8, c8);
    }

    public boolean o0() {
        return this.a.g0();
    }

    public void p(n n8, File file, ax.u3.c c8, i i8) throws j, ax.b3.a {
        n n9;
        o o8 = ax.c3.x.f(file);
        n n10 = n9 = o8.z(file.getAbsolutePath());
        if (n9.n()) {
            o8.P(n9);
            n10 = o8.z(file.getAbsolutePath());
        }
        boolean bl = System.currentTimeMillis() <= n8.q();
        this.j(n8, o8, n10, bl, false, false, c8, i8);
    }

    public boolean p0() {
        return this.a.h0();
    }

    public void q(n n8, m.f f8) throws j {
        List<n> list;
        List<n> list2 = list = ax.Z2.b.k().g(n8);
        if (list == null) {
            list2 = this.C(n8, f8);
        }
        n8.d0(list2.size());
    }

    public boolean q0() {
        return this.a.i0();
    }

    public void r(n n8) throws j {
        this.a.n(n8);
    }

    public boolean r0() {
        return this.a instanceof i0;
    }

    public void s(n n8, m.f f8) throws j {
        n8.d0(this.C(n8, f8).size());
    }

    public void s0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.Z2.b.k().p(this.T(), n8.T());
        ax.Z2.b.k().e(n8);
        this.a.j0(n8, g8, string, l8, l9, p8, bl, c8, i8);
        if (this.b0(n8)) {
            ax.T2.h.T(n8).b(n8);
        }
    }

    public Context t() {
        return this.d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t0(n var1_1, o var2_6, n var3_7, ax.u3.c var4_13, i var5_14) throws j, ax.b3.a {
        block26: {
            block30: {
                block29: {
                    block28: {
                        block25: {
                            block27: {
                                var14_15 = null;
                                var13_19 = null;
                                try {
                                    var12_20 = var3_7.n();
                                    var7_21 = false;
                                    if (!var12_20) break block25;
                                }
                                catch (ax.b3.a var3_12) {
                                    var1_1 = var13_19;
                                    break block26;
                                }
                                try {
                                    if (var2_6.o0() || var2_6.p0()) break block27;
                                    var13_19 = B.z(var2_6, var3_7);
                                    var6_22 = true;
                                    break block28;
                                }
                                catch (ax.b3.a var3_8) {
                                    var1_1 = var14_15;
                                    break block26;
                                }
                            }
                            var13_19 = null;
                            var6_22 = true;
                            var7_21 = true;
                            break block28;
                        }
                        var13_19 = var3_7;
                        var6_22 = false;
                    }
                    if (!var7_21) break block30;
                    try {
                        var2_6.o0();
                        try {
                            var14_15 = this.x((n)var1_1);
                            var15_23 = var1_1.s();
                            var8_25 = var1_1.p();
                            var10_27 = var1_1.q();
                            var16_29 = var1_1.D();
                        }
                        catch (z var14_17) {
                            // empty catch block
                            break block29;
                        }
                        try {
                            var2_6.s0(var3_7, var14_15, (String)var15_23, var8_25, var10_27, var16_29, true, (ax.u3.c)var4_13, var5_14);
                            return;
                        }
                        catch (z var14_16) {
                        }
                    }
                    catch (ax.b3.a var3_9) {
                        var1_1 = var13_19;
                        break block26;
                    }
                }
                var15_23 = B.z(var2_6, var3_7);
                try {
                    var2_6.D((n)var15_23, this.x((n)var1_1), var1_1.s(), var1_1.p(), var1_1.q(), var1_1.D(), true, (ax.u3.c)var4_13, var5_14);
                    throw var14_18;
                }
                catch (ax.b3.a var3_10) {
                    var1_1 = var15_23;
                }
                break block26;
            }
            try {
                var14_15 = this.x((n)var1_1);
                var16_30 = var1_1.s();
                var8_26 = var1_1.p();
                var10_28 = var1_1.q();
                var15_24 = var1_1.D();
            }
            catch (ax.b3.a var1_4) {
            }
lbl-1000:
            // 3 sources

            {
                while (true) {
                    var3_7 = var1_1;
                    var1_1 = var13_19;
                    break block26;
                    break;
                }
            }
            try {
                var2_6.D(var13_19, var14_15, var16_30, var8_26, var10_28, var15_24, true, (ax.u3.c)var4_13, var5_14);
                if (var6_22 == false) return;
            }
            catch (ax.b3.a var1_3) {
                ** GOTO lbl-1000
            }
            try {
                var4_13 = var2_6.z(var13_19.E());
            }
            catch (ax.b3.a var1_2) {}
            try {
                if (!var4_13.n()) {
                    var1_1 = new t("tmp file not exists");
                    throw var1_1;
                }
                if (var1_1.p() == 0L) {
                    this.d(var2_6, var3_7, (n)var4_13);
                    return;
                }
            }
            catch (ax.b3.a var3_11) {
                var1_1 = var4_13;
                break block26;
            }
            this.l(var2_6, var3_7, (n)var4_13);
            return;
            ** while (true)
        }
        if (var1_1 == null) throw var3_7;
        try {
            var2_6.P((n)var1_1);
            throw var3_7;
        }
        catch (j var1_5) {
            throw var3_7;
        }
    }

    public m u() {
        return this.a;
    }

    public boolean u0(n n8) {
        return ax.Q2.f.E0(this.S(), n8);
    }

    public long v() throws j {
        return this.a.q();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v0(n object, G object2, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        RuntimeException var1_5;
        Object object3;
        block17: {
            Object object4;
            block16: {
                boolean bl2;
                boolean bl3;
                block14: {
                    block15: {
                        Object object5;
                        Object object6 = null;
                        object3 = object5 = null;
                        object4 = object6;
                        if (object.n()) {
                            object3 = object5;
                            object4 = object6;
                            boolean bl4 = this.o0();
                            bl3 = true;
                            if (bl4) {
                                object3 = null;
                                bl2 = true;
                                break block14;
                            }
                            object3 = object5;
                            object4 = object6;
                            object3 = object5 = B.z(this, (n)object);
                            bl2 = true;
                            break block15;
                        }
                        object3 = object;
                        bl2 = false;
                    }
                    bl3 = false;
                }
                if (bl3) {
                    try {
                        this.s0((n)object, (G)object2, string, l8, l9, p8, bl, c8, i8);
                        return;
                    }
                    catch (j j8) {
                    }
                    catch (ax.b3.a a8) {}
                } else {
                    this.D((n)object3, (G)object2, string, l8, l9, p8, bl, c8, i8);
                    if (!bl2) return;
                    object3 = object2 = this.z(((n)object3).E());
                    object4 = object2;
                    try {
                        if (object2.n()) {
                            object3 = object2;
                            object4 = object2;
                            this.l(this, (n)object, (n)object2);
                            return;
                        }
                        break block16;
                    }
                    catch (j j9) {
                    }
                    catch (ax.b3.a a9) {
                        object3 = object4;
                    }
                }
                break block17;
            }
            object3 = object2;
            object4 = object2;
            object3 = object2;
            object4 = object2;
            object = new t("tmp file not exists");
            object3 = object2;
            object4 = object2;
            throw object;
        }
        if (object3 == null) throw var1_5;
        try {
            this.P((n)object3);
        }
        catch (j j10) {
            throw var1_5;
        }
        throw var1_5;
    }

    public String w() {
        return this.a.r();
    }

    public G x(n n8) {
        return this.a.s(n8);
    }

    public int y() {
        return this.a.t();
    }

    @Override
    public n z(String string) throws j {
        if (d0.B(string)) {
            return this.a.z(string);
        }
        ax.Ha.b b8 = ax.Ha.c.h().f().b("GFI!!!").j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.S().I());
        stringBuilder.append(":");
        stringBuilder.append(string);
        b8.g(stringBuilder.toString()).h();
        throw new j("Not normalzied path in getFileInfo param");
    }

    public static class b
    extends q<Long, Long, Long> {
        o h;

        public b(o o8) {
            super(q.e.e0);
            this.h = o8;
        }

        protected Long w(Long ... longArray) {
            this.h.l0();
            return null;
        }
    }
}

