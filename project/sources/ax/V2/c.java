package ax.V2;

import ax.Z2.p;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public class c {
    private static Map<K, c> c = new HashMap();
    private Stack<a> a = new Stack<>();
    private final K b;

    public static class a {
        AbstractC3595n a;
        int b;
        int c;
        String d;
        String e;
        int f;
        int g;
        p h;
        String i;

        a(AbstractC3595n abstractC3595n, int i, int i2) {
            this.a = abstractC3595n;
            this.b = i;
            this.c = i2;
        }

        public AbstractC3595n a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public p c() {
            return this.h;
        }

        public int d() {
            return this.f;
        }

        public String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            AbstractC3595n abstractC3595n = this.a;
            return abstractC3595n != null ? abstractC3595n.compareTo(aVar.a) == 0 : super.equals(obj);
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.g;
        }

        public String h() {
            return this.i;
        }

        public int i() {
            return this.c;
        }

        public boolean j() {
            return (this.d == null || this.e == null) ? false : true;
        }

        public void k(String str, String str2, p pVar, String str3, int i, int i2) {
            this.e = str;
            this.d = str2;
            this.f = i;
            this.g = i2;
            this.h = pVar;
            this.i = str3;
        }
    }

    protected c(K k) {
        this.b = k;
    }

    public static c d(K k) {
        if (!c.containsKey(k)) {
            c.put(k, new c(k));
        }
        return c.get(k);
    }

    public void a() {
        this.a.clear();
    }

    public AbstractC3595n b(String str) {
        a c2 = c(str);
        if (c2 == null) {
            return null;
        }
        return c2.a;
    }

    public a c(String str) {
        if (!d0.B(str)) {
            ax.Ha.c.h().d("INVALID PATH FIND HISTORY").j().g(str).h();
            return null;
        }
        Stack<a> stack = this.a;
        ListIterator<a> listIterator = stack.listIterator(stack.size());
        while (listIterator.hasPrevious()) {
            a previous = listIterator.previous();
            AbstractC3595n abstractC3595n = previous.a;
            if (abstractC3595n != null && d0.G(str, abstractC3595n.E())) {
                return previous;
            }
        }
        return null;
    }

    public a e() {
        if (this.a.empty()) {
            return null;
        }
        return this.a.pop();
    }

    public void f(AbstractC3595n abstractC3595n, int i, int i2) {
        a aVar = new a(abstractC3595n, i, i2);
        if (abstractC3595n != null) {
            if (this.a.empty() || !this.a.peek().equals(aVar)) {
                this.a.push(aVar);
                if (this.a.size() > 16) {
                    this.a.remove(0);
                }
            }
        }
    }

    public void g(String str, AbstractC3595n abstractC3595n, String str2, String str3, p pVar, String str4, int i, int i2) {
        if (this.a.empty()) {
            if (str == null) {
                C3184b.g("searchPath 1:" + str2 + "," + str);
                return;
            }
            if (str2 != null && !str2.equals(str)) {
                return;
            }
            if (abstractC3595n == null) {
                ax.Ha.c.h().f().b("HistoryManager SearchPath 2").g("path:" + str2 + "," + str).h();
                return;
            }
            f(abstractC3595n, 0, 0);
        }
        this.a.peek().k(str2, str3, pVar, str4, i, i2);
    }
}
