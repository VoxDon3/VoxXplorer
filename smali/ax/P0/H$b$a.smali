.class public final Lax/P0/H$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/H$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final b:[I


# instance fields
.field private final a:Lax/P0/r$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_a

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/P0/H$b$a;->b:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_a
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x21
        0x1a
        0x22
        0x23
        0x1b
        0x1c
        0x1d
        0x1e
        0x20
    .end array-data
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

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/P0/r$b;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/P0/r$b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

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


# virtual methods
.method public a(I)Lax/P0/H$b$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/r$b;->a(I)Lax/P0/r$b;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public b(Lax/P0/H$b;)Lax/P0/H$b$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

    .line 2
    .line 3
    invoke-static {p1}, Lax/P0/H$b;->a(Lax/P0/H$b;)Lax/P0/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lax/P0/r$b;->b(Lax/P0/r;)Lax/P0/r$b;

    .line 8
    .line 9
    .line 10
    return-object p0
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

.method public varargs c([I)Lax/P0/H$b$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/r$b;->c([I)Lax/P0/r$b;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public d(IZ)Lax/P0/H$b$a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/P0/r$b;->d(IZ)Lax/P0/r$b;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public e()Lax/P0/H$b;
    .registers 4

    .line 1
    new-instance v0, Lax/P0/H$b;

    .line 2
    .line 3
    iget-object v1, p0, Lax/P0/H$b$a;->a:Lax/P0/r$b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/P0/r$b;->e()Lax/P0/r;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lax/P0/H$b;-><init>(Lax/P0/r;Lax/P0/H$a;)V

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
.end method
