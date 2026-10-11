.class public interface abstract Lax/Q0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Q0/o$b;,
        Lax/Q0/o$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()Ljava/nio/ByteBuffer;
.end method

.method public abstract c()Z
.end method

.method public abstract d(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract e()Z
.end method

.method public abstract f()V
.end method

.method public abstract flush()V
.end method

.method public abstract g(Lax/Q0/o$a;)Lax/Q0/o$a;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation
.end method
