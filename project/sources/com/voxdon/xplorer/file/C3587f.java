package com.voxdon.xplorer.file;

import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.u3.AbstractC3199q;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.voxdon.xplorer.file.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3587f extends AbstractC3199q<Void, Void, Void> {
    C3596o h;
    private int i;
    private int j;
    private long k;
    private long l;
    private b m;
    private List<AbstractC3595n> n;
    private Map<String, a> o;
    private boolean p;
    private c q;

    /* renamed from: com.voxdon.xplorer.file.f$a */
    public static class a {
        public int a;
        public int b;
        public long c;
    }

    /* renamed from: com.voxdon.xplorer.file.f$b */
    public interface b {
        void a(int i, int i2, long j, Map<String, a> map);

        void b(int i, int i2, long j);
    }

    /* renamed from: com.voxdon.xplorer.file.f$c */
    public enum c {
        DELETE,
        PROPERTIES
    }

    public C3587f(c cVar, C3596o c3596o, List<AbstractC3595n> list, boolean z, b bVar) {
        super(AbstractC3199q.e.NORMAL);
        this.o = new HashMap();
        this.q = cVar;
        this.h = c3596o;
        this.m = bVar;
        this.n = list;
        this.p = z;
    }

    private void A(AbstractC3595n abstractC3595n, a aVar) throws C1486a {
        Stack stack = new Stack();
        stack.push(abstractC3595n);
        while (!stack.isEmpty()) {
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
            if (isCancelled()) {
                throw new C1486a();
            }
            boolean z = this.q == c.DELETE ? !abstractC3595n2.l() : true;
            if (abstractC3595n2.isDirectory() && z) {
                this.i++;
                aVar.a++;
                z();
                try {
                    for (AbstractC3595n abstractC3595n3 : this.h.f0(abstractC3595n2)) {
                        if (!this.p || !J.j2(abstractC3595n3)) {
                            stack.push(abstractC3595n3);
                        }
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            } else {
                long p = abstractC3595n2.p();
                this.j++;
                aVar.b++;
                this.k += p;
                aVar.c += p;
                z();
            }
        }
    }

    private void z() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.l > 100) {
            this.l = currentTimeMillis;
            v(new Void[0]);
        }
    }

    @Override // ax.u3.AbstractC3199q
    protected void o() {
        this.h.k0(false);
    }

    @Override // ax.u3.AbstractC3199q
    protected void r() {
        this.h.n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Void g(Void... voidArr) {
        C3596o c3596o = this.h;
        if (c3596o != null && !c3596o.a() && this.h.S() != ax.Q2.f.H0 && this.h.S() != ax.Q2.f.I0) {
            ax.Ha.c.h().f().b("DIRECTORY SCAN DISCONNECTED").g("location:" + this.h.S() + ",scanType:" + this.q).h();
        }
        try {
            for (AbstractC3595n abstractC3595n : this.n) {
                if (ax.X2.Q.P1() && (abstractC3595n instanceof C3605y)) {
                    try {
                        ((C3605y) abstractC3595n).t1();
                    } catch (IOException unused) {
                    }
                }
                abstractC3595n.n();
                a aVar = new a();
                A(abstractC3595n, aVar);
                this.o.put(abstractC3595n.Q(), aVar);
            }
            v(new Void[0]);
            return null;
        } catch (C1486a unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void q(Void r8) {
        this.h.k0(false);
        this.m.a(this.i, this.j, this.k, this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(Void... voidArr) {
        this.m.b(this.i, this.j, this.k);
    }
}
