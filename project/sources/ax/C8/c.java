package ax.C8;

import ax.C8.b;
import ax.D8.a;
import ax.D8.b;
import ax.D8.c;
import ax.E8.a;
import ax.E8.b;
import ax.E8.c;
import ax.E8.d;
import ax.E8.e;
import ax.F8.a;
import ax.F8.b;
import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import j$.util.Objects;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c<T extends ax.C8.b> {
    private static Map<Integer, c<?>> e = new HashMap();
    public static final c<ax.E8.a> f;
    public static final c<ax.E8.c> g;
    public static final c<ax.F8.a> h;
    public static final c<?> i;
    public static final c<ax.E8.d> j;
    public static final c<ax.E8.e> k;
    public static final c<ax.E8.b> l;
    public static final c<ax.D8.b> m;
    public static final c<ax.D8.a> n;
    private final ax.C8.d a;
    private final int b;
    private final Set<ax.C8.a> c;
    private final ax.C8.a d;

    class a extends c<T> {
        a(ax.C8.d dVar, int i, ax.C8.a aVar, Set set) {
            super(dVar, i, aVar, set, null);
        }

        @Override // ax.C8.c
        public AbstractC3515d<T> j(InterfaceC3557a interfaceC3557a) {
            return c.this.j(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<T> k(InterfaceC3558b interfaceC3558b) {
            return c.this.k(interfaceC3558b);
        }
    }

    class b extends c {
        b(ax.C8.d dVar, int i, Set set) {
            super(dVar, i, (Set<ax.C8.a>) set);
        }

        @Override // ax.C8.c
        public AbstractC3515d<?> j(InterfaceC3557a interfaceC3557a) {
            return new c.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e k(InterfaceC3558b interfaceC3558b) {
            return new c.C0070c(interfaceC3558b);
        }
    }

    /* renamed from: ax.C8.c$c, reason: collision with other inner class name */
    static /* synthetic */ class C0062c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.C8.d.values().length];
            a = iArr;
            try {
                iArr[ax.C8.d.UNIVERSAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.C8.d.APPLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.C8.d.CONTEXT_SPECIFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.C8.d.PRIVATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class d extends c<ax.E8.a> {
        d(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.E8.a> j(InterfaceC3557a interfaceC3557a) {
            return new a.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.E8.a> k(InterfaceC3558b interfaceC3558b) {
            return new a.c(interfaceC3558b);
        }
    }

    class e extends c<ax.E8.c> {
        e(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.E8.c> j(InterfaceC3557a interfaceC3557a) {
            return new c.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.E8.c> k(InterfaceC3558b interfaceC3558b) {
            return new c.C0077c(interfaceC3558b);
        }
    }

    class f extends c<ax.F8.a> {
        f(ax.C8.d dVar, int i, ax.C8.a aVar, Set set) {
            super(dVar, i, aVar, set, null);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.F8.a> j(InterfaceC3557a interfaceC3557a) {
            return new a.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.F8.a> k(InterfaceC3558b interfaceC3558b) {
            return new a.c(interfaceC3558b);
        }
    }

    class g extends c {
        g(ax.C8.d dVar, int i, Set set) {
            super(dVar, i, (Set<ax.C8.a>) set);
        }

        @Override // ax.C8.c
        public AbstractC3515d<?> j(InterfaceC3557a interfaceC3557a) {
            return new b.a(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e k(InterfaceC3558b interfaceC3558b) {
            return new b.C0082b(interfaceC3558b);
        }
    }

    class h extends c<ax.E8.d> {
        h(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.E8.d> j(InterfaceC3557a interfaceC3557a) {
            return new d.a(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.E8.d> k(InterfaceC3558b interfaceC3558b) {
            return new d.b(interfaceC3558b);
        }
    }

    class i extends c<ax.E8.e> {
        i(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.E8.e> j(InterfaceC3557a interfaceC3557a) {
            return new e.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.E8.e> k(InterfaceC3558b interfaceC3558b) {
            return new e.c(interfaceC3558b);
        }
    }

    class j extends c<ax.E8.b> {
        j(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.E8.b> j(InterfaceC3557a interfaceC3557a) {
            return new b.C0076b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.E8.b> k(InterfaceC3558b interfaceC3558b) {
            return new b.c(interfaceC3558b);
        }
    }

    class k extends c<ax.D8.b> {
        k(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.D8.b> j(InterfaceC3557a interfaceC3557a) {
            return new b.C0069b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.D8.b> k(InterfaceC3558b interfaceC3558b) {
            return new b.c(interfaceC3558b);
        }
    }

    class l extends c<ax.D8.a> {
        l(ax.C8.d dVar, int i, ax.C8.a aVar) {
            super(dVar, i, aVar);
        }

        @Override // ax.C8.c
        public AbstractC3515d<ax.D8.a> j(InterfaceC3557a interfaceC3557a) {
            return new a.b(interfaceC3557a);
        }

        @Override // ax.C8.c
        public AbstractC3516e<ax.D8.a> k(InterfaceC3558b interfaceC3558b) {
            return new a.c(interfaceC3558b);
        }
    }

    static {
        ax.C8.d dVar = ax.C8.d.UNIVERSAL;
        ax.C8.a aVar = ax.C8.a.PRIMITIVE;
        d dVar2 = new d(dVar, 1, aVar);
        f = dVar2;
        e eVar = new e(dVar, 2, aVar);
        g = eVar;
        ax.C8.a aVar2 = ax.C8.a.CONSTRUCTED;
        f fVar = new f(dVar, 3, aVar, EnumSet.of(aVar, aVar2));
        h = fVar;
        g gVar = new g(dVar, 4, EnumSet.of(aVar, aVar2));
        i = gVar;
        h hVar = new h(dVar, 5, aVar);
        j = hVar;
        i iVar = new i(dVar, 6, aVar);
        k = iVar;
        j jVar = new j(dVar, 10, aVar);
        l = jVar;
        k kVar = new k(dVar, 17, aVar2);
        m = kVar;
        l lVar = new l(dVar, 16, aVar2);
        n = lVar;
        e.put(Integer.valueOf(dVar2.h()), dVar2);
        e.put(Integer.valueOf(eVar.h()), eVar);
        e.put(Integer.valueOf(fVar.h()), fVar);
        e.put(Integer.valueOf(gVar.h()), gVar);
        e.put(Integer.valueOf(hVar.h()), hVar);
        e.put(Integer.valueOf(iVar.h()), iVar);
        e.put(Integer.valueOf(jVar.h()), jVar);
        e.put(Integer.valueOf(kVar.h()), kVar);
        e.put(Integer.valueOf(lVar.h()), lVar);
    }

    /* synthetic */ c(ax.C8.d dVar, int i2, ax.C8.a aVar, Set set, d dVar2) {
        this(dVar, i2, aVar, set);
    }

    public static c a(int i2) {
        return e(ax.C8.d.APPLICATION, i2);
    }

    public static c d(int i2) {
        return e(ax.C8.d.CONTEXT_SPECIFIC, i2);
    }

    public static c e(ax.C8.d dVar, int i2) {
        int i3 = C0062c.a[dVar.ordinal()];
        if (i3 == 1) {
            for (c<?> cVar : e.values()) {
                if (((c) cVar).b == i2 && dVar == ((c) cVar).a) {
                    return cVar;
                }
            }
        } else if (i3 == 2 || i3 == 3 || i3 == 4) {
            return new b(dVar, i2, EnumSet.of(ax.C8.a.PRIMITIVE, ax.C8.a.CONSTRUCTED));
        }
        throw new C3514c(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", dVar, Integer.valueOf(i2), e));
    }

    public c<T> b(ax.C8.a aVar) {
        if (this.d == aVar) {
            return this;
        }
        if (this.c.contains(aVar)) {
            return new a(this.a, this.b, aVar, this.c);
        }
        throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, aVar));
    }

    public c<T> c() {
        return b(ax.C8.a.CONSTRUCTED);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (h() == cVar.h() && this.a == cVar.a && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public ax.C8.a f() {
        return this.d;
    }

    public ax.C8.d g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(h()), this.d);
    }

    public boolean i() {
        return this.d == ax.C8.a.CONSTRUCTED;
    }

    public abstract AbstractC3515d<T> j(InterfaceC3557a interfaceC3557a);

    public abstract AbstractC3516e<T> k(InterfaceC3558b interfaceC3558b);

    public String toString() {
        return "ASN1Tag[" + this.a + "," + this.d + "," + this.b + ']';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(ax.C8.d r3, int r4, java.util.Set<ax.C8.a> r5) {
        /*
            r2 = this;
            ax.C8.a r0 = ax.C8.a.PRIMITIVE
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L9
            goto Lb
        L9:
            ax.C8.a r0 = ax.C8.a.CONSTRUCTED
        Lb:
            r2.<init>(r3, r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.C8.c.<init>(ax.C8.d, int, java.util.Set):void");
    }

    public c(ax.C8.d dVar, int i2, ax.C8.a aVar) {
        this(dVar, i2, aVar, EnumSet.of(aVar));
    }

    private c(ax.C8.d dVar, int i2, ax.C8.a aVar, Set<ax.C8.a> set) {
        this.a = dVar;
        this.b = i2;
        this.c = set;
        this.d = aVar;
    }
}
