package ax.db;

import ax.db.AbstractC1955a;

/* renamed from: ax.db.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1957c extends AbstractC1955a.b {
    private final String a;

    C1957c(String str) {
        if (str == null) {
            throw new NullPointerException("Null stringValue");
        }
        this.a = str;
    }

    @Override // ax.db.AbstractC1955a.b
    String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1955a.b) {
            return this.a.equals(((AbstractC1955a.b) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.a + "}";
    }
}
