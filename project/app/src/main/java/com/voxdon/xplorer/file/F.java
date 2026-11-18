/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.L9.a;
import ax.M9.d;
import ax.M9.e;
import ax.N9.e0;
import ax.P9.b;
import ax.P9.k;
import ax.P9.n;
import ax.S9.c;
import ax.b3.j;
import com.voxdon.xplorer.file.E;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class F {
    private final E.a a;
    private final int b;
    private final ax.u3.c c;
    ax.L9.e d;
    int e;
    long f;
    private final b g;
    private final int h;
    private int i;

    public F(String object, e0 e02, List<c> list, E.a a8, int n8, ax.u3.c c8, int n9, int n10, long l8, ax.L9.e e8) {
        this.a = a8;
        this.b = n8;
        this.c = c8;
        this.d = e8;
        this.f = l8;
        this.e = n10;
        this.i = 0;
        this.h = n9;
        this.g = object = new b(this, (String)object, e02, list, ax.N9.e.class){
            final F i;
            {
                this.i = f8;
                super(string, f9, list, clazz);
            }
        };
        ((b)object).t(k.f0);
        ((b)object).k("Content-Range", String.format(Locale.US, "bytes %1$d-%2$d/%3$d", n10, n10 + n8 - 1, l8));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <UploadType> ax.N9.e a(a<UploadType> object) throws j {
        Object object2 = null;
        while (true) {
            Object object3;
            block16: {
                int n8 = ++this.i;
                object3 = object2;
                if (n8 < this.h) {
                    long l8 = n8 * 2000 * n8;
                    try {
                        Thread.sleep(l8);
                    }
                    catch (InterruptedException interruptedException) {
                        this.g.m().a().b("Exception while waiting upload file retry", interruptedException);
                    }
                    Object object4 = new ax.L9.e(this){
                        final F a;
                        {
                            this.a = f8;
                        }

                        @Override
                        public void a(long l8, long l9) {
                            F f8 = this.a;
                            ax.L9.e e8 = f8.d;
                            if (e8 != null) {
                                e8.a((long)f8.e + l8, f8.f);
                            }
                        }

                        @Override
                        public void b(d d8) {
                        }

                        @Override
                        public void c(Object object) {
                        }
                    };
                    try {
                        n n9 = this.g.m().b();
                        b b8 = this.g;
                        object3 = new OneDriveFileHelper.i(this.a.b, this.b, this.c, (ax.L9.e)object4);
                        object4 = n9.c(b8, ax.N9.e.class, object3, object);
                        object3 = object2;
                    }
                    catch (d d8) {
                        this.g.m().a().a("Request failed with, retry if necessary.");
                        object4 = null;
                    }
                    if (object4 != null && ((ax.N9.e)object4).a()) {
                        return object4;
                    }
                    object2 = object3;
                    if (object4 != null) {
                        object2 = object3;
                        if (((ax.N9.e)object4).d()) {
                            object2 = ((ax.N9.e)object4).b();
                        }
                    }
                    if ((object3 = this.c) != null && object3.isCancelled()) {
                        object3 = object2;
                    } else if (!this.a.a.a()) {
                        object3 = object2;
                    } else {
                        this.a.b.close();
                        break block16;
                    }
                }
                if (object3 != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Upload session failed too many times (");
                    ((StringBuilder)object).append(((Throwable)object3).getMessage());
                    ((StringBuilder)object).append(")");
                    object = ((StringBuilder)object).toString();
                    return new ax.N9.e(new d((String)object, (Throwable)object3, ax.M9.e.j1));
                }
                object = "Upload session failed too many times.";
                return new ax.N9.e(new d((String)object, (Throwable)object3, ax.M9.e.j1));
                catch (IOException iOException) {}
            }
            object3 = this.a;
            ((E.a)object3).b = ((E.a)object3).a.c(this.e);
        }
    }
}

