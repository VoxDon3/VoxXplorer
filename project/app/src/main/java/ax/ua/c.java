/*
 * Decompiled with CFR 0.152.
 */
package ax.ua;

public abstract class c {
    private final String a;

    public c(String string) {
        this.a = string;
    }

    String a(String string) {
        if (string == null) {
            return "null";
        }
        return String.format("\"%s\"", string);
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        return j.Objects.equals((Object)this.b(), (Object)((c)object).b());
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.b()});
    }
}

