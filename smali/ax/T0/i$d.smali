.class public final Lax/T0/i$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/T0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(ILjava/nio/ByteBuffer;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/T0/i$d;->a:I

    .line 4
    iput-object p2, p0, Lax/T0/i$d;->b:Ljava/nio/ByteBuffer;

    return-void
.end method

.method synthetic constructor <init>(ILjava/nio/ByteBuffer;Lax/T0/i$a;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lax/T0/i$d;-><init>(ILjava/nio/ByteBuffer;)V

    return-void
.end method
