/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.installations.g;

final class a
extends g {
    private final String a;
    private final long b;
    private final long c;

    private a(String string, long l8, long l9) {
        this.a = string;
        this.b = l8;
        this.c = l9;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof g && this.a.equals(((g)(object = (g)object)).b()) && this.b == ((g)object).d() && this.c == ((g)object).c();
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        long l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        l8 = this.c;
        return ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallationTokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tokenCreationTimestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends g.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        @Override
        public g a() {
            CharSequence charSequence = this.a;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(" token");
                charSequence2 = ((StringBuilder)charSequence).toString();
            }
            charSequence = charSequence2;
            if (this.b == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(" tokenExpirationTimestamp");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            charSequence2 = charSequence;
            if (this.c == null) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(" tokenCreationTimestamp");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            if (((String)charSequence2).isEmpty()) {
                return new a(this.a, this.b, this.c);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((String)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public g.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override
        public g.a c(long l8) {
            this.c = l8;
            return this;
        }

        @Override
        public g.a d(long l8) {
            this.b = l8;
            return this;
        }
    }
}

