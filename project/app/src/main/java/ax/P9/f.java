/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.P9.n;
import java.io.InputStream;
import java.util.Scanner;

public class f
implements n {
    public static String d(InputStream inputStream) {
        return new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
    }
}

