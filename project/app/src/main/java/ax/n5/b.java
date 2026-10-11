/*
 * Decompiled with CFR 0.152.
 */
package ax.n5;

public final class b {
    private final String a;

    private b(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b b(String string) {
        return new b(string);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        return this.a.equals(((b)object).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encoding{name=\"");
        stringBuilder.append(this.a);
        stringBuilder.append("\"}");
        return stringBuilder.toString();
    }
}

