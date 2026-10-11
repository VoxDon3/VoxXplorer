/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache;

import ax.Db.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.sb.d;
import ax.sb.t;
import ax.xc.A;
import ax.xc.C;
import ax.xc.f;
import ax.xc.k;
import ax.xc.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.FaultHidingSink;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

public final class DiskLruCache
implements Closeable,
Flushable,
AutoCloseable {
    public static final long ANY_SEQUENCE_NUMBER;
    public static final String CLEAN;
    public static final Companion Companion;
    public static final String DIRTY;
    public static final String JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP;
    public static final ax.Ob.g LEGAL_KEY_PATTERN;
    public static final String MAGIC;
    public static final String READ;
    public static final String REMOVE;
    public static final String VERSION_1;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final cleanupTask.1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private f journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    static {
        Companion = new Companion(null);
        JOURNAL_FILE = "journal";
        JOURNAL_FILE_TEMP = "journal.tmp";
        JOURNAL_FILE_BACKUP = "journal.bkp";
        MAGIC = "libcore.io.DiskLruCache";
        VERSION_1 = "1";
        ANY_SEQUENCE_NUMBER = -1L;
        LEGAL_KEY_PATTERN = new ax.Ob.g("[a-z0-9_-]{1,120}");
        CLEAN = "CLEAN";
        DIRTY = "DIRTY";
        REMOVE = "REMOVE";
        READ = "READ";
    }

    public DiskLruCache(FileSystem object, File file, int n8, int n9, long l8, TaskRunner taskRunner) {
        l.f(object, "fileSystem");
        l.f(file, "directory");
        l.f(taskRunner, "taskRunner");
        this.fileSystem = object;
        this.directory = file;
        this.appVersion = n8;
        this.valueCount = n9;
        this.maxSize = l8;
        this.lruEntries = new LinkedHashMap(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        object = new StringBuilder();
        ((StringBuilder)object).append(Util.okHttpName);
        ((StringBuilder)object).append(" Cache");
        this.cleanupTask = new Task(this, ((StringBuilder)object).toString()){
            final DiskLruCache this$0;
            {
                this.this$0 = diskLruCache;
                super(string, false, 2, null);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    Throwable throwable2;
                    block9: {
                        block8: {
                            try {
                                boolean bl;
                                if (!DiskLruCache.access$getInitialized$p(diskLruCache) || (bl = diskLruCache.getClosed$okhttp())) break block8;
                                try {
                                    diskLruCache.trimToSize();
                                }
                                catch (IOException iOException) {
                                    DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache, true);
                                }
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                            try {
                                if (DiskLruCache.access$journalRebuildRequired(diskLruCache)) {
                                    diskLruCache.rebuildJournal$okhttp();
                                    DiskLruCache.access$setRedundantOpCount$p(diskLruCache, 0);
                                }
                            }
                            catch (IOException iOException) {
                                DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache, true);
                                DiskLruCache.access$setJournalWriter$p(diskLruCache, p.c(p.b()));
                            }
                            return -1L;
                        }
                        return -1L;
                    }
                    throw throwable2;
                }
            }
        };
        if (l8 > 0L) {
            if (n9 > 0) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
        return diskLruCache.initialized;
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
        return diskLruCache.journalRebuildRequired();
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(DiskLruCache diskLruCache, boolean bl) {
        diskLruCache.hasJournalErrors = bl;
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, f f8) {
        diskLruCache.journalWriter = f8;
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean bl) {
        diskLruCache.mostRecentRebuildFailed = bl;
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean bl) {
        diskLruCache.mostRecentTrimFailed = bl;
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int n8) {
        diskLruCache.redundantOpCount = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void checkNotClosed() {
        synchronized (this) {
            boolean bl = this.closed;
            if (!bl) {
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("cache is closed");
            throw illegalStateException;
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String string, long l8, int n8, Object object) throws IOException {
        if ((n8 & 2) != 0) {
            l8 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(string, l8);
    }

    private final boolean journalRebuildRequired() {
        int n8 = this.redundantOpCount;
        return n8 >= 2000 && n8 >= ((AbstractMap)this.lruEntries).size();
    }

    private final f newJournalWriter() throws FileNotFoundException {
        return p.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), (ax.Fb.l<? super IOException, t>)new ax.Fb.l<IOException, t>(this){
            final DiskLruCache this$0;
            {
                this.this$0 = diskLruCache;
                super(1);
            }

            public final void invoke(IOException object) {
                l.f(object, "it");
                object = this.this$0;
                if (Util.assertionsEnabled && !Thread.holdsLock(object)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Thread ");
                    stringBuilder.append(Thread.currentThread().getName());
                    stringBuilder.append(" MUST hold lock on ");
                    stringBuilder.append(object);
                    throw new AssertionError((Object)stringBuilder.toString());
                }
                DiskLruCache.access$setHasJournalErrors$p(this.this$0, true);
            }
        }));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> iterator = this.lruEntries.values().iterator();
        while (iterator.hasNext()) {
            int n8;
            Object object = iterator.next();
            l.e(object, "i.next()");
            Entry entry = object;
            object = entry.getCurrentEditor$okhttp();
            int n9 = 0;
            if (object == null) {
                int n10 = this.valueCount;
                for (n8 = n9; n8 < n10; ++n8) {
                    this.size += entry.getLengths$okhttp()[n8];
                }
                continue;
            }
            entry.setCurrentEditor$okhttp(null);
            n9 = this.valueCount;
            for (n8 = 0; n8 < n9; ++n8) {
                this.fileSystem.delete(entry.getCleanFiles$okhttp().get(n8));
                this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(n8));
            }
            iterator.remove();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void readJournal() throws IOException {
        block11: {
            var2_1 = p.d(this.fileSystem.source(this.journalFile));
            var6_2 = var2_1.v0();
            var3_3 = var2_1.v0();
            var7_7 = var2_1.v0();
            var5_8 = var2_1.v0();
            var4_9 = var2_1.v0();
            if (!l.a(DiskLruCache.MAGIC, var6_2) || !l.a(DiskLruCache.VERSION_1, var3_3) || !l.a(String.valueOf(this.appVersion), var7_7) || !l.a(String.valueOf(this.valueCount), var5_8) || (var1_11 = var4_9.length()) > 0) ** GOTO lbl-1000
            var1_11 = 0;
            while (true) {
                this.readJournalLine(var2_1.v0());
                ++var1_11;
            }
            {
                catch (Throwable var3_4) {
                    break block11;
                }
                catch (EOFException var3_5) {}
                {
                    this.redundantOpCount = var1_11 - this.lruEntries.size();
                    if (!var2_1.P()) {
                        this.rebuildJournal$okhttp();
                    } else {
                        this.journalWriter = this.newJournalWriter();
                    }
                    var3_6 = t.a;
                }
                a.a(var2_1, null);
                return;
            }
lbl-1000:
            // 1 sources

            {
                var8_12 = new StringBuilder();
                var8_12.append("unexpected journal header: [");
                var8_12.append(var6_2);
                var8_12.append(", ");
                var8_12.append(var3_3);
                var8_12.append(", ");
                var8_12.append(var5_8);
                var8_12.append(", ");
                var8_12.append(var4_9);
                var8_12.append(']');
                var7_7 = new IOException(var8_12.toString());
                throw var7_7;
            }
        }
        try {
            throw var3_4;
        }
        catch (Throwable var4_10) {
            a.a(var2_1, var3_4);
            throw var4_10;
        }
    }

    private final void readJournalLine(String object) throws IOException {
        int n8 = h.U((CharSequence)object, ' ', 0, false, 6, null);
        if (n8 != -1) {
            String string;
            Object object2;
            Object object3;
            int n9 = n8 + 1;
            int n10 = h.U((CharSequence)object, ' ', n9, false, 4, null);
            if (n10 == -1) {
                object3 = ((String)object).substring(n9);
                l.e(object3, "this as java.lang.String).substring(startIndex)");
                object2 = REMOVE;
                string = object3;
                if (n8 == ((String)object2).length()) {
                    string = object3;
                    if (h.H((String)object, (String)object2, false, 2, null)) {
                        ((AbstractMap)this.lruEntries).remove(object3);
                        return;
                    }
                }
            } else {
                string = ((String)object).substring(n9, n10);
                l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            }
            object3 = object2 = this.lruEntries.get(string);
            if (object2 == null) {
                object3 = new Entry(this, string);
                this.lruEntries.put(string, (Entry)object3);
            }
            if (n10 != -1 && n8 == (string = CLEAN).length() && h.H((String)object, string, false, 2, null)) {
                object = ((String)object).substring(n10 + 1);
                l.e(object, "this as java.lang.String).substring(startIndex)");
                object = h.q0((CharSequence)object, new char[]{' '}, false, 0, 6, null);
                ((Entry)object3).setReadable$okhttp(true);
                ((Entry)object3).setCurrentEditor$okhttp(null);
                ((Entry)object3).setLengths$okhttp((List<String>)object);
                return;
            }
            if (n10 == -1 && n8 == (string = DIRTY).length() && h.H((String)object, string, false, 2, null)) {
                ((Entry)object3).setCurrentEditor$okhttp(new Editor(this, (Entry)object3));
                return;
            }
            if (n10 == -1 && n8 == ((String)(object3 = READ)).length() && h.H((String)object, (String)object3, false, 2, null)) {
                return;
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("unexpected journal line: ");
            ((StringBuilder)object3).append((String)object);
            throw new IOException(((StringBuilder)object3).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal line: ");
        stringBuilder.append((String)object);
        throw new IOException(stringBuilder.toString());
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (entry.getZombie$okhttp()) continue;
            l.e(entry, "toEvict");
            this.removeEntry$okhttp(entry);
            return true;
        }
        return false;
    }

    private final void validateKey(String string) {
        if (LEGAL_KEY_PATTERN.a(string)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        stringBuilder.append(string);
        stringBuilder.append('\"');
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        synchronized (this) {
            try {
                int n8;
                Object object;
                if (this.initialized && !this.closed) {
                    object = this.lruEntries.values();
                    l.e(object, "lruEntries.values");
                    object = object.toArray(new Entry[0]);
                    n8 = ((Entry[])object).length;
                } else {
                    this.closed = true;
                    return;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object object2 = object[i8];
                    if (((Entry)object2).getCurrentEditor$okhttp() == null || (object2 = ((Entry)object2).getCurrentEditor$okhttp()) == null) continue;
                    ((Editor)object2).detach$okhttp();
                    continue;
                }
                this.trimToSize();
                object = this.journalWriter;
                l.c(object);
                object.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void completeEdit$okhttp(Editor var1_1, boolean var2_3) throws IOException {
        synchronized (this) {
            block17: {
                block16: {
                    block15: {
                        try {
                            l.f(var1_1, "editor");
                            var10_4 = var1_1.getEntry$okhttp();
                            if (!l.a(var10_4.getCurrentEditor$okhttp(), var1_1)) ** GOTO lbl81
                            var4_5 = 0;
                            if (var2_3 && !var10_4.getReadable$okhttp()) {
                                var5_6 = this.valueCount;
                                var3_7 = 0;
lbl10:
                                // 2 sources

                                while (var3_7 < var5_6) {
                                    var11_8 /* !! */  = var1_1.getWritten$okhttp();
                                    l.c(var11_8 /* !! */ );
                                    break block15;
                                }
                            }
                            ** GOTO lbl34
                        }
                        catch (Throwable var1_2) {
                            break block17;
                        }
                    }
                    if (!var11_8 /* !! */ [var3_7]) ** GOTO lbl-1000
                    {
                        if (this.fileSystem.exists(var10_4.getDirtyFiles$okhttp().get(var3_7))) break block16;
                        var1_1.abort();
                        return;
                    }
                }
                ++var3_7;
                ** GOTO lbl10
lbl-1000:
                // 1 sources

                {
                    var1_1.abort();
                    var1_1 = new StringBuilder();
                    var1_1.append("Newly created entry didn't create value for index ");
                    var1_1.append(var3_7);
                    var10_4 = new IllegalStateException(var1_1.toString());
                    throw var10_4;
lbl34:
                    // 1 sources

                    var5_6 = this.valueCount;
                    for (var3_7 = var4_5; var3_7 < var5_6; ++var3_7) {
                        var11_8 /* !! */  = (boolean[])var10_4.getDirtyFiles$okhttp().get(var3_7);
                        if (var2_3 && !var10_4.getZombie$okhttp()) {
                            if (!this.fileSystem.exists((File)var11_8 /* !! */ )) continue;
                            var1_1 = var10_4.getCleanFiles$okhttp().get(var3_7);
                            this.fileSystem.rename((File)var11_8 /* !! */ , (File)var1_1);
                            var6_9 = var10_4.getLengths$okhttp()[var3_7];
                            var10_4.getLengths$okhttp()[var3_7] = var8_10 = this.fileSystem.size((File)var1_1);
                            this.size = this.size - var6_9 + var8_10;
                            continue;
                        }
                        this.fileSystem.delete((File)var11_8 /* !! */ );
                    }
                }
                {
                    var10_4.setCurrentEditor$okhttp(null);
                    if (var10_4.getZombie$okhttp()) {
                        this.removeEntry$okhttp((Entry)var10_4);
                        return;
                    }
                    ++this.redundantOpCount;
                    var1_1 = this.journalWriter;
                    l.c(var1_1);
                    if (!var10_4.getReadable$okhttp() && !var2_3) {
                        this.lruEntries.remove(var10_4.getKey$okhttp());
                        var1_1.f0(DiskLruCache.REMOVE).writeByte(32);
                        var1_1.f0(var10_4.getKey$okhttp());
                        var1_1.writeByte(10);
                    } else {
                        var10_4.setReadable$okhttp(true);
                        var1_1.f0(DiskLruCache.CLEAN).writeByte(32);
                        var1_1.f0(var10_4.getKey$okhttp());
                        var10_4.writeLengths$okhttp((f)var1_1);
                        var1_1.writeByte(10);
                        if (var2_3) {
                            var6_9 = this.nextSequenceNumber;
                            this.nextSequenceNumber = 1L + var6_9;
                            var10_4.setSequenceNumber$okhttp(var6_9);
                        }
                    }
                    var1_1.flush();
                    if (this.size > this.maxSize || this.journalRebuildRequired()) {
                        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
                    return;
lbl81:
                    // 1 sources

                    var1_1 = new IllegalStateException("Check failed.");
                    throw var1_1;
                }
            }
            throw var1_2;
        }
    }

    public final void delete() throws IOException {
        this.close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String string) throws IOException {
        l.f(string, "key");
        return DiskLruCache.edit$default(this, string, 0L, 2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Editor edit(String object, long l8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block16: {
                block13: {
                    Object object2;
                    block15: {
                        Entry entry;
                        block14: {
                            block12: {
                                block11: {
                                    try {
                                        long l9;
                                        l.f(object, "key");
                                        this.initialize();
                                        this.checkNotClosed();
                                        this.validateKey((String)object);
                                        entry = this.lruEntries.get(object);
                                        if (l8 == ANY_SEQUENCE_NUMBER || entry != null && (l9 = entry.getSequenceNumber$okhttp()) == l8) break block11;
                                    }
                                    catch (Throwable throwable2) {}
                                    return null;
                                }
                                if (entry != null) {
                                    object2 = entry.getCurrentEditor$okhttp();
                                } else {
                                    object2 = null;
                                }
                                if (object2 != null) {
                                    return null;
                                }
                                if (entry != null) {
                                    int n8 = entry.getLockingSourceCount$okhttp();
                                    if (n8 == 0) break block12;
                                    return null;
                                }
                            }
                            if (this.mostRecentTrimFailed || this.mostRecentRebuildFailed) break block13;
                            object2 = this.journalWriter;
                            l.c(object2);
                            object2.f0(DIRTY).writeByte(32).f0((String)object).writeByte(10);
                            object2.flush();
                            boolean bl = this.hasJournalErrors;
                            if (!bl) break block14;
                            return null;
                        }
                        object2 = entry;
                        if (entry != null) break block15;
                        object2 = new Entry(this, (String)object);
                        this.lruEntries.put((String)object, (Entry)object2);
                        break block16;
                    }
                    object = new Editor(this, (Entry)object2);
                    ((Entry)object2).setCurrentEditor$okhttp((Editor)object);
                    return object;
                }
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void evictAll() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n8;
                Entry[] entryArray;
                try {
                    this.initialize();
                    entryArray = this.lruEntries.values();
                    l.e(entryArray, "lruEntries.values");
                    entryArray = entryArray.toArray(new Entry[0]);
                    n8 = entryArray.length;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    Entry entry = entryArray[i8];
                    {
                        l.e(entry, "entry");
                        this.removeEntry$okhttp(entry);
                        continue;
                    }
                }
                {
                    this.mostRecentTrimFailed = false;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void flush() throws IOException {
        synchronized (this) {
            boolean bl = this.initialized;
            if (!bl) {
                return;
            }
            this.checkNotClosed();
            this.trimToSize();
            f f8 = this.journalWriter;
            l.c(f8);
            f8.flush();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Snapshot get(String string) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block8: {
                block7: {
                    block6: {
                        try {
                            l.f(string, "key");
                            this.initialize();
                            this.checkNotClosed();
                            this.validateKey(string);
                            object = this.lruEntries.get(string);
                            if (object != null) break block6;
                        }
                        catch (Throwable throwable2) {}
                        return null;
                    }
                    object = ((Entry)object).snapshot$okhttp();
                    if (object != null) break block7;
                    return null;
                }
                ++this.redundantOpCount;
                f f8 = this.journalWriter;
                l.c(f8);
                f8.f0(READ).writeByte(32).f0(string).writeByte(10);
                if (!this.journalRebuildRequired()) break block8;
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
            return object;
            throw throwable2;
        }
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long getMaxSize() {
        synchronized (this) {
            return this.maxSize;
        }
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void initialize() throws IOException {
        synchronized (this) {
            block15: {
                if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                    var3_5 = new StringBuilder();
                    var3_5.append("Thread ");
                    var3_5.append(Thread.currentThread().getName());
                    var3_5.append(" MUST hold lock on ");
                    var3_5.append(this);
                    var2_1 = new AssertionError((Object)var3_5.toString());
                    throw var2_1;
                }
                var1_7 = this.initialized;
                if (var1_7) {
                }
                ** GOTO lbl22
                {
                    catch (Throwable var2_2) {
                        break block15;
                    }
                    return;
lbl22:
                    // 1 sources

                    if (this.fileSystem.exists(this.journalFileBackup)) {
                        if (this.fileSystem.exists(this.journalFile)) {
                            this.fileSystem.delete(this.journalFileBackup);
                        } else {
                            this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                        }
                    }
                    this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
                    var1_7 = this.fileSystem.exists(this.journalFile);
                    if (!var1_7) ** GOTO lbl-1000
                    try {
                        this.readJournal();
                        this.processJournal();
                        this.initialized = true;
                        return;
                    }
                    catch (IOException var2_3) {}
                    var3_6 = Platform.Companion.get();
                    var4_8 = new StringBuilder();
                    var4_8.append("DiskLruCache ");
                    var4_8.append(this.directory);
                    var4_8.append(" is corrupt: ");
                    var4_8.append(var2_3.getMessage());
                    var4_8.append(", removing");
                    var3_6.log(var4_8.toString(), 5, var2_3);
                    try {
                        this.delete();
                    }
                    finally {
                        this.closed = false;
                    }
lbl-1000:
                    // 2 sources

                    {
                        this.rebuildJournal$okhttp();
                        this.initialized = true;
                        return;
                    }
                }
            }
            throw var2_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isClosed() {
        synchronized (this) {
            return this.closed;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void rebuildJournal$okhttp() throws IOException {
        synchronized (this) {
            Object object;
            Iterator<Entry> iterator;
            f f8;
            block13: {
                Throwable throwable2;
                f8 = this.journalWriter;
                if (f8 != null) {
                    f8.close();
                }
                f8 = p.c(this.fileSystem.sink(this.journalFileTmp));
                {
                    catch (Throwable throwable2) {}
                }
                try {
                    f8.f0(MAGIC).writeByte(10);
                    f8.f0(VERSION_1).writeByte(10);
                    f8.Q0(this.appVersion).writeByte(10);
                    f8.Q0(this.valueCount).writeByte(10);
                    f8.writeByte(10);
                    iterator = this.lruEntries.values().iterator();
                    break block13;
                }
                catch (Throwable throwable3) {}
                try {
                    throw throwable3;
                }
                catch (Throwable throwable4) {
                    a.a(f8, throwable3);
                    throw throwable4;
                }
                throw throwable2;
            }
            while (iterator.hasNext()) {
                object = iterator.next();
                if (((Entry)object).getCurrentEditor$okhttp() != null) {
                    f8.f0(DIRTY).writeByte(32);
                    f8.f0(((Entry)object).getKey$okhttp());
                    f8.writeByte(10);
                    continue;
                }
                f8.f0(CLEAN).writeByte(32);
                f8.f0(((Entry)object).getKey$okhttp());
                ((Entry)object).writeLengths$okhttp(f8);
                f8.writeByte(10);
            }
            object = t.a;
            {
                a.a(f8, null);
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = this.newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
                return;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean remove(String object) throws IOException {
        synchronized (this) {
            boolean bl;
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        l.f(object, "key");
                        this.initialize();
                        this.checkNotClosed();
                        this.validateKey((String)object);
                        object = this.lruEntries.get(object);
                        if (object != null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return false;
                }
                bl = this.removeEntry$okhttp((Entry)object);
                if (!bl || this.size > this.maxSize) break block6;
                this.mostRecentTrimFailed = false;
            }
            return bl;
            throw throwable2;
        }
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        Object object;
        l.f(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (object = this.journalWriter) != null) {
                object.f0(DIRTY);
                object.writeByte(32);
                object.f0(entry.getKey$okhttp());
                object.writeByte(10);
                object.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        if ((object = entry.getCurrentEditor$okhttp()) != null) {
            ((Editor)object).detach$okhttp();
        }
        int n8 = this.valueCount;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i8));
            this.size -= entry.getLengths$okhttp()[i8];
            entry.getLengths$okhttp()[i8] = 0L;
        }
        ++this.redundantOpCount;
        object = this.journalWriter;
        if (object != null) {
            object.f0(REMOVE);
            object.writeByte(32);
            object.f0(entry.getKey$okhttp());
            object.writeByte(10);
        }
        ((AbstractMap)this.lruEntries).remove(entry.getKey$okhttp());
        if (this.journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean bl) {
        this.closed = bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setMaxSize(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.maxSize = l8;
                        if (!this.initialized) break block4;
                        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long size() throws IOException {
        synchronized (this) {
            this.initialize();
            return this.size;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Iterator<Snapshot> snapshots() throws IOException {
        synchronized (this) {
            this.initialize();
            return new Iterator<Snapshot>(this){
                private final Iterator<Entry> delegate;
                private Snapshot nextSnapshot;
                private Snapshot removeSnapshot;
                final DiskLruCache this$0;
                {
                    this.this$0 = object;
                    object = new ArrayList<Entry>(((DiskLruCache)object).getLruEntries$okhttp().values()).iterator();
                    l.e(object, "ArrayList(lruEntries.values).iterator()");
                    this.delegate = object;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public boolean hasNext() {
                    if (this.nextSnapshot != null) {
                        return true;
                    }
                    DiskLruCache diskLruCache = this.this$0;
                    synchronized (diskLruCache) {
                        Throwable throwable2;
                        block7: {
                            Object object;
                            block6: {
                                try {
                                    boolean bl = diskLruCache.getClosed$okhttp();
                                    if (!bl) break block6;
                                }
                                catch (Throwable throwable2) {
                                    break block7;
                                }
                                return false;
                            }
                            do {
                                if (this.delegate.hasNext()) continue;
                                object = t.a;
                                return false;
                            } while ((object = this.delegate.next()) == null || (object = ((Entry)object).snapshot$okhttp()) == null);
                            this.nextSnapshot = object;
                            return true;
                        }
                        throw throwable2;
                    }
                }

                public Snapshot next() {
                    if (this.hasNext()) {
                        Snapshot snapshot;
                        this.removeSnapshot = snapshot = this.nextSnapshot;
                        this.nextSnapshot = null;
                        l.c(snapshot);
                        return snapshot;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    Snapshot snapshot = this.removeSnapshot;
                    if (snapshot != null) {
                        try {
                            this.this$0.remove(snapshot.key());
                            return;
                        }
                        catch (IOException iOException) {
                            return;
                        }
                        finally {
                            this.removeSnapshot = null;
                        }
                    }
                    throw new IllegalStateException("remove() before next()");
                }
            };
        }
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (this.removeOldestEntry()) continue;
            return;
        }
        this.mostRecentTrimFailed = false;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache object, Entry entry) {
            l.f(entry, "entry");
            this.this$0 = object;
            this.entry = entry;
            object = entry.getReadable$okhttp() ? null : (Object)new boolean[((DiskLruCache)object).getValueCount$okhttp()];
            this.written = (boolean[])object;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            if (this.done) {
                                IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
                                throw illegalStateException;
                            }
                            if (!l.a(this.entry.getCurrentEditor$okhttp(), this)) break block4;
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.done = true;
                    t t8 = t.a;
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            if (this.done) {
                                IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
                                throw illegalStateException;
                            }
                            if (!l.a(this.entry.getCurrentEditor$okhttp(), this)) break block4;
                            diskLruCache.completeEdit$okhttp(this, true);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.done = true;
                    t t8 = t.a;
                    return;
                }
                throw throwable2;
            }
        }

        public final void detach$okhttp() {
            if (l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                    return;
                }
                this.entry.setZombie$okhttp(true);
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final A newSink(int n8) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                Throwable throwable2;
                block10: {
                    A a8;
                    Object object;
                    block9: {
                        try {
                            if (!this.done) {
                                if (!l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                                    return p.b();
                                }
                                if (!this.entry.getReadable$okhttp()) {
                                    object = this.written;
                                    l.c(object);
                                    object[n8] = true;
                                }
                                break block9;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
                            throw illegalStateException;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    object = this.entry.getDirtyFiles$okhttp().get(n8);
                    try {
                        a8 = diskLruCache.getFileSystem$okhttp().sink((File)object);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        return p.b();
                    }
                    object = new newSink.1.1;
                    object(diskLruCache, this);
                    return new FaultHidingSink(a8, (ax.Fb.l<? super IOException, t>)object);
                }
                throw throwable2;
            }
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final C newSource(int n8) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                Throwable throwable2;
                C c8;
                block6: {
                    block7: {
                        try {
                            if (this.done) break block6;
                            boolean bl = this.entry.getReadable$okhttp();
                            c8 = null;
                            if (!bl) return null;
                            if (!l.a(this.entry.getCurrentEditor$okhttp(), this)) return null;
                            bl = this.entry.getZombie$okhttp();
                            if (bl) break block7;
                            C c9 = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(n8));
                            return c9;
                        }
                        catch (Throwable throwable2) {}
                    }
                    return null;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
                throw illegalStateException;
                throw throwable2;
                catch (FileNotFoundException fileNotFoundException) {}
                return c8;
            }
        }
    }

    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String charSequence) {
            l.f(charSequence, "key");
            this.this$0 = diskLruCache;
            this.key = charSequence;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList<File>();
            this.dirtyFiles = new ArrayList<File>();
            charSequence = new StringBuilder((String)charSequence);
            ((StringBuilder)charSequence).append('.');
            int n8 = ((StringBuilder)charSequence).length();
            int n9 = diskLruCache.getValueCount$okhttp();
            for (int i8 = 0; i8 < n9; ++i8) {
                ((StringBuilder)charSequence).append(i8);
                ((Collection)this.cleanFiles).add(new File(this.this$0.getDirectory(), ((StringBuilder)charSequence).toString()));
                ((StringBuilder)charSequence).append(".tmp");
                ((Collection)this.dirtyFiles).add(new File(this.this$0.getDirectory(), ((StringBuilder)charSequence).toString()));
                ((StringBuilder)charSequence).setLength(n8);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(list);
            throw new IOException(stringBuilder.toString());
        }

        private final C newSource(int n8) {
            C c8 = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(n8));
            if (this.this$0.civilizedFileSystem) {
                return c8;
            }
            ++this.lockingSourceCount;
            return new k(c8, this.this$0, this){
                private boolean closed;
                final DiskLruCache this$0;
                final Entry this$1;
                {
                    this.this$0 = diskLruCache;
                    this.this$1 = entry;
                    super(c8);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache = this.this$0;
                    Object object = this.this$1;
                    synchronized (diskLruCache) {
                        Throwable throwable2;
                        block5: {
                            block4: {
                                try {
                                    ((Entry)object).setLockingSourceCount$okhttp(((Entry)object).getLockingSourceCount$okhttp() - 1);
                                    if (((Entry)object).getLockingSourceCount$okhttp() != 0 || !((Entry)object).getZombie$okhttp()) break block4;
                                    diskLruCache.removeEntry$okhttp((Entry)object);
                                }
                                catch (Throwable throwable2) {
                                    break block5;
                                }
                            }
                            object = t.a;
                            return;
                        }
                        throw throwable2;
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            l.f(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                int n8;
                try {
                    n8 = list.size();
                }
                catch (NumberFormatException numberFormatException) {
                    this.invalidLengths(list);
                    throw new d();
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.lengths[i8] = Long.parseLong(list.get(i8));
                    continue;
                }
                return;
            }
            this.invalidLengths(list);
            throw new d();
        }

        public final void setLockingSourceCount$okhttp(int n8) {
            this.lockingSourceCount = n8;
        }

        public final void setReadable$okhttp(boolean bl) {
            this.readable = bl;
        }

        public final void setSequenceNumber$okhttp(long l8) {
            this.sequenceNumber = l8;
        }

        public final void setZombie$okhttp(boolean bl) {
            this.zombie = bl;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final Snapshot snapshot$okhttp() {
            int n8;
            Object object = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(object)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST hold lock on ");
                stringBuilder.append(object);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem) {
                if (this.currentEditor != null) return null;
                if (this.zombie) {
                    return null;
                }
            }
            ArrayList<C> arrayList = new ArrayList<C>();
            object = (long[])this.lengths.clone();
            int n9 = 0;
            int n10 = this.this$0.getValueCount$okhttp();
            for (n8 = 0; n8 < n10; ++n8) {
                arrayList.add(this.newSource(n8));
                continue;
            }
            try {
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, (long[])object);
            }
            catch (FileNotFoundException fileNotFoundException) {
                n10 = arrayList.size();
                for (n8 = n9; n8 < n10; ++n8) {
                    Object e8 = arrayList.get(n8);
                    Util.closeQuietly((C)e8);
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                    return null;
                }
                catch (IOException iOException) {
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(f f8) throws IOException {
            l.f(f8, "writer");
            for (long l8 : this.lengths) {
                f8.writeByte(32).Q0(l8);
            }
        }
    }

    public final class Snapshot
    implements Closeable,
    AutoCloseable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<C> sources;
        final DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String string, long l8, List<? extends C> list, long[] lArray) {
            l.f(string, "key");
            l.f(list, "sources");
            l.f(lArray, "lengths");
            this.this$0 = diskLruCache;
            this.key = string;
            this.sequenceNumber = l8;
            this.sources = list;
            this.lengths = lArray;
        }

        @Override
        public void close() {
            Iterator<C> iterator = this.sources.iterator();
            while (iterator.hasNext()) {
                Util.closeQuietly(iterator.next());
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int n8) {
            return this.lengths[n8];
        }

        public final C getSource(int n8) {
            return this.sources.get(n8);
        }

        public final String key() {
            return this.key;
        }
    }
}

