/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import java.io.BufferedReader;
import java.io.IOException;

public class i {
    String a;
    BufferedReader b;

    public i(BufferedReader bufferedReader) {
        this.b = bufferedReader;
    }

    public void a() {
        this.a = null;
    }

    public void b() {
        this.b = null;
    }

    public String c() throws IOException {
        BufferedReader bufferedReader = this.b;
        if (bufferedReader == null) {
            return null;
        }
        String string = this.a;
        if (string != null) {
            return string;
        }
        this.a = string = bufferedReader.readLine();
        return string;
    }
}

