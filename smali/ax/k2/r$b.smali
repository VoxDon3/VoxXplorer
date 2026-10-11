.class public final Lax/k2/r$b;
.super Lax/k2/j$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/k2/r;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lax/k2/o;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lax/k2/r;


# direct methods
.method constructor <init>(Lax/k2/r;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/k2/r$b;->e:Lax/k2/r;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/k2/j$a;-><init>()V

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

.method private static final B(Lax/k2/r;[Ljava/lang/String;)V
    .registers 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$tables"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lax/k2/r;->e()Lax/k2/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    array-length v0, p1

    .line 16
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lax/k2/o;->j([Ljava/lang/String;)V

    .line 23
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

.method public static synthetic w(Lax/k2/r;[Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lax/k2/r$b;->B(Lax/k2/r;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b0([Ljava/lang/String;)V
    .registers 5

    .line 1
    const-string v0, "tables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/k2/r$b;->e:Lax/k2/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/r;->d()Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/k2/r$b;->e:Lax/k2/r;

    .line 13
    .line 14
    new-instance v2, Lax/k2/s;

    .line 15
    .line 16
    invoke-direct {v2, v1, p1}, Lax/k2/s;-><init>(Lax/k2/r;[Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
