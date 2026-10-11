/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Sc.c;
import ax.Sc.l;
import ax.Sc.t;
import ax.Sc.u;
import ax.Uc.a;
import ax.Z2.b;
import ax.Z2.s;
import ax.b3.K;
import ax.c3.D;
import ax.c3.F;
import ax.c3.G;
import ax.c3.H;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.i0;
import ax.c3.x;
import ax.u3.B;
import ax.u3.q;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.p;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

public class q
extends m
implements i0 {
    private static final Logger u = Logger.getLogger("FileManager.FtpFileHelper");
    static g v;
    private static int w;
    private static int x;
    private static int y;
    private SimpleDateFormat h;
    private d i;
    private ax.Sc.e j;
    private final Object k = new Object();
    private e l;
    private String m;
    private String n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t = false;

    static {
        w = 0;
        x = 1;
        y = 2;
    }

    protected static void A0(Context context) {
        if (com.alphainventor.filemanager.file.q.G0()) {
            com.alphainventor.filemanager.file.m.X(context);
        }
    }

    private boolean C0(int n8) {
        return ax.Sc.t.a(n8) || ax.Sc.t.b(n8);
        {
        }
    }

    public static boolean D0(int n8) {
        return n8 >= 100000000;
    }

    private static boolean G0() {
        return Build.VERSION.SDK_INT > 28;
    }

    public static ax.Sc.i H0(String object, String object2) throws IOException {
        Object object3 = object;
        if (((String)object).charAt(0) != ' ') {
            object3 = ((String)object).toLowerCase(Locale.ROOT);
            if (((String)object).startsWith("250-modify")) {
                return ax.Tc.g.g(((String)object).substring(4));
            }
            if (((String)object3).startsWith("250 end")) {
                return null;
            }
            object3 = object;
            if (((String)object).length() >= 2) {
                object3 = object;
                if (((String)object).endsWith("; ")) {
                    object3 = object;
                    if (((String)object).startsWith("Size=")) {
                        object3 = object;
                        if ("/".equals(object2)) {
                            String[] stringArray = ((String)object).split(" ", 2);
                            object3 = object;
                            if (stringArray.length == 2) {
                                object3 = object;
                                if (stringArray[1].length() == 0) {
                                    object3 = new StringBuilder();
                                    ((StringBuilder)object3).append((String)object);
                                    ((StringBuilder)object3).append((String)object2);
                                    object3 = ((StringBuilder)object3).toString();
                                }
                            }
                        }
                    }
                }
                if ((object = ax.Tc.g.g((String)object3)) != null) {
                    return object;
                }
            }
        }
        if (((String)object3).equals(" /") && "/".equals(object2)) {
            object = new ax.Sc.i();
            ((ax.Sc.i)object).q(1);
            ((ax.Sc.i)object).l((String)object2);
            object2 = Calendar.getInstance();
            ((Calendar)object2).setTimeInMillis(0L);
            ((ax.Sc.i)object).n((String)object3);
            ((ax.Sc.i)object).p((Calendar)object2);
            return object;
        }
        object = object3;
        if (((String)object3).charAt(0) != ' ') {
            object = new StringBuilder();
            ((StringBuilder)object).append(" ");
            ((StringBuilder)object).append((String)object3);
            object = ((StringBuilder)object).toString();
        }
        if (((String)object).length() >= 3) {
            return ax.Tc.g.g(((String)object).replaceAll("^\\s+", ""));
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid server reply (MLST): '");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("'");
        throw new ax.Rc.a(((StringBuilder)object2).toString());
    }

    private void I0() {
        this.b();
        this.o0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean L0(ax.Sc.e e8, n n8, long l8, boolean bl) {
        if (l8 <= 0L) return false;
        try {
            if (!this.O0()) return false;
            if (!e8.w()) return false;
            if (bl) {
                e8.X(n8.E(), this.y0(l8));
                return true;
            }
            e8.X(n8.B(), this.y0(l8));
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean N0() {
        return this.s != x;
    }

    private boolean O0() throws IOException {
        return this.j.Z0("MFMT");
    }

    private boolean P0() throws IOException {
        return this.j.Z0("MLSD") || this.j.Z0("MLST");
        {
        }
    }

    private boolean Q0() throws IOException {
        return this.j.Z0("MLST");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void R0() {
        var4_1 = this.k;
        synchronized (var4_1) {
            try {
                var3_2 = this.a();
                var2_3 = true;
                var1_4 = !var3_2 || !this.j.v();
                // MONITOREXIT @DISABLED, blocks:[0, 4] lbl7 : MonitorExitStatement: MONITOREXIT : var4_1
                if (var1_4) {
                    this.o0();
                    return;
                }
                var4_1 = this.k;
            }
            catch (Throwable var5_5) {
                ** break block11
            }
        }
        synchronized (var4_1) {
            var3_2 = this.j.v1();
            var1_4 = true ^ var3_2;
            ** GOTO lbl25
            {
                catch (Throwable var5_6) {
                }
                catch (IOException var5_7) {}
                {
                    var5_7.printStackTrace();
                    var1_4 = var2_3;
lbl25:
                    // 2 sources

                    if (var1_4) {
                        this.I0();
                    }
                    return;
                }
            }
            throw var5_6;
        }
lbl-1000:
        // 1 sources

        {
            throw var5_5;
        }
    }

    private void o0() {
        try {
            d d8 = new d(this.p(), this, this.t(), null);
            d8.h(new Object[0]).l();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private boolean p0(String string) throws IOException {
        if (string.equals(this.n)) {
            return true;
        }
        return ax.Sc.t.c(this.q0(this.j, string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int q0(ax.Sc.e e8, String string) throws IOException {
        boolean bl = e8.B0(d0.O(string));
        int n8 = e8.R();
        if (bl) {
            if (e8 != this.j) return n8;
            this.n = string;
            return n8;
        }
        if (n8 != 550) return n8;
        if (!"/".equals(string)) return n8;
        try {
            do {
                if ((string = e8.q1()) == null) {
                    return n8;
                }
                if (!"/".equals(string)) continue;
                return 250;
            } while (bl = ax.Sc.t.c(e8.I()));
            return n8;
        }
        catch (IOException iOException) {
            return n8;
        }
    }

    private boolean r0(String string) throws IOException {
        if ("/".equals(string)) {
            return true;
        }
        return string != null && string.equals(this.m) && ax.Sc.t.c(this.q0(this.j, string));
    }

    private ax.b3.j s0(String string, IOException iOException) {
        if (iOException instanceof ax.Sc.h) {
            return new ax.b3.q(iOException);
        }
        return ax.b3.d.b(string, iOException);
    }

    private ax.b3.j t0(String string, int n8, String string2, boolean bl) {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(" (");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(")");
        string = ((StringBuilder)charSequence).toString();
        if (n8 == 550) {
            if (string2 != null) {
                charSequence = string2.toLowerCase();
                if (!((String)charSequence).contains("no such") && !((String)charSequence).contains("not found")) {
                    if (!((String)charSequence).contains("access") && !((String)charSequence).contains("permission")) {
                        if (((String)charSequence).contains("not empty")) {
                            return new ax.b3.k(string);
                        }
                        if (((String)charSequence).contains("already exist")) {
                            return new ax.b3.f(false);
                        }
                        ax.u3.b.e(string2);
                        if (bl) {
                            return new ax.b3.t(string);
                        }
                        return new ax.b3.e(string);
                    }
                    return new ax.b3.e(string);
                }
                return new ax.b3.t(string);
            }
            if (bl) {
                return new ax.b3.t(string);
            }
            return new ax.b3.e(string);
        }
        if (n8 == 452) {
            return new ax.b3.s(string);
        }
        if (n8 == 552) {
            return new ax.b3.s(string);
        }
        if (n8 == 553) {
            if (string2 != null) {
                if (!(string2 = string2.toLowerCase()).contains("access") && !string2.contains("permission")) {
                    if (string2.contains("name")) {
                        return new ax.b3.o(string);
                    }
                } else {
                    return new ax.b3.e(string);
                }
            }
            return new ax.b3.e(string);
        }
        if (n8 == 425) {
            return new ax.b3.q(string);
        }
        if (n8 == 426) {
            return new ax.b3.q(string);
        }
        return new ax.b3.j(string);
    }

    private static void v0(ax.Sc.e e8) {
        if (e8 != null && e8.w()) {
            try {
                e8.o();
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static int w0() {
        return 21;
    }

    private ax.Sc.i x0(String object) throws IOException {
        block5: {
            if ("/".equals(object)) {
                return null;
            }
            CharSequence charSequence = d0.h((String)object);
            int n8 = this.q0(this.j, d0.r((String)object));
            if (!ax.Sc.t.c(n8)) {
                if (n8 == 550) {
                    return null;
                }
                object = new StringBuilder();
                object.append("ChangeWorkingDirectory Error :");
                object.append(this.j.R());
                throw new IOException(object.toString());
            }
            try {
                object = this.j;
                l l8 = new l(){
                    final String a;
                    final q b;
                    {
                        this.b = q8;
                        this.a = string;
                    }

                    @Override
                    public boolean a(ax.Sc.i i8) {
                        if (i8 == null) {
                            return false;
                        }
                        return i8.b().trim().equals(this.a);
                    }
                };
                object = object.k1(null, l8);
                if (((ax.Sc.i[])object).length != 0) break block5;
                return null;
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("FTP ILLEGALSTATE").l(illegalStateException);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("mode: ");
                ((StringBuilder)charSequence).append(this.j.K0());
                b8.g(((StringBuilder)charSequence).toString()).h();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("IllegalState : ");
                ((StringBuilder)charSequence).append(illegalStateException.getMessage());
                throw new IOException(((StringBuilder)charSequence).toString());
            }
        }
        object = object[0];
        return object;
    }

    private String y0(long l8) {
        if (this.h == null) {
            SimpleDateFormat simpleDateFormat;
            this.h = simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        }
        return this.h.format(new Date(l8));
    }

    public static g z0(Context context) {
        if (v == null) {
            v = new g(context.getApplicationContext());
        }
        return v;
    }

    @Override
    public InputStream A(String string, String string2, String string3) {
        if (this.q) {
            return null;
        }
        return this.w(string, string2);
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    boolean B0() {
        return this.j instanceof j;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n var1_1, m.f var2_14) throws ax.b3.j {
        block19: {
            block18: {
                if (var1_1.n() == false) throw new ax.b3.t();
                ax.u3.b.c(var1_1.isDirectory());
                this.R0();
                var5_16 = var1_1.B();
                var6_17 = var1_1.E();
                try {
                    var2_14 /* !! */  = this.k;
                    synchronized (var2_14 /* !! */ ) {
                    }
                }
                catch (IllegalArgumentException var1_9) {
                    throw new ax.b3.j(var1_9);
                }
                catch (IllegalStateException var1_10) {
                    throw new ax.b3.j(var1_10);
                }
                catch (ax.Tc.n var1_11) {
                    break block18;
                }
                catch (StringIndexOutOfBoundsException var1_12) {
                    throw new ax.b3.j(var1_12);
                }
                catch (NullPointerException var1_13) {
                    throw new ax.b3.j(var1_13);
                }
                catch (IOException var2_15) {
                    break block19;
                }
                {
                    block22: {
                        block20: {
                            try {
                                if (!this.N0()) break block20;
                                this.j.z1(true);
                            }
                            catch (Throwable var1_2) {
                                ** break block21
                            }
                        }
                        if (ax.Sc.t.c(var3_18 = this.q0(this.j, var6_17)) == false) throw this.t0("FTP listChildren CWD", var3_18, this.j.S(), false);
                        var4_19 = this.P0();
                        if (var4_19 == false) return this.E0(var5_16, var6_17, false);
                        try {
                            var1_1 = this.E0(var5_16, var6_17, true);
                            if (var1_1 == null) return this.E0(var5_16, var6_17, false);
                        }
                        catch (IllegalArgumentException var1_3) {
                            break block22;
                        }
                        catch (ax.b3.j var1_4) {
                            break block22;
                        }
                        catch (IllegalStateException var1_5) {
                            break block22;
                        }
                        catch (ax.Tc.n var1_6) {
                            break block22;
                        }
                        catch (StringIndexOutOfBoundsException var1_7) {
                            break block22;
                        }
                        catch (NullPointerException var1_8) {
                            // empty catch block
                            break block22;
                        }
                        return var1_1;
                    }
                    var1_1.printStackTrace();
                    return this.E0(var5_16, var6_17, false);
lbl-1000:
                    // 1 sources

                    {
                        throw var1_2;
                    }
                }
            }
            ax.Ha.c.h().d("PARSER ERROR").l(var1_11).h();
            throw new ax.b3.j(var1_11);
        }
        var1_1 = new StringBuilder();
        var1_1.append("FTP listchildren FTPS=");
        var1_1.append(this.B0());
        throw this.s0(var1_1.toString(), var2_15);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void D(n var1_1, G var2_6, String var3_15, long var4_16, Long var6_17, p var7_30, boolean var8_35, ax.u3.c var9_36, ax.g3.i var10_37) throws ax.b3.j, ax.b3.a {
        block79: {
            block68: {
                block69: {
                    block67: {
                        this.R0();
                        ax.u3.b.a(var1_1.n());
                        var19_38 = null;
                        var7_30 = null;
                        var17_39 = null;
                        var20_40 = null;
                        var8_35 = this.q;
                        if (!var8_35) break block67;
                        try {
                            var3_15 = this.j;
                            ** GOTO lbl59
                        }
                        catch (Throwable var6_18) {}
                        ** GOTO lbl-1000
                        catch (IOException var1_2) {}
                        ** GOTO lbl-1000
                    }
                    try {
                        var7_30 = var3_15 = this.l.f();
                        var15_41 = var3_15;
                    }
                    catch (K var7_32) {
                        var3_15 = null;
                        ** GOTO lbl49
                    }
                    this.r = true;
                    ** GOTO lbl59
                    catch (Throwable var6_29) {}
lbl-1000:
                    // 2 sources

                    {
                        var3_15 = null;
                        var1_1 = null;
                        var2_6 = var17_39;
                        break block68;
                    }
                    catch (IOException var1_4) {}
lbl-1000:
                    // 2 sources

                    {
                        var6_17 = null;
                        var9_36 = null;
                        var3_15 = var1_1;
                        var2_6 = var7_30;
                        var1_1 = var9_36;
                        break block69;
                    }
                    catch (Throwable var6_19) {
                        var3_15 = var7_30;
lbl41:
                        // 2 sources

                        while (true) {
                            var1_1 = null;
                            var2_6 = var17_39;
                            break block68;
                            break;
                        }
                    }
                    catch (IOException var2_7) {
                        block80: {
                            block70: {
                                block72: {
                                    block71: {
                                        var3_15 = var15_41;
                                        break block80;
                                        catch (K var7_31) {}
lbl49:
                                        // 2 sources

                                        var16_42 = var3_15;
                                        var15_41 = var3_15;
                                        if (this.r) break block70;
                                        var16_42 = var3_15;
                                        var15_41 = var3_15;
                                        this.M0(true);
                                        var16_42 = var3_15;
                                        var15_41 = var3_15;
                                        var3_15 = this.j;
lbl59:
                                        // 3 sources

                                        var16_42 = var3_15;
                                        var15_41 = var3_15;
                                        var7_30 = this.j;
                                        if (var3_15 != var7_30) break block71;
                                        var7_30 = var3_15;
                                        var15_41 = var3_15;
                                        {
                                            var7_30 = var16_42 = this.k;
                                            break block72;
                                        }
                                    }
                                    var7_30 = var3_15;
                                }
                                var16_42 = var3_15;
                                var15_41 = var3_15;
                                ** synchronized (var7_30)
lbl-1000:
                                // 1 sources

                                {
                                    block73: {
                                        block76: {
                                            block74: {
                                                var12_43 = this.q0((ax.Sc.e)var3_15, var1_1.T());
                                                var8_35 = ax.Sc.t.c(var12_43);
                                                var11_44 = 0;
                                                if (!var8_35) break block73;
                                                ((h)var3_15).a(30);
                                                var16_42 = var3_15.D1(var1_1.B());
                                                ((h)var3_15).a(-1);
                                                if (var16_42 != null) break block74;
                                                try {
                                                    var11_44 = var3_15.R();
                                                    var1_1 = var3_15.S();
                                                    var2_6 = com.alphainventor.filemanager.file.q.u;
                                                    var6_17 = new StringBuilder();
                                                    var6_17.append("StoreFileStream returns null : reply : ");
                                                    var6_17.append(var11_44);
                                                    var6_17.append(":");
                                                    var6_17.append((String)var1_1);
                                                    var2_6.severe(var6_17.toString());
                                                    if (var3_15.w() == false) throw this.t0("FTP writeFile STOR", var11_44, (String)var1_1, false);
                                                    var8_35 = ax.Sc.t.a(var3_15.R());
                                                    if (var8_35 == false) throw this.t0("FTP writeFile STOR", var11_44, (String)var1_1, false);
                                                    var3_15.o();
                                                    throw this.t0("FTP writeFile STOR", var11_44, (String)var1_1, false);
                                                }
                                                catch (Throwable var6_20) {}
                                                ** GOTO lbl-1000
                                            }
                                            var15_41 = var2_6.b();
                                            var13_45 = F.c((InputStream)var15_41, (OutputStream)var16_42, var4_16, var9_36, (ax.g3.i)var10_37);
                                            var16_42.close();
                                            var10_37 = var20_40;
                                            var16_42 = var3_15;
                                            var17_39 = var7_30;
                                            var18_46 = var15_41;
                                            var8_35 = var3_15.w();
                                            if (var8_35) break block75;
                                            var10_37 = var20_40;
                                            var16_42 = var3_15;
                                            var17_39 = var7_30;
                                            var18_46 = var15_41;
                                            com.alphainventor.filemanager.file.q.u.fine("FTP client is disconnected");
                                            if (var13_45 < var4_16) break block76;
lbl125:
                                            // 4 sources

                                            while (var6_17 != null) {
                                                var10_37 = var20_40;
                                                var16_42 = var3_15;
                                                var17_39 = var7_30;
                                                var18_46 = var15_41;
                                                if (var6_17.longValue() <= 0L) ** break block77
                                                var10_37 = var20_40;
                                                var16_42 = var3_15;
                                                var17_39 = var7_30;
                                                var18_46 = var15_41;
                                                var4_16 = var6_17.longValue();
                                            }
                                            ** break block77
                                            {
                                                try {
                                                    this.L0((ax.Sc.e)var3_15, (n)var1_1, var4_16, false);
                                                    ** break block77
                                                }
                                                catch (Throwable var6_22) {
                                                    var2_6 = var19_38;
                                                    var1_1 = var15_41;
                                                    break block78;
                                                    break;
                                                }
                                            }
                                        }
                                        var10_37 = var20_40;
                                        var16_42 = var3_15;
                                        var17_39 = var7_30;
                                        var18_46 = var15_41;
                                        var10_37 = var20_40;
                                        var16_42 = var3_15;
                                        var17_39 = var7_30;
                                        var18_46 = var15_41;
                                        var1_1 = new ax.b3.j("FTP ERROR : Socket is disconnected");
                                        var10_37 = var20_40;
                                        var16_42 = var3_15;
                                        var17_39 = var7_30;
                                        var18_46 = var15_41;
                                        throw var1_1;
                                        catch (Throwable var6_24) {
                                            var1_1 = var15_41;
                                            ** GOTO lbl167
                                        }
                                        catch (Throwable var6_25) {}
lbl-1000:
                                        // 2 sources

                                        {
                                            var1_1 = null;
lbl167:
                                            // 2 sources

                                            var2_6 = var16_42;
                                        }
                                        break block78;
                                    }
                                    try {
                                        throw this.t0("FTP writeFile CWD", var12_43, var3_15.S(), false);
                                    }
                                    catch (Throwable var6_26) {
                                        var1_1 = null;
                                        var2_6 = var19_38;
                                        break block78;
                                    }
                                }
                            }
                            var16_42 = var3_15;
                            var15_41 = var3_15;
                            try {
                                var16_42 = var3_15;
                                var15_41 = var3_15;
                                var1_1 = new ax.b3.j(var7_30.getMessage(), (Throwable)var7_30);
                                var16_42 = var3_15;
                                var15_41 = var3_15;
                                throw var1_1;
                            }
                            catch (Throwable var6_28) {
                                var3_15 = var16_42;
                                ** continue;
                            }
                            catch (IOException var2_12) {
                                var3_15 = var15_41;
                            }
                        }
                        var6_17 = null;
                        var1_1 = null;
                        var7_30 = var3_15;
                        var3_15 = var2_6;
                        var2_6 = var7_30;
                    }
                }
                try {
                    throw this.s0("FTP writefile", (IOException)var3_15);
                }
                catch (Throwable var7_34) {
                    var3_15 = var2_6;
                    var2_6 = var6_17;
                    var6_17 = var7_34;
                    break block68;
                }
                {
                    block78: {
                        block75: {
                            catch (IOException var2_14) {
                                throw this.t0("FTP writeFile STOR", var11_44, (String)var1_1, false);
                            }
                        }
                        while (true) {
                            var12_43 = var11_44 + 1;
                            try {
                                if (var3_15.C0()) ** GOTO lbl125
                                var10_37 = new StringBuilder();
                                var10_37.append("FTP ERROR : ");
                                var10_37.append(var3_15.R());
                                var10_37.append(":");
                                var10_37.append(var3_15.S());
                                var2_6 = new ax.b3.j(var10_37.toString());
                                throw var2_6;
                            }
                            catch (Throwable var6_21) {
                                var2_6 = var19_38;
                                var1_1 = var15_41;
                                break block78;
                            }
                            catch (IOException var2_8) {
                                var2_8.printStackTrace();
                                com.alphainventor.filemanager.file.q.u.fine("FTP completePendingCommand Error");
                                try {
                                    var3_15.o();
                                }
                                catch (IOException var2_9) {
                                    // empty catch block
                                }
                                if (var13_45 >= var4_16) ** GOTO lbl125
                                var1_1 = new ax.b3.j("FTP ERROR : completePendingCommand error 2");
                                throw var1_1;
                            }
                            catch (SocketTimeoutException var2_10) {
                                if (((h)var3_15).e() && var12_43 < 20) {
                                    var11_44 = var12_43;
                                    if (var9_36 == null) continue;
                                    if (var9_36.isCancelled()) {
                                        var1_1 = new ax.b3.a();
                                        throw var1_1;
                                    }
                                    var11_44 = var12_43;
                                    continue;
                                }
                                try {
                                    var3_15.o();
                                }
                                catch (IOException var2_11) {
                                    // empty catch block
                                }
                                if (var13_45 >= var4_16) ** GOTO lbl125
                                var1_1 = new ax.b3.j("FTP ERROR : completePendingCommand error 1");
                                throw var1_1;
                            }
                            break;
                        }
                        catch (Throwable var6_23) {
                            var2_6 = var10_37;
                            var3_15 = var16_42;
                            var7_30 = var17_39;
                            var1_1 = var18_46;
                        }
                    }
                    var10_37 = var2_6;
                    var16_42 = var3_15;
                    var17_39 = var7_30;
                    var18_46 = var1_1;
                }
                try {
                    throw var6_17;
                }
                catch (IOException var7_33) {
                    var6_17 = var2_6;
                    var2_6 = var7_33;
                }
                ** finally { 
            }
            if (var2_6 != null) {
                try {
                    var2_6.close();
                }
                catch (IOException var2_13) {
                    // empty catch block
                }
            }
            if (var1_1 != null) {
                try {
                    var1_1.close();
                }
                catch (IOException var1_5) {
                    // empty catch block
                }
            }
            if (var3_15 == null) throw var6_17;
            if (var3_15 == this.j) throw var6_17;
            this.l.i((ax.Sc.e)var3_15);
            throw var6_17;
lbl-1000:
            // 3 sources

            {
                var10_37 = var20_40;
                var16_42 = var3_15;
                var17_39 = var7_30;
                var18_46 = var15_41;
                {
                    // MONITOREXIT @DISABLED, blocks:[20, 30] lbl282 : MonitorExitStatement: MONITOREXIT : var7_30
                    if (var15_41 == null) break block79;
                }
            }
            try {
                var15_41.close();
            }
            catch (IOException var1_3) {
                // empty catch block
            }
        }
        if (var3_15 == this.j) return;
        this.l.i((ax.Sc.e)var3_15);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void E(n n8, n n9, ax.u3.c object, ax.g3.i i8) throws ax.b3.j {
        this.R0();
        ax.u3.b.a(n9.n());
        try {
            object = this.k;
            // MONITORENTER : object
        }
        catch (IOException iOException) {
            throw this.s0("FTP moveFile", iOException);
        }
        try {
            long l8 = n8.p();
            if (!this.j.s1(n8.E(), n9.E())) throw this.t0("FTP moveFile", this.j.R(), this.j.S(), true);
            if (i8 == null) return;
            i8.a(l8, l8);
            return;
        }
        catch (Throwable throwable) {}
        {
        }
        // MONITOREXIT : object
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List<n> E0(String object, String object2, boolean bl) throws IOException, ax.b3.j {
        Object object3;
        Object object4;
        int n8;
        Object object5;
        int n9;
        block20: {
            int n10;
            ax.Sc.i[] iArray;
            object = new ArrayList<n>();
            n9 = 0;
            if (bl) {
                iArray = this.j.n1();
                n10 = this.j.R();
                if (!ax.Sc.t.c(n10)) {
                    if (n10 != 425) {
                        if (n10 != 426) return null;
                    }
                    this.I0();
                    return null;
                }
            } else {
                object5 = this.j.d1(null, null);
                n8 = this.j.R();
                if (n8 != 425 && n8 != 426) {
                    object4 = new ArrayList<Object>();
                    n9 = 0;
                    break block20;
                } else {
                    this.I0();
                    if (this.B0()) {
                        object = "FTP List data channel: Cannot support session reuse";
                        throw this.t0((String)object, n8, this.j.S(), false);
                    }
                    object = "FTP List data channel";
                    throw this.t0((String)object, n8, this.j.S(), false);
                }
            }
            n10 = iArray.length;
            while (n9 < n10) {
                ax.Sc.i i8 = iArray[n9];
                if (i8 != null && !d0.C(i8.b()) && !i8.b().startsWith("/")) {
                    Object object6;
                    if (!TextUtils.isEmpty((CharSequence)i8.b().trim())) {
                        object6 = d0.Q((String)object2, i8.b());
                        object.add(new D(this, this.j, i8, (String)object6, false));
                    } else {
                        object6 = ax.Ha.c.h().f().d("FTP EMPTY FILE NAME 1");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("name:");
                        stringBuilder.append(i8.b());
                        stringBuilder.append(",size:");
                        stringBuilder.append(i8.d());
                        stringBuilder.append(",dir:");
                        stringBuilder.append(i8.g());
                        ((ax.Ha.b)object6).g(stringBuilder.toString()).h();
                    }
                }
                ++n9;
            }
            return object;
        }
        while (((ax.Sc.s)object5).g()) {
            if (!this.j.w()) throw new IOException("FTP disconnected while operation");
            object3 = ((ax.Sc.s)object5).f(1);
            if (((ax.Sc.i[])object3).length <= 0) continue;
            if ((object3 = object3[0]) != null) {
                ((ArrayList)object4).add(object3);
                continue;
            }
            n9 = 1;
        }
        int n11 = ((ArrayList)object4).size();
        for (int i9 = 0; i9 < n11; ++i9) {
            CharSequence charSequence;
            object3 = (ax.Sc.i)((ArrayList)object4).get(i9);
            if (object3 == null || d0.C(((ax.Sc.i)object3).b())) continue;
            if (!TextUtils.isEmpty((CharSequence)((ax.Sc.i)object3).b().trim())) {
                charSequence = d0.Q((String)object2, ((ax.Sc.i)object3).b().trim());
                object.add(new D(this, this.j, (ax.Sc.i)object3, (String)charSequence, true));
                continue;
            }
            ax.Ha.b b8 = ax.Ha.c.h().f().d("FTP EMPTY FILE NAME 2");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name:");
            ((StringBuilder)charSequence).append(((ax.Sc.i)object3).b());
            ((StringBuilder)charSequence).append(",size:");
            ((StringBuilder)charSequence).append(((ax.Sc.i)object3).d());
            ((StringBuilder)charSequence).append(",dir:");
            ((StringBuilder)charSequence).append(((ax.Sc.i)object3).g());
            b8.g(((StringBuilder)charSequence).toString()).h();
        }
        if (object.size() != 0) return object;
        if (this.C0(n8)) throw this.t0("FTP List", n8, this.j.S(), false);
        if (n9 == 0) return object;
        try {
            object2 = ax.Sc.s.class.getDeclaredField("a");
            ((AccessibleObject)object2).setAccessible(true);
            object5 = (List)((Field)object2).get(object5);
            object2 = new StringBuilder();
            if (object5 != null) {
                object5 = object5.iterator();
                while (object5.hasNext()) {
                    object4 = (String)object5.next();
                    if (object4 == null || ((String)object4).endsWith(" .") || ((String)object4).endsWith(" ..") || ((String)object4).equals("..") || ((String)object4).equals("\ufeff")) continue;
                    ((StringBuilder)object2).append((String)object4);
                    ((StringBuilder)object2).append("\n");
                }
            }
            if (TextUtils.isEmpty((CharSequence)((StringBuilder)object2).toString().trim())) {
                return object;
            }
            object4 = ax.Ha.c.h().f().b("FTP PARSE ERROR");
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(object2);
            ((StringBuilder)object5).append(",welcome:");
            ((StringBuilder)object5).append(this.o);
            ((StringBuilder)object5).append(",system:");
            ((StringBuilder)object5).append(this.p);
            ((ax.Ha.b)object4).g(((StringBuilder)object5).toString()).h();
            object2 = new ax.b3.j("FTP Parse error");
            throw object2;
        }
        catch (Exception exception) {
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n n8, n n9, ax.u3.c c8, ax.g3.i i8) throws ax.b3.j, ax.b3.a {
        if (!this.q) {
            this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
            return;
        }
        File file = n8.Z();
        o o8 = ax.c3.x.f(file);
        n n10 = o8.z(file.getAbsolutePath());
        boolean bl = n10.n();
        o8.D(n10, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, new ax.g3.i(){
            final ax.g3.i a;
            final q b;
            {
                this.b = q8;
                this.a = i8;
            }

            @Override
            public void a(long l8, long l9) {
                ax.g3.i i8 = this.a;
                if (i8 != null) {
                    i8.a(l8 / 2L, l9);
                }
            }
        });
        n10 = o8.z(file.getAbsolutePath());
        this.D(n9, o8.x(n10), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, new ax.g3.i(){
            final ax.g3.i a;
            final q b;
            {
                this.b = q8;
                this.a = i8;
            }

            @Override
            public void a(long l8, long l9) {
                ax.g3.i i8 = this.a;
                if (i8 != null) {
                    if (l8 == l9) {
                        i8.a(l9, l9);
                        return;
                    }
                    i8.a(l9 / 2L + l8 / 2L, l9);
                }
            }
        });
        if (bl) return;
        try {
            o8.P(n10);
            return;
        }
        catch (ax.b3.j j8) {
            return;
        }
    }

    public ax.Sc.i F0(ax.Sc.e e8, String charSequence) throws IOException {
        if (ax.Sc.t.c(e8.k0(ax.Sc.g.r0, (String)charSequence))) {
            Object object = e8.T();
            if (((String[])object).length < 2) {
                object = u;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("invalid reply : ");
                ((StringBuilder)charSequence).append(e8.S());
                ((Logger)object).severe(((StringBuilder)charSequence).toString());
                return null;
            }
            if (((String)(object = object[1])).startsWith("550")) {
                try {
                    charSequence = e8.X0();
                    if (e8.R() == 250) {
                        object = u;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid getStatus reply : ");
                        stringBuilder.append((String)charSequence);
                        ((Logger)object).severe(stringBuilder.toString());
                        e8.P();
                    }
                }
                catch (IOException iOException) {
                    this.I0();
                }
                return null;
            }
            return com.alphainventor.filemanager.file.q.H0((String)object, (String)charSequence);
        }
        return null;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (this.q) {
            return null;
        }
        if (!this.Z(n8)) {
            return null;
        }
        return com.alphainventor.filemanager.file.m.S(n8);
    }

    @Override
    public void I(n n8) throws ax.b3.j {
        ax.u3.b.g("not support delete file recursively");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public InputStream J(n object, long l8) throws ax.b3.j {
        K k82;
        block11: {
            Throwable throwable2;
            block14: {
                Object object2;
                block12: {
                    block13: {
                        object2 = this.l;
                        if (object2 == null) throw new ax.b3.h("Not connected : ftp");
                        try {
                            if (this.q) {
                                this.R0();
                                object2 = this.j;
                            } else {
                                try {
                                    object2 = ((e)object2).f();
                                    this.r = true;
                                }
                                catch (K k82) {
                                    if (this.r) break block11;
                                    this.M0(true);
                                    this.R0();
                                    object2 = this.j;
                                }
                            }
                            Object object3 = object2 == this.j ? this.k : object2;
                            // MONITORENTER : object3
                        }
                        catch (IOException iOException) {
                            throw this.s0("FTP getinputstream", iOException);
                        }
                        try {
                            if (((h)object2).c() == 2) break block12;
                            if (!((ax.Sc.e)object2).y1(2)) break block13;
                            ((h)object2).b(2);
                            break block12;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    ((h)object2).b(0);
                }
                ((ax.Sc.e)object2).B1(l8);
                if (((ax.Rc.e)object2).w()) {
                    InputStream inputStream = ((ax.Sc.e)object2).u1(((n)object).E());
                    if (inputStream == null) throw this.t0("FTP getInputStream", ((c)object2).R(), ((c)object2).S(), true);
                    object = new f(this, (ax.Sc.e)object2, inputStream);
                    // MONITOREXIT : object3
                    return object;
                }
                object = new ax.b3.q("FTP client is not connected");
                throw object;
            }
            // MONITOREXIT : object3
            throw throwable2;
        }
        object = new ax.b3.j(k82.getMessage(), k82);
        throw object;
    }

    void J0(ax.Sc.e e8) {
        this.j = e8;
        this.l = new e(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        Exception exception2;
        block4: {
            block3: {
                try {
                    object = this.i;
                    if (object == null || ((ax.u3.q)object).isCancelled()) break block3;
                    this.i.e();
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object = new d(this.p(), this, this.t(), a8);
            ((ax.u3.q)object).i(new Object[0]);
            this.i = object;
            return;
        }
        exception2.printStackTrace();
        if (a8 != null) {
            a8.B();
            a8.T(false, exception2.getMessage());
        }
    }

    public void K0(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.m = this.x();
            return;
        }
        this.m = string;
    }

    @Override
    public boolean L() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean M(n n8) {
        this.R0();
        try {
            Object object = this.k;
            synchronized (object) {
                return this.j.m1(n8.E());
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
    }

    void M0(boolean bl) {
        this.q = bl;
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void P(n object) throws ax.b3.j {
        Throwable throwable2;
        block8: {
            this.R0();
            try {
                Object object2 = this.k;
                // MONITORENTER : object2
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                throw this.s0("FTP deleteFile", iOException);
            }
            try {
                if (!this.p0(((n)object).T())) {
                    object = new ax.b3.j("deleteFile - CWD not successful");
                    throw object;
                }
                if (object.isDirectory()) {
                    if (!this.j.r1(((n)object).B())) throw this.t0("FTP deleteFile", this.j.R(), this.j.S(), true);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            if (!this.j.E0(((n)object).B())) throw this.t0("FTP deleteFile", this.j.R(), this.j.S(), true);
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object2
        throw throwable2;
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean V() {
        return this.t;
    }

    @Override
    public boolean a() {
        ax.Sc.e e8 = this.j;
        return e8 != null && e8.w();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Object object = this.k;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.n = null;
                        com.alphainventor.filemanager.file.q.v0(this.j);
                        e e8 = this.l;
                        if (e8 == null) break block3;
                        e8.b();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean d(n n8, long l8) {
        if (l8 < 0L) {
            return false;
        }
        if (!(n8 instanceof D)) {
            return false;
        }
        this.R0();
        Object object = this.k;
        synchronized (object) {
            return this.L0(this.j, n8, l8, true);
        }
    }

    @Override
    public boolean i0() {
        return !this.q;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void m(n n8, String string, boolean bl, boolean bl2, ax.g3.h h8, ax.u3.c c8) throws ax.b3.j {
        synchronized (this) {
            try {
                this.o(n8, string, bl, bl2, h8, c8);
                return;
            }
            catch (Throwable throwable) {
                while (true) {
                    RuntimeException var1_3;
                    try {}
                    catch (Throwable throwable2) {
                        continue;
                    }
                    throw var1_3;
                }
            }
        }
    }

    @Override
    public String r() {
        return this.m;
    }

    void u0(String string, String string2) {
        this.o = string;
        this.p = string2;
        this.s = w;
        if (string != null) {
            if (string.contains("FileZilla Server")) {
                this.s = x;
                return;
            }
            if (string.contains("ESP8266")) {
                this.s = y;
                this.M0(true);
                return;
            }
            if (string.contains("lima-city.de")) {
                this.t = true;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public n z(String var1_1) throws ax.b3.j {
        block28: {
            block29: {
                this.R0();
                try {
                    var6_18 = this.k;
                    synchronized (var6_18) {
                    }
                }
                catch (ax.Tc.n var1_14) {
                    break block28;
                }
                catch (NullPointerException var1_15) {
                    throw new ax.b3.j((Throwable)var1_9);
                }
                catch (ArrayIndexOutOfBoundsException var1_16) {
                    throw new ax.b3.j((Throwable)var1_11);
                }
                catch (IOException var1_17) {
                    throw this.s0("FTP getfileinfo", (IOException)var1_13);
                }
                {
                    var2_19 = this.Q0();
                    if (var2_19) {
                    }
                    ** GOTO lbl55
                    {
                        block30: {
                            block33: {
                                block32: {
                                    block31: {
                                        catch (Throwable var1_5) {
                                            break block29;
                                        }
                                        try {
                                            var3_20 = this.F0(this.j, var1_1);
                                            break block30;
                                        }
                                        catch (Throwable var1_2) {
                                            break block29;
                                        }
                                        catch (IOException var3_21) {
                                        }
                                        catch (ax.Rc.a var3_22) {
                                            break block31;
                                        }
                                        catch (RuntimeException var3_23) {
                                            break block32;
                                        }
                                        var3_21.printStackTrace();
                                        break block33;
                                    }
                                    var3_22.printStackTrace();
                                    if (!"/".equals(var1_1)) {
                                        var3_20 = ax.Ha.c.h().f().d("FTP INVALID REPLY!!!! FIX CODE FOR THIS CASE").l(var3_22);
                                        var4_24 = new StringBuilder();
                                        var4_24.append(this.j.S());
                                        var4_24.append(",path:");
                                        var4_24.append(var1_1);
                                        var4_24.append(" ,welcomeMessage:");
                                        var4_24.append(this.o);
                                        var3_20.g(var4_24.toString()).h();
                                    }
                                    break block33;
                                }
                                var3_23.printStackTrace();
                                ax.Ha.c.h().f().d("FTP MLST ERROR").l(var3_23).g(this.j.S()).h();
                            }
                            var3_20 = null;
                        }
                        if (var3_20 != null) ** GOTO lbl-1000
                        var3_20 = this.x0(var1_1);
                        ** GOTO lbl69
lbl-1000:
                        // 1 sources

                        {
                            var5_25 = var3_20.b().trim();
                            var2_19 = d0.A((String)var5_25);
                            var4_24 = var5_25;
                            if (var2_19) ** GOTO lbl-1000
                        }
                        {
                            var4_24 = d0.h(d0.U((String)var5_25));
                            var3_20.l((String)var4_24);
                        }
lbl-1000:
                        // 2 sources

                        {
                            if (var2_19 = var4_24.equals(d0.h(var1_1))) ** GOTO lbl69
                        }
                        {
                            var3_20 = this.x0(var1_1);
lbl69:
                            // 3 sources

                            if (var3_20 != null) ** GOTO lbl-1000
                            var2_19 = this.r0(var1_1);
                            return new D(this, var1_1, var2_19);
                        }
lbl-1000:
                        // 1 sources

                        {
                            var5_25 = this.j;
                        }
                        ** try [egrp 9[TRYBLOCK] [19 : 308->336)] { 
lbl74:
                        // 1 sources

                        return new D(this, (ax.Sc.e)var5_25, (ax.Sc.i)var3_20, var1_1, true);
                    }
lbl75:
                    // 1 sources

                    catch (Throwable var1_3) {}
                }
            }
            try {
                throw var1_4;
            }
            catch (ax.Tc.n var1_6) {
            }
            catch (NullPointerException var1_8) {
                throw new ax.b3.j((Throwable)var1_9);
            }
            catch (ArrayIndexOutOfBoundsException var1_10) {
                throw new ax.b3.j((Throwable)var1_11);
            }
            catch (IOException var1_12) {
                throw this.s0("FTP getfileinfo", (IOException)var1_13);
            }
        }
        ax.Ha.c.h().d("PARSER ERROR").l((Throwable)var1_7).h();
        throw new ax.b3.j((Throwable)var1_7);
    }

    private static class d
    extends ax.u3.q<Object, Void, Boolean> {
        c.a h;
        String i;
        int j;
        String k;
        String l;
        boolean m;
        boolean n;
        boolean o;
        ax.Sc.e p;
        boolean q;
        String r;
        String s;
        q t;
        ax.Z2.o u;
        String v;
        boolean w;
        Context x;

        public d(Context context, ax.Z2.o o8, c.a a8) {
            super(q.e.c0);
            this.x = context;
            this.h = a8;
            this.q = true;
            this.u = o8;
            this.E(o8);
        }

        public d(Context object, q q8, int n8, c.a a8) {
            super(q.e.c0);
            this.x = object;
            this.t = q8;
            this.h = a8;
            this.q = false;
            object = com.alphainventor.filemanager.file.q.z0((Context)object).k(n8);
            if (object != null) {
                this.E((ax.Z2.o)object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("No remote info for index : ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        private SSLContext A() {
            GeneralSecurityException generalSecurityException2;
            block3: {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                    sSLContext.init(null, new TrustManager[]{ax.Vc.g.a()}, null);
                    return sSLContext;
                }
                catch (Exception exception) {
                }
                catch (GeneralSecurityException generalSecurityException2) {
                    break block3;
                }
                exception.printStackTrace();
                return null;
            }
            generalSecurityException2.printStackTrace();
            return null;
        }

        private void E(ax.Z2.o o8) {
            this.i = o8.d();
            this.j = o8.h();
            this.k = o8.k();
            this.l = o8.g();
            this.r = o8.f();
            this.m = o8.m();
            this.n = o8.o();
            this.o = o8.n();
            this.s = o8.a();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean w(boolean var1_1, boolean var2_2) {
            block40: {
                block42: {
                    block41: {
                        block39: {
                            block38: {
                                System.setProperty("org.apache.commons.net.ftp.systemType.default", "UNKNOWN_SYSTEM_TYPE");
                                if (!var1_1) {
                                    this.p = new i();
                                } else {
                                    com.alphainventor.filemanager.file.q.A0(this.x);
                                    var7_3 = this.A();
                                    if (var7_3 != null) {
                                        this.p = new j(this.o, (SSLContext)var7_3, this.j);
                                    } else {
                                        var7_3 = new j(this.o, this.j);
                                        var7_3.R1(ax.Vc.g.a());
                                        this.p = var7_3;
                                    }
                                }
                                this.p.n0(false);
                                var7_3 = new ax.c3.p();
                                this.p.A1((ax.Tc.d)var7_3);
                                var7_3 = this.s;
                                if (var7_3 == null) {
                                    var7_3 = ax.u3.f.a();
                                    if (var7_3 != null) {
                                        this.p.m0((String)var7_3);
                                    }
                                    var3_7 = true;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        var5_8 = false;
                                        var4_9 = var3_7;
                                        var3_7 = var5_8;
                                        break;
                                    }
                                } else {
                                    this.p.m0((String)var7_3);
                                    if (!"UTF8".equals(this.s) && !"UTF-8".equals(this.s)) {
                                        var3_7 = false;
                                        ** continue;
                                    }
                                    var4_9 = false;
                                    var3_7 = true;
                                }
                                var5_8 = var4_9 != false && B.G(this.k) != false && B.G(this.l) != false;
                                if (var4_9 && !var5_8) {
                                    this.p.w1(true);
                                }
                                this.p.x(15000);
                                this.p.z(15000);
                                this.p.x1(30000);
                                try {
                                    var9_10 = InetAddress.getAllByName(this.i);
                                    if (var9_10 == null || var9_10.length <= 1 || !(var9_10[0] instanceof Inet6Address)) break block38;
                                    var7_3 = null;
                                    var6_11 = 0;
lbl45:
                                    // 2 sources

                                    while (true) {
                                        var8_12 = var7_3;
                                        if (var6_11 >= var9_10.length) break block39;
                                        break;
                                    }
                                }
                                catch (Exception var8_13) {
                                    break block40;
                                }
                                var8_12 = var9_10[var6_11];
                                {
                                    if (var8_12 instanceof Inet4Address) {
                                        var7_3 = var8_12;
                                    }
                                    ++var6_11;
                                    ** continue;
                                }
                            }
                            var8_12 = null;
                        }
                        if (var8_12 == null) ** GOTO lbl62
                        {
                            block43: {
                                this.p.n((InetAddress)var8_12, this.j);
                                break block43;
lbl62:
                                // 1 sources

                                this.p.m(this.i, this.j);
                            }
                            if (ax.Sc.t.c(this.p.R())) break block41;
                            var7_3 = new StringBuilder();
                            var7_3.append("connect error : ");
                            var7_3.append(this.p.S());
                            this.v = var7_3.toString();
                            this.p.o();
                            return false;
                        }
                    }
                    try {
                        if (!this.p.l1(this.k, this.l)) {
                            var7_3 = new StringBuilder();
                            var7_3.append("login error : ");
                            var7_3.append(this.p.S());
                            this.v = var7_3.toString();
                            com.alphainventor.filemanager.file.q.k0(this.p);
                            return false;
                        }
                    }
                    catch (IllegalStateException var7_4) {
                        break block42;
                    }
                    catch (IOException var7_5) {
                        break block42;
                    }
                    if (var4_9 && var5_8 || var3_7) {
                        if (var4_9) {
                            ((h)this.p).g();
                        }
                        if (this.p.Z0("UTF8") || this.p.Z0("UTF-8") || var3_7) {
                            this.p.l0("OPTS", "UTF8 ON");
                        }
                    }
                    if (this.p.y1(2)) {
                        ((h)this.p).b(2);
                    } else {
                        ((h)this.p).b(0);
                    }
                    if (this.m) {
                        this.p.F0();
                    } else {
                        this.p.G0();
                    }
                    if (var1_1) {
                        ((u)this.p).K1(0L);
                        ((u)this.p).L1("P");
                    }
                    if (this.h != null && this.t != null && this.r == null) {
                        this.r = var7_3 = this.p.q1();
                        if (var7_3 != null) {
                            this.r = var7_3 = var7_3.trim();
                            if (!d0.B((String)var7_3)) {
                                this.r = var7_3 = this.D(this.r);
                                if (!d0.B((String)var7_3)) {
                                    this.r = var7_3 = d0.S(this.r);
                                    if (!d0.B((String)var7_3)) {
                                        ax.Ha.c.h().c("INVALID FTP INITIAL PATH").g(this.r).h();
                                        this.r = null;
                                    }
                                }
                            }
                        }
                    }
                    if (var2_2) {
                        this.p.i1();
                        if (!ax.Sc.t.c(this.p.R())) {
                            var7_3 = new StringBuilder();
                            var7_3.append("list error : ");
                            var7_3.append(this.p.S());
                            this.v = var7_3.toString();
                            com.alphainventor.filemanager.file.q.k0(this.p);
                            return false;
                        }
                    }
                    if (this.t != null) {
                        var7_3 = this.p.Y0();
                        var8_12 = ((h)this.p).d();
                        this.t.K0(this.r);
                        this.t.J0(this.p);
                        this.t.u0((String)var8_12, (String)var7_3);
                    }
                    if (this.q) {
                        com.alphainventor.filemanager.file.q.k0(this.p);
                    }
                    return true;
                }
                var8_12 = new StringBuilder();
                var8_12.append("exception error 2 : ");
                var8_12.append(var7_6.getMessage());
                this.v = var8_12.toString();
                var7_6.printStackTrace();
                com.alphainventor.filemanager.file.q.k0(this.p);
                return false;
            }
            if (ax.b3.d.e(var8_13)) {
                this.w = true;
            }
            var7_3 = new StringBuilder();
            var7_3.append("exception error 1 : ");
            var7_3.append(var8_13.getMessage());
            this.v = var7_3.toString();
            var8_13.printStackTrace();
            return false;
        }

        boolean B() {
            return this.w;
        }

        protected void C(Boolean bl) {
            if (this.h != null) {
                if (bl.booleanValue()) {
                    q q8 = this.t;
                    if (q8 != null && com.alphainventor.filemanager.file.q.D0(q8.t())) {
                        com.alphainventor.filemanager.file.q.z0(this.x).t(this.t.t());
                    }
                    if (!TextUtils.isEmpty((CharSequence)this.r)) {
                        this.r = d0.U(this.r);
                    }
                    this.h.T(bl, this.r);
                    return;
                }
                q q9 = this.t;
                if (q9 != null && com.alphainventor.filemanager.file.q.D0(q9.t())) {
                    com.alphainventor.filemanager.file.q.z0(this.x).m(this.t.t());
                }
                this.h.T(bl, this.v);
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        String D(String string) {
            int n8 = string.indexOf("\"");
            if (n8 < 0) {
                return string;
            }
            try {
                StringBuilder stringBuilder = new StringBuilder();
                int n9 = n8 + 1;
                n8 = 0;
                while (n9 < string.length()) {
                    char c8 = string.charAt(n9);
                    if (c8 == '\"') {
                        if (n8 != 0) {
                            stringBuilder.append(c8);
                            n8 = 0;
                        } else {
                            n8 = 1;
                        }
                    } else {
                        if (n8 != 0) {
                            return stringBuilder.toString();
                        }
                        stringBuilder.append(c8);
                    }
                    ++n9;
                }
                String string2 = string;
                if (n8 == 0) return string2;
                return stringBuilder.toString();
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                return string;
            }
        }

        @Override
        protected void r() {
            c.a a8 = this.h;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean x(Object ... object) {
            Throwable throwable2;
            block9: {
                block8: {
                    object = this.t;
                    if (object != null) {
                        ((m)object).i();
                    }
                    try {
                        if (!this.q || this.n) break block8;
                        if (this.w(true, true) && this.u != null) {
                            u.fine("FTPS detected!!!");
                            this.u.C(true);
                            Boolean bl = Boolean.TRUE;
                            object = this.t;
                            if (object != null) {
                                ((m)object).j();
                            }
                            return bl;
                        }
                        u.fine("FTPS not detected, try FTP");
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                boolean bl = this.w(this.n, false);
                object = this.t;
                if (object != null) {
                    ((m)object).j();
                }
                return bl;
            }
            object = this.t;
            if (object != null) {
                ((m)object).j();
            }
            throw throwable2;
        }

        String y() {
            return this.v;
        }

        public ax.Sc.e z() {
            return this.p;
        }
    }

    class e
    extends ax.u3.t<ax.Sc.e> {
        final q b;

        e(q q8) {
            this.b = q8;
        }

        public ax.Sc.e f() throws K {
            ax.Sc.e e8;
            ax.Sc.e e9 = e8 = (ax.Sc.e)super.a();
            if (e8 != null) {
                e9 = e8;
                if (!e8.w()) {
                    e9 = this.h();
                }
            }
            return e9;
        }

        protected void g(ax.Sc.e e8) {
            com.alphainventor.filemanager.file.q.v0(e8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected ax.Sc.e h() throws K {
            Exception exception2;
            block5: {
                Object object;
                d d8;
                try {
                    d8 = new d(this.b.p(), null, this.b.t(), null);
                    if (((Boolean)d8.h(new Object[0]).l()).booleanValue()) {
                        return d8.z();
                    }
                }
                catch (Exception exception2) {
                    break block5;
                }
                catch (K k8) {
                    throw k8;
                }
                if (!d8.B()) {
                    object = ax.Ha.c.h().f().c("FTP CHANNEL OPEN ERROR 1");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("msg:");
                    stringBuilder.append(d8.y());
                    ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                }
                object = new K("Could not create transfer connection");
                throw object;
            }
            ax.Ha.c.h().f().d("FTP CHANNEL OPEN ERROR 2").l(exception2).h();
            exception2.printStackTrace();
            throw new K("Could not create transfer connection", exception2);
        }

        public void i(ax.Sc.e e8) {
            if (e8 == null) {
                u.severe("Try to release null ftpclient");
                return;
            }
            if (e8.w()) {
                super.e(e8);
            }
        }
    }

    class f
    extends H {
        ax.Sc.e c0;
        boolean d0;
        final q e0;

        f(q q8, ax.Sc.e e8, InputStream inputStream) {
            this.e0 = q8;
            super(inputStream);
            this.c0 = e8;
        }

        @Override
        public void close() throws IOException {
            if (!this.d0) {
                super.close();
                this.d0 = true;
                if (this.c0.w()) {
                    this.c0.A0();
                    this.c0.C0();
                    if (this.c0 != this.e0.j) {
                        this.e0.l.i(this.c0);
                    }
                }
            }
        }
    }

    public static class g
    extends g0 {
        Context a;
        d b;
        c0 c;
        int d = 100000000;
        HashMap<Integer, k> e = new HashMap();

        g(Context context) {
            this.a = context;
            this.c = new c0(ax.Q2.f.H0);
        }

        private int o(ax.o3.o object2) {
            String string = ((ax.o3.o)object2).e();
            InetAddress inetAddress = ((ax.o3.o)object2).g();
            int n8 = ((ax.o3.o)object2).i();
            for (Map.Entry<Integer, k> entry : this.e.entrySet()) {
                ax.Z2.o o8 = entry.getValue().a;
                if (!B.j(o8.b(), string) || !B.j(o8.d(), inetAddress.getHostAddress()) || o8.h() != n8) continue;
                return entry.getKey();
            }
            return 0;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("FTPPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("name_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("host_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("port_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("username_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("password_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("initialPath_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("mode_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("security_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("charset_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            if (com.alphainventor.filemanager.file.q.D0(n8)) {
                ax.Z2.o o8 = this.k(n8);
                if (o8 == null) {
                    return new s(ax.Q2.f.H0, n8, null, "", null, null, 0L, 0L);
                }
                return new s(ax.Q2.f.H0, n8, o8.b(), "", null, null, 0L, 0L);
            }
            Object object = this.a.getSharedPreferences("FTPPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("name_");
            charSequence.append(n8);
            charSequence = object.getString(charSequence.toString(), null);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            charSequence2 = object.getString(charSequence2.toString(), "anonymous");
            CharSequence charSequence3 = new StringBuilder();
            charSequence3.append("initialPath_");
            charSequence3.append(n8);
            charSequence3 = object.getString(charSequence3.toString(), null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            long l9 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            object = object.getString(stringBuilder.toString(), null);
            return new s(ax.Q2.f.H0, n8, (String)charSequence, (String)charSequence2, (String)object, (String)charSequence3, l8, l9);
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("FTPPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        @Override
        public ax.Z2.o k(int n8) {
            if (com.alphainventor.filemanager.file.q.D0(n8)) {
                k k8 = this.e.get(n8);
                if (k8 != null) {
                    return k8.a;
                }
                return null;
            }
            ax.Z2.o o8 = new ax.Z2.o();
            Context context = this.a;
            boolean bl = false;
            context = context.getSharedPreferences("FTPPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("version_");
            ((StringBuilder)charSequence).append(n8);
            int n9 = context.getInt(((StringBuilder)charSequence).toString(), 0);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name_");
            ((StringBuilder)charSequence).append(n8);
            o8.q(context.getString(((StringBuilder)charSequence).toString(), ""));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("host_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = context.getString(((StringBuilder)charSequence).toString(), "");
            o8.s((String)charSequence);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("port_");
            charSequence2.append(n8);
            o8.z(context.getInt(charSequence2.toString(), 21));
            charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            o8.D(context.getString(charSequence2.toString(), "anonymous"));
            charSequence2 = new StringBuilder();
            charSequence2.append("password_");
            charSequence2.append(n8);
            charSequence2 = context.getString(charSequence2.toString(), "");
            o8.y(this.c.a(n9, (String)charSequence, (String)charSequence2));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("initialPath_");
            ((StringBuilder)charSequence).append(n8);
            o8.v(context.getString(((StringBuilder)charSequence).toString(), null));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("mode_");
            ((StringBuilder)charSequence).append(n8);
            o8.w(context.getBoolean(((StringBuilder)charSequence).toString(), false));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("charset_");
            ((StringBuilder)charSequence).append(n8);
            o8.p(context.getString(((StringBuilder)charSequence).toString(), null));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("security_");
            ((StringBuilder)charSequence).append(n8);
            n8 = context.getInt(((StringBuilder)charSequence).toString(), -1);
            if (n8 < 0) {
                o8.C(false);
                return o8;
            }
            o8.C(true);
            if (n8 > 0) {
                bl = true;
            }
            o8.x(bl);
            return o8;
        }

        @Override
        public void l(int n8, ax.Z2.o object, ax.g3.k k8, boolean bl) {
            int n9 = n8;
            if (n8 == -100) {
                n9 = this.n();
            }
            if (bl) {
                this.b = object = new d(this.a, (ax.Z2.o)object, new c.a(){
                    final ax.g3.k a;
                    final int b;
                    final ax.Z2.o c;
                    final g d;
                    {
                        this.d = g8;
                        this.a = k8;
                        this.b = n8;
                        this.c = o8;
                    }

                    @Override
                    public void B() {
                        this.a.b(ax.Q2.f.H0);
                    }

                    @Override
                    public void T(boolean bl, Object object) {
                        if (bl) {
                            this.d.s(this.b, this.c);
                            object = ax.Q2.f.H0;
                            o o8 = ax.c3.x.d((ax.Q2.f)((Object)object), this.b);
                            new m.d(o8.u()).i(new Long[0]);
                            ax.Z2.b.k().s(o8.T(), o8.V());
                            this.a.c((ax.Q2.f)((Object)object), this.b);
                            return;
                        }
                        object = object instanceof String ? (String)object : null;
                        this.a.a(ax.Q2.f.H0, this.c.d(), this.c.h(), this.c.k(), (String)object);
                    }
                });
                ((ax.u3.q)object).h(new Object[0]);
                return;
            }
            this.s(n9, (ax.Z2.o)object);
            k8.c(ax.Q2.f.H0, n9);
        }

        public void m(int n8) {
            k k8 = this.e.get(n8);
            if (k8 != null) {
                k8.c = false;
            }
        }

        int n() {
            return this.a.getSharedPreferences("FTPPrefs", 0).getInt("count", 0);
        }

        public List<s> p() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Object object = this.a;
            SharedPreferences sharedPreferences = object.getSharedPreferences("FTPPrefs", 0);
            int n8 = sharedPreferences.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("host_");
                ((StringBuilder)object).append(i8);
                if (sharedPreferences.getString(((StringBuilder)object).toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        public int q(ax.o3.o object) {
            String string = ((ax.o3.o)object).h();
            int n8 = this.o((ax.o3.o)object);
            if (n8 != 0 && (object = this.e.get(n8)) != null && B.j(string, ((k)object).b) && ((k)object).c) {
                return n8;
            }
            return 0;
        }

        public int r(ax.o3.o object, String string, String string2) {
            String string3 = ((ax.o3.o)object).e();
            InetAddress inetAddress = ((ax.o3.o)object).g();
            int n8 = ((ax.o3.o)object).i();
            String string4 = ((ax.o3.o)object).h();
            boolean bl = ((ax.o3.o)object).m();
            int n9 = this.o((ax.o3.o)object);
            if (n9 != 0 && (object = this.e.get(n9)) != null) {
                if (B.j(((k)object).a.k(), string) && B.j(((k)object).a.g(), string2)) {
                    if (!B.j(string4, ((k)object).b)) {
                        ((k)object).b = string4;
                        ((k)object).c = false;
                    }
                    return n9;
                }
                ((k)object).a.D(string);
                ((k)object).a.y(string2);
                ((k)object).b = string4;
                ((k)object).c = false;
                return n9;
            }
            n9 = this.d;
            this.d = n9 + 1;
            object = new ax.Z2.o();
            ((ax.Z2.o)object).q(string3);
            ((ax.Z2.o)object).s(inetAddress.getHostAddress());
            ((ax.Z2.o)object).z(n8);
            ((ax.Z2.o)object).D(string);
            ((ax.Z2.o)object).y(string2);
            ((ax.Z2.o)object).w(false);
            ((ax.Z2.o)object).p(null);
            ((ax.Z2.o)object).C(bl);
            object = new k((ax.Z2.o)object, string4);
            this.e.put(n9, (k)object);
            return n9;
        }

        void s(int n8, ax.Z2.o object) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("FTPPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            Object object2 = context.putInt(stringBuilder.toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            stringBuilder = object2.putString(stringBuilder.toString(), ((ax.Z2.o)object).d());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("port_");
            ((StringBuilder)object2).append(n8);
            object2 = stringBuilder.putInt(((StringBuilder)object2).toString(), ((ax.Z2.o)object).h());
            stringBuilder = new StringBuilder();
            stringBuilder.append("username_");
            stringBuilder.append(n8);
            object2 = object2.putString(stringBuilder.toString(), ((ax.Z2.o)object).k());
            stringBuilder = new StringBuilder();
            stringBuilder.append("password_");
            stringBuilder.append(n8);
            stringBuilder = object2.putString(stringBuilder.toString(), this.c.e(((ax.Z2.o)object).d(), ((ax.Z2.o)object).g()));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("name_");
            ((StringBuilder)object2).append(n8);
            object2 = stringBuilder.putString(((StringBuilder)object2).toString(), ((ax.Z2.o)object).b());
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialPath_");
            stringBuilder.append(n8);
            stringBuilder = object2.putString(stringBuilder.toString(), ((ax.Z2.o)object).f());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("charset_");
            ((StringBuilder)object2).append(n8);
            stringBuilder = stringBuilder.putString(((StringBuilder)object2).toString(), ((ax.Z2.o)object).a());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("mode_");
            ((StringBuilder)object2).append(n8);
            stringBuilder.putBoolean(((StringBuilder)object2).toString(), ((ax.Z2.o)object).m());
            if (bl) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("created_");
                stringBuilder.append(n8);
                context.putLong(stringBuilder.toString(), System.currentTimeMillis());
                stringBuilder = new StringBuilder();
                stringBuilder.append("sortindex_");
                stringBuilder.append(n8);
                context.putLong(stringBuilder.toString(), System.currentTimeMillis());
            }
            if (((ax.Z2.o)object).o()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("security_");
                stringBuilder.append(n8);
                context.putInt(stringBuilder.toString(), ((ax.Z2.o)object).n() ? 1 : 0);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("security_");
                ((StringBuilder)object).append(n8);
                context.putInt(((StringBuilder)object).toString(), -1);
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }

        public void t(int n8) {
            k k8 = this.e.get(n8);
            if (k8 != null) {
                k8.c = true;
            }
        }
    }

    static interface h {
        public void a(int var1);

        public void b(int var1);

        public int c();

        public String d();

        public boolean e();

        public void g() throws IOException;
    }

    static class i
    extends ax.Sc.e
    implements h {
        boolean g0;
        int h0;
        String i0;
        int j0;

        i() {
        }

        @Override
        public void a(int n8) {
            this.g0 = true;
            this.h0 = n8;
        }

        @Override
        public void b(int n8) {
            this.j0 = n8;
        }

        @Override
        public int c() {
            return this.j0;
        }

        @Override
        public String d() {
            return this.i0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean e() {
            boolean bl = false;
            try {
                this.E();
                return true;
            }
            catch (IOException | SocketTimeoutException iOException) {
                return bl;
            }
        }

        @Override
        public void g() throws IOException {
            if (!this.Z0("UTF8") && !this.Z0("UTF-8")) {
                return;
            }
            this.m0("UTF-8");
            this.x = new a(new InputStreamReader(this.e, this.O()));
            this.y = new BufferedWriter(new OutputStreamWriter(this.f, this.O()));
        }

        @Override
        protected void i() throws IOException {
            super.i();
            if (this.R() == 220) {
                this.i0 = this.S();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected Socket v0(String object, String object2) throws IOException {
            try {
                object = super.v0((String)object, (String)object2);
                if (object == null) {
                    return null;
                }
                if (((Socket)object).getSendBufferSize() > 0x100000) {
                    ((Socket)object).setSendBufferSize(524288);
                }
            }
            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                throw new IOException(stringIndexOutOfBoundsException);
            }
            if (!this.g0) return object;
            int n8 = this.h0;
            if (n8 <= 0) return object;
            ((Socket)object).setSoLinger(true, n8);
            object2 = u;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("set so linger:");
            stringBuilder.append(((Socket)object).getSoLinger());
            ((Logger)object2).fine(stringBuilder.toString());
            return object;
        }
    }

    static class j
    extends u
    implements h {
        int A0;
        Object B0;
        Object C0;
        int D0;
        private int w0;
        String x0;
        boolean y0;
        int z0;

        j(boolean bl, int n8) {
            super(bl);
            this.D0 = n8;
        }

        j(boolean bl, SSLContext sSLContext, int n8) {
            super(bl, sSLContext);
            this.D0 = n8;
            this.U1(sSLContext);
        }

        private boolean T1(Socket object) {
            if (Build.VERSION.SDK_INT <= 28) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if ("com.android.org.conscrypt.Java8ExtendedSSLSession".equals(object = ((SSLSocket)object).getSession().getClass().getName())) {
                return false;
            }
            if ("com.google.android.gms.org.conscrypt.Java8ExtendedSSLSession".equals(object)) {
                return true;
            }
            ax.u3.b.e("new session class detected");
            return ((String)object).contains("gms");
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void U1(SSLContext object) {
            try {
                object = ((SSLContext)object).getSocketFactory().createSocket();
                this.w0 = this.T1((Socket)object) ? 1 : 2;
                ((Socket)object).close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean V1(SSLSocket object) {
            NoSuchFieldException noSuchFieldException2;
            Object object2;
            block12: {
                Exception exception2;
                block11: {
                    int n8;
                    int n9;
                    object2 = this.b;
                    if (object2 == null) {
                        return false;
                    }
                    Object object3 = ((SSLSocket)object2).getSession();
                    if (!object3.isValid()) {
                        return false;
                    }
                    Object object4 = object3.getSessionContext();
                    try {
                        object2 = object4.getClass().getDeclaredField("sessionsByHostAndPort");
                        ((AccessibleObject)object2).setAccessible(true);
                        object2 = ((Field)object2).get(object4);
                        n9 = object3.getPeerPort();
                        object4 = ((HashMap)object2).keySet();
                        if (object4.size() == 0) {
                            u.severe("invalid SSL session 1");
                            return false;
                        }
                    }
                    catch (Exception exception2) {
                        break block11;
                    }
                    catch (NoSuchFieldException noSuchFieldException2) {
                        break block12;
                    }
                    object3 = object4.toArray()[0].getClass().getDeclaredField("port");
                    ((AccessibleObject)object3).setAccessible(true);
                    for (n8 = 0; n8 < object4.size() && (Integer)((Field)object3).get(object4.toArray()[n8]) != n9; ++n8) {
                    }
                    n9 = object4.size();
                    object3 = Integer.TYPE;
                    if (n8 < n9) {
                        object4 = object4.toArray()[n8];
                        Constructor<?> constructor = object4.getClass().getDeclaredConstructor(new Class[]{String.class, object3});
                        ((AccessibleObject)constructor).setAccessible(true);
                        object3 = constructor.newInstance(((Socket)object).getInetAddress().getHostName(), ((Socket)object).getPort());
                        constructor = constructor.newInstance(((Socket)object).getInetAddress().getHostAddress(), ((Socket)object).getPort());
                        object = ((HashMap)object2).get(object4);
                        if (object instanceof ArrayList) {
                            this.C0 = object4;
                            object4 = new ArrayList((ArrayList)object);
                            this.B0 = object4;
                        }
                        object4 = object2.getClass().getDeclaredMethod("put", Object.class, Object.class);
                        ((AccessibleObject)object4).setAccessible(true);
                        ((Method)object4).invoke(object2, object3, object);
                        ((Method)object4).invoke(object2, constructor, object);
                        return true;
                    }
                    if (this.B0 != null && (object4 = this.C0) != null) {
                        object4 = object4.getClass().getDeclaredConstructor(new Class[]{String.class, object3});
                        ((AccessibleObject)object4).setAccessible(true);
                        object3 = ((Constructor)object4).newInstance(((Socket)object).getInetAddress().getHostName(), ((Socket)object).getPort());
                        object4 = ((Constructor)object4).newInstance(((Socket)object).getInetAddress().getHostAddress(), ((Socket)object).getPort());
                        object = object2.getClass().getDeclaredMethod("put", Object.class, Object.class);
                        ((AccessibleObject)object).setAccessible(true);
                        ((Method)object).invoke(object2, object3, this.B0);
                        ((Method)object).invoke(object2, object4, this.B0);
                        return true;
                    }
                    u.severe("invalid SSL session 2");
                    return false;
                }
                exception2.printStackTrace();
                u.severe("Session reuse : unknown exception");
                exception2.printStackTrace();
                return false;
            }
            noSuchFieldException2.printStackTrace();
            Logger logger = u;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("This device is not supported!!!! : api ");
            ((StringBuilder)object2).append(Build.VERSION.SDK_INT);
            logger.severe(((StringBuilder)object2).toString());
            return false;
        }

        private boolean W1() {
            return this.w0 == 2;
        }

        private boolean X1() {
            return this.w0 == 1;
        }

        @Override
        protected void E1(Socket socket) throws IOException {
            if (socket != null) {
                int n8;
                if (socket instanceof SSLSocket && this.X1()) {
                    this.V1((SSLSocket)socket);
                }
                if (socket.getSendBufferSize() > 0x100000) {
                    socket.setSendBufferSize(524288);
                }
                if (this.y0 && (n8 = this.z0) > 0) {
                    socket.setSoLinger(true, n8);
                }
            }
        }

        @Override
        protected Socket I1() throws IOException {
            if (this.W1()) {
                return new ax.c3.j(new Socket());
            }
            return super.I1();
        }

        @Override
        protected void J1() throws IOException {
            if (this.R() == 220) {
                this.x0 = this.S();
            }
            super.J1();
        }

        @Override
        public String Q0() {
            String string = this.c;
            if (string != null) {
                return string;
            }
            return super.Q0();
        }

        @Override
        protected Socket Q1(String object, String string) throws IOException {
            object = super.Q1((String)object, string);
            if (this.W1() && object instanceof ax.c3.j && this.N1() != null) {
                object = new ax.c3.i((SSLSocket)this.N1().getSocketFactory().createSocket((Socket)object, this.c, this.D0, true), (Socket)object);
                ((ax.c3.i)object).a(this.D0);
                return object;
            }
            return object;
        }

        @Override
        public void a(int n8) {
            this.y0 = true;
            this.z0 = n8;
        }

        @Override
        public void b(int n8) {
            this.A0 = n8;
        }

        @Override
        public int c() {
            return this.A0;
        }

        @Override
        public String d() {
            return this.x0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean e() {
            boolean bl = false;
            try {
                this.E();
                return true;
            }
            catch (IOException | SocketTimeoutException iOException) {
                return bl;
            }
        }

        @Override
        public void g() throws IOException {
            if (!this.Z0("UTF8") && !this.Z0("UTF-8")) {
                return;
            }
            this.m0("UTF-8");
            this.x = new a(new InputStreamReader(this.b.getInputStream(), this.O()));
            this.y = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream(), this.O()));
        }

        @Override
        protected Socket v0(String object, String string) throws IOException {
            object = super.v0((String)object, string);
            if (this.W1() && object instanceof ax.c3.i) {
                ((ax.c3.i)object).a(0);
            }
            return object;
        }
    }

    public static class k {
        final ax.Z2.o a;
        String b;
        boolean c;

        public k(ax.Z2.o o8, String string) {
            this.a = o8;
            this.b = string;
        }
    }
}

