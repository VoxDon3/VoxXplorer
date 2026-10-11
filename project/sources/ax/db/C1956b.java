package ax.db;

import ax.db.AbstractC1955a;

/* renamed from: ax.db.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1956b extends AbstractC1955a.AbstractC0290a {
    private final Long a;

    C1956b(Long l) {
        if (l == null) {
            throw new NullPointerException("Null longValue");
        }
        this.a = l;
    }

    @Override // ax.db.AbstractC1955a.AbstractC0290a
    Long d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1955a.AbstractC0290a) {
            return this.a.equals(((AbstractC1955a.AbstractC0290a) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueLong{longValue=" + this.a + "}";
    }
}
