/*
 * Decompiled with CFR 0.152.
 */
package ax.k1;

import ax.N1.h;
import ax.N1.l;
import ax.N1.t;
import ax.O1.a;
import ax.O1.c;
import ax.P0.v;
import ax.k1.b;

public interface g {
    public static final g a = new g(){
        private final h b = new h();

        @Override
        public l a(v object) {
            Object object2 = ((v)object).o;
            if (object2 != null) {
                int n8 = -1;
                switch (((String)object2).hashCode()) {
                    default: {
                        break;
                    }
                    case 1566016562: {
                        if (!((String)object2).equals("application/cea-708")) break;
                        n8 = 2;
                        break;
                    }
                    case 1566015601: {
                        if (!((String)object2).equals("application/cea-608")) break;
                        n8 = 1;
                        break;
                    }
                    case 930165504: {
                        if (!((String)object2).equals("application/x-mp4-cea-608")) break;
                        n8 = 0;
                    }
                }
                switch (n8) {
                    default: {
                        break;
                    }
                    case 2: {
                        return new c(((v)object).L, ((v)object).r);
                    }
                    case 0: 
                    case 1: {
                        return new a((String)object2, ((v)object).L, 16000L);
                    }
                }
            }
            if (this.b.b((v)object)) {
                object2 = this.b.c((v)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(object2.getClass().getSimpleName());
                ((StringBuilder)object).append("Decoder");
                return new b(((StringBuilder)object).toString(), (t)object2);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Attempted to create decoder for unsupported MIME type: ");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public boolean b(v v8) {
            String string = v8.o;
            return this.b.b(v8) || j.Objects.equals((Object)string, (Object)"application/cea-608") || j.Objects.equals((Object)string, (Object)"application/x-mp4-cea-608") || j.Objects.equals((Object)string, (Object)"application/cea-708");
            {
            }
        }
    };

    public l a(v var1);

    public boolean b(v var1);
}

