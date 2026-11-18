/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.X2.Q;
import ax.b3.a;
import ax.b3.d;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.l;
import ax.c3.z;
import ax.u3.b;
import ax.u3.c;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.e;
import com.voxdon.xplorer.file.g;
import com.voxdon.xplorer.file.i;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(value=21)
public class h
extends e {
    private AtomicBoolean h = new AtomicBoolean(false);
    private Uri i;

    private InputStream n0(String string) throws IOException, j {
        return new ParcelFileDescriptor.AutoCloseInputStream(this.o0(string));
    }

    private ParcelFileDescriptor o0(String string) throws IOException, j {
        string = ((i)this.z(string)).n0();
        return g.o(this.p(), (Uri)string, "r");
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream A(String object, String string, String string2) {
        Object var1_22;
        block27: {
            z z8;
            ParcelFileDescriptor parcelFileDescriptor;
            block25: {
                Object var1_17;
                block26: {
                    block22: {
                        Object var3_27;
                        Object var5_31;
                        block24: {
                            RuntimeException var1_12;
                            block23: {
                                boolean bl = this.a();
                                ParcelFileDescriptor parcelFileDescriptor2 = null;
                                var5_31 = null;
                                var3_27 = null;
                                if (!bl) {
                                    return null;
                                }
                                z8 = A.g(d0.k((String)parcelFileDescriptor));
                                if (z.f0 == z8) {
                                    try {
                                        return this.n0((String)parcelFileDescriptor);
                                    }
                                    catch (Exception exception) {
                                        exception.printStackTrace();
                                        return null;
                                    }
                                }
                                if (z.e0 != z8) break block25;
                                ParcelFileDescriptor parcelFileDescriptor3 = this.o0((String)parcelFileDescriptor);
                                try {
                                    parcelFileDescriptor = ax.u3.B.g(this.p(), null, parcelFileDescriptor3.getFileDescriptor(), null, 512);
                                    break block22;
                                }
                                catch (Throwable throwable) {
                                    parcelFileDescriptor = parcelFileDescriptor3;
                                    Throwable throwable2 = throwable;
                                    break block23;
                                }
                                catch (j | IOException exception) {
                                    parcelFileDescriptor = parcelFileDescriptor3;
                                    break block24;
                                }
                                catch (Throwable throwable) {
                                    parcelFileDescriptor = parcelFileDescriptor2;
                                }
                            }
                            if (parcelFileDescriptor == null) throw var1_12;
                            try {
                                parcelFileDescriptor.close();
                            }
                            catch (IOException iOException) {
                                throw var1_12;
                            }
                            throw var1_12;
                            catch (j | IOException exception) {
                                parcelFileDescriptor = null;
                            }
                        }
                        Object var1_15 = var5_31;
                        if (parcelFileDescriptor == null) break block26;
                        ParcelFileDescriptor parcelFileDescriptor4 = parcelFileDescriptor;
                        parcelFileDescriptor = var3_27;
                    }
                    try {
                        java.io.Closeable var1_6;
                        var1_6.close();
                        ParcelFileDescriptor parcelFileDescriptor5 = parcelFileDescriptor;
                    }
                    catch (IOException iOException) {
                        ParcelFileDescriptor parcelFileDescriptor6 = parcelFileDescriptor;
                    }
                }
                parcelFileDescriptor = var1_17;
                if (var1_17 == null) {
                    parcelFileDescriptor = ax.s3.a.b();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                parcelFileDescriptor.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
            if (z.c0 != z8) return null;
            parcelFileDescriptor = this.o0((String)parcelFileDescriptor);
            byte[] byArray = ax.u3.B.k(this.p(), null, parcelFileDescriptor.getFileDescriptor());
            try {
                parcelFileDescriptor.close();
            }
            catch (j | IOException exception) {}
            break block27;
            catch (j | IOException exception) {
                Object var1_21 = null;
            }
        }
        if (var1_22 == null) return null;
        return new ByteArrayInputStream((byte[])var1_22);
    }

    @Override
    public boolean B(n n8) {
        return Q.I0();
    }

    @Override
    public List<n> C(n n8, m.f f8) throws j {
        return g.J(this, n8);
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, c c8, ax.g3.i i8) throws j, a {
        if (!n8.n()) {
            g.Q(this, n8, g8, l8, l9, bl, c8, i8);
            return;
        }
        throw new j("DocumentFile writefile already exists");
    }

    @Override
    public void E(n n8, n n9, c c8, ax.g3.i i8) throws j {
        b.a(n9.n());
        Context context = this.p();
        if (n8.T().equals(n9.T())) {
            g.M(context, n8, n9, c8, i8);
            return;
        }
        if (Q.I0() && n8.P() == n9.P()) {
            g.K(context, n8, n9, c8, i8);
            return;
        }
        g.L(this, n8, n9, c8, i8);
    }

    @Override
    public void F(n n8, n n9, c c8, ax.g3.i i8) throws j, a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        if (n8 == null) {
            return null;
        }
        z z8 = n8.G();
        if (z.f0 != z8 && z.c0 != z8 && z.e0 != z8) {
            return null;
        }
        return B.Y(n8);
    }

    @Override
    public void I(n n8) throws j {
        b.g("not support delete file recursively");
    }

    @Override
    public InputStream J(n n8, long l8) throws j {
        return g.t(this.p(), n8, l8);
    }

    @Override
    public void K(Activity activity, Fragment fragment, c.a a8) {
        if (a8 != null) {
            a8.B();
        }
        if (Q.R1() && g.C(this.p(), this.v(), null)) {
            this.i = Uri.parse((String)g.x(this.p(), this.v(), null));
            this.h.compareAndSet(false, true);
            if (a8 != null) {
                a8.T(true, null);
                return;
            }
        } else {
            this.h.compareAndSet(true, false);
            if (a8 != null) {
                a8.T(false, null);
            }
        }
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public boolean M(n n8) {
        block3: {
            try {
                if (!n8.n()) break block3;
                return false;
            }
            catch (j j8) {
                j8.printStackTrace();
                return false;
            }
        }
        n8 = g.d(this, n8, true);
        return n8 != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean N(n n8) {
        block5: {
            block4: {
                try {
                    if (!n8.n()) break block4;
                    return false;
                }
                catch (j j8) {
                    return false;
                }
            }
            n8 = g.d(this, n8, false);
            if (n8 == null) break block5;
            return true;
        }
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void P(n n8) throws j {
        g.g(this, n8);
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
        return this.h.get();
    }

    @Override
    public void b() {
        this.h.compareAndSet(true, false);
    }

    @Override
    public OutputStream c(String object, boolean bl) throws IOException {
        try {
            object = g.u(this, this.z((String)object), bl);
            return object;
        }
        catch (j j8) {
            throw new IOException(j8);
        }
    }

    @Override
    public void l0(String string, long l8) throws IOException {
        try {
            g.P(this, this.z(string), l8);
            return;
        }
        catch (j j8) {
            throw new IOException(j8);
        }
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, ax.g3.h h8, c c8) throws j {
        this.o(n8, string, bl, bl2, h8, c8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected n m0(String object, Uri object2) throws j {
        Throwable throwable2222;
        Object object3;
        block13: {
            IllegalArgumentException illegalArgumentException2222;
            Object object4;
            block12: {
                Exception exception2222;
                Object object5;
                block11: {
                    Object object6;
                    block9: {
                        block10: {
                            object6 = this.p().getContentResolver();
                            object5 = null;
                            object4 = null;
                            object3 = null;
                            try {
                                object2 = object6.query((Uri)object2, l.g, null, null, null);
                                if (object2 == null) break block9;
                                object3 = object2;
                                object5 = object2;
                                object4 = object2;
                                if (!object2.moveToFirst()) break block10;
                                object3 = object2;
                                object5 = object2;
                                object4 = object2;
                                object6 = new i(this, d0.r((String)object), (Cursor)object2);
                            }
                            catch (Exception exception2222) {
                                break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException2222) {
                                break block12;
                            }
                            F.a((AutoCloseable)object2);
                            return object6;
                            catch (Throwable throwable2222) {
                                break block13;
                            }
                        }
                        object3 = object2;
                        object5 = object2;
                        object4 = object2;
                        {
                            object6 = new i(this, (String)object);
                        }
                        F.a((AutoCloseable)object2);
                        return object6;
                    }
                    object3 = object2;
                    object5 = object2;
                    object4 = object2;
                    {
                        object3 = object2;
                        object5 = object2;
                        object4 = object2;
                        object6 = new j("query return null");
                        object3 = object2;
                        object5 = object2;
                        object4 = object2;
                        throw object6;
                    }
                }
                object3 = object5;
                object3 = object5;
                object2 = new StringBuilder();
                object3 = object5;
                ((StringBuilder)object2).append("getFileInfo : ");
                object3 = object5;
                ((StringBuilder)object2).append(exception2222.getClass().getSimpleName());
                object3 = object5;
                ((StringBuilder)object2).append(":");
                object3 = object5;
                ((StringBuilder)object2).append(exception2222.getMessage());
                object3 = object5;
                throw d.a(((StringBuilder)object2).toString(), exception2222);
            }
            object3 = object4;
            if (!TextUtils.isEmpty((CharSequence)illegalArgumentException2222.getMessage())) {
                object3 = object4;
                if (!illegalArgumentException2222.getMessage().contains("FileNotFoundException")) {
                    object3 = object4;
                    illegalArgumentException2222.printStackTrace();
                    object3 = object4;
                    ax.Ha.c.h().f().b("DOCUMENT FILE EXCEPTION DO NOT CONTAIN FILENOTFOUND").l(illegalArgumentException2222).h();
                }
            }
            object3 = object4;
            object = new i(this, (String)object);
            F.a((AutoCloseable)object4);
            return object;
        }
        F.a(object3);
        throw throwable2222;
    }

    public Uri p0() {
        return this.i;
    }

    @Override
    public k0 y() throws j {
        if (f.c0(this.u())) {
            return g.k(this.p(), this, this.v(), this.i);
        }
        return null;
    }

    @Override
    public n z(String string) throws j {
        return this.m0(string, g.e(this.v(), this.i, string));
    }
}

