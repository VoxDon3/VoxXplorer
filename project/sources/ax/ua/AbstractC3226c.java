package ax.ua;

import j$.util.Objects;

/* renamed from: ax.ua.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3226c {
    private final String a;

    public AbstractC3226c(String str) {
        this.a = str;
    }

    String a(String str) {
        return str == null ? "null" : String.format("\"%s\"", str);
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC3226c) {
            return Objects.equals(b(), ((AbstractC3226c) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(b());
    }
}
