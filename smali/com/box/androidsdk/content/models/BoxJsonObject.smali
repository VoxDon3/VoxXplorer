.class public abstract Lcom/box/androidsdk/content/models/BoxJsonObject;
.super Lcom/box/androidsdk/content/models/BoxObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;,
        Lcom/box/androidsdk/content/models/BoxJsonObject$b;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x63927e9c99055c76L


# instance fields
.field private mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxObject;-><init>()V

    .line 2
    new-instance v0, Lax/O4/d;

    invoke-direct {v0}, Lax/O4/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->i(Lax/O4/d;)V

    return-void
.end method

.method public constructor <init>(Lax/O4/d;)V
    .registers 2

    .line 3
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxObject;-><init>()V

    .line 4
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject;->i(Lax/O4/d;)V

    return-void
.end method

.method public static l(Ljava/lang/Class;)Lcom/box/androidsdk/content/models/BoxJsonObject$b;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/box/androidsdk/content/models/BoxJsonObject;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/models/BoxJsonObject$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/box/androidsdk/content/models/BoxJsonObject$a;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lax/O4/d;->I(Ljava/io/Reader;)Lax/O4/d;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject;->i(Lax/O4/d;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/BufferedWriter;

    .line 2
    .line 3
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->n(Ljava/io/Writer;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->m()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public B()Lax/O4/d;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxJsonObject;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/O4/d;->J(Ljava/lang/String;)Lax/O4/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    .line 1
    instance-of v0, p1, Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 6
    .line 7
    check-cast p1, Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_f
    const/4 p1, 0x0

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i(Lax/O4/d;)V
    .registers 3

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;-><init>(Lcom/box/androidsdk/content/models/BoxJsonObject;Lax/O4/d;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public k(Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lax/O4/d;->J(Ljava/lang/String;)Lax/O4/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject;->i(Lax/O4/d;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public n()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->i()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected p(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected q(Ljava/lang/String;)Ljava/util/Date;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->b(Ljava/lang/String;)Ljava/util/Date;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected r(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxJsonObject;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/box/androidsdk/content/models/BoxJsonObject;",
            ">(",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->e(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected s(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/box/androidsdk/content/models/BoxJsonObject;",
            ">(",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->f(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected t(Ljava/lang/String;)Ljava/lang/Long;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->c(Ljava/lang/String;)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_a
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->c(Ljava/lang/String;)Ljava/lang/Double;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Double;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected u(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public w(Ljava/lang/String;)Lax/O4/g;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_a
    invoke-virtual {p1}, Lax/O4/g;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lax/O4/g;->t(Ljava/lang/String;)Lax/O4/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method protected x(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxJsonObject;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->j(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxJsonObject;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected y(Ljava/lang/String;Ljava/lang/Long;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->k(Ljava/lang/String;Ljava/lang/Long;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method protected z(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject;->mCacheMap:Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
