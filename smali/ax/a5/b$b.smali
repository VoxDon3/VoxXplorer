.class final Lax/a5/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final a:I

.field final b:I

.field final c:[Ljava/lang/String;

.field final d:[Lax/a5/b$a;


# direct methods
.method public constructor <init>(II[Ljava/lang/String;[Lax/a5/b$a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lax/a5/b$b;->a:I

    .line 3
    iput p2, p0, Lax/a5/b$b;->b:I

    .line 4
    iput-object p3, p0, Lax/a5/b$b;->c:[Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lax/a5/b$b;->d:[Lax/a5/b$a;

    return-void
.end method

.method public constructor <init>(Lax/a5/b;)V
    .registers 3

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget v0, p1, Lax/a5/b;->h:I

    iput v0, p0, Lax/a5/b$b;->a:I

    .line 8
    iget v0, p1, Lax/a5/b;->k:I

    iput v0, p0, Lax/a5/b$b;->b:I

    .line 9
    iget-object v0, p1, Lax/a5/b;->f:[Ljava/lang/String;

    iput-object v0, p0, Lax/a5/b$b;->c:[Ljava/lang/String;

    .line 10
    iget-object p1, p1, Lax/a5/b;->g:[Lax/a5/b$a;

    iput-object p1, p0, Lax/a5/b$b;->d:[Lax/a5/b$a;

    return-void
.end method

.method public static a(I)Lax/a5/b$b;
    .registers 4

    .line 1
    new-instance v0, Lax/a5/b$b;

    .line 2
    .line 3
    new-array v1, p0, [Ljava/lang/String;

    .line 4
    .line 5
    shr-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    new-array p0, p0, [Lax/a5/b$a;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v2, v2, v1, p0}, Lax/a5/b$b;-><init>(II[Ljava/lang/String;[Lax/a5/b$a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
