.class final Lax/o1/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o1/E$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:Lax/P0/v;

.field final synthetic b:Lax/o1/e;


# direct methods
.method private constructor <init>(Lax/o1/e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o1/e$b;->b:Lax/o1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/o1/e;Lax/o1/e$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/o1/e$b;-><init>(Lax/o1/e;)V

    return-void
.end method

.method public static synthetic d(Lax/o1/e$b;)V
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 2
    .line 3
    invoke-static {p0}, Lax/o1/e;->F(Lax/o1/e;)Lax/o1/S$a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lax/o1/S$a;->e()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public static synthetic e(Lax/o1/e$b;)V
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 2
    .line 3
    invoke-static {p0}, Lax/o1/e;->F(Lax/o1/e;)Lax/o1/S$a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lax/o1/S$a;->f()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public static synthetic f(Lax/o1/e$b;Lax/P0/a0;)V
    .registers 2

    .line 1
    iget-object p0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 2
    .line 3
    invoke-static {p0}, Lax/o1/e;->F(Lax/o1/e;)Lax/o1/S$a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1}, Lax/o1/S$a;->a(Lax/P0/a0;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public a(Lax/P0/a0;)V
    .registers 4

    .line 1
    new-instance v0, Lax/P0/v$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/v$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Lax/P0/a0;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/P0/v$b;->F0(I)Lax/P0/v$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p1, Lax/P0/a0;->b:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/P0/v$b;->h0(I)Lax/P0/v$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "video/raw"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lax/o1/e$b;->a:Lax/P0/v;

    .line 29
    .line 30
    iget-object v0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 31
    .line 32
    invoke-static {v0}, Lax/o1/e;->B(Lax/o1/e;)Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lax/o1/h;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1}, Lax/o1/h;-><init>(Lax/o1/e$b;Lax/P0/a0;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public b()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 2
    .line 3
    invoke-static {v0}, Lax/o1/e;->B(Lax/o1/e;)Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lax/o1/g;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lax/o1/g;-><init>(Lax/o1/e$b;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 16
    .line 17
    invoke-static {v0}, Lax/o1/e;->E(Lax/o1/e;)Ljava/util/Queue;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lax/o1/S$b;

    .line 26
    .line 27
    invoke-interface {v0}, Lax/o1/S$b;->b()V

    .line 28
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

.method public c(JJZ)V
    .registers 13

    .line 1
    if-eqz p5, :cond_18

    .line 2
    .line 3
    iget-object p5, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 4
    .line 5
    invoke-static {p5}, Lax/o1/e;->C(Lax/o1/e;)Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p5

    .line 9
    if-eqz p5, :cond_18

    .line 10
    .line 11
    iget-object p5, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 12
    .line 13
    invoke-static {p5}, Lax/o1/e;->B(Lax/o1/e;)Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    new-instance v0, Lax/o1/f;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lax/o1/f;-><init>(Lax/o1/e$b;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p5, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p5, p0, Lax/o1/e$b;->a:Lax/P0/v;

    .line 26
    .line 27
    if-nez p5, :cond_25

    .line 28
    .line 29
    new-instance p5, Lax/P0/v$b;

    .line 30
    .line 31
    invoke-direct {p5}, Lax/P0/v$b;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p5}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 35
    .line 36
    .line 37
    move-result-object p5

    .line 38
    :cond_25
    move-object v5, p5

    .line 39
    iget-object p5, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 40
    .line 41
    invoke-static {p5}, Lax/o1/e;->D(Lax/o1/e;)Lax/o1/z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v6, 0x0

    .line 46
    move-wide v3, p1

    .line 47
    move-wide v1, p3

    .line 48
    invoke-interface/range {v0 .. v6}, Lax/o1/z;->g(JJLax/P0/v;Landroid/media/MediaFormat;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lax/o1/e$b;->b:Lax/o1/e;

    .line 52
    .line 53
    invoke-static {p1}, Lax/o1/e;->E(Lax/o1/e;)Ljava/util/Queue;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lax/o1/S$b;

    .line 62
    .line 63
    invoke-interface {p1, v3, v4}, Lax/o1/S$b;->a(J)V

    .line 64
    .line 65
    .line 66
    return-void
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
