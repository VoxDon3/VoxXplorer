/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.X2.Q;
import ax.b3.j;
import ax.u3.q;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class f
extends q<Void, Void, Void> {
    o h;
    private int i;
    private int j;
    private long k;
    private long l;
    private b m;
    private List<n> n;
    private Map<String, a> o = new HashMap<String, a>();
    private boolean p;
    private c q;

    public f(c c8, o o8, List<n> list, boolean bl, b b8) {
        super(q.e.f0);
        this.q = c8;
        this.h = o8;
        this.m = b8;
        this.n = list;
        this.p = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A(n n8, a a8) throws ax.b3.a {
        Stack<n> stack = new Stack<n>();
        stack.push(n8);
        block2: while (!((AbstractCollection)stack).isEmpty()) {
            n8 = (n)stack.pop();
            if (this.isCancelled()) {
                throw new ax.b3.a();
            }
            boolean bl = this.q == c.q ? n8.l() ^ true : true;
            if (n8.isDirectory() && bl) {
                ++this.i;
                ++a8.a;
                this.z();
                try {
                    Iterator<n> iterator = this.h.f0(n8).iterator();
                    while (true) {
                        if (!iterator.hasNext()) continue block2;
                        n8 = iterator.next();
                        if (this.p && J.j2(n8)) continue;
                        stack.push(n8);
                    }
                }
                catch (j j8) {}
                j8.printStackTrace();
                continue;
            }
            long l8 = n8.p();
            ++this.j;
            ++a8.b;
            this.k += l8;
            a8.c += l8;
            this.z();
        }
        return;
    }

    private void z() {
        long l8 = System.currentTimeMillis();
        if (l8 - this.l > 100L) {
            this.l = l8;
            this.v(new Void[0]);
        }
    }

    @Override
    protected void o() {
        this.h.k0(false);
    }

    @Override
    protected void r() {
        this.h.n0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Void w(Void ... object) {
        Object object2;
        o o8 = this.h;
        if (o8 != null && !o8.a() && this.h.S() != ax.Q2.f.H0 && this.h.S() != ax.Q2.f.I0) {
            ax.Ha.b b8 = ax.Ha.c.h().f().b("DIRECTORY SCAN DISCONNECTED");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("location:");
            ((StringBuilder)object2).append((Object)this.h.S());
            ((StringBuilder)object2).append(",scanType:");
            ((StringBuilder)object2).append((Object)this.q);
            b8.g(((StringBuilder)object2).toString()).h();
        }
        try {
            object2 = this.n.iterator();
            while (true) {
                boolean bl;
                if (!object2.hasNext()) {
                    this.v(new Void[0]);
                    return null;
                }
                n n8 = object2.next();
                if (Q.P1() && (bl = n8 instanceof y)) {
                    try {
                        ((y)n8).t1();
                    }
                    catch (IOException iOException) {}
                }
                n8.n();
                a a8 = new a();
                this.A(n8, a8);
                this.o.put(n8.Q(), a8);
            }
        }
        catch (ax.b3.a a9) {
            return null;
        }
    }

    protected void x(Void void_) {
        this.h.k0(false);
        this.m.a(this.i, this.j, this.k, this.o);
    }

    protected void y(Void ... voidArray) {
        this.m.b(this.i, this.j, this.k);
    }

    public static class a {
        public int a;
        public int b;
        public long c;
    }

    public static interface b {
        public void a(int var1, int var2, long var3, Map<String, a> var5);

        public void b(int var1, int var2, long var3);
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }
}

