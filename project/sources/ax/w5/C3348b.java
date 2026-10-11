package ax.w5;

import ax.w5.AbstractC3352f;
import ax.z5.InterfaceC3550a;
import java.util.Map;

/* renamed from: ax.w5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3348b extends AbstractC3352f {
    private final InterfaceC3550a a;
    private final Map<ax.n5.e, AbstractC3352f.b> b;

    C3348b(InterfaceC3550a interfaceC3550a, Map<ax.n5.e, AbstractC3352f.b> map) {
        if (interfaceC3550a == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = interfaceC3550a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // ax.w5.AbstractC3352f
    InterfaceC3550a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3352f) {
            AbstractC3352f abstractC3352f = (AbstractC3352f) obj;
            if (this.a.equals(abstractC3352f.e()) && this.b.equals(abstractC3352f.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.w5.AbstractC3352f
    Map<ax.n5.e, AbstractC3352f.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
