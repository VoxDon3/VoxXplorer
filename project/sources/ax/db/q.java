package ax.db;

import ax.fb.C2089a;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class q {
    private static final Map<String, AbstractC1955a> c = Collections.EMPTY_MAP;
    private static final Set<a> d = DesugarCollections.unmodifiableSet(EnumSet.noneOf(a.class));
    private final s a;
    private final Set<a> b;

    public enum a {
        RECORD_EVENTS
    }

    protected q(s sVar, EnumSet<a> enumSet) {
        this.a = (s) ax.cb.b.b(sVar, "context");
        Set<a> unmodifiableSet = enumSet == null ? d : DesugarCollections.unmodifiableSet(EnumSet.copyOf((EnumSet) enumSet));
        this.b = unmodifiableSet;
        ax.cb.b.a(!sVar.c().d() || unmodifiableSet.contains(a.RECORD_EVENTS), "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public final void a(String str) {
        ax.cb.b.b(str, "description");
        b(str, c);
    }

    public abstract void b(String str, Map<String, AbstractC1955a> map);

    @Deprecated
    public void c(Map<String, AbstractC1955a> map) {
        j(map);
    }

    public void d(o oVar) {
        ax.cb.b.b(oVar, "messageEvent");
        e(C2089a.b(oVar));
    }

    @Deprecated
    public void e(p pVar) {
        d(C2089a.a(pVar));
    }

    public final void f() {
        g(n.a);
    }

    public abstract void g(n nVar);

    public final s h() {
        return this.a;
    }

    public void i(String str, AbstractC1955a abstractC1955a) {
        ax.cb.b.b(str, "key");
        ax.cb.b.b(abstractC1955a, "value");
        j(Collections.singletonMap(str, abstractC1955a));
    }

    public void j(Map<String, AbstractC1955a> map) {
        ax.cb.b.b(map, "attributes");
        c(map);
    }
}
