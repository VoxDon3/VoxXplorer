/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import java.util.Arrays;

public class i {
    protected final String a;
    protected final String b;

    public i(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        throw new IllegalArgumentException("Required value for 'id' is null");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

