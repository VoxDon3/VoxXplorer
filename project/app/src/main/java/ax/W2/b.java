/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.graphics.Bitmap;
import ax.Dc.I;
import ax.Dc.J;
import ax.Q2.a;
import ax.Q2.f;
import ax.U2.d;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.x;
import ax.g3.i;
import ax.u3.q;
import com.voxdon.xplorer.data.ApkPlusInfo;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b
extends j {
    private o A;
    private boolean B;
    private List<ax.U2.f> w;
    private c x;
    private b y;
    private ax.U2.f z;

    public b(h.a object, List<ax.U2.f> list, boolean bl) {
        super((h.a)object);
        this.A = object = ax.c3.x.d(f.t0, 0);
        ((o)object).n0();
        this.w = list;
        this.B = bl;
        this.h(K.a(f.V0, 0));
    }

    static /* synthetic */ c C0(b b8, c c8) {
        b8.x = c8;
        return c8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean D0(d object, ax.U2.f object2, ax.u3.c c8) {
        ax.b3.j j82222;
        n n8;
        block3: {
            File file = ((d)object).z((ax.U2.f)object2);
            object = ((ax.U2.f)object2).f();
            try {
                object2 = this.A.z(file.getAbsolutePath());
                n8 = this.A.z(((File)object).getAbsolutePath());
                object = object2;
                if (!object2.n()) break block3;
                this.A.P((n)object2);
                object = this.A.z(file.getAbsolutePath());
            }
            catch (ax.b3.j j82222) {
            }
        }
        object2 = this.A;
        ((o)object2).j(n8, (o)object2, (n)object, false, false, false, c8, this.V());
        return true;
        catch (ax.b3.a a8) {
            return false;
        }
        this.q0(j82222);
        j82222.printStackTrace();
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private boolean E0(d d8, ax.U2.f f8, ax.u3.c c8) {
        ax.b3.j var1_3;
        File file = d8.z(f8);
        try {
            d8 = this.r();
        }
        catch (ax.b3.j j8) {}
        try {
            boolean bl = this.H0((Context)d8, f8, file, c8, this);
            return bl;
        }
        catch (ax.b3.j j9) {}
        var1_3.printStackTrace();
        this.q0((ax.b3.j)var1_3);
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void F0(J object, File object2, File object3, ax.u3.c c8, ax.g3.j j8) throws ax.b3.a, IOException {
        if (!((File)object3).isDirectory()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Not directory : ");
            ((StringBuilder)object).append(((File)object3).getName());
            throw new IOException(((StringBuilder)object).toString());
        }
        File[] fileArray = ((File)object3).listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                RuntimeException var0_3;
                block9: {
                    Object object4;
                    block11: {
                        block10: {
                            object3 = d0.n(((File)object2).getAbsolutePath(), file.getAbsolutePath()).substring(1);
                            if (file.isDirectory()) {
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append((String)object3);
                                ((StringBuilder)object4).append(d0.a);
                                ((J)object).u0(new I(((StringBuilder)object4).toString()));
                                ((J)object).d();
                                ax.W2.b.F0((J)object, (File)object2, file, c8, j8);
                                continue;
                            }
                            ((J)object).u0(new I((String)object3));
                            object3 = null;
                            try {
                                object4 = new FileInputStream(file);
                            }
                            catch (Throwable throwable) {
                                object2 = object3;
                                break block9;
                            }
                            try {
                                if (!"apk".equals(d0.j(file.getName()))) break block10;
                                F.c((InputStream)object4, (OutputStream)object, file.length(), c8, j8);
                                break block11;
                            }
                            catch (Throwable throwable) {
                                object2 = object4;
                                break block9;
                            }
                        }
                        F.c((InputStream)object4, (OutputStream)object, file.length(), c8, null);
                    }
                    if (j8 != null) {
                        j8.b();
                    }
                    ((J)object).d();
                    F.a((AutoCloseable)object4);
                    continue;
                }
                F.a((AutoCloseable)object2);
                throw var0_3;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void G0(File file, File object, int n8, ax.u3.c c8, ax.g3.j j8) throws ax.b3.a, IOException {
        RuntimeException var0_3;
        block5: {
            J j9;
            block4: {
                Object var5_8 = null;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File)object);
                    j9 = new J(fileOutputStream);
                    if (n8 < 0) break block4;
                }
                catch (Throwable throwable) {
                    object = var5_8;
                    break block5;
                }
                try {
                    j9.G0(n8);
                }
                catch (Throwable throwable) {
                    object = j9;
                    break block5;
                }
            }
            ax.W2.b.F0(j9, file, file, c8, j8);
            j9.flush();
            j9.o();
            F.a(j9);
            return;
        }
        F.a((AutoCloseable)object);
        throw var0_3;
    }

    static /* synthetic */ ax.U2.f y0(b b8, ax.U2.f f8) {
        b8.z = f8;
        return f8;
    }

    @Override
    public String A() {
        ax.U2.f f8 = this.z;
        if (f8 == null) {
            return "";
        }
        return f8.q();
    }

    @Override
    public int B() {
        return 11;
    }

    @Override
    public String C() {
        if (this.B) {
            return this.r().getString(2131952659);
        }
        return this.r().getString(2131952654);
    }

    @Override
    public String F() {
        int n8 = ax.W2.b$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            return this.r().getResources().getString(2131952321);
        }
        if (this.w.size() == 1) {
            return this.r().getResources().getString(2131952320, new Object[]{"/backups/apps"});
        }
        return this.r().getResources().getString(2131952319, new Object[]{"/backups/apps"});
    }

    @Override
    public String G() {
        if (ax.W2.b$a.a[this.D().ordinal()] != 2) {
            return "";
        }
        return this.v(false);
    }

    @Override
    public K H() {
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean H0(Context var1_1, ax.U2.f var2_10, File var3_14, ax.u3.c var4_16, j var5_17) throws ax.b3.j {
        block38: {
            block37: {
                block35: {
                    block32: {
                        block34: {
                            block33: {
                                var9_18 = f.t0;
                                var8_19 = false;
                                var15_20 = ax.c3.x.d((f)var9_18, 0);
                                var14_21 = new ArrayList<Object>();
                                var9_18 = var2_10.c();
                                if (var9_18 == null) {
                                    return false;
                                }
                                var14_21.add(var9_18);
                                var9_18 = var2_10.t();
                                if (var9_18 != null) {
                                    var14_21.addAll(Arrays.asList(var9_18));
                                }
                                var13_22 = new File(ax.Z2.a.m((Context)var1_1, "backup-tmp"), var2_10.r());
                                ax.Z2.a.f(var13_22, false);
                                var13_22.mkdirs();
                                var9_18 = new ApkPlusInfo();
                                var9_18.fillInfo((ax.U2.f)var2_10);
                                var1_1 = new Gson();
                                var17_23 = var1_1.t(var9_18);
                                var9_18 = null;
                                var11_24 = null;
                                var12_25 = null;
                                var10_26 = null;
                                var18_27 = new File(var13_22, "apk+.json");
                                var16_28 = new FileOutputStream(var18_27);
                                var1_1 = new OutputStreamWriter(var16_28);
                                var1_1.write(var17_23);
                                F.a((AutoCloseable)var1_1);
                                var11_24 = d.E((ax.U2.f)var2_10);
                                if (var11_24 == null) break block32;
                                var2_10 = new File(var13_22, "icon.png");
                                var1_1 = new FileOutputStream((File)var2_10);
                                var11_24.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)var1_1);
                                try lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        F.a((AutoCloseable)var1_1);
                                        break block32;
                                        break;
                                    }
                                }
                                catch (Throwable var1_2) {}
                                break block38;
                                catch (Throwable var3_15) {
                                    var2_10 = var1_1;
                                    var1_1 = var3_15;
                                    break block33;
                                }
                                catch (IOException var2_11) {
                                    break block34;
                                }
                                catch (Throwable var1_3) {
                                    var2_10 = var10_26;
                                }
                                catch (IOException var1_4) {
                                    var1_1 = null;
                                    break block34;
                                }
                            }
                            if (var2_10 != null) {
                                F.a((AutoCloseable)var2_10);
                            }
                            throw var1_1;
                        }
                        ** while (var1_1 != null)
                    }
                    var1_1 = var9_18;
                    if (var5_17 != null) {
                        var1_1 = var5_17.U(2);
                    }
                    var7_29 = var14_21.size();
                    for (var6_30 = 0; var6_30 < var7_29; ++var6_30) {
                        var5_17 = (String)var14_21.get(var6_30);
                        var2_10 = new File((String)var5_17);
                        var5_17 = d0.h((String)var5_17);
                        var9_18 = new File(var13_22, (String)var5_17);
                        try {
                            var5_17 = var15_20.z(var9_18.getAbsolutePath());
                            var10_26 = var15_20.z(var2_10.getAbsolutePath());
                            var2_10 = var5_17;
                            if (var5_17.n()) {
                                var15_20.P((n)var5_17);
                                var2_10 = var15_20.z(var9_18.getAbsolutePath());
                            }
                            if (var1_1 != null) {
                                var1_1.b();
                            }
                            var15_20.j(var10_26, var15_20, (n)var2_10, false, false, false, var4_16, (i)var1_1);
                            continue;
                        }
                        catch (ax.b3.a var1_5) {
                            ax.Z2.a.f(var13_22, true);
                            return false;
                        }
                    }
                    if (var1_1 == null) ** GOTO lbl119
                    {
                        block36: {
                            block40: {
                                block39: {
                                    ** try [egrp 9[TRYBLOCK] [25, 24 : 463->491)] { 
lbl95:
                                    // 1 sources

                                    break block39;
lbl96:
                                    // 1 sources

                                    catch (ax.b3.a var1_9) {}
lbl97:
                                    // 3 sources

                                    while (true) {
                                        ax.Z2.a.f(var13_22, true);
                                        return var8_19;
                                    }
                                    catch (Throwable var1_7) {
                                        var3_14 = var11_24;
                                        break block35;
                                    }
                                    catch (IOException var1_8) {
                                        var1_1 = var12_25;
                                        ** GOTO lbl130
                                    }
                                    catch (Throwable var2_12) {
                                        var3_14 = var1_1;
                                        var1_1 = var2_12;
                                        break block35;
                                    }
                                    catch (IOException var2_13) {
                                        ** GOTO lbl130
                                    }
                                }
                                var1_1.b();
                                var1_1.c(2L);
                                break block40;
lbl117:
                                // 1 sources

                                catch (IOException var1_6) {
                                    break block36;
                                }
                            }
                            ax.W2.b.G0(var13_22, (File)var3_14, 1, var4_16, (ax.g3.j)var1_1);
                            var8_19 = true;
                            ** GOTO lbl97
                        }
                        var1_6.printStackTrace();
                        ** continue;
                    }
                }
                if (var3_14 == null) ** GOTO lbl129
                {
                    F.a((AutoCloseable)var3_14);
lbl129:
                    // 2 sources

                    throw var1_1;
lbl130:
                    // 2 sources

                    if (var1_1 == null) break block37;
                    F.a((AutoCloseable)var1_1);
                }
            }
            ax.Z2.a.f(var13_22, true);
            return false;
        }
        ax.Z2.a.f(var13_22, true);
        throw var1_2;
    }

    @Override
    public String J() {
        return "";
    }

    @Override
    public K K() {
        return null;
    }

    @Override
    public String M() {
        return "";
    }

    @Override
    protected boolean P() {
        return this.A.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.y)) {
            this.y.e();
            bl = true;
        } else {
            bl = false;
        }
        if (this.S(this.x)) {
            this.x.e();
            return true;
        }
        return bl;
    }

    @Override
    protected void Y() {
        if (this.A.Y()) {
            this.w().T(v.a.c0);
            this.A.n(this.x());
        }
    }

    @Override
    protected void Z() {
        int n8 = this.w().H();
        if (this.w().M() == n8) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        b b8;
        this.j0();
        this.y = b8 = new b(this);
        b8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.A.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "app_backup").c("result", string).d(this.w().x()).e();
    }

    private class b
    extends q<Void, Void, Boolean> {
        final b h;

        public b(b b8) {
            this.h = b8;
            super(q.e.f0);
        }

        protected Boolean w(Void ... object) {
            object = this.h.w.iterator();
            while (object.hasNext()) {
                long l8 = ((ax.U2.f)object.next()).b();
                this.h.w().h(l8);
                this.h.w().g(1);
            }
            return Boolean.TRUE;
        }

        protected void x(Boolean bl) {
            this.h.g0();
        }

        protected void y(Boolean object) {
            this.h.k0();
            object = this.h;
            ax.W2.b.C0((b)object, new c((b)object));
            this.h.x.i(new Void[0]);
        }
    }

    private class c
    extends q<Void, Void, Integer> {
        final b h;

        public c(b b8) {
            this.h = b8;
            super(q.e.f0);
        }

        protected Integer w(Void ... object) {
            object = d.F(this.h.r());
            ((d)object).f();
            for (Object object2 : this.h.w) {
                boolean bl;
                if (this.isCancelled()) break;
                ax.W2.b.y0(this.h, (ax.U2.f)object2);
                if (this.h.z.E()) {
                    object2 = this.h;
                    bl = ((b)object2).E0((d)object, ((b)object2).z, this);
                } else {
                    object2 = this.h;
                    bl = ((b)object2).D0((d)object, ((b)object2).z, this);
                }
                if (bl) {
                    this.h.w().c(v.b.q, 1);
                    continue;
                }
                this.h.w().c(v.b.c0, 1);
                this.h.w().b(this.h.z.q());
            }
            this.h.l0(true);
            return 0;
        }

        protected void x(Integer n8) {
            this.h.g0();
        }

        protected void y(Integer n8) {
            this.h.o();
        }
    }
}

