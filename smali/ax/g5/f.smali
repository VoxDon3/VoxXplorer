.class public Lax/g5/f;
.super Lax/g5/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 5

    .line 1
    sget-object v0, Lax/g5/a$a;->q:Lax/g5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    invoke-direct {p0, v3, v0, v1, v2}, Lax/g5/a;-><init>(ILax/g5/a$a;BB)V

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


# virtual methods
.method public d(Ljava/nio/ByteBuffer;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/g5/a;->d(Ljava/nio/ByteBuffer;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x25

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

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
    .line 22
.end method
