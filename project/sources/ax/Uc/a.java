package ax.Uc;

import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class a extends BufferedReader implements BufferedReaderRetargetInterface {
    public a(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public /* synthetic */ Stream lines() {
        return Stream.Wrapper.convert(lines());
    }

    @Override // java.io.BufferedReader
    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z = false;
            while (true) {
                try {
                    int read = read();
                    if (read == -1) {
                        String sb2 = sb.toString();
                        if (sb2.isEmpty()) {
                            return null;
                        }
                        return sb2;
                    }
                    if (z && read == 10) {
                        return sb.substring(0, sb.length() - 1);
                    }
                    z = read == 13;
                    sb.append((char) read);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
    public /* synthetic */ j$.util.stream.Stream lines() {
        return DesugarBufferedReader.lines(this);
    }
}
