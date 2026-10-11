package ax.L4;

import ax.L4.a;
import ax.L4.c;
import ax.L4.d;
import ax.L4.e;
import ax.L4.f;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g {
    protected final e a;
    protected final d b;
    protected final f c;
    protected final ax.L4.a d;
    protected final c e;

    public static class a extends ax.v4.e<g> {
        public static final a b = new a();

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public g s(j jVar, boolean z) throws IOException, i {
            String str;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            e eVar = null;
            d dVar = null;
            f fVar = null;
            ax.L4.a aVar = null;
            c cVar = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("shared_folder_member_policy".equals(g)) {
                    eVar = e.b.b.a(jVar);
                } else if ("shared_folder_join_policy".equals(g)) {
                    dVar = d.b.b.a(jVar);
                } else if ("shared_link_create_policy".equals(g)) {
                    fVar = f.b.b.a(jVar);
                } else if ("group_creation_policy".equals(g)) {
                    aVar = a.b.b.a(jVar);
                } else if ("shared_folder_link_restriction_policy".equals(g)) {
                    cVar = c.b.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (eVar == null) {
                throw new i(jVar, "Required field \"shared_folder_member_policy\" missing.");
            }
            if (dVar == null) {
                throw new i(jVar, "Required field \"shared_folder_join_policy\" missing.");
            }
            if (fVar == null) {
                throw new i(jVar, "Required field \"shared_link_create_policy\" missing.");
            }
            if (aVar == null) {
                throw new i(jVar, "Required field \"group_creation_policy\" missing.");
            }
            if (cVar == null) {
                throw new i(jVar, "Required field \"shared_folder_link_restriction_policy\" missing.");
            }
            g gVar = new g(eVar, dVar, fVar, aVar, cVar);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(gVar, gVar.a());
            return gVar;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(g gVar, ax.T4.g gVar2, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar2.o0();
            }
            gVar2.o("shared_folder_member_policy");
            e.b.b.k(gVar.a, gVar2);
            gVar2.o("shared_folder_join_policy");
            d.b.b.k(gVar.b, gVar2);
            gVar2.o("shared_link_create_policy");
            f.b.b.k(gVar.c, gVar2);
            gVar2.o("group_creation_policy");
            a.b.b.k(gVar.d, gVar2);
            gVar2.o("shared_folder_link_restriction_policy");
            c.b.b.k(gVar.e, gVar2);
            if (z) {
                return;
            }
            gVar2.m();
        }
    }

    public g(e eVar, d dVar, f fVar, ax.L4.a aVar, c cVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Required value for 'sharedFolderMemberPolicy' is null");
        }
        this.a = eVar;
        if (dVar == null) {
            throw new IllegalArgumentException("Required value for 'sharedFolderJoinPolicy' is null");
        }
        this.b = dVar;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value for 'sharedLinkCreatePolicy' is null");
        }
        this.c = fVar;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value for 'groupCreationPolicy' is null");
        }
        this.d = aVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Required value for 'sharedFolderLinkRestrictionPolicy' is null");
        }
        this.e = cVar;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        d dVar;
        d dVar2;
        f fVar;
        f fVar2;
        ax.L4.a aVar;
        ax.L4.a aVar2;
        c cVar;
        c cVar2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        g gVar = (g) obj;
        e eVar = this.a;
        e eVar2 = gVar.a;
        return (eVar == eVar2 || eVar.equals(eVar2)) && ((dVar = this.b) == (dVar2 = gVar.b) || dVar.equals(dVar2)) && (((fVar = this.c) == (fVar2 = gVar.c) || fVar.equals(fVar2)) && (((aVar = this.d) == (aVar2 = gVar.d) || aVar.equals(aVar2)) && ((cVar = this.e) == (cVar2 = gVar.e) || cVar.equals(cVar2))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
