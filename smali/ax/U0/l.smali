.class public final Lax/U0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/U0/l$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/U0/z;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/U0/g;

.field private d:Lax/U0/g;

.field private e:Lax/U0/g;

.field private f:Lax/U0/g;

.field private g:Lax/U0/g;

.field private h:Lax/U0/g;

.field private i:Lax/U0/g;

.field private j:Lax/U0/g;

.field private k:Lax/U0/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/U0/g;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/U0/l;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lax/U0/g;

    .line 15
    .line 16
    iput-object p1, p0, Lax/U0/l;->c:Lax/U0/g;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lax/U0/l;->b:Ljava/util/List;

    .line 24
    .line 25
    return-void
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

.method private q(Lax/U0/g;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/U0/l;->b:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_17

    .line 9
    .line 10
    iget-object v1, p0, Lax/U0/l;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lax/U0/z;

    .line 17
    .line 18
    invoke-interface {p1, v1}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_17
    return-void
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

.method private r()Lax/U0/g;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U0/l;->e:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    new-instance v0, Lax/U0/a;

    .line 6
    .line 7
    iget-object v1, p0, Lax/U0/l;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lax/U0/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/U0/l;->e:Lax/U0/g;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/U0/l;->e:Lax/U0/g;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method private s()Lax/U0/g;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U0/l;->f:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    new-instance v0, Lax/U0/d;

    .line 6
    .line 7
    iget-object v1, p0, Lax/U0/l;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lax/U0/d;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/U0/l;->f:Lax/U0/g;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/U0/l;->f:Lax/U0/g;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method private t()Lax/U0/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U0/l;->i:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Lax/U0/e;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/U0/e;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/U0/l;->i:Lax/U0/g;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/U0/l;->i:Lax/U0/g;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private u()Lax/U0/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U0/l;->d:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Lax/U0/q;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/U0/q;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/U0/l;->d:Lax/U0/g;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/U0/l;->d:Lax/U0/g;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private v()Lax/U0/g;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/U0/l;->j:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    new-instance v0, Lax/U0/x;

    .line 6
    .line 7
    iget-object v1, p0, Lax/U0/l;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lax/U0/x;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/U0/l;->j:Lax/U0/g;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/U0/l;->j:Lax/U0/g;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method private w()Lax/U0/g;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_33

    .line 4
    .line 5
    :try_start_4
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lax/U0/g;

    .line 21
    .line 22
    iput-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V
    :try_end_1a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_1a} :catch_24
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_1a} :catch_1b

    .line 25
    .line 26
    .line 27
    goto :goto_2b

    .line 28
    :catch_1b
    move-exception v0

    .line 29
    new-instance v1, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    const-string v2, "Error instantiating RTMP extension"

    .line 32
    .line 33
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :catch_24
    const-string v0, "DefaultDataSource"

    .line 38
    .line 39
    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_2b
    iget-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 45
    .line 46
    if-nez v0, :cond_33

    .line 47
    .line 48
    iget-object v0, p0, Lax/U0/l;->c:Lax/U0/g;

    .line 49
    .line 50
    iput-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 51
    .line 52
    :cond_33
    iget-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 53
    .line 54
    return-object v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private x()Lax/U0/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U0/l;->h:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Lax/U0/A;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/U0/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/U0/l;->h:Lax/U0/g;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lax/U0/l;->q(Lax/U0/g;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lax/U0/l;->h:Lax/U0/g;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private y(Lax/U0/g;Lax/U0/z;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-interface {p1, p2}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 4
    .line 5
    .line 6
    :cond_5
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


# virtual methods
.method public b()Landroid/net/Uri;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-interface {v0}, Lax/U0/g;->b()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public c([BII)I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/U0/g;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lax/P0/k;->c([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_5
    invoke-interface {v0}, Lax/U0/g;->close()V
    :try_end_8
    .catchall {:try_start_5 .. :try_end_8} :catchall_b

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_b
    move-exception v0

    .line 13
    iput-object v1, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 14
    .line 15
    throw v0

    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d(Lax/U0/z;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/U0/l;->c:Lax/U0/g;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/U0/l;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/U0/l;->d:Lax/U0/g;

    .line 15
    .line 16
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lax/U0/l;->e:Lax/U0/g;

    .line 20
    .line 21
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/U0/l;->f:Lax/U0/g;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lax/U0/l;->g:Lax/U0/g;

    .line 30
    .line 31
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/U0/l;->h:Lax/U0/g;

    .line 35
    .line 36
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lax/U0/l;->i:Lax/U0/g;

    .line 40
    .line 41
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/U0/l;->j:Lax/U0/g;

    .line 45
    .line 46
    invoke-direct {p0, v0, p1}, Lax/U0/l;->y(Lax/U0/g;Lax/U0/z;)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public f(Lax/U0/k;)J
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lax/U0/k;->a:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p1, Lax/U0/k;->a:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-static {v1}, Lax/S0/d0;->O0(Landroid/net/Uri;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_37

    .line 24
    .line 25
    iget-object v0, p1, Lax/U0/k;->a:Landroid/net/Uri;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_30

    .line 32
    .line 33
    const-string v1, "/android_asset/"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_30

    .line 40
    .line 41
    invoke-direct {p0}, Lax/U0/l;->r()Lax/U0/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 46
    .line 47
    goto/16 :goto_9e

    .line 48
    .line 49
    :cond_30
    invoke-direct {p0}, Lax/U0/l;->u()Lax/U0/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 54
    .line 55
    goto :goto_9e

    .line 56
    :cond_37
    const-string v1, "asset"

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_46

    .line 63
    .line 64
    invoke-direct {p0}, Lax/U0/l;->r()Lax/U0/g;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 69
    .line 70
    goto :goto_9e

    .line 71
    :cond_46
    const-string v1, "content"

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_55

    .line 78
    .line 79
    invoke-direct {p0}, Lax/U0/l;->s()Lax/U0/g;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 84
    .line 85
    goto :goto_9e

    .line 86
    :cond_55
    const-string v1, "rtmp"

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_64

    .line 93
    .line 94
    invoke-direct {p0}, Lax/U0/l;->w()Lax/U0/g;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 99
    .line 100
    goto :goto_9e

    .line 101
    :cond_64
    const-string v1, "udp"

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_73

    .line 108
    .line 109
    invoke-direct {p0}, Lax/U0/l;->x()Lax/U0/g;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 114
    .line 115
    goto :goto_9e

    .line 116
    :cond_73
    const-string v1, "data"

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_82

    .line 123
    .line 124
    invoke-direct {p0}, Lax/U0/l;->t()Lax/U0/g;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 129
    .line 130
    goto :goto_9e

    .line 131
    :cond_82
    const-string v1, "rawresource"

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_98

    .line 138
    .line 139
    const-string v1, "android.resource"

    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_93

    .line 146
    .line 147
    goto :goto_98

    .line 148
    :cond_93
    iget-object v0, p0, Lax/U0/l;->c:Lax/U0/g;

    .line 149
    .line 150
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 151
    .line 152
    goto :goto_9e

    .line 153
    :cond_98
    :goto_98
    invoke-direct {p0}, Lax/U0/l;->v()Lax/U0/g;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 158
    .line 159
    :goto_9e
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 160
    .line 161
    invoke-interface {v0, p1}, Lax/U0/g;->f(Lax/U0/k;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    return-wide v0
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public l()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U0/l;->k:Lax/U0/g;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    invoke-interface {v0}, Lax/U0/g;->l()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
