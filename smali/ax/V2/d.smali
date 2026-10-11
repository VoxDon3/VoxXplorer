.class public Lax/V2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/V2/d$b;
    }
.end annotation


# static fields
.field static h:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/voxdon/xplorer/bookmark/Bookmark;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/bookmark/Bookmark;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/bookmark/Bookmark;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/Q2/f;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/Q2/f;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/Q2/f;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/V2/d$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/V2/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/V2/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/V2/d;->h:Ljava/util/Comparator;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lax/V2/d;->g:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {p0}, Lax/V2/d;->k()V

    .line 40
    .line 41
    .line 42
    return-void
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

.method private d()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/V2/d;->g:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/V2/d;->g:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1b

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lax/V2/d$b;

    .line 21
    .line 22
    invoke-interface {v2}, Lax/V2/d$b;->a()V

    .line 23
    .line 24
    .line 25
    goto :goto_9

    .line 26
    :catchall_19
    move-exception v1

    .line 27
    goto :goto_1d

    .line 28
    :cond_1b
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :goto_1d
    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_19

    .line 31
    throw v1
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
.end method

.method private e(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 5

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/Q2/f;->J()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lax/Q2/f;->G0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v0, v1, :cond_13

    .line 12
    .line 13
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/voxdon/xplorer/file/T;->e(Landroid/content/Context;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_19

    .line 20
    :cond_13
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/voxdon/xplorer/file/T;->c(Landroid/content/Context;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_39

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lax/Z2/s;

    .line 41
    .line 42
    invoke-virtual {v1}, Lax/Z2/s;->e()Lax/c3/K;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Lax/c3/K;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1d

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_39
    const/4 p1, 0x0

    .line 59
    return p1
    .line 60
    .line 61
.end method

.method private f(Lax/Q2/f;I)I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_4
    :try_start_4
    iget-object v2, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_21

    .line 12
    .line 13
    iget-object v2, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->B(Lax/Q2/f;I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1e

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return v1

    .line 29
    :catchall_1c
    move-exception p1

    .line 30
    goto :goto_24

    .line 31
    :cond_1e
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_21
    monitor-exit v0

    .line 35
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :goto_24
    monitor-exit v0
    :try_end_25
    .catchall {:try_start_4 .. :try_end_25} :catchall_1c

    .line 38
    throw p1
    .line 39
    .line 40
    .line 41
.end method

.method private g(Lcom/voxdon/xplorer/bookmark/Bookmark;)I
    .registers 5

    .line 1
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_4
    :try_start_4
    iget-object v2, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_21

    .line 12
    .line 13
    iget-object v2, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->C(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1e

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return v1

    .line 29
    :catchall_1c
    move-exception p1

    .line 30
    goto :goto_24

    .line 31
    :cond_1e
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_21
    monitor-exit v0

    .line 35
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :goto_24
    monitor-exit v0
    :try_end_25
    .catchall {:try_start_4 .. :try_end_25} :catchall_1c

    .line 38
    throw p1
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

.method private static l(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 7

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-lez v4, :cond_1c

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const-wide/32 v4, 0xf731400

    .line 20
    .line 21
    .line 22
    sub-long/2addr v2, v4

    .line 23
    cmp-long p0, v0, v2

    .line 24
    .line 25
    if-gez p0, :cond_1c

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1c
    const/4 p0, 0x0

    .line 30
    return p0
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

.method private static m(Lcom/voxdon/xplorer/bookmark/Bookmark;Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_20

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->x()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_20

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->x()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->x()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_20

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_20
    const/4 p0, 0x0

    .line 34
    return p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private n(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 3

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0}, Lax/Q2/f;->r0(Lax/c3/K;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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

.method private v()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 5
    .line 6
    sget-object v2, Lax/V2/d;->h:Ljava/util/Comparator;

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_c
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    .line 15
    throw v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public declared-synchronized a(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 3
    .line 4
    monitor-enter v0
    :try_end_4
    .catchall {:try_start_1 .. :try_end_4} :catchall_3f

    .line 5
    :try_start_4
    iget-object v1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_a
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_22

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 22
    .line 23
    invoke-static {v2, p1}, Lax/V2/d;->m(Lcom/voxdon/xplorer/bookmark/Bookmark;Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_a

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_a

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_46

    .line 35
    :cond_22
    monitor-exit v0
    :try_end_23
    .catchall {:try_start_4 .. :try_end_23} :catchall_20

    .line 36
    :try_start_23
    iget-object v0, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/16 v0, 0xa

    .line 49
    .line 50
    if-lt p1, v0, :cond_41

    .line 51
    .line 52
    iget-object p1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_41

    .line 64
    :catchall_3f
    move-exception p1

    .line 65
    goto :goto_48

    .line 66
    :cond_41
    :goto_41
    invoke-direct {p0}, Lax/V2/d;->d()V
    :try_end_44
    .catchall {:try_start_23 .. :try_end_44} :catchall_3f

    .line 67
    .line 68
    .line 69
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_46
    :try_start_46
    monitor-exit v0
    :try_end_47
    .catchall {:try_start_46 .. :try_end_47} :catchall_20

    .line 72
    :try_start_47
    throw p1

    .line 73
    :goto_48
    monitor-exit p0
    :try_end_49
    .catchall {:try_start_47 .. :try_end_49} :catchall_3f

    .line 74
    throw p1
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public b(Lax/V2/d$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/V2/d;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
.end method

.method public declared-synchronized c(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 11

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_ae

    .line 3
    .line 4
    :try_start_3
    iget-object v0, p0, Lax/V2/d;->d:Ljava/util/Set;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_11

    .line 15
    .line 16
    goto/16 :goto_ae

    .line 17
    .line 18
    :cond_11
    invoke-direct {p0, p1}, Lax/V2/d;->g(Lcom/voxdon/xplorer/bookmark/Bookmark;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ltz v0, :cond_23

    .line 23
    .line 24
    iget-object v1, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 31
    .line 32
    goto :goto_24

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto/16 :goto_ac

    .line 35
    .line 36
    :cond_23
    const/4 v1, 0x0

    .line 37
    :goto_24
    iget-object v2, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {v2}, Lax/t3/j;->c(Landroid/content/Context;)Lax/t3/k$a;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Lax/t3/k$a;->c0:Lax/t3/k$a;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    if-eq v2, v3, :cond_42

    .line 48
    .line 49
    sget-object v3, Lax/t3/k$a;->q:Lax/t3/k$a;

    .line 50
    .line 51
    if-ne v2, v3, :cond_35

    .line 52
    .line 53
    goto :goto_42

    .line 54
    :cond_35
    iget-object v2, p0, Lax/V2/d;->f:Ljava/util/Set;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4f

    .line 65
    .line 66
    goto :goto_50

    .line 67
    :cond_42
    :goto_42
    iget-object v2, p0, Lax/V2/d;->e:Ljava/util/Set;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4f

    .line 78
    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v4, 0x0

    .line 81
    :goto_50
    const-wide/16 v2, -0x5

    .line 82
    .line 83
    if-eqz v1, :cond_5d

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    cmp-long v8, v6, v2

    .line 90
    .line 91
    if-nez v8, :cond_5d

    .line 92
    .line 93
    goto :goto_5e

    .line 94
    :cond_5d
    move v5, v4

    .line 95
    :goto_5e
    if-eqz v5, :cond_86

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->u()Lax/c3/K;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Lax/c3/K;->e()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-eqz v4, :cond_79

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_79

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lax/V2/d;->r(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    :try_end_77
    .catchall {:try_start_3 .. :try_end_77} :catchall_20

    .line 118
    .line 119
    .line 120
    monitor-exit p0

    .line 121
    return-void

    .line 122
    :cond_79
    if-nez v4, :cond_86

    .line 123
    .line 124
    :try_start_7b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->w()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    if-nez v4, :cond_86

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lax/V2/d;->r(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    :try_end_84
    .catchall {:try_start_7b .. :try_end_84} :catchall_20

    .line 131
    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :cond_86
    :try_start_86
    invoke-static {p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->k(Lcom/voxdon/xplorer/bookmark/Bookmark;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ltz v0, :cond_9f

    .line 140
    .line 141
    if-eqz v1, :cond_99

    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    cmp-long v1, v4, v2

    .line 148
    .line 149
    if-nez v1, :cond_99

    .line 150
    .line 151
    invoke-virtual {p1, v2, v3}, Lcom/voxdon/xplorer/bookmark/Bookmark;->H(J)V

    .line 152
    .line 153
    .line 154
    :cond_99
    iget-object v1, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v1, v0, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_a4

    .line 160
    :cond_9f
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :goto_a4
    invoke-direct {p0}, Lax/V2/d;->v()V

    .line 166
    .line 167
    .line 168
    invoke-direct {p0}, Lax/V2/d;->d()V
    :try_end_aa
    .catchall {:try_start_86 .. :try_end_aa} :catchall_20

    .line 169
    .line 170
    .line 171
    monitor-exit p0

    .line 172
    return-void

    .line 173
    :goto_ac
    :try_start_ac
    monitor-exit p0
    :try_end_ad
    .catchall {:try_start_ac .. :try_end_ad} :catchall_20

    .line 174
    throw p1

    .line 175
    :cond_ae
    :goto_ae
    monitor-exit p0

    .line 176
    return-void
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

.method public h(IIZ)Ljava/util/List;
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/bookmark/Bookmark;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Lax/V2/d;->b:Ljava/util/List;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_c
    iget-object v4, v1, Lax/V2/d;->b:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    :goto_18
    if-ge v6, v4, :cond_38

    .line 26
    .line 27
    iget-object v7, v1, Lax/V2/d;->b:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 34
    .line 35
    invoke-static {v7}, Lax/V2/d;->l(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-nez v8, :cond_35

    .line 40
    .line 41
    invoke-direct {v1, v7}, Lax/V2/d;->n(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_35

    .line 46
    .line 47
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_35

    .line 51
    :catchall_32
    move-exception v0

    .line 52
    goto/16 :goto_d0

    .line 53
    .line 54
    :cond_35
    :goto_35
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_18

    .line 57
    :cond_38
    monitor-exit v3
    :try_end_39
    .catchall {:try_start_c .. :try_end_39} :catchall_32

    .line 58
    iget-object v4, v1, Lax/V2/d;->c:Ljava/util/List;

    .line 59
    .line 60
    monitor-enter v4

    .line 61
    :try_start_3c
    iget-object v3, v1, Lax/V2/d;->c:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v6, 0x0

    .line 72
    :goto_47
    if-ge v6, v3, :cond_b9

    .line 73
    .line 74
    iget-object v7, v1, Lax/V2/d;->c:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 81
    .line 82
    invoke-static {v7}, Lax/V2/d;->l(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-nez v8, :cond_a5

    .line 87
    .line 88
    invoke-direct {v1, v7}, Lax/V2/d;->n(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_a5

    .line 93
    .line 94
    invoke-virtual {v7}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    const/4 v10, 0x0

    .line 103
    :cond_66
    :goto_66
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_af

    .line 108
    .line 109
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    check-cast v11, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 114
    .line 115
    invoke-virtual {v11}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    if-ne v12, v8, :cond_66

    .line 120
    .line 121
    if-eqz p3, :cond_93

    .line 122
    .line 123
    invoke-virtual {v11}, Lcom/voxdon/xplorer/bookmark/Bookmark;->z()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    const/4 v13, 0x4

    .line 128
    if-ne v12, v13, :cond_93

    .line 129
    .line 130
    const-string v12, "/"

    .line 131
    .line 132
    invoke-virtual {v11}, Lcom/voxdon/xplorer/bookmark/Bookmark;->x()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_93

    .line 141
    .line 142
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 143
    .line 144
    .line 145
    goto :goto_66

    .line 146
    :catchall_91
    move-exception v0

    .line 147
    goto :goto_ce

    .line 148
    :cond_93
    invoke-static {v11, v7}, Lax/V2/d;->m(Lcom/voxdon/xplorer/bookmark/Bookmark;Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eqz v12, :cond_ac

    .line 153
    .line 154
    invoke-virtual {v11}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 155
    .line 156
    .line 157
    move-result-wide v11

    .line 158
    invoke-virtual {v7}, Lcom/voxdon/xplorer/bookmark/Bookmark;->y()J

    .line 159
    .line 160
    .line 161
    move-result-wide v13

    .line 162
    cmp-long v15, v11, v13

    .line 163
    .line 164
    if-lez v15, :cond_a8

    .line 165
    .line 166
    :cond_a5
    move/from16 v8, p2

    .line 167
    .line 168
    goto :goto_b6

    .line 169
    :cond_a8
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 170
    .line 171
    .line 172
    goto :goto_66

    .line 173
    :cond_ac
    add-int/lit8 v10, v10, 0x1

    .line 174
    .line 175
    goto :goto_66

    .line 176
    :cond_af
    move/from16 v8, p2

    .line 177
    .line 178
    if-ge v10, v8, :cond_b6

    .line 179
    .line 180
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_b6
    :goto_b6
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_47

    .line 186
    :cond_b9
    monitor-exit v4
    :try_end_ba
    .catchall {:try_start_3c .. :try_end_ba} :catchall_91

    .line 187
    sget-object v3, Lax/V2/d;->h:Ljava/util/Comparator;

    .line 188
    .line 189
    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 190
    .line 191
    .line 192
    :goto_bf
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-le v3, v0, :cond_cd

    .line 197
    .line 198
    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_bf

    .line 206
    :cond_cd
    return-object v2

    .line 207
    :goto_ce
    :try_start_ce
    monitor-exit v4
    :try_end_cf
    .catchall {:try_start_ce .. :try_end_cf} :catchall_91

    .line 208
    throw v0

    .line 209
    :goto_d0
    :try_start_d0
    monitor-exit v3
    :try_end_d1
    .catchall {:try_start_d0 .. :try_end_d1} :catchall_32

    .line 210
    throw v0
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public i()I
    .registers 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v0, v1}, Lax/V2/d;->h(IIZ)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public j()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/bookmark/Bookmark;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method k()V
    .registers 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {}, Lax/Q2/f;->C()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/V2/d;->d:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/V2/d;->e:Ljava/util/Set;

    .line 18
    .line 19
    sget-object v1, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lax/V2/d;->e:Ljava/util/Set;

    .line 25
    .line 26
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/V2/d;->e:Ljava/util/Set;

    .line 32
    .line 33
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/V2/d;->f:Ljava/util/Set;

    .line 44
    .line 45
    return-void
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
.end method

.method public declared-synchronized o()V
    .registers 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 3
    .line 4
    const-string v1, "last_visited"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v0, "INITIALIZED"

    .line 12
    .line 13
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_28

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_a8

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    :try_start_14
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Lcom/voxdon/xplorer/bookmark/BookmarkProvider;->b:Landroid/net/Uri;

    .line 28
    .line 29
    sget-object v6, Lcom/voxdon/xplorer/bookmark/BookmarkProvider;->c:[Ljava/lang/String;

    .line 30
    .line 31
    const-string v7, "type = 4"

    .line 32
    .line 33
    const-string v9, "_id"

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_27
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_27} :catch_2d
    .catch Ljava/lang/SecurityException; {:try_start_14 .. :try_end_27} :catch_2b
    .catchall {:try_start_14 .. :try_end_27} :catchall_28

    .line 40
    goto :goto_7b

    .line 41
    :catchall_28
    move-exception v0

    .line 42
    goto/16 :goto_11b

    .line 43
    .line 44
    :catch_2b
    move-exception v0

    .line 45
    goto :goto_2f

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    goto :goto_49

    .line 48
    :goto_2f
    :try_start_2f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v5, "LastVisited Load Security Error"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v4, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 71
    .line 72
    .line 73
    goto :goto_7a

    .line 74
    :goto_49
    instance-of v4, v0, Landroid/database/sqlite/SQLiteFullException;

    .line 75
    .line 76
    if-nez v4, :cond_55

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    instance-of v4, v4, Landroid/database/sqlite/SQLiteFullException;

    .line 83
    .line 84
    if-eqz v4, :cond_61

    .line 85
    .line 86
    :cond_55
    iget-object v4, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 87
    .line 88
    const v5, 0x7f13034c

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v5, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 96
    .line 97
    .line 98
    :cond_61
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v5, "LastVisited Load Error"

    .line 107
    .line 108
    invoke-virtual {v4, v5}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v4, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 121
    .line 122
    .line 123
    :goto_7a
    move-object v0, v2

    .line 124
    :goto_7b
    if-eqz v0, :cond_99

    .line 125
    .line 126
    new-instance v4, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    :goto_82
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_90

    .line 136
    .line 137
    invoke-static {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->e(Landroid/database/Cursor;)Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_82

    .line 145
    :cond_90
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 149
    .line 150
    invoke-static {v0}, Lax/V2/b;->e(Landroid/content/Context;)I

    .line 151
    .line 152
    .line 153
    goto :goto_9a

    .line 154
    :cond_99
    move-object v4, v2

    .line 155
    :goto_9a
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v5, "INITIALIZED"

    .line 160
    .line 161
    invoke-interface {v0, v5, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 166
    .line 167
    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    move-object v4, v2

    .line 170
    :goto_a9
    if-nez v4, :cond_bd

    .line 171
    .line 172
    const-string v0, "LAST_VISITED_BOOKMARKS"

    .line 173
    .line 174
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0
    :try_end_b1
    .catchall {:try_start_2f .. :try_end_b1} :catchall_28

    .line 178
    if-nez v0, :cond_b5

    .line 179
    .line 180
    monitor-exit p0

    .line 181
    return-void

    .line 182
    :cond_b5
    :try_start_b5
    invoke-static {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->p(Ljava/lang/String;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v4
    :try_end_b9
    .catchall {:try_start_b5 .. :try_end_b9} :catchall_28

    .line 186
    if-nez v4, :cond_bd

    .line 187
    .line 188
    monitor-exit p0

    .line 189
    return-void

    .line 190
    :cond_bd
    :try_start_bd
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_c6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_f7

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 210
    .line 211
    invoke-direct {p0, v3}, Lax/V2/d;->n(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_d9

    .line 216
    .line 217
    goto :goto_c6

    .line 218
    :cond_d9
    invoke-static {v3}, Lax/V2/d;->l(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_e0

    .line 223
    .line 224
    goto :goto_c6

    .line 225
    :cond_e0
    invoke-virtual {v3}, Lcom/voxdon/xplorer/bookmark/Bookmark;->s()Lax/Q2/f;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v4}, Lax/Q2/f;->n0(Lax/Q2/f;)Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-eqz v4, :cond_f1

    .line 234
    .line 235
    invoke-direct {p0, v3}, Lax/V2/d;->e(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-nez v4, :cond_f1

    .line 240
    .line 241
    goto :goto_c6

    .line 242
    :cond_f1
    iget-object v4, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_c6

    .line 248
    :cond_f7
    iget-object v0, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-nez v0, :cond_116

    .line 255
    .line 256
    const-string v0, "ACTION_HISTORY_BOOKMARKS"

    .line 257
    .line 258
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0
    :try_end_105
    .catchall {:try_start_bd .. :try_end_105} :catchall_28

    .line 262
    if-nez v0, :cond_109

    .line 263
    .line 264
    monitor-exit p0

    .line 265
    return-void

    .line 266
    :cond_109
    :try_start_109
    invoke-static {v0}, Lcom/voxdon/xplorer/bookmark/Bookmark;->p(Ljava/lang/String;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v0
    :try_end_10d
    .catchall {:try_start_109 .. :try_end_10d} :catchall_28

    .line 270
    if-nez v0, :cond_111

    .line 271
    .line 272
    monitor-exit p0

    .line 273
    return-void

    .line 274
    :cond_111
    :try_start_111
    iget-object v1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 277
    .line 278
    .line 279
    :cond_116
    invoke-direct {p0}, Lax/V2/d;->d()V
    :try_end_119
    .catchall {:try_start_111 .. :try_end_119} :catchall_28

    .line 280
    .line 281
    .line 282
    monitor-exit p0

    .line 283
    return-void

    .line 284
    :goto_11b
    :try_start_11b
    monitor-exit p0
    :try_end_11c
    .catchall {:try_start_11b .. :try_end_11c} :catchall_28

    .line 285
    throw v0
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public p(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/V2/d;->r(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lax/V2/d;->q(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 5
    .line 6
    .line 7
    return-void
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

.method public q(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 6

    .line 1
    iget-object v0, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :cond_a
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_25

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 22
    .line 23
    if-eqz v3, :cond_a

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Lcom/voxdon/xplorer/bookmark/Bookmark;->D(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    goto :goto_a

    .line 36
    :catchall_23
    move-exception p1

    .line 37
    goto :goto_2c

    .line 38
    :cond_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_3 .. :try_end_26} :catchall_23

    .line 39
    if-eqz v2, :cond_2b

    .line 40
    .line 41
    invoke-direct {p0}, Lax/V2/d;->d()V

    .line 42
    .line 43
    .line 44
    :cond_2b
    return v2

    .line 45
    :goto_2c
    :try_start_2c
    monitor-exit v0
    :try_end_2d
    .catchall {:try_start_2c .. :try_end_2d} :catchall_23

    .line 46
    throw p1
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

.method public r(Lcom/voxdon/xplorer/bookmark/Bookmark;)Z
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/V2/d;->g(Lcom/voxdon/xplorer/bookmark/Bookmark;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_10

    .line 6
    .line 7
    iget-object v0, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/V2/d;->d()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public s(Lax/Q2/f;I)Z
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/V2/d;->f(Lax/Q2/f;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_10

    .line 6
    .line 7
    iget-object p2, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/V2/d;->d()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return p1
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

.method public t(Lax/V2/d$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/V2/d;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

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
.end method

.method public u()V
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/V2/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "last_visited"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lax/V2/d;->b:Ljava/util/List;

    .line 15
    .line 16
    monitor-enter v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_10} :catch_31

    .line 17
    :try_start_10
    invoke-virtual {p0}, Lax/V2/d;->j()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->J(Ljava/util/List;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    monitor-exit v1
    :try_end_19
    .catchall {:try_start_10 .. :try_end_19} :catchall_36

    .line 26
    :try_start_19
    const-string v1, "LAST_VISITED_BOOKMARKS"

    .line 27
    .line 28
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 32
    .line 33
    monitor-enter v1
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_21} :catch_31

    .line 34
    :try_start_21
    iget-object v2, p0, Lax/V2/d;->c:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v2}, Lcom/voxdon/xplorer/bookmark/Bookmark;->J(Ljava/util/List;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    monitor-exit v1
    :try_end_28
    .catchall {:try_start_21 .. :try_end_28} :catchall_33

    .line 41
    :try_start_28
    const-string v1, "ACTION_HISTORY_BOOKMARKS"

    .line 42
    .line 43
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_30} :catch_31

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_31
    move-exception v0

    .line 51
    goto :goto_39

    .line 52
    :catchall_33
    move-exception v0

    .line 53
    :try_start_34
    monitor-exit v1
    :try_end_35
    .catchall {:try_start_34 .. :try_end_35} :catchall_33

    .line 54
    :try_start_35
    throw v0
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_36} :catch_31

    .line 55
    :catchall_36
    move-exception v0

    .line 56
    :try_start_37
    monitor-exit v1
    :try_end_38
    .catchall {:try_start_37 .. :try_end_38} :catchall_36

    .line 57
    :try_start_38
    throw v0
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_39} :catch_31

    .line 58
    :goto_39
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "Bookmark gson error"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
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
.end method
