/*
 * Decompiled with CFR 0.152.
 */
package ax.k9;

import ax.a9.c;

public class d
extends RuntimeException {
    public static final c<d> q = new c<d>(){

        public d b(Throwable throwable) {
            if (throwable instanceof d) {
                return (d)throwable;
            }
            return new d(throwable);
        }
    };

    public d(String string) {
        super(string);
    }

    public d(String string, Throwable throwable) {
        super(string, throwable);
    }

    public d(Throwable throwable) {
        super(throwable);
    }
}

