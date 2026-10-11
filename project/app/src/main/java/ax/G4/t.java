/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.e;
import ax.G4.N;
import ax.G4.P;
import ax.G4.m0;
import ax.G4.q;
import ax.G4.s;
import ax.G4.v;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.w4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class t
extends P {
    protected final String f;
    protected final Date g;
    protected final Date h;
    protected final String i;
    protected final long j;
    protected final N k;
    protected final m0 l;
    protected final v m;
    protected final boolean n;
    protected final q o;
    protected final List<e> p;
    protected final Boolean q;
    protected final String r;
    protected final s s;

    public t(String object, String string, Date date, Date date2, String string2, long l8, String string3, String string4, String string5, String string6, N n8, m0 m02, v v8, boolean bl, q q8, List<e> list, Boolean bl2, String string7, s s8) {
        super((String)object, string3, string4, string5, string6);
        if (string != null) {
            if (string.length() >= 1) {
                this.f = string;
                if (date != null) {
                    this.g = ax.w4.d.b(date);
                    if (date2 != null) {
                        this.h = ax.w4.d.b(date2);
                        if (string2 != null) {
                            if (string2.length() >= 9) {
                                if (Pattern.matches("[0-9a-f]+", string2)) {
                                    this.i = string2;
                                    this.j = l8;
                                    this.k = n8;
                                    this.l = m02;
                                    this.m = v8;
                                    this.n = bl;
                                    this.o = q8;
                                    if (list != null) {
                                        object = list.iterator();
                                        while (object.hasNext()) {
                                            if ((e)object.next() != null) continue;
                                            throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                                        }
                                    }
                                    this.p = list;
                                    this.q = bl2;
                                    if (string7 != null) {
                                        if (string7.length() >= 64) {
                                            if (string7.length() > 64) {
                                                throw new IllegalArgumentException("String 'contentHash' is longer than 64");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
                                        }
                                    }
                                    this.r = string7;
                                    this.s = s8;
                                    return;
                                }
                                throw new IllegalArgumentException("String 'rev' does not match pattern");
                            }
                            throw new IllegalArgumentException("String 'rev' is shorter than 9");
                        }
                        throw new IllegalArgumentException("Required value for 'rev' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'serverModified' is null");
                }
                throw new IllegalArgumentException("Required value for 'clientModified' is null");
            }
            throw new IllegalArgumentException("String 'id' is shorter than 1");
        }
        throw new IllegalArgumentException("Required value for 'id' is null");
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return ax.G4.t$a.b.j(this, true);
    }

    public Date e() {
        return this.g;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (t)object;
            Object object2 = this.a;
            Object object3 = ((P)object).a;
            if ((object2 == object3 || ((String)object2).equals(object3)) && ((object2 = this.f) == (object3 = ((t)object).f) || ((String)object2).equals(object3)) && ((object3 = this.g) == (object2 = ((t)object).g) || ((Date)object3).equals(object2)) && ((object3 = this.h) == (object2 = ((t)object).h) || ((Date)object3).equals(object2)) && ((object3 = this.i) == (object2 = ((t)object).i) || ((String)object3).equals(object2)) && this.j == ((t)object).j && ((object2 = this.b) == (object3 = ((P)object).b) || object2 != null && ((String)object2).equals(object3)) && ((object3 = this.c) == (object2 = ((P)object).c) || object3 != null && ((String)object3).equals(object2)) && ((object2 = this.d) == (object3 = ((P)object).d) || object2 != null && ((String)object2).equals(object3)) && ((object2 = this.e) == (object3 = ((P)object).e) || object2 != null && ((String)object2).equals(object3)) && ((object2 = this.k) == (object3 = ((t)object).k) || object2 != null && ((N)object2).equals(object3)) && ((object3 = this.l) == (object2 = ((t)object).l) || object3 != null && ((m0)object3).equals(object2)) && ((object3 = this.m) == (object2 = ((t)object).m) || object3 != null && ((v)object3).equals(object2)) && this.n == ((t)object).n && ((object2 = this.o) == (object3 = ((t)object).o) || object2 != null && ((q)object2).equals(object3)) && ((object2 = this.p) == (object3 = ((t)object).p) || object2 != null && object2.equals(object3)) && ((object3 = this.q) == (object2 = ((t)object).q) || object3 != null && ((Boolean)object3).equals(object2)) && ((object2 = this.r) == (object3 = ((t)object).r) || object2 != null && ((String)object2).equals(object3)) && ((object2 = this.s) == (object = ((t)object).s) || object2 != null && ((s)object2).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.j;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s});
        return super.hashCode() * 31 + n8;
    }

    @Override
    public String toString() {
        return ax.G4.t$a.b.j(this, false);
    }

    static class a
    extends ax.v4.e<t> {
        public static final a b = new a();

        a() {
        }

        public t u(j j8, boolean bl) throws IOException, i {
            Object object;
            Object object2;
            Long l8;
            block32: {
                block31: {
                    l8 = null;
                    if (bl) break block31;
                    ax.v4.c.h(j8);
                    object = object2 = ax.v4.a.q(j8);
                    if (!"file".equals(object2)) break block32;
                }
                object = null;
            }
            if (object == null) {
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                CharSequence charSequence;
                CharSequence charSequence2;
                CharSequence charSequence3;
                CharSequence charSequence4;
                Boolean bl2 = Boolean.TRUE;
                String string = null;
                String string2 = null;
                object2 = object = string2;
                CharSequence charSequence5 = charSequence4 = (charSequence3 = (charSequence2 = (charSequence = object2)));
                Object object8 = object7 = (object6 = (object5 = (object4 = (object3 = charSequence5))));
                CharSequence charSequence6 = object8;
                Object object9 = charSequence6;
                while (j8.j() == ax.T4.m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("name".equals(string3)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("id".equals(string3)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("client_modified".equals(string3)) {
                        object = ax.v4.d.g().a(j8);
                        continue;
                    }
                    if ("server_modified".equals(string3)) {
                        object2 = ax.v4.d.g().a(j8);
                        continue;
                    }
                    if ("rev".equals(string3)) {
                        charSequence = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("size".equals(string3)) {
                        l8 = ax.v4.d.i().a(j8);
                        continue;
                    }
                    if ("path_lower".equals(string3)) {
                        charSequence2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("path_display".equals(string3)) {
                        charSequence3 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("parent_shared_folder_id".equals(string3)) {
                        charSequence4 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("preview_url".equals(string3)) {
                        charSequence5 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("media_info".equals(string3)) {
                        object3 = ax.v4.d.d(N.b.b).a(j8);
                        continue;
                    }
                    if ("symlink_info".equals(string3)) {
                        object4 = ax.v4.d.e(m0.a.b).a(j8);
                        continue;
                    }
                    if ("sharing_info".equals(string3)) {
                        object5 = ax.v4.d.e(v.a.b).a(j8);
                        continue;
                    }
                    if ("is_downloadable".equals(string3)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("export_info".equals(string3)) {
                        object6 = ax.v4.d.e(q.a.b).a(j8);
                        continue;
                    }
                    if ("property_groups".equals(string3)) {
                        object7 = ax.v4.d.d(ax.v4.d.c(e.a.b)).a(j8);
                        continue;
                    }
                    if ("has_explicit_shared_members".equals(string3)) {
                        object8 = ax.v4.d.d(ax.v4.d.a()).a(j8);
                        continue;
                    }
                    if ("content_hash".equals(string3)) {
                        charSequence6 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("file_lock_info".equals(string3)) {
                        object9 = ax.v4.d.e(s.a.b).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    if (string2 != null) {
                        if (object != null) {
                            if (object2 != null) {
                                if (charSequence != null) {
                                    if (l8 != null) {
                                        object = new t(string, string2, (Date)object, (Date)object2, (String)charSequence, l8, (String)charSequence2, (String)charSequence3, (String)charSequence4, (String)charSequence5, (N)object3, (m0)object4, (v)object5, bl2, (q)object6, (List<e>)object7, (Boolean)object8, (String)charSequence6, (s)object9);
                                        if (!bl) {
                                            ax.v4.c.e(j8);
                                        }
                                        ax.v4.b.a(object, ((t)object).d());
                                        return object;
                                    }
                                    throw new i(j8, "Required field \"size\" missing.");
                                }
                                throw new i(j8, "Required field \"rev\" missing.");
                            }
                            throw new i(j8, "Required field \"server_modified\" missing.");
                        }
                        throw new i(j8, "Required field \"client_modified\" missing.");
                    }
                    throw new i(j8, "Required field \"id\" missing.");
                }
                throw new i(j8, "Required field \"name\" missing.");
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No subtype found that matches tag: \"");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\"");
            throw new i(j8, ((StringBuilder)object2).toString());
        }

        public void v(t t8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            this.r("file", g8);
            g8.o("name");
            ax.v4.d.f().k(t8.a, g8);
            g8.o("id");
            ax.v4.d.f().k(t8.f, g8);
            g8.o("client_modified");
            ax.v4.d.g().k(t8.g, g8);
            g8.o("server_modified");
            ax.v4.d.g().k(t8.h, g8);
            g8.o("rev");
            ax.v4.d.f().k(t8.i, g8);
            g8.o("size");
            ax.v4.d.i().k(t8.j, g8);
            if (t8.b != null) {
                g8.o("path_lower");
                ax.v4.d.d(ax.v4.d.f()).k(t8.b, g8);
            }
            if (t8.c != null) {
                g8.o("path_display");
                ax.v4.d.d(ax.v4.d.f()).k(t8.c, g8);
            }
            if (t8.d != null) {
                g8.o("parent_shared_folder_id");
                ax.v4.d.d(ax.v4.d.f()).k(t8.d, g8);
            }
            if (t8.e != null) {
                g8.o("preview_url");
                ax.v4.d.d(ax.v4.d.f()).k(t8.e, g8);
            }
            if (t8.k != null) {
                g8.o("media_info");
                ax.v4.d.d(N.b.b).k(t8.k, g8);
            }
            if (t8.l != null) {
                g8.o("symlink_info");
                ax.v4.d.e(m0.a.b).k(t8.l, g8);
            }
            if (t8.m != null) {
                g8.o("sharing_info");
                ax.v4.d.e(v.a.b).k(t8.m, g8);
            }
            g8.o("is_downloadable");
            ax.v4.d.a().k(t8.n, g8);
            if (t8.o != null) {
                g8.o("export_info");
                ax.v4.d.e(q.a.b).k(t8.o, g8);
            }
            if (t8.p != null) {
                g8.o("property_groups");
                ax.v4.d.d(ax.v4.d.c(e.a.b)).k(t8.p, g8);
            }
            if (t8.q != null) {
                g8.o("has_explicit_shared_members");
                ax.v4.d.d(ax.v4.d.a()).k(t8.q, g8);
            }
            if (t8.r != null) {
                g8.o("content_hash");
                ax.v4.d.d(ax.v4.d.f()).k(t8.r, g8);
            }
            if (t8.s != null) {
                g8.o("file_lock_info");
                ax.v4.d.e(s.a.b).k(t8.s, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}

