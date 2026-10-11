/*
 * Decompiled with CFR 0.152.
 */
package ax.g1;

import ax.B1.b;
import ax.E1.h;
import ax.G1.c;
import ax.P0.v;

public interface a {
    public static final a a = new a(){

        @Override
        public ax.z1.a a(v object) {
            String string = ((v)object).o;
            if (string != null) {
                int n8 = -1;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 1652648887: {
                        if (!string.equals("application/x-scte35")) break;
                        n8 = 4;
                        break;
                    }
                    case 1154383568: {
                        if (!string.equals("application/x-emsg")) break;
                        n8 = 3;
                        break;
                    }
                    case -1248341703: {
                        if (!string.equals("application/id3")) break;
                        n8 = 2;
                        break;
                    }
                    case -1348231605: {
                        if (!string.equals("application/x-icy")) break;
                        n8 = 1;
                        break;
                    }
                    case -1354451219: {
                        if (!string.equals("application/vnd.dvb.ait")) break;
                        n8 = 0;
                    }
                }
                switch (n8) {
                    default: {
                        break;
                    }
                    case 4: {
                        return new c();
                    }
                    case 3: {
                        return new b();
                    }
                    case 2: {
                        return new h();
                    }
                    case 1: {
                        return new ax.D1.a();
                    }
                    case 0: {
                        return new ax.A1.b();
                    }
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Attempted to create decoder for unsupported MIME type: ");
            ((StringBuilder)object).append(string);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public boolean b(v object) {
            object = ((v)object).o;
            return "application/id3".equals(object) || "application/x-emsg".equals(object) || "application/x-scte35".equals(object) || "application/x-icy".equals(object) || "application/vnd.dvb.ait".equals(object);
            {
            }
        }
    };

    public ax.z1.a a(v var1);

    public boolean b(v var1);
}

