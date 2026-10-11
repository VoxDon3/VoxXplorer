/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.service;

import android.content.Context;
import android.net.Uri;
import ax.Ha.c;
import ax.Q2.f;
import ax.Q2.g;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.x;
import ax.o3.h;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

public class b {
    private static final Logger g = ax.Q2.g.a(b.class);
    private static b h;
    private Context a;
    private ax.o3.c b;
    private int c = -1;
    private CopyOnWriteArrayList<o> d = new CopyOnWriteArrayList();
    private CopyOnWriteArraySet<a> e = new CopyOnWriteArraySet();
    private CopyOnWriteArraySet<String> f = new CopyOnWriteArraySet();

    private b(Context context) {
        this.a = context.getApplicationContext();
    }

    public static b f(Context context) {
        if (h == null) {
            h = new b(context);
        }
        return h;
    }

    public static boolean k(Context context, Uri uri) {
        int n8 = com.alphainventor.filemanager.service.b.f(context).h();
        return "http".equals(uri.getScheme()) && "127.0.0.1".equals(uri.getHost()) && n8 == uri.getPort();
    }

    private void p() throws IOException {
        try {
            ax.o3.c c8;
            this.b = c8 = new ax.o3.c(this, this.h());
            c8.u(5000, false);
            return;
        }
        catch (IOException iOException) {
            ax.Ha.b b8 = ax.Ha.c.h().d("HTTP SERVER START FAILED").l(iOException);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("port:");
            stringBuilder.append(this.c);
            b8.g(stringBuilder.toString()).h();
            this.b = null;
            this.c = -1;
            throw new IOException(iOException);
        }
    }

    private void q() {
        ax.o3.c c8 = this.b;
        if (c8 != null) {
            c8.v();
            this.b = null;
        }
        this.c = -1;
        this.e.clear();
    }

    public boolean a(String string) {
        string = d0.t(string);
        return this.f.add(string);
    }

    public void b(List<n> object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(d0.p(((n)object.next()).Q()));
        }
        this.f.addAll(arrayList);
    }

    public boolean c(n object) {
        object = d0.p(((n)object).Q());
        return this.f.add((String)object);
    }

    public void d(a a8) {
        if (!this.e.contains(a8)) {
            this.e.add(a8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(o o8) {
        synchronized (this) {
            try {
                Object object = this.b;
                if (object == null) {
                    try {
                        this.p();
                    }
                    catch (IOException iOException) {
                        try {
                            this.p();
                        }
                        catch (IOException iOException2) {}
                    }
                }
                o8.n0();
                this.d.add(o8);
                Logger logger = g;
                object = new StringBuilder();
                ((StringBuilder)object).append("Http server operator added : ");
                ((StringBuilder)object).append(o8.S().I());
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(o8.y());
                ((StringBuilder)object).append(",port:");
                ((StringBuilder)object).append(this.c);
                logger.fine(((StringBuilder)object).toString());
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public o g(f f8, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    o o82;
                    block5: {
                        try {
                            for (o o82 : this.d) {
                                int n9;
                                if (o82.S() != f8 || (n9 = o82.y()) != n8) continue;
                                break block5;
                            }
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    return o82;
                }
                return null;
            }
            throw throwable2;
        }
    }

    public int h() {
        if (this.c < 0) {
            this.c = ax.o3.h.d(this.a);
        }
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean i() {
        synchronized (this) {
            int n8 = this.d.size();
            if (n8 == 0) return false;
            return true;
        }
    }

    public boolean j(String string) {
        Iterator<String> iterator = this.f.iterator();
        while (iterator.hasNext()) {
            if (!string.startsWith(iterator.next())) continue;
            return true;
        }
        return false;
    }

    public void l(boolean bl, K object) {
        Logger logger = g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keep Http Server : ");
        stringBuilder.append(object);
        logger.fine(stringBuilder.toString());
        object = x.e((K)object);
        if (bl) {
            this.e((o)object);
            return;
        }
        this.o((o)object);
    }

    public void m(int n8) {
        Logger logger = g;
        Object object = new StringBuilder();
        ((StringBuilder)object).append("runner count changed : ");
        ((StringBuilder)object).append(n8);
        logger.fine(((StringBuilder)object).toString());
        object = this.e.iterator();
        while (object.hasNext()) {
            ((a)object.next()).a(n8);
        }
    }

    public void n(a a8) {
        this.e.remove(a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void o(o o8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.b == null) {
                        ax.u3.b.f();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (this.d.remove(o8)) {
                    o8.k0(false);
                    Logger logger = g;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Http server operator removed : ");
                    stringBuilder.append(o8.S().I());
                    stringBuilder.append(":");
                    stringBuilder.append(o8.y());
                    stringBuilder.append(",port:");
                    stringBuilder.append(this.c);
                    logger.fine(stringBuilder.toString());
                }
                if (!this.i()) {
                    this.q();
                }
                return;
            }
            throw throwable2;
        }
    }

    static interface a {
        public void a(int var1);
    }
}

