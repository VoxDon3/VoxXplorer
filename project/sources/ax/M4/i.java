package ax.M4;

import java.util.Arrays;

/* loaded from: classes.dex */
public class i {
    protected final String a;
    protected final String b;

    public i(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'id' is null");
        }
        this.a = str;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.b = str2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
