/*
 * Decompiled with CFR 0.152.
 */
package ax.e7;

import ax.l7.b;
import ax.m7.g;
import ax.m7.n;
import java.util.List;

public class a
extends b {
    @n
    private int code;
    @n
    private List<Object> details;
    @n
    private List<a> errors;
    @n
    private String message;

    static {
        g.j(a.class);
    }

    public a m() {
        return (a)super.i();
    }

    public final List<a> n() {
        return this.errors;
    }

    public a o(String string, Object object) {
        return (a)super.j(string, object);
    }

    public static class a
    extends b {
        @n
        private String domain;
        @n
        private String location;
        @n
        private String locationType;
        @n
        private String message;
        @n
        private String reason;

        public a m() {
            return (a)super.i();
        }

        public final String n() {
            return this.reason;
        }

        public a o(String string, Object object) {
            return (a)super.j(string, object);
        }
    }
}

