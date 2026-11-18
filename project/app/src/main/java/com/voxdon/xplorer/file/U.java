/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Q2.o;
import ax.b3.C;
import ax.b3.G;
import ax.b3.H;
import ax.b3.g;
import ax.b3.j;
import ax.b3.t;
import ax.c3.B;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.z;
import ax.g3.h;
import ax.g3.i;
import ax.h5.e;
import ax.h5.f;
import ax.u3.b;
import ax.u3.c;
import ax.u3.q;
import com.voxdon.xplorer.file.V;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class U
extends m {
    private e h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean k0(n object, boolean bl) {
        IOException iOException2;
        block8: {
            IllegalArgumentException illegalArgumentException2;
            block7: {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                block6: {
                    e e8;
                    try {
                        if (object.n()) {
                            return false;
                        }
                        e8 = this.l0(((n)object).T());
                        if (e8 == null) return false;
                        object = ((n)object).B();
                        if (bl) {
                            e8.n((String)object);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block7;
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                    e8.p0((String)object).close();
                    return true;
                }
                arrayIndexOutOfBoundsException2.printStackTrace();
                return false;
            }
            illegalArgumentException2.printStackTrace();
            return false;
        }
        iOException2.printStackTrace();
        return false;
    }

    private e l0(String string) throws IOException {
        b.c(d0.B(string));
        e e8 = this.h;
        if (e8 == null) {
            return null;
        }
        if (d0.D(this.v(), string)) {
            return e8;
        }
        return e8.H0(string.substring(1));
    }

    @Override
    public InputStream A(String object, String string, String string2) {
        if (!this.a()) {
            return null;
        }
        try {
            object = this.J(this.m0(string), 0L);
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean B(n n8) {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n var1_1, m.f var2_5) throws j {
        block19: {
            block18: {
                block16: {
                    block15: {
                        if (var1_1.n() == false) throw new t();
                        b.c(var1_1.isDirectory());
                        try {
                            var2_5 = new ArrayList();
                            var6_6 = this.l0(var1_1.E());
                            if (var6_6 != null) {
                                if (!var6_6.isDirectory()) break block15;
                                if ((var6_6 = var6_6.B0()) == null) return var2_5;
                                var4_7 = var6_6.length;
                                var3_8 = 0;
                            }
                            ** GOTO lbl38
                        }
                        catch (IOException var1_3) {
                            throw new j(var1_3);
                        }
                        catch (com.github.mjdev.libaums.a var1_4) {
                            throw new g(var1_4);
                        }
lbl17:
                        // 2 sources

                        while (true) {
                            block17: {
                                if (var3_8 >= var4_7) return var2_5;
                                var7_10 = var6_6[var3_8];
                                {
                                    var8_12 = var7_10.getName();
                                    if (TextUtils.isEmpty((CharSequence)var8_12) || !d0.A((String)var8_12)) break block16;
                                    var9_13 = d0.Q(var1_1.E(), (String)var8_12);
                                    var8_12 = new V(this, (String)var9_13, var7_10);
                                    var5_9 = var7_10.isDirectory();
                                    if (!var5_9) break block17;
                                }
                                var8_12.d0(var7_10.c0().length);
                            }
lbl30:
                            // 2 sources

                            while (true) {
                                var2_5.add(var8_12);
                                break block18;
                                break;
                            }
                            break;
                        }
                    }
                    var1_1 = new j("This is not directory");
                    throw var1_1;
lbl38:
                    // 1 sources

                    var1_1 = new t();
                    throw var1_1;
                    catch (IOException var7_11) {}
                    ** while (true)
                    catch (IllegalArgumentException var1_2) {}
                    break block19;
                }
                var5_9 = TextUtils.isEmpty((CharSequence)var8_12);
                if (var5_9) {
                    var10_14 = ax.Ha.c.h().f().d("USB CHILD NAME 1");
                    var9_13 = new StringBuilder();
                    var9_13.append("name:");
                    var9_13.append((String)var8_12);
                    var9_13.append(":lfn:");
                    var9_13.append(var7_10.W0());
                    var9_13.append(":short:");
                    var9_13.append(var7_10.z());
                    var10_14.g(var9_13.toString()).h();
                } else {
                    var9_13 = ax.Ha.c.h().f().d("USB CHILD NAME 2");
                    var10_14 = new StringBuilder();
                    var10_14.append("name:");
                    var10_14.append((String)var8_12);
                    var10_14.append(":lfn:");
                    var10_14.append(var7_10.W0());
                    var10_14.append(":short:");
                    var10_14.append(var7_10.z());
                    var9_13.g(var10_14.toString()).h();
                }
            }
            ++var3_8;
            ** while (true)
        }
        ax.Ha.c.h().b("USB illegalargument").l(var1_2).h();
        throw new j(var1_2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void D(n var1_1, ax.c3.G var2_8, String var3_11, long var4_12, Long var6_13, p var7_14, boolean var8_15, c var9_16, i var10_17) throws j, ax.b3.a {
        block27: {
            block24: {
                b.a(var1_1.n());
                var20_18 = null;
                var17_19 = null;
                var18_20 = null;
                var19_21 = null;
                var3_11 = var19_21;
                var9_16 = var20_18;
                var16_22 = var17_19;
                var7_14 = var18_20;
                try {
                    block26: {
                        block25: {
                            try {
                                var21_23 = this.l0(var1_1.T());
                                if (var21_23 == null) break block24;
                                var3_11 = var19_21;
                                var9_16 = var20_18;
                                var16_22 = var17_19;
                                var7_14 = var18_20;
                                var21_23 = var21_23.p0(var1_1.B());
                                var3_11 = var19_21;
                                var9_16 = var20_18;
                                var16_22 = var17_19;
                                var7_14 = var18_20;
                                var22_24 = new byte[8192];
                                var3_11 = var19_21;
                                var9_16 = var20_18;
                                var16_22 = var17_19;
                                var7_14 = var18_20;
                                var1_1 = var2_8.b();
                                var12_25 = 0L;
                                while (true) {
                                    var3_11 = var1_1;
                                    var9_16 = var1_1;
                                    var16_22 = var1_1;
                                    var7_14 = var1_1;
                                    var11_26 = var1_1.read(var22_24);
                                    if (var11_26 > 0) {
                                        var3_11 = var1_1;
                                        var9_16 = var1_1;
                                        var16_22 = var1_1;
                                        var7_14 = var1_1;
                                        var21_23.l(var12_25, ByteBuffer.wrap(var22_24, 0, var11_26));
                                        var12_25 = var14_27 = var12_25 + (long)var11_26;
                                        if (var10_17 == null) continue;
                                        var3_11 = var1_1;
                                        var9_16 = var1_1;
                                        var16_22 = var1_1;
                                        var7_14 = var1_1;
                                        var10_17.a(var14_27, var4_12);
                                        var12_25 = var14_27;
                                        continue;
                                    }
                                    break;
                                }
                            }
                            catch (ArrayIndexOutOfBoundsException var1_3) {
                                break block25;
                            }
                            catch (IllegalArgumentException var1_4) {
                                var9_16 = var16_22;
                                break block25;
                            }
                            catch (IOException var1_5) {
                                break block26;
                            }
                            if (var6_13 != null) {
                                var3_11 = var1_1;
                                var9_16 = var1_1;
                                var16_22 = var1_1;
                                var7_14 = var1_1;
                                var4_12 = var6_13;
                                if (var4_12 > 0L) {
                                    var3_11 = var1_1;
                                    var21_23.R0(var6_13);
                                }
                            }
lbl69:
                            // 6 sources

                            while (true) {
                                var3_11 = var1_1;
                                var9_16 = var1_1;
                                var16_22 = var1_1;
                                var7_14 = var1_1;
                                {
                                    var21_23.close();
                                }
                                try {
                                    var1_1.close();
                                    return;
                                }
                                catch (IOException var1_6) {
                                    var1_6.printStackTrace();
                                }
                                return;
                            }
                        }
                        var3_11 = var9_16;
                        var3_11 = var9_16;
                        var2_8 = new j((Throwable)var1_7);
                        var3_11 = var9_16;
                        throw var2_8;
                    }
                    var3_11 = var7_14;
                    if (var1_5.getMessage() == null) ** GOTO lbl-1000
                    var3_11 = var7_14;
                    if (var1_5.getMessage().startsWith("Could not write")) {
                        var3_11 = var7_14;
                        if (o.i().a(this.p())) {
                            var3_11 = var7_14;
                            ax.Ha.c.h().f().d("!!USB writeFile 1 : could not write").g(var1_5.getMessage()).h();
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_11 = var7_14;
                        ax.Ha.c.h().f().d("!!USB writeFile 3").g(var1_5.getMessage()).h();
                    }
                    var3_11 = var7_14;
                    if (o.i().a(this.p())) {
                        var3_11 = var7_14;
                        var3_11 = var7_14;
                        var2_8 = new j(var1_5);
                        var3_11 = var7_14;
                        throw var2_8;
                    }
                    var3_11 = var7_14;
                    var3_11 = var7_14;
                    var2_8 = new H(var1_5);
                    var3_11 = var7_14;
                    throw var2_8;
                    catch (Exception var2_10) {
                        ** continue;
                    }
                }
                catch (Throwable var1_2) {
                    break block27;
                }
            }
            var3_11 = var19_21;
            var9_16 = var20_18;
            var16_22 = var17_19;
            var7_14 = var18_20;
            {
                var3_11 = var19_21;
                var9_16 = var20_18;
                var16_22 = var17_19;
                var7_14 = var18_20;
                var1_1 = new t();
                var3_11 = var19_21;
                var9_16 = var20_18;
                var16_22 = var17_19;
                var7_14 = var18_20;
                throw var1_1;
            }
        }
        if (var3_11 == null) throw var1_2;
        try {
            var3_11.close();
            throw var1_2;
        }
        catch (IOException var2_9) {
            var2_9.printStackTrace();
        }
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n n8, c object2, i i8) throws j {
        IOException iOException2;
        block8: {
            long l8;
            block7: {
                Object object3;
                block6: {
                    b.a(n8.n());
                    try {
                        object2 = this.l0(((n)object).E());
                        if (object2 == null) {
                            object = new j("Cannot get source usb file");
                            throw object;
                        }
                        l8 = object2.getLength();
                        String string = ((n)object).T();
                        if (!string.equals(object3 = n8.T())) break block6;
                        object2.w0(n8.B());
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new j(illegalArgumentException);
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                }
                if ((object3 = this.l0((String)object3)) == null) {
                    object = new j("Target parent does not exist");
                    throw object;
                }
                if (!((n)object).B().equals(n8.B())) {
                    object2.w0(n8.B());
                }
                object2.X0((e)object3);
            }
            if (i8 == null) return;
            i8.a(l8, l8);
            return;
        }
        iOException2.printStackTrace();
        throw new j(iOException2);
    }

    @Override
    public void F(n n8, n n9, c c8, i i8) throws j, ax.b3.a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (z.f0 != n8.G()) {
            return null;
        }
        return B.Y(n8);
    }

    @Override
    public void I(n n8) throws j {
        b.g("not support delete file recursively");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws j {
        IOException iOException2;
        block5: {
            Throwable var1_5;
            try {
                e e8 = this.l0(((n)object).E());
                if (e8 != null) {
                    f f8 = new f(e8);
                    object = new BufferedInputStream(f8);
                    if (l8 == 0L) return object;
                    ((BufferedInputStream)object).skip(l8);
                    return object;
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw new j((Throwable)var1_5);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new j((Throwable)var1_5);
            }
            catch (IOException iOException2) {
                break block5;
            }
            object = new j("UsbFile is null");
            throw object;
        }
        if (!o.i().a(this.p())) throw new H(iOException2);
        throw new j(iOException2);
    }

    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        if (a8 != null) {
            a8.B();
        }
        try {
            object = new a(this.p(), this, a8);
            ((q)object).h(new String[0]);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public boolean L() {
        return true;
    }

    @Override
    public boolean M(n n8) {
        return this.k0(n8, true);
    }

    @Override
    public boolean N(n n8) {
        return this.k0(n8, false);
    }

    @Override
    public boolean O() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void P(n n8) throws j {
        IllegalArgumentException illegalArgumentException2;
        block10: {
            IllegalStateException illegalStateException2;
            block9: {
                com.github.mjdev.libaums.a a82;
                block8: {
                    IOException iOException2;
                    block7: {
                        Object object;
                        try {
                            object = this.l0(n8.E());
                            if (object != null) {
                                object.delete();
                                return;
                            }
                        }
                        catch (IOException iOException2) {
                            break block7;
                        }
                        catch (com.github.mjdev.libaums.a a82) {
                            break block8;
                        }
                        catch (IllegalStateException illegalStateException2) {
                            break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            break block10;
                        }
                        object = new j("USBFile is null");
                        throw object;
                    }
                    iOException2.printStackTrace();
                    if (o.i().a(this.p())) {
                        ax.Ha.c.h().f().d("Usb delete 1").g(iOException2.getMessage()).h();
                        throw new j(iOException2);
                    }
                    throw new H(iOException2);
                }
                a82.printStackTrace();
                throw new j(a82);
            }
            ax.Ha.c.h().f().d("DELETE USB ROOT?").g(n8.E()).h();
            throw new j(illegalStateException2);
        }
        ax.Ha.c.h().f().d("USB IllegalArgumentException?").l(illegalArgumentException2).h();
        throw new j(illegalArgumentException2);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return this.h != null;
    }

    @Override
    public void b() {
        o.i().d();
        this.n0(null);
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, c c8) throws j {
        this.o(n8, string, bl, bl2, h8, c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public V m0(String object) throws j {
        try {
            if (!d0.D(this.v(), (String)object)) return new V(this, (String)object, this.l0((String)object));
            return new V(this, (String)object, this.h);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new j(illegalArgumentException);
        }
        catch (IOException iOException) {}
        iOException.printStackTrace();
        if (!o.i().a(this.p())) throw new H(iOException);
        throw new j(iOException);
    }

    void n0(e e8) {
        this.h = e8;
    }

    @Override
    public k0 y() throws j {
        return new k0(o.i().h(), o.i().j(), 0);
    }

    private static class a
    extends q<String, Void, Boolean> {
        Context h;
        c.a i;
        U j;
        String k;

        a(Context context, U u8, c.a a8) {
            super(q.e.c0);
            this.h = context;
            this.i = a8;
            this.j = u8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(String ... object) {
            Object object2;
            try {
                o.i().e(this.h);
                object = o.i().k();
                this.j.n0((e)object);
                if (object != null) return Boolean.TRUE;
                return Boolean.FALSE;
            }
            catch (G g8) {
            }
            catch (j j8) {
                return Boolean.FALSE;
            }
            catch (C c8) {
                this.k = this.h.getString(2131952630);
                return Boolean.FALSE;
            }
            if (g8.a() == 7) {
                object2 = this.h;
                object2 = object2.getString(2131952456, new Object[]{object2.getString(2131952463)});
            } else {
                object2 = null;
            }
            this.k = object2;
            return Boolean.FALSE;
        }

        protected void x(Boolean bl) {
            if (this.i != null) {
                if (bl.booleanValue()) {
                    this.i.T(true, null);
                    return;
                }
                this.i.T(false, this.k);
            }
        }
    }
}

