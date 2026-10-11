/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import android.util.JsonReader;
import android.util.JsonToken;
import ax.o5.l;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class v {
    static v a(long l8) {
        return new l(l8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static v b(Reader var0) throws IOException {
        block7: {
            block6: {
                var0 = new JsonReader(var0);
                try {
                    var0.beginObject();
lbl4:
                    // 2 sources

                    while (var0.hasNext()) {
                        if (!var0.nextName().equals("nextRequestWaitMillis")) ** GOTO lbl-1000
                        if (var0.peek() == JsonToken.STRING) {
                            var1_1 = v.a(Long.parseLong(var0.nextString()));
                            break block6;
                        }
                        ** GOTO lbl-1000
                    }
                    ** GOTO lbl21
                }
                catch (Throwable var1_2) {
                    break block7;
                }
            }
            var0.close();
            return var1_1;
lbl-1000:
            // 1 sources

            {
                var1_3 = v.a(var0.nextLong());
            }
            var0.close();
            return var1_3;
lbl-1000:
            // 1 sources

            {
                var0.skipValue();
                ** GOTO lbl4
lbl21:
                // 1 sources

                var1_4 = new IOException("Response is missing nextRequestWaitMillis field.");
                throw var1_4;
            }
        }
        var0.close();
        throw var1_2;
    }

    public abstract long c();
}

