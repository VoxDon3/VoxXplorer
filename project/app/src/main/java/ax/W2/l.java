/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import ax.Ac.a;
import ax.Bc.r;
import ax.Dc.I;
import ax.Dc.J;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.k;
import ax.W2.v;
import ax.W2.w;
import ax.a3.K;
import ax.c3.B;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k;
import ax.g3.i;
import ax.u3.q;
import com.voxdon.xplorer.file.e;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class l
extends j {
    private List<n> A;
    private String B;
    private String C;
    private n D;
    private n E;
    private ax.B.b<String> F = new ax.B.b();
    private k.a w;
    private d x;
    private c y;
    private o z;

    public l(h.a object, k.a a8, o o8, List<n> list, String string, String string2) {
        super((h.a)object);
        this.w = a8;
        this.z = o8;
        this.A = list;
        this.B = string;
        if (string2.endsWith(this.I0())) {
            this.C = string2;
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(this.I0());
            this.C = ((StringBuilder)object).toString();
        }
        this.z.n0();
        this.h(this.z.T());
    }

    static /* synthetic */ c A0(l l8, c c8) {
        l8.y = c8;
        return c8;
    }

    static /* synthetic */ n E0(l l8, n n8) {
        l8.D = n8;
        return n8;
    }

    static /* synthetic */ ax.B.b F0(l l8) {
        return l8.F;
    }

    static /* synthetic */ k.a G0(l l8) {
        return l8.w;
    }

    private void H0(n iterator, ax.u3.c c8) throws ax.b3.a, ax.b3.j {
        if (c8 != null && c8.isCancelled()) {
            throw new ax.b3.a();
        }
        if (iterator.isDirectory()) {
            this.w().g(1);
            iterator = this.z.f0((n)((Object)iterator));
            if (iterator != null) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    this.H0((n)iterator.next(), c8);
                }
            }
            return;
        }
        this.w().h(iterator.p());
        this.w().g(1);
    }

    private String I0() {
        if (this.w == k.a.c0) {
            return ".7z";
        }
        return ".zip";
    }

    private void J0() {
        Bundle bundle = this.A.iterator();
        boolean bl = false;
        while (bundle.hasNext()) {
            if (!bundle.next().E().equals(this.E.E())) continue;
            bl = true;
        }
        ax.a3.K k8 = new ax.a3.K();
        bundle = new Bundle();
        bundle.putString("progressTypeString", this.C());
        bundle.putString("fileName", this.E.B());
        bundle.putBoolean("no_overwrite", bl);
        bundle.putInt("errCode", 1);
        k8.v2(bundle);
        k8.v3(new K.i(this){
            final l a;
            {
                this.a = l8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(j.f object, boolean bl) {
                try {
                    int n8 = ax.W2.l$b.a[object.ordinal()];
                    if (n8 == 1) {
                        this.a.z.P(this.a.E);
                        object = this.a;
                        c c8 = new c(this.a);
                        l.A0((l)object, c8);
                        this.a.y.h(new Void[0]);
                        return;
                    }
                    if (n8 == 2) {
                        object = this.a;
                        l.x0((l)object, ((l)object).z.X(this.a.E, false));
                        l l8 = this.a;
                        object = new c(this.a);
                        l.A0(l8, (c)object);
                        this.a.y.h(new Void[0]);
                        return;
                    }
                    if (n8 == 3) {
                        this.a.i();
                        return;
                    }
                    if (n8 != 4) {
                        return;
                    }
                    this.a.i();
                    return;
                }
                catch (Exception exception) {}
                exception.printStackTrace();
            }
        });
        this.q().K(this, k8);
    }

    static /* synthetic */ n x0(l l8, n n8) {
        l8.E = n8;
        return n8;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 2;
    }

    @Override
    public String C() {
        return this.r().getString(2131952511);
    }

    @Override
    public String F() {
        int n8 = ax.W2.l$b.b[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            return this.r().getResources().getString(2131952323);
        }
        return this.r().getResources().getQuantityString(2131820551, this.w().H(), new Object[]{this.w().H(), this.M()});
    }

    @Override
    protected String G() {
        if (ax.W2.l$b.b[this.D().ordinal()] != 2) {
            return "";
        }
        return this.v(false);
    }

    @Override
    public K H() {
        n n8 = this.D;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String J() {
        n n8 = this.D;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    public K K() {
        n n8 = this.E;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.E;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        return this.z.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        boolean bl;
        if (this.S(this.x)) {
            this.x.e();
            bl = true;
        } else {
            bl = false;
        }
        if (this.S(this.y)) {
            this.y.e();
            return true;
        }
        return bl;
    }

    @Override
    protected void Y() {
        if (this.z.Y()) {
            this.w().T(v.a.c0);
            this.z.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.B != null) {
            ax.W2.w.c().g(this.z.T(), this.B, this.F);
        }
        if (this.w().M() != 0 && this.w().M() == this.w().H()) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        Object object;
        this.j0();
        try {
            this.E = object = this.z.z(d0.Q(this.B, this.C));
            if (object.isDirectory()) {
                object = this.z;
                String string = this.B;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.C);
                stringBuilder.append(this.I0());
                this.E = ((o)object).z(d0.Q(string, stringBuilder.toString()));
            }
        }
        catch (ax.b3.j j8) {
            j8.printStackTrace();
        }
        this.x = object = new d(this);
        ((q)object).i(new Void[0]);
    }

    @Override
    public void k() {
        this.z.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_compress").c("result", string).c("loc", this.z.S().I()).d(this.w().x()).e();
    }

    private class c
    extends q<Void, Void, Boolean> {
        private FileOutputStream h;
        private ParcelFileDescriptor i;
        final l j;

        public c(l l8) {
            this.j = l8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private SeekableByteChannel B(k object) throws IOException {
            Object object2;
            block10: {
                block11: {
                    ax.b3.j j82;
                    block8: {
                        block7: {
                            block9: {
                                ax.b3.j j92;
                                block6: {
                                    block5: {
                                        if (!((k)object).j0() || !(object instanceof y)) break block9;
                                        object2 = (y)object;
                                        try {
                                            object = this.j.z.u();
                                            if (((y)object2).n()) break block5;
                                            this.j.z.N((n)object2);
                                        }
                                        catch (ax.b3.j j92) {
                                            break block6;
                                        }
                                    }
                                    object = ((x)object).U0((y)object2);
                                    break block10;
                                }
                                j92.printStackTrace();
                                return null;
                            }
                            if (!((k)object).i0()) break block11;
                            try {
                                if (object.n()) break block7;
                                this.j.z.N((n)object);
                            }
                            catch (ax.b3.j j82) {
                                break block8;
                            }
                        }
                        object = ((k)object).e0(false);
                        break block10;
                    }
                    j82.printStackTrace();
                    return null;
                }
                if (!(object instanceof y)) return null;
                return j.Files.newByteChannel((j.Path)j.FileRetargetClass.toPath((File)((y)object).F0()), EnumSet.of(j.StandardOpenOption.CREATE, j.StandardOpenOption.WRITE, j.StandardOpenOption.READ), (j.FileAttribute[])new j.FileAttribute[0]);
            }
            if (object == null) {
                return null;
            }
            object2 = new FileOutputStream(object.getFileDescriptor());
            this.i = object;
            this.h = object2;
            return ax.g2.b.a((FileOutputStream)object2);
        }

        private long C(InputStream inputStream, r r8, long l8, ax.u3.c c8, i i8) throws ax.b3.a, IOException {
            byte[] byArray = new byte[8192];
            long l9 = 0L;
            while (true) {
                long l10;
                long l11;
                l9 = l11 = l9;
                while (true) {
                    int n8;
                    if ((n8 = inputStream.read(byArray)) < 0) {
                        if (i8 != null) {
                            i8.a(l9, l8);
                        }
                        return l9;
                    }
                    if (n8 == 0) {
                        try {
                            Thread.sleep(5L);
                        }
                        catch (InterruptedException interruptedException) {}
                        continue;
                    }
                    r8.u(byArray, 0, n8);
                    l9 = l10 = l9 + (long)n8;
                    if (l10 - l11 >= 262144L) break;
                }
                if (i8 != null) {
                    i8.a(l10, l8);
                }
                l9 = l10;
                if (c8 == null) continue;
                if (c8.isCancelled()) break;
                l9 = l10;
            }
            throw new ax.b3.a();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void w(n n8, String object, r r8, i iterator) throws ax.b3.j, ax.b3.a {
            RuntimeException var1_5;
            Object object2;
            block22: {
                block23: {
                    Object object3;
                    block21: {
                        block24: {
                            ax.Bc.l l8;
                            block20: {
                                StringBuilder stringBuilder;
                                Object var9_16;
                                block19: {
                                    Object object4 = null;
                                    var9_16 = null;
                                    stringBuilder = null;
                                    Object var11_18 = null;
                                    l8 = new ax.Bc.l();
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append((String)object);
                                    ((StringBuilder)object2).append(n8.B());
                                    l8.I(((StringBuilder)object2).toString());
                                    long l9 = n8.q();
                                    if (l9 < 0L) break block19;
                                    object2 = var11_18;
                                    object3 = object4;
                                    object2 = var11_18;
                                    object3 = object4;
                                    Date date = new Date(n8.q());
                                    object2 = var11_18;
                                    object3 = object4;
                                    l8.H(date);
                                }
                                l.E0(this.j, n8);
                                if (n8.isDirectory()) break block20;
                                this.j.l0(true);
                                l8.F(true);
                                l8.K(32);
                                object2 = object = new BufferedInputStream(this.j.z.J(n8, 0L), 8192);
                                object3 = object;
                                r8.p(l8);
                                object2 = object;
                                object3 = object;
                                this.j.w().U(n8.p());
                                object2 = object;
                                object3 = object;
                                this.C((InputStream)object, r8, n8.p(), this, (i)((Object)iterator));
                                object2 = object;
                                object3 = object;
                                r8.g();
                                object2 = object;
                                object3 = object;
                                this.j.w().c(v.b.q, 1);
                                object2 = object;
                                object3 = object;
                                this.j.l0(true);
                                break block21;
                                catch (Throwable throwable) {
                                    object2 = stringBuilder;
                                    break block22;
                                }
                                catch (IOException iOException) {
                                    object = var9_16;
                                    break block23;
                                }
                            }
                            try {
                                l8.z(true);
                                r8.p(l8);
                                r8.g();
                                this.j.w().c(v.b.q, 1);
                                this.j.l0(true);
                                iterator = this.j.z.f0(n8);
                                if (iterator == null) break block24;
                                iterator = iterator.iterator();
                                while (iterator.hasNext()) {
                                    object3 = (n)iterator.next();
                                    if (this.isCancelled()) {
                                        object = new ax.b3.a();
                                        throw object;
                                    }
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append((String)object);
                                    ((StringBuilder)object2).append(n8.B());
                                    ((StringBuilder)object2).append(d0.a);
                                    this.w((n)object3, ((StringBuilder)object2).toString(), r8, this.j.V());
                                }
                            }
                            catch (Throwable throwable) {
                                object2 = null;
                                break block22;
                            }
                            catch (IOException iOException) {
                                object = null;
                                break block23;
                            }
                        }
                        object = null;
                    }
                    if (object == null) return;
                    try {
                        ((BufferedInputStream)object).close();
                        return;
                    }
                    catch (IOException iOException) {
                        return;
                    }
                    catch (Throwable throwable) {
                        break block22;
                    }
                    catch (IOException iOException) {
                        object = object3;
                    }
                }
                object2 = object;
                {
                    Exception var3_13;
                    this.j.w().c(v.b.c0, 1);
                    object2 = object;
                    this.j.w().b(n8.B());
                    object2 = object;
                    throw ax.b3.d.a("compress exception", (Exception)var3_13);
                }
            }
            if (object2 == null) throw var1_5;
            try {
                ((BufferedInputStream)object2).close();
            }
            catch (IOException iOException) {
                throw var1_5;
            }
            throw var1_5;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void x(n var1_1, String var2_7, J var3_16, i var4_18) throws ax.b3.j, ax.b3.a {
            block38: {
                block39: {
                    block35: {
                        block36: {
                            block37: {
                                var10_19 = null;
                                var11_20 = null;
                                var9_21 = null;
                                var8_22 = null;
                                var12_23 = null;
                                try {
                                    if (var1_1.isDirectory()) break block35;
                                    l.E0(this.j, (n)var1_1);
                                    this.j.l0(true);
                                    var11_20 = new StringBuilder();
                                    var11_20.append((String)var2_7);
                                    var11_20.append(var1_1.B());
                                    var10_19 = new I(var11_20.toString());
                                    var5_24 = var1_1.q();
                                    if (var5_24 >= 0L) {
                                        break block36;
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var2_12) {
                                    var1_1 = var12_23;
                                    break block37;
                                }
                                catch (IOException var2_13) {}
                                ** GOTO lbl-1000
                            }
lbl27:
                            // 4 sources

                            while (true) {
                                if (var1_1 == null) throw var2_7;
                                try {
                                    var1_1.close();
                                    throw var2_7;
                                }
                                catch (IOException var1_6) {
                                    throw var2_7;
                                }
                                break;
                            }
                        }
                        try {
                            var10_19.setTime(var1_1.q());
                            com.voxdon.xplorer.file.b.o1(var10_19, var1_1.q());
                        }
                        catch (Throwable var2_8) {
                            var1_1 = var8_22;
                            ** GOTO lbl27
                        }
                        catch (IOException var3_17) {
                            var2_7 = var9_21;
                            break block38;
                        }
lbl-1000:
                        // 2 sources

                        {
                            if (!(var7_25 = com.voxdon.xplorer.file.b.p1((n)var1_1, var5_24 = var1_1.p()))) ** GOTO lbl-1000
                        }
                        {
                            var10_19.setMethod(0);
                            var10_19.setSize(var5_24);
                            var10_19.setCompressedSize(var5_24);
                            var10_19.setCrc(ax.c3.B.b(l.y0(this.j), (n)var1_1, this));
                        }
lbl-1000:
                        // 2 sources

                        {
                            var8_22 = new BufferedInputStream(l.y0(this.j).J((n)var1_1, 0L), 8192);
                        }
                        var3_16.u0(var10_19);
                        this.j.w().U(var5_24);
                        ax.c3.F.c((InputStream)var8_22, (OutputStream)var3_16, var5_24, this, (i)var4_18);
                        try {
                            var3_16.d();
                            this.j.w().c(v.b.q, 1);
                            this.j.l0(true);
                            break block39;
                        }
                        catch (Throwable var1_2) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var2_7 = var1_1;
                                var1_1 = var8_22;
                                ** GOTO lbl27
                                break;
                            }
                        }
                        catch (IOException var2_9) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var3_16 = var2_7;
                                var2_7 = var8_22;
                                break block38;
                                break;
                            }
                        }
                        catch (Throwable var1_3) {
                            ** GOTO lbl-1000
                        }
                        catch (IOException var2_10) {
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var1_4) {
                            ** continue;
                        }
                        catch (IOException var2_11) {
                            ** continue;
                        }
lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var3_16 = var2_7;
                                var2_7 = var9_21;
                                break block38;
                                break;
                            }
                        }
                    }
                    var4_18 = var10_19;
                    try {
                        var4_18 = var10_19;
                        var4_18 = var10_19;
                        var12_23 = new Iterator<E>();
                        var4_18 = var10_19;
                        var12_23.append((String)var2_7);
                        var4_18 = var10_19;
                        var12_23.append(var1_1.B());
                        var4_18 = var10_19;
                        var12_23.append(d0.a);
                        var4_18 = var10_19;
                        var8_22 = new I(var12_23.toString());
                        var4_18 = var10_19;
                        if (var1_1.q() >= 0L) {
                            var4_18 = var10_19;
                            var8_22.setTime(var1_1.q());
                            var4_18 = var10_19;
                            com.voxdon.xplorer.file.b.o1((I)var8_22, var1_1.q());
                        }
                    }
                    catch (Throwable var2_14) {
                        var1_1 = var4_18;
                        ** continue;
                    }
                    catch (IOException var2_15) {
                        ** continue;
                    }
                    var4_18 = var10_19;
                    var3_16.u0((a)var8_22);
                    var4_18 = var10_19;
                    var3_16.d();
                    var4_18 = var10_19;
                    this.j.w().c(v.b.q, 1);
                    var4_18 = var10_19;
                    var12_23 = l.y0(this.j).f0((n)var1_1);
                    var8_22 = var11_20;
                    if (var12_23 != null) {
                        var4_18 = var10_19;
                        var12_23 = var12_23.iterator();
                        while (true) {
                            var4_18 = var10_19;
                            var8_22 = var11_20;
                            if (!var12_23.hasNext()) break;
                            var4_18 = var10_19;
                            var13_26 = (n)var12_23.next();
                            var4_18 = var10_19;
                            if (this.isCancelled()) {
                                var4_18 = var10_19;
                                var4_18 = var10_19;
                                var2_7 = new ax.b3.a();
                                var4_18 = var10_19;
                                throw var2_7;
                            }
                            var4_18 = var10_19;
                            var4_18 = var10_19;
                            var8_22 = new StringBuilder();
                            var4_18 = var10_19;
                            var8_22.append((String)var2_7);
                            var4_18 = var10_19;
                            var8_22.append(var1_1.B());
                            var4_18 = var10_19;
                            var8_22.append(d0.a);
                            var4_18 = var10_19;
                            this.x(var13_26, var8_22.toString(), (J)var3_16, this.j.V());
                        }
                    }
                }
                if (var8_22 == null) return;
                try {
                    var8_22.close();
                    return;
                }
                catch (IOException var1_5) {
                    return;
                }
            }
            var4_18 = var2_7;
            {
                this.j.w().c(v.b.c0, 1);
                var4_18 = var2_7;
                this.j.w().b(var1_1.B());
                var4_18 = var2_7;
                throw ax.b3.d.a("compress exception", (Exception)var3_16);
            }
        }

        protected void A(Boolean bl) {
            this.j.o();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean y(Void ... var1_1) {
            block63: {
                block62: {
                    block60: {
                        block61: {
                            block59: {
                                block65: {
                                    block58: {
                                        var11_11 = null;
                                        var8_12 = null;
                                        var9_13 = null;
                                        var3_14 = null;
                                        var10_15 = null;
                                        var12_16 = null;
                                        if (ax.c3.B.H(l.w0(this.j))) break block58;
                                        var2_17 = ax.Ha.c.h().b("INVALID FILE COMPRESS");
                                        var1_1 = new StringBuilder();
                                        var1_1.append("locunit:");
                                        var1_1.append(l.w0(this.j).R().toString());
                                        var2_17.g(var1_1.toString()).h();
                                        var1_1 = Boolean.FALSE;
                                        var2_17 = this.h;
                                        if (var2_17 != null) {
                                            ax.c3.F.a((AutoCloseable)var2_17);
                                        }
                                        if ((var2_17 = this.i) == null) return var1_1;
                                        ax.c3.F.a((AutoCloseable)var2_17);
                                        return var1_1;
                                    }
                                    l.F0(this.j).add(l.w0(this.j).B());
                                    var1_1 = l.G0(this.j);
                                    var2_18 /* !! */  = k.a.c0;
                                    if (var1_1 != var2_18 /* !! */ ) break block59;
                                    var1_1 = this.B((k)l.w0(this.j));
                                    if (var1_1 == null) ** GOTO lbl106
                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_25 = var1_1;
                                    var4_29 = var1_1;
                                    var5_36 = var1_1;
                                    var7_38 = var1_1;
                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_25 = var1_1;
                                    var4_29 = var1_1;
                                    var5_36 = var1_1;
                                    var7_38 = var1_1;
                                    var13_40 = new r((SeekableByteChannel)var1_1);
                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_25 = var1_1;
                                    var4_29 = var1_1;
                                    var5_36 = var1_1;
                                    var7_38 = var1_1;
                                    var15_42 = l.B0(this.j).iterator();
                                    while (true) {
                                        var2_18 /* !! */  = var1_1;
                                        var3_14 = var12_16;
                                        var6_25 = var1_1;
                                        var4_29 = var1_1;
                                        var5_36 = var1_1;
                                        var7_38 = var1_1;
                                        if (!var15_42.hasNext()) break;
                                        var2_18 /* !! */  = var1_1;
                                        var3_14 = var12_16;
                                        var6_25 = var1_1;
                                        var4_29 = var1_1;
                                        var5_36 = var1_1;
                                        var7_38 = var1_1;
                                        var14_43 = (n)var15_42.next();
                                        var2_18 /* !! */  = var1_1;
                                        var3_14 = var12_16;
                                        var6_25 = var1_1;
                                        var4_29 = var1_1;
                                        var5_36 = var1_1;
                                        var7_38 = var1_1;
                                        if (this.isCancelled()) {
                                            var2_18 /* !! */  = var1_1;
                                            var3_14 = var12_16;
                                            var6_25 = var1_1;
                                            var4_29 = var1_1;
                                            var5_36 = var1_1;
                                            var7_38 = var1_1;
                                            var2_18 /* !! */  = var1_1;
                                            var3_14 = var12_16;
                                            var6_25 = var1_1;
                                            var4_29 = var1_1;
                                            var5_36 = var1_1;
                                            var7_38 = var1_1;
                                            var13_40 = new ax.b3.a();
                                            var2_18 /* !! */  = var1_1;
                                            var3_14 = var12_16;
                                            var6_25 = var1_1;
                                            var4_29 = var1_1;
                                            var5_36 = var1_1;
                                            var7_38 = var1_1;
                                            throw var13_40;
                                        }
                                        var2_18 /* !! */  = var1_1;
                                        var3_14 = var12_16;
                                        var6_25 = var1_1;
                                        var4_29 = var1_1;
                                        var5_36 = var1_1;
                                        var7_38 = var1_1;
                                        this.w(var14_43, "", (r)var13_40, this.j.V());
                                    }
                                    break block65;
lbl106:
                                    // 1 sources

                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_26 = var1_1;
                                    var4_31 = var1_1;
                                    var5_37 = var1_1;
                                    var7_39 = var1_1;
                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_26 = var1_1;
                                    var4_31 = var1_1;
                                    var5_37 = var1_1;
                                    var7_39 = var1_1;
                                    var13_41 = new IOException("Could not open file channel");
                                    var2_18 /* !! */  = var1_1;
                                    var3_14 = var12_16;
                                    var6_26 = var1_1;
                                    var4_31 = var1_1;
                                    var5_37 = var1_1;
                                    var7_39 = var1_1;
                                    throw var13_41;
                                }
                                var2_18 /* !! */  = var1_1;
                                var3_14 = var12_16;
                                var6_25 = var1_1;
                                var4_29 = var1_1;
                                var5_36 = var1_1;
                                var7_38 = var1_1;
                                var13_40.j();
                                var2_18 /* !! */  = var1_1;
                                var3_14 = var12_16;
                                var6_25 = var1_1;
                                var4_29 = var1_1;
                                var5_36 = var1_1;
                                var7_38 = var1_1;
                                var13_40.close();
                                break block60;
                            }
                            var1_1 = ((e)l.y0(this.j).u()).c(l.w0(this.j).E(), false);
                            if (var1_1 != null) break block61;
                            var1_1 = Boolean.FALSE;
                            var2_18 /* !! */  = this.h;
                            if (var2_18 /* !! */  != null) {
                                ax.c3.F.a((AutoCloseable)var2_18 /* !! */ );
                            }
                            if ((var2_18 /* !! */  = this.i) == null) return var1_1;
                            ax.c3.F.a((AutoCloseable)var2_18 /* !! */ );
                            return var1_1;
                        }
                        try {
                            var1_1 = new J((OutputStream)var1_1);
                        }
                        catch (Throwable var1_2) {
                            var2_18 /* !! */  = null;
                            ** GOTO lbl290
                        }
                        catch (IllegalArgumentException var1_3) {
                            var6_25 = null;
                            var1_1 = var11_11;
                            break block62;
                        }
                        catch (IOException var4_27) {
                            var1_1 = null;
                            var5_36 = var8_12;
                            ** GOTO lbl261
                        }
                        catch (ax.b3.j var4_28) {
                            var1_1 = null;
                            var5_36 = var9_13;
                            ** GOTO lbl-1000
                        }
                        catch (ax.b3.a var1_4) {
                            var7_38 = null;
                            var1_1 = var10_15;
                            ** GOTO lbl300
                        }
                        try {
                            var1_1.F0(Charset.defaultCharset().name());
                            for (Object var2_18 : l.B0(this.j)) {
                                if (this.isCancelled()) {
                                    var2_18 /* !! */  = new ax.b3.a();
                                    throw var2_18 /* !! */ ;
                                }
                                this.x((n)var2_18 /* !! */ , "", (J)var1_1, this.j.V());
                            }
                        }
                        catch (Throwable var4_32) {
                            var2_18 /* !! */  = null;
                            var3_14 = var1_1;
                            var1_1 = var4_32;
                            ** GOTO lbl290
                        }
                        catch (IllegalArgumentException var2_20) {
                            var6_25 = null;
                            break block62;
                        }
                        catch (IOException var4_33) {
                            var2_18 /* !! */  = null;
                            var5_36 = var1_1;
                            var1_1 = var2_18 /* !! */ ;
                            ** GOTO lbl261
                        }
                        catch (ax.b3.j var4_34) {
                            var2_18 /* !! */  = null;
                            var5_36 = var1_1;
                            var1_1 = var2_18 /* !! */ ;
                            ** GOTO lbl-1000
                        }
                        catch (ax.b3.a var2_21) {
                            var7_38 = null;
                            ** GOTO lbl300
                        }
                        var1_1.flush();
                        var1_1.o();
                        var1_1.close();
                        var1_1 = null;
                    }
                    var2_18 /* !! */  = var1_1;
                    var3_14 = var12_16;
                    var6_25 = var1_1;
                    var4_29 = var1_1;
                    var5_36 = var1_1;
                    var7_38 = var1_1;
                    var12_16 = Boolean.TRUE;
                    if (var1_1 == null) ** GOTO lbl223
                    try {
                        ax.c3.F.a((AutoCloseable)var1_1);
lbl223:
                        // 2 sources

                        if ((var1_1 = this.h) != null) {
                            ax.c3.F.a((AutoCloseable)var1_1);
                        }
                        if ((var1_1 = this.i) == null) return var12_16;
                        ax.c3.F.a((AutoCloseable)var1_1);
                        return var12_16;
                    }
                    catch (IllegalArgumentException var1_8) {
                        return var12_16;
                    }
                    catch (IllegalArgumentException var2_22) {
                        return var1_1;
                    }
                    catch (IllegalArgumentException var2_23) {
                        return var1_1;
                    }
                    catch (Throwable var1_5) {
                        ** GOTO lbl290
                    }
                    catch (IllegalArgumentException var1_6) {
                        var1_1 = var11_11;
                        break block62;
                    }
                    catch (IOException var2_19) {
                        var1_1 = var4_29;
                        var4_29 = var2_19;
                        var5_36 = var8_12;
                        ** GOTO lbl261
                    }
                    catch (ax.b3.j var4_30) {
                        var1_1 = var5_36;
                        var5_36 = var9_13;
                        ** GOTO lbl-1000
                    }
                    catch (ax.b3.a var1_7) {
                        var1_1 = var10_15;
                        ** GOTO lbl300
                    }
                }
                if (var1_1 == null) ** GOTO lbl255
                try {
                    ax.c3.F.a((AutoCloseable)var1_1);
lbl255:
                    // 2 sources

                    if (var6_25 != null) {
                        ax.c3.F.a(var6_25);
                    }
                    if ((var1_1 = this.h) != null) {
                        ax.c3.F.a((AutoCloseable)var1_1);
                    }
                    if ((var1_1 = this.i) == null) break block63;
                    break block64;
lbl261:
                    // 3 sources

                    var2_18 /* !! */  = var1_1;
                    var3_14 = var5_36;
                    {
                        var4_29.printStackTrace();
                        if (var5_36 == null) ** GOTO lbl267
                    }
                    ax.c3.F.a(var5_36);
lbl267:
                    // 2 sources

                    if (var1_1 != null) {
                        ax.c3.F.a((AutoCloseable)var1_1);
                    }
                    if ((var1_1 = this.h) != null) {
                        ax.c3.F.a((AutoCloseable)var1_1);
                    }
                    if ((var1_1 = this.i) == null) break block63;
                    break block64;
                }
                catch (IllegalArgumentException var1_9) {}
lbl-1000:
                // 3 sources

                {
                    block64: {
                        var2_18 /* !! */  = var1_1;
                        var3_14 = var5_36;
                        {
                            this.j.q0((ax.b3.j)var4_35);
                            var2_18 /* !! */  = var1_1;
                            var3_14 = var5_36;
                            var4_35.printStackTrace();
                            if (var5_36 == null) ** GOTO lbl284
                        }
                        ax.c3.F.a(var5_36);
lbl284:
                        // 2 sources

                        if (var1_1 != null) {
                            ax.c3.F.a((AutoCloseable)var1_1);
                        }
                        if ((var1_1 = this.h) != null) {
                            ax.c3.F.a((AutoCloseable)var1_1);
                        }
                        if ((var1_1 = this.i) == null) break block63;
                        break block64;
lbl290:
                        // 3 sources

                        if (var3_14 == null) ** GOTO lbl293
                        ax.c3.F.a(var3_14);
lbl293:
                        // 2 sources

                        if (var2_18 /* !! */  != null) {
                            ax.c3.F.a((AutoCloseable)var2_18 /* !! */ );
                        }
                        if ((var2_18 /* !! */  = this.h) != null) {
                            ax.c3.F.a((AutoCloseable)var2_18 /* !! */ );
                        }
                        if ((var2_18 /* !! */  = this.i) == null) throw var1_1;
                        ax.c3.F.a((AutoCloseable)var2_18 /* !! */ );
                        throw var1_1;
lbl300:
                        // 3 sources

                        if (var1_1 == null) ** GOTO lbl303
                        ax.c3.F.a((AutoCloseable)var1_1);
lbl303:
                        // 2 sources

                        if (var7_38 != null) {
                            ax.c3.F.a(var7_38);
                        }
                        if ((var1_1 = this.h) != null) {
                            ax.c3.F.a((AutoCloseable)var1_1);
                        }
                        if ((var1_1 = this.i) == null) break block63;
                    }
                    ax.c3.F.a((AutoCloseable)var1_1);
                }
            }
            try {
                l.y0(this.j).P(l.w0(this.j));
                return Boolean.FALSE;
            }
            catch (ax.b3.j var1_10) {
                return Boolean.FALSE;
            }
            catch (IllegalArgumentException var2_24) {
                throw var1_1;
            }
        }

        protected void z(Boolean bl) {
            this.j.g0();
        }
    }

    private class d
    extends q<Void, Void, Boolean> {
        final l h;

        public d(l l8) {
            this.h = l8;
            super(q.e.f0);
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... object) {
            try {
                Iterator iterator = this.h.A.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return Boolean.TRUE;
                    }
                    object = (n)iterator.next();
                    this.h.H0((n)object, this);
                }
            }
            catch (ax.b3.j j8) {}
            j8.printStackTrace();
            return Boolean.FALSE;
            catch (ax.b3.a a8) {
                return Boolean.FALSE;
            }
        }

        protected void x(Boolean bl) {
            this.h.g0();
        }

        protected void y(Boolean object) {
            if (this.h.E != null && ((Boolean)object).booleanValue()) {
                this.h.k0();
                if (this.h.E.n()) {
                    this.h.J0();
                    return;
                }
                object = this.h;
                l.A0((l)object, new c((l)object));
                this.h.y.i(new Void[0]);
                return;
            }
            this.h.o();
        }
    }
}

