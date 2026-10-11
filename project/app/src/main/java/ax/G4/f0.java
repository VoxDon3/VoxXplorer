/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.g0;
import ax.G4.r;
import ax.G4.w;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class f0 {
    protected final String a;
    protected final long b;
    protected final g0 c;
    protected final w d;
    protected final boolean e;
    protected final List<String> f;
    protected final List<r> g;
    protected final String h;

    public f0() {
        this(null, 100L, null, w.q, false, null, null, null);
    }

    public f0(String iterator, long l8, g0 g02, w w8, boolean bl, List<String> list, List<r> list2, String string) {
        if (iterator != null && !Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", (CharSequence)((Object)iterator))) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = iterator;
        if (l8 >= 1L) {
            if (l8 <= 1000L) {
                this.b = l8;
                this.c = g02;
                if (w8 != null) {
                    this.d = w8;
                    this.e = bl;
                    if (list != null) {
                        iterator = list.iterator();
                        while (iterator.hasNext()) {
                            if ((String)iterator.next() != null) continue;
                            throw new IllegalArgumentException("An item in list 'fileExtensions' is null");
                        }
                    }
                    this.f = list;
                    if (list2 != null) {
                        iterator = list2.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next() != null) continue;
                            throw new IllegalArgumentException("An item in list 'fileCategories' is null");
                        }
                    }
                    this.g = list2;
                    if (string != null) {
                        if (string.length() >= 40) {
                            if (string.length() > 40) {
                                throw new IllegalArgumentException("String 'accountId' is longer than 40");
                            }
                        } else {
                            throw new IllegalArgumentException("String 'accountId' is shorter than 40");
                        }
                    }
                    this.h = string;
                    return;
                }
                throw new IllegalArgumentException("Required value for 'fileStatus' is null");
            }
            throw new IllegalArgumentException("Number 'maxResults' is larger than 1000L");
        }
        throw new IllegalArgumentException("Number 'maxResults' is smaller than 1L");
    }

    public static a a() {
        return new a();
    }

    public String b() {
        return ax.G4.f0$b.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (f0)object;
            Object object2 = this.a;
            Object object3 = ((f0)object).a;
            if ((object2 == object3 || object2 != null && ((String)object2).equals(object3)) && this.b == ((f0)object).b && ((object2 = this.c) == (object3 = ((f0)object).c) || object2 != null && object2.equals(object3)) && ((object2 = this.d) == (object3 = ((f0)object).d) || object2.equals(object3)) && this.e == ((f0)object).e && ((object2 = this.f) == (object3 = ((f0)object).f) || object2 != null && object2.equals(object3)) && ((object2 = this.g) == (object3 = ((f0)object).g) || object2 != null && object2.equals(object3)) && ((object3 = this.h) == (object = ((f0)object).h) || object3 != null && ((String)object3).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    public String toString() {
        return ax.G4.f0$b.b.j(this, false);
    }

    public static class a {
        protected String a = null;
        protected long b = 100L;
        protected g0 c = null;
        protected w d = w.q;
        protected boolean e = false;
        protected List<String> f = null;
        protected List<r> g = null;
        protected String h = null;

        protected a() {
        }

        public f0 a() {
            return new f0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a b(Boolean bl) {
            if (bl != null) {
                this.e = bl;
                return this;
            }
            this.e = false;
            return this;
        }

        public a c(Long l8) {
            if (l8 >= 1L) {
                if (l8 <= 1000L) {
                    this.b = l8;
                    return this;
                }
                throw new IllegalArgumentException("Number 'maxResults' is larger than 1000L");
            }
            throw new IllegalArgumentException("Number 'maxResults' is smaller than 1L");
        }

        public a d(String string) {
            if (string != null && !Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", string)) {
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            this.a = string;
            return this;
        }
    }

    static class b
    extends e<f0> {
        public static final b b = new b();

        b() {
        }

        public f0 u(j j8, boolean bl) throws IOException, i {
            List<String> list;
            if (!bl) {
                ax.v4.c.h(j8);
                list = ax.v4.a.q(j8);
            } else {
                list = null;
            }
            if (list == null) {
                Long l8 = 100L;
                w w8 = w.q;
                Boolean bl2 = Boolean.FALSE;
                String string = null;
                g0 g02 = null;
                list = g02;
                Object object = list;
                String string2 = object;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("path".equals(string3)) {
                        string = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("max_results".equals(string3)) {
                        l8 = ax.v4.d.i().a(j8);
                        continue;
                    }
                    if ("order_by".equals(string3)) {
                        g02 = ax.v4.d.d(g0.b.b).a(j8);
                        continue;
                    }
                    if ("file_status".equals(string3)) {
                        w8 = w.b.b.s(j8);
                        continue;
                    }
                    if ("filename_only".equals(string3)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("file_extensions".equals(string3)) {
                        list = ax.v4.d.d(ax.v4.d.c(ax.v4.d.f())).a(j8);
                        continue;
                    }
                    if ("file_categories".equals(string3)) {
                        object = ax.v4.d.d(ax.v4.d.c(r.b.b)).a(j8);
                        continue;
                    }
                    if ("account_id".equals(string3)) {
                        string2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                list = new f0(string, l8, g02, w8, bl2, list, (List<r>)object, string2);
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(list, ((f0)((Object)list)).b());
                return list;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)((Object)list));
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(f0 f02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            if (f02.a != null) {
                g8.o("path");
                ax.v4.d.d(ax.v4.d.f()).k(f02.a, g8);
            }
            g8.o("max_results");
            ax.v4.d.i().k(f02.b, g8);
            if (f02.c != null) {
                g8.o("order_by");
                ax.v4.d.d(g0.b.b).k(f02.c, g8);
            }
            g8.o("file_status");
            w.b.b.t(f02.d, g8);
            g8.o("filename_only");
            ax.v4.d.a().k(f02.e, g8);
            if (f02.f != null) {
                g8.o("file_extensions");
                ax.v4.d.d(ax.v4.d.c(ax.v4.d.f())).k(f02.f, g8);
            }
            if (f02.g != null) {
                g8.o("file_categories");
                ax.v4.d.d(ax.v4.d.c(r.b.b)).k(f02.g, g8);
            }
            if (f02.h != null) {
                g8.o("account_id");
                ax.v4.d.d(ax.v4.d.f()).k(f02.h, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

