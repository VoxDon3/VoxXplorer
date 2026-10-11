.class final Landroidx/emoji2/text/e$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field a:Landroidx/emoji2/text/e$e;

.field b:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Landroidx/emoji2/text/e$e;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/emoji2/text/e$f;->a:Landroidx/emoji2/text/e$e;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/emoji2/text/e$f;->b:Ljava/util/concurrent/Executor;

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

.method public static synthetic a(Landroidx/emoji2/text/e$f;Ljava/lang/Throwable;)V
    .registers 2

    .line 1
    iget-object p0, p0, Landroidx/emoji2/text/e$f;->a:Landroidx/emoji2/text/e$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/e$e;->a(Ljava/lang/Throwable;)V

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

.method public static synthetic b(Landroidx/emoji2/text/e$f;)V
    .registers 1

    .line 1
    iget-object p0, p0, Landroidx/emoji2/text/e$f;->a:Landroidx/emoji2/text/e$e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/emoji2/text/e$e;->b()V

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


# virtual methods
.method c(Ljava/lang/Throwable;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e$f;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/emoji2/text/g;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Landroidx/emoji2/text/g;-><init>(Landroidx/emoji2/text/e$f;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method d()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e$f;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/emoji2/text/f;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/emoji2/text/f;-><init>(Landroidx/emoji2/text/e$f;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
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
