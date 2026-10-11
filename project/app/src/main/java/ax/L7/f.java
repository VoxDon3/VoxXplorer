/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class f
extends F.d {
    private final List<F.d.b> a;
    private final String b;

    private f(List<F.d.b> list, String string) {
        this.a = list;
        this.b = string;
    }

    @Override
    public List<F.d.b> b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    public boolean equals(Object object) {
        F.d d8;
        if (object == this) {
            return true;
        }
        return object instanceof F.d && this.a.equals((d8 = (F.d)object).b()) && ((object = this.b) == null ? d8.c() == null : ((String)object).equals(d8.c()));
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string = this.b;
        int n9 = string == null ? 0 : string.hashCode();
        return (n8 ^ 0xF4243) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FilesPayload{files=");
        stringBuilder.append(this.a);
        stringBuilder.append(", orgId=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.d.a {
        private List<F.d.b> a;
        private String b;

        b() {
        }

        @Override
        public F.d a() {
            List<F.d.b> list = this.a;
            if (list != null) {
                return new f(list, this.b);
            }
            list = new StringBuilder();
            ((StringBuilder)((Object)list)).append("Missing required properties:");
            ((StringBuilder)((Object)list)).append(" files");
            throw new IllegalStateException(((StringBuilder)((Object)list)).toString());
        }

        @Override
        public F.d.a b(List<F.d.b> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override
        public F.d.a c(String string) {
            this.b = string;
            return this;
        }
    }
}

