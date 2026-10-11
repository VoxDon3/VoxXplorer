/*
 * Decompiled with CFR 0.152.
 */
package ax.c9;

import ax.a9.c;
import java.io.IOException;

public class e
extends IOException {
    public static final c<e> q = new c<e>(){

        public e b(Throwable throwable) {
            if (throwable instanceof e) {
                return (e)throwable;
            }
            return new e(throwable);
        }
    };

    public e(String string) {
        super(string);
    }

    public e(String string, Throwable throwable) {
        super(string, throwable);
    }

    public e(Throwable throwable) {
        super(throwable);
    }
}

