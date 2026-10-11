.class public final Landroidx/lifecycle/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroidx/lifecycle/d$b;

.field private b:Landroidx/lifecycle/f;


# direct methods
.method public constructor <init>(Lax/G0/g;Landroidx/lifecycle/d$b;)V
    .registers 4

    .line 1
    const-string v0, "initialState"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroidx/lifecycle/h;->f(Ljava/lang/Object;)Landroidx/lifecycle/f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Landroidx/lifecycle/g$b;->b:Landroidx/lifecycle/f;

    .line 17
    .line 18
    iput-object p2, p0, Landroidx/lifecycle/g$b;->a:Landroidx/lifecycle/d$b;

    .line 19
    .line 20
    return-void
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
.method public final a(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/lifecycle/d$a;->j()Landroidx/lifecycle/d$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Landroidx/lifecycle/g;->j:Landroidx/lifecycle/g$a;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/lifecycle/g$b;->a:Landroidx/lifecycle/d$b;

    .line 13
    .line 14
    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/g$a;->a(Landroidx/lifecycle/d$b;Landroidx/lifecycle/d$b;)Landroidx/lifecycle/d$b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Landroidx/lifecycle/g$b;->a:Landroidx/lifecycle/d$b;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/lifecycle/g$b;->b:Landroidx/lifecycle/f;

    .line 21
    .line 22
    invoke-static {p1}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/f;->b(Lax/G0/h;Landroidx/lifecycle/d$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/lifecycle/g$b;->a:Landroidx/lifecycle/d$b;

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
.end method

.method public final b()Landroidx/lifecycle/d$b;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/g$b;->a:Landroidx/lifecycle/d$b;

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
