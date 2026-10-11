/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.system.Os;
import android.system.StructStat;
import ax.X2.Q;
import ax.X2.v;
import ax.b3.j;
import ax.c3.U;
import ax.c3.W;
import ax.c3.x;
import ax.c3.z;
import ax.u3.q;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

public class h
extends q<Void, Void, Boolean> {
    private Context h;
    private File i;
    private o j;
    private Throwable k;
    private long l;
    private String m;
    private String n;
    private z o;
    private AssetFileDescriptor p;
    private a q;

    public h(Context context, AssetFileDescriptor assetFileDescriptor, W w8, z z8, a a8) {
        super(q.e.d0);
        this.h = context;
        this.n = z8 == z.c0 ? "Audio" : (z8 == z.f0 ? "Image" : (z8 == z.i0 ? "Text" : "Unknown"));
        this.m = w8 != null ? w8.a() : this.n;
        this.o = z8;
        this.i = this.x(this.m);
        this.l = assetFileDescriptor.getLength();
        this.p = assetFileDescriptor;
        this.q = a8;
    }

    private File x(String string) {
        File file = new File(ax.Z2.a.m(this.h, "content-tmp"), this.n);
        file.mkdir();
        ax.Z2.a.f(file, false);
        return new File(file, string);
    }

    @Override
    protected void o() {
        this.j.k0(true);
    }

    @Override
    protected void r() {
        o o8;
        this.j = o8 = x.f(this.i);
        o8.n0();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Boolean w(Void ... object) {
        block25: {
            Throwable throwable222;
            j j8222;
            block20: {
                Object object2;
                block21: {
                    block24: {
                        IOException iOException222;
                        block23: {
                            block22: {
                                block19: {
                                    try {
                                        object = this.j.z(this.i.getAbsolutePath());
                                        if (!object.n()) break block19;
                                        this.j.P((n)object);
                                    }
                                    catch (j j8222) {
                                        break block20;
                                    }
                                }
                                try {
                                    long l8;
                                    object = Os.fstat((FileDescriptor)this.p.getParcelFileDescriptor().getFileDescriptor());
                                    object = object != null && (l8 = v.n((StructStat)object)) > 0L ? Long.valueOf(l8) : null;
                                    object2 = object;
                                }
                                catch (Exception exception) {
                                    object2 = null;
                                }
                                try {
                                    object = this.p.createInputStream();
                                    break block21;
                                }
                                catch (RuntimeException runtimeException) {
                                }
                                catch (IllegalStateException illegalStateException) {
                                    break block22;
                                }
                                catch (NullPointerException nullPointerException) {
                                    break block22;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    break block22;
                                }
                                catch (SecurityException securityException) {
                                    break block22;
                                }
                                catch (IOException iOException222) {
                                    break block23;
                                }
                                this.k = runtimeException;
                                break block24;
                            }
                            this.k = object;
                            break block24;
                        }
                        this.k = iOException222;
                    }
                    object = null;
                }
                if (object == null) {
                    return Boolean.FALSE;
                }
                try {
                    n n8 = this.j.z(this.i.getAbsolutePath());
                    U u8 = new U((InputStream)object, -1L);
                    this.j.D(n8, u8, n8.s(), this.l, null, null, true, this, null);
                    u8.e();
                    if (object2 != null) {
                        ((com.alphainventor.filemanager.file.x)this.j.u()).d(n8, (Long)object2);
                    }
                    object = Boolean.TRUE;
                }
                catch (Throwable throwable222) {}
                if (!Q.X1()) return object;
                if (!this.j.Y()) return object;
                this.j.n(null);
                return object;
            }
            j8222.printStackTrace();
            return Boolean.FALSE;
            if (!Q.X1()) throw throwable222;
            if (!this.j.Y()) throw throwable222;
            this.j.n(null);
            throw throwable222;
            catch (j j9) {}
            this.k = j9;
            j9.printStackTrace();
            if (!Q.X1()) return Boolean.FALSE;
            if (!this.j.Y()) return Boolean.FALSE;
            break block25;
            catch (ax.b3.a a8) {}
            this.k = a8;
            a8.printStackTrace();
            if (!Q.X1()) return Boolean.FALSE;
            if (!this.j.Y()) return Boolean.FALSE;
        }
        this.j.n(null);
        return Boolean.FALSE;
    }

    protected void y(Boolean bl) {
        this.j.k0(true);
        if (this.q != null) {
            if (bl.booleanValue()) {
                this.q.b(this.i);
                return;
            }
            this.q.a(this.k);
        }
    }

    public static interface a {
        public void a(Throwable var1);

        public void b(File var1);
    }
}

