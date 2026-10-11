package com.voxdon.xplorer.service;

import android.content.Context;
import android.net.Uri;
import ax.Ha.c;
import ax.Q2.f;
import ax.Q2.g;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.o3.C2686c;
import ax.o3.h;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class b {
    private static final Logger g = g.a(b.class);
    private static b h;
    private Context a;
    private C2686c b;
    private int c = -1;
    private CopyOnWriteArrayList<C3596o> d = new CopyOnWriteArrayList<>();
    private CopyOnWriteArraySet<a> e = new CopyOnWriteArraySet<>();
    private CopyOnWriteArraySet<String> f = new CopyOnWriteArraySet<>();

    interface a {
        void a(int i);
    }

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
        return "http".equals(uri.getScheme()) && "127.0.0.1".equals(uri.getHost()) && f(context).h() == uri.getPort();
    }

    private void p() throws IOException {
        try {
            C2686c c2686c = new C2686c(this, h());
            this.b = c2686c;
            c2686c.u(5000, false);
        } catch (IOException e) {
            c.h().d("HTTP SERVER START FAILED").l(e).g("port:" + this.c).h();
            this.b = null;
            this.c = -1;
            throw new IOException(e);
        }
    }

    private void q() {
        C2686c c2686c = this.b;
        if (c2686c != null) {
            c2686c.v();
            this.b = null;
        }
        this.c = -1;
        this.e.clear();
    }

    public boolean a(String str) {
        return this.f.add(d0.t(str));
    }

    public void b(List<AbstractC3595n> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d0.p(it.next().Q()));
        }
        this.f.addAll(arrayList);
    }

    public boolean c(AbstractC3595n abstractC3595n) {
        return this.f.add(d0.p(abstractC3595n.Q()));
    }

    public void d(a aVar) {
        if (this.e.contains(aVar)) {
            return;
        }
        this.e.add(aVar);
    }

    public synchronized void e(C3596o c3596o) {
        if (this.b == null) {
            try {
                try {
                    p();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                p();
            }
        }
        c3596o.n0();
        this.d.add(c3596o);
        g.fine("Http server operator added : " + c3596o.S().I() + ":" + c3596o.y() + ",port:" + this.c);
    }

    public synchronized C3596o g(f fVar, int i) {
        Iterator<C3596o> it = this.d.iterator();
        while (it.hasNext()) {
            C3596o next = it.next();
            if (next.S() == fVar && next.y() == i) {
                return next;
            }
        }
        return null;
    }

    public int h() {
        if (this.c < 0) {
            this.c = h.d(this.a);
        }
        return this.c;
    }

    public synchronized boolean i() {
        return this.d.size() != 0;
    }

    public boolean j(String str) {
        Iterator<String> it = this.f.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public void l(boolean z, K k) {
        g.fine("Keep Http Server : " + k);
        C3596o e = C1835x.e(k);
        if (z) {
            e(e);
        } else {
            o(e);
        }
    }

    public void m(int i) {
        g.fine("runner count changed : " + i);
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    public void n(a aVar) {
        this.e.remove(aVar);
    }

    public synchronized void o(C3596o c3596o) {
        if (this.b == null) {
            C3184b.f();
            return;
        }
        if (this.d.remove(c3596o)) {
            c3596o.k0(false);
            g.fine("Http server operator removed : " + c3596o.S().I() + ":" + c3596o.y() + ",port:" + this.c);
        }
        if (!i()) {
            q();
        }
    }
}
