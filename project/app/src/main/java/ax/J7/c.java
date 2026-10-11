/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.D;

final class c
extends D.a {
    private final String a;
    private final String b;
    private final String c;

    c(String string, String string2, String string3) {
        if (string != null) {
            this.a = string;
            this.b = string2;
            this.c = string3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override
    public String c() {
        return this.a;
    }

    @Override
    public String d() {
        return this.c;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        String string;
        if (object == this) {
            return true;
        }
        return object instanceof D.a && this.a.equals(((D.a)(object = (D.a)object)).c()) && ((string = this.b) == null ? ((D.a)object).e() == null : string.equals(((D.a)object).e())) && ((string = this.c) == null ? ((D.a)object).d() == null : string.equals(((D.a)object).d()));
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string = this.b;
        int n9 = 0;
        int n10 = string == null ? 0 : string.hashCode();
        string = this.c;
        if (string != null) {
            n9 = string.hashCode();
        }
        return ((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallIds{crashlyticsInstallId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", firebaseAuthenticationToken=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

