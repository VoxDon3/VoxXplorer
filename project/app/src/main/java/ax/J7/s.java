/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.G7.g;
import java.io.File;
import java.io.IOException;

class s {
    private final String a;
    private final ax.O7.g b;

    public s(String string, ax.O7.g g8) {
        this.a = string;
        this.b = g8;
    }

    private File b() {
        return this.b.g(this.a);
    }

    public boolean a() {
        try {
            boolean bl = this.b().createNewFile();
            return bl;
        }
        catch (IOException iOException) {
            g g8 = g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating marker: ");
            stringBuilder.append(this.a);
            g8.e(stringBuilder.toString(), iOException);
            return false;
        }
    }

    public boolean c() {
        return this.b().exists();
    }

    public boolean d() {
        return this.b().delete();
    }
}

