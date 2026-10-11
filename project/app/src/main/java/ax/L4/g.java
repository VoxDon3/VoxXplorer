/*
 * Decompiled with CFR 0.152.
 */
package ax.L4;

import ax.L4.a;
import ax.L4.c;
import ax.L4.d;
import ax.L4.e;
import ax.L4.f;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import java.io.IOException;
import java.util.Arrays;

public class g {
    protected final e a;
    protected final d b;
    protected final f c;
    protected final ax.L4.a d;
    protected final c e;

    public g(e e8, d d8, f f8, ax.L4.a a8, c c8) {
        if (e8 != null) {
            this.a = e8;
            if (d8 != null) {
                this.b = d8;
                if (f8 != null) {
                    this.c = f8;
                    if (a8 != null) {
                        this.d = a8;
                        if (c8 != null) {
                            this.e = c8;
                            return;
                        }
                        throw new IllegalArgumentException("Required value for 'sharedFolderLinkRestrictionPolicy' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'groupCreationPolicy' is null");
                }
                throw new IllegalArgumentException("Required value for 'sharedLinkCreatePolicy' is null");
            }
            throw new IllegalArgumentException("Required value for 'sharedFolderJoinPolicy' is null");
        }
        throw new IllegalArgumentException("Required value for 'sharedFolderMemberPolicy' is null");
    }

    public String a() {
        return ax.L4.g$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (g)object;
            Enum enum_ = this.a;
            Enum enum_2 = ((g)object).a;
            return !(enum_ != enum_2 && !enum_.equals(enum_2) || (enum_2 = this.b) != (enum_ = ((g)object).b) && !enum_2.equals(enum_) || (enum_ = this.c) != (enum_2 = ((g)object).c) && !enum_.equals(enum_2) || (enum_ = this.d) != (enum_2 = ((g)object).d) && !enum_.equals(enum_2) || (enum_2 = this.e) != (object = ((g)object).e) && !enum_2.equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return ax.L4.g$a.b.j(this, false);
    }

    public static class a
    extends ax.v4.e<g> {
        public static final a b = new a();

        public g u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Object object2;
                e e8 = null;
                d d8 = null;
                object = d8;
                Object object3 = object2 = object;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("shared_folder_member_policy".equals(string)) {
                        e8 = e.b.b.s(j8);
                        continue;
                    }
                    if ("shared_folder_join_policy".equals(string)) {
                        d8 = d.b.b.s(j8);
                        continue;
                    }
                    if ("shared_link_create_policy".equals(string)) {
                        object = f.b.b.s(j8);
                        continue;
                    }
                    if ("group_creation_policy".equals(string)) {
                        object2 = a.b.b.s(j8);
                        continue;
                    }
                    if ("shared_folder_link_restriction_policy".equals(string)) {
                        object3 = c.b.b.s(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (e8 != null) {
                    if (d8 != null) {
                        if (object != null) {
                            if (object2 != null) {
                                if (object3 != null) {
                                    object = new g(e8, d8, (f)((Object)object), (ax.L4.a)((Object)object2), (c)((Object)object3));
                                    if (!bl) {
                                        ax.v4.c.e(j8);
                                    }
                                    ax.v4.b.a(object, ((g)object).a());
                                    return object;
                                }
                                throw new i(j8, "Required field \"shared_folder_link_restriction_policy\" missing.");
                            }
                            throw new i(j8, "Required field \"group_creation_policy\" missing.");
                        }
                        throw new i(j8, "Required field \"shared_link_create_policy\" missing.");
                    }
                    throw new i(j8, "Required field \"shared_folder_join_policy\" missing.");
                }
                throw new i(j8, "Required field \"shared_folder_member_policy\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(g g8, ax.T4.g g9, boolean bl) throws IOException, ax.T4.f {
            if (!bl) {
                g9.o0();
            }
            g9.o("shared_folder_member_policy");
            e.b.b.t(g8.a, g9);
            g9.o("shared_folder_join_policy");
            d.b.b.t(g8.b, g9);
            g9.o("shared_link_create_policy");
            f.b.b.t(g8.c, g9);
            g9.o("group_creation_policy");
            a.b.b.t(g8.d, g9);
            g9.o("shared_folder_link_restriction_policy");
            c.b.b.t(g8.e, g9);
            if (!bl) {
                g9.m();
            }
        }
    }
}

