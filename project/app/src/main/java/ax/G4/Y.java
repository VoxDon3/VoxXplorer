/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Y {
    protected final String a;
    protected final String b;

    public Y(String string, String string2) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", string)) {
                this.a = string;
                if (string2 != null) {
                    if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", string2)) {
                        this.b = string2;
                        return;
                    }
                    throw new IllegalArgumentException("String 'toPath' does not match pattern");
                }
                throw new IllegalArgumentException("Required value for 'toPath' is null");
            }
            throw new IllegalArgumentException("String 'fromPath' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'fromPath' is null");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

