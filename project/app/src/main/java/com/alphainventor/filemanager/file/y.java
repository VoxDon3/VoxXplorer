/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Q2.d;
import ax.Q2.e;
import ax.Q2.f;
import ax.X2.K;
import ax.X2.L;
import ax.X2.Q;
import ax.Z2.j;
import ax.b3.C;
import ax.b3.r;
import ax.b3.t;
import ax.c3.B;
import ax.c3.I;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.l;
import ax.c3.v;
import ax.y0.a;
import com.alphainventor.filemanager.FileManagerApp;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.g;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.p;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.z;
import com.alphainventor.filemanager.shizuku.c;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.logging.Logger;

public class y
extends k {
    private static final Logger R0 = Logger.getLogger("FileManager.LocalFileInfo");
    private Boolean A0;
    private Uri B0;
    private Boolean C0;
    private Boolean D0;
    private Boolean E0;
    private int F0;
    private String G0;
    private String H0;
    private ax.c3.K I0;
    private boolean J0;
    private Boolean K0;
    private b L0 = b.q;
    File M0;
    private String N0 = "no_constructor";
    private boolean O0;
    private boolean P0;
    String Q0;
    protected x m0;
    protected File n0;
    private String o0;
    private String p0;
    private String q0;
    private String r0;
    private Boolean s0;
    private Long t0;
    private Long u0;
    private Long v0;
    public Boolean w0;
    public Boolean x0;
    private Boolean y0;
    private Boolean z0;

    public y(x object, Uri object2, ax.c3.K object3, String string, Cursor object4) throws ax.b3.j {
        super((m)object);
        boolean bl;
        this.m0 = object;
        l l8 = new l((Cursor)object4);
        object = l8.a;
        boolean bl2 = true;
        if (object != null && ((String)object).endsWith("/")) {
            object = ((String)object).replaceAll(".$", "_");
            bl = true;
        } else {
            bl = false;
        }
        object4 = g.q(this.x(), (ax.c3.K)object3, (Uri)object2, (String)object, string, l8);
        if (d0.J(string, (String)object4, true)) {
            CharSequence charSequence;
            object = d0.o(string, (String)object4, true).substring(1);
            if (((String)object).contains("/")) {
                charSequence = ((String)object).replaceAll("/", "_");
                object = d0.Q(string, (String)charSequence);
                bl = bl2;
                object4 = object;
                if (((String)charSequence).length() > 12) {
                    object4 = ax.Ha.c.h().f().b("LOCAL DOCUMENT FILE NAME FIXED UNUSUAL").j();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("file:");
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append(",");
                    ((StringBuilder)charSequence).append(l8.b);
                    ((StringBuilder)charSequence).append(",");
                    ((StringBuilder)charSequence).append(l8.a);
                    ((StringBuilder)charSequence).append(",root:");
                    ((StringBuilder)charSequence).append(object2);
                    ((ax.Ha.b)object4).g(((StringBuilder)charSequence).toString()).h();
                    bl = bl2;
                    object4 = object;
                }
            }
            if (TextUtils.isEmpty((CharSequence)l8.b)) {
                object = ax.Ha.c.h().f().b("empty local document displayname");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("id:");
                ((StringBuilder)charSequence).append(l8.a);
                ((StringBuilder)charSequence).append(",root:");
                ((StringBuilder)charSequence).append(object2);
                ((StringBuilder)charSequence).append(",parent:");
                ((StringBuilder)charSequence).append(string);
                ((ax.Ha.b)object).g(((StringBuilder)charSequence).toString()).h();
                object = null;
            } else {
                object = l8.b.contains("/") ? d0.Q(string, l8.b.replaceAll("/", "_")) : d0.Q(string, l8.b);
            }
            if (object != null && !((String)object).equalsIgnoreCase((String)object4) && !"/".equals(object4)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("LOCAL DOCUMENT FILE NAME CONFLICT:");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append(l8.b);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append((String)object4);
                FileManagerApp.b(((StringBuilder)charSequence).toString());
                if (bl) {
                    ax.u3.b.e("DOCUMENT PATH CONFLICT");
                } else {
                    object = ax.Ha.c.h().f().b("LOCAL DOCUMENT FILE NAME CONFLICT 1").j();
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("parent:");
                    ((StringBuilder)object3).append(string);
                    ((StringBuilder)object3).append(",");
                    ((StringBuilder)object3).append(l8.b);
                    ((StringBuilder)object3).append(",");
                    ((StringBuilder)object3).append(l8.a);
                    ((StringBuilder)object3).append(",root:");
                    ((StringBuilder)object3).append(object2);
                    ((ax.Ha.b)object).g(((StringBuilder)object3).toString()).h();
                    throw new ax.b3.j("path conflict");
                }
            }
            if (object4 == null) {
                ax.Ha.b b8 = ax.Ha.c.h().b("LOCAL DOCUMENT FILE PATH NULL");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("file:");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append(l8.b);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(",");
                ((StringBuilder)charSequence).append((String)object4);
                b8.g(((StringBuilder)charSequence).toString()).h();
            }
            this.B0 = object2;
            this.n0 = new File((String)object4);
            this.p0 = object4;
            this.y0 = l8.d();
            this.s0 = Boolean.FALSE;
            this.z0 = l8.b();
            this.A0 = l8.a();
            this.t0 = l8.d;
            this.v0 = l8.e;
            this.I0 = object3;
            if (object3 == null) {
                this.u0();
            }
            this.N0 = "constructor 3";
            return;
        }
        object = ax.Ha.c.h().b("invalid file local document file path");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("parentPath:");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(",docId:");
        ((StringBuilder)object2).append(l8.a);
        ((ax.Ha.b)object).g(((StringBuilder)object2).toString());
        throw new ax.b3.j("path problem");
    }

    public y(x x8, ax.c3.K k8, ax.p3.a a8) {
        super(x8);
        this.m0 = x8;
        this.O0 = true;
        this.n0 = new File(a8.q);
        this.y0 = a8.e0;
        this.s0 = a8.f0;
        this.A0 = a8.g0;
        this.z0 = a8.h0;
        this.v0 = a8.i0;
        this.t0 = a8.j0;
        this.x0 = a8.d0;
        this.r0 = a8.c0;
        this.p0 = a8.q;
        this.I0 = k8;
        if (k8 == null) {
            this.u0();
        }
    }

    public y(x object, y y8) {
        super((m)object);
        this.m0 = object;
        this.B0 = y8.B0;
        this.n0 = y8.n0;
        this.p0 = y8.p0;
        this.y0 = y8.y0;
        this.s0 = y8.s0;
        this.A0 = y8.A0;
        this.z0 = y8.z0;
        this.v0 = y8.v0;
        this.t0 = y8.t0;
        this.I0 = object = y8.I0;
        this.O0 = y8.O0;
        this.P0 = y8.P0;
        this.q0 = y8.q0;
        this.u0 = y8.u0;
        if (object == null) {
            this.u0();
        }
        this.N0 = "constructor 2";
    }

    public y(x x8, File file, ax.c3.K k8) {
        this(x8, file, k8, false);
    }

    public y(x object, File file, ax.c3.K k8, boolean bl) {
        super((m)object);
        this.m0 = object;
        ax.u3.b.b(file);
        this.n0 = file;
        this.P0 = bl;
        object = file.getAbsolutePath();
        if (bl) {
            this.p0 = I.f((String)object);
            this.q0 = object;
        } else {
            this.p0 = object;
            this.q0 = object;
        }
        this.I0 = k8;
        if (k8 == null) {
            this.u0();
        }
        this.N0 = "constructor 1";
    }

    public y(x x8, File file, ax.c3.K k8, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l8, long l9) {
        this(x8, file, k8);
        this.y0 = bl;
        this.s0 = bl2;
        this.A0 = bl3;
        this.z0 = bl4;
        this.v0 = l8;
        this.t0 = l9;
    }

    public y(x x8, File file, File file2, ax.c3.K k8, boolean bl) {
        this(x8, file2, k8, bl);
        this.M0 = file;
    }

    private void A0() {
        if (this.t0 == 0L && this.P() == f.t0 && !this.F0().exists() && this.n0()) {
            this.t0 = z.Y().n(this.E());
        }
    }

    public static y I0(String string) throws ax.b3.j {
        return (y)ax.c3.x.g(string).z(string);
    }

    private static int J0(String string) {
        int n8;
        int n9 = 0;
        if (string == null) {
            return 0;
        }
        int n10 = string.length();
        int n11 = 1;
        if (n10 == 0) {
            return 1;
        }
        for (n8 = n10; n8 > 0 && string.charAt(n8 - 1) == d0.b; --n8) {
        }
        if (n8 == 0) {
            return 0;
        }
        while (n9 < n8) {
            n10 = n11;
            if (string.charAt(n9) == d0.b) {
                n10 = n11 + 1;
            }
            ++n9;
            n11 = n10;
        }
        return n11;
    }

    private static String L0(String string, String string2) {
        int n8;
        int n9;
        int n10 = string2.length();
        if (string.length() > n10 && (n9 = string.charAt(n10)) == (n8 = d0.b)) {
            n9 = n10 + 1;
            if (string.length() <= n9) {
                return null;
            }
            if ((n8 = string.indexOf(n8, n9)) < 0) {
                return string;
            }
            return string.substring(0, n8);
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean Q0() {
        boolean bl = false;
        j.Path path = j.FileRetargetClass.toPath((File)this.F0()).toAbsolutePath();
        if (!j.Files.isDirectory((j.Path)path, (j.LinkOption[])new j.LinkOption[0])) return false;
        DirectoryStream directoryStream = j.Files.newDirectoryStream((j.Path)path);
        boolean bl2 = directoryStream.iterator().hasNext();
        directoryStream.close();
        return bl2;
        catch (Throwable throwable) {
            if (directoryStream == null) throw throwable;
            try {
                directoryStream.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (IOException | DirectoryIteratorException exception) {}
            }
        }
        if (this.r(true) <= 0) return bl;
        return true;
    }

    private boolean R0() {
        if (!Q.V1()) {
            return false;
        }
        if (this.P() == f.o0) {
            return false;
        }
        if (!this.i0()) {
            return false;
        }
        if (this.v0 == null) {
            this.p();
        }
        return this.n0.length() == 0L && this.v0 != 0L;
    }

    public static boolean U0(ax.c3.K k8, String string) {
        return y.J0(d0.v(k8, string, Boolean.TRUE)) == 3;
    }

    public static boolean Y0(String string) {
        return d0.G("/Android", string) || d0.G("/Android/obb", string) || d0.G("/Android/data", string);
        {
        }
    }

    public static boolean c1(y y8, y y9) {
        if (y8.B0() != y9.B0()) {
            return false;
        }
        return !f.Q(y8.B0()) || y8.P0() == y9.P0();
    }

    private boolean e1() {
        String string = this.p0;
        return string != null && string.equals("/");
    }

    static /* synthetic */ boolean l0(y y8, boolean bl) {
        y8.J0 = bl;
        return bl;
    }

    private boolean n0() {
        return ax.t3.j.k(this.x()) && j.F().q0();
    }

    private void n1(L object, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (((L)object).e) {
            if (bl3) {
                this.v0 = ((L)object).a;
            }
            if (bl) {
                this.y0 = ((L)object).b;
            }
            if (bl2) {
                this.t0 = ((L)object).c;
            }
            if (bl4) {
                this.x0 = Boolean.TRUE;
            }
            this.w0 = Boolean.TRUE;
            return;
        }
        if (bl4) {
            this.x0 = Boolean.FALSE;
        }
        this.w0 = object = Boolean.FALSE;
        if (bl3) {
            this.v0 = 0L;
        }
        if (bl2) {
            this.t0 = 0L;
        }
        if (bl && this.y0 == null) {
            this.y0 = object;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean p0(boolean bl, boolean bl2) {
        Object object;
        block40: {
            block42: {
                Object object2;
                Object object3;
                Object object4;
                boolean bl3;
                block38: {
                    ax.b3.j j8222222;
                    block39: {
                        block37: {
                            boolean bl4;
                            block41: {
                                block36: {
                                    block34: {
                                        block35: {
                                            t t8222222;
                                            boolean bl5 = this.e1();
                                            bl3 = true;
                                            if (bl5) {
                                                return true;
                                            }
                                            if (Q.P1()) {
                                                object4 = this.w0;
                                                if (object4 != null && !bl2) {
                                                    bl2 = (Boolean)object4;
                                                } else {
                                                    try {
                                                        bl2 = this.O0().e;
                                                        this.w0 = bl2;
                                                    }
                                                    catch (Exception exception) {
                                                        bl2 = this.n0.exists();
                                                    }
                                                }
                                            } else {
                                                bl2 = this.n0.exists();
                                            }
                                            bl5 = this.i0();
                                            object3 = null;
                                            object = null;
                                            object4 = object2 = null;
                                            if (!bl5) break block34;
                                            if (bl && bl2) {
                                                object4 = object2;
                                            } else {
                                                try {
                                                    object4 = this.s1();
                                                    break block34;
                                                }
                                                catch (Exception exception) {
                                                }
                                                catch (t t8222222) {
                                                }
                                                catch (C c8) {
                                                    break block35;
                                                }
                                                catch (r r8) {
                                                    object4 = object2;
                                                    break block34;
                                                }
                                                catch (ax.b3.p p8) {
                                                    break block36;
                                                }
                                                exception.printStackTrace();
                                                object4 = this.R().e();
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append("exist:");
                                                ((StringBuilder)object).append(this.n0.exists());
                                                ((StringBuilder)object).append(",root:");
                                                ((StringBuilder)object).append((String)object4);
                                                object4 = object = ((StringBuilder)object).toString();
                                                if (this.P() != null) {
                                                    object4 = new StringBuilder();
                                                    ((StringBuilder)object4).append((String)object);
                                                    ((StringBuilder)object4).append(",loc:");
                                                    ((StringBuilder)object4).append(this.P().toString());
                                                    object4 = ((StringBuilder)object4).toString();
                                                }
                                                object = object4;
                                                if (this.B0() != null) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append((String)object4);
                                                    ((StringBuilder)object).append(",base:");
                                                    ((StringBuilder)object).append(this.B0().k());
                                                    object = ((StringBuilder)object).toString();
                                                }
                                                ax.Ha.c.h().f().d("SDCARD EXISTS UNKNOWN").l(exception).g(object).h();
                                                object4 = object2;
                                            }
                                            break block34;
                                            catch (ax.b3.v v8) {
                                                object4 = object3;
                                                try {
                                                    object4 = object = Boolean.valueOf(this.s1());
                                                    object2 = ax.Ha.c.h().f().d("SDCARD EXIST RETRY SUCCESS");
                                                    object4 = object;
                                                    object4 = object;
                                                    object3 = new StringBuilder();
                                                    object4 = object;
                                                    ((StringBuilder)object3).append("exist:");
                                                    object4 = object;
                                                    ((StringBuilder)object3).append(this.n0.exists());
                                                    object4 = object;
                                                    ((ax.Ha.b)object2).g(((StringBuilder)object3).toString()).h();
                                                    object4 = object;
                                                }
                                                catch (Exception exception) {
                                                    object2 = ax.Ha.c.h().f().d("SDCARD EXIST RETRY ERROR").l(exception);
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append("exist:");
                                                    ((StringBuilder)object).append(this.n0.exists());
                                                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                                                }
                                                break block34;
                                            }
                                            object4 = ax.Ha.c.h().f().d("SDCARD FILE NOT EXIST").l(t8222222);
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("exist:");
                                            ((StringBuilder)object).append(this.n0.exists());
                                            ((ax.Ha.b)object4).g(((StringBuilder)object).toString()).h();
                                            object4 = object2;
                                            break block34;
                                        }
                                        if (Build.VERSION.SDK_INT < 23) break block36;
                                        object3 = this.B0().e();
                                        object4 = object2;
                                        if (object3 == null) break block34;
                                        String string = e.E(this.x(), (String)object3);
                                        object4 = object2;
                                        if (K.N(string)) break block34;
                                        object4 = object2;
                                        if (K.K(string)) break block34;
                                        object4 = object2;
                                        if (string == null) break block34;
                                        object4 = ax.Ha.c.h().f().b("CLEAR ROOT URI OVER 23");
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("location:");
                                        ((StringBuilder)object2).append(this.R().d().I());
                                        ((StringBuilder)object2).append(",base:");
                                        ((StringBuilder)object2).append(this.B0());
                                        ((StringBuilder)object2).append(",path:");
                                        ((StringBuilder)object2).append((String)object3);
                                        ((StringBuilder)object2).append(",exist:");
                                        ((StringBuilder)object2).append(this.n0.exists());
                                        ((ax.Ha.b)object4).g(((StringBuilder)object2).toString()).h();
                                        break block36;
                                    }
                                    bl4 = false;
                                    break block41;
                                }
                                bl4 = true;
                                object4 = object;
                            }
                            object2 = this.M0();
                            if (object4 == null) {
                                if (bl2 && bl4 && d0.E(this) && (object4 = this.n0.list()) != null && ((String[])object4).length > 0) {
                                    g.b(this.x(), this.B0(), (String)object2);
                                    object = ax.Ha.c.h().f().d("CLEARING ROOT URI");
                                    object4 = new StringBuilder();
                                    ((StringBuilder)object4).append(this.n0.getAbsolutePath());
                                    ((StringBuilder)object4).append(",");
                                    ((StringBuilder)object4).append(this.B0().toString());
                                    ((ax.Ha.b)object).g(((StringBuilder)object4).toString()).h();
                                }
                                bl = bl2;
                                if (!bl2) {
                                    if (this.d1()) {
                                        try {
                                            bl = c.t().y((String)this.p0).e;
                                        }
                                        catch (IOException iOException) {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("?");
                                            stringBuilder.append(bl2);
                                            ax.u3.b.e(stringBuilder.toString());
                                            bl = bl2;
                                        }
                                    } else {
                                        bl = bl2;
                                        if (this.P() == f.t0) {
                                            bl = bl2;
                                            if (this.n0()) {
                                                bl = z.Y().m(this.E());
                                            }
                                        }
                                    }
                                }
                                object = bl;
                                return (Boolean)object;
                            }
                            object = object4;
                            if (((Boolean)object4).booleanValue()) return (Boolean)object;
                            object = object4;
                            if (!bl2) return (Boolean)object;
                            object = object4;
                            if (!d0.E(this)) return (Boolean)object;
                            if (!this.n0.isDirectory()) break block42;
                            try {
                                if (!g.l(this).toString().contains(this.n0.getName())) break block37;
                                object4 = "URI HAS NAME";
                                break block38;
                            }
                            catch (ax.b3.j j8222222) {
                                break block39;
                            }
                        }
                        object4 = "URI DO NOT HAVE NAME";
                        break block38;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("EX:");
                    ((StringBuilder)object).append(j8222222.getMessage());
                    object4 = ((StringBuilder)object).toString();
                }
                object = this.n0.list();
                if (object != null && ((Object)object).length > 0) {
                    g.b(this.x(), this.B0(), (String)object2);
                    ax.Ha.c.h().f().d("SDCARD HAS CHANGED. CLEARING ROOT URI").g(object4).h();
                    break block40;
                } else {
                    object3 = ax.Ha.c.h().f().d("SDCARD COULD NOT ACCESS ROOT");
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object4);
                    ((StringBuilder)object2).append(",not null:");
                    bl = object != null ? bl3 : false;
                    ((StringBuilder)object2).append(bl);
                    ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
                }
                break block40;
            }
            ax.Ha.c.h().f().d("SDCARD NOT DIRECTORY?!").g(this.n0.getAbsolutePath()).h();
        }
        object = Boolean.TRUE;
        return (Boolean)object;
    }

    private void p1() {
        this.y0 = this.n0.isDirectory();
        this.z0();
    }

    private boolean s1() throws ax.b3.j {
        Object object = g.j(this.x(), this);
        if (object != null) {
            this.v0 = ((l)object).e;
            this.A0 = ((l)object).a();
            this.z0 = ((l)object).b();
            this.y0 = ((l)object).d();
            this.t0 = ((l)object).d;
            return true;
        }
        this.v0 = 0L;
        this.A0 = object = Boolean.FALSE;
        this.z0 = object;
        return false;
    }

    private void u0() {
        if (!d0.B(this.p0)) {
            ax.Ha.b b8 = ax.Ha.c.h().b("GLFLFI 2:").f().j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location:");
            stringBuilder.append((Object)this.P());
            stringBuilder.append(",path:");
            stringBuilder.append(this.p0);
            stringBuilder.append(",name:");
            stringBuilder.append(this.n0.getName());
            stringBuilder.append(",");
            stringBuilder.append(this.n0.getAbsolutePath());
            b8.g(stringBuilder.toString()).h();
            this.I0 = this.R();
            return;
        }
        this.I0 = j.F().J(this.n0.getAbsolutePath(), this.R());
    }

    private void u1(boolean bl, boolean bl2, boolean bl3, boolean bl4) throws IOException {
        L l8 = this.d1() ? c.t().y(this.E()) : this.O0();
        this.n1(l8, bl, bl2, bl3, bl4);
    }

    private void v0() {
        this.o0 = v.e(this, "application/octet-stream");
    }

    private void w1() {
        this.t0 = this.n0.lastModified();
        this.A0();
    }

    private void y0() {
        if (this.v0 == 0L && !this.isDirectory()) {
            if (Q.H() && this.i0()) {
                try {
                    this.s1();
                    this.v0.longValue();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (this.v0 == 0L && this.P() == f.t0 && !this.F0().exists() && this.n0()) {
                this.v0 = z.Y().s(this.E());
            }
        }
    }

    private void y1() {
        try {
            this.v0 = this.n0.length();
            this.y0();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.v0 = -1L;
            return;
        }
    }

    private void z0() {
        if (Q.G() && this.R() == ax.c3.K.f && this.a1()) {
            if (!this.y0.booleanValue()) {
                this.q1();
                return;
            }
        } else if (!this.y0.booleanValue() && this.P() == f.t0 && !this.n0.exists() && this.n0()) {
            this.y0 = z.Y().K(this.E());
        }
    }

    public ax.c3.K B0() {
        if (this.I0 == null) {
            this.u0();
            ax.Ha.b b8 = ax.Ha.c.h().b("BASE LOCATION UNIT NULL 2");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loc:");
            stringBuilder.append(this.R());
            stringBuilder.append(",path:");
            stringBuilder.append(this.F());
            stringBuilder.append(",constructor:");
            stringBuilder.append(this.N0);
            stringBuilder.append(",retry:");
            boolean bl = this.I0 != null;
            stringBuilder.append(bl);
            b8.g(stringBuilder.toString()).h();
            if (this.I0 == null) {
                this.I0 = this.R();
            }
        }
        return this.I0;
    }

    @Override
    public String C() {
        if (this.r0 == null) {
            this.r0 = this.n0.getName();
        }
        return this.r0;
    }

    public String C0() {
        if (this.H0 == null) {
            if (f.g0(this.B0().d())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("library:?");
                stringBuilder.append(this.B0());
                ax.u3.b.e(stringBuilder.toString());
                this.H0 = d0.v(this.B0(), this.E(), this.isDirectory());
            } else {
                this.H0 = d0.v(this.B0(), this.E(), null);
            }
        }
        return this.H0;
    }

    @Override
    public p D() {
        if (this.R() != ax.c3.K.h) {
            return null;
        }
        if (j.F().q()) {
            return z.Y().o(this.E());
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long D0() {
        block15: {
            block14: {
                if (this.u0 != null) break block15;
                if (!this.isDirectory()) {
                    Long l8;
                    a a8;
                    block13: {
                        block12: {
                            if (a.S(this.s())) {
                                a8 = new a(this.E());
                                this.u0 = a8.o();
                                break block12;
                            }
                            this.G();
                            ax.c3.z z8 = ax.c3.z.c0;
                            break block14;
                            catch (Exception exception) {}
                        }
                        try {
                            l8 = this.u0;
                            if (l8 != null) break block13;
                        }
                        catch (IOException | Exception exception) {}
                        try {
                            this.u0 = a8.n();
                        }
                        catch (Exception exception) {}
                    }
                    l8 = this.u0;
                    if (l8 != null) break block14;
                    this.u0 = a8.m();
                }
            }
            if (this.u0 == null) {
                this.u0 = this.q();
            }
        }
        return this.u0;
    }

    public String E0() {
        f f8 = this.P();
        if (f8 == f.z0) {
            if (!this.isDirectory()) {
                return this.f0();
            }
            return "";
        }
        if (f8 != f.B0 && f8 != f.A0) {
            return this.V();
        }
        if (!this.isDirectory()) {
            return this.g0();
        }
        return "";
    }

    @Override
    public String F() {
        return this.p0;
    }

    public File F0() {
        return this.n0;
    }

    public String G0(int n8) {
        this.u(n8);
        String string = this.Q0;
        if (string != null) {
            return string;
        }
        this.Q0 = string = this.w(this.D0(), n8);
        return string;
    }

    public b H0() {
        return this.L0;
    }

    public String K0() {
        if (this.q0 == null) {
            this.q0 = this.n0.getAbsolutePath();
        }
        return this.q0;
    }

    public String M0() {
        if (f.Q(this.B0()) && this.a1()) {
            return this.G0;
        }
        return null;
    }

    @Override
    public File N() {
        return this.F0();
    }

    public Uri N0() throws r {
        if (this.B0 == null && Q.V1()) {
            String string;
            boolean bl = this.a1();
            Object var3_2 = null;
            if (bl) {
                if (j.F().E0(this.B0())) {
                    String string2 = this.M0();
                    string = var3_2;
                    if (string2 != null) {
                        if (string2.length() < 14) {
                            string = var3_2;
                        } else {
                            string2 = g.n(this.B0(), string2);
                            string = var3_2;
                            if (string2 != null) {
                                string = var3_2;
                                if (g.a(this.x(), (Uri)string2)) {
                                    string = string2.toString();
                                }
                            }
                        }
                    }
                } else {
                    string = g.x(this.x(), this.B0(), this.M0());
                }
            } else {
                string = g.x(this.x(), this.B0(), null);
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.B0 = Uri.parse((String)string);
            } else {
                throw new r("RootUri is empty");
            }
        }
        return this.B0;
    }

    public L O0() throws IOException {
        return ax.X2.v.l(this.K0(), new L());
    }

    public int P0() {
        if (this.F0 == 0) {
            String string;
            String string2;
            this.F0 = !Q.L() ? 1 : (!f.Q(this.B0()) ? 1 : (j.F().E0(this.B0()) ? ((string2 = this.M0()) == null ? 1 : (d0.H("/Android/data", string2) ? string2.hashCode() + 0x10000000 : (d0.H("/Android/obb", string2) ? string2.hashCode() + 0x20000000 : 1))) : (d0.H("/Android/data", string = this.C0()) ? 0x10000000 : (d0.H("/Android/obb", string) ? 0x20000000 : 1))));
        }
        return this.F0;
    }

    public boolean S0() {
        return this.J0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean T0() {
        boolean bl = false;
        try {
            Uri uri = this.N0();
            if (uri == null) return bl;
            return true;
        }
        catch (r r8) {
            return bl;
        }
    }

    @Override
    public String U() {
        return d0.r(this.p0);
    }

    public boolean V0() {
        String string = this.C0();
        if (string != null) {
            if (!d0.B(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid path 2: ");
                stringBuilder.append(string);
                stringBuilder.append(":");
                stringBuilder.append(this.F());
                d.c("ISFP2", new Exception(stringBuilder.toString()));
            }
            return d0.G("/Android", string);
        }
        return false;
    }

    public boolean W0() {
        if (this.isDirectory()) {
            return this.X() != -1 && this.X() != -3;
        }
        return this.v0 != null;
    }

    public boolean X0() {
        return this.I0.d() == f.p0;
    }

    public boolean Z0() {
        if (this.E0 == null) {
            if (!this.a1()) {
                this.E0 = Boolean.FALSE;
            } else {
                boolean bl = y.J0(this.C0()) == 4;
                this.E0 = bl;
            }
        }
        return this.E0;
    }

    @Override
    public boolean a0() {
        if (this.X() >= 0) {
            return this.X() > 0;
        }
        if (Q.P0()) {
            return this.Q0();
        }
        return super.a0();
    }

    public boolean a1() {
        if (this.C0 == null) {
            String string;
            if (Q.L() && f.R(this.B0()) && (string = this.C0()) != null) {
                Object object;
                if (d0.H("/Android/data", string)) {
                    if (!d0.I("/Android/data/com.voxdon.xplorer", string)) {
                        this.C0 = Boolean.TRUE;
                        this.G0 = "/Android/data";
                    }
                } else if (d0.H("/Android/obb", string) && !d0.I("/Android/obb/com.voxdon.xplorer", string)) {
                    this.C0 = Boolean.TRUE;
                    this.G0 = "/Android/obb";
                }
                if ((object = this.C0) != null && ((Boolean)object).booleanValue() && j.F().E0(this.B0()) && (object = y.L0(string, this.G0)) != null) {
                    this.G0 = object;
                }
            }
            if (this.C0 == null) {
                this.C0 = Boolean.FALSE;
            }
        }
        return this.C0;
    }

    public boolean b1() {
        if (this.D0 == null) {
            if (!this.a1()) {
                this.D0 = Boolean.FALSE;
            } else {
                boolean bl = y.J0(this.C0()) == 3;
                this.D0 = bl;
            }
        }
        return this.D0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean d() {
        Boolean bl;
        if (this.A0 != null) return this.A0;
        this.A0 = bl = Boolean.valueOf(this.n0.canRead());
        if (bl != false) return this.A0;
        if (!this.i0()) return this.A0;
        if (j.F().E0(this.B0()) && this.b1()) {
            return true;
        }
        try {
            this.s1();
            return this.A0;
        }
        catch (Exception exception) {
            ax.Ha.c.h().f().d("DOCUMENT FILE CANREAD").l(exception).g(this.P().I()).h();
            return this.A0;
        }
        catch (r r8) {
            return this.A0;
        }
    }

    public boolean d1() {
        return this.O0;
    }

    @Override
    public ParcelFileDescriptor e0(boolean bl) throws ax.b3.j {
        Uri uri = g.e(this.B0(), this.N0(), this.E());
        if (bl) {
            return g.o(this.x(), uri, "r");
        }
        return g.o(this.x(), uri, "rw");
    }

    public boolean f1() {
        return this.P0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g1(boolean bl) {
        if (this.X() != -1) return;
        try {
            int n8;
            if (this.d1() && (n8 = c.t().u(this.E(), bl)) != -2) {
                this.d0(n8);
                return;
            }
            Object object = this.n0;
            FilenameFilter filenameFilter = new FilenameFilter(){
                final y c0;
                final boolean q;
                {
                    this.c0 = y8;
                    this.q = bl;
                }

                @Override
                public boolean accept(File file, String string) {
                    if (string != null) {
                        boolean bl = string.startsWith(".");
                        if (bl) {
                            y.l0(this.c0, true);
                        }
                        if (this.q ? J.k2(string) : bl) {
                            return false;
                        }
                    }
                    return true;
                }
            };
            if ((object = ((File)object).list(filenameFilter)) != null) {
                this.d0(((String[])object).length);
                return;
            }
            if ((this.P() == f.t0 || this.a1()) && this.n0()) {
                n8 = z.Y().C(this.E(), bl);
                if (n8 < 0) {
                    this.d0(-2);
                    return;
                }
                this.d0(n8);
                return;
            }
            bl = this.m0();
            if (!bl) {
                this.d0(-2);
                return;
            }
            try {
                object = g.J(this.m0, this);
                if (object != null) {
                    this.d0(object.size());
                    return;
                }
                this.d0(-2);
                return;
            }
            catch (NullPointerException nullPointerException) {
                filenameFilter = new StringBuilder();
                ((StringBuilder)((Object)filenameFilter)).append("NullPointer helper==null:");
                bl = this.m0 == null;
                ((StringBuilder)((Object)filenameFilter)).append(bl);
                ((StringBuilder)((Object)filenameFilter)).append(",");
                ((StringBuilder)((Object)filenameFilter)).append(this.R().k());
                Exception exception = new Exception(((StringBuilder)((Object)filenameFilter)).toString());
                d.c("HELPERNULL", exception);
                this.d0(-2);
                return;
            }
            catch (ax.b3.j j8) {
                this.d0(-2);
                return;
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.d0(-2);
        }
    }

    @Override
    public boolean h() {
        if (this.K0 == null) {
            this.K0 = this.C().startsWith(".");
        }
        return this.K0;
    }

    public boolean h1(boolean bl) {
        if (!Q.V1()) {
            return false;
        }
        if (this.o0()) {
            return false;
        }
        if (this.f1()) {
            return false;
        }
        ax.c3.K k8 = this.B0();
        if (k8 == ax.c3.K.e) {
            return this.a1();
        }
        if (k8 == ax.c3.K.f) {
            if (j.F().j0(k8)) {
                return this.a1();
            }
            if (bl) {
                return true;
            }
            return this.a1();
        }
        return j.F().j0(k8) ^ true;
    }

    @Override
    public boolean i0() {
        return this.h1(true);
    }

    public void i1(long l8) {
        this.u0 = l8;
    }

    @Override
    public boolean isDirectory() {
        if (this.y0 == null) {
            Boolean bl = this.x0;
            if (bl != null && !bl.booleanValue()) {
                return false;
            }
            if (this.e1()) {
                this.y0 = Boolean.TRUE;
            } else {
                if (Q.P1()) {
                    try {
                        this.t1();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (this.y0 == null) {
                    this.p1();
                }
            }
        }
        return this.y0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean j() {
        Boolean bl;
        if (this.z0 != null) return this.z0;
        this.z0 = bl = Boolean.valueOf(this.n0.canWrite());
        if (bl != false) return this.z0;
        if (!this.i0()) return this.z0;
        try {
            this.s1();
            return this.z0;
        }
        catch (Exception exception) {
            ax.Ha.b b8 = ax.Ha.c.h().f().d("DOCUMENT FILE CANWRITE").l(exception);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loc:");
            stringBuilder.append(this.R().toString());
            b8.g(stringBuilder.toString()).h();
            return this.z0;
        }
        catch (r r8) {
            return this.z0;
        }
    }

    @Override
    public boolean j0() {
        return Q.F1() && this.d1();
    }

    public void j1(boolean bl) {
        this.x0 = bl;
    }

    @Override
    public boolean k0() {
        if (!this.m0()) {
            return false;
        }
        if (this.B0() == ax.c3.K.e) {
            return this.a1();
        }
        return this.R0();
    }

    public void k1(b b8) {
        boolean bl = b8 != b.q;
        this.K0 = bl;
        this.L0 = b8;
    }

    @Override
    public boolean l() {
        if (this.s0 == null) {
            if (this.P() == f.t0) {
                try {
                    this.s0 = B.R(this.n0);
                }
                catch (IOException iOException) {
                    this.s0 = Boolean.FALSE;
                }
            } else {
                this.s0 = Boolean.FALSE;
            }
        }
        return this.s0;
    }

    public void l1(boolean bl) {
        this.O0 = bl;
    }

    public boolean m0() {
        if (!this.i0()) {
            return false;
        }
        if (ax.X2.J.l() && ax.X2.J.C(this.B0())) {
            return false;
        }
        return this.T0();
    }

    public void m1(long l8) {
        this.t0 = l8;
    }

    @Override
    public boolean n() {
        if (this.x0 == null) {
            this.q1();
        }
        return this.x0;
    }

    public boolean o0() {
        return Q.a2() && j.F().q() && this.R() == ax.c3.K.h;
    }

    public boolean o1() {
        return false;
    }

    @Override
    public long p() {
        if (this.v0 == null) {
            if (Q.P1()) {
                try {
                    this.t1();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (this.v0 == null) {
                this.y1();
            }
        }
        return this.v0;
    }

    @Override
    public long q() {
        if (this.t0 == null) {
            this.v1();
        }
        return this.t0;
    }

    public boolean q0() {
        Long l8 = this.t0;
        if (l8 == null) {
            this.v1();
            return false;
        }
        long l9 = l8;
        this.v1();
        return this.t0 != l9;
    }

    public void q1() {
        this.x0 = this.p0(false, true);
    }

    @Override
    public int r(boolean bl) {
        this.g1(bl);
        return this.X();
    }

    public void r0() {
        this.t0 = null;
    }

    public void r1() {
        Boolean bl = this.w0;
        if (bl != null) {
            this.x0 = bl;
            return;
        }
        this.x0 = this.p0(true, false);
    }

    @Override
    public String s() {
        if (this.o0 == null) {
            this.v0();
        }
        return this.o0;
    }

    public int s0(n n8) {
        if (n8 == null) {
            return -1;
        }
        try {
            int n9 = this.n0.compareTo(((y)n8).n0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    @Override
    public String t() {
        return this.n0.getAbsolutePath();
    }

    public void t0(y y8) {
        this.C0 = y8.C0;
        this.G0 = y8.G0;
    }

    public void t1() throws IOException {
        this.u1(true, true, true, false);
        this.z0();
        this.A0();
        this.y0();
    }

    @Override
    protected boolean u(int n8) {
        boolean bl = super.u(n8);
        if (bl) {
            this.Q0 = null;
        }
        return bl;
    }

    public void v1() {
        if (Q.P1()) {
            try {
                this.t1();
                return;
            }
            catch (IOException iOException) {
                this.w1();
                return;
            }
        }
        this.w1();
    }

    public boolean w0() {
        if (this.x0 == null) {
            this.r1();
        }
        return this.x0;
    }

    public boolean x0() {
        return this.n0.exists();
    }

    public Uri x1() throws r {
        this.B0 = null;
        return this.N0();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        private static final b[] j0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = new b();
            g0 = new b();
            h0 = new b();
            i0 = new b();
            j0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0, f0, g0, h0, i0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])j0.clone();
        }
    }
}

