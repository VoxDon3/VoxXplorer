package ax.Z2;

import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
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
        String str = this.a;
        if (str != null) {
            return str;
        }
        String readLine = bufferedReader.readLine();
        this.a = readLine;
        return readLine;
    }
}
