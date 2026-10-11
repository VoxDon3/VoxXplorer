package ax.q0;

import ax.Fb.l;
import ax.Gb.m;
import ax.q0.AbstractC2835d;
import ax.tb.C3139o;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2832a extends AbstractC2835d {
    private final Map<AbstractC2835d.a<?>, Object> a;
    private final AtomicBoolean b;

    /* renamed from: ax.q0.a$a, reason: collision with other inner class name */
    static final class C0422a extends m implements l<Map.Entry<AbstractC2835d.a<?>, Object>, CharSequence> {
        public static final C0422a q = new C0422a();

        C0422a() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<AbstractC2835d.a<?>, Object> entry) {
            ax.Gb.l.f(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2832a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // ax.q0.AbstractC2835d
    public Map<AbstractC2835d.a<?>, Object> a() {
        Map<AbstractC2835d.a<?>, Object> unmodifiableMap = DesugarCollections.unmodifiableMap(this.a);
        ax.Gb.l.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // ax.q0.AbstractC2835d
    public <T> T b(AbstractC2835d.a<T> aVar) {
        ax.Gb.l.f(aVar, "key");
        return (T) this.a.get(aVar);
    }

    public final void e() {
        if (this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2832a) {
            return ax.Gb.l.a(this.a, ((C2832a) obj).a);
        }
        return false;
    }

    public final void f() {
        this.b.set(true);
    }

    public final void g(AbstractC2835d.b<?>... bVarArr) {
        ax.Gb.l.f(bVarArr, "pairs");
        e();
        for (AbstractC2835d.b<?> bVar : bVarArr) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(AbstractC2835d.a<T> aVar) {
        ax.Gb.l.f(aVar, "key");
        e();
        return (T) this.a.remove(aVar);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final <T> void i(AbstractC2835d.a<T> aVar, T t) {
        ax.Gb.l.f(aVar, "key");
        j(aVar, t);
    }

    public final void j(AbstractC2835d.a<?> aVar, Object obj) {
        ax.Gb.l.f(aVar, "key");
        e();
        if (obj == null) {
            h(aVar);
            return;
        }
        if (!(obj instanceof Set)) {
            this.a.put(aVar, obj);
            return;
        }
        Map<AbstractC2835d.a<?>, Object> map = this.a;
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(C3139o.Y((Iterable) obj));
        ax.Gb.l.e(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(aVar, unmodifiableSet);
    }

    public String toString() {
        return C3139o.L(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0422a.q, 24, null);
    }

    public /* synthetic */ C2832a(Map map, boolean z, int i, ax.Gb.g gVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public C2832a(Map<AbstractC2835d.a<?>, Object> map, boolean z) {
        ax.Gb.l.f(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }
}
