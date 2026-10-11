package j$.io;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;
import java.nio.file.*;
import java.io.*;
import java.lang.*;

import j$.util.Objects;
import j$.util.o0;
import java.util.stream.AbstractC3919t1;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return AbstractC3919t1.a0(new o0((Iterator) Objects.requireNonNull(new a(bufferedReader)), 272), false);
    }
}
