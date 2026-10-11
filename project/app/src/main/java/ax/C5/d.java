/*
 * Decompiled with CFR 0.152.
 */
package ax.C5;

import android.util.Log;
import ax.V5.i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class d {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(String string) {
        int n8;
        int n9;
        IndexOutOfBoundsException indexOutOfBoundsException2222222;
        Object object;
        block15: {
            Throwable var3_5;
            CharSequence charSequence;
            block14: {
                i.b(263);
                object = new URL(string);
                object = (HttpURLConnection)((URL)object).openConnection();
                {
                    catch (RuntimeException runtimeException) {
                        break block14;
                    }
                    catch (IOException iOException) {
                        break block14;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2222222) {
                        break block15;
                    }
                    catch (Throwable throwable2) {
                        throw throwable2;
                    }
                    try {
                        n9 = ((HttpURLConnection)object).getResponseCode();
                        if (n9 < 200 || n9 >= 300) {
                            n8 = String.valueOf(string).length();
                            charSequence = new StringBuilder(n8 + 65);
                            ((StringBuilder)charSequence).append("Received non-success response code ");
                            ((StringBuilder)charSequence).append(n9);
                            ((StringBuilder)charSequence).append(" from pinging URL: ");
                            ((StringBuilder)charSequence).append(string);
                            Log.w((String)"HttpUrlPinger", (String)((StringBuilder)charSequence).toString());
                        }
                    }
                    finally {
                        ((HttpURLConnection)object).disconnect();
                    }
                    {
                    }
                }
            }
            charSequence = var3_5.getMessage();
            n9 = String.valueOf(string).length();
            n8 = String.valueOf(charSequence).length();
            StringBuilder stringBuilder = new StringBuilder(n9 + 27 + n8);
            stringBuilder.append("Error while pinging URL: ");
            stringBuilder.append(string);
            stringBuilder.append(". ");
            stringBuilder.append((String)charSequence);
            Log.w((String)"HttpUrlPinger", (String)stringBuilder.toString(), (Throwable)var3_5);
            return;
        }
        object = indexOutOfBoundsException2222222.getMessage();
        n9 = String.valueOf(string).length();
        n8 = String.valueOf(object).length();
        StringBuilder stringBuilder = new StringBuilder(n9 + 32 + n8);
        stringBuilder.append("Error while parsing ping URL: ");
        stringBuilder.append(string);
        stringBuilder.append(". ");
        stringBuilder.append((String)object);
        Log.w((String)"HttpUrlPinger", (String)stringBuilder.toString(), (Throwable)indexOutOfBoundsException2222222);
    }
}

