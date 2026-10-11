.class public final Lax/i1/j0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lax/U0/g$a;

.field private b:Lax/m1/m;

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Ljava/lang/String;

.field private f:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Lax/n1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/U0/g$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lax/U0/g$a;

    .line 9
    .line 10
    iput-object p1, p0, Lax/i1/j0$b;->a:Lax/U0/g$a;

    .line 11
    .line 12
    new-instance p1, Lax/m1/k;

    .line 13
    .line 14
    invoke-direct {p1}, Lax/m1/k;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/i1/j0$b;->b:Lax/m1/m;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lax/i1/j0$b;->c:Z

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(Lax/P0/y$k;J)Lax/i1/j0;
    .registers 15

    .line 1
    new-instance v0, Lax/i1/j0;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i1/j0$b;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lax/i1/j0$b;->a:Lax/U0/g$a;

    .line 6
    .line 7
    iget-object v6, p0, Lax/i1/j0$b;->b:Lax/m1/m;

    .line 8
    .line 9
    iget-boolean v7, p0, Lax/i1/j0$b;->c:Z

    .line 10
    .line 11
    iget-object v8, p0, Lax/i1/j0$b;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v9, p0, Lax/i1/j0$b;->f:Lax/q7/u;

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    move-object v2, p1

    .line 17
    move-wide v4, p2

    .line 18
    invoke-direct/range {v0 .. v10}, Lax/i1/j0;-><init>(Ljava/lang/String;Lax/P0/y$k;Lax/U0/g$a;JLax/m1/m;ZLjava/lang/Object;Lax/q7/u;Lax/i1/j0$a;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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

.method public b(Lax/m1/m;)Lax/i1/j0$b;
    .registers 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    goto :goto_8

    .line 4
    :cond_3
    new-instance p1, Lax/m1/k;

    .line 5
    .line 6
    invoke-direct {p1}, Lax/m1/k;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_8
    iput-object p1, p0, Lax/i1/j0$b;->b:Lax/m1/m;

    .line 10
    .line 11
    return-object p0
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
