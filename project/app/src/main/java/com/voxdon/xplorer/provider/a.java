/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.provider;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ProxyFileDescriptorCallback;
import android.os.storage.StorageManager;
import android.system.ErrnoException;
import android.system.OsConstants;
import ax.Z2.k;
import ax.b3.e;
import ax.b3.j;
import ax.b3.t;
import ax.c3.x;
import ax.l3.b;
import ax.l3.c;
import ax.u3.B;
import com.voxdon.xplorer.file.o;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a {
    private Context a;
    private Handler b;
    private b c;

    a(Context context) {
        this.a = context;
        this.c = new b();
        this.b = new Handler(this.c.b());
    }

    public static ErrnoException a(j j8, String string) {
        String string2 = string;
        if (string == null) {
            string2 = j8.getMessage();
        }
        if (j8 instanceof t) {
            return new ErrnoException(string2, OsConstants.ENOENT);
        }
        if (j8 instanceof e) {
            return new ErrnoException(string2, OsConstants.EACCES);
        }
        return new ErrnoException(string2, OsConstants.EIO);
    }

    public ParcelFileDescriptor b(k k8, int n8) throws IOException {
        boolean bl;
        o o8 = x.e(k8.d());
        if (!o8.a() && !(bl = !B.H() ? o8.i(10000L) : false)) {
            throw new FileNotFoundException("Network location is not connected");
        }
        return ax.l3.c.a((StorageManager)this.a.getSystemService("storage"), n8, new ProxyFileDescriptorCallback(this, o8, k8, n8){
            private ax.l3.a a;
            private boolean b;
            final o c;
            final k d;
            final int e;
            final a f;
            {
                this.f = a8;
                this.c = o8;
                this.d = k8;
                this.e = n8;
            }

            private void a() throws ErrnoException {
                if (!this.b) {
                    try {
                        this.a = this.c.j0(this.d.e(), this.e);
                        this.b = true;
                        return;
                    }
                    catch (j j8) {
                        throw com.voxdon.xplorer.provider.a.a(j8, null);
                    }
                }
            }

            public void onFsync() throws ErrnoException {
                this.a();
                this.a.a();
            }

            public long onGetSize() throws ErrnoException {
                this.a();
                return this.a.b();
            }

            public int onRead(long l8, int n8, byte[] byArray) throws ErrnoException {
                this.a();
                return this.a.c(l8, byArray, 0, n8);
            }

            public void onRelease() {
                ax.l3.a a8 = this.a;
                if (a8 != null) {
                    a8.d();
                }
            }

            public int onWrite(long l8, int n8, byte[] byArray) throws ErrnoException {
                this.a();
                return (int)this.a.e(l8, byArray, 0, n8);
            }
        }, this.b);
    }
}

