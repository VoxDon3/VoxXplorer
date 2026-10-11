package ax.P9;

import java.io.InputStream;
import java.util.Scanner;

/* loaded from: classes3.dex */
public class f implements n {
    public static String d(InputStream inputStream) {
        return new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
    }
}
