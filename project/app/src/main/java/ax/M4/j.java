/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.K4.a;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class j {
    protected final long a;
    protected final long b;
    protected final long c;
    protected final ax.K4.a d;
    protected final long e;

    public j(long l8, long l9, long l10, ax.K4.a a8, long l11) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
        if (a8 != null) {
            this.d = a8;
            this.e = l11;
            return;
        }
        throw new IllegalArgumentException("Required value for 'userWithinTeamSpaceLimitType' is null");
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return ax.M4.j$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            ax.K4.a a8;
            ax.K4.a a9;
            object = (j)object;
            if (this.a == ((j)object).a && this.b == ((j)object).b && this.c == ((j)object).c && ((a9 = this.d) == (a8 = ((j)object).d) || ((Object)((Object)a9)).equals((Object)a8)) && this.e == ((j)object).e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return ax.M4.j$a.b.j(this, false);
    }

    static class a
    extends e<j> {
        public static final a b = new a();

        a() {
        }

        public j u(ax.T4.j j8, boolean bl) throws IOException, i {
            Object object;
            Long l8 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Long l9 = null;
                Long l10 = null;
                object = l10;
                Object object2 = object;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("used".equals(string)) {
                        l8 = ax.v4.d.i().a(j8);
                        continue;
                    }
                    if ("allocated".equals(string)) {
                        l9 = ax.v4.d.i().a(j8);
                        continue;
                    }
                    if ("user_within_team_space_allocated".equals(string)) {
                        l10 = ax.v4.d.i().a(j8);
                        continue;
                    }
                    if ("user_within_team_space_limit_type".equals(string)) {
                        object2 = a.b.b.s(j8);
                        continue;
                    }
                    if ("user_within_team_space_used_cached".equals(string)) {
                        object = ax.v4.d.i().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (l8 != null) {
                    if (l9 != null) {
                        if (l10 != null) {
                            if (object2 != null) {
                                if (object != null) {
                                    object = new j(l8, l9, l10, (ax.K4.a)((Object)object2), (Long)object);
                                    if (!bl) {
                                        ax.v4.c.e(j8);
                                    }
                                    ax.v4.b.a(object, ((j)object).c());
                                    return object;
                                }
                                throw new i(j8, "Required field \"user_within_team_space_used_cached\" missing.");
                            }
                            throw new i(j8, "Required field \"user_within_team_space_limit_type\" missing.");
                        }
                        throw new i(j8, "Required field \"user_within_team_space_allocated\" missing.");
                    }
                    throw new i(j8, "Required field \"allocated\" missing.");
                }
                throw new i(j8, "Required field \"used\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(j j8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("used");
            ax.v4.d.i().k(j8.a, g8);
            g8.o("allocated");
            ax.v4.d.i().k(j8.b, g8);
            g8.o("user_within_team_space_allocated");
            ax.v4.d.i().k(j8.c, g8);
            g8.o("user_within_team_space_limit_type");
            a.b.b.t(j8.d, g8);
            g8.o("user_within_team_space_used_cached");
            ax.v4.d.i().k(j8.e, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}

