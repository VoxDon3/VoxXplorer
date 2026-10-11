/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public interface l {
    public Map<String, String> a();

    public OutputStream b() throws IOException;

    public InputStream c() throws IOException;

    public void close();

    public String d();

    public void e(String var1, String var2);

    public int f() throws IOException;

    public String g() throws IOException;

    public void h(int var1);
}

