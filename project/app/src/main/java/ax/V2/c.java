/*
 * Decompiled with CFR 0.152.
 */
package ax.V2;

import ax.Z2.p;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.b;
import com.voxdon.xplorer.file.n;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class c {
    private static Map<K, c> c = new HashMap<K, c>();
    private Stack<a> a = new Stack();
    private final K b;

    protected c(K k8) {
        this.b = k8;
    }

    public static c d(K k8) {
        if (!c.containsKey(k8)) {
            c.put(k8, new c(k8));
        }
        return c.get(k8);
    }

    public void a() {
        ((AbstractCollection)this.a).clear();
    }

    public n b(String object) {
        if ((object = this.c((String)object)) == null) {
            return null;
        }
        return ((a)object).a;
    }

    public a c(String string) {
        if (!d0.B(string)) {
            ax.Ha.c.h().d("INVALID PATH FIND HISTORY").j().g(string).h();
            return null;
        }
        Object object = this.a;
        object = ((AbstractList)object).listIterator(((AbstractCollection)object).size());
        while (object.hasPrevious()) {
            a a8 = (a)object.previous();
            n n8 = a8.a;
            if (n8 == null || !d0.G(string, n8.E())) continue;
            return a8;
        }
        return null;
    }

    public a e() {
        if (!this.a.empty()) {
            return this.a.pop();
        }
        return null;
    }

    public void f(n n8, int n9, int n10) {
        a a8 = new a(n8, n9, n10);
        if (n8 != null && (this.a.empty() || !this.a.peek().equals(a8))) {
            this.a.push(a8);
            if (((AbstractCollection)this.a).size() > 16) {
                ((AbstractList)this.a).remove(0);
            }
        }
    }

    public void g(String string, n comparable, String string2, String object, p p8, String string3, int n8, int n9) {
        if (this.a.empty()) {
            if (string == null) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("searchPath 1:");
                ((StringBuilder)comparable).append(string2);
                ((StringBuilder)comparable).append(",");
                ((StringBuilder)comparable).append(string);
                ax.u3.b.g(((StringBuilder)comparable).toString());
                return;
            }
            if (string2 != null && !string2.equals(string)) {
                return;
            }
            if (comparable == null) {
                object = ax.Ha.c.h().f().b("HistoryManager SearchPath 2");
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("path:");
                ((StringBuilder)comparable).append(string2);
                ((StringBuilder)comparable).append(",");
                ((StringBuilder)comparable).append(string);
                ((ax.Ha.b)object).g(((StringBuilder)comparable).toString()).h();
                return;
            }
            this.f((n)comparable, 0, 0);
        }
        this.a.peek().k(string2, (String)object, p8, string3, n8, n9);
    }

    public static class a {
        n a;
        int b;
        int c;
        String d;
        String e;
        int f;
        int g;
        p h;
        String i;

        a(n n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }

        public n a() {
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

        public boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            a a8 = (a)object;
            n n8 = this.a;
            if (n8 != null) {
                return n8.compareTo(a8.a) == 0;
            }
            return super.equals(object);
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
            return this.d != null && this.e != null;
        }

        public void k(String string, String string2, p p8, String string3, int n8, int n9) {
            this.e = string;
            this.d = string2;
            this.f = n8;
            this.g = n9;
            this.h = p8;
            this.i = string3;
        }
    }
}

