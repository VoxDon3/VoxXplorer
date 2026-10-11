.class public final Lax/P0/c$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lax/P0/c$e;->a:I

    .line 6
    .line 7
    iput v0, p0, Lax/P0/c$e;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput v1, p0, Lax/P0/c$e;->c:I

    .line 11
    .line 12
    iput v1, p0, Lax/P0/c$e;->d:I

    .line 13
    .line 14
    iput v0, p0, Lax/P0/c$e;->e:I

    .line 15
    .line 16
    iput-boolean v0, p0, Lax/P0/c$e;->f:Z

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Lax/P0/c;
    .registers 9

    .line 1
    new-instance v0, Lax/P0/c;

    .line 2
    .line 3
    iget v1, p0, Lax/P0/c$e;->a:I

    .line 4
    .line 5
    iget v2, p0, Lax/P0/c$e;->b:I

    .line 6
    .line 7
    iget v3, p0, Lax/P0/c$e;->c:I

    .line 8
    .line 9
    iget v4, p0, Lax/P0/c$e;->d:I

    .line 10
    .line 11
    iget v5, p0, Lax/P0/c$e;->e:I

    .line 12
    .line 13
    iget-boolean v6, p0, Lax/P0/c$e;->f:Z

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    invoke-direct/range {v0 .. v7}, Lax/P0/c;-><init>(IIIIIZLax/P0/c$a;)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public b(I)Lax/P0/c$e;
    .registers 2

    .line 1
    iput p1, p0, Lax/P0/c$e;->a:I

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

.method public c(I)Lax/P0/c$e;
    .registers 2

    .line 1
    iput p1, p0, Lax/P0/c$e;->c:I

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
