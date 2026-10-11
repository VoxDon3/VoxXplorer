/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.e;
import ax.p5.p;
import java.util.Arrays;

final class d
extends p {
    private final String a;
    private final byte[] b;
    private final e c;

    private d(String string, byte[] byArray, e e8) {
        this.a = string;
        this.b = byArray;
        this.c = e8;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    @Override
    public e d() {
        return this.c;
    }

    public boolean equals(Object object) {
        byte[] byArray;
        p p8;
        if (object == this) {
            return true;
        }
        return object instanceof p && this.a.equals((p8 = (p)object).b()) && Arrays.equals(byArray = this.b, (byte[])(object = p8 instanceof d ? (Object)((d)p8).b : (Object)p8.c())) && ((Object)((Object)this.c)).equals((Object)p8.d());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ ((Object)((Object)this.c)).hashCode();
    }

    static final class b
    extends p.a {
        private String a;
        private byte[] b;
        private e c;

        b() {
        }

        @Override
        public p a() {
            CharSequence charSequence = this.a;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("");
                ((StringBuilder)charSequence2).append(" backendName");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            charSequence = charSequence2;
            if (this.c == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(" priority");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (((String)charSequence).isEmpty()) {
                return new d(this.a, this.b, this.c);
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("Missing required properties:");
            ((StringBuilder)charSequence2).append((String)charSequence);
            throw new IllegalStateException(((StringBuilder)charSequence2).toString());
        }

        @Override
        public p.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override
        public p.a c(byte[] byArray) {
            this.b = byArray;
            return this;
        }

        @Override
        public p.a d(e e8) {
            if (e8 != null) {
                this.c = e8;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }
}

