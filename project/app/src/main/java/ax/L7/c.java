/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class c
extends F.a {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;
    private final List<F.a.a> i;

    private c(int n8, String string, int n9, int n10, long l8, long l9, long l10, String string2, List<F.a.a> list) {
        this.a = n8;
        this.b = string;
        this.c = n9;
        this.d = n10;
        this.e = l8;
        this.f = l9;
        this.g = l10;
        this.h = string2;
        this.i = list;
    }

    @Override
    public List<F.a.a> b() {
        return this.i;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.a;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof F.a && this.a == ((F.a)(object = (F.a)object)).d() && this.b.equals(((F.a)object).e()) && this.c == ((F.a)object).g() && this.d == ((F.a)object).c() && this.e == ((F.a)object).f() && this.f == ((F.a)object).h() && this.g == ((F.a)object).i() && ((object2 = this.h) == null ? ((F.a)object).j() == null : ((String)object2).equals(((F.a)object).j())) && ((object2 = this.i) == null ? ((F.a)object).b() == null : object2.equals(((F.a)object).b()));
    }

    @Override
    public long f() {
        return this.e;
    }

    @Override
    public int g() {
        return this.c;
    }

    @Override
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        int n11 = this.d;
        long l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.f;
        int n13 = (int)(l8 ^ l8 >>> 32);
        l8 = this.g;
        int n14 = (int)(l8 ^ l8 >>> 32);
        List<F.a.a> list = this.h;
        int n15 = 0;
        int n16 = list == null ? 0 : ((String)((Object)list)).hashCode();
        list = this.i;
        if (list != null) {
            n15 = list.hashCode();
        }
        return ((((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n16) * 1000003 ^ n15;
    }

    @Override
    public long i() {
        return this.g;
    }

    @Override
    public String j() {
        return this.h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApplicationExitInfo{pid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", processName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reasonCode=");
        stringBuilder.append(this.c);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.d);
        stringBuilder.append(", pss=");
        stringBuilder.append(this.e);
        stringBuilder.append(", rss=");
        stringBuilder.append(this.f);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.g);
        stringBuilder.append(", traceFile=");
        stringBuilder.append(this.h);
        stringBuilder.append(", buildIdMappingForArch=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.a.b {
        private int a;
        private String b;
        private int c;
        private int d;
        private long e;
        private long f;
        private long g;
        private String h;
        private List<F.a.a> i;
        private byte j;

        b() {
        }

        @Override
        public F.a a() {
            CharSequence charSequence;
            if (this.j == 63 && (charSequence = this.b) != null) {
                return new c(this.a, (String)charSequence, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            charSequence = new StringBuilder();
            if ((this.j & 1) == 0) {
                ((StringBuilder)charSequence).append(" pid");
            }
            if (this.b == null) {
                ((StringBuilder)charSequence).append(" processName");
            }
            if ((this.j & 2) == 0) {
                ((StringBuilder)charSequence).append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                ((StringBuilder)charSequence).append(" importance");
            }
            if ((this.j & 8) == 0) {
                ((StringBuilder)charSequence).append(" pss");
            }
            if ((this.j & 0x10) == 0) {
                ((StringBuilder)charSequence).append(" rss");
            }
            if ((this.j & 0x20) == 0) {
                ((StringBuilder)charSequence).append(" timestamp");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing required properties:");
            stringBuilder.append((Object)charSequence);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public F.a.b b(List<F.a.a> list) {
            this.i = list;
            return this;
        }

        @Override
        public F.a.b c(int n8) {
            this.d = n8;
            this.j = (byte)(this.j | 4);
            return this;
        }

        @Override
        public F.a.b d(int n8) {
            this.a = n8;
            this.j = (byte)(this.j | 1);
            return this;
        }

        @Override
        public F.a.b e(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override
        public F.a.b f(long l8) {
            this.e = l8;
            this.j = (byte)(this.j | 8);
            return this;
        }

        @Override
        public F.a.b g(int n8) {
            this.c = n8;
            this.j = (byte)(this.j | 2);
            return this;
        }

        @Override
        public F.a.b h(long l8) {
            this.f = l8;
            this.j = (byte)(this.j | 0x10);
            return this;
        }

        @Override
        public F.a.b i(long l8) {
            this.g = l8;
            this.j = (byte)(this.j | 0x20);
            return this;
        }

        @Override
        public F.a.b j(String string) {
            this.h = string;
            return this;
        }
    }
}

