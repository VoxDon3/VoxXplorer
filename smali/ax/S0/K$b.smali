.class final Lax/S0/K$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/S0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/os/Message;

.field private b:Lax/S0/K;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/S0/K$a;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Lax/S0/K$b;-><init>()V

    return-void
.end method

.method private b()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/S0/K$b;->a:Landroid/os/Message;

    .line 3
    .line 4
    iput-object v0, p0, Lax/S0/K$b;->b:Lax/S0/K;

    .line 5
    .line 6
    invoke-static {p0}, Lax/S0/K;->m(Lax/S0/K$b;)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/S0/K$b;->a:Landroid/os/Message;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Message;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lax/S0/K$b;->b()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c(Landroid/os/Handler;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/S0/K$b;->a:Landroid/os/Message;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Message;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0}, Lax/S0/K$b;->b()V

    .line 14
    .line 15
    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public d(Landroid/os/Message;Lax/S0/K;)Lax/S0/K$b;
    .registers 3

    .line 1
    iput-object p1, p0, Lax/S0/K$b;->a:Landroid/os/Message;

    .line 2
    .line 3
    iput-object p2, p0, Lax/S0/K$b;->b:Lax/S0/K;

    .line 4
    .line 5
    return-object p0
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
