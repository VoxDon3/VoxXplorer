.class public Lax/s/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/c0/n0;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private c:Landroid/view/animation/Interpolator;

.field d:Lax/c0/o0;

.field private e:Z

.field private final f:Lax/c0/p0;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lax/s/e;->b:J

    .line 7
    .line 8
    new-instance v0, Lax/s/e$a;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lax/s/e$a;-><init>(Lax/s/e;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lax/s/e;->f:Lax/c0/p0;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
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
.end method


# virtual methods
.method public a()V
    .registers 6

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_d
    if-ge v3, v1, :cond_1b

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    check-cast v4, Lax/c0/n0;

    .line 23
    .line 24
    invoke-virtual {v4}, Lax/c0/n0;->c()V

    .line 25
    .line 26
    .line 27
    goto :goto_d

    .line 28
    :cond_1b
    iput-boolean v2, p0, Lax/s/e;->e:Z

    .line 29
    .line 30
    return-void
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
.end method

.method b()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/s/e;->e:Z

    .line 3
    .line 4
    return-void
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

.method public c(Lax/c0/n0;)Lax/s/e;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_9
    return-object p0
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

.method public d(Lax/c0/n0;Lax/c0/n0;)Lax/s/e;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/c0/n0;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p2, v0, v1}, Lax/c0/n0;->i(J)Lax/c0/n0;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
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

.method public e(J)Lax/s/e;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iput-wide p1, p0, Lax/s/e;->b:J

    .line 6
    .line 7
    :cond_6
    return-object p0
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

.method public f(Landroid/view/animation/Interpolator;)Lax/s/e;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iput-object p1, p0, Lax/s/e;->c:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    :cond_6
    return-object p0
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

.method public g(Lax/c0/o0;)Lax/s/e;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iput-object p1, p0, Lax/s/e;->d:Lax/c0/o0;

    .line 6
    .line 7
    :cond_6
    return-object p0
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

.method public h()V
    .registers 10

    .line 1
    iget-boolean v0, p0, Lax/s/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Lax/s/e;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_c
    if-ge v2, v1, :cond_35

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    check-cast v3, Lax/c0/n0;

    .line 22
    .line 23
    iget-wide v4, p0, Lax/s/e;->b:J

    .line 24
    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    cmp-long v8, v4, v6

    .line 28
    .line 29
    if-ltz v8, :cond_21

    .line 30
    .line 31
    invoke-virtual {v3, v4, v5}, Lax/c0/n0;->e(J)Lax/c0/n0;

    .line 32
    .line 33
    .line 34
    :cond_21
    iget-object v4, p0, Lax/s/e;->c:Landroid/view/animation/Interpolator;

    .line 35
    .line 36
    if-eqz v4, :cond_28

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Lax/c0/n0;->f(Landroid/view/animation/Interpolator;)Lax/c0/n0;

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object v4, p0, Lax/s/e;->d:Lax/c0/o0;

    .line 42
    .line 43
    if-eqz v4, :cond_31

    .line 44
    .line 45
    iget-object v4, p0, Lax/s/e;->f:Lax/c0/p0;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Lax/c0/n0;->g(Lax/c0/o0;)Lax/c0/n0;

    .line 48
    .line 49
    .line 50
    :cond_31
    invoke-virtual {v3}, Lax/c0/n0;->k()V

    .line 51
    .line 52
    .line 53
    goto :goto_c

    .line 54
    :cond_35
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lax/s/e;->e:Z

    .line 56
    .line 57
    return-void
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
