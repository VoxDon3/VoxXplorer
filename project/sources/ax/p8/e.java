package ax.p8;

import ax.Gb.l;

/* loaded from: classes3.dex */
public final class e {
    private final Boolean a;
    private final Double b;
    private final Integer c;
    private final Integer d;
    private final Long e;

    public e(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final Integer a() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Integer d() {
        return this.c;
    }

    public final Double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.a, eVar.a) && l.a(this.b, eVar.b) && l.a(this.c, eVar.c) && l.a(this.d, eVar.d) && l.a(this.e, eVar.e);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
