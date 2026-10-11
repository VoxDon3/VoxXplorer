package ax.M4;

import ax.K4.a;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j {
    protected final long a;
    protected final long b;
    protected final long c;
    protected final ax.K4.a d;
    protected final long e;

    static class a extends ax.v4.e<j> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public j s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Long l = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            Long l2 = null;
            Long l3 = null;
            Long l4 = null;
            ax.K4.a aVar = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("used".equals(g)) {
                    l = C3277d.i().a(jVar);
                } else if ("allocated".equals(g)) {
                    l2 = C3277d.i().a(jVar);
                } else if ("user_within_team_space_allocated".equals(g)) {
                    l3 = C3277d.i().a(jVar);
                } else if ("user_within_team_space_limit_type".equals(g)) {
                    aVar = a.b.b.a(jVar);
                } else if ("user_within_team_space_used_cached".equals(g)) {
                    l4 = C3277d.i().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (l == null) {
                throw new ax.T4.i(jVar, "Required field \"used\" missing.");
            }
            if (l2 == null) {
                throw new ax.T4.i(jVar, "Required field \"allocated\" missing.");
            }
            if (l3 == null) {
                throw new ax.T4.i(jVar, "Required field \"user_within_team_space_allocated\" missing.");
            }
            if (aVar == null) {
                throw new ax.T4.i(jVar, "Required field \"user_within_team_space_limit_type\" missing.");
            }
            if (l4 == null) {
                throw new ax.T4.i(jVar, "Required field \"user_within_team_space_used_cached\" missing.");
            }
            j jVar2 = new j(l.longValue(), l2.longValue(), l3.longValue(), aVar, l4.longValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(jVar2, jVar2.c());
            return jVar2;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(j jVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("used");
            C3277d.i().k(Long.valueOf(jVar.a), gVar);
            gVar.o("allocated");
            C3277d.i().k(Long.valueOf(jVar.b), gVar);
            gVar.o("user_within_team_space_allocated");
            C3277d.i().k(Long.valueOf(jVar.c), gVar);
            gVar.o("user_within_team_space_limit_type");
            a.b.b.k(jVar.d, gVar);
            gVar.o("user_within_team_space_used_cached");
            C3277d.i().k(Long.valueOf(jVar.e), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public j(long j, long j2, long j3, ax.K4.a aVar, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value for 'userWithinTeamSpaceLimitType' is null");
        }
        this.d = aVar;
        this.e = j4;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        ax.K4.a aVar;
        ax.K4.a aVar2;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && (((aVar = this.d) == (aVar2 = jVar.d) || aVar.equals(aVar2)) && this.e == jVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, Long.valueOf(this.e)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
