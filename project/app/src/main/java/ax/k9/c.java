/*
 * Decompiled with CFR 0.152.
 */
package ax.k9;

import java.io.IOException;

public class c
extends IOException {
    public static final ax.a9.c<c> q = new ax.a9.c<c>(){

        public c b(Throwable throwable) {
            if (throwable instanceof c) {
                return (c)throwable;
            }
            return new c(throwable);
        }
    };

    public c(String string) {
        super(string);
    }

    public c(Throwable throwable) {
        super(throwable);
    }
}

