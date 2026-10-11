/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.i;
import ax.r8.j;
import ax.r8.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class n {
    @Deprecated
    public n() {
    }

    /*
     * Exception decompiling
     */
    public static i b(JsonReader var0) throws j, r {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 28->72)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static i c(Reader object) throws j, r {
        try {
            JsonReader jsonReader = new JsonReader((Reader)object);
            object = n.b(jsonReader);
            if (!((i)object).n() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                object = new r("Did not consume the entire document.");
                throw object;
            }
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            throw new r(numberFormatException);
        }
        catch (IOException iOException) {
            throw new j(iOException);
        }
        catch (MalformedJsonException malformedJsonException) {
            throw new r(malformedJsonException);
        }
    }

    public static i d(String string) throws r {
        return n.c(new StringReader(string));
    }

    @Deprecated
    public i a(String string) throws r {
        return n.d(string);
    }
}

