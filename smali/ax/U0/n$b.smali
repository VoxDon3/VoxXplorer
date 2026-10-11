.class public final Lax/U0/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U0/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/U0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lax/U0/v;

.field private b:Lax/U0/z;

.field private c:Lax/q7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/o<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/U0/v;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/U0/v;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/U0/n$b;->a:Lax/U0/v;

    .line 10
    .line 11
    const/16 v0, 0x1f40

    .line 12
    .line 13
    iput v0, p0, Lax/U0/n$b;->e:I

    .line 14
    .line 15
    iput v0, p0, Lax/U0/n$b;->f:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public bridge synthetic a()Lax/U0/g;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/U0/n$b;->b()Lax/U0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public b()Lax/U0/n;
    .registers 11

    .line 1
    new-instance v0, Lax/U0/n;

    .line 2
    .line 3
    iget-object v1, p0, Lax/U0/n$b;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lax/U0/n$b;->e:I

    .line 6
    .line 7
    iget v3, p0, Lax/U0/n$b;->f:I

    .line 8
    .line 9
    iget-boolean v4, p0, Lax/U0/n$b;->g:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lax/U0/n$b;->h:Z

    .line 12
    .line 13
    iget-object v6, p0, Lax/U0/n$b;->a:Lax/U0/v;

    .line 14
    .line 15
    iget-object v7, p0, Lax/U0/n$b;->c:Lax/q7/o;

    .line 16
    .line 17
    iget-boolean v8, p0, Lax/U0/n$b;->i:Z

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-direct/range {v0 .. v9}, Lax/U0/n;-><init>(Ljava/lang/String;IIZZLax/U0/v;Lax/q7/o;ZLax/U0/n$a;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lax/U0/n$b;->b:Lax/U0/z;

    .line 24
    .line 25
    if-eqz v1, :cond_1d

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lax/U0/b;->d(Lax/U0/z;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-object v0
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

.method public c(Ljava/lang/String;)Lax/U0/n$b;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/U0/n$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method
