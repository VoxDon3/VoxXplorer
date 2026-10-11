package ax.G4;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Y {
    protected final String a;
    protected final String b;

    public Y(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'fromPath' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", str)) {
            throw new IllegalArgumentException("String 'fromPath' does not match pattern");
        }
        this.a = str;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'toPath' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", str2)) {
            throw new IllegalArgumentException("String 'toPath' does not match pattern");
        }
        this.b = str2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
