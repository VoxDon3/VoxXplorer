.class final Lax/a5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:[I

.field public final e:[Ljava/lang/String;

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(III[I[Ljava/lang/String;II)V
    .registers 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lax/a5/a$a;->a:I

    .line 3
    iput p2, p0, Lax/a5/a$a;->b:I

    .line 4
    iput p3, p0, Lax/a5/a$a;->c:I

    .line 5
    iput-object p4, p0, Lax/a5/a$a;->d:[I

    .line 6
    iput-object p5, p0, Lax/a5/a$a;->e:[Ljava/lang/String;

    .line 7
    iput p6, p0, Lax/a5/a$a;->f:I

    .line 8
    iput p7, p0, Lax/a5/a$a;->g:I

    return-void
.end method

.method public constructor <init>(Lax/a5/a;)V
    .registers 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget v0, p1, Lax/a5/a;->g:I

    iput v0, p0, Lax/a5/a$a;->a:I

    .line 11
    iget v0, p1, Lax/a5/a;->k:I

    iput v0, p0, Lax/a5/a$a;->b:I

    .line 12
    iget v0, p1, Lax/a5/a;->j:I

    iput v0, p0, Lax/a5/a$a;->c:I

    .line 13
    iget-object v0, p1, Lax/a5/a;->f:[I

    iput-object v0, p0, Lax/a5/a$a;->d:[I

    .line 14
    iget-object v0, p1, Lax/a5/a;->l:[Ljava/lang/String;

    iput-object v0, p0, Lax/a5/a$a;->e:[Ljava/lang/String;

    .line 15
    iget v0, p1, Lax/a5/a;->m:I

    iput v0, p0, Lax/a5/a$a;->f:I

    .line 16
    iget p1, p1, Lax/a5/a;->n:I

    iput p1, p0, Lax/a5/a$a;->g:I

    return-void
.end method

.method public static a(I)Lax/a5/a$a;
    .registers 9

    .line 1
    shl-int/lit8 v7, p0, 0x3

    .line 2
    .line 3
    invoke-static {p0}, Lax/a5/a;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    new-instance v0, Lax/a5/a$a;

    .line 8
    .line 9
    new-array v4, v7, [I

    .line 10
    .line 11
    shl-int/lit8 v1, p0, 0x1

    .line 12
    .line 13
    new-array v5, v1, [Ljava/lang/String;

    .line 14
    .line 15
    sub-int v6, v7, p0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v1, p0

    .line 19
    invoke-direct/range {v0 .. v7}, Lax/a5/a$a;-><init>(III[I[Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
