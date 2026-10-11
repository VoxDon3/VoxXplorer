/*
 * Decompiled with CFR 0.152.
 */
package ax.h8;

import ax.h8.f;

final class a
extends f {
    private final String a;
    private final String b;

    a(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof f && this.a.equals(((f)(object = (f)object)).b()) && this.b.equals(((f)object).c());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LibraryVersion{libraryName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

